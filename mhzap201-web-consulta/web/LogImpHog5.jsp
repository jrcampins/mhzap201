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
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdLogImpHog1 campoObservaciones1 campoLetraCi1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
