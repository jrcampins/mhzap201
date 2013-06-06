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
                    focus="#{LogProDenPenObj6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogProDenPenObj6.gestor.preserveFocus}"
                    preserveScroll="#{LogProDenPenObj6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogProDenPenObj6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdLogProDenPenObj1 campoIdPersona1 campoCodigoPersona1 campoNombrePersona1 campoIdDepartamento1 campoIdDistrito1 campoIdBarrio1 listaNumeroCausaDenPension1 listaEsProcesado1 campoObservacion1 campoFechaHoraTransaccion1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogProDenPenObj6.breadcrumbs1}" 
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
                                                    rendered="#{LogProDenPenObj6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogProDenPenObj6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogProDenPenObj6.gestor.mensajeDisponible}"
                                                    text="#{LogProDenPenObj6.gestor.mensaje}"
                                                    url="#{LogProDenPenObj6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{LogProDenPenObj6.gestor.filaDisponible}"
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
                                                        actionExpression="#{LogProDenPenObj6.botonIrAlPrimero1_action}"
                                                        binding="#{LogProDenPenObj6.botonIrAlPrimero1}"
                                                        disabled="#{LogProDenPenObj6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{LogProDenPenObj6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogProDenPenObj6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogProDenPenObj6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProDenPenObj6.botonIrAlAnterior1_action}"
                                                        binding="#{LogProDenPenObj6.botonIrAlAnterior1}"
                                                        disabled="#{LogProDenPenObj6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{LogProDenPenObj6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogProDenPenObj6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogProDenPenObj6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProDenPenObj6.botonIrAlSiguiente1_action}"
                                                        binding="#{LogProDenPenObj6.botonIrAlSiguiente1}"
                                                        disabled="#{LogProDenPenObj6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{LogProDenPenObj6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogProDenPenObj6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogProDenPenObj6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProDenPenObj6.botonIrAlUltimo1_action}"
                                                        binding="#{LogProDenPenObj6.botonIrAlUltimo1}"
                                                        disabled="#{LogProDenPenObj6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{LogProDenPenObj6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogProDenPenObj6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogProDenPenObj6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProDenPenObj6.botonProcesarFila1_action}"
                                                        binding="#{LogProDenPenObj6.botonProcesarFila1}"
                                                        disabled="#{LogProDenPenObj6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogProDenPenObj6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogProDenPenObj6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogProDenPenObj6.asistente.comandoDisponible}"
                                                        text="#{LogProDenPenObj6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogProDenPenObj6.gestor.tituloConsulta}"/>
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
                                                    binding="#{LogProDenPenObj6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{LogProDenPenObj6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{LogProDenPenObj6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{LogProDenPenObj6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{LogProDenPenObj6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{LogProDenPenObj6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProDenPenObj6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{LogProDenPenObj6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{LogProDenPenObj6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{LogProDenPenObj6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdLogProDenPenObj1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProDenPenObj6.labelIdLogProDenPenObj1}"
                                                    id="labelIdLogProDenPenObj1"
                                                    for="campoIdLogProDenPenObj1"
                                                    toolTip="BundleParametros.id_log_pro_den_pen_obj.log_pro_den_pen_obj"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdLogProDenPenObj2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdLogProDenPenObj1"
                                                    binding="#{LogProDenPenObj6.campoIdLogProDenPenObj1}"
                                                    converter="#{LogProDenPenObj6.converterIdLogProDenPenObj1}"
                                                    readOnly="true"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['id_log_pro_den_pen_obj']}"
                                                    toolTip="BundleParametros.id_log_pro_den_pen_obj.log_pro_den_pen_obj"
                                                    validatorExpression="#{LogProDenPenObj6.validatorIdLogProDenPenObj1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogProDenPenObj1Texto1"
                                                    binding="#{LogProDenPenObj6.campoIdLogProDenPenObj1Texto1}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['id_log_pro_den_pen_obj']}"/>
                                                <webuijsf:message id="messageIdLogProDenPenObj1"
                                                    for="campoIdLogProDenPenObj1"/>
                                                <webuijsf:helpInline id="helpInlineIdLogProDenPenObj1"
                                                    binding="#{LogProDenPenObj6.helpInlineIdLogProDenPenObj1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_log_pro_den_pen_obj.log_pro_den_pen_obj"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProDenPenObj6.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"
                                                    toolTip="BundleParametros.id_persona.log_pro_den_pen_obj"
                                                    text="persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{LogProDenPenObj6.campoIdPersona1}"
                                                    readOnly="#{LogProDenPenObj6.gestor.filaNoProcesada}"
                                                    text="#{LogProDenPenObj6.asistente.textoCampoIdPersona1}"
                                                    toolTip="#{LogProDenPenObj6.asistente.toolTipCampoIdPersona1}"
                                                    validatorExpression="#{LogProDenPenObj6.campoIdPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{LogProDenPenObj6.campoIdPersona1Texto1}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['codigo_persona_1x1y3']}"/>
                                                <webuijsf:button id="campoIdPersona1Boton1"
                                                    binding="#{LogProDenPenObj6.campoIdPersona1Boton1}"
                                                    onClick="#{LogProDenPenObj6.asistente.scriptCampoIdPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdPersona1Boton3"
                                                    binding="#{LogProDenPenObj6.campoIdPersona1Boton3}"
                                                    onClick="#{LogProDenPenObj6.asistente.scriptCampoIdPersona1Boton2}"
                                                    rendered="#{LogProDenPenObj6.asistente.campoIdPersona1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdPersona1"
                                                    binding="#{LogProDenPenObj6.helpInlineIdPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_persona.log_pro_den_pen_obj"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona3"
                                                rendered="#{LogProDenPenObj6.asistente.campoIdPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProDenPenObj6.labelIdPersona2}"
                                                    id="labelIdPersona2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona4"
                                                rendered="#{LogProDenPenObj6.asistente.campoIdPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProDenPenObj6.campoIdPersona1Texto2}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['nombre_persona_1x1y4']}"
                                                    id="campoIdPersona1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProDenPenObj6.campoIdPersona1Boton2}"
                                                    id="campoIdPersona1Boton2"
                                                    onClick="#{LogProDenPenObj6.asistente.scriptCampoIdPersona1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProDenPenObj6.labelCodigoPersona1}"
                                                    id="labelCodigoPersona1"
                                                    for="campoCodigoPersona1"
                                                    toolTip="BundleParametros.codigo_persona.log_pro_den_pen_obj"
                                                    text="c&#243;digo persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoPersona1"
                                                    binding="#{LogProDenPenObj6.campoCodigoPersona1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{LogProDenPenObj6.gestor.filaNoProcesada}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['codigo_persona']}"
                                                    toolTip="BundleParametros.codigo_persona.log_pro_den_pen_obj"
                                                    validatorExpression="#{LogProDenPenObj6.validatorCodigoPersona1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPersona1Texto1"
                                                    binding="#{LogProDenPenObj6.campoCodigoPersona1Texto1}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['codigo_persona']}"/>
                                                <webuijsf:message id="messageCodigoPersona1"
                                                    for="campoCodigoPersona1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoPersona1"
                                                    binding="#{LogProDenPenObj6.helpInlineCodigoPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_persona.log_pro_den_pen_obj"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombrePersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProDenPenObj6.labelNombrePersona1}"
                                                    id="labelNombrePersona1"
                                                    for="campoNombrePersona1"
                                                    toolTip="BundleParametros.nombre_persona.log_pro_den_pen_obj"
                                                    text="nombre persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombrePersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombrePersona1"
                                                    binding="#{LogProDenPenObj6.campoNombrePersona1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{LogProDenPenObj6.gestor.filaNoProcesada}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['nombre_persona']}"
                                                    toolTip="BundleParametros.nombre_persona.log_pro_den_pen_obj"
                                                    validatorExpression="#{LogProDenPenObj6.validatorNombrePersona1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePersona1Texto1"
                                                    binding="#{LogProDenPenObj6.campoNombrePersona1Texto1}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['nombre_persona']}"/>
                                                <webuijsf:message id="messageNombrePersona1"
                                                    for="campoNombrePersona1"/>
                                                <webuijsf:helpInline id="helpInlineNombrePersona1"
                                                    binding="#{LogProDenPenObj6.helpInlineNombrePersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_persona.log_pro_den_pen_obj"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProDenPenObj6.labelIdDepartamento1}"
                                                    id="labelIdDepartamento1"
                                                    for="campoIdDepartamento1"
                                                    toolTip="BundleParametros.id_departamento.log_pro_den_pen_obj"
                                                    text="departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDepartamento1"
                                                    binding="#{LogProDenPenObj6.campoIdDepartamento1}"
                                                    readOnly="#{LogProDenPenObj6.gestor.filaNoProcesada}"
                                                    text="#{LogProDenPenObj6.asistente.textoCampoIdDepartamento1}"
                                                    toolTip="#{LogProDenPenObj6.asistente.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{LogProDenPenObj6.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1Texto1"
                                                    binding="#{LogProDenPenObj6.campoIdDepartamento1Texto1}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['codigo_ubicacion_1x2y3']}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton1"
                                                    binding="#{LogProDenPenObj6.campoIdDepartamento1Boton1}"
                                                    onClick="#{LogProDenPenObj6.asistente.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton3"
                                                    binding="#{LogProDenPenObj6.campoIdDepartamento1Boton3}"
                                                    onClick="#{LogProDenPenObj6.asistente.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{LogProDenPenObj6.asistente.campoIdDepartamento1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                <webuijsf:helpInline id="helpInlineIdDepartamento1"
                                                    binding="#{LogProDenPenObj6.helpInlineIdDepartamento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_departamento.log_pro_den_pen_obj"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento3"
                                                rendered="#{LogProDenPenObj6.asistente.campoIdDepartamento1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProDenPenObj6.labelIdDepartamento2}"
                                                    id="labelIdDepartamento2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento4"
                                                rendered="#{LogProDenPenObj6.asistente.campoIdDepartamento1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProDenPenObj6.campoIdDepartamento1Texto2}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['nombre_ubicacion_1x2y4']}"
                                                    id="campoIdDepartamento1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProDenPenObj6.campoIdDepartamento1Boton2}"
                                                    id="campoIdDepartamento1Boton2"
                                                    onClick="#{LogProDenPenObj6.asistente.scriptCampoIdDepartamento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProDenPenObj6.labelIdDistrito1}"
                                                    id="labelIdDistrito1"
                                                    for="campoIdDistrito1"
                                                    toolTip="BundleParametros.id_distrito.log_pro_den_pen_obj"
                                                    text="distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDistrito1"
                                                    binding="#{LogProDenPenObj6.campoIdDistrito1}"
                                                    readOnly="#{LogProDenPenObj6.gestor.filaNoProcesada}"
                                                    text="#{LogProDenPenObj6.asistente.textoCampoIdDistrito1}"
                                                    toolTip="#{LogProDenPenObj6.asistente.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{LogProDenPenObj6.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1Texto1"
                                                    binding="#{LogProDenPenObj6.campoIdDistrito1Texto1}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['codigo_ubicacion_1x3y3']}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton1"
                                                    binding="#{LogProDenPenObj6.campoIdDistrito1Boton1}"
                                                    onClick="#{LogProDenPenObj6.asistente.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton3"
                                                    binding="#{LogProDenPenObj6.campoIdDistrito1Boton3}"
                                                    onClick="#{LogProDenPenObj6.asistente.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{LogProDenPenObj6.asistente.campoIdDistrito1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                <webuijsf:helpInline id="helpInlineIdDistrito1"
                                                    binding="#{LogProDenPenObj6.helpInlineIdDistrito1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_distrito.log_pro_den_pen_obj"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito3"
                                                rendered="#{LogProDenPenObj6.asistente.campoIdDistrito1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProDenPenObj6.labelIdDistrito2}"
                                                    id="labelIdDistrito2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito4"
                                                rendered="#{LogProDenPenObj6.asistente.campoIdDistrito1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProDenPenObj6.campoIdDistrito1Texto2}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['nombre_ubicacion_1x3y4']}"
                                                    id="campoIdDistrito1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProDenPenObj6.campoIdDistrito1Boton2}"
                                                    id="campoIdDistrito1Boton2"
                                                    onClick="#{LogProDenPenObj6.asistente.scriptCampoIdDistrito1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProDenPenObj6.labelIdBarrio1}"
                                                    id="labelIdBarrio1"
                                                    for="campoIdBarrio1"
                                                    toolTip="BundleParametros.id_barrio.log_pro_den_pen_obj"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdBarrio1"
                                                    binding="#{LogProDenPenObj6.campoIdBarrio1}"
                                                    readOnly="#{LogProDenPenObj6.gestor.filaNoProcesada}"
                                                    text="#{LogProDenPenObj6.asistente.textoCampoIdBarrio1}"
                                                    toolTip="#{LogProDenPenObj6.asistente.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{LogProDenPenObj6.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1Texto1"
                                                    binding="#{LogProDenPenObj6.campoIdBarrio1Texto1}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['codigo_ubicacion_1x4y3']}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton1"
                                                    binding="#{LogProDenPenObj6.campoIdBarrio1Boton1}"
                                                    onClick="#{LogProDenPenObj6.asistente.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton3"
                                                    binding="#{LogProDenPenObj6.campoIdBarrio1Boton3}"
                                                    onClick="#{LogProDenPenObj6.asistente.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{LogProDenPenObj6.asistente.campoIdBarrio1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                <webuijsf:helpInline id="helpInlineIdBarrio1"
                                                    binding="#{LogProDenPenObj6.helpInlineIdBarrio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_barrio.log_pro_den_pen_obj"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio3"
                                                rendered="#{LogProDenPenObj6.asistente.campoIdBarrio1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProDenPenObj6.labelIdBarrio2}"
                                                    id="labelIdBarrio2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio4"
                                                rendered="#{LogProDenPenObj6.asistente.campoIdBarrio1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogProDenPenObj6.campoIdBarrio1Texto2}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['nombre_ubicacion_1x4y4']}"
                                                    id="campoIdBarrio1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogProDenPenObj6.campoIdBarrio1Boton2}"
                                                    id="campoIdBarrio1Boton2"
                                                    onClick="#{LogProDenPenObj6.asistente.scriptCampoIdBarrio1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaDenPension1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProDenPenObj6.labelNumeroCausaDenPension1}"
                                                    id="labelNumeroCausaDenPension1"
                                                    for="listaNumeroCausaDenPension1"
                                                    toolTip="BundleParametros.numero_causa_den_pension.log_pro_den_pen_obj"
                                                    text="causa denegaci&#243;n pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaDenPension2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaDenPension1"
                                                    binding="#{LogProDenPenObj6.listaNumeroCausaDenPension1}"
                                                    converter="#{LogProDenPenObj6.converterNumeroCausaDenPension1}"
                                                    disabled="#{LogProDenPenObj6.gestor.filaNoProcesada}"
                                                    items="#{LogProDenPenObj6.asistente.opcionesListaNumeroCausaDenPension1}"
                                                    selected="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['numero_causa_den_pension']}"
                                                    toolTip="BundleParametros.numero_causa_den_pension.log_pro_den_pen_obj"/>
                                                <webuijsf:staticText id="listaNumeroCausaDenPension1Texto1"
                                                    binding="#{LogProDenPenObj6.listaNumeroCausaDenPension1Texto1}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['codigo_causa_den_pension_1x5y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaDenPension1"
                                                    for="listaNumeroCausaDenPension1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaDenPension1"
                                                    binding="#{LogProDenPenObj6.helpInlineNumeroCausaDenPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_den_pension.log_pro_den_pen_obj"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsProcesado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProDenPenObj6.labelEsProcesado1}"
                                                    id="labelEsProcesado1"
                                                    for="listaEsProcesado1"
                                                    toolTip="BundleParametros.es_procesado.log_pro_den_pen_obj"
                                                    text="procesado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsProcesado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsProcesado1"
                                                    binding="#{LogProDenPenObj6.listaEsProcesado1}"
                                                    converter="#{LogProDenPenObj6.converterEsProcesado1}"
                                                    disabled="#{LogProDenPenObj6.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogProDenPenObj6.asistente.opcionesListaEsProcesado1}"
                                                    selected="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['es_procesado']}"
                                                    toolTip="BundleParametros.es_procesado.log_pro_den_pen_obj"/>
                                                <webuijsf:staticText id="listaEsProcesado1Texto1"
                                                    binding="#{LogProDenPenObj6.listaEsProcesado1Texto1}"/>
                                                <webuijsf:message id="messageEsProcesado1"
                                                    for="listaEsProcesado1"/>
                                                <webuijsf:helpInline id="helpInlineEsProcesado1"
                                                    binding="#{LogProDenPenObj6.helpInlineEsProcesado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_procesado.log_pro_den_pen_obj"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProDenPenObj6.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"
                                                    toolTip="BundleParametros.observacion.log_pro_den_pen_obj"
                                                    text="observaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogProDenPenObj6.campoObservacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogProDenPenObj6.gestor.filaNoProcesada}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_pro_den_pen_obj"
                                                    validatorExpression="#{LogProDenPenObj6.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogProDenPenObj6.campoObservacion1Texto1}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:helpInline id="helpInlineObservacion1"
                                                    binding="#{LogProDenPenObj6.helpInlineObservacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observacion.log_pro_den_pen_obj"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraTransaccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogProDenPenObj6.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_pro_den_pen_obj"
                                                    text="fecha hora transacci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraTransaccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogProDenPenObj6.campoFechaHoraTransaccion1}"
                                                    converter="#{LogProDenPenObj6.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogProDenPenObj6.gestor.filaNoProcesada}" required="true"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_pro_den_pen_obj"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogProDenPenObj6.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogProDenPenObj6.converterFechaHoraTransaccion1}"
                                                    text="#{LogProDenPenObj6.logProDenPenObjDataProvider.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraTransaccion1"
                                                    binding="#{LogProDenPenObj6.helpInlineFechaHoraTransaccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_transaccion.log_pro_den_pen_obj"
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
                                                        actionExpression="#{LogProDenPenObj6.botonIrAlPrimero2_action}"
                                                        binding="#{LogProDenPenObj6.botonIrAlPrimero2}"
                                                        disabled="#{LogProDenPenObj6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{LogProDenPenObj6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogProDenPenObj6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogProDenPenObj6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProDenPenObj6.botonIrAlAnterior2_action}"
                                                        binding="#{LogProDenPenObj6.botonIrAlAnterior2}"
                                                        disabled="#{LogProDenPenObj6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{LogProDenPenObj6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogProDenPenObj6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogProDenPenObj6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProDenPenObj6.botonIrAlSiguiente2_action}"
                                                        binding="#{LogProDenPenObj6.botonIrAlSiguiente2}"
                                                        disabled="#{LogProDenPenObj6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{LogProDenPenObj6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogProDenPenObj6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogProDenPenObj6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProDenPenObj6.botonIrAlUltimo2_action}"
                                                        binding="#{LogProDenPenObj6.botonIrAlUltimo2}"
                                                        disabled="#{LogProDenPenObj6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{LogProDenPenObj6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogProDenPenObj6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogProDenPenObj6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogProDenPenObj6.botonProcesarFila2_action}"
                                                        binding="#{LogProDenPenObj6.botonProcesarFila2}"
                                                        disabled="#{LogProDenPenObj6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{LogProDenPenObj6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogProDenPenObj6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{LogProDenPenObj6.asistente.comandoDisponible}"
                                                        text="#{LogProDenPenObj6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogProDenPenObj6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{LogProDenPenObj6.botonAgregar1_action}"
                                                    binding="#{LogProDenPenObj6.botonAgregar1}"
                                                    disabled="#{LogProDenPenObj6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogProDenPenObj6.gestor.scriptAgregar}"
                                                    rendered="#{LogProDenPenObj6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProDenPenObj6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogProDenPenObj6.listaFuncionEdicion1}"
                                                    converter="#{LogProDenPenObj6.converterListaFuncionEdicion1}"
                                                    disabled="#{LogProDenPenObj6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogProDenPenObj6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogProDenPenObj6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogProDenPenObj6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProDenPenObj6.botonEditar1_action}"
                                                    binding="#{LogProDenPenObj6.botonEditar1}"
                                                    disabled="#{LogProDenPenObj6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogProDenPenObj6.gestor.scriptEditar}"
                                                    rendered="#{LogProDenPenObj6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProDenPenObj6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogProDenPenObj6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProDenPenObj6.botonEliminar1_action}"
                                                    binding="#{LogProDenPenObj6.botonEliminar1}"
                                                    disabled="#{LogProDenPenObj6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogProDenPenObj6.gestor.scriptEliminar}"
                                                    rendered="#{LogProDenPenObj6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProDenPenObj6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProDenPenObj6.botonAplicar1_action}"
                                                    binding="#{LogProDenPenObj6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogProDenPenObj6.gestor.scriptAplicar}"
                                                    rendered="#{LogProDenPenObj6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProDenPenObj6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProDenPenObj6.botonDeshacer1_action}"
                                                    binding="#{LogProDenPenObj6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogProDenPenObj6.gestor.scriptDeshacer}"
                                                    rendered="#{LogProDenPenObj6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProDenPenObj6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProDenPenObj6.botonConfirmar1_action}"
                                                    binding="#{LogProDenPenObj6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogProDenPenObj6.gestor.scriptConfirmar}"
                                                    rendered="#{LogProDenPenObj6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProDenPenObj6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProDenPenObj6.botonDescartar1_action}"
                                                    binding="#{LogProDenPenObj6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogProDenPenObj6.gestor.scriptDescartar}"
                                                    rendered="#{LogProDenPenObj6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProDenPenObj6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogProDenPenObj6.listaFuncionAccion1}"
                                                    converter="#{LogProDenPenObj6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogProDenPenObj6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogProDenPenObj6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogProDenPenObj6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProDenPenObj6.botonProcesar1_action}"
                                                    binding="#{LogProDenPenObj6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogProDenPenObj6.gestor.scriptProcesar}"
                                                    rendered="#{LogProDenPenObj6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProDenPenObj6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProDenPenObj6.botonRefrescar1_action}"
                                                    binding="#{LogProDenPenObj6.botonRefrescar1}"
                                                    disabled="#{LogProDenPenObj6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogProDenPenObj6.gestor.scriptRefrescar}"
                                                    rendered="#{LogProDenPenObj6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProDenPenObj6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProDenPenObj6.botonReconsultar1_action}"
                                                    binding="#{LogProDenPenObj6.botonReconsultar1}"
                                                    disabled="#{LogProDenPenObj6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogProDenPenObj6.gestor.scriptReconsultar}"
                                                    rendered="#{LogProDenPenObj6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProDenPenObj6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogProDenPenObj6.botonRetornar1_action}"
                                                    binding="#{LogProDenPenObj6.botonRetornar1}"
                                                    disabled="#{LogProDenPenObj6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogProDenPenObj6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogProDenPenObj6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogProDenPenObj6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogProDenPenObj6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{LogProDenPenObj6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogProDenPenObj6.imageHyperlink1_action}"
                                                    binding="#{LogProDenPenObj6.imageHyperlink1}"
                                                    disabled="#{LogProDenPenObj6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogProDenPenObj6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogProDenPenObj6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogProDenPenObj6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogProDenPenObj6_imageHyperlink1_toolTip}"/>
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
