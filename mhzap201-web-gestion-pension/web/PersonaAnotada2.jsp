<?xml version="1.0" encoding="UTF-8"?>
<!--
   Copyright (C) 2009, EGT Consultores, C.A.
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
                    focus="#{PersonaAnotada2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{PersonaAnotada2.gestor.preserveFocus}"
                    preserveScroll="#{PersonaAnotada2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{PersonaAnotada2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdPersonaAnotada1 campoIdPersona1 campoCodigoPersona1 campoNombrePersona1 campoIdUsuario1 campoCodigoUsuario1 campoNombreUsuario1 campoFechaHoraSeleccion1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{PersonaAnotada2.breadcrumbs1}" 
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
                                                    rendered="#{PersonaAnotada2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{PersonaAnotada2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{PersonaAnotada2.gestor.mensajeDisponible}"
                                                    text="#{PersonaAnotada2.gestor.mensaje}"
                                                    url="#{PersonaAnotada2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{PersonaAnotada2.gestor.filaDisponible}"
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
                                                        actionExpression="#{PersonaAnotada2.botonIrAlPrimero1_action}"
                                                        binding="#{PersonaAnotada2.botonIrAlPrimero1}"
                                                        disabled="#{PersonaAnotada2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{PersonaAnotada2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{PersonaAnotada2.gestor.scriptIrAlPrimero}"
                                                        text="#{PersonaAnotada2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PersonaAnotada2.botonIrAlAnterior1_action}"
                                                        binding="#{PersonaAnotada2.botonIrAlAnterior1}"
                                                        disabled="#{PersonaAnotada2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{PersonaAnotada2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{PersonaAnotada2.gestor.scriptIrAlAnterior}"
                                                        text="#{PersonaAnotada2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PersonaAnotada2.botonIrAlSiguiente1_action}"
                                                        binding="#{PersonaAnotada2.botonIrAlSiguiente1}"
                                                        disabled="#{PersonaAnotada2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{PersonaAnotada2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{PersonaAnotada2.gestor.scriptIrAlSiguiente}"
                                                        text="#{PersonaAnotada2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PersonaAnotada2.botonIrAlUltimo1_action}"
                                                        binding="#{PersonaAnotada2.botonIrAlUltimo1}"
                                                        disabled="#{PersonaAnotada2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{PersonaAnotada2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{PersonaAnotada2.gestor.scriptIrAlUltimo}"
                                                        text="#{PersonaAnotada2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PersonaAnotada2.botonProcesarFila1_action}"
                                                        binding="#{PersonaAnotada2.botonProcesarFila1}"
                                                        disabled="#{PersonaAnotada2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{PersonaAnotada2.gestor.urlImagenProcesar}"
                                                        onClick="#{PersonaAnotada2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{PersonaAnotada2.asistente.comandoDisponible}"
                                                        text="#{PersonaAnotada2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{PersonaAnotada2.gestor.tituloConsulta}"/>
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
                                                    binding="#{PersonaAnotada2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{PersonaAnotada2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{PersonaAnotada2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{PersonaAnotada2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{PersonaAnotada2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{PersonaAnotada2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{PersonaAnotada2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{PersonaAnotada2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{PersonaAnotada2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{PersonaAnotada2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersonaAnotada1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada2.labelIdPersonaAnotada1}"
                                                    id="labelIdPersonaAnotada1"
                                                    for="campoIdPersonaAnotada1"
                                                    toolTip="BundleParametros.id_persona_anotada.persona_anotada"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersonaAnotada2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPersonaAnotada1"
                                                    binding="#{PersonaAnotada2.campoIdPersonaAnotada1}"
                                                    converter="#{PersonaAnotada2.converterIdPersonaAnotada1}"
                                                    readOnly="true"
                                                    text="#{PersonaAnotada2.personaAnotadaDataProvider.value['id_persona_anotada']}"
                                                    toolTip="BundleParametros.id_persona_anotada.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada2.validatorIdPersonaAnotada1.validate}"/>
                                                <webuijsf:staticText id="campoIdPersonaAnotada1Texto1"
                                                    binding="#{PersonaAnotada2.campoIdPersonaAnotada1Texto1}"
                                                    text="#{PersonaAnotada2.personaAnotadaDataProvider.value['id_persona_anotada']}"/>
                                                <webuijsf:message id="messageIdPersonaAnotada1"
                                                    for="campoIdPersonaAnotada1"/>
                                                <webuijsf:helpInline id="helpInlineIdPersonaAnotada1"
                                                    binding="#{PersonaAnotada2.helpInlineIdPersonaAnotada1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_persona_anotada.persona_anotada"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada2.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"
                                                    toolTip="BundleParametros.id_persona.persona_anotada"
                                                    text="identificaci&#243;n persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{PersonaAnotada2.campoIdPersona1}"
                                                    converter="#{PersonaAnotada2.converterIdPersona1}"
                                                    readOnly="true"
                                                    text="#{PersonaAnotada2.personaAnotadaDataProvider.value['id_persona']}"
                                                    toolTip="BundleParametros.id_persona.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada2.validatorIdPersona1.validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{PersonaAnotada2.campoIdPersona1Texto1}"
                                                    text="#{PersonaAnotada2.personaAnotadaDataProvider.value['id_persona']}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdPersona1"
                                                    binding="#{PersonaAnotada2.helpInlineIdPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_persona.persona_anotada"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada2.labelCodigoPersona1}"
                                                    id="labelCodigoPersona1"
                                                    for="campoCodigoPersona1"
                                                    toolTip="BundleParametros.codigo_persona.persona_anotada"
                                                    text="c&#243;digo persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoPersona1"
                                                    binding="#{PersonaAnotada2.campoCodigoPersona1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{PersonaAnotada2.personaAnotadaDataProvider.value['codigo_persona']}"
                                                    toolTip="BundleParametros.codigo_persona.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada2.validatorCodigoPersona1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPersona1Texto1"
                                                    binding="#{PersonaAnotada2.campoCodigoPersona1Texto1}"
                                                    text="#{PersonaAnotada2.personaAnotadaDataProvider.value['codigo_persona']}"/>
                                                <webuijsf:message id="messageCodigoPersona1"
                                                    for="campoCodigoPersona1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoPersona1"
                                                    binding="#{PersonaAnotada2.helpInlineCodigoPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_persona.persona_anotada"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombrePersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada2.labelNombrePersona1}"
                                                    id="labelNombrePersona1"
                                                    for="campoNombrePersona1"
                                                    toolTip="BundleParametros.nombre_persona.persona_anotada"
                                                    text="nombre persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombrePersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombrePersona1"
                                                    binding="#{PersonaAnotada2.campoNombrePersona1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{PersonaAnotada2.personaAnotadaDataProvider.value['nombre_persona']}"
                                                    toolTip="BundleParametros.nombre_persona.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada2.validatorNombrePersona1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePersona1Texto1"
                                                    binding="#{PersonaAnotada2.campoNombrePersona1Texto1}"
                                                    text="#{PersonaAnotada2.personaAnotadaDataProvider.value['nombre_persona']}"/>
                                                <webuijsf:message id="messageNombrePersona1"
                                                    for="campoNombrePersona1"/>
                                                <webuijsf:helpInline id="helpInlineNombrePersona1"
                                                    binding="#{PersonaAnotada2.helpInlineNombrePersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_persona.persona_anotada"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuario1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada2.labelIdUsuario1}"
                                                    id="labelIdUsuario1"
                                                    for="campoIdUsuario1"
                                                    toolTip="BundleParametros.id_usuario.persona_anotada"
                                                    text="identificaci&#243;n usuario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuario2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdUsuario1"
                                                    binding="#{PersonaAnotada2.campoIdUsuario1}"
                                                    converter="#{PersonaAnotada2.converterIdUsuario1}"
                                                    readOnly="true"
                                                    text="#{PersonaAnotada2.personaAnotadaDataProvider.value['id_usuario']}"
                                                    toolTip="BundleParametros.id_usuario.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada2.validatorIdUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoIdUsuario1Texto1"
                                                    binding="#{PersonaAnotada2.campoIdUsuario1Texto1}"
                                                    text="#{PersonaAnotada2.personaAnotadaDataProvider.value['id_usuario']}"/>
                                                <webuijsf:message id="messageIdUsuario1"
                                                    for="campoIdUsuario1"/>
                                                <webuijsf:helpInline id="helpInlineIdUsuario1"
                                                    binding="#{PersonaAnotada2.helpInlineIdUsuario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_usuario.persona_anotada"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoUsuario1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada2.labelCodigoUsuario1}"
                                                    id="labelCodigoUsuario1"
                                                    for="campoCodigoUsuario1"
                                                    toolTip="BundleParametros.codigo_usuario.persona_anotada"
                                                    text="c&#243;digo usuario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoUsuario2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoUsuario1"
                                                    binding="#{PersonaAnotada2.campoCodigoUsuario1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{PersonaAnotada2.personaAnotadaDataProvider.value['codigo_usuario']}"
                                                    toolTip="BundleParametros.codigo_usuario.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada2.validatorCodigoUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoUsuario1Texto1"
                                                    binding="#{PersonaAnotada2.campoCodigoUsuario1Texto1}"
                                                    text="#{PersonaAnotada2.personaAnotadaDataProvider.value['codigo_usuario']}"/>
                                                <webuijsf:message id="messageCodigoUsuario1"
                                                    for="campoCodigoUsuario1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoUsuario1"
                                                    binding="#{PersonaAnotada2.helpInlineCodigoUsuario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_usuario.persona_anotada"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreUsuario1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada2.labelNombreUsuario1}"
                                                    id="labelNombreUsuario1"
                                                    for="campoNombreUsuario1"
                                                    toolTip="BundleParametros.nombre_usuario.persona_anotada"
                                                    text="nombre usuario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreUsuario2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreUsuario1"
                                                    binding="#{PersonaAnotada2.campoNombreUsuario1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{PersonaAnotada2.personaAnotadaDataProvider.value['nombre_usuario']}"
                                                    toolTip="BundleParametros.nombre_usuario.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada2.validatorNombreUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoNombreUsuario1Texto1"
                                                    binding="#{PersonaAnotada2.campoNombreUsuario1Texto1}"
                                                    text="#{PersonaAnotada2.personaAnotadaDataProvider.value['nombre_usuario']}"/>
                                                <webuijsf:message id="messageNombreUsuario1"
                                                    for="campoNombreUsuario1"/>
                                                <webuijsf:helpInline id="helpInlineNombreUsuario1"
                                                    binding="#{PersonaAnotada2.helpInlineNombreUsuario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_usuario.persona_anotada"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraSeleccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada2.labelFechaHoraSeleccion1}"
                                                    id="labelFechaHoraSeleccion1"
                                                    for="campoFechaHoraSeleccion1"
                                                    toolTip="BundleParametros.fecha_hora_seleccion.persona_anotada"
                                                    text="fecha hora selecci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraSeleccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraSeleccion1"
                                                    binding="#{PersonaAnotada2.campoFechaHoraSeleccion1}"
                                                    converter="#{PersonaAnotada2.converterFechaHoraSeleccion1}"
                                                    readOnly="true"
                                                    text="#{PersonaAnotada2.personaAnotadaDataProvider.value['fecha_hora_seleccion']}"
                                                    toolTip="BundleParametros.fecha_hora_seleccion.persona_anotada"/>
                                                <webuijsf:staticText id="campoFechaHoraSeleccion1Texto1"
                                                    binding="#{PersonaAnotada2.campoFechaHoraSeleccion1Texto1}"
                                                    converter="#{PersonaAnotada2.converterFechaHoraSeleccion1}"
                                                    text="#{PersonaAnotada2.personaAnotadaDataProvider.value['fecha_hora_seleccion']}"/>
                                                <webuijsf:message id="messageFechaHoraSeleccion1"
                                                    for="campoFechaHoraSeleccion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraSeleccion1"
                                                    binding="#{PersonaAnotada2.helpInlineFechaHoraSeleccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_seleccion.persona_anotada"
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
                                                        actionExpression="#{PersonaAnotada2.botonIrAlPrimero2_action}"
                                                        binding="#{PersonaAnotada2.botonIrAlPrimero2}"
                                                        disabled="#{PersonaAnotada2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{PersonaAnotada2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{PersonaAnotada2.gestor.scriptIrAlPrimero}"
                                                        text="#{PersonaAnotada2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PersonaAnotada2.botonIrAlAnterior2_action}"
                                                        binding="#{PersonaAnotada2.botonIrAlAnterior2}"
                                                        disabled="#{PersonaAnotada2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{PersonaAnotada2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{PersonaAnotada2.gestor.scriptIrAlAnterior}"
                                                        text="#{PersonaAnotada2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PersonaAnotada2.botonIrAlSiguiente2_action}"
                                                        binding="#{PersonaAnotada2.botonIrAlSiguiente2}"
                                                        disabled="#{PersonaAnotada2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{PersonaAnotada2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{PersonaAnotada2.gestor.scriptIrAlSiguiente}"
                                                        text="#{PersonaAnotada2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PersonaAnotada2.botonIrAlUltimo2_action}"
                                                        binding="#{PersonaAnotada2.botonIrAlUltimo2}"
                                                        disabled="#{PersonaAnotada2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{PersonaAnotada2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{PersonaAnotada2.gestor.scriptIrAlUltimo}"
                                                        text="#{PersonaAnotada2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PersonaAnotada2.botonProcesarFila2_action}"
                                                        binding="#{PersonaAnotada2.botonProcesarFila2}"
                                                        disabled="#{PersonaAnotada2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{PersonaAnotada2.gestor.urlImagenProcesar}"
                                                        onClick="#{PersonaAnotada2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{PersonaAnotada2.asistente.comandoDisponible}"
                                                        text="#{PersonaAnotada2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{PersonaAnotada2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{PersonaAnotada2.botonAgregar1_action}"
                                                    binding="#{PersonaAnotada2.botonAgregar1}"
                                                    disabled="#{PersonaAnotada2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{PersonaAnotada2.gestor.scriptAgregar}"
                                                    rendered="#{PersonaAnotada2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{PersonaAnotada2.listaFuncionEdicion1}"
                                                    converter="#{PersonaAnotada2.converterListaFuncionEdicion1}"
                                                    disabled="#{PersonaAnotada2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{PersonaAnotada2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{PersonaAnotada2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{PersonaAnotada2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{PersonaAnotada2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada2.botonEditar1_action}"
                                                    binding="#{PersonaAnotada2.botonEditar1}"
                                                    disabled="#{PersonaAnotada2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{PersonaAnotada2.gestor.scriptEditar}"
                                                    rendered="#{PersonaAnotada2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{PersonaAnotada2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada2.botonEliminar1_action}"
                                                    binding="#{PersonaAnotada2.botonEliminar1}"
                                                    disabled="#{PersonaAnotada2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{PersonaAnotada2.gestor.scriptEliminar}"
                                                    rendered="#{PersonaAnotada2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada2.botonAplicar1_action}"
                                                    binding="#{PersonaAnotada2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{PersonaAnotada2.gestor.scriptAplicar}"
                                                    rendered="#{PersonaAnotada2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada2.botonDeshacer1_action}"
                                                    binding="#{PersonaAnotada2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{PersonaAnotada2.gestor.scriptDeshacer}"
                                                    rendered="#{PersonaAnotada2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada2.botonConfirmar1_action}"
                                                    binding="#{PersonaAnotada2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{PersonaAnotada2.gestor.scriptConfirmar}"
                                                    rendered="#{PersonaAnotada2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada2.botonDescartar1_action}"
                                                    binding="#{PersonaAnotada2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{PersonaAnotada2.gestor.scriptDescartar}"
                                                    rendered="#{PersonaAnotada2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{PersonaAnotada2.listaFuncionAccion1}"
                                                    converter="#{PersonaAnotada2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{PersonaAnotada2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{PersonaAnotada2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{PersonaAnotada2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{PersonaAnotada2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada2.botonProcesar1_action}"
                                                    binding="#{PersonaAnotada2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{PersonaAnotada2.gestor.scriptProcesar}"
                                                    rendered="#{PersonaAnotada2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada2.botonRefrescar1_action}"
                                                    binding="#{PersonaAnotada2.botonRefrescar1}"
                                                    disabled="#{PersonaAnotada2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{PersonaAnotada2.gestor.scriptRefrescar}"
                                                    rendered="#{PersonaAnotada2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada2.botonReconsultar1_action}"
                                                    binding="#{PersonaAnotada2.botonReconsultar1}"
                                                    disabled="#{PersonaAnotada2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{PersonaAnotada2.gestor.scriptReconsultar}"
                                                    rendered="#{PersonaAnotada2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada2.botonRetornar1_action}"
                                                    binding="#{PersonaAnotada2.botonRetornar1}"
                                                    disabled="#{PersonaAnotada2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{PersonaAnotada2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{PersonaAnotada2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{PersonaAnotada2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{PersonaAnotada2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{PersonaAnotada2.imageHyperlink1_action}"
                                                    binding="#{PersonaAnotada2.imageHyperlink1}"
                                                    disabled="#{PersonaAnotada2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{PersonaAnotada2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{PersonaAnotada2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{PersonaAnotada2.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.PersonaAnotada2_imageHyperlink1_toolTip}"/>
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
