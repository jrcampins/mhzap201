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
                    focus="#{LogProPreProPag6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogProPreProPag6.gestor.preserveFocus}"
                    preserveScroll="#{LogProPreProPag6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogProPreProPag6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdLogProPreProPag1 campoIdPersona1 campoCodigoPersona1 campoNombrePersona1 campoIdDepartamento1 campoIdDistrito1 campoIdBarrio1 listaNumeroCondicionPension1 campoFechaSolicitudPension1 listaNumeroCondicionDenuPen1 listaNumeroCondicionRecoPen1 listaEsProcesado1 campoObservacion1 campoFechaHoraTransaccion1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogProPreProPag6.breadcrumbs1}" 
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
                                                    rendered="#{LogProPreProPag6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogProPreProPag6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogProPreProPag6.gestor.mensajeDisponible}"
                                                    text="#{LogProPreProPag6.gestor.mensaje}"
                                                    url="#{LogProPreProPag6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{LogProPreProPag6.gestor.filaDisponible}"
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
                                                        actionExpression="#{LogProPreProPag6.botonIrAlPrimero1_action}"
                                                        binding="#{LogProPreProPag6.botonIrAlPrimero1}"
                                                        disabled="#{LogProPreProPag6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{LogProPreProPag6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogProPreProPag6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogProPreProPag6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProPreProPag6.botonIrAlAnterior1_action}"
                                                        binding="#{LogProPreProPag6.botonIrAlAnterior1}"
                                                        disabled="#{LogProPreProPag6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{LogProPreProPag6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogProPreProPag6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogProPreProPag6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProPreProPag6.botonIrAlSiguiente1_action}"
                                                        binding="#{LogProPreProPag6.botonIrAlSiguiente1}"
                                                        disabled="#{LogProPreProPag6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{LogProPreProPag6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogProPreProPag6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogProPreProPag6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProPreProPag6.botonIrAlUltimo1_action}"
                                                        binding="#{LogProPreProPag6.botonIrAlUltimo1}"
                                                        disabled="#{LogProPreProPag6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{LogProPreProPag6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogProPreProPag6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogProPreProPag6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProPreProPag6.botonProcesarFila1_action}"
                                                        binding="#{LogProPreProPag6.botonProcesarFila1}"
                                                        disabled="#{LogProPreProPag6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogProPreProPag6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogProPreProPag6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogProPreProPag6.asistente.comandoDisponible}"
                                                        text="#{LogProPreProPag6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogProPreProPag6.gestor.tituloConsulta}"/>
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
                                                    binding="#{LogProPreProPag6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{LogProPreProPag6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogProPreProPag6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{LogProPreProPag6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{LogProPreProPag6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{LogProPreProPag6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{LogProPreProPag6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{LogProPreProPag6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{LogProPreProPag6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{LogProPreProPag6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdLogProPreProPag1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelIdLogProPreProPag1}"
                                                    id="labelIdLogProPreProPag1"
                                                    for="campoIdLogProPreProPag1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdLogProPreProPag2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdLogProPreProPag1"
                                                    binding="#{LogProPreProPag6.campoIdLogProPreProPag1}"
                                                    converter="#{LogProPreProPag6.converterIdLogProPreProPag1}"
                                                    readOnly="true"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['id_log_pro_pre_pro_pag']}"
                                                    toolTip="BundleParametros.id_log_pro_pre_pro_pag.log_pro_pre_pro_pag"
                                                    validatorExpression="#{LogProPreProPag6.validatorIdLogProPreProPag1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogProPreProPag1Texto1"
                                                    binding="#{LogProPreProPag6.campoIdLogProPreProPag1Texto1}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['id_log_pro_pre_pro_pag']}"/>
                                                <webuijsf:message id="messageIdLogProPreProPag1"
                                                    for="campoIdLogProPreProPag1"/>
                                                <webuijsf:helpInline id="helpInlineIdLogProPreProPag1"
                                                    binding="#{LogProPreProPag6.helpInlineIdLogProPreProPag1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_log_pro_pre_pro_pag.log_pro_pre_pro_pag"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"
                                                    text="persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{LogProPreProPag6.campoIdPersona1}"
                                                    readOnly="#{LogProPreProPag6.gestor.filaNoProcesada}"
                                                    text="#{LogProPreProPag6.asistente.textoCampoIdPersona1}"
                                                    toolTip="#{LogProPreProPag6.asistente.toolTipCampoIdPersona1}"
                                                    validatorExpression="#{LogProPreProPag6.campoIdPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{LogProPreProPag6.campoIdPersona1Texto1}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['codigo_persona_1x1y3']}"/>
                                                <webuijsf:button id="campoIdPersona1Boton1"
                                                    binding="#{LogProPreProPag6.campoIdPersona1Boton1}"
                                                    onClick="#{LogProPreProPag6.asistente.scriptCampoIdPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdPersona1Boton3"
                                                    binding="#{LogProPreProPag6.campoIdPersona1Boton3}"
                                                    onClick="#{LogProPreProPag6.asistente.scriptCampoIdPersona1Boton2}"
                                                    rendered="#{LogProPreProPag6.asistente.campoIdPersona1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdPersona1"
                                                    binding="#{LogProPreProPag6.helpInlineIdPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_persona.log_pro_pre_pro_pag"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona3"
                                                rendered="#{LogProPreProPag6.asistente.campoIdPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelIdPersona2}"
                                                    id="labelIdPersona2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona4"
                                                rendered="#{LogProPreProPag6.asistente.campoIdPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProPreProPag6.campoIdPersona1Texto2}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['nombre_persona_1x1y4']}"
                                                    id="campoIdPersona1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProPreProPag6.campoIdPersona1Boton2}"
                                                    id="campoIdPersona1Boton2"
                                                    onClick="#{LogProPreProPag6.asistente.scriptCampoIdPersona1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelCodigoPersona1}"
                                                    id="labelCodigoPersona1"
                                                    for="campoCodigoPersona1"
                                                    text="c&#243;digo persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoPersona1"
                                                    binding="#{LogProPreProPag6.campoCodigoPersona1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{LogProPreProPag6.gestor.filaNoProcesada}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['codigo_persona']}"
                                                    toolTip="BundleParametros.codigo_persona.log_pro_pre_pro_pag"
                                                    validatorExpression="#{LogProPreProPag6.validatorCodigoPersona1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPersona1Texto1"
                                                    binding="#{LogProPreProPag6.campoCodigoPersona1Texto1}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['codigo_persona']}"/>
                                                <webuijsf:message id="messageCodigoPersona1"
                                                    for="campoCodigoPersona1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoPersona1"
                                                    binding="#{LogProPreProPag6.helpInlineCodigoPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_persona.log_pro_pre_pro_pag"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombrePersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelNombrePersona1}"
                                                    id="labelNombrePersona1"
                                                    for="campoNombrePersona1"
                                                    text="nombre persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombrePersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombrePersona1"
                                                    binding="#{LogProPreProPag6.campoNombrePersona1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{LogProPreProPag6.gestor.filaNoProcesada}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['nombre_persona']}"
                                                    toolTip="BundleParametros.nombre_persona.log_pro_pre_pro_pag"
                                                    validatorExpression="#{LogProPreProPag6.validatorNombrePersona1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePersona1Texto1"
                                                    binding="#{LogProPreProPag6.campoNombrePersona1Texto1}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['nombre_persona']}"/>
                                                <webuijsf:message id="messageNombrePersona1"
                                                    for="campoNombrePersona1"/>
                                                <webuijsf:helpInline id="helpInlineNombrePersona1"
                                                    binding="#{LogProPreProPag6.helpInlineNombrePersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_persona.log_pro_pre_pro_pag"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelIdDepartamento1}"
                                                    id="labelIdDepartamento1"
                                                    for="campoIdDepartamento1"
                                                    text="departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDepartamento1"
                                                    binding="#{LogProPreProPag6.campoIdDepartamento1}"
                                                    readOnly="#{LogProPreProPag6.gestor.filaNoProcesada}"
                                                    text="#{LogProPreProPag6.asistente.textoCampoIdDepartamento1}"
                                                    toolTip="#{LogProPreProPag6.asistente.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{LogProPreProPag6.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1Texto1"
                                                    binding="#{LogProPreProPag6.campoIdDepartamento1Texto1}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['codigo_ubicacion_1x2y3']}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton1"
                                                    binding="#{LogProPreProPag6.campoIdDepartamento1Boton1}"
                                                    onClick="#{LogProPreProPag6.asistente.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton3"
                                                    binding="#{LogProPreProPag6.campoIdDepartamento1Boton3}"
                                                    onClick="#{LogProPreProPag6.asistente.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{LogProPreProPag6.asistente.campoIdDepartamento1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                <webuijsf:helpInline id="helpInlineIdDepartamento1"
                                                    binding="#{LogProPreProPag6.helpInlineIdDepartamento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_departamento.log_pro_pre_pro_pag"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento3"
                                                rendered="#{LogProPreProPag6.asistente.campoIdDepartamento1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelIdDepartamento2}"
                                                    id="labelIdDepartamento2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento4"
                                                rendered="#{LogProPreProPag6.asistente.campoIdDepartamento1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProPreProPag6.campoIdDepartamento1Texto2}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['nombre_ubicacion_1x2y4']}"
                                                    id="campoIdDepartamento1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProPreProPag6.campoIdDepartamento1Boton2}"
                                                    id="campoIdDepartamento1Boton2"
                                                    onClick="#{LogProPreProPag6.asistente.scriptCampoIdDepartamento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelIdDistrito1}"
                                                    id="labelIdDistrito1"
                                                    for="campoIdDistrito1"
                                                    text="distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDistrito1"
                                                    binding="#{LogProPreProPag6.campoIdDistrito1}"
                                                    readOnly="#{LogProPreProPag6.gestor.filaNoProcesada}"
                                                    text="#{LogProPreProPag6.asistente.textoCampoIdDistrito1}"
                                                    toolTip="#{LogProPreProPag6.asistente.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{LogProPreProPag6.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1Texto1"
                                                    binding="#{LogProPreProPag6.campoIdDistrito1Texto1}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['codigo_ubicacion_1x3y3']}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton1"
                                                    binding="#{LogProPreProPag6.campoIdDistrito1Boton1}"
                                                    onClick="#{LogProPreProPag6.asistente.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton3"
                                                    binding="#{LogProPreProPag6.campoIdDistrito1Boton3}"
                                                    onClick="#{LogProPreProPag6.asistente.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{LogProPreProPag6.asistente.campoIdDistrito1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                <webuijsf:helpInline id="helpInlineIdDistrito1"
                                                    binding="#{LogProPreProPag6.helpInlineIdDistrito1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_distrito.log_pro_pre_pro_pag"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito3"
                                                rendered="#{LogProPreProPag6.asistente.campoIdDistrito1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelIdDistrito2}"
                                                    id="labelIdDistrito2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito4"
                                                rendered="#{LogProPreProPag6.asistente.campoIdDistrito1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProPreProPag6.campoIdDistrito1Texto2}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['nombre_ubicacion_1x3y4']}"
                                                    id="campoIdDistrito1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProPreProPag6.campoIdDistrito1Boton2}"
                                                    id="campoIdDistrito1Boton2"
                                                    onClick="#{LogProPreProPag6.asistente.scriptCampoIdDistrito1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelIdBarrio1}"
                                                    id="labelIdBarrio1"
                                                    for="campoIdBarrio1"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdBarrio1"
                                                    binding="#{LogProPreProPag6.campoIdBarrio1}"
                                                    readOnly="#{LogProPreProPag6.gestor.filaNoProcesada}"
                                                    text="#{LogProPreProPag6.asistente.textoCampoIdBarrio1}"
                                                    toolTip="#{LogProPreProPag6.asistente.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{LogProPreProPag6.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1Texto1"
                                                    binding="#{LogProPreProPag6.campoIdBarrio1Texto1}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['codigo_ubicacion_1x4y3']}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton1"
                                                    binding="#{LogProPreProPag6.campoIdBarrio1Boton1}"
                                                    onClick="#{LogProPreProPag6.asistente.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton3"
                                                    binding="#{LogProPreProPag6.campoIdBarrio1Boton3}"
                                                    onClick="#{LogProPreProPag6.asistente.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{LogProPreProPag6.asistente.campoIdBarrio1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                <webuijsf:helpInline id="helpInlineIdBarrio1"
                                                    binding="#{LogProPreProPag6.helpInlineIdBarrio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_barrio.log_pro_pre_pro_pag"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio3"
                                                rendered="#{LogProPreProPag6.asistente.campoIdBarrio1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelIdBarrio2}"
                                                    id="labelIdBarrio2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio4"
                                                rendered="#{LogProPreProPag6.asistente.campoIdBarrio1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProPreProPag6.campoIdBarrio1Texto2}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['nombre_ubicacion_1x4y4']}"
                                                    id="campoIdBarrio1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProPreProPag6.campoIdBarrio1Boton2}"
                                                    id="campoIdBarrio1Boton2"
                                                    onClick="#{LogProPreProPag6.asistente.scriptCampoIdBarrio1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCondicionPension1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelNumeroCondicionPension1}"
                                                    id="labelNumeroCondicionPension1"
                                                    for="listaNumeroCondicionPension1"
                                                    text="condici&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCondicionPension2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCondicionPension1"
                                                    binding="#{LogProPreProPag6.listaNumeroCondicionPension1}"
                                                    converter="#{LogProPreProPag6.converterNumeroCondicionPension1}"
                                                    disabled="#{LogProPreProPag6.gestor.filaNoProcesada}"
                                                    items="#{LogProPreProPag6.asistente.opcionesListaNumeroCondicionPension1}"
                                                    selected="#{LogProPreProPag6.logProPreProPagDataProvider.value['numero_condicion_pension']}"
                                                    toolTip="BundleParametros.numero_condicion_pension.log_pro_pre_pro_pag"/>
                                                <webuijsf:staticText id="listaNumeroCondicionPension1Texto1"
                                                    binding="#{LogProPreProPag6.listaNumeroCondicionPension1Texto1}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['codigo_condicion_pension_1x5y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionPension1"
                                                    for="listaNumeroCondicionPension1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCondicionPension1"
                                                    binding="#{LogProPreProPag6.helpInlineNumeroCondicionPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_condicion_pension.log_pro_pre_pro_pag"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaSolicitudPension1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelFechaSolicitudPension1}"
                                                    id="labelFechaSolicitudPension1"
                                                    for="campoFechaSolicitudPension1"
                                                    text="fecha solicitud pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaSolicitudPension2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaSolicitudPension1"
                                                    binding="#{LogProPreProPag6.campoFechaSolicitudPension1}"
                                                    maxDate="#{LogProPreProPag6.gestor.defaultMaxDate}"
                                                    minDate="#{LogProPreProPag6.gestor.defaultMinDate}"
                                                    readOnly="#{LogProPreProPag6.gestor.filaNoProcesada}"
                                                    selectedDate="#{LogProPreProPag6.logProPreProPagDataProvider.value['fecha_solicitud_pension']}"
                                                    toolTip="BundleParametros.fecha_solicitud_pension.log_pro_pre_pro_pag"/>
                                                <webuijsf:staticText id="campoFechaSolicitudPension1Texto1"
                                                    binding="#{LogProPreProPag6.campoFechaSolicitudPension1Texto1}"
                                                    converter="#{LogProPreProPag6.converterFechaSolicitudPension1}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['fecha_solicitud_pension']}"/>
                                                <webuijsf:message id="messageFechaSolicitudPension1"
                                                    for="campoFechaSolicitudPension1"/>
                                                <webuijsf:helpInline id="helpInlineFechaSolicitudPension1"
                                                    binding="#{LogProPreProPag6.helpInlineFechaSolicitudPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_solicitud_pension.log_pro_pre_pro_pag"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCondicionDenuPen1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelNumeroCondicionDenuPen1}"
                                                    id="labelNumeroCondicionDenuPen1"
                                                    for="listaNumeroCondicionDenuPen1"
                                                    text="condici&#243;n denuncia pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCondicionDenuPen2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCondicionDenuPen1"
                                                    binding="#{LogProPreProPag6.listaNumeroCondicionDenuPen1}"
                                                    converter="#{LogProPreProPag6.converterNumeroCondicionDenuPen1}"
                                                    disabled="#{LogProPreProPag6.gestor.filaNoProcesada}"
                                                    items="#{LogProPreProPag6.asistente.opcionesListaNumeroCondicionDenuPen1}"
                                                    selected="#{LogProPreProPag6.logProPreProPagDataProvider.value['numero_condicion_denu_pen']}"
                                                    toolTip="BundleParametros.numero_condicion_denu_pen.log_pro_pre_pro_pag"/>
                                                <webuijsf:staticText id="listaNumeroCondicionDenuPen1Texto1"
                                                    binding="#{LogProPreProPag6.listaNumeroCondicionDenuPen1Texto1}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['codigo_condicion_denu_pe_1x6y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionDenuPen1"
                                                    for="listaNumeroCondicionDenuPen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCondicionDenuPen1"
                                                    binding="#{LogProPreProPag6.helpInlineNumeroCondicionDenuPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_condicion_denu_pen.log_pro_pre_pro_pag"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCondicionRecoPen1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelNumeroCondicionRecoPen1}"
                                                    id="labelNumeroCondicionRecoPen1"
                                                    for="listaNumeroCondicionRecoPen1"
                                                    text="condici&#243;n reconsideraci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCondicionRecoPen2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCondicionRecoPen1"
                                                    binding="#{LogProPreProPag6.listaNumeroCondicionRecoPen1}"
                                                    converter="#{LogProPreProPag6.converterNumeroCondicionRecoPen1}"
                                                    disabled="#{LogProPreProPag6.gestor.filaNoProcesada}"
                                                    items="#{LogProPreProPag6.asistente.opcionesListaNumeroCondicionRecoPen1}"
                                                    selected="#{LogProPreProPag6.logProPreProPagDataProvider.value['numero_condicion_reco_pen']}"
                                                    toolTip="BundleParametros.numero_condicion_reco_pen.log_pro_pre_pro_pag"/>
                                                <webuijsf:staticText id="listaNumeroCondicionRecoPen1Texto1"
                                                    binding="#{LogProPreProPag6.listaNumeroCondicionRecoPen1Texto1}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['codigo_condicion_reco_pe_1x7y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionRecoPen1"
                                                    for="listaNumeroCondicionRecoPen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCondicionRecoPen1"
                                                    binding="#{LogProPreProPag6.helpInlineNumeroCondicionRecoPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_condicion_reco_pen.log_pro_pre_pro_pag"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsProcesado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelEsProcesado1}"
                                                    id="labelEsProcesado1"
                                                    for="listaEsProcesado1"
                                                    text="procesado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsProcesado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsProcesado1"
                                                    binding="#{LogProPreProPag6.listaEsProcesado1}"
                                                    converter="#{LogProPreProPag6.converterEsProcesado1}"
                                                    disabled="#{LogProPreProPag6.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogProPreProPag6.asistente.opcionesListaEsProcesado1}"
                                                    selected="#{LogProPreProPag6.logProPreProPagDataProvider.value['es_procesado']}"
                                                    toolTip="BundleParametros.es_procesado.log_pro_pre_pro_pag"/>
                                                <webuijsf:staticText id="listaEsProcesado1Texto1"
                                                    binding="#{LogProPreProPag6.listaEsProcesado1Texto1}"/>
                                                <webuijsf:message id="messageEsProcesado1"
                                                    for="listaEsProcesado1"/>
                                                <webuijsf:helpInline id="helpInlineEsProcesado1"
                                                    binding="#{LogProPreProPag6.helpInlineEsProcesado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_procesado.log_pro_pre_pro_pag"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"
                                                    text="observaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogProPreProPag6.campoObservacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogProPreProPag6.gestor.filaNoProcesada}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_pro_pre_pro_pag"
                                                    validatorExpression="#{LogProPreProPag6.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogProPreProPag6.campoObservacion1Texto1}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:helpInline id="helpInlineObservacion1"
                                                    binding="#{LogProPreProPag6.helpInlineObservacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observacion.log_pro_pre_pro_pag"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraTransaccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProPreProPag6.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"
                                                    text="fecha hora transacci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraTransaccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogProPreProPag6.campoFechaHoraTransaccion1}"
                                                    converter="#{LogProPreProPag6.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogProPreProPag6.gestor.filaNoProcesada}" required="true"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_pro_pre_pro_pag"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogProPreProPag6.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogProPreProPag6.converterFechaHoraTransaccion1}"
                                                    text="#{LogProPreProPag6.logProPreProPagDataProvider.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraTransaccion1"
                                                    binding="#{LogProPreProPag6.helpInlineFechaHoraTransaccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_transaccion.log_pro_pre_pro_pag"
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
                                                        actionExpression="#{LogProPreProPag6.botonIrAlPrimero2_action}"
                                                        binding="#{LogProPreProPag6.botonIrAlPrimero2}"
                                                        disabled="#{LogProPreProPag6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{LogProPreProPag6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogProPreProPag6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogProPreProPag6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProPreProPag6.botonIrAlAnterior2_action}"
                                                        binding="#{LogProPreProPag6.botonIrAlAnterior2}"
                                                        disabled="#{LogProPreProPag6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{LogProPreProPag6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogProPreProPag6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogProPreProPag6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProPreProPag6.botonIrAlSiguiente2_action}"
                                                        binding="#{LogProPreProPag6.botonIrAlSiguiente2}"
                                                        disabled="#{LogProPreProPag6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{LogProPreProPag6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogProPreProPag6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogProPreProPag6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProPreProPag6.botonIrAlUltimo2_action}"
                                                        binding="#{LogProPreProPag6.botonIrAlUltimo2}"
                                                        disabled="#{LogProPreProPag6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{LogProPreProPag6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogProPreProPag6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogProPreProPag6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProPreProPag6.botonProcesarFila2_action}"
                                                        binding="#{LogProPreProPag6.botonProcesarFila2}"
                                                        disabled="#{LogProPreProPag6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{LogProPreProPag6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogProPreProPag6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{LogProPreProPag6.asistente.comandoDisponible}"
                                                        text="#{LogProPreProPag6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogProPreProPag6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{LogProPreProPag6.botonAgregar1_action}"
                                                    binding="#{LogProPreProPag6.botonAgregar1}"
                                                    disabled="#{LogProPreProPag6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogProPreProPag6.gestor.scriptAgregar}"
                                                    rendered="#{LogProPreProPag6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProPreProPag6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogProPreProPag6.listaFuncionEdicion1}"
                                                    converter="#{LogProPreProPag6.converterListaFuncionEdicion1}"
                                                    disabled="#{LogProPreProPag6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogProPreProPag6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogProPreProPag6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogProPreProPag6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogProPreProPag6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProPreProPag6.botonEditar1_action}"
                                                    binding="#{LogProPreProPag6.botonEditar1}"
                                                    disabled="#{LogProPreProPag6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogProPreProPag6.gestor.scriptEditar}"
                                                    rendered="#{LogProPreProPag6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProPreProPag6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogProPreProPag6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProPreProPag6.botonEliminar1_action}"
                                                    binding="#{LogProPreProPag6.botonEliminar1}"
                                                    disabled="#{LogProPreProPag6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogProPreProPag6.gestor.scriptEliminar}"
                                                    rendered="#{LogProPreProPag6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProPreProPag6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProPreProPag6.botonAplicar1_action}"
                                                    binding="#{LogProPreProPag6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogProPreProPag6.gestor.scriptAplicar}"
                                                    rendered="#{LogProPreProPag6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProPreProPag6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProPreProPag6.botonDeshacer1_action}"
                                                    binding="#{LogProPreProPag6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogProPreProPag6.gestor.scriptDeshacer}"
                                                    rendered="#{LogProPreProPag6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProPreProPag6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProPreProPag6.botonConfirmar1_action}"
                                                    binding="#{LogProPreProPag6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogProPreProPag6.gestor.scriptConfirmar}"
                                                    rendered="#{LogProPreProPag6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProPreProPag6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProPreProPag6.botonDescartar1_action}"
                                                    binding="#{LogProPreProPag6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogProPreProPag6.gestor.scriptDescartar}"
                                                    rendered="#{LogProPreProPag6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProPreProPag6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogProPreProPag6.listaFuncionAccion1}"
                                                    converter="#{LogProPreProPag6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogProPreProPag6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogProPreProPag6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogProPreProPag6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogProPreProPag6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProPreProPag6.botonProcesar1_action}"
                                                    binding="#{LogProPreProPag6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogProPreProPag6.gestor.scriptProcesar}"
                                                    rendered="#{LogProPreProPag6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProPreProPag6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProPreProPag6.botonRefrescar1_action}"
                                                    binding="#{LogProPreProPag6.botonRefrescar1}"
                                                    disabled="#{LogProPreProPag6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogProPreProPag6.gestor.scriptRefrescar}"
                                                    rendered="#{LogProPreProPag6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProPreProPag6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProPreProPag6.botonReconsultar1_action}"
                                                    binding="#{LogProPreProPag6.botonReconsultar1}"
                                                    disabled="#{LogProPreProPag6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogProPreProPag6.gestor.scriptReconsultar}"
                                                    rendered="#{LogProPreProPag6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProPreProPag6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProPreProPag6.botonRetornar1_action}"
                                                    binding="#{LogProPreProPag6.botonRetornar1}"
                                                    disabled="#{LogProPreProPag6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogProPreProPag6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogProPreProPag6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProPreProPag6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogProPreProPag6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{LogProPreProPag6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogProPreProPag6.imageHyperlink1_action}"
                                                    binding="#{LogProPreProPag6.imageHyperlink1}"
                                                    disabled="#{LogProPreProPag6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogProPreProPag6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogProPreProPag6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogProPreProPag6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogProPreProPag6_imageHyperlink1_toolTip}"/>
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
