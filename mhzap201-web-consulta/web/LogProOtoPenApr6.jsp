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
                    focus="#{LogProOtoPenApr6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogProOtoPenApr6.gestor.preserveFocus}"
                    preserveScroll="#{LogProOtoPenApr6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogProOtoPenApr6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdLogProOtoPenApr1 campoIdPersona1 campoCodigoPersona1 campoNombrePersona1 campoIdDepartamento1 campoIdDistrito1 campoIdBarrio1 listaNumeroCondicionPension1 listaEsProcesado1 campoObservacion1 campoFechaHoraTransaccion1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogProOtoPenApr6.breadcrumbs1}" 
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
                                                    rendered="#{LogProOtoPenApr6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogProOtoPenApr6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogProOtoPenApr6.gestor.mensajeDisponible}"
                                                    text="#{LogProOtoPenApr6.gestor.mensaje}"
                                                    url="#{LogProOtoPenApr6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{LogProOtoPenApr6.gestor.filaDisponible}"
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
                                                        actionExpression="#{LogProOtoPenApr6.botonIrAlPrimero1_action}"
                                                        binding="#{LogProOtoPenApr6.botonIrAlPrimero1}"
                                                        disabled="#{LogProOtoPenApr6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{LogProOtoPenApr6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogProOtoPenApr6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogProOtoPenApr6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProOtoPenApr6.botonIrAlAnterior1_action}"
                                                        binding="#{LogProOtoPenApr6.botonIrAlAnterior1}"
                                                        disabled="#{LogProOtoPenApr6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{LogProOtoPenApr6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogProOtoPenApr6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogProOtoPenApr6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProOtoPenApr6.botonIrAlSiguiente1_action}"
                                                        binding="#{LogProOtoPenApr6.botonIrAlSiguiente1}"
                                                        disabled="#{LogProOtoPenApr6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{LogProOtoPenApr6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogProOtoPenApr6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogProOtoPenApr6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProOtoPenApr6.botonIrAlUltimo1_action}"
                                                        binding="#{LogProOtoPenApr6.botonIrAlUltimo1}"
                                                        disabled="#{LogProOtoPenApr6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{LogProOtoPenApr6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogProOtoPenApr6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogProOtoPenApr6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProOtoPenApr6.botonProcesarFila1_action}"
                                                        binding="#{LogProOtoPenApr6.botonProcesarFila1}"
                                                        disabled="#{LogProOtoPenApr6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogProOtoPenApr6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogProOtoPenApr6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogProOtoPenApr6.asistente.comandoDisponible}"
                                                        text="#{LogProOtoPenApr6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogProOtoPenApr6.gestor.tituloConsulta}"/>
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
                                                    binding="#{LogProOtoPenApr6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{LogProOtoPenApr6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{LogProOtoPenApr6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{LogProOtoPenApr6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{LogProOtoPenApr6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{LogProOtoPenApr6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{LogProOtoPenApr6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{LogProOtoPenApr6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{LogProOtoPenApr6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdLogProOtoPenApr1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr6.labelIdLogProOtoPenApr1}"
                                                    id="labelIdLogProOtoPenApr1"
                                                    for="campoIdLogProOtoPenApr1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdLogProOtoPenApr2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdLogProOtoPenApr1"
                                                    binding="#{LogProOtoPenApr6.campoIdLogProOtoPenApr1}"
                                                    converter="#{LogProOtoPenApr6.converterIdLogProOtoPenApr1}"
                                                    readOnly="true"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['id_log_pro_oto_pen_apr']}"
                                                    toolTip="BundleParametros.id_log_pro_oto_pen_apr.log_pro_oto_pen_apr"
                                                    validatorExpression="#{LogProOtoPenApr6.validatorIdLogProOtoPenApr1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogProOtoPenApr1Texto1"
                                                    binding="#{LogProOtoPenApr6.campoIdLogProOtoPenApr1Texto1}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['id_log_pro_oto_pen_apr']}"/>
                                                <webuijsf:message id="messageIdLogProOtoPenApr1"
                                                    for="campoIdLogProOtoPenApr1"/>
                                                <webuijsf:helpInline id="helpInlineIdLogProOtoPenApr1"
                                                    binding="#{LogProOtoPenApr6.helpInlineIdLogProOtoPenApr1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_log_pro_oto_pen_apr.log_pro_oto_pen_apr"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr6.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"
                                                    text="persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{LogProOtoPenApr6.campoIdPersona1}"
                                                    readOnly="#{LogProOtoPenApr6.gestor.filaNoProcesada}"
                                                    text="#{LogProOtoPenApr6.asistente.textoCampoIdPersona1}"
                                                    toolTip="#{LogProOtoPenApr6.asistente.toolTipCampoIdPersona1}"
                                                    validatorExpression="#{LogProOtoPenApr6.campoIdPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{LogProOtoPenApr6.campoIdPersona1Texto1}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['codigo_persona_1x1y3']}"/>
                                                <webuijsf:button id="campoIdPersona1Boton1"
                                                    binding="#{LogProOtoPenApr6.campoIdPersona1Boton1}"
                                                    onClick="#{LogProOtoPenApr6.asistente.scriptCampoIdPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdPersona1Boton3"
                                                    binding="#{LogProOtoPenApr6.campoIdPersona1Boton3}"
                                                    onClick="#{LogProOtoPenApr6.asistente.scriptCampoIdPersona1Boton2}"
                                                    rendered="#{LogProOtoPenApr6.asistente.campoIdPersona1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdPersona1"
                                                    binding="#{LogProOtoPenApr6.helpInlineIdPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_persona.log_pro_oto_pen_apr"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona3"
                                                rendered="#{LogProOtoPenApr6.asistente.campoIdPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr6.labelIdPersona2}"
                                                    id="labelIdPersona2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona4"
                                                rendered="#{LogProOtoPenApr6.asistente.campoIdPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProOtoPenApr6.campoIdPersona1Texto2}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['nombre_persona_1x1y4']}"
                                                    id="campoIdPersona1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProOtoPenApr6.campoIdPersona1Boton2}"
                                                    id="campoIdPersona1Boton2"
                                                    onClick="#{LogProOtoPenApr6.asistente.scriptCampoIdPersona1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr6.labelCodigoPersona1}"
                                                    id="labelCodigoPersona1"
                                                    for="campoCodigoPersona1"
                                                    text="c&#243;digo persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCodigoPersona1"
                                                    binding="#{LogProOtoPenApr6.campoCodigoPersona1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogProOtoPenApr6.gestor.filaNoProcesada}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['codigo_persona']}"
                                                    toolTip="BundleParametros.codigo_persona.log_pro_oto_pen_apr"
                                                    validatorExpression="#{LogProOtoPenApr6.validatorCodigoPersona1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPersona1Texto1"
                                                    binding="#{LogProOtoPenApr6.campoCodigoPersona1Texto1}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['codigo_persona']}"/>
                                                <webuijsf:message id="messageCodigoPersona1"
                                                    for="campoCodigoPersona1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoPersona1"
                                                    binding="#{LogProOtoPenApr6.helpInlineCodigoPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_persona.log_pro_oto_pen_apr"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombrePersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr6.labelNombrePersona1}"
                                                    id="labelNombrePersona1"
                                                    for="campoNombrePersona1"
                                                    text="nombre persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombrePersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNombrePersona1"
                                                    binding="#{LogProOtoPenApr6.campoNombrePersona1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogProOtoPenApr6.gestor.filaNoProcesada}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['nombre_persona']}"
                                                    toolTip="BundleParametros.nombre_persona.log_pro_oto_pen_apr"
                                                    validatorExpression="#{LogProOtoPenApr6.validatorNombrePersona1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePersona1Texto1"
                                                    binding="#{LogProOtoPenApr6.campoNombrePersona1Texto1}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['nombre_persona']}"/>
                                                <webuijsf:message id="messageNombrePersona1"
                                                    for="campoNombrePersona1"/>
                                                <webuijsf:helpInline id="helpInlineNombrePersona1"
                                                    binding="#{LogProOtoPenApr6.helpInlineNombrePersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_persona.log_pro_oto_pen_apr"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr6.labelIdDepartamento1}"
                                                    id="labelIdDepartamento1"
                                                    for="campoIdDepartamento1"
                                                    text="departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDepartamento1"
                                                    binding="#{LogProOtoPenApr6.campoIdDepartamento1}"
                                                    readOnly="#{LogProOtoPenApr6.gestor.filaNoProcesada}"
                                                    text="#{LogProOtoPenApr6.asistente.textoCampoIdDepartamento1}"
                                                    toolTip="#{LogProOtoPenApr6.asistente.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{LogProOtoPenApr6.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1Texto1"
                                                    binding="#{LogProOtoPenApr6.campoIdDepartamento1Texto1}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['codigo_ubicacion_1x2y3']}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton1"
                                                    binding="#{LogProOtoPenApr6.campoIdDepartamento1Boton1}"
                                                    onClick="#{LogProOtoPenApr6.asistente.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton3"
                                                    binding="#{LogProOtoPenApr6.campoIdDepartamento1Boton3}"
                                                    onClick="#{LogProOtoPenApr6.asistente.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{LogProOtoPenApr6.asistente.campoIdDepartamento1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                <webuijsf:helpInline id="helpInlineIdDepartamento1"
                                                    binding="#{LogProOtoPenApr6.helpInlineIdDepartamento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_departamento.log_pro_oto_pen_apr"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento3"
                                                rendered="#{LogProOtoPenApr6.asistente.campoIdDepartamento1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr6.labelIdDepartamento2}"
                                                    id="labelIdDepartamento2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento4"
                                                rendered="#{LogProOtoPenApr6.asistente.campoIdDepartamento1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProOtoPenApr6.campoIdDepartamento1Texto2}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['nombre_ubicacion_1x2y4']}"
                                                    id="campoIdDepartamento1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProOtoPenApr6.campoIdDepartamento1Boton2}"
                                                    id="campoIdDepartamento1Boton2"
                                                    onClick="#{LogProOtoPenApr6.asistente.scriptCampoIdDepartamento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr6.labelIdDistrito1}"
                                                    id="labelIdDistrito1"
                                                    for="campoIdDistrito1"
                                                    text="distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDistrito1"
                                                    binding="#{LogProOtoPenApr6.campoIdDistrito1}"
                                                    readOnly="#{LogProOtoPenApr6.gestor.filaNoProcesada}"
                                                    text="#{LogProOtoPenApr6.asistente.textoCampoIdDistrito1}"
                                                    toolTip="#{LogProOtoPenApr6.asistente.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{LogProOtoPenApr6.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1Texto1"
                                                    binding="#{LogProOtoPenApr6.campoIdDistrito1Texto1}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['codigo_ubicacion_1x3y3']}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton1"
                                                    binding="#{LogProOtoPenApr6.campoIdDistrito1Boton1}"
                                                    onClick="#{LogProOtoPenApr6.asistente.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton3"
                                                    binding="#{LogProOtoPenApr6.campoIdDistrito1Boton3}"
                                                    onClick="#{LogProOtoPenApr6.asistente.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{LogProOtoPenApr6.asistente.campoIdDistrito1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                <webuijsf:helpInline id="helpInlineIdDistrito1"
                                                    binding="#{LogProOtoPenApr6.helpInlineIdDistrito1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_distrito.log_pro_oto_pen_apr"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito3"
                                                rendered="#{LogProOtoPenApr6.asistente.campoIdDistrito1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr6.labelIdDistrito2}"
                                                    id="labelIdDistrito2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito4"
                                                rendered="#{LogProOtoPenApr6.asistente.campoIdDistrito1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProOtoPenApr6.campoIdDistrito1Texto2}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['nombre_ubicacion_1x3y4']}"
                                                    id="campoIdDistrito1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProOtoPenApr6.campoIdDistrito1Boton2}"
                                                    id="campoIdDistrito1Boton2"
                                                    onClick="#{LogProOtoPenApr6.asistente.scriptCampoIdDistrito1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr6.labelIdBarrio1}"
                                                    id="labelIdBarrio1"
                                                    for="campoIdBarrio1"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdBarrio1"
                                                    binding="#{LogProOtoPenApr6.campoIdBarrio1}"
                                                    readOnly="#{LogProOtoPenApr6.gestor.filaNoProcesada}"
                                                    text="#{LogProOtoPenApr6.asistente.textoCampoIdBarrio1}"
                                                    toolTip="#{LogProOtoPenApr6.asistente.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{LogProOtoPenApr6.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1Texto1"
                                                    binding="#{LogProOtoPenApr6.campoIdBarrio1Texto1}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['codigo_ubicacion_1x4y3']}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton1"
                                                    binding="#{LogProOtoPenApr6.campoIdBarrio1Boton1}"
                                                    onClick="#{LogProOtoPenApr6.asistente.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton3"
                                                    binding="#{LogProOtoPenApr6.campoIdBarrio1Boton3}"
                                                    onClick="#{LogProOtoPenApr6.asistente.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{LogProOtoPenApr6.asistente.campoIdBarrio1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                <webuijsf:helpInline id="helpInlineIdBarrio1"
                                                    binding="#{LogProOtoPenApr6.helpInlineIdBarrio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_barrio.log_pro_oto_pen_apr"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio3"
                                                rendered="#{LogProOtoPenApr6.asistente.campoIdBarrio1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr6.labelIdBarrio2}"
                                                    id="labelIdBarrio2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio4"
                                                rendered="#{LogProOtoPenApr6.asistente.campoIdBarrio1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProOtoPenApr6.campoIdBarrio1Texto2}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['nombre_ubicacion_1x4y4']}"
                                                    id="campoIdBarrio1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProOtoPenApr6.campoIdBarrio1Boton2}"
                                                    id="campoIdBarrio1Boton2"
                                                    onClick="#{LogProOtoPenApr6.asistente.scriptCampoIdBarrio1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCondicionPension1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr6.labelNumeroCondicionPension1}"
                                                    id="labelNumeroCondicionPension1"
                                                    for="listaNumeroCondicionPension1"
                                                    text="condici&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCondicionPension2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCondicionPension1"
                                                    binding="#{LogProOtoPenApr6.listaNumeroCondicionPension1}"
                                                    converter="#{LogProOtoPenApr6.converterNumeroCondicionPension1}"
                                                    disabled="#{LogProOtoPenApr6.gestor.filaNoProcesada}"
                                                    items="#{LogProOtoPenApr6.asistente.opcionesListaNumeroCondicionPension1}"
                                                    selected="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['numero_condicion_pension']}"
                                                    toolTip="BundleParametros.numero_condicion_pension.log_pro_oto_pen_apr"/>
                                                <webuijsf:staticText id="listaNumeroCondicionPension1Texto1"
                                                    binding="#{LogProOtoPenApr6.listaNumeroCondicionPension1Texto1}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['codigo_condicion_pension_1x5y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionPension1"
                                                    for="listaNumeroCondicionPension1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCondicionPension1"
                                                    binding="#{LogProOtoPenApr6.helpInlineNumeroCondicionPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_condicion_pension.log_pro_oto_pen_apr"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsProcesado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr6.labelEsProcesado1}"
                                                    id="labelEsProcesado1"
                                                    for="listaEsProcesado1"
                                                    text="procesado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsProcesado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsProcesado1"
                                                    binding="#{LogProOtoPenApr6.listaEsProcesado1}"
                                                    converter="#{LogProOtoPenApr6.converterEsProcesado1}"
                                                    disabled="#{LogProOtoPenApr6.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogProOtoPenApr6.asistente.opcionesListaEsProcesado1}"
                                                    selected="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['es_procesado']}"
                                                    toolTip="BundleParametros.es_procesado.log_pro_oto_pen_apr"/>
                                                <webuijsf:staticText id="listaEsProcesado1Texto1"
                                                    binding="#{LogProOtoPenApr6.listaEsProcesado1Texto1}"/>
                                                <webuijsf:message id="messageEsProcesado1"
                                                    for="listaEsProcesado1"/>
                                                <webuijsf:helpInline id="helpInlineEsProcesado1"
                                                    binding="#{LogProOtoPenApr6.helpInlineEsProcesado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_procesado.log_pro_oto_pen_apr"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr6.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"
                                                    text="observaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogProOtoPenApr6.campoObservacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogProOtoPenApr6.gestor.filaNoProcesada}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_pro_oto_pen_apr"
                                                    validatorExpression="#{LogProOtoPenApr6.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogProOtoPenApr6.campoObservacion1Texto1}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:helpInline id="helpInlineObservacion1"
                                                    binding="#{LogProOtoPenApr6.helpInlineObservacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observacion.log_pro_oto_pen_apr"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraTransaccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProOtoPenApr6.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"
                                                    text="fecha hora transacci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraTransaccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogProOtoPenApr6.campoFechaHoraTransaccion1}"
                                                    converter="#{LogProOtoPenApr6.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogProOtoPenApr6.gestor.filaNoProcesada}" required="true"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_pro_oto_pen_apr"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogProOtoPenApr6.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogProOtoPenApr6.converterFechaHoraTransaccion1}"
                                                    text="#{LogProOtoPenApr6.logProOtoPenAprDataProvider.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraTransaccion1"
                                                    binding="#{LogProOtoPenApr6.helpInlineFechaHoraTransaccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_transaccion.log_pro_oto_pen_apr"
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
                                                        actionExpression="#{LogProOtoPenApr6.botonIrAlPrimero2_action}"
                                                        binding="#{LogProOtoPenApr6.botonIrAlPrimero2}"
                                                        disabled="#{LogProOtoPenApr6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{LogProOtoPenApr6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogProOtoPenApr6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogProOtoPenApr6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProOtoPenApr6.botonIrAlAnterior2_action}"
                                                        binding="#{LogProOtoPenApr6.botonIrAlAnterior2}"
                                                        disabled="#{LogProOtoPenApr6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{LogProOtoPenApr6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogProOtoPenApr6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogProOtoPenApr6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProOtoPenApr6.botonIrAlSiguiente2_action}"
                                                        binding="#{LogProOtoPenApr6.botonIrAlSiguiente2}"
                                                        disabled="#{LogProOtoPenApr6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{LogProOtoPenApr6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogProOtoPenApr6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogProOtoPenApr6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProOtoPenApr6.botonIrAlUltimo2_action}"
                                                        binding="#{LogProOtoPenApr6.botonIrAlUltimo2}"
                                                        disabled="#{LogProOtoPenApr6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{LogProOtoPenApr6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogProOtoPenApr6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogProOtoPenApr6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProOtoPenApr6.botonProcesarFila2_action}"
                                                        binding="#{LogProOtoPenApr6.botonProcesarFila2}"
                                                        disabled="#{LogProOtoPenApr6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{LogProOtoPenApr6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogProOtoPenApr6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{LogProOtoPenApr6.asistente.comandoDisponible}"
                                                        text="#{LogProOtoPenApr6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogProOtoPenApr6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{LogProOtoPenApr6.botonAgregar1_action}"
                                                    binding="#{LogProOtoPenApr6.botonAgregar1}"
                                                    disabled="#{LogProOtoPenApr6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogProOtoPenApr6.gestor.scriptAgregar}"
                                                    rendered="#{LogProOtoPenApr6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogProOtoPenApr6.listaFuncionEdicion1}"
                                                    converter="#{LogProOtoPenApr6.converterListaFuncionEdicion1}"
                                                    disabled="#{LogProOtoPenApr6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogProOtoPenApr6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogProOtoPenApr6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogProOtoPenApr6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr6.botonEditar1_action}"
                                                    binding="#{LogProOtoPenApr6.botonEditar1}"
                                                    disabled="#{LogProOtoPenApr6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogProOtoPenApr6.gestor.scriptEditar}"
                                                    rendered="#{LogProOtoPenApr6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogProOtoPenApr6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr6.botonEliminar1_action}"
                                                    binding="#{LogProOtoPenApr6.botonEliminar1}"
                                                    disabled="#{LogProOtoPenApr6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogProOtoPenApr6.gestor.scriptEliminar}"
                                                    rendered="#{LogProOtoPenApr6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr6.botonAplicar1_action}"
                                                    binding="#{LogProOtoPenApr6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogProOtoPenApr6.gestor.scriptAplicar}"
                                                    rendered="#{LogProOtoPenApr6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr6.botonDeshacer1_action}"
                                                    binding="#{LogProOtoPenApr6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogProOtoPenApr6.gestor.scriptDeshacer}"
                                                    rendered="#{LogProOtoPenApr6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr6.botonConfirmar1_action}"
                                                    binding="#{LogProOtoPenApr6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogProOtoPenApr6.gestor.scriptConfirmar}"
                                                    rendered="#{LogProOtoPenApr6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr6.botonDescartar1_action}"
                                                    binding="#{LogProOtoPenApr6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogProOtoPenApr6.gestor.scriptDescartar}"
                                                    rendered="#{LogProOtoPenApr6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogProOtoPenApr6.listaFuncionAccion1}"
                                                    converter="#{LogProOtoPenApr6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogProOtoPenApr6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogProOtoPenApr6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogProOtoPenApr6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr6.botonProcesar1_action}"
                                                    binding="#{LogProOtoPenApr6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogProOtoPenApr6.gestor.scriptProcesar}"
                                                    rendered="#{LogProOtoPenApr6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr6.botonRefrescar1_action}"
                                                    binding="#{LogProOtoPenApr6.botonRefrescar1}"
                                                    disabled="#{LogProOtoPenApr6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogProOtoPenApr6.gestor.scriptRefrescar}"
                                                    rendered="#{LogProOtoPenApr6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr6.botonReconsultar1_action}"
                                                    binding="#{LogProOtoPenApr6.botonReconsultar1}"
                                                    disabled="#{LogProOtoPenApr6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogProOtoPenApr6.gestor.scriptReconsultar}"
                                                    rendered="#{LogProOtoPenApr6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProOtoPenApr6.botonRetornar1_action}"
                                                    binding="#{LogProOtoPenApr6.botonRetornar1}"
                                                    disabled="#{LogProOtoPenApr6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogProOtoPenApr6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogProOtoPenApr6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProOtoPenApr6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogProOtoPenApr6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{LogProOtoPenApr6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogProOtoPenApr6.imageHyperlink1_action}"
                                                    binding="#{LogProOtoPenApr6.imageHyperlink1}"
                                                    disabled="#{LogProOtoPenApr6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogProOtoPenApr6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogProOtoPenApr6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogProOtoPenApr6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogProOtoPenApr6_imageHyperlink1_toolTip}"/>
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
