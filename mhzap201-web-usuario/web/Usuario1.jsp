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
                    focus="#{Usuario1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Usuario1.gestor.preserveFocus}"
                    preserveScroll="#{Usuario1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Usuario1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdUsuario1 campoCodigoUsuario1 campoNombreUsuario1 campoCorreoElectronico1 campoIdUsuarioSupervisor1 listaEsSuperUsuario1 listaEsUsuarioInactivo1 listaEsUsuarioModificado1 listaEsEjecutivoNegocio1 listaEsAnalistaCredito1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Usuario1.breadcrumbs1}" 
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
                                                    rendered="#{Usuario1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Usuario1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Usuario1.gestor.mensajeDisponible}"
                                                    text="#{Usuario1.gestor.mensaje}"
                                                    url="#{Usuario1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{Usuario1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{Usuario1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{Usuario1.gestor.filaEscogida}" 
                                                sourceData="#{Usuario1.usuarioDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{Usuario1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{Usuario1.gestor.scriptElegir}" 
                                                        selected="#{Usuario1.gestor.filaElegida}" 
                                                        toolTip="#{Usuario1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{Usuario1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{Usuario1.botonEscogerFila1_action}"
                                                        binding="#{Usuario1.botonEscogerFila1}"
                                                        disabled="#{Usuario1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{Usuario1.gestor.urlImagenEscoger}" 
                                                        onClick="#{Usuario1.gestor.scriptEscoger}"
                                                        text="#{Usuario1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{Usuario1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Usuario1.botonDetallarFila1_action}"
                                                        binding="#{Usuario1.botonDetallarFila1}"
                                                        disabled="#{Usuario1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{Usuario1.gestor.urlImagenDetallar}" 
                                                        onClick="#{Usuario1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{Usuario1.gestor.detalleDisponible}" 
                                                        text="#{Usuario1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{Usuario1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Usuario1.botonProcesarFila1_action}"
                                                        binding="#{Usuario1.botonProcesarFila1}"
                                                        disabled="#{Usuario1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Usuario1.gestor.urlImagenProcesar}" 
                                                        onClick="#{Usuario1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Usuario1.asistente.comandoDisponible}" 
                                                        text="#{Usuario1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Usuario1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Usuario1.botonRetornarFila1_action}"
                                                        binding="#{Usuario1.botonRetornarFila1}" 
                                                        disabled="#{Usuario1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{Usuario1.gestor.urlImagenRetornar}"
                                                        onClick="#{Usuario1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{Usuario1.gestor.funcionReturnVisible}" 
                                                        text="#{Usuario1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{Usuario1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Usuario1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{Usuario1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{Usuario1.hipervinculoAccionFila1_action}"
                                                        binding="#{Usuario1.hipervinculoAccionFila1}"
                                                        disabled="#{Usuario1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{Usuario1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{Usuario1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.Usuario1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{Usuario1.tableColumn3}" 
                                                    headerText="#{Usuario1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Usuario1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{Usuario1.hipervinculoDetallarFila1_action}"
                                                        binding="#{Usuario1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{Usuario1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{Usuario1.gestor.identificacionFila}" 
                                                        toolTip="#{Usuario1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Usuario1.tableColumnIdUsuario1}"
                                                    headerText="id"
                                                    id="tableColumnIdUsuario1" rendered="false"
                                                    sort="id_usuario">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUsuario1"
                                                    text="#{currentRow.value['id_usuario']}"
                                                    rendered="#{Usuario1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Usuario1.labelIdUsuario1}"
                                                    id="labelIdUsuario1"
                                                    for="campoIdUsuario1"/>
                                                <webuijsf:textField id="campoIdUsuario1"
                                                    binding="#{Usuario1.campoIdUsuario1}"
                                                    converter="#{Usuario1.converterIdUsuario1}"
                                                    readOnly="#{Usuario1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_usuario']}"
                                                    toolTip="BundleParametros.id_usuario.usuario"
                                                    validatorExpression="#{Usuario1.validatorIdUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoIdUsuario1Texto1"
                                                    binding="#{Usuario1.campoIdUsuario1Texto1}"
                                                    text="#{currentRow.value['id_usuario']}"/>
                                                <webuijsf:message id="messageIdUsuario1"
                                                    for="campoIdUsuario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Usuario1.tableColumnCodigoUsuario1}"
                                                    headerText="codigo"
                                                    id="tableColumnCodigoUsuario1"
                                                    sort="codigo_usuario">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoUsuario1"
                                                    text="#{currentRow.value['codigo_usuario']}"
                                                    rendered="#{Usuario1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Usuario1.labelCodigoUsuario1}"
                                                    id="labelCodigoUsuario1"
                                                    for="campoCodigoUsuario1"/>
                                                <webuijsf:textField id="campoCodigoUsuario1"
                                                    binding="#{Usuario1.campoCodigoUsuario1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Usuario1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_usuario']}"
                                                    toolTip="BundleParametros.codigo_usuario.usuario"
                                                    validatorExpression="#{Usuario1.validatorCodigoUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoUsuario1Texto1"
                                                    binding="#{Usuario1.campoCodigoUsuario1Texto1}"
                                                    text="#{currentRow.value['codigo_usuario']}"/>
                                                <webuijsf:message id="messageCodigoUsuario1"
                                                    for="campoCodigoUsuario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Usuario1.tableColumnNombreUsuario1}"
                                                    headerText="nombre"
                                                    id="tableColumnNombreUsuario1"
                                                    sort="nombre_usuario">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreUsuario1"
                                                    text="#{currentRow.value['nombre_usuario']}"
                                                    rendered="#{Usuario1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Usuario1.labelNombreUsuario1}"
                                                    id="labelNombreUsuario1"
                                                    for="campoNombreUsuario1"/>
                                                <webuijsf:textField id="campoNombreUsuario1"
                                                    binding="#{Usuario1.campoNombreUsuario1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Usuario1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_usuario']}"
                                                    toolTip="BundleParametros.nombre_usuario.usuario"
                                                    validatorExpression="#{Usuario1.validatorNombreUsuario1.validate}"/>
                                                <webuijsf:staticText id="campoNombreUsuario1Texto1"
                                                    binding="#{Usuario1.campoNombreUsuario1Texto1}"
                                                    text="#{currentRow.value['nombre_usuario']}"/>
                                                <webuijsf:message id="messageNombreUsuario1"
                                                    for="campoNombreUsuario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Usuario1.tableColumnCorreoElectronico1}"
                                                    headerText="correo electronico"
                                                    id="tableColumnCorreoElectronico1" rendered="false"
                                                    sort="correo_electronico">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCorreoElectronico1"
                                                    text="#{currentRow.value['correo_electronico']}"
                                                    rendered="#{Usuario1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Usuario1.labelCorreoElectronico1}"
                                                    id="labelCorreoElectronico1"
                                                    for="campoCorreoElectronico1"/>
                                                <webuijsf:textField id="campoCorreoElectronico1"
                                                    binding="#{Usuario1.campoCorreoElectronico1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Usuario1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['correo_electronico']}"
                                                    toolTip="BundleParametros.correo_electronico.usuario"
                                                    validatorExpression="#{Usuario1.validatorCorreoElectronico1.validate}"/>
                                                <webuijsf:staticText id="campoCorreoElectronico1Texto1"
                                                    binding="#{Usuario1.campoCorreoElectronico1Texto1}"
                                                    text="#{currentRow.value['correo_electronico']}"/>
                                                <webuijsf:message id="messageCorreoElectronico1"
                                                    for="campoCorreoElectronico1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Usuario1.tableColumnIdUsuarioSupervisor1}"
                                                    headerText="usuario supervisor"
                                                    id="tableColumnIdUsuarioSupervisor1" rendered="false"
                                                    sort="codigo_usuario_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUsuarioSupervisor1"
                                                    text="#{currentRow.value['codigo_usuario_1x1y3']}"
                                                    rendered="#{Usuario1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Usuario1.labelIdUsuarioSupervisor1}"
                                                    id="labelIdUsuarioSupervisor1"
                                                    for="campoIdUsuarioSupervisor1"/>
                                                <webuijsf:textField id="campoIdUsuarioSupervisor1"
                                                    binding="#{Usuario1.campoIdUsuarioSupervisor1}"
                                                    readOnly="true"
                                                    text="#{Usuario1.asistente.textoCampoIdUsuarioSupervisor1}"
                                                    toolTip="#{Usuario1.asistente.toolTipCampoIdUsuarioSupervisor1}"
                                                    validatorExpression="#{Usuario1.campoIdUsuarioSupervisor1_validate}"/>
                                                <webuijsf:staticText id="campoIdUsuarioSupervisor1Texto1"
                                                    binding="#{Usuario1.campoIdUsuarioSupervisor1Texto1}"
                                                    text="#{currentRow.value['codigo_usuario_1x1y3']}"/>
                                                <webuijsf:message id="messageIdUsuarioSupervisor1"
                                                    for="campoIdUsuarioSupervisor1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdUsuarioSupervisor3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUsuarioSupervisor3"
                                                    text="#{currentRow.value['id_usuario_supervisor']}"
                                                    rendered="#{Usuario1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{Usuario1.campoIdUsuarioSupervisor1Boton1}"
                                                    id="campoIdUsuarioSupervisor1Boton1"
                                                    onClick="#{Usuario1.asistente.scriptCampoIdUsuarioSupervisor1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{Usuario1.campoIdUsuarioSupervisor1Boton3}"
                                                    id="campoIdUsuarioSupervisor1Boton3"
                                                    onClick="#{Usuario1.asistente.scriptCampoIdUsuarioSupervisor1Boton2}"
                                                    rendered="#{Usuario1.asistente.campoIdUsuarioSupervisor1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{Usuario1.tableColumnIdUsuarioSupervisor2}"
                                                    headerText="nombre usuario supervisor"
                                                    id="tableColumnIdUsuarioSupervisor2" rendered="false"
                                                    sort="nombre_usuario_1x1y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdUsuarioSupervisor2"
                                                    text="#{currentRow.value['nombre_usuario_1x1y4']}"
                                                    rendered="#{Usuario1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Usuario1.labelIdUsuarioSupervisor2}"
                                                    id="labelIdUsuarioSupervisor2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{Usuario1.campoIdUsuarioSupervisor1Hiper1}"
                                                    id="campoIdUsuarioSupervisor1Hiper1"
                                                    text="#{currentRow.value['nombre_usuario_1x1y4']}"
                                                    onClick="#{Usuario1.asistente.scriptCampoIdUsuarioSupervisor1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdUsuarioSupervisor1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Usuario1.tableColumnEsSuperUsuario1}"
                                                    headerText="super"
                                                    id="tableColumnEsSuperUsuario1"
                                                    sort="es_super_usuario">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsSuperUsuario1"
                                                    text="#{currentRow.value['es_super_usuario']}"
                                                    rendered="#{Usuario1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Usuario1.labelEsSuperUsuario1}"
                                                    id="labelEsSuperUsuario1"
                                                    for="listaEsSuperUsuario1"/>
                                                <webuijsf:dropDown id="listaEsSuperUsuario1"
                                                    binding="#{Usuario1.listaEsSuperUsuario1}"
                                                    converter="#{Usuario1.converterEsSuperUsuario1}"
                                                    disabled="true"
                                                    items="#{Usuario1.asistente.opcionesListaEsSuperUsuario1}"
                                                    selected="#{currentRow.value['es_super_usuario']}"
                                                    toolTip="BundleParametros.es_super_usuario.usuario"/>
                                                <webuijsf:staticText id="listaEsSuperUsuario1Texto1"
                                                    binding="#{Usuario1.listaEsSuperUsuario1Texto1}"/>
                                                <webuijsf:message id="messageEsSuperUsuario1"
                                                    for="listaEsSuperUsuario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Usuario1.tableColumnEsUsuarioInactivo1}"
                                                    headerText="inactivo"
                                                    id="tableColumnEsUsuarioInactivo1"
                                                    sort="es_usuario_inactivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsUsuarioInactivo1"
                                                    text="#{currentRow.value['es_usuario_inactivo']}"
                                                    rendered="#{Usuario1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Usuario1.labelEsUsuarioInactivo1}"
                                                    id="labelEsUsuarioInactivo1"
                                                    for="listaEsUsuarioInactivo1"/>
                                                <webuijsf:dropDown id="listaEsUsuarioInactivo1"
                                                    binding="#{Usuario1.listaEsUsuarioInactivo1}"
                                                    converter="#{Usuario1.converterEsUsuarioInactivo1}"
                                                    disabled="true"
                                                    items="#{Usuario1.asistente.opcionesListaEsUsuarioInactivo1}"
                                                    selected="#{currentRow.value['es_usuario_inactivo']}"
                                                    toolTip="BundleParametros.es_usuario_inactivo.usuario"/>
                                                <webuijsf:staticText id="listaEsUsuarioInactivo1Texto1"
                                                    binding="#{Usuario1.listaEsUsuarioInactivo1Texto1}"/>
                                                <webuijsf:message id="messageEsUsuarioInactivo1"
                                                    for="listaEsUsuarioInactivo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Usuario1.tableColumnEsUsuarioModificado1}"
                                                    headerText="modificado"
                                                    id="tableColumnEsUsuarioModificado1"
                                                    sort="es_usuario_modificado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsUsuarioModificado1"
                                                    text="#{currentRow.value['es_usuario_modificado']}"
                                                    rendered="#{Usuario1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Usuario1.labelEsUsuarioModificado1}"
                                                    id="labelEsUsuarioModificado1"
                                                    for="listaEsUsuarioModificado1"/>
                                                <webuijsf:dropDown id="listaEsUsuarioModificado1"
                                                    binding="#{Usuario1.listaEsUsuarioModificado1}"
                                                    converter="#{Usuario1.converterEsUsuarioModificado1}"
                                                    disabled="true"
                                                    items="#{Usuario1.asistente.opcionesListaEsUsuarioModificado1}"
                                                    selected="#{currentRow.value['es_usuario_modificado']}"
                                                    toolTip="BundleParametros.es_usuario_modificado.usuario"/>
                                                <webuijsf:staticText id="listaEsUsuarioModificado1Texto1"
                                                    binding="#{Usuario1.listaEsUsuarioModificado1Texto1}"/>
                                                <webuijsf:message id="messageEsUsuarioModificado1"
                                                    for="listaEsUsuarioModificado1"/>
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
                                                        binding="#{Usuario1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{Usuario1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{Usuario1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{Usuario1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{Usuario1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{Usuario1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{Usuario1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Usuario1.botonRepaginar1_action}"
                                                        binding="#{Usuario1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{Usuario1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{Usuario1.gestor.scriptRepaginar}"
                                                        text="#{Usuario1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{Usuario1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{Usuario1.botonAgregar1_action}"
                                                    binding="#{Usuario1.botonAgregar1}"
                                                    disabled="#{Usuario1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Usuario1.gestor.scriptAgregar}"
                                                    rendered="#{Usuario1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Usuario1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Usuario1.listaFuncionEdicion1}"
                                                    converter="#{Usuario1.converterListaFuncionEdicion1}"
                                                    disabled="#{Usuario1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Usuario1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Usuario1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Usuario1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Usuario1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario1.botonEditar1_action}"
                                                    binding="#{Usuario1.botonEditar1}"
                                                    disabled="#{Usuario1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Usuario1.gestor.scriptEditar}"
                                                    rendered="#{Usuario1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Usuario1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario1.botonEliminar1_action}"
                                                    binding="#{Usuario1.botonEliminar1}"
                                                    disabled="#{Usuario1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Usuario1.gestor.scriptEliminar}"
                                                    rendered="#{Usuario1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Usuario1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario1.botonAplicar1_action}"
                                                    binding="#{Usuario1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Usuario1.gestor.scriptAplicar}"
                                                    rendered="#{Usuario1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Usuario1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario1.botonDeshacer1_action}"
                                                    binding="#{Usuario1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Usuario1.gestor.scriptDeshacer}"
                                                    rendered="#{Usuario1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Usuario1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario1.botonConfirmar1_action}"
                                                    binding="#{Usuario1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Usuario1.gestor.scriptConfirmar}"
                                                    rendered="#{Usuario1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Usuario1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario1.botonDescartar1_action}"
                                                    binding="#{Usuario1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Usuario1.gestor.scriptDescartar}"
                                                    rendered="#{Usuario1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Usuario1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Usuario1.listaFuncionAccion1}"
                                                    converter="#{Usuario1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Usuario1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Usuario1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Usuario1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Usuario1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario1.botonProcesar1_action}"
                                                    binding="#{Usuario1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Usuario1.gestor.scriptProcesar}"
                                                    rendered="#{Usuario1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Usuario1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario1.botonRefrescar1_action}"
                                                    binding="#{Usuario1.botonRefrescar1}"
                                                    disabled="#{Usuario1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Usuario1.gestor.scriptRefrescar}"
                                                    rendered="#{Usuario1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Usuario1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario1.botonReconsultar1_action}"
                                                    binding="#{Usuario1.botonReconsultar1}"
                                                    disabled="#{Usuario1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Usuario1.gestor.scriptReconsultar}"
                                                    rendered="#{Usuario1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Usuario1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Usuario1.botonRetornar1_action}"
                                                    binding="#{Usuario1.botonRetornar1}"
                                                    disabled="#{Usuario1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Usuario1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Usuario1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Usuario1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Usuario1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="2" 
                                                id="gridPanel109"
                                                rendered="#{Usuario1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Usuario1.imageHyperlink1_action}"
                                                    binding="#{Usuario1.imageHyperlink1}"
                                                    disabled="#{Usuario1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Usuario1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Usuario1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Usuario1_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Usuario1.imageHyperlink2_action}"
                                                    binding="#{Usuario1.imageHyperlink2}"
                                                    disabled="#{Usuario1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{Usuario1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Usuario1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Usuario1.gestor.designing}"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.Usuario1_imageHyperlink2_toolTip}"/>
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
