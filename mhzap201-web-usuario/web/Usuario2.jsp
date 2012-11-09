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
                    focus="#{Usuario2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Usuario2.gestor.preserveFocus}"
                    preserveScroll="#{Usuario2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form
                        binding="#{Usuario2.form1}"
                        id="form1"
                        virtualFormsConfig="virtualForm1 | campoIdUsuario1 campoCodigoUsuario1 campoNombreUsuario1 campoCorreoElectronico1 campoIdUsuarioSupervisor1 listaEsSuperUsuario1 listaEsUsuarioInactivo1 listaEsUsuarioModificado1 listaEsEjecutivoNegocio1 listaEsAnalistaCredito1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Usuario2.breadcrumbs1}"
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
                                                    rendered="#{Usuario2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Usuario2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Usuario2.gestor.mensajeDisponible}"
                                                    text="#{Usuario2.gestor.mensaje}"
                                                    url="#{Usuario2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{Usuario2.gestor.filaDisponible}"
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
                                                        actionExpression="#{Usuario2.botonIrAlPrimero1_action}"
                                                        binding="#{Usuario2.botonIrAlPrimero1}"
                                                        disabled="#{Usuario2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{Usuario2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Usuario2.gestor.scriptIrAlPrimero}"
                                                        text="#{Usuario2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Usuario2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Usuario2.botonIrAlAnterior1_action}"
                                                        binding="#{Usuario2.botonIrAlAnterior1}"
                                                        disabled="#{Usuario2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{Usuario2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Usuario2.gestor.scriptIrAlAnterior}"
                                                        text="#{Usuario2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Usuario2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Usuario2.botonIrAlSiguiente1_action}"
                                                        binding="#{Usuario2.botonIrAlSiguiente1}"
                                                        disabled="#{Usuario2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{Usuario2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Usuario2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Usuario2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Usuario2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Usuario2.botonIrAlUltimo1_action}"
                                                        binding="#{Usuario2.botonIrAlUltimo1}"
                                                        disabled="#{Usuario2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{Usuario2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Usuario2.gestor.scriptIrAlUltimo}"
                                                        text="#{Usuario2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Usuario2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Usuario2.botonProcesarFila1_action}"
                                                        binding="#{Usuario2.botonProcesarFila1}"
                                                        disabled="#{Usuario2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Usuario2.gestor.urlImagenProcesar}"
                                                        onClick="#{Usuario2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Usuario2.asistente.comandoDisponible}"
                                                        text="#{Usuario2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Usuario2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Usuario2.gestor.tituloConsulta}"/>
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
                                                    binding="#{Usuario2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{Usuario2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Usuario2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{Usuario2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{Usuario2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{Usuario2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{Usuario2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Usuario2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{Usuario2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{Usuario2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{Usuario2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuario1" rendered="false"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Usuario2.labelIdUsuario1}"
                                                    id="labelIdUsuario1"
                                                    for="campoIdUsuario1"
                                                    text="codigo persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuario2" rendered="false"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdUsuario1"
                                                    binding="#{Usuario2.campoIdUsuario1}"
                                                    readOnly="#{Usuario2.gestor.filaNoCreada}" required="true"
                                                    text="#{Usuario2.asistente.textoCampoIdUsuario1}"
                                                    toolTip="#{Usuario2.asistente.toolTipCampoIdUsuario1}"
                                                    validatorExpression="#{Usuario2.campoIdUsuario1_validate}"/>
                                                <webuijsf:staticText id="campoIdUsuario1Texto1"
                                                    binding="#{Usuario2.campoIdUsuario1Texto1}"
                                                    text="#{Usuario2.usuarioDataProvider.value['codigo_persona']}"/>
                                                <webuijsf:button id="campoIdUsuario1Boton1"
                                                    binding="#{Usuario2.campoIdUsuario1Boton1}"
                                                    onClick="#{Usuario2.asistente.scriptCampoIdUsuario1Boton1}"/>
                                                <webuijsf:button id="campoIdUsuario1Boton3"
                                                    binding="#{Usuario2.campoIdUsuario1Boton3}"
                                                    onClick="#{Usuario2.asistente.scriptCampoIdUsuario1Boton2}"
                                                    rendered="#{Usuario2.asistente.campoIdUsuario1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdUsuario1"
                                                    for="campoIdUsuario1"/>
                                                <webuijsf:helpInline id="helpInlineIdUsuario1"
                                                    binding="#{Usuario2.helpInlineIdUsuario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_usuario_supervisor.usuario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuario3"
                                                rendered="false"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Usuario2.labelIdUsuario2}"
                                                    id="labelIdUsuario2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuario4"
                                                rendered="false"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Usuario2.campoIdUsuario1Texto2}"
                                                    text="#{Usuario2.usuarioDataProvider.value['nombre_persona']}"
                                                    id="campoIdUsuario1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Usuario2.campoIdUsuario1Boton2}"
                                                    id="campoIdUsuario1Boton2"
                                                    onClick="#{Usuario2.asistente.scriptCampoIdUsuario1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoUsuario1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Usuario2.labelCodigoUsuario1}"
                                                    id="labelCodigoUsuario1"
                                                    for="campoCodigoUsuario1"
                                                    text="codigo usuario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoUsuario2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoUsuario1"
                                                    binding="#{Usuario2.campoCodigoUsuario1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Usuario2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Usuario2.usuarioDataProvider.value['codigo_usuario']}"
                                                    toolTip="BundleParametros.codigo_usuario.usuario"
                                                    validatorExpression="#{Usuario2.validatorCodigoUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoUsuario1Texto1"
                                                    binding="#{Usuario2.campoCodigoUsuario1Texto1}"
                                                    text="#{Usuario2.usuarioDataProvider.value['codigo_usuario']}"/>
                                                <webuijsf:message id="messageCodigoUsuario1"
                                                    for="campoCodigoUsuario1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoUsuario1"
                                                    binding="#{Usuario2.helpInlineCodigoUsuario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_usuario.usuario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreUsuario1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Usuario2.labelNombreUsuario1}"
                                                    id="labelNombreUsuario1"
                                                    for="campoNombreUsuario1"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreUsuario2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreUsuario1"
                                                    binding="#{Usuario2.campoNombreUsuario1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Usuario2.gestor.filaNoProcesada}"
                                                    text="#{Usuario2.usuarioDataProvider.value['nombre_usuario']}"
                                                    toolTip="BundleParametros.nombre_usuario.usuario"
                                                    validatorExpression="#{Usuario2.validatorNombreUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoNombreUsuario1Texto1"
                                                    binding="#{Usuario2.campoNombreUsuario1Texto1}"
                                                    text="#{Usuario2.usuarioDataProvider.value['nombre_usuario']}"/>
                                                <webuijsf:message id="messageNombreUsuario1"
                                                    for="campoNombreUsuario1"/>
                                                <webuijsf:helpInline id="helpInlineNombreUsuario1"
                                                    binding="#{Usuario2.helpInlineNombreUsuario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_usuario.usuario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCorreoElectronico1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Usuario2.labelCorreoElectronico1}"
                                                    id="labelCorreoElectronico1"
                                                    for="campoCorreoElectronico1"
                                                    text="correo electronico"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCorreoElectronico2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCorreoElectronico1"
                                                    binding="#{Usuario2.campoCorreoElectronico1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Usuario2.gestor.filaNoProcesada}"
                                                    text="#{Usuario2.usuarioDataProvider.value['correo_electronico']}"
                                                    toolTip="BundleParametros.correo_electronico.usuario"
                                                    validatorExpression="#{Usuario2.validatorCorreoElectronico1.validate}"/>
                                                <webuijsf:staticText id="campoCorreoElectronico1Texto1"
                                                    binding="#{Usuario2.campoCorreoElectronico1Texto1}"
                                                    text="#{Usuario2.usuarioDataProvider.value['correo_electronico']}"/>
                                                <webuijsf:message id="messageCorreoElectronico1"
                                                    for="campoCorreoElectronico1"/>
                                                <webuijsf:helpInline id="helpInlineCorreoElectronico1"
                                                    binding="#{Usuario2.helpInlineCorreoElectronico1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.correo_electronico.usuario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuarioSupervisor1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Usuario2.labelIdUsuarioSupervisor1}"
                                                    id="labelIdUsuarioSupervisor1"
                                                    for="campoIdUsuarioSupervisor1"
                                                    text="usuario supervisor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuarioSupervisor2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdUsuarioSupervisor1"
                                                    binding="#{Usuario2.campoIdUsuarioSupervisor1}"
                                                    readOnly="true"
                                                    text="#{Usuario2.asistente.textoCampoIdUsuarioSupervisor1}"
                                                    toolTip="#{Usuario2.asistente.toolTipCampoIdUsuarioSupervisor1}"
                                                    validatorExpression="#{Usuario2.campoIdUsuarioSupervisor1_validate}"/>
                                                <webuijsf:staticText id="campoIdUsuarioSupervisor1Texto1"
                                                    binding="#{Usuario2.campoIdUsuarioSupervisor1Texto1}"
                                                    text="#{Usuario2.usuarioDataProvider.value['codigo_usuario_1x1y3']}"/>
                                                <webuijsf:button id="campoIdUsuarioSupervisor1Boton1"
                                                    binding="#{Usuario2.campoIdUsuarioSupervisor1Boton1}"
                                                    onClick="#{Usuario2.asistente.scriptCampoIdUsuarioSupervisor1Boton1}"/>
                                                <webuijsf:button id="campoIdUsuarioSupervisor1Boton3"
                                                    binding="#{Usuario2.campoIdUsuarioSupervisor1Boton3}"
                                                    onClick="#{Usuario2.asistente.scriptCampoIdUsuarioSupervisor1Boton2}"
                                                    rendered="#{Usuario2.asistente.campoIdUsuarioSupervisor1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdUsuarioSupervisor1"
                                                    for="campoIdUsuarioSupervisor1"/>
                                                <webuijsf:helpInline id="helpInlineIdUsuarioSupervisor1"
                                                    binding="#{Usuario2.helpInlineIdUsuarioSupervisor1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_usuario_supervisor.usuario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuarioSupervisor3"
                                                rendered="#{Usuario2.asistente.campoIdUsuarioSupervisor1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Usuario2.labelIdUsuarioSupervisor2}"
                                                    id="labelIdUsuarioSupervisor2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre usuario supervisor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuarioSupervisor4"
                                                rendered="#{Usuario2.asistente.campoIdUsuarioSupervisor1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Usuario2.campoIdUsuarioSupervisor1Texto2}"
                                                    text="#{Usuario2.usuarioDataProvider.value['nombre_usuario_1x1y4']}"
                                                    id="campoIdUsuarioSupervisor1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Usuario2.campoIdUsuarioSupervisor1Boton2}"
                                                    id="campoIdUsuarioSupervisor1Boton2"
                                                    onClick="#{Usuario2.asistente.scriptCampoIdUsuarioSupervisor1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsSuperUsuario1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Usuario2.labelEsSuperUsuario1}"
                                                    id="labelEsSuperUsuario1"
                                                    for="listaEsSuperUsuario1"
                                                    text="super"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsSuperUsuario2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsSuperUsuario1"
                                                    binding="#{Usuario2.listaEsSuperUsuario1}"
                                                    converter="#{Usuario2.converterEsSuperUsuario1}"
                                                    disabled="true"
                                                    items="#{Usuario2.asistente.opcionesListaEsSuperUsuario1}"
                                                    selected="#{Usuario2.usuarioDataProvider.value['es_super_usuario']}"
                                                    toolTip="BundleParametros.es_super_usuario.usuario"/>
                                                <webuijsf:staticText id="listaEsSuperUsuario1Texto1"
                                                    binding="#{Usuario2.listaEsSuperUsuario1Texto1}"/>
                                                <webuijsf:message id="messageEsSuperUsuario1"
                                                    for="listaEsSuperUsuario1"/>
                                                <webuijsf:helpInline id="helpInlineEsSuperUsuario1"
                                                    binding="#{Usuario2.helpInlineEsSuperUsuario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_super_usuario.usuario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsUsuarioInactivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Usuario2.labelEsUsuarioInactivo1}"
                                                    id="labelEsUsuarioInactivo1"
                                                    for="listaEsUsuarioInactivo1"
                                                    text="inactivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsUsuarioInactivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsUsuarioInactivo1"
                                                    binding="#{Usuario2.listaEsUsuarioInactivo1}"
                                                    converter="#{Usuario2.converterEsUsuarioInactivo1}"
                                                    disabled="true"
                                                    items="#{Usuario2.asistente.opcionesListaEsUsuarioInactivo1}"
                                                    selected="#{Usuario2.usuarioDataProvider.value['es_usuario_inactivo']}"
                                                    toolTip="BundleParametros.es_usuario_inactivo.usuario"/>
                                                <webuijsf:staticText id="listaEsUsuarioInactivo1Texto1"
                                                    binding="#{Usuario2.listaEsUsuarioInactivo1Texto1}"/>
                                                <webuijsf:message id="messageEsUsuarioInactivo1"
                                                    for="listaEsUsuarioInactivo1"/>
                                                <webuijsf:helpInline id="helpInlineEsUsuarioInactivo1"
                                                    binding="#{Usuario2.helpInlineEsUsuarioInactivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_usuario_inactivo.usuario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsUsuarioModificado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Usuario2.labelEsUsuarioModificado1}"
                                                    id="labelEsUsuarioModificado1"
                                                    for="listaEsUsuarioModificado1"
                                                    text="modificado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsUsuarioModificado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsUsuarioModificado1"
                                                    binding="#{Usuario2.listaEsUsuarioModificado1}"
                                                    converter="#{Usuario2.converterEsUsuarioModificado1}"
                                                    disabled="true"
                                                    items="#{Usuario2.asistente.opcionesListaEsUsuarioModificado1}"
                                                    selected="#{Usuario2.usuarioDataProvider.value['es_usuario_modificado']}"
                                                    toolTip="BundleParametros.es_usuario_modificado.usuario"/>
                                                <webuijsf:staticText id="listaEsUsuarioModificado1Texto1"
                                                    binding="#{Usuario2.listaEsUsuarioModificado1Texto1}"/>
                                                <webuijsf:message id="messageEsUsuarioModificado1"
                                                    for="listaEsUsuarioModificado1"/>
                                                <webuijsf:helpInline id="helpInlineEsUsuarioModificado1"
                                                    binding="#{Usuario2.helpInlineEsUsuarioModificado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_usuario_modificado.usuario"
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
                                                        actionExpression="#{Usuario2.botonIrAlPrimero2_action}"
                                                        binding="#{Usuario2.botonIrAlPrimero2}"
                                                        disabled="#{Usuario2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{Usuario2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Usuario2.gestor.scriptIrAlPrimero}"
                                                        text="#{Usuario2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Usuario2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Usuario2.botonIrAlAnterior2_action}"
                                                        binding="#{Usuario2.botonIrAlAnterior2}"
                                                        disabled="#{Usuario2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{Usuario2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Usuario2.gestor.scriptIrAlAnterior}"
                                                        text="#{Usuario2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Usuario2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Usuario2.botonIrAlSiguiente2_action}"
                                                        binding="#{Usuario2.botonIrAlSiguiente2}"
                                                        disabled="#{Usuario2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{Usuario2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Usuario2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Usuario2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Usuario2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Usuario2.botonIrAlUltimo2_action}"
                                                        binding="#{Usuario2.botonIrAlUltimo2}"
                                                        disabled="#{Usuario2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{Usuario2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Usuario2.gestor.scriptIrAlUltimo}"
                                                        text="#{Usuario2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Usuario2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Usuario2.botonProcesarFila2_action}"
                                                        binding="#{Usuario2.botonProcesarFila2}"
                                                        disabled="#{Usuario2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{Usuario2.gestor.urlImagenProcesar}"
                                                        onClick="#{Usuario2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{Usuario2.asistente.comandoDisponible}"
                                                        text="#{Usuario2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Usuario2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Usuario2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{Usuario2.botonAgregar1_action}"
                                                    binding="#{Usuario2.botonAgregar1}"
                                                    disabled="#{Usuario2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Usuario2.gestor.scriptAgregar}"
                                                    rendered="#{Usuario2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Usuario2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Usuario2.listaFuncionEdicion1}"
                                                    converter="#{Usuario2.converterListaFuncionEdicion1}"
                                                    disabled="#{Usuario2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Usuario2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Usuario2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Usuario2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Usuario2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario2.botonEditar1_action}"
                                                    binding="#{Usuario2.botonEditar1}"
                                                    disabled="#{Usuario2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Usuario2.gestor.scriptEditar}"
                                                    rendered="#{Usuario2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Usuario2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario2.botonEliminar1_action}"
                                                    binding="#{Usuario2.botonEliminar1}"
                                                    disabled="#{Usuario2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Usuario2.gestor.scriptEliminar}"
                                                    rendered="#{Usuario2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Usuario2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario2.botonAplicar1_action}"
                                                    binding="#{Usuario2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Usuario2.gestor.scriptAplicar}"
                                                    rendered="#{Usuario2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Usuario2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario2.botonDeshacer1_action}"
                                                    binding="#{Usuario2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Usuario2.gestor.scriptDeshacer}"
                                                    rendered="#{Usuario2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Usuario2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario2.botonConfirmar1_action}"
                                                    binding="#{Usuario2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Usuario2.gestor.scriptConfirmar}"
                                                    rendered="#{Usuario2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Usuario2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario2.botonDescartar1_action}"
                                                    binding="#{Usuario2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Usuario2.gestor.scriptDescartar}"
                                                    rendered="#{Usuario2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Usuario2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Usuario2.listaFuncionAccion1}"
                                                    converter="#{Usuario2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Usuario2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Usuario2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Usuario2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Usuario2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario2.botonProcesar1_action}"
                                                    binding="#{Usuario2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Usuario2.gestor.scriptProcesar}"
                                                    rendered="#{Usuario2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Usuario2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario2.botonRefrescar1_action}"
                                                    binding="#{Usuario2.botonRefrescar1}"
                                                    disabled="#{Usuario2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Usuario2.gestor.scriptRefrescar}"
                                                    rendered="#{Usuario2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Usuario2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario2.botonReconsultar1_action}"
                                                    binding="#{Usuario2.botonReconsultar1}"
                                                    disabled="#{Usuario2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Usuario2.gestor.scriptReconsultar}"
                                                    rendered="#{Usuario2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Usuario2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario2.botonRetornar1_action}"
                                                    binding="#{Usuario2.botonRetornar1}"
                                                    disabled="#{Usuario2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Usuario2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Usuario2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Usuario2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="2"
                                                id="gridPanel125"
                                                rendered="#{Usuario2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Usuario2.imageHyperlink1_action}"
                                                    binding="#{Usuario2.imageHyperlink1}"
                                                    disabled="#{Usuario2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Usuario2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Usuario2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Usuario2_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Usuario2.imageHyperlink2_action}"
                                                    binding="#{Usuario2.imageHyperlink2}"
                                                    disabled="#{Usuario2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{Usuario2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Usuario2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Usuario2.gestor.designing}"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.Usuario2_imageHyperlink2_toolTip}"/>
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
