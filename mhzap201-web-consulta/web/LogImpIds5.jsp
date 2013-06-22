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
                    focus="#{LogImpIds5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{LogImpIds5.gestor.preserveFocus}"
                    preserveScroll="#{LogImpIds5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{LogImpIds5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdLogImpIds1 campoCedula1 campoLetraCedula1 campoApellidos1 campoNombres1 campoNacimiento1 campoSexo1 campoNacionalidad1 campoEstadoCivil1 campoLugarNacimiento1 campoIndigena1 listaEsImportado1 campoObservacion1 campoFechaHoraTransaccion1 campoNombreArchivo1 campoCodigoArchivo1 campoIdPersona1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{LogImpIds5.breadcrumbs1}" 
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
                                                    rendered="#{LogImpIds5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{LogImpIds5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{LogImpIds5.gestor.mensajeDisponible}"
                                                    text="#{LogImpIds5.gestor.mensaje}"
                                                    url="#{LogImpIds5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{LogImpIds5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{LogImpIds5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{LogImpIds5.gestor.filaEscogida}" 
                                                sourceData="#{LogImpIds5.logImpIdsDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{LogImpIds5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{LogImpIds5.gestor.scriptElegir}" 
                                                        selected="#{LogImpIds5.gestor.filaElegida}" 
                                                        toolTip="#{LogImpIds5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{LogImpIds5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpIds5.botonEscogerFila1_action}"
                                                        binding="#{LogImpIds5.botonEscogerFila1}"
                                                        disabled="#{LogImpIds5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{LogImpIds5.gestor.urlImagenEscoger}" 
                                                        onClick="#{LogImpIds5.gestor.scriptEscoger}"
                                                        text="#{LogImpIds5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{LogImpIds5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpIds5.botonDetallarFila1_action}"
                                                        binding="#{LogImpIds5.botonDetallarFila1}"
                                                        disabled="#{LogImpIds5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{LogImpIds5.gestor.urlImagenDetallar}" 
                                                        onClick="#{LogImpIds5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{LogImpIds5.gestor.detalleDisponible}" 
                                                        text="#{LogImpIds5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{LogImpIds5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpIds5.botonProcesarFila1_action}"
                                                        binding="#{LogImpIds5.botonProcesarFila1}"
                                                        disabled="#{LogImpIds5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{LogImpIds5.gestor.urlImagenProcesar}" 
                                                        onClick="#{LogImpIds5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{LogImpIds5.asistente.comandoDisponible}" 
                                                        text="#{LogImpIds5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{LogImpIds5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpIds5.botonRetornarFila1_action}"
                                                        binding="#{LogImpIds5.botonRetornarFila1}" 
                                                        disabled="#{LogImpIds5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{LogImpIds5.gestor.urlImagenRetornar}"
                                                        onClick="#{LogImpIds5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{LogImpIds5.gestor.funcionReturnVisible}" 
                                                        text="#{LogImpIds5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{LogImpIds5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{LogImpIds5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{LogImpIds5.hipervinculoAccionFila1_action}"
                                                        binding="#{LogImpIds5.hipervinculoAccionFila1}"
                                                        disabled="#{LogImpIds5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{LogImpIds5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{LogImpIds5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.LogImpIds5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{LogImpIds5.tableColumn3}" 
                                                    headerText="#{LogImpIds5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{LogImpIds5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{LogImpIds5.hipervinculoDetallarFila1_action}"
                                                        binding="#{LogImpIds5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{LogImpIds5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{LogImpIds5.gestor.identificacionFila}" 
                                                        toolTip="#{LogImpIds5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnIdLogImpIds1}"
                                                    toolTip="BundleParametros.id_log_imp_ids.log_imp_ids"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdLogImpIds1" rendered="false"
                                                    sort="id_log_imp_ids">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdLogImpIds1"
                                                    text="#{currentRow.value['id_log_imp_ids']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelIdLogImpIds1}"
                                                    id="labelIdLogImpIds1"
                                                    for="campoIdLogImpIds1"/>
                                                <webuijsf:textField id="campoIdLogImpIds1"
                                                    binding="#{LogImpIds5.campoIdLogImpIds1}"
                                                    converter="#{LogImpIds5.converterIdLogImpIds1}"
                                                    readOnly="#{LogImpIds5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_log_imp_ids']}"
                                                    toolTip="BundleParametros.id_log_imp_ids.log_imp_ids"
                                                    validatorExpression="#{LogImpIds5.validatorIdLogImpIds1.validate}"/>
                                                <webuijsf:staticText id="campoIdLogImpIds1Texto1"
                                                    binding="#{LogImpIds5.campoIdLogImpIds1Texto1}"
                                                    text="#{currentRow.value['id_log_imp_ids']}"/>
                                                <webuijsf:message id="messageIdLogImpIds1"
                                                    for="campoIdLogImpIds1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnCedula1}"
                                                    toolTip="BundleParametros.cedula.log_imp_ids"
                                                    headerText="c&#233;dula"
                                                    id="tableColumnCedula1"
                                                    sort="cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCedula1"
                                                    text="#{currentRow.value['cedula']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelCedula1}"
                                                    id="labelCedula1"
                                                    for="campoCedula1"/>
                                                <webuijsf:textArea id="campoCedula1"
                                                    binding="#{LogImpIds5.campoCedula1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpIds5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['cedula']}"
                                                    toolTip="BundleParametros.cedula.log_imp_ids"
                                                    validatorExpression="#{LogImpIds5.validatorCedula1.validate}"/>
                                                <webuijsf:staticText id="campoCedula1Texto1"
                                                    binding="#{LogImpIds5.campoCedula1Texto1}"
                                                    text="#{currentRow.value['cedula']}"/>
                                                <webuijsf:message id="messageCedula1"
                                                    for="campoCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnLetraCedula1}"
                                                    toolTip="BundleParametros.letra_cedula.log_imp_ids"
                                                    headerText="letra c&#233;dula"
                                                    id="tableColumnLetraCedula1" rendered="false"
                                                    sort="letra_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextLetraCedula1"
                                                    text="#{currentRow.value['letra_cedula']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelLetraCedula1}"
                                                    id="labelLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                <webuijsf:textArea id="campoLetraCedula1"
                                                    binding="#{LogImpIds5.campoLetraCedula1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpIds5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['letra_cedula']}"
                                                    toolTip="BundleParametros.letra_cedula.log_imp_ids"
                                                    validatorExpression="#{LogImpIds5.validatorLetraCedula1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedula1Texto1"
                                                    binding="#{LogImpIds5.campoLetraCedula1Texto1}"
                                                    text="#{currentRow.value['letra_cedula']}"/>
                                                <webuijsf:message id="messageLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnApellidos1}"
                                                    toolTip="BundleParametros.apellidos.log_imp_ids"
                                                    headerText="apellidos"
                                                    id="tableColumnApellidos1" rendered="false"
                                                    sort="apellidos">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextApellidos1"
                                                    text="#{currentRow.value['apellidos']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelApellidos1}"
                                                    id="labelApellidos1"
                                                    for="campoApellidos1"/>
                                                <webuijsf:textArea id="campoApellidos1"
                                                    binding="#{LogImpIds5.campoApellidos1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpIds5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['apellidos']}"
                                                    toolTip="BundleParametros.apellidos.log_imp_ids"
                                                    validatorExpression="#{LogImpIds5.validatorApellidos1.validate}"/>
                                                <webuijsf:staticText id="campoApellidos1Texto1"
                                                    binding="#{LogImpIds5.campoApellidos1Texto1}"
                                                    text="#{currentRow.value['apellidos']}"/>
                                                <webuijsf:message id="messageApellidos1"
                                                    for="campoApellidos1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnNombres1}"
                                                    toolTip="BundleParametros.nombres.log_imp_ids"
                                                    headerText="nombres"
                                                    id="tableColumnNombres1" rendered="false"
                                                    sort="nombres">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombres1"
                                                    text="#{currentRow.value['nombres']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelNombres1}"
                                                    id="labelNombres1"
                                                    for="campoNombres1"/>
                                                <webuijsf:textArea id="campoNombres1"
                                                    binding="#{LogImpIds5.campoNombres1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpIds5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombres']}"
                                                    toolTip="BundleParametros.nombres.log_imp_ids"
                                                    validatorExpression="#{LogImpIds5.validatorNombres1.validate}"/>
                                                <webuijsf:staticText id="campoNombres1Texto1"
                                                    binding="#{LogImpIds5.campoNombres1Texto1}"
                                                    text="#{currentRow.value['nombres']}"/>
                                                <webuijsf:message id="messageNombres1"
                                                    for="campoNombres1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnNacimiento1}"
                                                    toolTip="BundleParametros.nacimiento.log_imp_ids"
                                                    headerText="nacimiento"
                                                    id="tableColumnNacimiento1" rendered="false"
                                                    sort="nacimiento">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNacimiento1"
                                                    text="#{currentRow.value['nacimiento']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelNacimiento1}"
                                                    id="labelNacimiento1"
                                                    for="campoNacimiento1"/>
                                                <webuijsf:textArea id="campoNacimiento1"
                                                    binding="#{LogImpIds5.campoNacimiento1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpIds5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nacimiento']}"
                                                    toolTip="BundleParametros.nacimiento.log_imp_ids"
                                                    validatorExpression="#{LogImpIds5.validatorNacimiento1.validate}"/>
                                                <webuijsf:staticText id="campoNacimiento1Texto1"
                                                    binding="#{LogImpIds5.campoNacimiento1Texto1}"
                                                    text="#{currentRow.value['nacimiento']}"/>
                                                <webuijsf:message id="messageNacimiento1"
                                                    for="campoNacimiento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnSexo1}"
                                                    toolTip="BundleParametros.sexo.log_imp_ids"
                                                    headerText="sexo"
                                                    id="tableColumnSexo1" rendered="false"
                                                    sort="sexo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSexo1"
                                                    text="#{currentRow.value['sexo']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelSexo1}"
                                                    id="labelSexo1"
                                                    for="campoSexo1"/>
                                                <webuijsf:textArea id="campoSexo1"
                                                    binding="#{LogImpIds5.campoSexo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpIds5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['sexo']}"
                                                    toolTip="BundleParametros.sexo.log_imp_ids"
                                                    validatorExpression="#{LogImpIds5.validatorSexo1.validate}"/>
                                                <webuijsf:staticText id="campoSexo1Texto1"
                                                    binding="#{LogImpIds5.campoSexo1Texto1}"
                                                    text="#{currentRow.value['sexo']}"/>
                                                <webuijsf:message id="messageSexo1"
                                                    for="campoSexo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnNacionalidad1}"
                                                    toolTip="BundleParametros.nacionalidad.log_imp_ids"
                                                    headerText="nacionalidad"
                                                    id="tableColumnNacionalidad1" rendered="false"
                                                    sort="nacionalidad">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNacionalidad1"
                                                    text="#{currentRow.value['nacionalidad']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelNacionalidad1}"
                                                    id="labelNacionalidad1"
                                                    for="campoNacionalidad1"/>
                                                <webuijsf:textArea id="campoNacionalidad1"
                                                    binding="#{LogImpIds5.campoNacionalidad1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpIds5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nacionalidad']}"
                                                    toolTip="BundleParametros.nacionalidad.log_imp_ids"
                                                    validatorExpression="#{LogImpIds5.validatorNacionalidad1.validate}"/>
                                                <webuijsf:staticText id="campoNacionalidad1Texto1"
                                                    binding="#{LogImpIds5.campoNacionalidad1Texto1}"
                                                    text="#{currentRow.value['nacionalidad']}"/>
                                                <webuijsf:message id="messageNacionalidad1"
                                                    for="campoNacionalidad1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnEstadoCivil1}"
                                                    toolTip="BundleParametros.estado_civil.log_imp_ids"
                                                    headerText="estado civil"
                                                    id="tableColumnEstadoCivil1" rendered="false"
                                                    sort="estado_civil">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEstadoCivil1"
                                                    text="#{currentRow.value['estado_civil']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelEstadoCivil1}"
                                                    id="labelEstadoCivil1"
                                                    for="campoEstadoCivil1"/>
                                                <webuijsf:textArea id="campoEstadoCivil1"
                                                    binding="#{LogImpIds5.campoEstadoCivil1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpIds5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['estado_civil']}"
                                                    toolTip="BundleParametros.estado_civil.log_imp_ids"
                                                    validatorExpression="#{LogImpIds5.validatorEstadoCivil1.validate}"/>
                                                <webuijsf:staticText id="campoEstadoCivil1Texto1"
                                                    binding="#{LogImpIds5.campoEstadoCivil1Texto1}"
                                                    text="#{currentRow.value['estado_civil']}"/>
                                                <webuijsf:message id="messageEstadoCivil1"
                                                    for="campoEstadoCivil1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnLugarNacimiento1}"
                                                    toolTip="BundleParametros.lugar_nacimiento.log_imp_ids"
                                                    headerText="lugar nacimiento"
                                                    id="tableColumnLugarNacimiento1" rendered="false"
                                                    sort="lugar_nacimiento">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextLugarNacimiento1"
                                                    text="#{currentRow.value['lugar_nacimiento']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelLugarNacimiento1}"
                                                    id="labelLugarNacimiento1"
                                                    for="campoLugarNacimiento1"/>
                                                <webuijsf:textArea id="campoLugarNacimiento1"
                                                    binding="#{LogImpIds5.campoLugarNacimiento1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpIds5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['lugar_nacimiento']}"
                                                    toolTip="BundleParametros.lugar_nacimiento.log_imp_ids"
                                                    validatorExpression="#{LogImpIds5.validatorLugarNacimiento1.validate}"/>
                                                <webuijsf:staticText id="campoLugarNacimiento1Texto1"
                                                    binding="#{LogImpIds5.campoLugarNacimiento1Texto1}"
                                                    text="#{currentRow.value['lugar_nacimiento']}"/>
                                                <webuijsf:message id="messageLugarNacimiento1"
                                                    for="campoLugarNacimiento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnIndigena1}"
                                                    toolTip="BundleParametros.indigena.log_imp_ids"
                                                    headerText="indigena"
                                                    id="tableColumnIndigena1" rendered="false"
                                                    sort="indigena">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIndigena1"
                                                    text="#{currentRow.value['indigena']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelIndigena1}"
                                                    id="labelIndigena1"
                                                    for="campoIndigena1"/>
                                                <webuijsf:textArea id="campoIndigena1"
                                                    binding="#{LogImpIds5.campoIndigena1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpIds5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['indigena']}"
                                                    toolTip="BundleParametros.indigena.log_imp_ids"
                                                    validatorExpression="#{LogImpIds5.validatorIndigena1.validate}"/>
                                                <webuijsf:staticText id="campoIndigena1Texto1"
                                                    binding="#{LogImpIds5.campoIndigena1Texto1}"
                                                    text="#{currentRow.value['indigena']}"/>
                                                <webuijsf:message id="messageIndigena1"
                                                    for="campoIndigena1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnEsImportado1}"
                                                    toolTip="BundleParametros.es_importado.log_imp_ids"
                                                    headerText="importado"
                                                    id="tableColumnEsImportado1"
                                                    sort="es_importado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsImportado1"
                                                    text="#{currentRow.value['es_importado']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelEsImportado1}"
                                                    id="labelEsImportado1"
                                                    for="listaEsImportado1"/>
                                                <webuijsf:dropDown id="listaEsImportado1"
                                                    binding="#{LogImpIds5.listaEsImportado1}"
                                                    converter="#{LogImpIds5.converterEsImportado1}"
                                                    disabled="#{LogImpIds5.gestor.filaNoProcesada}" required="true"
                                                    items="#{LogImpIds5.asistente.opcionesListaEsImportado1}"
                                                    selected="#{currentRow.value['es_importado']}"
                                                    toolTip="BundleParametros.es_importado.log_imp_ids"/>
                                                <webuijsf:staticText id="listaEsImportado1Texto1"
                                                    binding="#{LogImpIds5.listaEsImportado1Texto1}"/>
                                                <webuijsf:message id="messageEsImportado1"
                                                    for="listaEsImportado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnObservacion1}"
                                                    toolTip="BundleParametros.observacion.log_imp_ids"
                                                    headerText="observaci&#243;n"
                                                    id="tableColumnObservacion1"
                                                    sort="observacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservacion1"
                                                    text="#{currentRow.value['observacion']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelObservacion1}"
                                                    id="labelObservacion1"
                                                    for="campoObservacion1"/>
                                                <webuijsf:textArea id="campoObservacion1"
                                                    binding="#{LogImpIds5.campoObservacion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpIds5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observacion']}"
                                                    toolTip="BundleParametros.observacion.log_imp_ids"
                                                    validatorExpression="#{LogImpIds5.validatorObservacion1.validate}"/>
                                                <webuijsf:staticText id="campoObservacion1Texto1"
                                                    binding="#{LogImpIds5.campoObservacion1Texto1}"
                                                    text="#{currentRow.value['observacion']}"/>
                                                <webuijsf:message id="messageObservacion1"
                                                    for="campoObservacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnFechaHoraTransaccion1}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_ids"
                                                    headerText="fecha hora transacci&#243;n"
                                                    id="tableColumnFechaHoraTransaccion1"
                                                    sort="fecha_hora_transaccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraTransaccion1"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelFechaHoraTransaccion1}"
                                                    id="labelFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                <webuijsf:textField id="campoFechaHoraTransaccion1"
                                                    binding="#{LogImpIds5.campoFechaHoraTransaccion1}"
                                                    converter="#{LogImpIds5.converterFechaHoraTransaccion1}"
                                                    readOnly="#{LogImpIds5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"
                                                    toolTip="BundleParametros.fecha_hora_transaccion.log_imp_ids"/>
                                                <webuijsf:staticText id="campoFechaHoraTransaccion1Texto1"
                                                    binding="#{LogImpIds5.campoFechaHoraTransaccion1Texto1}"
                                                    converter="#{LogImpIds5.converterFechaHoraTransaccion1}"
                                                    text="#{currentRow.value['fecha_hora_transaccion']}"/>
                                                <webuijsf:message id="messageFechaHoraTransaccion1"
                                                    for="campoFechaHoraTransaccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnNombreArchivo1}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_ids"
                                                    headerText="nombre archivo"
                                                    id="tableColumnNombreArchivo1" rendered="false"
                                                    sort="nombre_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreArchivo1"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelNombreArchivo1}"
                                                    id="labelNombreArchivo1"
                                                    for="campoNombreArchivo1"/>
                                                <webuijsf:textArea id="campoNombreArchivo1"
                                                    binding="#{LogImpIds5.campoNombreArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpIds5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_archivo']}"
                                                    toolTip="BundleParametros.nombre_archivo.log_imp_ids"
                                                    validatorExpression="#{LogImpIds5.validatorNombreArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoNombreArchivo1Texto1"
                                                    binding="#{LogImpIds5.campoNombreArchivo1Texto1}"
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
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogImpIds5.campoNombreArchivo1Boton3}"
                                                    id="campoNombreArchivo1Boton3"
                                                    onClick="#{LogImpIds5.asistente.scriptCampoNombreArchivo1Boton3}"
                                                    rendered="#{LogImpIds5.asistente.campoNombreArchivo1Boton3Rendered}"
                                                    text="#{LogImpIds5.asistente.textCampoNombreArchivo1Boton3}"
                                                    toolTip="#{LogImpIds5.asistente.toolTipCampoNombreArchivo1Boton3}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnCodigoArchivo1}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_ids"
                                                    headerText="c&#243;digo archivo"
                                                    id="tableColumnCodigoArchivo1" rendered="false"
                                                    sort="codigo_archivo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoArchivo1"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelCodigoArchivo1}"
                                                    id="labelCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                <webuijsf:textArea id="campoCodigoArchivo1"
                                                    binding="#{LogImpIds5.campoCodigoArchivo1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{LogImpIds5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['codigo_archivo']}"
                                                    toolTip="BundleParametros.codigo_archivo.log_imp_ids"
                                                    validatorExpression="#{LogImpIds5.validatorCodigoArchivo1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoArchivo1Texto1"
                                                    binding="#{LogImpIds5.campoCodigoArchivo1Texto1}"
                                                    text="#{currentRow.value['codigo_archivo']}"/>
                                                <webuijsf:message id="messageCodigoArchivo1"
                                                    for="campoCodigoArchivo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{LogImpIds5.tableColumnIdPersona1}"
                                                    toolTip="BundleParametros.id_persona.log_imp_ids"
                                                    headerText="persona"
                                                    id="tableColumnIdPersona1" rendered="false"
                                                    sort="codigo_persona_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona1"
                                                    text="#{currentRow.value['codigo_persona_1x1y3']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{LogImpIds5.campoIdPersona1}"
                                                    readOnly="#{LogImpIds5.gestor.filaNoProcesada}"
                                                    text="#{LogImpIds5.asistente.textoCampoIdPersona1}"
                                                    toolTip="#{LogImpIds5.asistente.toolTipCampoIdPersona1}"
                                                    validatorExpression="#{LogImpIds5.campoIdPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{LogImpIds5.campoIdPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_persona_1x1y3']}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdPersona3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona3"
                                                    text="#{currentRow.value['id_persona']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{LogImpIds5.campoIdPersona1Boton1}"
                                                    id="campoIdPersona1Boton1"
                                                    onClick="#{LogImpIds5.asistente.scriptCampoIdPersona1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{LogImpIds5.campoIdPersona1Boton3}"
                                                    id="campoIdPersona1Boton3"
                                                    onClick="#{LogImpIds5.asistente.scriptCampoIdPersona1Boton2}"
                                                    rendered="#{LogImpIds5.asistente.campoIdPersona1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{LogImpIds5.tableColumnIdPersona2}"
                                                    headerText="nombre persona"
                                                    id="tableColumnIdPersona2" rendered="false"
                                                    sort="nombre_persona_1x1y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona2"
                                                    text="#{currentRow.value['nombre_persona_1x1y4']}"
                                                    rendered="#{LogImpIds5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{LogImpIds5.labelIdPersona2}"
                                                    id="labelIdPersona2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{LogImpIds5.campoIdPersona1Hiper1}"
                                                    id="campoIdPersona1Hiper1"
                                                    text="#{currentRow.value['nombre_persona_1x1y4']}"
                                                    onClick="#{LogImpIds5.asistente.scriptCampoIdPersona1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdPersona1Boton2"
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
                                                        binding="#{LogImpIds5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{LogImpIds5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{LogImpIds5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{LogImpIds5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{LogImpIds5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{LogImpIds5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{LogImpIds5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{LogImpIds5.botonRepaginar1_action}"
                                                        binding="#{LogImpIds5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{LogImpIds5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{LogImpIds5.gestor.scriptRepaginar}"
                                                        text="#{LogImpIds5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{LogImpIds5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds5.botonAgregar1_action}"
                                                    binding="#{LogImpIds5.botonAgregar1}"
                                                    disabled="#{LogImpIds5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{LogImpIds5.gestor.scriptAgregar}"
                                                    rendered="#{LogImpIds5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{LogImpIds5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpIds5.listaFuncionEdicion1}"
                                                    converter="#{LogImpIds5.converterListaFuncionEdicion1}"
                                                    disabled="#{LogImpIds5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{LogImpIds5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{LogImpIds5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{LogImpIds5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{LogImpIds5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds5.botonEditar1_action}"
                                                    binding="#{LogImpIds5.botonEditar1}"
                                                    disabled="#{LogImpIds5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{LogImpIds5.gestor.scriptEditar}"
                                                    rendered="#{LogImpIds5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{LogImpIds5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds5.botonEliminar1_action}"
                                                    binding="#{LogImpIds5.botonEliminar1}"
                                                    disabled="#{LogImpIds5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{LogImpIds5.gestor.scriptEliminar}"
                                                    rendered="#{LogImpIds5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{LogImpIds5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds5.botonAplicar1_action}"
                                                    binding="#{LogImpIds5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{LogImpIds5.gestor.scriptAplicar}"
                                                    rendered="#{LogImpIds5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{LogImpIds5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds5.botonDeshacer1_action}"
                                                    binding="#{LogImpIds5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{LogImpIds5.gestor.scriptDeshacer}"
                                                    rendered="#{LogImpIds5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{LogImpIds5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds5.botonConfirmar1_action}"
                                                    binding="#{LogImpIds5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{LogImpIds5.gestor.scriptConfirmar}"
                                                    rendered="#{LogImpIds5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{LogImpIds5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds5.botonDescartar1_action}"
                                                    binding="#{LogImpIds5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{LogImpIds5.gestor.scriptDescartar}"
                                                    rendered="#{LogImpIds5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{LogImpIds5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{LogImpIds5.listaFuncionAccion1}"
                                                    converter="#{LogImpIds5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{LogImpIds5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{LogImpIds5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{LogImpIds5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{LogImpIds5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds5.botonProcesar1_action}"
                                                    binding="#{LogImpIds5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{LogImpIds5.gestor.scriptProcesar}"
                                                    rendered="#{LogImpIds5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{LogImpIds5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds5.botonRefrescar1_action}"
                                                    binding="#{LogImpIds5.botonRefrescar1}"
                                                    disabled="#{LogImpIds5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{LogImpIds5.gestor.scriptRefrescar}"
                                                    rendered="#{LogImpIds5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{LogImpIds5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds5.botonReconsultar1_action}"
                                                    binding="#{LogImpIds5.botonReconsultar1}"
                                                    disabled="#{LogImpIds5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{LogImpIds5.gestor.scriptReconsultar}"
                                                    rendered="#{LogImpIds5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{LogImpIds5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{LogImpIds5.botonRetornar1_action}"
                                                    binding="#{LogImpIds5.botonRetornar1}"
                                                    disabled="#{LogImpIds5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{LogImpIds5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{LogImpIds5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{LogImpIds5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{LogImpIds5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{LogImpIds5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{LogImpIds5.imageHyperlink1_action}"
                                                    binding="#{LogImpIds5.imageHyperlink1}"
                                                    disabled="#{LogImpIds5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{LogImpIds5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{LogImpIds5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{LogImpIds5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.LogImpIds5_imageHyperlink1_toolTip}"/>
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
