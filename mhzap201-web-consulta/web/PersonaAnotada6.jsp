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
                    focus="#{PersonaAnotada6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{PersonaAnotada6.gestor.preserveFocus}"
                    preserveScroll="#{PersonaAnotada6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{PersonaAnotada6.form1}" 
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
                                        binding="#{PersonaAnotada6.breadcrumbs1}" 
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
                                                    rendered="#{PersonaAnotada6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{PersonaAnotada6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{PersonaAnotada6.gestor.mensajeDisponible}"
                                                    text="#{PersonaAnotada6.gestor.mensaje}"
                                                    url="#{PersonaAnotada6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{PersonaAnotada6.gestor.filaDisponible}"
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
                                                        actionExpression="#{PersonaAnotada6.botonIrAlPrimero1_action}"
                                                        binding="#{PersonaAnotada6.botonIrAlPrimero1}"
                                                        disabled="#{PersonaAnotada6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{PersonaAnotada6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{PersonaAnotada6.gestor.scriptIrAlPrimero}"
                                                        text="#{PersonaAnotada6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PersonaAnotada6.botonIrAlAnterior1_action}"
                                                        binding="#{PersonaAnotada6.botonIrAlAnterior1}"
                                                        disabled="#{PersonaAnotada6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{PersonaAnotada6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{PersonaAnotada6.gestor.scriptIrAlAnterior}"
                                                        text="#{PersonaAnotada6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PersonaAnotada6.botonIrAlSiguiente1_action}"
                                                        binding="#{PersonaAnotada6.botonIrAlSiguiente1}"
                                                        disabled="#{PersonaAnotada6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{PersonaAnotada6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{PersonaAnotada6.gestor.scriptIrAlSiguiente}"
                                                        text="#{PersonaAnotada6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PersonaAnotada6.botonIrAlUltimo1_action}"
                                                        binding="#{PersonaAnotada6.botonIrAlUltimo1}"
                                                        disabled="#{PersonaAnotada6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{PersonaAnotada6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{PersonaAnotada6.gestor.scriptIrAlUltimo}"
                                                        text="#{PersonaAnotada6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PersonaAnotada6.botonProcesarFila1_action}"
                                                        binding="#{PersonaAnotada6.botonProcesarFila1}"
                                                        disabled="#{PersonaAnotada6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{PersonaAnotada6.gestor.urlImagenProcesar}"
                                                        onClick="#{PersonaAnotada6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{PersonaAnotada6.asistente.comandoDisponible}"
                                                        text="#{PersonaAnotada6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{PersonaAnotada6.gestor.tituloConsulta}"/>
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
                                                    binding="#{PersonaAnotada6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{PersonaAnotada6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{PersonaAnotada6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{PersonaAnotada6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{PersonaAnotada6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{PersonaAnotada6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{PersonaAnotada6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{PersonaAnotada6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{PersonaAnotada6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{PersonaAnotada6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersonaAnotada1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada6.labelIdPersonaAnotada1}"
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
                                                    binding="#{PersonaAnotada6.campoIdPersonaAnotada1}"
                                                    converter="#{PersonaAnotada6.converterIdPersonaAnotada1}"
                                                    readOnly="true"
                                                    text="#{PersonaAnotada6.personaAnotadaDataProvider.value['id_persona_anotada']}"
                                                    toolTip="BundleParametros.id_persona_anotada.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada6.validatorIdPersonaAnotada1.validate}"/>
                                                <webuijsf:staticText id="campoIdPersonaAnotada1Texto1"
                                                    binding="#{PersonaAnotada6.campoIdPersonaAnotada1Texto1}"
                                                    text="#{PersonaAnotada6.personaAnotadaDataProvider.value['id_persona_anotada']}"/>
                                                <webuijsf:message id="messageIdPersonaAnotada1"
                                                    for="campoIdPersonaAnotada1"/>
                                                <webuijsf:helpInline id="helpInlineIdPersonaAnotada1"
                                                    binding="#{PersonaAnotada6.helpInlineIdPersonaAnotada1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_persona_anotada.persona_anotada"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada6.labelIdPersona1}"
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
                                                    binding="#{PersonaAnotada6.campoIdPersona1}"
                                                    converter="#{PersonaAnotada6.converterIdPersona1}"
                                                    readOnly="true"
                                                    text="#{PersonaAnotada6.personaAnotadaDataProvider.value['id_persona']}"
                                                    toolTip="BundleParametros.id_persona.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada6.validatorIdPersona1.validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{PersonaAnotada6.campoIdPersona1Texto1}"
                                                    text="#{PersonaAnotada6.personaAnotadaDataProvider.value['id_persona']}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdPersona1"
                                                    binding="#{PersonaAnotada6.helpInlineIdPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_persona.persona_anotada"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada6.labelCodigoPersona1}"
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
                                                    binding="#{PersonaAnotada6.campoCodigoPersona1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{PersonaAnotada6.personaAnotadaDataProvider.value['codigo_persona']}"
                                                    toolTip="BundleParametros.codigo_persona.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada6.validatorCodigoPersona1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPersona1Texto1"
                                                    binding="#{PersonaAnotada6.campoCodigoPersona1Texto1}"
                                                    text="#{PersonaAnotada6.personaAnotadaDataProvider.value['codigo_persona']}"/>
                                                <webuijsf:message id="messageCodigoPersona1"
                                                    for="campoCodigoPersona1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoPersona1"
                                                    binding="#{PersonaAnotada6.helpInlineCodigoPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_persona.persona_anotada"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombrePersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada6.labelNombrePersona1}"
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
                                                    binding="#{PersonaAnotada6.campoNombrePersona1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{PersonaAnotada6.personaAnotadaDataProvider.value['nombre_persona']}"
                                                    toolTip="BundleParametros.nombre_persona.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada6.validatorNombrePersona1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePersona1Texto1"
                                                    binding="#{PersonaAnotada6.campoNombrePersona1Texto1}"
                                                    text="#{PersonaAnotada6.personaAnotadaDataProvider.value['nombre_persona']}"/>
                                                <webuijsf:message id="messageNombrePersona1"
                                                    for="campoNombrePersona1"/>
                                                <webuijsf:helpInline id="helpInlineNombrePersona1"
                                                    binding="#{PersonaAnotada6.helpInlineNombrePersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_persona.persona_anotada"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuario1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada6.labelIdUsuario1}"
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
                                                    binding="#{PersonaAnotada6.campoIdUsuario1}"
                                                    converter="#{PersonaAnotada6.converterIdUsuario1}"
                                                    readOnly="true"
                                                    text="#{PersonaAnotada6.personaAnotadaDataProvider.value['id_usuario']}"
                                                    toolTip="BundleParametros.id_usuario.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada6.validatorIdUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoIdUsuario1Texto1"
                                                    binding="#{PersonaAnotada6.campoIdUsuario1Texto1}"
                                                    text="#{PersonaAnotada6.personaAnotadaDataProvider.value['id_usuario']}"/>
                                                <webuijsf:message id="messageIdUsuario1"
                                                    for="campoIdUsuario1"/>
                                                <webuijsf:helpInline id="helpInlineIdUsuario1"
                                                    binding="#{PersonaAnotada6.helpInlineIdUsuario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_usuario.persona_anotada"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoUsuario1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada6.labelCodigoUsuario1}"
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
                                                    binding="#{PersonaAnotada6.campoCodigoUsuario1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{PersonaAnotada6.personaAnotadaDataProvider.value['codigo_usuario']}"
                                                    toolTip="BundleParametros.codigo_usuario.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada6.validatorCodigoUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoUsuario1Texto1"
                                                    binding="#{PersonaAnotada6.campoCodigoUsuario1Texto1}"
                                                    text="#{PersonaAnotada6.personaAnotadaDataProvider.value['codigo_usuario']}"/>
                                                <webuijsf:message id="messageCodigoUsuario1"
                                                    for="campoCodigoUsuario1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoUsuario1"
                                                    binding="#{PersonaAnotada6.helpInlineCodigoUsuario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_usuario.persona_anotada"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreUsuario1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada6.labelNombreUsuario1}"
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
                                                    binding="#{PersonaAnotada6.campoNombreUsuario1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{PersonaAnotada6.personaAnotadaDataProvider.value['nombre_usuario']}"
                                                    toolTip="BundleParametros.nombre_usuario.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada6.validatorNombreUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoNombreUsuario1Texto1"
                                                    binding="#{PersonaAnotada6.campoNombreUsuario1Texto1}"
                                                    text="#{PersonaAnotada6.personaAnotadaDataProvider.value['nombre_usuario']}"/>
                                                <webuijsf:message id="messageNombreUsuario1"
                                                    for="campoNombreUsuario1"/>
                                                <webuijsf:helpInline id="helpInlineNombreUsuario1"
                                                    binding="#{PersonaAnotada6.helpInlineNombreUsuario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_usuario.persona_anotada"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraSeleccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada6.labelFechaHoraSeleccion1}"
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
                                                    binding="#{PersonaAnotada6.campoFechaHoraSeleccion1}"
                                                    converter="#{PersonaAnotada6.converterFechaHoraSeleccion1}"
                                                    readOnly="true"
                                                    text="#{PersonaAnotada6.personaAnotadaDataProvider.value['fecha_hora_seleccion']}"
                                                    toolTip="BundleParametros.fecha_hora_seleccion.persona_anotada"/>
                                                <webuijsf:staticText id="campoFechaHoraSeleccion1Texto1"
                                                    binding="#{PersonaAnotada6.campoFechaHoraSeleccion1Texto1}"
                                                    converter="#{PersonaAnotada6.converterFechaHoraSeleccion1}"
                                                    text="#{PersonaAnotada6.personaAnotadaDataProvider.value['fecha_hora_seleccion']}"/>
                                                <webuijsf:message id="messageFechaHoraSeleccion1"
                                                    for="campoFechaHoraSeleccion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraSeleccion1"
                                                    binding="#{PersonaAnotada6.helpInlineFechaHoraSeleccion1}"
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
                                                        actionExpression="#{PersonaAnotada6.botonIrAlPrimero2_action}"
                                                        binding="#{PersonaAnotada6.botonIrAlPrimero2}"
                                                        disabled="#{PersonaAnotada6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{PersonaAnotada6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{PersonaAnotada6.gestor.scriptIrAlPrimero}"
                                                        text="#{PersonaAnotada6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PersonaAnotada6.botonIrAlAnterior2_action}"
                                                        binding="#{PersonaAnotada6.botonIrAlAnterior2}"
                                                        disabled="#{PersonaAnotada6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{PersonaAnotada6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{PersonaAnotada6.gestor.scriptIrAlAnterior}"
                                                        text="#{PersonaAnotada6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PersonaAnotada6.botonIrAlSiguiente2_action}"
                                                        binding="#{PersonaAnotada6.botonIrAlSiguiente2}"
                                                        disabled="#{PersonaAnotada6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{PersonaAnotada6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{PersonaAnotada6.gestor.scriptIrAlSiguiente}"
                                                        text="#{PersonaAnotada6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PersonaAnotada6.botonIrAlUltimo2_action}"
                                                        binding="#{PersonaAnotada6.botonIrAlUltimo2}"
                                                        disabled="#{PersonaAnotada6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{PersonaAnotada6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{PersonaAnotada6.gestor.scriptIrAlUltimo}"
                                                        text="#{PersonaAnotada6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PersonaAnotada6.botonProcesarFila2_action}"
                                                        binding="#{PersonaAnotada6.botonProcesarFila2}"
                                                        disabled="#{PersonaAnotada6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{PersonaAnotada6.gestor.urlImagenProcesar}"
                                                        onClick="#{PersonaAnotada6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{PersonaAnotada6.asistente.comandoDisponible}"
                                                        text="#{PersonaAnotada6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{PersonaAnotada6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{PersonaAnotada6.botonAgregar1_action}"
                                                    binding="#{PersonaAnotada6.botonAgregar1}"
                                                    disabled="#{PersonaAnotada6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{PersonaAnotada6.gestor.scriptAgregar}"
                                                    rendered="#{PersonaAnotada6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{PersonaAnotada6.listaFuncionEdicion1}"
                                                    converter="#{PersonaAnotada6.converterListaFuncionEdicion1}"
                                                    disabled="#{PersonaAnotada6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{PersonaAnotada6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{PersonaAnotada6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{PersonaAnotada6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{PersonaAnotada6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada6.botonEditar1_action}"
                                                    binding="#{PersonaAnotada6.botonEditar1}"
                                                    disabled="#{PersonaAnotada6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{PersonaAnotada6.gestor.scriptEditar}"
                                                    rendered="#{PersonaAnotada6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{PersonaAnotada6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada6.botonEliminar1_action}"
                                                    binding="#{PersonaAnotada6.botonEliminar1}"
                                                    disabled="#{PersonaAnotada6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{PersonaAnotada6.gestor.scriptEliminar}"
                                                    rendered="#{PersonaAnotada6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada6.botonAplicar1_action}"
                                                    binding="#{PersonaAnotada6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{PersonaAnotada6.gestor.scriptAplicar}"
                                                    rendered="#{PersonaAnotada6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada6.botonDeshacer1_action}"
                                                    binding="#{PersonaAnotada6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{PersonaAnotada6.gestor.scriptDeshacer}"
                                                    rendered="#{PersonaAnotada6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada6.botonConfirmar1_action}"
                                                    binding="#{PersonaAnotada6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{PersonaAnotada6.gestor.scriptConfirmar}"
                                                    rendered="#{PersonaAnotada6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada6.botonDescartar1_action}"
                                                    binding="#{PersonaAnotada6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{PersonaAnotada6.gestor.scriptDescartar}"
                                                    rendered="#{PersonaAnotada6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{PersonaAnotada6.listaFuncionAccion1}"
                                                    converter="#{PersonaAnotada6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{PersonaAnotada6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{PersonaAnotada6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{PersonaAnotada6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{PersonaAnotada6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada6.botonProcesar1_action}"
                                                    binding="#{PersonaAnotada6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{PersonaAnotada6.gestor.scriptProcesar}"
                                                    rendered="#{PersonaAnotada6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada6.botonRefrescar1_action}"
                                                    binding="#{PersonaAnotada6.botonRefrescar1}"
                                                    disabled="#{PersonaAnotada6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{PersonaAnotada6.gestor.scriptRefrescar}"
                                                    rendered="#{PersonaAnotada6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada6.botonReconsultar1_action}"
                                                    binding="#{PersonaAnotada6.botonReconsultar1}"
                                                    disabled="#{PersonaAnotada6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{PersonaAnotada6.gestor.scriptReconsultar}"
                                                    rendered="#{PersonaAnotada6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada6.botonRetornar1_action}"
                                                    binding="#{PersonaAnotada6.botonRetornar1}"
                                                    disabled="#{PersonaAnotada6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{PersonaAnotada6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{PersonaAnotada6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{PersonaAnotada6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{PersonaAnotada6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{PersonaAnotada6.imageHyperlink1_action}"
                                                    binding="#{PersonaAnotada6.imageHyperlink1}"
                                                    disabled="#{PersonaAnotada6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{PersonaAnotada6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{PersonaAnotada6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{PersonaAnotada6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.PersonaAnotada6_imageHyperlink1_toolTip}"/>
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
