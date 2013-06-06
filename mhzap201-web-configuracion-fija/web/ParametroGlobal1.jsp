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
                    focus="#{ParametroGlobal1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{ParametroGlobal1.gestor.preserveFocus}"
                    preserveScroll="#{ParametroGlobal1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{ParametroGlobal1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoNumeroParametroGlobal1 campoMontoSalarioMinimo1 campoPorcentajePensionAlimentaria1 listaEsControlCerVidaActivo1 campoMesesValidezCertificadoVida1 listaEsControlCobroPensionActiv1 campoMesesUltimoCobroPension1 listaEsControlReprocesoPenActiv1 campoLimiteIndiceCalidadVida1 campoLimitePensiones1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{ParametroGlobal1.breadcrumbs1}" 
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
                                                    rendered="#{ParametroGlobal1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{ParametroGlobal1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{ParametroGlobal1.gestor.mensajeDisponible}"
                                                    text="#{ParametroGlobal1.gestor.mensaje}"
                                                    url="#{ParametroGlobal1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{ParametroGlobal1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{ParametroGlobal1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{ParametroGlobal1.gestor.filaEscogida}" 
                                                sourceData="#{ParametroGlobal1.parametroGlobalDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{ParametroGlobal1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{ParametroGlobal1.gestor.scriptElegir}" 
                                                        selected="#{ParametroGlobal1.gestor.filaElegida}" 
                                                        toolTip="#{ParametroGlobal1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{ParametroGlobal1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{ParametroGlobal1.botonEscogerFila1_action}"
                                                        binding="#{ParametroGlobal1.botonEscogerFila1}"
                                                        disabled="#{ParametroGlobal1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{ParametroGlobal1.gestor.urlImagenEscoger}" 
                                                        onClick="#{ParametroGlobal1.gestor.scriptEscoger}"
                                                        text="#{ParametroGlobal1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{ParametroGlobal1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ParametroGlobal1.botonDetallarFila1_action}"
                                                        binding="#{ParametroGlobal1.botonDetallarFila1}"
                                                        disabled="#{ParametroGlobal1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{ParametroGlobal1.gestor.urlImagenDetallar}" 
                                                        onClick="#{ParametroGlobal1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{ParametroGlobal1.gestor.detalleDisponible}" 
                                                        text="#{ParametroGlobal1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{ParametroGlobal1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ParametroGlobal1.botonProcesarFila1_action}"
                                                        binding="#{ParametroGlobal1.botonProcesarFila1}"
                                                        disabled="#{ParametroGlobal1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{ParametroGlobal1.gestor.urlImagenProcesar}" 
                                                        onClick="#{ParametroGlobal1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{ParametroGlobal1.asistente.comandoDisponible}" 
                                                        text="#{ParametroGlobal1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ParametroGlobal1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ParametroGlobal1.botonRetornarFila1_action}"
                                                        binding="#{ParametroGlobal1.botonRetornarFila1}" 
                                                        disabled="#{ParametroGlobal1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{ParametroGlobal1.gestor.urlImagenRetornar}"
                                                        onClick="#{ParametroGlobal1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{ParametroGlobal1.gestor.funcionReturnVisible}" 
                                                        text="#{ParametroGlobal1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{ParametroGlobal1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ParametroGlobal1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{ParametroGlobal1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{ParametroGlobal1.hipervinculoAccionFila1_action}"
                                                        binding="#{ParametroGlobal1.hipervinculoAccionFila1}"
                                                        disabled="#{ParametroGlobal1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{ParametroGlobal1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{ParametroGlobal1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.ParametroGlobal1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{ParametroGlobal1.tableColumn3}" 
                                                    headerText="#{ParametroGlobal1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{ParametroGlobal1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{ParametroGlobal1.hipervinculoDetallarFila1_action}"
                                                        binding="#{ParametroGlobal1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{ParametroGlobal1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{ParametroGlobal1.gestor.identificacionFila}" 
                                                        toolTip="#{ParametroGlobal1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ParametroGlobal1.tableColumnNumeroParametroGlobal1}"
                                                    toolTip="BundleParametros.numero_parametro_global.parametro_global"
                                                    headerText="n&#250;mero"
                                                    id="tableColumnNumeroParametroGlobal1"
                                                    sort="numero_parametro_global">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroParametroGlobal1"
                                                    text="#{currentRow.value['numero_parametro_global']}"
                                                    rendered="#{ParametroGlobal1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ParametroGlobal1.labelNumeroParametroGlobal1}"
                                                    id="labelNumeroParametroGlobal1"
                                                    for="campoNumeroParametroGlobal1"/>
                                                <webuijsf:textField id="campoNumeroParametroGlobal1"
                                                    binding="#{ParametroGlobal1.campoNumeroParametroGlobal1}"
                                                    converter="#{ParametroGlobal1.converterNumeroParametroGlobal1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['numero_parametro_global']}"
                                                    toolTip="BundleParametros.numero_parametro_global.parametro_global"
                                                    validatorExpression="#{ParametroGlobal1.validatorNumeroParametroGlobal1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroParametroGlobal1Texto1"
                                                    binding="#{ParametroGlobal1.campoNumeroParametroGlobal1Texto1}"
                                                    text="#{currentRow.value['numero_parametro_global']}"/>
                                                <webuijsf:message id="messageNumeroParametroGlobal1"
                                                    for="campoNumeroParametroGlobal1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ParametroGlobal1.tableColumnMontoSalarioMinimo1}"
                                                    toolTip="BundleParametros.monto_salario_minimo.parametro_global"
                                                    headerText="monto salario minimo"
                                                    id="tableColumnMontoSalarioMinimo1"
                                                    sort="monto_salario_minimo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoSalarioMinimo1"
                                                    text="#{currentRow.value['monto_salario_minimo']}"
                                                    rendered="#{ParametroGlobal1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ParametroGlobal1.labelMontoSalarioMinimo1}"
                                                    id="labelMontoSalarioMinimo1"
                                                    for="campoMontoSalarioMinimo1"/>
                                                <webuijsf:textField id="campoMontoSalarioMinimo1"
                                                    binding="#{ParametroGlobal1.campoMontoSalarioMinimo1}"
                                                    converter="#{ParametroGlobal1.converterMontoSalarioMinimo1}"
                                                    readOnly="#{ParametroGlobal1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['monto_salario_minimo']}"
                                                    toolTip="BundleParametros.monto_salario_minimo.parametro_global"
                                                    validatorExpression="#{ParametroGlobal1.validatorMontoSalarioMinimo1.validate}"/>
                                                <webuijsf:staticText id="campoMontoSalarioMinimo1Texto1"
                                                    binding="#{ParametroGlobal1.campoMontoSalarioMinimo1Texto1}"
                                                    converter="#{ParametroGlobal1.converterMontoSalarioMinimo1}"
                                                    text="#{currentRow.value['monto_salario_minimo']}"/>
                                                <webuijsf:message id="messageMontoSalarioMinimo1"
                                                    for="campoMontoSalarioMinimo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ParametroGlobal1.tableColumnPorcentajePensionAlimentaria1}"
                                                    toolTip="BundleParametros.porcentaje_pension_alimentaria.parametro_global"
                                                    headerText="porcentaje pensi&#243;n alimentaria"
                                                    id="tableColumnPorcentajePensionAlimentaria1"
                                                    sort="porcentaje_pension_alimentaria">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPorcentajePensionAlimentaria1"
                                                    text="#{currentRow.value['porcentaje_pension_alimentaria']}"
                                                    rendered="#{ParametroGlobal1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ParametroGlobal1.labelPorcentajePensionAlimentaria1}"
                                                    id="labelPorcentajePensionAlimentaria1"
                                                    for="campoPorcentajePensionAlimentaria1"/>
                                                <webuijsf:textField id="campoPorcentajePensionAlimentaria1"
                                                    binding="#{ParametroGlobal1.campoPorcentajePensionAlimentaria1}"
                                                    converter="#{ParametroGlobal1.converterPorcentajePensionAlimentaria1}"
                                                    readOnly="#{ParametroGlobal1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['porcentaje_pension_alimentaria']}"
                                                    toolTip="BundleParametros.porcentaje_pension_alimentaria.parametro_global"
                                                    validatorExpression="#{ParametroGlobal1.validatorPorcentajePensionAlimentaria1.validate}"/>
                                                <webuijsf:staticText id="campoPorcentajePensionAlimentaria1Texto1"
                                                    binding="#{ParametroGlobal1.campoPorcentajePensionAlimentaria1Texto1}"
                                                    converter="#{ParametroGlobal1.converterPorcentajePensionAlimentaria1}"
                                                    text="#{currentRow.value['porcentaje_pension_alimentaria']}"/>
                                                <webuijsf:message id="messagePorcentajePensionAlimentaria1"
                                                    for="campoPorcentajePensionAlimentaria1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ParametroGlobal1.tableColumnEsControlCerVidaActivo1}"
                                                    toolTip="BundleParametros.es_control_cer_vida_activo.parametro_global"
                                                    headerText="control certificado vida activo"
                                                    id="tableColumnEsControlCerVidaActivo1"
                                                    sort="es_control_cer_vida_activo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsControlCerVidaActivo1"
                                                    text="#{currentRow.value['es_control_cer_vida_activo']}"
                                                    rendered="#{ParametroGlobal1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ParametroGlobal1.labelEsControlCerVidaActivo1}"
                                                    id="labelEsControlCerVidaActivo1"
                                                    for="listaEsControlCerVidaActivo1"/>
                                                <webuijsf:dropDown id="listaEsControlCerVidaActivo1"
                                                    binding="#{ParametroGlobal1.listaEsControlCerVidaActivo1}"
                                                    converter="#{ParametroGlobal1.converterEsControlCerVidaActivo1}"
                                                    disabled="#{ParametroGlobal1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ParametroGlobal1.asistente.opcionesListaEsControlCerVidaActivo1}"
                                                    selected="#{currentRow.value['es_control_cer_vida_activo']}"
                                                    toolTip="BundleParametros.es_control_cer_vida_activo.parametro_global"/>
                                                <webuijsf:staticText id="listaEsControlCerVidaActivo1Texto1"
                                                    binding="#{ParametroGlobal1.listaEsControlCerVidaActivo1Texto1}"/>
                                                <webuijsf:message id="messageEsControlCerVidaActivo1"
                                                    for="listaEsControlCerVidaActivo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ParametroGlobal1.tableColumnMesesValidezCertificadoVida1}"
                                                    toolTip="BundleParametros.meses_validez_certificado_vida.parametro_global"
                                                    headerText="meses validez certificado vida"
                                                    id="tableColumnMesesValidezCertificadoVida1"
                                                    sort="meses_validez_certificado_vida">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMesesValidezCertificadoVida1"
                                                    text="#{currentRow.value['meses_validez_certificado_vida']}"
                                                    rendered="#{ParametroGlobal1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ParametroGlobal1.labelMesesValidezCertificadoVida1}"
                                                    id="labelMesesValidezCertificadoVida1"
                                                    for="campoMesesValidezCertificadoVida1"/>
                                                <webuijsf:textField id="campoMesesValidezCertificadoVida1"
                                                    binding="#{ParametroGlobal1.campoMesesValidezCertificadoVida1}"
                                                    converter="#{ParametroGlobal1.converterMesesValidezCertificadoVida1}"
                                                    readOnly="#{ParametroGlobal1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['meses_validez_certificado_vida']}"
                                                    toolTip="BundleParametros.meses_validez_certificado_vida.parametro_global"
                                                    validatorExpression="#{ParametroGlobal1.validatorMesesValidezCertificadoVida1.validate}"/>
                                                <webuijsf:staticText id="campoMesesValidezCertificadoVida1Texto1"
                                                    binding="#{ParametroGlobal1.campoMesesValidezCertificadoVida1Texto1}"
                                                    text="#{currentRow.value['meses_validez_certificado_vida']}"/>
                                                <webuijsf:message id="messageMesesValidezCertificadoVida1"
                                                    for="campoMesesValidezCertificadoVida1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ParametroGlobal1.tableColumnEsControlCobroPensionActiv1}"
                                                    toolTip="BundleParametros.es_control_cobro_pension_activ.parametro_global"
                                                    headerText="control cobro pensi&#243;n activo"
                                                    id="tableColumnEsControlCobroPensionActiv1"
                                                    sort="es_control_cobro_pension_activ">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsControlCobroPensionActiv1"
                                                    text="#{currentRow.value['es_control_cobro_pension_activ']}"
                                                    rendered="#{ParametroGlobal1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ParametroGlobal1.labelEsControlCobroPensionActiv1}"
                                                    id="labelEsControlCobroPensionActiv1"
                                                    for="listaEsControlCobroPensionActiv1"/>
                                                <webuijsf:dropDown id="listaEsControlCobroPensionActiv1"
                                                    binding="#{ParametroGlobal1.listaEsControlCobroPensionActiv1}"
                                                    converter="#{ParametroGlobal1.converterEsControlCobroPensionActiv1}"
                                                    disabled="#{ParametroGlobal1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ParametroGlobal1.asistente.opcionesListaEsControlCobroPensionActiv1}"
                                                    selected="#{currentRow.value['es_control_cobro_pension_activ']}"
                                                    toolTip="BundleParametros.es_control_cobro_pension_activ.parametro_global"/>
                                                <webuijsf:staticText id="listaEsControlCobroPensionActiv1Texto1"
                                                    binding="#{ParametroGlobal1.listaEsControlCobroPensionActiv1Texto1}"/>
                                                <webuijsf:message id="messageEsControlCobroPensionActiv1"
                                                    for="listaEsControlCobroPensionActiv1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ParametroGlobal1.tableColumnMesesUltimoCobroPension1}"
                                                    toolTip="BundleParametros.meses_ultimo_cobro_pension.parametro_global"
                                                    headerText="meses ultimo cobro pensi&#243;n"
                                                    id="tableColumnMesesUltimoCobroPension1"
                                                    sort="meses_ultimo_cobro_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMesesUltimoCobroPension1"
                                                    text="#{currentRow.value['meses_ultimo_cobro_pension']}"
                                                    rendered="#{ParametroGlobal1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ParametroGlobal1.labelMesesUltimoCobroPension1}"
                                                    id="labelMesesUltimoCobroPension1"
                                                    for="campoMesesUltimoCobroPension1"/>
                                                <webuijsf:textField id="campoMesesUltimoCobroPension1"
                                                    binding="#{ParametroGlobal1.campoMesesUltimoCobroPension1}"
                                                    converter="#{ParametroGlobal1.converterMesesUltimoCobroPension1}"
                                                    readOnly="#{ParametroGlobal1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['meses_ultimo_cobro_pension']}"
                                                    toolTip="BundleParametros.meses_ultimo_cobro_pension.parametro_global"
                                                    validatorExpression="#{ParametroGlobal1.validatorMesesUltimoCobroPension1.validate}"/>
                                                <webuijsf:staticText id="campoMesesUltimoCobroPension1Texto1"
                                                    binding="#{ParametroGlobal1.campoMesesUltimoCobroPension1Texto1}"
                                                    text="#{currentRow.value['meses_ultimo_cobro_pension']}"/>
                                                <webuijsf:message id="messageMesesUltimoCobroPension1"
                                                    for="campoMesesUltimoCobroPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ParametroGlobal1.tableColumnEsControlReprocesoPenActiv1}"
                                                    toolTip="BundleParametros.es_control_reproceso_pen_activ.parametro_global"
                                                    headerText="control reproceso pensi&#243;n activo"
                                                    id="tableColumnEsControlReprocesoPenActiv1"
                                                    sort="es_control_reproceso_pen_activ">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsControlReprocesoPenActiv1"
                                                    text="#{currentRow.value['es_control_reproceso_pen_activ']}"
                                                    rendered="#{ParametroGlobal1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ParametroGlobal1.labelEsControlReprocesoPenActiv1}"
                                                    id="labelEsControlReprocesoPenActiv1"
                                                    for="listaEsControlReprocesoPenActiv1"/>
                                                <webuijsf:dropDown id="listaEsControlReprocesoPenActiv1"
                                                    binding="#{ParametroGlobal1.listaEsControlReprocesoPenActiv1}"
                                                    converter="#{ParametroGlobal1.converterEsControlReprocesoPenActiv1}"
                                                    disabled="#{ParametroGlobal1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ParametroGlobal1.asistente.opcionesListaEsControlReprocesoPenActiv1}"
                                                    selected="#{currentRow.value['es_control_reproceso_pen_activ']}"
                                                    toolTip="BundleParametros.es_control_reproceso_pen_activ.parametro_global"/>
                                                <webuijsf:staticText id="listaEsControlReprocesoPenActiv1Texto1"
                                                    binding="#{ParametroGlobal1.listaEsControlReprocesoPenActiv1Texto1}"/>
                                                <webuijsf:message id="messageEsControlReprocesoPenActiv1"
                                                    for="listaEsControlReprocesoPenActiv1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ParametroGlobal1.tableColumnLimiteIndiceCalidadVida1}"
                                                    toolTip="BundleParametros.limite_indice_calidad_vida.parametro_global"
                                                    headerText="limite indice calidad vida"
                                                    id="tableColumnLimiteIndiceCalidadVida1"
                                                    sort="limite_indice_calidad_vida">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextLimiteIndiceCalidadVida1"
                                                    text="#{currentRow.value['limite_indice_calidad_vida']}"
                                                    rendered="#{ParametroGlobal1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ParametroGlobal1.labelLimiteIndiceCalidadVida1}"
                                                    id="labelLimiteIndiceCalidadVida1"
                                                    for="campoLimiteIndiceCalidadVida1"/>
                                                <webuijsf:textField id="campoLimiteIndiceCalidadVida1"
                                                    binding="#{ParametroGlobal1.campoLimiteIndiceCalidadVida1}"
                                                    converter="#{ParametroGlobal1.converterLimiteIndiceCalidadVida1}"
                                                    readOnly="#{ParametroGlobal1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['limite_indice_calidad_vida']}"
                                                    toolTip="BundleParametros.limite_indice_calidad_vida.parametro_global"
                                                    validatorExpression="#{ParametroGlobal1.validatorLimiteIndiceCalidadVida1.validate}"/>
                                                <webuijsf:staticText id="campoLimiteIndiceCalidadVida1Texto1"
                                                    binding="#{ParametroGlobal1.campoLimiteIndiceCalidadVida1Texto1}"
                                                    converter="#{ParametroGlobal1.converterLimiteIndiceCalidadVida1}"
                                                    text="#{currentRow.value['limite_indice_calidad_vida']}"/>
                                                <webuijsf:message id="messageLimiteIndiceCalidadVida1"
                                                    for="campoLimiteIndiceCalidadVida1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ParametroGlobal1.tableColumnLimitePensiones1}"
                                                    toolTip="BundleParametros.limite_pensiones.parametro_global"
                                                    headerText="limite pensiones"
                                                    id="tableColumnLimitePensiones1"
                                                    sort="limite_pensiones">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextLimitePensiones1"
                                                    text="#{currentRow.value['limite_pensiones']}"
                                                    rendered="#{ParametroGlobal1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ParametroGlobal1.labelLimitePensiones1}"
                                                    id="labelLimitePensiones1"
                                                    for="campoLimitePensiones1"/>
                                                <webuijsf:textField id="campoLimitePensiones1"
                                                    binding="#{ParametroGlobal1.campoLimitePensiones1}"
                                                    converter="#{ParametroGlobal1.converterLimitePensiones1}"
                                                    readOnly="#{ParametroGlobal1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['limite_pensiones']}"
                                                    toolTip="BundleParametros.limite_pensiones.parametro_global"
                                                    validatorExpression="#{ParametroGlobal1.validatorLimitePensiones1.validate}"/>
                                                <webuijsf:staticText id="campoLimitePensiones1Texto1"
                                                    binding="#{ParametroGlobal1.campoLimitePensiones1Texto1}"
                                                    text="#{currentRow.value['limite_pensiones']}"/>
                                                <webuijsf:message id="messageLimitePensiones1"
                                                    for="campoLimitePensiones1"/>
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
                                                        binding="#{ParametroGlobal1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{ParametroGlobal1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{ParametroGlobal1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{ParametroGlobal1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{ParametroGlobal1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{ParametroGlobal1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{ParametroGlobal1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ParametroGlobal1.botonRepaginar1_action}"
                                                        binding="#{ParametroGlobal1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{ParametroGlobal1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{ParametroGlobal1.gestor.scriptRepaginar}"
                                                        text="#{ParametroGlobal1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{ParametroGlobal1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{ParametroGlobal1.botonAgregar1_action}"
                                                    binding="#{ParametroGlobal1.botonAgregar1}"
                                                    disabled="#{ParametroGlobal1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{ParametroGlobal1.gestor.scriptAgregar}"
                                                    rendered="#{ParametroGlobal1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ParametroGlobal1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{ParametroGlobal1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ParametroGlobal1.listaFuncionEdicion1}"
                                                    converter="#{ParametroGlobal1.converterListaFuncionEdicion1}"
                                                    disabled="#{ParametroGlobal1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{ParametroGlobal1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ParametroGlobal1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ParametroGlobal1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{ParametroGlobal1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ParametroGlobal1.botonEditar1_action}"
                                                    binding="#{ParametroGlobal1.botonEditar1}"
                                                    disabled="#{ParametroGlobal1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{ParametroGlobal1.gestor.scriptEditar}"
                                                    rendered="#{ParametroGlobal1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ParametroGlobal1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{ParametroGlobal1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ParametroGlobal1.botonEliminar1_action}"
                                                    binding="#{ParametroGlobal1.botonEliminar1}"
                                                    disabled="#{ParametroGlobal1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{ParametroGlobal1.gestor.scriptEliminar}"
                                                    rendered="#{ParametroGlobal1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ParametroGlobal1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{ParametroGlobal1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ParametroGlobal1.botonAplicar1_action}"
                                                    binding="#{ParametroGlobal1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{ParametroGlobal1.gestor.scriptAplicar}"
                                                    rendered="#{ParametroGlobal1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ParametroGlobal1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{ParametroGlobal1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ParametroGlobal1.botonDeshacer1_action}"
                                                    binding="#{ParametroGlobal1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{ParametroGlobal1.gestor.scriptDeshacer}"
                                                    rendered="#{ParametroGlobal1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ParametroGlobal1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{ParametroGlobal1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ParametroGlobal1.botonConfirmar1_action}"
                                                    binding="#{ParametroGlobal1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{ParametroGlobal1.gestor.scriptConfirmar}"
                                                    rendered="#{ParametroGlobal1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ParametroGlobal1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{ParametroGlobal1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ParametroGlobal1.botonDescartar1_action}"
                                                    binding="#{ParametroGlobal1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{ParametroGlobal1.gestor.scriptDescartar}"
                                                    rendered="#{ParametroGlobal1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ParametroGlobal1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{ParametroGlobal1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ParametroGlobal1.listaFuncionAccion1}"
                                                    converter="#{ParametroGlobal1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{ParametroGlobal1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{ParametroGlobal1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{ParametroGlobal1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{ParametroGlobal1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ParametroGlobal1.botonProcesar1_action}"
                                                    binding="#{ParametroGlobal1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{ParametroGlobal1.gestor.scriptProcesar}"
                                                    rendered="#{ParametroGlobal1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ParametroGlobal1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{ParametroGlobal1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ParametroGlobal1.botonRefrescar1_action}"
                                                    binding="#{ParametroGlobal1.botonRefrescar1}"
                                                    disabled="#{ParametroGlobal1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{ParametroGlobal1.gestor.scriptRefrescar}"
                                                    rendered="#{ParametroGlobal1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ParametroGlobal1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{ParametroGlobal1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ParametroGlobal1.botonReconsultar1_action}"
                                                    binding="#{ParametroGlobal1.botonReconsultar1}"
                                                    disabled="#{ParametroGlobal1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{ParametroGlobal1.gestor.scriptReconsultar}"
                                                    rendered="#{ParametroGlobal1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ParametroGlobal1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{ParametroGlobal1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ParametroGlobal1.botonRetornar1_action}"
                                                    binding="#{ParametroGlobal1.botonRetornar1}"
                                                    disabled="#{ParametroGlobal1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{ParametroGlobal1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ParametroGlobal1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ParametroGlobal1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{ParametroGlobal1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{ParametroGlobal1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ParametroGlobal1.imageHyperlink1_action}"
                                                    binding="#{ParametroGlobal1.imageHyperlink1}"
                                                    disabled="#{ParametroGlobal1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{ParametroGlobal1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ParametroGlobal1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{ParametroGlobal1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.ParametroGlobal1_imageHyperlink1_toolTip}"/>
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
