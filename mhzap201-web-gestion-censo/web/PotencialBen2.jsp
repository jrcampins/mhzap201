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
                    focus="#{PotencialBen2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{PotencialBen2.gestor.preserveFocus}"
                    preserveScroll="#{PotencialBen2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{PotencialBen2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdPotencialBen1 campoCodigoPotencialBen1 campoNombrePotencialBen1 listaNumeroTipoRegPotBen1 campoIdPersona1 campoNumeroCedula1 campoLetraCedula1 campoFechaExpedicionCedula1 campoFechaVencimientoCedula1 campoPrimerNombre1 campoSegundoNombre1 campoPrimerApellido1 campoSegundoApellido1 campoApellidoCasada1 campoApodo1 campoFechaNacimiento1 campoEdad1 listaEsParaguayoNatural1 listaEsIndigena1 campoIdEtniaIndigena1 campoNombreComunidadIndigena1 campoIdDepartamento1 campoIdDistrito1 listaNumeroTipoArea1 campoIdBarrio1 campoManzana1 campoCompania1 campoDireccion1 campoNombreResponsableHogar1 campoNumeroTelefonoRespHogar1 listaEsPersonaConJubilacion1 listaEsPersonaConPension1 listaEsPersonaConSubsidio1 campoNombreReferente1 campoNumeroTelefonoReferente1 listaNumeroCondicionCenso1 campoFechaValidacionCenso1 campoIdFuncionarioValidacionCen1 listaNumeroCausaInvCenso1 campoOtraCausaInvCenso1 campoComentariosValidacionCenso1 campoIdFichaPersona1 listaNumeroCondicionReclCen1 campoFechaReclamoCenso1 campoComentariosReclamoCenso1 campoFechaAprobacionReclamoCenso1 campoComentariosAprReclCen1 campoFechaDenegacionReclamoCenso1 listaNumeroCausaDenReclCen1 campoOtraCausaDenReclCen1 campoComentariosDenReclCen1 campoFechaRegistroPotBen1 campoIdUsuarioRegPotBen1 listaEsPotencialBenInactivo1 campoFechaUltimaVisitaCenso1 campoObservacionesUltVisitaCen1 campoIdFuncionarioUltVisitaCen1 campoReferenciaDireccion1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{PotencialBen2.breadcrumbs1}" 
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
                                                    rendered="#{PotencialBen2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{PotencialBen2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{PotencialBen2.gestor.mensajeDisponible}"
                                                    text="#{PotencialBen2.gestor.mensaje}"
                                                    url="#{PotencialBen2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{PotencialBen2.gestor.filaDisponible}"
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
                                                        actionExpression="#{PotencialBen2.botonIrAlPrimero1_action}"
                                                        binding="#{PotencialBen2.botonIrAlPrimero1}"
                                                        disabled="#{PotencialBen2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{PotencialBen2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{PotencialBen2.gestor.scriptIrAlPrimero}"
                                                        text="#{PotencialBen2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PotencialBen2.botonIrAlAnterior1_action}"
                                                        binding="#{PotencialBen2.botonIrAlAnterior1}"
                                                        disabled="#{PotencialBen2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{PotencialBen2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{PotencialBen2.gestor.scriptIrAlAnterior}"
                                                        text="#{PotencialBen2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PotencialBen2.botonIrAlSiguiente1_action}"
                                                        binding="#{PotencialBen2.botonIrAlSiguiente1}"
                                                        disabled="#{PotencialBen2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{PotencialBen2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{PotencialBen2.gestor.scriptIrAlSiguiente}"
                                                        text="#{PotencialBen2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PotencialBen2.botonIrAlUltimo1_action}"
                                                        binding="#{PotencialBen2.botonIrAlUltimo1}"
                                                        disabled="#{PotencialBen2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{PotencialBen2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{PotencialBen2.gestor.scriptIrAlUltimo}"
                                                        text="#{PotencialBen2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PotencialBen2.botonProcesarFila1_action}"
                                                        binding="#{PotencialBen2.botonProcesarFila1}"
                                                        disabled="#{PotencialBen2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{PotencialBen2.gestor.urlImagenProcesar}"
                                                        onClick="#{PotencialBen2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{PotencialBen2.asistente.comandoDisponible}"
                                                        text="#{PotencialBen2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{PotencialBen2.gestor.tituloConsulta}"/>
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
                                                    binding="#{PotencialBen2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{PotencialBen2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{PotencialBen2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{PotencialBen2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{PotencialBen2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{PotencialBen2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{PotencialBen2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{PotencialBen2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPotencialBen1" rendered="false"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdPotencialBen1}"
                                                    id="labelIdPotencialBen1"
                                                    for="campoIdPotencialBen1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPotencialBen2" rendered="false"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPotencialBen1"
                                                    binding="#{PotencialBen2.campoIdPotencialBen1}"
                                                    converter="#{PotencialBen2.converterIdPotencialBen1}"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['id_potencial_ben']}"
                                                    toolTip="BundleParametros.id_potencial_ben.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorIdPotencialBen1.validate}"/>
                                                <webuijsf:staticText id="campoIdPotencialBen1Texto1"
                                                    binding="#{PotencialBen2.campoIdPotencialBen1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['id_potencial_ben']}"/>
                                                <webuijsf:message id="messageIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                <webuijsf:helpInline id="helpInlineIdPotencialBen1"
                                                    binding="#{PotencialBen2.helpInlineIdPotencialBen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_potencial_ben.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoPotencialBen1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelCodigoPotencialBen1}"
                                                    id="labelCodigoPotencialBen1"
                                                    for="campoCodigoPotencialBen1"
                                                    text="c&#243;digo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoPotencialBen2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoPotencialBen1"
                                                    binding="#{PotencialBen2.campoCodigoPotencialBen1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_potencial_ben']}"
                                                    toolTip="BundleParametros.codigo_potencial_ben.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorCodigoPotencialBen1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPotencialBen1Texto1"
                                                    binding="#{PotencialBen2.campoCodigoPotencialBen1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_potencial_ben']}"/>
                                                <webuijsf:message id="messageCodigoPotencialBen1"
                                                    for="campoCodigoPotencialBen1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoPotencialBen1"
                                                    binding="#{PotencialBen2.helpInlineCodigoPotencialBen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_potencial_ben.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombrePotencialBen1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNombrePotencialBen1}"
                                                    id="labelNombrePotencialBen1"
                                                    for="campoNombrePotencialBen1"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombrePotencialBen2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombrePotencialBen1"
                                                    binding="#{PotencialBen2.campoNombrePotencialBen1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_potencial_ben']}"
                                                    toolTip="BundleParametros.nombre_potencial_ben.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorNombrePotencialBen1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePotencialBen1Texto1"
                                                    binding="#{PotencialBen2.campoNombrePotencialBen1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_potencial_ben']}"/>
                                                <webuijsf:message id="messageNombrePotencialBen1"
                                                    for="campoNombrePotencialBen1"/>
                                                <webuijsf:helpInline id="helpInlineNombrePotencialBen1"
                                                    binding="#{PotencialBen2.helpInlineNombrePotencialBen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_potencial_ben.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoRegPotBen1"
                                                rendered="#{PotencialBen2.asistente.gridNumeroTipoRegPotBenRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroTipoRegPotBen1}"
                                                    id="labelNumeroTipoRegPotBen1"
                                                    for="listaNumeroTipoRegPotBen1"
                                                    text="tipo registro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoRegPotBen2"
                                                rendered="#{PotencialBen2.asistente.gridNumeroTipoRegPotBenRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoRegPotBen1"
                                                    binding="#{PotencialBen2.listaNumeroTipoRegPotBen1}"
                                                    converter="#{PotencialBen2.converterNumeroTipoRegPotBen1}"
                                                    disabled="#{PotencialBen2.gestor.filaNoCreada}" required="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaNumeroTipoRegPotBen1}"
                                                    onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'listaNumeroTipoRegPotBen1');"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['numero_tipo_reg_pot_ben']}"
                                                    toolTip="BundleParametros.numero_tipo_reg_pot_ben.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroTipoRegPotBen1Texto1"
                                                    binding="#{PotencialBen2.listaNumeroTipoRegPotBen1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_tipo_reg_pot_ben_1x1y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoRegPotBen1"
                                                    for="listaNumeroTipoRegPotBen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoRegPotBen1"
                                                    binding="#{PotencialBen2.helpInlineNumeroTipoRegPotBen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_reg_pot_ben.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaRegistroPotBen1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaRegistroPotBen1}"
                                                    id="labelFechaRegistroPotBen1"
                                                    for="campoFechaRegistroPotBen1"
                                                    text="fecha registro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaRegistroPotBen2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaRegistroPotBen1"
                                                    binding="#{PotencialBen2.campoFechaRegistroPotBen1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_registro_pot_ben']}"
                                                    toolTip="BundleParametros.fecha_registro_pot_ben.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaRegistroPotBen1Texto1"
                                                    binding="#{PotencialBen2.campoFechaRegistroPotBen1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaRegistroPotBen1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_registro_pot_ben']}"/>
                                                <webuijsf:message id="messageFechaRegistroPotBen1"
                                                    for="campoFechaRegistroPotBen1"/>
                                                <webuijsf:helpInline id="helpInlineFechaRegistroPotBen1"
                                                    binding="#{PotencialBen2.helpInlineFechaRegistroPotBen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_registro_pot_ben.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuarioRegPotBen1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdUsuarioRegPotBen1}"
                                                    id="labelIdUsuarioRegPotBen1"
                                                    for="campoIdUsuarioRegPotBen1"
                                                    text="usuario registro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuarioRegPotBen2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdUsuarioRegPotBen1"
                                                    binding="#{PotencialBen2.campoIdUsuarioRegPotBen1}"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.asistente.textoCampoIdUsuarioRegPotBen1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdUsuarioRegPotBen1}"
                                                    validatorExpression="#{PotencialBen2.campoIdUsuarioRegPotBen1_validate}"/>
                                                <webuijsf:staticText id="campoIdUsuarioRegPotBen1Texto1"
                                                    binding="#{PotencialBen2.campoIdUsuarioRegPotBen1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_usuario_1x15y3']}"/>
                                                <webuijsf:button id="campoIdUsuarioRegPotBen1Boton1"
                                                    binding="#{PotencialBen2.campoIdUsuarioRegPotBen1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdUsuarioRegPotBen1Boton1}"/>
                                                <webuijsf:button id="campoIdUsuarioRegPotBen1Boton3"
                                                    binding="#{PotencialBen2.campoIdUsuarioRegPotBen1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdUsuarioRegPotBen1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdUsuarioRegPotBen1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdUsuarioRegPotBen1"
                                                    for="campoIdUsuarioRegPotBen1"/>
                                                <webuijsf:helpInline id="helpInlineIdUsuarioRegPotBen1"
                                                    binding="#{PotencialBen2.helpInlineIdUsuarioRegPotBen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_usuario_reg_pot_ben.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuarioRegPotBen3" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdUsuarioRegPotBen2}"
                                                    id="labelIdUsuarioRegPotBen2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre usuario registro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuarioRegPotBen4" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdUsuarioRegPotBen1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_usuario_1x15y4']}"
                                                    id="campoIdUsuarioRegPotBen1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdUsuarioRegPotBen1Boton2}"
                                                    id="campoIdUsuarioRegPotBen1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdUsuarioRegPotBen1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPotencialBenInactivo1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelEsPotencialBenInactivo1}"
                                                    id="labelEsPotencialBenInactivo1"
                                                    for="listaEsPotencialBenInactivo1"
                                                    text="inactivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPotencialBenInactivo2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPotencialBenInactivo1"
                                                    binding="#{PotencialBen2.listaEsPotencialBenInactivo1}"
                                                    converter="#{PotencialBen2.converterEsPotencialBenInactivo1}"
                                                    disabled="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaEsPotencialBenInactivo1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['es_potencial_ben_inactivo']}"
                                                    toolTip="BundleParametros.es_potencial_ben_inactivo.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsPotencialBenInactivo1Texto1"
                                                    binding="#{PotencialBen2.listaEsPotencialBenInactivo1Texto1}"/>
                                                <webuijsf:message id="messageEsPotencialBenInactivo1"
                                                    for="listaEsPotencialBenInactivo1"/>
                                                <webuijsf:helpInline id="helpInlineEsPotencialBenInactivo1"
                                                    binding="#{PotencialBen2.helpInlineEsPotencialBenInactivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_potencial_ben_inactivo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona1"
                                                rendered="#{PotencialBen2.asistente.gridIdPersonaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"
                                                    text="persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona2"
                                                rendered="#{PotencialBen2.asistente.gridIdPersonaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{PotencialBen2.campoIdPersona1}"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    text="#{PotencialBen2.asistente.textoCampoIdPersona1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdPersona1}"
                                                    validatorExpression="#{PotencialBen2.campoIdPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{PotencialBen2.campoIdPersona1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_persona_1x2y3']}"/>
                                                <webuijsf:button id="campoIdPersona1Boton1"
                                                    binding="#{PotencialBen2.campoIdPersona1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdPersona1Boton3"
                                                    binding="#{PotencialBen2.campoIdPersona1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdPersona1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdPersona1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdPersona1"
                                                    binding="#{PotencialBen2.helpInlineIdPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_persona.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona3"
                                                rendered="#{PotencialBen2.asistente.campoIdPersona1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdPersona2}"
                                                    id="labelIdPersona2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona4"
                                                rendered="#{PotencialBen2.asistente.campoIdPersona1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdPersona1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_persona_1x2y4']}"
                                                    id="campoIdPersona1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdPersona1Boton2}"
                                                    id="campoIdPersona1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdPersona1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCedula1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroCedula1}"
                                                    id="labelNumeroCedula1"
                                                    for="campoNumeroCedula1"
                                                    text="n&#250;mero c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCedula2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroCedula1"
                                                    binding="#{PotencialBen2.campoNumeroCedula1}"
                                                    converter="#{PotencialBen2.converterNumeroCedula1}"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['numero_cedula']}"
                                                    toolTip="BundleParametros.numero_cedula.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorNumeroCedula1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedula1Texto1"
                                                    binding="#{PotencialBen2.campoNumeroCedula1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['numero_cedula']}"/>
                                                <webuijsf:message id="messageNumeroCedula1"
                                                    for="campoNumeroCedula1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCedula1"
                                                    binding="#{PotencialBen2.helpInlineNumeroCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_cedula.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLetraCedula1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelLetraCedula1}"
                                                    id="labelLetraCedula1"
                                                    for="campoLetraCedula1"
                                                    text="letra c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLetraCedula2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoLetraCedula1"
                                                    binding="#{PotencialBen2.campoLetraCedula1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['letra_cedula']}"
                                                    toolTip="BundleParametros.letra_cedula.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorLetraCedula1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedula1Texto1"
                                                    binding="#{PotencialBen2.campoLetraCedula1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['letra_cedula']}"/>
                                                <webuijsf:message id="messageLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                <webuijsf:helpInline id="helpInlineLetraCedula1"
                                                    binding="#{PotencialBen2.helpInlineLetraCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.letra_cedula.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaExpedicionCedula1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaExpedicionCedula1}"
                                                    id="labelFechaExpedicionCedula1"
                                                    for="campoFechaExpedicionCedula1"
                                                    text="fecha expedici&#243;n c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaExpedicionCedula2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaExpedicionCedula1"
                                                    binding="#{PotencialBen2.campoFechaExpedicionCedula1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_expedicion_cedula']}"
                                                    toolTip="BundleParametros.fecha_expedicion_cedula.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaExpedicionCedula1Texto1"
                                                    binding="#{PotencialBen2.campoFechaExpedicionCedula1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaExpedicionCedula1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_expedicion_cedula']}"/>
                                                <webuijsf:message id="messageFechaExpedicionCedula1"
                                                    for="campoFechaExpedicionCedula1"/>
                                                <webuijsf:helpInline id="helpInlineFechaExpedicionCedula1"
                                                    binding="#{PotencialBen2.helpInlineFechaExpedicionCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_expedicion_cedula.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaVencimientoCedula1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaVencimientoCedula1}"
                                                    id="labelFechaVencimientoCedula1"
                                                    for="campoFechaVencimientoCedula1"
                                                    text="fecha vencimiento c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaVencimientoCedula2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaVencimientoCedula1"
                                                    binding="#{PotencialBen2.campoFechaVencimientoCedula1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_vencimiento_cedula']}"
                                                    toolTip="BundleParametros.fecha_vencimiento_cedula.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaVencimientoCedula1Texto1"
                                                    binding="#{PotencialBen2.campoFechaVencimientoCedula1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaVencimientoCedula1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_vencimiento_cedula']}"/>
                                                <webuijsf:message id="messageFechaVencimientoCedula1"
                                                    for="campoFechaVencimientoCedula1"/>
                                                <webuijsf:helpInline id="helpInlineFechaVencimientoCedula1"
                                                    binding="#{PotencialBen2.helpInlineFechaVencimientoCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_vencimiento_cedula.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPrimerNombre1"
                                                rendered="#{PotencialBen2.asistente.gridPrimerNombreRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelPrimerNombre1}"
                                                    id="labelPrimerNombre1"
                                                    for="campoPrimerNombre1"
                                                    text="primer nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerNombre2"
                                                rendered="#{PotencialBen2.asistente.gridPrimerNombreRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoPrimerNombre1"
                                                    binding="#{PotencialBen2.campoPrimerNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1Texto1"
                                                    binding="#{PotencialBen2.campoPrimerNombre1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerNombre1"
                                                    binding="#{PotencialBen2.helpInlinePrimerNombre1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_nombre.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoNombre1"
                                                rendered="#{PotencialBen2.asistente.gridSegundoNombreRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelSegundoNombre1}"
                                                    id="labelSegundoNombre1"
                                                    for="campoSegundoNombre1"
                                                    text="segundo nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoNombre2"
                                                rendered="#{PotencialBen2.asistente.gridSegundoNombreRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoSegundoNombre1"
                                                    binding="#{PotencialBen2.campoSegundoNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1Texto1"
                                                    binding="#{PotencialBen2.campoSegundoNombre1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoNombre1"
                                                    binding="#{PotencialBen2.helpInlineSegundoNombre1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_nombre.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPrimerApellido1"
                                                rendered="#{PotencialBen2.asistente.gridPrimerApellidoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelPrimerApellido1}"
                                                    id="labelPrimerApellido1"
                                                    for="campoPrimerApellido1"
                                                    text="primer apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerApellido2"
                                                rendered="#{PotencialBen2.asistente.gridPrimerApellidoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoPrimerApellido1"
                                                    binding="#{PotencialBen2.campoPrimerApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1Texto1"
                                                    binding="#{PotencialBen2.campoPrimerApellido1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerApellido1"
                                                    binding="#{PotencialBen2.helpInlinePrimerApellido1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_apellido.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoApellido1"
                                                rendered="#{PotencialBen2.asistente.gridSegundoApellidoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelSegundoApellido1}"
                                                    id="labelSegundoApellido1"
                                                    for="campoSegundoApellido1"
                                                    text="segundo apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoApellido2"
                                                rendered="#{PotencialBen2.asistente.gridSegundoApellidoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoSegundoApellido1"
                                                    binding="#{PotencialBen2.campoSegundoApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1Texto1"
                                                    binding="#{PotencialBen2.campoSegundoApellido1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoApellido1"
                                                    binding="#{PotencialBen2.helpInlineSegundoApellido1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_apellido.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridApellidoCasada1"
                                                rendered="#{PotencialBen2.asistente.gridApellidoCasadaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelApellidoCasada1}"
                                                    id="labelApellidoCasada1"
                                                    for="campoApellidoCasada1"
                                                    text="apellido casada"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridApellidoCasada2"
                                                rendered="#{PotencialBen2.asistente.gridApellidoCasadaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoApellidoCasada1"
                                                    binding="#{PotencialBen2.campoApellidoCasada1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['apellido_casada']}"
                                                    toolTip="BundleParametros.apellido_casada.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorApellidoCasada1.validate}"/>
                                                <webuijsf:staticText id="campoApellidoCasada1Texto1"
                                                    binding="#{PotencialBen2.campoApellidoCasada1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['apellido_casada']}"/>
                                                <webuijsf:message id="messageApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                <webuijsf:helpInline id="helpInlineApellidoCasada1"
                                                    binding="#{PotencialBen2.helpInlineApellidoCasada1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.apellido_casada.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridApodo1"
                                                rendered="#{PotencialBen2.asistente.gridApodoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelApodo1}"
                                                    id="labelApodo1"
                                                    for="campoApodo1"
                                                    text="apodo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridApodo2"
                                                rendered="#{PotencialBen2.asistente.gridApodoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoApodo1"
                                                    binding="#{PotencialBen2.campoApodo1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['apodo']}"
                                                    toolTip="BundleParametros.apodo.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorApodo1.validate}"/>
                                                <webuijsf:staticText id="campoApodo1Texto1"
                                                    binding="#{PotencialBen2.campoApodo1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['apodo']}"/>
                                                <webuijsf:message id="messageApodo1"
                                                    for="campoApodo1"/>
                                                <webuijsf:helpInline id="helpInlineApodo1"
                                                    binding="#{PotencialBen2.helpInlineApodo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.apodo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaNacimiento1"
                                                rendered="#{PotencialBen2.asistente.gridFechaNacimientoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaNacimiento1}"
                                                    id="labelFechaNacimiento1"
                                                    for="campoFechaNacimiento1"
                                                    text="fecha nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaNacimiento2"
                                                rendered="#{PotencialBen2.asistente.gridFechaNacimientoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaNacimiento1"
                                                    binding="#{PotencialBen2.campoFechaNacimiento1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_nacimiento']}"
                                                    toolTip="BundleParametros.fecha_nacimiento.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaNacimiento1Texto1"
                                                    binding="#{PotencialBen2.campoFechaNacimiento1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaNacimiento1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_nacimiento']}"/>
                                                <webuijsf:message id="messageFechaNacimiento1"
                                                    for="campoFechaNacimiento1"/>
                                                <webuijsf:helpInline id="helpInlineFechaNacimiento1"
                                                    binding="#{PotencialBen2.helpInlineFechaNacimiento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_nacimiento.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEdad1"
                                                rendered="#{PotencialBen2.asistente.gridEdadRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelEdad1}"
                                                    id="labelEdad1"
                                                    for="campoEdad1"
                                                    text="edad"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEdad2"
                                                rendered="#{PotencialBen2.asistente.gridEdadRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoEdad1"
                                                    binding="#{PotencialBen2.campoEdad1}"
                                                    converter="#{PotencialBen2.converterEdad1}"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['edad']}"
                                                    toolTip="BundleParametros.edad.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorEdad1.validate}"/>
                                                <webuijsf:staticText id="campoEdad1Texto1"
                                                    binding="#{PotencialBen2.campoEdad1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['edad']}"/>
                                                <webuijsf:message id="messageEdad1"
                                                    for="campoEdad1"/>
                                                <webuijsf:helpInline id="helpInlineEdad1"
                                                    binding="#{PotencialBen2.helpInlineEdad1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.edad.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsParaguayoNatural1"
                                                rendered="#{PotencialBen2.asistente.gridEsParaguayoNaturalRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelEsParaguayoNatural1}"
                                                    id="labelEsParaguayoNatural1"
                                                    for="listaEsParaguayoNatural1"
                                                    text="paraguayo natural"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsParaguayoNatural2"
                                                rendered="#{PotencialBen2.asistente.gridEsParaguayoNaturalRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsParaguayoNatural1"
                                                    binding="#{PotencialBen2.listaEsParaguayoNatural1}"
                                                    converter="#{PotencialBen2.converterEsParaguayoNatural1}"
                                                    disabled="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaEsParaguayoNatural1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['es_paraguayo_natural']}"
                                                    toolTip="BundleParametros.es_paraguayo_natural.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsParaguayoNatural1Texto1"
                                                    binding="#{PotencialBen2.listaEsParaguayoNatural1Texto1}"/>
                                                <webuijsf:message id="messageEsParaguayoNatural1"
                                                    for="listaEsParaguayoNatural1"/>
                                                <webuijsf:helpInline id="helpInlineEsParaguayoNatural1"
                                                    binding="#{PotencialBen2.helpInlineEsParaguayoNatural1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_paraguayo_natural.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsIndigena1"
                                                rendered="#{PotencialBen2.asistente.gridEsIndigenaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelEsIndigena1}"
                                                    id="labelEsIndigena1"
                                                    for="listaEsIndigena1"
                                                    text="indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsIndigena2"
                                                rendered="#{PotencialBen2.asistente.gridEsIndigenaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsIndigena1"
                                                    binding="#{PotencialBen2.listaEsIndigena1}"
                                                    converter="#{PotencialBen2.converterEsIndigena1}"
                                                    disabled="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaEsIndigena1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['es_indigena']}"
                                                    toolTip="BundleParametros.es_indigena.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsIndigena1Texto1"
                                                    binding="#{PotencialBen2.listaEsIndigena1Texto1}"/>
                                                <webuijsf:message id="messageEsIndigena1"
                                                    for="listaEsIndigena1"/>
                                                <webuijsf:helpInline id="helpInlineEsIndigena1"
                                                    binding="#{PotencialBen2.helpInlineEsIndigena1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_indigena.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdEtniaIndigena1"
                                                rendered="#{PotencialBen2.asistente.gridIdEtniaIndigenaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdEtniaIndigena1}"
                                                    id="labelIdEtniaIndigena1"
                                                    for="campoIdEtniaIndigena1"
                                                    text="etnia indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdEtniaIndigena2"
                                                rendered="#{PotencialBen2.asistente.gridIdEtniaIndigenaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdEtniaIndigena1"
                                                    binding="#{PotencialBen2.campoIdEtniaIndigena1}"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.asistente.textoCampoIdEtniaIndigena1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdEtniaIndigena1}"
                                                    validatorExpression="#{PotencialBen2.campoIdEtniaIndigena1_validate}"/>
                                                <webuijsf:staticText id="campoIdEtniaIndigena1Texto1"
                                                    binding="#{PotencialBen2.campoIdEtniaIndigena1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_etnia_indigena_1x3y3']}"/>
                                                <webuijsf:button id="campoIdEtniaIndigena1Boton1"
                                                    binding="#{PotencialBen2.campoIdEtniaIndigena1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdEtniaIndigena1Boton1}"/>
                                                <webuijsf:button id="campoIdEtniaIndigena1Boton3"
                                                    binding="#{PotencialBen2.campoIdEtniaIndigena1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdEtniaIndigena1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdEtniaIndigena1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdEtniaIndigena1"
                                                    for="campoIdEtniaIndigena1"/>
                                                <webuijsf:helpInline id="helpInlineIdEtniaIndigena1"
                                                    binding="#{PotencialBen2.helpInlineIdEtniaIndigena1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_etnia_indigena.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdEtniaIndigena3"
                                                rendered="#{PotencialBen2.asistente.campoIdEtniaIndigena1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdEtniaIndigena2}"
                                                    id="labelIdEtniaIndigena2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre etnia indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdEtniaIndigena4"
                                                rendered="#{PotencialBen2.asistente.campoIdEtniaIndigena1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdEtniaIndigena1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_etnia_indigena_1x3y4']}"
                                                    id="campoIdEtniaIndigena1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdEtniaIndigena1Boton2}"
                                                    id="campoIdEtniaIndigena1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdEtniaIndigena1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreComunidadIndigena1"
                                                rendered="#{PotencialBen2.asistente.gridNombreComunidadIndigenaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNombreComunidadIndigena1}"
                                                    id="labelNombreComunidadIndigena1"
                                                    for="campoNombreComunidadIndigena1"
                                                    text="nombre comunidad indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreComunidadIndigena2"
                                                rendered="#{PotencialBen2.asistente.gridNombreComunidadIndigenaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreComunidadIndigena1"
                                                    binding="#{PotencialBen2.campoNombreComunidadIndigena1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_comunidad_indigena']}"
                                                    toolTip="BundleParametros.nombre_comunidad_indigena.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorNombreComunidadIndigena1.validate}"/>
                                                <webuijsf:staticText id="campoNombreComunidadIndigena1Texto1"
                                                    binding="#{PotencialBen2.campoNombreComunidadIndigena1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_comunidad_indigena']}"/>
                                                <webuijsf:message id="messageNombreComunidadIndigena1"
                                                    for="campoNombreComunidadIndigena1"/>
                                                <webuijsf:helpInline id="helpInlineNombreComunidadIndigena1"
                                                    binding="#{PotencialBen2.helpInlineNombreComunidadIndigena1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_comunidad_indigena.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento1"
                                                rendered="#{PotencialBen2.asistente.gridIdDepartamentoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdDepartamento1}"
                                                    id="labelIdDepartamento1"
                                                    for="campoIdDepartamento1"
                                                    text="departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento2"
                                                rendered="#{PotencialBen2.asistente.gridIdDepartamentoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDepartamento1"
                                                    binding="#{PotencialBen2.campoIdDepartamento1}"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.asistente.textoCampoIdDepartamento1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{PotencialBen2.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1Texto1"
                                                    binding="#{PotencialBen2.campoIdDepartamento1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_ubicacion_1x4y3']}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton1"
                                                    binding="#{PotencialBen2.campoIdDepartamento1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton3"
                                                    binding="#{PotencialBen2.campoIdDepartamento1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdDepartamento1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                <webuijsf:helpInline id="helpInlineIdDepartamento1"
                                                    binding="#{PotencialBen2.helpInlineIdDepartamento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_departamento.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento3"
                                                rendered="#{PotencialBen2.asistente.campoIdDepartamento1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdDepartamento2}"
                                                    id="labelIdDepartamento2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento4"
                                                rendered="#{PotencialBen2.asistente.campoIdDepartamento1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdDepartamento1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_ubicacion_1x4y4']}"
                                                    id="campoIdDepartamento1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdDepartamento1Boton2}"
                                                    id="campoIdDepartamento1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdDepartamento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito1"
                                                rendered="#{PotencialBen2.asistente.gridIdDistritoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdDistrito1}"
                                                    id="labelIdDistrito1"
                                                    for="campoIdDistrito1"
                                                    text="distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito2"
                                                rendered="#{PotencialBen2.asistente.gridIdDistritoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDistrito1"
                                                    binding="#{PotencialBen2.campoIdDistrito1}"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.asistente.textoCampoIdDistrito1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{PotencialBen2.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1Texto1"
                                                    binding="#{PotencialBen2.campoIdDistrito1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_ubicacion_1x5y3']}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton1"
                                                    binding="#{PotencialBen2.campoIdDistrito1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton3"
                                                    binding="#{PotencialBen2.campoIdDistrito1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdDistrito1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                <webuijsf:helpInline id="helpInlineIdDistrito1"
                                                    binding="#{PotencialBen2.helpInlineIdDistrito1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_distrito.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito3"
                                                rendered="#{PotencialBen2.asistente.campoIdDistrito1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdDistrito2}"
                                                    id="labelIdDistrito2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito4"
                                                rendered="#{PotencialBen2.asistente.campoIdDistrito1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdDistrito1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_ubicacion_1x5y4']}"
                                                    id="campoIdDistrito1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdDistrito1Boton2}"
                                                    id="campoIdDistrito1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdDistrito1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoArea1"
                                                rendered="#{PotencialBen2.asistente.gridNumeroTipoAreaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroTipoArea1}"
                                                    id="labelNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"
                                                    text="tipo area"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoArea2"
                                                rendered="#{PotencialBen2.asistente.gridNumeroTipoAreaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoArea1"
                                                    binding="#{PotencialBen2.listaNumeroTipoArea1}"
                                                    converter="#{PotencialBen2.converterNumeroTipoArea1}"
                                                    disabled="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    items="#{PotencialBen2.asistente.opcionesListaNumeroTipoArea1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['numero_tipo_area']}"
                                                    toolTip="BundleParametros.numero_tipo_area.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroTipoArea1Texto1"
                                                    binding="#{PotencialBen2.listaNumeroTipoArea1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_tipo_area_1x6y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoArea1"
                                                    binding="#{PotencialBen2.helpInlineNumeroTipoArea1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_area.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio1"
                                                rendered="#{PotencialBen2.asistente.gridIdBarrioRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdBarrio1}"
                                                    id="labelIdBarrio1"
                                                    for="campoIdBarrio1"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio2"
                                                rendered="#{PotencialBen2.asistente.gridIdBarrioRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdBarrio1"
                                                    binding="#{PotencialBen2.campoIdBarrio1}"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.asistente.textoCampoIdBarrio1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{PotencialBen2.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1Texto1"
                                                    binding="#{PotencialBen2.campoIdBarrio1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_ubicacion_1x7y3']}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton1"
                                                    binding="#{PotencialBen2.campoIdBarrio1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton3"
                                                    binding="#{PotencialBen2.campoIdBarrio1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdBarrio1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                <webuijsf:helpInline id="helpInlineIdBarrio1"
                                                    binding="#{PotencialBen2.helpInlineIdBarrio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_barrio.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio3"
                                                rendered="#{PotencialBen2.asistente.campoIdBarrio1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdBarrio2}"
                                                    id="labelIdBarrio2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio4"
                                                rendered="#{PotencialBen2.asistente.campoIdBarrio1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdBarrio1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_ubicacion_1x7y4']}"
                                                    id="campoIdBarrio1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdBarrio1Boton2}"
                                                    id="campoIdBarrio1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdBarrio1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridManzana1"
                                                rendered="#{PotencialBen2.asistente.gridManzanaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelManzana1}"
                                                    id="labelManzana1"
                                                    for="campoManzana1"
                                                    text="manzana"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridManzana2"
                                                rendered="#{PotencialBen2.asistente.gridManzanaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoManzana1"
                                                    binding="#{PotencialBen2.campoManzana1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['manzana']}"
                                                    toolTip="BundleParametros.manzana.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorManzana1.validate}"/>
                                                <webuijsf:staticText id="campoManzana1Texto1"
                                                    binding="#{PotencialBen2.campoManzana1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['manzana']}"/>
                                                <webuijsf:message id="messageManzana1"
                                                    for="campoManzana1"/>
                                                <webuijsf:helpInline id="helpInlineManzana1"
                                                    binding="#{PotencialBen2.helpInlineManzana1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.manzana.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCompania1"
                                                rendered="#{PotencialBen2.asistente.gridCompaniaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelCompania1}"
                                                    id="labelCompania1"
                                                    for="campoCompania1"
                                                    text="compa&#241;ia"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCompania2"
                                                rendered="#{PotencialBen2.asistente.gridCompaniaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCompania1"
                                                    binding="#{PotencialBen2.campoCompania1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['compania']}"
                                                    toolTip="BundleParametros.compania.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorCompania1.validate}"/>
                                                <webuijsf:staticText id="campoCompania1Texto1"
                                                    binding="#{PotencialBen2.campoCompania1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['compania']}"/>
                                                <webuijsf:message id="messageCompania1"
                                                    for="campoCompania1"/>
                                                <webuijsf:helpInline id="helpInlineCompania1"
                                                    binding="#{PotencialBen2.helpInlineCompania1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.compania.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDireccion1"
                                                rendered="#{PotencialBen2.asistente.gridDireccionRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelDireccion1}"
                                                    id="labelDireccion1"
                                                    for="campoDireccion1"
                                                    text="direcci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDireccion2"
                                                rendered="#{PotencialBen2.asistente.gridDireccionRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDireccion1"
                                                    binding="#{PotencialBen2.campoDireccion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['direccion']}"
                                                    toolTip="BundleParametros.direccion.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoDireccion1Texto1"
                                                    binding="#{PotencialBen2.campoDireccion1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['direccion']}"/>
                                                <webuijsf:message id="messageDireccion1"
                                                    for="campoDireccion1"/>
                                                <webuijsf:helpInline id="helpInlineDireccion1"
                                                    binding="#{PotencialBen2.helpInlineDireccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.direccion.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridReferenciaDireccion1"
                                                rendered="#{PotencialBen2.asistente.gridReferenciaDireccionRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelReferenciaDireccion1}"
                                                    id="labelReferenciaDireccion1"
                                                    for="campoReferenciaDireccion1"
                                                    text="referencia direcci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridReferenciaDireccion2"
                                                rendered="#{PotencialBen2.asistente.gridReferenciaDireccionRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoReferenciaDireccion1"
                                                    binding="#{PotencialBen2.campoReferenciaDireccion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['referencia_direccion']}"
                                                    toolTip="BundleParametros.referencia_direccion.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorReferenciaDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoReferenciaDireccion1Texto1"
                                                    binding="#{PotencialBen2.campoReferenciaDireccion1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['referencia_direccion']}"/>
                                                <webuijsf:message id="messageReferenciaDireccion1"
                                                    for="campoReferenciaDireccion1"/>
                                                <webuijsf:helpInline id="helpInlineReferenciaDireccion1"
                                                    binding="#{PotencialBen2.helpInlineReferenciaDireccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.referencia_direccion.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConJubilacion1"
                                                rendered="#{PotencialBen2.asistente.gridEsPersonaConJubilacionRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelEsPersonaConJubilacion1}"
                                                    id="labelEsPersonaConJubilacion1"
                                                    for="listaEsPersonaConJubilacion1"
                                                    text="persona con jubilaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConJubilacion2"
                                                rendered="#{PotencialBen2.asistente.gridEsPersonaConJubilacionRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConJubilacion1"
                                                    binding="#{PotencialBen2.listaEsPersonaConJubilacion1}"
                                                    converter="#{PotencialBen2.converterEsPersonaConJubilacion1}"
                                                    disabled="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaEsPersonaConJubilacion1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['es_persona_con_jubilacion']}"
                                                    toolTip="BundleParametros.es_persona_con_jubilacion.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsPersonaConJubilacion1Texto1"
                                                    binding="#{PotencialBen2.listaEsPersonaConJubilacion1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConJubilacion1"
                                                    for="listaEsPersonaConJubilacion1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConJubilacion1"
                                                    binding="#{PotencialBen2.helpInlineEsPersonaConJubilacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_jubilacion.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConPension1"
                                                rendered="#{PotencialBen2.asistente.gridEsPersonaConPensionRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelEsPersonaConPension1}"
                                                    id="labelEsPersonaConPension1"
                                                    for="listaEsPersonaConPension1"
                                                    text="persona con pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConPension2"
                                                rendered="#{PotencialBen2.asistente.gridEsPersonaConPensionRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConPension1"
                                                    binding="#{PotencialBen2.listaEsPersonaConPension1}"
                                                    converter="#{PotencialBen2.converterEsPersonaConPension1}"
                                                    disabled="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaEsPersonaConPension1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['es_persona_con_pension']}"
                                                    toolTip="BundleParametros.es_persona_con_pension.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsPersonaConPension1Texto1"
                                                    binding="#{PotencialBen2.listaEsPersonaConPension1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConPension1"
                                                    for="listaEsPersonaConPension1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConPension1"
                                                    binding="#{PotencialBen2.helpInlineEsPersonaConPension1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_pension.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConSubsidio1"
                                                rendered="#{PotencialBen2.asistente.gridEsPersonaConSubsidioRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelEsPersonaConSubsidio1}"
                                                    id="labelEsPersonaConSubsidio1"
                                                    for="listaEsPersonaConSubsidio1"
                                                    text="persona con subsidio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConSubsidio2"
                                                rendered="#{PotencialBen2.asistente.gridEsPersonaConSubsidioRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConSubsidio1"
                                                    binding="#{PotencialBen2.listaEsPersonaConSubsidio1}"
                                                    converter="#{PotencialBen2.converterEsPersonaConSubsidio1}"
                                                    disabled="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaEsPersonaConSubsidio1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['es_persona_con_subsidio']}"
                                                    toolTip="BundleParametros.es_persona_con_subsidio.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsPersonaConSubsidio1Texto1"
                                                    binding="#{PotencialBen2.listaEsPersonaConSubsidio1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConSubsidio1"
                                                    for="listaEsPersonaConSubsidio1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConSubsidio1"
                                                    binding="#{PotencialBen2.helpInlineEsPersonaConSubsidio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_subsidio.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreResponsableHogar1"
                                                rendered="#{PotencialBen2.asistente.gridNombreResponsableHogarRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNombreResponsableHogar1}"
                                                    id="labelNombreResponsableHogar1"
                                                    for="campoNombreResponsableHogar1"
                                                    text="nombre responsable hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreResponsableHogar2"
                                                rendered="#{PotencialBen2.asistente.gridNombreResponsableHogarRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreResponsableHogar1"
                                                    binding="#{PotencialBen2.campoNombreResponsableHogar1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_responsable_hogar']}"
                                                    toolTip="BundleParametros.nombre_responsable_hogar.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorNombreResponsableHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNombreResponsableHogar1Texto1"
                                                    binding="#{PotencialBen2.campoNombreResponsableHogar1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_responsable_hogar']}"/>
                                                <webuijsf:message id="messageNombreResponsableHogar1"
                                                    for="campoNombreResponsableHogar1"/>
                                                <webuijsf:helpInline id="helpInlineNombreResponsableHogar1"
                                                    binding="#{PotencialBen2.helpInlineNombreResponsableHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_responsable_hogar.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTelefonoRespHogar1"
                                                rendered="#{PotencialBen2.asistente.gridNumeroTelefonoRespHogarRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroTelefonoRespHogar1}"
                                                    id="labelNumeroTelefonoRespHogar1"
                                                    for="campoNumeroTelefonoRespHogar1"
                                                    text="n&#250;mero tel&#233;fono responsable hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTelefonoRespHogar2"
                                                rendered="#{PotencialBen2.asistente.gridNumeroTelefonoRespHogarRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroTelefonoRespHogar1"
                                                    binding="#{PotencialBen2.campoNumeroTelefonoRespHogar1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['numero_telefono_resp_hogar']}"
                                                    toolTip="BundleParametros.numero_telefono_resp_hogar.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorNumeroTelefonoRespHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoRespHogar1Texto1"
                                                    binding="#{PotencialBen2.campoNumeroTelefonoRespHogar1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['numero_telefono_resp_hogar']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoRespHogar1"
                                                    for="campoNumeroTelefonoRespHogar1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTelefonoRespHogar1"
                                                    binding="#{PotencialBen2.helpInlineNumeroTelefonoRespHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_telefono_resp_hogar.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreReferente1"
                                                rendered="#{PotencialBen2.asistente.gridNombreReferenteRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNombreReferente1}"
                                                    id="labelNombreReferente1"
                                                    for="campoNombreReferente1"
                                                    text="nombre referente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreReferente2"
                                                rendered="#{PotencialBen2.asistente.gridNombreReferenteRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreReferente1"
                                                    binding="#{PotencialBen2.campoNombreReferente1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_referente']}"
                                                    toolTip="BundleParametros.nombre_referente.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorNombreReferente1.validate}"/>
                                                <webuijsf:staticText id="campoNombreReferente1Texto1"
                                                    binding="#{PotencialBen2.campoNombreReferente1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_referente']}"/>
                                                <webuijsf:message id="messageNombreReferente1"
                                                    for="campoNombreReferente1"/>
                                                <webuijsf:helpInline id="helpInlineNombreReferente1"
                                                    binding="#{PotencialBen2.helpInlineNombreReferente1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_referente.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTelefonoReferente1"
                                                rendered="#{PotencialBen2.asistente.gridNumeroTelefonoReferenteRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroTelefonoReferente1}"
                                                    id="labelNumeroTelefonoReferente1"
                                                    for="campoNumeroTelefonoReferente1"
                                                    text="n&#250;mero tel&#233;fono referente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTelefonoReferente2"
                                                rendered="#{PotencialBen2.asistente.gridNumeroTelefonoReferenteRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroTelefonoReferente1"
                                                    binding="#{PotencialBen2.campoNumeroTelefonoReferente1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['numero_telefono_referente']}"
                                                    toolTip="BundleParametros.numero_telefono_referente.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorNumeroTelefonoReferente1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoReferente1Texto1"
                                                    binding="#{PotencialBen2.campoNumeroTelefonoReferente1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['numero_telefono_referente']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoReferente1"
                                                    for="campoNumeroTelefonoReferente1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTelefonoReferente1"
                                                    binding="#{PotencialBen2.helpInlineNumeroTelefonoReferente1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_telefono_referente.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCondicionCenso1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroCondicionCenso1}"
                                                    id="labelNumeroCondicionCenso1"
                                                    for="listaNumeroCondicionCenso1"
                                                    text="condici&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCondicionCenso2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCondicionCenso1"
                                                    binding="#{PotencialBen2.listaNumeroCondicionCenso1}"
                                                    converter="#{PotencialBen2.converterNumeroCondicionCenso1}"
                                                    disabled="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaNumeroCondicionCenso1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['numero_condicion_censo']}"
                                                    toolTip="BundleParametros.numero_condicion_censo.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroCondicionCenso1Texto1"
                                                    binding="#{PotencialBen2.listaNumeroCondicionCenso1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_condicion_censo_1x9y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionCenso1"
                                                    for="listaNumeroCondicionCenso1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCondicionCenso1"
                                                    binding="#{PotencialBen2.helpInlineNumeroCondicionCenso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_condicion_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaValidacionCenso1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaValidacionCenso1}"
                                                    id="labelFechaValidacionCenso1"
                                                    for="campoFechaValidacionCenso1"
                                                    text="fecha validaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaValidacionCenso2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaValidacionCenso1"
                                                    binding="#{PotencialBen2.campoFechaValidacionCenso1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_validacion_censo']}"
                                                    toolTip="BundleParametros.fecha_validacion_censo.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaValidacionCenso1Texto1"
                                                    binding="#{PotencialBen2.campoFechaValidacionCenso1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaValidacionCenso1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_validacion_censo']}"/>
                                                <webuijsf:message id="messageFechaValidacionCenso1"
                                                    for="campoFechaValidacionCenso1"/>
                                                <webuijsf:helpInline id="helpInlineFechaValidacionCenso1"
                                                    binding="#{PotencialBen2.helpInlineFechaValidacionCenso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_validacion_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioValidacionCen1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdFuncionarioValidacionCen1}"
                                                    id="labelIdFuncionarioValidacionCen1"
                                                    for="campoIdFuncionarioValidacionCen1"
                                                    text="funcionario validaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioValidacionCen2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionarioValidacionCen1"
                                                    binding="#{PotencialBen2.campoIdFuncionarioValidacionCen1}"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.asistente.textoCampoIdFuncionarioValidacionCen1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdFuncionarioValidacionCen1}"
                                                    validatorExpression="#{PotencialBen2.campoIdFuncionarioValidacionCen1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioValidacionCen1Texto1"
                                                    binding="#{PotencialBen2.campoIdFuncionarioValidacionCen1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_funcionario_1x10y3']}"/>
                                                <webuijsf:button id="campoIdFuncionarioValidacionCen1Boton1"
                                                    binding="#{PotencialBen2.campoIdFuncionarioValidacionCen1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFuncionarioValidacionCen1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionarioValidacionCen1Boton3"
                                                    binding="#{PotencialBen2.campoIdFuncionarioValidacionCen1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFuncionarioValidacionCen1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdFuncionarioValidacionCen1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionarioValidacionCen1"
                                                    for="campoIdFuncionarioValidacionCen1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionarioValidacionCen1"
                                                    binding="#{PotencialBen2.helpInlineIdFuncionarioValidacionCen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcionario_validacion_cen.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioValidacionCen3" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdFuncionarioValidacionCen2}"
                                                    id="labelIdFuncionarioValidacionCen2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcionario validaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioValidacionCen4" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdFuncionarioValidacionCen1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_funcionario_1x10y4']}"
                                                    id="campoIdFuncionarioValidacionCen1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdFuncionarioValidacionCen1Boton2}"
                                                    id="campoIdFuncionarioValidacionCen1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFuncionarioValidacionCen1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaInvCenso1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroCausaInvCenso1}"
                                                    id="labelNumeroCausaInvCenso1"
                                                    for="listaNumeroCausaInvCenso1"
                                                    text="causa invalidaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaInvCenso2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaInvCenso1"
                                                    binding="#{PotencialBen2.listaNumeroCausaInvCenso1}"
                                                    converter="#{PotencialBen2.converterNumeroCausaInvCenso1}"
                                                    disabled="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaNumeroCausaInvCenso1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['numero_causa_inv_censo']}"
                                                    toolTip="BundleParametros.numero_causa_inv_censo.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroCausaInvCenso1Texto1"
                                                    binding="#{PotencialBen2.listaNumeroCausaInvCenso1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_causa_inv_censo_1x11y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaInvCenso1"
                                                    for="listaNumeroCausaInvCenso1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaInvCenso1"
                                                    binding="#{PotencialBen2.helpInlineNumeroCausaInvCenso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_inv_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaInvCenso1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelOtraCausaInvCenso1}"
                                                    id="labelOtraCausaInvCenso1"
                                                    for="campoOtraCausaInvCenso1"
                                                    text="otra causa invalidaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaInvCenso2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaInvCenso1"
                                                    binding="#{PotencialBen2.campoOtraCausaInvCenso1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['otra_causa_inv_censo']}"
                                                    toolTip="BundleParametros.otra_causa_inv_censo.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorOtraCausaInvCenso1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaInvCenso1Texto1"
                                                    binding="#{PotencialBen2.campoOtraCausaInvCenso1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['otra_causa_inv_censo']}"/>
                                                <webuijsf:message id="messageOtraCausaInvCenso1"
                                                    for="campoOtraCausaInvCenso1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaInvCenso1"
                                                    binding="#{PotencialBen2.helpInlineOtraCausaInvCenso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_inv_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosValidacionCenso1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelComentariosValidacionCenso1}"
                                                    id="labelComentariosValidacionCenso1"
                                                    for="campoComentariosValidacionCenso1"
                                                    text="comentarios validaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosValidacionCenso2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosValidacionCenso1"
                                                    binding="#{PotencialBen2.campoComentariosValidacionCenso1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['comentarios_validacion_censo']}"
                                                    toolTip="BundleParametros.comentarios_validacion_censo.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorComentariosValidacionCenso1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosValidacionCenso1Texto1"
                                                    binding="#{PotencialBen2.campoComentariosValidacionCenso1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['comentarios_validacion_censo']}"/>
                                                <webuijsf:message id="messageComentariosValidacionCenso1"
                                                    for="campoComentariosValidacionCenso1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosValidacionCenso1"
                                                    binding="#{PotencialBen2.helpInlineComentariosValidacionCenso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_validacion_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaPersona1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdFichaPersona1}"
                                                    id="labelIdFichaPersona1"
                                                    for="campoIdFichaPersona1"
                                                    text="ficha persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFichaPersona1"
                                                    binding="#{PotencialBen2.campoIdFichaPersona1}"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.asistente.textoCampoIdFichaPersona1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdFichaPersona1}"
                                                    validatorExpression="#{PotencialBen2.campoIdFichaPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdFichaPersona1Texto1"
                                                    binding="#{PotencialBen2.campoIdFichaPersona1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_ficha_persona_1x12y3']}"/>
                                                <webuijsf:button id="campoIdFichaPersona1Boton1"
                                                    binding="#{PotencialBen2.campoIdFichaPersona1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFichaPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdFichaPersona1Boton3"
                                                    binding="#{PotencialBen2.campoIdFichaPersona1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFichaPersona1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdFichaPersona1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdFichaPersona1"
                                                    binding="#{PotencialBen2.helpInlineIdFichaPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_ficha_persona.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaPersona3" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdFichaPersona2}"
                                                    id="labelIdFichaPersona2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre ficha persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona4" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdFichaPersona1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_ficha_persona_1x12y4']}"
                                                    id="campoIdFichaPersona1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdFichaPersona1Boton2}"
                                                    id="campoIdFichaPersona1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFichaPersona1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCondicionReclCen1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroCondicionReclCen1}"
                                                    id="labelNumeroCondicionReclCen1"
                                                    for="listaNumeroCondicionReclCen1"
                                                    text="condici&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCondicionReclCen2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCondicionReclCen1"
                                                    binding="#{PotencialBen2.listaNumeroCondicionReclCen1}"
                                                    converter="#{PotencialBen2.converterNumeroCondicionReclCen1}"
                                                    disabled="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaNumeroCondicionReclCen1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['numero_condicion_recl_cen']}"
                                                    toolTip="BundleParametros.numero_condicion_recl_cen.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroCondicionReclCen1Texto1"
                                                    binding="#{PotencialBen2.listaNumeroCondicionReclCen1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_condicion_recl_c_1x13y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionReclCen1"
                                                    for="listaNumeroCondicionReclCen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCondicionReclCen1"
                                                    binding="#{PotencialBen2.helpInlineNumeroCondicionReclCen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_condicion_recl_cen.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaReclamoCenso1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaReclamoCenso1}"
                                                    id="labelFechaReclamoCenso1"
                                                    for="campoFechaReclamoCenso1"
                                                    text="fecha reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaReclamoCenso2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaReclamoCenso1"
                                                    binding="#{PotencialBen2.campoFechaReclamoCenso1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_reclamo_censo']}"
                                                    toolTip="BundleParametros.fecha_reclamo_censo.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaReclamoCenso1Texto1"
                                                    binding="#{PotencialBen2.campoFechaReclamoCenso1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaReclamoCenso1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_reclamo_censo']}"/>
                                                <webuijsf:message id="messageFechaReclamoCenso1"
                                                    for="campoFechaReclamoCenso1"/>
                                                <webuijsf:helpInline id="helpInlineFechaReclamoCenso1"
                                                    binding="#{PotencialBen2.helpInlineFechaReclamoCenso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_reclamo_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosReclamoCenso1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelComentariosReclamoCenso1}"
                                                    id="labelComentariosReclamoCenso1"
                                                    for="campoComentariosReclamoCenso1"
                                                    text="comentarios reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosReclamoCenso2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosReclamoCenso1"
                                                    binding="#{PotencialBen2.campoComentariosReclamoCenso1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['comentarios_reclamo_censo']}"
                                                    toolTip="BundleParametros.comentarios_reclamo_censo.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorComentariosReclamoCenso1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosReclamoCenso1Texto1"
                                                    binding="#{PotencialBen2.campoComentariosReclamoCenso1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['comentarios_reclamo_censo']}"/>
                                                <webuijsf:message id="messageComentariosReclamoCenso1"
                                                    for="campoComentariosReclamoCenso1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosReclamoCenso1"
                                                    binding="#{PotencialBen2.helpInlineComentariosReclamoCenso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_reclamo_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaAprobacionReclamoCenso1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaAprobacionReclamoCenso1}"
                                                    id="labelFechaAprobacionReclamoCenso1"
                                                    for="campoFechaAprobacionReclamoCenso1"
                                                    text="fecha aprobaci&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaAprobacionReclamoCenso2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaAprobacionReclamoCenso1"
                                                    binding="#{PotencialBen2.campoFechaAprobacionReclamoCenso1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_aprobacion_reclamo_censo']}"
                                                    toolTip="BundleParametros.fecha_aprobacion_reclamo_censo.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaAprobacionReclamoCenso1Texto1"
                                                    binding="#{PotencialBen2.campoFechaAprobacionReclamoCenso1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaAprobacionReclamoCenso1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_aprobacion_reclamo_censo']}"/>
                                                <webuijsf:message id="messageFechaAprobacionReclamoCenso1"
                                                    for="campoFechaAprobacionReclamoCenso1"/>
                                                <webuijsf:helpInline id="helpInlineFechaAprobacionReclamoCenso1"
                                                    binding="#{PotencialBen2.helpInlineFechaAprobacionReclamoCenso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_aprobacion_reclamo_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosAprReclCen1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelComentariosAprReclCen1}"
                                                    id="labelComentariosAprReclCen1"
                                                    for="campoComentariosAprReclCen1"
                                                    text="comentarios aprobaci&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosAprReclCen2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosAprReclCen1"
                                                    binding="#{PotencialBen2.campoComentariosAprReclCen1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['comentarios_apr_recl_cen']}"
                                                    toolTip="BundleParametros.comentarios_apr_recl_cen.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorComentariosAprReclCen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAprReclCen1Texto1"
                                                    binding="#{PotencialBen2.campoComentariosAprReclCen1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['comentarios_apr_recl_cen']}"/>
                                                <webuijsf:message id="messageComentariosAprReclCen1"
                                                    for="campoComentariosAprReclCen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosAprReclCen1"
                                                    binding="#{PotencialBen2.helpInlineComentariosAprReclCen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_apr_recl_cen.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaDenegacionReclamoCenso1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaDenegacionReclamoCenso1}"
                                                    id="labelFechaDenegacionReclamoCenso1"
                                                    for="campoFechaDenegacionReclamoCenso1"
                                                    text="fecha denegaci&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaDenegacionReclamoCenso2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaDenegacionReclamoCenso1"
                                                    binding="#{PotencialBen2.campoFechaDenegacionReclamoCenso1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_denegacion_reclamo_censo']}"
                                                    toolTip="BundleParametros.fecha_denegacion_reclamo_censo.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaDenegacionReclamoCenso1Texto1"
                                                    binding="#{PotencialBen2.campoFechaDenegacionReclamoCenso1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaDenegacionReclamoCenso1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_denegacion_reclamo_censo']}"/>
                                                <webuijsf:message id="messageFechaDenegacionReclamoCenso1"
                                                    for="campoFechaDenegacionReclamoCenso1"/>
                                                <webuijsf:helpInline id="helpInlineFechaDenegacionReclamoCenso1"
                                                    binding="#{PotencialBen2.helpInlineFechaDenegacionReclamoCenso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_denegacion_reclamo_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaDenReclCen1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroCausaDenReclCen1}"
                                                    id="labelNumeroCausaDenReclCen1"
                                                    for="listaNumeroCausaDenReclCen1"
                                                    text="causa denegaci&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaDenReclCen2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaDenReclCen1"
                                                    binding="#{PotencialBen2.listaNumeroCausaDenReclCen1}"
                                                    converter="#{PotencialBen2.converterNumeroCausaDenReclCen1}"
                                                    disabled="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaNumeroCausaDenReclCen1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['numero_causa_den_recl_cen']}"
                                                    toolTip="BundleParametros.numero_causa_den_recl_cen.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroCausaDenReclCen1Texto1"
                                                    binding="#{PotencialBen2.listaNumeroCausaDenReclCen1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_causa_den_recl_c_1x14y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaDenReclCen1"
                                                    for="listaNumeroCausaDenReclCen1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaDenReclCen1"
                                                    binding="#{PotencialBen2.helpInlineNumeroCausaDenReclCen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_den_recl_cen.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaDenReclCen1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelOtraCausaDenReclCen1}"
                                                    id="labelOtraCausaDenReclCen1"
                                                    for="campoOtraCausaDenReclCen1"
                                                    text="otra causa denegaci&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaDenReclCen2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaDenReclCen1"
                                                    binding="#{PotencialBen2.campoOtraCausaDenReclCen1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['otra_causa_den_recl_cen']}"
                                                    toolTip="BundleParametros.otra_causa_den_recl_cen.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorOtraCausaDenReclCen1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaDenReclCen1Texto1"
                                                    binding="#{PotencialBen2.campoOtraCausaDenReclCen1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['otra_causa_den_recl_cen']}"/>
                                                <webuijsf:message id="messageOtraCausaDenReclCen1"
                                                    for="campoOtraCausaDenReclCen1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaDenReclCen1"
                                                    binding="#{PotencialBen2.helpInlineOtraCausaDenReclCen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_den_recl_cen.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosDenReclCen1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelComentariosDenReclCen1}"
                                                    id="labelComentariosDenReclCen1"
                                                    for="campoComentariosDenReclCen1"
                                                    text="comentarios denegaci&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosDenReclCen2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosDenReclCen1"
                                                    binding="#{PotencialBen2.campoComentariosDenReclCen1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['comentarios_den_recl_cen']}"
                                                    toolTip="BundleParametros.comentarios_den_recl_cen.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorComentariosDenReclCen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosDenReclCen1Texto1"
                                                    binding="#{PotencialBen2.campoComentariosDenReclCen1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['comentarios_den_recl_cen']}"/>
                                                <webuijsf:message id="messageComentariosDenReclCen1"
                                                    for="campoComentariosDenReclCen1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosDenReclCen1"
                                                    binding="#{PotencialBen2.helpInlineComentariosDenReclCen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_den_recl_cen.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaUltimaVisitaCenso1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaUltimaVisitaCenso1}"
                                                    id="labelFechaUltimaVisitaCenso1"
                                                    for="campoFechaUltimaVisitaCenso1"
                                                    text="fecha ultima visita censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaUltimaVisitaCenso2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaUltimaVisitaCenso1"
                                                    binding="#{PotencialBen2.campoFechaUltimaVisitaCenso1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_ultima_visita_censo']}"
                                                    toolTip="BundleParametros.fecha_ultima_visita_censo.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaUltimaVisitaCenso1Texto1"
                                                    binding="#{PotencialBen2.campoFechaUltimaVisitaCenso1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaUltimaVisitaCenso1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_ultima_visita_censo']}"/>
                                                <webuijsf:message id="messageFechaUltimaVisitaCenso1"
                                                    for="campoFechaUltimaVisitaCenso1"/>
                                                <webuijsf:helpInline id="helpInlineFechaUltimaVisitaCenso1"
                                                    binding="#{PotencialBen2.helpInlineFechaUltimaVisitaCenso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_ultima_visita_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacionesUltVisitaCen1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelObservacionesUltVisitaCen1}"
                                                    id="labelObservacionesUltVisitaCen1"
                                                    for="campoObservacionesUltVisitaCen1"
                                                    text="observaciones &#250;ltima visita censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacionesUltVisitaCen2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservacionesUltVisitaCen1"
                                                    binding="#{PotencialBen2.campoObservacionesUltVisitaCen1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['observaciones_ult_visita_cen']}"
                                                    toolTip="BundleParametros.observaciones_ult_visita_cen.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorObservacionesUltVisitaCen1.validate}"/>
                                                <webuijsf:staticText id="campoObservacionesUltVisitaCen1Texto1"
                                                    binding="#{PotencialBen2.campoObservacionesUltVisitaCen1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['observaciones_ult_visita_cen']}"/>
                                                <webuijsf:message id="messageObservacionesUltVisitaCen1"
                                                    for="campoObservacionesUltVisitaCen1"/>
                                                <webuijsf:helpInline id="helpInlineObservacionesUltVisitaCen1"
                                                    binding="#{PotencialBen2.helpInlineObservacionesUltVisitaCen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observaciones_ult_visita_cen.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioUltVisitaCen1" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdFuncionarioUltVisitaCen1}"
                                                    id="labelIdFuncionarioUltVisitaCen1"
                                                    for="campoIdFuncionarioUltVisitaCen1"
                                                    text="funcionario &#250;ltima visita censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioUltVisitaCen2" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionarioUltVisitaCen1"
                                                    binding="#{PotencialBen2.campoIdFuncionarioUltVisitaCen1}"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.asistente.textoCampoIdFuncionarioUltVisitaCen1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdFuncionarioUltVisitaCen1}"
                                                    validatorExpression="#{PotencialBen2.campoIdFuncionarioUltVisitaCen1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioUltVisitaCen1Texto1"
                                                    binding="#{PotencialBen2.campoIdFuncionarioUltVisitaCen1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_funcionario_1x16y3']}"/>
                                                <webuijsf:button id="campoIdFuncionarioUltVisitaCen1Boton1"
                                                    binding="#{PotencialBen2.campoIdFuncionarioUltVisitaCen1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFuncionarioUltVisitaCen1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionarioUltVisitaCen1Boton3"
                                                    binding="#{PotencialBen2.campoIdFuncionarioUltVisitaCen1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFuncionarioUltVisitaCen1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdFuncionarioUltVisitaCen1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionarioUltVisitaCen1"
                                                    for="campoIdFuncionarioUltVisitaCen1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionarioUltVisitaCen1"
                                                    binding="#{PotencialBen2.helpInlineIdFuncionarioUltVisitaCen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcionario_ult_visita_cen.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioUltVisitaCen3" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdFuncionarioUltVisitaCen2}"
                                                    id="labelIdFuncionarioUltVisitaCen2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcionario &#250;ltima visita censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioUltVisitaCen4" rendered="#{PotencialBen2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdFuncionarioUltVisitaCen1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_funcionario_1x16y4']}"
                                                    id="campoIdFuncionarioUltVisitaCen1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdFuncionarioUltVisitaCen1Boton2}"
                                                    id="campoIdFuncionarioUltVisitaCen1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFuncionarioUltVisitaCen1Boton2}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:tabSet
                                            id="tabSet1"
                                            lite="true"
                                            mini="true"
                                            rendered="#{PotencialBen2.gestor.filaNoProcesada}"
                                            selected="tab1">
                                        <webuijsf:tab
                                            id="tab1"
                                            rendered="#{PotencialBen2.asistente.seccionGeneralRendered}"
                                            text="general">
                                        <h:panelGrid
                                            id="gridPanel116"
                                            rendered="#{PotencialBen2.asistente.seccionGeneralHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab1"
                                                text="#{PotencialBen2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel117"
                                            rendered="#{PotencialBen2.asistente.seccionGeneralRendered}">
                                            <h:panelGrid
                                                id="gridNumeroTipoRegPotBen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroTipoRegPotBen1x1}"
                                                    id="labelNumeroTipoRegPotBen1x1"
                                                    for="listaNumeroTipoRegPotBen1x1"
                                                    text="tipo registro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoRegPotBen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoRegPotBen1x1"
                                                    binding="#{PotencialBen2.listaNumeroTipoRegPotBen1x1}"
                                                    converter="#{PotencialBen2.converterNumeroTipoRegPotBen1}"
                                                    disabled="#{PotencialBen2.gestor.filaNoCreada}" required="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaNumeroTipoRegPotBen1}"
                                                    onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'listaNumeroTipoRegPotBen1x1');"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['numero_tipo_reg_pot_ben']}"
                                                    toolTip="BundleParametros.numero_tipo_reg_pot_ben.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroTipoRegPotBen1x1Texto1"
                                                    binding="#{PotencialBen2.listaNumeroTipoRegPotBen1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_tipo_reg_pot_ben_1x1y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoRegPotBen1x1"
                                                    for="listaNumeroTipoRegPotBen1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoRegPotBen1x1"
                                                    binding="#{PotencialBen2.helpInlineNumeroTipoRegPotBen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_reg_pot_ben.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaRegistroPotBen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaRegistroPotBen1x1}"
                                                    id="labelFechaRegistroPotBen1x1"
                                                    for="campoFechaRegistroPotBen1x1"
                                                    text="fecha registro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaRegistroPotBen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaRegistroPotBen1x1"
                                                    binding="#{PotencialBen2.campoFechaRegistroPotBen1x1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_registro_pot_ben']}"
                                                    toolTip="BundleParametros.fecha_registro_pot_ben.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaRegistroPotBen1x1Texto1"
                                                    binding="#{PotencialBen2.campoFechaRegistroPotBen1x1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaRegistroPotBen1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_registro_pot_ben']}"/>
                                                <webuijsf:message id="messageFechaRegistroPotBen1x1"
                                                    for="campoFechaRegistroPotBen1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaRegistroPotBen1x1"
                                                    binding="#{PotencialBen2.helpInlineFechaRegistroPotBen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_registro_pot_ben.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuarioRegPotBen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdUsuarioRegPotBen1x1}"
                                                    id="labelIdUsuarioRegPotBen1x1"
                                                    for="campoIdUsuarioRegPotBen1x1"
                                                    text="usuario registro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuarioRegPotBen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdUsuarioRegPotBen1x1"
                                                    binding="#{PotencialBen2.campoIdUsuarioRegPotBen1x1}"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.asistente.textoCampoIdUsuarioRegPotBen1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdUsuarioRegPotBen1}"
                                                    validatorExpression="#{PotencialBen2.campoIdUsuarioRegPotBen1_validate}"/>
                                                <webuijsf:staticText id="campoIdUsuarioRegPotBen1x1Texto1"
                                                    binding="#{PotencialBen2.campoIdUsuarioRegPotBen1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_usuario_1x15y3']}"/>
                                                <webuijsf:button id="campoIdUsuarioRegPotBen1x1Boton1"
                                                    binding="#{PotencialBen2.campoIdUsuarioRegPotBen1x1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdUsuarioRegPotBen1Boton1}"/>
                                                <webuijsf:button id="campoIdUsuarioRegPotBen1x1Boton3"
                                                    binding="#{PotencialBen2.campoIdUsuarioRegPotBen1x1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdUsuarioRegPotBen1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdUsuarioRegPotBen1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdUsuarioRegPotBen1x1"
                                                    for="campoIdUsuarioRegPotBen1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdUsuarioRegPotBen1x1"
                                                    binding="#{PotencialBen2.helpInlineIdUsuarioRegPotBen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_usuario_reg_pot_ben.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdUsuarioRegPotBen1x3"
                                                rendered="#{PotencialBen2.asistente.campoIdUsuarioRegPotBen1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdUsuarioRegPotBen1x2}"
                                                    id="labelIdUsuarioRegPotBen1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre usuario registro"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdUsuarioRegPotBen1x4"
                                                rendered="#{PotencialBen2.asistente.campoIdUsuarioRegPotBen1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdUsuarioRegPotBen1x1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_usuario_1x15y4']}"
                                                    id="campoIdUsuarioRegPotBen1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdUsuarioRegPotBen1x1Boton2}"
                                                    id="campoIdUsuarioRegPotBen1x1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdUsuarioRegPotBen1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPotencialBenInactivo1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelEsPotencialBenInactivo1x1}"
                                                    id="labelEsPotencialBenInactivo1x1"
                                                    for="listaEsPotencialBenInactivo1x1"
                                                    text="inactivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPotencialBenInactivo1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPotencialBenInactivo1x1"
                                                    binding="#{PotencialBen2.listaEsPotencialBenInactivo1x1}"
                                                    converter="#{PotencialBen2.converterEsPotencialBenInactivo1}"
                                                    disabled="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaEsPotencialBenInactivo1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['es_potencial_ben_inactivo']}"
                                                    toolTip="BundleParametros.es_potencial_ben_inactivo.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsPotencialBenInactivo1x1Texto1"
                                                    binding="#{PotencialBen2.listaEsPotencialBenInactivo1x1Texto1}"/>
                                                <webuijsf:message id="messageEsPotencialBenInactivo1x1"
                                                    for="listaEsPotencialBenInactivo1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsPotencialBenInactivo1x1"
                                                    binding="#{PotencialBen2.helpInlineEsPotencialBenInactivo1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_potencial_ben_inactivo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab2"
                                            rendered="#{PotencialBen2.asistente.seccionCedulaRendered}"
                                            text="cedula">
                                        <h:panelGrid
                                            id="gridPanel118"
                                            rendered="#{PotencialBen2.asistente.seccionCedulaHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab2"
                                                text="#{PotencialBen2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel119"
                                            rendered="#{PotencialBen2.asistente.seccionCedulaRendered}">
                                            <h:panelGrid
                                                id="gridIdPersona1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdPersona1x1}"
                                                    id="labelIdPersona1x1"
                                                    for="campoIdPersona1x1"
                                                    text="persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPersona1x1"
                                                    binding="#{PotencialBen2.campoIdPersona1x1}"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    text="#{PotencialBen2.asistente.textoCampoIdPersona1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdPersona1}"
                                                    validatorExpression="#{PotencialBen2.campoIdPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1x1Texto1"
                                                    binding="#{PotencialBen2.campoIdPersona1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_persona_1x2y3']}"/>
                                                <webuijsf:button id="campoIdPersona1x1Boton1"
                                                    binding="#{PotencialBen2.campoIdPersona1x1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdPersona1x1Boton3"
                                                    binding="#{PotencialBen2.campoIdPersona1x1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdPersona1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdPersona1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdPersona1x1"
                                                    for="campoIdPersona1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdPersona1x1"
                                                    binding="#{PotencialBen2.helpInlineIdPersona1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_persona.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPersona1x3"
                                                rendered="#{PotencialBen2.asistente.campoIdPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdPersona1x2}"
                                                    id="labelIdPersona1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPersona1x4"
                                                rendered="#{PotencialBen2.asistente.campoIdPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdPersona1x1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_persona_1x2y4']}"
                                                    id="campoIdPersona1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdPersona1x1Boton2}"
                                                    id="campoIdPersona1x1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdPersona1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCedula1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroCedula1x1}"
                                                    id="labelNumeroCedula1x1"
                                                    for="campoNumeroCedula1x1"
                                                    text="n&#250;mero c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCedula1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroCedula1x1"
                                                    binding="#{PotencialBen2.campoNumeroCedula1x1}"
                                                    converter="#{PotencialBen2.converterNumeroCedula1}"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['numero_cedula']}"
                                                    toolTip="BundleParametros.numero_cedula.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorNumeroCedula1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedula1x1Texto1"
                                                    binding="#{PotencialBen2.campoNumeroCedula1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['numero_cedula']}"/>
                                                <webuijsf:message id="messageNumeroCedula1x1"
                                                    for="campoNumeroCedula1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCedula1x1"
                                                    binding="#{PotencialBen2.helpInlineNumeroCedula1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_cedula.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLetraCedula1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelLetraCedula1x1}"
                                                    id="labelLetraCedula1x1"
                                                    for="campoLetraCedula1x1"
                                                    text="letra c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLetraCedula1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoLetraCedula1x1"
                                                    binding="#{PotencialBen2.campoLetraCedula1x1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['letra_cedula']}"
                                                    toolTip="BundleParametros.letra_cedula.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorLetraCedula1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedula1x1Texto1"
                                                    binding="#{PotencialBen2.campoLetraCedula1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['letra_cedula']}"/>
                                                <webuijsf:message id="messageLetraCedula1x1"
                                                    for="campoLetraCedula1x1"/>
                                                <webuijsf:helpInline id="helpInlineLetraCedula1x1"
                                                    binding="#{PotencialBen2.helpInlineLetraCedula1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.letra_cedula.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaExpedicionCedula1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaExpedicionCedula1x1}"
                                                    id="labelFechaExpedicionCedula1x1"
                                                    for="campoFechaExpedicionCedula1x1"
                                                    text="fecha expedici&#243;n c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaExpedicionCedula1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaExpedicionCedula1x1"
                                                    binding="#{PotencialBen2.campoFechaExpedicionCedula1x1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_expedicion_cedula']}"
                                                    toolTip="BundleParametros.fecha_expedicion_cedula.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaExpedicionCedula1x1Texto1"
                                                    binding="#{PotencialBen2.campoFechaExpedicionCedula1x1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaExpedicionCedula1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_expedicion_cedula']}"/>
                                                <webuijsf:message id="messageFechaExpedicionCedula1x1"
                                                    for="campoFechaExpedicionCedula1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaExpedicionCedula1x1"
                                                    binding="#{PotencialBen2.helpInlineFechaExpedicionCedula1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_expedicion_cedula.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaVencimientoCedula1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaVencimientoCedula1x1}"
                                                    id="labelFechaVencimientoCedula1x1"
                                                    for="campoFechaVencimientoCedula1x1"
                                                    text="fecha vencimiento c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaVencimientoCedula1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaVencimientoCedula1x1"
                                                    binding="#{PotencialBen2.campoFechaVencimientoCedula1x1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_vencimiento_cedula']}"
                                                    toolTip="BundleParametros.fecha_vencimiento_cedula.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaVencimientoCedula1x1Texto1"
                                                    binding="#{PotencialBen2.campoFechaVencimientoCedula1x1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaVencimientoCedula1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_vencimiento_cedula']}"/>
                                                <webuijsf:message id="messageFechaVencimientoCedula1x1"
                                                    for="campoFechaVencimientoCedula1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaVencimientoCedula1x1"
                                                    binding="#{PotencialBen2.helpInlineFechaVencimientoCedula1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_vencimiento_cedula.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab3"
                                            rendered="#{PotencialBen2.asistente.seccionIdentificacionRendered}"
                                            text="identificacion">
                                        <h:panelGrid
                                            id="gridPanel120"
                                            rendered="#{PotencialBen2.asistente.seccionIdentificacionHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab3"
                                                text="#{PotencialBen2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel121"
                                            rendered="#{PotencialBen2.asistente.seccionIdentificacionRendered}">
                                            <h:panelGrid
                                                id="gridPrimerNombre1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelPrimerNombre1x1}"
                                                    id="labelPrimerNombre1x1"
                                                    for="campoPrimerNombre1x1"
                                                    text="primer nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerNombre1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoPrimerNombre1x1"
                                                    binding="#{PotencialBen2.campoPrimerNombre1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1x1Texto1"
                                                    binding="#{PotencialBen2.campoPrimerNombre1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1x1"
                                                    for="campoPrimerNombre1x1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerNombre1x1"
                                                    binding="#{PotencialBen2.helpInlinePrimerNombre1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_nombre.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoNombre1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelSegundoNombre1x1}"
                                                    id="labelSegundoNombre1x1"
                                                    for="campoSegundoNombre1x1"
                                                    text="segundo nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoNombre1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoSegundoNombre1x1"
                                                    binding="#{PotencialBen2.campoSegundoNombre1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1x1Texto1"
                                                    binding="#{PotencialBen2.campoSegundoNombre1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1x1"
                                                    for="campoSegundoNombre1x1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoNombre1x1"
                                                    binding="#{PotencialBen2.helpInlineSegundoNombre1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_nombre.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPrimerApellido1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelPrimerApellido1x1}"
                                                    id="labelPrimerApellido1x1"
                                                    for="campoPrimerApellido1x1"
                                                    text="primer apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerApellido1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoPrimerApellido1x1"
                                                    binding="#{PotencialBen2.campoPrimerApellido1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1x1Texto1"
                                                    binding="#{PotencialBen2.campoPrimerApellido1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1x1"
                                                    for="campoPrimerApellido1x1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerApellido1x1"
                                                    binding="#{PotencialBen2.helpInlinePrimerApellido1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_apellido.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoApellido1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelSegundoApellido1x1}"
                                                    id="labelSegundoApellido1x1"
                                                    for="campoSegundoApellido1x1"
                                                    text="segundo apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoApellido1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoSegundoApellido1x1"
                                                    binding="#{PotencialBen2.campoSegundoApellido1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1x1Texto1"
                                                    binding="#{PotencialBen2.campoSegundoApellido1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1x1"
                                                    for="campoSegundoApellido1x1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoApellido1x1"
                                                    binding="#{PotencialBen2.helpInlineSegundoApellido1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_apellido.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridApellidoCasada1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelApellidoCasada1x1}"
                                                    id="labelApellidoCasada1x1"
                                                    for="campoApellidoCasada1x1"
                                                    text="apellido casada"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridApellidoCasada1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoApellidoCasada1x1"
                                                    binding="#{PotencialBen2.campoApellidoCasada1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['apellido_casada']}"
                                                    toolTip="BundleParametros.apellido_casada.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorApellidoCasada1.validate}"/>
                                                <webuijsf:staticText id="campoApellidoCasada1x1Texto1"
                                                    binding="#{PotencialBen2.campoApellidoCasada1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['apellido_casada']}"/>
                                                <webuijsf:message id="messageApellidoCasada1x1"
                                                    for="campoApellidoCasada1x1"/>
                                                <webuijsf:helpInline id="helpInlineApellidoCasada1x1"
                                                    binding="#{PotencialBen2.helpInlineApellidoCasada1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.apellido_casada.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridApodo1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelApodo1x1}"
                                                    id="labelApodo1x1"
                                                    for="campoApodo1x1"
                                                    text="apodo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridApodo1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoApodo1x1"
                                                    binding="#{PotencialBen2.campoApodo1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['apodo']}"
                                                    toolTip="BundleParametros.apodo.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorApodo1.validate}"/>
                                                <webuijsf:staticText id="campoApodo1x1Texto1"
                                                    binding="#{PotencialBen2.campoApodo1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['apodo']}"/>
                                                <webuijsf:message id="messageApodo1x1"
                                                    for="campoApodo1x1"/>
                                                <webuijsf:helpInline id="helpInlineApodo1x1"
                                                    binding="#{PotencialBen2.helpInlineApodo1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.apodo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaNacimiento1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaNacimiento1x1}"
                                                    id="labelFechaNacimiento1x1"
                                                    for="campoFechaNacimiento1x1"
                                                    text="fecha nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaNacimiento1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaNacimiento1x1"
                                                    binding="#{PotencialBen2.campoFechaNacimiento1x1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_nacimiento']}"
                                                    toolTip="BundleParametros.fecha_nacimiento.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaNacimiento1x1Texto1"
                                                    binding="#{PotencialBen2.campoFechaNacimiento1x1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaNacimiento1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_nacimiento']}"/>
                                                <webuijsf:message id="messageFechaNacimiento1x1"
                                                    for="campoFechaNacimiento1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaNacimiento1x1"
                                                    binding="#{PotencialBen2.helpInlineFechaNacimiento1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_nacimiento.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEdad1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelEdad1x1}"
                                                    id="labelEdad1x1"
                                                    for="campoEdad1x1"
                                                    text="edad"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEdad1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoEdad1x1"
                                                    binding="#{PotencialBen2.campoEdad1x1}"
                                                    converter="#{PotencialBen2.converterEdad1}"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['edad']}"
                                                    toolTip="BundleParametros.edad.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorEdad1.validate}"/>
                                                <webuijsf:staticText id="campoEdad1x1Texto1"
                                                    binding="#{PotencialBen2.campoEdad1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['edad']}"/>
                                                <webuijsf:message id="messageEdad1x1"
                                                    for="campoEdad1x1"/>
                                                <webuijsf:helpInline id="helpInlineEdad1x1"
                                                    binding="#{PotencialBen2.helpInlineEdad1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.edad.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab4"
                                            rendered="#{PotencialBen2.asistente.seccionOrigenRendered}"
                                            text="origen">
                                        <h:panelGrid
                                            id="gridPanel122"
                                            rendered="#{PotencialBen2.asistente.seccionOrigenHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab4"
                                                text="#{PotencialBen2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel123"
                                            rendered="#{PotencialBen2.asistente.seccionOrigenRendered}">
                                            <h:panelGrid
                                                id="gridEsParaguayoNatural1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelEsParaguayoNatural1x1}"
                                                    id="labelEsParaguayoNatural1x1"
                                                    for="listaEsParaguayoNatural1x1"
                                                    text="paraguayo natural"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsParaguayoNatural1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsParaguayoNatural1x1"
                                                    binding="#{PotencialBen2.listaEsParaguayoNatural1x1}"
                                                    converter="#{PotencialBen2.converterEsParaguayoNatural1}"
                                                    disabled="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaEsParaguayoNatural1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['es_paraguayo_natural']}"
                                                    toolTip="BundleParametros.es_paraguayo_natural.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsParaguayoNatural1x1Texto1"
                                                    binding="#{PotencialBen2.listaEsParaguayoNatural1x1Texto1}"/>
                                                <webuijsf:message id="messageEsParaguayoNatural1x1"
                                                    for="listaEsParaguayoNatural1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsParaguayoNatural1x1"
                                                    binding="#{PotencialBen2.helpInlineEsParaguayoNatural1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_paraguayo_natural.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsIndigena1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelEsIndigena1x1}"
                                                    id="labelEsIndigena1x1"
                                                    for="listaEsIndigena1x1"
                                                    text="indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsIndigena1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsIndigena1x1"
                                                    binding="#{PotencialBen2.listaEsIndigena1x1}"
                                                    converter="#{PotencialBen2.converterEsIndigena1}"
                                                    disabled="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaEsIndigena1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['es_indigena']}"
                                                    toolTip="BundleParametros.es_indigena.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsIndigena1x1Texto1"
                                                    binding="#{PotencialBen2.listaEsIndigena1x1Texto1}"/>
                                                <webuijsf:message id="messageEsIndigena1x1"
                                                    for="listaEsIndigena1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsIndigena1x1"
                                                    binding="#{PotencialBen2.helpInlineEsIndigena1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_indigena.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdEtniaIndigena1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdEtniaIndigena1x1}"
                                                    id="labelIdEtniaIndigena1x1"
                                                    for="campoIdEtniaIndigena1x1"
                                                    text="etnia indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdEtniaIndigena1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdEtniaIndigena1x1"
                                                    binding="#{PotencialBen2.campoIdEtniaIndigena1x1}"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.asistente.textoCampoIdEtniaIndigena1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdEtniaIndigena1}"
                                                    validatorExpression="#{PotencialBen2.campoIdEtniaIndigena1_validate}"/>
                                                <webuijsf:staticText id="campoIdEtniaIndigena1x1Texto1"
                                                    binding="#{PotencialBen2.campoIdEtniaIndigena1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_etnia_indigena_1x3y3']}"/>
                                                <webuijsf:button id="campoIdEtniaIndigena1x1Boton1"
                                                    binding="#{PotencialBen2.campoIdEtniaIndigena1x1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdEtniaIndigena1Boton1}"/>
                                                <webuijsf:button id="campoIdEtniaIndigena1x1Boton3"
                                                    binding="#{PotencialBen2.campoIdEtniaIndigena1x1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdEtniaIndigena1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdEtniaIndigena1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdEtniaIndigena1x1"
                                                    for="campoIdEtniaIndigena1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdEtniaIndigena1x1"
                                                    binding="#{PotencialBen2.helpInlineIdEtniaIndigena1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_etnia_indigena.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdEtniaIndigena1x3"
                                                rendered="#{PotencialBen2.asistente.campoIdEtniaIndigena1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdEtniaIndigena1x2}"
                                                    id="labelIdEtniaIndigena1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre etnia indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdEtniaIndigena1x4"
                                                rendered="#{PotencialBen2.asistente.campoIdEtniaIndigena1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdEtniaIndigena1x1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_etnia_indigena_1x3y4']}"
                                                    id="campoIdEtniaIndigena1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdEtniaIndigena1x1Boton2}"
                                                    id="campoIdEtniaIndigena1x1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdEtniaIndigena1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreComunidadIndigena1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNombreComunidadIndigena1x1}"
                                                    id="labelNombreComunidadIndigena1x1"
                                                    for="campoNombreComunidadIndigena1x1"
                                                    text="nombre comunidad indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreComunidadIndigena1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreComunidadIndigena1x1"
                                                    binding="#{PotencialBen2.campoNombreComunidadIndigena1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_comunidad_indigena']}"
                                                    toolTip="BundleParametros.nombre_comunidad_indigena.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorNombreComunidadIndigena1.validate}"/>
                                                <webuijsf:staticText id="campoNombreComunidadIndigena1x1Texto1"
                                                    binding="#{PotencialBen2.campoNombreComunidadIndigena1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_comunidad_indigena']}"/>
                                                <webuijsf:message id="messageNombreComunidadIndigena1x1"
                                                    for="campoNombreComunidadIndigena1x1"/>
                                                <webuijsf:helpInline id="helpInlineNombreComunidadIndigena1x1"
                                                    binding="#{PotencialBen2.helpInlineNombreComunidadIndigena1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_comunidad_indigena.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab5"
                                            rendered="#{PotencialBen2.asistente.seccionContactoRendered}"
                                            text="contacto">
                                        <h:panelGrid
                                            id="gridPanel124"
                                            rendered="#{PotencialBen2.asistente.seccionContactoHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab5"
                                                text="#{PotencialBen2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel125"
                                            rendered="#{PotencialBen2.asistente.seccionContactoRendered}">
                                            <h:panelGrid
                                                id="gridIdDepartamento1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdDepartamento1x1}"
                                                    id="labelIdDepartamento1x1"
                                                    for="campoIdDepartamento1x1"
                                                    text="departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDepartamento1x1"
                                                    binding="#{PotencialBen2.campoIdDepartamento1x1}"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.asistente.textoCampoIdDepartamento1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{PotencialBen2.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1x1Texto1"
                                                    binding="#{PotencialBen2.campoIdDepartamento1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_ubicacion_1x4y3']}"/>
                                                <webuijsf:button id="campoIdDepartamento1x1Boton1"
                                                    binding="#{PotencialBen2.campoIdDepartamento1x1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button id="campoIdDepartamento1x1Boton3"
                                                    binding="#{PotencialBen2.campoIdDepartamento1x1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdDepartamento1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDepartamento1x1"
                                                    for="campoIdDepartamento1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdDepartamento1x1"
                                                    binding="#{PotencialBen2.helpInlineIdDepartamento1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_departamento.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento1x3"
                                                rendered="#{PotencialBen2.asistente.campoIdDepartamento1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdDepartamento1x2}"
                                                    id="labelIdDepartamento1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento1x4"
                                                rendered="#{PotencialBen2.asistente.campoIdDepartamento1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdDepartamento1x1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_ubicacion_1x4y4']}"
                                                    id="campoIdDepartamento1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdDepartamento1x1Boton2}"
                                                    id="campoIdDepartamento1x1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdDepartamento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdDistrito1x1}"
                                                    id="labelIdDistrito1x1"
                                                    for="campoIdDistrito1x1"
                                                    text="distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDistrito1x1"
                                                    binding="#{PotencialBen2.campoIdDistrito1x1}"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.asistente.textoCampoIdDistrito1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{PotencialBen2.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1x1Texto1"
                                                    binding="#{PotencialBen2.campoIdDistrito1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_ubicacion_1x5y3']}"/>
                                                <webuijsf:button id="campoIdDistrito1x1Boton1"
                                                    binding="#{PotencialBen2.campoIdDistrito1x1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button id="campoIdDistrito1x1Boton3"
                                                    binding="#{PotencialBen2.campoIdDistrito1x1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdDistrito1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDistrito1x1"
                                                    for="campoIdDistrito1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdDistrito1x1"
                                                    binding="#{PotencialBen2.helpInlineIdDistrito1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_distrito.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito1x3"
                                                rendered="#{PotencialBen2.asistente.campoIdDistrito1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdDistrito1x2}"
                                                    id="labelIdDistrito1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito1x4"
                                                rendered="#{PotencialBen2.asistente.campoIdDistrito1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdDistrito1x1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_ubicacion_1x5y4']}"
                                                    id="campoIdDistrito1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdDistrito1x1Boton2}"
                                                    id="campoIdDistrito1x1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdDistrito1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoArea1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroTipoArea1x1}"
                                                    id="labelNumeroTipoArea1x1"
                                                    for="listaNumeroTipoArea1x1"
                                                    text="tipo area"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoArea1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoArea1x1"
                                                    binding="#{PotencialBen2.listaNumeroTipoArea1x1}"
                                                    converter="#{PotencialBen2.converterNumeroTipoArea1}"
                                                    disabled="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    items="#{PotencialBen2.asistente.opcionesListaNumeroTipoArea1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['numero_tipo_area']}"
                                                    toolTip="BundleParametros.numero_tipo_area.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroTipoArea1x1Texto1"
                                                    binding="#{PotencialBen2.listaNumeroTipoArea1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_tipo_area_1x6y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoArea1x1"
                                                    for="listaNumeroTipoArea1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoArea1x1"
                                                    binding="#{PotencialBen2.helpInlineNumeroTipoArea1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_area.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdBarrio1x1}"
                                                    id="labelIdBarrio1x1"
                                                    for="campoIdBarrio1x1"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdBarrio1x1"
                                                    binding="#{PotencialBen2.campoIdBarrio1x1}"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.asistente.textoCampoIdBarrio1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{PotencialBen2.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1x1Texto1"
                                                    binding="#{PotencialBen2.campoIdBarrio1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_ubicacion_1x7y3']}"/>
                                                <webuijsf:button id="campoIdBarrio1x1Boton1"
                                                    binding="#{PotencialBen2.campoIdBarrio1x1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button id="campoIdBarrio1x1Boton3"
                                                    binding="#{PotencialBen2.campoIdBarrio1x1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdBarrio1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdBarrio1x1"
                                                    for="campoIdBarrio1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdBarrio1x1"
                                                    binding="#{PotencialBen2.helpInlineIdBarrio1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_barrio.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio1x3"
                                                rendered="#{PotencialBen2.asistente.campoIdBarrio1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdBarrio1x2}"
                                                    id="labelIdBarrio1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio1x4"
                                                rendered="#{PotencialBen2.asistente.campoIdBarrio1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdBarrio1x1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_ubicacion_1x7y4']}"
                                                    id="campoIdBarrio1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdBarrio1x1Boton2}"
                                                    id="campoIdBarrio1x1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdBarrio1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridManzana1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelManzana1x1}"
                                                    id="labelManzana1x1"
                                                    for="campoManzana1x1"
                                                    text="manzana"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridManzana1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoManzana1x1"
                                                    binding="#{PotencialBen2.campoManzana1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['manzana']}"
                                                    toolTip="BundleParametros.manzana.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorManzana1.validate}"/>
                                                <webuijsf:staticText id="campoManzana1x1Texto1"
                                                    binding="#{PotencialBen2.campoManzana1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['manzana']}"/>
                                                <webuijsf:message id="messageManzana1x1"
                                                    for="campoManzana1x1"/>
                                                <webuijsf:helpInline id="helpInlineManzana1x1"
                                                    binding="#{PotencialBen2.helpInlineManzana1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.manzana.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCompania1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelCompania1x1}"
                                                    id="labelCompania1x1"
                                                    for="campoCompania1x1"
                                                    text="compa&#241;ia"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCompania1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCompania1x1"
                                                    binding="#{PotencialBen2.campoCompania1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['compania']}"
                                                    toolTip="BundleParametros.compania.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorCompania1.validate}"/>
                                                <webuijsf:staticText id="campoCompania1x1Texto1"
                                                    binding="#{PotencialBen2.campoCompania1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['compania']}"/>
                                                <webuijsf:message id="messageCompania1x1"
                                                    for="campoCompania1x1"/>
                                                <webuijsf:helpInline id="helpInlineCompania1x1"
                                                    binding="#{PotencialBen2.helpInlineCompania1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.compania.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDireccion1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelDireccion1x1}"
                                                    id="labelDireccion1x1"
                                                    for="campoDireccion1x1"
                                                    text="direcci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDireccion1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDireccion1x1"
                                                    binding="#{PotencialBen2.campoDireccion1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['direccion']}"
                                                    toolTip="BundleParametros.direccion.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoDireccion1x1Texto1"
                                                    binding="#{PotencialBen2.campoDireccion1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['direccion']}"/>
                                                <webuijsf:message id="messageDireccion1x1"
                                                    for="campoDireccion1x1"/>
                                                <webuijsf:helpInline id="helpInlineDireccion1x1"
                                                    binding="#{PotencialBen2.helpInlineDireccion1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.direccion.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridReferenciaDireccion1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelReferenciaDireccion1x1}"
                                                    id="labelReferenciaDireccion1x1"
                                                    for="campoReferenciaDireccion1x1"
                                                    text="referencia direcci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridReferenciaDireccion1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoReferenciaDireccion1x1"
                                                    binding="#{PotencialBen2.campoReferenciaDireccion1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['referencia_direccion']}"
                                                    toolTip="BundleParametros.referencia_direccion.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorReferenciaDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoReferenciaDireccion1x1Texto1"
                                                    binding="#{PotencialBen2.campoReferenciaDireccion1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['referencia_direccion']}"/>
                                                <webuijsf:message id="messageReferenciaDireccion1x1"
                                                    for="campoReferenciaDireccion1x1"/>
                                                <webuijsf:helpInline id="helpInlineReferenciaDireccion1x1"
                                                    binding="#{PotencialBen2.helpInlineReferenciaDireccion1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.referencia_direccion.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab6"
                                            rendered="#{PotencialBen2.asistente.seccionPensionRendered}"
                                            text="pension">
                                        <h:panelGrid
                                            id="gridPanel126"
                                            rendered="#{PotencialBen2.asistente.seccionPensionHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab6"
                                                text="#{PotencialBen2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel127"
                                            rendered="#{PotencialBen2.asistente.seccionPensionRendered}">
                                            <h:panelGrid
                                                id="gridEsPersonaConJubilacion1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelEsPersonaConJubilacion1x1}"
                                                    id="labelEsPersonaConJubilacion1x1"
                                                    for="listaEsPersonaConJubilacion1x1"
                                                    text="persona con jubilaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConJubilacion1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConJubilacion1x1"
                                                    binding="#{PotencialBen2.listaEsPersonaConJubilacion1x1}"
                                                    converter="#{PotencialBen2.converterEsPersonaConJubilacion1}"
                                                    disabled="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaEsPersonaConJubilacion1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['es_persona_con_jubilacion']}"
                                                    toolTip="BundleParametros.es_persona_con_jubilacion.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsPersonaConJubilacion1x1Texto1"
                                                    binding="#{PotencialBen2.listaEsPersonaConJubilacion1x1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConJubilacion1x1"
                                                    for="listaEsPersonaConJubilacion1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConJubilacion1x1"
                                                    binding="#{PotencialBen2.helpInlineEsPersonaConJubilacion1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_jubilacion.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConPension1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelEsPersonaConPension1x1}"
                                                    id="labelEsPersonaConPension1x1"
                                                    for="listaEsPersonaConPension1x1"
                                                    text="persona con pensi&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConPension1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConPension1x1"
                                                    binding="#{PotencialBen2.listaEsPersonaConPension1x1}"
                                                    converter="#{PotencialBen2.converterEsPersonaConPension1}"
                                                    disabled="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaEsPersonaConPension1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['es_persona_con_pension']}"
                                                    toolTip="BundleParametros.es_persona_con_pension.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsPersonaConPension1x1Texto1"
                                                    binding="#{PotencialBen2.listaEsPersonaConPension1x1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConPension1x1"
                                                    for="listaEsPersonaConPension1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConPension1x1"
                                                    binding="#{PotencialBen2.helpInlineEsPersonaConPension1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_pension.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsPersonaConSubsidio1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelEsPersonaConSubsidio1x1}"
                                                    id="labelEsPersonaConSubsidio1x1"
                                                    for="listaEsPersonaConSubsidio1x1"
                                                    text="persona con subsidio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsPersonaConSubsidio1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsPersonaConSubsidio1x1"
                                                    binding="#{PotencialBen2.listaEsPersonaConSubsidio1x1}"
                                                    converter="#{PotencialBen2.converterEsPersonaConSubsidio1}"
                                                    disabled="#{PotencialBen2.gestor.filaNoProcesada}" required="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaEsPersonaConSubsidio1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['es_persona_con_subsidio']}"
                                                    toolTip="BundleParametros.es_persona_con_subsidio.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsPersonaConSubsidio1x1Texto1"
                                                    binding="#{PotencialBen2.listaEsPersonaConSubsidio1x1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConSubsidio1x1"
                                                    for="listaEsPersonaConSubsidio1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsPersonaConSubsidio1x1"
                                                    binding="#{PotencialBen2.helpInlineEsPersonaConSubsidio1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_persona_con_subsidio.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab7"
                                            rendered="#{PotencialBen2.asistente.seccionHogarRendered}"
                                            text="hogar">
                                        <h:panelGrid
                                            id="gridPanel128"
                                            rendered="#{PotencialBen2.asistente.seccionHogarHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab7"
                                                text="#{PotencialBen2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel129"
                                            rendered="#{PotencialBen2.asistente.seccionHogarRendered}">
                                            <h:panelGrid
                                                id="gridNombreResponsableHogar1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNombreResponsableHogar1x1}"
                                                    id="labelNombreResponsableHogar1x1"
                                                    for="campoNombreResponsableHogar1x1"
                                                    text="nombre responsable hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreResponsableHogar1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreResponsableHogar1x1"
                                                    binding="#{PotencialBen2.campoNombreResponsableHogar1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_responsable_hogar']}"
                                                    toolTip="BundleParametros.nombre_responsable_hogar.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorNombreResponsableHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNombreResponsableHogar1x1Texto1"
                                                    binding="#{PotencialBen2.campoNombreResponsableHogar1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_responsable_hogar']}"/>
                                                <webuijsf:message id="messageNombreResponsableHogar1x1"
                                                    for="campoNombreResponsableHogar1x1"/>
                                                <webuijsf:helpInline id="helpInlineNombreResponsableHogar1x1"
                                                    binding="#{PotencialBen2.helpInlineNombreResponsableHogar1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_responsable_hogar.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTelefonoRespHogar1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroTelefonoRespHogar1x1}"
                                                    id="labelNumeroTelefonoRespHogar1x1"
                                                    for="campoNumeroTelefonoRespHogar1x1"
                                                    text="n&#250;mero tel&#233;fono responsable hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTelefonoRespHogar1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroTelefonoRespHogar1x1"
                                                    binding="#{PotencialBen2.campoNumeroTelefonoRespHogar1x1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['numero_telefono_resp_hogar']}"
                                                    toolTip="BundleParametros.numero_telefono_resp_hogar.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorNumeroTelefonoRespHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoRespHogar1x1Texto1"
                                                    binding="#{PotencialBen2.campoNumeroTelefonoRespHogar1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['numero_telefono_resp_hogar']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoRespHogar1x1"
                                                    for="campoNumeroTelefonoRespHogar1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTelefonoRespHogar1x1"
                                                    binding="#{PotencialBen2.helpInlineNumeroTelefonoRespHogar1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_telefono_resp_hogar.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab8"
                                            rendered="#{PotencialBen2.asistente.seccionReferenciaRendered}"
                                            text="referencia">
                                        <h:panelGrid
                                            id="gridPanel130"
                                            rendered="#{PotencialBen2.asistente.seccionReferenciaHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab8"
                                                text="#{PotencialBen2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel131"
                                            rendered="#{PotencialBen2.asistente.seccionReferenciaRendered}">
                                            <h:panelGrid
                                                id="gridNombreReferente1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNombreReferente1x1}"
                                                    id="labelNombreReferente1x1"
                                                    for="campoNombreReferente1x1"
                                                    text="nombre referente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreReferente1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreReferente1x1"
                                                    binding="#{PotencialBen2.campoNombreReferente1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_referente']}"
                                                    toolTip="BundleParametros.nombre_referente.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorNombreReferente1.validate}"/>
                                                <webuijsf:staticText id="campoNombreReferente1x1Texto1"
                                                    binding="#{PotencialBen2.campoNombreReferente1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_referente']}"/>
                                                <webuijsf:message id="messageNombreReferente1x1"
                                                    for="campoNombreReferente1x1"/>
                                                <webuijsf:helpInline id="helpInlineNombreReferente1x1"
                                                    binding="#{PotencialBen2.helpInlineNombreReferente1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_referente.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTelefonoReferente1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroTelefonoReferente1x1}"
                                                    id="labelNumeroTelefonoReferente1x1"
                                                    for="campoNumeroTelefonoReferente1x1"
                                                    text="n&#250;mero tel&#233;fono referente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTelefonoReferente1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroTelefonoReferente1x1"
                                                    binding="#{PotencialBen2.campoNumeroTelefonoReferente1x1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{PotencialBen2.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['numero_telefono_referente']}"
                                                    toolTip="BundleParametros.numero_telefono_referente.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorNumeroTelefonoReferente1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoReferente1x1Texto1"
                                                    binding="#{PotencialBen2.campoNumeroTelefonoReferente1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['numero_telefono_referente']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoReferente1x1"
                                                    for="campoNumeroTelefonoReferente1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTelefonoReferente1x1"
                                                    binding="#{PotencialBen2.helpInlineNumeroTelefonoReferente1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_telefono_referente.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab9"
                                            rendered="#{PotencialBen2.asistente.seccionCensoRendered}"
                                            text="censo">
                                        <h:panelGrid
                                            id="gridPanel132"
                                            rendered="#{PotencialBen2.asistente.seccionCensoHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab9"
                                                text="#{PotencialBen2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel133"
                                            rendered="#{PotencialBen2.asistente.seccionCensoRendered}">
                                            <h:panelGrid
                                                id="gridNumeroCondicionCenso1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroCondicionCenso1x1}"
                                                    id="labelNumeroCondicionCenso1x1"
                                                    for="listaNumeroCondicionCenso1x1"
                                                    text="condici&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCondicionCenso1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCondicionCenso1x1"
                                                    binding="#{PotencialBen2.listaNumeroCondicionCenso1x1}"
                                                    converter="#{PotencialBen2.converterNumeroCondicionCenso1}"
                                                    disabled="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaNumeroCondicionCenso1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['numero_condicion_censo']}"
                                                    toolTip="BundleParametros.numero_condicion_censo.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroCondicionCenso1x1Texto1"
                                                    binding="#{PotencialBen2.listaNumeroCondicionCenso1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_condicion_censo_1x9y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionCenso1x1"
                                                    for="listaNumeroCondicionCenso1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCondicionCenso1x1"
                                                    binding="#{PotencialBen2.helpInlineNumeroCondicionCenso1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_condicion_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaValidacionCenso1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaValidacionCenso1x1}"
                                                    id="labelFechaValidacionCenso1x1"
                                                    for="campoFechaValidacionCenso1x1"
                                                    text="fecha validaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaValidacionCenso1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaValidacionCenso1x1"
                                                    binding="#{PotencialBen2.campoFechaValidacionCenso1x1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_validacion_censo']}"
                                                    toolTip="BundleParametros.fecha_validacion_censo.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaValidacionCenso1x1Texto1"
                                                    binding="#{PotencialBen2.campoFechaValidacionCenso1x1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaValidacionCenso1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_validacion_censo']}"/>
                                                <webuijsf:message id="messageFechaValidacionCenso1x1"
                                                    for="campoFechaValidacionCenso1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaValidacionCenso1x1"
                                                    binding="#{PotencialBen2.helpInlineFechaValidacionCenso1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_validacion_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioValidacionCen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdFuncionarioValidacionCen1x1}"
                                                    id="labelIdFuncionarioValidacionCen1x1"
                                                    for="campoIdFuncionarioValidacionCen1x1"
                                                    text="funcionario validaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioValidacionCen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionarioValidacionCen1x1"
                                                    binding="#{PotencialBen2.campoIdFuncionarioValidacionCen1x1}"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.asistente.textoCampoIdFuncionarioValidacionCen1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdFuncionarioValidacionCen1}"
                                                    validatorExpression="#{PotencialBen2.campoIdFuncionarioValidacionCen1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioValidacionCen1x1Texto1"
                                                    binding="#{PotencialBen2.campoIdFuncionarioValidacionCen1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_funcionario_1x10y3']}"/>
                                                <webuijsf:button id="campoIdFuncionarioValidacionCen1x1Boton1"
                                                    binding="#{PotencialBen2.campoIdFuncionarioValidacionCen1x1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFuncionarioValidacionCen1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionarioValidacionCen1x1Boton3"
                                                    binding="#{PotencialBen2.campoIdFuncionarioValidacionCen1x1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFuncionarioValidacionCen1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdFuncionarioValidacionCen1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionarioValidacionCen1x1"
                                                    for="campoIdFuncionarioValidacionCen1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionarioValidacionCen1x1"
                                                    binding="#{PotencialBen2.helpInlineIdFuncionarioValidacionCen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcionario_validacion_cen.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioValidacionCen1x3"
                                                rendered="#{PotencialBen2.asistente.campoIdFuncionarioValidacionCen1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdFuncionarioValidacionCen1x2}"
                                                    id="labelIdFuncionarioValidacionCen1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcionario validaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioValidacionCen1x4"
                                                rendered="#{PotencialBen2.asistente.campoIdFuncionarioValidacionCen1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdFuncionarioValidacionCen1x1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_funcionario_1x10y4']}"
                                                    id="campoIdFuncionarioValidacionCen1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdFuncionarioValidacionCen1x1Boton2}"
                                                    id="campoIdFuncionarioValidacionCen1x1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFuncionarioValidacionCen1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaInvCenso1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroCausaInvCenso1x1}"
                                                    id="labelNumeroCausaInvCenso1x1"
                                                    for="listaNumeroCausaInvCenso1x1"
                                                    text="causa invalidaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaInvCenso1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaInvCenso1x1"
                                                    binding="#{PotencialBen2.listaNumeroCausaInvCenso1x1}"
                                                    converter="#{PotencialBen2.converterNumeroCausaInvCenso1}"
                                                    disabled="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaNumeroCausaInvCenso1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['numero_causa_inv_censo']}"
                                                    toolTip="BundleParametros.numero_causa_inv_censo.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroCausaInvCenso1x1Texto1"
                                                    binding="#{PotencialBen2.listaNumeroCausaInvCenso1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_causa_inv_censo_1x11y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaInvCenso1x1"
                                                    for="listaNumeroCausaInvCenso1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaInvCenso1x1"
                                                    binding="#{PotencialBen2.helpInlineNumeroCausaInvCenso1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_inv_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaInvCenso1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelOtraCausaInvCenso1x1}"
                                                    id="labelOtraCausaInvCenso1x1"
                                                    for="campoOtraCausaInvCenso1x1"
                                                    text="otra causa invalidaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaInvCenso1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaInvCenso1x1"
                                                    binding="#{PotencialBen2.campoOtraCausaInvCenso1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['otra_causa_inv_censo']}"
                                                    toolTip="BundleParametros.otra_causa_inv_censo.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorOtraCausaInvCenso1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaInvCenso1x1Texto1"
                                                    binding="#{PotencialBen2.campoOtraCausaInvCenso1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['otra_causa_inv_censo']}"/>
                                                <webuijsf:message id="messageOtraCausaInvCenso1x1"
                                                    for="campoOtraCausaInvCenso1x1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaInvCenso1x1"
                                                    binding="#{PotencialBen2.helpInlineOtraCausaInvCenso1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_inv_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosValidacionCenso1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelComentariosValidacionCenso1x1}"
                                                    id="labelComentariosValidacionCenso1x1"
                                                    for="campoComentariosValidacionCenso1x1"
                                                    text="comentarios validaci&#243;n censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosValidacionCenso1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosValidacionCenso1x1"
                                                    binding="#{PotencialBen2.campoComentariosValidacionCenso1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['comentarios_validacion_censo']}"
                                                    toolTip="BundleParametros.comentarios_validacion_censo.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorComentariosValidacionCenso1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosValidacionCenso1x1Texto1"
                                                    binding="#{PotencialBen2.campoComentariosValidacionCenso1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['comentarios_validacion_censo']}"/>
                                                <webuijsf:message id="messageComentariosValidacionCenso1x1"
                                                    for="campoComentariosValidacionCenso1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosValidacionCenso1x1"
                                                    binding="#{PotencialBen2.helpInlineComentariosValidacionCenso1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_validacion_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaPersona1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdFichaPersona1x1}"
                                                    id="labelIdFichaPersona1x1"
                                                    for="campoIdFichaPersona1x1"
                                                    text="ficha persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFichaPersona1x1"
                                                    binding="#{PotencialBen2.campoIdFichaPersona1x1}"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.asistente.textoCampoIdFichaPersona1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdFichaPersona1}"
                                                    validatorExpression="#{PotencialBen2.campoIdFichaPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdFichaPersona1x1Texto1"
                                                    binding="#{PotencialBen2.campoIdFichaPersona1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_ficha_persona_1x12y3']}"/>
                                                <webuijsf:button id="campoIdFichaPersona1x1Boton1"
                                                    binding="#{PotencialBen2.campoIdFichaPersona1x1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFichaPersona1Boton1}"/>
                                                <webuijsf:button id="campoIdFichaPersona1x1Boton3"
                                                    binding="#{PotencialBen2.campoIdFichaPersona1x1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFichaPersona1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdFichaPersona1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFichaPersona1x1"
                                                    for="campoIdFichaPersona1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdFichaPersona1x1"
                                                    binding="#{PotencialBen2.helpInlineIdFichaPersona1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_ficha_persona.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaPersona1x3"
                                                rendered="#{PotencialBen2.asistente.campoIdFichaPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdFichaPersona1x2}"
                                                    id="labelIdFichaPersona1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre ficha persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona1x4"
                                                rendered="#{PotencialBen2.asistente.campoIdFichaPersona1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdFichaPersona1x1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_ficha_persona_1x12y4']}"
                                                    id="campoIdFichaPersona1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdFichaPersona1x1Boton2}"
                                                    id="campoIdFichaPersona1x1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFichaPersona1Boton2}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab10"
                                            rendered="#{PotencialBen2.asistente.seccionReclamoRendered}"
                                            text="reclamo">
                                        <h:panelGrid
                                            id="gridPanel134"
                                            rendered="#{PotencialBen2.asistente.seccionReclamoHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab10"
                                                text="#{PotencialBen2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel135"
                                            rendered="#{PotencialBen2.asistente.seccionReclamoRendered}">
                                            <h:panelGrid
                                                id="gridNumeroCondicionReclCen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroCondicionReclCen1x1}"
                                                    id="labelNumeroCondicionReclCen1x1"
                                                    for="listaNumeroCondicionReclCen1x1"
                                                    text="condici&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCondicionReclCen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCondicionReclCen1x1"
                                                    binding="#{PotencialBen2.listaNumeroCondicionReclCen1x1}"
                                                    converter="#{PotencialBen2.converterNumeroCondicionReclCen1}"
                                                    disabled="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaNumeroCondicionReclCen1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['numero_condicion_recl_cen']}"
                                                    toolTip="BundleParametros.numero_condicion_recl_cen.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroCondicionReclCen1x1Texto1"
                                                    binding="#{PotencialBen2.listaNumeroCondicionReclCen1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_condicion_recl_c_1x13y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionReclCen1x1"
                                                    for="listaNumeroCondicionReclCen1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCondicionReclCen1x1"
                                                    binding="#{PotencialBen2.helpInlineNumeroCondicionReclCen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_condicion_recl_cen.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaReclamoCenso1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaReclamoCenso1x1}"
                                                    id="labelFechaReclamoCenso1x1"
                                                    for="campoFechaReclamoCenso1x1"
                                                    text="fecha reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaReclamoCenso1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaReclamoCenso1x1"
                                                    binding="#{PotencialBen2.campoFechaReclamoCenso1x1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_reclamo_censo']}"
                                                    toolTip="BundleParametros.fecha_reclamo_censo.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaReclamoCenso1x1Texto1"
                                                    binding="#{PotencialBen2.campoFechaReclamoCenso1x1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaReclamoCenso1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_reclamo_censo']}"/>
                                                <webuijsf:message id="messageFechaReclamoCenso1x1"
                                                    for="campoFechaReclamoCenso1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaReclamoCenso1x1"
                                                    binding="#{PotencialBen2.helpInlineFechaReclamoCenso1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_reclamo_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosReclamoCenso1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelComentariosReclamoCenso1x1}"
                                                    id="labelComentariosReclamoCenso1x1"
                                                    for="campoComentariosReclamoCenso1x1"
                                                    text="comentarios reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosReclamoCenso1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosReclamoCenso1x1"
                                                    binding="#{PotencialBen2.campoComentariosReclamoCenso1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['comentarios_reclamo_censo']}"
                                                    toolTip="BundleParametros.comentarios_reclamo_censo.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorComentariosReclamoCenso1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosReclamoCenso1x1Texto1"
                                                    binding="#{PotencialBen2.campoComentariosReclamoCenso1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['comentarios_reclamo_censo']}"/>
                                                <webuijsf:message id="messageComentariosReclamoCenso1x1"
                                                    for="campoComentariosReclamoCenso1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosReclamoCenso1x1"
                                                    binding="#{PotencialBen2.helpInlineComentariosReclamoCenso1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_reclamo_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaAprobacionReclamoCenso1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaAprobacionReclamoCenso1x1}"
                                                    id="labelFechaAprobacionReclamoCenso1x1"
                                                    for="campoFechaAprobacionReclamoCenso1x1"
                                                    text="fecha aprobaci&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaAprobacionReclamoCenso1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaAprobacionReclamoCenso1x1"
                                                    binding="#{PotencialBen2.campoFechaAprobacionReclamoCenso1x1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_aprobacion_reclamo_censo']}"
                                                    toolTip="BundleParametros.fecha_aprobacion_reclamo_censo.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaAprobacionReclamoCenso1x1Texto1"
                                                    binding="#{PotencialBen2.campoFechaAprobacionReclamoCenso1x1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaAprobacionReclamoCenso1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_aprobacion_reclamo_censo']}"/>
                                                <webuijsf:message id="messageFechaAprobacionReclamoCenso1x1"
                                                    for="campoFechaAprobacionReclamoCenso1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaAprobacionReclamoCenso1x1"
                                                    binding="#{PotencialBen2.helpInlineFechaAprobacionReclamoCenso1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_aprobacion_reclamo_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosAprReclCen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelComentariosAprReclCen1x1}"
                                                    id="labelComentariosAprReclCen1x1"
                                                    for="campoComentariosAprReclCen1x1"
                                                    text="comentarios aprobaci&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosAprReclCen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosAprReclCen1x1"
                                                    binding="#{PotencialBen2.campoComentariosAprReclCen1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['comentarios_apr_recl_cen']}"
                                                    toolTip="BundleParametros.comentarios_apr_recl_cen.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorComentariosAprReclCen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAprReclCen1x1Texto1"
                                                    binding="#{PotencialBen2.campoComentariosAprReclCen1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['comentarios_apr_recl_cen']}"/>
                                                <webuijsf:message id="messageComentariosAprReclCen1x1"
                                                    for="campoComentariosAprReclCen1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosAprReclCen1x1"
                                                    binding="#{PotencialBen2.helpInlineComentariosAprReclCen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_apr_recl_cen.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaDenegacionReclamoCenso1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaDenegacionReclamoCenso1x1}"
                                                    id="labelFechaDenegacionReclamoCenso1x1"
                                                    for="campoFechaDenegacionReclamoCenso1x1"
                                                    text="fecha denegaci&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaDenegacionReclamoCenso1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaDenegacionReclamoCenso1x1"
                                                    binding="#{PotencialBen2.campoFechaDenegacionReclamoCenso1x1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_denegacion_reclamo_censo']}"
                                                    toolTip="BundleParametros.fecha_denegacion_reclamo_censo.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaDenegacionReclamoCenso1x1Texto1"
                                                    binding="#{PotencialBen2.campoFechaDenegacionReclamoCenso1x1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaDenegacionReclamoCenso1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_denegacion_reclamo_censo']}"/>
                                                <webuijsf:message id="messageFechaDenegacionReclamoCenso1x1"
                                                    for="campoFechaDenegacionReclamoCenso1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaDenegacionReclamoCenso1x1"
                                                    binding="#{PotencialBen2.helpInlineFechaDenegacionReclamoCenso1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_denegacion_reclamo_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaDenReclCen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelNumeroCausaDenReclCen1x1}"
                                                    id="labelNumeroCausaDenReclCen1x1"
                                                    for="listaNumeroCausaDenReclCen1x1"
                                                    text="causa denegaci&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaDenReclCen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaDenReclCen1x1"
                                                    binding="#{PotencialBen2.listaNumeroCausaDenReclCen1x1}"
                                                    converter="#{PotencialBen2.converterNumeroCausaDenReclCen1}"
                                                    disabled="true"
                                                    items="#{PotencialBen2.asistente.opcionesListaNumeroCausaDenReclCen1}"
                                                    selected="#{PotencialBen2.potencialBenDataProvider.value['numero_causa_den_recl_cen']}"
                                                    toolTip="BundleParametros.numero_causa_den_recl_cen.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroCausaDenReclCen1x1Texto1"
                                                    binding="#{PotencialBen2.listaNumeroCausaDenReclCen1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_causa_den_recl_c_1x14y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaDenReclCen1x1"
                                                    for="listaNumeroCausaDenReclCen1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaDenReclCen1x1"
                                                    binding="#{PotencialBen2.helpInlineNumeroCausaDenReclCen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_den_recl_cen.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaDenReclCen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelOtraCausaDenReclCen1x1}"
                                                    id="labelOtraCausaDenReclCen1x1"
                                                    for="campoOtraCausaDenReclCen1x1"
                                                    text="otra causa denegaci&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaDenReclCen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaDenReclCen1x1"
                                                    binding="#{PotencialBen2.campoOtraCausaDenReclCen1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['otra_causa_den_recl_cen']}"
                                                    toolTip="BundleParametros.otra_causa_den_recl_cen.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorOtraCausaDenReclCen1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaDenReclCen1x1Texto1"
                                                    binding="#{PotencialBen2.campoOtraCausaDenReclCen1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['otra_causa_den_recl_cen']}"/>
                                                <webuijsf:message id="messageOtraCausaDenReclCen1x1"
                                                    for="campoOtraCausaDenReclCen1x1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaDenReclCen1x1"
                                                    binding="#{PotencialBen2.helpInlineOtraCausaDenReclCen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_den_recl_cen.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridComentariosDenReclCen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelComentariosDenReclCen1x1}"
                                                    id="labelComentariosDenReclCen1x1"
                                                    for="campoComentariosDenReclCen1x1"
                                                    text="comentarios denegaci&#243;n reclamo censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridComentariosDenReclCen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoComentariosDenReclCen1x1"
                                                    binding="#{PotencialBen2.campoComentariosDenReclCen1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['comentarios_den_recl_cen']}"
                                                    toolTip="BundleParametros.comentarios_den_recl_cen.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorComentariosDenReclCen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosDenReclCen1x1Texto1"
                                                    binding="#{PotencialBen2.campoComentariosDenReclCen1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['comentarios_den_recl_cen']}"/>
                                                <webuijsf:message id="messageComentariosDenReclCen1x1"
                                                    for="campoComentariosDenReclCen1x1"/>
                                                <webuijsf:helpInline id="helpInlineComentariosDenReclCen1x1"
                                                    binding="#{PotencialBen2.helpInlineComentariosDenReclCen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.comentarios_den_recl_cen.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab11"
                                            rendered="#{PotencialBen2.asistente.seccionVisitaRendered}"
                                            text="visita">
                                        <h:panelGrid
                                            id="gridPanel136"
                                            rendered="#{PotencialBen2.asistente.seccionVisitaHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab11"
                                                text="#{PotencialBen2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel137"
                                            rendered="#{PotencialBen2.asistente.seccionVisitaRendered}">
                                            <h:panelGrid
                                                id="gridFechaUltimaVisitaCenso1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelFechaUltimaVisitaCenso1x1}"
                                                    id="labelFechaUltimaVisitaCenso1x1"
                                                    for="campoFechaUltimaVisitaCenso1x1"
                                                    text="fecha ultima visita censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaUltimaVisitaCenso1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaUltimaVisitaCenso1x1"
                                                    binding="#{PotencialBen2.campoFechaUltimaVisitaCenso1x1}"
                                                    maxDate="#{PotencialBen2.gestor.defaultMaxDate}"
                                                    minDate="#{PotencialBen2.gestor.defaultMinDate}"
                                                    readOnly="true"
                                                    selectedDate="#{PotencialBen2.potencialBenDataProvider.value['fecha_ultima_visita_censo']}"
                                                    toolTip="BundleParametros.fecha_ultima_visita_censo.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaUltimaVisitaCenso1x1Texto1"
                                                    binding="#{PotencialBen2.campoFechaUltimaVisitaCenso1x1Texto1}"
                                                    converter="#{PotencialBen2.converterFechaUltimaVisitaCenso1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['fecha_ultima_visita_censo']}"/>
                                                <webuijsf:message id="messageFechaUltimaVisitaCenso1x1"
                                                    for="campoFechaUltimaVisitaCenso1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaUltimaVisitaCenso1x1"
                                                    binding="#{PotencialBen2.helpInlineFechaUltimaVisitaCenso1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_ultima_visita_censo.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacionesUltVisitaCen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelObservacionesUltVisitaCen1x1}"
                                                    id="labelObservacionesUltVisitaCen1x1"
                                                    for="campoObservacionesUltVisitaCen1x1"
                                                    text="observaciones &#250;ltima visita censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacionesUltVisitaCen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservacionesUltVisitaCen1x1"
                                                    binding="#{PotencialBen2.campoObservacionesUltVisitaCen1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['observaciones_ult_visita_cen']}"
                                                    toolTip="BundleParametros.observaciones_ult_visita_cen.potencial_ben"
                                                    validatorExpression="#{PotencialBen2.validatorObservacionesUltVisitaCen1.validate}"/>
                                                <webuijsf:staticText id="campoObservacionesUltVisitaCen1x1Texto1"
                                                    binding="#{PotencialBen2.campoObservacionesUltVisitaCen1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['observaciones_ult_visita_cen']}"/>
                                                <webuijsf:message id="messageObservacionesUltVisitaCen1x1"
                                                    for="campoObservacionesUltVisitaCen1x1"/>
                                                <webuijsf:helpInline id="helpInlineObservacionesUltVisitaCen1x1"
                                                    binding="#{PotencialBen2.helpInlineObservacionesUltVisitaCen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observaciones_ult_visita_cen.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioUltVisitaCen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdFuncionarioUltVisitaCen1x1}"
                                                    id="labelIdFuncionarioUltVisitaCen1x1"
                                                    for="campoIdFuncionarioUltVisitaCen1x1"
                                                    text="funcionario &#250;ltima visita censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioUltVisitaCen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionarioUltVisitaCen1x1"
                                                    binding="#{PotencialBen2.campoIdFuncionarioUltVisitaCen1x1}"
                                                    readOnly="true"
                                                    text="#{PotencialBen2.asistente.textoCampoIdFuncionarioUltVisitaCen1}"
                                                    toolTip="#{PotencialBen2.asistente.toolTipCampoIdFuncionarioUltVisitaCen1}"
                                                    validatorExpression="#{PotencialBen2.campoIdFuncionarioUltVisitaCen1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioUltVisitaCen1x1Texto1"
                                                    binding="#{PotencialBen2.campoIdFuncionarioUltVisitaCen1x1Texto1}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['codigo_funcionario_1x16y3']}"/>
                                                <webuijsf:button id="campoIdFuncionarioUltVisitaCen1x1Boton1"
                                                    binding="#{PotencialBen2.campoIdFuncionarioUltVisitaCen1x1Boton1}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFuncionarioUltVisitaCen1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionarioUltVisitaCen1x1Boton3"
                                                    binding="#{PotencialBen2.campoIdFuncionarioUltVisitaCen1x1Boton3}"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFuncionarioUltVisitaCen1Boton2}"
                                                    rendered="#{PotencialBen2.asistente.campoIdFuncionarioUltVisitaCen1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionarioUltVisitaCen1x1"
                                                    for="campoIdFuncionarioUltVisitaCen1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionarioUltVisitaCen1x1"
                                                    binding="#{PotencialBen2.helpInlineIdFuncionarioUltVisitaCen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcionario_ult_visita_cen.potencial_ben"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioUltVisitaCen1x3"
                                                rendered="#{PotencialBen2.asistente.campoIdFuncionarioUltVisitaCen1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{PotencialBen2.labelIdFuncionarioUltVisitaCen1x2}"
                                                    id="labelIdFuncionarioUltVisitaCen1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcionario &#250;ltima visita censo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioUltVisitaCen1x4"
                                                rendered="#{PotencialBen2.asistente.campoIdFuncionarioUltVisitaCen1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{PotencialBen2.campoIdFuncionarioUltVisitaCen1x1Texto2}"
                                                    text="#{PotencialBen2.potencialBenDataProvider.value['nombre_funcionario_1x16y4']}"
                                                    id="campoIdFuncionarioUltVisitaCen1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen2.campoIdFuncionarioUltVisitaCen1x1Boton2}"
                                                    id="campoIdFuncionarioUltVisitaCen1x1Boton2"
                                                    onClick="#{PotencialBen2.asistente.scriptCampoIdFuncionarioUltVisitaCen1Boton2}"/>
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
                                                        actionExpression="#{PotencialBen2.botonIrAlPrimero2_action}"
                                                        binding="#{PotencialBen2.botonIrAlPrimero2}"
                                                        disabled="#{PotencialBen2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{PotencialBen2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{PotencialBen2.gestor.scriptIrAlPrimero}"
                                                        text="#{PotencialBen2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PotencialBen2.botonIrAlAnterior2_action}"
                                                        binding="#{PotencialBen2.botonIrAlAnterior2}"
                                                        disabled="#{PotencialBen2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{PotencialBen2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{PotencialBen2.gestor.scriptIrAlAnterior}"
                                                        text="#{PotencialBen2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PotencialBen2.botonIrAlSiguiente2_action}"
                                                        binding="#{PotencialBen2.botonIrAlSiguiente2}"
                                                        disabled="#{PotencialBen2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{PotencialBen2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{PotencialBen2.gestor.scriptIrAlSiguiente}"
                                                        text="#{PotencialBen2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PotencialBen2.botonIrAlUltimo2_action}"
                                                        binding="#{PotencialBen2.botonIrAlUltimo2}"
                                                        disabled="#{PotencialBen2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{PotencialBen2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{PotencialBen2.gestor.scriptIrAlUltimo}"
                                                        text="#{PotencialBen2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{PotencialBen2.botonProcesarFila2_action}"
                                                        binding="#{PotencialBen2.botonProcesarFila2}"
                                                        disabled="#{PotencialBen2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{PotencialBen2.gestor.urlImagenProcesar}"
                                                        onClick="#{PotencialBen2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{PotencialBen2.asistente.comandoDisponible}"
                                                        text="#{PotencialBen2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{PotencialBen2.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{PotencialBen2.botonAgregar1_action}"
                                                    binding="#{PotencialBen2.botonAgregar1}"
                                                    disabled="#{PotencialBen2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{PotencialBen2.gestor.scriptAgregar}"
                                                    rendered="#{PotencialBen2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{PotencialBen2.listaFuncionEdicion1}"
                                                    converter="#{PotencialBen2.converterListaFuncionEdicion1}"
                                                    disabled="#{PotencialBen2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{PotencialBen2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{PotencialBen2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{PotencialBen2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{PotencialBen2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen2.botonEditar1_action}"
                                                    binding="#{PotencialBen2.botonEditar1}"
                                                    disabled="#{PotencialBen2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{PotencialBen2.gestor.scriptEditar}"
                                                    rendered="#{PotencialBen2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{PotencialBen2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen2.botonEliminar1_action}"
                                                    binding="#{PotencialBen2.botonEliminar1}"
                                                    disabled="#{PotencialBen2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{PotencialBen2.gestor.scriptEliminar}"
                                                    rendered="#{PotencialBen2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen2.botonAplicar1_action}"
                                                    binding="#{PotencialBen2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{PotencialBen2.gestor.scriptAplicar}"
                                                    rendered="#{PotencialBen2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen2.botonDeshacer1_action}"
                                                    binding="#{PotencialBen2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{PotencialBen2.gestor.scriptDeshacer}"
                                                    rendered="#{PotencialBen2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen2.botonConfirmar1_action}"
                                                    binding="#{PotencialBen2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{PotencialBen2.gestor.scriptConfirmar}"
                                                    rendered="#{PotencialBen2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen2.botonDescartar1_action}"
                                                    binding="#{PotencialBen2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{PotencialBen2.gestor.scriptDescartar}"
                                                    rendered="#{PotencialBen2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{PotencialBen2.listaFuncionAccion1}"
                                                    converter="#{PotencialBen2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{PotencialBen2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{PotencialBen2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{PotencialBen2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{PotencialBen2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen2.botonProcesar1_action}"
                                                    binding="#{PotencialBen2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{PotencialBen2.gestor.scriptProcesar}"
                                                    rendered="#{PotencialBen2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen2.botonRefrescar1_action}"
                                                    binding="#{PotencialBen2.botonRefrescar1}"
                                                    disabled="#{PotencialBen2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{PotencialBen2.gestor.scriptRefrescar}"
                                                    rendered="#{PotencialBen2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen2.botonReconsultar1_action}"
                                                    binding="#{PotencialBen2.botonReconsultar1}"
                                                    disabled="#{PotencialBen2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{PotencialBen2.gestor.scriptReconsultar}"
                                                    rendered="#{PotencialBen2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen2.botonRetornar1_action}"
                                                    binding="#{PotencialBen2.botonRetornar1}"
                                                    disabled="#{PotencialBen2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{PotencialBen2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{PotencialBen2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{PotencialBen2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel147"
                                                rendered="#{PotencialBen2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{PotencialBen2.imageHyperlink1_action}"
                                                    binding="#{PotencialBen2.imageHyperlink1}"
                                                    disabled="#{PotencialBen2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{PotencialBen2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{PotencialBen2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{PotencialBen2.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.PotencialBen2_imageHyperlink1_toolTip}"/>
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
