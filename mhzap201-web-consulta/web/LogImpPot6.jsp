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
                    focus="#{LogImpPot6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpPot6.gestor.preserveFocus}"
                    preserveScroll="#{LogImpPot6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpPot6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdLogImpPot1 campoDepartamento1 campoDistrito1 campoNombresApellidos1 campoApodo1 campoEdadALaFecha1 campoNacimiento1 campoCedula1 campoTelefono1 campoDireccion1 campoReferencia1 campoBarrio1 campoNombreReferente1 campoTelefonoReferente1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 campoIdPotencialBen1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpPot6.breadcrumbs1}" 
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
                                                    rendered="#{LogImpPot6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpPot6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpPot6.gestor.mensajeDisponible}"
                                                    text="#{LogImpPot6.gestor.mensaje}"
                                                    url="#{LogImpPot6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{LogImpPot6.gestor.filaDisponible}"
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
                                                        actionExpression="#{LogImpPot6.botonIrAlPrimero1_action}"
                                                        binding="#{LogImpPot6.botonIrAlPrimero1}"
                                                        disabled="#{LogImpPot6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{LogImpPot6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpPot6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpPot6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPot6.botonIrAlAnterior1_action}"
                                                        binding="#{LogImpPot6.botonIrAlAnterior1}"
                                                        disabled="#{LogImpPot6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{LogImpPot6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpPot6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpPot6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPot6.botonIrAlSiguiente1_action}"
                                                        binding="#{LogImpPot6.botonIrAlSiguiente1}"
                                                        disabled="#{LogImpPot6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{LogImpPot6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpPot6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpPot6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPot6.botonIrAlUltimo1_action}"
                                                        binding="#{LogImpPot6.botonIrAlUltimo1}"
                                                        disabled="#{LogImpPot6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{LogImpPot6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpPot6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpPot6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPot6.botonProcesarFila1_action}"
                                                        binding="#{LogImpPot6.botonProcesarFila1}"
                                                        disabled="#{LogImpPot6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpPot6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpPot6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpPot6.asistente.comandoDisponible}"
                                                        text="#{LogImpPot6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogImpPot6.gestor.tituloConsulta}"/>
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
                                                    binding="#{LogImpPot6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{LogImpPot6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpPot6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpPot6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{LogImpPot6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{LogImpPot6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{LogImpPot6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{LogImpPot6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpPot6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{LogImpPot6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdLogImpPot1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelIdLogImpPot1}"
                                                    id="labelIdLogImpPot1"
                                                    for="campoIdLogImpPot1"
                                                    toolTip="BundleParametros.id_log_imp_pot.log_imp_pot"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdLogImpPot2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdLogImpPot1"
                                                    binding="#{LogImpPot6.campoIdLogImpPot1}"
                                                    converter="#{LogImpPot6.converterIdLogImpPot1}"
                                                    readOnly="true"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['id_log_imp_pot']}"
                                                    toolTip="BundleParametros.id_log_imp_pot.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorIdLogImpPot1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpPot1Texto1"
                                                    binding="#{LogImpPot6.campoIdLogImpPot1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['id_log_imp_pot']}"/>
                                                <webuijsf:message id="messageIdLogImpPot1"
                                                    for="campoIdLogImpPot1"/>
                                                <webuijsf:helpInline id="helpInlineIdLogImpPot1"
                                                    binding="#{LogImpPot6.helpInlineIdLogImpPot1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_log_imp_pot.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDepartamento1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelDepartamento1}"
                                                    id="labelDepartamento1"
                                                    for="campoDepartamento1"
                                                    toolTip="BundleParametros.departamento.log_imp_pot"
                                                    text="departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDepartamento2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDepartamento1"
                                                    binding="#{LogImpPot6.campoDepartamento1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['departamento']}"
                                                    toolTip="BundleParametros.departamento.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorDepartamento1.validate}"/>
                                                <webuijsf:staticText id="campoDepartamento1Texto1"
                                                    binding="#{LogImpPot6.campoDepartamento1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['departamento']}"/>
                                                <webuijsf:message id="messageDepartamento1"
                                                    for="campoDepartamento1"/>
                                                <webuijsf:helpInline id="helpInlineDepartamento1"
                                                    binding="#{LogImpPot6.helpInlineDepartamento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.departamento.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDistrito1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelDistrito1}"
                                                    id="labelDistrito1"
                                                    for="campoDistrito1"
                                                    toolTip="BundleParametros.distrito.log_imp_pot"
                                                    text="distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDistrito2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDistrito1"
                                                    binding="#{LogImpPot6.campoDistrito1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['distrito']}"
                                                    toolTip="BundleParametros.distrito.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorDistrito1.validate}"/>
                                                <webuijsf:staticText id="campoDistrito1Texto1"
                                                    binding="#{LogImpPot6.campoDistrito1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['distrito']}"/>
                                                <webuijsf:message id="messageDistrito1"
                                                    for="campoDistrito1"/>
                                                <webuijsf:helpInline id="helpInlineDistrito1"
                                                    binding="#{LogImpPot6.helpInlineDistrito1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.distrito.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombresApellidos1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelNombresApellidos1}"
                                                    id="labelNombresApellidos1"
                                                    for="campoNombresApellidos1"
                                                    toolTip="BundleParametros.nombres_apellidos.log_imp_pot"
                                                    text="nombres apellidos"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombresApellidos2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNombresApellidos1"
                                                    binding="#{LogImpPot6.campoNombresApellidos1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['nombres_apellidos']}"
                                                    toolTip="BundleParametros.nombres_apellidos.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorNombresApellidos1.validate}"/>
                                                <webuijsf:staticText id="campoNombresApellidos1Texto1"
                                                    binding="#{LogImpPot6.campoNombresApellidos1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['nombres_apellidos']}"/>
                                                <webuijsf:message id="messageNombresApellidos1"
                                                    for="campoNombresApellidos1"/>
                                                <webuijsf:helpInline id="helpInlineNombresApellidos1"
                                                    binding="#{LogImpPot6.helpInlineNombresApellidos1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombres_apellidos.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridApodo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelApodo1}"
                                                    id="labelApodo1"
                                                    for="campoApodo1"
                                                    toolTip="BundleParametros.apodo.log_imp_pot"
                                                    text="apodo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridApodo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoApodo1"
                                                    binding="#{LogImpPot6.campoApodo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['apodo']}"
                                                    toolTip="BundleParametros.apodo.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorApodo1.validate}"/>
                                                <webuijsf:staticText id="campoApodo1Texto1"
                                                    binding="#{LogImpPot6.campoApodo1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['apodo']}"/>
                                                <webuijsf:message id="messageApodo1"
                                                    for="campoApodo1"/>
                                                <webuijsf:helpInline id="helpInlineApodo1"
                                                    binding="#{LogImpPot6.helpInlineApodo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.apodo.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEdadALaFecha1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelEdadALaFecha1}"
                                                    id="labelEdadALaFecha1"
                                                    for="campoEdadALaFecha1"
                                                    toolTip="BundleParametros.edad_a_la_fecha.log_imp_pot"
                                                    text="edad a la fecha"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEdadALaFecha2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoEdadALaFecha1"
                                                    binding="#{LogImpPot6.campoEdadALaFecha1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['edad_a_la_fecha']}"
                                                    toolTip="BundleParametros.edad_a_la_fecha.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorEdadALaFecha1.validate}"/>
                                                <webuijsf:staticText id="campoEdadALaFecha1Texto1"
                                                    binding="#{LogImpPot6.campoEdadALaFecha1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['edad_a_la_fecha']}"/>
                                                <webuijsf:message id="messageEdadALaFecha1"
                                                    for="campoEdadALaFecha1"/>
                                                <webuijsf:helpInline id="helpInlineEdadALaFecha1"
                                                    binding="#{LogImpPot6.helpInlineEdadALaFecha1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.edad_a_la_fecha.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNacimiento1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelNacimiento1}"
                                                    id="labelNacimiento1"
                                                    for="campoNacimiento1"
                                                    toolTip="BundleParametros.nacimiento.log_imp_pot"
                                                    text="nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNacimiento2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNacimiento1"
                                                    binding="#{LogImpPot6.campoNacimiento1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['nacimiento']}"
                                                    toolTip="BundleParametros.nacimiento.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorNacimiento1.validate}"/>
                                                <webuijsf:staticText id="campoNacimiento1Texto1"
                                                    binding="#{LogImpPot6.campoNacimiento1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['nacimiento']}"/>
                                                <webuijsf:message id="messageNacimiento1"
                                                    for="campoNacimiento1"/>
                                                <webuijsf:helpInline id="helpInlineNacimiento1"
                                                    binding="#{LogImpPot6.helpInlineNacimiento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nacimiento.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCedula1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelCedula1}"
                                                    id="labelCedula1"
                                                    for="campoCedula1"
                                                    toolTip="BundleParametros.cedula.log_imp_pot"
                                                    text="c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCedula2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCedula1"
                                                    binding="#{LogImpPot6.campoCedula1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['cedula']}"
                                                    toolTip="BundleParametros.cedula.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorCedula1.validate}"/>
                                                <webuijsf:staticText id="campoCedula1Texto1"
                                                    binding="#{LogImpPot6.campoCedula1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['cedula']}"/>
                                                <webuijsf:message id="messageCedula1"
                                                    for="campoCedula1"/>
                                                <webuijsf:helpInline id="helpInlineCedula1"
                                                    binding="#{LogImpPot6.helpInlineCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.cedula.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridTelefono1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelTelefono1}"
                                                    id="labelTelefono1"
                                                    for="campoTelefono1"
                                                    toolTip="BundleParametros.telefono.log_imp_pot"
                                                    text="tel&#233;fono"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridTelefono2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoTelefono1"
                                                    binding="#{LogImpPot6.campoTelefono1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['telefono']}"
                                                    toolTip="BundleParametros.telefono.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorTelefono1.validate}"/>
                                                <webuijsf:staticText id="campoTelefono1Texto1"
                                                    binding="#{LogImpPot6.campoTelefono1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['telefono']}"/>
                                                <webuijsf:message id="messageTelefono1"
                                                    for="campoTelefono1"/>
                                                <webuijsf:helpInline id="helpInlineTelefono1"
                                                    binding="#{LogImpPot6.helpInlineTelefono1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.telefono.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDireccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelDireccion1}"
                                                    id="labelDireccion1"
                                                    for="campoDireccion1"
                                                    toolTip="BundleParametros.direccion.log_imp_pot"
                                                    text="direcci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDireccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDireccion1"
                                                    binding="#{LogImpPot6.campoDireccion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['direccion']}"
                                                    toolTip="BundleParametros.direccion.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoDireccion1Texto1"
                                                    binding="#{LogImpPot6.campoDireccion1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['direccion']}"/>
                                                <webuijsf:message id="messageDireccion1"
                                                    for="campoDireccion1"/>
                                                <webuijsf:helpInline id="helpInlineDireccion1"
                                                    binding="#{LogImpPot6.helpInlineDireccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.direccion.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridReferencia1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelReferencia1}"
                                                    id="labelReferencia1"
                                                    for="campoReferencia1"
                                                    toolTip="BundleParametros.referencia.log_imp_pot"
                                                    text="referencia"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridReferencia2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoReferencia1"
                                                    binding="#{LogImpPot6.campoReferencia1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['referencia']}"
                                                    toolTip="BundleParametros.referencia.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorReferencia1.validate}"/>
                                                <webuijsf:staticText id="campoReferencia1Texto1"
                                                    binding="#{LogImpPot6.campoReferencia1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['referencia']}"/>
                                                <webuijsf:message id="messageReferencia1"
                                                    for="campoReferencia1"/>
                                                <webuijsf:helpInline id="helpInlineReferencia1"
                                                    binding="#{LogImpPot6.helpInlineReferencia1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.referencia.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridBarrio1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelBarrio1}"
                                                    id="labelBarrio1"
                                                    for="campoBarrio1"
                                                    toolTip="BundleParametros.barrio.log_imp_pot"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridBarrio2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoBarrio1"
                                                    binding="#{LogImpPot6.campoBarrio1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['barrio']}"
                                                    toolTip="BundleParametros.barrio.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorBarrio1.validate}"/>
                                                <webuijsf:staticText id="campoBarrio1Texto1"
                                                    binding="#{LogImpPot6.campoBarrio1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['barrio']}"/>
                                                <webuijsf:message id="messageBarrio1"
                                                    for="campoBarrio1"/>
                                                <webuijsf:helpInline id="helpInlineBarrio1"
                                                    binding="#{LogImpPot6.helpInlineBarrio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.barrio.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreReferente1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelNombreReferente1}"
                                                    id="labelNombreReferente1"
                                                    for="campoNombreReferente1"
                                                    toolTip="BundleParametros.nombre_referente.log_imp_pot"
                                                    text="nombre referente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreReferente2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNombreReferente1"
                                                    binding="#{LogImpPot6.campoNombreReferente1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['nombre_referente']}"
                                                    toolTip="BundleParametros.nombre_referente.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorNombreReferente1.validate}"/>
                                                <webuijsf:staticText id="campoNombreReferente1Texto1"
                                                    binding="#{LogImpPot6.campoNombreReferente1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['nombre_referente']}"/>
                                                <webuijsf:message id="messageNombreReferente1"
                                                    for="campoNombreReferente1"/>
                                                <webuijsf:helpInline id="helpInlineNombreReferente1"
                                                    binding="#{LogImpPot6.helpInlineNombreReferente1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_referente.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridTelefonoReferente1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelTelefonoReferente1}"
                                                    id="labelTelefonoReferente1"
                                                    for="campoTelefonoReferente1"
                                                    toolTip="BundleParametros.telefono_referente.log_imp_pot"
                                                    text="tel&#233;fono referente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridTelefonoReferente2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoTelefonoReferente1"
                                                    binding="#{LogImpPot6.campoTelefonoReferente1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['telefono_referente']}"
                                                    toolTip="BundleParametros.telefono_referente.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorTelefonoReferente1.validate}"/>
                                                <webuijsf:staticText id="campoTelefonoReferente1Texto1"
                                                    binding="#{LogImpPot6.campoTelefonoReferente1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['telefono_referente']}"/>
                                                <webuijsf:message id="messageTelefonoReferente1"
                                                    for="campoTelefonoReferente1"/>
                                                <webuijsf:helpInline id="helpInlineTelefonoReferente1"
                                                    binding="#{LogImpPot6.helpInlineTelefonoReferente1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.telefono_referente.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsImportado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"
                                                    toolTip="BundleParametros.es_importado.log_imp_pot"
                                                    text="importado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsImportado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpPot6.listaEsImportado1}"
                                                    converter="#{LogImpPot6.converterEsImportado1}"
                                                    disabled="#{LogImpPot6.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpPot6.asistente.opcionesListaEsImportado1}"
                                                    selected="#{LogImpPot6.logImpPotDataProvider.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_pot"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpPot6.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:helpInline id="helpInlineEsImportado1"
                                                    binding="#{LogImpPot6.helpInlineEsImportado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_importado.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"
                                                    toolTip="BundleParametros.observacion.log_imp_pot"
                                                    text="observaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpPot6.campoObservacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpPot6.campoObservacion1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:helpInline id="helpInlineObservacion1"
                                                    binding="#{LogImpPot6.helpInlineObservacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observacion.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraTransaccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_pot"
                                                    text="fecha hora transacci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraTransaccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpPot6.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpPot6.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}" required="true"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_pot"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpPot6.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpPot6.converterFechaHoraTransaccion1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraTransaccion1"
                                                    binding="#{LogImpPot6.helpInlineFechaHoraTransaccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_transaccion.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_pot"
                                                    text="nombre archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpPot6.campoNombreArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpPot6.campoNombreArchivo1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['nombre_archivo']}"/>
                                                <webuijsf:button id="campoNombreArchivo1Boton3"
                                                    binding="#{LogImpPot6.campoNombreArchivo1Boton3}"
                                                    onClick="#{LogImpPot6.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpPot6.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpPot6.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpPot6.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                <webuijsf:message id="messageNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineNombreArchivo1"
                                                    binding="#{LogImpPot6.helpInlineNombreArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_archivo.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_pot"
                                                    text="c&#243;digo archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpPot6.campoCodigoArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_pot"
                                                    validatorExpression="#{LogImpPot6.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpPot6.campoCodigoArchivo1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['codigo_archivo']}"/>
                                                <webuijsf:message id="messageCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoArchivo1"
                                                    binding="#{LogImpPot6.helpInlineCodigoArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_archivo.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPotencialBen1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelIdPotencialBen1}"
                                                    id="labelIdPotencialBen1"
                                                    for="campoIdPotencialBen1"
                                                    toolTip="BundleParametros.id_potencial_ben.log_imp_pot"
                                                    text="potencial beneficiario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPotencialBen2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPotencialBen1"
                                                    binding="#{LogImpPot6.campoIdPotencialBen1}"
                                                    readOnly="#{LogImpPot6.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot6.asistente.textoCampoIdPotencialBen1}"
                                                    toolTip="#{LogImpPot6.asistente.toolTipCampoIdPotencialBen1}"
                                                    validatorExpression="#{LogImpPot6.campoIdPotencialBen1_validate}"/>
                                                <webuijsf:staticText id="campoIdPotencialBen1Texto1"
                                                    binding="#{LogImpPot6.campoIdPotencialBen1Texto1}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['codigo_potencial_ben_1x1y3']}"/>
                                                <webuijsf:button id="campoIdPotencialBen1Boton1"
                                                    binding="#{LogImpPot6.campoIdPotencialBen1Boton1}"
                                                    onClick="#{LogImpPot6.asistente.scriptCampoIdPotencialBen1Boton1}"/>
                                                <webuijsf:button id="campoIdPotencialBen1Boton3"
                                                    binding="#{LogImpPot6.campoIdPotencialBen1Boton3}"
                                                    onClick="#{LogImpPot6.asistente.scriptCampoIdPotencialBen1Boton2}"
                                                    rendered="#{LogImpPot6.asistente.campoIdPotencialBen1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                <webuijsf:helpInline id="helpInlineIdPotencialBen1"
                                                    binding="#{LogImpPot6.helpInlineIdPotencialBen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_potencial_ben.log_imp_pot"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPotencialBen3"
                                                rendered="#{LogImpPot6.asistente.campoIdPotencialBen1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpPot6.labelIdPotencialBen2}"
                                                    id="labelIdPotencialBen2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre potencial beneficiario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPotencialBen4"
                                                rendered="#{LogImpPot6.asistente.campoIdPotencialBen1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{LogImpPot6.campoIdPotencialBen1Texto2}"
                                                    text="#{LogImpPot6.logImpPotDataProvider.value['nombre_potencial_ben_1x1y4']}"
                                                    id="campoIdPotencialBen1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{LogImpPot6.campoIdPotencialBen1Boton2}"
                                                    id="campoIdPotencialBen1Boton2"
                                                    onClick="#{LogImpPot6.asistente.scriptCampoIdPotencialBen1Boton2}"/>
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
                                                        actionExpression="#{LogImpPot6.botonIrAlPrimero2_action}"
                                                        binding="#{LogImpPot6.botonIrAlPrimero2}"
                                                        disabled="#{LogImpPot6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{LogImpPot6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpPot6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpPot6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPot6.botonIrAlAnterior2_action}"
                                                        binding="#{LogImpPot6.botonIrAlAnterior2}"
                                                        disabled="#{LogImpPot6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{LogImpPot6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpPot6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpPot6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPot6.botonIrAlSiguiente2_action}"
                                                        binding="#{LogImpPot6.botonIrAlSiguiente2}"
                                                        disabled="#{LogImpPot6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{LogImpPot6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpPot6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpPot6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPot6.botonIrAlUltimo2_action}"
                                                        binding="#{LogImpPot6.botonIrAlUltimo2}"
                                                        disabled="#{LogImpPot6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{LogImpPot6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpPot6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpPot6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpPot6.botonProcesarFila2_action}"
                                                        binding="#{LogImpPot6.botonProcesarFila2}"
                                                        disabled="#{LogImpPot6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{LogImpPot6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpPot6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{LogImpPot6.asistente.comandoDisponible}"
                                                        text="#{LogImpPot6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogImpPot6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{LogImpPot6.botonAgregar1_action}"
                                                    binding="#{LogImpPot6.botonAgregar1}"
                                                    disabled="#{LogImpPot6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpPot6.gestor.scriptAgregar}"
                                                    rendered="#{LogImpPot6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpPot6.listaFuncionEdicion1}"
                                                    converter="#{LogImpPot6.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpPot6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpPot6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpPot6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpPot6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpPot6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot6.botonEditar1_action}"
                                                    binding="#{LogImpPot6.botonEditar1}"
                                                    disabled="#{LogImpPot6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpPot6.gestor.scriptEditar}"
                                                    rendered="#{LogImpPot6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpPot6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot6.botonEliminar1_action}"
                                                    binding="#{LogImpPot6.botonEliminar1}"
                                                    disabled="#{LogImpPot6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpPot6.gestor.scriptEliminar}"
                                                    rendered="#{LogImpPot6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot6.botonAplicar1_action}"
                                                    binding="#{LogImpPot6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpPot6.gestor.scriptAplicar}"
                                                    rendered="#{LogImpPot6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot6.botonDeshacer1_action}"
                                                    binding="#{LogImpPot6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpPot6.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpPot6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot6.botonConfirmar1_action}"
                                                    binding="#{LogImpPot6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpPot6.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpPot6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot6.botonDescartar1_action}"
                                                    binding="#{LogImpPot6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpPot6.gestor.scriptDescartar}"
                                                    rendered="#{LogImpPot6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpPot6.listaFuncionAccion1}"
                                                    converter="#{LogImpPot6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpPot6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpPot6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpPot6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpPot6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot6.botonProcesar1_action}"
                                                    binding="#{LogImpPot6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpPot6.gestor.scriptProcesar}"
                                                    rendered="#{LogImpPot6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot6.botonRefrescar1_action}"
                                                    binding="#{LogImpPot6.botonRefrescar1}"
                                                    disabled="#{LogImpPot6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpPot6.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpPot6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot6.botonReconsultar1_action}"
                                                    binding="#{LogImpPot6.botonReconsultar1}"
                                                    disabled="#{LogImpPot6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpPot6.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpPot6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot6.botonRetornar1_action}"
                                                    binding="#{LogImpPot6.botonRetornar1}"
                                                    disabled="#{LogImpPot6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpPot6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpPot6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpPot6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{LogImpPot6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpPot6.imageHyperlink1_action}"
                                                    binding="#{LogImpPot6.imageHyperlink1}"
                                                    disabled="#{LogImpPot6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpPot6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpPot6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpPot6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpPot6_imageHyperlink1_toolTip}"/>
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
