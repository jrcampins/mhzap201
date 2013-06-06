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
                    focus="#{Funcionario5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Funcionario5.gestor.preserveFocus}"
                    preserveScroll="#{Funcionario5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Funcionario5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdFuncionario1 campoCodigoFuncionario1 campoNombreFuncionario1 campoNumeroCedula1 campoLetraCedula1 campoPrimerNombre1 campoSegundoNombre1 campoPrimerApellido1 campoSegundoApellido1 campoApellidoCasada1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Funcionario5.breadcrumbs1}" 
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
                                                    rendered="#{Funcionario5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Funcionario5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Funcionario5.gestor.mensajeDisponible}"
                                                    text="#{Funcionario5.gestor.mensaje}"
                                                    url="#{Funcionario5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{Funcionario5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{Funcionario5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{Funcionario5.gestor.filaEscogida}" 
                                                sourceData="#{Funcionario5.funcionarioDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{Funcionario5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{Funcionario5.gestor.scriptElegir}" 
                                                        selected="#{Funcionario5.gestor.filaElegida}" 
                                                        toolTip="#{Funcionario5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{Funcionario5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{Funcionario5.botonEscogerFila1_action}"
                                                        binding="#{Funcionario5.botonEscogerFila1}"
                                                        disabled="#{Funcionario5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{Funcionario5.gestor.urlImagenEscoger}" 
                                                        onClick="#{Funcionario5.gestor.scriptEscoger}"
                                                        text="#{Funcionario5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{Funcionario5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Funcionario5.botonDetallarFila1_action}"
                                                        binding="#{Funcionario5.botonDetallarFila1}"
                                                        disabled="#{Funcionario5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{Funcionario5.gestor.urlImagenDetallar}" 
                                                        onClick="#{Funcionario5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{Funcionario5.gestor.detalleDisponible}" 
                                                        text="#{Funcionario5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{Funcionario5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Funcionario5.botonProcesarFila1_action}"
                                                        binding="#{Funcionario5.botonProcesarFila1}"
                                                        disabled="#{Funcionario5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Funcionario5.gestor.urlImagenProcesar}" 
                                                        onClick="#{Funcionario5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Funcionario5.asistente.comandoDisponible}" 
                                                        text="#{Funcionario5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Funcionario5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Funcionario5.botonRetornarFila1_action}"
                                                        binding="#{Funcionario5.botonRetornarFila1}" 
                                                        disabled="#{Funcionario5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{Funcionario5.gestor.urlImagenRetornar}"
                                                        onClick="#{Funcionario5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{Funcionario5.gestor.funcionReturnVisible}" 
                                                        text="#{Funcionario5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{Funcionario5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Funcionario5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{Funcionario5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{Funcionario5.hipervinculoAccionFila1_action}"
                                                        binding="#{Funcionario5.hipervinculoAccionFila1}"
                                                        disabled="#{Funcionario5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{Funcionario5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{Funcionario5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.Funcionario5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{Funcionario5.tableColumn3}" 
                                                    headerText="#{Funcionario5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Funcionario5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{Funcionario5.hipervinculoDetallarFila1_action}"
                                                        binding="#{Funcionario5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{Funcionario5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{Funcionario5.gestor.identificacionFila}" 
                                                        toolTip="#{Funcionario5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Funcionario5.tableColumnIdFuncionario1}"
                                                    toolTip="BundleParametros.id_funcionario.funcionario"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdFuncionario1" rendered="false"
                                                    sort="id_funcionario">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionario1"
                                                    text="#{currentRow.value['id_funcionario']}"
                                                    rendered="#{Funcionario5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Funcionario5.labelIdFuncionario1}"
                                                    id="labelIdFuncionario1"
                                                    for="campoIdFuncionario1"/>
                                                <webuijsf:textField id="campoIdFuncionario1"
                                                    binding="#{Funcionario5.campoIdFuncionario1}"
                                                    converter="#{Funcionario5.converterIdFuncionario1}"
                                                    readOnly="#{Funcionario5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_funcionario']}"
                                                    toolTip="BundleParametros.id_funcionario.funcionario"
                                                    validatorExpression="#{Funcionario5.validatorIdFuncionario1.validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionario1Texto1"
                                                    binding="#{Funcionario5.campoIdFuncionario1Texto1}"
                                                    text="#{currentRow.value['id_funcionario']}"/>
                                                <webuijsf:message id="messageIdFuncionario1"
                                                    for="campoIdFuncionario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Funcionario5.tableColumnCodigoFuncionario1}"
                                                    toolTip="BundleParametros.codigo_funcionario.funcionario"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoFuncionario1"
                                                    sort="codigo_funcionario">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoFuncionario1"
                                                    text="#{currentRow.value['codigo_funcionario']}"
                                                    rendered="#{Funcionario5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Funcionario5.labelCodigoFuncionario1}"
                                                    id="labelCodigoFuncionario1"
                                                    for="campoCodigoFuncionario1"/>
                                                <webuijsf:textField id="campoCodigoFuncionario1"
                                                    binding="#{Funcionario5.campoCodigoFuncionario1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{currentRow.value['codigo_funcionario']}"
                                                    toolTip="BundleParametros.codigo_funcionario.funcionario"
                                                    validatorExpression="#{Funcionario5.validatorCodigoFuncionario1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoFuncionario1Texto1"
                                                    binding="#{Funcionario5.campoCodigoFuncionario1Texto1}"
                                                    text="#{currentRow.value['codigo_funcionario']}"/>
                                                <webuijsf:message id="messageCodigoFuncionario1"
                                                    for="campoCodigoFuncionario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Funcionario5.tableColumnNombreFuncionario1}"
                                                    toolTip="BundleParametros.nombre_funcionario.funcionario"
                                                    headerText="nombre"
                                                    id="tableColumnNombreFuncionario1"
                                                    sort="nombre_funcionario">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreFuncionario1"
                                                    text="#{currentRow.value['nombre_funcionario']}"
                                                    rendered="#{Funcionario5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Funcionario5.labelNombreFuncionario1}"
                                                    id="labelNombreFuncionario1"
                                                    for="campoNombreFuncionario1"/>
                                                <webuijsf:textField id="campoNombreFuncionario1"
                                                    binding="#{Funcionario5.campoNombreFuncionario1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{currentRow.value['nombre_funcionario']}"
                                                    toolTip="BundleParametros.nombre_funcionario.funcionario"
                                                    validatorExpression="#{Funcionario5.validatorNombreFuncionario1.validate}"/>
                                                <webuijsf:staticText id="campoNombreFuncionario1Texto1"
                                                    binding="#{Funcionario5.campoNombreFuncionario1Texto1}"
                                                    text="#{currentRow.value['nombre_funcionario']}"/>
                                                <webuijsf:message id="messageNombreFuncionario1"
                                                    for="campoNombreFuncionario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Funcionario5.tableColumnNumeroCedula1}"
                                                    toolTip="BundleParametros.numero_cedula.funcionario"
                                                    headerText="n&#250;mero c&#233;dula"
                                                    id="tableColumnNumeroCedula1" rendered="false"
                                                    sort="numero_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCedula1"
                                                    text="#{currentRow.value['numero_cedula']}"
                                                    rendered="#{Funcionario5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Funcionario5.labelNumeroCedula1}"
                                                    id="labelNumeroCedula1"
                                                    for="campoNumeroCedula1"/>
                                                <webuijsf:textField id="campoNumeroCedula1"
                                                    binding="#{Funcionario5.campoNumeroCedula1}"
                                                    converter="#{Funcionario5.converterNumeroCedula1}"
                                                    readOnly="#{Funcionario5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['numero_cedula']}"
                                                    toolTip="BundleParametros.numero_cedula.funcionario"
                                                    validatorExpression="#{Funcionario5.validatorNumeroCedula1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedula1Texto1"
                                                    binding="#{Funcionario5.campoNumeroCedula1Texto1}"
                                                    text="#{currentRow.value['numero_cedula']}"/>
                                                <webuijsf:message id="messageNumeroCedula1"
                                                    for="campoNumeroCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Funcionario5.tableColumnLetraCedula1}"
                                                    toolTip="BundleParametros.letra_cedula.funcionario"
                                                    headerText="letra c&#233;dula"
                                                    id="tableColumnLetraCedula1" rendered="false"
                                                    sort="letra_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextLetraCedula1"
                                                    text="#{currentRow.value['letra_cedula']}"
                                                    rendered="#{Funcionario5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Funcionario5.labelLetraCedula1}"
                                                    id="labelLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                <webuijsf:textField id="campoLetraCedula1"
                                                    binding="#{Funcionario5.campoLetraCedula1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="#{Funcionario5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['letra_cedula']}"
                                                    toolTip="BundleParametros.letra_cedula.funcionario"
                                                    validatorExpression="#{Funcionario5.validatorLetraCedula1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedula1Texto1"
                                                    binding="#{Funcionario5.campoLetraCedula1Texto1}"
                                                    text="#{currentRow.value['letra_cedula']}"/>
                                                <webuijsf:message id="messageLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Funcionario5.tableColumnPrimerNombre1}"
                                                    toolTip="BundleParametros.primer_nombre.funcionario"
                                                    headerText="primer nombre"
                                                    id="tableColumnPrimerNombre1" rendered="false"
                                                    sort="primer_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerNombre1"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    rendered="#{Funcionario5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Funcionario5.labelPrimerNombre1}"
                                                    id="labelPrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                <webuijsf:textField id="campoPrimerNombre1"
                                                    binding="#{Funcionario5.campoPrimerNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Funcionario5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.funcionario"
                                                    validatorExpression="#{Funcionario5.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1Texto1"
                                                    binding="#{Funcionario5.campoPrimerNombre1Texto1}"
                                                    text="#{currentRow.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Funcionario5.tableColumnSegundoNombre1}"
                                                    toolTip="BundleParametros.segundo_nombre.funcionario"
                                                    headerText="segundo nombre"
                                                    id="tableColumnSegundoNombre1" rendered="false"
                                                    sort="segundo_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoNombre1"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    rendered="#{Funcionario5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Funcionario5.labelSegundoNombre1}"
                                                    id="labelSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                <webuijsf:textField id="campoSegundoNombre1"
                                                    binding="#{Funcionario5.campoSegundoNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Funcionario5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.funcionario"
                                                    validatorExpression="#{Funcionario5.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1Texto1"
                                                    binding="#{Funcionario5.campoSegundoNombre1Texto1}"
                                                    text="#{currentRow.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Funcionario5.tableColumnPrimerApellido1}"
                                                    toolTip="BundleParametros.primer_apellido.funcionario"
                                                    headerText="primer apellido"
                                                    id="tableColumnPrimerApellido1" rendered="false"
                                                    sort="primer_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerApellido1"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    rendered="#{Funcionario5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Funcionario5.labelPrimerApellido1}"
                                                    id="labelPrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                <webuijsf:textField id="campoPrimerApellido1"
                                                    binding="#{Funcionario5.campoPrimerApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Funcionario5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.funcionario"
                                                    validatorExpression="#{Funcionario5.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1Texto1"
                                                    binding="#{Funcionario5.campoPrimerApellido1Texto1}"
                                                    text="#{currentRow.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Funcionario5.tableColumnSegundoApellido1}"
                                                    toolTip="BundleParametros.segundo_apellido.funcionario"
                                                    headerText="segundo apellido"
                                                    id="tableColumnSegundoApellido1" rendered="false"
                                                    sort="segundo_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoApellido1"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    rendered="#{Funcionario5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Funcionario5.labelSegundoApellido1}"
                                                    id="labelSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                <webuijsf:textField id="campoSegundoApellido1"
                                                    binding="#{Funcionario5.campoSegundoApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Funcionario5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.funcionario"
                                                    validatorExpression="#{Funcionario5.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1Texto1"
                                                    binding="#{Funcionario5.campoSegundoApellido1Texto1}"
                                                    text="#{currentRow.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Funcionario5.tableColumnApellidoCasada1}"
                                                    toolTip="BundleParametros.apellido_casada.funcionario"
                                                    headerText="apellido casada"
                                                    id="tableColumnApellidoCasada1" rendered="false"
                                                    sort="apellido_casada">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextApellidoCasada1"
                                                    text="#{currentRow.value['apellido_casada']}"
                                                    rendered="#{Funcionario5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Funcionario5.labelApellidoCasada1}"
                                                    id="labelApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                <webuijsf:textField id="campoApellidoCasada1"
                                                    binding="#{Funcionario5.campoApellidoCasada1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Funcionario5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['apellido_casada']}"
                                                    toolTip="BundleParametros.apellido_casada.funcionario"
                                                    validatorExpression="#{Funcionario5.validatorApellidoCasada1.validate}"/>
                                                <webuijsf:staticText id="campoApellidoCasada1Texto1"
                                                    binding="#{Funcionario5.campoApellidoCasada1Texto1}"
                                                    text="#{currentRow.value['apellido_casada']}"/>
                                                <webuijsf:message id="messageApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
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
                                                        binding="#{Funcionario5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{Funcionario5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{Funcionario5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{Funcionario5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{Funcionario5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{Funcionario5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{Funcionario5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Funcionario5.botonRepaginar1_action}"
                                                        binding="#{Funcionario5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{Funcionario5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{Funcionario5.gestor.scriptRepaginar}"
                                                        text="#{Funcionario5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{Funcionario5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario5.botonAgregar1_action}"
                                                    binding="#{Funcionario5.botonAgregar1}"
                                                    disabled="#{Funcionario5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Funcionario5.gestor.scriptAgregar}"
                                                    rendered="#{Funcionario5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Funcionario5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Funcionario5.listaFuncionEdicion1}"
                                                    converter="#{Funcionario5.converterListaFuncionEdicion1}"
                                                    disabled="#{Funcionario5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Funcionario5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Funcionario5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Funcionario5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Funcionario5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario5.botonEditar1_action}"
                                                    binding="#{Funcionario5.botonEditar1}"
                                                    disabled="#{Funcionario5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Funcionario5.gestor.scriptEditar}"
                                                    rendered="#{Funcionario5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Funcionario5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario5.botonEliminar1_action}"
                                                    binding="#{Funcionario5.botonEliminar1}"
                                                    disabled="#{Funcionario5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Funcionario5.gestor.scriptEliminar}"
                                                    rendered="#{Funcionario5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Funcionario5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario5.botonAplicar1_action}"
                                                    binding="#{Funcionario5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Funcionario5.gestor.scriptAplicar}"
                                                    rendered="#{Funcionario5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Funcionario5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario5.botonDeshacer1_action}"
                                                    binding="#{Funcionario5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Funcionario5.gestor.scriptDeshacer}"
                                                    rendered="#{Funcionario5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Funcionario5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario5.botonConfirmar1_action}"
                                                    binding="#{Funcionario5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Funcionario5.gestor.scriptConfirmar}"
                                                    rendered="#{Funcionario5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Funcionario5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario5.botonDescartar1_action}"
                                                    binding="#{Funcionario5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Funcionario5.gestor.scriptDescartar}"
                                                    rendered="#{Funcionario5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Funcionario5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Funcionario5.listaFuncionAccion1}"
                                                    converter="#{Funcionario5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Funcionario5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Funcionario5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Funcionario5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Funcionario5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario5.botonProcesar1_action}"
                                                    binding="#{Funcionario5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Funcionario5.gestor.scriptProcesar}"
                                                    rendered="#{Funcionario5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Funcionario5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario5.botonRefrescar1_action}"
                                                    binding="#{Funcionario5.botonRefrescar1}"
                                                    disabled="#{Funcionario5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Funcionario5.gestor.scriptRefrescar}"
                                                    rendered="#{Funcionario5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Funcionario5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario5.botonReconsultar1_action}"
                                                    binding="#{Funcionario5.botonReconsultar1}"
                                                    disabled="#{Funcionario5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Funcionario5.gestor.scriptReconsultar}"
                                                    rendered="#{Funcionario5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Funcionario5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario5.botonRetornar1_action}"
                                                    binding="#{Funcionario5.botonRetornar1}"
                                                    disabled="#{Funcionario5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Funcionario5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Funcionario5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Funcionario5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{Funcionario5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Funcionario5.imageHyperlink1_action}"
                                                    binding="#{Funcionario5.imageHyperlink1}"
                                                    disabled="#{Funcionario5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Funcionario5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Funcionario5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Funcionario5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Funcionario5_imageHyperlink1_toolTip}"/>
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
