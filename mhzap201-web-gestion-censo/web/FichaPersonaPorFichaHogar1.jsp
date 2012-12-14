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
                    focus="#{FichaPersonaPorFichaHogar1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{FichaPersonaPorFichaHogar1.gestor.preserveFocus}"
                    preserveScroll="#{FichaPersonaPorFichaHogar1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{FichaPersonaPorFichaHogar1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdFichaPersona1 campoCodigoFichaPersona1 campoNombreFichaPersona1 listaEsRespondente1 campoNumeroOrdenIdentificacion1 campoPrimerNombre1 campoSegundoNombre1 campoPrimerApellido1 campoSegundoApellido1 campoApellidoCasada1 campoApodo1 campoEdad1 listaNumeroSexoPersona1 listaNumeroEstadoCivil1 listaNumeroTipoPersonaHogar1 listaNumeroSionoMiembroHogar1 campoNumeroOrdenIdenConyuge1 campoNumeroOrdenIdenPadre1 campoNumeroOrdenIdenMadre1 campoNumeroCedula1 campoLetraCedula1 listaNumeroTipoExcepcionCed1 campoFechaNacimiento1 campoIdDepartamentoNacimiento1 campoIdDistritoNacimiento1 listaNumeroTipoAreaLugarNac1 listaNumeroIdiomaHogar1 campoOtroIdiomaHogar1 listaNumeroSionoAsistenciaEsc1 listaNumeroMotivoInaEsc1 campoOtroMotivoInaEsc1 listaNumeroSionoMatriculacionEsc1 campoUltimoCursoAprobado1 listaNumeroNivelEduUltCurAprob1 listaNumeroSionoCursoNoFormal1 listaNumeroTipoSeguroMedico1 listaNumeroEstadoSalud1 listaNumeroClaseEnfAcc1 campoOtraClaseEnfAcc1 listaNumeroClaseEnfCronica1 campoOtraClaseEnfCronica1 listaNumeroSionoAtencionMedica1 listaNumeroMotivoNoAtencion1 campoOtroMotivoNoAtencion1 listaNumeroSionoCarnetVacunacion1 listaNumeroClaseImpedimento1 campoOtraClaseImpedimento1 listaNumeroCausaImpedimento1 campoOtraCausaImpedimento1 listaNumeroSionoDifParaCaminar1 listaNumeroSionoDifParaVestirse1 listaNumeroSionoDifParaBanarse1 listaNumeroSionoDifParaComer1 listaNumeroSionoDifParaLaCama1 listaNumeroSionoDifParaElBano1 listaNumeroSionoTrabajo1 listaNumeroMotivoNoTrabajo1 campoOtroMotivoNoTrabajo1 campoDescripcionOcupacionPrin1 campoDescripcionDedicacionPrin1 listaNumeroTipoRelacionLab1 campoMontoIngresoOcupacionPrin1 campoMontoIngresoOcupacionSecun1 campoMontoIngresoOtrasOcup1 campoMontoIngresoAlquileres1 campoMontoIngresoIntereses1 campoMontoIngresoAyudaFamPais1 campoMontoIngresoAyudaFamExter1 campoMontoIngresoJubilacion1 campoMontoIngresoPensiones1 campoMontoIngresoTekopora1 campoMontoIngresoProgramas1 campoMontoIngresoAdicional1 campoTotalIngresoMensual1 campoIdPotencialBen1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{FichaPersonaPorFichaHogar1.breadcrumbs1}" 
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
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{FichaPersonaPorFichaHogar1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.mensajeDisponible}"
                                                    text="#{FichaPersonaPorFichaHogar1.gestor.mensaje}"
                                                    url="#{FichaPersonaPorFichaHogar1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{FichaPersonaPorFichaHogar1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{FichaPersonaPorFichaHogar1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{FichaPersonaPorFichaHogar1.gestor.filaEscogida}" 
                                                sourceData="#{FichaPersonaPorFichaHogar1.fichaPersonaDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{FichaPersonaPorFichaHogar1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{FichaPersonaPorFichaHogar1.gestor.scriptElegir}" 
                                                        selected="#{FichaPersonaPorFichaHogar1.gestor.filaElegida}" 
                                                        toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{FichaPersonaPorFichaHogar1.botonEscogerFila1_action}"
                                                        binding="#{FichaPersonaPorFichaHogar1.botonEscogerFila1}"
                                                        disabled="#{FichaPersonaPorFichaHogar1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{FichaPersonaPorFichaHogar1.gestor.urlImagenEscoger}" 
                                                        onClick="#{FichaPersonaPorFichaHogar1.gestor.scriptEscoger}"
                                                        text="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FichaPersonaPorFichaHogar1.botonDetallarFila1_action}"
                                                        binding="#{FichaPersonaPorFichaHogar1.botonDetallarFila1}"
                                                        disabled="#{FichaPersonaPorFichaHogar1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{FichaPersonaPorFichaHogar1.gestor.urlImagenDetallar}" 
                                                        onClick="#{FichaPersonaPorFichaHogar1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{FichaPersonaPorFichaHogar1.gestor.detalleDisponible}" 
                                                        text="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FichaPersonaPorFichaHogar1.botonProcesarFila1_action}"
                                                        binding="#{FichaPersonaPorFichaHogar1.botonProcesarFila1}"
                                                        disabled="#{FichaPersonaPorFichaHogar1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{FichaPersonaPorFichaHogar1.gestor.urlImagenProcesar}" 
                                                        onClick="#{FichaPersonaPorFichaHogar1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{FichaPersonaPorFichaHogar1.asistente.comandoDisponible}" 
                                                        text="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FichaPersonaPorFichaHogar1.botonRetornarFila1_action}"
                                                        binding="#{FichaPersonaPorFichaHogar1.botonRetornarFila1}" 
                                                        disabled="#{FichaPersonaPorFichaHogar1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{FichaPersonaPorFichaHogar1.gestor.urlImagenRetornar}"
                                                        onClick="#{FichaPersonaPorFichaHogar1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{FichaPersonaPorFichaHogar1.gestor.funcionReturnVisible}" 
                                                        text="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{FichaPersonaPorFichaHogar1.hipervinculoAccionFila1_action}"
                                                        binding="#{FichaPersonaPorFichaHogar1.hipervinculoAccionFila1}"
                                                        disabled="#{FichaPersonaPorFichaHogar1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{FichaPersonaPorFichaHogar1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{FichaPersonaPorFichaHogar1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.FichaPersonaPorFichaHogar1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumn3}" 
                                                    headerText="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{FichaPersonaPorFichaHogar1.hipervinculoDetallarFila1_action}"
                                                        binding="#{FichaPersonaPorFichaHogar1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{FichaPersonaPorFichaHogar1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{FichaPersonaPorFichaHogar1.gestor.identificacionFila}" 
                                                        toolTip="#{FichaPersonaPorFichaHogar1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnIdFichaPersona1}"
                                                    headerText="id"
                                                    id="tableColumnIdFichaPersona1" rendered="false"
                                                    sort="id_ficha_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaPersona1"
                                                    text="#{currentRow.value['id_ficha_persona']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelIdFichaPersona1}"
                                                    id="labelIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                <webuijsf:textField id="campoIdFichaPersona1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdFichaPersona1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterIdFichaPersona1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_ficha_persona']}"
                                                    toolTip="BundleParametros.id_ficha_persona.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorIdFichaPersona1.validate}"/>
                                                <webuijsf:staticText id="campoIdFichaPersona1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdFichaPersona1Texto1}"
                                                    text="#{currentRow.value['id_ficha_persona']}"/>
                                                <webuijsf:message id="messageIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnCodigoFichaPersona1}"
                                                    headerText="codigo"
                                                    id="tableColumnCodigoFichaPersona1"
                                                    sort="codigo_ficha_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoFichaPersona1"
                                                    text="#{currentRow.value['codigo_ficha_persona']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelCodigoFichaPersona1}"
                                                    id="labelCodigoFichaPersona1"
                                                    for="campoCodigoFichaPersona1"/>
                                                <webuijsf:textField id="campoCodigoFichaPersona1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoCodigoFichaPersona1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{currentRow.value['codigo_ficha_persona']}"
                                                    toolTip="BundleParametros.codigo_ficha_persona.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorCodigoFichaPersona1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoFichaPersona1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoCodigoFichaPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_ficha_persona']}"/>
                                                <webuijsf:message id="messageCodigoFichaPersona1"
                                                    for="campoCodigoFichaPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNombreFichaPersona1}"
                                                    headerText="nombre"
                                                    id="tableColumnNombreFichaPersona1"
                                                    sort="nombre_ficha_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreFichaPersona1"
                                                    text="#{currentRow.value['nombre_ficha_persona']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNombreFichaPersona1}"
                                                    id="labelNombreFichaPersona1"
                                                    for="campoNombreFichaPersona1"/>
                                                <webuijsf:textField id="campoNombreFichaPersona1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoNombreFichaPersona1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{currentRow.value['nombre_ficha_persona']}"
                                                    toolTip="BundleParametros.nombre_ficha_persona.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorNombreFichaPersona1.validate}"/>
                                                <webuijsf:staticText id="campoNombreFichaPersona1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoNombreFichaPersona1Texto1}"
                                                    text="#{currentRow.value['nombre_ficha_persona']}"/>
                                                <webuijsf:message id="messageNombreFichaPersona1"
                                                    for="campoNombreFichaPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnEsRespondente1}"
                                                    headerText="respondente"
                                                    id="tableColumnEsRespondente1" rendered="false"
                                                    sort="es_respondente">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsRespondente1"
                                                    text="#{currentRow.value['es_respondente']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelEsRespondente1}"
                                                    id="labelEsRespondente1"
                                                    for="listaEsRespondente1"/>
                                                <webuijsf:dropDown id="listaEsRespondente1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaEsRespondente1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterEsRespondente1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaEsRespondente1}"
                                                    selected="#{currentRow.value['es_respondente']}"
                                                    toolTip="BundleParametros.es_respondente.ficha_persona"/>
                                                <webuijsf:staticText id="listaEsRespondente1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaEsRespondente1Texto1}"/>
                                                <webuijsf:message id="messageEsRespondente1"
                                                    for="listaEsRespondente1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroOrdenIdentificacion1}"
                                                    headerText="numero orden identificacion"
                                                    id="tableColumnNumeroOrdenIdentificacion1"
                                                    sort="numero_orden_identificacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroOrdenIdentificacion1"
                                                    text="#{currentRow.value['numero_orden_identificacion']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroOrdenIdentificacion1}"
                                                    id="labelNumeroOrdenIdentificacion1"
                                                    for="campoNumeroOrdenIdentificacion1"/>
                                                <webuijsf:textField id="campoNumeroOrdenIdentificacion1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoNumeroOrdenIdentificacion1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroOrdenIdentificacion1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['numero_orden_identificacion']}"
                                                    toolTip="BundleParametros.numero_orden_identificacion.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorNumeroOrdenIdentificacion1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdentificacion1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoNumeroOrdenIdentificacion1Texto1}"
                                                    text="#{currentRow.value['numero_orden_identificacion']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdentificacion1"
                                                    for="campoNumeroOrdenIdentificacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnPrimerNombre1}"
                                                    headerText="primer nombre"
                                                    id="tableColumnPrimerNombre1" rendered="false"
                                                    sort="primer_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerNombre1"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelPrimerNombre1}"
                                                    id="labelPrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                <webuijsf:textField id="campoPrimerNombre1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoPrimerNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoPrimerNombre1Texto1}"
                                                    text="#{currentRow.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnSegundoNombre1}"
                                                    headerText="segundo nombre"
                                                    id="tableColumnSegundoNombre1" rendered="false"
                                                    sort="segundo_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoNombre1"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelSegundoNombre1}"
                                                    id="labelSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                <webuijsf:textField id="campoSegundoNombre1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoSegundoNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoSegundoNombre1Texto1}"
                                                    text="#{currentRow.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnPrimerApellido1}"
                                                    headerText="primer apellido"
                                                    id="tableColumnPrimerApellido1" rendered="false"
                                                    sort="primer_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerApellido1"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelPrimerApellido1}"
                                                    id="labelPrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                <webuijsf:textField id="campoPrimerApellido1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoPrimerApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoPrimerApellido1Texto1}"
                                                    text="#{currentRow.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnSegundoApellido1}"
                                                    headerText="segundo apellido"
                                                    id="tableColumnSegundoApellido1" rendered="false"
                                                    sort="segundo_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoApellido1"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelSegundoApellido1}"
                                                    id="labelSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                <webuijsf:textField id="campoSegundoApellido1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoSegundoApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoSegundoApellido1Texto1}"
                                                    text="#{currentRow.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnApellidoCasada1}"
                                                    headerText="apellido casada"
                                                    id="tableColumnApellidoCasada1" rendered="false"
                                                    sort="apellido_casada">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextApellidoCasada1"
                                                    text="#{currentRow.value['apellido_casada']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelApellidoCasada1}"
                                                    id="labelApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                <webuijsf:textField id="campoApellidoCasada1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoApellidoCasada1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['apellido_casada']}"
                                                    toolTip="BundleParametros.apellido_casada.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorApellidoCasada1.validate}"/>
                                                <webuijsf:staticText id="campoApellidoCasada1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoApellidoCasada1Texto1}"
                                                    text="#{currentRow.value['apellido_casada']}"/>
                                                <webuijsf:message id="messageApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnApodo1}"
                                                    headerText="apodo"
                                                    id="tableColumnApodo1" rendered="false"
                                                    sort="apodo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextApodo1"
                                                    text="#{currentRow.value['apodo']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelApodo1}"
                                                    id="labelApodo1"
                                                    for="campoApodo1"/>
                                                <webuijsf:textField id="campoApodo1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoApodo1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['apodo']}"
                                                    toolTip="BundleParametros.apodo.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorApodo1.validate}"/>
                                                <webuijsf:staticText id="campoApodo1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoApodo1Texto1}"
                                                    text="#{currentRow.value['apodo']}"/>
                                                <webuijsf:message id="messageApodo1"
                                                    for="campoApodo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnEdad1}"
                                                    headerText="edad"
                                                    id="tableColumnEdad1" rendered="false"
                                                    sort="edad">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEdad1"
                                                    text="#{currentRow.value['edad']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelEdad1}"
                                                    id="labelEdad1"
                                                    for="campoEdad1"/>
                                                <webuijsf:textField id="campoEdad1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoEdad1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterEdad1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['edad']}"
                                                    toolTip="BundleParametros.edad.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorEdad1.validate}"/>
                                                <webuijsf:staticText id="campoEdad1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoEdad1Texto1}"
                                                    text="#{currentRow.value['edad']}"/>
                                                <webuijsf:message id="messageEdad1"
                                                    for="campoEdad1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroSexoPersona1}"
                                                    headerText="sexo persona"
                                                    id="tableColumnNumeroSexoPersona1" rendered="false"
                                                    sort="codigo_sexo_persona_1x2y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSexoPersona1"
                                                    text="#{currentRow.value['codigo_sexo_persona_1x2y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroSexoPersona1}"
                                                    id="labelNumeroSexoPersona1"
                                                    for="listaNumeroSexoPersona1"/>
                                                <webuijsf:dropDown id="listaNumeroSexoPersona1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSexoPersona1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroSexoPersona1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroSexoPersona1}"
                                                    selected="#{currentRow.value['numero_sexo_persona']}"
                                                    toolTip="BundleParametros.numero_sexo_persona.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSexoPersona1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSexoPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_sexo_persona_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroSexoPersona1"
                                                    for="listaNumeroSexoPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroEstadoCivil1}"
                                                    headerText="estado civil"
                                                    id="tableColumnNumeroEstadoCivil1" rendered="false"
                                                    sort="codigo_estado_civil_1x3y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroEstadoCivil1"
                                                    text="#{currentRow.value['codigo_estado_civil_1x3y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroEstadoCivil1}"
                                                    id="labelNumeroEstadoCivil1"
                                                    for="listaNumeroEstadoCivil1"/>
                                                <webuijsf:dropDown id="listaNumeroEstadoCivil1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroEstadoCivil1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroEstadoCivil1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroEstadoCivil1}"
                                                    selected="#{currentRow.value['numero_estado_civil']}"
                                                    toolTip="BundleParametros.numero_estado_civil.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroEstadoCivil1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroEstadoCivil1Texto1}"
                                                    text="#{currentRow.value['codigo_estado_civil_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroEstadoCivil1"
                                                    for="listaNumeroEstadoCivil1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroTipoPersonaHogar1}"
                                                    headerText="tipo persona hogar"
                                                    id="tableColumnNumeroTipoPersonaHogar1"
                                                    sort="codigo_tipo_persona_hoga_1x4y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoPersonaHogar1"
                                                    text="#{currentRow.value['codigo_tipo_persona_hoga_1x4y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroTipoPersonaHogar1}"
                                                    id="labelNumeroTipoPersonaHogar1"
                                                    for="listaNumeroTipoPersonaHogar1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoPersonaHogar1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroTipoPersonaHogar1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroTipoPersonaHogar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroTipoPersonaHogar1}"
                                                    selected="#{currentRow.value['numero_tipo_persona_hogar']}"
                                                    toolTip="BundleParametros.numero_tipo_persona_hogar.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoPersonaHogar1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroTipoPersonaHogar1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_persona_hoga_1x4y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoPersonaHogar1"
                                                    for="listaNumeroTipoPersonaHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroSionoMiembroHogar1}"
                                                    headerText="miembro hogar"
                                                    id="tableColumnNumeroSionoMiembroHogar1" rendered="false"
                                                    sort="codigo_siono_1x5y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoMiembroHogar1"
                                                    text="#{currentRow.value['codigo_siono_1x5y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroSionoMiembroHogar1}"
                                                    id="labelNumeroSionoMiembroHogar1"
                                                    for="listaNumeroSionoMiembroHogar1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoMiembroHogar1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoMiembroHogar1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroSionoMiembroHogar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroSionoMiembroHogar1}"
                                                    selected="#{currentRow.value['numero_siono_miembro_hogar']}"
                                                    toolTip="BundleParametros.numero_siono_miembro_hogar.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoMiembroHogar1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoMiembroHogar1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x5y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoMiembroHogar1"
                                                    for="listaNumeroSionoMiembroHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroOrdenIdenConyuge1}"
                                                    headerText="numero orden identificación conyuge"
                                                    id="tableColumnNumeroOrdenIdenConyuge1" rendered="false"
                                                    sort="numero_orden_iden_conyuge">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroOrdenIdenConyuge1"
                                                    text="#{currentRow.value['numero_orden_iden_conyuge']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroOrdenIdenConyuge1}"
                                                    id="labelNumeroOrdenIdenConyuge1"
                                                    for="campoNumeroOrdenIdenConyuge1"/>
                                                <webuijsf:textField id="campoNumeroOrdenIdenConyuge1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoNumeroOrdenIdenConyuge1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroOrdenIdenConyuge1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['numero_orden_iden_conyuge']}"
                                                    toolTip="BundleParametros.numero_orden_iden_conyuge.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorNumeroOrdenIdenConyuge1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenConyuge1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoNumeroOrdenIdenConyuge1Texto1}"
                                                    text="#{currentRow.value['numero_orden_iden_conyuge']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenConyuge1"
                                                    for="campoNumeroOrdenIdenConyuge1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroOrdenIdenPadre1}"
                                                    headerText="numero orden identificación padre"
                                                    id="tableColumnNumeroOrdenIdenPadre1" rendered="false"
                                                    sort="numero_orden_iden_padre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroOrdenIdenPadre1"
                                                    text="#{currentRow.value['numero_orden_iden_padre']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroOrdenIdenPadre1}"
                                                    id="labelNumeroOrdenIdenPadre1"
                                                    for="campoNumeroOrdenIdenPadre1"/>
                                                <webuijsf:textField id="campoNumeroOrdenIdenPadre1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoNumeroOrdenIdenPadre1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroOrdenIdenPadre1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['numero_orden_iden_padre']}"
                                                    toolTip="BundleParametros.numero_orden_iden_padre.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorNumeroOrdenIdenPadre1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenPadre1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoNumeroOrdenIdenPadre1Texto1}"
                                                    text="#{currentRow.value['numero_orden_iden_padre']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenPadre1"
                                                    for="campoNumeroOrdenIdenPadre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroOrdenIdenMadre1}"
                                                    headerText="numero orden identificación madre"
                                                    id="tableColumnNumeroOrdenIdenMadre1" rendered="false"
                                                    sort="numero_orden_iden_madre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroOrdenIdenMadre1"
                                                    text="#{currentRow.value['numero_orden_iden_madre']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroOrdenIdenMadre1}"
                                                    id="labelNumeroOrdenIdenMadre1"
                                                    for="campoNumeroOrdenIdenMadre1"/>
                                                <webuijsf:textField id="campoNumeroOrdenIdenMadre1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoNumeroOrdenIdenMadre1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroOrdenIdenMadre1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['numero_orden_iden_madre']}"
                                                    toolTip="BundleParametros.numero_orden_iden_madre.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorNumeroOrdenIdenMadre1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenMadre1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoNumeroOrdenIdenMadre1Texto1}"
                                                    text="#{currentRow.value['numero_orden_iden_madre']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenMadre1"
                                                    for="campoNumeroOrdenIdenMadre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroCedula1}"
                                                    headerText="numero cedula"
                                                    id="tableColumnNumeroCedula1" rendered="false"
                                                    sort="numero_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCedula1"
                                                    text="#{currentRow.value['numero_cedula']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroCedula1}"
                                                    id="labelNumeroCedula1"
                                                    for="campoNumeroCedula1"/>
                                                <webuijsf:textField id="campoNumeroCedula1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoNumeroCedula1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroCedula1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['numero_cedula']}"
                                                    toolTip="BundleParametros.numero_cedula.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorNumeroCedula1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedula1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoNumeroCedula1Texto1}"
                                                    text="#{currentRow.value['numero_cedula']}"/>
                                                <webuijsf:message id="messageNumeroCedula1"
                                                    for="campoNumeroCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnLetraCedula1}"
                                                    headerText="letra cedula"
                                                    id="tableColumnLetraCedula1" rendered="false"
                                                    sort="letra_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextLetraCedula1"
                                                    text="#{currentRow.value['letra_cedula']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelLetraCedula1}"
                                                    id="labelLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                <webuijsf:textField id="campoLetraCedula1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoLetraCedula1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['letra_cedula']}"
                                                    toolTip="BundleParametros.letra_cedula.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorLetraCedula1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedula1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoLetraCedula1Texto1}"
                                                    text="#{currentRow.value['letra_cedula']}"/>
                                                <webuijsf:message id="messageLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroTipoExcepcionCed1}"
                                                    headerText="tipo excepcion cédula"
                                                    id="tableColumnNumeroTipoExcepcionCed1" rendered="false"
                                                    sort="codigo_tipo_excepcion_ce_1x6y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoExcepcionCed1"
                                                    text="#{currentRow.value['codigo_tipo_excepcion_ce_1x6y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroTipoExcepcionCed1}"
                                                    id="labelNumeroTipoExcepcionCed1"
                                                    for="listaNumeroTipoExcepcionCed1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoExcepcionCed1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroTipoExcepcionCed1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroTipoExcepcionCed1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroTipoExcepcionCed1}"
                                                    selected="#{currentRow.value['numero_tipo_excepcion_ced']}"
                                                    toolTip="BundleParametros.numero_tipo_excepcion_ced.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoExcepcionCed1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroTipoExcepcionCed1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_excepcion_ce_1x6y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoExcepcionCed1"
                                                    for="listaNumeroTipoExcepcionCed1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnFechaNacimiento1}"
                                                    headerText="fecha nacimiento"
                                                    id="tableColumnFechaNacimiento1" rendered="false"
                                                    sort="fecha_nacimiento">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaNacimiento1"
                                                    text="#{currentRow.value['fecha_nacimiento']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelFechaNacimiento1}"
                                                    id="labelFechaNacimiento1"
                                                    for="campoFechaNacimiento1"/>
                                                <webuijsf:textField id="campoFechaNacimiento1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoFechaNacimiento1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterFechaNacimiento1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['fecha_nacimiento']}"
                                                    toolTip="BundleParametros.fecha_nacimiento.ficha_persona"/>
                                                <webuijsf:staticText id="campoFechaNacimiento1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoFechaNacimiento1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterFechaNacimiento1}"
                                                    text="#{currentRow.value['fecha_nacimiento']}"/>
                                                <webuijsf:message id="messageFechaNacimiento1"
                                                    for="campoFechaNacimiento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnIdDepartamentoNacimiento1}"
                                                    headerText="departamento nacimiento"
                                                    id="tableColumnIdDepartamentoNacimiento1" rendered="false"
                                                    sort="codigo_ubicacion_1x7y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamentoNacimiento1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x7y3']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelIdDepartamentoNacimiento1}"
                                                    id="labelIdDepartamentoNacimiento1"
                                                    for="campoIdDepartamentoNacimiento1"/>
                                                <webuijsf:textField id="campoIdDepartamentoNacimiento1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdDepartamentoNacimiento1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar1.asistente.textoCampoIdDepartamentoNacimiento1}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.asistente.toolTipCampoIdDepartamentoNacimiento1}"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.campoIdDepartamentoNacimiento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamentoNacimiento1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdDepartamentoNacimiento1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x7y3']}"/>
                                                <webuijsf:message id="messageIdDepartamentoNacimiento1"
                                                    for="campoIdDepartamentoNacimiento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdDepartamentoNacimiento3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamentoNacimiento3"
                                                    text="#{currentRow.value['id_departamento_nacimiento']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdDepartamentoNacimiento1Boton1}"
                                                    id="campoIdDepartamentoNacimiento1Boton1"
                                                    onClick="#{FichaPersonaPorFichaHogar1.asistente.scriptCampoIdDepartamentoNacimiento1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdDepartamentoNacimiento1Boton3}"
                                                    id="campoIdDepartamentoNacimiento1Boton3"
                                                    onClick="#{FichaPersonaPorFichaHogar1.asistente.scriptCampoIdDepartamentoNacimiento1Boton2}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.asistente.campoIdDepartamentoNacimiento1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnIdDepartamentoNacimiento2}"
                                                    headerText="nombre departamento nacimiento"
                                                    id="tableColumnIdDepartamentoNacimiento2" rendered="false"
                                                    sort="nombre_ubicacion_1x7y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamentoNacimiento2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x7y4']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelIdDepartamentoNacimiento2}"
                                                    id="labelIdDepartamentoNacimiento2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdDepartamentoNacimiento1Hiper1}"
                                                    id="campoIdDepartamentoNacimiento1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x7y4']}"
                                                    onClick="#{FichaPersonaPorFichaHogar1.asistente.scriptCampoIdDepartamentoNacimiento1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDepartamentoNacimiento1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnIdDistritoNacimiento1}"
                                                    headerText="distrito nacimiento"
                                                    id="tableColumnIdDistritoNacimiento1" rendered="false"
                                                    sort="codigo_ubicacion_1x8y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistritoNacimiento1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x8y3']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelIdDistritoNacimiento1}"
                                                    id="labelIdDistritoNacimiento1"
                                                    for="campoIdDistritoNacimiento1"/>
                                                <webuijsf:textField id="campoIdDistritoNacimiento1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdDistritoNacimiento1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar1.asistente.textoCampoIdDistritoNacimiento1}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.asistente.toolTipCampoIdDistritoNacimiento1}"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.campoIdDistritoNacimiento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistritoNacimiento1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdDistritoNacimiento1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x8y3']}"/>
                                                <webuijsf:message id="messageIdDistritoNacimiento1"
                                                    for="campoIdDistritoNacimiento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdDistritoNacimiento3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistritoNacimiento3"
                                                    text="#{currentRow.value['id_distrito_nacimiento']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdDistritoNacimiento1Boton1}"
                                                    id="campoIdDistritoNacimiento1Boton1"
                                                    onClick="#{FichaPersonaPorFichaHogar1.asistente.scriptCampoIdDistritoNacimiento1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdDistritoNacimiento1Boton3}"
                                                    id="campoIdDistritoNacimiento1Boton3"
                                                    onClick="#{FichaPersonaPorFichaHogar1.asistente.scriptCampoIdDistritoNacimiento1Boton2}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.asistente.campoIdDistritoNacimiento1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnIdDistritoNacimiento2}"
                                                    headerText="nombre distrito nacimiento"
                                                    id="tableColumnIdDistritoNacimiento2" rendered="false"
                                                    sort="nombre_ubicacion_1x8y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistritoNacimiento2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x8y4']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelIdDistritoNacimiento2}"
                                                    id="labelIdDistritoNacimiento2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdDistritoNacimiento1Hiper1}"
                                                    id="campoIdDistritoNacimiento1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x8y4']}"
                                                    onClick="#{FichaPersonaPorFichaHogar1.asistente.scriptCampoIdDistritoNacimiento1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDistritoNacimiento1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroTipoAreaLugarNac1}"
                                                    headerText="tipo area lugar nacimiento"
                                                    id="tableColumnNumeroTipoAreaLugarNac1" rendered="false"
                                                    sort="codigo_tipo_area_1x9y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoAreaLugarNac1"
                                                    text="#{currentRow.value['codigo_tipo_area_1x9y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroTipoAreaLugarNac1}"
                                                    id="labelNumeroTipoAreaLugarNac1"
                                                    for="listaNumeroTipoAreaLugarNac1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoAreaLugarNac1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroTipoAreaLugarNac1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroTipoAreaLugarNac1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroTipoAreaLugarNac1}"
                                                    selected="#{currentRow.value['numero_tipo_area_lugar_nac']}"
                                                    toolTip="BundleParametros.numero_tipo_area_lugar_nac.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoAreaLugarNac1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroTipoAreaLugarNac1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_area_1x9y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoAreaLugarNac1"
                                                    for="listaNumeroTipoAreaLugarNac1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroIdiomaHogar1}"
                                                    headerText="idioma hogar"
                                                    id="tableColumnNumeroIdiomaHogar1" rendered="false"
                                                    sort="codigo_idioma_hogar_1x10y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroIdiomaHogar1"
                                                    text="#{currentRow.value['codigo_idioma_hogar_1x10y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroIdiomaHogar1}"
                                                    id="labelNumeroIdiomaHogar1"
                                                    for="listaNumeroIdiomaHogar1"/>
                                                <webuijsf:dropDown id="listaNumeroIdiomaHogar1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroIdiomaHogar1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroIdiomaHogar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroIdiomaHogar1}"
                                                    selected="#{currentRow.value['numero_idioma_hogar']}"
                                                    toolTip="BundleParametros.numero_idioma_hogar.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroIdiomaHogar1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroIdiomaHogar1Texto1}"
                                                    text="#{currentRow.value['codigo_idioma_hogar_1x10y2']}"/>
                                                <webuijsf:message id="messageNumeroIdiomaHogar1"
                                                    for="listaNumeroIdiomaHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnOtroIdiomaHogar1}"
                                                    headerText="otro idioma hogar"
                                                    id="tableColumnOtroIdiomaHogar1" rendered="false"
                                                    sort="otro_idioma_hogar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtroIdiomaHogar1"
                                                    text="#{currentRow.value['otro_idioma_hogar']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelOtroIdiomaHogar1}"
                                                    id="labelOtroIdiomaHogar1"
                                                    for="campoOtroIdiomaHogar1"/>
                                                <webuijsf:textField id="campoOtroIdiomaHogar1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoOtroIdiomaHogar1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otro_idioma_hogar']}"
                                                    toolTip="BundleParametros.otro_idioma_hogar.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorOtroIdiomaHogar1.validate}"/>
                                                <webuijsf:staticText id="campoOtroIdiomaHogar1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoOtroIdiomaHogar1Texto1}"
                                                    text="#{currentRow.value['otro_idioma_hogar']}"/>
                                                <webuijsf:message id="messageOtroIdiomaHogar1"
                                                    for="campoOtroIdiomaHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroSionoAsistenciaEsc1}"
                                                    headerText="asistencia escolar"
                                                    id="tableColumnNumeroSionoAsistenciaEsc1" rendered="false"
                                                    sort="codigo_siono_1x11y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoAsistenciaEsc1"
                                                    text="#{currentRow.value['codigo_siono_1x11y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroSionoAsistenciaEsc1}"
                                                    id="labelNumeroSionoAsistenciaEsc1"
                                                    for="listaNumeroSionoAsistenciaEsc1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoAsistenciaEsc1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoAsistenciaEsc1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroSionoAsistenciaEsc1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroSionoAsistenciaEsc1}"
                                                    selected="#{currentRow.value['numero_siono_asistencia_esc']}"
                                                    toolTip="BundleParametros.numero_siono_asistencia_esc.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoAsistenciaEsc1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoAsistenciaEsc1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x11y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoAsistenciaEsc1"
                                                    for="listaNumeroSionoAsistenciaEsc1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroMotivoInaEsc1}"
                                                    headerText="motivo inasistencia escolar"
                                                    id="tableColumnNumeroMotivoInaEsc1" rendered="false"
                                                    sort="codigo_motivo_ina_esc_1x12y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroMotivoInaEsc1"
                                                    text="#{currentRow.value['codigo_motivo_ina_esc_1x12y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroMotivoInaEsc1}"
                                                    id="labelNumeroMotivoInaEsc1"
                                                    for="listaNumeroMotivoInaEsc1"/>
                                                <webuijsf:dropDown id="listaNumeroMotivoInaEsc1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroMotivoInaEsc1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroMotivoInaEsc1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroMotivoInaEsc1}"
                                                    selected="#{currentRow.value['numero_motivo_ina_esc']}"
                                                    toolTip="BundleParametros.numero_motivo_ina_esc.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroMotivoInaEsc1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroMotivoInaEsc1Texto1}"
                                                    text="#{currentRow.value['codigo_motivo_ina_esc_1x12y2']}"/>
                                                <webuijsf:message id="messageNumeroMotivoInaEsc1"
                                                    for="listaNumeroMotivoInaEsc1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnOtroMotivoInaEsc1}"
                                                    headerText="otro motivo inasistencia escolar"
                                                    id="tableColumnOtroMotivoInaEsc1" rendered="false"
                                                    sort="otro_motivo_ina_esc">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtroMotivoInaEsc1"
                                                    text="#{currentRow.value['otro_motivo_ina_esc']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelOtroMotivoInaEsc1}"
                                                    id="labelOtroMotivoInaEsc1"
                                                    for="campoOtroMotivoInaEsc1"/>
                                                <webuijsf:textField id="campoOtroMotivoInaEsc1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoOtroMotivoInaEsc1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otro_motivo_ina_esc']}"
                                                    toolTip="BundleParametros.otro_motivo_ina_esc.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorOtroMotivoInaEsc1.validate}"/>
                                                <webuijsf:staticText id="campoOtroMotivoInaEsc1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoOtroMotivoInaEsc1Texto1}"
                                                    text="#{currentRow.value['otro_motivo_ina_esc']}"/>
                                                <webuijsf:message id="messageOtroMotivoInaEsc1"
                                                    for="campoOtroMotivoInaEsc1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroSionoMatriculacionEsc1}"
                                                    headerText="matriculacion escolar"
                                                    id="tableColumnNumeroSionoMatriculacionEsc1" rendered="false"
                                                    sort="codigo_siono_1x13y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoMatriculacionEsc1"
                                                    text="#{currentRow.value['codigo_siono_1x13y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroSionoMatriculacionEsc1}"
                                                    id="labelNumeroSionoMatriculacionEsc1"
                                                    for="listaNumeroSionoMatriculacionEsc1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoMatriculacionEsc1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoMatriculacionEsc1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroSionoMatriculacionEsc1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroSionoMatriculacionEsc1}"
                                                    selected="#{currentRow.value['numero_siono_matriculacion_esc']}"
                                                    toolTip="BundleParametros.numero_siono_matriculacion_esc.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoMatriculacionEsc1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoMatriculacionEsc1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x13y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoMatriculacionEsc1"
                                                    for="listaNumeroSionoMatriculacionEsc1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnUltimoCursoAprobado1}"
                                                    headerText="ultimo curso aprobado"
                                                    id="tableColumnUltimoCursoAprobado1" rendered="false"
                                                    sort="ultimo_curso_aprobado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextUltimoCursoAprobado1"
                                                    text="#{currentRow.value['ultimo_curso_aprobado']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelUltimoCursoAprobado1}"
                                                    id="labelUltimoCursoAprobado1"
                                                    for="campoUltimoCursoAprobado1"/>
                                                <webuijsf:textField id="campoUltimoCursoAprobado1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoUltimoCursoAprobado1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterUltimoCursoAprobado1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['ultimo_curso_aprobado']}"
                                                    toolTip="BundleParametros.ultimo_curso_aprobado.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorUltimoCursoAprobado1.validate}"/>
                                                <webuijsf:staticText id="campoUltimoCursoAprobado1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoUltimoCursoAprobado1Texto1}"
                                                    text="#{currentRow.value['ultimo_curso_aprobado']}"/>
                                                <webuijsf:message id="messageUltimoCursoAprobado1"
                                                    for="campoUltimoCursoAprobado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroNivelEduUltCurAprob1}"
                                                    headerText="nivel educativo última curso aprobado"
                                                    id="tableColumnNumeroNivelEduUltCurAprob1" rendered="false"
                                                    sort="codigo_nivel_educativo_1x14y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroNivelEduUltCurAprob1"
                                                    text="#{currentRow.value['codigo_nivel_educativo_1x14y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroNivelEduUltCurAprob1}"
                                                    id="labelNumeroNivelEduUltCurAprob1"
                                                    for="listaNumeroNivelEduUltCurAprob1"/>
                                                <webuijsf:dropDown id="listaNumeroNivelEduUltCurAprob1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroNivelEduUltCurAprob1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroNivelEduUltCurAprob1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroNivelEduUltCurAprob1}"
                                                    selected="#{currentRow.value['numero_nivel_edu_ult_cur_aprob']}"
                                                    toolTip="BundleParametros.numero_nivel_edu_ult_cur_aprob.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroNivelEduUltCurAprob1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroNivelEduUltCurAprob1Texto1}"
                                                    text="#{currentRow.value['codigo_nivel_educativo_1x14y2']}"/>
                                                <webuijsf:message id="messageNumeroNivelEduUltCurAprob1"
                                                    for="listaNumeroNivelEduUltCurAprob1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroSionoCursoNoFormal1}"
                                                    headerText="curso no formal"
                                                    id="tableColumnNumeroSionoCursoNoFormal1" rendered="false"
                                                    sort="codigo_siono_1x15y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoCursoNoFormal1"
                                                    text="#{currentRow.value['codigo_siono_1x15y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroSionoCursoNoFormal1}"
                                                    id="labelNumeroSionoCursoNoFormal1"
                                                    for="listaNumeroSionoCursoNoFormal1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoCursoNoFormal1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoCursoNoFormal1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroSionoCursoNoFormal1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroSionoCursoNoFormal1}"
                                                    selected="#{currentRow.value['numero_siono_curso_no_formal']}"
                                                    toolTip="BundleParametros.numero_siono_curso_no_formal.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoCursoNoFormal1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoCursoNoFormal1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x15y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoCursoNoFormal1"
                                                    for="listaNumeroSionoCursoNoFormal1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroTipoSeguroMedico1}"
                                                    headerText="tipo seguro medico"
                                                    id="tableColumnNumeroTipoSeguroMedico1" rendered="false"
                                                    sort="codigo_tipo_seguro_medi_1x16y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoSeguroMedico1"
                                                    text="#{currentRow.value['codigo_tipo_seguro_medi_1x16y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroTipoSeguroMedico1}"
                                                    id="labelNumeroTipoSeguroMedico1"
                                                    for="listaNumeroTipoSeguroMedico1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoSeguroMedico1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroTipoSeguroMedico1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroTipoSeguroMedico1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroTipoSeguroMedico1}"
                                                    selected="#{currentRow.value['numero_tipo_seguro_medico']}"
                                                    toolTip="BundleParametros.numero_tipo_seguro_medico.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoSeguroMedico1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroTipoSeguroMedico1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_seguro_medi_1x16y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoSeguroMedico1"
                                                    for="listaNumeroTipoSeguroMedico1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroEstadoSalud1}"
                                                    headerText="estado salud"
                                                    id="tableColumnNumeroEstadoSalud1" rendered="false"
                                                    sort="codigo_estado_salud_1x17y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroEstadoSalud1"
                                                    text="#{currentRow.value['codigo_estado_salud_1x17y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroEstadoSalud1}"
                                                    id="labelNumeroEstadoSalud1"
                                                    for="listaNumeroEstadoSalud1"/>
                                                <webuijsf:dropDown id="listaNumeroEstadoSalud1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroEstadoSalud1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroEstadoSalud1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroEstadoSalud1}"
                                                    selected="#{currentRow.value['numero_estado_salud']}"
                                                    toolTip="BundleParametros.numero_estado_salud.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroEstadoSalud1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroEstadoSalud1Texto1}"
                                                    text="#{currentRow.value['codigo_estado_salud_1x17y2']}"/>
                                                <webuijsf:message id="messageNumeroEstadoSalud1"
                                                    for="listaNumeroEstadoSalud1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroClaseEnfAcc1}"
                                                    headerText="clase enfermedad accidente"
                                                    id="tableColumnNumeroClaseEnfAcc1" rendered="false"
                                                    sort="codigo_clase_enf_acc_1x18y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroClaseEnfAcc1"
                                                    text="#{currentRow.value['codigo_clase_enf_acc_1x18y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroClaseEnfAcc1}"
                                                    id="labelNumeroClaseEnfAcc1"
                                                    for="listaNumeroClaseEnfAcc1"/>
                                                <webuijsf:dropDown id="listaNumeroClaseEnfAcc1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroClaseEnfAcc1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroClaseEnfAcc1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroClaseEnfAcc1}"
                                                    selected="#{currentRow.value['numero_clase_enf_acc']}"
                                                    toolTip="BundleParametros.numero_clase_enf_acc.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroClaseEnfAcc1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroClaseEnfAcc1Texto1}"
                                                    text="#{currentRow.value['codigo_clase_enf_acc_1x18y2']}"/>
                                                <webuijsf:message id="messageNumeroClaseEnfAcc1"
                                                    for="listaNumeroClaseEnfAcc1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnOtraClaseEnfAcc1}"
                                                    headerText="otra clase enfermedad accidente"
                                                    id="tableColumnOtraClaseEnfAcc1" rendered="false"
                                                    sort="otra_clase_enf_acc">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtraClaseEnfAcc1"
                                                    text="#{currentRow.value['otra_clase_enf_acc']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelOtraClaseEnfAcc1}"
                                                    id="labelOtraClaseEnfAcc1"
                                                    for="campoOtraClaseEnfAcc1"/>
                                                <webuijsf:textField id="campoOtraClaseEnfAcc1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoOtraClaseEnfAcc1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otra_clase_enf_acc']}"
                                                    toolTip="BundleParametros.otra_clase_enf_acc.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorOtraClaseEnfAcc1.validate}"/>
                                                <webuijsf:staticText id="campoOtraClaseEnfAcc1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoOtraClaseEnfAcc1Texto1}"
                                                    text="#{currentRow.value['otra_clase_enf_acc']}"/>
                                                <webuijsf:message id="messageOtraClaseEnfAcc1"
                                                    for="campoOtraClaseEnfAcc1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroClaseEnfCronica1}"
                                                    headerText="clase enfermedad cronica"
                                                    id="tableColumnNumeroClaseEnfCronica1" rendered="false"
                                                    sort="codigo_clase_enf_cronic_1x19y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroClaseEnfCronica1"
                                                    text="#{currentRow.value['codigo_clase_enf_cronic_1x19y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroClaseEnfCronica1}"
                                                    id="labelNumeroClaseEnfCronica1"
                                                    for="listaNumeroClaseEnfCronica1"/>
                                                <webuijsf:dropDown id="listaNumeroClaseEnfCronica1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroClaseEnfCronica1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroClaseEnfCronica1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroClaseEnfCronica1}"
                                                    selected="#{currentRow.value['numero_clase_enf_cronica']}"
                                                    toolTip="BundleParametros.numero_clase_enf_cronica.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroClaseEnfCronica1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroClaseEnfCronica1Texto1}"
                                                    text="#{currentRow.value['codigo_clase_enf_cronic_1x19y2']}"/>
                                                <webuijsf:message id="messageNumeroClaseEnfCronica1"
                                                    for="listaNumeroClaseEnfCronica1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnOtraClaseEnfCronica1}"
                                                    headerText="otra clase enfermedad cronica"
                                                    id="tableColumnOtraClaseEnfCronica1" rendered="false"
                                                    sort="otra_clase_enf_cronica">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtraClaseEnfCronica1"
                                                    text="#{currentRow.value['otra_clase_enf_cronica']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelOtraClaseEnfCronica1}"
                                                    id="labelOtraClaseEnfCronica1"
                                                    for="campoOtraClaseEnfCronica1"/>
                                                <webuijsf:textField id="campoOtraClaseEnfCronica1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoOtraClaseEnfCronica1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otra_clase_enf_cronica']}"
                                                    toolTip="BundleParametros.otra_clase_enf_cronica.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorOtraClaseEnfCronica1.validate}"/>
                                                <webuijsf:staticText id="campoOtraClaseEnfCronica1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoOtraClaseEnfCronica1Texto1}"
                                                    text="#{currentRow.value['otra_clase_enf_cronica']}"/>
                                                <webuijsf:message id="messageOtraClaseEnfCronica1"
                                                    for="campoOtraClaseEnfCronica1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroSionoAtencionMedica1}"
                                                    headerText="atencion medica"
                                                    id="tableColumnNumeroSionoAtencionMedica1" rendered="false"
                                                    sort="codigo_siono_1x20y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoAtencionMedica1"
                                                    text="#{currentRow.value['codigo_siono_1x20y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroSionoAtencionMedica1}"
                                                    id="labelNumeroSionoAtencionMedica1"
                                                    for="listaNumeroSionoAtencionMedica1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoAtencionMedica1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoAtencionMedica1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroSionoAtencionMedica1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroSionoAtencionMedica1}"
                                                    selected="#{currentRow.value['numero_siono_atencion_medica']}"
                                                    toolTip="BundleParametros.numero_siono_atencion_medica.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoAtencionMedica1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoAtencionMedica1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x20y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoAtencionMedica1"
                                                    for="listaNumeroSionoAtencionMedica1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroMotivoNoAtencion1}"
                                                    headerText="motivo no atencion"
                                                    id="tableColumnNumeroMotivoNoAtencion1" rendered="false"
                                                    sort="codigo_motivo_no_atenci_1x21y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroMotivoNoAtencion1"
                                                    text="#{currentRow.value['codigo_motivo_no_atenci_1x21y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroMotivoNoAtencion1}"
                                                    id="labelNumeroMotivoNoAtencion1"
                                                    for="listaNumeroMotivoNoAtencion1"/>
                                                <webuijsf:dropDown id="listaNumeroMotivoNoAtencion1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroMotivoNoAtencion1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroMotivoNoAtencion1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroMotivoNoAtencion1}"
                                                    selected="#{currentRow.value['numero_motivo_no_atencion']}"
                                                    toolTip="BundleParametros.numero_motivo_no_atencion.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroMotivoNoAtencion1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroMotivoNoAtencion1Texto1}"
                                                    text="#{currentRow.value['codigo_motivo_no_atenci_1x21y2']}"/>
                                                <webuijsf:message id="messageNumeroMotivoNoAtencion1"
                                                    for="listaNumeroMotivoNoAtencion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnOtroMotivoNoAtencion1}"
                                                    headerText="otro motivo no atencion"
                                                    id="tableColumnOtroMotivoNoAtencion1" rendered="false"
                                                    sort="otro_motivo_no_atencion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtroMotivoNoAtencion1"
                                                    text="#{currentRow.value['otro_motivo_no_atencion']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelOtroMotivoNoAtencion1}"
                                                    id="labelOtroMotivoNoAtencion1"
                                                    for="campoOtroMotivoNoAtencion1"/>
                                                <webuijsf:textField id="campoOtroMotivoNoAtencion1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoOtroMotivoNoAtencion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otro_motivo_no_atencion']}"
                                                    toolTip="BundleParametros.otro_motivo_no_atencion.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorOtroMotivoNoAtencion1.validate}"/>
                                                <webuijsf:staticText id="campoOtroMotivoNoAtencion1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoOtroMotivoNoAtencion1Texto1}"
                                                    text="#{currentRow.value['otro_motivo_no_atencion']}"/>
                                                <webuijsf:message id="messageOtroMotivoNoAtencion1"
                                                    for="campoOtroMotivoNoAtencion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroSionoCarnetVacunacion1}"
                                                    headerText="carnet vacunacion"
                                                    id="tableColumnNumeroSionoCarnetVacunacion1" rendered="false"
                                                    sort="codigo_siono_1x22y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoCarnetVacunacion1"
                                                    text="#{currentRow.value['codigo_siono_1x22y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroSionoCarnetVacunacion1}"
                                                    id="labelNumeroSionoCarnetVacunacion1"
                                                    for="listaNumeroSionoCarnetVacunacion1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoCarnetVacunacion1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoCarnetVacunacion1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroSionoCarnetVacunacion1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroSionoCarnetVacunacion1}"
                                                    selected="#{currentRow.value['numero_siono_carnet_vacunacion']}"
                                                    toolTip="BundleParametros.numero_siono_carnet_vacunacion.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoCarnetVacunacion1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoCarnetVacunacion1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x22y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoCarnetVacunacion1"
                                                    for="listaNumeroSionoCarnetVacunacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroClaseImpedimento1}"
                                                    headerText="clase impedimento"
                                                    id="tableColumnNumeroClaseImpedimento1" rendered="false"
                                                    sort="codigo_clase_impediment_1x23y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroClaseImpedimento1"
                                                    text="#{currentRow.value['codigo_clase_impediment_1x23y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroClaseImpedimento1}"
                                                    id="labelNumeroClaseImpedimento1"
                                                    for="listaNumeroClaseImpedimento1"/>
                                                <webuijsf:dropDown id="listaNumeroClaseImpedimento1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroClaseImpedimento1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroClaseImpedimento1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroClaseImpedimento1}"
                                                    selected="#{currentRow.value['numero_clase_impedimento']}"
                                                    toolTip="BundleParametros.numero_clase_impedimento.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroClaseImpedimento1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroClaseImpedimento1Texto1}"
                                                    text="#{currentRow.value['codigo_clase_impediment_1x23y2']}"/>
                                                <webuijsf:message id="messageNumeroClaseImpedimento1"
                                                    for="listaNumeroClaseImpedimento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnOtraClaseImpedimento1}"
                                                    headerText="otra clase impedimento"
                                                    id="tableColumnOtraClaseImpedimento1" rendered="false"
                                                    sort="otra_clase_impedimento">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtraClaseImpedimento1"
                                                    text="#{currentRow.value['otra_clase_impedimento']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelOtraClaseImpedimento1}"
                                                    id="labelOtraClaseImpedimento1"
                                                    for="campoOtraClaseImpedimento1"/>
                                                <webuijsf:textField id="campoOtraClaseImpedimento1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoOtraClaseImpedimento1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otra_clase_impedimento']}"
                                                    toolTip="BundleParametros.otra_clase_impedimento.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorOtraClaseImpedimento1.validate}"/>
                                                <webuijsf:staticText id="campoOtraClaseImpedimento1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoOtraClaseImpedimento1Texto1}"
                                                    text="#{currentRow.value['otra_clase_impedimento']}"/>
                                                <webuijsf:message id="messageOtraClaseImpedimento1"
                                                    for="campoOtraClaseImpedimento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroCausaImpedimento1}"
                                                    headerText="causa impedimento"
                                                    id="tableColumnNumeroCausaImpedimento1" rendered="false"
                                                    sort="codigo_causa_impediment_1x24y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCausaImpedimento1"
                                                    text="#{currentRow.value['codigo_causa_impediment_1x24y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroCausaImpedimento1}"
                                                    id="labelNumeroCausaImpedimento1"
                                                    for="listaNumeroCausaImpedimento1"/>
                                                <webuijsf:dropDown id="listaNumeroCausaImpedimento1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroCausaImpedimento1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroCausaImpedimento1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroCausaImpedimento1}"
                                                    selected="#{currentRow.value['numero_causa_impedimento']}"
                                                    toolTip="BundleParametros.numero_causa_impedimento.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroCausaImpedimento1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroCausaImpedimento1Texto1}"
                                                    text="#{currentRow.value['codigo_causa_impediment_1x24y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaImpedimento1"
                                                    for="listaNumeroCausaImpedimento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnOtraCausaImpedimento1}"
                                                    headerText="otra causa impedimento"
                                                    id="tableColumnOtraCausaImpedimento1" rendered="false"
                                                    sort="otra_causa_impedimento">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtraCausaImpedimento1"
                                                    text="#{currentRow.value['otra_causa_impedimento']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelOtraCausaImpedimento1}"
                                                    id="labelOtraCausaImpedimento1"
                                                    for="campoOtraCausaImpedimento1"/>
                                                <webuijsf:textField id="campoOtraCausaImpedimento1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoOtraCausaImpedimento1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otra_causa_impedimento']}"
                                                    toolTip="BundleParametros.otra_causa_impedimento.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorOtraCausaImpedimento1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaImpedimento1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoOtraCausaImpedimento1Texto1}"
                                                    text="#{currentRow.value['otra_causa_impedimento']}"/>
                                                <webuijsf:message id="messageOtraCausaImpedimento1"
                                                    for="campoOtraCausaImpedimento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroSionoDifParaCaminar1}"
                                                    headerText="dificultad para caminar"
                                                    id="tableColumnNumeroSionoDifParaCaminar1" rendered="false"
                                                    sort="codigo_siono_1x25y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDifParaCaminar1"
                                                    text="#{currentRow.value['codigo_siono_1x25y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroSionoDifParaCaminar1}"
                                                    id="labelNumeroSionoDifParaCaminar1"
                                                    for="listaNumeroSionoDifParaCaminar1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaCaminar1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoDifParaCaminar1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroSionoDifParaCaminar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroSionoDifParaCaminar1}"
                                                    selected="#{currentRow.value['numero_siono_dif_para_caminar']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_caminar.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaCaminar1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoDifParaCaminar1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x25y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaCaminar1"
                                                    for="listaNumeroSionoDifParaCaminar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroSionoDifParaVestirse1}"
                                                    headerText="dificultad para vestirse"
                                                    id="tableColumnNumeroSionoDifParaVestirse1" rendered="false"
                                                    sort="codigo_siono_1x26y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDifParaVestirse1"
                                                    text="#{currentRow.value['codigo_siono_1x26y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroSionoDifParaVestirse1}"
                                                    id="labelNumeroSionoDifParaVestirse1"
                                                    for="listaNumeroSionoDifParaVestirse1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaVestirse1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoDifParaVestirse1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroSionoDifParaVestirse1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroSionoDifParaVestirse1}"
                                                    selected="#{currentRow.value['numero_siono_dif_para_vestirse']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_vestirse.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaVestirse1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoDifParaVestirse1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x26y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaVestirse1"
                                                    for="listaNumeroSionoDifParaVestirse1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroSionoDifParaBanarse1}"
                                                    headerText="dificultad para banarse"
                                                    id="tableColumnNumeroSionoDifParaBanarse1" rendered="false"
                                                    sort="codigo_siono_1x27y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDifParaBanarse1"
                                                    text="#{currentRow.value['codigo_siono_1x27y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroSionoDifParaBanarse1}"
                                                    id="labelNumeroSionoDifParaBanarse1"
                                                    for="listaNumeroSionoDifParaBanarse1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaBanarse1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoDifParaBanarse1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroSionoDifParaBanarse1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroSionoDifParaBanarse1}"
                                                    selected="#{currentRow.value['numero_siono_dif_para_banarse']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_banarse.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaBanarse1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoDifParaBanarse1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x27y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaBanarse1"
                                                    for="listaNumeroSionoDifParaBanarse1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroSionoDifParaComer1}"
                                                    headerText="dificultad para comer"
                                                    id="tableColumnNumeroSionoDifParaComer1" rendered="false"
                                                    sort="codigo_siono_1x28y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDifParaComer1"
                                                    text="#{currentRow.value['codigo_siono_1x28y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroSionoDifParaComer1}"
                                                    id="labelNumeroSionoDifParaComer1"
                                                    for="listaNumeroSionoDifParaComer1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaComer1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoDifParaComer1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroSionoDifParaComer1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroSionoDifParaComer1}"
                                                    selected="#{currentRow.value['numero_siono_dif_para_comer']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_comer.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaComer1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoDifParaComer1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x28y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaComer1"
                                                    for="listaNumeroSionoDifParaComer1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroSionoDifParaLaCama1}"
                                                    headerText="dificultad para la cama"
                                                    id="tableColumnNumeroSionoDifParaLaCama1" rendered="false"
                                                    sort="codigo_siono_1x29y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDifParaLaCama1"
                                                    text="#{currentRow.value['codigo_siono_1x29y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroSionoDifParaLaCama1}"
                                                    id="labelNumeroSionoDifParaLaCama1"
                                                    for="listaNumeroSionoDifParaLaCama1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaLaCama1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoDifParaLaCama1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroSionoDifParaLaCama1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroSionoDifParaLaCama1}"
                                                    selected="#{currentRow.value['numero_siono_dif_para_la_cama']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_la_cama.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaLaCama1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoDifParaLaCama1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x29y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaLaCama1"
                                                    for="listaNumeroSionoDifParaLaCama1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroSionoDifParaElBano1}"
                                                    headerText="dificultad para el baño"
                                                    id="tableColumnNumeroSionoDifParaElBano1" rendered="false"
                                                    sort="codigo_siono_1x30y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDifParaElBano1"
                                                    text="#{currentRow.value['codigo_siono_1x30y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroSionoDifParaElBano1}"
                                                    id="labelNumeroSionoDifParaElBano1"
                                                    for="listaNumeroSionoDifParaElBano1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaElBano1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoDifParaElBano1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroSionoDifParaElBano1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroSionoDifParaElBano1}"
                                                    selected="#{currentRow.value['numero_siono_dif_para_el_bano']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_el_bano.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaElBano1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoDifParaElBano1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x30y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaElBano1"
                                                    for="listaNumeroSionoDifParaElBano1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroSionoTrabajo1}"
                                                    headerText="trabajo"
                                                    id="tableColumnNumeroSionoTrabajo1" rendered="false"
                                                    sort="codigo_siono_1x31y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoTrabajo1"
                                                    text="#{currentRow.value['codigo_siono_1x31y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroSionoTrabajo1}"
                                                    id="labelNumeroSionoTrabajo1"
                                                    for="listaNumeroSionoTrabajo1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoTrabajo1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoTrabajo1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroSionoTrabajo1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroSionoTrabajo1}"
                                                    selected="#{currentRow.value['numero_siono_trabajo']}"
                                                    toolTip="BundleParametros.numero_siono_trabajo.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoTrabajo1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroSionoTrabajo1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x31y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoTrabajo1"
                                                    for="listaNumeroSionoTrabajo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroMotivoNoTrabajo1}"
                                                    headerText="motivo no trabajo"
                                                    id="tableColumnNumeroMotivoNoTrabajo1" rendered="false"
                                                    sort="codigo_motivo_no_trabaj_1x32y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroMotivoNoTrabajo1"
                                                    text="#{currentRow.value['codigo_motivo_no_trabaj_1x32y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroMotivoNoTrabajo1}"
                                                    id="labelNumeroMotivoNoTrabajo1"
                                                    for="listaNumeroMotivoNoTrabajo1"/>
                                                <webuijsf:dropDown id="listaNumeroMotivoNoTrabajo1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroMotivoNoTrabajo1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroMotivoNoTrabajo1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroMotivoNoTrabajo1}"
                                                    selected="#{currentRow.value['numero_motivo_no_trabajo']}"
                                                    toolTip="BundleParametros.numero_motivo_no_trabajo.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroMotivoNoTrabajo1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroMotivoNoTrabajo1Texto1}"
                                                    text="#{currentRow.value['codigo_motivo_no_trabaj_1x32y2']}"/>
                                                <webuijsf:message id="messageNumeroMotivoNoTrabajo1"
                                                    for="listaNumeroMotivoNoTrabajo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnOtroMotivoNoTrabajo1}"
                                                    headerText="otro motivo no trabajo"
                                                    id="tableColumnOtroMotivoNoTrabajo1" rendered="false"
                                                    sort="otro_motivo_no_trabajo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtroMotivoNoTrabajo1"
                                                    text="#{currentRow.value['otro_motivo_no_trabajo']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelOtroMotivoNoTrabajo1}"
                                                    id="labelOtroMotivoNoTrabajo1"
                                                    for="campoOtroMotivoNoTrabajo1"/>
                                                <webuijsf:textField id="campoOtroMotivoNoTrabajo1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoOtroMotivoNoTrabajo1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otro_motivo_no_trabajo']}"
                                                    toolTip="BundleParametros.otro_motivo_no_trabajo.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorOtroMotivoNoTrabajo1.validate}"/>
                                                <webuijsf:staticText id="campoOtroMotivoNoTrabajo1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoOtroMotivoNoTrabajo1Texto1}"
                                                    text="#{currentRow.value['otro_motivo_no_trabajo']}"/>
                                                <webuijsf:message id="messageOtroMotivoNoTrabajo1"
                                                    for="campoOtroMotivoNoTrabajo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnDescripcionOcupacionPrin1}"
                                                    headerText="descripcion ocupacion principal"
                                                    id="tableColumnDescripcionOcupacionPrin1" rendered="false"
                                                    sort="descripcion_ocupacion_prin">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionOcupacionPrin1"
                                                    text="#{currentRow.value['descripcion_ocupacion_prin']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelDescripcionOcupacionPrin1}"
                                                    id="labelDescripcionOcupacionPrin1"
                                                    for="campoDescripcionOcupacionPrin1"/>
                                                <webuijsf:textField id="campoDescripcionOcupacionPrin1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoDescripcionOcupacionPrin1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_ocupacion_prin']}"
                                                    toolTip="BundleParametros.descripcion_ocupacion_prin.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorDescripcionOcupacionPrin1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionOcupacionPrin1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoDescripcionOcupacionPrin1Texto1}"
                                                    text="#{currentRow.value['descripcion_ocupacion_prin']}"/>
                                                <webuijsf:message id="messageDescripcionOcupacionPrin1"
                                                    for="campoDescripcionOcupacionPrin1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnDescripcionDedicacionPrin1}"
                                                    headerText="descripcion dedicacion principal"
                                                    id="tableColumnDescripcionDedicacionPrin1" rendered="false"
                                                    sort="descripcion_dedicacion_prin">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionDedicacionPrin1"
                                                    text="#{currentRow.value['descripcion_dedicacion_prin']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelDescripcionDedicacionPrin1}"
                                                    id="labelDescripcionDedicacionPrin1"
                                                    for="campoDescripcionDedicacionPrin1"/>
                                                <webuijsf:textField id="campoDescripcionDedicacionPrin1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoDescripcionDedicacionPrin1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_dedicacion_prin']}"
                                                    toolTip="BundleParametros.descripcion_dedicacion_prin.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorDescripcionDedicacionPrin1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionDedicacionPrin1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoDescripcionDedicacionPrin1Texto1}"
                                                    text="#{currentRow.value['descripcion_dedicacion_prin']}"/>
                                                <webuijsf:message id="messageDescripcionDedicacionPrin1"
                                                    for="campoDescripcionDedicacionPrin1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnNumeroTipoRelacionLab1}"
                                                    headerText="tipo relacion laboral"
                                                    id="tableColumnNumeroTipoRelacionLab1" rendered="false"
                                                    sort="codigo_tipo_relacion_la_1x33y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoRelacionLab1"
                                                    text="#{currentRow.value['codigo_tipo_relacion_la_1x33y2']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelNumeroTipoRelacionLab1}"
                                                    id="labelNumeroTipoRelacionLab1"
                                                    for="listaNumeroTipoRelacionLab1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoRelacionLab1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroTipoRelacionLab1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterNumeroTipoRelacionLab1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar1.asistente.opcionesListaNumeroTipoRelacionLab1}"
                                                    selected="#{currentRow.value['numero_tipo_relacion_lab']}"
                                                    toolTip="BundleParametros.numero_tipo_relacion_lab.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoRelacionLab1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.listaNumeroTipoRelacionLab1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_relacion_la_1x33y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoRelacionLab1"
                                                    for="listaNumeroTipoRelacionLab1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnMontoIngresoOcupacionPrin1}"
                                                    headerText="monto ingreso ocupacion principal"
                                                    id="tableColumnMontoIngresoOcupacionPrin1" rendered="false"
                                                    sort="monto_ingreso_ocupacion_prin">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoOcupacionPrin1"
                                                    text="#{currentRow.value['monto_ingreso_ocupacion_prin']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelMontoIngresoOcupacionPrin1}"
                                                    id="labelMontoIngresoOcupacionPrin1"
                                                    for="campoMontoIngresoOcupacionPrin1"/>
                                                <webuijsf:textField id="campoMontoIngresoOcupacionPrin1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoOcupacionPrin1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoOcupacionPrin1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_ocupacion_prin']}"
                                                    toolTip="BundleParametros.monto_ingreso_ocupacion_prin.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorMontoIngresoOcupacionPrin1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoOcupacionPrin1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoOcupacionPrin1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoOcupacionPrin1}"
                                                    text="#{currentRow.value['monto_ingreso_ocupacion_prin']}"/>
                                                <webuijsf:message id="messageMontoIngresoOcupacionPrin1"
                                                    for="campoMontoIngresoOcupacionPrin1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnMontoIngresoOcupacionSecun1}"
                                                    headerText="monto ingreso ocupacion secundaria"
                                                    id="tableColumnMontoIngresoOcupacionSecun1" rendered="false"
                                                    sort="monto_ingreso_ocupacion_secun">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoOcupacionSecun1"
                                                    text="#{currentRow.value['monto_ingreso_ocupacion_secun']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelMontoIngresoOcupacionSecun1}"
                                                    id="labelMontoIngresoOcupacionSecun1"
                                                    for="campoMontoIngresoOcupacionSecun1"/>
                                                <webuijsf:textField id="campoMontoIngresoOcupacionSecun1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoOcupacionSecun1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoOcupacionSecun1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_ocupacion_secun']}"
                                                    toolTip="BundleParametros.monto_ingreso_ocupacion_secun.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorMontoIngresoOcupacionSecun1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoOcupacionSecun1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoOcupacionSecun1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoOcupacionSecun1}"
                                                    text="#{currentRow.value['monto_ingreso_ocupacion_secun']}"/>
                                                <webuijsf:message id="messageMontoIngresoOcupacionSecun1"
                                                    for="campoMontoIngresoOcupacionSecun1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnMontoIngresoOtrasOcup1}"
                                                    headerText="monto ingreso otras ocupaciones"
                                                    id="tableColumnMontoIngresoOtrasOcup1" rendered="false"
                                                    sort="monto_ingreso_otras_ocup">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoOtrasOcup1"
                                                    text="#{currentRow.value['monto_ingreso_otras_ocup']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelMontoIngresoOtrasOcup1}"
                                                    id="labelMontoIngresoOtrasOcup1"
                                                    for="campoMontoIngresoOtrasOcup1"/>
                                                <webuijsf:textField id="campoMontoIngresoOtrasOcup1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoOtrasOcup1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoOtrasOcup1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_otras_ocup']}"
                                                    toolTip="BundleParametros.monto_ingreso_otras_ocup.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorMontoIngresoOtrasOcup1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoOtrasOcup1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoOtrasOcup1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoOtrasOcup1}"
                                                    text="#{currentRow.value['monto_ingreso_otras_ocup']}"/>
                                                <webuijsf:message id="messageMontoIngresoOtrasOcup1"
                                                    for="campoMontoIngresoOtrasOcup1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnMontoIngresoAlquileres1}"
                                                    headerText="monto ingreso alquileres"
                                                    id="tableColumnMontoIngresoAlquileres1" rendered="false"
                                                    sort="monto_ingreso_alquileres">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoAlquileres1"
                                                    text="#{currentRow.value['monto_ingreso_alquileres']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelMontoIngresoAlquileres1}"
                                                    id="labelMontoIngresoAlquileres1"
                                                    for="campoMontoIngresoAlquileres1"/>
                                                <webuijsf:textField id="campoMontoIngresoAlquileres1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoAlquileres1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoAlquileres1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_alquileres']}"
                                                    toolTip="BundleParametros.monto_ingreso_alquileres.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorMontoIngresoAlquileres1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoAlquileres1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoAlquileres1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoAlquileres1}"
                                                    text="#{currentRow.value['monto_ingreso_alquileres']}"/>
                                                <webuijsf:message id="messageMontoIngresoAlquileres1"
                                                    for="campoMontoIngresoAlquileres1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnMontoIngresoIntereses1}"
                                                    headerText="monto ingreso intereses"
                                                    id="tableColumnMontoIngresoIntereses1" rendered="false"
                                                    sort="monto_ingreso_intereses">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoIntereses1"
                                                    text="#{currentRow.value['monto_ingreso_intereses']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelMontoIngresoIntereses1}"
                                                    id="labelMontoIngresoIntereses1"
                                                    for="campoMontoIngresoIntereses1"/>
                                                <webuijsf:textField id="campoMontoIngresoIntereses1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoIntereses1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoIntereses1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_intereses']}"
                                                    toolTip="BundleParametros.monto_ingreso_intereses.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorMontoIngresoIntereses1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoIntereses1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoIntereses1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoIntereses1}"
                                                    text="#{currentRow.value['monto_ingreso_intereses']}"/>
                                                <webuijsf:message id="messageMontoIngresoIntereses1"
                                                    for="campoMontoIngresoIntereses1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnMontoIngresoAyudaFamPais1}"
                                                    headerText="monto ingreso ayuda familiar pais"
                                                    id="tableColumnMontoIngresoAyudaFamPais1" rendered="false"
                                                    sort="monto_ingreso_ayuda_fam_pais">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoAyudaFamPais1"
                                                    text="#{currentRow.value['monto_ingreso_ayuda_fam_pais']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelMontoIngresoAyudaFamPais1}"
                                                    id="labelMontoIngresoAyudaFamPais1"
                                                    for="campoMontoIngresoAyudaFamPais1"/>
                                                <webuijsf:textField id="campoMontoIngresoAyudaFamPais1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoAyudaFamPais1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoAyudaFamPais1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_ayuda_fam_pais']}"
                                                    toolTip="BundleParametros.monto_ingreso_ayuda_fam_pais.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorMontoIngresoAyudaFamPais1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoAyudaFamPais1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoAyudaFamPais1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoAyudaFamPais1}"
                                                    text="#{currentRow.value['monto_ingreso_ayuda_fam_pais']}"/>
                                                <webuijsf:message id="messageMontoIngresoAyudaFamPais1"
                                                    for="campoMontoIngresoAyudaFamPais1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnMontoIngresoAyudaFamExter1}"
                                                    headerText="monto ingreso ayuda familiar exterior"
                                                    id="tableColumnMontoIngresoAyudaFamExter1" rendered="false"
                                                    sort="monto_ingreso_ayuda_fam_exter">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoAyudaFamExter1"
                                                    text="#{currentRow.value['monto_ingreso_ayuda_fam_exter']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelMontoIngresoAyudaFamExter1}"
                                                    id="labelMontoIngresoAyudaFamExter1"
                                                    for="campoMontoIngresoAyudaFamExter1"/>
                                                <webuijsf:textField id="campoMontoIngresoAyudaFamExter1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoAyudaFamExter1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoAyudaFamExter1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_ayuda_fam_exter']}"
                                                    toolTip="BundleParametros.monto_ingreso_ayuda_fam_exter.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorMontoIngresoAyudaFamExter1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoAyudaFamExter1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoAyudaFamExter1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoAyudaFamExter1}"
                                                    text="#{currentRow.value['monto_ingreso_ayuda_fam_exter']}"/>
                                                <webuijsf:message id="messageMontoIngresoAyudaFamExter1"
                                                    for="campoMontoIngresoAyudaFamExter1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnMontoIngresoJubilacion1}"
                                                    headerText="monto ingreso jubilacion"
                                                    id="tableColumnMontoIngresoJubilacion1" rendered="false"
                                                    sort="monto_ingreso_jubilacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoJubilacion1"
                                                    text="#{currentRow.value['monto_ingreso_jubilacion']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelMontoIngresoJubilacion1}"
                                                    id="labelMontoIngresoJubilacion1"
                                                    for="campoMontoIngresoJubilacion1"/>
                                                <webuijsf:textField id="campoMontoIngresoJubilacion1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoJubilacion1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoJubilacion1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_jubilacion']}"
                                                    toolTip="BundleParametros.monto_ingreso_jubilacion.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorMontoIngresoJubilacion1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoJubilacion1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoJubilacion1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoJubilacion1}"
                                                    text="#{currentRow.value['monto_ingreso_jubilacion']}"/>
                                                <webuijsf:message id="messageMontoIngresoJubilacion1"
                                                    for="campoMontoIngresoJubilacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnMontoIngresoPensiones1}"
                                                    headerText="monto ingreso pensiones"
                                                    id="tableColumnMontoIngresoPensiones1" rendered="false"
                                                    sort="monto_ingreso_pensiones">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoPensiones1"
                                                    text="#{currentRow.value['monto_ingreso_pensiones']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelMontoIngresoPensiones1}"
                                                    id="labelMontoIngresoPensiones1"
                                                    for="campoMontoIngresoPensiones1"/>
                                                <webuijsf:textField id="campoMontoIngresoPensiones1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoPensiones1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoPensiones1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_pensiones']}"
                                                    toolTip="BundleParametros.monto_ingreso_pensiones.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorMontoIngresoPensiones1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoPensiones1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoPensiones1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoPensiones1}"
                                                    text="#{currentRow.value['monto_ingreso_pensiones']}"/>
                                                <webuijsf:message id="messageMontoIngresoPensiones1"
                                                    for="campoMontoIngresoPensiones1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnMontoIngresoTekopora1}"
                                                    headerText="monto ingreso tekopora"
                                                    id="tableColumnMontoIngresoTekopora1" rendered="false"
                                                    sort="monto_ingreso_tekopora">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoTekopora1"
                                                    text="#{currentRow.value['monto_ingreso_tekopora']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelMontoIngresoTekopora1}"
                                                    id="labelMontoIngresoTekopora1"
                                                    for="campoMontoIngresoTekopora1"/>
                                                <webuijsf:textField id="campoMontoIngresoTekopora1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoTekopora1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoTekopora1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_tekopora']}"
                                                    toolTip="BundleParametros.monto_ingreso_tekopora.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorMontoIngresoTekopora1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoTekopora1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoTekopora1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoTekopora1}"
                                                    text="#{currentRow.value['monto_ingreso_tekopora']}"/>
                                                <webuijsf:message id="messageMontoIngresoTekopora1"
                                                    for="campoMontoIngresoTekopora1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnMontoIngresoProgramas1}"
                                                    headerText="monto ingreso programas"
                                                    id="tableColumnMontoIngresoProgramas1" rendered="false"
                                                    sort="monto_ingreso_programas">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoProgramas1"
                                                    text="#{currentRow.value['monto_ingreso_programas']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelMontoIngresoProgramas1}"
                                                    id="labelMontoIngresoProgramas1"
                                                    for="campoMontoIngresoProgramas1"/>
                                                <webuijsf:textField id="campoMontoIngresoProgramas1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoProgramas1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoProgramas1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_programas']}"
                                                    toolTip="BundleParametros.monto_ingreso_programas.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorMontoIngresoProgramas1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoProgramas1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoProgramas1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoProgramas1}"
                                                    text="#{currentRow.value['monto_ingreso_programas']}"/>
                                                <webuijsf:message id="messageMontoIngresoProgramas1"
                                                    for="campoMontoIngresoProgramas1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnMontoIngresoAdicional1}"
                                                    headerText="monto ingreso adicional"
                                                    id="tableColumnMontoIngresoAdicional1" rendered="false"
                                                    sort="monto_ingreso_adicional">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoAdicional1"
                                                    text="#{currentRow.value['monto_ingreso_adicional']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelMontoIngresoAdicional1}"
                                                    id="labelMontoIngresoAdicional1"
                                                    for="campoMontoIngresoAdicional1"/>
                                                <webuijsf:textField id="campoMontoIngresoAdicional1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoAdicional1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoAdicional1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_adicional']}"
                                                    toolTip="BundleParametros.monto_ingreso_adicional.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorMontoIngresoAdicional1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoAdicional1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoMontoIngresoAdicional1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterMontoIngresoAdicional1}"
                                                    text="#{currentRow.value['monto_ingreso_adicional']}"/>
                                                <webuijsf:message id="messageMontoIngresoAdicional1"
                                                    for="campoMontoIngresoAdicional1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnTotalIngresoMensual1}"
                                                    headerText="total ingreso mensual"
                                                    id="tableColumnTotalIngresoMensual1" rendered="false"
                                                    sort="total_ingreso_mensual">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextTotalIngresoMensual1"
                                                    text="#{currentRow.value['total_ingreso_mensual']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelTotalIngresoMensual1}"
                                                    id="labelTotalIngresoMensual1"
                                                    for="campoTotalIngresoMensual1"/>
                                                <webuijsf:textField id="campoTotalIngresoMensual1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoTotalIngresoMensual1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterTotalIngresoMensual1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['total_ingreso_mensual']}"
                                                    toolTip="BundleParametros.total_ingreso_mensual.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.validatorTotalIngresoMensual1.validate}"/>
                                                <webuijsf:staticText id="campoTotalIngresoMensual1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoTotalIngresoMensual1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterTotalIngresoMensual1}"
                                                    text="#{currentRow.value['total_ingreso_mensual']}"/>
                                                <webuijsf:message id="messageTotalIngresoMensual1"
                                                    for="campoTotalIngresoMensual1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnIdPotencialBen1}"
                                                    headerText="potencial beneficiario"
                                                    id="tableColumnIdPotencialBen1" rendered="false"
                                                    sort="codigo_potencial_ben_1x34y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPotencialBen1"
                                                    text="#{currentRow.value['codigo_potencial_ben_1x34y3']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelIdPotencialBen1}"
                                                    id="labelIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                <webuijsf:textField id="campoIdPotencialBen1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdPotencialBen1}"
                                                    readOnly="true"
                                                    text="#{FichaPersonaPorFichaHogar1.asistente.textoCampoIdPotencialBen1}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.asistente.toolTipCampoIdPotencialBen1}"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar1.campoIdPotencialBen1_validate}"/>
                                                <webuijsf:staticText id="campoIdPotencialBen1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdPotencialBen1Texto1}"
                                                    text="#{currentRow.value['codigo_potencial_ben_1x34y3']}"/>
                                                <webuijsf:message id="messageIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdPotencialBen3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPotencialBen3"
                                                    text="#{currentRow.value['id_potencial_ben']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdPotencialBen1Boton1}"
                                                    id="campoIdPotencialBen1Boton1"
                                                    onClick="#{FichaPersonaPorFichaHogar1.asistente.scriptCampoIdPotencialBen1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdPotencialBen1Boton3}"
                                                    id="campoIdPotencialBen1Boton3"
                                                    onClick="#{FichaPersonaPorFichaHogar1.asistente.scriptCampoIdPotencialBen1Boton2}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.asistente.campoIdPotencialBen1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FichaPersonaPorFichaHogar1.tableColumnIdPotencialBen2}"
                                                    headerText="nombre potencial beneficiario"
                                                    id="tableColumnIdPotencialBen2" rendered="false"
                                                    sort="nombre_potencial_ben_1x34y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPotencialBen2"
                                                    text="#{currentRow.value['nombre_potencial_ben_1x34y4']}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar1.labelIdPotencialBen2}"
                                                    id="labelIdPotencialBen2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FichaPersonaPorFichaHogar1.campoIdPotencialBen1Hiper1}"
                                                    id="campoIdPotencialBen1Hiper1"
                                                    text="#{currentRow.value['nombre_potencial_ben_1x34y4']}"
                                                    onClick="#{FichaPersonaPorFichaHogar1.asistente.scriptCampoIdPotencialBen1Boton2}"/>
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
                                                        binding="#{FichaPersonaPorFichaHogar1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{FichaPersonaPorFichaHogar1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{FichaPersonaPorFichaHogar1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{FichaPersonaPorFichaHogar1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{FichaPersonaPorFichaHogar1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{FichaPersonaPorFichaHogar1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FichaPersonaPorFichaHogar1.botonRepaginar1_action}"
                                                        binding="#{FichaPersonaPorFichaHogar1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{FichaPersonaPorFichaHogar1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{FichaPersonaPorFichaHogar1.gestor.scriptRepaginar}"
                                                        text="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar1.botonAgregar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar1.botonAgregar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{FichaPersonaPorFichaHogar1.gestor.scriptAgregar}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FichaPersonaPorFichaHogar1.listaFuncionEdicion1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterListaFuncionEdicion1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{FichaPersonaPorFichaHogar1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{FichaPersonaPorFichaHogar1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar1.botonEditar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar1.botonEditar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{FichaPersonaPorFichaHogar1.gestor.scriptEditar}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar1.botonEliminar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar1.botonEliminar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{FichaPersonaPorFichaHogar1.gestor.scriptEliminar}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar1.botonAplicar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{FichaPersonaPorFichaHogar1.gestor.scriptAplicar}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar1.botonDeshacer1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{FichaPersonaPorFichaHogar1.gestor.scriptDeshacer}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar1.botonConfirmar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{FichaPersonaPorFichaHogar1.gestor.scriptConfirmar}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar1.botonDescartar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{FichaPersonaPorFichaHogar1.gestor.scriptDescartar}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FichaPersonaPorFichaHogar1.listaFuncionAccion1}"
                                                    converter="#{FichaPersonaPorFichaHogar1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{FichaPersonaPorFichaHogar1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{FichaPersonaPorFichaHogar1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar1.botonProcesar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{FichaPersonaPorFichaHogar1.gestor.scriptProcesar}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar1.botonRefrescar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar1.botonRefrescar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{FichaPersonaPorFichaHogar1.gestor.scriptRefrescar}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar1.botonReconsultar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar1.botonReconsultar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{FichaPersonaPorFichaHogar1.gestor.scriptReconsultar}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar1.botonRetornar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar1.botonRetornar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{FichaPersonaPorFichaHogar1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{FichaPersonaPorFichaHogar1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{FichaPersonaPorFichaHogar1.imageHyperlink1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar1.imageHyperlink1}"
                                                    disabled="#{FichaPersonaPorFichaHogar1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{FichaPersonaPorFichaHogar1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FichaPersonaPorFichaHogar1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{FichaPersonaPorFichaHogar1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.FichaPersonaPorFichaHogar1_imageHyperlink1_toolTip}"/>
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
