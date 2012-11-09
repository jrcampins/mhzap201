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
                    focus="#{Persona2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Persona2.gestor.preserveFocus}"
                    preserveScroll="#{Persona2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Persona2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdPersona1 campoCodigoPersona1 campoNombrePersona1 campoNumeroCedula1 campoLetraCedula1 campoFechaExpedicionCedula1 campoFechaVencimientoCedula1 campoPrimerNombre1 campoSegundoNombre1 campoPrimerApellido1 campoSegundoApellido1 campoApellidoCasada1 campoApodo1 campoFechaNacimiento1 listaNumeroSexoPersona1 listaNumeroEstadoCivil1 listaEsParaguayoNatural1 listaEsIndigena1 campoIdEtniaIndigena1 campoNombreComunidadIndigena1 campoIdDepartamento1 campoIdDistrito1 listaNumeroTipoArea1 campoIdBarrio1 campoDireccion1 campoNumeroTelefonoLineaBaja1 campoNumeroTelefonoCelular1 campoCertificadoVida1 campoFechaCertificadoVida1 listaEsCertificadoVidaAnulado1 campoComentariosAnulCerVida1 campoCertificadoDefuncion1 campoFechaCertificadoDefuncion1 listaEsCerDefuncionAnulado1 campoComentariosAnulCerDefuncion1 listaEsPersonaConEmpleo1 listaEsPersonaConJubilacion1 listaEsPersonaConPension1 listaEsPersonaConSubsidio1 listaEsPersonaConDeuda1 listaEsPersonaConPenaJudicial1 listaEsPersonaConCerVida1 listaEsPersonaConCartaRenuncia1 listaEsPersonaElegibleParaPen1 listaEsPersonaAcreditadaParaPen1 campoMontoPension1 listaNumeroCondicionPension1 campoFechaSolicitudPension1 campoComentariosSolicitudPension1 campoFechaAprobacionPension1 campoComentariosAprobacionPension1 campoFechaOtorgamientoPen1 campoComentariosOtorgamientoPen1 campoFechaDenegacionPension1 listaNumeroCausaDenPension1 campoOtraCausaDenPension1 campoComentariosDenegacionPension1 campoFechaRevocacionPension1 listaNumeroCausaRevPension1 campoOtraCausaRevPension1 campoComentariosRevocacionPension1 listaNumeroCondicionRecoPen1 campoFechaSolicitudRecoPen1 campoComentariosSolicitudRecoPen1 campoFechaAprobacionRecoPen1 campoComentariosAprRecoPen1 campoFechaDenegacionRecoPen1 listaNumeroCausaDenRecoPen1 campoOtraCausaDenRecoPen1 campoComentariosDenRecoPen1 listaNumeroCondicionDenuPen1 campoFechaRegistroDenunciaPen1 campoComentariosRegistroDenuPen1 campoFechaConfirmacionDenuPen1 campoComentariosConfDenuPen1 campoFechaDesmentidoDenunciaPen1 campoComentariosDesDenuPen1 campoIdFichaPersona1 campoFechaFichaPersona1 campoIndiceCalidadVida1 campoFechaUltimoCobroPension1 campoNotasAnulFecUltCobPen1 listaNumeroTipoActJupe1 campoFechaHoraUltActJupe1 campoNumeroResolucionOtorPen1 campoFechaResolucionOtorPen1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Persona2.breadcrumbs1}" 
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
                                                    rendered="#{Persona2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Persona2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Persona2.gestor.mensajeDisponible}"
                                                    text="#{Persona2.gestor.mensaje}"
                                                    url="#{Persona2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{Persona2.gestor.filaDisponible}"
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
                                                        actionExpression="#{Persona2.botonIrAlPrimero1_action}"
                                                        binding="#{Persona2.botonIrAlPrimero1}"
                                                        disabled="#{Persona2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{Persona2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Persona2.gestor.scriptIrAlPrimero}"
                                                        text="#{Persona2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Persona2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Persona2.botonIrAlAnterior1_action}"
                                                        binding="#{Persona2.botonIrAlAnterior1}"
                                                        disabled="#{Persona2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{Persona2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Persona2.gestor.scriptIrAlAnterior}"
                                                        text="#{Persona2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Persona2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Persona2.botonIrAlSiguiente1_action}"
                                                        binding="#{Persona2.botonIrAlSiguiente1}"
                                                        disabled="#{Persona2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{Persona2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Persona2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Persona2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Persona2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Persona2.botonIrAlUltimo1_action}"
                                                        binding="#{Persona2.botonIrAlUltimo1}"
                                                        disabled="#{Persona2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{Persona2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Persona2.gestor.scriptIrAlUltimo}"
                                                        text="#{Persona2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Persona2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Persona2.botonProcesarFila1_action}"
                                                        binding="#{Persona2.botonProcesarFila1}"
                                                        disabled="#{Persona2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Persona2.gestor.urlImagenProcesar}"
                                                        onClick="#{Persona2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Persona2.asistente.comandoDisponible}"
                                                        text="#{Persona2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Persona2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Persona2.gestor.tituloConsulta}"/>
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
                                                    binding="#{Persona2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{Persona2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Persona2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{Persona2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{Persona2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{Persona2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{Persona2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{Persona2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona1" rendered="false"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"
                                                    text="id"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona2" rendered="false"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{Persona2.campoIdPersona1}"
                                                    converter="#{Persona2.converterIdPersona1}"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}"
                                                    text="#{Persona2.personaDataProvider.value['id_persona']}"
                                                    toolTip="BundleParametros.id_persona.persona"
                                                    validatorExpression="#{Persona2.validatorIdPersona1.validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{Persona2.campoIdPersona1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['id_persona']}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdPersona1"
                                                    binding="#{Persona2.helpInlineIdPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_persona.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelCodigoPersona1}"
                                                    id="labelCodigoPersona1"
                                                    for="campoCodigoPersona1"
                                                    text="codigo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoPersona1"
                                                    binding="#{Persona2.campoCodigoPersona1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['codigo_persona']}"
                                                    toolTip="BundleParametros.codigo_persona.persona"
                                                    validatorExpression="#{Persona2.validatorCodigoPersona1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPersona1Texto1"
                                                    binding="#{Persona2.campoCodigoPersona1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_persona']}"/>
                                                <webuijsf:message id="messageCodigoPersona1"
                                                    for="campoCodigoPersona1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoPersona1"
                                                    binding="#{Persona2.helpInlineCodigoPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_persona.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombrePersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNombrePersona1}"
                                                    id="labelNombrePersona1"
                                                    for="campoNombrePersona1"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombrePersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombrePersona1"
                                                    binding="#{Persona2.campoNombrePersona1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['nombre_persona']}"
                                                    toolTip="BundleParametros.nombre_persona.persona"
                                                    validatorExpression="#{Persona2.validatorNombrePersona1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePersona1Texto1"
                                                    binding="#{Persona2.campoNombrePersona1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['nombre_persona']}"/>
                                                <webuijsf:message id="messageNombrePersona1"
                                                    for="campoNombrePersona1"/>
                                                <webuijsf:helpInline id="helpInlineNombrePersona1"
                                                    binding="#{Persona2.helpInlineNombrePersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_persona.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCedula1"
                                                rendered="#{Persona2.asistente.gridNumeroCedulaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroCedula1}"
                                                    id="labelNumeroCedula1"
                                                    for="campoNumeroCedula1"
                                                    text="numero cedula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCedula2"
                                                rendered="#{Persona2.asistente.gridNumeroCedulaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroCedula1"
                                                    binding="#{Persona2.campoNumeroCedula1}"
                                                    converter="#{Persona2.converterNumeroCedula1}"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Persona2.personaDataProvider.value['numero_cedula']}"
                                                    toolTip="BundleParametros.numero_cedula.persona"
                                                    validatorExpression="#{Persona2.validatorNumeroCedula1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedula1Texto1"
                                                    binding="#{Persona2.campoNumeroCedula1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['numero_cedula']}"/>
                                                <webuijsf:message id="messageNumeroCedula1"
                                                    for="campoNumeroCedula1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCedula1"
                                                    binding="#{Persona2.helpInlineNumeroCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_cedula.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLetraCedula1"
                                                rendered="#{Persona2.asistente.gridLetraCedulaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelLetraCedula1}"
                                                    id="labelLetraCedula1"
                                                    for="campoLetraCedula1"
                                                    text="letra cedula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLetraCedula2"
                                                rendered="#{Persona2.asistente.gridLetraCedulaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoLetraCedula1"
                                                    binding="#{Persona2.campoLetraCedula1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}"
                                                    text="#{Persona2.personaDataProvider.value['letra_cedula']}"
                                                    toolTip="BundleParametros.letra_cedula.persona"
                                                    validatorExpression="#{Persona2.validatorLetraCedula1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedula1Texto1"
                                                    binding="#{Persona2.campoLetraCedula1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['letra_cedula']}"/>
                                                <webuijsf:message id="messageLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                <webuijsf:helpInline id="helpInlineLetraCedula1"
                                                    binding="#{Persona2.helpInlineLetraCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.letra_cedula.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaExpedicionCedula1"
                                                rendered="#{Persona2.asistente.gridFechaExpedicionCedulaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaExpedicionCedula1}"
                                                    id="labelFechaExpedicionCedula1"
                                                    for="campoFechaExpedicionCedula1"
                                                    text="fecha expedicion cedula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaExpedicionCedula2"
                                                rendered="#{Persona2.asistente.gridFechaExpedicionCedulaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaExpedicionCedula1"
                                                    binding="#{Persona2.campoFechaExpedicionCedula1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_expedicion_cedula']}"
                                                    toolTip="BundleParametros.fecha_expedicion_cedula.persona"/>
                                                <webuijsf:staticText id="campoFechaExpedicionCedula1Texto1"
                                                    binding="#{Persona2.campoFechaExpedicionCedula1Texto1}"
                                                    converter="#{Persona2.converterFechaExpedicionCedula1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_expedicion_cedula']}"/>
                                                <webuijsf:message id="messageFechaExpedicionCedula1"
                                                    for="campoFechaExpedicionCedula1"/>
                                                <webuijsf:helpInline id="helpInlineFechaExpedicionCedula1"
                                                    binding="#{Persona2.helpInlineFechaExpedicionCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_expedicion_cedula.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaVencimientoCedula1"
                                                rendered="#{Persona2.asistente.gridFechaVencimientoCedulaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaVencimientoCedula1}"
                                                    id="labelFechaVencimientoCedula1"
                                                    for="campoFechaVencimientoCedula1"
                                                    text="fecha vencimiento cedula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaVencimientoCedula2"
                                                rendered="#{Persona2.asistente.gridFechaVencimientoCedulaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaVencimientoCedula1"
                                                    binding="#{Persona2.campoFechaVencimientoCedula1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_vencimiento_cedula']}"
                                                    toolTip="BundleParametros.fecha_vencimiento_cedula.persona"/>
                                                <webuijsf:staticText id="campoFechaVencimientoCedula1Texto1"
                                                    binding="#{Persona2.campoFechaVencimientoCedula1Texto1}"
                                                    converter="#{Persona2.converterFechaVencimientoCedula1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_vencimiento_cedula']}"/>
                                                <webuijsf:message id="messageFechaVencimientoCedula1"
                                                    for="campoFechaVencimientoCedula1"/>
                                                <webuijsf:helpInline id="helpInlineFechaVencimientoCedula1"
                                                    binding="#{Persona2.helpInlineFechaVencimientoCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_vencimiento_cedula.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPrimerNombre1"
                                                rendered="#{Persona2.asistente.gridPrimerNombreRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelPrimerNombre1}"
                                                    id="labelPrimerNombre1"
                                                    for="campoPrimerNombre1"
                                                    text="primer nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerNombre2"
                                                rendered="#{Persona2.asistente.gridPrimerNombreRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoPrimerNombre1"
                                                    binding="#{Persona2.campoPrimerNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Persona2.personaDataProvider.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.persona"
                                                    validatorExpression="#{Persona2.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1Texto1"
                                                    binding="#{Persona2.campoPrimerNombre1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerNombre1"
                                                    binding="#{Persona2.helpInlinePrimerNombre1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_nombre.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoNombre1"
                                                rendered="#{Persona2.asistente.gridSegundoNombreRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelSegundoNombre1}"
                                                    id="labelSegundoNombre1"
                                                    for="campoSegundoNombre1"
                                                    text="segundo nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoNombre2"
                                                rendered="#{Persona2.asistente.gridSegundoNombreRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoSegundoNombre1"
                                                    binding="#{Persona2.campoSegundoNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.personaDataProvider.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.persona"
                                                    validatorExpression="#{Persona2.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1Texto1"
                                                    binding="#{Persona2.campoSegundoNombre1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoNombre1"
                                                    binding="#{Persona2.helpInlineSegundoNombre1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_nombre.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPrimerApellido1"
                                                rendered="#{Persona2.asistente.gridPrimerApellidoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelPrimerApellido1}"
                                                    id="labelPrimerApellido1"
                                                    for="campoPrimerApellido1"
                                                    text="primer apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerApellido2"
                                                rendered="#{Persona2.asistente.gridPrimerApellidoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoPrimerApellido1"
                                                    binding="#{Persona2.campoPrimerApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Persona2.personaDataProvider.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.persona"
                                                    validatorExpression="#{Persona2.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1Texto1"
                                                    binding="#{Persona2.campoPrimerApellido1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerApellido1"
                                                    binding="#{Persona2.helpInlinePrimerApellido1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_apellido.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoApellido1"
                                                rendered="#{Persona2.asistente.gridSegundoApellidoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelSegundoApellido1}"
                                                    id="labelSegundoApellido1"
                                                    for="campoSegundoApellido1"
                                                    text="segundo apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoApellido2"
                                                rendered="#{Persona2.asistente.gridSegundoApellidoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoSegundoApellido1"
                                                    binding="#{Persona2.campoSegundoApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.personaDataProvider.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.persona"
                                                    validatorExpression="#{Persona2.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1Texto1"
                                                    binding="#{Persona2.campoSegundoApellido1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoApellido1"
                                                    binding="#{Persona2.helpInlineSegundoApellido1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_apellido.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridApellidoCasada1"
                                                rendered="#{Persona2.asistente.gridApellidoCasadaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelApellidoCasada1}"
                                                    id="labelApellidoCasada1"
                                                    for="campoApellidoCasada1"
                                                    text="apellido casada"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridApellidoCasada2"
                                                rendered="#{Persona2.asistente.gridApellidoCasadaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoApellidoCasada1"
                                                    binding="#{Persona2.campoApellidoCasada1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.personaDataProvider.value['apellido_casada']}"
                                                    toolTip="BundleParametros.apellido_casada.persona"
                                                    validatorExpression="#{Persona2.validatorApellidoCasada1.validate}"/>
                                                <webuijsf:staticText id="campoApellidoCasada1Texto1"
                                                    binding="#{Persona2.campoApellidoCasada1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['apellido_casada']}"/>
                                                <webuijsf:message id="messageApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                <webuijsf:helpInline id="helpInlineApellidoCasada1"
                                                    binding="#{Persona2.helpInlineApellidoCasada1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.apellido_casada.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridApodo1"
                                                rendered="#{Persona2.asistente.gridApodoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelApodo1}"
                                                    id="labelApodo1"
                                                    for="campoApodo1"
                                                    text="apodo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridApodo2"
                                                rendered="#{Persona2.asistente.gridApodoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoApodo1"
                                                    binding="#{Persona2.campoApodo1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.personaDataProvider.value['apodo']}"
                                                    toolTip="BundleParametros.apodo.persona"
                                                    validatorExpression="#{Persona2.validatorApodo1.validate}"/>
                                                <webuijsf:staticText id="campoApodo1Texto1"
                                                    binding="#{Persona2.campoApodo1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['apodo']}"/>
                                                <webuijsf:message id="messageApodo1"
                                                    for="campoApodo1"/>
                                                <webuijsf:helpInline id="helpInlineApodo1"
                                                    binding="#{Persona2.helpInlineApodo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.apodo.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaNacimiento1"
                                                rendered="#{Persona2.asistente.gridFechaNacimientoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaNacimiento1}"
                                                    id="labelFechaNacimiento1"
                                                    for="campoFechaNacimiento1"
                                                    text="fecha nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaNacimiento2"
                                                rendered="#{Persona2.asistente.gridFechaNacimientoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaNacimiento1"
                                                    binding="#{Persona2.campoFechaNacimiento1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_nacimiento']}"
                                                    toolTip="BundleParametros.fecha_nacimiento.persona"/>
                                                <webuijsf:staticText id="campoFechaNacimiento1Texto1"
                                                    binding="#{Persona2.campoFechaNacimiento1Texto1}"
                                                    converter="#{Persona2.converterFechaNacimiento1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_nacimiento']}"/>
                                                <webuijsf:message id="messageFechaNacimiento1"
                                                    for="campoFechaNacimiento1"/>
                                                <webuijsf:helpInline id="helpInlineFechaNacimiento1"
                                                    binding="#{Persona2.helpInlineFechaNacimiento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_nacimiento.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSexoPersona1"
                                                rendered="#{Persona2.asistente.gridNumeroSexoPersonaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroSexoPersona1}"
                                                    id="labelNumeroSexoPersona1"
                                                    for="listaNumeroSexoPersona1"
                                                    text="sexo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSexoPersona2"
                                                rendered="#{Persona2.asistente.gridNumeroSexoPersonaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSexoPersona1"
                                                    binding="#{Persona2.listaNumeroSexoPersona1}"
                                                    converter="#{Persona2.converterNumeroSexoPersona1}"
                                                    disabled="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroSexoPersona1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_sexo_persona']}"
                                                    toolTip="BundleParametros.numero_sexo_persona.persona"/>
                                                <webuijsf:staticText id="listaNumeroSexoPersona1Texto1"
                                                    binding="#{Persona2.listaNumeroSexoPersona1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_sexo_persona_1x1y2']}"/>
                                                <webuijsf:message id="messageNumeroSexoPersona1"
                                                    for="listaNumeroSexoPersona1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSexoPersona1"
                                                    binding="#{Persona2.helpInlineNumeroSexoPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_sexo_persona.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroEstadoCivil1"
                                                rendered="#{Persona2.asistente.gridNumeroEstadoCivilRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroEstadoCivil1}"
                                                    id="labelNumeroEstadoCivil1"
                                                    for="listaNumeroEstadoCivil1"
                                                    text="estado civil"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroEstadoCivil2"
                                                rendered="#{Persona2.asistente.gridNumeroEstadoCivilRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroEstadoCivil1"
                                                    binding="#{Persona2.listaNumeroEstadoCivil1}"
                                                    converter="#{Persona2.converterNumeroEstadoCivil1}"
                                                    disabled="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroEstadoCivil1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_estado_civil']}"
                                                    toolTip="BundleParametros.numero_estado_civil.persona"/>
                                                <webuijsf:staticText id="listaNumeroEstadoCivil1Texto1"
                                                    binding="#{Persona2.listaNumeroEstadoCivil1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_estado_civil_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroEstadoCivil1"
                                                    for="listaNumeroEstadoCivil1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroEstadoCivil1"
                                                    binding="#{Persona2.helpInlineNumeroEstadoCivil1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_estado_civil.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsParaguayoNatural1"
                                                rendered="#{Persona2.asistente.gridEsParaguayoNaturalRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsParaguayoNatural1}"
                                                    id="labelEsParaguayoNatural1"
                                                    for="listaEsParaguayoNatural1"
                                                    text="paraguayo natural"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsParaguayoNatural2"
                                                rendered="#{Persona2.asistente.gridEsParaguayoNaturalRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsParaguayoNatural1"
                                                    binding="#{Persona2.listaEsParaguayoNatural1}"
                                                    converter="#{Persona2.converterEsParaguayoNatural1}"
                                                    disabled="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Persona2.asistente.opcionesListaEsParaguayoNatural1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_paraguayo_natural']}"
                                                    toolTip="BundleParametros.es_paraguayo_natural.persona"/>
                                                <webuijsf:staticText id="listaEsParaguayoNatural1Texto1"
                                                    binding="#{Persona2.listaEsParaguayoNatural1Texto1}"/>
                                                <webuijsf:message id="messageEsParaguayoNatural1"
                                                    for="listaEsParaguayoNatural1"/>
                                                <webuijsf:helpInline id="helpInlineEsParaguayoNatural1"
                                                    binding="#{Persona2.helpInlineEsParaguayoNatural1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_paraguayo_natural.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsIndigena1"
                                                rendered="#{Persona2.asistente.gridEsIndigenaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsIndigena1}"
                                                    id="labelEsIndigena1"
                                                    for="listaEsIndigena1"
                                                    text="indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsIndigena2"
                                                rendered="#{Persona2.asistente.gridEsIndigenaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsIndigena1"
                                                    binding="#{Persona2.listaEsIndigena1}"
                                                    converter="#{Persona2.converterEsIndigena1}"
                                                    disabled="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Persona2.asistente.opcionesListaEsIndigena1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_indigena']}"
                                                    toolTip="BundleParametros.es_indigena.persona"/>
                                                <webuijsf:staticText id="listaEsIndigena1Texto1"
                                                    binding="#{Persona2.listaEsIndigena1Texto1}"/>
                                                <webuijsf:message id="messageEsIndigena1"
                                                    for="listaEsIndigena1"/>
                                                <webuijsf:helpInline id="helpInlineEsIndigena1"
                                                    binding="#{Persona2.helpInlineEsIndigena1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_indigena.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdEtniaIndigena1"
                                                rendered="#{Persona2.asistente.gridIdEtniaIndigenaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdEtniaIndigena1}"
                                                    id="labelIdEtniaIndigena1"
                                                    for="campoIdEtniaIndigena1"
                                                    text="etnia indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdEtniaIndigena2"
                                                rendered="#{Persona2.asistente.gridIdEtniaIndigenaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdEtniaIndigena1"
                                                    binding="#{Persona2.campoIdEtniaIndigena1}"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}"
                                                    text="#{Persona2.asistente.textoCampoIdEtniaIndigena1}"
                                                    toolTip="#{Persona2.asistente.toolTipCampoIdEtniaIndigena1}"
                                                    validatorExpression="#{Persona2.campoIdEtniaIndigena1_validate}"/>
                                                <webuijsf:staticText id="campoIdEtniaIndigena1Texto1"
                                                    binding="#{Persona2.campoIdEtniaIndigena1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_etnia_indigena_1x3y3']}"/>
                                                <webuijsf:button id="campoIdEtniaIndigena1Boton1"
                                                    binding="#{Persona2.campoIdEtniaIndigena1Boton1}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdEtniaIndigena1Boton1}"/>
                                                <webuijsf:button id="campoIdEtniaIndigena1Boton3"
                                                    binding="#{Persona2.campoIdEtniaIndigena1Boton3}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdEtniaIndigena1Boton2}"
                                                    rendered="#{Persona2.asistente.campoIdEtniaIndigena1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdEtniaIndigena1"
                                                    for="campoIdEtniaIndigena1"/>
                                                <webuijsf:helpInline id="helpInlineIdEtniaIndigena1"
                                                    binding="#{Persona2.helpInlineIdEtniaIndigena1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_etnia_indigena.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdEtniaIndigena3"
                                                rendered="#{Persona2.asistente.campoIdEtniaIndigena1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdEtniaIndigena2}"
                                                    id="labelIdEtniaIndigena2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre etnia indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdEtniaIndigena4"
                                                rendered="#{Persona2.asistente.campoIdEtniaIndigena1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Persona2.campoIdEtniaIndigena1Texto2}"
                                                    text="#{Persona2.personaDataProvider.value['nombre_etnia_indigena_1x3y4']}"
                                                    id="campoIdEtniaIndigena1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Persona2.campoIdEtniaIndigena1Boton2}"
                                                    id="campoIdEtniaIndigena1Boton2"
                                                    onClick="#{Persona2.asistente.scriptCampoIdEtniaIndigena1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreComunidadIndigena1"
                                                rendered="#{Persona2.asistente.gridNombreComunidadIndigenaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNombreComunidadIndigena1}"
                                                    id="labelNombreComunidadIndigena1"
                                                    for="campoNombreComunidadIndigena1"
                                                    text="nombre comunidad indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreComunidadIndigena2"
                                                rendered="#{Persona2.asistente.gridNombreComunidadIndigenaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreComunidadIndigena1"
                                                    binding="#{Persona2.campoNombreComunidadIndigena1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}"
                                                    text="#{Persona2.personaDataProvider.value['nombre_comunidad_indigena']}"
                                                    toolTip="BundleParametros.nombre_comunidad_indigena.persona"
                                                    validatorExpression="#{Persona2.validatorNombreComunidadIndigena1.validate}"/>
                                                <webuijsf:staticText id="campoNombreComunidadIndigena1Texto1"
                                                    binding="#{Persona2.campoNombreComunidadIndigena1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['nombre_comunidad_indigena']}"/>
                                                <webuijsf:message id="messageNombreComunidadIndigena1"
                                                    for="campoNombreComunidadIndigena1"/>
                                                <webuijsf:helpInline id="helpInlineNombreComunidadIndigena1"
                                                    binding="#{Persona2.helpInlineNombreComunidadIndigena1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_comunidad_indigena.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento1"
                                                rendered="#{Persona2.asistente.gridIdDepartamentoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdDepartamento1}"
                                                    id="labelIdDepartamento1"
                                                    for="campoIdDepartamento1"
                                                    text="departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento2"
                                                rendered="#{Persona2.asistente.gridIdDepartamentoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDepartamento1"
                                                    binding="#{Persona2.campoIdDepartamento1}"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.asistente.textoCampoIdDepartamento1}"
                                                    toolTip="#{Persona2.asistente.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{Persona2.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1Texto1"
                                                    binding="#{Persona2.campoIdDepartamento1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_ubicacion_1x4y3']}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton1"
                                                    binding="#{Persona2.campoIdDepartamento1Boton1}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton3"
                                                    binding="#{Persona2.campoIdDepartamento1Boton3}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{Persona2.asistente.campoIdDepartamento1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                <webuijsf:helpInline id="helpInlineIdDepartamento1"
                                                    binding="#{Persona2.helpInlineIdDepartamento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_departamento.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento3"
                                                rendered="#{Persona2.asistente.campoIdDepartamento1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdDepartamento2}"
                                                    id="labelIdDepartamento2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento4"
                                                rendered="#{Persona2.asistente.campoIdDepartamento1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Persona2.campoIdDepartamento1Texto2}"
                                                    text="#{Persona2.personaDataProvider.value['nombre_ubicacion_1x4y4']}"
                                                    id="campoIdDepartamento1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Persona2.campoIdDepartamento1Boton2}"
                                                    id="campoIdDepartamento1Boton2"
                                                    onClick="#{Persona2.asistente.scriptCampoIdDepartamento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito1"
                                                rendered="#{Persona2.asistente.gridIdDistritoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdDistrito1}"
                                                    id="labelIdDistrito1"
                                                    for="campoIdDistrito1"
                                                    text="distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito2"
                                                rendered="#{Persona2.asistente.gridIdDistritoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDistrito1"
                                                    binding="#{Persona2.campoIdDistrito1}"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.asistente.textoCampoIdDistrito1}"
                                                    toolTip="#{Persona2.asistente.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{Persona2.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1Texto1"
                                                    binding="#{Persona2.campoIdDistrito1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_ubicacion_1x5y3']}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton1"
                                                    binding="#{Persona2.campoIdDistrito1Boton1}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton3"
                                                    binding="#{Persona2.campoIdDistrito1Boton3}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{Persona2.asistente.campoIdDistrito1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                <webuijsf:helpInline id="helpInlineIdDistrito1"
                                                    binding="#{Persona2.helpInlineIdDistrito1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_distrito.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito3"
                                                rendered="#{Persona2.asistente.campoIdDistrito1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdDistrito2}"
                                                    id="labelIdDistrito2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito4"
                                                rendered="#{Persona2.asistente.campoIdDistrito1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Persona2.campoIdDistrito1Texto2}"
                                                    text="#{Persona2.personaDataProvider.value['nombre_ubicacion_1x5y4']}"
                                                    id="campoIdDistrito1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Persona2.campoIdDistrito1Boton2}"
                                                    id="campoIdDistrito1Boton2"
                                                    onClick="#{Persona2.asistente.scriptCampoIdDistrito1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoArea1"
                                                rendered="#{Persona2.asistente.gridNumeroTipoAreaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroTipoArea1}"
                                                    id="labelNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"
                                                    text="tipo area"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoArea2"
                                                rendered="#{Persona2.asistente.gridNumeroTipoAreaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoArea1"
                                                    binding="#{Persona2.listaNumeroTipoArea1}"
                                                    converter="#{Persona2.converterNumeroTipoArea1}"
                                                    disabled="#{Persona2.gestor.filaNoModificada}"
                                                    items="#{Persona2.asistente.opcionesListaNumeroTipoArea1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_tipo_area']}"
                                                    toolTip="BundleParametros.numero_tipo_area.persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoArea1Texto1"
                                                    binding="#{Persona2.listaNumeroTipoArea1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_tipo_area_1x6y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoArea1"
                                                    binding="#{Persona2.helpInlineNumeroTipoArea1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_area.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio1"
                                                rendered="#{Persona2.asistente.gridIdBarrioRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdBarrio1}"
                                                    id="labelIdBarrio1"
                                                    for="campoIdBarrio1"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio2"
                                                rendered="#{Persona2.asistente.gridIdBarrioRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdBarrio1"
                                                    binding="#{Persona2.campoIdBarrio1}"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.asistente.textoCampoIdBarrio1}"
                                                    toolTip="#{Persona2.asistente.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{Persona2.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1Texto1"
                                                    binding="#{Persona2.campoIdBarrio1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_ubicacion_1x7y3']}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton1"
                                                    binding="#{Persona2.campoIdBarrio1Boton1}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton3"
                                                    binding="#{Persona2.campoIdBarrio1Boton3}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{Persona2.asistente.campoIdBarrio1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                <webuijsf:helpInline id="helpInlineIdBarrio1"
                                                    binding="#{Persona2.helpInlineIdBarrio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_barrio.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio3"
                                                rendered="#{Persona2.asistente.campoIdBarrio1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdBarrio2}"
                                                    id="labelIdBarrio2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio4"
                                                rendered="#{Persona2.asistente.campoIdBarrio1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Persona2.campoIdBarrio1Texto2}"
                                                    text="#{Persona2.personaDataProvider.value['nombre_ubicacion_1x7y4']}"
                                                    id="campoIdBarrio1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Persona2.campoIdBarrio1Boton2}"
                                                    id="campoIdBarrio1Boton2"
                                                    onClick="#{Persona2.asistente.scriptCampoIdBarrio1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDireccion1"
                                                rendered="#{Persona2.asistente.gridDireccionRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelDireccion1}"
                                                    id="labelDireccion1"
                                                    for="campoDireccion1"
                                                    text="direccion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDireccion2"
                                                rendered="#{Persona2.asistente.gridDireccionRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDireccion1"
                                                    binding="#{Persona2.campoDireccion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.personaDataProvider.value['direccion']}"
                                                    toolTip="BundleParametros.direccion.persona"
                                                    validatorExpression="#{Persona2.validatorDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoDireccion1Texto1"
                                                    binding="#{Persona2.campoDireccion1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['direccion']}"/>
                                                <webuijsf:message id="messageDireccion1"
                                                    for="campoDireccion1"/>
                                                <webuijsf:helpInline id="helpInlineDireccion1"
                                                    binding="#{Persona2.helpInlineDireccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.direccion.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTelefonoLineaBaja1"
                                                rendered="#{Persona2.asistente.gridNumeroTelefonoLineaBajaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroTelefonoLineaBaja1}"
                                                    id="labelNumeroTelefonoLineaBaja1"
                                                    for="campoNumeroTelefonoLineaBaja1"
                                                    text="numero telefono linea baja"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTelefonoLineaBaja2"
                                                rendered="#{Persona2.asistente.gridNumeroTelefonoLineaBajaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroTelefonoLineaBaja1"
                                                    binding="#{Persona2.campoNumeroTelefonoLineaBaja1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.personaDataProvider.value['numero_telefono_linea_baja']}"
                                                    toolTip="BundleParametros.numero_telefono_linea_baja.persona"
                                                    validatorExpression="#{Persona2.validatorNumeroTelefonoLineaBaja1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoLineaBaja1Texto1"
                                                    binding="#{Persona2.campoNumeroTelefonoLineaBaja1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['numero_telefono_linea_baja']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoLineaBaja1"
                                                    for="campoNumeroTelefonoLineaBaja1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTelefonoLineaBaja1"
                                                    binding="#{Persona2.helpInlineNumeroTelefonoLineaBaja1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_telefono_linea_baja.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTelefonoCelular1"
                                                rendered="#{Persona2.asistente.gridNumeroTelefonoCelularRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroTelefonoCelular1}"
                                                    id="labelNumeroTelefonoCelular1"
                                                    for="campoNumeroTelefonoCelular1"
                                                    text="numero telefono celular"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTelefonoCelular2"
                                                rendered="#{Persona2.asistente.gridNumeroTelefonoCelularRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroTelefonoCelular1"
                                                    binding="#{Persona2.campoNumeroTelefonoCelular1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.personaDataProvider.value['numero_telefono_celular']}"
                                                    toolTip="BundleParametros.numero_telefono_celular.persona"
                                                    validatorExpression="#{Persona2.validatorNumeroTelefonoCelular1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoCelular1Texto1"
                                                    binding="#{Persona2.campoNumeroTelefonoCelular1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['numero_telefono_celular']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoCelular1"
                                                    for="campoNumeroTelefonoCelular1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTelefonoCelular1"
                                                    binding="#{Persona2.helpInlineNumeroTelefonoCelular1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_telefono_celular.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCertificadoVida1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelCertificadoVida1}"
                                                    id="labelCertificadoVida1"
                                                    for="campoCertificadoVida1"
                                                    text="certificado vida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCertificadoVida2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCertificadoVida1"
                                                    binding="#{Persona2.campoCertificadoVida1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['certificado_vida']}"
                                                    toolTip="BundleParametros.certificado_vida.persona"
                                                    validatorExpression="#{Persona2.validatorCertificadoVida1.validate}"/>
                                                <webuijsf:staticText id="campoCertificadoVida1Texto1"
                                                    binding="#{Persona2.campoCertificadoVida1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['certificado_vida']}"/>
                                                <webuijsf:message id="messageCertificadoVida1"
                                                    for="campoCertificadoVida1"/>
                                                <webuijsf:helpInline id="helpInlineCertificadoVida1"
                                                    binding="#{Persona2.helpInlineCertificadoVida1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.certificado_vida.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaCertificadoVida1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaCertificadoVida1}"
                                                    id="labelFechaCertificadoVida1"
                                                    for="campoFechaCertificadoVida1"
                                                    text="fecha certificado vida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaCertificadoVida2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaCertificadoVida1"
                                                    binding="#{Persona2.campoFechaCertificadoVida1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_certificado_vida']}"
                                                    toolTip="BundleParametros.fecha_certificado_vida.persona"/>
                                                <webuijsf:staticText id="campoFechaCertificadoVida1Texto1"
                                                    binding="#{Persona2.campoFechaCertificadoVida1Texto1}"
                                                    converter="#{Persona2.converterFechaCertificadoVida1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_certificado_vida']}"/>
                                                <webuijsf:message id="messageFechaCertificadoVida1"
                                                    for="campoFechaCertificadoVida1"/>
                                                <webuijsf:helpInline id="helpInlineFechaCertificadoVida1"
                                                    binding="#{Persona2.helpInlineFechaCertificadoVida1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_certificado_vida.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsCertificadoVidaAnulado1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsCertificadoVidaAnulado1}"
                                                    id="labelEsCertificadoVidaAnulado1"
                                                    for="listaEsCertificadoVidaAnulado1"
                                                    text="certificado vida anulado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsCertificadoVidaAnulado2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsCertificadoVidaAnulado1"
                                                    binding="#{Persona2.listaEsCertificadoVidaAnulado1}"
                                                    converter="#{Persona2.converterEsCertificadoVidaAnulado1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsCertificadoVidaAnulado1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_certificado_vida_anulado']}"
                                                    toolTip="BundleParametros.es_certificado_vida_anulado.persona"/>
                                                <webuijsf:staticText id="listaEsCertificadoVidaAnulado1Texto1"
                                                    binding="#{Persona2.listaEsCertificadoVidaAnulado1Texto1}"/>
                                                <webuijsf:message id="messageEsCertificadoVidaAnulado1"
                                                    for="listaEsCertificadoVidaAnulado1"/>
                                                <webuijsf:helpInline id="helpInlineEsCertificadoVidaAnulado1"
                                                    binding="#{Persona2.helpInlineEsCertificadoVidaAnulado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_certificado_vida_anulado.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosAnulCerVida1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosAnulCerVida1}"
                                                    id="labelComentariosAnulCerVida1"
                                                    for="campoComentariosAnulCerVida1"
                                                    text="comentarios anul cer vida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosAnulCerVida2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosAnulCerVida1"
                                                    binding="#{Persona2.campoComentariosAnulCerVida1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_anul_cer_vida']}"
                                                    toolTip="BundleParametros.comentarios_anul_cer_vida.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosAnulCerVida1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAnulCerVida1Texto1"
                                                    binding="#{Persona2.campoComentariosAnulCerVida1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_anul_cer_vida']}"/>
                                                <webuijsf:message id="messageComentariosAnulCerVida1"
                                                    for="campoComentariosAnulCerVida1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosAnulCerVida1"
                                                    binding="#{Persona2.helpInlineComentariosAnulCerVida1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_anul_cer_vida.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCertificadoDefuncion1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelCertificadoDefuncion1}"
                                                    id="labelCertificadoDefuncion1"
                                                    for="campoCertificadoDefuncion1"
                                                    text="certificado defuncion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCertificadoDefuncion2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCertificadoDefuncion1"
                                                    binding="#{Persona2.campoCertificadoDefuncion1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['certificado_defuncion']}"
                                                    toolTip="BundleParametros.certificado_defuncion.persona"
                                                    validatorExpression="#{Persona2.validatorCertificadoDefuncion1.validate}"/>
                                                <webuijsf:staticText id="campoCertificadoDefuncion1Texto1"
                                                    binding="#{Persona2.campoCertificadoDefuncion1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['certificado_defuncion']}"/>
                                                <webuijsf:message id="messageCertificadoDefuncion1"
                                                    for="campoCertificadoDefuncion1"/>
                                                <webuijsf:helpInline id="helpInlineCertificadoDefuncion1"
                                                    binding="#{Persona2.helpInlineCertificadoDefuncion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.certificado_defuncion.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaCertificadoDefuncion1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaCertificadoDefuncion1}"
                                                    id="labelFechaCertificadoDefuncion1"
                                                    for="campoFechaCertificadoDefuncion1"
                                                    text="fecha certificado defuncion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaCertificadoDefuncion2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaCertificadoDefuncion1"
                                                    binding="#{Persona2.campoFechaCertificadoDefuncion1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_certificado_defuncion']}"
                                                    toolTip="BundleParametros.fecha_certificado_defuncion.persona"/>
                                                <webuijsf:staticText id="campoFechaCertificadoDefuncion1Texto1"
                                                    binding="#{Persona2.campoFechaCertificadoDefuncion1Texto1}"
                                                    converter="#{Persona2.converterFechaCertificadoDefuncion1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_certificado_defuncion']}"/>
                                                <webuijsf:message id="messageFechaCertificadoDefuncion1"
                                                    for="campoFechaCertificadoDefuncion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaCertificadoDefuncion1"
                                                    binding="#{Persona2.helpInlineFechaCertificadoDefuncion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_certificado_defuncion.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsCerDefuncionAnulado1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsCerDefuncionAnulado1}"
                                                    id="labelEsCerDefuncionAnulado1"
                                                    for="listaEsCerDefuncionAnulado1"
                                                    text="cer defuncion anulado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsCerDefuncionAnulado2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsCerDefuncionAnulado1"
                                                    binding="#{Persona2.listaEsCerDefuncionAnulado1}"
                                                    converter="#{Persona2.converterEsCerDefuncionAnulado1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsCerDefuncionAnulado1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_cer_defuncion_anulado']}"
                                                    toolTip="BundleParametros.es_cer_defuncion_anulado.persona"/>
                                                <webuijsf:staticText id="listaEsCerDefuncionAnulado1Texto1"
                                                    binding="#{Persona2.listaEsCerDefuncionAnulado1Texto1}"/>
                                                <webuijsf:message id="messageEsCerDefuncionAnulado1"
                                                    for="listaEsCerDefuncionAnulado1"/>
                                                <webuijsf:helpInline id="helpInlineEsCerDefuncionAnulado1"
                                                    binding="#{Persona2.helpInlineEsCerDefuncionAnulado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_cer_defuncion_anulado.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosAnulCerDefuncion1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosAnulCerDefuncion1}"
                                                    id="labelComentariosAnulCerDefuncion1"
                                                    for="campoComentariosAnulCerDefuncion1"
                                                    text="comentarios anul cer defuncion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosAnulCerDefuncion2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosAnulCerDefuncion1"
                                                    binding="#{Persona2.campoComentariosAnulCerDefuncion1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_anul_cer_defuncion']}"
                                                    toolTip="BundleParametros.comentarios_anul_cer_defuncion.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosAnulCerDefuncion1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAnulCerDefuncion1Texto1"
                                                    binding="#{Persona2.campoComentariosAnulCerDefuncion1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_anul_cer_defuncion']}"/>
                                                <webuijsf:message id="messageComentariosAnulCerDefuncion1"
                                                    for="campoComentariosAnulCerDefuncion1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosAnulCerDefuncion1"
                                                    binding="#{Persona2.helpInlineComentariosAnulCerDefuncion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_anul_cer_defuncion.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConEmpleo1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaConEmpleo1}"
                                                    id="labelEsPersonaConEmpleo1"
                                                    for="listaEsPersonaConEmpleo1"
                                                    text="con empleo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConEmpleo2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConEmpleo1"
                                                    binding="#{Persona2.listaEsPersonaConEmpleo1}"
                                                    converter="#{Persona2.converterEsPersonaConEmpleo1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaConEmpleo1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_con_empleo']}"
                                                    toolTip="BundleParametros.es_persona_con_empleo.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConEmpleo1Texto1"
                                                    binding="#{Persona2.listaEsPersonaConEmpleo1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConEmpleo1"
                                                    for="listaEsPersonaConEmpleo1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConEmpleo1"
                                                    binding="#{Persona2.helpInlineEsPersonaConEmpleo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_empleo.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConJubilacion1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaConJubilacion1}"
                                                    id="labelEsPersonaConJubilacion1"
                                                    for="listaEsPersonaConJubilacion1"
                                                    text="con jubilacion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConJubilacion2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConJubilacion1"
                                                    binding="#{Persona2.listaEsPersonaConJubilacion1}"
                                                    converter="#{Persona2.converterEsPersonaConJubilacion1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaConJubilacion1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_con_jubilacion']}"
                                                    toolTip="BundleParametros.es_persona_con_jubilacion.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConJubilacion1Texto1"
                                                    binding="#{Persona2.listaEsPersonaConJubilacion1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConJubilacion1"
                                                    for="listaEsPersonaConJubilacion1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConJubilacion1"
                                                    binding="#{Persona2.helpInlineEsPersonaConJubilacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_jubilacion.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConPension1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaConPension1}"
                                                    id="labelEsPersonaConPension1"
                                                    for="listaEsPersonaConPension1"
                                                    text="con pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConPension2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConPension1"
                                                    binding="#{Persona2.listaEsPersonaConPension1}"
                                                    converter="#{Persona2.converterEsPersonaConPension1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaConPension1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_con_pension']}"
                                                    toolTip="BundleParametros.es_persona_con_pension.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConPension1Texto1"
                                                    binding="#{Persona2.listaEsPersonaConPension1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConPension1"
                                                    for="listaEsPersonaConPension1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConPension1"
                                                    binding="#{Persona2.helpInlineEsPersonaConPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConSubsidio1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaConSubsidio1}"
                                                    id="labelEsPersonaConSubsidio1"
                                                    for="listaEsPersonaConSubsidio1"
                                                    text="con subsidio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConSubsidio2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConSubsidio1"
                                                    binding="#{Persona2.listaEsPersonaConSubsidio1}"
                                                    converter="#{Persona2.converterEsPersonaConSubsidio1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaConSubsidio1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_con_subsidio']}"
                                                    toolTip="BundleParametros.es_persona_con_subsidio.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConSubsidio1Texto1"
                                                    binding="#{Persona2.listaEsPersonaConSubsidio1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConSubsidio1"
                                                    for="listaEsPersonaConSubsidio1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConSubsidio1"
                                                    binding="#{Persona2.helpInlineEsPersonaConSubsidio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_subsidio.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConDeuda1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaConDeuda1}"
                                                    id="labelEsPersonaConDeuda1"
                                                    for="listaEsPersonaConDeuda1"
                                                    text="con deuda"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConDeuda2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConDeuda1"
                                                    binding="#{Persona2.listaEsPersonaConDeuda1}"
                                                    converter="#{Persona2.converterEsPersonaConDeuda1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaConDeuda1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_con_deuda']}"
                                                    toolTip="BundleParametros.es_persona_con_deuda.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConDeuda1Texto1"
                                                    binding="#{Persona2.listaEsPersonaConDeuda1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConDeuda1"
                                                    for="listaEsPersonaConDeuda1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConDeuda1"
                                                    binding="#{Persona2.helpInlineEsPersonaConDeuda1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_deuda.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConPenaJudicial1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaConPenaJudicial1}"
                                                    id="labelEsPersonaConPenaJudicial1"
                                                    for="listaEsPersonaConPenaJudicial1"
                                                    text="con pena judicial"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConPenaJudicial2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConPenaJudicial1"
                                                    binding="#{Persona2.listaEsPersonaConPenaJudicial1}"
                                                    converter="#{Persona2.converterEsPersonaConPenaJudicial1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaConPenaJudicial1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_con_pena_judicial']}"
                                                    toolTip="BundleParametros.es_persona_con_pena_judicial.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConPenaJudicial1Texto1"
                                                    binding="#{Persona2.listaEsPersonaConPenaJudicial1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConPenaJudicial1"
                                                    for="listaEsPersonaConPenaJudicial1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConPenaJudicial1"
                                                    binding="#{Persona2.helpInlineEsPersonaConPenaJudicial1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_pena_judicial.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConCerVida1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaConCerVida1}"
                                                    id="labelEsPersonaConCerVida1"
                                                    for="listaEsPersonaConCerVida1"
                                                    text="con cer vida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConCerVida2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConCerVida1"
                                                    binding="#{Persona2.listaEsPersonaConCerVida1}"
                                                    converter="#{Persona2.converterEsPersonaConCerVida1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaConCerVida1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_con_cer_vida']}"
                                                    toolTip="BundleParametros.es_persona_con_cer_vida.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConCerVida1Texto1"
                                                    binding="#{Persona2.listaEsPersonaConCerVida1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConCerVida1"
                                                    for="listaEsPersonaConCerVida1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConCerVida1"
                                                    binding="#{Persona2.helpInlineEsPersonaConCerVida1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_cer_vida.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConCartaRenuncia1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaConCartaRenuncia1}"
                                                    id="labelEsPersonaConCartaRenuncia1"
                                                    for="listaEsPersonaConCartaRenuncia1"
                                                    text="con carta renuncia"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConCartaRenuncia2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConCartaRenuncia1"
                                                    binding="#{Persona2.listaEsPersonaConCartaRenuncia1}"
                                                    converter="#{Persona2.converterEsPersonaConCartaRenuncia1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaConCartaRenuncia1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_con_carta_renuncia']}"
                                                    toolTip="BundleParametros.es_persona_con_carta_renuncia.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConCartaRenuncia1Texto1"
                                                    binding="#{Persona2.listaEsPersonaConCartaRenuncia1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConCartaRenuncia1"
                                                    for="listaEsPersonaConCartaRenuncia1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConCartaRenuncia1"
                                                    binding="#{Persona2.helpInlineEsPersonaConCartaRenuncia1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_carta_renuncia.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaElegibleParaPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaElegibleParaPen1}"
                                                    id="labelEsPersonaElegibleParaPen1"
                                                    for="listaEsPersonaElegibleParaPen1"
                                                    text="elegible para pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaElegibleParaPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaElegibleParaPen1"
                                                    binding="#{Persona2.listaEsPersonaElegibleParaPen1}"
                                                    converter="#{Persona2.converterEsPersonaElegibleParaPen1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaElegibleParaPen1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_elegible_para_pen']}"
                                                    toolTip="BundleParametros.es_persona_elegible_para_pen.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaElegibleParaPen1Texto1"
                                                    binding="#{Persona2.listaEsPersonaElegibleParaPen1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaElegibleParaPen1"
                                                    for="listaEsPersonaElegibleParaPen1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaElegibleParaPen1"
                                                    binding="#{Persona2.helpInlineEsPersonaElegibleParaPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_elegible_para_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaAcreditadaParaPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaAcreditadaParaPen1}"
                                                    id="labelEsPersonaAcreditadaParaPen1"
                                                    for="listaEsPersonaAcreditadaParaPen1"
                                                    text="acreditada para pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaAcreditadaParaPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaAcreditadaParaPen1"
                                                    binding="#{Persona2.listaEsPersonaAcreditadaParaPen1}"
                                                    converter="#{Persona2.converterEsPersonaAcreditadaParaPen1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaAcreditadaParaPen1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_acreditada_para_pen']}"
                                                    toolTip="BundleParametros.es_persona_acreditada_para_pen.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaAcreditadaParaPen1Texto1"
                                                    binding="#{Persona2.listaEsPersonaAcreditadaParaPen1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaAcreditadaParaPen1"
                                                    for="listaEsPersonaAcreditadaParaPen1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaAcreditadaParaPen1"
                                                    binding="#{Persona2.helpInlineEsPersonaAcreditadaParaPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_acreditada_para_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoPension1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelMontoPension1}"
                                                    id="labelMontoPension1"
                                                    for="campoMontoPension1"
                                                    text="monto pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoPension2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoPension1"
                                                    binding="#{Persona2.campoMontoPension1}"
                                                    converter="#{Persona2.converterMontoPension1}"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['monto_pension']}"
                                                    toolTip="BundleParametros.monto_pension.persona"
                                                    validatorExpression="#{Persona2.validatorMontoPension1.validate}"/>
                                                <webuijsf:staticText id="campoMontoPension1Texto1"
                                                    binding="#{Persona2.campoMontoPension1Texto1}"
                                                    converter="#{Persona2.converterMontoPension1}"
                                                    text="#{Persona2.personaDataProvider.value['monto_pension']}"/>
                                                <webuijsf:message id="messageMontoPension1"
                                                    for="campoMontoPension1"/>
                                                <webuijsf:helpInline id="helpInlineMontoPension1"
                                                    binding="#{Persona2.helpInlineMontoPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCondicionPension1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroCondicionPension1}"
                                                    id="labelNumeroCondicionPension1"
                                                    for="listaNumeroCondicionPension1"
                                                    text="condicion pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCondicionPension2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCondicionPension1"
                                                    binding="#{Persona2.listaNumeroCondicionPension1}"
                                                    converter="#{Persona2.converterNumeroCondicionPension1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroCondicionPension1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_condicion_pension']}"
                                                    toolTip="BundleParametros.numero_condicion_pension.persona"/>
                                                <webuijsf:staticText id="listaNumeroCondicionPension1Texto1"
                                                    binding="#{Persona2.listaNumeroCondicionPension1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_condicion_pension_1x9y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionPension1"
                                                    for="listaNumeroCondicionPension1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCondicionPension1"
                                                    binding="#{Persona2.helpInlineNumeroCondicionPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_condicion_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaSolicitudPension1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaSolicitudPension1}"
                                                    id="labelFechaSolicitudPension1"
                                                    for="campoFechaSolicitudPension1"
                                                    text="fecha solicitud pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaSolicitudPension2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaSolicitudPension1"
                                                    binding="#{Persona2.campoFechaSolicitudPension1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_solicitud_pension']}"
                                                    toolTip="BundleParametros.fecha_solicitud_pension.persona"/>
                                                <webuijsf:staticText id="campoFechaSolicitudPension1Texto1"
                                                    binding="#{Persona2.campoFechaSolicitudPension1Texto1}"
                                                    converter="#{Persona2.converterFechaSolicitudPension1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_solicitud_pension']}"/>
                                                <webuijsf:message id="messageFechaSolicitudPension1"
                                                    for="campoFechaSolicitudPension1"/>
                                                <webuijsf:helpInline id="helpInlineFechaSolicitudPension1"
                                                    binding="#{Persona2.helpInlineFechaSolicitudPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_solicitud_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosSolicitudPension1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosSolicitudPension1}"
                                                    id="labelComentariosSolicitudPension1"
                                                    for="campoComentariosSolicitudPension1"
                                                    text="comentarios solicitud pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosSolicitudPension2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosSolicitudPension1"
                                                    binding="#{Persona2.campoComentariosSolicitudPension1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_solicitud_pension']}"
                                                    toolTip="BundleParametros.comentarios_solicitud_pension.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosSolicitudPension1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosSolicitudPension1Texto1"
                                                    binding="#{Persona2.campoComentariosSolicitudPension1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_solicitud_pension']}"/>
                                                <webuijsf:message id="messageComentariosSolicitudPension1"
                                                    for="campoComentariosSolicitudPension1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosSolicitudPension1"
                                                    binding="#{Persona2.helpInlineComentariosSolicitudPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_solicitud_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaAprobacionPension1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaAprobacionPension1}"
                                                    id="labelFechaAprobacionPension1"
                                                    for="campoFechaAprobacionPension1"
                                                    text="fecha aprobacion pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaAprobacionPension2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaAprobacionPension1"
                                                    binding="#{Persona2.campoFechaAprobacionPension1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_aprobacion_pension']}"
                                                    toolTip="BundleParametros.fecha_aprobacion_pension.persona"/>
                                                <webuijsf:staticText id="campoFechaAprobacionPension1Texto1"
                                                    binding="#{Persona2.campoFechaAprobacionPension1Texto1}"
                                                    converter="#{Persona2.converterFechaAprobacionPension1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_aprobacion_pension']}"/>
                                                <webuijsf:message id="messageFechaAprobacionPension1"
                                                    for="campoFechaAprobacionPension1"/>
                                                <webuijsf:helpInline id="helpInlineFechaAprobacionPension1"
                                                    binding="#{Persona2.helpInlineFechaAprobacionPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_aprobacion_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosAprobacionPension1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosAprobacionPension1}"
                                                    id="labelComentariosAprobacionPension1"
                                                    for="campoComentariosAprobacionPension1"
                                                    text="comentarios aprobacion pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosAprobacionPension2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosAprobacionPension1"
                                                    binding="#{Persona2.campoComentariosAprobacionPension1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_aprobacion_pension']}"
                                                    toolTip="BundleParametros.comentarios_aprobacion_pension.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosAprobacionPension1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAprobacionPension1Texto1"
                                                    binding="#{Persona2.campoComentariosAprobacionPension1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_aprobacion_pension']}"/>
                                                <webuijsf:message id="messageComentariosAprobacionPension1"
                                                    for="campoComentariosAprobacionPension1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosAprobacionPension1"
                                                    binding="#{Persona2.helpInlineComentariosAprobacionPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_aprobacion_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaOtorgamientoPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaOtorgamientoPen1}"
                                                    id="labelFechaOtorgamientoPen1"
                                                    for="campoFechaOtorgamientoPen1"
                                                    text="fecha otorgamiento pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaOtorgamientoPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaOtorgamientoPen1"
                                                    binding="#{Persona2.campoFechaOtorgamientoPen1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_otorgamiento_pen']}"
                                                    toolTip="BundleParametros.fecha_otorgamiento_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaOtorgamientoPen1Texto1"
                                                    binding="#{Persona2.campoFechaOtorgamientoPen1Texto1}"
                                                    converter="#{Persona2.converterFechaOtorgamientoPen1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_otorgamiento_pen']}"/>
                                                <webuijsf:message id="messageFechaOtorgamientoPen1"
                                                    for="campoFechaOtorgamientoPen1"/>
                                                <webuijsf:helpInline id="helpInlineFechaOtorgamientoPen1"
                                                    binding="#{Persona2.helpInlineFechaOtorgamientoPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_otorgamiento_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosOtorgamientoPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosOtorgamientoPen1}"
                                                    id="labelComentariosOtorgamientoPen1"
                                                    for="campoComentariosOtorgamientoPen1"
                                                    text="comentarios otorgamiento pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosOtorgamientoPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosOtorgamientoPen1"
                                                    binding="#{Persona2.campoComentariosOtorgamientoPen1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_otorgamiento_pen']}"
                                                    toolTip="BundleParametros.comentarios_otorgamiento_pen.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosOtorgamientoPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosOtorgamientoPen1Texto1"
                                                    binding="#{Persona2.campoComentariosOtorgamientoPen1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_otorgamiento_pen']}"/>
                                                <webuijsf:message id="messageComentariosOtorgamientoPen1"
                                                    for="campoComentariosOtorgamientoPen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosOtorgamientoPen1"
                                                    binding="#{Persona2.helpInlineComentariosOtorgamientoPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_otorgamiento_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroResolucionOtorPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroResolucionOtorPen1}"
                                                    id="labelNumeroResolucionOtorPen1"
                                                    for="campoNumeroResolucionOtorPen1"
                                                    text="numero resolucion otor pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroResolucionOtorPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroResolucionOtorPen1"
                                                    binding="#{Persona2.campoNumeroResolucionOtorPen1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['numero_resolucion_otor_pen']}"
                                                    toolTip="BundleParametros.numero_resolucion_otor_pen.persona"
                                                    validatorExpression="#{Persona2.validatorNumeroResolucionOtorPen1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroResolucionOtorPen1Texto1"
                                                    binding="#{Persona2.campoNumeroResolucionOtorPen1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['numero_resolucion_otor_pen']}"/>
                                                <webuijsf:message id="messageNumeroResolucionOtorPen1"
                                                    for="campoNumeroResolucionOtorPen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroResolucionOtorPen1"
                                                    binding="#{Persona2.helpInlineNumeroResolucionOtorPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_resolucion_otor_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaResolucionOtorPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaResolucionOtorPen1}"
                                                    id="labelFechaResolucionOtorPen1"
                                                    for="campoFechaResolucionOtorPen1"
                                                    text="fecha resolucion otor pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaResolucionOtorPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaResolucionOtorPen1"
                                                    binding="#{Persona2.campoFechaResolucionOtorPen1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_resolucion_otor_pen']}"
                                                    toolTip="BundleParametros.fecha_resolucion_otor_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaResolucionOtorPen1Texto1"
                                                    binding="#{Persona2.campoFechaResolucionOtorPen1Texto1}"
                                                    converter="#{Persona2.converterFechaResolucionOtorPen1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_resolucion_otor_pen']}"/>
                                                <webuijsf:message id="messageFechaResolucionOtorPen1"
                                                    for="campoFechaResolucionOtorPen1"/>
                                                <webuijsf:helpInline id="helpInlineFechaResolucionOtorPen1"
                                                    binding="#{Persona2.helpInlineFechaResolucionOtorPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_resolucion_otor_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaDenegacionPension1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaDenegacionPension1}"
                                                    id="labelFechaDenegacionPension1"
                                                    for="campoFechaDenegacionPension1"
                                                    text="fecha denegacion pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaDenegacionPension2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaDenegacionPension1"
                                                    binding="#{Persona2.campoFechaDenegacionPension1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_denegacion_pension']}"
                                                    toolTip="BundleParametros.fecha_denegacion_pension.persona"/>
                                                <webuijsf:staticText id="campoFechaDenegacionPension1Texto1"
                                                    binding="#{Persona2.campoFechaDenegacionPension1Texto1}"
                                                    converter="#{Persona2.converterFechaDenegacionPension1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_denegacion_pension']}"/>
                                                <webuijsf:message id="messageFechaDenegacionPension1"
                                                    for="campoFechaDenegacionPension1"/>
                                                <webuijsf:helpInline id="helpInlineFechaDenegacionPension1"
                                                    binding="#{Persona2.helpInlineFechaDenegacionPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_denegacion_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaDenPension1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroCausaDenPension1}"
                                                    id="labelNumeroCausaDenPension1"
                                                    for="listaNumeroCausaDenPension1"
                                                    text="causa den pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaDenPension2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaDenPension1"
                                                    binding="#{Persona2.listaNumeroCausaDenPension1}"
                                                    converter="#{Persona2.converterNumeroCausaDenPension1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroCausaDenPension1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_causa_den_pension']}"
                                                    toolTip="BundleParametros.numero_causa_den_pension.persona"/>
                                                <webuijsf:staticText id="listaNumeroCausaDenPension1Texto1"
                                                    binding="#{Persona2.listaNumeroCausaDenPension1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_causa_den_pensio_1x10y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaDenPension1"
                                                    for="listaNumeroCausaDenPension1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaDenPension1"
                                                    binding="#{Persona2.helpInlineNumeroCausaDenPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_den_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaDenPension1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelOtraCausaDenPension1}"
                                                    id="labelOtraCausaDenPension1"
                                                    for="campoOtraCausaDenPension1"
                                                    text="otra causa den pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaDenPension2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaDenPension1"
                                                    binding="#{Persona2.campoOtraCausaDenPension1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['otra_causa_den_pension']}"
                                                    toolTip="BundleParametros.otra_causa_den_pension.persona"
                                                    validatorExpression="#{Persona2.validatorOtraCausaDenPension1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaDenPension1Texto1"
                                                    binding="#{Persona2.campoOtraCausaDenPension1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['otra_causa_den_pension']}"/>
                                                <webuijsf:message id="messageOtraCausaDenPension1"
                                                    for="campoOtraCausaDenPension1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaDenPension1"
                                                    binding="#{Persona2.helpInlineOtraCausaDenPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_den_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosDenegacionPension1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosDenegacionPension1}"
                                                    id="labelComentariosDenegacionPension1"
                                                    for="campoComentariosDenegacionPension1"
                                                    text="comentarios denegacion pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosDenegacionPension2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosDenegacionPension1"
                                                    binding="#{Persona2.campoComentariosDenegacionPension1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_denegacion_pension']}"
                                                    toolTip="BundleParametros.comentarios_denegacion_pension.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosDenegacionPension1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosDenegacionPension1Texto1"
                                                    binding="#{Persona2.campoComentariosDenegacionPension1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_denegacion_pension']}"/>
                                                <webuijsf:message id="messageComentariosDenegacionPension1"
                                                    for="campoComentariosDenegacionPension1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosDenegacionPension1"
                                                    binding="#{Persona2.helpInlineComentariosDenegacionPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_denegacion_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaRevocacionPension1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaRevocacionPension1}"
                                                    id="labelFechaRevocacionPension1"
                                                    for="campoFechaRevocacionPension1"
                                                    text="fecha revocacion pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaRevocacionPension2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaRevocacionPension1"
                                                    binding="#{Persona2.campoFechaRevocacionPension1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_revocacion_pension']}"
                                                    toolTip="BundleParametros.fecha_revocacion_pension.persona"/>
                                                <webuijsf:staticText id="campoFechaRevocacionPension1Texto1"
                                                    binding="#{Persona2.campoFechaRevocacionPension1Texto1}"
                                                    converter="#{Persona2.converterFechaRevocacionPension1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_revocacion_pension']}"/>
                                                <webuijsf:message id="messageFechaRevocacionPension1"
                                                    for="campoFechaRevocacionPension1"/>
                                                <webuijsf:helpInline id="helpInlineFechaRevocacionPension1"
                                                    binding="#{Persona2.helpInlineFechaRevocacionPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_revocacion_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaRevPension1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroCausaRevPension1}"
                                                    id="labelNumeroCausaRevPension1"
                                                    for="listaNumeroCausaRevPension1"
                                                    text="causa rev pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaRevPension2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaRevPension1"
                                                    binding="#{Persona2.listaNumeroCausaRevPension1}"
                                                    converter="#{Persona2.converterNumeroCausaRevPension1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroCausaRevPension1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_causa_rev_pension']}"
                                                    toolTip="BundleParametros.numero_causa_rev_pension.persona"/>
                                                <webuijsf:staticText id="listaNumeroCausaRevPension1Texto1"
                                                    binding="#{Persona2.listaNumeroCausaRevPension1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_causa_rev_pensio_1x11y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaRevPension1"
                                                    for="listaNumeroCausaRevPension1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaRevPension1"
                                                    binding="#{Persona2.helpInlineNumeroCausaRevPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_rev_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaRevPension1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelOtraCausaRevPension1}"
                                                    id="labelOtraCausaRevPension1"
                                                    for="campoOtraCausaRevPension1"
                                                    text="otra causa rev pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaRevPension2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaRevPension1"
                                                    binding="#{Persona2.campoOtraCausaRevPension1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['otra_causa_rev_pension']}"
                                                    toolTip="BundleParametros.otra_causa_rev_pension.persona"
                                                    validatorExpression="#{Persona2.validatorOtraCausaRevPension1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaRevPension1Texto1"
                                                    binding="#{Persona2.campoOtraCausaRevPension1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['otra_causa_rev_pension']}"/>
                                                <webuijsf:message id="messageOtraCausaRevPension1"
                                                    for="campoOtraCausaRevPension1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaRevPension1"
                                                    binding="#{Persona2.helpInlineOtraCausaRevPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_rev_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosRevocacionPension1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosRevocacionPension1}"
                                                    id="labelComentariosRevocacionPension1"
                                                    for="campoComentariosRevocacionPension1"
                                                    text="comentarios revocacion pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosRevocacionPension2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosRevocacionPension1"
                                                    binding="#{Persona2.campoComentariosRevocacionPension1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_revocacion_pension']}"
                                                    toolTip="BundleParametros.comentarios_revocacion_pension.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosRevocacionPension1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosRevocacionPension1Texto1"
                                                    binding="#{Persona2.campoComentariosRevocacionPension1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_revocacion_pension']}"/>
                                                <webuijsf:message id="messageComentariosRevocacionPension1"
                                                    for="campoComentariosRevocacionPension1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosRevocacionPension1"
                                                    binding="#{Persona2.helpInlineComentariosRevocacionPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_revocacion_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCondicionRecoPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroCondicionRecoPen1}"
                                                    id="labelNumeroCondicionRecoPen1"
                                                    for="listaNumeroCondicionRecoPen1"
                                                    text="condicion reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCondicionRecoPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCondicionRecoPen1"
                                                    binding="#{Persona2.listaNumeroCondicionRecoPen1}"
                                                    converter="#{Persona2.converterNumeroCondicionRecoPen1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroCondicionRecoPen1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_condicion_reco_pen']}"
                                                    toolTip="BundleParametros.numero_condicion_reco_pen.persona"/>
                                                <webuijsf:staticText id="listaNumeroCondicionRecoPen1Texto1"
                                                    binding="#{Persona2.listaNumeroCondicionRecoPen1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_condicion_reco_p_1x12y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionRecoPen1"
                                                    for="listaNumeroCondicionRecoPen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCondicionRecoPen1"
                                                    binding="#{Persona2.helpInlineNumeroCondicionRecoPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_condicion_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaSolicitudRecoPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaSolicitudRecoPen1}"
                                                    id="labelFechaSolicitudRecoPen1"
                                                    for="campoFechaSolicitudRecoPen1"
                                                    text="fecha solicitud reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaSolicitudRecoPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaSolicitudRecoPen1"
                                                    binding="#{Persona2.campoFechaSolicitudRecoPen1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_solicitud_reco_pen']}"
                                                    toolTip="BundleParametros.fecha_solicitud_reco_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaSolicitudRecoPen1Texto1"
                                                    binding="#{Persona2.campoFechaSolicitudRecoPen1Texto1}"
                                                    converter="#{Persona2.converterFechaSolicitudRecoPen1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_solicitud_reco_pen']}"/>
                                                <webuijsf:message id="messageFechaSolicitudRecoPen1"
                                                    for="campoFechaSolicitudRecoPen1"/>
                                                <webuijsf:helpInline id="helpInlineFechaSolicitudRecoPen1"
                                                    binding="#{Persona2.helpInlineFechaSolicitudRecoPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_solicitud_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosSolicitudRecoPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosSolicitudRecoPen1}"
                                                    id="labelComentariosSolicitudRecoPen1"
                                                    for="campoComentariosSolicitudRecoPen1"
                                                    text="comentarios solicitud reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosSolicitudRecoPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosSolicitudRecoPen1"
                                                    binding="#{Persona2.campoComentariosSolicitudRecoPen1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_solicitud_reco_pen']}"
                                                    toolTip="BundleParametros.comentarios_solicitud_reco_pen.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosSolicitudRecoPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosSolicitudRecoPen1Texto1"
                                                    binding="#{Persona2.campoComentariosSolicitudRecoPen1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_solicitud_reco_pen']}"/>
                                                <webuijsf:message id="messageComentariosSolicitudRecoPen1"
                                                    for="campoComentariosSolicitudRecoPen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosSolicitudRecoPen1"
                                                    binding="#{Persona2.helpInlineComentariosSolicitudRecoPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_solicitud_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaAprobacionRecoPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaAprobacionRecoPen1}"
                                                    id="labelFechaAprobacionRecoPen1"
                                                    for="campoFechaAprobacionRecoPen1"
                                                    text="fecha aprobacion reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaAprobacionRecoPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaAprobacionRecoPen1"
                                                    binding="#{Persona2.campoFechaAprobacionRecoPen1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_aprobacion_reco_pen']}"
                                                    toolTip="BundleParametros.fecha_aprobacion_reco_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaAprobacionRecoPen1Texto1"
                                                    binding="#{Persona2.campoFechaAprobacionRecoPen1Texto1}"
                                                    converter="#{Persona2.converterFechaAprobacionRecoPen1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_aprobacion_reco_pen']}"/>
                                                <webuijsf:message id="messageFechaAprobacionRecoPen1"
                                                    for="campoFechaAprobacionRecoPen1"/>
                                                <webuijsf:helpInline id="helpInlineFechaAprobacionRecoPen1"
                                                    binding="#{Persona2.helpInlineFechaAprobacionRecoPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_aprobacion_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosAprRecoPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosAprRecoPen1}"
                                                    id="labelComentariosAprRecoPen1"
                                                    for="campoComentariosAprRecoPen1"
                                                    text="comentarios apr reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosAprRecoPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosAprRecoPen1"
                                                    binding="#{Persona2.campoComentariosAprRecoPen1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_apr_reco_pen']}"
                                                    toolTip="BundleParametros.comentarios_apr_reco_pen.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosAprRecoPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAprRecoPen1Texto1"
                                                    binding="#{Persona2.campoComentariosAprRecoPen1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_apr_reco_pen']}"/>
                                                <webuijsf:message id="messageComentariosAprRecoPen1"
                                                    for="campoComentariosAprRecoPen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosAprRecoPen1"
                                                    binding="#{Persona2.helpInlineComentariosAprRecoPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_apr_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaDenegacionRecoPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaDenegacionRecoPen1}"
                                                    id="labelFechaDenegacionRecoPen1"
                                                    for="campoFechaDenegacionRecoPen1"
                                                    text="fecha denegacion reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaDenegacionRecoPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaDenegacionRecoPen1"
                                                    binding="#{Persona2.campoFechaDenegacionRecoPen1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_denegacion_reco_pen']}"
                                                    toolTip="BundleParametros.fecha_denegacion_reco_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaDenegacionRecoPen1Texto1"
                                                    binding="#{Persona2.campoFechaDenegacionRecoPen1Texto1}"
                                                    converter="#{Persona2.converterFechaDenegacionRecoPen1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_denegacion_reco_pen']}"/>
                                                <webuijsf:message id="messageFechaDenegacionRecoPen1"
                                                    for="campoFechaDenegacionRecoPen1"/>
                                                <webuijsf:helpInline id="helpInlineFechaDenegacionRecoPen1"
                                                    binding="#{Persona2.helpInlineFechaDenegacionRecoPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_denegacion_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaDenRecoPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroCausaDenRecoPen1}"
                                                    id="labelNumeroCausaDenRecoPen1"
                                                    for="listaNumeroCausaDenRecoPen1"
                                                    text="causa den reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaDenRecoPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaDenRecoPen1"
                                                    binding="#{Persona2.listaNumeroCausaDenRecoPen1}"
                                                    converter="#{Persona2.converterNumeroCausaDenRecoPen1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroCausaDenRecoPen1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_causa_den_reco_pen']}"
                                                    toolTip="BundleParametros.numero_causa_den_reco_pen.persona"/>
                                                <webuijsf:staticText id="listaNumeroCausaDenRecoPen1Texto1"
                                                    binding="#{Persona2.listaNumeroCausaDenRecoPen1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_causa_den_reco_p_1x13y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaDenRecoPen1"
                                                    for="listaNumeroCausaDenRecoPen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaDenRecoPen1"
                                                    binding="#{Persona2.helpInlineNumeroCausaDenRecoPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_den_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaDenRecoPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelOtraCausaDenRecoPen1}"
                                                    id="labelOtraCausaDenRecoPen1"
                                                    for="campoOtraCausaDenRecoPen1"
                                                    text="otra causa den reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaDenRecoPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaDenRecoPen1"
                                                    binding="#{Persona2.campoOtraCausaDenRecoPen1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['otra_causa_den_reco_pen']}"
                                                    toolTip="BundleParametros.otra_causa_den_reco_pen.persona"
                                                    validatorExpression="#{Persona2.validatorOtraCausaDenRecoPen1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaDenRecoPen1Texto1"
                                                    binding="#{Persona2.campoOtraCausaDenRecoPen1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['otra_causa_den_reco_pen']}"/>
                                                <webuijsf:message id="messageOtraCausaDenRecoPen1"
                                                    for="campoOtraCausaDenRecoPen1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaDenRecoPen1"
                                                    binding="#{Persona2.helpInlineOtraCausaDenRecoPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_den_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosDenRecoPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosDenRecoPen1}"
                                                    id="labelComentariosDenRecoPen1"
                                                    for="campoComentariosDenRecoPen1"
                                                    text="comentarios den reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosDenRecoPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosDenRecoPen1"
                                                    binding="#{Persona2.campoComentariosDenRecoPen1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_den_reco_pen']}"
                                                    toolTip="BundleParametros.comentarios_den_reco_pen.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosDenRecoPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosDenRecoPen1Texto1"
                                                    binding="#{Persona2.campoComentariosDenRecoPen1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_den_reco_pen']}"/>
                                                <webuijsf:message id="messageComentariosDenRecoPen1"
                                                    for="campoComentariosDenRecoPen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosDenRecoPen1"
                                                    binding="#{Persona2.helpInlineComentariosDenRecoPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_den_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCondicionDenuPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroCondicionDenuPen1}"
                                                    id="labelNumeroCondicionDenuPen1"
                                                    for="listaNumeroCondicionDenuPen1"
                                                    text="condicion denu pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCondicionDenuPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCondicionDenuPen1"
                                                    binding="#{Persona2.listaNumeroCondicionDenuPen1}"
                                                    converter="#{Persona2.converterNumeroCondicionDenuPen1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroCondicionDenuPen1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_condicion_denu_pen']}"
                                                    toolTip="BundleParametros.numero_condicion_denu_pen.persona"/>
                                                <webuijsf:staticText id="listaNumeroCondicionDenuPen1Texto1"
                                                    binding="#{Persona2.listaNumeroCondicionDenuPen1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_condicion_denu_p_1x14y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionDenuPen1"
                                                    for="listaNumeroCondicionDenuPen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCondicionDenuPen1"
                                                    binding="#{Persona2.helpInlineNumeroCondicionDenuPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_condicion_denu_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaRegistroDenunciaPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaRegistroDenunciaPen1}"
                                                    id="labelFechaRegistroDenunciaPen1"
                                                    for="campoFechaRegistroDenunciaPen1"
                                                    text="fecha registro denuncia pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaRegistroDenunciaPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaRegistroDenunciaPen1"
                                                    binding="#{Persona2.campoFechaRegistroDenunciaPen1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_registro_denuncia_pen']}"
                                                    toolTip="BundleParametros.fecha_registro_denuncia_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaRegistroDenunciaPen1Texto1"
                                                    binding="#{Persona2.campoFechaRegistroDenunciaPen1Texto1}"
                                                    converter="#{Persona2.converterFechaRegistroDenunciaPen1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_registro_denuncia_pen']}"/>
                                                <webuijsf:message id="messageFechaRegistroDenunciaPen1"
                                                    for="campoFechaRegistroDenunciaPen1"/>
                                                <webuijsf:helpInline id="helpInlineFechaRegistroDenunciaPen1"
                                                    binding="#{Persona2.helpInlineFechaRegistroDenunciaPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_registro_denuncia_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosRegistroDenuPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosRegistroDenuPen1}"
                                                    id="labelComentariosRegistroDenuPen1"
                                                    for="campoComentariosRegistroDenuPen1"
                                                    text="comentarios registro denu pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosRegistroDenuPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosRegistroDenuPen1"
                                                    binding="#{Persona2.campoComentariosRegistroDenuPen1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_registro_denu_pen']}"
                                                    toolTip="BundleParametros.comentarios_registro_denu_pen.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosRegistroDenuPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosRegistroDenuPen1Texto1"
                                                    binding="#{Persona2.campoComentariosRegistroDenuPen1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_registro_denu_pen']}"/>
                                                <webuijsf:message id="messageComentariosRegistroDenuPen1"
                                                    for="campoComentariosRegistroDenuPen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosRegistroDenuPen1"
                                                    binding="#{Persona2.helpInlineComentariosRegistroDenuPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_registro_denu_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaConfirmacionDenuPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaConfirmacionDenuPen1}"
                                                    id="labelFechaConfirmacionDenuPen1"
                                                    for="campoFechaConfirmacionDenuPen1"
                                                    text="fecha confirmacion denu pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaConfirmacionDenuPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaConfirmacionDenuPen1"
                                                    binding="#{Persona2.campoFechaConfirmacionDenuPen1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_confirmacion_denu_pen']}"
                                                    toolTip="BundleParametros.fecha_confirmacion_denu_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaConfirmacionDenuPen1Texto1"
                                                    binding="#{Persona2.campoFechaConfirmacionDenuPen1Texto1}"
                                                    converter="#{Persona2.converterFechaConfirmacionDenuPen1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_confirmacion_denu_pen']}"/>
                                                <webuijsf:message id="messageFechaConfirmacionDenuPen1"
                                                    for="campoFechaConfirmacionDenuPen1"/>
                                                <webuijsf:helpInline id="helpInlineFechaConfirmacionDenuPen1"
                                                    binding="#{Persona2.helpInlineFechaConfirmacionDenuPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_confirmacion_denu_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosConfDenuPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosConfDenuPen1}"
                                                    id="labelComentariosConfDenuPen1"
                                                    for="campoComentariosConfDenuPen1"
                                                    text="comentarios conf denu pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosConfDenuPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosConfDenuPen1"
                                                    binding="#{Persona2.campoComentariosConfDenuPen1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_conf_denu_pen']}"
                                                    toolTip="BundleParametros.comentarios_conf_denu_pen.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosConfDenuPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosConfDenuPen1Texto1"
                                                    binding="#{Persona2.campoComentariosConfDenuPen1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_conf_denu_pen']}"/>
                                                <webuijsf:message id="messageComentariosConfDenuPen1"
                                                    for="campoComentariosConfDenuPen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosConfDenuPen1"
                                                    binding="#{Persona2.helpInlineComentariosConfDenuPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_conf_denu_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaDesmentidoDenunciaPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaDesmentidoDenunciaPen1}"
                                                    id="labelFechaDesmentidoDenunciaPen1"
                                                    for="campoFechaDesmentidoDenunciaPen1"
                                                    text="fecha desmentido denuncia pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaDesmentidoDenunciaPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaDesmentidoDenunciaPen1"
                                                    binding="#{Persona2.campoFechaDesmentidoDenunciaPen1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_desmentido_denuncia_pen']}"
                                                    toolTip="BundleParametros.fecha_desmentido_denuncia_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaDesmentidoDenunciaPen1Texto1"
                                                    binding="#{Persona2.campoFechaDesmentidoDenunciaPen1Texto1}"
                                                    converter="#{Persona2.converterFechaDesmentidoDenunciaPen1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_desmentido_denuncia_pen']}"/>
                                                <webuijsf:message id="messageFechaDesmentidoDenunciaPen1"
                                                    for="campoFechaDesmentidoDenunciaPen1"/>
                                                <webuijsf:helpInline id="helpInlineFechaDesmentidoDenunciaPen1"
                                                    binding="#{Persona2.helpInlineFechaDesmentidoDenunciaPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_desmentido_denuncia_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosDesDenuPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosDesDenuPen1}"
                                                    id="labelComentariosDesDenuPen1"
                                                    for="campoComentariosDesDenuPen1"
                                                    text="comentarios des denu pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosDesDenuPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosDesDenuPen1"
                                                    binding="#{Persona2.campoComentariosDesDenuPen1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_des_denu_pen']}"
                                                    toolTip="BundleParametros.comentarios_des_denu_pen.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosDesDenuPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosDesDenuPen1Texto1"
                                                    binding="#{Persona2.campoComentariosDesDenuPen1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_des_denu_pen']}"/>
                                                <webuijsf:message id="messageComentariosDesDenuPen1"
                                                    for="campoComentariosDesDenuPen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosDesDenuPen1"
                                                    binding="#{Persona2.helpInlineComentariosDesDenuPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_des_denu_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaPersona1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdFichaPersona1}"
                                                    id="labelIdFichaPersona1"
                                                    for="campoIdFichaPersona1"
                                                    text="ficha"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFichaPersona1"
                                                    binding="#{Persona2.campoIdFichaPersona1}"
                                                    readOnly="true"
                                                    text="#{Persona2.asistente.textoCampoIdFichaPersona1}"
                                                    toolTip="#{Persona2.asistente.toolTipCampoIdFichaPersona1}"
                                                    validatorExpression="#{Persona2.campoIdFichaPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdFichaPersona1Texto1"
                                                    binding="#{Persona2.campoIdFichaPersona1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_ficha_persona_1x15y3']}"/>
                                                <webuijsf:button id="campoIdFichaPersona1Boton1"
                                                    binding="#{Persona2.campoIdFichaPersona1Boton1}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdFichaPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdFichaPersona1Boton3"
                                                    binding="#{Persona2.campoIdFichaPersona1Boton3}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdFichaPersona1Boton2}"
                                                    rendered="#{Persona2.asistente.campoIdFichaPersona1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdFichaPersona1"
                                                    binding="#{Persona2.helpInlineIdFichaPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_ficha_persona.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaPersona3" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdFichaPersona2}"
                                                    id="labelIdFichaPersona2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre ficha"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona4" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Persona2.campoIdFichaPersona1Texto2}"
                                                    text="#{Persona2.personaDataProvider.value['nombre_ficha_persona_1x15y4']}"
                                                    id="campoIdFichaPersona1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Persona2.campoIdFichaPersona1Boton2}"
                                                    id="campoIdFichaPersona1Boton2"
                                                    onClick="#{Persona2.asistente.scriptCampoIdFichaPersona1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaFichaPersona1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaFichaPersona1}"
                                                    id="labelFechaFichaPersona1"
                                                    for="campoFechaFichaPersona1"
                                                    text="fecha ficha"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaFichaPersona2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaFichaPersona1"
                                                    binding="#{Persona2.campoFechaFichaPersona1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_ficha_persona']}"
                                                    toolTip="BundleParametros.fecha_ficha_persona.persona"/>
                                                <webuijsf:staticText id="campoFechaFichaPersona1Texto1"
                                                    binding="#{Persona2.campoFechaFichaPersona1Texto1}"
                                                    converter="#{Persona2.converterFechaFichaPersona1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_ficha_persona']}"/>
                                                <webuijsf:message id="messageFechaFichaPersona1"
                                                    for="campoFechaFichaPersona1"/>
                                                <webuijsf:helpInline id="helpInlineFechaFichaPersona1"
                                                    binding="#{Persona2.helpInlineFechaFichaPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_ficha_persona.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIndiceCalidadVida1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIndiceCalidadVida1}"
                                                    id="labelIndiceCalidadVida1"
                                                    for="campoIndiceCalidadVida1"
                                                    text="indice calidad vida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIndiceCalidadVida2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIndiceCalidadVida1"
                                                    binding="#{Persona2.campoIndiceCalidadVida1}"
                                                    converter="#{Persona2.converterIndiceCalidadVida1}"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['indice_calidad_vida']}"
                                                    toolTip="BundleParametros.indice_calidad_vida.persona"
                                                    validatorExpression="#{Persona2.validatorIndiceCalidadVida1.validate}"/>
                                                <webuijsf:staticText id="campoIndiceCalidadVida1Texto1"
                                                    binding="#{Persona2.campoIndiceCalidadVida1Texto1}"
                                                    converter="#{Persona2.converterIndiceCalidadVida1}"
                                                    text="#{Persona2.personaDataProvider.value['indice_calidad_vida']}"/>
                                                <webuijsf:message id="messageIndiceCalidadVida1"
                                                    for="campoIndiceCalidadVida1"/>
                                                <webuijsf:helpInline id="helpInlineIndiceCalidadVida1"
                                                    binding="#{Persona2.helpInlineIndiceCalidadVida1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.indice_calidad_vida.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaUltimoCobroPension1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaUltimoCobroPension1}"
                                                    id="labelFechaUltimoCobroPension1"
                                                    for="campoFechaUltimoCobroPension1"
                                                    text="fecha ultimo cobro pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaUltimoCobroPension2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaUltimoCobroPension1"
                                                    binding="#{Persona2.campoFechaUltimoCobroPension1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_ultimo_cobro_pension']}"
                                                    toolTip="BundleParametros.fecha_ultimo_cobro_pension.persona"/>
                                                <webuijsf:staticText id="campoFechaUltimoCobroPension1Texto1"
                                                    binding="#{Persona2.campoFechaUltimoCobroPension1Texto1}"
                                                    converter="#{Persona2.converterFechaUltimoCobroPension1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_ultimo_cobro_pension']}"/>
                                                <webuijsf:message id="messageFechaUltimoCobroPension1"
                                                    for="campoFechaUltimoCobroPension1"/>
                                                <webuijsf:helpInline id="helpInlineFechaUltimoCobroPension1"
                                                    binding="#{Persona2.helpInlineFechaUltimoCobroPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_ultimo_cobro_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNotasAnulFecUltCobPen1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNotasAnulFecUltCobPen1}"
                                                    id="labelNotasAnulFecUltCobPen1"
                                                    for="campoNotasAnulFecUltCobPen1"
                                                    text="notas anul fec ult cob pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNotasAnulFecUltCobPen2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNotasAnulFecUltCobPen1"
                                                    binding="#{Persona2.campoNotasAnulFecUltCobPen1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['notas_anul_fec_ult_cob_pen']}"
                                                    toolTip="BundleParametros.notas_anul_fec_ult_cob_pen.persona"
                                                    validatorExpression="#{Persona2.validatorNotasAnulFecUltCobPen1.validate}"/>
                                                <webuijsf:staticText id="campoNotasAnulFecUltCobPen1Texto1"
                                                    binding="#{Persona2.campoNotasAnulFecUltCobPen1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['notas_anul_fec_ult_cob_pen']}"/>
                                                <webuijsf:message id="messageNotasAnulFecUltCobPen1"
                                                    for="campoNotasAnulFecUltCobPen1"/>
                                                <webuijsf:helpInline id="helpInlineNotasAnulFecUltCobPen1"
                                                    binding="#{Persona2.helpInlineNotasAnulFecUltCobPen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.notas_anul_fec_ult_cob_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoActJupe1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroTipoActJupe1}"
                                                    id="labelNumeroTipoActJupe1"
                                                    for="listaNumeroTipoActJupe1"
                                                    text="tipo act jupe"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoActJupe2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoActJupe1"
                                                    binding="#{Persona2.listaNumeroTipoActJupe1}"
                                                    converter="#{Persona2.converterNumeroTipoActJupe1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroTipoActJupe1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_tipo_act_jupe']}"
                                                    toolTip="BundleParametros.numero_tipo_act_jupe.persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoActJupe1Texto1"
                                                    binding="#{Persona2.listaNumeroTipoActJupe1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_tipo_act_jupe_1x16y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoActJupe1"
                                                    for="listaNumeroTipoActJupe1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoActJupe1"
                                                    binding="#{Persona2.helpInlineNumeroTipoActJupe1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_act_jupe.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraUltActJupe1" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaHoraUltActJupe1}"
                                                    id="labelFechaHoraUltActJupe1"
                                                    for="campoFechaHoraUltActJupe1"
                                                    text="fecha hora ult act jupe"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraUltActJupe2" rendered="#{Persona2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraUltActJupe1"
                                                    binding="#{Persona2.campoFechaHoraUltActJupe1}"
                                                    converter="#{Persona2.converterFechaHoraUltActJupe1}"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['fecha_hora_ult_act_jupe']}"
                                                    toolTip="BundleParametros.fecha_hora_ult_act_jupe.persona"/>
                                                <webuijsf:staticText id="campoFechaHoraUltActJupe1Texto1"
                                                    binding="#{Persona2.campoFechaHoraUltActJupe1Texto1}"
                                                    converter="#{Persona2.converterFechaHoraUltActJupe1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_hora_ult_act_jupe']}"/>
                                                <webuijsf:message id="messageFechaHoraUltActJupe1"
                                                    for="campoFechaHoraUltActJupe1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraUltActJupe1"
                                                    binding="#{Persona2.helpInlineFechaHoraUltActJupe1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_ult_act_jupe.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:tabSet
                                            id="tabSet1"
                                            lite="true"
                                            mini="true"
                                            rendered="#{Persona2.gestor.filaNoProcesada}"
                                            selected="tab1">
                                        <webuijsf:tab
                                            id="tab1"
                                            rendered="#{Persona2.asistente.seccionCedulaRendered}"
                                            text="cedula">
                                        <h:panelGrid
                                            id="gridPanel116"
                                            rendered="#{Persona2.asistente.seccionCedulaHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab1"
                                                text="#{Persona2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel117"
                                            rendered="#{Persona2.asistente.seccionCedulaRendered}">
                                            <h:panelGrid
                                                id="gridNumeroCedula1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroCedula1x1}"
                                                    id="labelNumeroCedula1x1"
                                                    for="campoNumeroCedula1x1"
                                                    text="numero cedula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCedula1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroCedula1x1"
                                                    binding="#{Persona2.campoNumeroCedula1x1}"
                                                    converter="#{Persona2.converterNumeroCedula1}"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Persona2.personaDataProvider.value['numero_cedula']}"
                                                    toolTip="BundleParametros.numero_cedula.persona"
                                                    validatorExpression="#{Persona2.validatorNumeroCedula1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedula1x1Texto1"
                                                    binding="#{Persona2.campoNumeroCedula1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['numero_cedula']}"/>
                                                <webuijsf:message id="messageNumeroCedula1x1"
                                                    for="campoNumeroCedula1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCedula1x1"
                                                    binding="#{Persona2.helpInlineNumeroCedula1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_cedula.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLetraCedula1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelLetraCedula1x1}"
                                                    id="labelLetraCedula1x1"
                                                    for="campoLetraCedula1x1"
                                                    text="letra cedula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLetraCedula1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoLetraCedula1x1"
                                                    binding="#{Persona2.campoLetraCedula1x1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}"
                                                    text="#{Persona2.personaDataProvider.value['letra_cedula']}"
                                                    toolTip="BundleParametros.letra_cedula.persona"
                                                    validatorExpression="#{Persona2.validatorLetraCedula1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedula1x1Texto1"
                                                    binding="#{Persona2.campoLetraCedula1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['letra_cedula']}"/>
                                                <webuijsf:message id="messageLetraCedula1x1"
                                                    for="campoLetraCedula1x1"/>
                                                <webuijsf:helpInline id="helpInlineLetraCedula1x1"
                                                    binding="#{Persona2.helpInlineLetraCedula1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.letra_cedula.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaExpedicionCedula1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaExpedicionCedula1x1}"
                                                    id="labelFechaExpedicionCedula1x1"
                                                    for="campoFechaExpedicionCedula1x1"
                                                    text="fecha expedicion cedula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaExpedicionCedula1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaExpedicionCedula1x1"
                                                    binding="#{Persona2.campoFechaExpedicionCedula1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_expedicion_cedula']}"
                                                    toolTip="BundleParametros.fecha_expedicion_cedula.persona"/>
                                                <webuijsf:staticText id="campoFechaExpedicionCedula1x1Texto1"
                                                    binding="#{Persona2.campoFechaExpedicionCedula1x1Texto1}"
                                                    converter="#{Persona2.converterFechaExpedicionCedula1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_expedicion_cedula']}"/>
                                                <webuijsf:message id="messageFechaExpedicionCedula1x1"
                                                    for="campoFechaExpedicionCedula1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaExpedicionCedula1x1"
                                                    binding="#{Persona2.helpInlineFechaExpedicionCedula1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_expedicion_cedula.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaVencimientoCedula1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaVencimientoCedula1x1}"
                                                    id="labelFechaVencimientoCedula1x1"
                                                    for="campoFechaVencimientoCedula1x1"
                                                    text="fecha vencimiento cedula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaVencimientoCedula1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaVencimientoCedula1x1"
                                                    binding="#{Persona2.campoFechaVencimientoCedula1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_vencimiento_cedula']}"
                                                    toolTip="BundleParametros.fecha_vencimiento_cedula.persona"/>
                                                <webuijsf:staticText id="campoFechaVencimientoCedula1x1Texto1"
                                                    binding="#{Persona2.campoFechaVencimientoCedula1x1Texto1}"
                                                    converter="#{Persona2.converterFechaVencimientoCedula1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_vencimiento_cedula']}"/>
                                                <webuijsf:message id="messageFechaVencimientoCedula1x1"
                                                    for="campoFechaVencimientoCedula1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaVencimientoCedula1x1"
                                                    binding="#{Persona2.helpInlineFechaVencimientoCedula1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_vencimiento_cedula.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab2"
                                            rendered="#{Persona2.asistente.seccionIdentificacionRendered}"
                                            text="identificacion">
                                        <h:panelGrid
                                            id="gridPanel118"
                                            rendered="#{Persona2.asistente.seccionIdentificacionHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab2"
                                                text="#{Persona2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel119"
                                            rendered="#{Persona2.asistente.seccionIdentificacionRendered}">
                                            <h:panelGrid
                                                id="gridPrimerNombre1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelPrimerNombre1x1}"
                                                    id="labelPrimerNombre1x1"
                                                    for="campoPrimerNombre1x1"
                                                    text="primer nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerNombre1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoPrimerNombre1x1"
                                                    binding="#{Persona2.campoPrimerNombre1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Persona2.personaDataProvider.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.persona"
                                                    validatorExpression="#{Persona2.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1x1Texto1"
                                                    binding="#{Persona2.campoPrimerNombre1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1x1"
                                                    for="campoPrimerNombre1x1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerNombre1x1"
                                                    binding="#{Persona2.helpInlinePrimerNombre1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_nombre.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoNombre1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelSegundoNombre1x1}"
                                                    id="labelSegundoNombre1x1"
                                                    for="campoSegundoNombre1x1"
                                                    text="segundo nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoNombre1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoSegundoNombre1x1"
                                                    binding="#{Persona2.campoSegundoNombre1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.personaDataProvider.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.persona"
                                                    validatorExpression="#{Persona2.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1x1Texto1"
                                                    binding="#{Persona2.campoSegundoNombre1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1x1"
                                                    for="campoSegundoNombre1x1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoNombre1x1"
                                                    binding="#{Persona2.helpInlineSegundoNombre1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_nombre.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPrimerApellido1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelPrimerApellido1x1}"
                                                    id="labelPrimerApellido1x1"
                                                    for="campoPrimerApellido1x1"
                                                    text="primer apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerApellido1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoPrimerApellido1x1"
                                                    binding="#{Persona2.campoPrimerApellido1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    text="#{Persona2.personaDataProvider.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.persona"
                                                    validatorExpression="#{Persona2.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1x1Texto1"
                                                    binding="#{Persona2.campoPrimerApellido1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1x1"
                                                    for="campoPrimerApellido1x1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerApellido1x1"
                                                    binding="#{Persona2.helpInlinePrimerApellido1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_apellido.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoApellido1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelSegundoApellido1x1}"
                                                    id="labelSegundoApellido1x1"
                                                    for="campoSegundoApellido1x1"
                                                    text="segundo apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoApellido1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoSegundoApellido1x1"
                                                    binding="#{Persona2.campoSegundoApellido1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.personaDataProvider.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.persona"
                                                    validatorExpression="#{Persona2.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1x1Texto1"
                                                    binding="#{Persona2.campoSegundoApellido1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1x1"
                                                    for="campoSegundoApellido1x1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoApellido1x1"
                                                    binding="#{Persona2.helpInlineSegundoApellido1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_apellido.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridApellidoCasada1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelApellidoCasada1x1}"
                                                    id="labelApellidoCasada1x1"
                                                    for="campoApellidoCasada1x1"
                                                    text="apellido casada"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridApellidoCasada1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoApellidoCasada1x1"
                                                    binding="#{Persona2.campoApellidoCasada1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.personaDataProvider.value['apellido_casada']}"
                                                    toolTip="BundleParametros.apellido_casada.persona"
                                                    validatorExpression="#{Persona2.validatorApellidoCasada1.validate}"/>
                                                <webuijsf:staticText id="campoApellidoCasada1x1Texto1"
                                                    binding="#{Persona2.campoApellidoCasada1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['apellido_casada']}"/>
                                                <webuijsf:message id="messageApellidoCasada1x1"
                                                    for="campoApellidoCasada1x1"/>
                                                <webuijsf:helpInline id="helpInlineApellidoCasada1x1"
                                                    binding="#{Persona2.helpInlineApellidoCasada1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.apellido_casada.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridApodo1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelApodo1x1}"
                                                    id="labelApodo1x1"
                                                    for="campoApodo1x1"
                                                    text="apodo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridApodo1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoApodo1x1"
                                                    binding="#{Persona2.campoApodo1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.personaDataProvider.value['apodo']}"
                                                    toolTip="BundleParametros.apodo.persona"
                                                    validatorExpression="#{Persona2.validatorApodo1.validate}"/>
                                                <webuijsf:staticText id="campoApodo1x1Texto1"
                                                    binding="#{Persona2.campoApodo1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['apodo']}"/>
                                                <webuijsf:message id="messageApodo1x1"
                                                    for="campoApodo1x1"/>
                                                <webuijsf:helpInline id="helpInlineApodo1x1"
                                                    binding="#{Persona2.helpInlineApodo1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.apodo.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaNacimiento1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaNacimiento1x1}"
                                                    id="labelFechaNacimiento1x1"
                                                    for="campoFechaNacimiento1x1"
                                                    text="fecha nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaNacimiento1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaNacimiento1x1"
                                                    binding="#{Persona2.campoFechaNacimiento1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_nacimiento']}"
                                                    toolTip="BundleParametros.fecha_nacimiento.persona"/>
                                                <webuijsf:staticText id="campoFechaNacimiento1x1Texto1"
                                                    binding="#{Persona2.campoFechaNacimiento1x1Texto1}"
                                                    converter="#{Persona2.converterFechaNacimiento1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_nacimiento']}"/>
                                                <webuijsf:message id="messageFechaNacimiento1x1"
                                                    for="campoFechaNacimiento1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaNacimiento1x1"
                                                    binding="#{Persona2.helpInlineFechaNacimiento1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_nacimiento.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSexoPersona1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroSexoPersona1x1}"
                                                    id="labelNumeroSexoPersona1x1"
                                                    for="listaNumeroSexoPersona1x1"
                                                    text="sexo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSexoPersona1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSexoPersona1x1"
                                                    binding="#{Persona2.listaNumeroSexoPersona1x1}"
                                                    converter="#{Persona2.converterNumeroSexoPersona1}"
                                                    disabled="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroSexoPersona1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_sexo_persona']}"
                                                    toolTip="BundleParametros.numero_sexo_persona.persona"/>
                                                <webuijsf:staticText id="listaNumeroSexoPersona1x1Texto1"
                                                    binding="#{Persona2.listaNumeroSexoPersona1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_sexo_persona_1x1y2']}"/>
                                                <webuijsf:message id="messageNumeroSexoPersona1x1"
                                                    for="listaNumeroSexoPersona1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSexoPersona1x1"
                                                    binding="#{Persona2.helpInlineNumeroSexoPersona1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_sexo_persona.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroEstadoCivil1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroEstadoCivil1x1}"
                                                    id="labelNumeroEstadoCivil1x1"
                                                    for="listaNumeroEstadoCivil1x1"
                                                    text="estado civil"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroEstadoCivil1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroEstadoCivil1x1"
                                                    binding="#{Persona2.listaNumeroEstadoCivil1x1}"
                                                    converter="#{Persona2.converterNumeroEstadoCivil1}"
                                                    disabled="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroEstadoCivil1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_estado_civil']}"
                                                    toolTip="BundleParametros.numero_estado_civil.persona"/>
                                                <webuijsf:staticText id="listaNumeroEstadoCivil1x1Texto1"
                                                    binding="#{Persona2.listaNumeroEstadoCivil1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_estado_civil_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroEstadoCivil1x1"
                                                    for="listaNumeroEstadoCivil1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroEstadoCivil1x1"
                                                    binding="#{Persona2.helpInlineNumeroEstadoCivil1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_estado_civil.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab3"
                                            rendered="#{Persona2.asistente.seccionOrigenRendered}"
                                            text="origen">
                                        <h:panelGrid
                                            id="gridPanel120"
                                            rendered="#{Persona2.asistente.seccionOrigenHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab3"
                                                text="#{Persona2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel121"
                                            rendered="#{Persona2.asistente.seccionOrigenRendered}">
                                            <h:panelGrid
                                                id="gridEsParaguayoNatural1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsParaguayoNatural1x1}"
                                                    id="labelEsParaguayoNatural1x1"
                                                    for="listaEsParaguayoNatural1x1"
                                                    text="paraguayo natural"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsParaguayoNatural1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsParaguayoNatural1x1"
                                                    binding="#{Persona2.listaEsParaguayoNatural1x1}"
                                                    converter="#{Persona2.converterEsParaguayoNatural1}"
                                                    disabled="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Persona2.asistente.opcionesListaEsParaguayoNatural1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_paraguayo_natural']}"
                                                    toolTip="BundleParametros.es_paraguayo_natural.persona"/>
                                                <webuijsf:staticText id="listaEsParaguayoNatural1x1Texto1"
                                                    binding="#{Persona2.listaEsParaguayoNatural1x1Texto1}"/>
                                                <webuijsf:message id="messageEsParaguayoNatural1x1"
                                                    for="listaEsParaguayoNatural1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsParaguayoNatural1x1"
                                                    binding="#{Persona2.helpInlineEsParaguayoNatural1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_paraguayo_natural.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsIndigena1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsIndigena1x1}"
                                                    id="labelEsIndigena1x1"
                                                    for="listaEsIndigena1x1"
                                                    text="indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsIndigena1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsIndigena1x1"
                                                    binding="#{Persona2.listaEsIndigena1x1}"
                                                    converter="#{Persona2.converterEsIndigena1}"
                                                    disabled="#{Persona2.gestor.filaNoProcesada}" required="true"
                                                    items="#{Persona2.asistente.opcionesListaEsIndigena1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_indigena']}"
                                                    toolTip="BundleParametros.es_indigena.persona"/>
                                                <webuijsf:staticText id="listaEsIndigena1x1Texto1"
                                                    binding="#{Persona2.listaEsIndigena1x1Texto1}"/>
                                                <webuijsf:message id="messageEsIndigena1x1"
                                                    for="listaEsIndigena1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsIndigena1x1"
                                                    binding="#{Persona2.helpInlineEsIndigena1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_indigena.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdEtniaIndigena1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdEtniaIndigena1x1}"
                                                    id="labelIdEtniaIndigena1x1"
                                                    for="campoIdEtniaIndigena1x1"
                                                    text="etnia indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdEtniaIndigena1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdEtniaIndigena1x1"
                                                    binding="#{Persona2.campoIdEtniaIndigena1x1}"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}"
                                                    text="#{Persona2.asistente.textoCampoIdEtniaIndigena1}"
                                                    toolTip="#{Persona2.asistente.toolTipCampoIdEtniaIndigena1}"
                                                    validatorExpression="#{Persona2.campoIdEtniaIndigena1_validate}"/>
                                                <webuijsf:staticText id="campoIdEtniaIndigena1x1Texto1"
                                                    binding="#{Persona2.campoIdEtniaIndigena1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_etnia_indigena_1x3y3']}"/>
                                                <webuijsf:button id="campoIdEtniaIndigena1x1Boton1"
                                                    binding="#{Persona2.campoIdEtniaIndigena1x1Boton1}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdEtniaIndigena1Boton1}"/>
                                                <webuijsf:button id="campoIdEtniaIndigena1x1Boton3"
                                                    binding="#{Persona2.campoIdEtniaIndigena1x1Boton3}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdEtniaIndigena1Boton2}"
                                                    rendered="#{Persona2.asistente.campoIdEtniaIndigena1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdEtniaIndigena1x1"
                                                    for="campoIdEtniaIndigena1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdEtniaIndigena1x1"
                                                    binding="#{Persona2.helpInlineIdEtniaIndigena1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_etnia_indigena.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdEtniaIndigena1x3"
                                                rendered="#{Persona2.asistente.campoIdEtniaIndigena1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdEtniaIndigena1x2}"
                                                    id="labelIdEtniaIndigena1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre etnia indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdEtniaIndigena1x4"
                                                rendered="#{Persona2.asistente.campoIdEtniaIndigena1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Persona2.campoIdEtniaIndigena1x1Texto2}"
                                                    text="#{Persona2.personaDataProvider.value['nombre_etnia_indigena_1x3y4']}"
                                                    id="campoIdEtniaIndigena1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Persona2.campoIdEtniaIndigena1x1Boton2}"
                                                    id="campoIdEtniaIndigena1x1Boton2"
                                                    onClick="#{Persona2.asistente.scriptCampoIdEtniaIndigena1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreComunidadIndigena1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNombreComunidadIndigena1x1}"
                                                    id="labelNombreComunidadIndigena1x1"
                                                    for="campoNombreComunidadIndigena1x1"
                                                    text="nombre comunidad indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreComunidadIndigena1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreComunidadIndigena1x1"
                                                    binding="#{Persona2.campoNombreComunidadIndigena1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Persona2.gestor.filaNoProcesada}"
                                                    text="#{Persona2.personaDataProvider.value['nombre_comunidad_indigena']}"
                                                    toolTip="BundleParametros.nombre_comunidad_indigena.persona"
                                                    validatorExpression="#{Persona2.validatorNombreComunidadIndigena1.validate}"/>
                                                <webuijsf:staticText id="campoNombreComunidadIndigena1x1Texto1"
                                                    binding="#{Persona2.campoNombreComunidadIndigena1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['nombre_comunidad_indigena']}"/>
                                                <webuijsf:message id="messageNombreComunidadIndigena1x1"
                                                    for="campoNombreComunidadIndigena1x1"/>
                                                <webuijsf:helpInline id="helpInlineNombreComunidadIndigena1x1"
                                                    binding="#{Persona2.helpInlineNombreComunidadIndigena1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_comunidad_indigena.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab4"
                                            rendered="#{Persona2.asistente.seccionContactoRendered}"
                                            text="contacto">
                                        <h:panelGrid
                                            id="gridPanel122"
                                            rendered="#{Persona2.asistente.seccionContactoHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab4"
                                                text="#{Persona2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel123"
                                            rendered="#{Persona2.asistente.seccionContactoRendered}">
                                            <h:panelGrid
                                                id="gridIdDepartamento1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdDepartamento1x1}"
                                                    id="labelIdDepartamento1x1"
                                                    for="campoIdDepartamento1x1"
                                                    text="departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDepartamento1x1"
                                                    binding="#{Persona2.campoIdDepartamento1x1}"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.asistente.textoCampoIdDepartamento1}"
                                                    toolTip="#{Persona2.asistente.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{Persona2.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1x1Texto1"
                                                    binding="#{Persona2.campoIdDepartamento1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_ubicacion_1x4y3']}"/>
                                                <webuijsf:button id="campoIdDepartamento1x1Boton1"
                                                    binding="#{Persona2.campoIdDepartamento1x1Boton1}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button id="campoIdDepartamento1x1Boton3"
                                                    binding="#{Persona2.campoIdDepartamento1x1Boton3}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{Persona2.asistente.campoIdDepartamento1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDepartamento1x1"
                                                    for="campoIdDepartamento1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdDepartamento1x1"
                                                    binding="#{Persona2.helpInlineIdDepartamento1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_departamento.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento1x3"
                                                rendered="#{Persona2.asistente.campoIdDepartamento1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdDepartamento1x2}"
                                                    id="labelIdDepartamento1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento1x4"
                                                rendered="#{Persona2.asistente.campoIdDepartamento1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Persona2.campoIdDepartamento1x1Texto2}"
                                                    text="#{Persona2.personaDataProvider.value['nombre_ubicacion_1x4y4']}"
                                                    id="campoIdDepartamento1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Persona2.campoIdDepartamento1x1Boton2}"
                                                    id="campoIdDepartamento1x1Boton2"
                                                    onClick="#{Persona2.asistente.scriptCampoIdDepartamento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdDistrito1x1}"
                                                    id="labelIdDistrito1x1"
                                                    for="campoIdDistrito1x1"
                                                    text="distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDistrito1x1"
                                                    binding="#{Persona2.campoIdDistrito1x1}"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.asistente.textoCampoIdDistrito1}"
                                                    toolTip="#{Persona2.asistente.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{Persona2.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1x1Texto1"
                                                    binding="#{Persona2.campoIdDistrito1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_ubicacion_1x5y3']}"/>
                                                <webuijsf:button id="campoIdDistrito1x1Boton1"
                                                    binding="#{Persona2.campoIdDistrito1x1Boton1}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button id="campoIdDistrito1x1Boton3"
                                                    binding="#{Persona2.campoIdDistrito1x1Boton3}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{Persona2.asistente.campoIdDistrito1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDistrito1x1"
                                                    for="campoIdDistrito1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdDistrito1x1"
                                                    binding="#{Persona2.helpInlineIdDistrito1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_distrito.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito1x3"
                                                rendered="#{Persona2.asistente.campoIdDistrito1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdDistrito1x2}"
                                                    id="labelIdDistrito1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito1x4"
                                                rendered="#{Persona2.asistente.campoIdDistrito1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Persona2.campoIdDistrito1x1Texto2}"
                                                    text="#{Persona2.personaDataProvider.value['nombre_ubicacion_1x5y4']}"
                                                    id="campoIdDistrito1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Persona2.campoIdDistrito1x1Boton2}"
                                                    id="campoIdDistrito1x1Boton2"
                                                    onClick="#{Persona2.asistente.scriptCampoIdDistrito1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoArea1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroTipoArea1x1}"
                                                    id="labelNumeroTipoArea1x1"
                                                    for="listaNumeroTipoArea1x1"
                                                    text="tipo area"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoArea1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoArea1x1"
                                                    binding="#{Persona2.listaNumeroTipoArea1x1}"
                                                    converter="#{Persona2.converterNumeroTipoArea1}"
                                                    disabled="#{Persona2.gestor.filaNoModificada}"
                                                    items="#{Persona2.asistente.opcionesListaNumeroTipoArea1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_tipo_area']}"
                                                    toolTip="BundleParametros.numero_tipo_area.persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoArea1x1Texto1"
                                                    binding="#{Persona2.listaNumeroTipoArea1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_tipo_area_1x6y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoArea1x1"
                                                    for="listaNumeroTipoArea1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoArea1x1"
                                                    binding="#{Persona2.helpInlineNumeroTipoArea1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_area.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdBarrio1x1}"
                                                    id="labelIdBarrio1x1"
                                                    for="campoIdBarrio1x1"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdBarrio1x1"
                                                    binding="#{Persona2.campoIdBarrio1x1}"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.asistente.textoCampoIdBarrio1}"
                                                    toolTip="#{Persona2.asistente.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{Persona2.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1x1Texto1"
                                                    binding="#{Persona2.campoIdBarrio1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_ubicacion_1x7y3']}"/>
                                                <webuijsf:button id="campoIdBarrio1x1Boton1"
                                                    binding="#{Persona2.campoIdBarrio1x1Boton1}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button id="campoIdBarrio1x1Boton3"
                                                    binding="#{Persona2.campoIdBarrio1x1Boton3}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{Persona2.asistente.campoIdBarrio1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdBarrio1x1"
                                                    for="campoIdBarrio1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdBarrio1x1"
                                                    binding="#{Persona2.helpInlineIdBarrio1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_barrio.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio1x3"
                                                rendered="#{Persona2.asistente.campoIdBarrio1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdBarrio1x2}"
                                                    id="labelIdBarrio1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio1x4"
                                                rendered="#{Persona2.asistente.campoIdBarrio1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Persona2.campoIdBarrio1x1Texto2}"
                                                    text="#{Persona2.personaDataProvider.value['nombre_ubicacion_1x7y4']}"
                                                    id="campoIdBarrio1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Persona2.campoIdBarrio1x1Boton2}"
                                                    id="campoIdBarrio1x1Boton2"
                                                    onClick="#{Persona2.asistente.scriptCampoIdBarrio1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDireccion1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelDireccion1x1}"
                                                    id="labelDireccion1x1"
                                                    for="campoDireccion1x1"
                                                    text="direccion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDireccion1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDireccion1x1"
                                                    binding="#{Persona2.campoDireccion1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.personaDataProvider.value['direccion']}"
                                                    toolTip="BundleParametros.direccion.persona"
                                                    validatorExpression="#{Persona2.validatorDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoDireccion1x1Texto1"
                                                    binding="#{Persona2.campoDireccion1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['direccion']}"/>
                                                <webuijsf:message id="messageDireccion1x1"
                                                    for="campoDireccion1x1"/>
                                                <webuijsf:helpInline id="helpInlineDireccion1x1"
                                                    binding="#{Persona2.helpInlineDireccion1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.direccion.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTelefonoLineaBaja1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroTelefonoLineaBaja1x1}"
                                                    id="labelNumeroTelefonoLineaBaja1x1"
                                                    for="campoNumeroTelefonoLineaBaja1x1"
                                                    text="numero telefono linea baja"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTelefonoLineaBaja1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroTelefonoLineaBaja1x1"
                                                    binding="#{Persona2.campoNumeroTelefonoLineaBaja1x1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.personaDataProvider.value['numero_telefono_linea_baja']}"
                                                    toolTip="BundleParametros.numero_telefono_linea_baja.persona"
                                                    validatorExpression="#{Persona2.validatorNumeroTelefonoLineaBaja1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoLineaBaja1x1Texto1"
                                                    binding="#{Persona2.campoNumeroTelefonoLineaBaja1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['numero_telefono_linea_baja']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoLineaBaja1x1"
                                                    for="campoNumeroTelefonoLineaBaja1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTelefonoLineaBaja1x1"
                                                    binding="#{Persona2.helpInlineNumeroTelefonoLineaBaja1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_telefono_linea_baja.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTelefonoCelular1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroTelefonoCelular1x1}"
                                                    id="labelNumeroTelefonoCelular1x1"
                                                    for="campoNumeroTelefonoCelular1x1"
                                                    text="numero telefono celular"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTelefonoCelular1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroTelefonoCelular1x1"
                                                    binding="#{Persona2.campoNumeroTelefonoCelular1x1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{Persona2.gestor.filaNoModificada}"
                                                    text="#{Persona2.personaDataProvider.value['numero_telefono_celular']}"
                                                    toolTip="BundleParametros.numero_telefono_celular.persona"
                                                    validatorExpression="#{Persona2.validatorNumeroTelefonoCelular1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoCelular1x1Texto1"
                                                    binding="#{Persona2.campoNumeroTelefonoCelular1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['numero_telefono_celular']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoCelular1x1"
                                                    for="campoNumeroTelefonoCelular1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTelefonoCelular1x1"
                                                    binding="#{Persona2.helpInlineNumeroTelefonoCelular1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_telefono_celular.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab5"
                                            rendered="#{Persona2.asistente.seccionRegistroRendered}"
                                            text="registro">
                                        <h:panelGrid
                                            id="gridPanel124"
                                            rendered="#{Persona2.asistente.seccionRegistroHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab5"
                                                text="#{Persona2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel125"
                                            rendered="#{Persona2.asistente.seccionRegistroRendered}">
                                            <h:panelGrid
                                                id="gridCertificadoVida1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelCertificadoVida1x1}"
                                                    id="labelCertificadoVida1x1"
                                                    for="campoCertificadoVida1x1"
                                                    text="certificado vida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCertificadoVida1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCertificadoVida1x1"
                                                    binding="#{Persona2.campoCertificadoVida1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['certificado_vida']}"
                                                    toolTip="BundleParametros.certificado_vida.persona"
                                                    validatorExpression="#{Persona2.validatorCertificadoVida1.validate}"/>
                                                <webuijsf:staticText id="campoCertificadoVida1x1Texto1"
                                                    binding="#{Persona2.campoCertificadoVida1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['certificado_vida']}"/>
                                                <webuijsf:message id="messageCertificadoVida1x1"
                                                    for="campoCertificadoVida1x1"/>
                                                <webuijsf:helpInline id="helpInlineCertificadoVida1x1"
                                                    binding="#{Persona2.helpInlineCertificadoVida1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.certificado_vida.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaCertificadoVida1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaCertificadoVida1x1}"
                                                    id="labelFechaCertificadoVida1x1"
                                                    for="campoFechaCertificadoVida1x1"
                                                    text="fecha certificado vida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaCertificadoVida1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaCertificadoVida1x1"
                                                    binding="#{Persona2.campoFechaCertificadoVida1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_certificado_vida']}"
                                                    toolTip="BundleParametros.fecha_certificado_vida.persona"/>
                                                <webuijsf:staticText id="campoFechaCertificadoVida1x1Texto1"
                                                    binding="#{Persona2.campoFechaCertificadoVida1x1Texto1}"
                                                    converter="#{Persona2.converterFechaCertificadoVida1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_certificado_vida']}"/>
                                                <webuijsf:message id="messageFechaCertificadoVida1x1"
                                                    for="campoFechaCertificadoVida1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaCertificadoVida1x1"
                                                    binding="#{Persona2.helpInlineFechaCertificadoVida1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_certificado_vida.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsCertificadoVidaAnulado1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsCertificadoVidaAnulado1x1}"
                                                    id="labelEsCertificadoVidaAnulado1x1"
                                                    for="listaEsCertificadoVidaAnulado1x1"
                                                    text="certificado vida anulado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsCertificadoVidaAnulado1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsCertificadoVidaAnulado1x1"
                                                    binding="#{Persona2.listaEsCertificadoVidaAnulado1x1}"
                                                    converter="#{Persona2.converterEsCertificadoVidaAnulado1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsCertificadoVidaAnulado1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_certificado_vida_anulado']}"
                                                    toolTip="BundleParametros.es_certificado_vida_anulado.persona"/>
                                                <webuijsf:staticText id="listaEsCertificadoVidaAnulado1x1Texto1"
                                                    binding="#{Persona2.listaEsCertificadoVidaAnulado1x1Texto1}"/>
                                                <webuijsf:message id="messageEsCertificadoVidaAnulado1x1"
                                                    for="listaEsCertificadoVidaAnulado1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsCertificadoVidaAnulado1x1"
                                                    binding="#{Persona2.helpInlineEsCertificadoVidaAnulado1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_certificado_vida_anulado.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosAnulCerVida1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosAnulCerVida1x1}"
                                                    id="labelComentariosAnulCerVida1x1"
                                                    for="campoComentariosAnulCerVida1x1"
                                                    text="comentarios anul cer vida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosAnulCerVida1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosAnulCerVida1x1"
                                                    binding="#{Persona2.campoComentariosAnulCerVida1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_anul_cer_vida']}"
                                                    toolTip="BundleParametros.comentarios_anul_cer_vida.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosAnulCerVida1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAnulCerVida1x1Texto1"
                                                    binding="#{Persona2.campoComentariosAnulCerVida1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_anul_cer_vida']}"/>
                                                <webuijsf:message id="messageComentariosAnulCerVida1x1"
                                                    for="campoComentariosAnulCerVida1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosAnulCerVida1x1"
                                                    binding="#{Persona2.helpInlineComentariosAnulCerVida1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_anul_cer_vida.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCertificadoDefuncion1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelCertificadoDefuncion1x1}"
                                                    id="labelCertificadoDefuncion1x1"
                                                    for="campoCertificadoDefuncion1x1"
                                                    text="certificado defuncion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCertificadoDefuncion1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCertificadoDefuncion1x1"
                                                    binding="#{Persona2.campoCertificadoDefuncion1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['certificado_defuncion']}"
                                                    toolTip="BundleParametros.certificado_defuncion.persona"
                                                    validatorExpression="#{Persona2.validatorCertificadoDefuncion1.validate}"/>
                                                <webuijsf:staticText id="campoCertificadoDefuncion1x1Texto1"
                                                    binding="#{Persona2.campoCertificadoDefuncion1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['certificado_defuncion']}"/>
                                                <webuijsf:message id="messageCertificadoDefuncion1x1"
                                                    for="campoCertificadoDefuncion1x1"/>
                                                <webuijsf:helpInline id="helpInlineCertificadoDefuncion1x1"
                                                    binding="#{Persona2.helpInlineCertificadoDefuncion1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.certificado_defuncion.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaCertificadoDefuncion1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaCertificadoDefuncion1x1}"
                                                    id="labelFechaCertificadoDefuncion1x1"
                                                    for="campoFechaCertificadoDefuncion1x1"
                                                    text="fecha certificado defuncion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaCertificadoDefuncion1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaCertificadoDefuncion1x1"
                                                    binding="#{Persona2.campoFechaCertificadoDefuncion1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_certificado_defuncion']}"
                                                    toolTip="BundleParametros.fecha_certificado_defuncion.persona"/>
                                                <webuijsf:staticText id="campoFechaCertificadoDefuncion1x1Texto1"
                                                    binding="#{Persona2.campoFechaCertificadoDefuncion1x1Texto1}"
                                                    converter="#{Persona2.converterFechaCertificadoDefuncion1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_certificado_defuncion']}"/>
                                                <webuijsf:message id="messageFechaCertificadoDefuncion1x1"
                                                    for="campoFechaCertificadoDefuncion1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaCertificadoDefuncion1x1"
                                                    binding="#{Persona2.helpInlineFechaCertificadoDefuncion1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_certificado_defuncion.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsCerDefuncionAnulado1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsCerDefuncionAnulado1x1}"
                                                    id="labelEsCerDefuncionAnulado1x1"
                                                    for="listaEsCerDefuncionAnulado1x1"
                                                    text="cer defuncion anulado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsCerDefuncionAnulado1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsCerDefuncionAnulado1x1"
                                                    binding="#{Persona2.listaEsCerDefuncionAnulado1x1}"
                                                    converter="#{Persona2.converterEsCerDefuncionAnulado1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsCerDefuncionAnulado1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_cer_defuncion_anulado']}"
                                                    toolTip="BundleParametros.es_cer_defuncion_anulado.persona"/>
                                                <webuijsf:staticText id="listaEsCerDefuncionAnulado1x1Texto1"
                                                    binding="#{Persona2.listaEsCerDefuncionAnulado1x1Texto1}"/>
                                                <webuijsf:message id="messageEsCerDefuncionAnulado1x1"
                                                    for="listaEsCerDefuncionAnulado1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsCerDefuncionAnulado1x1"
                                                    binding="#{Persona2.helpInlineEsCerDefuncionAnulado1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_cer_defuncion_anulado.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosAnulCerDefuncion1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosAnulCerDefuncion1x1}"
                                                    id="labelComentariosAnulCerDefuncion1x1"
                                                    for="campoComentariosAnulCerDefuncion1x1"
                                                    text="comentarios anul cer defuncion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosAnulCerDefuncion1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosAnulCerDefuncion1x1"
                                                    binding="#{Persona2.campoComentariosAnulCerDefuncion1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_anul_cer_defuncion']}"
                                                    toolTip="BundleParametros.comentarios_anul_cer_defuncion.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosAnulCerDefuncion1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAnulCerDefuncion1x1Texto1"
                                                    binding="#{Persona2.campoComentariosAnulCerDefuncion1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_anul_cer_defuncion']}"/>
                                                <webuijsf:message id="messageComentariosAnulCerDefuncion1x1"
                                                    for="campoComentariosAnulCerDefuncion1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosAnulCerDefuncion1x1"
                                                    binding="#{Persona2.helpInlineComentariosAnulCerDefuncion1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_anul_cer_defuncion.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab6"
                                            rendered="#{Persona2.asistente.seccionPension1Rendered}"
                                            text="pension 1">
                                        <h:panelGrid
                                            id="gridPanel126"
                                            rendered="#{Persona2.asistente.seccionPension1Hidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab6"
                                                text="#{Persona2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel127"
                                            rendered="#{Persona2.asistente.seccionPension1Rendered}">
                                            <h:panelGrid
                                                id="gridEsPersonaConEmpleo1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaConEmpleo1x1}"
                                                    id="labelEsPersonaConEmpleo1x1"
                                                    for="listaEsPersonaConEmpleo1x1"
                                                    text="con empleo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConEmpleo1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConEmpleo1x1"
                                                    binding="#{Persona2.listaEsPersonaConEmpleo1x1}"
                                                    converter="#{Persona2.converterEsPersonaConEmpleo1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaConEmpleo1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_con_empleo']}"
                                                    toolTip="BundleParametros.es_persona_con_empleo.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConEmpleo1x1Texto1"
                                                    binding="#{Persona2.listaEsPersonaConEmpleo1x1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConEmpleo1x1"
                                                    for="listaEsPersonaConEmpleo1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConEmpleo1x1"
                                                    binding="#{Persona2.helpInlineEsPersonaConEmpleo1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_empleo.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConJubilacion1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaConJubilacion1x1}"
                                                    id="labelEsPersonaConJubilacion1x1"
                                                    for="listaEsPersonaConJubilacion1x1"
                                                    text="con jubilacion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConJubilacion1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConJubilacion1x1"
                                                    binding="#{Persona2.listaEsPersonaConJubilacion1x1}"
                                                    converter="#{Persona2.converterEsPersonaConJubilacion1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaConJubilacion1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_con_jubilacion']}"
                                                    toolTip="BundleParametros.es_persona_con_jubilacion.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConJubilacion1x1Texto1"
                                                    binding="#{Persona2.listaEsPersonaConJubilacion1x1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConJubilacion1x1"
                                                    for="listaEsPersonaConJubilacion1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConJubilacion1x1"
                                                    binding="#{Persona2.helpInlineEsPersonaConJubilacion1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_jubilacion.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaConPension1x1}"
                                                    id="labelEsPersonaConPension1x1"
                                                    for="listaEsPersonaConPension1x1"
                                                    text="con pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConPension1x1"
                                                    binding="#{Persona2.listaEsPersonaConPension1x1}"
                                                    converter="#{Persona2.converterEsPersonaConPension1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaConPension1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_con_pension']}"
                                                    toolTip="BundleParametros.es_persona_con_pension.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConPension1x1Texto1"
                                                    binding="#{Persona2.listaEsPersonaConPension1x1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConPension1x1"
                                                    for="listaEsPersonaConPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConPension1x1"
                                                    binding="#{Persona2.helpInlineEsPersonaConPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConSubsidio1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaConSubsidio1x1}"
                                                    id="labelEsPersonaConSubsidio1x1"
                                                    for="listaEsPersonaConSubsidio1x1"
                                                    text="con subsidio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConSubsidio1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConSubsidio1x1"
                                                    binding="#{Persona2.listaEsPersonaConSubsidio1x1}"
                                                    converter="#{Persona2.converterEsPersonaConSubsidio1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaConSubsidio1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_con_subsidio']}"
                                                    toolTip="BundleParametros.es_persona_con_subsidio.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConSubsidio1x1Texto1"
                                                    binding="#{Persona2.listaEsPersonaConSubsidio1x1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConSubsidio1x1"
                                                    for="listaEsPersonaConSubsidio1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConSubsidio1x1"
                                                    binding="#{Persona2.helpInlineEsPersonaConSubsidio1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_subsidio.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConDeuda1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaConDeuda1x1}"
                                                    id="labelEsPersonaConDeuda1x1"
                                                    for="listaEsPersonaConDeuda1x1"
                                                    text="con deuda"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConDeuda1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConDeuda1x1"
                                                    binding="#{Persona2.listaEsPersonaConDeuda1x1}"
                                                    converter="#{Persona2.converterEsPersonaConDeuda1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaConDeuda1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_con_deuda']}"
                                                    toolTip="BundleParametros.es_persona_con_deuda.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConDeuda1x1Texto1"
                                                    binding="#{Persona2.listaEsPersonaConDeuda1x1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConDeuda1x1"
                                                    for="listaEsPersonaConDeuda1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConDeuda1x1"
                                                    binding="#{Persona2.helpInlineEsPersonaConDeuda1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_deuda.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConPenaJudicial1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaConPenaJudicial1x1}"
                                                    id="labelEsPersonaConPenaJudicial1x1"
                                                    for="listaEsPersonaConPenaJudicial1x1"
                                                    text="con pena judicial"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConPenaJudicial1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConPenaJudicial1x1"
                                                    binding="#{Persona2.listaEsPersonaConPenaJudicial1x1}"
                                                    converter="#{Persona2.converterEsPersonaConPenaJudicial1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaConPenaJudicial1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_con_pena_judicial']}"
                                                    toolTip="BundleParametros.es_persona_con_pena_judicial.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConPenaJudicial1x1Texto1"
                                                    binding="#{Persona2.listaEsPersonaConPenaJudicial1x1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConPenaJudicial1x1"
                                                    for="listaEsPersonaConPenaJudicial1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConPenaJudicial1x1"
                                                    binding="#{Persona2.helpInlineEsPersonaConPenaJudicial1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_pena_judicial.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConCerVida1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaConCerVida1x1}"
                                                    id="labelEsPersonaConCerVida1x1"
                                                    for="listaEsPersonaConCerVida1x1"
                                                    text="con cer vida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConCerVida1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConCerVida1x1"
                                                    binding="#{Persona2.listaEsPersonaConCerVida1x1}"
                                                    converter="#{Persona2.converterEsPersonaConCerVida1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaConCerVida1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_con_cer_vida']}"
                                                    toolTip="BundleParametros.es_persona_con_cer_vida.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConCerVida1x1Texto1"
                                                    binding="#{Persona2.listaEsPersonaConCerVida1x1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConCerVida1x1"
                                                    for="listaEsPersonaConCerVida1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConCerVida1x1"
                                                    binding="#{Persona2.helpInlineEsPersonaConCerVida1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_cer_vida.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConCartaRenuncia1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaConCartaRenuncia1x1}"
                                                    id="labelEsPersonaConCartaRenuncia1x1"
                                                    for="listaEsPersonaConCartaRenuncia1x1"
                                                    text="con carta renuncia"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConCartaRenuncia1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConCartaRenuncia1x1"
                                                    binding="#{Persona2.listaEsPersonaConCartaRenuncia1x1}"
                                                    converter="#{Persona2.converterEsPersonaConCartaRenuncia1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaConCartaRenuncia1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_con_carta_renuncia']}"
                                                    toolTip="BundleParametros.es_persona_con_carta_renuncia.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConCartaRenuncia1x1Texto1"
                                                    binding="#{Persona2.listaEsPersonaConCartaRenuncia1x1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConCartaRenuncia1x1"
                                                    for="listaEsPersonaConCartaRenuncia1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConCartaRenuncia1x1"
                                                    binding="#{Persona2.helpInlineEsPersonaConCartaRenuncia1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_carta_renuncia.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaElegibleParaPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaElegibleParaPen1x1}"
                                                    id="labelEsPersonaElegibleParaPen1x1"
                                                    for="listaEsPersonaElegibleParaPen1x1"
                                                    text="elegible para pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaElegibleParaPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaElegibleParaPen1x1"
                                                    binding="#{Persona2.listaEsPersonaElegibleParaPen1x1}"
                                                    converter="#{Persona2.converterEsPersonaElegibleParaPen1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaElegibleParaPen1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_elegible_para_pen']}"
                                                    toolTip="BundleParametros.es_persona_elegible_para_pen.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaElegibleParaPen1x1Texto1"
                                                    binding="#{Persona2.listaEsPersonaElegibleParaPen1x1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaElegibleParaPen1x1"
                                                    for="listaEsPersonaElegibleParaPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaElegibleParaPen1x1"
                                                    binding="#{Persona2.helpInlineEsPersonaElegibleParaPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_elegible_para_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaAcreditadaParaPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelEsPersonaAcreditadaParaPen1x1}"
                                                    id="labelEsPersonaAcreditadaParaPen1x1"
                                                    for="listaEsPersonaAcreditadaParaPen1x1"
                                                    text="acreditada para pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaAcreditadaParaPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaAcreditadaParaPen1x1"
                                                    binding="#{Persona2.listaEsPersonaAcreditadaParaPen1x1}"
                                                    converter="#{Persona2.converterEsPersonaAcreditadaParaPen1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaEsPersonaAcreditadaParaPen1}"
                                                    selected="#{Persona2.personaDataProvider.value['es_persona_acreditada_para_pen']}"
                                                    toolTip="BundleParametros.es_persona_acreditada_para_pen.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaAcreditadaParaPen1x1Texto1"
                                                    binding="#{Persona2.listaEsPersonaAcreditadaParaPen1x1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaAcreditadaParaPen1x1"
                                                    for="listaEsPersonaAcreditadaParaPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaAcreditadaParaPen1x1"
                                                    binding="#{Persona2.helpInlineEsPersonaAcreditadaParaPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_acreditada_para_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab7"
                                            rendered="#{Persona2.asistente.seccionPension2Rendered}"
                                            text="pension 2">
                                        <h:panelGrid
                                            id="gridPanel128"
                                            rendered="#{Persona2.asistente.seccionPension2Hidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab7"
                                                text="#{Persona2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel129"
                                            rendered="#{Persona2.asistente.seccionPension2Rendered}">
                                            <h:panelGrid
                                                id="gridMontoPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelMontoPension1x1}"
                                                    id="labelMontoPension1x1"
                                                    for="campoMontoPension1x1"
                                                    text="monto pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoPension1x1"
                                                    binding="#{Persona2.campoMontoPension1x1}"
                                                    converter="#{Persona2.converterMontoPension1}"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['monto_pension']}"
                                                    toolTip="BundleParametros.monto_pension.persona"
                                                    validatorExpression="#{Persona2.validatorMontoPension1.validate}"/>
                                                <webuijsf:staticText id="campoMontoPension1x1Texto1"
                                                    binding="#{Persona2.campoMontoPension1x1Texto1}"
                                                    converter="#{Persona2.converterMontoPension1}"
                                                    text="#{Persona2.personaDataProvider.value['monto_pension']}"/>
                                                <webuijsf:message id="messageMontoPension1x1"
                                                    for="campoMontoPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineMontoPension1x1"
                                                    binding="#{Persona2.helpInlineMontoPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCondicionPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroCondicionPension1x1}"
                                                    id="labelNumeroCondicionPension1x1"
                                                    for="listaNumeroCondicionPension1x1"
                                                    text="condicion pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCondicionPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCondicionPension1x1"
                                                    binding="#{Persona2.listaNumeroCondicionPension1x1}"
                                                    converter="#{Persona2.converterNumeroCondicionPension1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroCondicionPension1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_condicion_pension']}"
                                                    toolTip="BundleParametros.numero_condicion_pension.persona"/>
                                                <webuijsf:staticText id="listaNumeroCondicionPension1x1Texto1"
                                                    binding="#{Persona2.listaNumeroCondicionPension1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_condicion_pension_1x9y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionPension1x1"
                                                    for="listaNumeroCondicionPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCondicionPension1x1"
                                                    binding="#{Persona2.helpInlineNumeroCondicionPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_condicion_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaSolicitudPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaSolicitudPension1x1}"
                                                    id="labelFechaSolicitudPension1x1"
                                                    for="campoFechaSolicitudPension1x1"
                                                    text="fecha solicitud pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaSolicitudPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaSolicitudPension1x1"
                                                    binding="#{Persona2.campoFechaSolicitudPension1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_solicitud_pension']}"
                                                    toolTip="BundleParametros.fecha_solicitud_pension.persona"/>
                                                <webuijsf:staticText id="campoFechaSolicitudPension1x1Texto1"
                                                    binding="#{Persona2.campoFechaSolicitudPension1x1Texto1}"
                                                    converter="#{Persona2.converterFechaSolicitudPension1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_solicitud_pension']}"/>
                                                <webuijsf:message id="messageFechaSolicitudPension1x1"
                                                    for="campoFechaSolicitudPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaSolicitudPension1x1"
                                                    binding="#{Persona2.helpInlineFechaSolicitudPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_solicitud_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosSolicitudPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosSolicitudPension1x1}"
                                                    id="labelComentariosSolicitudPension1x1"
                                                    for="campoComentariosSolicitudPension1x1"
                                                    text="comentarios solicitud pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosSolicitudPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosSolicitudPension1x1"
                                                    binding="#{Persona2.campoComentariosSolicitudPension1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_solicitud_pension']}"
                                                    toolTip="BundleParametros.comentarios_solicitud_pension.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosSolicitudPension1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosSolicitudPension1x1Texto1"
                                                    binding="#{Persona2.campoComentariosSolicitudPension1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_solicitud_pension']}"/>
                                                <webuijsf:message id="messageComentariosSolicitudPension1x1"
                                                    for="campoComentariosSolicitudPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosSolicitudPension1x1"
                                                    binding="#{Persona2.helpInlineComentariosSolicitudPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_solicitud_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaAprobacionPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaAprobacionPension1x1}"
                                                    id="labelFechaAprobacionPension1x1"
                                                    for="campoFechaAprobacionPension1x1"
                                                    text="fecha aprobacion pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaAprobacionPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaAprobacionPension1x1"
                                                    binding="#{Persona2.campoFechaAprobacionPension1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_aprobacion_pension']}"
                                                    toolTip="BundleParametros.fecha_aprobacion_pension.persona"/>
                                                <webuijsf:staticText id="campoFechaAprobacionPension1x1Texto1"
                                                    binding="#{Persona2.campoFechaAprobacionPension1x1Texto1}"
                                                    converter="#{Persona2.converterFechaAprobacionPension1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_aprobacion_pension']}"/>
                                                <webuijsf:message id="messageFechaAprobacionPension1x1"
                                                    for="campoFechaAprobacionPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaAprobacionPension1x1"
                                                    binding="#{Persona2.helpInlineFechaAprobacionPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_aprobacion_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosAprobacionPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosAprobacionPension1x1}"
                                                    id="labelComentariosAprobacionPension1x1"
                                                    for="campoComentariosAprobacionPension1x1"
                                                    text="comentarios aprobacion pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosAprobacionPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosAprobacionPension1x1"
                                                    binding="#{Persona2.campoComentariosAprobacionPension1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_aprobacion_pension']}"
                                                    toolTip="BundleParametros.comentarios_aprobacion_pension.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosAprobacionPension1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAprobacionPension1x1Texto1"
                                                    binding="#{Persona2.campoComentariosAprobacionPension1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_aprobacion_pension']}"/>
                                                <webuijsf:message id="messageComentariosAprobacionPension1x1"
                                                    for="campoComentariosAprobacionPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosAprobacionPension1x1"
                                                    binding="#{Persona2.helpInlineComentariosAprobacionPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_aprobacion_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaOtorgamientoPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaOtorgamientoPen1x1}"
                                                    id="labelFechaOtorgamientoPen1x1"
                                                    for="campoFechaOtorgamientoPen1x1"
                                                    text="fecha otorgamiento pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaOtorgamientoPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaOtorgamientoPen1x1"
                                                    binding="#{Persona2.campoFechaOtorgamientoPen1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_otorgamiento_pen']}"
                                                    toolTip="BundleParametros.fecha_otorgamiento_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaOtorgamientoPen1x1Texto1"
                                                    binding="#{Persona2.campoFechaOtorgamientoPen1x1Texto1}"
                                                    converter="#{Persona2.converterFechaOtorgamientoPen1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_otorgamiento_pen']}"/>
                                                <webuijsf:message id="messageFechaOtorgamientoPen1x1"
                                                    for="campoFechaOtorgamientoPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaOtorgamientoPen1x1"
                                                    binding="#{Persona2.helpInlineFechaOtorgamientoPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_otorgamiento_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosOtorgamientoPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosOtorgamientoPen1x1}"
                                                    id="labelComentariosOtorgamientoPen1x1"
                                                    for="campoComentariosOtorgamientoPen1x1"
                                                    text="comentarios otorgamiento pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosOtorgamientoPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosOtorgamientoPen1x1"
                                                    binding="#{Persona2.campoComentariosOtorgamientoPen1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_otorgamiento_pen']}"
                                                    toolTip="BundleParametros.comentarios_otorgamiento_pen.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosOtorgamientoPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosOtorgamientoPen1x1Texto1"
                                                    binding="#{Persona2.campoComentariosOtorgamientoPen1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_otorgamiento_pen']}"/>
                                                <webuijsf:message id="messageComentariosOtorgamientoPen1x1"
                                                    for="campoComentariosOtorgamientoPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosOtorgamientoPen1x1"
                                                    binding="#{Persona2.helpInlineComentariosOtorgamientoPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_otorgamiento_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroResolucionOtorPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroResolucionOtorPen1x1}"
                                                    id="labelNumeroResolucionOtorPen1x1"
                                                    for="campoNumeroResolucionOtorPen1x1"
                                                    text="numero resolucion otor pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroResolucionOtorPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroResolucionOtorPen1x1"
                                                    binding="#{Persona2.campoNumeroResolucionOtorPen1x1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['numero_resolucion_otor_pen']}"
                                                    toolTip="BundleParametros.numero_resolucion_otor_pen.persona"
                                                    validatorExpression="#{Persona2.validatorNumeroResolucionOtorPen1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroResolucionOtorPen1x1Texto1"
                                                    binding="#{Persona2.campoNumeroResolucionOtorPen1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['numero_resolucion_otor_pen']}"/>
                                                <webuijsf:message id="messageNumeroResolucionOtorPen1x1"
                                                    for="campoNumeroResolucionOtorPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroResolucionOtorPen1x1"
                                                    binding="#{Persona2.helpInlineNumeroResolucionOtorPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_resolucion_otor_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaResolucionOtorPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaResolucionOtorPen1x1}"
                                                    id="labelFechaResolucionOtorPen1x1"
                                                    for="campoFechaResolucionOtorPen1x1"
                                                    text="fecha resolucion otor pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaResolucionOtorPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaResolucionOtorPen1x1"
                                                    binding="#{Persona2.campoFechaResolucionOtorPen1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_resolucion_otor_pen']}"
                                                    toolTip="BundleParametros.fecha_resolucion_otor_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaResolucionOtorPen1x1Texto1"
                                                    binding="#{Persona2.campoFechaResolucionOtorPen1x1Texto1}"
                                                    converter="#{Persona2.converterFechaResolucionOtorPen1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_resolucion_otor_pen']}"/>
                                                <webuijsf:message id="messageFechaResolucionOtorPen1x1"
                                                    for="campoFechaResolucionOtorPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaResolucionOtorPen1x1"
                                                    binding="#{Persona2.helpInlineFechaResolucionOtorPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_resolucion_otor_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab8"
                                            rendered="#{Persona2.asistente.seccionPension3Rendered}"
                                            text="pension 3">
                                        <h:panelGrid
                                            id="gridPanel130"
                                            rendered="#{Persona2.asistente.seccionPension3Hidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab8"
                                                text="#{Persona2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel131"
                                            rendered="#{Persona2.asistente.seccionPension3Rendered}">
                                            <h:panelGrid
                                                id="gridFechaDenegacionPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaDenegacionPension1x1}"
                                                    id="labelFechaDenegacionPension1x1"
                                                    for="campoFechaDenegacionPension1x1"
                                                    text="fecha denegacion pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaDenegacionPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaDenegacionPension1x1"
                                                    binding="#{Persona2.campoFechaDenegacionPension1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_denegacion_pension']}"
                                                    toolTip="BundleParametros.fecha_denegacion_pension.persona"/>
                                                <webuijsf:staticText id="campoFechaDenegacionPension1x1Texto1"
                                                    binding="#{Persona2.campoFechaDenegacionPension1x1Texto1}"
                                                    converter="#{Persona2.converterFechaDenegacionPension1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_denegacion_pension']}"/>
                                                <webuijsf:message id="messageFechaDenegacionPension1x1"
                                                    for="campoFechaDenegacionPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaDenegacionPension1x1"
                                                    binding="#{Persona2.helpInlineFechaDenegacionPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_denegacion_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaDenPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroCausaDenPension1x1}"
                                                    id="labelNumeroCausaDenPension1x1"
                                                    for="listaNumeroCausaDenPension1x1"
                                                    text="causa den pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaDenPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaDenPension1x1"
                                                    binding="#{Persona2.listaNumeroCausaDenPension1x1}"
                                                    converter="#{Persona2.converterNumeroCausaDenPension1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroCausaDenPension1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_causa_den_pension']}"
                                                    toolTip="BundleParametros.numero_causa_den_pension.persona"/>
                                                <webuijsf:staticText id="listaNumeroCausaDenPension1x1Texto1"
                                                    binding="#{Persona2.listaNumeroCausaDenPension1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_causa_den_pensio_1x10y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaDenPension1x1"
                                                    for="listaNumeroCausaDenPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaDenPension1x1"
                                                    binding="#{Persona2.helpInlineNumeroCausaDenPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_den_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaDenPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelOtraCausaDenPension1x1}"
                                                    id="labelOtraCausaDenPension1x1"
                                                    for="campoOtraCausaDenPension1x1"
                                                    text="otra causa den pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaDenPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaDenPension1x1"
                                                    binding="#{Persona2.campoOtraCausaDenPension1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['otra_causa_den_pension']}"
                                                    toolTip="BundleParametros.otra_causa_den_pension.persona"
                                                    validatorExpression="#{Persona2.validatorOtraCausaDenPension1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaDenPension1x1Texto1"
                                                    binding="#{Persona2.campoOtraCausaDenPension1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['otra_causa_den_pension']}"/>
                                                <webuijsf:message id="messageOtraCausaDenPension1x1"
                                                    for="campoOtraCausaDenPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaDenPension1x1"
                                                    binding="#{Persona2.helpInlineOtraCausaDenPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_den_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosDenegacionPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosDenegacionPension1x1}"
                                                    id="labelComentariosDenegacionPension1x1"
                                                    for="campoComentariosDenegacionPension1x1"
                                                    text="comentarios denegacion pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosDenegacionPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosDenegacionPension1x1"
                                                    binding="#{Persona2.campoComentariosDenegacionPension1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_denegacion_pension']}"
                                                    toolTip="BundleParametros.comentarios_denegacion_pension.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosDenegacionPension1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosDenegacionPension1x1Texto1"
                                                    binding="#{Persona2.campoComentariosDenegacionPension1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_denegacion_pension']}"/>
                                                <webuijsf:message id="messageComentariosDenegacionPension1x1"
                                                    for="campoComentariosDenegacionPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosDenegacionPension1x1"
                                                    binding="#{Persona2.helpInlineComentariosDenegacionPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_denegacion_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaRevocacionPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaRevocacionPension1x1}"
                                                    id="labelFechaRevocacionPension1x1"
                                                    for="campoFechaRevocacionPension1x1"
                                                    text="fecha revocacion pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaRevocacionPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaRevocacionPension1x1"
                                                    binding="#{Persona2.campoFechaRevocacionPension1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_revocacion_pension']}"
                                                    toolTip="BundleParametros.fecha_revocacion_pension.persona"/>
                                                <webuijsf:staticText id="campoFechaRevocacionPension1x1Texto1"
                                                    binding="#{Persona2.campoFechaRevocacionPension1x1Texto1}"
                                                    converter="#{Persona2.converterFechaRevocacionPension1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_revocacion_pension']}"/>
                                                <webuijsf:message id="messageFechaRevocacionPension1x1"
                                                    for="campoFechaRevocacionPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaRevocacionPension1x1"
                                                    binding="#{Persona2.helpInlineFechaRevocacionPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_revocacion_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaRevPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroCausaRevPension1x1}"
                                                    id="labelNumeroCausaRevPension1x1"
                                                    for="listaNumeroCausaRevPension1x1"
                                                    text="causa rev pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaRevPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaRevPension1x1"
                                                    binding="#{Persona2.listaNumeroCausaRevPension1x1}"
                                                    converter="#{Persona2.converterNumeroCausaRevPension1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroCausaRevPension1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_causa_rev_pension']}"
                                                    toolTip="BundleParametros.numero_causa_rev_pension.persona"/>
                                                <webuijsf:staticText id="listaNumeroCausaRevPension1x1Texto1"
                                                    binding="#{Persona2.listaNumeroCausaRevPension1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_causa_rev_pensio_1x11y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaRevPension1x1"
                                                    for="listaNumeroCausaRevPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaRevPension1x1"
                                                    binding="#{Persona2.helpInlineNumeroCausaRevPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_rev_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaRevPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelOtraCausaRevPension1x1}"
                                                    id="labelOtraCausaRevPension1x1"
                                                    for="campoOtraCausaRevPension1x1"
                                                    text="otra causa rev pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaRevPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaRevPension1x1"
                                                    binding="#{Persona2.campoOtraCausaRevPension1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['otra_causa_rev_pension']}"
                                                    toolTip="BundleParametros.otra_causa_rev_pension.persona"
                                                    validatorExpression="#{Persona2.validatorOtraCausaRevPension1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaRevPension1x1Texto1"
                                                    binding="#{Persona2.campoOtraCausaRevPension1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['otra_causa_rev_pension']}"/>
                                                <webuijsf:message id="messageOtraCausaRevPension1x1"
                                                    for="campoOtraCausaRevPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaRevPension1x1"
                                                    binding="#{Persona2.helpInlineOtraCausaRevPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_rev_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosRevocacionPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosRevocacionPension1x1}"
                                                    id="labelComentariosRevocacionPension1x1"
                                                    for="campoComentariosRevocacionPension1x1"
                                                    text="comentarios revocacion pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosRevocacionPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosRevocacionPension1x1"
                                                    binding="#{Persona2.campoComentariosRevocacionPension1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_revocacion_pension']}"
                                                    toolTip="BundleParametros.comentarios_revocacion_pension.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosRevocacionPension1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosRevocacionPension1x1Texto1"
                                                    binding="#{Persona2.campoComentariosRevocacionPension1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_revocacion_pension']}"/>
                                                <webuijsf:message id="messageComentariosRevocacionPension1x1"
                                                    for="campoComentariosRevocacionPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosRevocacionPension1x1"
                                                    binding="#{Persona2.helpInlineComentariosRevocacionPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_revocacion_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab9"
                                            rendered="#{Persona2.asistente.seccionPension4Rendered}"
                                            text="pension 4">
                                        <h:panelGrid
                                            id="gridPanel132"
                                            rendered="#{Persona2.asistente.seccionPension4Hidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab9"
                                                text="#{Persona2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel133"
                                            rendered="#{Persona2.asistente.seccionPension4Rendered}">
                                            <h:panelGrid
                                                id="gridNumeroCondicionRecoPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroCondicionRecoPen1x1}"
                                                    id="labelNumeroCondicionRecoPen1x1"
                                                    for="listaNumeroCondicionRecoPen1x1"
                                                    text="condicion reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCondicionRecoPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCondicionRecoPen1x1"
                                                    binding="#{Persona2.listaNumeroCondicionRecoPen1x1}"
                                                    converter="#{Persona2.converterNumeroCondicionRecoPen1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroCondicionRecoPen1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_condicion_reco_pen']}"
                                                    toolTip="BundleParametros.numero_condicion_reco_pen.persona"/>
                                                <webuijsf:staticText id="listaNumeroCondicionRecoPen1x1Texto1"
                                                    binding="#{Persona2.listaNumeroCondicionRecoPen1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_condicion_reco_p_1x12y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionRecoPen1x1"
                                                    for="listaNumeroCondicionRecoPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCondicionRecoPen1x1"
                                                    binding="#{Persona2.helpInlineNumeroCondicionRecoPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_condicion_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaSolicitudRecoPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaSolicitudRecoPen1x1}"
                                                    id="labelFechaSolicitudRecoPen1x1"
                                                    for="campoFechaSolicitudRecoPen1x1"
                                                    text="fecha solicitud reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaSolicitudRecoPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaSolicitudRecoPen1x1"
                                                    binding="#{Persona2.campoFechaSolicitudRecoPen1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_solicitud_reco_pen']}"
                                                    toolTip="BundleParametros.fecha_solicitud_reco_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaSolicitudRecoPen1x1Texto1"
                                                    binding="#{Persona2.campoFechaSolicitudRecoPen1x1Texto1}"
                                                    converter="#{Persona2.converterFechaSolicitudRecoPen1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_solicitud_reco_pen']}"/>
                                                <webuijsf:message id="messageFechaSolicitudRecoPen1x1"
                                                    for="campoFechaSolicitudRecoPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaSolicitudRecoPen1x1"
                                                    binding="#{Persona2.helpInlineFechaSolicitudRecoPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_solicitud_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosSolicitudRecoPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosSolicitudRecoPen1x1}"
                                                    id="labelComentariosSolicitudRecoPen1x1"
                                                    for="campoComentariosSolicitudRecoPen1x1"
                                                    text="comentarios solicitud reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosSolicitudRecoPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosSolicitudRecoPen1x1"
                                                    binding="#{Persona2.campoComentariosSolicitudRecoPen1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_solicitud_reco_pen']}"
                                                    toolTip="BundleParametros.comentarios_solicitud_reco_pen.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosSolicitudRecoPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosSolicitudRecoPen1x1Texto1"
                                                    binding="#{Persona2.campoComentariosSolicitudRecoPen1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_solicitud_reco_pen']}"/>
                                                <webuijsf:message id="messageComentariosSolicitudRecoPen1x1"
                                                    for="campoComentariosSolicitudRecoPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosSolicitudRecoPen1x1"
                                                    binding="#{Persona2.helpInlineComentariosSolicitudRecoPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_solicitud_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaAprobacionRecoPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaAprobacionRecoPen1x1}"
                                                    id="labelFechaAprobacionRecoPen1x1"
                                                    for="campoFechaAprobacionRecoPen1x1"
                                                    text="fecha aprobacion reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaAprobacionRecoPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaAprobacionRecoPen1x1"
                                                    binding="#{Persona2.campoFechaAprobacionRecoPen1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_aprobacion_reco_pen']}"
                                                    toolTip="BundleParametros.fecha_aprobacion_reco_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaAprobacionRecoPen1x1Texto1"
                                                    binding="#{Persona2.campoFechaAprobacionRecoPen1x1Texto1}"
                                                    converter="#{Persona2.converterFechaAprobacionRecoPen1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_aprobacion_reco_pen']}"/>
                                                <webuijsf:message id="messageFechaAprobacionRecoPen1x1"
                                                    for="campoFechaAprobacionRecoPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaAprobacionRecoPen1x1"
                                                    binding="#{Persona2.helpInlineFechaAprobacionRecoPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_aprobacion_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosAprRecoPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosAprRecoPen1x1}"
                                                    id="labelComentariosAprRecoPen1x1"
                                                    for="campoComentariosAprRecoPen1x1"
                                                    text="comentarios apr reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosAprRecoPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosAprRecoPen1x1"
                                                    binding="#{Persona2.campoComentariosAprRecoPen1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_apr_reco_pen']}"
                                                    toolTip="BundleParametros.comentarios_apr_reco_pen.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosAprRecoPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAprRecoPen1x1Texto1"
                                                    binding="#{Persona2.campoComentariosAprRecoPen1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_apr_reco_pen']}"/>
                                                <webuijsf:message id="messageComentariosAprRecoPen1x1"
                                                    for="campoComentariosAprRecoPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosAprRecoPen1x1"
                                                    binding="#{Persona2.helpInlineComentariosAprRecoPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_apr_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaDenegacionRecoPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaDenegacionRecoPen1x1}"
                                                    id="labelFechaDenegacionRecoPen1x1"
                                                    for="campoFechaDenegacionRecoPen1x1"
                                                    text="fecha denegacion reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaDenegacionRecoPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaDenegacionRecoPen1x1"
                                                    binding="#{Persona2.campoFechaDenegacionRecoPen1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_denegacion_reco_pen']}"
                                                    toolTip="BundleParametros.fecha_denegacion_reco_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaDenegacionRecoPen1x1Texto1"
                                                    binding="#{Persona2.campoFechaDenegacionRecoPen1x1Texto1}"
                                                    converter="#{Persona2.converterFechaDenegacionRecoPen1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_denegacion_reco_pen']}"/>
                                                <webuijsf:message id="messageFechaDenegacionRecoPen1x1"
                                                    for="campoFechaDenegacionRecoPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaDenegacionRecoPen1x1"
                                                    binding="#{Persona2.helpInlineFechaDenegacionRecoPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_denegacion_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaDenRecoPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroCausaDenRecoPen1x1}"
                                                    id="labelNumeroCausaDenRecoPen1x1"
                                                    for="listaNumeroCausaDenRecoPen1x1"
                                                    text="causa den reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaDenRecoPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaDenRecoPen1x1"
                                                    binding="#{Persona2.listaNumeroCausaDenRecoPen1x1}"
                                                    converter="#{Persona2.converterNumeroCausaDenRecoPen1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroCausaDenRecoPen1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_causa_den_reco_pen']}"
                                                    toolTip="BundleParametros.numero_causa_den_reco_pen.persona"/>
                                                <webuijsf:staticText id="listaNumeroCausaDenRecoPen1x1Texto1"
                                                    binding="#{Persona2.listaNumeroCausaDenRecoPen1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_causa_den_reco_p_1x13y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaDenRecoPen1x1"
                                                    for="listaNumeroCausaDenRecoPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaDenRecoPen1x1"
                                                    binding="#{Persona2.helpInlineNumeroCausaDenRecoPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_den_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaDenRecoPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelOtraCausaDenRecoPen1x1}"
                                                    id="labelOtraCausaDenRecoPen1x1"
                                                    for="campoOtraCausaDenRecoPen1x1"
                                                    text="otra causa den reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaDenRecoPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaDenRecoPen1x1"
                                                    binding="#{Persona2.campoOtraCausaDenRecoPen1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['otra_causa_den_reco_pen']}"
                                                    toolTip="BundleParametros.otra_causa_den_reco_pen.persona"
                                                    validatorExpression="#{Persona2.validatorOtraCausaDenRecoPen1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaDenRecoPen1x1Texto1"
                                                    binding="#{Persona2.campoOtraCausaDenRecoPen1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['otra_causa_den_reco_pen']}"/>
                                                <webuijsf:message id="messageOtraCausaDenRecoPen1x1"
                                                    for="campoOtraCausaDenRecoPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaDenRecoPen1x1"
                                                    binding="#{Persona2.helpInlineOtraCausaDenRecoPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_den_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosDenRecoPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosDenRecoPen1x1}"
                                                    id="labelComentariosDenRecoPen1x1"
                                                    for="campoComentariosDenRecoPen1x1"
                                                    text="comentarios den reco pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosDenRecoPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosDenRecoPen1x1"
                                                    binding="#{Persona2.campoComentariosDenRecoPen1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_den_reco_pen']}"
                                                    toolTip="BundleParametros.comentarios_den_reco_pen.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosDenRecoPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosDenRecoPen1x1Texto1"
                                                    binding="#{Persona2.campoComentariosDenRecoPen1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_den_reco_pen']}"/>
                                                <webuijsf:message id="messageComentariosDenRecoPen1x1"
                                                    for="campoComentariosDenRecoPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosDenRecoPen1x1"
                                                    binding="#{Persona2.helpInlineComentariosDenRecoPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_den_reco_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab10"
                                            rendered="#{Persona2.asistente.seccionPension5Rendered}"
                                            text="pension 5">
                                        <h:panelGrid
                                            id="gridPanel134"
                                            rendered="#{Persona2.asistente.seccionPension5Hidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab10"
                                                text="#{Persona2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel135"
                                            rendered="#{Persona2.asistente.seccionPension5Rendered}">
                                            <h:panelGrid
                                                id="gridNumeroCondicionDenuPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroCondicionDenuPen1x1}"
                                                    id="labelNumeroCondicionDenuPen1x1"
                                                    for="listaNumeroCondicionDenuPen1x1"
                                                    text="condicion denu pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCondicionDenuPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCondicionDenuPen1x1"
                                                    binding="#{Persona2.listaNumeroCondicionDenuPen1x1}"
                                                    converter="#{Persona2.converterNumeroCondicionDenuPen1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroCondicionDenuPen1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_condicion_denu_pen']}"
                                                    toolTip="BundleParametros.numero_condicion_denu_pen.persona"/>
                                                <webuijsf:staticText id="listaNumeroCondicionDenuPen1x1Texto1"
                                                    binding="#{Persona2.listaNumeroCondicionDenuPen1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_condicion_denu_p_1x14y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionDenuPen1x1"
                                                    for="listaNumeroCondicionDenuPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCondicionDenuPen1x1"
                                                    binding="#{Persona2.helpInlineNumeroCondicionDenuPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_condicion_denu_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaRegistroDenunciaPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaRegistroDenunciaPen1x1}"
                                                    id="labelFechaRegistroDenunciaPen1x1"
                                                    for="campoFechaRegistroDenunciaPen1x1"
                                                    text="fecha registro denuncia pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaRegistroDenunciaPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaRegistroDenunciaPen1x1"
                                                    binding="#{Persona2.campoFechaRegistroDenunciaPen1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_registro_denuncia_pen']}"
                                                    toolTip="BundleParametros.fecha_registro_denuncia_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaRegistroDenunciaPen1x1Texto1"
                                                    binding="#{Persona2.campoFechaRegistroDenunciaPen1x1Texto1}"
                                                    converter="#{Persona2.converterFechaRegistroDenunciaPen1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_registro_denuncia_pen']}"/>
                                                <webuijsf:message id="messageFechaRegistroDenunciaPen1x1"
                                                    for="campoFechaRegistroDenunciaPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaRegistroDenunciaPen1x1"
                                                    binding="#{Persona2.helpInlineFechaRegistroDenunciaPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_registro_denuncia_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosRegistroDenuPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosRegistroDenuPen1x1}"
                                                    id="labelComentariosRegistroDenuPen1x1"
                                                    for="campoComentariosRegistroDenuPen1x1"
                                                    text="comentarios registro denu pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosRegistroDenuPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosRegistroDenuPen1x1"
                                                    binding="#{Persona2.campoComentariosRegistroDenuPen1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_registro_denu_pen']}"
                                                    toolTip="BundleParametros.comentarios_registro_denu_pen.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosRegistroDenuPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosRegistroDenuPen1x1Texto1"
                                                    binding="#{Persona2.campoComentariosRegistroDenuPen1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_registro_denu_pen']}"/>
                                                <webuijsf:message id="messageComentariosRegistroDenuPen1x1"
                                                    for="campoComentariosRegistroDenuPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosRegistroDenuPen1x1"
                                                    binding="#{Persona2.helpInlineComentariosRegistroDenuPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_registro_denu_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaConfirmacionDenuPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaConfirmacionDenuPen1x1}"
                                                    id="labelFechaConfirmacionDenuPen1x1"
                                                    for="campoFechaConfirmacionDenuPen1x1"
                                                    text="fecha confirmacion denu pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaConfirmacionDenuPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaConfirmacionDenuPen1x1"
                                                    binding="#{Persona2.campoFechaConfirmacionDenuPen1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_confirmacion_denu_pen']}"
                                                    toolTip="BundleParametros.fecha_confirmacion_denu_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaConfirmacionDenuPen1x1Texto1"
                                                    binding="#{Persona2.campoFechaConfirmacionDenuPen1x1Texto1}"
                                                    converter="#{Persona2.converterFechaConfirmacionDenuPen1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_confirmacion_denu_pen']}"/>
                                                <webuijsf:message id="messageFechaConfirmacionDenuPen1x1"
                                                    for="campoFechaConfirmacionDenuPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaConfirmacionDenuPen1x1"
                                                    binding="#{Persona2.helpInlineFechaConfirmacionDenuPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_confirmacion_denu_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosConfDenuPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosConfDenuPen1x1}"
                                                    id="labelComentariosConfDenuPen1x1"
                                                    for="campoComentariosConfDenuPen1x1"
                                                    text="comentarios conf denu pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosConfDenuPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosConfDenuPen1x1"
                                                    binding="#{Persona2.campoComentariosConfDenuPen1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_conf_denu_pen']}"
                                                    toolTip="BundleParametros.comentarios_conf_denu_pen.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosConfDenuPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosConfDenuPen1x1Texto1"
                                                    binding="#{Persona2.campoComentariosConfDenuPen1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_conf_denu_pen']}"/>
                                                <webuijsf:message id="messageComentariosConfDenuPen1x1"
                                                    for="campoComentariosConfDenuPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosConfDenuPen1x1"
                                                    binding="#{Persona2.helpInlineComentariosConfDenuPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_conf_denu_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaDesmentidoDenunciaPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaDesmentidoDenunciaPen1x1}"
                                                    id="labelFechaDesmentidoDenunciaPen1x1"
                                                    for="campoFechaDesmentidoDenunciaPen1x1"
                                                    text="fecha desmentido denuncia pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaDesmentidoDenunciaPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaDesmentidoDenunciaPen1x1"
                                                    binding="#{Persona2.campoFechaDesmentidoDenunciaPen1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_desmentido_denuncia_pen']}"
                                                    toolTip="BundleParametros.fecha_desmentido_denuncia_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaDesmentidoDenunciaPen1x1Texto1"
                                                    binding="#{Persona2.campoFechaDesmentidoDenunciaPen1x1Texto1}"
                                                    converter="#{Persona2.converterFechaDesmentidoDenunciaPen1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_desmentido_denuncia_pen']}"/>
                                                <webuijsf:message id="messageFechaDesmentidoDenunciaPen1x1"
                                                    for="campoFechaDesmentidoDenunciaPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaDesmentidoDenunciaPen1x1"
                                                    binding="#{Persona2.helpInlineFechaDesmentidoDenunciaPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_desmentido_denuncia_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosDesDenuPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelComentariosDesDenuPen1x1}"
                                                    id="labelComentariosDesDenuPen1x1"
                                                    for="campoComentariosDesDenuPen1x1"
                                                    text="comentarios des denu pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosDesDenuPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosDesDenuPen1x1"
                                                    binding="#{Persona2.campoComentariosDesDenuPen1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_des_denu_pen']}"
                                                    toolTip="BundleParametros.comentarios_des_denu_pen.persona"
                                                    validatorExpression="#{Persona2.validatorComentariosDesDenuPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosDesDenuPen1x1Texto1"
                                                    binding="#{Persona2.campoComentariosDesDenuPen1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['comentarios_des_denu_pen']}"/>
                                                <webuijsf:message id="messageComentariosDesDenuPen1x1"
                                                    for="campoComentariosDesDenuPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosDesDenuPen1x1"
                                                    binding="#{Persona2.helpInlineComentariosDesDenuPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_des_denu_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab11"
                                            rendered="#{Persona2.asistente.seccionEtcRendered}"
                                            text="etc">
                                        <h:panelGrid
                                            id="gridPanel136"
                                            rendered="#{Persona2.asistente.seccionEtcHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab11"
                                                text="#{Persona2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel137"
                                            rendered="#{Persona2.asistente.seccionEtcRendered}">
                                            <h:panelGrid
                                                id="gridIdFichaPersona1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdFichaPersona1x1}"
                                                    id="labelIdFichaPersona1x1"
                                                    for="campoIdFichaPersona1x1"
                                                    text="ficha"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFichaPersona1x1"
                                                    binding="#{Persona2.campoIdFichaPersona1x1}"
                                                    readOnly="true"
                                                    text="#{Persona2.asistente.textoCampoIdFichaPersona1}"
                                                    toolTip="#{Persona2.asistente.toolTipCampoIdFichaPersona1}"
                                                    validatorExpression="#{Persona2.campoIdFichaPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdFichaPersona1x1Texto1"
                                                    binding="#{Persona2.campoIdFichaPersona1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_ficha_persona_1x15y3']}"/>
                                                <webuijsf:button id="campoIdFichaPersona1x1Boton1"
                                                    binding="#{Persona2.campoIdFichaPersona1x1Boton1}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdFichaPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdFichaPersona1x1Boton3"
                                                    binding="#{Persona2.campoIdFichaPersona1x1Boton3}"
                                                    onClick="#{Persona2.asistente.scriptCampoIdFichaPersona1Boton2}"
                                                    rendered="#{Persona2.asistente.campoIdFichaPersona1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFichaPersona1x1"
                                                    for="campoIdFichaPersona1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdFichaPersona1x1"
                                                    binding="#{Persona2.helpInlineIdFichaPersona1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_ficha_persona.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaPersona1x3"
                                                rendered="#{Persona2.asistente.campoIdFichaPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIdFichaPersona1x2}"
                                                    id="labelIdFichaPersona1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre ficha"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona1x4"
                                                rendered="#{Persona2.asistente.campoIdFichaPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{Persona2.campoIdFichaPersona1x1Texto2}"
                                                    text="#{Persona2.personaDataProvider.value['nombre_ficha_persona_1x15y4']}"
                                                    id="campoIdFichaPersona1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{Persona2.campoIdFichaPersona1x1Boton2}"
                                                    id="campoIdFichaPersona1x1Boton2"
                                                    onClick="#{Persona2.asistente.scriptCampoIdFichaPersona1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaFichaPersona1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaFichaPersona1x1}"
                                                    id="labelFechaFichaPersona1x1"
                                                    for="campoFechaFichaPersona1x1"
                                                    text="fecha ficha"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaFichaPersona1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaFichaPersona1x1"
                                                    binding="#{Persona2.campoFechaFichaPersona1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_ficha_persona']}"
                                                    toolTip="BundleParametros.fecha_ficha_persona.persona"/>
                                                <webuijsf:staticText id="campoFechaFichaPersona1x1Texto1"
                                                    binding="#{Persona2.campoFechaFichaPersona1x1Texto1}"
                                                    converter="#{Persona2.converterFechaFichaPersona1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_ficha_persona']}"/>
                                                <webuijsf:message id="messageFechaFichaPersona1x1"
                                                    for="campoFechaFichaPersona1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaFichaPersona1x1"
                                                    binding="#{Persona2.helpInlineFechaFichaPersona1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_ficha_persona.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIndiceCalidadVida1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelIndiceCalidadVida1x1}"
                                                    id="labelIndiceCalidadVida1x1"
                                                    for="campoIndiceCalidadVida1x1"
                                                    text="indice calidad vida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIndiceCalidadVida1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIndiceCalidadVida1x1"
                                                    binding="#{Persona2.campoIndiceCalidadVida1x1}"
                                                    converter="#{Persona2.converterIndiceCalidadVida1}"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['indice_calidad_vida']}"
                                                    toolTip="BundleParametros.indice_calidad_vida.persona"
                                                    validatorExpression="#{Persona2.validatorIndiceCalidadVida1.validate}"/>
                                                <webuijsf:staticText id="campoIndiceCalidadVida1x1Texto1"
                                                    binding="#{Persona2.campoIndiceCalidadVida1x1Texto1}"
                                                    converter="#{Persona2.converterIndiceCalidadVida1}"
                                                    text="#{Persona2.personaDataProvider.value['indice_calidad_vida']}"/>
                                                <webuijsf:message id="messageIndiceCalidadVida1x1"
                                                    for="campoIndiceCalidadVida1x1"/>
                                                <webuijsf:helpInline id="helpInlineIndiceCalidadVida1x1"
                                                    binding="#{Persona2.helpInlineIndiceCalidadVida1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.indice_calidad_vida.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaUltimoCobroPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaUltimoCobroPension1x1}"
                                                    id="labelFechaUltimoCobroPension1x1"
                                                    for="campoFechaUltimoCobroPension1x1"
                                                    text="fecha ultimo cobro pension"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaUltimoCobroPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaUltimoCobroPension1x1"
                                                    binding="#{Persona2.campoFechaUltimoCobroPension1x1}"
                                                    maxDate="#{Persona2.gestor.defaultMaxDate}"
                                                    minDate="#{Persona2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{Persona2.personaDataProvider.value['fecha_ultimo_cobro_pension']}"
                                                    toolTip="BundleParametros.fecha_ultimo_cobro_pension.persona"/>
                                                <webuijsf:staticText id="campoFechaUltimoCobroPension1x1Texto1"
                                                    binding="#{Persona2.campoFechaUltimoCobroPension1x1Texto1}"
                                                    converter="#{Persona2.converterFechaUltimoCobroPension1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_ultimo_cobro_pension']}"/>
                                                <webuijsf:message id="messageFechaUltimoCobroPension1x1"
                                                    for="campoFechaUltimoCobroPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaUltimoCobroPension1x1"
                                                    binding="#{Persona2.helpInlineFechaUltimoCobroPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_ultimo_cobro_pension.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNotasAnulFecUltCobPen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNotasAnulFecUltCobPen1x1}"
                                                    id="labelNotasAnulFecUltCobPen1x1"
                                                    for="campoNotasAnulFecUltCobPen1x1"
                                                    text="notas anul fec ult cob pen"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNotasAnulFecUltCobPen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNotasAnulFecUltCobPen1x1"
                                                    binding="#{Persona2.campoNotasAnulFecUltCobPen1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['notas_anul_fec_ult_cob_pen']}"
                                                    toolTip="BundleParametros.notas_anul_fec_ult_cob_pen.persona"
                                                    validatorExpression="#{Persona2.validatorNotasAnulFecUltCobPen1.validate}"/>
                                                <webuijsf:staticText id="campoNotasAnulFecUltCobPen1x1Texto1"
                                                    binding="#{Persona2.campoNotasAnulFecUltCobPen1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['notas_anul_fec_ult_cob_pen']}"/>
                                                <webuijsf:message id="messageNotasAnulFecUltCobPen1x1"
                                                    for="campoNotasAnulFecUltCobPen1x1"/>
                                                <webuijsf:helpInline id="helpInlineNotasAnulFecUltCobPen1x1"
                                                    binding="#{Persona2.helpInlineNotasAnulFecUltCobPen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.notas_anul_fec_ult_cob_pen.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoActJupe1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelNumeroTipoActJupe1x1}"
                                                    id="labelNumeroTipoActJupe1x1"
                                                    for="listaNumeroTipoActJupe1x1"
                                                    text="tipo act jupe"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoActJupe1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoActJupe1x1"
                                                    binding="#{Persona2.listaNumeroTipoActJupe1x1}"
                                                    converter="#{Persona2.converterNumeroTipoActJupe1}"
                                                    disabled="true"
                                                    items="#{Persona2.asistente.opcionesListaNumeroTipoActJupe1}"
                                                    selected="#{Persona2.personaDataProvider.value['numero_tipo_act_jupe']}"
                                                    toolTip="BundleParametros.numero_tipo_act_jupe.persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoActJupe1x1Texto1"
                                                    binding="#{Persona2.listaNumeroTipoActJupe1x1Texto1}"
                                                    text="#{Persona2.personaDataProvider.value['codigo_tipo_act_jupe_1x16y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoActJupe1x1"
                                                    for="listaNumeroTipoActJupe1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoActJupe1x1"
                                                    binding="#{Persona2.helpInlineNumeroTipoActJupe1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_act_jupe.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraUltActJupe1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Persona2.labelFechaHoraUltActJupe1x1}"
                                                    id="labelFechaHoraUltActJupe1x1"
                                                    for="campoFechaHoraUltActJupe1x1"
                                                    text="fecha hora ult act jupe"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraUltActJupe1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraUltActJupe1x1"
                                                    binding="#{Persona2.campoFechaHoraUltActJupe1x1}"
                                                    converter="#{Persona2.converterFechaHoraUltActJupe1}"
                                                    readOnly="true"
                                                    text="#{Persona2.personaDataProvider.value['fecha_hora_ult_act_jupe']}"
                                                    toolTip="BundleParametros.fecha_hora_ult_act_jupe.persona"/>
                                                <webuijsf:staticText id="campoFechaHoraUltActJupe1x1Texto1"
                                                    binding="#{Persona2.campoFechaHoraUltActJupe1x1Texto1}"
                                                    converter="#{Persona2.converterFechaHoraUltActJupe1}"
                                                    text="#{Persona2.personaDataProvider.value['fecha_hora_ult_act_jupe']}"/>
                                                <webuijsf:message id="messageFechaHoraUltActJupe1x1"
                                                    for="campoFechaHoraUltActJupe1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraUltActJupe1x1"
                                                    binding="#{Persona2.helpInlineFechaHoraUltActJupe1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_ult_act_jupe.persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        </webuijsf:tabSet>
                                        <h:panelGrid
                                            id="gridPanel138"
                                            styleClass="pdq-grid-detalle-pie">
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel139">
                                            <h:panelGrid
                                                id="gridPanel140"
                                                styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid 
                                                    columns="7"
                                                    id="gridPanel141">
                                                    <webuijsf:button
                                                        actionExpression="#{Persona2.botonIrAlPrimero2_action}"
                                                        binding="#{Persona2.botonIrAlPrimero2}"
                                                        disabled="#{Persona2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{Persona2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Persona2.gestor.scriptIrAlPrimero}"
                                                        text="#{Persona2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Persona2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Persona2.botonIrAlAnterior2_action}"
                                                        binding="#{Persona2.botonIrAlAnterior2}"
                                                        disabled="#{Persona2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{Persona2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Persona2.gestor.scriptIrAlAnterior}"
                                                        text="#{Persona2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Persona2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Persona2.botonIrAlSiguiente2_action}"
                                                        binding="#{Persona2.botonIrAlSiguiente2}"
                                                        disabled="#{Persona2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{Persona2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Persona2.gestor.scriptIrAlSiguiente}"
                                                        text="#{Persona2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Persona2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Persona2.botonIrAlUltimo2_action}"
                                                        binding="#{Persona2.botonIrAlUltimo2}"
                                                        disabled="#{Persona2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{Persona2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Persona2.gestor.scriptIrAlUltimo}"
                                                        text="#{Persona2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Persona2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Persona2.botonProcesarFila2_action}"
                                                        binding="#{Persona2.botonProcesarFila2}"
                                                        disabled="#{Persona2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{Persona2.gestor.urlImagenProcesar}"
                                                        onClick="#{Persona2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{Persona2.asistente.comandoDisponible}"
                                                        text="#{Persona2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Persona2.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel142"
                                                styleClass="pdq-grid-detalle-mensajes">
                                                <h:panelGrid
                                                    id="gridPanel143"
                                                    styleClass="pdq-grid-detalle-mensajes-2">
                                                    <webuijsf:staticText
                                                        id="textoMensajeCambiosPorConfirmar1"
                                                        style="font-weight: bold"
                                                        text="#{Persona2.gestor.mensajeCambiosPorConfirmar}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid 
                                            id="gridPanel144">
                                            <h:panelGrid 
                                                id="gridPanel145">
                                                <webuijsf:anchor 
                                                    id="anchor1"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel146">
                                                <webuijsf:button
                                                    actionExpression="#{Persona2.botonAgregar1_action}"
                                                    binding="#{Persona2.botonAgregar1}"
                                                    disabled="#{Persona2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Persona2.gestor.scriptAgregar}"
                                                    rendered="#{Persona2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Persona2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Persona2.listaFuncionEdicion1}"
                                                    converter="#{Persona2.converterListaFuncionEdicion1}"
                                                    disabled="#{Persona2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Persona2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Persona2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Persona2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Persona2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona2.botonEditar1_action}"
                                                    binding="#{Persona2.botonEditar1}"
                                                    disabled="#{Persona2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Persona2.gestor.scriptEditar}"
                                                    rendered="#{Persona2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Persona2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona2.botonEliminar1_action}"
                                                    binding="#{Persona2.botonEliminar1}"
                                                    disabled="#{Persona2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Persona2.gestor.scriptEliminar}"
                                                    rendered="#{Persona2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Persona2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona2.botonAplicar1_action}"
                                                    binding="#{Persona2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Persona2.gestor.scriptAplicar}"
                                                    rendered="#{Persona2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Persona2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona2.botonDeshacer1_action}"
                                                    binding="#{Persona2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Persona2.gestor.scriptDeshacer}"
                                                    rendered="#{Persona2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Persona2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona2.botonConfirmar1_action}"
                                                    binding="#{Persona2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Persona2.gestor.scriptConfirmar}"
                                                    rendered="#{Persona2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Persona2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona2.botonDescartar1_action}"
                                                    binding="#{Persona2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Persona2.gestor.scriptDescartar}"
                                                    rendered="#{Persona2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Persona2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Persona2.listaFuncionAccion1}"
                                                    converter="#{Persona2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Persona2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Persona2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Persona2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Persona2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona2.botonProcesar1_action}"
                                                    binding="#{Persona2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Persona2.gestor.scriptProcesar}"
                                                    rendered="#{Persona2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Persona2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona2.botonRefrescar1_action}"
                                                    binding="#{Persona2.botonRefrescar1}"
                                                    disabled="#{Persona2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Persona2.gestor.scriptRefrescar}"
                                                    rendered="#{Persona2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Persona2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona2.botonReconsultar1_action}"
                                                    binding="#{Persona2.botonReconsultar1}"
                                                    disabled="#{Persona2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Persona2.gestor.scriptReconsultar}"
                                                    rendered="#{Persona2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Persona2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona2.botonRetornar1_action}"
                                                    binding="#{Persona2.botonRetornar1}"
                                                    disabled="#{Persona2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Persona2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Persona2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Persona2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel147"
                                                rendered="#{Persona2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Persona2.imageHyperlink1_action}"
                                                    binding="#{Persona2.imageHyperlink1}"
                                                    disabled="#{Persona2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Persona2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Persona2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Persona2.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Persona2_imageHyperlink1_toolTip}"/>
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