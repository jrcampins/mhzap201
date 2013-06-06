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
                    focus="#{FichaHogar1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{FichaHogar1.gestor.preserveFocus}"
                    preserveScroll="#{FichaHogar1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{FichaHogar1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdFichaHogar1 campoCodigoFichaHogar1 campoFechaEntrevista1 campoIdFuncionarioCensista1 campoIdFuncionarioSupervisor1 campoIdFuncionarioCriticoDeco1 campoIdFuncionarioDigitador1 campoObservaciones1 campoHusoUtm1 campoFranjaUtm1 campoDistanciaEsteUtm1 campoDistanciaNorteUtm1 campoNumeroFormulario1 campoNumeroVivienda1 campoNumeroHogar1 campoIdDepartamento1 campoIdDistrito1 listaNumeroTipoArea1 campoIdBarrio1 campoManzana1 campoDireccion1 campoTotalPersonas1 campoTotalHombres1 campoTotalMujeres1 listaNumeroTipoMatParedes1 listaNumeroTipoMatPiso1 listaNumeroTipoMatTecho1 listaNumeroTipoOcupacionViv1 campoOtroTipoOcupacionViv1 campoCantidadPiezas1 campoCantidadDormitorios1 listaNumeroSionoPiezaCocina1 listaNumeroTipoCombustible1 listaNumeroTipoPiezaBano1 listaNumeroTipoServicioSan1 listaNumeroTipoServicioAgua1 listaNumeroTipoAbaAgua1 listaNumeroSionoCorrienteElec1 listaNumeroTipoDesechoBas1 listaNumeroSionoTelefonoCelular1 campoNumeroTelefonoCelular1 listaNumeroSionoTlfLineaBaja1 campoNumeroTelefonoLineaBaja1 listaNumeroSionoDispHeladera1 listaNumeroSionoDispLavarropas1 listaNumeroSionoDispTermo1 listaNumeroSionoDispAireAcon1 listaNumeroSionoDispAutomovil1 listaNumeroSionoDispCamion1 listaNumeroSionoDispMotocicleta1 campoNombreJefeHogar1 campoNumeroCedulaJefeHogar1 campoLetraCedulaJefeHogar1 campoNumeroOrdenIdenJefeHogar1 campoNombreRespondente1 campoNumeroCedulaRespondente1 campoLetraCedulaRespondente1 campoNumeroOrdenIdenRespondente1 campoIdProveedorDatExt1 campoIndiceCalidadVida1 listaEsFichaHogarInactiva1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{FichaHogar1.breadcrumbs1}" 
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
                                                    rendered="#{FichaHogar1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{FichaHogar1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{FichaHogar1.gestor.mensajeDisponible}"
                                                    text="#{FichaHogar1.gestor.mensaje}"
                                                    url="#{FichaHogar1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{FichaHogar1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{FichaHogar1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{FichaHogar1.gestor.filaEscogida}" 
                                                sourceData="#{FichaHogar1.fichaHogarDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{FichaHogar1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{FichaHogar1.gestor.scriptElegir}" 
                                                        selected="#{FichaHogar1.gestor.filaElegida}" 
                                                        toolTip="#{FichaHogar1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{FichaHogar1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{FichaHogar1.botonEscogerFila1_action}"
                                                        binding="#{FichaHogar1.botonEscogerFila1}"
                                                        disabled="#{FichaHogar1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{FichaHogar1.gestor.urlImagenEscoger}" 
                                                        onClick="#{FichaHogar1.gestor.scriptEscoger}"
                                                        text="#{FichaHogar1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{FichaHogar1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FichaHogar1.botonDetallarFila1_action}"
                                                        binding="#{FichaHogar1.botonDetallarFila1}"
                                                        disabled="#{FichaHogar1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{FichaHogar1.gestor.urlImagenDetallar}" 
                                                        onClick="#{FichaHogar1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{FichaHogar1.gestor.detalleDisponible}" 
                                                        text="#{FichaHogar1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{FichaHogar1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FichaHogar1.botonProcesarFila1_action}"
                                                        binding="#{FichaHogar1.botonProcesarFila1}"
                                                        disabled="#{FichaHogar1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{FichaHogar1.gestor.urlImagenProcesar}" 
                                                        onClick="#{FichaHogar1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{FichaHogar1.asistente.comandoDisponible}" 
                                                        text="#{FichaHogar1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{FichaHogar1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FichaHogar1.botonRetornarFila1_action}"
                                                        binding="#{FichaHogar1.botonRetornarFila1}" 
                                                        disabled="#{FichaHogar1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{FichaHogar1.gestor.urlImagenRetornar}"
                                                        onClick="#{FichaHogar1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{FichaHogar1.gestor.funcionReturnVisible}" 
                                                        text="#{FichaHogar1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{FichaHogar1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{FichaHogar1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{FichaHogar1.hipervinculoAccionFila1_action}"
                                                        binding="#{FichaHogar1.hipervinculoAccionFila1}"
                                                        disabled="#{FichaHogar1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{FichaHogar1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{FichaHogar1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.FichaHogar1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{FichaHogar1.tableColumn3}" 
                                                    headerText="#{FichaHogar1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{FichaHogar1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{FichaHogar1.hipervinculoDetallarFila1_action}"
                                                        binding="#{FichaHogar1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{FichaHogar1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{FichaHogar1.gestor.identificacionFila}" 
                                                        toolTip="#{FichaHogar1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnIdFichaHogar1}"
                                                    toolTip="BundleParametros.id_ficha_hogar.ficha_hogar"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdFichaHogar1" rendered="false"
                                                    sort="id_ficha_hogar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaHogar1"
                                                    text="#{currentRow.value['id_ficha_hogar']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdFichaHogar1}"
                                                    id="labelIdFichaHogar1"
                                                    for="campoIdFichaHogar1"/>
                                                <webuijsf:textField id="campoIdFichaHogar1"
                                                    binding="#{FichaHogar1.campoIdFichaHogar1}"
                                                    converter="#{FichaHogar1.converterIdFichaHogar1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_ficha_hogar']}"
                                                    toolTip="BundleParametros.id_ficha_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorIdFichaHogar1.validate}"/>
                                                <webuijsf:staticText id="campoIdFichaHogar1Texto1"
                                                    binding="#{FichaHogar1.campoIdFichaHogar1Texto1}"
                                                    text="#{currentRow.value['id_ficha_hogar']}"/>
                                                <webuijsf:message id="messageIdFichaHogar1"
                                                    for="campoIdFichaHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnCodigoFichaHogar1}"
                                                    toolTip="BundleParametros.codigo_ficha_hogar.ficha_hogar"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoFichaHogar1"
                                                    sort="codigo_ficha_hogar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoFichaHogar1"
                                                    text="#{currentRow.value['codigo_ficha_hogar']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelCodigoFichaHogar1}"
                                                    id="labelCodigoFichaHogar1"
                                                    for="campoCodigoFichaHogar1"/>
                                                <webuijsf:textField id="campoCodigoFichaHogar1"
                                                    binding="#{FichaHogar1.campoCodigoFichaHogar1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{currentRow.value['codigo_ficha_hogar']}"
                                                    toolTip="BundleParametros.codigo_ficha_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorCodigoFichaHogar1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoFichaHogar1Texto1"
                                                    binding="#{FichaHogar1.campoCodigoFichaHogar1Texto1}"
                                                    text="#{currentRow.value['codigo_ficha_hogar']}"/>
                                                <webuijsf:message id="messageCodigoFichaHogar1"
                                                    for="campoCodigoFichaHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnFechaEntrevista1}"
                                                    toolTip="BundleParametros.fecha_entrevista.ficha_hogar"
                                                    headerText="fecha entrevista"
                                                    id="tableColumnFechaEntrevista1"
                                                    sort="fecha_entrevista">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaEntrevista1"
                                                    text="#{currentRow.value['fecha_entrevista']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelFechaEntrevista1}"
                                                    id="labelFechaEntrevista1"
                                                    for="campoFechaEntrevista1"/>
                                                <webuijsf:textField id="campoFechaEntrevista1"
                                                    binding="#{FichaHogar1.campoFechaEntrevista1}"
                                                    converter="#{FichaHogar1.converterFechaEntrevista1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_entrevista']}"
                                                    toolTip="BundleParametros.fecha_entrevista.ficha_hogar"/>
                                                <webuijsf:staticText id="campoFechaEntrevista1Texto1"
                                                    binding="#{FichaHogar1.campoFechaEntrevista1Texto1}"
                                                    converter="#{FichaHogar1.converterFechaEntrevista1}"
                                                    text="#{currentRow.value['fecha_entrevista']}"/>
                                                <webuijsf:message id="messageFechaEntrevista1"
                                                    for="campoFechaEntrevista1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnIdFuncionarioCensista1}"
                                                    toolTip="BundleParametros.id_funcionario_censista.ficha_hogar"
                                                    headerText="funcionario censista"
                                                    id="tableColumnIdFuncionarioCensista1" rendered="false"
                                                    sort="codigo_funcionario_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioCensista1"
                                                    text="#{currentRow.value['codigo_funcionario_1x1y3']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdFuncionarioCensista1}"
                                                    id="labelIdFuncionarioCensista1"
                                                    for="campoIdFuncionarioCensista1"/>
                                                <webuijsf:textField id="campoIdFuncionarioCensista1"
                                                    binding="#{FichaHogar1.campoIdFuncionarioCensista1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar1.asistente.textoCampoIdFuncionarioCensista1}"
                                                    toolTip="#{FichaHogar1.asistente.toolTipCampoIdFuncionarioCensista1}"
                                                    validatorExpression="#{FichaHogar1.campoIdFuncionarioCensista1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioCensista1Texto1"
                                                    binding="#{FichaHogar1.campoIdFuncionarioCensista1Texto1}"
                                                    text="#{currentRow.value['codigo_funcionario_1x1y3']}"/>
                                                <webuijsf:message id="messageIdFuncionarioCensista1"
                                                    for="campoIdFuncionarioCensista1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFuncionarioCensista3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioCensista3"
                                                    text="#{currentRow.value['id_funcionario_censista']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar1.campoIdFuncionarioCensista1Boton1}"
                                                    id="campoIdFuncionarioCensista1Boton1"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdFuncionarioCensista1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar1.campoIdFuncionarioCensista1Boton3}"
                                                    id="campoIdFuncionarioCensista1Boton3"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdFuncionarioCensista1Boton2}"
                                                    rendered="#{FichaHogar1.asistente.campoIdFuncionarioCensista1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FichaHogar1.tableColumnIdFuncionarioCensista2}"
                                                    headerText="nombre funcionario censista"
                                                    id="tableColumnIdFuncionarioCensista2" rendered="false"
                                                    sort="nombre_funcionario_1x1y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioCensista2"
                                                    text="#{currentRow.value['nombre_funcionario_1x1y4']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdFuncionarioCensista2}"
                                                    id="labelIdFuncionarioCensista2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FichaHogar1.campoIdFuncionarioCensista1Hiper1}"
                                                    id="campoIdFuncionarioCensista1Hiper1"
                                                    text="#{currentRow.value['nombre_funcionario_1x1y4']}"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdFuncionarioCensista1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFuncionarioCensista1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnIdFuncionarioSupervisor1}"
                                                    toolTip="BundleParametros.id_funcionario_supervisor.ficha_hogar"
                                                    headerText="funcionario supervisor"
                                                    id="tableColumnIdFuncionarioSupervisor1" rendered="false"
                                                    sort="codigo_funcionario_1x2y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioSupervisor1"
                                                    text="#{currentRow.value['codigo_funcionario_1x2y3']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdFuncionarioSupervisor1}"
                                                    id="labelIdFuncionarioSupervisor1"
                                                    for="campoIdFuncionarioSupervisor1"/>
                                                <webuijsf:textField id="campoIdFuncionarioSupervisor1"
                                                    binding="#{FichaHogar1.campoIdFuncionarioSupervisor1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar1.asistente.textoCampoIdFuncionarioSupervisor1}"
                                                    toolTip="#{FichaHogar1.asistente.toolTipCampoIdFuncionarioSupervisor1}"
                                                    validatorExpression="#{FichaHogar1.campoIdFuncionarioSupervisor1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioSupervisor1Texto1"
                                                    binding="#{FichaHogar1.campoIdFuncionarioSupervisor1Texto1}"
                                                    text="#{currentRow.value['codigo_funcionario_1x2y3']}"/>
                                                <webuijsf:message id="messageIdFuncionarioSupervisor1"
                                                    for="campoIdFuncionarioSupervisor1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFuncionarioSupervisor3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioSupervisor3"
                                                    text="#{currentRow.value['id_funcionario_supervisor']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar1.campoIdFuncionarioSupervisor1Boton1}"
                                                    id="campoIdFuncionarioSupervisor1Boton1"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdFuncionarioSupervisor1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar1.campoIdFuncionarioSupervisor1Boton3}"
                                                    id="campoIdFuncionarioSupervisor1Boton3"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdFuncionarioSupervisor1Boton2}"
                                                    rendered="#{FichaHogar1.asistente.campoIdFuncionarioSupervisor1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FichaHogar1.tableColumnIdFuncionarioSupervisor2}"
                                                    headerText="nombre funcionario supervisor"
                                                    id="tableColumnIdFuncionarioSupervisor2" rendered="false"
                                                    sort="nombre_funcionario_1x2y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioSupervisor2"
                                                    text="#{currentRow.value['nombre_funcionario_1x2y4']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdFuncionarioSupervisor2}"
                                                    id="labelIdFuncionarioSupervisor2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FichaHogar1.campoIdFuncionarioSupervisor1Hiper1}"
                                                    id="campoIdFuncionarioSupervisor1Hiper1"
                                                    text="#{currentRow.value['nombre_funcionario_1x2y4']}"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdFuncionarioSupervisor1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFuncionarioSupervisor1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnIdFuncionarioCriticoDeco1}"
                                                    toolTip="BundleParametros.id_funcionario_critico_deco.ficha_hogar"
                                                    headerText="funcionario critico decodificador"
                                                    id="tableColumnIdFuncionarioCriticoDeco1" rendered="false"
                                                    sort="codigo_funcionario_1x3y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioCriticoDeco1"
                                                    text="#{currentRow.value['codigo_funcionario_1x3y3']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdFuncionarioCriticoDeco1}"
                                                    id="labelIdFuncionarioCriticoDeco1"
                                                    for="campoIdFuncionarioCriticoDeco1"/>
                                                <webuijsf:textField id="campoIdFuncionarioCriticoDeco1"
                                                    binding="#{FichaHogar1.campoIdFuncionarioCriticoDeco1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar1.asistente.textoCampoIdFuncionarioCriticoDeco1}"
                                                    toolTip="#{FichaHogar1.asistente.toolTipCampoIdFuncionarioCriticoDeco1}"
                                                    validatorExpression="#{FichaHogar1.campoIdFuncionarioCriticoDeco1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioCriticoDeco1Texto1"
                                                    binding="#{FichaHogar1.campoIdFuncionarioCriticoDeco1Texto1}"
                                                    text="#{currentRow.value['codigo_funcionario_1x3y3']}"/>
                                                <webuijsf:message id="messageIdFuncionarioCriticoDeco1"
                                                    for="campoIdFuncionarioCriticoDeco1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFuncionarioCriticoDeco3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioCriticoDeco3"
                                                    text="#{currentRow.value['id_funcionario_critico_deco']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar1.campoIdFuncionarioCriticoDeco1Boton1}"
                                                    id="campoIdFuncionarioCriticoDeco1Boton1"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdFuncionarioCriticoDeco1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar1.campoIdFuncionarioCriticoDeco1Boton3}"
                                                    id="campoIdFuncionarioCriticoDeco1Boton3"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdFuncionarioCriticoDeco1Boton2}"
                                                    rendered="#{FichaHogar1.asistente.campoIdFuncionarioCriticoDeco1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FichaHogar1.tableColumnIdFuncionarioCriticoDeco2}"
                                                    headerText="nombre funcionario critico decodificador"
                                                    id="tableColumnIdFuncionarioCriticoDeco2" rendered="false"
                                                    sort="nombre_funcionario_1x3y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioCriticoDeco2"
                                                    text="#{currentRow.value['nombre_funcionario_1x3y4']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdFuncionarioCriticoDeco2}"
                                                    id="labelIdFuncionarioCriticoDeco2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FichaHogar1.campoIdFuncionarioCriticoDeco1Hiper1}"
                                                    id="campoIdFuncionarioCriticoDeco1Hiper1"
                                                    text="#{currentRow.value['nombre_funcionario_1x3y4']}"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdFuncionarioCriticoDeco1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFuncionarioCriticoDeco1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnIdFuncionarioDigitador1}"
                                                    toolTip="BundleParametros.id_funcionario_digitador.ficha_hogar"
                                                    headerText="funcionario digitador"
                                                    id="tableColumnIdFuncionarioDigitador1" rendered="false"
                                                    sort="codigo_funcionario_1x4y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioDigitador1"
                                                    text="#{currentRow.value['codigo_funcionario_1x4y3']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdFuncionarioDigitador1}"
                                                    id="labelIdFuncionarioDigitador1"
                                                    for="campoIdFuncionarioDigitador1"/>
                                                <webuijsf:textField id="campoIdFuncionarioDigitador1"
                                                    binding="#{FichaHogar1.campoIdFuncionarioDigitador1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar1.asistente.textoCampoIdFuncionarioDigitador1}"
                                                    toolTip="#{FichaHogar1.asistente.toolTipCampoIdFuncionarioDigitador1}"
                                                    validatorExpression="#{FichaHogar1.campoIdFuncionarioDigitador1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioDigitador1Texto1"
                                                    binding="#{FichaHogar1.campoIdFuncionarioDigitador1Texto1}"
                                                    text="#{currentRow.value['codigo_funcionario_1x4y3']}"/>
                                                <webuijsf:message id="messageIdFuncionarioDigitador1"
                                                    for="campoIdFuncionarioDigitador1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFuncionarioDigitador3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioDigitador3"
                                                    text="#{currentRow.value['id_funcionario_digitador']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar1.campoIdFuncionarioDigitador1Boton1}"
                                                    id="campoIdFuncionarioDigitador1Boton1"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdFuncionarioDigitador1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar1.campoIdFuncionarioDigitador1Boton3}"
                                                    id="campoIdFuncionarioDigitador1Boton3"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdFuncionarioDigitador1Boton2}"
                                                    rendered="#{FichaHogar1.asistente.campoIdFuncionarioDigitador1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FichaHogar1.tableColumnIdFuncionarioDigitador2}"
                                                    headerText="nombre funcionario digitador"
                                                    id="tableColumnIdFuncionarioDigitador2" rendered="false"
                                                    sort="nombre_funcionario_1x4y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFuncionarioDigitador2"
                                                    text="#{currentRow.value['nombre_funcionario_1x4y4']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdFuncionarioDigitador2}"
                                                    id="labelIdFuncionarioDigitador2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FichaHogar1.campoIdFuncionarioDigitador1Hiper1}"
                                                    id="campoIdFuncionarioDigitador1Hiper1"
                                                    text="#{currentRow.value['nombre_funcionario_1x4y4']}"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdFuncionarioDigitador1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFuncionarioDigitador1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnObservaciones1}"
                                                    toolTip="BundleParametros.observaciones.ficha_hogar"
                                                    headerText="observaciones"
                                                    id="tableColumnObservaciones1" rendered="false"
                                                    sort="observaciones">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextObservaciones1"
                                                    text="#{currentRow.value['observaciones']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelObservaciones1}"
                                                    id="labelObservaciones1"
                                                    for="campoObservaciones1"/>
                                                <webuijsf:textArea id="campoObservaciones1"
                                                    binding="#{FichaHogar1.campoObservaciones1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['observaciones']}"
                                                    toolTip="BundleParametros.observaciones.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorObservaciones1.validate}"/>
                                                <webuijsf:staticText id="campoObservaciones1Texto1"
                                                    binding="#{FichaHogar1.campoObservaciones1Texto1}"
                                                    text="#{currentRow.value['observaciones']}"/>
                                                <webuijsf:message id="messageObservaciones1"
                                                    for="campoObservaciones1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnHusoUtm1}"
                                                    toolTip="BundleParametros.huso_utm.ficha_hogar"
                                                    headerText="huso utm"
                                                    id="tableColumnHusoUtm1" rendered="false"
                                                    sort="huso_utm">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextHusoUtm1"
                                                    text="#{currentRow.value['huso_utm']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelHusoUtm1}"
                                                    id="labelHusoUtm1"
                                                    for="campoHusoUtm1"/>
                                                <webuijsf:textField id="campoHusoUtm1"
                                                    binding="#{FichaHogar1.campoHusoUtm1}"
                                                    converter="#{FichaHogar1.converterHusoUtm1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['huso_utm']}"
                                                    toolTip="BundleParametros.huso_utm.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorHusoUtm1.validate}"/>
                                                <webuijsf:staticText id="campoHusoUtm1Texto1"
                                                    binding="#{FichaHogar1.campoHusoUtm1Texto1}"
                                                    text="#{currentRow.value['huso_utm']}"/>
                                                <webuijsf:message id="messageHusoUtm1"
                                                    for="campoHusoUtm1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnFranjaUtm1}"
                                                    toolTip="BundleParametros.franja_utm.ficha_hogar"
                                                    headerText="franja utm"
                                                    id="tableColumnFranjaUtm1" rendered="false"
                                                    sort="franja_utm">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFranjaUtm1"
                                                    text="#{currentRow.value['franja_utm']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelFranjaUtm1}"
                                                    id="labelFranjaUtm1"
                                                    for="campoFranjaUtm1"/>
                                                <webuijsf:textField id="campoFranjaUtm1"
                                                    binding="#{FichaHogar1.campoFranjaUtm1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['franja_utm']}"
                                                    toolTip="BundleParametros.franja_utm.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorFranjaUtm1.validate}"/>
                                                <webuijsf:staticText id="campoFranjaUtm1Texto1"
                                                    binding="#{FichaHogar1.campoFranjaUtm1Texto1}"
                                                    text="#{currentRow.value['franja_utm']}"/>
                                                <webuijsf:message id="messageFranjaUtm1"
                                                    for="campoFranjaUtm1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnDistanciaEsteUtm1}"
                                                    toolTip="BundleParametros.distancia_este_utm.ficha_hogar"
                                                    headerText="distancia este utm"
                                                    id="tableColumnDistanciaEsteUtm1" rendered="false"
                                                    sort="distancia_este_utm">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDistanciaEsteUtm1"
                                                    text="#{currentRow.value['distancia_este_utm']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelDistanciaEsteUtm1}"
                                                    id="labelDistanciaEsteUtm1"
                                                    for="campoDistanciaEsteUtm1"/>
                                                <webuijsf:textField id="campoDistanciaEsteUtm1"
                                                    binding="#{FichaHogar1.campoDistanciaEsteUtm1}"
                                                    converter="#{FichaHogar1.converterDistanciaEsteUtm1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['distancia_este_utm']}"
                                                    toolTip="BundleParametros.distancia_este_utm.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorDistanciaEsteUtm1.validate}"/>
                                                <webuijsf:staticText id="campoDistanciaEsteUtm1Texto1"
                                                    binding="#{FichaHogar1.campoDistanciaEsteUtm1Texto1}"
                                                    text="#{currentRow.value['distancia_este_utm']}"/>
                                                <webuijsf:message id="messageDistanciaEsteUtm1"
                                                    for="campoDistanciaEsteUtm1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnDistanciaNorteUtm1}"
                                                    toolTip="BundleParametros.distancia_norte_utm.ficha_hogar"
                                                    headerText="distancia norte utm"
                                                    id="tableColumnDistanciaNorteUtm1" rendered="false"
                                                    sort="distancia_norte_utm">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDistanciaNorteUtm1"
                                                    text="#{currentRow.value['distancia_norte_utm']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelDistanciaNorteUtm1}"
                                                    id="labelDistanciaNorteUtm1"
                                                    for="campoDistanciaNorteUtm1"/>
                                                <webuijsf:textField id="campoDistanciaNorteUtm1"
                                                    binding="#{FichaHogar1.campoDistanciaNorteUtm1}"
                                                    converter="#{FichaHogar1.converterDistanciaNorteUtm1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['distancia_norte_utm']}"
                                                    toolTip="BundleParametros.distancia_norte_utm.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorDistanciaNorteUtm1.validate}"/>
                                                <webuijsf:staticText id="campoDistanciaNorteUtm1Texto1"
                                                    binding="#{FichaHogar1.campoDistanciaNorteUtm1Texto1}"
                                                    text="#{currentRow.value['distancia_norte_utm']}"/>
                                                <webuijsf:message id="messageDistanciaNorteUtm1"
                                                    for="campoDistanciaNorteUtm1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroFormulario1}"
                                                    toolTip="BundleParametros.numero_formulario.ficha_hogar"
                                                    headerText="n&#250;mero formulario"
                                                    id="tableColumnNumeroFormulario1"
                                                    sort="numero_formulario">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroFormulario1"
                                                    text="#{currentRow.value['numero_formulario']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroFormulario1}"
                                                    id="labelNumeroFormulario1"
                                                    for="campoNumeroFormulario1"/>
                                                <webuijsf:textField id="campoNumeroFormulario1"
                                                    binding="#{FichaHogar1.campoNumeroFormulario1}"
                                                    converter="#{FichaHogar1.converterNumeroFormulario1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['numero_formulario']}"
                                                    toolTip="BundleParametros.numero_formulario.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorNumeroFormulario1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroFormulario1Texto1"
                                                    binding="#{FichaHogar1.campoNumeroFormulario1Texto1}"
                                                    text="#{currentRow.value['numero_formulario']}"/>
                                                <webuijsf:message id="messageNumeroFormulario1"
                                                    for="campoNumeroFormulario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroVivienda1}"
                                                    toolTip="BundleParametros.numero_vivienda.ficha_hogar"
                                                    headerText="n&#250;mero vivienda"
                                                    id="tableColumnNumeroVivienda1"
                                                    sort="numero_vivienda">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroVivienda1"
                                                    text="#{currentRow.value['numero_vivienda']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroVivienda1}"
                                                    id="labelNumeroVivienda1"
                                                    for="campoNumeroVivienda1"/>
                                                <webuijsf:textField id="campoNumeroVivienda1"
                                                    binding="#{FichaHogar1.campoNumeroVivienda1}"
                                                    converter="#{FichaHogar1.converterNumeroVivienda1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['numero_vivienda']}"
                                                    toolTip="BundleParametros.numero_vivienda.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorNumeroVivienda1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroVivienda1Texto1"
                                                    binding="#{FichaHogar1.campoNumeroVivienda1Texto1}"
                                                    text="#{currentRow.value['numero_vivienda']}"/>
                                                <webuijsf:message id="messageNumeroVivienda1"
                                                    for="campoNumeroVivienda1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroHogar1}"
                                                    toolTip="BundleParametros.numero_hogar.ficha_hogar"
                                                    headerText="n&#250;mero hogar"
                                                    id="tableColumnNumeroHogar1"
                                                    sort="numero_hogar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroHogar1"
                                                    text="#{currentRow.value['numero_hogar']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroHogar1}"
                                                    id="labelNumeroHogar1"
                                                    for="campoNumeroHogar1"/>
                                                <webuijsf:textField id="campoNumeroHogar1"
                                                    binding="#{FichaHogar1.campoNumeroHogar1}"
                                                    converter="#{FichaHogar1.converterNumeroHogar1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['numero_hogar']}"
                                                    toolTip="BundleParametros.numero_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorNumeroHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroHogar1Texto1"
                                                    binding="#{FichaHogar1.campoNumeroHogar1Texto1}"
                                                    text="#{currentRow.value['numero_hogar']}"/>
                                                <webuijsf:message id="messageNumeroHogar1"
                                                    for="campoNumeroHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnIdDepartamento1}"
                                                    toolTip="BundleParametros.id_departamento.ficha_hogar"
                                                    headerText="departamento"
                                                    id="tableColumnIdDepartamento1" rendered="false"
                                                    sort="codigo_ubicacion_1x5y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamento1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x5y3']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdDepartamento1}"
                                                    id="labelIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                <webuijsf:textField id="campoIdDepartamento1"
                                                    binding="#{FichaHogar1.campoIdDepartamento1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar1.asistente.textoCampoIdDepartamento1}"
                                                    toolTip="#{FichaHogar1.asistente.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{FichaHogar1.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1Texto1"
                                                    binding="#{FichaHogar1.campoIdDepartamento1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x5y3']}"/>
                                                <webuijsf:message id="messageIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdDepartamento3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamento3"
                                                    text="#{currentRow.value['id_departamento']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar1.campoIdDepartamento1Boton1}"
                                                    id="campoIdDepartamento1Boton1"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar1.campoIdDepartamento1Boton3}"
                                                    id="campoIdDepartamento1Boton3"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{FichaHogar1.asistente.campoIdDepartamento1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FichaHogar1.tableColumnIdDepartamento2}"
                                                    headerText="nombre departamento"
                                                    id="tableColumnIdDepartamento2" rendered="false"
                                                    sort="nombre_ubicacion_1x5y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamento2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x5y4']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdDepartamento2}"
                                                    id="labelIdDepartamento2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FichaHogar1.campoIdDepartamento1Hiper1}"
                                                    id="campoIdDepartamento1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x5y4']}"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdDepartamento1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDepartamento1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnIdDistrito1}"
                                                    toolTip="BundleParametros.id_distrito.ficha_hogar"
                                                    headerText="distrito"
                                                    id="tableColumnIdDistrito1" rendered="false"
                                                    sort="codigo_ubicacion_1x6y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistrito1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x6y3']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdDistrito1}"
                                                    id="labelIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                <webuijsf:textField id="campoIdDistrito1"
                                                    binding="#{FichaHogar1.campoIdDistrito1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar1.asistente.textoCampoIdDistrito1}"
                                                    toolTip="#{FichaHogar1.asistente.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{FichaHogar1.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1Texto1"
                                                    binding="#{FichaHogar1.campoIdDistrito1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x6y3']}"/>
                                                <webuijsf:message id="messageIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdDistrito3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistrito3"
                                                    text="#{currentRow.value['id_distrito']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar1.campoIdDistrito1Boton1}"
                                                    id="campoIdDistrito1Boton1"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar1.campoIdDistrito1Boton3}"
                                                    id="campoIdDistrito1Boton3"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{FichaHogar1.asistente.campoIdDistrito1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FichaHogar1.tableColumnIdDistrito2}"
                                                    headerText="nombre distrito"
                                                    id="tableColumnIdDistrito2" rendered="false"
                                                    sort="nombre_ubicacion_1x6y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistrito2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x6y4']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdDistrito2}"
                                                    id="labelIdDistrito2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FichaHogar1.campoIdDistrito1Hiper1}"
                                                    id="campoIdDistrito1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x6y4']}"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdDistrito1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDistrito1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroTipoArea1}"
                                                    toolTip="BundleParametros.numero_tipo_area.ficha_hogar"
                                                    headerText="tipo area"
                                                    id="tableColumnNumeroTipoArea1" rendered="false"
                                                    sort="codigo_tipo_area_1x7y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoArea1"
                                                    text="#{currentRow.value['codigo_tipo_area_1x7y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroTipoArea1}"
                                                    id="labelNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoArea1"
                                                    binding="#{FichaHogar1.listaNumeroTipoArea1}"
                                                    converter="#{FichaHogar1.converterNumeroTipoArea1}"
                                                    disabled="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroTipoArea1}"
                                                    selected="#{currentRow.value['numero_tipo_area']}"
                                                    toolTip="BundleParametros.numero_tipo_area.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoArea1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroTipoArea1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_area_1x7y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnIdBarrio1}"
                                                    toolTip="BundleParametros.id_barrio.ficha_hogar"
                                                    headerText="barrio"
                                                    id="tableColumnIdBarrio1" rendered="false"
                                                    sort="codigo_ubicacion_1x8y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdBarrio1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x8y3']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdBarrio1}"
                                                    id="labelIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                <webuijsf:textField id="campoIdBarrio1"
                                                    binding="#{FichaHogar1.campoIdBarrio1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar1.asistente.textoCampoIdBarrio1}"
                                                    toolTip="#{FichaHogar1.asistente.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{FichaHogar1.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1Texto1"
                                                    binding="#{FichaHogar1.campoIdBarrio1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x8y3']}"/>
                                                <webuijsf:message id="messageIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdBarrio3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdBarrio3"
                                                    text="#{currentRow.value['id_barrio']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar1.campoIdBarrio1Boton1}"
                                                    id="campoIdBarrio1Boton1"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar1.campoIdBarrio1Boton3}"
                                                    id="campoIdBarrio1Boton3"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{FichaHogar1.asistente.campoIdBarrio1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FichaHogar1.tableColumnIdBarrio2}"
                                                    headerText="nombre barrio"
                                                    id="tableColumnIdBarrio2" rendered="false"
                                                    sort="nombre_ubicacion_1x8y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdBarrio2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x8y4']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdBarrio2}"
                                                    id="labelIdBarrio2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FichaHogar1.campoIdBarrio1Hiper1}"
                                                    id="campoIdBarrio1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x8y4']}"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdBarrio1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdBarrio1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnManzana1}"
                                                    toolTip="BundleParametros.manzana.ficha_hogar"
                                                    headerText="manzana"
                                                    id="tableColumnManzana1" rendered="false"
                                                    sort="manzana">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextManzana1"
                                                    text="#{currentRow.value['manzana']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelManzana1}"
                                                    id="labelManzana1"
                                                    for="campoManzana1"/>
                                                <webuijsf:textField id="campoManzana1"
                                                    binding="#{FichaHogar1.campoManzana1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['manzana']}"
                                                    toolTip="BundleParametros.manzana.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorManzana1.validate}"/>
                                                <webuijsf:staticText id="campoManzana1Texto1"
                                                    binding="#{FichaHogar1.campoManzana1Texto1}"
                                                    text="#{currentRow.value['manzana']}"/>
                                                <webuijsf:message id="messageManzana1"
                                                    for="campoManzana1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnDireccion1}"
                                                    toolTip="BundleParametros.direccion.ficha_hogar"
                                                    headerText="direcci&#243;n"
                                                    id="tableColumnDireccion1" rendered="false"
                                                    sort="direccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDireccion1"
                                                    text="#{currentRow.value['direccion']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelDireccion1}"
                                                    id="labelDireccion1"
                                                    for="campoDireccion1"/>
                                                <webuijsf:textArea id="campoDireccion1"
                                                    binding="#{FichaHogar1.campoDireccion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['direccion']}"
                                                    toolTip="BundleParametros.direccion.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoDireccion1Texto1"
                                                    binding="#{FichaHogar1.campoDireccion1Texto1}"
                                                    text="#{currentRow.value['direccion']}"/>
                                                <webuijsf:message id="messageDireccion1"
                                                    for="campoDireccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnTotalPersonas1}"
                                                    toolTip="BundleParametros.total_personas.ficha_hogar"
                                                    headerText="total personas"
                                                    id="tableColumnTotalPersonas1" rendered="false"
                                                    sort="total_personas">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextTotalPersonas1"
                                                    text="#{currentRow.value['total_personas']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelTotalPersonas1}"
                                                    id="labelTotalPersonas1"
                                                    for="campoTotalPersonas1"/>
                                                <webuijsf:textField id="campoTotalPersonas1"
                                                    binding="#{FichaHogar1.campoTotalPersonas1}"
                                                    converter="#{FichaHogar1.converterTotalPersonas1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['total_personas']}"
                                                    toolTip="BundleParametros.total_personas.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorTotalPersonas1.validate}"/>
                                                <webuijsf:staticText id="campoTotalPersonas1Texto1"
                                                    binding="#{FichaHogar1.campoTotalPersonas1Texto1}"
                                                    text="#{currentRow.value['total_personas']}"/>
                                                <webuijsf:message id="messageTotalPersonas1"
                                                    for="campoTotalPersonas1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnTotalHombres1}"
                                                    toolTip="BundleParametros.total_hombres.ficha_hogar"
                                                    headerText="total hombres"
                                                    id="tableColumnTotalHombres1" rendered="false"
                                                    sort="total_hombres">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextTotalHombres1"
                                                    text="#{currentRow.value['total_hombres']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelTotalHombres1}"
                                                    id="labelTotalHombres1"
                                                    for="campoTotalHombres1"/>
                                                <webuijsf:textField id="campoTotalHombres1"
                                                    binding="#{FichaHogar1.campoTotalHombres1}"
                                                    converter="#{FichaHogar1.converterTotalHombres1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['total_hombres']}"
                                                    toolTip="BundleParametros.total_hombres.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorTotalHombres1.validate}"/>
                                                <webuijsf:staticText id="campoTotalHombres1Texto1"
                                                    binding="#{FichaHogar1.campoTotalHombres1Texto1}"
                                                    text="#{currentRow.value['total_hombres']}"/>
                                                <webuijsf:message id="messageTotalHombres1"
                                                    for="campoTotalHombres1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnTotalMujeres1}"
                                                    toolTip="BundleParametros.total_mujeres.ficha_hogar"
                                                    headerText="total mujeres"
                                                    id="tableColumnTotalMujeres1" rendered="false"
                                                    sort="total_mujeres">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextTotalMujeres1"
                                                    text="#{currentRow.value['total_mujeres']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelTotalMujeres1}"
                                                    id="labelTotalMujeres1"
                                                    for="campoTotalMujeres1"/>
                                                <webuijsf:textField id="campoTotalMujeres1"
                                                    binding="#{FichaHogar1.campoTotalMujeres1}"
                                                    converter="#{FichaHogar1.converterTotalMujeres1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['total_mujeres']}"
                                                    toolTip="BundleParametros.total_mujeres.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorTotalMujeres1.validate}"/>
                                                <webuijsf:staticText id="campoTotalMujeres1Texto1"
                                                    binding="#{FichaHogar1.campoTotalMujeres1Texto1}"
                                                    text="#{currentRow.value['total_mujeres']}"/>
                                                <webuijsf:message id="messageTotalMujeres1"
                                                    for="campoTotalMujeres1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroTipoMatParedes1}"
                                                    toolTip="BundleParametros.numero_tipo_mat_paredes.ficha_hogar"
                                                    headerText="tipo material paredes"
                                                    id="tableColumnNumeroTipoMatParedes1" rendered="false"
                                                    sort="codigo_tipo_mat_paredes_1x10y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoMatParedes1"
                                                    text="#{currentRow.value['codigo_tipo_mat_paredes_1x10y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroTipoMatParedes1}"
                                                    id="labelNumeroTipoMatParedes1"
                                                    for="listaNumeroTipoMatParedes1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoMatParedes1"
                                                    binding="#{FichaHogar1.listaNumeroTipoMatParedes1}"
                                                    converter="#{FichaHogar1.converterNumeroTipoMatParedes1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroTipoMatParedes1}"
                                                    selected="#{currentRow.value['numero_tipo_mat_paredes']}"
                                                    toolTip="BundleParametros.numero_tipo_mat_paredes.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoMatParedes1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroTipoMatParedes1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_mat_paredes_1x10y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoMatParedes1"
                                                    for="listaNumeroTipoMatParedes1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroTipoMatPiso1}"
                                                    toolTip="BundleParametros.numero_tipo_mat_piso.ficha_hogar"
                                                    headerText="tipo material piso"
                                                    id="tableColumnNumeroTipoMatPiso1" rendered="false"
                                                    sort="codigo_tipo_mat_piso_1x11y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoMatPiso1"
                                                    text="#{currentRow.value['codigo_tipo_mat_piso_1x11y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroTipoMatPiso1}"
                                                    id="labelNumeroTipoMatPiso1"
                                                    for="listaNumeroTipoMatPiso1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoMatPiso1"
                                                    binding="#{FichaHogar1.listaNumeroTipoMatPiso1}"
                                                    converter="#{FichaHogar1.converterNumeroTipoMatPiso1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroTipoMatPiso1}"
                                                    selected="#{currentRow.value['numero_tipo_mat_piso']}"
                                                    toolTip="BundleParametros.numero_tipo_mat_piso.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoMatPiso1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroTipoMatPiso1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_mat_piso_1x11y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoMatPiso1"
                                                    for="listaNumeroTipoMatPiso1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroTipoMatTecho1}"
                                                    toolTip="BundleParametros.numero_tipo_mat_techo.ficha_hogar"
                                                    headerText="tipo material techo"
                                                    id="tableColumnNumeroTipoMatTecho1" rendered="false"
                                                    sort="codigo_tipo_mat_techo_1x12y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoMatTecho1"
                                                    text="#{currentRow.value['codigo_tipo_mat_techo_1x12y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroTipoMatTecho1}"
                                                    id="labelNumeroTipoMatTecho1"
                                                    for="listaNumeroTipoMatTecho1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoMatTecho1"
                                                    binding="#{FichaHogar1.listaNumeroTipoMatTecho1}"
                                                    converter="#{FichaHogar1.converterNumeroTipoMatTecho1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroTipoMatTecho1}"
                                                    selected="#{currentRow.value['numero_tipo_mat_techo']}"
                                                    toolTip="BundleParametros.numero_tipo_mat_techo.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoMatTecho1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroTipoMatTecho1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_mat_techo_1x12y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoMatTecho1"
                                                    for="listaNumeroTipoMatTecho1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroTipoOcupacionViv1}"
                                                    toolTip="BundleParametros.numero_tipo_ocupacion_viv.ficha_hogar"
                                                    headerText="tipo ocupaci&#243;n vivienda"
                                                    id="tableColumnNumeroTipoOcupacionViv1" rendered="false"
                                                    sort="codigo_tipo_ocupacion_v_1x13y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoOcupacionViv1"
                                                    text="#{currentRow.value['codigo_tipo_ocupacion_v_1x13y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroTipoOcupacionViv1}"
                                                    id="labelNumeroTipoOcupacionViv1"
                                                    for="listaNumeroTipoOcupacionViv1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoOcupacionViv1"
                                                    binding="#{FichaHogar1.listaNumeroTipoOcupacionViv1}"
                                                    converter="#{FichaHogar1.converterNumeroTipoOcupacionViv1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroTipoOcupacionViv1}"
                                                    selected="#{currentRow.value['numero_tipo_ocupacion_viv']}"
                                                    toolTip="BundleParametros.numero_tipo_ocupacion_viv.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoOcupacionViv1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroTipoOcupacionViv1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_ocupacion_v_1x13y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoOcupacionViv1"
                                                    for="listaNumeroTipoOcupacionViv1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnOtroTipoOcupacionViv1}"
                                                    toolTip="BundleParametros.otro_tipo_ocupacion_viv.ficha_hogar"
                                                    headerText="otro tipo ocupaci&#243;n vivienda"
                                                    id="tableColumnOtroTipoOcupacionViv1" rendered="false"
                                                    sort="otro_tipo_ocupacion_viv">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtroTipoOcupacionViv1"
                                                    text="#{currentRow.value['otro_tipo_ocupacion_viv']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelOtroTipoOcupacionViv1}"
                                                    id="labelOtroTipoOcupacionViv1"
                                                    for="campoOtroTipoOcupacionViv1"/>
                                                <webuijsf:textField id="campoOtroTipoOcupacionViv1"
                                                    binding="#{FichaHogar1.campoOtroTipoOcupacionViv1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otro_tipo_ocupacion_viv']}"
                                                    toolTip="BundleParametros.otro_tipo_ocupacion_viv.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorOtroTipoOcupacionViv1.validate}"/>
                                                <webuijsf:staticText id="campoOtroTipoOcupacionViv1Texto1"
                                                    binding="#{FichaHogar1.campoOtroTipoOcupacionViv1Texto1}"
                                                    text="#{currentRow.value['otro_tipo_ocupacion_viv']}"/>
                                                <webuijsf:message id="messageOtroTipoOcupacionViv1"
                                                    for="campoOtroTipoOcupacionViv1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnCantidadPiezas1}"
                                                    toolTip="BundleParametros.cantidad_piezas.ficha_hogar"
                                                    headerText="cantidad piezas"
                                                    id="tableColumnCantidadPiezas1" rendered="false"
                                                    sort="cantidad_piezas">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCantidadPiezas1"
                                                    text="#{currentRow.value['cantidad_piezas']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelCantidadPiezas1}"
                                                    id="labelCantidadPiezas1"
                                                    for="campoCantidadPiezas1"/>
                                                <webuijsf:textField id="campoCantidadPiezas1"
                                                    binding="#{FichaHogar1.campoCantidadPiezas1}"
                                                    converter="#{FichaHogar1.converterCantidadPiezas1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['cantidad_piezas']}"
                                                    toolTip="BundleParametros.cantidad_piezas.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorCantidadPiezas1.validate}"/>
                                                <webuijsf:staticText id="campoCantidadPiezas1Texto1"
                                                    binding="#{FichaHogar1.campoCantidadPiezas1Texto1}"
                                                    text="#{currentRow.value['cantidad_piezas']}"/>
                                                <webuijsf:message id="messageCantidadPiezas1"
                                                    for="campoCantidadPiezas1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnCantidadDormitorios1}"
                                                    toolTip="BundleParametros.cantidad_dormitorios.ficha_hogar"
                                                    headerText="cantidad dormitorios"
                                                    id="tableColumnCantidadDormitorios1" rendered="false"
                                                    sort="cantidad_dormitorios">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCantidadDormitorios1"
                                                    text="#{currentRow.value['cantidad_dormitorios']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelCantidadDormitorios1}"
                                                    id="labelCantidadDormitorios1"
                                                    for="campoCantidadDormitorios1"/>
                                                <webuijsf:textField id="campoCantidadDormitorios1"
                                                    binding="#{FichaHogar1.campoCantidadDormitorios1}"
                                                    converter="#{FichaHogar1.converterCantidadDormitorios1}"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['cantidad_dormitorios']}"
                                                    toolTip="BundleParametros.cantidad_dormitorios.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorCantidadDormitorios1.validate}"/>
                                                <webuijsf:staticText id="campoCantidadDormitorios1Texto1"
                                                    binding="#{FichaHogar1.campoCantidadDormitorios1Texto1}"
                                                    text="#{currentRow.value['cantidad_dormitorios']}"/>
                                                <webuijsf:message id="messageCantidadDormitorios1"
                                                    for="campoCantidadDormitorios1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroSionoPiezaCocina1}"
                                                    toolTip="BundleParametros.numero_siono_pieza_cocina.ficha_hogar"
                                                    headerText="pieza cocina"
                                                    id="tableColumnNumeroSionoPiezaCocina1" rendered="false"
                                                    sort="codigo_siono_1x14y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoPiezaCocina1"
                                                    text="#{currentRow.value['codigo_siono_1x14y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroSionoPiezaCocina1}"
                                                    id="labelNumeroSionoPiezaCocina1"
                                                    for="listaNumeroSionoPiezaCocina1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoPiezaCocina1"
                                                    binding="#{FichaHogar1.listaNumeroSionoPiezaCocina1}"
                                                    converter="#{FichaHogar1.converterNumeroSionoPiezaCocina1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroSionoPiezaCocina1}"
                                                    selected="#{currentRow.value['numero_siono_pieza_cocina']}"
                                                    toolTip="BundleParametros.numero_siono_pieza_cocina.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoPiezaCocina1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroSionoPiezaCocina1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x14y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoPiezaCocina1"
                                                    for="listaNumeroSionoPiezaCocina1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroTipoCombustible1}"
                                                    toolTip="BundleParametros.numero_tipo_combustible.ficha_hogar"
                                                    headerText="tipo combustible"
                                                    id="tableColumnNumeroTipoCombustible1" rendered="false"
                                                    sort="codigo_tipo_combustible_1x15y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoCombustible1"
                                                    text="#{currentRow.value['codigo_tipo_combustible_1x15y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroTipoCombustible1}"
                                                    id="labelNumeroTipoCombustible1"
                                                    for="listaNumeroTipoCombustible1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoCombustible1"
                                                    binding="#{FichaHogar1.listaNumeroTipoCombustible1}"
                                                    converter="#{FichaHogar1.converterNumeroTipoCombustible1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroTipoCombustible1}"
                                                    selected="#{currentRow.value['numero_tipo_combustible']}"
                                                    toolTip="BundleParametros.numero_tipo_combustible.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoCombustible1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroTipoCombustible1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_combustible_1x15y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoCombustible1"
                                                    for="listaNumeroTipoCombustible1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroTipoPiezaBano1}"
                                                    toolTip="BundleParametros.numero_tipo_pieza_bano.ficha_hogar"
                                                    headerText="tipo pieza ba&#241;o"
                                                    id="tableColumnNumeroTipoPiezaBano1" rendered="false"
                                                    sort="codigo_tipo_pieza_bano_1x16y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoPiezaBano1"
                                                    text="#{currentRow.value['codigo_tipo_pieza_bano_1x16y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroTipoPiezaBano1}"
                                                    id="labelNumeroTipoPiezaBano1"
                                                    for="listaNumeroTipoPiezaBano1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoPiezaBano1"
                                                    binding="#{FichaHogar1.listaNumeroTipoPiezaBano1}"
                                                    converter="#{FichaHogar1.converterNumeroTipoPiezaBano1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroTipoPiezaBano1}"
                                                    selected="#{currentRow.value['numero_tipo_pieza_bano']}"
                                                    toolTip="BundleParametros.numero_tipo_pieza_bano.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoPiezaBano1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroTipoPiezaBano1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_pieza_bano_1x16y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoPiezaBano1"
                                                    for="listaNumeroTipoPiezaBano1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroTipoServicioSan1}"
                                                    toolTip="BundleParametros.numero_tipo_servicio_san.ficha_hogar"
                                                    headerText="tipo servicio sanitario"
                                                    id="tableColumnNumeroTipoServicioSan1" rendered="false"
                                                    sort="codigo_tipo_servicio_sa_1x17y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoServicioSan1"
                                                    text="#{currentRow.value['codigo_tipo_servicio_sa_1x17y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroTipoServicioSan1}"
                                                    id="labelNumeroTipoServicioSan1"
                                                    for="listaNumeroTipoServicioSan1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoServicioSan1"
                                                    binding="#{FichaHogar1.listaNumeroTipoServicioSan1}"
                                                    converter="#{FichaHogar1.converterNumeroTipoServicioSan1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroTipoServicioSan1}"
                                                    selected="#{currentRow.value['numero_tipo_servicio_san']}"
                                                    toolTip="BundleParametros.numero_tipo_servicio_san.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoServicioSan1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroTipoServicioSan1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_servicio_sa_1x17y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoServicioSan1"
                                                    for="listaNumeroTipoServicioSan1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroTipoServicioAgua1}"
                                                    toolTip="BundleParametros.numero_tipo_servicio_agua.ficha_hogar"
                                                    headerText="tipo servicio agua"
                                                    id="tableColumnNumeroTipoServicioAgua1" rendered="false"
                                                    sort="codigo_tipo_servicio_ag_1x18y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoServicioAgua1"
                                                    text="#{currentRow.value['codigo_tipo_servicio_ag_1x18y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroTipoServicioAgua1}"
                                                    id="labelNumeroTipoServicioAgua1"
                                                    for="listaNumeroTipoServicioAgua1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoServicioAgua1"
                                                    binding="#{FichaHogar1.listaNumeroTipoServicioAgua1}"
                                                    converter="#{FichaHogar1.converterNumeroTipoServicioAgua1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroTipoServicioAgua1}"
                                                    selected="#{currentRow.value['numero_tipo_servicio_agua']}"
                                                    toolTip="BundleParametros.numero_tipo_servicio_agua.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoServicioAgua1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroTipoServicioAgua1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_servicio_ag_1x18y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoServicioAgua1"
                                                    for="listaNumeroTipoServicioAgua1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroTipoAbaAgua1}"
                                                    toolTip="BundleParametros.numero_tipo_aba_agua.ficha_hogar"
                                                    headerText="tipo abastecimiento agua"
                                                    id="tableColumnNumeroTipoAbaAgua1" rendered="false"
                                                    sort="codigo_tipo_aba_agua_1x19y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoAbaAgua1"
                                                    text="#{currentRow.value['codigo_tipo_aba_agua_1x19y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroTipoAbaAgua1}"
                                                    id="labelNumeroTipoAbaAgua1"
                                                    for="listaNumeroTipoAbaAgua1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoAbaAgua1"
                                                    binding="#{FichaHogar1.listaNumeroTipoAbaAgua1}"
                                                    converter="#{FichaHogar1.converterNumeroTipoAbaAgua1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroTipoAbaAgua1}"
                                                    selected="#{currentRow.value['numero_tipo_aba_agua']}"
                                                    toolTip="BundleParametros.numero_tipo_aba_agua.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoAbaAgua1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroTipoAbaAgua1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_aba_agua_1x19y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoAbaAgua1"
                                                    for="listaNumeroTipoAbaAgua1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroSionoCorrienteElec1}"
                                                    toolTip="BundleParametros.numero_siono_corriente_elec.ficha_hogar"
                                                    headerText="corriente el&#233;ctrica"
                                                    id="tableColumnNumeroSionoCorrienteElec1" rendered="false"
                                                    sort="codigo_siono_1x20y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoCorrienteElec1"
                                                    text="#{currentRow.value['codigo_siono_1x20y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroSionoCorrienteElec1}"
                                                    id="labelNumeroSionoCorrienteElec1"
                                                    for="listaNumeroSionoCorrienteElec1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoCorrienteElec1"
                                                    binding="#{FichaHogar1.listaNumeroSionoCorrienteElec1}"
                                                    converter="#{FichaHogar1.converterNumeroSionoCorrienteElec1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroSionoCorrienteElec1}"
                                                    selected="#{currentRow.value['numero_siono_corriente_elec']}"
                                                    toolTip="BundleParametros.numero_siono_corriente_elec.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoCorrienteElec1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroSionoCorrienteElec1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x20y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoCorrienteElec1"
                                                    for="listaNumeroSionoCorrienteElec1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroTipoDesechoBas1}"
                                                    toolTip="BundleParametros.numero_tipo_desecho_bas.ficha_hogar"
                                                    headerText="tipo desecho basura"
                                                    id="tableColumnNumeroTipoDesechoBas1" rendered="false"
                                                    sort="codigo_tipo_desecho_bas_1x21y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoDesechoBas1"
                                                    text="#{currentRow.value['codigo_tipo_desecho_bas_1x21y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroTipoDesechoBas1}"
                                                    id="labelNumeroTipoDesechoBas1"
                                                    for="listaNumeroTipoDesechoBas1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoDesechoBas1"
                                                    binding="#{FichaHogar1.listaNumeroTipoDesechoBas1}"
                                                    converter="#{FichaHogar1.converterNumeroTipoDesechoBas1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroTipoDesechoBas1}"
                                                    selected="#{currentRow.value['numero_tipo_desecho_bas']}"
                                                    toolTip="BundleParametros.numero_tipo_desecho_bas.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoDesechoBas1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroTipoDesechoBas1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_desecho_bas_1x21y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoDesechoBas1"
                                                    for="listaNumeroTipoDesechoBas1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroSionoTelefonoCelular1}"
                                                    toolTip="BundleParametros.numero_siono_telefono_celular.ficha_hogar"
                                                    headerText="tel&#233;fono celular"
                                                    id="tableColumnNumeroSionoTelefonoCelular1" rendered="false"
                                                    sort="codigo_siono_1x22y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoTelefonoCelular1"
                                                    text="#{currentRow.value['codigo_siono_1x22y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroSionoTelefonoCelular1}"
                                                    id="labelNumeroSionoTelefonoCelular1"
                                                    for="listaNumeroSionoTelefonoCelular1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoTelefonoCelular1"
                                                    binding="#{FichaHogar1.listaNumeroSionoTelefonoCelular1}"
                                                    converter="#{FichaHogar1.converterNumeroSionoTelefonoCelular1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroSionoTelefonoCelular1}"
                                                    selected="#{currentRow.value['numero_siono_telefono_celular']}"
                                                    toolTip="BundleParametros.numero_siono_telefono_celular.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoTelefonoCelular1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroSionoTelefonoCelular1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x22y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoTelefonoCelular1"
                                                    for="listaNumeroSionoTelefonoCelular1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroTelefonoCelular1}"
                                                    toolTip="BundleParametros.numero_telefono_celular.ficha_hogar"
                                                    headerText="n&#250;mero tel&#233;fono celular"
                                                    id="tableColumnNumeroTelefonoCelular1" rendered="false"
                                                    sort="numero_telefono_celular">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTelefonoCelular1"
                                                    text="#{currentRow.value['numero_telefono_celular']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroTelefonoCelular1}"
                                                    id="labelNumeroTelefonoCelular1"
                                                    for="campoNumeroTelefonoCelular1"/>
                                                <webuijsf:textField id="campoNumeroTelefonoCelular1"
                                                    binding="#{FichaHogar1.campoNumeroTelefonoCelular1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['numero_telefono_celular']}"
                                                    toolTip="BundleParametros.numero_telefono_celular.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorNumeroTelefonoCelular1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoCelular1Texto1"
                                                    binding="#{FichaHogar1.campoNumeroTelefonoCelular1Texto1}"
                                                    text="#{currentRow.value['numero_telefono_celular']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoCelular1"
                                                    for="campoNumeroTelefonoCelular1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroSionoTlfLineaBaja1}"
                                                    toolTip="BundleParametros.numero_siono_tlf_linea_baja.ficha_hogar"
                                                    headerText="tel&#233;fono linea baja"
                                                    id="tableColumnNumeroSionoTlfLineaBaja1" rendered="false"
                                                    sort="codigo_siono_1x23y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoTlfLineaBaja1"
                                                    text="#{currentRow.value['codigo_siono_1x23y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroSionoTlfLineaBaja1}"
                                                    id="labelNumeroSionoTlfLineaBaja1"
                                                    for="listaNumeroSionoTlfLineaBaja1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoTlfLineaBaja1"
                                                    binding="#{FichaHogar1.listaNumeroSionoTlfLineaBaja1}"
                                                    converter="#{FichaHogar1.converterNumeroSionoTlfLineaBaja1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroSionoTlfLineaBaja1}"
                                                    selected="#{currentRow.value['numero_siono_tlf_linea_baja']}"
                                                    toolTip="BundleParametros.numero_siono_tlf_linea_baja.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoTlfLineaBaja1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroSionoTlfLineaBaja1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x23y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoTlfLineaBaja1"
                                                    for="listaNumeroSionoTlfLineaBaja1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroTelefonoLineaBaja1}"
                                                    toolTip="BundleParametros.numero_telefono_linea_baja.ficha_hogar"
                                                    headerText="n&#250;mero tel&#233;fono linea baja"
                                                    id="tableColumnNumeroTelefonoLineaBaja1" rendered="false"
                                                    sort="numero_telefono_linea_baja">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTelefonoLineaBaja1"
                                                    text="#{currentRow.value['numero_telefono_linea_baja']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroTelefonoLineaBaja1}"
                                                    id="labelNumeroTelefonoLineaBaja1"
                                                    for="campoNumeroTelefonoLineaBaja1"/>
                                                <webuijsf:textField id="campoNumeroTelefonoLineaBaja1"
                                                    binding="#{FichaHogar1.campoNumeroTelefonoLineaBaja1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{FichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['numero_telefono_linea_baja']}"
                                                    toolTip="BundleParametros.numero_telefono_linea_baja.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorNumeroTelefonoLineaBaja1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoLineaBaja1Texto1"
                                                    binding="#{FichaHogar1.campoNumeroTelefonoLineaBaja1Texto1}"
                                                    text="#{currentRow.value['numero_telefono_linea_baja']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoLineaBaja1"
                                                    for="campoNumeroTelefonoLineaBaja1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroSionoDispHeladera1}"
                                                    toolTip="BundleParametros.numero_siono_disp_heladera.ficha_hogar"
                                                    headerText="disponibilidad heladera"
                                                    id="tableColumnNumeroSionoDispHeladera1" rendered="false"
                                                    sort="codigo_siono_1x24y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDispHeladera1"
                                                    text="#{currentRow.value['codigo_siono_1x24y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroSionoDispHeladera1}"
                                                    id="labelNumeroSionoDispHeladera1"
                                                    for="listaNumeroSionoDispHeladera1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDispHeladera1"
                                                    binding="#{FichaHogar1.listaNumeroSionoDispHeladera1}"
                                                    converter="#{FichaHogar1.converterNumeroSionoDispHeladera1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroSionoDispHeladera1}"
                                                    selected="#{currentRow.value['numero_siono_disp_heladera']}"
                                                    toolTip="BundleParametros.numero_siono_disp_heladera.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispHeladera1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroSionoDispHeladera1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x24y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispHeladera1"
                                                    for="listaNumeroSionoDispHeladera1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroSionoDispLavarropas1}"
                                                    toolTip="BundleParametros.numero_siono_disp_lavarropas.ficha_hogar"
                                                    headerText="disponibilidad lavarropas"
                                                    id="tableColumnNumeroSionoDispLavarropas1" rendered="false"
                                                    sort="codigo_siono_1x25y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDispLavarropas1"
                                                    text="#{currentRow.value['codigo_siono_1x25y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroSionoDispLavarropas1}"
                                                    id="labelNumeroSionoDispLavarropas1"
                                                    for="listaNumeroSionoDispLavarropas1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDispLavarropas1"
                                                    binding="#{FichaHogar1.listaNumeroSionoDispLavarropas1}"
                                                    converter="#{FichaHogar1.converterNumeroSionoDispLavarropas1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroSionoDispLavarropas1}"
                                                    selected="#{currentRow.value['numero_siono_disp_lavarropas']}"
                                                    toolTip="BundleParametros.numero_siono_disp_lavarropas.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispLavarropas1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroSionoDispLavarropas1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x25y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispLavarropas1"
                                                    for="listaNumeroSionoDispLavarropas1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroSionoDispTermo1}"
                                                    toolTip="BundleParametros.numero_siono_disp_termo.ficha_hogar"
                                                    headerText="disponibilidad termo"
                                                    id="tableColumnNumeroSionoDispTermo1" rendered="false"
                                                    sort="codigo_siono_1x26y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDispTermo1"
                                                    text="#{currentRow.value['codigo_siono_1x26y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroSionoDispTermo1}"
                                                    id="labelNumeroSionoDispTermo1"
                                                    for="listaNumeroSionoDispTermo1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDispTermo1"
                                                    binding="#{FichaHogar1.listaNumeroSionoDispTermo1}"
                                                    converter="#{FichaHogar1.converterNumeroSionoDispTermo1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroSionoDispTermo1}"
                                                    selected="#{currentRow.value['numero_siono_disp_termo']}"
                                                    toolTip="BundleParametros.numero_siono_disp_termo.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispTermo1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroSionoDispTermo1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x26y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispTermo1"
                                                    for="listaNumeroSionoDispTermo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroSionoDispAireAcon1}"
                                                    toolTip="BundleParametros.numero_siono_disp_aire_acon.ficha_hogar"
                                                    headerText="disponibilidad aire acondicionado"
                                                    id="tableColumnNumeroSionoDispAireAcon1" rendered="false"
                                                    sort="codigo_siono_1x27y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDispAireAcon1"
                                                    text="#{currentRow.value['codigo_siono_1x27y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroSionoDispAireAcon1}"
                                                    id="labelNumeroSionoDispAireAcon1"
                                                    for="listaNumeroSionoDispAireAcon1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDispAireAcon1"
                                                    binding="#{FichaHogar1.listaNumeroSionoDispAireAcon1}"
                                                    converter="#{FichaHogar1.converterNumeroSionoDispAireAcon1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroSionoDispAireAcon1}"
                                                    selected="#{currentRow.value['numero_siono_disp_aire_acon']}"
                                                    toolTip="BundleParametros.numero_siono_disp_aire_acon.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispAireAcon1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroSionoDispAireAcon1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x27y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispAireAcon1"
                                                    for="listaNumeroSionoDispAireAcon1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroSionoDispAutomovil1}"
                                                    toolTip="BundleParametros.numero_siono_disp_automovil.ficha_hogar"
                                                    headerText="disponibilidad automovil"
                                                    id="tableColumnNumeroSionoDispAutomovil1" rendered="false"
                                                    sort="codigo_siono_1x28y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDispAutomovil1"
                                                    text="#{currentRow.value['codigo_siono_1x28y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroSionoDispAutomovil1}"
                                                    id="labelNumeroSionoDispAutomovil1"
                                                    for="listaNumeroSionoDispAutomovil1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDispAutomovil1"
                                                    binding="#{FichaHogar1.listaNumeroSionoDispAutomovil1}"
                                                    converter="#{FichaHogar1.converterNumeroSionoDispAutomovil1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroSionoDispAutomovil1}"
                                                    selected="#{currentRow.value['numero_siono_disp_automovil']}"
                                                    toolTip="BundleParametros.numero_siono_disp_automovil.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispAutomovil1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroSionoDispAutomovil1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x28y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispAutomovil1"
                                                    for="listaNumeroSionoDispAutomovil1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroSionoDispCamion1}"
                                                    toolTip="BundleParametros.numero_siono_disp_camion.ficha_hogar"
                                                    headerText="disponibilidad cami&#243;n"
                                                    id="tableColumnNumeroSionoDispCamion1" rendered="false"
                                                    sort="codigo_siono_1x29y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDispCamion1"
                                                    text="#{currentRow.value['codigo_siono_1x29y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroSionoDispCamion1}"
                                                    id="labelNumeroSionoDispCamion1"
                                                    for="listaNumeroSionoDispCamion1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDispCamion1"
                                                    binding="#{FichaHogar1.listaNumeroSionoDispCamion1}"
                                                    converter="#{FichaHogar1.converterNumeroSionoDispCamion1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroSionoDispCamion1}"
                                                    selected="#{currentRow.value['numero_siono_disp_camion']}"
                                                    toolTip="BundleParametros.numero_siono_disp_camion.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispCamion1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroSionoDispCamion1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x29y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispCamion1"
                                                    for="listaNumeroSionoDispCamion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroSionoDispMotocicleta1}"
                                                    toolTip="BundleParametros.numero_siono_disp_motocicleta.ficha_hogar"
                                                    headerText="disponibilidad motocicleta"
                                                    id="tableColumnNumeroSionoDispMotocicleta1" rendered="false"
                                                    sort="codigo_siono_1x30y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDispMotocicleta1"
                                                    text="#{currentRow.value['codigo_siono_1x30y2']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroSionoDispMotocicleta1}"
                                                    id="labelNumeroSionoDispMotocicleta1"
                                                    for="listaNumeroSionoDispMotocicleta1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDispMotocicleta1"
                                                    binding="#{FichaHogar1.listaNumeroSionoDispMotocicleta1}"
                                                    converter="#{FichaHogar1.converterNumeroSionoDispMotocicleta1}"
                                                    disabled="#{FichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaNumeroSionoDispMotocicleta1}"
                                                    selected="#{currentRow.value['numero_siono_disp_motocicleta']}"
                                                    toolTip="BundleParametros.numero_siono_disp_motocicleta.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispMotocicleta1Texto1"
                                                    binding="#{FichaHogar1.listaNumeroSionoDispMotocicleta1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x30y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispMotocicleta1"
                                                    for="listaNumeroSionoDispMotocicleta1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNombreJefeHogar1}"
                                                    toolTip="BundleParametros.nombre_jefe_hogar.ficha_hogar"
                                                    headerText="nombre jefe hogar"
                                                    id="tableColumnNombreJefeHogar1"
                                                    sort="nombre_jefe_hogar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreJefeHogar1"
                                                    text="#{currentRow.value['nombre_jefe_hogar']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNombreJefeHogar1}"
                                                    id="labelNombreJefeHogar1"
                                                    for="campoNombreJefeHogar1"/>
                                                <webuijsf:textField id="campoNombreJefeHogar1"
                                                    binding="#{FichaHogar1.campoNombreJefeHogar1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{currentRow.value['nombre_jefe_hogar']}"
                                                    toolTip="BundleParametros.nombre_jefe_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorNombreJefeHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNombreJefeHogar1Texto1"
                                                    binding="#{FichaHogar1.campoNombreJefeHogar1Texto1}"
                                                    text="#{currentRow.value['nombre_jefe_hogar']}"/>
                                                <webuijsf:message id="messageNombreJefeHogar1"
                                                    for="campoNombreJefeHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroCedulaJefeHogar1}"
                                                    toolTip="BundleParametros.numero_cedula_jefe_hogar.ficha_hogar"
                                                    headerText="n&#250;mero c&#233;dula jefe hogar"
                                                    id="tableColumnNumeroCedulaJefeHogar1" rendered="false"
                                                    sort="numero_cedula_jefe_hogar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCedulaJefeHogar1"
                                                    text="#{currentRow.value['numero_cedula_jefe_hogar']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroCedulaJefeHogar1}"
                                                    id="labelNumeroCedulaJefeHogar1"
                                                    for="campoNumeroCedulaJefeHogar1"/>
                                                <webuijsf:textField id="campoNumeroCedulaJefeHogar1"
                                                    binding="#{FichaHogar1.campoNumeroCedulaJefeHogar1}"
                                                    converter="#{FichaHogar1.converterNumeroCedulaJefeHogar1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['numero_cedula_jefe_hogar']}"
                                                    toolTip="BundleParametros.numero_cedula_jefe_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorNumeroCedulaJefeHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedulaJefeHogar1Texto1"
                                                    binding="#{FichaHogar1.campoNumeroCedulaJefeHogar1Texto1}"
                                                    text="#{currentRow.value['numero_cedula_jefe_hogar']}"/>
                                                <webuijsf:message id="messageNumeroCedulaJefeHogar1"
                                                    for="campoNumeroCedulaJefeHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnLetraCedulaJefeHogar1}"
                                                    toolTip="BundleParametros.letra_cedula_jefe_hogar.ficha_hogar"
                                                    headerText="letra c&#233;dula jefe hogar"
                                                    id="tableColumnLetraCedulaJefeHogar1" rendered="false"
                                                    sort="letra_cedula_jefe_hogar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextLetraCedulaJefeHogar1"
                                                    text="#{currentRow.value['letra_cedula_jefe_hogar']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelLetraCedulaJefeHogar1}"
                                                    id="labelLetraCedulaJefeHogar1"
                                                    for="campoLetraCedulaJefeHogar1"/>
                                                <webuijsf:textField id="campoLetraCedulaJefeHogar1"
                                                    binding="#{FichaHogar1.campoLetraCedulaJefeHogar1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="true"
                                                    text="#{currentRow.value['letra_cedula_jefe_hogar']}"
                                                    toolTip="BundleParametros.letra_cedula_jefe_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorLetraCedulaJefeHogar1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedulaJefeHogar1Texto1"
                                                    binding="#{FichaHogar1.campoLetraCedulaJefeHogar1Texto1}"
                                                    text="#{currentRow.value['letra_cedula_jefe_hogar']}"/>
                                                <webuijsf:message id="messageLetraCedulaJefeHogar1"
                                                    for="campoLetraCedulaJefeHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroOrdenIdenJefeHogar1}"
                                                    toolTip="BundleParametros.numero_orden_iden_jefe_hogar.ficha_hogar"
                                                    headerText="n&#250;mero orden identificaci&#243;n jefe hogar"
                                                    id="tableColumnNumeroOrdenIdenJefeHogar1" rendered="false"
                                                    sort="numero_orden_iden_jefe_hogar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroOrdenIdenJefeHogar1"
                                                    text="#{currentRow.value['numero_orden_iden_jefe_hogar']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroOrdenIdenJefeHogar1}"
                                                    id="labelNumeroOrdenIdenJefeHogar1"
                                                    for="campoNumeroOrdenIdenJefeHogar1"/>
                                                <webuijsf:textField id="campoNumeroOrdenIdenJefeHogar1"
                                                    binding="#{FichaHogar1.campoNumeroOrdenIdenJefeHogar1}"
                                                    converter="#{FichaHogar1.converterNumeroOrdenIdenJefeHogar1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['numero_orden_iden_jefe_hogar']}"
                                                    toolTip="BundleParametros.numero_orden_iden_jefe_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorNumeroOrdenIdenJefeHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenJefeHogar1Texto1"
                                                    binding="#{FichaHogar1.campoNumeroOrdenIdenJefeHogar1Texto1}"
                                                    text="#{currentRow.value['numero_orden_iden_jefe_hogar']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenJefeHogar1"
                                                    for="campoNumeroOrdenIdenJefeHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNombreRespondente1}"
                                                    toolTip="BundleParametros.nombre_respondente.ficha_hogar"
                                                    headerText="nombre respondente"
                                                    id="tableColumnNombreRespondente1" rendered="false"
                                                    sort="nombre_respondente">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreRespondente1"
                                                    text="#{currentRow.value['nombre_respondente']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNombreRespondente1}"
                                                    id="labelNombreRespondente1"
                                                    for="campoNombreRespondente1"/>
                                                <webuijsf:textField id="campoNombreRespondente1"
                                                    binding="#{FichaHogar1.campoNombreRespondente1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{currentRow.value['nombre_respondente']}"
                                                    toolTip="BundleParametros.nombre_respondente.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorNombreRespondente1.validate}"/>
                                                <webuijsf:staticText id="campoNombreRespondente1Texto1"
                                                    binding="#{FichaHogar1.campoNombreRespondente1Texto1}"
                                                    text="#{currentRow.value['nombre_respondente']}"/>
                                                <webuijsf:message id="messageNombreRespondente1"
                                                    for="campoNombreRespondente1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroCedulaRespondente1}"
                                                    toolTip="BundleParametros.numero_cedula_respondente.ficha_hogar"
                                                    headerText="n&#250;mero c&#233;dula respondente"
                                                    id="tableColumnNumeroCedulaRespondente1" rendered="false"
                                                    sort="numero_cedula_respondente">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCedulaRespondente1"
                                                    text="#{currentRow.value['numero_cedula_respondente']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroCedulaRespondente1}"
                                                    id="labelNumeroCedulaRespondente1"
                                                    for="campoNumeroCedulaRespondente1"/>
                                                <webuijsf:textField id="campoNumeroCedulaRespondente1"
                                                    binding="#{FichaHogar1.campoNumeroCedulaRespondente1}"
                                                    converter="#{FichaHogar1.converterNumeroCedulaRespondente1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['numero_cedula_respondente']}"
                                                    toolTip="BundleParametros.numero_cedula_respondente.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorNumeroCedulaRespondente1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedulaRespondente1Texto1"
                                                    binding="#{FichaHogar1.campoNumeroCedulaRespondente1Texto1}"
                                                    text="#{currentRow.value['numero_cedula_respondente']}"/>
                                                <webuijsf:message id="messageNumeroCedulaRespondente1"
                                                    for="campoNumeroCedulaRespondente1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnLetraCedulaRespondente1}"
                                                    toolTip="BundleParametros.letra_cedula_respondente.ficha_hogar"
                                                    headerText="letra c&#233;dula respondente"
                                                    id="tableColumnLetraCedulaRespondente1" rendered="false"
                                                    sort="letra_cedula_respondente">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextLetraCedulaRespondente1"
                                                    text="#{currentRow.value['letra_cedula_respondente']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelLetraCedulaRespondente1}"
                                                    id="labelLetraCedulaRespondente1"
                                                    for="campoLetraCedulaRespondente1"/>
                                                <webuijsf:textField id="campoLetraCedulaRespondente1"
                                                    binding="#{FichaHogar1.campoLetraCedulaRespondente1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="true"
                                                    text="#{currentRow.value['letra_cedula_respondente']}"
                                                    toolTip="BundleParametros.letra_cedula_respondente.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorLetraCedulaRespondente1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedulaRespondente1Texto1"
                                                    binding="#{FichaHogar1.campoLetraCedulaRespondente1Texto1}"
                                                    text="#{currentRow.value['letra_cedula_respondente']}"/>
                                                <webuijsf:message id="messageLetraCedulaRespondente1"
                                                    for="campoLetraCedulaRespondente1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnNumeroOrdenIdenRespondente1}"
                                                    toolTip="BundleParametros.numero_orden_iden_respondente.ficha_hogar"
                                                    headerText="n&#250;mero orden identificaci&#243;n respondente"
                                                    id="tableColumnNumeroOrdenIdenRespondente1" rendered="false"
                                                    sort="numero_orden_iden_respondente">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroOrdenIdenRespondente1"
                                                    text="#{currentRow.value['numero_orden_iden_respondente']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelNumeroOrdenIdenRespondente1}"
                                                    id="labelNumeroOrdenIdenRespondente1"
                                                    for="campoNumeroOrdenIdenRespondente1"/>
                                                <webuijsf:textField id="campoNumeroOrdenIdenRespondente1"
                                                    binding="#{FichaHogar1.campoNumeroOrdenIdenRespondente1}"
                                                    converter="#{FichaHogar1.converterNumeroOrdenIdenRespondente1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['numero_orden_iden_respondente']}"
                                                    toolTip="BundleParametros.numero_orden_iden_respondente.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorNumeroOrdenIdenRespondente1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenRespondente1Texto1"
                                                    binding="#{FichaHogar1.campoNumeroOrdenIdenRespondente1Texto1}"
                                                    text="#{currentRow.value['numero_orden_iden_respondente']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenRespondente1"
                                                    for="campoNumeroOrdenIdenRespondente1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnIdProveedorDatExt1}"
                                                    toolTip="BundleParametros.id_proveedor_dat_ext.ficha_hogar"
                                                    headerText="proveedor datos externos"
                                                    id="tableColumnIdProveedorDatExt1" rendered="false"
                                                    sort="codigo_proveedor_dat_ex_1x31y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdProveedorDatExt1"
                                                    text="#{currentRow.value['codigo_proveedor_dat_ex_1x31y3']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdProveedorDatExt1}"
                                                    id="labelIdProveedorDatExt1"
                                                    for="campoIdProveedorDatExt1"/>
                                                <webuijsf:textField id="campoIdProveedorDatExt1"
                                                    binding="#{FichaHogar1.campoIdProveedorDatExt1}"
                                                    readOnly="true"
                                                    text="#{FichaHogar1.asistente.textoCampoIdProveedorDatExt1}"
                                                    toolTip="#{FichaHogar1.asistente.toolTipCampoIdProveedorDatExt1}"
                                                    validatorExpression="#{FichaHogar1.campoIdProveedorDatExt1_validate}"/>
                                                <webuijsf:staticText id="campoIdProveedorDatExt1Texto1"
                                                    binding="#{FichaHogar1.campoIdProveedorDatExt1Texto1}"
                                                    text="#{currentRow.value['codigo_proveedor_dat_ex_1x31y3']}"/>
                                                <webuijsf:message id="messageIdProveedorDatExt1"
                                                    for="campoIdProveedorDatExt1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdProveedorDatExt3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdProveedorDatExt3"
                                                    text="#{currentRow.value['id_proveedor_dat_ext']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar1.campoIdProveedorDatExt1Boton1}"
                                                    id="campoIdProveedorDatExt1Boton1"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdProveedorDatExt1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar1.campoIdProveedorDatExt1Boton3}"
                                                    id="campoIdProveedorDatExt1Boton3"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdProveedorDatExt1Boton2}"
                                                    rendered="#{FichaHogar1.asistente.campoIdProveedorDatExt1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FichaHogar1.tableColumnIdProveedorDatExt2}"
                                                    headerText="nombre proveedor datos externos"
                                                    id="tableColumnIdProveedorDatExt2" rendered="false"
                                                    sort="nombre_proveedor_dat_ex_1x31y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdProveedorDatExt2"
                                                    text="#{currentRow.value['nombre_proveedor_dat_ex_1x31y4']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIdProveedorDatExt2}"
                                                    id="labelIdProveedorDatExt2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FichaHogar1.campoIdProveedorDatExt1Hiper1}"
                                                    id="campoIdProveedorDatExt1Hiper1"
                                                    text="#{currentRow.value['nombre_proveedor_dat_ex_1x31y4']}"
                                                    onClick="#{FichaHogar1.asistente.scriptCampoIdProveedorDatExt1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdProveedorDatExt1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnIndiceCalidadVida1}"
                                                    toolTip="BundleParametros.indice_calidad_vida.ficha_hogar"
                                                    headerText="indice calidad vida"
                                                    id="tableColumnIndiceCalidadVida1" rendered="false"
                                                    sort="indice_calidad_vida">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIndiceCalidadVida1"
                                                    text="#{currentRow.value['indice_calidad_vida']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelIndiceCalidadVida1}"
                                                    id="labelIndiceCalidadVida1"
                                                    for="campoIndiceCalidadVida1"/>
                                                <webuijsf:textField id="campoIndiceCalidadVida1"
                                                    binding="#{FichaHogar1.campoIndiceCalidadVida1}"
                                                    converter="#{FichaHogar1.converterIndiceCalidadVida1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['indice_calidad_vida']}"
                                                    toolTip="BundleParametros.indice_calidad_vida.ficha_hogar"
                                                    validatorExpression="#{FichaHogar1.validatorIndiceCalidadVida1.validate}"/>
                                                <webuijsf:staticText id="campoIndiceCalidadVida1Texto1"
                                                    binding="#{FichaHogar1.campoIndiceCalidadVida1Texto1}"
                                                    converter="#{FichaHogar1.converterIndiceCalidadVida1}"
                                                    text="#{currentRow.value['indice_calidad_vida']}"/>
                                                <webuijsf:message id="messageIndiceCalidadVida1"
                                                    for="campoIndiceCalidadVida1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaHogar1.tableColumnEsFichaHogarInactiva1}"
                                                    toolTip="BundleParametros.es_ficha_hogar_inactiva.ficha_hogar"
                                                    headerText="inactiva"
                                                    id="tableColumnEsFichaHogarInactiva1"
                                                    sort="es_ficha_hogar_inactiva">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsFichaHogarInactiva1"
                                                    text="#{currentRow.value['es_ficha_hogar_inactiva']}"
                                                    rendered="#{FichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaHogar1.labelEsFichaHogarInactiva1}"
                                                    id="labelEsFichaHogarInactiva1"
                                                    for="listaEsFichaHogarInactiva1"/>
                                                <webuijsf:dropDown id="listaEsFichaHogarInactiva1"
                                                    binding="#{FichaHogar1.listaEsFichaHogarInactiva1}"
                                                    converter="#{FichaHogar1.converterEsFichaHogarInactiva1}"
                                                    disabled="true"
                                                    items="#{FichaHogar1.asistente.opcionesListaEsFichaHogarInactiva1}"
                                                    selected="#{currentRow.value['es_ficha_hogar_inactiva']}"
                                                    toolTip="BundleParametros.es_ficha_hogar_inactiva.ficha_hogar"/>
                                                <webuijsf:staticText id="listaEsFichaHogarInactiva1Texto1"
                                                    binding="#{FichaHogar1.listaEsFichaHogarInactiva1Texto1}"/>
                                                <webuijsf:message id="messageEsFichaHogarInactiva1"
                                                    for="listaEsFichaHogarInactiva1"/>
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
                                                        binding="#{FichaHogar1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{FichaHogar1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{FichaHogar1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{FichaHogar1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{FichaHogar1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{FichaHogar1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{FichaHogar1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FichaHogar1.botonRepaginar1_action}"
                                                        binding="#{FichaHogar1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{FichaHogar1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{FichaHogar1.gestor.scriptRepaginar}"
                                                        text="#{FichaHogar1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{FichaHogar1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar1.botonAgregar1_action}"
                                                    binding="#{FichaHogar1.botonAgregar1}"
                                                    disabled="#{FichaHogar1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{FichaHogar1.gestor.scriptAgregar}"
                                                    rendered="#{FichaHogar1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{FichaHogar1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FichaHogar1.listaFuncionEdicion1}"
                                                    converter="#{FichaHogar1.converterListaFuncionEdicion1}"
                                                    disabled="#{FichaHogar1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{FichaHogar1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{FichaHogar1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{FichaHogar1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{FichaHogar1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar1.botonEditar1_action}"
                                                    binding="#{FichaHogar1.botonEditar1}"
                                                    disabled="#{FichaHogar1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{FichaHogar1.gestor.scriptEditar}"
                                                    rendered="#{FichaHogar1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{FichaHogar1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar1.botonEliminar1_action}"
                                                    binding="#{FichaHogar1.botonEliminar1}"
                                                    disabled="#{FichaHogar1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{FichaHogar1.gestor.scriptEliminar}"
                                                    rendered="#{FichaHogar1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{FichaHogar1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar1.botonAplicar1_action}"
                                                    binding="#{FichaHogar1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{FichaHogar1.gestor.scriptAplicar}"
                                                    rendered="#{FichaHogar1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{FichaHogar1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar1.botonDeshacer1_action}"
                                                    binding="#{FichaHogar1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{FichaHogar1.gestor.scriptDeshacer}"
                                                    rendered="#{FichaHogar1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{FichaHogar1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar1.botonConfirmar1_action}"
                                                    binding="#{FichaHogar1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{FichaHogar1.gestor.scriptConfirmar}"
                                                    rendered="#{FichaHogar1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{FichaHogar1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar1.botonDescartar1_action}"
                                                    binding="#{FichaHogar1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{FichaHogar1.gestor.scriptDescartar}"
                                                    rendered="#{FichaHogar1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{FichaHogar1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FichaHogar1.listaFuncionAccion1}"
                                                    converter="#{FichaHogar1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{FichaHogar1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{FichaHogar1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{FichaHogar1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{FichaHogar1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar1.botonProcesar1_action}"
                                                    binding="#{FichaHogar1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{FichaHogar1.gestor.scriptProcesar}"
                                                    rendered="#{FichaHogar1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{FichaHogar1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar1.botonRefrescar1_action}"
                                                    binding="#{FichaHogar1.botonRefrescar1}"
                                                    disabled="#{FichaHogar1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{FichaHogar1.gestor.scriptRefrescar}"
                                                    rendered="#{FichaHogar1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{FichaHogar1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar1.botonReconsultar1_action}"
                                                    binding="#{FichaHogar1.botonReconsultar1}"
                                                    disabled="#{FichaHogar1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{FichaHogar1.gestor.scriptReconsultar}"
                                                    rendered="#{FichaHogar1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{FichaHogar1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar1.botonRetornar1_action}"
                                                    binding="#{FichaHogar1.botonRetornar1}"
                                                    disabled="#{FichaHogar1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{FichaHogar1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{FichaHogar1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{FichaHogar1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="2" 
                                                id="gridPanel109"
                                                rendered="#{FichaHogar1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{FichaHogar1.imageHyperlink1_action}"
                                                    binding="#{FichaHogar1.imageHyperlink1}"
                                                    disabled="#{FichaHogar1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{FichaHogar1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FichaHogar1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.FichaHogar1_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{FichaHogar1.imageHyperlink2_action}"
                                                    binding="#{FichaHogar1.imageHyperlink2}"
                                                    disabled="#{FichaHogar1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{FichaHogar1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FichaHogar1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{FichaHogar1.gestor.designing}"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.FichaHogar1_imageHyperlink2_toolTip}"/>
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
