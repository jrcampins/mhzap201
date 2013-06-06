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
                    focus="#{ClaseRecurso1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{ClaseRecurso1.gestor.preserveFocus}"
                    preserveScroll="#{ClaseRecurso1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{ClaseRecurso1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdClaseRecurso1 campoCodigoClaseRecurso1 campoNombreClaseRecurso1 campoDescripcionClaseRecurso1 listaEsClaseRecursoIndependiente1 listaEsClaseRecursoSinDetalle1 listaEsClaseRecursoConArbol1 listaNumeroTipoClaseRecurso1 listaNumeroTipoRecurso1 campoIdFuncionSeleccion1 campoIdPaginaSeleccion1 campoIdPaginaDetalle1 campoIdClaseRecursoMaestro1 campoIdClaseRecursoSegmento1 campoIdClaseRecursoBase1 campoIdGrupoAplicacion1 campoIdAplicacionWeb1 campoLimiteFilasConsulta1 campoLimiteFilasInforme1 campoOrdenPresentacion1 listaEsClaseRecursoInsertable1 listaEsClaseRecursoModificable1 listaEsClaseRecursoEliminable1 listaEsClaseRecursoExtendida1 campoEtiquetaHipervinculo1 listaEsEnumeradorConNumero1 campoAliasClaseRecurso1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{ClaseRecurso1.breadcrumbs1}" 
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
                                                    rendered="#{ClaseRecurso1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{ClaseRecurso1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{ClaseRecurso1.gestor.mensajeDisponible}"
                                                    text="#{ClaseRecurso1.gestor.mensaje}"
                                                    url="#{ClaseRecurso1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{ClaseRecurso1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{ClaseRecurso1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{ClaseRecurso1.gestor.filaEscogida}" 
                                                sourceData="#{ClaseRecurso1.claseRecursoDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{ClaseRecurso1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{ClaseRecurso1.gestor.scriptElegir}" 
                                                        selected="#{ClaseRecurso1.gestor.filaElegida}" 
                                                        toolTip="#{ClaseRecurso1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{ClaseRecurso1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{ClaseRecurso1.botonEscogerFila1_action}"
                                                        binding="#{ClaseRecurso1.botonEscogerFila1}"
                                                        disabled="#{ClaseRecurso1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{ClaseRecurso1.gestor.urlImagenEscoger}" 
                                                        onClick="#{ClaseRecurso1.gestor.scriptEscoger}"
                                                        text="#{ClaseRecurso1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{ClaseRecurso1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ClaseRecurso1.botonDetallarFila1_action}"
                                                        binding="#{ClaseRecurso1.botonDetallarFila1}"
                                                        disabled="#{ClaseRecurso1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{ClaseRecurso1.gestor.urlImagenDetallar}" 
                                                        onClick="#{ClaseRecurso1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{ClaseRecurso1.gestor.detalleDisponible}" 
                                                        text="#{ClaseRecurso1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{ClaseRecurso1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ClaseRecurso1.botonProcesarFila1_action}"
                                                        binding="#{ClaseRecurso1.botonProcesarFila1}"
                                                        disabled="#{ClaseRecurso1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{ClaseRecurso1.gestor.urlImagenProcesar}" 
                                                        onClick="#{ClaseRecurso1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{ClaseRecurso1.asistente.comandoDisponible}" 
                                                        text="#{ClaseRecurso1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{ClaseRecurso1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ClaseRecurso1.botonRetornarFila1_action}"
                                                        binding="#{ClaseRecurso1.botonRetornarFila1}" 
                                                        disabled="#{ClaseRecurso1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{ClaseRecurso1.gestor.urlImagenRetornar}"
                                                        onClick="#{ClaseRecurso1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{ClaseRecurso1.gestor.funcionReturnVisible}" 
                                                        text="#{ClaseRecurso1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{ClaseRecurso1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{ClaseRecurso1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{ClaseRecurso1.hipervinculoAccionFila1_action}"
                                                        binding="#{ClaseRecurso1.hipervinculoAccionFila1}"
                                                        disabled="#{ClaseRecurso1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{ClaseRecurso1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{ClaseRecurso1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.ClaseRecurso1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{ClaseRecurso1.tableColumn3}" 
                                                    headerText="#{ClaseRecurso1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{ClaseRecurso1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{ClaseRecurso1.hipervinculoDetallarFila1_action}"
                                                        binding="#{ClaseRecurso1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{ClaseRecurso1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{ClaseRecurso1.gestor.identificacionFila}" 
                                                        toolTip="#{ClaseRecurso1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnIdClaseRecurso1}"
                                                    toolTip="BundleParametros.id_clase_recurso.clase_recurso"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdClaseRecurso1"
                                                    sort="id_clase_recurso">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecurso1"
                                                    text="#{currentRow.value['id_clase_recurso']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelIdClaseRecurso1}"
                                                    id="labelIdClaseRecurso1"
                                                    for="campoIdClaseRecurso1"/>
                                                <webuijsf:textField id="campoIdClaseRecurso1"
                                                    binding="#{ClaseRecurso1.campoIdClaseRecurso1}"
                                                    converter="#{ClaseRecurso1.converterIdClaseRecurso1}"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['id_clase_recurso']}"
                                                    toolTip="BundleParametros.id_clase_recurso.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso1.validatorIdClaseRecurso1.validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecurso1Texto1"
                                                    binding="#{ClaseRecurso1.campoIdClaseRecurso1Texto1}"
                                                    text="#{currentRow.value['id_clase_recurso']}"/>
                                                <webuijsf:message id="messageIdClaseRecurso1"
                                                    for="campoIdClaseRecurso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnCodigoClaseRecurso1}"
                                                    toolTip="BundleParametros.codigo_clase_recurso.clase_recurso"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoClaseRecurso1"
                                                    sort="codigo_clase_recurso">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoClaseRecurso1"
                                                    text="#{currentRow.value['codigo_clase_recurso']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelCodigoClaseRecurso1}"
                                                    id="labelCodigoClaseRecurso1"
                                                    for="campoCodigoClaseRecurso1"/>
                                                <webuijsf:textField id="campoCodigoClaseRecurso1"
                                                    binding="#{ClaseRecurso1.campoCodigoClaseRecurso1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['codigo_clase_recurso']}"
                                                    toolTip="BundleParametros.codigo_clase_recurso.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso1.validatorCodigoClaseRecurso1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoClaseRecurso1Texto1"
                                                    binding="#{ClaseRecurso1.campoCodigoClaseRecurso1Texto1}"
                                                    text="#{currentRow.value['codigo_clase_recurso']}"/>
                                                <webuijsf:message id="messageCodigoClaseRecurso1"
                                                    for="campoCodigoClaseRecurso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnNombreClaseRecurso1}"
                                                    toolTip="BundleParametros.nombre_clase_recurso.clase_recurso"
                                                    headerText="nombre"
                                                    id="tableColumnNombreClaseRecurso1"
                                                    sort="nombre_clase_recurso">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreClaseRecurso1"
                                                    text="#{currentRow.value['nombre_clase_recurso']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelNombreClaseRecurso1}"
                                                    id="labelNombreClaseRecurso1"
                                                    for="campoNombreClaseRecurso1"/>
                                                <webuijsf:textField id="campoNombreClaseRecurso1"
                                                    binding="#{ClaseRecurso1.campoNombreClaseRecurso1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_clase_recurso']}"
                                                    toolTip="BundleParametros.nombre_clase_recurso.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso1.validatorNombreClaseRecurso1.validate}"/>
                                                <webuijsf:staticText id="campoNombreClaseRecurso1Texto1"
                                                    binding="#{ClaseRecurso1.campoNombreClaseRecurso1Texto1}"
                                                    text="#{currentRow.value['nombre_clase_recurso']}"/>
                                                <webuijsf:message id="messageNombreClaseRecurso1"
                                                    for="campoNombreClaseRecurso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnDescripcionClaseRecurso1}"
                                                    toolTip="BundleParametros.descripcion_clase_recurso.clase_recurso"
                                                    headerText="descripci&#243;n"
                                                    id="tableColumnDescripcionClaseRecurso1" rendered="false"
                                                    sort="descripcion_clase_recurso">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionClaseRecurso1"
                                                    text="#{currentRow.value['descripcion_clase_recurso']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelDescripcionClaseRecurso1}"
                                                    id="labelDescripcionClaseRecurso1"
                                                    for="campoDescripcionClaseRecurso1"/>
                                                <webuijsf:textArea id="campoDescripcionClaseRecurso1"
                                                    binding="#{ClaseRecurso1.campoDescripcionClaseRecurso1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_clase_recurso']}"
                                                    toolTip="BundleParametros.descripcion_clase_recurso.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso1.validatorDescripcionClaseRecurso1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionClaseRecurso1Texto1"
                                                    binding="#{ClaseRecurso1.campoDescripcionClaseRecurso1Texto1}"
                                                    text="#{currentRow.value['descripcion_clase_recurso']}"/>
                                                <webuijsf:message id="messageDescripcionClaseRecurso1"
                                                    for="campoDescripcionClaseRecurso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnEsClaseRecursoIndependiente1}"
                                                    toolTip="BundleParametros.es_clase_recurso_independiente.clase_recurso"
                                                    headerText="independiente"
                                                    id="tableColumnEsClaseRecursoIndependiente1" rendered="false"
                                                    sort="es_clase_recurso_independiente">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsClaseRecursoIndependiente1"
                                                    text="#{currentRow.value['es_clase_recurso_independiente']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelEsClaseRecursoIndependiente1}"
                                                    id="labelEsClaseRecursoIndependiente1"
                                                    for="listaEsClaseRecursoIndependiente1"/>
                                                <webuijsf:dropDown id="listaEsClaseRecursoIndependiente1"
                                                    binding="#{ClaseRecurso1.listaEsClaseRecursoIndependiente1}"
                                                    converter="#{ClaseRecurso1.converterEsClaseRecursoIndependiente1}"
                                                    disabled="#{ClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso1.asistente.opcionesListaEsClaseRecursoIndependiente1}"
                                                    selected="#{currentRow.value['es_clase_recurso_independiente']}"
                                                    toolTip="BundleParametros.es_clase_recurso_independiente.clase_recurso"/>
                                                <webuijsf:staticText id="listaEsClaseRecursoIndependiente1Texto1"
                                                    binding="#{ClaseRecurso1.listaEsClaseRecursoIndependiente1Texto1}"/>
                                                <webuijsf:message id="messageEsClaseRecursoIndependiente1"
                                                    for="listaEsClaseRecursoIndependiente1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnEsClaseRecursoSinDetalle1}"
                                                    toolTip="BundleParametros.es_clase_recurso_sin_detalle.clase_recurso"
                                                    headerText="sin detalle"
                                                    id="tableColumnEsClaseRecursoSinDetalle1" rendered="false"
                                                    sort="es_clase_recurso_sin_detalle">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsClaseRecursoSinDetalle1"
                                                    text="#{currentRow.value['es_clase_recurso_sin_detalle']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelEsClaseRecursoSinDetalle1}"
                                                    id="labelEsClaseRecursoSinDetalle1"
                                                    for="listaEsClaseRecursoSinDetalle1"/>
                                                <webuijsf:dropDown id="listaEsClaseRecursoSinDetalle1"
                                                    binding="#{ClaseRecurso1.listaEsClaseRecursoSinDetalle1}"
                                                    converter="#{ClaseRecurso1.converterEsClaseRecursoSinDetalle1}"
                                                    disabled="#{ClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso1.asistente.opcionesListaEsClaseRecursoSinDetalle1}"
                                                    selected="#{currentRow.value['es_clase_recurso_sin_detalle']}"
                                                    toolTip="BundleParametros.es_clase_recurso_sin_detalle.clase_recurso"/>
                                                <webuijsf:staticText id="listaEsClaseRecursoSinDetalle1Texto1"
                                                    binding="#{ClaseRecurso1.listaEsClaseRecursoSinDetalle1Texto1}"/>
                                                <webuijsf:message id="messageEsClaseRecursoSinDetalle1"
                                                    for="listaEsClaseRecursoSinDetalle1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnEsClaseRecursoConArbol1}"
                                                    toolTip="BundleParametros.es_clase_recurso_con_arbol.clase_recurso"
                                                    headerText="con arbol"
                                                    id="tableColumnEsClaseRecursoConArbol1" rendered="false"
                                                    sort="es_clase_recurso_con_arbol">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsClaseRecursoConArbol1"
                                                    text="#{currentRow.value['es_clase_recurso_con_arbol']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelEsClaseRecursoConArbol1}"
                                                    id="labelEsClaseRecursoConArbol1"
                                                    for="listaEsClaseRecursoConArbol1"/>
                                                <webuijsf:dropDown id="listaEsClaseRecursoConArbol1"
                                                    binding="#{ClaseRecurso1.listaEsClaseRecursoConArbol1}"
                                                    converter="#{ClaseRecurso1.converterEsClaseRecursoConArbol1}"
                                                    disabled="#{ClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso1.asistente.opcionesListaEsClaseRecursoConArbol1}"
                                                    selected="#{currentRow.value['es_clase_recurso_con_arbol']}"
                                                    toolTip="BundleParametros.es_clase_recurso_con_arbol.clase_recurso"/>
                                                <webuijsf:staticText id="listaEsClaseRecursoConArbol1Texto1"
                                                    binding="#{ClaseRecurso1.listaEsClaseRecursoConArbol1Texto1}"/>
                                                <webuijsf:message id="messageEsClaseRecursoConArbol1"
                                                    for="listaEsClaseRecursoConArbol1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnNumeroTipoClaseRecurso1}"
                                                    toolTip="BundleParametros.numero_tipo_clase_recurso.clase_recurso"
                                                    headerText="tipo"
                                                    id="tableColumnNumeroTipoClaseRecurso1" rendered="false"
                                                    sort="codigo_tipo_clase_recurs_1x1y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoClaseRecurso1"
                                                    text="#{currentRow.value['codigo_tipo_clase_recurs_1x1y2']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelNumeroTipoClaseRecurso1}"
                                                    id="labelNumeroTipoClaseRecurso1"
                                                    for="listaNumeroTipoClaseRecurso1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoClaseRecurso1"
                                                    binding="#{ClaseRecurso1.listaNumeroTipoClaseRecurso1}"
                                                    converter="#{ClaseRecurso1.converterNumeroTipoClaseRecurso1}"
                                                    disabled="#{ClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso1.asistente.opcionesListaNumeroTipoClaseRecurso1}"
                                                    selected="#{currentRow.value['numero_tipo_clase_recurso']}"
                                                    toolTip="BundleParametros.numero_tipo_clase_recurso.clase_recurso"/>
                                                <webuijsf:staticText id="listaNumeroTipoClaseRecurso1Texto1"
                                                    binding="#{ClaseRecurso1.listaNumeroTipoClaseRecurso1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_clase_recurs_1x1y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoClaseRecurso1"
                                                    for="listaNumeroTipoClaseRecurso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnNumeroTipoRecurso1}"
                                                    toolTip="BundleParametros.numero_tipo_recurso.clase_recurso"
                                                    headerText="tipo recurso"
                                                    id="tableColumnNumeroTipoRecurso1"
                                                    sort="codigo_tipo_recurso_1x2y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoRecurso1"
                                                    text="#{currentRow.value['codigo_tipo_recurso_1x2y2']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelNumeroTipoRecurso1}"
                                                    id="labelNumeroTipoRecurso1"
                                                    for="listaNumeroTipoRecurso1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoRecurso1"
                                                    binding="#{ClaseRecurso1.listaNumeroTipoRecurso1}"
                                                    converter="#{ClaseRecurso1.converterNumeroTipoRecurso1}"
                                                    disabled="#{ClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso1.asistente.opcionesListaNumeroTipoRecurso1}"
                                                    selected="#{currentRow.value['numero_tipo_recurso']}"
                                                    toolTip="BundleParametros.numero_tipo_recurso.clase_recurso"/>
                                                <webuijsf:staticText id="listaNumeroTipoRecurso1Texto1"
                                                    binding="#{ClaseRecurso1.listaNumeroTipoRecurso1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_recurso_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoRecurso1"
                                                    for="listaNumeroTipoRecurso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnIdFuncionSeleccion1}"
                                                    toolTip="BundleParametros.id_funcion_seleccion.clase_recurso"
                                                    headerText="funci&#243;n selecci&#243;n"
                                                    id="tableColumnIdFuncionSeleccion1" rendered="false"
                                                    sort="codigo_funcion_1x3y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionSeleccion1"
                                                    text="#{currentRow.value['codigo_funcion_1x3y3']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelIdFuncionSeleccion1}"
                                                    id="labelIdFuncionSeleccion1"
                                                    for="campoIdFuncionSeleccion1"/>
                                                <webuijsf:textField id="campoIdFuncionSeleccion1"
                                                    binding="#{ClaseRecurso1.campoIdFuncionSeleccion1}"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso1.asistente.textoCampoIdFuncionSeleccion1}"
                                                    toolTip="#{ClaseRecurso1.asistente.toolTipCampoIdFuncionSeleccion1}"
                                                    validatorExpression="#{ClaseRecurso1.campoIdFuncionSeleccion1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionSeleccion1Texto1"
                                                    binding="#{ClaseRecurso1.campoIdFuncionSeleccion1Texto1}"
                                                    text="#{currentRow.value['codigo_funcion_1x3y3']}"/>
                                                <webuijsf:message id="messageIdFuncionSeleccion1"
                                                    for="campoIdFuncionSeleccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFuncionSeleccion3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionSeleccion3"
                                                    text="#{currentRow.value['id_funcion_seleccion']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso1.campoIdFuncionSeleccion1Boton1}"
                                                    id="campoIdFuncionSeleccion1Boton1"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdFuncionSeleccion1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso1.campoIdFuncionSeleccion1Boton3}"
                                                    id="campoIdFuncionSeleccion1Boton3"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdFuncionSeleccion1Boton2}"
                                                    rendered="#{ClaseRecurso1.asistente.campoIdFuncionSeleccion1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{ClaseRecurso1.tableColumnIdFuncionSeleccion2}"
                                                    headerText="nombre funci&#243;n selecci&#243;n"
                                                    id="tableColumnIdFuncionSeleccion2" rendered="false"
                                                    sort="nombre_funcion_1x3y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionSeleccion2"
                                                    text="#{currentRow.value['nombre_funcion_1x3y4']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelIdFuncionSeleccion2}"
                                                    id="labelIdFuncionSeleccion2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{ClaseRecurso1.campoIdFuncionSeleccion1Hiper1}"
                                                    id="campoIdFuncionSeleccion1Hiper1"
                                                    text="#{currentRow.value['nombre_funcion_1x3y4']}"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdFuncionSeleccion1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFuncionSeleccion1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnIdPaginaSeleccion1}"
                                                    toolTip="BundleParametros.id_pagina_seleccion.clase_recurso"
                                                    headerText="p&#225;gina selecci&#243;n"
                                                    id="tableColumnIdPaginaSeleccion1" rendered="false"
                                                    sort="codigo_pagina_1x4y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPaginaSeleccion1"
                                                    text="#{currentRow.value['codigo_pagina_1x4y3']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelIdPaginaSeleccion1}"
                                                    id="labelIdPaginaSeleccion1"
                                                    for="campoIdPaginaSeleccion1"/>
                                                <webuijsf:textField id="campoIdPaginaSeleccion1"
                                                    binding="#{ClaseRecurso1.campoIdPaginaSeleccion1}"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso1.asistente.textoCampoIdPaginaSeleccion1}"
                                                    toolTip="#{ClaseRecurso1.asistente.toolTipCampoIdPaginaSeleccion1}"
                                                    validatorExpression="#{ClaseRecurso1.campoIdPaginaSeleccion1_validate}"/>
                                                <webuijsf:staticText id="campoIdPaginaSeleccion1Texto1"
                                                    binding="#{ClaseRecurso1.campoIdPaginaSeleccion1Texto1}"
                                                    text="#{currentRow.value['codigo_pagina_1x4y3']}"/>
                                                <webuijsf:message id="messageIdPaginaSeleccion1"
                                                    for="campoIdPaginaSeleccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdPaginaSeleccion3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPaginaSeleccion3"
                                                    text="#{currentRow.value['id_pagina_seleccion']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso1.campoIdPaginaSeleccion1Boton1}"
                                                    id="campoIdPaginaSeleccion1Boton1"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdPaginaSeleccion1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso1.campoIdPaginaSeleccion1Boton3}"
                                                    id="campoIdPaginaSeleccion1Boton3"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdPaginaSeleccion1Boton2}"
                                                    rendered="#{ClaseRecurso1.asistente.campoIdPaginaSeleccion1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{ClaseRecurso1.tableColumnIdPaginaSeleccion2}"
                                                    headerText="nombre p&#225;gina selecci&#243;n"
                                                    id="tableColumnIdPaginaSeleccion2" rendered="false"
                                                    sort="nombre_pagina_1x4y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPaginaSeleccion2"
                                                    text="#{currentRow.value['nombre_pagina_1x4y4']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelIdPaginaSeleccion2}"
                                                    id="labelIdPaginaSeleccion2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{ClaseRecurso1.campoIdPaginaSeleccion1Hiper1}"
                                                    id="campoIdPaginaSeleccion1Hiper1"
                                                    text="#{currentRow.value['nombre_pagina_1x4y4']}"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdPaginaSeleccion1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdPaginaSeleccion1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnIdPaginaDetalle1}"
                                                    toolTip="BundleParametros.id_pagina_detalle.clase_recurso"
                                                    headerText="p&#225;gina detalle"
                                                    id="tableColumnIdPaginaDetalle1" rendered="false"
                                                    sort="codigo_pagina_1x5y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPaginaDetalle1"
                                                    text="#{currentRow.value['codigo_pagina_1x5y3']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelIdPaginaDetalle1}"
                                                    id="labelIdPaginaDetalle1"
                                                    for="campoIdPaginaDetalle1"/>
                                                <webuijsf:textField id="campoIdPaginaDetalle1"
                                                    binding="#{ClaseRecurso1.campoIdPaginaDetalle1}"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso1.asistente.textoCampoIdPaginaDetalle1}"
                                                    toolTip="#{ClaseRecurso1.asistente.toolTipCampoIdPaginaDetalle1}"
                                                    validatorExpression="#{ClaseRecurso1.campoIdPaginaDetalle1_validate}"/>
                                                <webuijsf:staticText id="campoIdPaginaDetalle1Texto1"
                                                    binding="#{ClaseRecurso1.campoIdPaginaDetalle1Texto1}"
                                                    text="#{currentRow.value['codigo_pagina_1x5y3']}"/>
                                                <webuijsf:message id="messageIdPaginaDetalle1"
                                                    for="campoIdPaginaDetalle1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdPaginaDetalle3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPaginaDetalle3"
                                                    text="#{currentRow.value['id_pagina_detalle']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso1.campoIdPaginaDetalle1Boton1}"
                                                    id="campoIdPaginaDetalle1Boton1"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdPaginaDetalle1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso1.campoIdPaginaDetalle1Boton3}"
                                                    id="campoIdPaginaDetalle1Boton3"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdPaginaDetalle1Boton2}"
                                                    rendered="#{ClaseRecurso1.asistente.campoIdPaginaDetalle1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{ClaseRecurso1.tableColumnIdPaginaDetalle2}"
                                                    headerText="nombre p&#225;gina detalle"
                                                    id="tableColumnIdPaginaDetalle2" rendered="false"
                                                    sort="nombre_pagina_1x5y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPaginaDetalle2"
                                                    text="#{currentRow.value['nombre_pagina_1x5y4']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelIdPaginaDetalle2}"
                                                    id="labelIdPaginaDetalle2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{ClaseRecurso1.campoIdPaginaDetalle1Hiper1}"
                                                    id="campoIdPaginaDetalle1Hiper1"
                                                    text="#{currentRow.value['nombre_pagina_1x5y4']}"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdPaginaDetalle1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdPaginaDetalle1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnIdClaseRecursoMaestro1}"
                                                    toolTip="BundleParametros.id_clase_recurso_maestro.clase_recurso"
                                                    headerText="clase recurso maestro"
                                                    id="tableColumnIdClaseRecursoMaestro1" rendered="false"
                                                    sort="codigo_clase_recurso_1x6y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoMaestro1"
                                                    text="#{currentRow.value['codigo_clase_recurso_1x6y3']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelIdClaseRecursoMaestro1}"
                                                    id="labelIdClaseRecursoMaestro1"
                                                    for="campoIdClaseRecursoMaestro1"/>
                                                <webuijsf:textField id="campoIdClaseRecursoMaestro1"
                                                    binding="#{ClaseRecurso1.campoIdClaseRecursoMaestro1}"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso1.asistente.textoCampoIdClaseRecursoMaestro1}"
                                                    toolTip="#{ClaseRecurso1.asistente.toolTipCampoIdClaseRecursoMaestro1}"
                                                    validatorExpression="#{ClaseRecurso1.campoIdClaseRecursoMaestro1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoMaestro1Texto1"
                                                    binding="#{ClaseRecurso1.campoIdClaseRecursoMaestro1Texto1}"
                                                    text="#{currentRow.value['codigo_clase_recurso_1x6y3']}"/>
                                                <webuijsf:message id="messageIdClaseRecursoMaestro1"
                                                    for="campoIdClaseRecursoMaestro1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdClaseRecursoMaestro3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoMaestro3"
                                                    text="#{currentRow.value['id_clase_recurso_maestro']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso1.campoIdClaseRecursoMaestro1Boton1}"
                                                    id="campoIdClaseRecursoMaestro1Boton1"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdClaseRecursoMaestro1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso1.campoIdClaseRecursoMaestro1Boton3}"
                                                    id="campoIdClaseRecursoMaestro1Boton3"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdClaseRecursoMaestro1Boton2}"
                                                    rendered="#{ClaseRecurso1.asistente.campoIdClaseRecursoMaestro1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{ClaseRecurso1.tableColumnIdClaseRecursoMaestro2}"
                                                    headerText="nombre clase recurso maestro"
                                                    id="tableColumnIdClaseRecursoMaestro2" rendered="false"
                                                    sort="nombre_clase_recurso_1x6y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoMaestro2"
                                                    text="#{currentRow.value['nombre_clase_recurso_1x6y4']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelIdClaseRecursoMaestro2}"
                                                    id="labelIdClaseRecursoMaestro2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{ClaseRecurso1.campoIdClaseRecursoMaestro1Hiper1}"
                                                    id="campoIdClaseRecursoMaestro1Hiper1"
                                                    text="#{currentRow.value['nombre_clase_recurso_1x6y4']}"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdClaseRecursoMaestro1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdClaseRecursoMaestro1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnIdClaseRecursoSegmento1}"
                                                    toolTip="BundleParametros.id_clase_recurso_segmento.clase_recurso"
                                                    headerText="clase recurso segmento"
                                                    id="tableColumnIdClaseRecursoSegmento1" rendered="false"
                                                    sort="codigo_clase_recurso_1x7y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoSegmento1"
                                                    text="#{currentRow.value['codigo_clase_recurso_1x7y3']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelIdClaseRecursoSegmento1}"
                                                    id="labelIdClaseRecursoSegmento1"
                                                    for="campoIdClaseRecursoSegmento1"/>
                                                <webuijsf:textField id="campoIdClaseRecursoSegmento1"
                                                    binding="#{ClaseRecurso1.campoIdClaseRecursoSegmento1}"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso1.asistente.textoCampoIdClaseRecursoSegmento1}"
                                                    toolTip="#{ClaseRecurso1.asistente.toolTipCampoIdClaseRecursoSegmento1}"
                                                    validatorExpression="#{ClaseRecurso1.campoIdClaseRecursoSegmento1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoSegmento1Texto1"
                                                    binding="#{ClaseRecurso1.campoIdClaseRecursoSegmento1Texto1}"
                                                    text="#{currentRow.value['codigo_clase_recurso_1x7y3']}"/>
                                                <webuijsf:message id="messageIdClaseRecursoSegmento1"
                                                    for="campoIdClaseRecursoSegmento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdClaseRecursoSegmento3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoSegmento3"
                                                    text="#{currentRow.value['id_clase_recurso_segmento']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso1.campoIdClaseRecursoSegmento1Boton1}"
                                                    id="campoIdClaseRecursoSegmento1Boton1"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdClaseRecursoSegmento1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso1.campoIdClaseRecursoSegmento1Boton3}"
                                                    id="campoIdClaseRecursoSegmento1Boton3"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdClaseRecursoSegmento1Boton2}"
                                                    rendered="#{ClaseRecurso1.asistente.campoIdClaseRecursoSegmento1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{ClaseRecurso1.tableColumnIdClaseRecursoSegmento2}"
                                                    headerText="nombre clase recurso segmento"
                                                    id="tableColumnIdClaseRecursoSegmento2" rendered="false"
                                                    sort="nombre_clase_recurso_1x7y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoSegmento2"
                                                    text="#{currentRow.value['nombre_clase_recurso_1x7y4']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelIdClaseRecursoSegmento2}"
                                                    id="labelIdClaseRecursoSegmento2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{ClaseRecurso1.campoIdClaseRecursoSegmento1Hiper1}"
                                                    id="campoIdClaseRecursoSegmento1Hiper1"
                                                    text="#{currentRow.value['nombre_clase_recurso_1x7y4']}"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdClaseRecursoSegmento1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdClaseRecursoSegmento1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnIdClaseRecursoBase1}"
                                                    toolTip="BundleParametros.id_clase_recurso_base.clase_recurso"
                                                    headerText="clase recurso base"
                                                    id="tableColumnIdClaseRecursoBase1" rendered="false"
                                                    sort="codigo_clase_recurso_1x8y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoBase1"
                                                    text="#{currentRow.value['codigo_clase_recurso_1x8y3']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelIdClaseRecursoBase1}"
                                                    id="labelIdClaseRecursoBase1"
                                                    for="campoIdClaseRecursoBase1"/>
                                                <webuijsf:textField id="campoIdClaseRecursoBase1"
                                                    binding="#{ClaseRecurso1.campoIdClaseRecursoBase1}"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso1.asistente.textoCampoIdClaseRecursoBase1}"
                                                    toolTip="#{ClaseRecurso1.asistente.toolTipCampoIdClaseRecursoBase1}"
                                                    validatorExpression="#{ClaseRecurso1.campoIdClaseRecursoBase1_validate}"/>
                                                <webuijsf:staticText id="campoIdClaseRecursoBase1Texto1"
                                                    binding="#{ClaseRecurso1.campoIdClaseRecursoBase1Texto1}"
                                                    text="#{currentRow.value['codigo_clase_recurso_1x8y3']}"/>
                                                <webuijsf:message id="messageIdClaseRecursoBase1"
                                                    for="campoIdClaseRecursoBase1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdClaseRecursoBase3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoBase3"
                                                    text="#{currentRow.value['id_clase_recurso_base']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso1.campoIdClaseRecursoBase1Boton1}"
                                                    id="campoIdClaseRecursoBase1Boton1"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdClaseRecursoBase1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso1.campoIdClaseRecursoBase1Boton3}"
                                                    id="campoIdClaseRecursoBase1Boton3"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdClaseRecursoBase1Boton2}"
                                                    rendered="#{ClaseRecurso1.asistente.campoIdClaseRecursoBase1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{ClaseRecurso1.tableColumnIdClaseRecursoBase2}"
                                                    headerText="nombre clase recurso base"
                                                    id="tableColumnIdClaseRecursoBase2" rendered="false"
                                                    sort="nombre_clase_recurso_1x8y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdClaseRecursoBase2"
                                                    text="#{currentRow.value['nombre_clase_recurso_1x8y4']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelIdClaseRecursoBase2}"
                                                    id="labelIdClaseRecursoBase2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{ClaseRecurso1.campoIdClaseRecursoBase1Hiper1}"
                                                    id="campoIdClaseRecursoBase1Hiper1"
                                                    text="#{currentRow.value['nombre_clase_recurso_1x8y4']}"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdClaseRecursoBase1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdClaseRecursoBase1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnIdGrupoAplicacion1}"
                                                    toolTip="BundleParametros.id_grupo_aplicacion.clase_recurso"
                                                    headerText="grupo aplicaci&#243;n"
                                                    id="tableColumnIdGrupoAplicacion1" rendered="false"
                                                    sort="codigo_grupo_aplicacion_1x9y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdGrupoAplicacion1"
                                                    text="#{currentRow.value['codigo_grupo_aplicacion_1x9y3']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelIdGrupoAplicacion1}"
                                                    id="labelIdGrupoAplicacion1"
                                                    for="campoIdGrupoAplicacion1"/>
                                                <webuijsf:textField id="campoIdGrupoAplicacion1"
                                                    binding="#{ClaseRecurso1.campoIdGrupoAplicacion1}"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{ClaseRecurso1.asistente.textoCampoIdGrupoAplicacion1}"
                                                    toolTip="#{ClaseRecurso1.asistente.toolTipCampoIdGrupoAplicacion1}"
                                                    validatorExpression="#{ClaseRecurso1.campoIdGrupoAplicacion1_validate}"/>
                                                <webuijsf:staticText id="campoIdGrupoAplicacion1Texto1"
                                                    binding="#{ClaseRecurso1.campoIdGrupoAplicacion1Texto1}"
                                                    text="#{currentRow.value['codigo_grupo_aplicacion_1x9y3']}"/>
                                                <webuijsf:message id="messageIdGrupoAplicacion1"
                                                    for="campoIdGrupoAplicacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdGrupoAplicacion3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdGrupoAplicacion3"
                                                    text="#{currentRow.value['id_grupo_aplicacion']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso1.campoIdGrupoAplicacion1Boton1}"
                                                    id="campoIdGrupoAplicacion1Boton1"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdGrupoAplicacion1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{ClaseRecurso1.campoIdGrupoAplicacion1Boton3}"
                                                    id="campoIdGrupoAplicacion1Boton3"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdGrupoAplicacion1Boton2}"
                                                    rendered="#{ClaseRecurso1.asistente.campoIdGrupoAplicacion1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{ClaseRecurso1.tableColumnIdGrupoAplicacion2}"
                                                    headerText="nombre grupo aplicaci&#243;n"
                                                    id="tableColumnIdGrupoAplicacion2" rendered="false"
                                                    sort="nombre_grupo_aplicacion_1x9y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdGrupoAplicacion2"
                                                    text="#{currentRow.value['nombre_grupo_aplicacion_1x9y4']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelIdGrupoAplicacion2}"
                                                    id="labelIdGrupoAplicacion2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{ClaseRecurso1.campoIdGrupoAplicacion1Hiper1}"
                                                    id="campoIdGrupoAplicacion1Hiper1"
                                                    text="#{currentRow.value['nombre_grupo_aplicacion_1x9y4']}"
                                                    onClick="#{ClaseRecurso1.asistente.scriptCampoIdGrupoAplicacion1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdGrupoAplicacion1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnIdAplicacionWeb1}"
                                                    toolTip="BundleParametros.id_aplicacion_web.clase_recurso"
                                                    headerText="identificaci&#243;n aplicaci&#243;n web"
                                                    id="tableColumnIdAplicacionWeb1" rendered="false"
                                                    sort="id_aplicacion_web">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdAplicacionWeb1"
                                                    text="#{currentRow.value['id_aplicacion_web']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelIdAplicacionWeb1}"
                                                    id="labelIdAplicacionWeb1"
                                                    for="campoIdAplicacionWeb1"/>
                                                <webuijsf:textField id="campoIdAplicacionWeb1"
                                                    binding="#{ClaseRecurso1.campoIdAplicacionWeb1}"
                                                    converter="#{ClaseRecurso1.converterIdAplicacionWeb1}"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_aplicacion_web']}"
                                                    toolTip="BundleParametros.id_aplicacion_web.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso1.validatorIdAplicacionWeb1.validate}"/>
                                                <webuijsf:staticText id="campoIdAplicacionWeb1Texto1"
                                                    binding="#{ClaseRecurso1.campoIdAplicacionWeb1Texto1}"
                                                    text="#{currentRow.value['id_aplicacion_web']}"/>
                                                <webuijsf:message id="messageIdAplicacionWeb1"
                                                    for="campoIdAplicacionWeb1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnLimiteFilasConsulta1}"
                                                    toolTip="BundleParametros.limite_filas_consulta.clase_recurso"
                                                    headerText="limite filas consulta"
                                                    id="tableColumnLimiteFilasConsulta1" rendered="false"
                                                    sort="limite_filas_consulta">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextLimiteFilasConsulta1"
                                                    text="#{currentRow.value['limite_filas_consulta']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelLimiteFilasConsulta1}"
                                                    id="labelLimiteFilasConsulta1"
                                                    for="campoLimiteFilasConsulta1"/>
                                                <webuijsf:textField id="campoLimiteFilasConsulta1"
                                                    binding="#{ClaseRecurso1.campoLimiteFilasConsulta1}"
                                                    converter="#{ClaseRecurso1.converterLimiteFilasConsulta1}"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['limite_filas_consulta']}"
                                                    toolTip="BundleParametros.limite_filas_consulta.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso1.validatorLimiteFilasConsulta1.validate}"/>
                                                <webuijsf:staticText id="campoLimiteFilasConsulta1Texto1"
                                                    binding="#{ClaseRecurso1.campoLimiteFilasConsulta1Texto1}"
                                                    text="#{currentRow.value['limite_filas_consulta']}"/>
                                                <webuijsf:message id="messageLimiteFilasConsulta1"
                                                    for="campoLimiteFilasConsulta1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnLimiteFilasInforme1}"
                                                    toolTip="BundleParametros.limite_filas_informe.clase_recurso"
                                                    headerText="limite filas informe"
                                                    id="tableColumnLimiteFilasInforme1" rendered="false"
                                                    sort="limite_filas_informe">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextLimiteFilasInforme1"
                                                    text="#{currentRow.value['limite_filas_informe']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelLimiteFilasInforme1}"
                                                    id="labelLimiteFilasInforme1"
                                                    for="campoLimiteFilasInforme1"/>
                                                <webuijsf:textField id="campoLimiteFilasInforme1"
                                                    binding="#{ClaseRecurso1.campoLimiteFilasInforme1}"
                                                    converter="#{ClaseRecurso1.converterLimiteFilasInforme1}"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['limite_filas_informe']}"
                                                    toolTip="BundleParametros.limite_filas_informe.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso1.validatorLimiteFilasInforme1.validate}"/>
                                                <webuijsf:staticText id="campoLimiteFilasInforme1Texto1"
                                                    binding="#{ClaseRecurso1.campoLimiteFilasInforme1Texto1}"
                                                    text="#{currentRow.value['limite_filas_informe']}"/>
                                                <webuijsf:message id="messageLimiteFilasInforme1"
                                                    for="campoLimiteFilasInforme1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnOrdenPresentacion1}"
                                                    toolTip="BundleParametros.orden_presentacion.clase_recurso"
                                                    headerText="orden presentaci&#243;n"
                                                    id="tableColumnOrdenPresentacion1" rendered="false"
                                                    sort="orden_presentacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOrdenPresentacion1"
                                                    text="#{currentRow.value['orden_presentacion']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelOrdenPresentacion1}"
                                                    id="labelOrdenPresentacion1"
                                                    for="campoOrdenPresentacion1"/>
                                                <webuijsf:textField id="campoOrdenPresentacion1"
                                                    binding="#{ClaseRecurso1.campoOrdenPresentacion1}"
                                                    converter="#{ClaseRecurso1.converterOrdenPresentacion1}"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['orden_presentacion']}"
                                                    toolTip="BundleParametros.orden_presentacion.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso1.validatorOrdenPresentacion1.validate}"/>
                                                <webuijsf:staticText id="campoOrdenPresentacion1Texto1"
                                                    binding="#{ClaseRecurso1.campoOrdenPresentacion1Texto1}"
                                                    text="#{currentRow.value['orden_presentacion']}"/>
                                                <webuijsf:message id="messageOrdenPresentacion1"
                                                    for="campoOrdenPresentacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnEsClaseRecursoInsertable1}"
                                                    toolTip="BundleParametros.es_clase_recurso_insertable.clase_recurso"
                                                    headerText="insertable"
                                                    id="tableColumnEsClaseRecursoInsertable1" rendered="false"
                                                    sort="es_clase_recurso_insertable">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsClaseRecursoInsertable1"
                                                    text="#{currentRow.value['es_clase_recurso_insertable']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelEsClaseRecursoInsertable1}"
                                                    id="labelEsClaseRecursoInsertable1"
                                                    for="listaEsClaseRecursoInsertable1"/>
                                                <webuijsf:dropDown id="listaEsClaseRecursoInsertable1"
                                                    binding="#{ClaseRecurso1.listaEsClaseRecursoInsertable1}"
                                                    converter="#{ClaseRecurso1.converterEsClaseRecursoInsertable1}"
                                                    disabled="#{ClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso1.asistente.opcionesListaEsClaseRecursoInsertable1}"
                                                    selected="#{currentRow.value['es_clase_recurso_insertable']}"
                                                    toolTip="BundleParametros.es_clase_recurso_insertable.clase_recurso"/>
                                                <webuijsf:staticText id="listaEsClaseRecursoInsertable1Texto1"
                                                    binding="#{ClaseRecurso1.listaEsClaseRecursoInsertable1Texto1}"/>
                                                <webuijsf:message id="messageEsClaseRecursoInsertable1"
                                                    for="listaEsClaseRecursoInsertable1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnEsClaseRecursoModificable1}"
                                                    toolTip="BundleParametros.es_clase_recurso_modificable.clase_recurso"
                                                    headerText="modificable"
                                                    id="tableColumnEsClaseRecursoModificable1" rendered="false"
                                                    sort="es_clase_recurso_modificable">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsClaseRecursoModificable1"
                                                    text="#{currentRow.value['es_clase_recurso_modificable']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelEsClaseRecursoModificable1}"
                                                    id="labelEsClaseRecursoModificable1"
                                                    for="listaEsClaseRecursoModificable1"/>
                                                <webuijsf:dropDown id="listaEsClaseRecursoModificable1"
                                                    binding="#{ClaseRecurso1.listaEsClaseRecursoModificable1}"
                                                    converter="#{ClaseRecurso1.converterEsClaseRecursoModificable1}"
                                                    disabled="#{ClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso1.asistente.opcionesListaEsClaseRecursoModificable1}"
                                                    selected="#{currentRow.value['es_clase_recurso_modificable']}"
                                                    toolTip="BundleParametros.es_clase_recurso_modificable.clase_recurso"/>
                                                <webuijsf:staticText id="listaEsClaseRecursoModificable1Texto1"
                                                    binding="#{ClaseRecurso1.listaEsClaseRecursoModificable1Texto1}"/>
                                                <webuijsf:message id="messageEsClaseRecursoModificable1"
                                                    for="listaEsClaseRecursoModificable1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnEsClaseRecursoEliminable1}"
                                                    toolTip="BundleParametros.es_clase_recurso_eliminable.clase_recurso"
                                                    headerText="eliminable"
                                                    id="tableColumnEsClaseRecursoEliminable1" rendered="false"
                                                    sort="es_clase_recurso_eliminable">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsClaseRecursoEliminable1"
                                                    text="#{currentRow.value['es_clase_recurso_eliminable']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelEsClaseRecursoEliminable1}"
                                                    id="labelEsClaseRecursoEliminable1"
                                                    for="listaEsClaseRecursoEliminable1"/>
                                                <webuijsf:dropDown id="listaEsClaseRecursoEliminable1"
                                                    binding="#{ClaseRecurso1.listaEsClaseRecursoEliminable1}"
                                                    converter="#{ClaseRecurso1.converterEsClaseRecursoEliminable1}"
                                                    disabled="#{ClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso1.asistente.opcionesListaEsClaseRecursoEliminable1}"
                                                    selected="#{currentRow.value['es_clase_recurso_eliminable']}"
                                                    toolTip="BundleParametros.es_clase_recurso_eliminable.clase_recurso"/>
                                                <webuijsf:staticText id="listaEsClaseRecursoEliminable1Texto1"
                                                    binding="#{ClaseRecurso1.listaEsClaseRecursoEliminable1Texto1}"/>
                                                <webuijsf:message id="messageEsClaseRecursoEliminable1"
                                                    for="listaEsClaseRecursoEliminable1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnEsClaseRecursoExtendida1}"
                                                    toolTip="BundleParametros.es_clase_recurso_extendida.clase_recurso"
                                                    headerText="extendida"
                                                    id="tableColumnEsClaseRecursoExtendida1" rendered="false"
                                                    sort="es_clase_recurso_extendida">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsClaseRecursoExtendida1"
                                                    text="#{currentRow.value['es_clase_recurso_extendida']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelEsClaseRecursoExtendida1}"
                                                    id="labelEsClaseRecursoExtendida1"
                                                    for="listaEsClaseRecursoExtendida1"/>
                                                <webuijsf:dropDown id="listaEsClaseRecursoExtendida1"
                                                    binding="#{ClaseRecurso1.listaEsClaseRecursoExtendida1}"
                                                    converter="#{ClaseRecurso1.converterEsClaseRecursoExtendida1}"
                                                    disabled="#{ClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso1.asistente.opcionesListaEsClaseRecursoExtendida1}"
                                                    selected="#{currentRow.value['es_clase_recurso_extendida']}"
                                                    toolTip="BundleParametros.es_clase_recurso_extendida.clase_recurso"/>
                                                <webuijsf:staticText id="listaEsClaseRecursoExtendida1Texto1"
                                                    binding="#{ClaseRecurso1.listaEsClaseRecursoExtendida1Texto1}"/>
                                                <webuijsf:message id="messageEsClaseRecursoExtendida1"
                                                    for="listaEsClaseRecursoExtendida1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnEtiquetaHipervinculo1}"
                                                    toolTip="BundleParametros.etiqueta_hipervinculo.clase_recurso"
                                                    headerText="etiqueta hipervinculo"
                                                    id="tableColumnEtiquetaHipervinculo1" rendered="false"
                                                    sort="etiqueta_hipervinculo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEtiquetaHipervinculo1"
                                                    text="#{currentRow.value['etiqueta_hipervinculo']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelEtiquetaHipervinculo1}"
                                                    id="labelEtiquetaHipervinculo1"
                                                    for="campoEtiquetaHipervinculo1"/>
                                                <webuijsf:textField id="campoEtiquetaHipervinculo1"
                                                    binding="#{ClaseRecurso1.campoEtiquetaHipervinculo1}"
                                                    columns="10"
                                                    maxLength="20"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['etiqueta_hipervinculo']}"
                                                    toolTip="BundleParametros.etiqueta_hipervinculo.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso1.validatorEtiquetaHipervinculo1.validate}"/>
                                                <webuijsf:staticText id="campoEtiquetaHipervinculo1Texto1"
                                                    binding="#{ClaseRecurso1.campoEtiquetaHipervinculo1Texto1}"
                                                    text="#{currentRow.value['etiqueta_hipervinculo']}"/>
                                                <webuijsf:message id="messageEtiquetaHipervinculo1"
                                                    for="campoEtiquetaHipervinculo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnEsEnumeradorConNumero1}"
                                                    toolTip="BundleParametros.es_enumerador_con_numero.clase_recurso"
                                                    headerText="enumerador con n&#250;mero"
                                                    id="tableColumnEsEnumeradorConNumero1" rendered="false"
                                                    sort="es_enumerador_con_numero">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsEnumeradorConNumero1"
                                                    text="#{currentRow.value['es_enumerador_con_numero']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelEsEnumeradorConNumero1}"
                                                    id="labelEsEnumeradorConNumero1"
                                                    for="listaEsEnumeradorConNumero1"/>
                                                <webuijsf:dropDown id="listaEsEnumeradorConNumero1"
                                                    binding="#{ClaseRecurso1.listaEsEnumeradorConNumero1}"
                                                    converter="#{ClaseRecurso1.converterEsEnumeradorConNumero1}"
                                                    disabled="#{ClaseRecurso1.gestor.filaNoProcesada}" required="true"
                                                    items="#{ClaseRecurso1.asistente.opcionesListaEsEnumeradorConNumero1}"
                                                    selected="#{currentRow.value['es_enumerador_con_numero']}"
                                                    toolTip="BundleParametros.es_enumerador_con_numero.clase_recurso"/>
                                                <webuijsf:staticText id="listaEsEnumeradorConNumero1Texto1"
                                                    binding="#{ClaseRecurso1.listaEsEnumeradorConNumero1Texto1}"/>
                                                <webuijsf:message id="messageEsEnumeradorConNumero1"
                                                    for="listaEsEnumeradorConNumero1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{ClaseRecurso1.tableColumnAliasClaseRecurso1}"
                                                    toolTip="BundleParametros.alias_clase_recurso.clase_recurso"
                                                    headerText="alias"
                                                    id="tableColumnAliasClaseRecurso1" rendered="false"
                                                    sort="alias_clase_recurso">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextAliasClaseRecurso1"
                                                    text="#{currentRow.value['alias_clase_recurso']}"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{ClaseRecurso1.labelAliasClaseRecurso1}"
                                                    id="labelAliasClaseRecurso1"
                                                    for="campoAliasClaseRecurso1"/>
                                                <webuijsf:textField id="campoAliasClaseRecurso1"
                                                    binding="#{ClaseRecurso1.campoAliasClaseRecurso1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{ClaseRecurso1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['alias_clase_recurso']}"
                                                    toolTip="BundleParametros.alias_clase_recurso.clase_recurso"
                                                    validatorExpression="#{ClaseRecurso1.validatorAliasClaseRecurso1.validate}"/>
                                                <webuijsf:staticText id="campoAliasClaseRecurso1Texto1"
                                                    binding="#{ClaseRecurso1.campoAliasClaseRecurso1Texto1}"
                                                    text="#{currentRow.value['alias_clase_recurso']}"/>
                                                <webuijsf:message id="messageAliasClaseRecurso1"
                                                    for="campoAliasClaseRecurso1"/>
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
                                                        binding="#{ClaseRecurso1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{ClaseRecurso1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{ClaseRecurso1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{ClaseRecurso1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{ClaseRecurso1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{ClaseRecurso1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{ClaseRecurso1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{ClaseRecurso1.botonRepaginar1_action}"
                                                        binding="#{ClaseRecurso1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{ClaseRecurso1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{ClaseRecurso1.gestor.scriptRepaginar}"
                                                        text="#{ClaseRecurso1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{ClaseRecurso1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso1.botonAgregar1_action}"
                                                    binding="#{ClaseRecurso1.botonAgregar1}"
                                                    disabled="#{ClaseRecurso1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{ClaseRecurso1.gestor.scriptAgregar}"
                                                    rendered="#{ClaseRecurso1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{ClaseRecurso1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ClaseRecurso1.listaFuncionEdicion1}"
                                                    converter="#{ClaseRecurso1.converterListaFuncionEdicion1}"
                                                    disabled="#{ClaseRecurso1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{ClaseRecurso1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{ClaseRecurso1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{ClaseRecurso1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{ClaseRecurso1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso1.botonEditar1_action}"
                                                    binding="#{ClaseRecurso1.botonEditar1}"
                                                    disabled="#{ClaseRecurso1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{ClaseRecurso1.gestor.scriptEditar}"
                                                    rendered="#{ClaseRecurso1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{ClaseRecurso1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso1.botonEliminar1_action}"
                                                    binding="#{ClaseRecurso1.botonEliminar1}"
                                                    disabled="#{ClaseRecurso1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{ClaseRecurso1.gestor.scriptEliminar}"
                                                    rendered="#{ClaseRecurso1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{ClaseRecurso1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso1.botonAplicar1_action}"
                                                    binding="#{ClaseRecurso1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{ClaseRecurso1.gestor.scriptAplicar}"
                                                    rendered="#{ClaseRecurso1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{ClaseRecurso1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso1.botonDeshacer1_action}"
                                                    binding="#{ClaseRecurso1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{ClaseRecurso1.gestor.scriptDeshacer}"
                                                    rendered="#{ClaseRecurso1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{ClaseRecurso1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso1.botonConfirmar1_action}"
                                                    binding="#{ClaseRecurso1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{ClaseRecurso1.gestor.scriptConfirmar}"
                                                    rendered="#{ClaseRecurso1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{ClaseRecurso1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso1.botonDescartar1_action}"
                                                    binding="#{ClaseRecurso1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{ClaseRecurso1.gestor.scriptDescartar}"
                                                    rendered="#{ClaseRecurso1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{ClaseRecurso1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{ClaseRecurso1.listaFuncionAccion1}"
                                                    converter="#{ClaseRecurso1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{ClaseRecurso1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{ClaseRecurso1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{ClaseRecurso1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{ClaseRecurso1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso1.botonProcesar1_action}"
                                                    binding="#{ClaseRecurso1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{ClaseRecurso1.gestor.scriptProcesar}"
                                                    rendered="#{ClaseRecurso1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{ClaseRecurso1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso1.botonRefrescar1_action}"
                                                    binding="#{ClaseRecurso1.botonRefrescar1}"
                                                    disabled="#{ClaseRecurso1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{ClaseRecurso1.gestor.scriptRefrescar}"
                                                    rendered="#{ClaseRecurso1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{ClaseRecurso1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso1.botonReconsultar1_action}"
                                                    binding="#{ClaseRecurso1.botonReconsultar1}"
                                                    disabled="#{ClaseRecurso1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{ClaseRecurso1.gestor.scriptReconsultar}"
                                                    rendered="#{ClaseRecurso1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{ClaseRecurso1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{ClaseRecurso1.botonRetornar1_action}"
                                                    binding="#{ClaseRecurso1.botonRetornar1}"
                                                    disabled="#{ClaseRecurso1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{ClaseRecurso1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{ClaseRecurso1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{ClaseRecurso1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{ClaseRecurso1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="4" 
                                                id="gridPanel109"
                                                rendered="#{ClaseRecurso1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecurso1.imageHyperlink1_action}"
                                                    binding="#{ClaseRecurso1.imageHyperlink1}"
                                                    disabled="#{ClaseRecurso1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{ClaseRecurso1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecurso1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.ClaseRecurso1_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecurso1.imageHyperlink2_action}"
                                                    binding="#{ClaseRecurso1.imageHyperlink2}"
                                                    disabled="#{ClaseRecurso1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{ClaseRecurso1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecurso1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.ClaseRecurso1_imageHyperlink2_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecurso1.imageHyperlink3_action}"
                                                    binding="#{ClaseRecurso1.imageHyperlink3}"
                                                    disabled="#{ClaseRecurso1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink3"
                                                    imageURL="#{ClaseRecurso1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecurso1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink3"
                                                    toolTip="#{bundle.ClaseRecurso1_imageHyperlink3_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{ClaseRecurso1.imageHyperlink4_action}"
                                                    binding="#{ClaseRecurso1.imageHyperlink4}"
                                                    disabled="#{ClaseRecurso1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink4"
                                                    imageURL="#{ClaseRecurso1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{ClaseRecurso1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{ClaseRecurso1.gestor.designing}"
                                                    text="Hyperlink4"
                                                    toolTip="#{bundle.ClaseRecurso1_imageHyperlink4_toolTip}"/>
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
