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
                    focus="#{LogImpPot5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpPot5.gestor.preserveFocus}"
                    preserveScroll="#{LogImpPot5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpPot5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdLogImpPot1 campoDepartamento1 campoDistrito1 campoNombresApellidos1 campoApodo1 campoEdadALaFecha1 campoNacimiento1 campoCedula1 campoTelefono1 campoDireccion1 campoReferencia1 campoBarrio1 campoNombreReferente1 campoTelefonoReferente1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 campoIdPotencialBen1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpPot5.breadcrumbs1}" 
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
                                                    rendered="#{LogImpPot5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpPot5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpPot5.gestor.mensajeDisponible}"
                                                    text="#{LogImpPot5.gestor.mensaje}"
                                                    url="#{LogImpPot5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{LogImpPot5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{LogImpPot5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{LogImpPot5.gestor.filaEscogida}" 
                                                sourceData="#{LogImpPot5.logImpPotDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{LogImpPot5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{LogImpPot5.gestor.scriptElegir}" 
                                                        selected="#{LogImpPot5.gestor.filaElegida}" 
                                                        toolTip="#{LogImpPot5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{LogImpPot5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPot5.botonEscogerFila1_action}"
                                                        binding="#{LogImpPot5.botonEscogerFila1}"
                                                        disabled="#{LogImpPot5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{LogImpPot5.gestor.urlImagenEscoger}" 
                                                        onClick="#{LogImpPot5.gestor.scriptEscoger}"
                                                        text="#{LogImpPot5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{LogImpPot5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPot5.botonDetallarFila1_action}"
                                                        binding="#{LogImpPot5.botonDetallarFila1}"
                                                        disabled="#{LogImpPot5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{LogImpPot5.gestor.urlImagenDetallar}" 
                                                        onClick="#{LogImpPot5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{LogImpPot5.gestor.detalleDisponible}" 
                                                        text="#{LogImpPot5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{LogImpPot5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPot5.botonProcesarFila1_action}"
                                                        binding="#{LogImpPot5.botonProcesarFila1}"
                                                        disabled="#{LogImpPot5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpPot5.gestor.urlImagenProcesar}" 
                                                        onClick="#{LogImpPot5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpPot5.asistente.comandoDisponible}" 
                                                        text="#{LogImpPot5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpPot5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPot5.botonRetornarFila1_action}"
                                                        binding="#{LogImpPot5.botonRetornarFila1}" 
                                                        disabled="#{LogImpPot5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{LogImpPot5.gestor.urlImagenRetornar}"
                                                        onClick="#{LogImpPot5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{LogImpPot5.gestor.funcionReturnVisible}" 
                                                        text="#{LogImpPot5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{LogImpPot5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{LogImpPot5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{LogImpPot5.hipervinculoAccionFila1_action}"
                                                        binding="#{LogImpPot5.hipervinculoAccionFila1}"
                                                        disabled="#{LogImpPot5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{LogImpPot5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{LogImpPot5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.LogImpPot5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{LogImpPot5.tableColumn3}" 
                                                    headerText="#{LogImpPot5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpPot5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{LogImpPot5.hipervinculoDetallarFila1_action}"
                                                        binding="#{LogImpPot5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{LogImpPot5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{LogImpPot5.gestor.identificacionFila}" 
                                                        toolTip="#{LogImpPot5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnIdLogImpPot1}"
                                                    toolTip="BundleParametros.id_log_imp_pot.log_imp_pot"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdLogImpPot1" rendered="false"
                                                    sort="id_log_imp_pot">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdLogImpPot1"
                                                    text="#{currentRow.value['id_log_imp_pot']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelIdLogImpPot1}"
                                                    id="labelIdLogImpPot1"
                                                    for="campoIdLogImpPot1"/>
                                                <webuijsf:textField id="campoIdLogImpPot1"
                                                    binding="#{LogImpPot5.campoIdLogImpPot1}"
                                                    converter="#{LogImpPot5.converterIdLogImpPot1}"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_log_imp_pot']}"
                                                    toolTip="BundleParametros.id_log_imp_pot.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorIdLogImpPot1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpPot1Texto1"
                                                    binding="#{LogImpPot5.campoIdLogImpPot1Texto1}"
                                                    text="#{currentRow.value['id_log_imp_pot']}"/>
                                                <webuijsf:message id="messageIdLogImpPot1"
                                                    for="campoIdLogImpPot1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnDepartamento1}"
                                                    toolTip="BundleParametros.departamento.log_imp_pot"
                                                    headerText="departamento"
                                                    id="tableColumnDepartamento1" rendered="false"
                                                    sort="departamento">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDepartamento1"
                                                    text="#{currentRow.value['departamento']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelDepartamento1}"
                                                    id="labelDepartamento1"
                                                    for="campoDepartamento1"/>
                                                <webuijsf:textArea id="campoDepartamento1"
                                                    binding="#{LogImpPot5.campoDepartamento1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['departamento']}"
                                                    toolTip="BundleParametros.departamento.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorDepartamento1.validate}"/>
                                                <webuijsf:staticText id="campoDepartamento1Texto1"
                                                    binding="#{LogImpPot5.campoDepartamento1Texto1}"
                                                    text="#{currentRow.value['departamento']}"/>
                                                <webuijsf:message id="messageDepartamento1"
                                                    for="campoDepartamento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnDistrito1}"
                                                    toolTip="BundleParametros.distrito.log_imp_pot"
                                                    headerText="distrito"
                                                    id="tableColumnDistrito1" rendered="false"
                                                    sort="distrito">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDistrito1"
                                                    text="#{currentRow.value['distrito']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelDistrito1}"
                                                    id="labelDistrito1"
                                                    for="campoDistrito1"/>
                                                <webuijsf:textArea id="campoDistrito1"
                                                    binding="#{LogImpPot5.campoDistrito1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['distrito']}"
                                                    toolTip="BundleParametros.distrito.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorDistrito1.validate}"/>
                                                <webuijsf:staticText id="campoDistrito1Texto1"
                                                    binding="#{LogImpPot5.campoDistrito1Texto1}"
                                                    text="#{currentRow.value['distrito']}"/>
                                                <webuijsf:message id="messageDistrito1"
                                                    for="campoDistrito1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnNombresApellidos1}"
                                                    toolTip="BundleParametros.nombres_apellidos.log_imp_pot"
                                                    headerText="nombres apellidos"
                                                    id="tableColumnNombresApellidos1"
                                                    sort="nombres_apellidos">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombresApellidos1"
                                                    text="#{currentRow.value['nombres_apellidos']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelNombresApellidos1}"
                                                    id="labelNombresApellidos1"
                                                    for="campoNombresApellidos1"/>
                                                <webuijsf:textArea id="campoNombresApellidos1"
                                                    binding="#{LogImpPot5.campoNombresApellidos1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombres_apellidos']}"
                                                    toolTip="BundleParametros.nombres_apellidos.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorNombresApellidos1.validate}"/>
                                                <webuijsf:staticText id="campoNombresApellidos1Texto1"
                                                    binding="#{LogImpPot5.campoNombresApellidos1Texto1}"
                                                    text="#{currentRow.value['nombres_apellidos']}"/>
                                                <webuijsf:message id="messageNombresApellidos1"
                                                    for="campoNombresApellidos1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnApodo1}"
                                                    toolTip="BundleParametros.apodo.log_imp_pot"
                                                    headerText="apodo"
                                                    id="tableColumnApodo1" rendered="false"
                                                    sort="apodo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextApodo1"
                                                    text="#{currentRow.value['apodo']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelApodo1}"
                                                    id="labelApodo1"
                                                    for="campoApodo1"/>
                                                <webuijsf:textArea id="campoApodo1"
                                                    binding="#{LogImpPot5.campoApodo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['apodo']}"
                                                    toolTip="BundleParametros.apodo.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorApodo1.validate}"/>
                                                <webuijsf:staticText id="campoApodo1Texto1"
                                                    binding="#{LogImpPot5.campoApodo1Texto1}"
                                                    text="#{currentRow.value['apodo']}"/>
                                                <webuijsf:message id="messageApodo1"
                                                    for="campoApodo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnEdadALaFecha1}"
                                                    toolTip="BundleParametros.edad_a_la_fecha.log_imp_pot"
                                                    headerText="edad a la fecha"
                                                    id="tableColumnEdadALaFecha1" rendered="false"
                                                    sort="edad_a_la_fecha">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEdadALaFecha1"
                                                    text="#{currentRow.value['edad_a_la_fecha']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelEdadALaFecha1}"
                                                    id="labelEdadALaFecha1"
                                                    for="campoEdadALaFecha1"/>
                                                <webuijsf:textArea id="campoEdadALaFecha1"
                                                    binding="#{LogImpPot5.campoEdadALaFecha1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['edad_a_la_fecha']}"
                                                    toolTip="BundleParametros.edad_a_la_fecha.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorEdadALaFecha1.validate}"/>
                                                <webuijsf:staticText id="campoEdadALaFecha1Texto1"
                                                    binding="#{LogImpPot5.campoEdadALaFecha1Texto1}"
                                                    text="#{currentRow.value['edad_a_la_fecha']}"/>
                                                <webuijsf:message id="messageEdadALaFecha1"
                                                    for="campoEdadALaFecha1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnNacimiento1}"
                                                    toolTip="BundleParametros.nacimiento.log_imp_pot"
                                                    headerText="nacimiento"
                                                    id="tableColumnNacimiento1" rendered="false"
                                                    sort="nacimiento">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNacimiento1"
                                                    text="#{currentRow.value['nacimiento']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelNacimiento1}"
                                                    id="labelNacimiento1"
                                                    for="campoNacimiento1"/>
                                                <webuijsf:textArea id="campoNacimiento1"
                                                    binding="#{LogImpPot5.campoNacimiento1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nacimiento']}"
                                                    toolTip="BundleParametros.nacimiento.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorNacimiento1.validate}"/>
                                                <webuijsf:staticText id="campoNacimiento1Texto1"
                                                    binding="#{LogImpPot5.campoNacimiento1Texto1}"
                                                    text="#{currentRow.value['nacimiento']}"/>
                                                <webuijsf:message id="messageNacimiento1"
                                                    for="campoNacimiento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnCedula1}"
                                                    toolTip="BundleParametros.cedula.log_imp_pot"
                                                    headerText="c&#233;dula"
                                                    id="tableColumnCedula1"
                                                    sort="cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCedula1"
                                                    text="#{currentRow.value['cedula']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelCedula1}"
                                                    id="labelCedula1"
                                                    for="campoCedula1"/>
                                                <webuijsf:textArea id="campoCedula1"
                                                    binding="#{LogImpPot5.campoCedula1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['cedula']}"
                                                    toolTip="BundleParametros.cedula.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorCedula1.validate}"/>
                                                <webuijsf:staticText id="campoCedula1Texto1"
                                                    binding="#{LogImpPot5.campoCedula1Texto1}"
                                                    text="#{currentRow.value['cedula']}"/>
                                                <webuijsf:message id="messageCedula1"
                                                    for="campoCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnTelefono1}"
                                                    toolTip="BundleParametros.telefono.log_imp_pot"
                                                    headerText="tel&#233;fono"
                                                    id="tableColumnTelefono1" rendered="false"
                                                    sort="telefono">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextTelefono1"
                                                    text="#{currentRow.value['telefono']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelTelefono1}"
                                                    id="labelTelefono1"
                                                    for="campoTelefono1"/>
                                                <webuijsf:textArea id="campoTelefono1"
                                                    binding="#{LogImpPot5.campoTelefono1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['telefono']}"
                                                    toolTip="BundleParametros.telefono.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorTelefono1.validate}"/>
                                                <webuijsf:staticText id="campoTelefono1Texto1"
                                                    binding="#{LogImpPot5.campoTelefono1Texto1}"
                                                    text="#{currentRow.value['telefono']}"/>
                                                <webuijsf:message id="messageTelefono1"
                                                    for="campoTelefono1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnDireccion1}"
                                                    toolTip="BundleParametros.direccion.log_imp_pot"
                                                    headerText="direcci&#243;n"
                                                    id="tableColumnDireccion1" rendered="false"
                                                    sort="direccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDireccion1"
                                                    text="#{currentRow.value['direccion']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelDireccion1}"
                                                    id="labelDireccion1"
                                                    for="campoDireccion1"/>
                                                <webuijsf:textArea id="campoDireccion1"
                                                    binding="#{LogImpPot5.campoDireccion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['direccion']}"
                                                    toolTip="BundleParametros.direccion.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoDireccion1Texto1"
                                                    binding="#{LogImpPot5.campoDireccion1Texto1}"
                                                    text="#{currentRow.value['direccion']}"/>
                                                <webuijsf:message id="messageDireccion1"
                                                    for="campoDireccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnReferencia1}"
                                                    toolTip="BundleParametros.referencia.log_imp_pot"
                                                    headerText="referencia"
                                                    id="tableColumnReferencia1" rendered="false"
                                                    sort="referencia">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextReferencia1"
                                                    text="#{currentRow.value['referencia']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelReferencia1}"
                                                    id="labelReferencia1"
                                                    for="campoReferencia1"/>
                                                <webuijsf:textArea id="campoReferencia1"
                                                    binding="#{LogImpPot5.campoReferencia1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['referencia']}"
                                                    toolTip="BundleParametros.referencia.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorReferencia1.validate}"/>
                                                <webuijsf:staticText id="campoReferencia1Texto1"
                                                    binding="#{LogImpPot5.campoReferencia1Texto1}"
                                                    text="#{currentRow.value['referencia']}"/>
                                                <webuijsf:message id="messageReferencia1"
                                                    for="campoReferencia1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnBarrio1}"
                                                    toolTip="BundleParametros.barrio.log_imp_pot"
                                                    headerText="barrio"
                                                    id="tableColumnBarrio1" rendered="false"
                                                    sort="barrio">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextBarrio1"
                                                    text="#{currentRow.value['barrio']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelBarrio1}"
                                                    id="labelBarrio1"
                                                    for="campoBarrio1"/>
                                                <webuijsf:textArea id="campoBarrio1"
                                                    binding="#{LogImpPot5.campoBarrio1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['barrio']}"
                                                    toolTip="BundleParametros.barrio.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorBarrio1.validate}"/>
                                                <webuijsf:staticText id="campoBarrio1Texto1"
                                                    binding="#{LogImpPot5.campoBarrio1Texto1}"
                                                    text="#{currentRow.value['barrio']}"/>
                                                <webuijsf:message id="messageBarrio1"
                                                    for="campoBarrio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnNombreReferente1}"
                                                    toolTip="BundleParametros.nombre_referente.log_imp_pot"
                                                    headerText="nombre referente"
                                                    id="tableColumnNombreReferente1" rendered="false"
                                                    sort="nombre_referente">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreReferente1"
                                                    text="#{currentRow.value['nombre_referente']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelNombreReferente1}"
                                                    id="labelNombreReferente1"
                                                    for="campoNombreReferente1"/>
                                                <webuijsf:textArea id="campoNombreReferente1"
                                                    binding="#{LogImpPot5.campoNombreReferente1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_referente']}"
                                                    toolTip="BundleParametros.nombre_referente.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorNombreReferente1.validate}"/>
                                                <webuijsf:staticText id="campoNombreReferente1Texto1"
                                                    binding="#{LogImpPot5.campoNombreReferente1Texto1}"
                                                    text="#{currentRow.value['nombre_referente']}"/>
                                                <webuijsf:message id="messageNombreReferente1"
                                                    for="campoNombreReferente1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnTelefonoReferente1}"
                                                    toolTip="BundleParametros.telefono_referente.log_imp_pot"
                                                    headerText="tel&#233;fono referente"
                                                    id="tableColumnTelefonoReferente1" rendered="false"
                                                    sort="telefono_referente">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextTelefonoReferente1"
                                                    text="#{currentRow.value['telefono_referente']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelTelefonoReferente1}"
                                                    id="labelTelefonoReferente1"
                                                    for="campoTelefonoReferente1"/>
                                                <webuijsf:textArea id="campoTelefonoReferente1"
                                                    binding="#{LogImpPot5.campoTelefonoReferente1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['telefono_referente']}"
                                                    toolTip="BundleParametros.telefono_referente.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorTelefonoReferente1.validate}"/>
                                                <webuijsf:staticText id="campoTelefonoReferente1Texto1"
                                                    binding="#{LogImpPot5.campoTelefonoReferente1Texto1}"
                                                    text="#{currentRow.value['telefono_referente']}"/>
                                                <webuijsf:message id="messageTelefonoReferente1"
                                                    for="campoTelefonoReferente1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnEsImportado1}"
                                                    toolTip="BundleParametros.es_importado.log_imp_pot"
                                                    headerText="importado"
                                                    id="tableColumnEsImportado1"
                                                    sort="es_importado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsImportado1"
                                                    text="#{currentRow.value['es_importado']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpPot5.listaEsImportado1}"
                                                    converter="#{LogImpPot5.converterEsImportado1}"
                                                    disabled="#{LogImpPot5.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpPot5.asistente.opcionesListaEsImportado1}"
                                                    selected="#{currentRow.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_pot"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpPot5.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnObservacion1}"
                                                    toolTip="BundleParametros.observacion.log_imp_pot"
                                                    headerText="observaci&#243;n"
                                                    id="tableColumnObservacion1"
                                                    sort="observacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacion1"
                                                    text="#{currentRow.value['observacion']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpPot5.campoObservacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpPot5.campoObservacion1Texto1}"
                                                    text="#{currentRow.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnFechaHoraTransaccion1}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_pot"
                                                    headerText="fecha hora transacci&#243;n"
                                                    id="tableColumnFechaHoraTransaccion1"
                                                    sort="fecha_hora_transaccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraTransaccion1"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpPot5.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpPot5.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_pot"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpPot5.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpPot5.converterFechaHoraTransaccion1}"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnNombreArchivo1}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_pot"
                                                    headerText="nombre archivo"
                                                    id="tableColumnNombreArchivo1" rendered="false"
                                                    sort="nombre_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivo1"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpPot5.campoNombreArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpPot5.campoNombreArchivo1Texto1}"
                                                    text="#{currentRow.value['nombre_archivo']}"/>
                                                <webuijsf:message id="messageNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnNombreArchivo3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivo3"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogImpPot5.campoNombreArchivo1Boton3}"
                                                    id="campoNombreArchivo1Boton3"
                                                    onClick="#{LogImpPot5.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpPot5.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpPot5.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpPot5.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnCodigoArchivo1}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_pot"
                                                    headerText="c&#243;digo archivo"
                                                    id="tableColumnCodigoArchivo1" rendered="false"
                                                    sort="codigo_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoArchivo1"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpPot5.campoCodigoArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_pot"
                                                    validatorExpression="#{LogImpPot5.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpPot5.campoCodigoArchivo1Texto1}"
                                                    text="#{currentRow.value['codigo_archivo']}"/>
                                                <webuijsf:message id="messageCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPot5.tableColumnIdPotencialBen1}"
                                                    toolTip="BundleParametros.id_potencial_ben.log_imp_pot"
                                                    headerText="potencial beneficiario"
                                                    id="tableColumnIdPotencialBen1" rendered="false"
                                                    sort="codigo_potencial_ben_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPotencialBen1"
                                                    text="#{currentRow.value['codigo_potencial_ben_1x1y3']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelIdPotencialBen1}"
                                                    id="labelIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                <webuijsf:textField id="campoIdPotencialBen1"
                                                    binding="#{LogImpPot5.campoIdPotencialBen1}"
                                                    readOnly="#{LogImpPot5.gestor.filaNoProcesada}"
                                                    text="#{LogImpPot5.asistente.textoCampoIdPotencialBen1}"
                                                    toolTip="#{LogImpPot5.asistente.toolTipCampoIdPotencialBen1}"
                                                    validatorExpression="#{LogImpPot5.campoIdPotencialBen1_validate}"/>
                                                <webuijsf:staticText id="campoIdPotencialBen1Texto1"
                                                    binding="#{LogImpPot5.campoIdPotencialBen1Texto1}"
                                                    text="#{currentRow.value['codigo_potencial_ben_1x1y3']}"/>
                                                <webuijsf:message id="messageIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdPotencialBen3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPotencialBen3"
                                                    text="#{currentRow.value['id_potencial_ben']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogImpPot5.campoIdPotencialBen1Boton1}"
                                                    id="campoIdPotencialBen1Boton1"
                                                    onClick="#{LogImpPot5.asistente.scriptCampoIdPotencialBen1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{LogImpPot5.campoIdPotencialBen1Boton3}"
                                                    id="campoIdPotencialBen1Boton3"
                                                    onClick="#{LogImpPot5.asistente.scriptCampoIdPotencialBen1Boton2}"
                                                    rendered="#{LogImpPot5.asistente.campoIdPotencialBen1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{LogImpPot5.tableColumnIdPotencialBen2}"
                                                    headerText="nombre potencial beneficiario"
                                                    id="tableColumnIdPotencialBen2" rendered="false"
                                                    sort="nombre_potencial_ben_1x1y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPotencialBen2"
                                                    text="#{currentRow.value['nombre_potencial_ben_1x1y4']}"
                                                    rendered="#{LogImpPot5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPot5.labelIdPotencialBen2}"
                                                    id="labelIdPotencialBen2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{LogImpPot5.campoIdPotencialBen1Hiper1}"
                                                    id="campoIdPotencialBen1Hiper1"
                                                    text="#{currentRow.value['nombre_potencial_ben_1x1y4']}"
                                                    onClick="#{LogImpPot5.asistente.scriptCampoIdPotencialBen1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdPotencialBen1Boton2"
                                                    rendered="false"/>
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
                                                        binding="#{LogImpPot5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{LogImpPot5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{LogImpPot5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{LogImpPot5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{LogImpPot5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{LogImpPot5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{LogImpPot5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPot5.botonRepaginar1_action}"
                                                        binding="#{LogImpPot5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{LogImpPot5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{LogImpPot5.gestor.scriptRepaginar}"
                                                        text="#{LogImpPot5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{LogImpPot5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot5.botonAgregar1_action}"
                                                    binding="#{LogImpPot5.botonAgregar1}"
                                                    disabled="#{LogImpPot5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpPot5.gestor.scriptAgregar}"
                                                    rendered="#{LogImpPot5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpPot5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpPot5.listaFuncionEdicion1}"
                                                    converter="#{LogImpPot5.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpPot5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpPot5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpPot5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpPot5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpPot5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot5.botonEditar1_action}"
                                                    binding="#{LogImpPot5.botonEditar1}"
                                                    disabled="#{LogImpPot5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpPot5.gestor.scriptEditar}"
                                                    rendered="#{LogImpPot5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpPot5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot5.botonEliminar1_action}"
                                                    binding="#{LogImpPot5.botonEliminar1}"
                                                    disabled="#{LogImpPot5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpPot5.gestor.scriptEliminar}"
                                                    rendered="#{LogImpPot5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpPot5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot5.botonAplicar1_action}"
                                                    binding="#{LogImpPot5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpPot5.gestor.scriptAplicar}"
                                                    rendered="#{LogImpPot5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpPot5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot5.botonDeshacer1_action}"
                                                    binding="#{LogImpPot5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpPot5.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpPot5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpPot5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot5.botonConfirmar1_action}"
                                                    binding="#{LogImpPot5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpPot5.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpPot5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpPot5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot5.botonDescartar1_action}"
                                                    binding="#{LogImpPot5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpPot5.gestor.scriptDescartar}"
                                                    rendered="#{LogImpPot5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpPot5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpPot5.listaFuncionAccion1}"
                                                    converter="#{LogImpPot5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpPot5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpPot5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpPot5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpPot5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot5.botonProcesar1_action}"
                                                    binding="#{LogImpPot5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpPot5.gestor.scriptProcesar}"
                                                    rendered="#{LogImpPot5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpPot5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot5.botonRefrescar1_action}"
                                                    binding="#{LogImpPot5.botonRefrescar1}"
                                                    disabled="#{LogImpPot5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpPot5.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpPot5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpPot5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot5.botonReconsultar1_action}"
                                                    binding="#{LogImpPot5.botonReconsultar1}"
                                                    disabled="#{LogImpPot5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpPot5.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpPot5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpPot5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPot5.botonRetornar1_action}"
                                                    binding="#{LogImpPot5.botonRetornar1}"
                                                    disabled="#{LogImpPot5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpPot5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpPot5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPot5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpPot5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{LogImpPot5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpPot5.imageHyperlink1_action}"
                                                    binding="#{LogImpPot5.imageHyperlink1}"
                                                    disabled="#{LogImpPot5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpPot5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpPot5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpPot5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpPot5_imageHyperlink1_toolTip}"/>
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
