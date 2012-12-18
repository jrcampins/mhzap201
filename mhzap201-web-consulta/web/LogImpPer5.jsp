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
                    focus="#{LogImpPer5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpPer5.gestor.preserveFocus}"
                    preserveScroll="#{LogImpPer5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpPer5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdLogImpPer1 campoP01a1 campoP01b1 campoP01c1 campoP01d1 campoP021 campoP031 campoP1041 campoP431 campoP45a1 campoP45b1 campoP44a1 campoP44b1 campoVar000011 campoVar000021 campoP461 campoP471 campoVar000301 campoP481 campoP491 campoP50a1 campoP50b1 campoP50c1 campoP511 campoVar000031 campoVar000041 campoP52d1 campoP52m1 campoP52a1 campoP53a1 campoP53b1 campoP53c1 campoP53z1 campoP541 campoP54e1 campoP561 campoP581 campoP58e1 campoP591 campoP601 campoP611 campoP621 campoP631 campoP641 campoP651 campoP65e1 campoP661 campoP66e1 campoP671 campoP681 campoP68e1 campoP731 campoP741 campoVar000061 campoVar000071 campoVar000081 campoVar000091 campoVar000101 campoVar000111 campoVar000311 campoVar000121 campoVar000131 campoP861 campoP871 campoP87e1 campoP881 campoP88e1 campoP911 campoVar000171 campoVar000181 campoVar000191 campoVar000201 campoVar000211 campoVar000221 campoVar000231 campoVar000241 campoVar000251 campoVar000261 campoVar000271 campoVar000281 campoP921 campoIcv1 campoFichaActiva1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpPer5.breadcrumbs1}" 
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
                                                    rendered="#{LogImpPer5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpPer5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpPer5.gestor.mensajeDisponible}"
                                                    text="#{LogImpPer5.gestor.mensaje}"
                                                    url="#{LogImpPer5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{LogImpPer5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{LogImpPer5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{LogImpPer5.gestor.filaEscogida}" 
                                                sourceData="#{LogImpPer5.logImpPerDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{LogImpPer5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{LogImpPer5.gestor.scriptElegir}" 
                                                        selected="#{LogImpPer5.gestor.filaElegida}" 
                                                        toolTip="#{LogImpPer5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{LogImpPer5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPer5.botonEscogerFila1_action}"
                                                        binding="#{LogImpPer5.botonEscogerFila1}"
                                                        disabled="#{LogImpPer5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{LogImpPer5.gestor.urlImagenEscoger}" 
                                                        onClick="#{LogImpPer5.gestor.scriptEscoger}"
                                                        text="#{LogImpPer5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPer5.botonDetallarFila1_action}"
                                                        binding="#{LogImpPer5.botonDetallarFila1}"
                                                        disabled="#{LogImpPer5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{LogImpPer5.gestor.urlImagenDetallar}" 
                                                        onClick="#{LogImpPer5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{LogImpPer5.gestor.detalleDisponible}" 
                                                        text="#{LogImpPer5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPer5.botonProcesarFila1_action}"
                                                        binding="#{LogImpPer5.botonProcesarFila1}"
                                                        disabled="#{LogImpPer5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpPer5.gestor.urlImagenProcesar}" 
                                                        onClick="#{LogImpPer5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpPer5.asistente.comandoDisponible}" 
                                                        text="#{LogImpPer5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPer5.botonRetornarFila1_action}"
                                                        binding="#{LogImpPer5.botonRetornarFila1}" 
                                                        disabled="#{LogImpPer5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{LogImpPer5.gestor.urlImagenRetornar}"
                                                        onClick="#{LogImpPer5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{LogImpPer5.gestor.funcionReturnVisible}" 
                                                        text="#{LogImpPer5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{LogImpPer5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{LogImpPer5.hipervinculoAccionFila1_action}"
                                                        binding="#{LogImpPer5.hipervinculoAccionFila1}"
                                                        disabled="#{LogImpPer5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{LogImpPer5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{LogImpPer5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.LogImpPer5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{LogImpPer5.tableColumn3}" 
                                                    headerText="#{LogImpPer5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{LogImpPer5.hipervinculoDetallarFila1_action}"
                                                        binding="#{LogImpPer5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{LogImpPer5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{LogImpPer5.gestor.identificacionFila}" 
                                                        toolTip="#{LogImpPer5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnIdLogImpPer1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdLogImpPer1" rendered="false"
                                                    sort="id_log_imp_per">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdLogImpPer1"
                                                    text="#{currentRow.value['id_log_imp_per']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelIdLogImpPer1}"
                                                    id="labelIdLogImpPer1"
                                                    for="campoIdLogImpPer1"/>
                                                <webuijsf:textField id="campoIdLogImpPer1"
                                                    binding="#{LogImpPer5.campoIdLogImpPer1}"
                                                    converter="#{LogImpPer5.converterIdLogImpPer1}"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_log_imp_per']}"
                                                    toolTip="BundleParametros.id_log_imp_per.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorIdLogImpPer1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpPer1Texto1"
                                                    binding="#{LogImpPer5.campoIdLogImpPer1Texto1}"
                                                    text="#{currentRow.value['id_log_imp_per']}"/>
                                                <webuijsf:message id="messageIdLogImpPer1"
                                                    for="campoIdLogImpPer1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP01a1}"
                                                    headerText="p01a"
                                                    id="tableColumnP01a1"
                                                    sort="p01a">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP01a1"
                                                    text="#{currentRow.value['p01a']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP01a1}"
                                                    id="labelP01a1"
                                                    for="campoP01a1"/>
                                                <webuijsf:textArea id="campoP01a1"
                                                    binding="#{LogImpPer5.campoP01a1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p01a']}"
                                                    toolTip="BundleParametros.p01a.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP01a1.validate}"/>
                                                <webuijsf:staticText id="campoP01a1Texto1"
                                                    binding="#{LogImpPer5.campoP01a1Texto1}"
                                                    text="#{currentRow.value['p01a']}"/>
                                                <webuijsf:message id="messageP01a1"
                                                    for="campoP01a1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP01b1}"
                                                    headerText="p01b"
                                                    id="tableColumnP01b1"
                                                    sort="p01b">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP01b1"
                                                    text="#{currentRow.value['p01b']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP01b1}"
                                                    id="labelP01b1"
                                                    for="campoP01b1"/>
                                                <webuijsf:textArea id="campoP01b1"
                                                    binding="#{LogImpPer5.campoP01b1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p01b']}"
                                                    toolTip="BundleParametros.p01b.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP01b1.validate}"/>
                                                <webuijsf:staticText id="campoP01b1Texto1"
                                                    binding="#{LogImpPer5.campoP01b1Texto1}"
                                                    text="#{currentRow.value['p01b']}"/>
                                                <webuijsf:message id="messageP01b1"
                                                    for="campoP01b1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP01c1}"
                                                    headerText="p01c"
                                                    id="tableColumnP01c1"
                                                    sort="p01c">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP01c1"
                                                    text="#{currentRow.value['p01c']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP01c1}"
                                                    id="labelP01c1"
                                                    for="campoP01c1"/>
                                                <webuijsf:textArea id="campoP01c1"
                                                    binding="#{LogImpPer5.campoP01c1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p01c']}"
                                                    toolTip="BundleParametros.p01c.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP01c1.validate}"/>
                                                <webuijsf:staticText id="campoP01c1Texto1"
                                                    binding="#{LogImpPer5.campoP01c1Texto1}"
                                                    text="#{currentRow.value['p01c']}"/>
                                                <webuijsf:message id="messageP01c1"
                                                    for="campoP01c1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP01d1}"
                                                    headerText="p01d"
                                                    id="tableColumnP01d1"
                                                    sort="p01d">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP01d1"
                                                    text="#{currentRow.value['p01d']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP01d1}"
                                                    id="labelP01d1"
                                                    for="campoP01d1"/>
                                                <webuijsf:textArea id="campoP01d1"
                                                    binding="#{LogImpPer5.campoP01d1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p01d']}"
                                                    toolTip="BundleParametros.p01d.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP01d1.validate}"/>
                                                <webuijsf:staticText id="campoP01d1Texto1"
                                                    binding="#{LogImpPer5.campoP01d1Texto1}"
                                                    text="#{currentRow.value['p01d']}"/>
                                                <webuijsf:message id="messageP01d1"
                                                    for="campoP01d1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP021}"
                                                    headerText="p02"
                                                    id="tableColumnP021" rendered="false"
                                                    sort="p02">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP021"
                                                    text="#{currentRow.value['p02']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP021}"
                                                    id="labelP021"
                                                    for="campoP021"/>
                                                <webuijsf:textArea id="campoP021"
                                                    binding="#{LogImpPer5.campoP021}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p02']}"
                                                    toolTip="BundleParametros.p02.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP021.validate}"/>
                                                <webuijsf:staticText id="campoP021Texto1"
                                                    binding="#{LogImpPer5.campoP021Texto1}"
                                                    text="#{currentRow.value['p02']}"/>
                                                <webuijsf:message id="messageP021"
                                                    for="campoP021"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP031}"
                                                    headerText="p03"
                                                    id="tableColumnP031" rendered="false"
                                                    sort="p03">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP031"
                                                    text="#{currentRow.value['p03']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP031}"
                                                    id="labelP031"
                                                    for="campoP031"/>
                                                <webuijsf:textArea id="campoP031"
                                                    binding="#{LogImpPer5.campoP031}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p03']}"
                                                    toolTip="BundleParametros.p03.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP031.validate}"/>
                                                <webuijsf:staticText id="campoP031Texto1"
                                                    binding="#{LogImpPer5.campoP031Texto1}"
                                                    text="#{currentRow.value['p03']}"/>
                                                <webuijsf:message id="messageP031"
                                                    for="campoP031"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP1041}"
                                                    headerText="p104"
                                                    id="tableColumnP1041" rendered="false"
                                                    sort="p104">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP1041"
                                                    text="#{currentRow.value['p104']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP1041}"
                                                    id="labelP1041"
                                                    for="campoP1041"/>
                                                <webuijsf:textArea id="campoP1041"
                                                    binding="#{LogImpPer5.campoP1041}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p104']}"
                                                    toolTip="BundleParametros.p104.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP1041.validate}"/>
                                                <webuijsf:staticText id="campoP1041Texto1"
                                                    binding="#{LogImpPer5.campoP1041Texto1}"
                                                    text="#{currentRow.value['p104']}"/>
                                                <webuijsf:message id="messageP1041"
                                                    for="campoP1041"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP431}"
                                                    headerText="p43"
                                                    id="tableColumnP431" rendered="false"
                                                    sort="p43">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP431"
                                                    text="#{currentRow.value['p43']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP431}"
                                                    id="labelP431"
                                                    for="campoP431"/>
                                                <webuijsf:textArea id="campoP431"
                                                    binding="#{LogImpPer5.campoP431}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p43']}"
                                                    toolTip="BundleParametros.p43.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP431.validate}"/>
                                                <webuijsf:staticText id="campoP431Texto1"
                                                    binding="#{LogImpPer5.campoP431Texto1}"
                                                    text="#{currentRow.value['p43']}"/>
                                                <webuijsf:message id="messageP431"
                                                    for="campoP431"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP45a1}"
                                                    headerText="p45a"
                                                    id="tableColumnP45a1" rendered="false"
                                                    sort="p45a">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP45a1"
                                                    text="#{currentRow.value['p45a']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP45a1}"
                                                    id="labelP45a1"
                                                    for="campoP45a1"/>
                                                <webuijsf:textArea id="campoP45a1"
                                                    binding="#{LogImpPer5.campoP45a1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p45a']}"
                                                    toolTip="BundleParametros.p45a.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP45a1.validate}"/>
                                                <webuijsf:staticText id="campoP45a1Texto1"
                                                    binding="#{LogImpPer5.campoP45a1Texto1}"
                                                    text="#{currentRow.value['p45a']}"/>
                                                <webuijsf:message id="messageP45a1"
                                                    for="campoP45a1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP45b1}"
                                                    headerText="p45b"
                                                    id="tableColumnP45b1" rendered="false"
                                                    sort="p45b">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP45b1"
                                                    text="#{currentRow.value['p45b']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP45b1}"
                                                    id="labelP45b1"
                                                    for="campoP45b1"/>
                                                <webuijsf:textArea id="campoP45b1"
                                                    binding="#{LogImpPer5.campoP45b1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p45b']}"
                                                    toolTip="BundleParametros.p45b.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP45b1.validate}"/>
                                                <webuijsf:staticText id="campoP45b1Texto1"
                                                    binding="#{LogImpPer5.campoP45b1Texto1}"
                                                    text="#{currentRow.value['p45b']}"/>
                                                <webuijsf:message id="messageP45b1"
                                                    for="campoP45b1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP44a1}"
                                                    headerText="p44a"
                                                    id="tableColumnP44a1" rendered="false"
                                                    sort="p44a">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP44a1"
                                                    text="#{currentRow.value['p44a']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP44a1}"
                                                    id="labelP44a1"
                                                    for="campoP44a1"/>
                                                <webuijsf:textArea id="campoP44a1"
                                                    binding="#{LogImpPer5.campoP44a1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p44a']}"
                                                    toolTip="BundleParametros.p44a.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP44a1.validate}"/>
                                                <webuijsf:staticText id="campoP44a1Texto1"
                                                    binding="#{LogImpPer5.campoP44a1Texto1}"
                                                    text="#{currentRow.value['p44a']}"/>
                                                <webuijsf:message id="messageP44a1"
                                                    for="campoP44a1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP44b1}"
                                                    headerText="p44b"
                                                    id="tableColumnP44b1" rendered="false"
                                                    sort="p44b">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP44b1"
                                                    text="#{currentRow.value['p44b']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP44b1}"
                                                    id="labelP44b1"
                                                    for="campoP44b1"/>
                                                <webuijsf:textArea id="campoP44b1"
                                                    binding="#{LogImpPer5.campoP44b1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p44b']}"
                                                    toolTip="BundleParametros.p44b.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP44b1.validate}"/>
                                                <webuijsf:staticText id="campoP44b1Texto1"
                                                    binding="#{LogImpPer5.campoP44b1Texto1}"
                                                    text="#{currentRow.value['p44b']}"/>
                                                <webuijsf:message id="messageP44b1"
                                                    for="campoP44b1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000011}"
                                                    headerText="var00001"
                                                    id="tableColumnVar000011" rendered="false"
                                                    sort="var00001">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000011"
                                                    text="#{currentRow.value['var00001']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000011}"
                                                    id="labelVar000011"
                                                    for="campoVar000011"/>
                                                <webuijsf:textArea id="campoVar000011"
                                                    binding="#{LogImpPer5.campoVar000011}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00001']}"
                                                    toolTip="BundleParametros.var00001.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000011.validate}"/>
                                                <webuijsf:staticText id="campoVar000011Texto1"
                                                    binding="#{LogImpPer5.campoVar000011Texto1}"
                                                    text="#{currentRow.value['var00001']}"/>
                                                <webuijsf:message id="messageVar000011"
                                                    for="campoVar000011"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000021}"
                                                    headerText="var00002"
                                                    id="tableColumnVar000021" rendered="false"
                                                    sort="var00002">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000021"
                                                    text="#{currentRow.value['var00002']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000021}"
                                                    id="labelVar000021"
                                                    for="campoVar000021"/>
                                                <webuijsf:textArea id="campoVar000021"
                                                    binding="#{LogImpPer5.campoVar000021}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00002']}"
                                                    toolTip="BundleParametros.var00002.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000021.validate}"/>
                                                <webuijsf:staticText id="campoVar000021Texto1"
                                                    binding="#{LogImpPer5.campoVar000021Texto1}"
                                                    text="#{currentRow.value['var00002']}"/>
                                                <webuijsf:message id="messageVar000021"
                                                    for="campoVar000021"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP461}"
                                                    headerText="p46"
                                                    id="tableColumnP461" rendered="false"
                                                    sort="p46">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP461"
                                                    text="#{currentRow.value['p46']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP461}"
                                                    id="labelP461"
                                                    for="campoP461"/>
                                                <webuijsf:textArea id="campoP461"
                                                    binding="#{LogImpPer5.campoP461}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p46']}"
                                                    toolTip="BundleParametros.p46.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP461.validate}"/>
                                                <webuijsf:staticText id="campoP461Texto1"
                                                    binding="#{LogImpPer5.campoP461Texto1}"
                                                    text="#{currentRow.value['p46']}"/>
                                                <webuijsf:message id="messageP461"
                                                    for="campoP461"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP471}"
                                                    headerText="p47"
                                                    id="tableColumnP471" rendered="false"
                                                    sort="p47">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP471"
                                                    text="#{currentRow.value['p47']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP471}"
                                                    id="labelP471"
                                                    for="campoP471"/>
                                                <webuijsf:textArea id="campoP471"
                                                    binding="#{LogImpPer5.campoP471}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p47']}"
                                                    toolTip="BundleParametros.p47.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP471.validate}"/>
                                                <webuijsf:staticText id="campoP471Texto1"
                                                    binding="#{LogImpPer5.campoP471Texto1}"
                                                    text="#{currentRow.value['p47']}"/>
                                                <webuijsf:message id="messageP471"
                                                    for="campoP471"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000301}"
                                                    headerText="var00030"
                                                    id="tableColumnVar000301" rendered="false"
                                                    sort="var00030">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000301"
                                                    text="#{currentRow.value['var00030']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000301}"
                                                    id="labelVar000301"
                                                    for="campoVar000301"/>
                                                <webuijsf:textArea id="campoVar000301"
                                                    binding="#{LogImpPer5.campoVar000301}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00030']}"
                                                    toolTip="BundleParametros.var00030.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000301.validate}"/>
                                                <webuijsf:staticText id="campoVar000301Texto1"
                                                    binding="#{LogImpPer5.campoVar000301Texto1}"
                                                    text="#{currentRow.value['var00030']}"/>
                                                <webuijsf:message id="messageVar000301"
                                                    for="campoVar000301"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP481}"
                                                    headerText="p48"
                                                    id="tableColumnP481" rendered="false"
                                                    sort="p48">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP481"
                                                    text="#{currentRow.value['p48']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP481}"
                                                    id="labelP481"
                                                    for="campoP481"/>
                                                <webuijsf:textArea id="campoP481"
                                                    binding="#{LogImpPer5.campoP481}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p48']}"
                                                    toolTip="BundleParametros.p48.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP481.validate}"/>
                                                <webuijsf:staticText id="campoP481Texto1"
                                                    binding="#{LogImpPer5.campoP481Texto1}"
                                                    text="#{currentRow.value['p48']}"/>
                                                <webuijsf:message id="messageP481"
                                                    for="campoP481"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP491}"
                                                    headerText="p49"
                                                    id="tableColumnP491" rendered="false"
                                                    sort="p49">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP491"
                                                    text="#{currentRow.value['p49']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP491}"
                                                    id="labelP491"
                                                    for="campoP491"/>
                                                <webuijsf:textArea id="campoP491"
                                                    binding="#{LogImpPer5.campoP491}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p49']}"
                                                    toolTip="BundleParametros.p49.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP491.validate}"/>
                                                <webuijsf:staticText id="campoP491Texto1"
                                                    binding="#{LogImpPer5.campoP491Texto1}"
                                                    text="#{currentRow.value['p49']}"/>
                                                <webuijsf:message id="messageP491"
                                                    for="campoP491"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP50a1}"
                                                    headerText="p50a"
                                                    id="tableColumnP50a1" rendered="false"
                                                    sort="p50a">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP50a1"
                                                    text="#{currentRow.value['p50a']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP50a1}"
                                                    id="labelP50a1"
                                                    for="campoP50a1"/>
                                                <webuijsf:textArea id="campoP50a1"
                                                    binding="#{LogImpPer5.campoP50a1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p50a']}"
                                                    toolTip="BundleParametros.p50a.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP50a1.validate}"/>
                                                <webuijsf:staticText id="campoP50a1Texto1"
                                                    binding="#{LogImpPer5.campoP50a1Texto1}"
                                                    text="#{currentRow.value['p50a']}"/>
                                                <webuijsf:message id="messageP50a1"
                                                    for="campoP50a1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP50b1}"
                                                    headerText="p50b"
                                                    id="tableColumnP50b1" rendered="false"
                                                    sort="p50b">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP50b1"
                                                    text="#{currentRow.value['p50b']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP50b1}"
                                                    id="labelP50b1"
                                                    for="campoP50b1"/>
                                                <webuijsf:textArea id="campoP50b1"
                                                    binding="#{LogImpPer5.campoP50b1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p50b']}"
                                                    toolTip="BundleParametros.p50b.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP50b1.validate}"/>
                                                <webuijsf:staticText id="campoP50b1Texto1"
                                                    binding="#{LogImpPer5.campoP50b1Texto1}"
                                                    text="#{currentRow.value['p50b']}"/>
                                                <webuijsf:message id="messageP50b1"
                                                    for="campoP50b1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP50c1}"
                                                    headerText="p50c"
                                                    id="tableColumnP50c1" rendered="false"
                                                    sort="p50c">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP50c1"
                                                    text="#{currentRow.value['p50c']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP50c1}"
                                                    id="labelP50c1"
                                                    for="campoP50c1"/>
                                                <webuijsf:textArea id="campoP50c1"
                                                    binding="#{LogImpPer5.campoP50c1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p50c']}"
                                                    toolTip="BundleParametros.p50c.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP50c1.validate}"/>
                                                <webuijsf:staticText id="campoP50c1Texto1"
                                                    binding="#{LogImpPer5.campoP50c1Texto1}"
                                                    text="#{currentRow.value['p50c']}"/>
                                                <webuijsf:message id="messageP50c1"
                                                    for="campoP50c1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP511}"
                                                    headerText="p51"
                                                    id="tableColumnP511" rendered="false"
                                                    sort="p51">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP511"
                                                    text="#{currentRow.value['p51']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP511}"
                                                    id="labelP511"
                                                    for="campoP511"/>
                                                <webuijsf:textArea id="campoP511"
                                                    binding="#{LogImpPer5.campoP511}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p51']}"
                                                    toolTip="BundleParametros.p51.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP511.validate}"/>
                                                <webuijsf:staticText id="campoP511Texto1"
                                                    binding="#{LogImpPer5.campoP511Texto1}"
                                                    text="#{currentRow.value['p51']}"/>
                                                <webuijsf:message id="messageP511"
                                                    for="campoP511"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000031}"
                                                    headerText="var00003"
                                                    id="tableColumnVar000031" rendered="false"
                                                    sort="var00003">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000031"
                                                    text="#{currentRow.value['var00003']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000031}"
                                                    id="labelVar000031"
                                                    for="campoVar000031"/>
                                                <webuijsf:textArea id="campoVar000031"
                                                    binding="#{LogImpPer5.campoVar000031}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00003']}"
                                                    toolTip="BundleParametros.var00003.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000031.validate}"/>
                                                <webuijsf:staticText id="campoVar000031Texto1"
                                                    binding="#{LogImpPer5.campoVar000031Texto1}"
                                                    text="#{currentRow.value['var00003']}"/>
                                                <webuijsf:message id="messageVar000031"
                                                    for="campoVar000031"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000041}"
                                                    headerText="var00004"
                                                    id="tableColumnVar000041" rendered="false"
                                                    sort="var00004">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000041"
                                                    text="#{currentRow.value['var00004']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000041}"
                                                    id="labelVar000041"
                                                    for="campoVar000041"/>
                                                <webuijsf:textArea id="campoVar000041"
                                                    binding="#{LogImpPer5.campoVar000041}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00004']}"
                                                    toolTip="BundleParametros.var00004.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000041.validate}"/>
                                                <webuijsf:staticText id="campoVar000041Texto1"
                                                    binding="#{LogImpPer5.campoVar000041Texto1}"
                                                    text="#{currentRow.value['var00004']}"/>
                                                <webuijsf:message id="messageVar000041"
                                                    for="campoVar000041"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP52d1}"
                                                    headerText="p52d"
                                                    id="tableColumnP52d1" rendered="false"
                                                    sort="p52d">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP52d1"
                                                    text="#{currentRow.value['p52d']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP52d1}"
                                                    id="labelP52d1"
                                                    for="campoP52d1"/>
                                                <webuijsf:textArea id="campoP52d1"
                                                    binding="#{LogImpPer5.campoP52d1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p52d']}"
                                                    toolTip="BundleParametros.p52d.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP52d1.validate}"/>
                                                <webuijsf:staticText id="campoP52d1Texto1"
                                                    binding="#{LogImpPer5.campoP52d1Texto1}"
                                                    text="#{currentRow.value['p52d']}"/>
                                                <webuijsf:message id="messageP52d1"
                                                    for="campoP52d1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP52m1}"
                                                    headerText="p52m"
                                                    id="tableColumnP52m1" rendered="false"
                                                    sort="p52m">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP52m1"
                                                    text="#{currentRow.value['p52m']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP52m1}"
                                                    id="labelP52m1"
                                                    for="campoP52m1"/>
                                                <webuijsf:textArea id="campoP52m1"
                                                    binding="#{LogImpPer5.campoP52m1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p52m']}"
                                                    toolTip="BundleParametros.p52m.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP52m1.validate}"/>
                                                <webuijsf:staticText id="campoP52m1Texto1"
                                                    binding="#{LogImpPer5.campoP52m1Texto1}"
                                                    text="#{currentRow.value['p52m']}"/>
                                                <webuijsf:message id="messageP52m1"
                                                    for="campoP52m1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP52a1}"
                                                    headerText="p52a"
                                                    id="tableColumnP52a1" rendered="false"
                                                    sort="p52a">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP52a1"
                                                    text="#{currentRow.value['p52a']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP52a1}"
                                                    id="labelP52a1"
                                                    for="campoP52a1"/>
                                                <webuijsf:textArea id="campoP52a1"
                                                    binding="#{LogImpPer5.campoP52a1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p52a']}"
                                                    toolTip="BundleParametros.p52a.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP52a1.validate}"/>
                                                <webuijsf:staticText id="campoP52a1Texto1"
                                                    binding="#{LogImpPer5.campoP52a1Texto1}"
                                                    text="#{currentRow.value['p52a']}"/>
                                                <webuijsf:message id="messageP52a1"
                                                    for="campoP52a1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP53a1}"
                                                    headerText="p53a"
                                                    id="tableColumnP53a1" rendered="false"
                                                    sort="p53a">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP53a1"
                                                    text="#{currentRow.value['p53a']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP53a1}"
                                                    id="labelP53a1"
                                                    for="campoP53a1"/>
                                                <webuijsf:textArea id="campoP53a1"
                                                    binding="#{LogImpPer5.campoP53a1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p53a']}"
                                                    toolTip="BundleParametros.p53a.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP53a1.validate}"/>
                                                <webuijsf:staticText id="campoP53a1Texto1"
                                                    binding="#{LogImpPer5.campoP53a1Texto1}"
                                                    text="#{currentRow.value['p53a']}"/>
                                                <webuijsf:message id="messageP53a1"
                                                    for="campoP53a1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP53b1}"
                                                    headerText="p53b"
                                                    id="tableColumnP53b1" rendered="false"
                                                    sort="p53b">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP53b1"
                                                    text="#{currentRow.value['p53b']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP53b1}"
                                                    id="labelP53b1"
                                                    for="campoP53b1"/>
                                                <webuijsf:textArea id="campoP53b1"
                                                    binding="#{LogImpPer5.campoP53b1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p53b']}"
                                                    toolTip="BundleParametros.p53b.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP53b1.validate}"/>
                                                <webuijsf:staticText id="campoP53b1Texto1"
                                                    binding="#{LogImpPer5.campoP53b1Texto1}"
                                                    text="#{currentRow.value['p53b']}"/>
                                                <webuijsf:message id="messageP53b1"
                                                    for="campoP53b1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP53c1}"
                                                    headerText="p53c"
                                                    id="tableColumnP53c1" rendered="false"
                                                    sort="p53c">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP53c1"
                                                    text="#{currentRow.value['p53c']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP53c1}"
                                                    id="labelP53c1"
                                                    for="campoP53c1"/>
                                                <webuijsf:textArea id="campoP53c1"
                                                    binding="#{LogImpPer5.campoP53c1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p53c']}"
                                                    toolTip="BundleParametros.p53c.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP53c1.validate}"/>
                                                <webuijsf:staticText id="campoP53c1Texto1"
                                                    binding="#{LogImpPer5.campoP53c1Texto1}"
                                                    text="#{currentRow.value['p53c']}"/>
                                                <webuijsf:message id="messageP53c1"
                                                    for="campoP53c1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP53z1}"
                                                    headerText="p53z"
                                                    id="tableColumnP53z1" rendered="false"
                                                    sort="p53z">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP53z1"
                                                    text="#{currentRow.value['p53z']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP53z1}"
                                                    id="labelP53z1"
                                                    for="campoP53z1"/>
                                                <webuijsf:textArea id="campoP53z1"
                                                    binding="#{LogImpPer5.campoP53z1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p53z']}"
                                                    toolTip="BundleParametros.p53z.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP53z1.validate}"/>
                                                <webuijsf:staticText id="campoP53z1Texto1"
                                                    binding="#{LogImpPer5.campoP53z1Texto1}"
                                                    text="#{currentRow.value['p53z']}"/>
                                                <webuijsf:message id="messageP53z1"
                                                    for="campoP53z1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP541}"
                                                    headerText="p54"
                                                    id="tableColumnP541" rendered="false"
                                                    sort="p54">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP541"
                                                    text="#{currentRow.value['p54']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP541}"
                                                    id="labelP541"
                                                    for="campoP541"/>
                                                <webuijsf:textArea id="campoP541"
                                                    binding="#{LogImpPer5.campoP541}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p54']}"
                                                    toolTip="BundleParametros.p54.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP541.validate}"/>
                                                <webuijsf:staticText id="campoP541Texto1"
                                                    binding="#{LogImpPer5.campoP541Texto1}"
                                                    text="#{currentRow.value['p54']}"/>
                                                <webuijsf:message id="messageP541"
                                                    for="campoP541"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP54e1}"
                                                    headerText="p54e"
                                                    id="tableColumnP54e1" rendered="false"
                                                    sort="p54e">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP54e1"
                                                    text="#{currentRow.value['p54e']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP54e1}"
                                                    id="labelP54e1"
                                                    for="campoP54e1"/>
                                                <webuijsf:textArea id="campoP54e1"
                                                    binding="#{LogImpPer5.campoP54e1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p54e']}"
                                                    toolTip="BundleParametros.p54e.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP54e1.validate}"/>
                                                <webuijsf:staticText id="campoP54e1Texto1"
                                                    binding="#{LogImpPer5.campoP54e1Texto1}"
                                                    text="#{currentRow.value['p54e']}"/>
                                                <webuijsf:message id="messageP54e1"
                                                    for="campoP54e1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP561}"
                                                    headerText="p56"
                                                    id="tableColumnP561" rendered="false"
                                                    sort="p56">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP561"
                                                    text="#{currentRow.value['p56']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP561}"
                                                    id="labelP561"
                                                    for="campoP561"/>
                                                <webuijsf:textArea id="campoP561"
                                                    binding="#{LogImpPer5.campoP561}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p56']}"
                                                    toolTip="BundleParametros.p56.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP561.validate}"/>
                                                <webuijsf:staticText id="campoP561Texto1"
                                                    binding="#{LogImpPer5.campoP561Texto1}"
                                                    text="#{currentRow.value['p56']}"/>
                                                <webuijsf:message id="messageP561"
                                                    for="campoP561"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP581}"
                                                    headerText="p58"
                                                    id="tableColumnP581" rendered="false"
                                                    sort="p58">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP581"
                                                    text="#{currentRow.value['p58']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP581}"
                                                    id="labelP581"
                                                    for="campoP581"/>
                                                <webuijsf:textArea id="campoP581"
                                                    binding="#{LogImpPer5.campoP581}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p58']}"
                                                    toolTip="BundleParametros.p58.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP581.validate}"/>
                                                <webuijsf:staticText id="campoP581Texto1"
                                                    binding="#{LogImpPer5.campoP581Texto1}"
                                                    text="#{currentRow.value['p58']}"/>
                                                <webuijsf:message id="messageP581"
                                                    for="campoP581"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP58e1}"
                                                    headerText="p58e"
                                                    id="tableColumnP58e1" rendered="false"
                                                    sort="p58e">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP58e1"
                                                    text="#{currentRow.value['p58e']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP58e1}"
                                                    id="labelP58e1"
                                                    for="campoP58e1"/>
                                                <webuijsf:textArea id="campoP58e1"
                                                    binding="#{LogImpPer5.campoP58e1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p58e']}"
                                                    toolTip="BundleParametros.p58e.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP58e1.validate}"/>
                                                <webuijsf:staticText id="campoP58e1Texto1"
                                                    binding="#{LogImpPer5.campoP58e1Texto1}"
                                                    text="#{currentRow.value['p58e']}"/>
                                                <webuijsf:message id="messageP58e1"
                                                    for="campoP58e1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP591}"
                                                    headerText="p59"
                                                    id="tableColumnP591" rendered="false"
                                                    sort="p59">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP591"
                                                    text="#{currentRow.value['p59']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP591}"
                                                    id="labelP591"
                                                    for="campoP591"/>
                                                <webuijsf:textArea id="campoP591"
                                                    binding="#{LogImpPer5.campoP591}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p59']}"
                                                    toolTip="BundleParametros.p59.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP591.validate}"/>
                                                <webuijsf:staticText id="campoP591Texto1"
                                                    binding="#{LogImpPer5.campoP591Texto1}"
                                                    text="#{currentRow.value['p59']}"/>
                                                <webuijsf:message id="messageP591"
                                                    for="campoP591"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP601}"
                                                    headerText="p60"
                                                    id="tableColumnP601" rendered="false"
                                                    sort="p60">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP601"
                                                    text="#{currentRow.value['p60']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP601}"
                                                    id="labelP601"
                                                    for="campoP601"/>
                                                <webuijsf:textArea id="campoP601"
                                                    binding="#{LogImpPer5.campoP601}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p60']}"
                                                    toolTip="BundleParametros.p60.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP601.validate}"/>
                                                <webuijsf:staticText id="campoP601Texto1"
                                                    binding="#{LogImpPer5.campoP601Texto1}"
                                                    text="#{currentRow.value['p60']}"/>
                                                <webuijsf:message id="messageP601"
                                                    for="campoP601"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP611}"
                                                    headerText="p61"
                                                    id="tableColumnP611" rendered="false"
                                                    sort="p61">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP611"
                                                    text="#{currentRow.value['p61']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP611}"
                                                    id="labelP611"
                                                    for="campoP611"/>
                                                <webuijsf:textArea id="campoP611"
                                                    binding="#{LogImpPer5.campoP611}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p61']}"
                                                    toolTip="BundleParametros.p61.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP611.validate}"/>
                                                <webuijsf:staticText id="campoP611Texto1"
                                                    binding="#{LogImpPer5.campoP611Texto1}"
                                                    text="#{currentRow.value['p61']}"/>
                                                <webuijsf:message id="messageP611"
                                                    for="campoP611"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP621}"
                                                    headerText="p62"
                                                    id="tableColumnP621" rendered="false"
                                                    sort="p62">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP621"
                                                    text="#{currentRow.value['p62']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP621}"
                                                    id="labelP621"
                                                    for="campoP621"/>
                                                <webuijsf:textArea id="campoP621"
                                                    binding="#{LogImpPer5.campoP621}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p62']}"
                                                    toolTip="BundleParametros.p62.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP621.validate}"/>
                                                <webuijsf:staticText id="campoP621Texto1"
                                                    binding="#{LogImpPer5.campoP621Texto1}"
                                                    text="#{currentRow.value['p62']}"/>
                                                <webuijsf:message id="messageP621"
                                                    for="campoP621"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP631}"
                                                    headerText="p63"
                                                    id="tableColumnP631" rendered="false"
                                                    sort="p63">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP631"
                                                    text="#{currentRow.value['p63']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP631}"
                                                    id="labelP631"
                                                    for="campoP631"/>
                                                <webuijsf:textArea id="campoP631"
                                                    binding="#{LogImpPer5.campoP631}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p63']}"
                                                    toolTip="BundleParametros.p63.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP631.validate}"/>
                                                <webuijsf:staticText id="campoP631Texto1"
                                                    binding="#{LogImpPer5.campoP631Texto1}"
                                                    text="#{currentRow.value['p63']}"/>
                                                <webuijsf:message id="messageP631"
                                                    for="campoP631"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP641}"
                                                    headerText="p64"
                                                    id="tableColumnP641" rendered="false"
                                                    sort="p64">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP641"
                                                    text="#{currentRow.value['p64']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP641}"
                                                    id="labelP641"
                                                    for="campoP641"/>
                                                <webuijsf:textArea id="campoP641"
                                                    binding="#{LogImpPer5.campoP641}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p64']}"
                                                    toolTip="BundleParametros.p64.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP641.validate}"/>
                                                <webuijsf:staticText id="campoP641Texto1"
                                                    binding="#{LogImpPer5.campoP641Texto1}"
                                                    text="#{currentRow.value['p64']}"/>
                                                <webuijsf:message id="messageP641"
                                                    for="campoP641"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP651}"
                                                    headerText="p65"
                                                    id="tableColumnP651" rendered="false"
                                                    sort="p65">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP651"
                                                    text="#{currentRow.value['p65']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP651}"
                                                    id="labelP651"
                                                    for="campoP651"/>
                                                <webuijsf:textArea id="campoP651"
                                                    binding="#{LogImpPer5.campoP651}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p65']}"
                                                    toolTip="BundleParametros.p65.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP651.validate}"/>
                                                <webuijsf:staticText id="campoP651Texto1"
                                                    binding="#{LogImpPer5.campoP651Texto1}"
                                                    text="#{currentRow.value['p65']}"/>
                                                <webuijsf:message id="messageP651"
                                                    for="campoP651"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP65e1}"
                                                    headerText="p65e"
                                                    id="tableColumnP65e1" rendered="false"
                                                    sort="p65e">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP65e1"
                                                    text="#{currentRow.value['p65e']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP65e1}"
                                                    id="labelP65e1"
                                                    for="campoP65e1"/>
                                                <webuijsf:textArea id="campoP65e1"
                                                    binding="#{LogImpPer5.campoP65e1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p65e']}"
                                                    toolTip="BundleParametros.p65e.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP65e1.validate}"/>
                                                <webuijsf:staticText id="campoP65e1Texto1"
                                                    binding="#{LogImpPer5.campoP65e1Texto1}"
                                                    text="#{currentRow.value['p65e']}"/>
                                                <webuijsf:message id="messageP65e1"
                                                    for="campoP65e1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP661}"
                                                    headerText="p66"
                                                    id="tableColumnP661" rendered="false"
                                                    sort="p66">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP661"
                                                    text="#{currentRow.value['p66']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP661}"
                                                    id="labelP661"
                                                    for="campoP661"/>
                                                <webuijsf:textArea id="campoP661"
                                                    binding="#{LogImpPer5.campoP661}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p66']}"
                                                    toolTip="BundleParametros.p66.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP661.validate}"/>
                                                <webuijsf:staticText id="campoP661Texto1"
                                                    binding="#{LogImpPer5.campoP661Texto1}"
                                                    text="#{currentRow.value['p66']}"/>
                                                <webuijsf:message id="messageP661"
                                                    for="campoP661"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP66e1}"
                                                    headerText="p66e"
                                                    id="tableColumnP66e1" rendered="false"
                                                    sort="p66e">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP66e1"
                                                    text="#{currentRow.value['p66e']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP66e1}"
                                                    id="labelP66e1"
                                                    for="campoP66e1"/>
                                                <webuijsf:textArea id="campoP66e1"
                                                    binding="#{LogImpPer5.campoP66e1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p66e']}"
                                                    toolTip="BundleParametros.p66e.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP66e1.validate}"/>
                                                <webuijsf:staticText id="campoP66e1Texto1"
                                                    binding="#{LogImpPer5.campoP66e1Texto1}"
                                                    text="#{currentRow.value['p66e']}"/>
                                                <webuijsf:message id="messageP66e1"
                                                    for="campoP66e1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP671}"
                                                    headerText="p67"
                                                    id="tableColumnP671" rendered="false"
                                                    sort="p67">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP671"
                                                    text="#{currentRow.value['p67']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP671}"
                                                    id="labelP671"
                                                    for="campoP671"/>
                                                <webuijsf:textArea id="campoP671"
                                                    binding="#{LogImpPer5.campoP671}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p67']}"
                                                    toolTip="BundleParametros.p67.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP671.validate}"/>
                                                <webuijsf:staticText id="campoP671Texto1"
                                                    binding="#{LogImpPer5.campoP671Texto1}"
                                                    text="#{currentRow.value['p67']}"/>
                                                <webuijsf:message id="messageP671"
                                                    for="campoP671"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP681}"
                                                    headerText="p68"
                                                    id="tableColumnP681" rendered="false"
                                                    sort="p68">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP681"
                                                    text="#{currentRow.value['p68']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP681}"
                                                    id="labelP681"
                                                    for="campoP681"/>
                                                <webuijsf:textArea id="campoP681"
                                                    binding="#{LogImpPer5.campoP681}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p68']}"
                                                    toolTip="BundleParametros.p68.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP681.validate}"/>
                                                <webuijsf:staticText id="campoP681Texto1"
                                                    binding="#{LogImpPer5.campoP681Texto1}"
                                                    text="#{currentRow.value['p68']}"/>
                                                <webuijsf:message id="messageP681"
                                                    for="campoP681"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP68e1}"
                                                    headerText="p68e"
                                                    id="tableColumnP68e1" rendered="false"
                                                    sort="p68e">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP68e1"
                                                    text="#{currentRow.value['p68e']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP68e1}"
                                                    id="labelP68e1"
                                                    for="campoP68e1"/>
                                                <webuijsf:textArea id="campoP68e1"
                                                    binding="#{LogImpPer5.campoP68e1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p68e']}"
                                                    toolTip="BundleParametros.p68e.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP68e1.validate}"/>
                                                <webuijsf:staticText id="campoP68e1Texto1"
                                                    binding="#{LogImpPer5.campoP68e1Texto1}"
                                                    text="#{currentRow.value['p68e']}"/>
                                                <webuijsf:message id="messageP68e1"
                                                    for="campoP68e1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP731}"
                                                    headerText="p73"
                                                    id="tableColumnP731" rendered="false"
                                                    sort="p73">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP731"
                                                    text="#{currentRow.value['p73']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP731}"
                                                    id="labelP731"
                                                    for="campoP731"/>
                                                <webuijsf:textArea id="campoP731"
                                                    binding="#{LogImpPer5.campoP731}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p73']}"
                                                    toolTip="BundleParametros.p73.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP731.validate}"/>
                                                <webuijsf:staticText id="campoP731Texto1"
                                                    binding="#{LogImpPer5.campoP731Texto1}"
                                                    text="#{currentRow.value['p73']}"/>
                                                <webuijsf:message id="messageP731"
                                                    for="campoP731"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP741}"
                                                    headerText="p74"
                                                    id="tableColumnP741" rendered="false"
                                                    sort="p74">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP741"
                                                    text="#{currentRow.value['p74']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP741}"
                                                    id="labelP741"
                                                    for="campoP741"/>
                                                <webuijsf:textArea id="campoP741"
                                                    binding="#{LogImpPer5.campoP741}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p74']}"
                                                    toolTip="BundleParametros.p74.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP741.validate}"/>
                                                <webuijsf:staticText id="campoP741Texto1"
                                                    binding="#{LogImpPer5.campoP741Texto1}"
                                                    text="#{currentRow.value['p74']}"/>
                                                <webuijsf:message id="messageP741"
                                                    for="campoP741"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000061}"
                                                    headerText="var00006"
                                                    id="tableColumnVar000061" rendered="false"
                                                    sort="var00006">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000061"
                                                    text="#{currentRow.value['var00006']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000061}"
                                                    id="labelVar000061"
                                                    for="campoVar000061"/>
                                                <webuijsf:textArea id="campoVar000061"
                                                    binding="#{LogImpPer5.campoVar000061}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00006']}"
                                                    toolTip="BundleParametros.var00006.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000061.validate}"/>
                                                <webuijsf:staticText id="campoVar000061Texto1"
                                                    binding="#{LogImpPer5.campoVar000061Texto1}"
                                                    text="#{currentRow.value['var00006']}"/>
                                                <webuijsf:message id="messageVar000061"
                                                    for="campoVar000061"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000071}"
                                                    headerText="var00007"
                                                    id="tableColumnVar000071" rendered="false"
                                                    sort="var00007">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000071"
                                                    text="#{currentRow.value['var00007']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000071}"
                                                    id="labelVar000071"
                                                    for="campoVar000071"/>
                                                <webuijsf:textArea id="campoVar000071"
                                                    binding="#{LogImpPer5.campoVar000071}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00007']}"
                                                    toolTip="BundleParametros.var00007.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000071.validate}"/>
                                                <webuijsf:staticText id="campoVar000071Texto1"
                                                    binding="#{LogImpPer5.campoVar000071Texto1}"
                                                    text="#{currentRow.value['var00007']}"/>
                                                <webuijsf:message id="messageVar000071"
                                                    for="campoVar000071"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000081}"
                                                    headerText="var00008"
                                                    id="tableColumnVar000081" rendered="false"
                                                    sort="var00008">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000081"
                                                    text="#{currentRow.value['var00008']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000081}"
                                                    id="labelVar000081"
                                                    for="campoVar000081"/>
                                                <webuijsf:textArea id="campoVar000081"
                                                    binding="#{LogImpPer5.campoVar000081}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00008']}"
                                                    toolTip="BundleParametros.var00008.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000081.validate}"/>
                                                <webuijsf:staticText id="campoVar000081Texto1"
                                                    binding="#{LogImpPer5.campoVar000081Texto1}"
                                                    text="#{currentRow.value['var00008']}"/>
                                                <webuijsf:message id="messageVar000081"
                                                    for="campoVar000081"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000091}"
                                                    headerText="var00009"
                                                    id="tableColumnVar000091" rendered="false"
                                                    sort="var00009">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000091"
                                                    text="#{currentRow.value['var00009']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000091}"
                                                    id="labelVar000091"
                                                    for="campoVar000091"/>
                                                <webuijsf:textArea id="campoVar000091"
                                                    binding="#{LogImpPer5.campoVar000091}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00009']}"
                                                    toolTip="BundleParametros.var00009.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000091.validate}"/>
                                                <webuijsf:staticText id="campoVar000091Texto1"
                                                    binding="#{LogImpPer5.campoVar000091Texto1}"
                                                    text="#{currentRow.value['var00009']}"/>
                                                <webuijsf:message id="messageVar000091"
                                                    for="campoVar000091"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000101}"
                                                    headerText="var00010"
                                                    id="tableColumnVar000101" rendered="false"
                                                    sort="var00010">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000101"
                                                    text="#{currentRow.value['var00010']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000101}"
                                                    id="labelVar000101"
                                                    for="campoVar000101"/>
                                                <webuijsf:textArea id="campoVar000101"
                                                    binding="#{LogImpPer5.campoVar000101}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00010']}"
                                                    toolTip="BundleParametros.var00010.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000101.validate}"/>
                                                <webuijsf:staticText id="campoVar000101Texto1"
                                                    binding="#{LogImpPer5.campoVar000101Texto1}"
                                                    text="#{currentRow.value['var00010']}"/>
                                                <webuijsf:message id="messageVar000101"
                                                    for="campoVar000101"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000111}"
                                                    headerText="var00011"
                                                    id="tableColumnVar000111" rendered="false"
                                                    sort="var00011">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000111"
                                                    text="#{currentRow.value['var00011']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000111}"
                                                    id="labelVar000111"
                                                    for="campoVar000111"/>
                                                <webuijsf:textArea id="campoVar000111"
                                                    binding="#{LogImpPer5.campoVar000111}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00011']}"
                                                    toolTip="BundleParametros.var00011.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000111.validate}"/>
                                                <webuijsf:staticText id="campoVar000111Texto1"
                                                    binding="#{LogImpPer5.campoVar000111Texto1}"
                                                    text="#{currentRow.value['var00011']}"/>
                                                <webuijsf:message id="messageVar000111"
                                                    for="campoVar000111"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000311}"
                                                    headerText="var00031"
                                                    id="tableColumnVar000311" rendered="false"
                                                    sort="var00031">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000311"
                                                    text="#{currentRow.value['var00031']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000311}"
                                                    id="labelVar000311"
                                                    for="campoVar000311"/>
                                                <webuijsf:textArea id="campoVar000311"
                                                    binding="#{LogImpPer5.campoVar000311}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00031']}"
                                                    toolTip="BundleParametros.var00031.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000311.validate}"/>
                                                <webuijsf:staticText id="campoVar000311Texto1"
                                                    binding="#{LogImpPer5.campoVar000311Texto1}"
                                                    text="#{currentRow.value['var00031']}"/>
                                                <webuijsf:message id="messageVar000311"
                                                    for="campoVar000311"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000121}"
                                                    headerText="var00012"
                                                    id="tableColumnVar000121" rendered="false"
                                                    sort="var00012">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000121"
                                                    text="#{currentRow.value['var00012']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000121}"
                                                    id="labelVar000121"
                                                    for="campoVar000121"/>
                                                <webuijsf:textArea id="campoVar000121"
                                                    binding="#{LogImpPer5.campoVar000121}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00012']}"
                                                    toolTip="BundleParametros.var00012.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000121.validate}"/>
                                                <webuijsf:staticText id="campoVar000121Texto1"
                                                    binding="#{LogImpPer5.campoVar000121Texto1}"
                                                    text="#{currentRow.value['var00012']}"/>
                                                <webuijsf:message id="messageVar000121"
                                                    for="campoVar000121"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000131}"
                                                    headerText="var00013"
                                                    id="tableColumnVar000131" rendered="false"
                                                    sort="var00013">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000131"
                                                    text="#{currentRow.value['var00013']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000131}"
                                                    id="labelVar000131"
                                                    for="campoVar000131"/>
                                                <webuijsf:textArea id="campoVar000131"
                                                    binding="#{LogImpPer5.campoVar000131}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00013']}"
                                                    toolTip="BundleParametros.var00013.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000131.validate}"/>
                                                <webuijsf:staticText id="campoVar000131Texto1"
                                                    binding="#{LogImpPer5.campoVar000131Texto1}"
                                                    text="#{currentRow.value['var00013']}"/>
                                                <webuijsf:message id="messageVar000131"
                                                    for="campoVar000131"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP861}"
                                                    headerText="p86"
                                                    id="tableColumnP861" rendered="false"
                                                    sort="p86">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP861"
                                                    text="#{currentRow.value['p86']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP861}"
                                                    id="labelP861"
                                                    for="campoP861"/>
                                                <webuijsf:textArea id="campoP861"
                                                    binding="#{LogImpPer5.campoP861}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p86']}"
                                                    toolTip="BundleParametros.p86.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP861.validate}"/>
                                                <webuijsf:staticText id="campoP861Texto1"
                                                    binding="#{LogImpPer5.campoP861Texto1}"
                                                    text="#{currentRow.value['p86']}"/>
                                                <webuijsf:message id="messageP861"
                                                    for="campoP861"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP871}"
                                                    headerText="p87"
                                                    id="tableColumnP871" rendered="false"
                                                    sort="p87">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP871"
                                                    text="#{currentRow.value['p87']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP871}"
                                                    id="labelP871"
                                                    for="campoP871"/>
                                                <webuijsf:textArea id="campoP871"
                                                    binding="#{LogImpPer5.campoP871}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p87']}"
                                                    toolTip="BundleParametros.p87.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP871.validate}"/>
                                                <webuijsf:staticText id="campoP871Texto1"
                                                    binding="#{LogImpPer5.campoP871Texto1}"
                                                    text="#{currentRow.value['p87']}"/>
                                                <webuijsf:message id="messageP871"
                                                    for="campoP871"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP87e1}"
                                                    headerText="p87e"
                                                    id="tableColumnP87e1" rendered="false"
                                                    sort="p87e">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP87e1"
                                                    text="#{currentRow.value['p87e']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP87e1}"
                                                    id="labelP87e1"
                                                    for="campoP87e1"/>
                                                <webuijsf:textArea id="campoP87e1"
                                                    binding="#{LogImpPer5.campoP87e1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p87e']}"
                                                    toolTip="BundleParametros.p87e.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP87e1.validate}"/>
                                                <webuijsf:staticText id="campoP87e1Texto1"
                                                    binding="#{LogImpPer5.campoP87e1Texto1}"
                                                    text="#{currentRow.value['p87e']}"/>
                                                <webuijsf:message id="messageP87e1"
                                                    for="campoP87e1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP881}"
                                                    headerText="p88"
                                                    id="tableColumnP881" rendered="false"
                                                    sort="p88">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP881"
                                                    text="#{currentRow.value['p88']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP881}"
                                                    id="labelP881"
                                                    for="campoP881"/>
                                                <webuijsf:textArea id="campoP881"
                                                    binding="#{LogImpPer5.campoP881}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p88']}"
                                                    toolTip="BundleParametros.p88.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP881.validate}"/>
                                                <webuijsf:staticText id="campoP881Texto1"
                                                    binding="#{LogImpPer5.campoP881Texto1}"
                                                    text="#{currentRow.value['p88']}"/>
                                                <webuijsf:message id="messageP881"
                                                    for="campoP881"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP88e1}"
                                                    headerText="p88e"
                                                    id="tableColumnP88e1" rendered="false"
                                                    sort="p88e">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP88e1"
                                                    text="#{currentRow.value['p88e']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP88e1}"
                                                    id="labelP88e1"
                                                    for="campoP88e1"/>
                                                <webuijsf:textArea id="campoP88e1"
                                                    binding="#{LogImpPer5.campoP88e1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p88e']}"
                                                    toolTip="BundleParametros.p88e.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP88e1.validate}"/>
                                                <webuijsf:staticText id="campoP88e1Texto1"
                                                    binding="#{LogImpPer5.campoP88e1Texto1}"
                                                    text="#{currentRow.value['p88e']}"/>
                                                <webuijsf:message id="messageP88e1"
                                                    for="campoP88e1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP911}"
                                                    headerText="p91"
                                                    id="tableColumnP911" rendered="false"
                                                    sort="p91">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP911"
                                                    text="#{currentRow.value['p91']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP911}"
                                                    id="labelP911"
                                                    for="campoP911"/>
                                                <webuijsf:textArea id="campoP911"
                                                    binding="#{LogImpPer5.campoP911}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p91']}"
                                                    toolTip="BundleParametros.p91.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP911.validate}"/>
                                                <webuijsf:staticText id="campoP911Texto1"
                                                    binding="#{LogImpPer5.campoP911Texto1}"
                                                    text="#{currentRow.value['p91']}"/>
                                                <webuijsf:message id="messageP911"
                                                    for="campoP911"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000171}"
                                                    headerText="var00017"
                                                    id="tableColumnVar000171" rendered="false"
                                                    sort="var00017">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000171"
                                                    text="#{currentRow.value['var00017']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000171}"
                                                    id="labelVar000171"
                                                    for="campoVar000171"/>
                                                <webuijsf:textArea id="campoVar000171"
                                                    binding="#{LogImpPer5.campoVar000171}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00017']}"
                                                    toolTip="BundleParametros.var00017.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000171.validate}"/>
                                                <webuijsf:staticText id="campoVar000171Texto1"
                                                    binding="#{LogImpPer5.campoVar000171Texto1}"
                                                    text="#{currentRow.value['var00017']}"/>
                                                <webuijsf:message id="messageVar000171"
                                                    for="campoVar000171"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000181}"
                                                    headerText="var00018"
                                                    id="tableColumnVar000181" rendered="false"
                                                    sort="var00018">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000181"
                                                    text="#{currentRow.value['var00018']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000181}"
                                                    id="labelVar000181"
                                                    for="campoVar000181"/>
                                                <webuijsf:textArea id="campoVar000181"
                                                    binding="#{LogImpPer5.campoVar000181}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00018']}"
                                                    toolTip="BundleParametros.var00018.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000181.validate}"/>
                                                <webuijsf:staticText id="campoVar000181Texto1"
                                                    binding="#{LogImpPer5.campoVar000181Texto1}"
                                                    text="#{currentRow.value['var00018']}"/>
                                                <webuijsf:message id="messageVar000181"
                                                    for="campoVar000181"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000191}"
                                                    headerText="var00019"
                                                    id="tableColumnVar000191" rendered="false"
                                                    sort="var00019">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000191"
                                                    text="#{currentRow.value['var00019']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000191}"
                                                    id="labelVar000191"
                                                    for="campoVar000191"/>
                                                <webuijsf:textArea id="campoVar000191"
                                                    binding="#{LogImpPer5.campoVar000191}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00019']}"
                                                    toolTip="BundleParametros.var00019.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000191.validate}"/>
                                                <webuijsf:staticText id="campoVar000191Texto1"
                                                    binding="#{LogImpPer5.campoVar000191Texto1}"
                                                    text="#{currentRow.value['var00019']}"/>
                                                <webuijsf:message id="messageVar000191"
                                                    for="campoVar000191"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000201}"
                                                    headerText="var00020"
                                                    id="tableColumnVar000201" rendered="false"
                                                    sort="var00020">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000201"
                                                    text="#{currentRow.value['var00020']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000201}"
                                                    id="labelVar000201"
                                                    for="campoVar000201"/>
                                                <webuijsf:textArea id="campoVar000201"
                                                    binding="#{LogImpPer5.campoVar000201}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00020']}"
                                                    toolTip="BundleParametros.var00020.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000201.validate}"/>
                                                <webuijsf:staticText id="campoVar000201Texto1"
                                                    binding="#{LogImpPer5.campoVar000201Texto1}"
                                                    text="#{currentRow.value['var00020']}"/>
                                                <webuijsf:message id="messageVar000201"
                                                    for="campoVar000201"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000211}"
                                                    headerText="var00021"
                                                    id="tableColumnVar000211" rendered="false"
                                                    sort="var00021">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000211"
                                                    text="#{currentRow.value['var00021']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000211}"
                                                    id="labelVar000211"
                                                    for="campoVar000211"/>
                                                <webuijsf:textArea id="campoVar000211"
                                                    binding="#{LogImpPer5.campoVar000211}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00021']}"
                                                    toolTip="BundleParametros.var00021.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000211.validate}"/>
                                                <webuijsf:staticText id="campoVar000211Texto1"
                                                    binding="#{LogImpPer5.campoVar000211Texto1}"
                                                    text="#{currentRow.value['var00021']}"/>
                                                <webuijsf:message id="messageVar000211"
                                                    for="campoVar000211"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000221}"
                                                    headerText="var00022"
                                                    id="tableColumnVar000221" rendered="false"
                                                    sort="var00022">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000221"
                                                    text="#{currentRow.value['var00022']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000221}"
                                                    id="labelVar000221"
                                                    for="campoVar000221"/>
                                                <webuijsf:textArea id="campoVar000221"
                                                    binding="#{LogImpPer5.campoVar000221}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00022']}"
                                                    toolTip="BundleParametros.var00022.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000221.validate}"/>
                                                <webuijsf:staticText id="campoVar000221Texto1"
                                                    binding="#{LogImpPer5.campoVar000221Texto1}"
                                                    text="#{currentRow.value['var00022']}"/>
                                                <webuijsf:message id="messageVar000221"
                                                    for="campoVar000221"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000231}"
                                                    headerText="var00023"
                                                    id="tableColumnVar000231" rendered="false"
                                                    sort="var00023">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000231"
                                                    text="#{currentRow.value['var00023']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000231}"
                                                    id="labelVar000231"
                                                    for="campoVar000231"/>
                                                <webuijsf:textArea id="campoVar000231"
                                                    binding="#{LogImpPer5.campoVar000231}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00023']}"
                                                    toolTip="BundleParametros.var00023.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000231.validate}"/>
                                                <webuijsf:staticText id="campoVar000231Texto1"
                                                    binding="#{LogImpPer5.campoVar000231Texto1}"
                                                    text="#{currentRow.value['var00023']}"/>
                                                <webuijsf:message id="messageVar000231"
                                                    for="campoVar000231"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000241}"
                                                    headerText="var00024"
                                                    id="tableColumnVar000241" rendered="false"
                                                    sort="var00024">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000241"
                                                    text="#{currentRow.value['var00024']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000241}"
                                                    id="labelVar000241"
                                                    for="campoVar000241"/>
                                                <webuijsf:textArea id="campoVar000241"
                                                    binding="#{LogImpPer5.campoVar000241}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00024']}"
                                                    toolTip="BundleParametros.var00024.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000241.validate}"/>
                                                <webuijsf:staticText id="campoVar000241Texto1"
                                                    binding="#{LogImpPer5.campoVar000241Texto1}"
                                                    text="#{currentRow.value['var00024']}"/>
                                                <webuijsf:message id="messageVar000241"
                                                    for="campoVar000241"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000251}"
                                                    headerText="var00025"
                                                    id="tableColumnVar000251" rendered="false"
                                                    sort="var00025">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000251"
                                                    text="#{currentRow.value['var00025']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000251}"
                                                    id="labelVar000251"
                                                    for="campoVar000251"/>
                                                <webuijsf:textArea id="campoVar000251"
                                                    binding="#{LogImpPer5.campoVar000251}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00025']}"
                                                    toolTip="BundleParametros.var00025.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000251.validate}"/>
                                                <webuijsf:staticText id="campoVar000251Texto1"
                                                    binding="#{LogImpPer5.campoVar000251Texto1}"
                                                    text="#{currentRow.value['var00025']}"/>
                                                <webuijsf:message id="messageVar000251"
                                                    for="campoVar000251"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000261}"
                                                    headerText="var00026"
                                                    id="tableColumnVar000261" rendered="false"
                                                    sort="var00026">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000261"
                                                    text="#{currentRow.value['var00026']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000261}"
                                                    id="labelVar000261"
                                                    for="campoVar000261"/>
                                                <webuijsf:textArea id="campoVar000261"
                                                    binding="#{LogImpPer5.campoVar000261}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00026']}"
                                                    toolTip="BundleParametros.var00026.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000261.validate}"/>
                                                <webuijsf:staticText id="campoVar000261Texto1"
                                                    binding="#{LogImpPer5.campoVar000261Texto1}"
                                                    text="#{currentRow.value['var00026']}"/>
                                                <webuijsf:message id="messageVar000261"
                                                    for="campoVar000261"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000271}"
                                                    headerText="var00027"
                                                    id="tableColumnVar000271" rendered="false"
                                                    sort="var00027">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000271"
                                                    text="#{currentRow.value['var00027']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000271}"
                                                    id="labelVar000271"
                                                    for="campoVar000271"/>
                                                <webuijsf:textArea id="campoVar000271"
                                                    binding="#{LogImpPer5.campoVar000271}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00027']}"
                                                    toolTip="BundleParametros.var00027.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000271.validate}"/>
                                                <webuijsf:staticText id="campoVar000271Texto1"
                                                    binding="#{LogImpPer5.campoVar000271Texto1}"
                                                    text="#{currentRow.value['var00027']}"/>
                                                <webuijsf:message id="messageVar000271"
                                                    for="campoVar000271"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnVar000281}"
                                                    headerText="var00028"
                                                    id="tableColumnVar000281" rendered="false"
                                                    sort="var00028">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextVar000281"
                                                    text="#{currentRow.value['var00028']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelVar000281}"
                                                    id="labelVar000281"
                                                    for="campoVar000281"/>
                                                <webuijsf:textArea id="campoVar000281"
                                                    binding="#{LogImpPer5.campoVar000281}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['var00028']}"
                                                    toolTip="BundleParametros.var00028.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorVar000281.validate}"/>
                                                <webuijsf:staticText id="campoVar000281Texto1"
                                                    binding="#{LogImpPer5.campoVar000281Texto1}"
                                                    text="#{currentRow.value['var00028']}"/>
                                                <webuijsf:message id="messageVar000281"
                                                    for="campoVar000281"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnP921}"
                                                    headerText="p92"
                                                    id="tableColumnP921" rendered="false"
                                                    sort="p92">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextP921"
                                                    text="#{currentRow.value['p92']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelP921}"
                                                    id="labelP921"
                                                    for="campoP921"/>
                                                <webuijsf:textArea id="campoP921"
                                                    binding="#{LogImpPer5.campoP921}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['p92']}"
                                                    toolTip="BundleParametros.p92.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorP921.validate}"/>
                                                <webuijsf:staticText id="campoP921Texto1"
                                                    binding="#{LogImpPer5.campoP921Texto1}"
                                                    text="#{currentRow.value['p92']}"/>
                                                <webuijsf:message id="messageP921"
                                                    for="campoP921"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnIcv1}"
                                                    headerText="icv"
                                                    id="tableColumnIcv1" rendered="false"
                                                    sort="icv">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIcv1"
                                                    text="#{currentRow.value['icv']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelIcv1}"
                                                    id="labelIcv1"
                                                    for="campoIcv1"/>
                                                <webuijsf:textArea id="campoIcv1"
                                                    binding="#{LogImpPer5.campoIcv1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['icv']}"
                                                    toolTip="BundleParametros.icv.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorIcv1.validate}"/>
                                                <webuijsf:staticText id="campoIcv1Texto1"
                                                    binding="#{LogImpPer5.campoIcv1Texto1}"
                                                    text="#{currentRow.value['icv']}"/>
                                                <webuijsf:message id="messageIcv1"
                                                    for="campoIcv1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnFichaActiva1}"
                                                    headerText="ficha activa"
                                                    id="tableColumnFichaActiva1" rendered="false"
                                                    sort="ficha_activa">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFichaActiva1"
                                                    text="#{currentRow.value['ficha_activa']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelFichaActiva1}"
                                                    id="labelFichaActiva1"
                                                    for="campoFichaActiva1"/>
                                                <webuijsf:textArea id="campoFichaActiva1"
                                                    binding="#{LogImpPer5.campoFichaActiva1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['ficha_activa']}"
                                                    toolTip="BundleParametros.ficha_activa.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorFichaActiva1.validate}"/>
                                                <webuijsf:staticText id="campoFichaActiva1Texto1"
                                                    binding="#{LogImpPer5.campoFichaActiva1Texto1}"
                                                    text="#{currentRow.value['ficha_activa']}"/>
                                                <webuijsf:message id="messageFichaActiva1"
                                                    for="campoFichaActiva1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnEsImportado1}"
                                                    headerText="importado"
                                                    id="tableColumnEsImportado1"
                                                    sort="es_importado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsImportado1"
                                                    text="#{currentRow.value['es_importado']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpPer5.listaEsImportado1}"
                                                    converter="#{LogImpPer5.converterEsImportado1}"
                                                    disabled="#{LogImpPer5.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpPer5.asistente.opcionesListaEsImportado1}"
                                                    selected="#{currentRow.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_per"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpPer5.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnObservacion1}"
                                                    headerText="observaci&#243;n"
                                                    id="tableColumnObservacion1" rendered="false"
                                                    sort="observacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacion1"
                                                    text="#{currentRow.value['observacion']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpPer5.campoObservacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpPer5.campoObservacion1Texto1}"
                                                    text="#{currentRow.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnFechaHoraTransaccion1}"
                                                    headerText="fecha hora transacci&#243;n"
                                                    id="tableColumnFechaHoraTransaccion1"
                                                    sort="fecha_hora_transaccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraTransaccion1"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpPer5.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpPer5.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_per"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpPer5.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpPer5.converterFechaHoraTransaccion1}"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnNombreArchivo1}"
                                                    headerText="nombre archivo"
                                                    id="tableColumnNombreArchivo1" rendered="false"
                                                    sort="nombre_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivo1"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpPer5.campoNombreArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpPer5.campoNombreArchivo1Texto1}"
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
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogImpPer5.campoNombreArchivo1Boton3}"
                                                    id="campoNombreArchivo1Boton3"
                                                    onClick="#{LogImpPer5.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpPer5.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpPer5.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpPer5.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpPer5.tableColumnCodigoArchivo1}"
                                                    headerText="c&#243;digo archivo"
                                                    id="tableColumnCodigoArchivo1" rendered="false"
                                                    sort="codigo_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoArchivo1"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    rendered="#{LogImpPer5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpPer5.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpPer5.campoCodigoArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpPer5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_per"
                                                    validatorExpression="#{LogImpPer5.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpPer5.campoCodigoArchivo1Texto1}"
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
                                                        binding="#{LogImpPer5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{LogImpPer5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{LogImpPer5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{LogImpPer5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{LogImpPer5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{LogImpPer5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{LogImpPer5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpPer5.botonRepaginar1_action}"
                                                        binding="#{LogImpPer5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{LogImpPer5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{LogImpPer5.gestor.scriptRepaginar}"
                                                        text="#{LogImpPer5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonAgregar1_action}"
                                                    binding="#{LogImpPer5.botonAgregar1}"
                                                    disabled="#{LogImpPer5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpPer5.gestor.scriptAgregar}"
                                                    rendered="#{LogImpPer5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpPer5.listaFuncionEdicion1}"
                                                    converter="#{LogImpPer5.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpPer5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpPer5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpPer5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpPer5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonEditar1_action}"
                                                    binding="#{LogImpPer5.botonEditar1}"
                                                    disabled="#{LogImpPer5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpPer5.gestor.scriptEditar}"
                                                    rendered="#{LogImpPer5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpPer5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonEliminar1_action}"
                                                    binding="#{LogImpPer5.botonEliminar1}"
                                                    disabled="#{LogImpPer5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpPer5.gestor.scriptEliminar}"
                                                    rendered="#{LogImpPer5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonAplicar1_action}"
                                                    binding="#{LogImpPer5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpPer5.gestor.scriptAplicar}"
                                                    rendered="#{LogImpPer5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonDeshacer1_action}"
                                                    binding="#{LogImpPer5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpPer5.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpPer5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonConfirmar1_action}"
                                                    binding="#{LogImpPer5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpPer5.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpPer5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonDescartar1_action}"
                                                    binding="#{LogImpPer5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpPer5.gestor.scriptDescartar}"
                                                    rendered="#{LogImpPer5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpPer5.listaFuncionAccion1}"
                                                    converter="#{LogImpPer5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpPer5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpPer5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpPer5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonProcesar1_action}"
                                                    binding="#{LogImpPer5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpPer5.gestor.scriptProcesar}"
                                                    rendered="#{LogImpPer5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonRefrescar1_action}"
                                                    binding="#{LogImpPer5.botonRefrescar1}"
                                                    disabled="#{LogImpPer5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpPer5.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpPer5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonReconsultar1_action}"
                                                    binding="#{LogImpPer5.botonReconsultar1}"
                                                    disabled="#{LogImpPer5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpPer5.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpPer5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpPer5.botonRetornar1_action}"
                                                    binding="#{LogImpPer5.botonRetornar1}"
                                                    disabled="#{LogImpPer5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpPer5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpPer5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpPer5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpPer5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{LogImpPer5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpPer5.imageHyperlink1_action}"
                                                    binding="#{LogImpPer5.imageHyperlink1}"
                                                    disabled="#{LogImpPer5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpPer5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpPer5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpPer5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpPer5_imageHyperlink1_toolTip}"/>
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
