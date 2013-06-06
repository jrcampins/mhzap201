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
                    focus="#{ClaseRecursoParametroPorClaseRecurso1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{ClaseRecursoParametroPorClaseRecurso1.gestor.preserveFocus}"
                    preserveScroll="#{ClaseRecursoParametroPorClaseRecurso1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{ClaseRecursoParametroPorClaseRecurso1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdClaseRecursoPar1 campoIdParametro1 listaNumeroTipoParametro1 listaNumeroTipoComparacion1 campoIdFuncionReferencia1 listaNumeroTipoValor1 campoIdListaValor1 campoIdClaseObjetoValor1 campoIdClaseRecursoValor1 campoValorMinimo1 campoValorMaximo1 campoValorOmision1 listaEsParametroOmisible1 listaEsParametroInmutable1 listaEsParametroSubmit1 listaEsParametroPrimordial1 listaEsParametroMaestro1 listaEsParametroSegmento1 listaEsParametroSinRastro1 listaEsParametroSincronizado1 campoOrdenPresentacion1 campoIdClaseRecursoSec1 listaEsReferenciaAlternativa1 listaNumeroTipoValorAlternativo1 campoIdFuncionReferenciaAlt1 campoIdListaValorAlternativa1 campoIdClaseObjetoValorAlt1 campoIdClaseRecursoValorAlt1 campoOrdenPaginaSeleccion1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{ClaseRecursoParametroPorClaseRecurso1.breadcrumbs1}" 
                                        id="breadcrumbs1" 
                                        styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <jsp:directive.include file="FragmentoFiltro_1.jspf"/>
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
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{ClaseRecursoParametroPorClaseRecurso1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.mensajeDisponible}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.mensaje}"
                                                    url="#{ClaseRecursoParametroPorClaseRecurso1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{ClaseRecursoParametroPorClaseRecurso1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{ClaseRecursoParametroPorClaseRecurso1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaEscogida}" 
                                                sourceData="#{ClaseRecursoParametroPorClaseRecurso1.claseRecursoParDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptElegir}" 
                                                        selected="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaElegida}" 
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.botonEscogerFila1_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso1.botonEscogerFila1}"
                                                        disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso1.gestor.urlImagenEscoger}" 
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptEscoger}"
                                                        text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.botonDetallarFila1_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso1.botonDetallarFila1}"
                                                        disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso1.gestor.urlImagenDetallar}" 
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.detalleDisponible}" 
                                                        text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.botonProcesarFila1_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso1.botonProcesarFila1}"
                                                        disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso1.gestor.urlImagenProcesar}" 
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{ClaseRecursoParametroPorClaseRecurso1.asistente.comandoDisponible}" 
                                                        text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.botonRetornarFila1_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso1.botonRetornarFila1}" 
                                                        disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso1.gestor.urlImagenRetornar}"
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionReturnVisible}" 
                                                        text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.hipervinculoAccionFila1_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso1.hipervinculoAccionFila1}"
                                                        disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.ClaseRecursoParametroPorClaseRecurso1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumn3}" 
                                                    headerText="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.hipervinculoDetallarFila1_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.identificacionFila}" 
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnIdClaseRecursoPar1}"
                                                    toolTip="BundleParametros.id_clase_recurso_par.clase_recurso_par"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdClaseRecursoPar1"
                                                    sort="id_clase_recurso_par">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoPar1"
                                                    text="#{currentRow.value['id_clase_recurso_par']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelIdClaseRecursoPar1}"
                                                    id="labelIdClaseRecursoPar1"
                                                    for="campoIdClaseRecursoPar1"/>
                                                <webuijsf:textField id="campoIdClaseRecursoPar1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseRecursoPar1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterIdClaseRecursoPar1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_clase_recurso_par']}"
                                                    toolTip="BundleParametros.id_clase_recurso_par.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.validatorIdClaseRecursoPar1.validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoPar1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseRecursoPar1Texto1}"
                                                    text="#{currentRow.value['id_clase_recurso_par']}"/>
                                                <webuijsf:message id="messageIdClaseRecursoPar1"
                                                    for="campoIdClaseRecursoPar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnIdParametro1}"
                                                    toolTip="BundleParametros.id_parametro.clase_recurso_par"
                                                    headerText="parametro"
                                                    id="tableColumnIdParametro1"
                                                    sort="codigo_parametro_1x2y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdParametro1"
                                                    text="#{currentRow.value['codigo_parametro_1x2y3']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelIdParametro1}"
                                                    id="labelIdParametro1"
                                                    for="campoIdParametro1"/>
                                                <webuijsf:textField id="campoIdParametro1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdParametro1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso1.asistente.textoCampoIdParametro1}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.asistente.toolTipCampoIdParametro1}"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.campoIdParametro1_validate}"/>
                                                <webuijsf:staticText id="campoIdParametro1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdParametro1Texto1}"
                                                    text="#{currentRow.value['codigo_parametro_1x2y3']}"/>
                                                <webuijsf:message id="messageIdParametro1"
                                                    for="campoIdParametro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdParametro3"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.asistente.tableColumnIdParametro3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdParametro3"
                                                    text="#{currentRow.value['id_parametro']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdParametro1Boton1}"
                                                    id="campoIdParametro1Boton1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.asistente.scriptCampoIdParametro1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdParametro1Boton3}"
                                                    id="campoIdParametro1Boton3"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.asistente.scriptCampoIdParametro1Boton2}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.asistente.campoIdParametro1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnIdParametro2}"
                                                    headerText="nombre parametro"
                                                    id="tableColumnIdParametro2"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.asistente.campoIdParametro1Boton2Rendered}"
                                                    sort="nombre_parametro_1x2y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdParametro2"
                                                    text="#{currentRow.value['nombre_parametro_1x2y4']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelIdParametro2}"
                                                    id="labelIdParametro2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdParametro1Hiper1}"
                                                    id="campoIdParametro1Hiper1"
                                                    text="#{currentRow.value['nombre_parametro_1x2y4']}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.asistente.scriptCampoIdParametro1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdParametro1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnNumeroTipoParametro1}"
                                                    toolTip="BundleParametros.numero_tipo_parametro.clase_recurso_par"
                                                    headerText="tipo parametro"
                                                    id="tableColumnNumeroTipoParametro1"
                                                    sort="codigo_tipo_parametro_1x3y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoParametro1"
                                                    text="#{currentRow.value['codigo_tipo_parametro_1x3y2']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelNumeroTipoParametro1}"
                                                    id="labelNumeroTipoParametro1"
                                                    for="listaNumeroTipoParametro1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoParametro1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaNumeroTipoParametro1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterNumeroTipoParametro1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso1.asistente.opcionesListaNumeroTipoParametro1}"
                                                    selected="#{currentRow.value['numero_tipo_parametro']}"
                                                    toolTip="BundleParametros.numero_tipo_parametro.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaNumeroTipoParametro1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaNumeroTipoParametro1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_parametro_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoParametro1"
                                                    for="listaNumeroTipoParametro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnNumeroTipoComparacion1}"
                                                    toolTip="BundleParametros.numero_tipo_comparacion.clase_recurso_par"
                                                    headerText="tipo comparaci&#243;n"
                                                    id="tableColumnNumeroTipoComparacion1" rendered="false"
                                                    sort="codigo_tipo_comparacion_1x4y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoComparacion1"
                                                    text="#{currentRow.value['codigo_tipo_comparacion_1x4y2']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelNumeroTipoComparacion1}"
                                                    id="labelNumeroTipoComparacion1"
                                                    for="listaNumeroTipoComparacion1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoComparacion1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaNumeroTipoComparacion1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterNumeroTipoComparacion1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso1.asistente.opcionesListaNumeroTipoComparacion1}"
                                                    selected="#{currentRow.value['numero_tipo_comparacion']}"
                                                    toolTip="BundleParametros.numero_tipo_comparacion.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaNumeroTipoComparacion1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaNumeroTipoComparacion1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_comparacion_1x4y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoComparacion1"
                                                    for="listaNumeroTipoComparacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnIdFuncionReferencia1}"
                                                    toolTip="BundleParametros.id_funcion_referencia.clase_recurso_par"
                                                    headerText="funci&#243;n referencia"
                                                    id="tableColumnIdFuncionReferencia1" rendered="false"
                                                    sort="codigo_funcion_1x5y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionReferencia1"
                                                    text="#{currentRow.value['codigo_funcion_1x5y3']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelIdFuncionReferencia1}"
                                                    id="labelIdFuncionReferencia1"
                                                    for="campoIdFuncionReferencia1"/>
                                                <webuijsf:textField id="campoIdFuncionReferencia1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdFuncionReferencia1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso1.asistente.textoCampoIdFuncionReferencia1}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.asistente.toolTipCampoIdFuncionReferencia1}"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.campoIdFuncionReferencia1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionReferencia1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdFuncionReferencia1Texto1}"
                                                    text="#{currentRow.value['codigo_funcion_1x5y3']}"/>
                                                <webuijsf:message id="messageIdFuncionReferencia1"
                                                    for="campoIdFuncionReferencia1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFuncionReferencia3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionReferencia3"
                                                    text="#{currentRow.value['id_funcion_referencia']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdFuncionReferencia1Boton1}"
                                                    id="campoIdFuncionReferencia1Boton1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.asistente.scriptCampoIdFuncionReferencia1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdFuncionReferencia1Boton3}"
                                                    id="campoIdFuncionReferencia1Boton3"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.asistente.scriptCampoIdFuncionReferencia1Boton2}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.asistente.campoIdFuncionReferencia1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnIdFuncionReferencia2}"
                                                    headerText="nombre funci&#243;n referencia"
                                                    id="tableColumnIdFuncionReferencia2" rendered="false"
                                                    sort="nombre_funcion_1x5y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionReferencia2"
                                                    text="#{currentRow.value['nombre_funcion_1x5y4']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelIdFuncionReferencia2}"
                                                    id="labelIdFuncionReferencia2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdFuncionReferencia1Hiper1}"
                                                    id="campoIdFuncionReferencia1Hiper1"
                                                    text="#{currentRow.value['nombre_funcion_1x5y4']}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.asistente.scriptCampoIdFuncionReferencia1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFuncionReferencia1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnNumeroTipoValor1}"
                                                    toolTip="BundleParametros.numero_tipo_valor.clase_recurso_par"
                                                    headerText="tipo valor"
                                                    id="tableColumnNumeroTipoValor1" rendered="false"
                                                    sort="codigo_tipo_valor_1x6y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoValor1"
                                                    text="#{currentRow.value['codigo_tipo_valor_1x6y2']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelNumeroTipoValor1}"
                                                    id="labelNumeroTipoValor1"
                                                    for="listaNumeroTipoValor1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoValor1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaNumeroTipoValor1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterNumeroTipoValor1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso1.asistente.opcionesListaNumeroTipoValor1}"
                                                    selected="#{currentRow.value['numero_tipo_valor']}"
                                                    toolTip="BundleParametros.numero_tipo_valor.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaNumeroTipoValor1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaNumeroTipoValor1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_valor_1x6y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoValor1"
                                                    for="listaNumeroTipoValor1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnIdListaValor1}"
                                                    toolTip="BundleParametros.id_lista_valor.clase_recurso_par"
                                                    headerText="identificaci&#243;n lista valor"
                                                    id="tableColumnIdListaValor1" rendered="false"
                                                    sort="id_lista_valor">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdListaValor1"
                                                    text="#{currentRow.value['id_lista_valor']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelIdListaValor1}"
                                                    id="labelIdListaValor1"
                                                    for="campoIdListaValor1"/>
                                                <webuijsf:textField id="campoIdListaValor1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdListaValor1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterIdListaValor1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_lista_valor']}"
                                                    toolTip="BundleParametros.id_lista_valor.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.validatorIdListaValor1.validate}"/>
                                                <webuijsf:staticText id="campoIdListaValor1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdListaValor1Texto1}"
                                                    text="#{currentRow.value['id_lista_valor']}"/>
                                                <webuijsf:message id="messageIdListaValor1"
                                                    for="campoIdListaValor1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnIdClaseObjetoValor1}"
                                                    toolTip="BundleParametros.id_clase_objeto_valor.clase_recurso_par"
                                                    headerText="identificaci&#243;n clase objeto valor"
                                                    id="tableColumnIdClaseObjetoValor1" rendered="false"
                                                    sort="id_clase_objeto_valor">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseObjetoValor1"
                                                    text="#{currentRow.value['id_clase_objeto_valor']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelIdClaseObjetoValor1}"
                                                    id="labelIdClaseObjetoValor1"
                                                    for="campoIdClaseObjetoValor1"/>
                                                <webuijsf:textField id="campoIdClaseObjetoValor1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseObjetoValor1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterIdClaseObjetoValor1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_clase_objeto_valor']}"
                                                    toolTip="BundleParametros.id_clase_objeto_valor.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.validatorIdClaseObjetoValor1.validate}"/>
                                                <webuijsf:staticText id="campoIdClaseObjetoValor1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseObjetoValor1Texto1}"
                                                    text="#{currentRow.value['id_clase_objeto_valor']}"/>
                                                <webuijsf:message id="messageIdClaseObjetoValor1"
                                                    for="campoIdClaseObjetoValor1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnIdClaseRecursoValor1}"
                                                    toolTip="BundleParametros.id_clase_recurso_valor.clase_recurso_par"
                                                    headerText="clase recurso valor"
                                                    id="tableColumnIdClaseRecursoValor1" rendered="false"
                                                    sort="codigo_clase_recurso_1x7y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoValor1"
                                                    text="#{currentRow.value['codigo_clase_recurso_1x7y3']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelIdClaseRecursoValor1}"
                                                    id="labelIdClaseRecursoValor1"
                                                    for="campoIdClaseRecursoValor1"/>
                                                <webuijsf:textField id="campoIdClaseRecursoValor1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseRecursoValor1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso1.asistente.textoCampoIdClaseRecursoValor1}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.asistente.toolTipCampoIdClaseRecursoValor1}"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseRecursoValor1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoValor1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseRecursoValor1Texto1}"
                                                    text="#{currentRow.value['codigo_clase_recurso_1x7y3']}"/>
                                                <webuijsf:message id="messageIdClaseRecursoValor1"
                                                    for="campoIdClaseRecursoValor1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdClaseRecursoValor3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoValor3"
                                                    text="#{currentRow.value['id_clase_recurso_valor']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseRecursoValor1Boton1}"
                                                    id="campoIdClaseRecursoValor1Boton1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.asistente.scriptCampoIdClaseRecursoValor1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseRecursoValor1Boton3}"
                                                    id="campoIdClaseRecursoValor1Boton3"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.asistente.scriptCampoIdClaseRecursoValor1Boton2}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.asistente.campoIdClaseRecursoValor1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnIdClaseRecursoValor2}"
                                                    headerText="nombre clase recurso valor"
                                                    id="tableColumnIdClaseRecursoValor2" rendered="false"
                                                    sort="nombre_clase_recurso_1x7y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoValor2"
                                                    text="#{currentRow.value['nombre_clase_recurso_1x7y4']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelIdClaseRecursoValor2}"
                                                    id="labelIdClaseRecursoValor2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseRecursoValor1Hiper1}"
                                                    id="campoIdClaseRecursoValor1Hiper1"
                                                    text="#{currentRow.value['nombre_clase_recurso_1x7y4']}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.asistente.scriptCampoIdClaseRecursoValor1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdClaseRecursoValor1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnValorMinimo1}"
                                                    toolTip="BundleParametros.valor_minimo.clase_recurso_par"
                                                    headerText="valor minimo"
                                                    id="tableColumnValorMinimo1" rendered="false"
                                                    sort="valor_minimo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextValorMinimo1"
                                                    text="#{currentRow.value['valor_minimo']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelValorMinimo1}"
                                                    id="labelValorMinimo1"
                                                    for="campoValorMinimo1"/>
                                                <webuijsf:textField id="campoValorMinimo1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoValorMinimo1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['valor_minimo']}"
                                                    toolTip="BundleParametros.valor_minimo.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.validatorValorMinimo1.validate}"/>
                                                <webuijsf:staticText id="campoValorMinimo1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoValorMinimo1Texto1}"
                                                    text="#{currentRow.value['valor_minimo']}"/>
                                                <webuijsf:message id="messageValorMinimo1"
                                                    for="campoValorMinimo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnValorMaximo1}"
                                                    toolTip="BundleParametros.valor_maximo.clase_recurso_par"
                                                    headerText="valor maximo"
                                                    id="tableColumnValorMaximo1" rendered="false"
                                                    sort="valor_maximo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextValorMaximo1"
                                                    text="#{currentRow.value['valor_maximo']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelValorMaximo1}"
                                                    id="labelValorMaximo1"
                                                    for="campoValorMaximo1"/>
                                                <webuijsf:textField id="campoValorMaximo1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoValorMaximo1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['valor_maximo']}"
                                                    toolTip="BundleParametros.valor_maximo.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.validatorValorMaximo1.validate}"/>
                                                <webuijsf:staticText id="campoValorMaximo1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoValorMaximo1Texto1}"
                                                    text="#{currentRow.value['valor_maximo']}"/>
                                                <webuijsf:message id="messageValorMaximo1"
                                                    for="campoValorMaximo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnValorOmision1}"
                                                    toolTip="BundleParametros.valor_omision.clase_recurso_par"
                                                    headerText="valor omisi&#243;n"
                                                    id="tableColumnValorOmision1" rendered="false"
                                                    sort="valor_omision">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextValorOmision1"
                                                    text="#{currentRow.value['valor_omision']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelValorOmision1}"
                                                    id="labelValorOmision1"
                                                    for="campoValorOmision1"/>
                                                <webuijsf:textField id="campoValorOmision1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoValorOmision1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['valor_omision']}"
                                                    toolTip="BundleParametros.valor_omision.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.validatorValorOmision1.validate}"/>
                                                <webuijsf:staticText id="campoValorOmision1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoValorOmision1Texto1}"
                                                    text="#{currentRow.value['valor_omision']}"/>
                                                <webuijsf:message id="messageValorOmision1"
                                                    for="campoValorOmision1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnEsParametroOmisible1}"
                                                    toolTip="BundleParametros.es_parametro_omisible.clase_recurso_par"
                                                    headerText="parametro omisible"
                                                    id="tableColumnEsParametroOmisible1" rendered="false"
                                                    sort="es_parametro_omisible">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsParametroOmisible1"
                                                    text="#{currentRow.value['es_parametro_omisible']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelEsParametroOmisible1}"
                                                    id="labelEsParametroOmisible1"
                                                    for="listaEsParametroOmisible1"/>
                                                <webuijsf:dropDown id="listaEsParametroOmisible1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsParametroOmisible1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterEsParametroOmisible1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso1.asistente.opcionesListaEsParametroOmisible1}"
                                                    selected="#{currentRow.value['es_parametro_omisible']}"
                                                    toolTip="BundleParametros.es_parametro_omisible.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsParametroOmisible1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsParametroOmisible1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroOmisible1"
                                                    for="listaEsParametroOmisible1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnEsParametroInmutable1}"
                                                    toolTip="BundleParametros.es_parametro_inmutable.clase_recurso_par"
                                                    headerText="parametro inmutable"
                                                    id="tableColumnEsParametroInmutable1"
                                                    sort="es_parametro_inmutable">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsParametroInmutable1"
                                                    text="#{currentRow.value['es_parametro_inmutable']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelEsParametroInmutable1}"
                                                    id="labelEsParametroInmutable1"
                                                    for="listaEsParametroInmutable1"/>
                                                <webuijsf:dropDown id="listaEsParametroInmutable1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsParametroInmutable1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterEsParametroInmutable1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso1.asistente.opcionesListaEsParametroInmutable1}"
                                                    selected="#{currentRow.value['es_parametro_inmutable']}"
                                                    toolTip="BundleParametros.es_parametro_inmutable.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsParametroInmutable1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsParametroInmutable1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroInmutable1"
                                                    for="listaEsParametroInmutable1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnEsParametroSubmit1}"
                                                    toolTip="BundleParametros.es_parametro_submit.clase_recurso_par"
                                                    headerText="parametro submit"
                                                    id="tableColumnEsParametroSubmit1" rendered="false"
                                                    sort="es_parametro_submit">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsParametroSubmit1"
                                                    text="#{currentRow.value['es_parametro_submit']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelEsParametroSubmit1}"
                                                    id="labelEsParametroSubmit1"
                                                    for="listaEsParametroSubmit1"/>
                                                <webuijsf:dropDown id="listaEsParametroSubmit1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsParametroSubmit1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterEsParametroSubmit1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso1.asistente.opcionesListaEsParametroSubmit1}"
                                                    selected="#{currentRow.value['es_parametro_submit']}"
                                                    toolTip="BundleParametros.es_parametro_submit.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsParametroSubmit1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsParametroSubmit1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroSubmit1"
                                                    for="listaEsParametroSubmit1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnEsParametroPrimordial1}"
                                                    toolTip="BundleParametros.es_parametro_primordial.clase_recurso_par"
                                                    headerText="parametro primordial"
                                                    id="tableColumnEsParametroPrimordial1"
                                                    sort="es_parametro_primordial">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsParametroPrimordial1"
                                                    text="#{currentRow.value['es_parametro_primordial']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelEsParametroPrimordial1}"
                                                    id="labelEsParametroPrimordial1"
                                                    for="listaEsParametroPrimordial1"/>
                                                <webuijsf:dropDown id="listaEsParametroPrimordial1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsParametroPrimordial1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterEsParametroPrimordial1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso1.asistente.opcionesListaEsParametroPrimordial1}"
                                                    selected="#{currentRow.value['es_parametro_primordial']}"
                                                    toolTip="BundleParametros.es_parametro_primordial.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsParametroPrimordial1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsParametroPrimordial1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroPrimordial1"
                                                    for="listaEsParametroPrimordial1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnEsParametroMaestro1}"
                                                    toolTip="BundleParametros.es_parametro_maestro.clase_recurso_par"
                                                    headerText="parametro maestro"
                                                    id="tableColumnEsParametroMaestro1"
                                                    sort="es_parametro_maestro">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsParametroMaestro1"
                                                    text="#{currentRow.value['es_parametro_maestro']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelEsParametroMaestro1}"
                                                    id="labelEsParametroMaestro1"
                                                    for="listaEsParametroMaestro1"/>
                                                <webuijsf:dropDown id="listaEsParametroMaestro1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsParametroMaestro1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterEsParametroMaestro1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso1.asistente.opcionesListaEsParametroMaestro1}"
                                                    selected="#{currentRow.value['es_parametro_maestro']}"
                                                    toolTip="BundleParametros.es_parametro_maestro.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsParametroMaestro1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsParametroMaestro1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroMaestro1"
                                                    for="listaEsParametroMaestro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnEsParametroSegmento1}"
                                                    toolTip="BundleParametros.es_parametro_segmento.clase_recurso_par"
                                                    headerText="parametro segmento"
                                                    id="tableColumnEsParametroSegmento1"
                                                    sort="es_parametro_segmento">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsParametroSegmento1"
                                                    text="#{currentRow.value['es_parametro_segmento']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelEsParametroSegmento1}"
                                                    id="labelEsParametroSegmento1"
                                                    for="listaEsParametroSegmento1"/>
                                                <webuijsf:dropDown id="listaEsParametroSegmento1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsParametroSegmento1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterEsParametroSegmento1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso1.asistente.opcionesListaEsParametroSegmento1}"
                                                    selected="#{currentRow.value['es_parametro_segmento']}"
                                                    toolTip="BundleParametros.es_parametro_segmento.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsParametroSegmento1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsParametroSegmento1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroSegmento1"
                                                    for="listaEsParametroSegmento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnEsParametroSinRastro1}"
                                                    toolTip="BundleParametros.es_parametro_sin_rastro.clase_recurso_par"
                                                    headerText="parametro sin rastro"
                                                    id="tableColumnEsParametroSinRastro1" rendered="false"
                                                    sort="es_parametro_sin_rastro">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsParametroSinRastro1"
                                                    text="#{currentRow.value['es_parametro_sin_rastro']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelEsParametroSinRastro1}"
                                                    id="labelEsParametroSinRastro1"
                                                    for="listaEsParametroSinRastro1"/>
                                                <webuijsf:dropDown id="listaEsParametroSinRastro1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsParametroSinRastro1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterEsParametroSinRastro1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso1.asistente.opcionesListaEsParametroSinRastro1}"
                                                    selected="#{currentRow.value['es_parametro_sin_rastro']}"
                                                    toolTip="BundleParametros.es_parametro_sin_rastro.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsParametroSinRastro1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsParametroSinRastro1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroSinRastro1"
                                                    for="listaEsParametroSinRastro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnEsParametroSincronizado1}"
                                                    toolTip="BundleParametros.es_parametro_sincronizado.clase_recurso_par"
                                                    headerText="parametro sincronizado"
                                                    id="tableColumnEsParametroSincronizado1" rendered="false"
                                                    sort="es_parametro_sincronizado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsParametroSincronizado1"
                                                    text="#{currentRow.value['es_parametro_sincronizado']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelEsParametroSincronizado1}"
                                                    id="labelEsParametroSincronizado1"
                                                    for="listaEsParametroSincronizado1"/>
                                                <webuijsf:dropDown id="listaEsParametroSincronizado1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsParametroSincronizado1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterEsParametroSincronizado1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso1.asistente.opcionesListaEsParametroSincronizado1}"
                                                    selected="#{currentRow.value['es_parametro_sincronizado']}"
                                                    toolTip="BundleParametros.es_parametro_sincronizado.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsParametroSincronizado1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsParametroSincronizado1Texto1}"/>
                                                <webuijsf:message id="messageEsParametroSincronizado1"
                                                    for="listaEsParametroSincronizado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnOrdenPresentacion1}"
                                                    toolTip="BundleParametros.orden_presentacion.clase_recurso_par"
                                                    headerText="orden presentaci&#243;n"
                                                    id="tableColumnOrdenPresentacion1" rendered="false"
                                                    sort="orden_presentacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOrdenPresentacion1"
                                                    text="#{currentRow.value['orden_presentacion']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelOrdenPresentacion1}"
                                                    id="labelOrdenPresentacion1"
                                                    for="campoOrdenPresentacion1"/>
                                                <webuijsf:textField id="campoOrdenPresentacion1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoOrdenPresentacion1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterOrdenPresentacion1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['orden_presentacion']}"
                                                    toolTip="BundleParametros.orden_presentacion.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.validatorOrdenPresentacion1.validate}"/>
                                                <webuijsf:staticText id="campoOrdenPresentacion1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoOrdenPresentacion1Texto1}"
                                                    text="#{currentRow.value['orden_presentacion']}"/>
                                                <webuijsf:message id="messageOrdenPresentacion1"
                                                    for="campoOrdenPresentacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnIdClaseRecursoSec1}"
                                                    toolTip="BundleParametros.id_clase_recurso_sec.clase_recurso_par"
                                                    headerText="clase recurso sec"
                                                    id="tableColumnIdClaseRecursoSec1" rendered="false"
                                                    sort="id_clase_recurso_sec">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoSec1"
                                                    text="#{currentRow.value['id_clase_recurso_sec']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelIdClaseRecursoSec1}"
                                                    id="labelIdClaseRecursoSec1"
                                                    for="campoIdClaseRecursoSec1"/>
                                                <webuijsf:textField id="campoIdClaseRecursoSec1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseRecursoSec1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso1.asistente.textoCampoIdClaseRecursoSec1}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.asistente.toolTipCampoIdClaseRecursoSec1}"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseRecursoSec1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoSec1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseRecursoSec1Texto1}"/>
                                                <webuijsf:message id="messageIdClaseRecursoSec1"
                                                    for="campoIdClaseRecursoSec1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdClaseRecursoSec3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoSec3"
                                                    text="#{currentRow.value['id_clase_recurso_sec']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseRecursoSec1Boton1}"
                                                    id="campoIdClaseRecursoSec1Boton1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.asistente.scriptCampoIdClaseRecursoSec1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseRecursoSec1Boton3}"
                                                    id="campoIdClaseRecursoSec1Boton3"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.asistente.scriptCampoIdClaseRecursoSec1Boton2}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.asistente.campoIdClaseRecursoSec1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnIdClaseRecursoSec2}"
                                                    headerText="nombre clase recurso sec"
                                                    id="tableColumnIdClaseRecursoSec2" rendered="false"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoSec2"
                                                    text="#{currentRow.value['id_clase_recurso_sec']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelIdClaseRecursoSec2}"
                                                    id="labelIdClaseRecursoSec2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseRecursoSec1Hiper1}"
                                                    id="campoIdClaseRecursoSec1Hiper1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.asistente.scriptCampoIdClaseRecursoSec1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdClaseRecursoSec1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnEsReferenciaAlternativa1}"
                                                    toolTip="BundleParametros.es_referencia_alternativa.clase_recurso_par"
                                                    headerText="referencia alternativa"
                                                    id="tableColumnEsReferenciaAlternativa1" rendered="false"
                                                    sort="es_referencia_alternativa">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsReferenciaAlternativa1"
                                                    text="#{currentRow.value['es_referencia_alternativa']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelEsReferenciaAlternativa1}"
                                                    id="labelEsReferenciaAlternativa1"
                                                    for="listaEsReferenciaAlternativa1"/>
                                                <webuijsf:dropDown id="listaEsReferenciaAlternativa1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsReferenciaAlternativa1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterEsReferenciaAlternativa1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso1.asistente.opcionesListaEsReferenciaAlternativa1}"
                                                    selected="#{currentRow.value['es_referencia_alternativa']}"
                                                    toolTip="BundleParametros.es_referencia_alternativa.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaEsReferenciaAlternativa1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaEsReferenciaAlternativa1Texto1}"/>
                                                <webuijsf:message id="messageEsReferenciaAlternativa1"
                                                    for="listaEsReferenciaAlternativa1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnNumeroTipoValorAlternativo1}"
                                                    toolTip="BundleParametros.numero_tipo_valor_alternativo.clase_recurso_par"
                                                    headerText="tipo valor alternativo"
                                                    id="tableColumnNumeroTipoValorAlternativo1" rendered="false"
                                                    sort="codigo_tipo_valor_1x9y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoValorAlternativo1"
                                                    text="#{currentRow.value['codigo_tipo_valor_1x9y2']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelNumeroTipoValorAlternativo1}"
                                                    id="labelNumeroTipoValorAlternativo1"
                                                    for="listaNumeroTipoValorAlternativo1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoValorAlternativo1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaNumeroTipoValorAlternativo1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterNumeroTipoValorAlternativo1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso1.asistente.opcionesListaNumeroTipoValorAlternativo1}"
                                                    selected="#{currentRow.value['numero_tipo_valor_alternativo']}"
                                                    toolTip="BundleParametros.numero_tipo_valor_alternativo.clase_recurso_par"/>
                                                <webuijsf:staticText id="listaNumeroTipoValorAlternativo1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaNumeroTipoValorAlternativo1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_valor_1x9y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoValorAlternativo1"
                                                    for="listaNumeroTipoValorAlternativo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnIdFuncionReferenciaAlt1}"
                                                    toolTip="BundleParametros.id_funcion_referencia_alt.clase_recurso_par"
                                                    headerText="identificaci&#243;n funci&#243;n referencia alt"
                                                    id="tableColumnIdFuncionReferenciaAlt1" rendered="false"
                                                    sort="id_funcion_referencia_alt">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionReferenciaAlt1"
                                                    text="#{currentRow.value['id_funcion_referencia_alt']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelIdFuncionReferenciaAlt1}"
                                                    id="labelIdFuncionReferenciaAlt1"
                                                    for="campoIdFuncionReferenciaAlt1"/>
                                                <webuijsf:textField id="campoIdFuncionReferenciaAlt1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdFuncionReferenciaAlt1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterIdFuncionReferenciaAlt1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_funcion_referencia_alt']}"
                                                    toolTip="BundleParametros.id_funcion_referencia_alt.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.validatorIdFuncionReferenciaAlt1.validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionReferenciaAlt1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdFuncionReferenciaAlt1Texto1}"
                                                    text="#{currentRow.value['id_funcion_referencia_alt']}"/>
                                                <webuijsf:message id="messageIdFuncionReferenciaAlt1"
                                                    for="campoIdFuncionReferenciaAlt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnIdListaValorAlternativa1}"
                                                    toolTip="BundleParametros.id_lista_valor_alternativa.clase_recurso_par"
                                                    headerText="identificaci&#243;n lista valor alternativa"
                                                    id="tableColumnIdListaValorAlternativa1" rendered="false"
                                                    sort="id_lista_valor_alternativa">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdListaValorAlternativa1"
                                                    text="#{currentRow.value['id_lista_valor_alternativa']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelIdListaValorAlternativa1}"
                                                    id="labelIdListaValorAlternativa1"
                                                    for="campoIdListaValorAlternativa1"/>
                                                <webuijsf:textField id="campoIdListaValorAlternativa1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdListaValorAlternativa1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterIdListaValorAlternativa1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_lista_valor_alternativa']}"
                                                    toolTip="BundleParametros.id_lista_valor_alternativa.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.validatorIdListaValorAlternativa1.validate}"/>
                                                <webuijsf:staticText id="campoIdListaValorAlternativa1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdListaValorAlternativa1Texto1}"
                                                    text="#{currentRow.value['id_lista_valor_alternativa']}"/>
                                                <webuijsf:message id="messageIdListaValorAlternativa1"
                                                    for="campoIdListaValorAlternativa1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnIdClaseObjetoValorAlt1}"
                                                    toolTip="BundleParametros.id_clase_objeto_valor_alt.clase_recurso_par"
                                                    headerText="identificaci&#243;n clase objeto valor alt"
                                                    id="tableColumnIdClaseObjetoValorAlt1" rendered="false"
                                                    sort="id_clase_objeto_valor_alt">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseObjetoValorAlt1"
                                                    text="#{currentRow.value['id_clase_objeto_valor_alt']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelIdClaseObjetoValorAlt1}"
                                                    id="labelIdClaseObjetoValorAlt1"
                                                    for="campoIdClaseObjetoValorAlt1"/>
                                                <webuijsf:textField id="campoIdClaseObjetoValorAlt1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseObjetoValorAlt1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterIdClaseObjetoValorAlt1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_clase_objeto_valor_alt']}"
                                                    toolTip="BundleParametros.id_clase_objeto_valor_alt.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.validatorIdClaseObjetoValorAlt1.validate}"/>
                                                <webuijsf:staticText id="campoIdClaseObjetoValorAlt1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseObjetoValorAlt1Texto1}"
                                                    text="#{currentRow.value['id_clase_objeto_valor_alt']}"/>
                                                <webuijsf:message id="messageIdClaseObjetoValorAlt1"
                                                    for="campoIdClaseObjetoValorAlt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnIdClaseRecursoValorAlt1}"
                                                    toolTip="BundleParametros.id_clase_recurso_valor_alt.clase_recurso_par"
                                                    headerText="identificaci&#243;n clase recurso valor alt"
                                                    id="tableColumnIdClaseRecursoValorAlt1" rendered="false"
                                                    sort="id_clase_recurso_valor_alt">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoValorAlt1"
                                                    text="#{currentRow.value['id_clase_recurso_valor_alt']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelIdClaseRecursoValorAlt1}"
                                                    id="labelIdClaseRecursoValorAlt1"
                                                    for="campoIdClaseRecursoValorAlt1"/>
                                                <webuijsf:textField id="campoIdClaseRecursoValorAlt1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseRecursoValorAlt1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterIdClaseRecursoValorAlt1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_clase_recurso_valor_alt']}"
                                                    toolTip="BundleParametros.id_clase_recurso_valor_alt.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.validatorIdClaseRecursoValorAlt1.validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoValorAlt1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoIdClaseRecursoValorAlt1Texto1}"
                                                    text="#{currentRow.value['id_clase_recurso_valor_alt']}"/>
                                                <webuijsf:message id="messageIdClaseRecursoValorAlt1"
                                                    for="campoIdClaseRecursoValorAlt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.tableColumnOrdenPaginaSeleccion1}"
                                                    toolTip="BundleParametros.orden_pagina_seleccion.clase_recurso_par"
                                                    headerText="orden p&#225;gina selecci&#243;n"
                                                    id="tableColumnOrdenPaginaSeleccion1" rendered="false"
                                                    sort="orden_pagina_seleccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOrdenPaginaSeleccion1"
                                                    text="#{currentRow.value['orden_pagina_seleccion']}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.labelOrdenPaginaSeleccion1}"
                                                    id="labelOrdenPaginaSeleccion1"
                                                    for="campoOrdenPaginaSeleccion1"/>
                                                <webuijsf:textField id="campoOrdenPaginaSeleccion1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoOrdenPaginaSeleccion1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterOrdenPaginaSeleccion1}"
                                                    readOnly="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['orden_pagina_seleccion']}"
                                                    toolTip="BundleParametros.orden_pagina_seleccion.clase_recurso_par"
                                                    validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.validatorOrdenPaginaSeleccion1.validate}"/>
                                                <webuijsf:staticText id="campoOrdenPaginaSeleccion1Texto1"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.campoOrdenPaginaSeleccion1Texto1}"
                                                    text="#{currentRow.value['orden_pagina_seleccion']}"/>
                                                <webuijsf:message id="messageOrdenPaginaSeleccion1"
                                                    for="campoOrdenPaginaSeleccion1"/>
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
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{ClaseRecursoParametroPorClaseRecurso1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{ClaseRecursoParametroPorClaseRecurso1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.botonRepaginar1_action}"
                                                        binding="#{ClaseRecursoParametroPorClaseRecurso1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{ClaseRecursoParametroPorClaseRecurso1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptRepaginar}"
                                                        text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.botonAgregar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.botonAgregar1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptAgregar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaFuncionEdicion1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterListaFuncionEdicion1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.botonEditar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.botonEditar1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptEditar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.botonEliminar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.botonEliminar1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptEliminar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.botonAplicar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptAplicar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.botonDeshacer1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptDeshacer}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.botonConfirmar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptConfirmar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.botonDescartar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptDescartar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.listaFuncionAccion1}"
                                                    converter="#{ClaseRecursoParametroPorClaseRecurso1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{ClaseRecursoParametroPorClaseRecurso1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.botonProcesar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptProcesar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.botonRefrescar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.botonRefrescar1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptRefrescar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.botonReconsultar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.botonReconsultar1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptReconsultar}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.botonRetornar1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.botonRetornar1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{ClaseRecursoParametroPorClaseRecurso1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="3" 
                                                id="gridPanel109"
                                                rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.imageHyperlink1_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.imageHyperlink1}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{ClaseRecursoParametroPorClaseRecurso1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.ClaseRecursoParametroPorClaseRecurso1_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.imageHyperlink2_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.imageHyperlink2}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{ClaseRecursoParametroPorClaseRecurso1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.ClaseRecursoParametroPorClaseRecurso1_imageHyperlink2_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecursoParametroPorClaseRecurso1.imageHyperlink3_action}"
                                                    binding="#{ClaseRecursoParametroPorClaseRecurso1.imageHyperlink3}"
                                                    disabled="#{ClaseRecursoParametroPorClaseRecurso1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink3"
                                                    imageURL="#{ClaseRecursoParametroPorClaseRecurso1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecursoParametroPorClaseRecurso1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{ClaseRecursoParametroPorClaseRecurso1.gestor.designing}"
                                                    text="Hyperlink3"
                                                    toolTip="#{bundle.ClaseRecursoParametroPorClaseRecurso1_imageHyperlink3_toolTip}"/>
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
