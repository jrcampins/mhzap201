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
                    focus="#{LogImpIds6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpIds6.gestor.preserveFocus}"
                    preserveScroll="#{LogImpIds6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpIds6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdLogImpIds1 campoCedula1 campoLetraCedula1 campoApellidos1 campoNombres1 campoNacimiento1 campoSexo1 campoNacionalidad1 campoEstadoCivil1 campoLugarNacimiento1 campoIndigena1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpIds6.breadcrumbs1}" 
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
                                                    rendered="#{LogImpIds6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpIds6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpIds6.gestor.mensajeDisponible}"
                                                    text="#{LogImpIds6.gestor.mensaje}"
                                                    url="#{LogImpIds6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{LogImpIds6.gestor.filaDisponible}"
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
                                                        actionExpression="#{LogImpIds6.botonIrAlPrimero1_action}"
                                                        binding="#{LogImpIds6.botonIrAlPrimero1}"
                                                        disabled="#{LogImpIds6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{LogImpIds6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpIds6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpIds6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpIds6.botonIrAlAnterior1_action}"
                                                        binding="#{LogImpIds6.botonIrAlAnterior1}"
                                                        disabled="#{LogImpIds6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{LogImpIds6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpIds6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpIds6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpIds6.botonIrAlSiguiente1_action}"
                                                        binding="#{LogImpIds6.botonIrAlSiguiente1}"
                                                        disabled="#{LogImpIds6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{LogImpIds6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpIds6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpIds6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpIds6.botonIrAlUltimo1_action}"
                                                        binding="#{LogImpIds6.botonIrAlUltimo1}"
                                                        disabled="#{LogImpIds6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{LogImpIds6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpIds6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpIds6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpIds6.botonProcesarFila1_action}"
                                                        binding="#{LogImpIds6.botonProcesarFila1}"
                                                        disabled="#{LogImpIds6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpIds6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpIds6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpIds6.asistente.comandoDisponible}"
                                                        text="#{LogImpIds6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogImpIds6.gestor.tituloConsulta}"/>
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
                                                    binding="#{LogImpIds6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{LogImpIds6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpIds6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpIds6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{LogImpIds6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{LogImpIds6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{LogImpIds6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{LogImpIds6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{LogImpIds6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{LogImpIds6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdLogImpIds1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.labelIdLogImpIds1}"
                                                    id="labelIdLogImpIds1"
                                                    for="campoIdLogImpIds1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdLogImpIds2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdLogImpIds1"
                                                    binding="#{LogImpIds6.campoIdLogImpIds1}"
                                                    converter="#{LogImpIds6.converterIdLogImpIds1}"
                                                    readOnly="true"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['id_log_imp_ids']}"
                                                    toolTip="BundleParametros.id_log_imp_ids.log_imp_ids"
                                                    validatorExpression="#{LogImpIds6.validatorIdLogImpIds1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpIds1Texto1"
                                                    binding="#{LogImpIds6.campoIdLogImpIds1Texto1}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['id_log_imp_ids']}"/>
                                                <webuijsf:message id="messageIdLogImpIds1"
                                                    for="campoIdLogImpIds1"/>
                                                <webuijsf:helpInline id="helpInlineIdLogImpIds1"
                                                    binding="#{LogImpIds6.helpInlineIdLogImpIds1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_log_imp_ids.log_imp_ids"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCedula1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.labelCedula1}"
                                                    id="labelCedula1"
                                                    for="campoCedula1"
                                                    text="c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCedula2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCedula1"
                                                    binding="#{LogImpIds6.campoCedula1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpIds6.gestor.filaNoProcesada}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['cedula']}"
                                                    toolTip="BundleParametros.cedula.log_imp_ids"
                                                    validatorExpression="#{LogImpIds6.validatorCedula1.validate}"/>
                                                <webuijsf:staticText id="campoCedula1Texto1"
                                                    binding="#{LogImpIds6.campoCedula1Texto1}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['cedula']}"/>
                                                <webuijsf:message id="messageCedula1"
                                                    for="campoCedula1"/>
                                                <webuijsf:helpInline id="helpInlineCedula1"
                                                    binding="#{LogImpIds6.helpInlineCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.cedula.log_imp_ids"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLetraCedula1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.labelLetraCedula1}"
                                                    id="labelLetraCedula1"
                                                    for="campoLetraCedula1"
                                                    text="letra c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLetraCedula2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoLetraCedula1"
                                                    binding="#{LogImpIds6.campoLetraCedula1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpIds6.gestor.filaNoProcesada}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['letra_cedula']}"
                                                    toolTip="BundleParametros.letra_cedula.log_imp_ids"
                                                    validatorExpression="#{LogImpIds6.validatorLetraCedula1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedula1Texto1"
                                                    binding="#{LogImpIds6.campoLetraCedula1Texto1}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['letra_cedula']}"/>
                                                <webuijsf:message id="messageLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                <webuijsf:helpInline id="helpInlineLetraCedula1"
                                                    binding="#{LogImpIds6.helpInlineLetraCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.letra_cedula.log_imp_ids"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridApellidos1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.labelApellidos1}"
                                                    id="labelApellidos1"
                                                    for="campoApellidos1"
                                                    text="apellidos"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridApellidos2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoApellidos1"
                                                    binding="#{LogImpIds6.campoApellidos1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpIds6.gestor.filaNoProcesada}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['apellidos']}"
                                                    toolTip="BundleParametros.apellidos.log_imp_ids"
                                                    validatorExpression="#{LogImpIds6.validatorApellidos1.validate}"/>
                                                <webuijsf:staticText id="campoApellidos1Texto1"
                                                    binding="#{LogImpIds6.campoApellidos1Texto1}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['apellidos']}"/>
                                                <webuijsf:message id="messageApellidos1"
                                                    for="campoApellidos1"/>
                                                <webuijsf:helpInline id="helpInlineApellidos1"
                                                    binding="#{LogImpIds6.helpInlineApellidos1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.apellidos.log_imp_ids"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombres1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.labelNombres1}"
                                                    id="labelNombres1"
                                                    for="campoNombres1"
                                                    text="nombres"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombres2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNombres1"
                                                    binding="#{LogImpIds6.campoNombres1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpIds6.gestor.filaNoProcesada}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['nombres']}"
                                                    toolTip="BundleParametros.nombres.log_imp_ids"
                                                    validatorExpression="#{LogImpIds6.validatorNombres1.validate}"/>
                                                <webuijsf:staticText id="campoNombres1Texto1"
                                                    binding="#{LogImpIds6.campoNombres1Texto1}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['nombres']}"/>
                                                <webuijsf:message id="messageNombres1"
                                                    for="campoNombres1"/>
                                                <webuijsf:helpInline id="helpInlineNombres1"
                                                    binding="#{LogImpIds6.helpInlineNombres1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombres.log_imp_ids"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNacimiento1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.labelNacimiento1}"
                                                    id="labelNacimiento1"
                                                    for="campoNacimiento1"
                                                    text="nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNacimiento2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNacimiento1"
                                                    binding="#{LogImpIds6.campoNacimiento1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpIds6.gestor.filaNoProcesada}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['nacimiento']}"
                                                    toolTip="BundleParametros.nacimiento.log_imp_ids"
                                                    validatorExpression="#{LogImpIds6.validatorNacimiento1.validate}"/>
                                                <webuijsf:staticText id="campoNacimiento1Texto1"
                                                    binding="#{LogImpIds6.campoNacimiento1Texto1}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['nacimiento']}"/>
                                                <webuijsf:message id="messageNacimiento1"
                                                    for="campoNacimiento1"/>
                                                <webuijsf:helpInline id="helpInlineNacimiento1"
                                                    binding="#{LogImpIds6.helpInlineNacimiento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nacimiento.log_imp_ids"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSexo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.labelSexo1}"
                                                    id="labelSexo1"
                                                    for="campoSexo1"
                                                    text="sexo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSexo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoSexo1"
                                                    binding="#{LogImpIds6.campoSexo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpIds6.gestor.filaNoProcesada}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['sexo']}"
                                                    toolTip="BundleParametros.sexo.log_imp_ids"
                                                    validatorExpression="#{LogImpIds6.validatorSexo1.validate}"/>
                                                <webuijsf:staticText id="campoSexo1Texto1"
                                                    binding="#{LogImpIds6.campoSexo1Texto1}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['sexo']}"/>
                                                <webuijsf:message id="messageSexo1"
                                                    for="campoSexo1"/>
                                                <webuijsf:helpInline id="helpInlineSexo1"
                                                    binding="#{LogImpIds6.helpInlineSexo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.sexo.log_imp_ids"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNacionalidad1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.labelNacionalidad1}"
                                                    id="labelNacionalidad1"
                                                    for="campoNacionalidad1"
                                                    text="nacionalidad"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNacionalidad2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNacionalidad1"
                                                    binding="#{LogImpIds6.campoNacionalidad1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpIds6.gestor.filaNoProcesada}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['nacionalidad']}"
                                                    toolTip="BundleParametros.nacionalidad.log_imp_ids"
                                                    validatorExpression="#{LogImpIds6.validatorNacionalidad1.validate}"/>
                                                <webuijsf:staticText id="campoNacionalidad1Texto1"
                                                    binding="#{LogImpIds6.campoNacionalidad1Texto1}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['nacionalidad']}"/>
                                                <webuijsf:message id="messageNacionalidad1"
                                                    for="campoNacionalidad1"/>
                                                <webuijsf:helpInline id="helpInlineNacionalidad1"
                                                    binding="#{LogImpIds6.helpInlineNacionalidad1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nacionalidad.log_imp_ids"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEstadoCivil1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.labelEstadoCivil1}"
                                                    id="labelEstadoCivil1"
                                                    for="campoEstadoCivil1"
                                                    text="estado civil"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEstadoCivil2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoEstadoCivil1"
                                                    binding="#{LogImpIds6.campoEstadoCivil1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpIds6.gestor.filaNoProcesada}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['estado_civil']}"
                                                    toolTip="BundleParametros.estado_civil.log_imp_ids"
                                                    validatorExpression="#{LogImpIds6.validatorEstadoCivil1.validate}"/>
                                                <webuijsf:staticText id="campoEstadoCivil1Texto1"
                                                    binding="#{LogImpIds6.campoEstadoCivil1Texto1}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['estado_civil']}"/>
                                                <webuijsf:message id="messageEstadoCivil1"
                                                    for="campoEstadoCivil1"/>
                                                <webuijsf:helpInline id="helpInlineEstadoCivil1"
                                                    binding="#{LogImpIds6.helpInlineEstadoCivil1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.estado_civil.log_imp_ids"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLugarNacimiento1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.labelLugarNacimiento1}"
                                                    id="labelLugarNacimiento1"
                                                    for="campoLugarNacimiento1"
                                                    text="lugar nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLugarNacimiento2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoLugarNacimiento1"
                                                    binding="#{LogImpIds6.campoLugarNacimiento1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpIds6.gestor.filaNoProcesada}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['lugar_nacimiento']}"
                                                    toolTip="BundleParametros.lugar_nacimiento.log_imp_ids"
                                                    validatorExpression="#{LogImpIds6.validatorLugarNacimiento1.validate}"/>
                                                <webuijsf:staticText id="campoLugarNacimiento1Texto1"
                                                    binding="#{LogImpIds6.campoLugarNacimiento1Texto1}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['lugar_nacimiento']}"/>
                                                <webuijsf:message id="messageLugarNacimiento1"
                                                    for="campoLugarNacimiento1"/>
                                                <webuijsf:helpInline id="helpInlineLugarNacimiento1"
                                                    binding="#{LogImpIds6.helpInlineLugarNacimiento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.lugar_nacimiento.log_imp_ids"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIndigena1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.labelIndigena1}"
                                                    id="labelIndigena1"
                                                    for="campoIndigena1"
                                                    text="indigena"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIndigena2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoIndigena1"
                                                    binding="#{LogImpIds6.campoIndigena1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpIds6.gestor.filaNoProcesada}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['indigena']}"
                                                    toolTip="BundleParametros.indigena.log_imp_ids"
                                                    validatorExpression="#{LogImpIds6.validatorIndigena1.validate}"/>
                                                <webuijsf:staticText id="campoIndigena1Texto1"
                                                    binding="#{LogImpIds6.campoIndigena1Texto1}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['indigena']}"/>
                                                <webuijsf:message id="messageIndigena1"
                                                    for="campoIndigena1"/>
                                                <webuijsf:helpInline id="helpInlineIndigena1"
                                                    binding="#{LogImpIds6.helpInlineIndigena1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.indigena.log_imp_ids"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsImportado1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"
                                                    text="importado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsImportado2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpIds6.listaEsImportado1}"
                                                    converter="#{LogImpIds6.converterEsImportado1}"
                                                    disabled="#{LogImpIds6.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpIds6.asistente.opcionesListaEsImportado1}"
                                                    selected="#{LogImpIds6.logImpIdsDataProvider.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_ids"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpIds6.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:helpInline id="helpInlineEsImportado1"
                                                    binding="#{LogImpIds6.helpInlineEsImportado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_importado.log_imp_ids"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservacion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"
                                                    text="observaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservacion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpIds6.campoObservacion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpIds6.gestor.filaNoProcesada}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_ids"
                                                    validatorExpression="#{LogImpIds6.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpIds6.campoObservacion1Texto1}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:helpInline id="helpInlineObservacion1"
                                                    binding="#{LogImpIds6.helpInlineObservacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observacion.log_imp_ids"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaHoraTransaccion1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"
                                                    text="fecha hora transacci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaHoraTransaccion2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpIds6.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpIds6.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpIds6.gestor.filaNoProcesada}" required="true"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_ids"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpIds6.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpIds6.converterFechaHoraTransaccion1}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:helpInline id="helpInlineFechaHoraTransaccion1"
                                                    binding="#{LogImpIds6.helpInlineFechaHoraTransaccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_hora_transaccion.log_imp_ids"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"
                                                    text="nombre archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpIds6.campoNombreArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpIds6.gestor.filaNoProcesada}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_ids"
                                                    validatorExpression="#{LogImpIds6.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpIds6.campoNombreArchivo1Texto1}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['nombre_archivo']}"/>
                                                <webuijsf:button id="campoNombreArchivo1Boton3"
                                                    binding="#{LogImpIds6.campoNombreArchivo1Boton3}"
                                                    onClick="#{LogImpIds6.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpIds6.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpIds6.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpIds6.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                <webuijsf:message id="messageNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineNombreArchivo1"
                                                    binding="#{LogImpIds6.helpInlineNombreArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_archivo.log_imp_ids"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoArchivo1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{LogImpIds6.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"
                                                    text="c&#243;digo archivo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoArchivo2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpIds6.campoCodigoArchivo1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{LogImpIds6.gestor.filaNoProcesada}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_ids"
                                                    validatorExpression="#{LogImpIds6.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpIds6.campoCodigoArchivo1Texto1}"
                                                    text="#{LogImpIds6.logImpIdsDataProvider.value['codigo_archivo']}"/>
                                                <webuijsf:message id="messageCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoArchivo1"
                                                    binding="#{LogImpIds6.helpInlineCodigoArchivo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_archivo.log_imp_ids"
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
                                                        actionExpression="#{LogImpIds6.botonIrAlPrimero2_action}"
                                                        binding="#{LogImpIds6.botonIrAlPrimero2}"
                                                        disabled="#{LogImpIds6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{LogImpIds6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{LogImpIds6.gestor.scriptIrAlPrimero}"
                                                        text="#{LogImpIds6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpIds6.botonIrAlAnterior2_action}"
                                                        binding="#{LogImpIds6.botonIrAlAnterior2}"
                                                        disabled="#{LogImpIds6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{LogImpIds6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{LogImpIds6.gestor.scriptIrAlAnterior}"
                                                        text="#{LogImpIds6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpIds6.botonIrAlSiguiente2_action}"
                                                        binding="#{LogImpIds6.botonIrAlSiguiente2}"
                                                        disabled="#{LogImpIds6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{LogImpIds6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{LogImpIds6.gestor.scriptIrAlSiguiente}"
                                                        text="#{LogImpIds6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpIds6.botonIrAlUltimo2_action}"
                                                        binding="#{LogImpIds6.botonIrAlUltimo2}"
                                                        disabled="#{LogImpIds6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{LogImpIds6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{LogImpIds6.gestor.scriptIrAlUltimo}"
                                                        text="#{LogImpIds6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{LogImpIds6.botonProcesarFila2_action}"
                                                        binding="#{LogImpIds6.botonProcesarFila2}"
                                                        disabled="#{LogImpIds6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{LogImpIds6.gestor.urlImagenProcesar}"
                                                        onClick="#{LogImpIds6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{LogImpIds6.asistente.comandoDisponible}"
                                                        text="#{LogImpIds6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{LogImpIds6.gestor.mensajeCambiosPorConfirmar}"/>
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
                                                    actionExpression="#{LogImpIds6.botonAgregar1_action}"
                                                    binding="#{LogImpIds6.botonAgregar1}"
                                                    disabled="#{LogImpIds6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpIds6.gestor.scriptAgregar}"
                                                    rendered="#{LogImpIds6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpIds6.listaFuncionEdicion1}"
                                                    converter="#{LogImpIds6.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpIds6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpIds6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpIds6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpIds6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpIds6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds6.botonEditar1_action}"
                                                    binding="#{LogImpIds6.botonEditar1}"
                                                    disabled="#{LogImpIds6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpIds6.gestor.scriptEditar}"
                                                    rendered="#{LogImpIds6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpIds6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds6.botonEliminar1_action}"
                                                    binding="#{LogImpIds6.botonEliminar1}"
                                                    disabled="#{LogImpIds6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpIds6.gestor.scriptEliminar}"
                                                    rendered="#{LogImpIds6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds6.botonAplicar1_action}"
                                                    binding="#{LogImpIds6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpIds6.gestor.scriptAplicar}"
                                                    rendered="#{LogImpIds6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds6.botonDeshacer1_action}"
                                                    binding="#{LogImpIds6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpIds6.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpIds6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds6.botonConfirmar1_action}"
                                                    binding="#{LogImpIds6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpIds6.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpIds6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds6.botonDescartar1_action}"
                                                    binding="#{LogImpIds6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpIds6.gestor.scriptDescartar}"
                                                    rendered="#{LogImpIds6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpIds6.listaFuncionAccion1}"
                                                    converter="#{LogImpIds6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpIds6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpIds6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpIds6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpIds6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds6.botonProcesar1_action}"
                                                    binding="#{LogImpIds6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpIds6.gestor.scriptProcesar}"
                                                    rendered="#{LogImpIds6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds6.botonRefrescar1_action}"
                                                    binding="#{LogImpIds6.botonRefrescar1}"
                                                    disabled="#{LogImpIds6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpIds6.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpIds6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds6.botonReconsultar1_action}"
                                                    binding="#{LogImpIds6.botonReconsultar1}"
                                                    disabled="#{LogImpIds6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpIds6.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpIds6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds6.botonRetornar1_action}"
                                                    binding="#{LogImpIds6.botonRetornar1}"
                                                    disabled="#{LogImpIds6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpIds6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpIds6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpIds6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{LogImpIds6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpIds6.imageHyperlink1_action}"
                                                    binding="#{LogImpIds6.imageHyperlink1}"
                                                    disabled="#{LogImpIds6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpIds6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpIds6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpIds6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpIds6_imageHyperlink1_toolTip}"/>
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
