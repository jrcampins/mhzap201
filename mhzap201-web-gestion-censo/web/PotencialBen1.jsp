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
                    focus="#{PotencialBen1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{PotencialBen1.gestor.preserveFocus}"
                    preserveScroll="#{PotencialBen1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{PotencialBen1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdPotencialBen1 campoCodigoPotencialBen1 campoNombrePotencialBen1 listaNumeroTipoRegPotBen1 campoIdPersona1 campoNumeroCedula1 campoLetraCedula1 campoFechaExpedicionCedula1 campoFechaVencimientoCedula1 campoPrimerNombre1 campoSegundoNombre1 campoPrimerApellido1 campoSegundoApellido1 campoApellidoCasada1 campoApodo1 campoFechaNacimiento1 campoEdad1 listaEsParaguayoNatural1 listaEsIndigena1 campoIdEtniaIndigena1 campoNombreComunidadIndigena1 campoIdDepartamento1 campoIdDistrito1 listaNumeroTipoArea1 campoIdBarrio1 campoManzana1 campoCompania1 campoDireccion1 campoNombreResponsableHogar1 campoNumeroTelefonoRespHogar1 listaEsPersonaConJubilacion1 listaEsPersonaConPension1 listaEsPersonaConSubsidio1 campoNombreReferente1 campoNumeroTelefonoReferente1 listaNumeroCondicionCenso1 campoFechaValidacionCenso1 campoIdFuncionarioValidacionCen1 listaNumeroCausaInvCenso1 campoOtraCausaInvCenso1 campoComentariosValidacionCenso1 campoIdFichaPersona1 listaNumeroCondicionReclCen1 campoFechaReclamoCenso1 campoComentariosReclamoCenso1 campoFechaAprobacionReclamoCenso1 campoComentariosAprReclCen1 campoFechaDenegacionReclamoCenso1 listaNumeroCausaDenReclCen1 campoOtraCausaDenReclCen1 campoComentariosDenReclCen1 campoFechaRegistroPotBen1 campoIdFuncionarioRegPotBen1 listaEsPotencialBenInactivo1 campoFechaUltimaVisitaCenso1 campoObservacionesUltVisitaCen1 campoIdFuncionarioUltVisitaCen1 campoReferenciaDireccion1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{PotencialBen1.breadcrumbs1}" 
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
                                                    rendered="#{PotencialBen1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{PotencialBen1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{PotencialBen1.gestor.mensajeDisponible}"
                                                    text="#{PotencialBen1.gestor.mensaje}"
                                                    url="#{PotencialBen1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{PotencialBen1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{PotencialBen1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{PotencialBen1.gestor.filaEscogida}" 
                                                sourceData="#{PotencialBen1.potencialBenDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{PotencialBen1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{PotencialBen1.gestor.scriptElegir}" 
                                                        selected="#{PotencialBen1.gestor.filaElegida}" 
                                                        toolTip="#{PotencialBen1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{PotencialBen1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{PotencialBen1.botonEscogerFila1_action}"
                                                        binding="#{PotencialBen1.botonEscogerFila1}"
                                                        disabled="#{PotencialBen1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{PotencialBen1.gestor.urlImagenEscoger}" 
                                                        onClick="#{PotencialBen1.gestor.scriptEscoger}"
                                                        text="#{PotencialBen1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{PotencialBen1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{PotencialBen1.botonDetallarFila1_action}"
                                                        binding="#{PotencialBen1.botonDetallarFila1}"
                                                        disabled="#{PotencialBen1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{PotencialBen1.gestor.urlImagenDetallar}" 
                                                        onClick="#{PotencialBen1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{PotencialBen1.gestor.detalleDisponible}" 
                                                        text="#{PotencialBen1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{PotencialBen1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{PotencialBen1.botonProcesarFila1_action}"
                                                        binding="#{PotencialBen1.botonProcesarFila1}"
                                                        disabled="#{PotencialBen1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{PotencialBen1.gestor.urlImagenProcesar}" 
                                                        onClick="#{PotencialBen1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{PotencialBen1.asistente.comandoDisponible}" 
                                                        text="#{PotencialBen1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{PotencialBen1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{PotencialBen1.botonRetornarFila1_action}"
                                                        binding="#{PotencialBen1.botonRetornarFila1}" 
                                                        disabled="#{PotencialBen1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{PotencialBen1.gestor.urlImagenRetornar}"
                                                        onClick="#{PotencialBen1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{PotencialBen1.gestor.funcionReturnVisible}" 
                                                        text="#{PotencialBen1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{PotencialBen1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{PotencialBen1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{PotencialBen1.hipervinculoAccionFila1_action}"
                                                        binding="#{PotencialBen1.hipervinculoAccionFila1}"
                                                        disabled="#{PotencialBen1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{PotencialBen1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{PotencialBen1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.PotencialBen1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{PotencialBen1.tableColumn3}" 
                                                    headerText="#{PotencialBen1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{PotencialBen1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{PotencialBen1.hipervinculoDetallarFila1_action}"
                                                        binding="#{PotencialBen1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{PotencialBen1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{PotencialBen1.gestor.identificacionFila}" 
                                                        toolTip="#{PotencialBen1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnIdPotencialBen1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdPotencialBen1" rendered="false"
                                                    sort="id_potencial_ben">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPotencialBen1"
                                                    text="#{currentRow.value['id_potencial_ben']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdPotencialBen1}"
                                                    id="labelIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                <webuijsf:textField id="campoIdPotencialBen1"
                                                    binding="#{PotencialBen1.campoIdPotencialBen1}"
                                                    converter="#{PotencialBen1.converterIdPotencialBen1}"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_potencial_ben']}"
                                                    toolTip="BundleParametros.id_potencial_ben.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorIdPotencialBen1.validate}"/>
                                                <webuijsf:staticText id="campoIdPotencialBen1Texto1"
                                                    binding="#{PotencialBen1.campoIdPotencialBen1Texto1}"
                                                    text="#{currentRow.value['id_potencial_ben']}"/>
                                                <webuijsf:message id="messageIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnCodigoPotencialBen1}"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoPotencialBen1"
                                                    sort="codigo_potencial_ben">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoPotencialBen1"
                                                    text="#{currentRow.value['codigo_potencial_ben']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelCodigoPotencialBen1}"
                                                    id="labelCodigoPotencialBen1"
                                                    for="campoCodigoPotencialBen1"/>
                                                <webuijsf:textField id="campoCodigoPotencialBen1"
                                                    binding="#{PotencialBen1.campoCodigoPotencialBen1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{currentRow.value['codigo_potencial_ben']}"
                                                    toolTip="BundleParametros.codigo_potencial_ben.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorCodigoPotencialBen1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPotencialBen1Texto1"
                                                    binding="#{PotencialBen1.campoCodigoPotencialBen1Texto1}"
                                                    text="#{currentRow.value['codigo_potencial_ben']}"/>
                                                <webuijsf:message id="messageCodigoPotencialBen1"
                                                    for="campoCodigoPotencialBen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnNombrePotencialBen1}"
                                                    headerText="nombre"
                                                    id="tableColumnNombrePotencialBen1"
                                                    sort="nombre_potencial_ben">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombrePotencialBen1"
                                                    text="#{currentRow.value['nombre_potencial_ben']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelNombrePotencialBen1}"
                                                    id="labelNombrePotencialBen1"
                                                    for="campoNombrePotencialBen1"/>
                                                <webuijsf:textField id="campoNombrePotencialBen1"
                                                    binding="#{PotencialBen1.campoNombrePotencialBen1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{currentRow.value['nombre_potencial_ben']}"
                                                    toolTip="BundleParametros.nombre_potencial_ben.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorNombrePotencialBen1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePotencialBen1Texto1"
                                                    binding="#{PotencialBen1.campoNombrePotencialBen1Texto1}"
                                                    text="#{currentRow.value['nombre_potencial_ben']}"/>
                                                <webuijsf:message id="messageNombrePotencialBen1"
                                                    for="campoNombrePotencialBen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnNumeroTipoRegPotBen1}"
                                                    headerText="tipo registro"
                                                    id="tableColumnNumeroTipoRegPotBen1"
                                                    sort="codigo_tipo_reg_pot_ben_1x1y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoRegPotBen1"
                                                    text="#{currentRow.value['codigo_tipo_reg_pot_ben_1x1y2']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelNumeroTipoRegPotBen1}"
                                                    id="labelNumeroTipoRegPotBen1"
                                                    for="listaNumeroTipoRegPotBen1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoRegPotBen1"
                                                    binding="#{PotencialBen1.listaNumeroTipoRegPotBen1}"
                                                    converter="#{PotencialBen1.converterNumeroTipoRegPotBen1}"
                                                    disabled="#{PotencialBen1.gestor.filaNoCreada}" required="true"
                                                    items="#{PotencialBen1.asistente.opcionesListaNumeroTipoRegPotBen1}"
                                                    onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'listaNumeroTipoRegPotBen1');"
                                                    selected="#{currentRow.value['numero_tipo_reg_pot_ben']}"
                                                    toolTip="BundleParametros.numero_tipo_reg_pot_ben.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroTipoRegPotBen1Texto1"
                                                    binding="#{PotencialBen1.listaNumeroTipoRegPotBen1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_reg_pot_ben_1x1y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoRegPotBen1"
                                                    for="listaNumeroTipoRegPotBen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnIdPersona1}"
                                                    headerText="persona"
                                                    id="tableColumnIdPersona1" rendered="false"
                                                    sort="codigo_persona_1x2y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona1"
                                                    text="#{currentRow.value['codigo_persona_1x2y3']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{PotencialBen1.campoIdPersona1}"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}" required="true"
                                                    text="#{PotencialBen1.asistente.textoCampoIdPersona1}"
                                                    toolTip="#{PotencialBen1.asistente.toolTipCampoIdPersona1}"
                                                    validatorExpression="#{PotencialBen1.campoIdPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{PotencialBen1.campoIdPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_persona_1x2y3']}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdPersona3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona3"
                                                    text="#{currentRow.value['id_persona']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdPersona1Boton1}"
                                                    id="campoIdPersona1Boton1"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdPersona1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdPersona1Boton3}"
                                                    id="campoIdPersona1Boton3"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdPersona1Boton2}"
                                                    rendered="#{PotencialBen1.asistente.campoIdPersona1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{PotencialBen1.tableColumnIdPersona2}"
                                                    headerText="nombre persona"
                                                    id="tableColumnIdPersona2" rendered="false"
                                                    sort="nombre_persona_1x2y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona2"
                                                    text="#{currentRow.value['nombre_persona_1x2y4']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdPersona2}"
                                                    id="labelIdPersona2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{PotencialBen1.campoIdPersona1Hiper1}"
                                                    id="campoIdPersona1Hiper1"
                                                    text="#{currentRow.value['nombre_persona_1x2y4']}"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdPersona1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdPersona1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnNumeroCedula1}"
                                                    headerText="n&#250;mero c&#233;dula"
                                                    id="tableColumnNumeroCedula1" rendered="false"
                                                    sort="numero_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCedula1"
                                                    text="#{currentRow.value['numero_cedula']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelNumeroCedula1}"
                                                    id="labelNumeroCedula1"
                                                    for="campoNumeroCedula1"/>
                                                <webuijsf:textField id="campoNumeroCedula1"
                                                    binding="#{PotencialBen1.campoNumeroCedula1}"
                                                    converter="#{PotencialBen1.converterNumeroCedula1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['numero_cedula']}"
                                                    toolTip="BundleParametros.numero_cedula.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorNumeroCedula1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedula1Texto1"
                                                    binding="#{PotencialBen1.campoNumeroCedula1Texto1}"
                                                    text="#{currentRow.value['numero_cedula']}"/>
                                                <webuijsf:message id="messageNumeroCedula1"
                                                    for="campoNumeroCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnLetraCedula1}"
                                                    headerText="letra c&#233;dula"
                                                    id="tableColumnLetraCedula1" rendered="false"
                                                    sort="letra_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextLetraCedula1"
                                                    text="#{currentRow.value['letra_cedula']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelLetraCedula1}"
                                                    id="labelLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                <webuijsf:textField id="campoLetraCedula1"
                                                    binding="#{PotencialBen1.campoLetraCedula1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="true"
                                                    text="#{currentRow.value['letra_cedula']}"
                                                    toolTip="BundleParametros.letra_cedula.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorLetraCedula1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedula1Texto1"
                                                    binding="#{PotencialBen1.campoLetraCedula1Texto1}"
                                                    text="#{currentRow.value['letra_cedula']}"/>
                                                <webuijsf:message id="messageLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnFechaExpedicionCedula1}"
                                                    headerText="fecha expedici&#243;n c&#233;dula"
                                                    id="tableColumnFechaExpedicionCedula1" rendered="false"
                                                    sort="fecha_expedicion_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaExpedicionCedula1"
                                                    text="#{currentRow.value['fecha_expedicion_cedula']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelFechaExpedicionCedula1}"
                                                    id="labelFechaExpedicionCedula1"
                                                    for="campoFechaExpedicionCedula1"/>
                                                <webuijsf:textField id="campoFechaExpedicionCedula1"
                                                    binding="#{PotencialBen1.campoFechaExpedicionCedula1}"
                                                    converter="#{PotencialBen1.converterFechaExpedicionCedula1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_expedicion_cedula']}"
                                                    toolTip="BundleParametros.fecha_expedicion_cedula.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaExpedicionCedula1Texto1"
                                                    binding="#{PotencialBen1.campoFechaExpedicionCedula1Texto1}"
                                                    converter="#{PotencialBen1.converterFechaExpedicionCedula1}"
                                                    text="#{currentRow.value['fecha_expedicion_cedula']}"/>
                                                <webuijsf:message id="messageFechaExpedicionCedula1"
                                                    for="campoFechaExpedicionCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnFechaVencimientoCedula1}"
                                                    headerText="fecha vencimiento c&#233;dula"
                                                    id="tableColumnFechaVencimientoCedula1" rendered="false"
                                                    sort="fecha_vencimiento_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaVencimientoCedula1"
                                                    text="#{currentRow.value['fecha_vencimiento_cedula']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelFechaVencimientoCedula1}"
                                                    id="labelFechaVencimientoCedula1"
                                                    for="campoFechaVencimientoCedula1"/>
                                                <webuijsf:textField id="campoFechaVencimientoCedula1"
                                                    binding="#{PotencialBen1.campoFechaVencimientoCedula1}"
                                                    converter="#{PotencialBen1.converterFechaVencimientoCedula1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_vencimiento_cedula']}"
                                                    toolTip="BundleParametros.fecha_vencimiento_cedula.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaVencimientoCedula1Texto1"
                                                    binding="#{PotencialBen1.campoFechaVencimientoCedula1Texto1}"
                                                    converter="#{PotencialBen1.converterFechaVencimientoCedula1}"
                                                    text="#{currentRow.value['fecha_vencimiento_cedula']}"/>
                                                <webuijsf:message id="messageFechaVencimientoCedula1"
                                                    for="campoFechaVencimientoCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnPrimerNombre1}"
                                                    headerText="primer nombre"
                                                    id="tableColumnPrimerNombre1" rendered="false"
                                                    sort="primer_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerNombre1"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelPrimerNombre1}"
                                                    id="labelPrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                <webuijsf:textField id="campoPrimerNombre1"
                                                    binding="#{PotencialBen1.campoPrimerNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1Texto1"
                                                    binding="#{PotencialBen1.campoPrimerNombre1Texto1}"
                                                    text="#{currentRow.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnSegundoNombre1}"
                                                    headerText="segundo nombre"
                                                    id="tableColumnSegundoNombre1" rendered="false"
                                                    sort="segundo_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoNombre1"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelSegundoNombre1}"
                                                    id="labelSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                <webuijsf:textField id="campoSegundoNombre1"
                                                    binding="#{PotencialBen1.campoSegundoNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1Texto1"
                                                    binding="#{PotencialBen1.campoSegundoNombre1Texto1}"
                                                    text="#{currentRow.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnPrimerApellido1}"
                                                    headerText="primer apellido"
                                                    id="tableColumnPrimerApellido1" rendered="false"
                                                    sort="primer_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerApellido1"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelPrimerApellido1}"
                                                    id="labelPrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                <webuijsf:textField id="campoPrimerApellido1"
                                                    binding="#{PotencialBen1.campoPrimerApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1Texto1"
                                                    binding="#{PotencialBen1.campoPrimerApellido1Texto1}"
                                                    text="#{currentRow.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnSegundoApellido1}"
                                                    headerText="segundo apellido"
                                                    id="tableColumnSegundoApellido1" rendered="false"
                                                    sort="segundo_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoApellido1"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelSegundoApellido1}"
                                                    id="labelSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                <webuijsf:textField id="campoSegundoApellido1"
                                                    binding="#{PotencialBen1.campoSegundoApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1Texto1"
                                                    binding="#{PotencialBen1.campoSegundoApellido1Texto1}"
                                                    text="#{currentRow.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnApellidoCasada1}"
                                                    headerText="apellido casada"
                                                    id="tableColumnApellidoCasada1" rendered="false"
                                                    sort="apellido_casada">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextApellidoCasada1"
                                                    text="#{currentRow.value['apellido_casada']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelApellidoCasada1}"
                                                    id="labelApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                <webuijsf:textField id="campoApellidoCasada1"
                                                    binding="#{PotencialBen1.campoApellidoCasada1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['apellido_casada']}"
                                                    toolTip="BundleParametros.apellido_casada.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorApellidoCasada1.validate}"/>
                                                <webuijsf:staticText id="campoApellidoCasada1Texto1"
                                                    binding="#{PotencialBen1.campoApellidoCasada1Texto1}"
                                                    text="#{currentRow.value['apellido_casada']}"/>
                                                <webuijsf:message id="messageApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnApodo1}"
                                                    headerText="apodo"
                                                    id="tableColumnApodo1" rendered="false"
                                                    sort="apodo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextApodo1"
                                                    text="#{currentRow.value['apodo']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelApodo1}"
                                                    id="labelApodo1"
                                                    for="campoApodo1"/>
                                                <webuijsf:textField id="campoApodo1"
                                                    binding="#{PotencialBen1.campoApodo1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['apodo']}"
                                                    toolTip="BundleParametros.apodo.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorApodo1.validate}"/>
                                                <webuijsf:staticText id="campoApodo1Texto1"
                                                    binding="#{PotencialBen1.campoApodo1Texto1}"
                                                    text="#{currentRow.value['apodo']}"/>
                                                <webuijsf:message id="messageApodo1"
                                                    for="campoApodo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnFechaNacimiento1}"
                                                    headerText="fecha nacimiento"
                                                    id="tableColumnFechaNacimiento1" rendered="false"
                                                    sort="fecha_nacimiento">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaNacimiento1"
                                                    text="#{currentRow.value['fecha_nacimiento']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelFechaNacimiento1}"
                                                    id="labelFechaNacimiento1"
                                                    for="campoFechaNacimiento1"/>
                                                <webuijsf:textField id="campoFechaNacimiento1"
                                                    binding="#{PotencialBen1.campoFechaNacimiento1}"
                                                    converter="#{PotencialBen1.converterFechaNacimiento1}"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_nacimiento']}"
                                                    toolTip="BundleParametros.fecha_nacimiento.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaNacimiento1Texto1"
                                                    binding="#{PotencialBen1.campoFechaNacimiento1Texto1}"
                                                    converter="#{PotencialBen1.converterFechaNacimiento1}"
                                                    text="#{currentRow.value['fecha_nacimiento']}"/>
                                                <webuijsf:message id="messageFechaNacimiento1"
                                                    for="campoFechaNacimiento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnEdad1}"
                                                    headerText="edad"
                                                    id="tableColumnEdad1" rendered="false"
                                                    sort="edad">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEdad1"
                                                    text="#{currentRow.value['edad']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelEdad1}"
                                                    id="labelEdad1"
                                                    for="campoEdad1"/>
                                                <webuijsf:textField id="campoEdad1"
                                                    binding="#{PotencialBen1.campoEdad1}"
                                                    converter="#{PotencialBen1.converterEdad1}"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['edad']}"
                                                    toolTip="BundleParametros.edad.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorEdad1.validate}"/>
                                                <webuijsf:staticText id="campoEdad1Texto1"
                                                    binding="#{PotencialBen1.campoEdad1Texto1}"
                                                    text="#{currentRow.value['edad']}"/>
                                                <webuijsf:message id="messageEdad1"
                                                    for="campoEdad1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnEsParaguayoNatural1}"
                                                    headerText="paraguayo natural"
                                                    id="tableColumnEsParaguayoNatural1" rendered="false"
                                                    sort="es_paraguayo_natural">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsParaguayoNatural1"
                                                    text="#{currentRow.value['es_paraguayo_natural']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelEsParaguayoNatural1}"
                                                    id="labelEsParaguayoNatural1"
                                                    for="listaEsParaguayoNatural1"/>
                                                <webuijsf:dropDown id="listaEsParaguayoNatural1"
                                                    binding="#{PotencialBen1.listaEsParaguayoNatural1}"
                                                    converter="#{PotencialBen1.converterEsParaguayoNatural1}"
                                                    disabled="#{PotencialBen1.gestor.filaNoProcesada}" required="true"
                                                    items="#{PotencialBen1.asistente.opcionesListaEsParaguayoNatural1}"
                                                    selected="#{currentRow.value['es_paraguayo_natural']}"
                                                    toolTip="BundleParametros.es_paraguayo_natural.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsParaguayoNatural1Texto1"
                                                    binding="#{PotencialBen1.listaEsParaguayoNatural1Texto1}"/>
                                                <webuijsf:message id="messageEsParaguayoNatural1"
                                                    for="listaEsParaguayoNatural1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnEsIndigena1}"
                                                    headerText="indigena"
                                                    id="tableColumnEsIndigena1" rendered="false"
                                                    sort="es_indigena">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsIndigena1"
                                                    text="#{currentRow.value['es_indigena']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelEsIndigena1}"
                                                    id="labelEsIndigena1"
                                                    for="listaEsIndigena1"/>
                                                <webuijsf:dropDown id="listaEsIndigena1"
                                                    binding="#{PotencialBen1.listaEsIndigena1}"
                                                    converter="#{PotencialBen1.converterEsIndigena1}"
                                                    disabled="#{PotencialBen1.gestor.filaNoProcesada}" required="true"
                                                    items="#{PotencialBen1.asistente.opcionesListaEsIndigena1}"
                                                    selected="#{currentRow.value['es_indigena']}"
                                                    toolTip="BundleParametros.es_indigena.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsIndigena1Texto1"
                                                    binding="#{PotencialBen1.listaEsIndigena1Texto1}"/>
                                                <webuijsf:message id="messageEsIndigena1"
                                                    for="listaEsIndigena1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnIdEtniaIndigena1}"
                                                    headerText="etnia indigena"
                                                    id="tableColumnIdEtniaIndigena1" rendered="false"
                                                    sort="codigo_etnia_indigena_1x3y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdEtniaIndigena1"
                                                    text="#{currentRow.value['codigo_etnia_indigena_1x3y3']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdEtniaIndigena1}"
                                                    id="labelIdEtniaIndigena1"
                                                    for="campoIdEtniaIndigena1"/>
                                                <webuijsf:textField id="campoIdEtniaIndigena1"
                                                    binding="#{PotencialBen1.campoIdEtniaIndigena1}"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen1.asistente.textoCampoIdEtniaIndigena1}"
                                                    toolTip="#{PotencialBen1.asistente.toolTipCampoIdEtniaIndigena1}"
                                                    validatorExpression="#{PotencialBen1.campoIdEtniaIndigena1_validate}"/>
                                                <webuijsf:staticText id="campoIdEtniaIndigena1Texto1"
                                                    binding="#{PotencialBen1.campoIdEtniaIndigena1Texto1}"
                                                    text="#{currentRow.value['codigo_etnia_indigena_1x3y3']}"/>
                                                <webuijsf:message id="messageIdEtniaIndigena1"
                                                    for="campoIdEtniaIndigena1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdEtniaIndigena3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdEtniaIndigena3"
                                                    text="#{currentRow.value['id_etnia_indigena']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdEtniaIndigena1Boton1}"
                                                    id="campoIdEtniaIndigena1Boton1"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdEtniaIndigena1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdEtniaIndigena1Boton3}"
                                                    id="campoIdEtniaIndigena1Boton3"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdEtniaIndigena1Boton2}"
                                                    rendered="#{PotencialBen1.asistente.campoIdEtniaIndigena1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{PotencialBen1.tableColumnIdEtniaIndigena2}"
                                                    headerText="nombre etnia indigena"
                                                    id="tableColumnIdEtniaIndigena2" rendered="false"
                                                    sort="nombre_etnia_indigena_1x3y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdEtniaIndigena2"
                                                    text="#{currentRow.value['nombre_etnia_indigena_1x3y4']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdEtniaIndigena2}"
                                                    id="labelIdEtniaIndigena2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{PotencialBen1.campoIdEtniaIndigena1Hiper1}"
                                                    id="campoIdEtniaIndigena1Hiper1"
                                                    text="#{currentRow.value['nombre_etnia_indigena_1x3y4']}"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdEtniaIndigena1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdEtniaIndigena1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnNombreComunidadIndigena1}"
                                                    headerText="nombre comunidad indigena"
                                                    id="tableColumnNombreComunidadIndigena1" rendered="false"
                                                    sort="nombre_comunidad_indigena">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreComunidadIndigena1"
                                                    text="#{currentRow.value['nombre_comunidad_indigena']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelNombreComunidadIndigena1}"
                                                    id="labelNombreComunidadIndigena1"
                                                    for="campoNombreComunidadIndigena1"/>
                                                <webuijsf:textField id="campoNombreComunidadIndigena1"
                                                    binding="#{PotencialBen1.campoNombreComunidadIndigena1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_comunidad_indigena']}"
                                                    toolTip="BundleParametros.nombre_comunidad_indigena.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorNombreComunidadIndigena1.validate}"/>
                                                <webuijsf:staticText id="campoNombreComunidadIndigena1Texto1"
                                                    binding="#{PotencialBen1.campoNombreComunidadIndigena1Texto1}"
                                                    text="#{currentRow.value['nombre_comunidad_indigena']}"/>
                                                <webuijsf:message id="messageNombreComunidadIndigena1"
                                                    for="campoNombreComunidadIndigena1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnIdDepartamento1}"
                                                    headerText="departamento"
                                                    id="tableColumnIdDepartamento1" rendered="false"
                                                    sort="codigo_ubicacion_1x4y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamento1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x4y3']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdDepartamento1}"
                                                    id="labelIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                <webuijsf:textField id="campoIdDepartamento1"
                                                    binding="#{PotencialBen1.campoIdDepartamento1}"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen1.asistente.textoCampoIdDepartamento1}"
                                                    toolTip="#{PotencialBen1.asistente.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{PotencialBen1.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1Texto1"
                                                    binding="#{PotencialBen1.campoIdDepartamento1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x4y3']}"/>
                                                <webuijsf:message id="messageIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdDepartamento3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamento3"
                                                    text="#{currentRow.value['id_departamento']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdDepartamento1Boton1}"
                                                    id="campoIdDepartamento1Boton1"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdDepartamento1Boton3}"
                                                    id="campoIdDepartamento1Boton3"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{PotencialBen1.asistente.campoIdDepartamento1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{PotencialBen1.tableColumnIdDepartamento2}"
                                                    headerText="nombre departamento"
                                                    id="tableColumnIdDepartamento2" rendered="false"
                                                    sort="nombre_ubicacion_1x4y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamento2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x4y4']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdDepartamento2}"
                                                    id="labelIdDepartamento2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{PotencialBen1.campoIdDepartamento1Hiper1}"
                                                    id="campoIdDepartamento1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x4y4']}"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdDepartamento1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDepartamento1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnIdDistrito1}"
                                                    headerText="distrito"
                                                    id="tableColumnIdDistrito1" rendered="false"
                                                    sort="codigo_ubicacion_1x5y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistrito1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x5y3']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdDistrito1}"
                                                    id="labelIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                <webuijsf:textField id="campoIdDistrito1"
                                                    binding="#{PotencialBen1.campoIdDistrito1}"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen1.asistente.textoCampoIdDistrito1}"
                                                    toolTip="#{PotencialBen1.asistente.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{PotencialBen1.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1Texto1"
                                                    binding="#{PotencialBen1.campoIdDistrito1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x5y3']}"/>
                                                <webuijsf:message id="messageIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdDistrito3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistrito3"
                                                    text="#{currentRow.value['id_distrito']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdDistrito1Boton1}"
                                                    id="campoIdDistrito1Boton1"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdDistrito1Boton3}"
                                                    id="campoIdDistrito1Boton3"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{PotencialBen1.asistente.campoIdDistrito1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{PotencialBen1.tableColumnIdDistrito2}"
                                                    headerText="nombre distrito"
                                                    id="tableColumnIdDistrito2" rendered="false"
                                                    sort="nombre_ubicacion_1x5y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistrito2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x5y4']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdDistrito2}"
                                                    id="labelIdDistrito2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{PotencialBen1.campoIdDistrito1Hiper1}"
                                                    id="campoIdDistrito1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x5y4']}"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdDistrito1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDistrito1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnNumeroTipoArea1}"
                                                    headerText="tipo area"
                                                    id="tableColumnNumeroTipoArea1" rendered="false"
                                                    sort="codigo_tipo_area_1x6y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoArea1"
                                                    text="#{currentRow.value['codigo_tipo_area_1x6y2']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelNumeroTipoArea1}"
                                                    id="labelNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoArea1"
                                                    binding="#{PotencialBen1.listaNumeroTipoArea1}"
                                                    converter="#{PotencialBen1.converterNumeroTipoArea1}"
                                                    disabled="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    items="#{PotencialBen1.asistente.opcionesListaNumeroTipoArea1}"
                                                    selected="#{currentRow.value['numero_tipo_area']}"
                                                    toolTip="BundleParametros.numero_tipo_area.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroTipoArea1Texto1"
                                                    binding="#{PotencialBen1.listaNumeroTipoArea1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_area_1x6y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnIdBarrio1}"
                                                    headerText="barrio"
                                                    id="tableColumnIdBarrio1" rendered="false"
                                                    sort="codigo_ubicacion_1x7y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdBarrio1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x7y3']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdBarrio1}"
                                                    id="labelIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                <webuijsf:textField id="campoIdBarrio1"
                                                    binding="#{PotencialBen1.campoIdBarrio1}"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{PotencialBen1.asistente.textoCampoIdBarrio1}"
                                                    toolTip="#{PotencialBen1.asistente.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{PotencialBen1.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1Texto1"
                                                    binding="#{PotencialBen1.campoIdBarrio1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x7y3']}"/>
                                                <webuijsf:message id="messageIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdBarrio3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdBarrio3"
                                                    text="#{currentRow.value['id_barrio']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdBarrio1Boton1}"
                                                    id="campoIdBarrio1Boton1"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdBarrio1Boton3}"
                                                    id="campoIdBarrio1Boton3"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{PotencialBen1.asistente.campoIdBarrio1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{PotencialBen1.tableColumnIdBarrio2}"
                                                    headerText="nombre barrio"
                                                    id="tableColumnIdBarrio2" rendered="false"
                                                    sort="nombre_ubicacion_1x7y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdBarrio2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x7y4']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdBarrio2}"
                                                    id="labelIdBarrio2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{PotencialBen1.campoIdBarrio1Hiper1}"
                                                    id="campoIdBarrio1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x7y4']}"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdBarrio1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdBarrio1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnManzana1}"
                                                    headerText="manzana"
                                                    id="tableColumnManzana1" rendered="false"
                                                    sort="manzana">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextManzana1"
                                                    text="#{currentRow.value['manzana']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelManzana1}"
                                                    id="labelManzana1"
                                                    for="campoManzana1"/>
                                                <webuijsf:textField id="campoManzana1"
                                                    binding="#{PotencialBen1.campoManzana1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['manzana']}"
                                                    toolTip="BundleParametros.manzana.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorManzana1.validate}"/>
                                                <webuijsf:staticText id="campoManzana1Texto1"
                                                    binding="#{PotencialBen1.campoManzana1Texto1}"
                                                    text="#{currentRow.value['manzana']}"/>
                                                <webuijsf:message id="messageManzana1"
                                                    for="campoManzana1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnCompania1}"
                                                    headerText="compania"
                                                    id="tableColumnCompania1" rendered="false"
                                                    sort="compania">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCompania1"
                                                    text="#{currentRow.value['compania']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelCompania1}"
                                                    id="labelCompania1"
                                                    for="campoCompania1"/>
                                                <webuijsf:textField id="campoCompania1"
                                                    binding="#{PotencialBen1.campoCompania1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['compania']}"
                                                    toolTip="BundleParametros.compania.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorCompania1.validate}"/>
                                                <webuijsf:staticText id="campoCompania1Texto1"
                                                    binding="#{PotencialBen1.campoCompania1Texto1}"
                                                    text="#{currentRow.value['compania']}"/>
                                                <webuijsf:message id="messageCompania1"
                                                    for="campoCompania1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnDireccion1}"
                                                    headerText="direcci&#243;n"
                                                    id="tableColumnDireccion1" rendered="false"
                                                    sort="direccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDireccion1"
                                                    text="#{currentRow.value['direccion']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelDireccion1}"
                                                    id="labelDireccion1"
                                                    for="campoDireccion1"/>
                                                <webuijsf:textArea id="campoDireccion1"
                                                    binding="#{PotencialBen1.campoDireccion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['direccion']}"
                                                    toolTip="BundleParametros.direccion.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoDireccion1Texto1"
                                                    binding="#{PotencialBen1.campoDireccion1Texto1}"
                                                    text="#{currentRow.value['direccion']}"/>
                                                <webuijsf:message id="messageDireccion1"
                                                    for="campoDireccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnNombreResponsableHogar1}"
                                                    headerText="nombre responsable hogar"
                                                    id="tableColumnNombreResponsableHogar1" rendered="false"
                                                    sort="nombre_responsable_hogar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreResponsableHogar1"
                                                    text="#{currentRow.value['nombre_responsable_hogar']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelNombreResponsableHogar1}"
                                                    id="labelNombreResponsableHogar1"
                                                    for="campoNombreResponsableHogar1"/>
                                                <webuijsf:textField id="campoNombreResponsableHogar1"
                                                    binding="#{PotencialBen1.campoNombreResponsableHogar1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_responsable_hogar']}"
                                                    toolTip="BundleParametros.nombre_responsable_hogar.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorNombreResponsableHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNombreResponsableHogar1Texto1"
                                                    binding="#{PotencialBen1.campoNombreResponsableHogar1Texto1}"
                                                    text="#{currentRow.value['nombre_responsable_hogar']}"/>
                                                <webuijsf:message id="messageNombreResponsableHogar1"
                                                    for="campoNombreResponsableHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnNumeroTelefonoRespHogar1}"
                                                    headerText="n&#250;mero tel&#233;fono responsable hogar"
                                                    id="tableColumnNumeroTelefonoRespHogar1" rendered="false"
                                                    sort="numero_telefono_resp_hogar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTelefonoRespHogar1"
                                                    text="#{currentRow.value['numero_telefono_resp_hogar']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelNumeroTelefonoRespHogar1}"
                                                    id="labelNumeroTelefonoRespHogar1"
                                                    for="campoNumeroTelefonoRespHogar1"/>
                                                <webuijsf:textField id="campoNumeroTelefonoRespHogar1"
                                                    binding="#{PotencialBen1.campoNumeroTelefonoRespHogar1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['numero_telefono_resp_hogar']}"
                                                    toolTip="BundleParametros.numero_telefono_resp_hogar.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorNumeroTelefonoRespHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoRespHogar1Texto1"
                                                    binding="#{PotencialBen1.campoNumeroTelefonoRespHogar1Texto1}"
                                                    text="#{currentRow.value['numero_telefono_resp_hogar']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoRespHogar1"
                                                    for="campoNumeroTelefonoRespHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnEsPersonaConJubilacion1}"
                                                    headerText="persona con jubilaci&#243;n"
                                                    id="tableColumnEsPersonaConJubilacion1" rendered="false"
                                                    sort="es_persona_con_jubilacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPersonaConJubilacion1"
                                                    text="#{currentRow.value['es_persona_con_jubilacion']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelEsPersonaConJubilacion1}"
                                                    id="labelEsPersonaConJubilacion1"
                                                    for="listaEsPersonaConJubilacion1"/>
                                                <webuijsf:dropDown id="listaEsPersonaConJubilacion1"
                                                    binding="#{PotencialBen1.listaEsPersonaConJubilacion1}"
                                                    converter="#{PotencialBen1.converterEsPersonaConJubilacion1}"
                                                    disabled="#{PotencialBen1.gestor.filaNoProcesada}" required="true"
                                                    items="#{PotencialBen1.asistente.opcionesListaEsPersonaConJubilacion1}"
                                                    selected="#{currentRow.value['es_persona_con_jubilacion']}"
                                                    toolTip="BundleParametros.es_persona_con_jubilacion.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsPersonaConJubilacion1Texto1"
                                                    binding="#{PotencialBen1.listaEsPersonaConJubilacion1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConJubilacion1"
                                                    for="listaEsPersonaConJubilacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnEsPersonaConPension1}"
                                                    headerText="persona con pensi&#243;n"
                                                    id="tableColumnEsPersonaConPension1" rendered="false"
                                                    sort="es_persona_con_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPersonaConPension1"
                                                    text="#{currentRow.value['es_persona_con_pension']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelEsPersonaConPension1}"
                                                    id="labelEsPersonaConPension1"
                                                    for="listaEsPersonaConPension1"/>
                                                <webuijsf:dropDown id="listaEsPersonaConPension1"
                                                    binding="#{PotencialBen1.listaEsPersonaConPension1}"
                                                    converter="#{PotencialBen1.converterEsPersonaConPension1}"
                                                    disabled="#{PotencialBen1.gestor.filaNoProcesada}" required="true"
                                                    items="#{PotencialBen1.asistente.opcionesListaEsPersonaConPension1}"
                                                    selected="#{currentRow.value['es_persona_con_pension']}"
                                                    toolTip="BundleParametros.es_persona_con_pension.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsPersonaConPension1Texto1"
                                                    binding="#{PotencialBen1.listaEsPersonaConPension1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConPension1"
                                                    for="listaEsPersonaConPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnEsPersonaConSubsidio1}"
                                                    headerText="persona con subsidio"
                                                    id="tableColumnEsPersonaConSubsidio1" rendered="false"
                                                    sort="es_persona_con_subsidio">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPersonaConSubsidio1"
                                                    text="#{currentRow.value['es_persona_con_subsidio']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelEsPersonaConSubsidio1}"
                                                    id="labelEsPersonaConSubsidio1"
                                                    for="listaEsPersonaConSubsidio1"/>
                                                <webuijsf:dropDown id="listaEsPersonaConSubsidio1"
                                                    binding="#{PotencialBen1.listaEsPersonaConSubsidio1}"
                                                    converter="#{PotencialBen1.converterEsPersonaConSubsidio1}"
                                                    disabled="#{PotencialBen1.gestor.filaNoProcesada}" required="true"
                                                    items="#{PotencialBen1.asistente.opcionesListaEsPersonaConSubsidio1}"
                                                    selected="#{currentRow.value['es_persona_con_subsidio']}"
                                                    toolTip="BundleParametros.es_persona_con_subsidio.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsPersonaConSubsidio1Texto1"
                                                    binding="#{PotencialBen1.listaEsPersonaConSubsidio1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConSubsidio1"
                                                    for="listaEsPersonaConSubsidio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnNombreReferente1}"
                                                    headerText="nombre referente"
                                                    id="tableColumnNombreReferente1" rendered="false"
                                                    sort="nombre_referente">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreReferente1"
                                                    text="#{currentRow.value['nombre_referente']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelNombreReferente1}"
                                                    id="labelNombreReferente1"
                                                    for="campoNombreReferente1"/>
                                                <webuijsf:textField id="campoNombreReferente1"
                                                    binding="#{PotencialBen1.campoNombreReferente1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_referente']}"
                                                    toolTip="BundleParametros.nombre_referente.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorNombreReferente1.validate}"/>
                                                <webuijsf:staticText id="campoNombreReferente1Texto1"
                                                    binding="#{PotencialBen1.campoNombreReferente1Texto1}"
                                                    text="#{currentRow.value['nombre_referente']}"/>
                                                <webuijsf:message id="messageNombreReferente1"
                                                    for="campoNombreReferente1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnNumeroTelefonoReferente1}"
                                                    headerText="n&#250;mero tel&#233;fono referente"
                                                    id="tableColumnNumeroTelefonoReferente1" rendered="false"
                                                    sort="numero_telefono_referente">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTelefonoReferente1"
                                                    text="#{currentRow.value['numero_telefono_referente']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelNumeroTelefonoReferente1}"
                                                    id="labelNumeroTelefonoReferente1"
                                                    for="campoNumeroTelefonoReferente1"/>
                                                <webuijsf:textField id="campoNumeroTelefonoReferente1"
                                                    binding="#{PotencialBen1.campoNumeroTelefonoReferente1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['numero_telefono_referente']}"
                                                    toolTip="BundleParametros.numero_telefono_referente.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorNumeroTelefonoReferente1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoReferente1Texto1"
                                                    binding="#{PotencialBen1.campoNumeroTelefonoReferente1Texto1}"
                                                    text="#{currentRow.value['numero_telefono_referente']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoReferente1"
                                                    for="campoNumeroTelefonoReferente1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnNumeroCondicionCenso1}"
                                                    headerText="condici&#243;n censo"
                                                    id="tableColumnNumeroCondicionCenso1" rendered="false"
                                                    sort="codigo_condicion_censo_1x9y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCondicionCenso1"
                                                    text="#{currentRow.value['codigo_condicion_censo_1x9y2']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelNumeroCondicionCenso1}"
                                                    id="labelNumeroCondicionCenso1"
                                                    for="listaNumeroCondicionCenso1"/>
                                                <webuijsf:dropDown id="listaNumeroCondicionCenso1"
                                                    binding="#{PotencialBen1.listaNumeroCondicionCenso1}"
                                                    converter="#{PotencialBen1.converterNumeroCondicionCenso1}"
                                                    disabled="true"
                                                    items="#{PotencialBen1.asistente.opcionesListaNumeroCondicionCenso1}"
                                                    selected="#{currentRow.value['numero_condicion_censo']}"
                                                    toolTip="BundleParametros.numero_condicion_censo.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroCondicionCenso1Texto1"
                                                    binding="#{PotencialBen1.listaNumeroCondicionCenso1Texto1}"
                                                    text="#{currentRow.value['codigo_condicion_censo_1x9y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionCenso1"
                                                    for="listaNumeroCondicionCenso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnFechaValidacionCenso1}"
                                                    headerText="fecha validaci&#243;n censo"
                                                    id="tableColumnFechaValidacionCenso1" rendered="false"
                                                    sort="fecha_validacion_censo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaValidacionCenso1"
                                                    text="#{currentRow.value['fecha_validacion_censo']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelFechaValidacionCenso1}"
                                                    id="labelFechaValidacionCenso1"
                                                    for="campoFechaValidacionCenso1"/>
                                                <webuijsf:textField id="campoFechaValidacionCenso1"
                                                    binding="#{PotencialBen1.campoFechaValidacionCenso1}"
                                                    converter="#{PotencialBen1.converterFechaValidacionCenso1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_validacion_censo']}"
                                                    toolTip="BundleParametros.fecha_validacion_censo.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaValidacionCenso1Texto1"
                                                    binding="#{PotencialBen1.campoFechaValidacionCenso1Texto1}"
                                                    converter="#{PotencialBen1.converterFechaValidacionCenso1}"
                                                    text="#{currentRow.value['fecha_validacion_censo']}"/>
                                                <webuijsf:message id="messageFechaValidacionCenso1"
                                                    for="campoFechaValidacionCenso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnIdFuncionarioValidacionCen1}"
                                                    headerText="funcionario validaci&#243;n censo"
                                                    id="tableColumnIdFuncionarioValidacionCen1" rendered="false"
                                                    sort="codigo_funcionario_1x10y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioValidacionCen1"
                                                    text="#{currentRow.value['codigo_funcionario_1x10y3']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdFuncionarioValidacionCen1}"
                                                    id="labelIdFuncionarioValidacionCen1"
                                                    for="campoIdFuncionarioValidacionCen1"/>
                                                <webuijsf:textField id="campoIdFuncionarioValidacionCen1"
                                                    binding="#{PotencialBen1.campoIdFuncionarioValidacionCen1}"
                                                    readOnly="true"
                                                    text="#{PotencialBen1.asistente.textoCampoIdFuncionarioValidacionCen1}"
                                                    toolTip="#{PotencialBen1.asistente.toolTipCampoIdFuncionarioValidacionCen1}"
                                                    validatorExpression="#{PotencialBen1.campoIdFuncionarioValidacionCen1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioValidacionCen1Texto1"
                                                    binding="#{PotencialBen1.campoIdFuncionarioValidacionCen1Texto1}"
                                                    text="#{currentRow.value['codigo_funcionario_1x10y3']}"/>
                                                <webuijsf:message id="messageIdFuncionarioValidacionCen1"
                                                    for="campoIdFuncionarioValidacionCen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFuncionarioValidacionCen3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioValidacionCen3"
                                                    text="#{currentRow.value['id_funcionario_validacion_cen']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdFuncionarioValidacionCen1Boton1}"
                                                    id="campoIdFuncionarioValidacionCen1Boton1"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdFuncionarioValidacionCen1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdFuncionarioValidacionCen1Boton3}"
                                                    id="campoIdFuncionarioValidacionCen1Boton3"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdFuncionarioValidacionCen1Boton2}"
                                                    rendered="#{PotencialBen1.asistente.campoIdFuncionarioValidacionCen1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{PotencialBen1.tableColumnIdFuncionarioValidacionCen2}"
                                                    headerText="nombre funcionario validaci&#243;n censo"
                                                    id="tableColumnIdFuncionarioValidacionCen2" rendered="false"
                                                    sort="nombre_funcionario_1x10y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioValidacionCen2"
                                                    text="#{currentRow.value['nombre_funcionario_1x10y4']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdFuncionarioValidacionCen2}"
                                                    id="labelIdFuncionarioValidacionCen2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{PotencialBen1.campoIdFuncionarioValidacionCen1Hiper1}"
                                                    id="campoIdFuncionarioValidacionCen1Hiper1"
                                                    text="#{currentRow.value['nombre_funcionario_1x10y4']}"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdFuncionarioValidacionCen1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFuncionarioValidacionCen1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnNumeroCausaInvCenso1}"
                                                    headerText="causa invalidaci&#243;n censo"
                                                    id="tableColumnNumeroCausaInvCenso1" rendered="false"
                                                    sort="codigo_causa_inv_censo_1x11y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCausaInvCenso1"
                                                    text="#{currentRow.value['codigo_causa_inv_censo_1x11y2']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelNumeroCausaInvCenso1}"
                                                    id="labelNumeroCausaInvCenso1"
                                                    for="listaNumeroCausaInvCenso1"/>
                                                <webuijsf:dropDown id="listaNumeroCausaInvCenso1"
                                                    binding="#{PotencialBen1.listaNumeroCausaInvCenso1}"
                                                    converter="#{PotencialBen1.converterNumeroCausaInvCenso1}"
                                                    disabled="true"
                                                    items="#{PotencialBen1.asistente.opcionesListaNumeroCausaInvCenso1}"
                                                    selected="#{currentRow.value['numero_causa_inv_censo']}"
                                                    toolTip="BundleParametros.numero_causa_inv_censo.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroCausaInvCenso1Texto1"
                                                    binding="#{PotencialBen1.listaNumeroCausaInvCenso1Texto1}"
                                                    text="#{currentRow.value['codigo_causa_inv_censo_1x11y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaInvCenso1"
                                                    for="listaNumeroCausaInvCenso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnOtraCausaInvCenso1}"
                                                    headerText="otra causa invalidaci&#243;n censo"
                                                    id="tableColumnOtraCausaInvCenso1" rendered="false"
                                                    sort="otra_causa_inv_censo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtraCausaInvCenso1"
                                                    text="#{currentRow.value['otra_causa_inv_censo']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelOtraCausaInvCenso1}"
                                                    id="labelOtraCausaInvCenso1"
                                                    for="campoOtraCausaInvCenso1"/>
                                                <webuijsf:textField id="campoOtraCausaInvCenso1"
                                                    binding="#{PotencialBen1.campoOtraCausaInvCenso1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{currentRow.value['otra_causa_inv_censo']}"
                                                    toolTip="BundleParametros.otra_causa_inv_censo.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorOtraCausaInvCenso1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaInvCenso1Texto1"
                                                    binding="#{PotencialBen1.campoOtraCausaInvCenso1Texto1}"
                                                    text="#{currentRow.value['otra_causa_inv_censo']}"/>
                                                <webuijsf:message id="messageOtraCausaInvCenso1"
                                                    for="campoOtraCausaInvCenso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnComentariosValidacionCenso1}"
                                                    headerText="comentarios validaci&#243;n censo"
                                                    id="tableColumnComentariosValidacionCenso1" rendered="false"
                                                    sort="comentarios_validacion_censo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosValidacionCenso1"
                                                    text="#{currentRow.value['comentarios_validacion_censo']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelComentariosValidacionCenso1}"
                                                    id="labelComentariosValidacionCenso1"
                                                    for="campoComentariosValidacionCenso1"/>
                                                <webuijsf:textArea id="campoComentariosValidacionCenso1"
                                                    binding="#{PotencialBen1.campoComentariosValidacionCenso1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_validacion_censo']}"
                                                    toolTip="BundleParametros.comentarios_validacion_censo.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorComentariosValidacionCenso1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosValidacionCenso1Texto1"
                                                    binding="#{PotencialBen1.campoComentariosValidacionCenso1Texto1}"
                                                    text="#{currentRow.value['comentarios_validacion_censo']}"/>
                                                <webuijsf:message id="messageComentariosValidacionCenso1"
                                                    for="campoComentariosValidacionCenso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnIdFichaPersona1}"
                                                    headerText="ficha persona"
                                                    id="tableColumnIdFichaPersona1" rendered="false"
                                                    sort="codigo_ficha_persona_1x12y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaPersona1"
                                                    text="#{currentRow.value['codigo_ficha_persona_1x12y3']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdFichaPersona1}"
                                                    id="labelIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                <webuijsf:textField id="campoIdFichaPersona1"
                                                    binding="#{PotencialBen1.campoIdFichaPersona1}"
                                                    readOnly="true"
                                                    text="#{PotencialBen1.asistente.textoCampoIdFichaPersona1}"
                                                    toolTip="#{PotencialBen1.asistente.toolTipCampoIdFichaPersona1}"
                                                    validatorExpression="#{PotencialBen1.campoIdFichaPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdFichaPersona1Texto1"
                                                    binding="#{PotencialBen1.campoIdFichaPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_ficha_persona_1x12y3']}"/>
                                                <webuijsf:message id="messageIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFichaPersona3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaPersona3"
                                                    text="#{currentRow.value['id_ficha_persona']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdFichaPersona1Boton1}"
                                                    id="campoIdFichaPersona1Boton1"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdFichaPersona1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdFichaPersona1Boton3}"
                                                    id="campoIdFichaPersona1Boton3"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdFichaPersona1Boton2}"
                                                    rendered="#{PotencialBen1.asistente.campoIdFichaPersona1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{PotencialBen1.tableColumnIdFichaPersona2}"
                                                    headerText="nombre ficha persona"
                                                    id="tableColumnIdFichaPersona2" rendered="false"
                                                    sort="nombre_ficha_persona_1x12y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaPersona2"
                                                    text="#{currentRow.value['nombre_ficha_persona_1x12y4']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdFichaPersona2}"
                                                    id="labelIdFichaPersona2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{PotencialBen1.campoIdFichaPersona1Hiper1}"
                                                    id="campoIdFichaPersona1Hiper1"
                                                    text="#{currentRow.value['nombre_ficha_persona_1x12y4']}"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdFichaPersona1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFichaPersona1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnNumeroCondicionReclCen1}"
                                                    headerText="condici&#243;n reclamo censo"
                                                    id="tableColumnNumeroCondicionReclCen1" rendered="false"
                                                    sort="codigo_condicion_recl_c_1x13y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCondicionReclCen1"
                                                    text="#{currentRow.value['codigo_condicion_recl_c_1x13y2']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelNumeroCondicionReclCen1}"
                                                    id="labelNumeroCondicionReclCen1"
                                                    for="listaNumeroCondicionReclCen1"/>
                                                <webuijsf:dropDown id="listaNumeroCondicionReclCen1"
                                                    binding="#{PotencialBen1.listaNumeroCondicionReclCen1}"
                                                    converter="#{PotencialBen1.converterNumeroCondicionReclCen1}"
                                                    disabled="true"
                                                    items="#{PotencialBen1.asistente.opcionesListaNumeroCondicionReclCen1}"
                                                    selected="#{currentRow.value['numero_condicion_recl_cen']}"
                                                    toolTip="BundleParametros.numero_condicion_recl_cen.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroCondicionReclCen1Texto1"
                                                    binding="#{PotencialBen1.listaNumeroCondicionReclCen1Texto1}"
                                                    text="#{currentRow.value['codigo_condicion_recl_c_1x13y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionReclCen1"
                                                    for="listaNumeroCondicionReclCen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnFechaReclamoCenso1}"
                                                    headerText="fecha reclamo censo"
                                                    id="tableColumnFechaReclamoCenso1" rendered="false"
                                                    sort="fecha_reclamo_censo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaReclamoCenso1"
                                                    text="#{currentRow.value['fecha_reclamo_censo']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelFechaReclamoCenso1}"
                                                    id="labelFechaReclamoCenso1"
                                                    for="campoFechaReclamoCenso1"/>
                                                <webuijsf:textField id="campoFechaReclamoCenso1"
                                                    binding="#{PotencialBen1.campoFechaReclamoCenso1}"
                                                    converter="#{PotencialBen1.converterFechaReclamoCenso1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_reclamo_censo']}"
                                                    toolTip="BundleParametros.fecha_reclamo_censo.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaReclamoCenso1Texto1"
                                                    binding="#{PotencialBen1.campoFechaReclamoCenso1Texto1}"
                                                    converter="#{PotencialBen1.converterFechaReclamoCenso1}"
                                                    text="#{currentRow.value['fecha_reclamo_censo']}"/>
                                                <webuijsf:message id="messageFechaReclamoCenso1"
                                                    for="campoFechaReclamoCenso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnComentariosReclamoCenso1}"
                                                    headerText="comentarios reclamo censo"
                                                    id="tableColumnComentariosReclamoCenso1" rendered="false"
                                                    sort="comentarios_reclamo_censo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosReclamoCenso1"
                                                    text="#{currentRow.value['comentarios_reclamo_censo']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelComentariosReclamoCenso1}"
                                                    id="labelComentariosReclamoCenso1"
                                                    for="campoComentariosReclamoCenso1"/>
                                                <webuijsf:textArea id="campoComentariosReclamoCenso1"
                                                    binding="#{PotencialBen1.campoComentariosReclamoCenso1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_reclamo_censo']}"
                                                    toolTip="BundleParametros.comentarios_reclamo_censo.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorComentariosReclamoCenso1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosReclamoCenso1Texto1"
                                                    binding="#{PotencialBen1.campoComentariosReclamoCenso1Texto1}"
                                                    text="#{currentRow.value['comentarios_reclamo_censo']}"/>
                                                <webuijsf:message id="messageComentariosReclamoCenso1"
                                                    for="campoComentariosReclamoCenso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnFechaAprobacionReclamoCenso1}"
                                                    headerText="fecha aprobaci&#243;n reclamo censo"
                                                    id="tableColumnFechaAprobacionReclamoCenso1" rendered="false"
                                                    sort="fecha_aprobacion_reclamo_censo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaAprobacionReclamoCenso1"
                                                    text="#{currentRow.value['fecha_aprobacion_reclamo_censo']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelFechaAprobacionReclamoCenso1}"
                                                    id="labelFechaAprobacionReclamoCenso1"
                                                    for="campoFechaAprobacionReclamoCenso1"/>
                                                <webuijsf:textField id="campoFechaAprobacionReclamoCenso1"
                                                    binding="#{PotencialBen1.campoFechaAprobacionReclamoCenso1}"
                                                    converter="#{PotencialBen1.converterFechaAprobacionReclamoCenso1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_aprobacion_reclamo_censo']}"
                                                    toolTip="BundleParametros.fecha_aprobacion_reclamo_censo.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaAprobacionReclamoCenso1Texto1"
                                                    binding="#{PotencialBen1.campoFechaAprobacionReclamoCenso1Texto1}"
                                                    converter="#{PotencialBen1.converterFechaAprobacionReclamoCenso1}"
                                                    text="#{currentRow.value['fecha_aprobacion_reclamo_censo']}"/>
                                                <webuijsf:message id="messageFechaAprobacionReclamoCenso1"
                                                    for="campoFechaAprobacionReclamoCenso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnComentariosAprReclCen1}"
                                                    headerText="comentarios aprobaci&#243;n reclamo censo"
                                                    id="tableColumnComentariosAprReclCen1" rendered="false"
                                                    sort="comentarios_apr_recl_cen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosAprReclCen1"
                                                    text="#{currentRow.value['comentarios_apr_recl_cen']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelComentariosAprReclCen1}"
                                                    id="labelComentariosAprReclCen1"
                                                    for="campoComentariosAprReclCen1"/>
                                                <webuijsf:textArea id="campoComentariosAprReclCen1"
                                                    binding="#{PotencialBen1.campoComentariosAprReclCen1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_apr_recl_cen']}"
                                                    toolTip="BundleParametros.comentarios_apr_recl_cen.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorComentariosAprReclCen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAprReclCen1Texto1"
                                                    binding="#{PotencialBen1.campoComentariosAprReclCen1Texto1}"
                                                    text="#{currentRow.value['comentarios_apr_recl_cen']}"/>
                                                <webuijsf:message id="messageComentariosAprReclCen1"
                                                    for="campoComentariosAprReclCen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnFechaDenegacionReclamoCenso1}"
                                                    headerText="fecha denegaci&#243;n reclamo censo"
                                                    id="tableColumnFechaDenegacionReclamoCenso1" rendered="false"
                                                    sort="fecha_denegacion_reclamo_censo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaDenegacionReclamoCenso1"
                                                    text="#{currentRow.value['fecha_denegacion_reclamo_censo']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelFechaDenegacionReclamoCenso1}"
                                                    id="labelFechaDenegacionReclamoCenso1"
                                                    for="campoFechaDenegacionReclamoCenso1"/>
                                                <webuijsf:textField id="campoFechaDenegacionReclamoCenso1"
                                                    binding="#{PotencialBen1.campoFechaDenegacionReclamoCenso1}"
                                                    converter="#{PotencialBen1.converterFechaDenegacionReclamoCenso1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_denegacion_reclamo_censo']}"
                                                    toolTip="BundleParametros.fecha_denegacion_reclamo_censo.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaDenegacionReclamoCenso1Texto1"
                                                    binding="#{PotencialBen1.campoFechaDenegacionReclamoCenso1Texto1}"
                                                    converter="#{PotencialBen1.converterFechaDenegacionReclamoCenso1}"
                                                    text="#{currentRow.value['fecha_denegacion_reclamo_censo']}"/>
                                                <webuijsf:message id="messageFechaDenegacionReclamoCenso1"
                                                    for="campoFechaDenegacionReclamoCenso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnNumeroCausaDenReclCen1}"
                                                    headerText="causa denegaci&#243;n reclamo censo"
                                                    id="tableColumnNumeroCausaDenReclCen1" rendered="false"
                                                    sort="codigo_causa_den_recl_c_1x14y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCausaDenReclCen1"
                                                    text="#{currentRow.value['codigo_causa_den_recl_c_1x14y2']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelNumeroCausaDenReclCen1}"
                                                    id="labelNumeroCausaDenReclCen1"
                                                    for="listaNumeroCausaDenReclCen1"/>
                                                <webuijsf:dropDown id="listaNumeroCausaDenReclCen1"
                                                    binding="#{PotencialBen1.listaNumeroCausaDenReclCen1}"
                                                    converter="#{PotencialBen1.converterNumeroCausaDenReclCen1}"
                                                    disabled="true"
                                                    items="#{PotencialBen1.asistente.opcionesListaNumeroCausaDenReclCen1}"
                                                    selected="#{currentRow.value['numero_causa_den_recl_cen']}"
                                                    toolTip="BundleParametros.numero_causa_den_recl_cen.potencial_ben"/>
                                                <webuijsf:staticText id="listaNumeroCausaDenReclCen1Texto1"
                                                    binding="#{PotencialBen1.listaNumeroCausaDenReclCen1Texto1}"
                                                    text="#{currentRow.value['codigo_causa_den_recl_c_1x14y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaDenReclCen1"
                                                    for="listaNumeroCausaDenReclCen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnOtraCausaDenReclCen1}"
                                                    headerText="otra causa denegaci&#243;n reclamo censo"
                                                    id="tableColumnOtraCausaDenReclCen1" rendered="false"
                                                    sort="otra_causa_den_recl_cen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtraCausaDenReclCen1"
                                                    text="#{currentRow.value['otra_causa_den_recl_cen']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelOtraCausaDenReclCen1}"
                                                    id="labelOtraCausaDenReclCen1"
                                                    for="campoOtraCausaDenReclCen1"/>
                                                <webuijsf:textField id="campoOtraCausaDenReclCen1"
                                                    binding="#{PotencialBen1.campoOtraCausaDenReclCen1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{currentRow.value['otra_causa_den_recl_cen']}"
                                                    toolTip="BundleParametros.otra_causa_den_recl_cen.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorOtraCausaDenReclCen1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaDenReclCen1Texto1"
                                                    binding="#{PotencialBen1.campoOtraCausaDenReclCen1Texto1}"
                                                    text="#{currentRow.value['otra_causa_den_recl_cen']}"/>
                                                <webuijsf:message id="messageOtraCausaDenReclCen1"
                                                    for="campoOtraCausaDenReclCen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnComentariosDenReclCen1}"
                                                    headerText="comentarios denegaci&#243;n reclamo censo"
                                                    id="tableColumnComentariosDenReclCen1" rendered="false"
                                                    sort="comentarios_den_recl_cen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosDenReclCen1"
                                                    text="#{currentRow.value['comentarios_den_recl_cen']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelComentariosDenReclCen1}"
                                                    id="labelComentariosDenReclCen1"
                                                    for="campoComentariosDenReclCen1"/>
                                                <webuijsf:textArea id="campoComentariosDenReclCen1"
                                                    binding="#{PotencialBen1.campoComentariosDenReclCen1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_den_recl_cen']}"
                                                    toolTip="BundleParametros.comentarios_den_recl_cen.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorComentariosDenReclCen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosDenReclCen1Texto1"
                                                    binding="#{PotencialBen1.campoComentariosDenReclCen1Texto1}"
                                                    text="#{currentRow.value['comentarios_den_recl_cen']}"/>
                                                <webuijsf:message id="messageComentariosDenReclCen1"
                                                    for="campoComentariosDenReclCen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnFechaRegistroPotBen1}"
                                                    headerText="fecha registro"
                                                    id="tableColumnFechaRegistroPotBen1" rendered="false"
                                                    sort="fecha_registro_pot_ben">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaRegistroPotBen1"
                                                    text="#{currentRow.value['fecha_registro_pot_ben']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelFechaRegistroPotBen1}"
                                                    id="labelFechaRegistroPotBen1"
                                                    for="campoFechaRegistroPotBen1"/>
                                                <webuijsf:textField id="campoFechaRegistroPotBen1"
                                                    binding="#{PotencialBen1.campoFechaRegistroPotBen1}"
                                                    converter="#{PotencialBen1.converterFechaRegistroPotBen1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_registro_pot_ben']}"
                                                    toolTip="BundleParametros.fecha_registro_pot_ben.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaRegistroPotBen1Texto1"
                                                    binding="#{PotencialBen1.campoFechaRegistroPotBen1Texto1}"
                                                    converter="#{PotencialBen1.converterFechaRegistroPotBen1}"
                                                    text="#{currentRow.value['fecha_registro_pot_ben']}"/>
                                                <webuijsf:message id="messageFechaRegistroPotBen1"
                                                    for="campoFechaRegistroPotBen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnIdFuncionarioRegPotBen1}"
                                                    headerText="funcionario registro"
                                                    id="tableColumnIdFuncionarioRegPotBen1" rendered="false"
                                                    sort="codigo_funcionario_1x15y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioRegPotBen1"
                                                    text="#{currentRow.value['codigo_funcionario_1x15y3']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdFuncionarioRegPotBen1}"
                                                    id="labelIdFuncionarioRegPotBen1"
                                                    for="campoIdFuncionarioRegPotBen1"/>
                                                <webuijsf:textField id="campoIdFuncionarioRegPotBen1"
                                                    binding="#{PotencialBen1.campoIdFuncionarioRegPotBen1}"
                                                    readOnly="true"
                                                    text="#{PotencialBen1.asistente.textoCampoIdFuncionarioRegPotBen1}"
                                                    toolTip="#{PotencialBen1.asistente.toolTipCampoIdFuncionarioRegPotBen1}"
                                                    validatorExpression="#{PotencialBen1.campoIdFuncionarioRegPotBen1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioRegPotBen1Texto1"
                                                    binding="#{PotencialBen1.campoIdFuncionarioRegPotBen1Texto1}"
                                                    text="#{currentRow.value['codigo_funcionario_1x15y3']}"/>
                                                <webuijsf:message id="messageIdFuncionarioRegPotBen1"
                                                    for="campoIdFuncionarioRegPotBen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFuncionarioRegPotBen3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioRegPotBen3"
                                                    text="#{currentRow.value['id_funcionario_reg_pot_ben']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdFuncionarioRegPotBen1Boton1}"
                                                    id="campoIdFuncionarioRegPotBen1Boton1"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdFuncionarioRegPotBen1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdFuncionarioRegPotBen1Boton3}"
                                                    id="campoIdFuncionarioRegPotBen1Boton3"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdFuncionarioRegPotBen1Boton2}"
                                                    rendered="#{PotencialBen1.asistente.campoIdFuncionarioRegPotBen1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{PotencialBen1.tableColumnIdFuncionarioRegPotBen2}"
                                                    headerText="nombre funcionario registro"
                                                    id="tableColumnIdFuncionarioRegPotBen2" rendered="false"
                                                    sort="nombre_funcionario_1x15y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioRegPotBen2"
                                                    text="#{currentRow.value['nombre_funcionario_1x15y4']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdFuncionarioRegPotBen2}"
                                                    id="labelIdFuncionarioRegPotBen2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{PotencialBen1.campoIdFuncionarioRegPotBen1Hiper1}"
                                                    id="campoIdFuncionarioRegPotBen1Hiper1"
                                                    text="#{currentRow.value['nombre_funcionario_1x15y4']}"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdFuncionarioRegPotBen1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFuncionarioRegPotBen1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnEsPotencialBenInactivo1}"
                                                    headerText="inactivo"
                                                    id="tableColumnEsPotencialBenInactivo1"
                                                    sort="es_potencial_ben_inactivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPotencialBenInactivo1"
                                                    text="#{currentRow.value['es_potencial_ben_inactivo']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelEsPotencialBenInactivo1}"
                                                    id="labelEsPotencialBenInactivo1"
                                                    for="listaEsPotencialBenInactivo1"/>
                                                <webuijsf:dropDown id="listaEsPotencialBenInactivo1"
                                                    binding="#{PotencialBen1.listaEsPotencialBenInactivo1}"
                                                    converter="#{PotencialBen1.converterEsPotencialBenInactivo1}"
                                                    disabled="true"
                                                    items="#{PotencialBen1.asistente.opcionesListaEsPotencialBenInactivo1}"
                                                    selected="#{currentRow.value['es_potencial_ben_inactivo']}"
                                                    toolTip="BundleParametros.es_potencial_ben_inactivo.potencial_ben"/>
                                                <webuijsf:staticText id="listaEsPotencialBenInactivo1Texto1"
                                                    binding="#{PotencialBen1.listaEsPotencialBenInactivo1Texto1}"/>
                                                <webuijsf:message id="messageEsPotencialBenInactivo1"
                                                    for="listaEsPotencialBenInactivo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnFechaUltimaVisitaCenso1}"
                                                    headerText="fecha ultima visita censo"
                                                    id="tableColumnFechaUltimaVisitaCenso1" rendered="false"
                                                    sort="fecha_ultima_visita_censo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaUltimaVisitaCenso1"
                                                    text="#{currentRow.value['fecha_ultima_visita_censo']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelFechaUltimaVisitaCenso1}"
                                                    id="labelFechaUltimaVisitaCenso1"
                                                    for="campoFechaUltimaVisitaCenso1"/>
                                                <webuijsf:textField id="campoFechaUltimaVisitaCenso1"
                                                    binding="#{PotencialBen1.campoFechaUltimaVisitaCenso1}"
                                                    converter="#{PotencialBen1.converterFechaUltimaVisitaCenso1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_ultima_visita_censo']}"
                                                    toolTip="BundleParametros.fecha_ultima_visita_censo.potencial_ben"/>
                                                <webuijsf:staticText id="campoFechaUltimaVisitaCenso1Texto1"
                                                    binding="#{PotencialBen1.campoFechaUltimaVisitaCenso1Texto1}"
                                                    converter="#{PotencialBen1.converterFechaUltimaVisitaCenso1}"
                                                    text="#{currentRow.value['fecha_ultima_visita_censo']}"/>
                                                <webuijsf:message id="messageFechaUltimaVisitaCenso1"
                                                    for="campoFechaUltimaVisitaCenso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnObservacionesUltVisitaCen1}"
                                                    headerText="observaciones &#250;ltima visita censo"
                                                    id="tableColumnObservacionesUltVisitaCen1" rendered="false"
                                                    sort="observaciones_ult_visita_cen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacionesUltVisitaCen1"
                                                    text="#{currentRow.value['observaciones_ult_visita_cen']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelObservacionesUltVisitaCen1}"
                                                    id="labelObservacionesUltVisitaCen1"
                                                    for="campoObservacionesUltVisitaCen1"/>
                                                <webuijsf:textArea id="campoObservacionesUltVisitaCen1"
                                                    binding="#{PotencialBen1.campoObservacionesUltVisitaCen1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['observaciones_ult_visita_cen']}"
                                                    toolTip="BundleParametros.observaciones_ult_visita_cen.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorObservacionesUltVisitaCen1.validate}"/>
                                                <webuijsf:staticText id="campoObservacionesUltVisitaCen1Texto1"
                                                    binding="#{PotencialBen1.campoObservacionesUltVisitaCen1Texto1}"
                                                    text="#{currentRow.value['observaciones_ult_visita_cen']}"/>
                                                <webuijsf:message id="messageObservacionesUltVisitaCen1"
                                                    for="campoObservacionesUltVisitaCen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnIdFuncionarioUltVisitaCen1}"
                                                    headerText="funcionario &#250;ltima visita censo"
                                                    id="tableColumnIdFuncionarioUltVisitaCen1" rendered="false"
                                                    sort="codigo_funcionario_1x16y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioUltVisitaCen1"
                                                    text="#{currentRow.value['codigo_funcionario_1x16y3']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdFuncionarioUltVisitaCen1}"
                                                    id="labelIdFuncionarioUltVisitaCen1"
                                                    for="campoIdFuncionarioUltVisitaCen1"/>
                                                <webuijsf:textField id="campoIdFuncionarioUltVisitaCen1"
                                                    binding="#{PotencialBen1.campoIdFuncionarioUltVisitaCen1}"
                                                    readOnly="true"
                                                    text="#{PotencialBen1.asistente.textoCampoIdFuncionarioUltVisitaCen1}"
                                                    toolTip="#{PotencialBen1.asistente.toolTipCampoIdFuncionarioUltVisitaCen1}"
                                                    validatorExpression="#{PotencialBen1.campoIdFuncionarioUltVisitaCen1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioUltVisitaCen1Texto1"
                                                    binding="#{PotencialBen1.campoIdFuncionarioUltVisitaCen1Texto1}"
                                                    text="#{currentRow.value['codigo_funcionario_1x16y3']}"/>
                                                <webuijsf:message id="messageIdFuncionarioUltVisitaCen1"
                                                    for="campoIdFuncionarioUltVisitaCen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFuncionarioUltVisitaCen3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioUltVisitaCen3"
                                                    text="#{currentRow.value['id_funcionario_ult_visita_cen']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdFuncionarioUltVisitaCen1Boton1}"
                                                    id="campoIdFuncionarioUltVisitaCen1Boton1"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdFuncionarioUltVisitaCen1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{PotencialBen1.campoIdFuncionarioUltVisitaCen1Boton3}"
                                                    id="campoIdFuncionarioUltVisitaCen1Boton3"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdFuncionarioUltVisitaCen1Boton2}"
                                                    rendered="#{PotencialBen1.asistente.campoIdFuncionarioUltVisitaCen1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{PotencialBen1.tableColumnIdFuncionarioUltVisitaCen2}"
                                                    headerText="nombre funcionario &#250;ltima visita censo"
                                                    id="tableColumnIdFuncionarioUltVisitaCen2" rendered="false"
                                                    sort="nombre_funcionario_1x16y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioUltVisitaCen2"
                                                    text="#{currentRow.value['nombre_funcionario_1x16y4']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelIdFuncionarioUltVisitaCen2}"
                                                    id="labelIdFuncionarioUltVisitaCen2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{PotencialBen1.campoIdFuncionarioUltVisitaCen1Hiper1}"
                                                    id="campoIdFuncionarioUltVisitaCen1Hiper1"
                                                    text="#{currentRow.value['nombre_funcionario_1x16y4']}"
                                                    onClick="#{PotencialBen1.asistente.scriptCampoIdFuncionarioUltVisitaCen1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFuncionarioUltVisitaCen1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{PotencialBen1.tableColumnReferenciaDireccion1}"
                                                    headerText="referencia direcci&#243;n"
                                                    id="tableColumnReferenciaDireccion1" rendered="false"
                                                    sort="referencia_direccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextReferenciaDireccion1"
                                                    text="#{currentRow.value['referencia_direccion']}"
                                                    rendered="#{PotencialBen1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{PotencialBen1.labelReferenciaDireccion1}"
                                                    id="labelReferenciaDireccion1"
                                                    for="campoReferenciaDireccion1"/>
                                                <webuijsf:textArea id="campoReferenciaDireccion1"
                                                    binding="#{PotencialBen1.campoReferenciaDireccion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{PotencialBen1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['referencia_direccion']}"
                                                    toolTip="BundleParametros.referencia_direccion.potencial_ben"
                                                    validatorExpression="#{PotencialBen1.validatorReferenciaDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoReferenciaDireccion1Texto1"
                                                    binding="#{PotencialBen1.campoReferenciaDireccion1Texto1}"
                                                    text="#{currentRow.value['referencia_direccion']}"/>
                                                <webuijsf:message id="messageReferenciaDireccion1"
                                                    for="campoReferenciaDireccion1"/>
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
                                                        binding="#{PotencialBen1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{PotencialBen1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{PotencialBen1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{PotencialBen1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{PotencialBen1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{PotencialBen1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{PotencialBen1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{PotencialBen1.botonRepaginar1_action}"
                                                        binding="#{PotencialBen1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{PotencialBen1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{PotencialBen1.gestor.scriptRepaginar}"
                                                        text="#{PotencialBen1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{PotencialBen1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen1.botonAgregar1_action}"
                                                    binding="#{PotencialBen1.botonAgregar1}"
                                                    disabled="#{PotencialBen1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{PotencialBen1.gestor.scriptAgregar}"
                                                    rendered="#{PotencialBen1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{PotencialBen1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{PotencialBen1.listaFuncionEdicion1}"
                                                    converter="#{PotencialBen1.converterListaFuncionEdicion1}"
                                                    disabled="#{PotencialBen1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{PotencialBen1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{PotencialBen1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{PotencialBen1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{PotencialBen1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen1.botonEditar1_action}"
                                                    binding="#{PotencialBen1.botonEditar1}"
                                                    disabled="#{PotencialBen1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{PotencialBen1.gestor.scriptEditar}"
                                                    rendered="#{PotencialBen1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{PotencialBen1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen1.botonEliminar1_action}"
                                                    binding="#{PotencialBen1.botonEliminar1}"
                                                    disabled="#{PotencialBen1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{PotencialBen1.gestor.scriptEliminar}"
                                                    rendered="#{PotencialBen1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{PotencialBen1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen1.botonAplicar1_action}"
                                                    binding="#{PotencialBen1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{PotencialBen1.gestor.scriptAplicar}"
                                                    rendered="#{PotencialBen1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{PotencialBen1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen1.botonDeshacer1_action}"
                                                    binding="#{PotencialBen1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{PotencialBen1.gestor.scriptDeshacer}"
                                                    rendered="#{PotencialBen1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{PotencialBen1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen1.botonConfirmar1_action}"
                                                    binding="#{PotencialBen1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{PotencialBen1.gestor.scriptConfirmar}"
                                                    rendered="#{PotencialBen1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{PotencialBen1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen1.botonDescartar1_action}"
                                                    binding="#{PotencialBen1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{PotencialBen1.gestor.scriptDescartar}"
                                                    rendered="#{PotencialBen1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{PotencialBen1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{PotencialBen1.listaFuncionAccion1}"
                                                    converter="#{PotencialBen1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{PotencialBen1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{PotencialBen1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{PotencialBen1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{PotencialBen1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen1.botonProcesar1_action}"
                                                    binding="#{PotencialBen1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{PotencialBen1.gestor.scriptProcesar}"
                                                    rendered="#{PotencialBen1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{PotencialBen1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen1.botonRefrescar1_action}"
                                                    binding="#{PotencialBen1.botonRefrescar1}"
                                                    disabled="#{PotencialBen1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{PotencialBen1.gestor.scriptRefrescar}"
                                                    rendered="#{PotencialBen1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{PotencialBen1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen1.botonReconsultar1_action}"
                                                    binding="#{PotencialBen1.botonReconsultar1}"
                                                    disabled="#{PotencialBen1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{PotencialBen1.gestor.scriptReconsultar}"
                                                    rendered="#{PotencialBen1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{PotencialBen1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{PotencialBen1.botonRetornar1_action}"
                                                    binding="#{PotencialBen1.botonRetornar1}"
                                                    disabled="#{PotencialBen1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{PotencialBen1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{PotencialBen1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{PotencialBen1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{PotencialBen1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{PotencialBen1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{PotencialBen1.imageHyperlink1_action}"
                                                    binding="#{PotencialBen1.imageHyperlink1}"
                                                    disabled="#{PotencialBen1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{PotencialBen1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{PotencialBen1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{PotencialBen1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.PotencialBen1_imageHyperlink1_toolTip}"/>
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
