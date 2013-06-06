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
                    focus="#{PersonaAnotada1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{PersonaAnotada1.gestor.preserveFocus}"
                    preserveScroll="#{PersonaAnotada1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{PersonaAnotada1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdPersonaAnotada1 campoIdPersona1 campoCodigoPersona1 campoNombrePersona1 campoIdUsuario1 campoCodigoUsuario1 campoNombreUsuario1 campoFechaHoraSeleccion1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{PersonaAnotada1.breadcrumbs1}" 
                                        id="breadcrumbs1" 
                                        styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <jsp:directive.include file="FragmentoFiltro.jspf"/>
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
                                                    rendered="#{PersonaAnotada1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{PersonaAnotada1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{PersonaAnotada1.gestor.mensajeDisponible}"
                                                    text="#{PersonaAnotada1.gestor.mensaje}"
                                                    url="#{PersonaAnotada1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{PersonaAnotada1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{PersonaAnotada1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{PersonaAnotada1.gestor.filaEscogida}" 
                                                sourceData="#{PersonaAnotada1.personaAnotadaDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{PersonaAnotada1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{PersonaAnotada1.gestor.scriptElegir}" 
                                                        selected="#{PersonaAnotada1.gestor.filaElegida}" 
                                                        toolTip="#{PersonaAnotada1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{PersonaAnotada1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{PersonaAnotada1.botonEscogerFila1_action}"
                                                        binding="#{PersonaAnotada1.botonEscogerFila1}"
                                                        disabled="#{PersonaAnotada1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{PersonaAnotada1.gestor.urlImagenEscoger}" 
                                                        onClick="#{PersonaAnotada1.gestor.scriptEscoger}"
                                                        text="#{PersonaAnotada1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{PersonaAnotada1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{PersonaAnotada1.botonDetallarFila1_action}"
                                                        binding="#{PersonaAnotada1.botonDetallarFila1}"
                                                        disabled="#{PersonaAnotada1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{PersonaAnotada1.gestor.urlImagenDetallar}" 
                                                        onClick="#{PersonaAnotada1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{PersonaAnotada1.gestor.detalleDisponible}" 
                                                        text="#{PersonaAnotada1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{PersonaAnotada1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{PersonaAnotada1.botonProcesarFila1_action}"
                                                        binding="#{PersonaAnotada1.botonProcesarFila1}"
                                                        disabled="#{PersonaAnotada1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{PersonaAnotada1.gestor.urlImagenProcesar}" 
                                                        onClick="#{PersonaAnotada1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{PersonaAnotada1.asistente.comandoDisponible}" 
                                                        text="#{PersonaAnotada1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{PersonaAnotada1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{PersonaAnotada1.botonRetornarFila1_action}"
                                                        binding="#{PersonaAnotada1.botonRetornarFila1}" 
                                                        disabled="#{PersonaAnotada1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{PersonaAnotada1.gestor.urlImagenRetornar}"
                                                        onClick="#{PersonaAnotada1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{PersonaAnotada1.gestor.funcionReturnVisible}" 
                                                        text="#{PersonaAnotada1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{PersonaAnotada1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PersonaAnotada1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{PersonaAnotada1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{PersonaAnotada1.hipervinculoAccionFila1_action}"
                                                        binding="#{PersonaAnotada1.hipervinculoAccionFila1}"
                                                        disabled="#{PersonaAnotada1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{PersonaAnotada1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{PersonaAnotada1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.PersonaAnotada1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{PersonaAnotada1.tableColumn3}" 
                                                    headerText="#{PersonaAnotada1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{PersonaAnotada1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{PersonaAnotada1.hipervinculoDetallarFila1_action}"
                                                        binding="#{PersonaAnotada1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{PersonaAnotada1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{PersonaAnotada1.gestor.identificacionFila}" 
                                                        toolTip="#{PersonaAnotada1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PersonaAnotada1.tableColumnIdPersonaAnotada1}"
                                                    toolTip="BundleParametros.id_persona_anotada.persona_anotada"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdPersonaAnotada1" rendered="false"
                                                    sort="id_persona_anotada">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersonaAnotada1"
                                                    text="#{currentRow.value['id_persona_anotada']}"
                                                    rendered="#{PersonaAnotada1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada1.labelIdPersonaAnotada1}"
                                                    id="labelIdPersonaAnotada1"
                                                    for="campoIdPersonaAnotada1"/>
                                                <webuijsf:textField id="campoIdPersonaAnotada1"
                                                    binding="#{PersonaAnotada1.campoIdPersonaAnotada1}"
                                                    converter="#{PersonaAnotada1.converterIdPersonaAnotada1}"
                                                    readOnly="#{PersonaAnotada1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_persona_anotada']}"
                                                    toolTip="BundleParametros.id_persona_anotada.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada1.validatorIdPersonaAnotada1.validate}"/>
                                                <webuijsf:staticText id="campoIdPersonaAnotada1Texto1"
                                                    binding="#{PersonaAnotada1.campoIdPersonaAnotada1Texto1}"
                                                    text="#{currentRow.value['id_persona_anotada']}"/>
                                                <webuijsf:message id="messageIdPersonaAnotada1"
                                                    for="campoIdPersonaAnotada1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PersonaAnotada1.tableColumnIdPersona1}"
                                                    toolTip="BundleParametros.id_persona.persona_anotada"
                                                    headerText="identificaci&#243;n persona"
                                                    id="tableColumnIdPersona1"
                                                    sort="id_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona1"
                                                    text="#{currentRow.value['id_persona']}"
                                                    rendered="#{PersonaAnotada1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada1.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{PersonaAnotada1.campoIdPersona1}"
                                                    converter="#{PersonaAnotada1.converterIdPersona1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['id_persona']}"
                                                    toolTip="BundleParametros.id_persona.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada1.validatorIdPersona1.validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{PersonaAnotada1.campoIdPersona1Texto1}"
                                                    text="#{currentRow.value['id_persona']}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PersonaAnotada1.tableColumnCodigoPersona1}"
                                                    toolTip="BundleParametros.codigo_persona.persona_anotada"
                                                    headerText="c&#243;digo persona"
                                                    id="tableColumnCodigoPersona1"
                                                    sort="codigo_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoPersona1"
                                                    text="#{currentRow.value['codigo_persona']}"
                                                    rendered="#{PersonaAnotada1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada1.labelCodigoPersona1}"
                                                    id="labelCodigoPersona1"
                                                    for="campoCodigoPersona1"/>
                                                <webuijsf:textField id="campoCodigoPersona1"
                                                    binding="#{PersonaAnotada1.campoCodigoPersona1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{currentRow.value['codigo_persona']}"
                                                    toolTip="BundleParametros.codigo_persona.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada1.validatorCodigoPersona1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPersona1Texto1"
                                                    binding="#{PersonaAnotada1.campoCodigoPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_persona']}"/>
                                                <webuijsf:message id="messageCodigoPersona1"
                                                    for="campoCodigoPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PersonaAnotada1.tableColumnNombrePersona1}"
                                                    toolTip="BundleParametros.nombre_persona.persona_anotada"
                                                    headerText="nombre persona"
                                                    id="tableColumnNombrePersona1"
                                                    sort="nombre_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombrePersona1"
                                                    text="#{currentRow.value['nombre_persona']}"
                                                    rendered="#{PersonaAnotada1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada1.labelNombrePersona1}"
                                                    id="labelNombrePersona1"
                                                    for="campoNombrePersona1"/>
                                                <webuijsf:textField id="campoNombrePersona1"
                                                    binding="#{PersonaAnotada1.campoNombrePersona1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{currentRow.value['nombre_persona']}"
                                                    toolTip="BundleParametros.nombre_persona.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada1.validatorNombrePersona1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePersona1Texto1"
                                                    binding="#{PersonaAnotada1.campoNombrePersona1Texto1}"
                                                    text="#{currentRow.value['nombre_persona']}"/>
                                                <webuijsf:message id="messageNombrePersona1"
                                                    for="campoNombrePersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PersonaAnotada1.tableColumnIdUsuario1}"
                                                    toolTip="BundleParametros.id_usuario.persona_anotada"
                                                    headerText="identificaci&#243;n usuario"
                                                    id="tableColumnIdUsuario1"
                                                    sort="id_usuario">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUsuario1"
                                                    text="#{currentRow.value['id_usuario']}"
                                                    rendered="#{PersonaAnotada1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada1.labelIdUsuario1}"
                                                    id="labelIdUsuario1"
                                                    for="campoIdUsuario1"/>
                                                <webuijsf:textField id="campoIdUsuario1"
                                                    binding="#{PersonaAnotada1.campoIdUsuario1}"
                                                    converter="#{PersonaAnotada1.converterIdUsuario1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['id_usuario']}"
                                                    toolTip="BundleParametros.id_usuario.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada1.validatorIdUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoIdUsuario1Texto1"
                                                    binding="#{PersonaAnotada1.campoIdUsuario1Texto1}"
                                                    text="#{currentRow.value['id_usuario']}"/>
                                                <webuijsf:message id="messageIdUsuario1"
                                                    for="campoIdUsuario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PersonaAnotada1.tableColumnCodigoUsuario1}"
                                                    toolTip="BundleParametros.codigo_usuario.persona_anotada"
                                                    headerText="c&#243;digo usuario"
                                                    id="tableColumnCodigoUsuario1"
                                                    sort="codigo_usuario">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoUsuario1"
                                                    text="#{currentRow.value['codigo_usuario']}"
                                                    rendered="#{PersonaAnotada1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada1.labelCodigoUsuario1}"
                                                    id="labelCodigoUsuario1"
                                                    for="campoCodigoUsuario1"/>
                                                <webuijsf:textField id="campoCodigoUsuario1"
                                                    binding="#{PersonaAnotada1.campoCodigoUsuario1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{currentRow.value['codigo_usuario']}"
                                                    toolTip="BundleParametros.codigo_usuario.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada1.validatorCodigoUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoUsuario1Texto1"
                                                    binding="#{PersonaAnotada1.campoCodigoUsuario1Texto1}"
                                                    text="#{currentRow.value['codigo_usuario']}"/>
                                                <webuijsf:message id="messageCodigoUsuario1"
                                                    for="campoCodigoUsuario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PersonaAnotada1.tableColumnNombreUsuario1}"
                                                    toolTip="BundleParametros.nombre_usuario.persona_anotada"
                                                    headerText="nombre usuario"
                                                    id="tableColumnNombreUsuario1"
                                                    sort="nombre_usuario">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreUsuario1"
                                                    text="#{currentRow.value['nombre_usuario']}"
                                                    rendered="#{PersonaAnotada1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada1.labelNombreUsuario1}"
                                                    id="labelNombreUsuario1"
                                                    for="campoNombreUsuario1"/>
                                                <webuijsf:textField id="campoNombreUsuario1"
                                                    binding="#{PersonaAnotada1.campoNombreUsuario1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{currentRow.value['nombre_usuario']}"
                                                    toolTip="BundleParametros.nombre_usuario.persona_anotada"
                                                    validatorExpression="#{PersonaAnotada1.validatorNombreUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoNombreUsuario1Texto1"
                                                    binding="#{PersonaAnotada1.campoNombreUsuario1Texto1}"
                                                    text="#{currentRow.value['nombre_usuario']}"/>
                                                <webuijsf:message id="messageNombreUsuario1"
                                                    for="campoNombreUsuario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PersonaAnotada1.tableColumnFechaHoraSeleccion1}"
                                                    toolTip="BundleParametros.fecha_hora_seleccion.persona_anotada"
                                                    headerText="fecha hora selecci&#243;n"
                                                    id="tableColumnFechaHoraSeleccion1"
                                                    sort="fecha_hora_seleccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraSeleccion1"
                                                    text="#{currentRow.value['fecha_hora_seleccion']}"
                                                    rendered="#{PersonaAnotada1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PersonaAnotada1.labelFechaHoraSeleccion1}"
                                                    id="labelFechaHoraSeleccion1"
                                                    for="campoFechaHoraSeleccion1"/>
                                                <webuijsf:textField id="campoFechaHoraSeleccion1"
                                                    binding="#{PersonaAnotada1.campoFechaHoraSeleccion1}"
                                                    converter="#{PersonaAnotada1.converterFechaHoraSeleccion1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_hora_seleccion']}"
                                                    toolTip="BundleParametros.fecha_hora_seleccion.persona_anotada"/>
                                                <webuijsf:staticText id="campoFechaHoraSeleccion1Texto1"
                                                    binding="#{PersonaAnotada1.campoFechaHoraSeleccion1Texto1}"
                                                    converter="#{PersonaAnotada1.converterFechaHoraSeleccion1}"
                                                    text="#{currentRow.value['fecha_hora_seleccion']}"/>
                                                <webuijsf:message id="messageFechaHoraSeleccion1"
                                                    for="campoFechaHoraSeleccion1"/>
                                                </webuijsf:tableColumn>
                                            </webuijsf:tableRowGroup>
                                        </webuijsf:table>
                                        <h:panelGrid 
                                            id="gridPanel104">
                                            <h:panelGrid 
                                                columns="2" 
                                                id="gridPanel105">
                                                <h:panelGrid 
                                                    id="gridPanel106">
                                                    <webuijsf:label 
                                                        binding="#{PersonaAnotada1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{PersonaAnotada1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{PersonaAnotada1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{PersonaAnotada1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{PersonaAnotada1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{PersonaAnotada1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{PersonaAnotada1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{PersonaAnotada1.botonRepaginar1_action}"
                                                        binding="#{PersonaAnotada1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{PersonaAnotada1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{PersonaAnotada1.gestor.scriptRepaginar}"
                                                        text="#{PersonaAnotada1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{PersonaAnotada1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada1.botonAgregar1_action}"
                                                    binding="#{PersonaAnotada1.botonAgregar1}"
                                                    disabled="#{PersonaAnotada1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{PersonaAnotada1.gestor.scriptAgregar}"
                                                    rendered="#{PersonaAnotada1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{PersonaAnotada1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{PersonaAnotada1.listaFuncionEdicion1}"
                                                    converter="#{PersonaAnotada1.converterListaFuncionEdicion1}"
                                                    disabled="#{PersonaAnotada1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{PersonaAnotada1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{PersonaAnotada1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{PersonaAnotada1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{PersonaAnotada1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada1.botonEditar1_action}"
                                                    binding="#{PersonaAnotada1.botonEditar1}"
                                                    disabled="#{PersonaAnotada1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{PersonaAnotada1.gestor.scriptEditar}"
                                                    rendered="#{PersonaAnotada1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{PersonaAnotada1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada1.botonEliminar1_action}"
                                                    binding="#{PersonaAnotada1.botonEliminar1}"
                                                    disabled="#{PersonaAnotada1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{PersonaAnotada1.gestor.scriptEliminar}"
                                                    rendered="#{PersonaAnotada1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{PersonaAnotada1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada1.botonAplicar1_action}"
                                                    binding="#{PersonaAnotada1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{PersonaAnotada1.gestor.scriptAplicar}"
                                                    rendered="#{PersonaAnotada1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{PersonaAnotada1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada1.botonDeshacer1_action}"
                                                    binding="#{PersonaAnotada1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{PersonaAnotada1.gestor.scriptDeshacer}"
                                                    rendered="#{PersonaAnotada1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{PersonaAnotada1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada1.botonConfirmar1_action}"
                                                    binding="#{PersonaAnotada1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{PersonaAnotada1.gestor.scriptConfirmar}"
                                                    rendered="#{PersonaAnotada1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{PersonaAnotada1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada1.botonDescartar1_action}"
                                                    binding="#{PersonaAnotada1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{PersonaAnotada1.gestor.scriptDescartar}"
                                                    rendered="#{PersonaAnotada1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{PersonaAnotada1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{PersonaAnotada1.listaFuncionAccion1}"
                                                    converter="#{PersonaAnotada1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{PersonaAnotada1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{PersonaAnotada1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{PersonaAnotada1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{PersonaAnotada1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada1.botonProcesar1_action}"
                                                    binding="#{PersonaAnotada1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{PersonaAnotada1.gestor.scriptProcesar}"
                                                    rendered="#{PersonaAnotada1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{PersonaAnotada1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada1.botonRefrescar1_action}"
                                                    binding="#{PersonaAnotada1.botonRefrescar1}"
                                                    disabled="#{PersonaAnotada1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{PersonaAnotada1.gestor.scriptRefrescar}"
                                                    rendered="#{PersonaAnotada1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{PersonaAnotada1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada1.botonReconsultar1_action}"
                                                    binding="#{PersonaAnotada1.botonReconsultar1}"
                                                    disabled="#{PersonaAnotada1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{PersonaAnotada1.gestor.scriptReconsultar}"
                                                    rendered="#{PersonaAnotada1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{PersonaAnotada1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PersonaAnotada1.botonRetornar1_action}"
                                                    binding="#{PersonaAnotada1.botonRetornar1}"
                                                    disabled="#{PersonaAnotada1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{PersonaAnotada1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{PersonaAnotada1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PersonaAnotada1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{PersonaAnotada1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{PersonaAnotada1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{PersonaAnotada1.imageHyperlink1_action}"
                                                    binding="#{PersonaAnotada1.imageHyperlink1}"
                                                    disabled="#{PersonaAnotada1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{PersonaAnotada1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{PersonaAnotada1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{PersonaAnotada1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.PersonaAnotada1_imageHyperlink1_toolTip}"/>
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
