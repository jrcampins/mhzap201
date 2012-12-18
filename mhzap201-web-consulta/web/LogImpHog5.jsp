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
                    focus="#{LogImpHog5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpHog5.gestor.preserveFocus}"
                    preserveScroll="#{LogImpHog5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpHog5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdLogImpHog1 campoP20d1 campoP20m1 campoP20a1 campoP171 campoP181 campoVar000011 campoP191 campoObservaciones1 campoUtm1 campoGps1 campoOrden1 campoCoordx1 campoP01a1 campoP01b1 campoP01c1 campoP01d1 campoP021 campoP031 campoP041 campoP051 campoP061 campoP081 campoP071 campoP091 campoP141 campoP151 campoP161 campoP241 campoP251 campoP261 campoP271 campoP27e1 campoP28a1 campoP28b1 campoP291 campoP301 campoP311 campoP321 campoP331 campoP341 campoP351 campoP361 campoP371 campoNroCelular1 campoP381 campoNroLineaBaja1 campoP3911 campoP3921 campoP3931 campoP3941 campoP3951 campoP3961 campoP3971 campoP42n1 campoP42ci1 campoLetraCi1 campoP431 campoVar000021 campoVar000031 campoVar000041 campoP1041 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpHog5.breadcrumbs1}" 
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
                                                    rendered="#{LogImpHog5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpHog5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpHog5.gestor.mensajeDisponible}"
                                                    text="#{LogImpHog5.gestor.mensaje}"
                                                    url="#{LogImpHog5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{LogImpHog5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{LogImpHog5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{LogImpHog5.gestor.filaEscogida}" 
                                                sourceData="#{LogImpHog5.logImpHogDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{LogImpHog5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{LogImpHog5.gestor.scriptElegir}" 
                                                        selected="#{LogImpHog5.gestor.filaElegida}" 
                                                        toolTip="#{LogImpHog5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{LogImpHog5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpHog5.botonEscogerFila1_action}"
                                                        binding="#{LogImpHog5.botonEscogerFila1}"
                                                        disabled="#{LogImpHog5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{LogImpHog5.gestor.urlImagenEscoger}" 
                                                        onClick="#{LogImpHog5.gestor.scriptEscoger}"
                                                        text="#{LogImpHog5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{LogImpHog5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpHog5.botonDetallarFila1_action}"
                                                        binding="#{LogImpHog5.botonDetallarFila1}"
                                                        disabled="#{LogImpHog5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{LogImpHog5.gestor.urlImagenDetallar}" 
                                                        onClick="#{LogImpHog5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{LogImpHog5.gestor.detalleDisponible}" 
                                                        text="#{LogImpHog5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{LogImpHog5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpHog5.botonProcesarFila1_action}"
                                                        binding="#{LogImpHog5.botonProcesarFila1}"
                                                        disabled="#{LogImpHog5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpHog5.gestor.urlImagenProcesar}" 
                                                        onClick="#{LogImpHog5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpHog5.asistente.comandoDisponible}" 
                                                        text="#{LogImpHog5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpHog5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpHog5.botonRetornarFila1_action}"
                                                        binding="#{LogImpHog5.botonRetornarFila1}" 
                                                        disabled="#{LogImpHog5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{LogImpHog5.gestor.urlImagenRetornar}"
                                                        onClick="#{LogImpHog5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{LogImpHog5.gestor.funcionReturnVisible}" 
                                                        text="#{LogImpHog5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{LogImpHog5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{LogImpHog5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{LogImpHog5.hipervinculoAccionFila1_action}"
                                                        binding="#{LogImpHog5.hipervinculoAccionFila1}"
                                                        disabled="#{LogImpHog5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{LogImpHog5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{LogImpHog5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.LogImpHog5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{LogImpHog5.tableColumn3}" 
                                                    headerText="#{LogImpHog5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpHog5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{LogImpHog5.hipervinculoDetallarFila1_action}"
                                                        binding="#{LogImpHog5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{LogImpHog5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{LogImpHog5.gestor.identificacionFila}" 
                                                        toolTip="#{LogImpHog5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnIdLogImpHog1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdLogImpHog1" rendered="false"
                                                    sort="id_log_imp_hog">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdLogImpHog1"
                                                    text="#{currentRow.value['id_log_imp_hog']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelIdLogImpHog1}"
                                                    id="labelIdLogImpHog1"
                                                    for="campoIdLogImpHog1"/>
                                                <webuijsf:textField id="campoIdLogImpHog1"
                                                    binding="#{LogImpHog5.campoIdLogImpHog1}"
                                                    converter="#{LogImpHog5.converterIdLogImpHog1}"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_log_imp_hog']}"
                                                    toolTip="BundleParametros.id_log_imp_hog.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorIdLogImpHog1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpHog1Texto1"
                                                    binding="#{LogImpHog5.campoIdLogImpHog1Texto1}"
                                                    text="#{currentRow.value['id_log_imp_hog']}"/>
                                                <webuijsf:message id="messageIdLogImpHog1"
                                                    for="campoIdLogImpHog1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP20d1}"
                                                    headerText="p20d"
                                                    id="tableColumnP20d1" rendered="false"
                                                    sort="p20d">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP20d1"
                                                    text="#{currentRow.value['p20d']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP20d1}"
                                                    id="labelP20d1"
                                                    for="campoP20d1"/>
                                                <webuijsf:textArea id="campoP20d1"
                                                    binding="#{LogImpHog5.campoP20d1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p20d']}"
                                                    toolTip="BundleParametros.p20d.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP20d1.validate}"/>
                                                <webuijsf:staticText id="campoP20d1Texto1"
                                                    binding="#{LogImpHog5.campoP20d1Texto1}"
                                                    text="#{currentRow.value['p20d']}"/>
                                                <webuijsf:message id="messageP20d1"
                                                    for="campoP20d1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP20m1}"
                                                    headerText="p20m"
                                                    id="tableColumnP20m1" rendered="false"
                                                    sort="p20m">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP20m1"
                                                    text="#{currentRow.value['p20m']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP20m1}"
                                                    id="labelP20m1"
                                                    for="campoP20m1"/>
                                                <webuijsf:textArea id="campoP20m1"
                                                    binding="#{LogImpHog5.campoP20m1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p20m']}"
                                                    toolTip="BundleParametros.p20m.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP20m1.validate}"/>
                                                <webuijsf:staticText id="campoP20m1Texto1"
                                                    binding="#{LogImpHog5.campoP20m1Texto1}"
                                                    text="#{currentRow.value['p20m']}"/>
                                                <webuijsf:message id="messageP20m1"
                                                    for="campoP20m1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP20a1}"
                                                    headerText="p20a"
                                                    id="tableColumnP20a1" rendered="false"
                                                    sort="p20a">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP20a1"
                                                    text="#{currentRow.value['p20a']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP20a1}"
                                                    id="labelP20a1"
                                                    for="campoP20a1"/>
                                                <webuijsf:textArea id="campoP20a1"
                                                    binding="#{LogImpHog5.campoP20a1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p20a']}"
                                                    toolTip="BundleParametros.p20a.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP20a1.validate}"/>
                                                <webuijsf:staticText id="campoP20a1Texto1"
                                                    binding="#{LogImpHog5.campoP20a1Texto1}"
                                                    text="#{currentRow.value['p20a']}"/>
                                                <webuijsf:message id="messageP20a1"
                                                    for="campoP20a1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP171}"
                                                    headerText="p17"
                                                    id="tableColumnP171"
                                                    sort="p17">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP171"
                                                    text="#{currentRow.value['p17']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP171}"
                                                    id="labelP171"
                                                    for="campoP171"/>
                                                <webuijsf:textArea id="campoP171"
                                                    binding="#{LogImpHog5.campoP171}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p17']}"
                                                    toolTip="BundleParametros.p17.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP171.validate}"/>
                                                <webuijsf:staticText id="campoP171Texto1"
                                                    binding="#{LogImpHog5.campoP171Texto1}"
                                                    text="#{currentRow.value['p17']}"/>
                                                <webuijsf:message id="messageP171"
                                                    for="campoP171"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP181}"
                                                    headerText="p18"
                                                    id="tableColumnP181"
                                                    sort="p18">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP181"
                                                    text="#{currentRow.value['p18']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP181}"
                                                    id="labelP181"
                                                    for="campoP181"/>
                                                <webuijsf:textArea id="campoP181"
                                                    binding="#{LogImpHog5.campoP181}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p18']}"
                                                    toolTip="BundleParametros.p18.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP181.validate}"/>
                                                <webuijsf:staticText id="campoP181Texto1"
                                                    binding="#{LogImpHog5.campoP181Texto1}"
                                                    text="#{currentRow.value['p18']}"/>
                                                <webuijsf:message id="messageP181"
                                                    for="campoP181"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnVar000011}"
                                                    headerText="var00001"
                                                    id="tableColumnVar000011" rendered="false"
                                                    sort="var00001">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000011"
                                                    text="#{currentRow.value['var00001']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelVar000011}"
                                                    id="labelVar000011"
                                                    for="campoVar000011"/>
                                                <webuijsf:textArea id="campoVar000011"
                                                    binding="#{LogImpHog5.campoVar000011}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00001']}"
                                                    toolTip="BundleParametros.var00001.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorVar000011.validate}"/>
                                                <webuijsf:staticText id="campoVar000011Texto1"
                                                    binding="#{LogImpHog5.campoVar000011Texto1}"
                                                    text="#{currentRow.value['var00001']}"/>
                                                <webuijsf:message id="messageVar000011"
                                                    for="campoVar000011"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP191}"
                                                    headerText="p19"
                                                    id="tableColumnP191"
                                                    sort="p19">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP191"
                                                    text="#{currentRow.value['p19']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP191}"
                                                    id="labelP191"
                                                    for="campoP191"/>
                                                <webuijsf:textArea id="campoP191"
                                                    binding="#{LogImpHog5.campoP191}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p19']}"
                                                    toolTip="BundleParametros.p19.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP191.validate}"/>
                                                <webuijsf:staticText id="campoP191Texto1"
                                                    binding="#{LogImpHog5.campoP191Texto1}"
                                                    text="#{currentRow.value['p19']}"/>
                                                <webuijsf:message id="messageP191"
                                                    for="campoP191"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnObservaciones1}"
                                                    headerText="observaciones"
                                                    id="tableColumnObservaciones1" rendered="false"
                                                    sort="observaciones">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservaciones1"
                                                    text="#{currentRow.value['observaciones']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelObservaciones1}"
                                                    id="labelObservaciones1"
                                                    for="campoObservaciones1"/>
                                                <webuijsf:textArea id="campoObservaciones1"
                                                    binding="#{LogImpHog5.campoObservaciones1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observaciones']}"
                                                    toolTip="BundleParametros.observaciones.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorObservaciones1.validate}"/>
                                                <webuijsf:staticText id="campoObservaciones1Texto1"
                                                    binding="#{LogImpHog5.campoObservaciones1Texto1}"
                                                    text="#{currentRow.value['observaciones']}"/>
                                                <webuijsf:message id="messageObservaciones1"
                                                    for="campoObservaciones1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnUtm1}"
                                                    headerText="utm"
                                                    id="tableColumnUtm1" rendered="false"
                                                    sort="utm">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextUtm1"
                                                    text="#{currentRow.value['utm']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelUtm1}"
                                                    id="labelUtm1"
                                                    for="campoUtm1"/>
                                                <webuijsf:textArea id="campoUtm1"
                                                    binding="#{LogImpHog5.campoUtm1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['utm']}"
                                                    toolTip="BundleParametros.utm.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorUtm1.validate}"/>
                                                <webuijsf:staticText id="campoUtm1Texto1"
                                                    binding="#{LogImpHog5.campoUtm1Texto1}"
                                                    text="#{currentRow.value['utm']}"/>
                                                <webuijsf:message id="messageUtm1"
                                                    for="campoUtm1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnGps1}"
                                                    headerText="gps"
                                                    id="tableColumnGps1" rendered="false"
                                                    sort="gps">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextGps1"
                                                    text="#{currentRow.value['gps']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelGps1}"
                                                    id="labelGps1"
                                                    for="campoGps1"/>
                                                <webuijsf:textArea id="campoGps1"
                                                    binding="#{LogImpHog5.campoGps1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['gps']}"
                                                    toolTip="BundleParametros.gps.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorGps1.validate}"/>
                                                <webuijsf:staticText id="campoGps1Texto1"
                                                    binding="#{LogImpHog5.campoGps1Texto1}"
                                                    text="#{currentRow.value['gps']}"/>
                                                <webuijsf:message id="messageGps1"
                                                    for="campoGps1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnOrden1}"
                                                    headerText="orden"
                                                    id="tableColumnOrden1" rendered="false"
                                                    sort="orden">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOrden1"
                                                    text="#{currentRow.value['orden']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelOrden1}"
                                                    id="labelOrden1"
                                                    for="campoOrden1"/>
                                                <webuijsf:textArea id="campoOrden1"
                                                    binding="#{LogImpHog5.campoOrden1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['orden']}"
                                                    toolTip="BundleParametros.orden.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorOrden1.validate}"/>
                                                <webuijsf:staticText id="campoOrden1Texto1"
                                                    binding="#{LogImpHog5.campoOrden1Texto1}"
                                                    text="#{currentRow.value['orden']}"/>
                                                <webuijsf:message id="messageOrden1"
                                                    for="campoOrden1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnCoordx1}"
                                                    headerText="coordx"
                                                    id="tableColumnCoordx1" rendered="false"
                                                    sort="coordx">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCoordx1"
                                                    text="#{currentRow.value['coordx']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelCoordx1}"
                                                    id="labelCoordx1"
                                                    for="campoCoordx1"/>
                                                <webuijsf:textArea id="campoCoordx1"
                                                    binding="#{LogImpHog5.campoCoordx1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['coordx']}"
                                                    toolTip="BundleParametros.coordx.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorCoordx1.validate}"/>
                                                <webuijsf:staticText id="campoCoordx1Texto1"
                                                    binding="#{LogImpHog5.campoCoordx1Texto1}"
                                                    text="#{currentRow.value['coordx']}"/>
                                                <webuijsf:message id="messageCoordx1"
                                                    for="campoCoordx1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP01a1}"
                                                    headerText="p01a"
                                                    id="tableColumnP01a1" rendered="false"
                                                    sort="p01a">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP01a1"
                                                    text="#{currentRow.value['p01a']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP01a1}"
                                                    id="labelP01a1"
                                                    for="campoP01a1"/>
                                                <webuijsf:textArea id="campoP01a1"
                                                    binding="#{LogImpHog5.campoP01a1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p01a']}"
                                                    toolTip="BundleParametros.p01a.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP01a1.validate}"/>
                                                <webuijsf:staticText id="campoP01a1Texto1"
                                                    binding="#{LogImpHog5.campoP01a1Texto1}"
                                                    text="#{currentRow.value['p01a']}"/>
                                                <webuijsf:message id="messageP01a1"
                                                    for="campoP01a1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP01b1}"
                                                    headerText="p01b"
                                                    id="tableColumnP01b1" rendered="false"
                                                    sort="p01b">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP01b1"
                                                    text="#{currentRow.value['p01b']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP01b1}"
                                                    id="labelP01b1"
                                                    for="campoP01b1"/>
                                                <webuijsf:textArea id="campoP01b1"
                                                    binding="#{LogImpHog5.campoP01b1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p01b']}"
                                                    toolTip="BundleParametros.p01b.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP01b1.validate}"/>
                                                <webuijsf:staticText id="campoP01b1Texto1"
                                                    binding="#{LogImpHog5.campoP01b1Texto1}"
                                                    text="#{currentRow.value['p01b']}"/>
                                                <webuijsf:message id="messageP01b1"
                                                    for="campoP01b1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP01c1}"
                                                    headerText="p01c"
                                                    id="tableColumnP01c1" rendered="false"
                                                    sort="p01c">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP01c1"
                                                    text="#{currentRow.value['p01c']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP01c1}"
                                                    id="labelP01c1"
                                                    for="campoP01c1"/>
                                                <webuijsf:textArea id="campoP01c1"
                                                    binding="#{LogImpHog5.campoP01c1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p01c']}"
                                                    toolTip="BundleParametros.p01c.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP01c1.validate}"/>
                                                <webuijsf:staticText id="campoP01c1Texto1"
                                                    binding="#{LogImpHog5.campoP01c1Texto1}"
                                                    text="#{currentRow.value['p01c']}"/>
                                                <webuijsf:message id="messageP01c1"
                                                    for="campoP01c1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP01d1}"
                                                    headerText="p01d"
                                                    id="tableColumnP01d1" rendered="false"
                                                    sort="p01d">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP01d1"
                                                    text="#{currentRow.value['p01d']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP01d1}"
                                                    id="labelP01d1"
                                                    for="campoP01d1"/>
                                                <webuijsf:textArea id="campoP01d1"
                                                    binding="#{LogImpHog5.campoP01d1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p01d']}"
                                                    toolTip="BundleParametros.p01d.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP01d1.validate}"/>
                                                <webuijsf:staticText id="campoP01d1Texto1"
                                                    binding="#{LogImpHog5.campoP01d1Texto1}"
                                                    text="#{currentRow.value['p01d']}"/>
                                                <webuijsf:message id="messageP01d1"
                                                    for="campoP01d1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP021}"
                                                    headerText="p02"
                                                    id="tableColumnP021" rendered="false"
                                                    sort="p02">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP021"
                                                    text="#{currentRow.value['p02']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP021}"
                                                    id="labelP021"
                                                    for="campoP021"/>
                                                <webuijsf:textArea id="campoP021"
                                                    binding="#{LogImpHog5.campoP021}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p02']}"
                                                    toolTip="BundleParametros.p02.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP021.validate}"/>
                                                <webuijsf:staticText id="campoP021Texto1"
                                                    binding="#{LogImpHog5.campoP021Texto1}"
                                                    text="#{currentRow.value['p02']}"/>
                                                <webuijsf:message id="messageP021"
                                                    for="campoP021"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP031}"
                                                    headerText="p03"
                                                    id="tableColumnP031" rendered="false"
                                                    sort="p03">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP031"
                                                    text="#{currentRow.value['p03']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP031}"
                                                    id="labelP031"
                                                    for="campoP031"/>
                                                <webuijsf:textArea id="campoP031"
                                                    binding="#{LogImpHog5.campoP031}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p03']}"
                                                    toolTip="BundleParametros.p03.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP031.validate}"/>
                                                <webuijsf:staticText id="campoP031Texto1"
                                                    binding="#{LogImpHog5.campoP031Texto1}"
                                                    text="#{currentRow.value['p03']}"/>
                                                <webuijsf:message id="messageP031"
                                                    for="campoP031"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP041}"
                                                    headerText="p04"
                                                    id="tableColumnP041" rendered="false"
                                                    sort="p04">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP041"
                                                    text="#{currentRow.value['p04']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP041}"
                                                    id="labelP041"
                                                    for="campoP041"/>
                                                <webuijsf:textArea id="campoP041"
                                                    binding="#{LogImpHog5.campoP041}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p04']}"
                                                    toolTip="BundleParametros.p04.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP041.validate}"/>
                                                <webuijsf:staticText id="campoP041Texto1"
                                                    binding="#{LogImpHog5.campoP041Texto1}"
                                                    text="#{currentRow.value['p04']}"/>
                                                <webuijsf:message id="messageP041"
                                                    for="campoP041"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP051}"
                                                    headerText="p05"
                                                    id="tableColumnP051" rendered="false"
                                                    sort="p05">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP051"
                                                    text="#{currentRow.value['p05']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP051}"
                                                    id="labelP051"
                                                    for="campoP051"/>
                                                <webuijsf:textArea id="campoP051"
                                                    binding="#{LogImpHog5.campoP051}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p05']}"
                                                    toolTip="BundleParametros.p05.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP051.validate}"/>
                                                <webuijsf:staticText id="campoP051Texto1"
                                                    binding="#{LogImpHog5.campoP051Texto1}"
                                                    text="#{currentRow.value['p05']}"/>
                                                <webuijsf:message id="messageP051"
                                                    for="campoP051"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP061}"
                                                    headerText="p06"
                                                    id="tableColumnP061" rendered="false"
                                                    sort="p06">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP061"
                                                    text="#{currentRow.value['p06']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP061}"
                                                    id="labelP061"
                                                    for="campoP061"/>
                                                <webuijsf:textArea id="campoP061"
                                                    binding="#{LogImpHog5.campoP061}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p06']}"
                                                    toolTip="BundleParametros.p06.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP061.validate}"/>
                                                <webuijsf:staticText id="campoP061Texto1"
                                                    binding="#{LogImpHog5.campoP061Texto1}"
                                                    text="#{currentRow.value['p06']}"/>
                                                <webuijsf:message id="messageP061"
                                                    for="campoP061"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP081}"
                                                    headerText="p08"
                                                    id="tableColumnP081" rendered="false"
                                                    sort="p08">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP081"
                                                    text="#{currentRow.value['p08']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP081}"
                                                    id="labelP081"
                                                    for="campoP081"/>
                                                <webuijsf:textArea id="campoP081"
                                                    binding="#{LogImpHog5.campoP081}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p08']}"
                                                    toolTip="BundleParametros.p08.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP081.validate}"/>
                                                <webuijsf:staticText id="campoP081Texto1"
                                                    binding="#{LogImpHog5.campoP081Texto1}"
                                                    text="#{currentRow.value['p08']}"/>
                                                <webuijsf:message id="messageP081"
                                                    for="campoP081"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP071}"
                                                    headerText="p07"
                                                    id="tableColumnP071" rendered="false"
                                                    sort="p07">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP071"
                                                    text="#{currentRow.value['p07']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP071}"
                                                    id="labelP071"
                                                    for="campoP071"/>
                                                <webuijsf:textArea id="campoP071"
                                                    binding="#{LogImpHog5.campoP071}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p07']}"
                                                    toolTip="BundleParametros.p07.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP071.validate}"/>
                                                <webuijsf:staticText id="campoP071Texto1"
                                                    binding="#{LogImpHog5.campoP071Texto1}"
                                                    text="#{currentRow.value['p07']}"/>
                                                <webuijsf:message id="messageP071"
                                                    for="campoP071"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP091}"
                                                    headerText="p09"
                                                    id="tableColumnP091" rendered="false"
                                                    sort="p09">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP091"
                                                    text="#{currentRow.value['p09']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP091}"
                                                    id="labelP091"
                                                    for="campoP091"/>
                                                <webuijsf:textArea id="campoP091"
                                                    binding="#{LogImpHog5.campoP091}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p09']}"
                                                    toolTip="BundleParametros.p09.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP091.validate}"/>
                                                <webuijsf:staticText id="campoP091Texto1"
                                                    binding="#{LogImpHog5.campoP091Texto1}"
                                                    text="#{currentRow.value['p09']}"/>
                                                <webuijsf:message id="messageP091"
                                                    for="campoP091"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP141}"
                                                    headerText="p14"
                                                    id="tableColumnP141" rendered="false"
                                                    sort="p14">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP141"
                                                    text="#{currentRow.value['p14']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP141}"
                                                    id="labelP141"
                                                    for="campoP141"/>
                                                <webuijsf:textArea id="campoP141"
                                                    binding="#{LogImpHog5.campoP141}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p14']}"
                                                    toolTip="BundleParametros.p14.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP141.validate}"/>
                                                <webuijsf:staticText id="campoP141Texto1"
                                                    binding="#{LogImpHog5.campoP141Texto1}"
                                                    text="#{currentRow.value['p14']}"/>
                                                <webuijsf:message id="messageP141"
                                                    for="campoP141"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP151}"
                                                    headerText="p15"
                                                    id="tableColumnP151" rendered="false"
                                                    sort="p15">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP151"
                                                    text="#{currentRow.value['p15']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP151}"
                                                    id="labelP151"
                                                    for="campoP151"/>
                                                <webuijsf:textArea id="campoP151"
                                                    binding="#{LogImpHog5.campoP151}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p15']}"
                                                    toolTip="BundleParametros.p15.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP151.validate}"/>
                                                <webuijsf:staticText id="campoP151Texto1"
                                                    binding="#{LogImpHog5.campoP151Texto1}"
                                                    text="#{currentRow.value['p15']}"/>
                                                <webuijsf:message id="messageP151"
                                                    for="campoP151"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP161}"
                                                    headerText="p16"
                                                    id="tableColumnP161" rendered="false"
                                                    sort="p16">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP161"
                                                    text="#{currentRow.value['p16']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP161}"
                                                    id="labelP161"
                                                    for="campoP161"/>
                                                <webuijsf:textArea id="campoP161"
                                                    binding="#{LogImpHog5.campoP161}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p16']}"
                                                    toolTip="BundleParametros.p16.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP161.validate}"/>
                                                <webuijsf:staticText id="campoP161Texto1"
                                                    binding="#{LogImpHog5.campoP161Texto1}"
                                                    text="#{currentRow.value['p16']}"/>
                                                <webuijsf:message id="messageP161"
                                                    for="campoP161"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP241}"
                                                    headerText="p24"
                                                    id="tableColumnP241" rendered="false"
                                                    sort="p24">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP241"
                                                    text="#{currentRow.value['p24']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP241}"
                                                    id="labelP241"
                                                    for="campoP241"/>
                                                <webuijsf:textArea id="campoP241"
                                                    binding="#{LogImpHog5.campoP241}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p24']}"
                                                    toolTip="BundleParametros.p24.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP241.validate}"/>
                                                <webuijsf:staticText id="campoP241Texto1"
                                                    binding="#{LogImpHog5.campoP241Texto1}"
                                                    text="#{currentRow.value['p24']}"/>
                                                <webuijsf:message id="messageP241"
                                                    for="campoP241"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP251}"
                                                    headerText="p25"
                                                    id="tableColumnP251" rendered="false"
                                                    sort="p25">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP251"
                                                    text="#{currentRow.value['p25']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP251}"
                                                    id="labelP251"
                                                    for="campoP251"/>
                                                <webuijsf:textArea id="campoP251"
                                                    binding="#{LogImpHog5.campoP251}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p25']}"
                                                    toolTip="BundleParametros.p25.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP251.validate}"/>
                                                <webuijsf:staticText id="campoP251Texto1"
                                                    binding="#{LogImpHog5.campoP251Texto1}"
                                                    text="#{currentRow.value['p25']}"/>
                                                <webuijsf:message id="messageP251"
                                                    for="campoP251"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP261}"
                                                    headerText="p26"
                                                    id="tableColumnP261" rendered="false"
                                                    sort="p26">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP261"
                                                    text="#{currentRow.value['p26']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP261}"
                                                    id="labelP261"
                                                    for="campoP261"/>
                                                <webuijsf:textArea id="campoP261"
                                                    binding="#{LogImpHog5.campoP261}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p26']}"
                                                    toolTip="BundleParametros.p26.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP261.validate}"/>
                                                <webuijsf:staticText id="campoP261Texto1"
                                                    binding="#{LogImpHog5.campoP261Texto1}"
                                                    text="#{currentRow.value['p26']}"/>
                                                <webuijsf:message id="messageP261"
                                                    for="campoP261"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP271}"
                                                    headerText="p27"
                                                    id="tableColumnP271" rendered="false"
                                                    sort="p27">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP271"
                                                    text="#{currentRow.value['p27']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP271}"
                                                    id="labelP271"
                                                    for="campoP271"/>
                                                <webuijsf:textArea id="campoP271"
                                                    binding="#{LogImpHog5.campoP271}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p27']}"
                                                    toolTip="BundleParametros.p27.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP271.validate}"/>
                                                <webuijsf:staticText id="campoP271Texto1"
                                                    binding="#{LogImpHog5.campoP271Texto1}"
                                                    text="#{currentRow.value['p27']}"/>
                                                <webuijsf:message id="messageP271"
                                                    for="campoP271"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP27e1}"
                                                    headerText="p27e"
                                                    id="tableColumnP27e1" rendered="false"
                                                    sort="p27e">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP27e1"
                                                    text="#{currentRow.value['p27e']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP27e1}"
                                                    id="labelP27e1"
                                                    for="campoP27e1"/>
                                                <webuijsf:textArea id="campoP27e1"
                                                    binding="#{LogImpHog5.campoP27e1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p27e']}"
                                                    toolTip="BundleParametros.p27e.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP27e1.validate}"/>
                                                <webuijsf:staticText id="campoP27e1Texto1"
                                                    binding="#{LogImpHog5.campoP27e1Texto1}"
                                                    text="#{currentRow.value['p27e']}"/>
                                                <webuijsf:message id="messageP27e1"
                                                    for="campoP27e1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP28a1}"
                                                    headerText="p28a"
                                                    id="tableColumnP28a1" rendered="false"
                                                    sort="p28a">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP28a1"
                                                    text="#{currentRow.value['p28a']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP28a1}"
                                                    id="labelP28a1"
                                                    for="campoP28a1"/>
                                                <webuijsf:textArea id="campoP28a1"
                                                    binding="#{LogImpHog5.campoP28a1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p28a']}"
                                                    toolTip="BundleParametros.p28a.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP28a1.validate}"/>
                                                <webuijsf:staticText id="campoP28a1Texto1"
                                                    binding="#{LogImpHog5.campoP28a1Texto1}"
                                                    text="#{currentRow.value['p28a']}"/>
                                                <webuijsf:message id="messageP28a1"
                                                    for="campoP28a1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP28b1}"
                                                    headerText="p28b"
                                                    id="tableColumnP28b1" rendered="false"
                                                    sort="p28b">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP28b1"
                                                    text="#{currentRow.value['p28b']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP28b1}"
                                                    id="labelP28b1"
                                                    for="campoP28b1"/>
                                                <webuijsf:textArea id="campoP28b1"
                                                    binding="#{LogImpHog5.campoP28b1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p28b']}"
                                                    toolTip="BundleParametros.p28b.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP28b1.validate}"/>
                                                <webuijsf:staticText id="campoP28b1Texto1"
                                                    binding="#{LogImpHog5.campoP28b1Texto1}"
                                                    text="#{currentRow.value['p28b']}"/>
                                                <webuijsf:message id="messageP28b1"
                                                    for="campoP28b1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP291}"
                                                    headerText="p29"
                                                    id="tableColumnP291" rendered="false"
                                                    sort="p29">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP291"
                                                    text="#{currentRow.value['p29']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP291}"
                                                    id="labelP291"
                                                    for="campoP291"/>
                                                <webuijsf:textArea id="campoP291"
                                                    binding="#{LogImpHog5.campoP291}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p29']}"
                                                    toolTip="BundleParametros.p29.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP291.validate}"/>
                                                <webuijsf:staticText id="campoP291Texto1"
                                                    binding="#{LogImpHog5.campoP291Texto1}"
                                                    text="#{currentRow.value['p29']}"/>
                                                <webuijsf:message id="messageP291"
                                                    for="campoP291"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP301}"
                                                    headerText="p30"
                                                    id="tableColumnP301" rendered="false"
                                                    sort="p30">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP301"
                                                    text="#{currentRow.value['p30']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP301}"
                                                    id="labelP301"
                                                    for="campoP301"/>
                                                <webuijsf:textArea id="campoP301"
                                                    binding="#{LogImpHog5.campoP301}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p30']}"
                                                    toolTip="BundleParametros.p30.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP301.validate}"/>
                                                <webuijsf:staticText id="campoP301Texto1"
                                                    binding="#{LogImpHog5.campoP301Texto1}"
                                                    text="#{currentRow.value['p30']}"/>
                                                <webuijsf:message id="messageP301"
                                                    for="campoP301"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP311}"
                                                    headerText="p31"
                                                    id="tableColumnP311" rendered="false"
                                                    sort="p31">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP311"
                                                    text="#{currentRow.value['p31']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP311}"
                                                    id="labelP311"
                                                    for="campoP311"/>
                                                <webuijsf:textArea id="campoP311"
                                                    binding="#{LogImpHog5.campoP311}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p31']}"
                                                    toolTip="BundleParametros.p31.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP311.validate}"/>
                                                <webuijsf:staticText id="campoP311Texto1"
                                                    binding="#{LogImpHog5.campoP311Texto1}"
                                                    text="#{currentRow.value['p31']}"/>
                                                <webuijsf:message id="messageP311"
                                                    for="campoP311"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP321}"
                                                    headerText="p32"
                                                    id="tableColumnP321" rendered="false"
                                                    sort="p32">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP321"
                                                    text="#{currentRow.value['p32']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP321}"
                                                    id="labelP321"
                                                    for="campoP321"/>
                                                <webuijsf:textArea id="campoP321"
                                                    binding="#{LogImpHog5.campoP321}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p32']}"
                                                    toolTip="BundleParametros.p32.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP321.validate}"/>
                                                <webuijsf:staticText id="campoP321Texto1"
                                                    binding="#{LogImpHog5.campoP321Texto1}"
                                                    text="#{currentRow.value['p32']}"/>
                                                <webuijsf:message id="messageP321"
                                                    for="campoP321"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP331}"
                                                    headerText="p33"
                                                    id="tableColumnP331" rendered="false"
                                                    sort="p33">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP331"
                                                    text="#{currentRow.value['p33']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP331}"
                                                    id="labelP331"
                                                    for="campoP331"/>
                                                <webuijsf:textArea id="campoP331"
                                                    binding="#{LogImpHog5.campoP331}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p33']}"
                                                    toolTip="BundleParametros.p33.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP331.validate}"/>
                                                <webuijsf:staticText id="campoP331Texto1"
                                                    binding="#{LogImpHog5.campoP331Texto1}"
                                                    text="#{currentRow.value['p33']}"/>
                                                <webuijsf:message id="messageP331"
                                                    for="campoP331"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP341}"
                                                    headerText="p34"
                                                    id="tableColumnP341" rendered="false"
                                                    sort="p34">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP341"
                                                    text="#{currentRow.value['p34']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP341}"
                                                    id="labelP341"
                                                    for="campoP341"/>
                                                <webuijsf:textArea id="campoP341"
                                                    binding="#{LogImpHog5.campoP341}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p34']}"
                                                    toolTip="BundleParametros.p34.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP341.validate}"/>
                                                <webuijsf:staticText id="campoP341Texto1"
                                                    binding="#{LogImpHog5.campoP341Texto1}"
                                                    text="#{currentRow.value['p34']}"/>
                                                <webuijsf:message id="messageP341"
                                                    for="campoP341"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP351}"
                                                    headerText="p35"
                                                    id="tableColumnP351" rendered="false"
                                                    sort="p35">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP351"
                                                    text="#{currentRow.value['p35']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP351}"
                                                    id="labelP351"
                                                    for="campoP351"/>
                                                <webuijsf:textArea id="campoP351"
                                                    binding="#{LogImpHog5.campoP351}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p35']}"
                                                    toolTip="BundleParametros.p35.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP351.validate}"/>
                                                <webuijsf:staticText id="campoP351Texto1"
                                                    binding="#{LogImpHog5.campoP351Texto1}"
                                                    text="#{currentRow.value['p35']}"/>
                                                <webuijsf:message id="messageP351"
                                                    for="campoP351"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP361}"
                                                    headerText="p36"
                                                    id="tableColumnP361" rendered="false"
                                                    sort="p36">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP361"
                                                    text="#{currentRow.value['p36']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP361}"
                                                    id="labelP361"
                                                    for="campoP361"/>
                                                <webuijsf:textArea id="campoP361"
                                                    binding="#{LogImpHog5.campoP361}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p36']}"
                                                    toolTip="BundleParametros.p36.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP361.validate}"/>
                                                <webuijsf:staticText id="campoP361Texto1"
                                                    binding="#{LogImpHog5.campoP361Texto1}"
                                                    text="#{currentRow.value['p36']}"/>
                                                <webuijsf:message id="messageP361"
                                                    for="campoP361"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP371}"
                                                    headerText="p37"
                                                    id="tableColumnP371" rendered="false"
                                                    sort="p37">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP371"
                                                    text="#{currentRow.value['p37']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP371}"
                                                    id="labelP371"
                                                    for="campoP371"/>
                                                <webuijsf:textArea id="campoP371"
                                                    binding="#{LogImpHog5.campoP371}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p37']}"
                                                    toolTip="BundleParametros.p37.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP371.validate}"/>
                                                <webuijsf:staticText id="campoP371Texto1"
                                                    binding="#{LogImpHog5.campoP371Texto1}"
                                                    text="#{currentRow.value['p37']}"/>
                                                <webuijsf:message id="messageP371"
                                                    for="campoP371"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnNroCelular1}"
                                                    headerText="nro celular"
                                                    id="tableColumnNroCelular1" rendered="false"
                                                    sort="nro_celular">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNroCelular1"
                                                    text="#{currentRow.value['nro_celular']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelNroCelular1}"
                                                    id="labelNroCelular1"
                                                    for="campoNroCelular1"/>
                                                <webuijsf:textArea id="campoNroCelular1"
                                                    binding="#{LogImpHog5.campoNroCelular1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nro_celular']}"
                                                    toolTip="BundleParametros.nro_celular.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorNroCelular1.validate}"/>
                                                <webuijsf:staticText id="campoNroCelular1Texto1"
                                                    binding="#{LogImpHog5.campoNroCelular1Texto1}"
                                                    text="#{currentRow.value['nro_celular']}"/>
                                                <webuijsf:message id="messageNroCelular1"
                                                    for="campoNroCelular1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP381}"
                                                    headerText="p38"
                                                    id="tableColumnP381" rendered="false"
                                                    sort="p38">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP381"
                                                    text="#{currentRow.value['p38']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP381}"
                                                    id="labelP381"
                                                    for="campoP381"/>
                                                <webuijsf:textArea id="campoP381"
                                                    binding="#{LogImpHog5.campoP381}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p38']}"
                                                    toolTip="BundleParametros.p38.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP381.validate}"/>
                                                <webuijsf:staticText id="campoP381Texto1"
                                                    binding="#{LogImpHog5.campoP381Texto1}"
                                                    text="#{currentRow.value['p38']}"/>
                                                <webuijsf:message id="messageP381"
                                                    for="campoP381"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnNroLineaBaja1}"
                                                    headerText="nro linea baja"
                                                    id="tableColumnNroLineaBaja1" rendered="false"
                                                    sort="nro_linea_baja">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNroLineaBaja1"
                                                    text="#{currentRow.value['nro_linea_baja']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelNroLineaBaja1}"
                                                    id="labelNroLineaBaja1"
                                                    for="campoNroLineaBaja1"/>
                                                <webuijsf:textArea id="campoNroLineaBaja1"
                                                    binding="#{LogImpHog5.campoNroLineaBaja1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nro_linea_baja']}"
                                                    toolTip="BundleParametros.nro_linea_baja.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorNroLineaBaja1.validate}"/>
                                                <webuijsf:staticText id="campoNroLineaBaja1Texto1"
                                                    binding="#{LogImpHog5.campoNroLineaBaja1Texto1}"
                                                    text="#{currentRow.value['nro_linea_baja']}"/>
                                                <webuijsf:message id="messageNroLineaBaja1"
                                                    for="campoNroLineaBaja1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP3911}"
                                                    headerText="p391"
                                                    id="tableColumnP3911" rendered="false"
                                                    sort="p391">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP3911"
                                                    text="#{currentRow.value['p391']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP3911}"
                                                    id="labelP3911"
                                                    for="campoP3911"/>
                                                <webuijsf:textArea id="campoP3911"
                                                    binding="#{LogImpHog5.campoP3911}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p391']}"
                                                    toolTip="BundleParametros.p391.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP3911.validate}"/>
                                                <webuijsf:staticText id="campoP3911Texto1"
                                                    binding="#{LogImpHog5.campoP3911Texto1}"
                                                    text="#{currentRow.value['p391']}"/>
                                                <webuijsf:message id="messageP3911"
                                                    for="campoP3911"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP3921}"
                                                    headerText="p392"
                                                    id="tableColumnP3921" rendered="false"
                                                    sort="p392">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP3921"
                                                    text="#{currentRow.value['p392']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP3921}"
                                                    id="labelP3921"
                                                    for="campoP3921"/>
                                                <webuijsf:textArea id="campoP3921"
                                                    binding="#{LogImpHog5.campoP3921}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p392']}"
                                                    toolTip="BundleParametros.p392.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP3921.validate}"/>
                                                <webuijsf:staticText id="campoP3921Texto1"
                                                    binding="#{LogImpHog5.campoP3921Texto1}"
                                                    text="#{currentRow.value['p392']}"/>
                                                <webuijsf:message id="messageP3921"
                                                    for="campoP3921"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP3931}"
                                                    headerText="p393"
                                                    id="tableColumnP3931" rendered="false"
                                                    sort="p393">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP3931"
                                                    text="#{currentRow.value['p393']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP3931}"
                                                    id="labelP3931"
                                                    for="campoP3931"/>
                                                <webuijsf:textArea id="campoP3931"
                                                    binding="#{LogImpHog5.campoP3931}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p393']}"
                                                    toolTip="BundleParametros.p393.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP3931.validate}"/>
                                                <webuijsf:staticText id="campoP3931Texto1"
                                                    binding="#{LogImpHog5.campoP3931Texto1}"
                                                    text="#{currentRow.value['p393']}"/>
                                                <webuijsf:message id="messageP3931"
                                                    for="campoP3931"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP3941}"
                                                    headerText="p394"
                                                    id="tableColumnP3941" rendered="false"
                                                    sort="p394">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP3941"
                                                    text="#{currentRow.value['p394']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP3941}"
                                                    id="labelP3941"
                                                    for="campoP3941"/>
                                                <webuijsf:textArea id="campoP3941"
                                                    binding="#{LogImpHog5.campoP3941}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p394']}"
                                                    toolTip="BundleParametros.p394.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP3941.validate}"/>
                                                <webuijsf:staticText id="campoP3941Texto1"
                                                    binding="#{LogImpHog5.campoP3941Texto1}"
                                                    text="#{currentRow.value['p394']}"/>
                                                <webuijsf:message id="messageP3941"
                                                    for="campoP3941"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP3951}"
                                                    headerText="p395"
                                                    id="tableColumnP3951" rendered="false"
                                                    sort="p395">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP3951"
                                                    text="#{currentRow.value['p395']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP3951}"
                                                    id="labelP3951"
                                                    for="campoP3951"/>
                                                <webuijsf:textArea id="campoP3951"
                                                    binding="#{LogImpHog5.campoP3951}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p395']}"
                                                    toolTip="BundleParametros.p395.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP3951.validate}"/>
                                                <webuijsf:staticText id="campoP3951Texto1"
                                                    binding="#{LogImpHog5.campoP3951Texto1}"
                                                    text="#{currentRow.value['p395']}"/>
                                                <webuijsf:message id="messageP3951"
                                                    for="campoP3951"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP3961}"
                                                    headerText="p396"
                                                    id="tableColumnP3961" rendered="false"
                                                    sort="p396">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP3961"
                                                    text="#{currentRow.value['p396']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP3961}"
                                                    id="labelP3961"
                                                    for="campoP3961"/>
                                                <webuijsf:textArea id="campoP3961"
                                                    binding="#{LogImpHog5.campoP3961}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p396']}"
                                                    toolTip="BundleParametros.p396.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP3961.validate}"/>
                                                <webuijsf:staticText id="campoP3961Texto1"
                                                    binding="#{LogImpHog5.campoP3961Texto1}"
                                                    text="#{currentRow.value['p396']}"/>
                                                <webuijsf:message id="messageP3961"
                                                    for="campoP3961"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP3971}"
                                                    headerText="p397"
                                                    id="tableColumnP3971" rendered="false"
                                                    sort="p397">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP3971"
                                                    text="#{currentRow.value['p397']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP3971}"
                                                    id="labelP3971"
                                                    for="campoP3971"/>
                                                <webuijsf:textArea id="campoP3971"
                                                    binding="#{LogImpHog5.campoP3971}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p397']}"
                                                    toolTip="BundleParametros.p397.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP3971.validate}"/>
                                                <webuijsf:staticText id="campoP3971Texto1"
                                                    binding="#{LogImpHog5.campoP3971Texto1}"
                                                    text="#{currentRow.value['p397']}"/>
                                                <webuijsf:message id="messageP3971"
                                                    for="campoP3971"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP42n1}"
                                                    headerText="p42n"
                                                    id="tableColumnP42n1" rendered="false"
                                                    sort="p42n">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP42n1"
                                                    text="#{currentRow.value['p42n']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP42n1}"
                                                    id="labelP42n1"
                                                    for="campoP42n1"/>
                                                <webuijsf:textArea id="campoP42n1"
                                                    binding="#{LogImpHog5.campoP42n1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p42n']}"
                                                    toolTip="BundleParametros.p42n.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP42n1.validate}"/>
                                                <webuijsf:staticText id="campoP42n1Texto1"
                                                    binding="#{LogImpHog5.campoP42n1Texto1}"
                                                    text="#{currentRow.value['p42n']}"/>
                                                <webuijsf:message id="messageP42n1"
                                                    for="campoP42n1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP42ci1}"
                                                    headerText="p42ci"
                                                    id="tableColumnP42ci1" rendered="false"
                                                    sort="p42ci">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP42ci1"
                                                    text="#{currentRow.value['p42ci']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP42ci1}"
                                                    id="labelP42ci1"
                                                    for="campoP42ci1"/>
                                                <webuijsf:textArea id="campoP42ci1"
                                                    binding="#{LogImpHog5.campoP42ci1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p42ci']}"
                                                    toolTip="BundleParametros.p42ci.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP42ci1.validate}"/>
                                                <webuijsf:staticText id="campoP42ci1Texto1"
                                                    binding="#{LogImpHog5.campoP42ci1Texto1}"
                                                    text="#{currentRow.value['p42ci']}"/>
                                                <webuijsf:message id="messageP42ci1"
                                                    for="campoP42ci1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnLetraCi1}"
                                                    headerText="letra ci"
                                                    id="tableColumnLetraCi1" rendered="false"
                                                    sort="letra_ci">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextLetraCi1"
                                                    text="#{currentRow.value['letra_ci']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelLetraCi1}"
                                                    id="labelLetraCi1"
                                                    for="campoLetraCi1"/>
                                                <webuijsf:textArea id="campoLetraCi1"
                                                    binding="#{LogImpHog5.campoLetraCi1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['letra_ci']}"
                                                    toolTip="BundleParametros.letra_ci.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorLetraCi1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCi1Texto1"
                                                    binding="#{LogImpHog5.campoLetraCi1Texto1}"
                                                    text="#{currentRow.value['letra_ci']}"/>
                                                <webuijsf:message id="messageLetraCi1"
                                                    for="campoLetraCi1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP431}"
                                                    headerText="p43"
                                                    id="tableColumnP431" rendered="false"
                                                    sort="p43">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP431"
                                                    text="#{currentRow.value['p43']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP431}"
                                                    id="labelP431"
                                                    for="campoP431"/>
                                                <webuijsf:textArea id="campoP431"
                                                    binding="#{LogImpHog5.campoP431}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p43']}"
                                                    toolTip="BundleParametros.p43.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP431.validate}"/>
                                                <webuijsf:staticText id="campoP431Texto1"
                                                    binding="#{LogImpHog5.campoP431Texto1}"
                                                    text="#{currentRow.value['p43']}"/>
                                                <webuijsf:message id="messageP431"
                                                    for="campoP431"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnVar000021}"
                                                    headerText="var00002"
                                                    id="tableColumnVar000021" rendered="false"
                                                    sort="var00002">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000021"
                                                    text="#{currentRow.value['var00002']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelVar000021}"
                                                    id="labelVar000021"
                                                    for="campoVar000021"/>
                                                <webuijsf:textArea id="campoVar000021"
                                                    binding="#{LogImpHog5.campoVar000021}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00002']}"
                                                    toolTip="BundleParametros.var00002.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorVar000021.validate}"/>
                                                <webuijsf:staticText id="campoVar000021Texto1"
                                                    binding="#{LogImpHog5.campoVar000021Texto1}"
                                                    text="#{currentRow.value['var00002']}"/>
                                                <webuijsf:message id="messageVar000021"
                                                    for="campoVar000021"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnVar000031}"
                                                    headerText="var00003"
                                                    id="tableColumnVar000031" rendered="false"
                                                    sort="var00003">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000031"
                                                    text="#{currentRow.value['var00003']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelVar000031}"
                                                    id="labelVar000031"
                                                    for="campoVar000031"/>
                                                <webuijsf:textArea id="campoVar000031"
                                                    binding="#{LogImpHog5.campoVar000031}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00003']}"
                                                    toolTip="BundleParametros.var00003.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorVar000031.validate}"/>
                                                <webuijsf:staticText id="campoVar000031Texto1"
                                                    binding="#{LogImpHog5.campoVar000031Texto1}"
                                                    text="#{currentRow.value['var00003']}"/>
                                                <webuijsf:message id="messageVar000031"
                                                    for="campoVar000031"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnVar000041}"
                                                    headerText="var00004"
                                                    id="tableColumnVar000041" rendered="false"
                                                    sort="var00004">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000041"
                                                    text="#{currentRow.value['var00004']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelVar000041}"
                                                    id="labelVar000041"
                                                    for="campoVar000041"/>
                                                <webuijsf:textArea id="campoVar000041"
                                                    binding="#{LogImpHog5.campoVar000041}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00004']}"
                                                    toolTip="BundleParametros.var00004.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorVar000041.validate}"/>
                                                <webuijsf:staticText id="campoVar000041Texto1"
                                                    binding="#{LogImpHog5.campoVar000041Texto1}"
                                                    text="#{currentRow.value['var00004']}"/>
                                                <webuijsf:message id="messageVar000041"
                                                    for="campoVar000041"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnP1041}"
                                                    headerText="p104"
                                                    id="tableColumnP1041" rendered="false"
                                                    sort="p104">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP1041"
                                                    text="#{currentRow.value['p104']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelP1041}"
                                                    id="labelP1041"
                                                    for="campoP1041"/>
                                                <webuijsf:textArea id="campoP1041"
                                                    binding="#{LogImpHog5.campoP1041}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p104']}"
                                                    toolTip="BundleParametros.p104.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorP1041.validate}"/>
                                                <webuijsf:staticText id="campoP1041Texto1"
                                                    binding="#{LogImpHog5.campoP1041Texto1}"
                                                    text="#{currentRow.value['p104']}"/>
                                                <webuijsf:message id="messageP1041"
                                                    for="campoP1041"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnEsImportado1}"
                                                    headerText="importado"
                                                    id="tableColumnEsImportado1"
                                                    sort="es_importado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsImportado1"
                                                    text="#{currentRow.value['es_importado']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpHog5.listaEsImportado1}"
                                                    converter="#{LogImpHog5.converterEsImportado1}"
                                                    disabled="#{LogImpHog5.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpHog5.asistente.opcionesListaEsImportado1}"
                                                    selected="#{currentRow.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_hog"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpHog5.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnObservacion1}"
                                                    headerText="observaci&#243;n"
                                                    id="tableColumnObservacion1" rendered="false"
                                                    sort="observacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacion1"
                                                    text="#{currentRow.value['observacion']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpHog5.campoObservacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpHog5.campoObservacion1Texto1}"
                                                    text="#{currentRow.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnFechaHoraTransaccion1}"
                                                    headerText="fecha hora transacci&#243;n"
                                                    id="tableColumnFechaHoraTransaccion1"
                                                    sort="fecha_hora_transaccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraTransaccion1"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpHog5.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpHog5.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_hog"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpHog5.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpHog5.converterFechaHoraTransaccion1}"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnNombreArchivo1}"
                                                    headerText="nombre archivo"
                                                    id="tableColumnNombreArchivo1" rendered="false"
                                                    sort="nombre_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivo1"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpHog5.campoNombreArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpHog5.campoNombreArchivo1Texto1}"
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
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogImpHog5.campoNombreArchivo1Boton3}"
                                                    id="campoNombreArchivo1Boton3"
                                                    onClick="#{LogImpHog5.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpHog5.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpHog5.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpHog5.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpHog5.tableColumnCodigoArchivo1}"
                                                    headerText="c&#243;digo archivo"
                                                    id="tableColumnCodigoArchivo1" rendered="false"
                                                    sort="codigo_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoArchivo1"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    rendered="#{LogImpHog5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpHog5.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpHog5.campoCodigoArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpHog5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_hog"
                                                    validatorExpression="#{LogImpHog5.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpHog5.campoCodigoArchivo1Texto1}"
                                                    text="#{currentRow.value['codigo_archivo']}"/>
                                                <webuijsf:message id="messageCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
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
                                                        binding="#{LogImpHog5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{LogImpHog5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{LogImpHog5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{LogImpHog5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{LogImpHog5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{LogImpHog5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{LogImpHog5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpHog5.botonRepaginar1_action}"
                                                        binding="#{LogImpHog5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{LogImpHog5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{LogImpHog5.gestor.scriptRepaginar}"
                                                        text="#{LogImpHog5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{LogImpHog5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog5.botonAgregar1_action}"
                                                    binding="#{LogImpHog5.botonAgregar1}"
                                                    disabled="#{LogImpHog5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpHog5.gestor.scriptAgregar}"
                                                    rendered="#{LogImpHog5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpHog5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpHog5.listaFuncionEdicion1}"
                                                    converter="#{LogImpHog5.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpHog5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpHog5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpHog5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpHog5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpHog5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog5.botonEditar1_action}"
                                                    binding="#{LogImpHog5.botonEditar1}"
                                                    disabled="#{LogImpHog5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpHog5.gestor.scriptEditar}"
                                                    rendered="#{LogImpHog5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpHog5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog5.botonEliminar1_action}"
                                                    binding="#{LogImpHog5.botonEliminar1}"
                                                    disabled="#{LogImpHog5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpHog5.gestor.scriptEliminar}"
                                                    rendered="#{LogImpHog5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpHog5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog5.botonAplicar1_action}"
                                                    binding="#{LogImpHog5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpHog5.gestor.scriptAplicar}"
                                                    rendered="#{LogImpHog5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpHog5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog5.botonDeshacer1_action}"
                                                    binding="#{LogImpHog5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpHog5.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpHog5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpHog5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog5.botonConfirmar1_action}"
                                                    binding="#{LogImpHog5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpHog5.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpHog5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpHog5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog5.botonDescartar1_action}"
                                                    binding="#{LogImpHog5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpHog5.gestor.scriptDescartar}"
                                                    rendered="#{LogImpHog5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpHog5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpHog5.listaFuncionAccion1}"
                                                    converter="#{LogImpHog5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpHog5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpHog5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpHog5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpHog5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog5.botonProcesar1_action}"
                                                    binding="#{LogImpHog5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpHog5.gestor.scriptProcesar}"
                                                    rendered="#{LogImpHog5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpHog5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog5.botonRefrescar1_action}"
                                                    binding="#{LogImpHog5.botonRefrescar1}"
                                                    disabled="#{LogImpHog5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpHog5.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpHog5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpHog5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog5.botonReconsultar1_action}"
                                                    binding="#{LogImpHog5.botonReconsultar1}"
                                                    disabled="#{LogImpHog5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpHog5.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpHog5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpHog5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpHog5.botonRetornar1_action}"
                                                    binding="#{LogImpHog5.botonRetornar1}"
                                                    disabled="#{LogImpHog5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpHog5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpHog5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpHog5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpHog5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{LogImpHog5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpHog5.imageHyperlink1_action}"
                                                    binding="#{LogImpHog5.imageHyperlink1}"
                                                    disabled="#{LogImpHog5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpHog5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpHog5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpHog5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpHog5_imageHyperlink1_toolTip}"/>
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
