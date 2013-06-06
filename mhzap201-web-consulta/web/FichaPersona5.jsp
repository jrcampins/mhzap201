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
                    focus="#{FichaPersona5.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{FichaPersona5.gestor.preserveFocus}"
                    preserveScroll="#{FichaPersona5.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{FichaPersona5.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdFichaPersona1 campoCodigoFichaPersona1 campoNombreFichaPersona1 listaEsRespondente1 campoIdFichaHogar1 campoNumeroOrdenIdentificacion1 campoPrimerNombre1 campoSegundoNombre1 campoPrimerApellido1 campoSegundoApellido1 campoApellidoCasada1 campoApodo1 campoEdad1 listaNumeroSexoPersona1 listaNumeroEstadoCivil1 listaNumeroTipoPersonaHogar1 listaNumeroSionoMiembroHogar1 campoNumeroOrdenIdenConyuge1 campoNumeroOrdenIdenPadre1 campoNumeroOrdenIdenMadre1 campoNumeroCedula1 campoLetraCedula1 listaNumeroTipoExcepcionCed1 campoFechaNacimiento1 campoIdDepartamentoNacimiento1 campoIdDistritoNacimiento1 listaNumeroTipoAreaLugarNac1 listaNumeroIdiomaHogar1 campoOtroIdiomaHogar1 listaNumeroSionoAsistenciaEsc1 listaNumeroMotivoInaEsc1 campoOtroMotivoInaEsc1 listaNumeroSionoMatriculacionEsc1 campoUltimoCursoAprobado1 listaNumeroNivelEduUltCurAprob1 listaNumeroSionoCursoNoFormal1 listaNumeroTipoSeguroMedico1 listaNumeroEstadoSalud1 listaNumeroClaseEnfAcc1 campoOtraClaseEnfAcc1 listaNumeroClaseEnfCronica1 campoOtraClaseEnfCronica1 listaNumeroSionoAtencionMedica1 listaNumeroMotivoNoAtencion1 campoOtroMotivoNoAtencion1 listaNumeroSionoCarnetVacunacion1 listaNumeroClaseImpedimento1 campoOtraClaseImpedimento1 listaNumeroCausaImpedimento1 campoOtraCausaImpedimento1 listaNumeroSionoDifParaCaminar1 listaNumeroSionoDifParaVestirse1 listaNumeroSionoDifParaBanarse1 listaNumeroSionoDifParaComer1 listaNumeroSionoDifParaLaCama1 listaNumeroSionoDifParaElBano1 listaNumeroSionoTrabajo1 listaNumeroMotivoNoTrabajo1 campoOtroMotivoNoTrabajo1 campoDescripcionOcupacionPrin1 campoDescripcionDedicacionPrin1 listaNumeroTipoRelacionLab1 campoMontoIngresoOcupacionPrin1 campoMontoIngresoOcupacionSecun1 campoMontoIngresoOtrasOcup1 campoMontoIngresoAlquileres1 campoMontoIngresoIntereses1 campoMontoIngresoAyudaFamPais1 campoMontoIngresoAyudaFamExter1 campoMontoIngresoJubilacion1 campoMontoIngresoPensiones1 campoMontoIngresoTekopora1 campoMontoIngresoProgramas1 campoMontoIngresoAdicional1 campoTotalIngresoMensual1 campoIdPotencialBen1 listaEsFichaPersonaImportada1 campoFechaImportacion1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{FichaPersona5.breadcrumbs1}" 
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
                                                    rendered="#{FichaPersona5.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{FichaPersona5.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{FichaPersona5.gestor.mensajeDisponible}"
                                                    text="#{FichaPersona5.gestor.mensaje}"
                                                    url="#{FichaPersona5.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{FichaPersona5.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{FichaPersona5.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{FichaPersona5.gestor.filaEscogida}" 
                                                sourceData="#{FichaPersona5.fichaPersonaDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{FichaPersona5.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{FichaPersona5.gestor.scriptElegir}" 
                                                        selected="#{FichaPersona5.gestor.filaElegida}" 
                                                        toolTip="#{FichaPersona5.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{FichaPersona5.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{FichaPersona5.botonEscogerFila1_action}"
                                                        binding="#{FichaPersona5.botonEscogerFila1}"
                                                        disabled="#{FichaPersona5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{FichaPersona5.gestor.urlImagenEscoger}" 
                                                        onClick="#{FichaPersona5.gestor.scriptEscoger}"
                                                        text="#{FichaPersona5.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{FichaPersona5.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FichaPersona5.botonDetallarFila1_action}"
                                                        binding="#{FichaPersona5.botonDetallarFila1}"
                                                        disabled="#{FichaPersona5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{FichaPersona5.gestor.urlImagenDetallar}" 
                                                        onClick="#{FichaPersona5.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{FichaPersona5.gestor.detalleDisponible}" 
                                                        text="#{FichaPersona5.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{FichaPersona5.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FichaPersona5.botonProcesarFila1_action}"
                                                        binding="#{FichaPersona5.botonProcesarFila1}"
                                                        disabled="#{FichaPersona5.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{FichaPersona5.gestor.urlImagenProcesar}" 
                                                        onClick="#{FichaPersona5.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{FichaPersona5.asistente.comandoDisponible}" 
                                                        text="#{FichaPersona5.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{FichaPersona5.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FichaPersona5.botonRetornarFila1_action}"
                                                        binding="#{FichaPersona5.botonRetornarFila1}" 
                                                        disabled="#{FichaPersona5.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{FichaPersona5.gestor.urlImagenRetornar}"
                                                        onClick="#{FichaPersona5.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{FichaPersona5.gestor.funcionReturnVisible}" 
                                                        text="#{FichaPersona5.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{FichaPersona5.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{FichaPersona5.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{FichaPersona5.hipervinculoAccionFila1_action}"
                                                        binding="#{FichaPersona5.hipervinculoAccionFila1}"
                                                        disabled="#{FichaPersona5.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{FichaPersona5.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{FichaPersona5.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.FichaPersona5_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{FichaPersona5.tableColumn3}" 
                                                    headerText="#{FichaPersona5.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{FichaPersona5.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{FichaPersona5.hipervinculoDetallarFila1_action}"
                                                        binding="#{FichaPersona5.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{FichaPersona5.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{FichaPersona5.gestor.identificacionFila}" 
                                                        toolTip="#{FichaPersona5.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnIdFichaPersona1}"
                                                    toolTip="BundleParametros.id_ficha_persona.ficha_persona"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdFichaPersona1" rendered="false"
                                                    sort="id_ficha_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaPersona1"
                                                    text="#{currentRow.value['id_ficha_persona']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelIdFichaPersona1}"
                                                    id="labelIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                <webuijsf:textField id="campoIdFichaPersona1"
                                                    binding="#{FichaPersona5.campoIdFichaPersona1}"
                                                    converter="#{FichaPersona5.converterIdFichaPersona1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_ficha_persona']}"
                                                    toolTip="BundleParametros.id_ficha_persona.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorIdFichaPersona1.validate}"/>
                                                <webuijsf:staticText id="campoIdFichaPersona1Texto1"
                                                    binding="#{FichaPersona5.campoIdFichaPersona1Texto1}"
                                                    text="#{currentRow.value['id_ficha_persona']}"/>
                                                <webuijsf:message id="messageIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnCodigoFichaPersona1}"
                                                    toolTip="BundleParametros.codigo_ficha_persona.ficha_persona"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoFichaPersona1"
                                                    sort="codigo_ficha_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoFichaPersona1"
                                                    text="#{currentRow.value['codigo_ficha_persona']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelCodigoFichaPersona1}"
                                                    id="labelCodigoFichaPersona1"
                                                    for="campoCodigoFichaPersona1"/>
                                                <webuijsf:textField id="campoCodigoFichaPersona1"
                                                    binding="#{FichaPersona5.campoCodigoFichaPersona1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{currentRow.value['codigo_ficha_persona']}"
                                                    toolTip="BundleParametros.codigo_ficha_persona.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorCodigoFichaPersona1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoFichaPersona1Texto1"
                                                    binding="#{FichaPersona5.campoCodigoFichaPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_ficha_persona']}"/>
                                                <webuijsf:message id="messageCodigoFichaPersona1"
                                                    for="campoCodigoFichaPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNombreFichaPersona1}"
                                                    toolTip="BundleParametros.nombre_ficha_persona.ficha_persona"
                                                    headerText="nombre"
                                                    id="tableColumnNombreFichaPersona1"
                                                    sort="nombre_ficha_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreFichaPersona1"
                                                    text="#{currentRow.value['nombre_ficha_persona']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNombreFichaPersona1}"
                                                    id="labelNombreFichaPersona1"
                                                    for="campoNombreFichaPersona1"/>
                                                <webuijsf:textField id="campoNombreFichaPersona1"
                                                    binding="#{FichaPersona5.campoNombreFichaPersona1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{currentRow.value['nombre_ficha_persona']}"
                                                    toolTip="BundleParametros.nombre_ficha_persona.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorNombreFichaPersona1.validate}"/>
                                                <webuijsf:staticText id="campoNombreFichaPersona1Texto1"
                                                    binding="#{FichaPersona5.campoNombreFichaPersona1Texto1}"
                                                    text="#{currentRow.value['nombre_ficha_persona']}"/>
                                                <webuijsf:message id="messageNombreFichaPersona1"
                                                    for="campoNombreFichaPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnEsRespondente1}"
                                                    toolTip="BundleParametros.es_respondente.ficha_persona"
                                                    headerText="respondente"
                                                    id="tableColumnEsRespondente1" rendered="false"
                                                    sort="es_respondente">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsRespondente1"
                                                    text="#{currentRow.value['es_respondente']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelEsRespondente1}"
                                                    id="labelEsRespondente1"
                                                    for="listaEsRespondente1"/>
                                                <webuijsf:dropDown id="listaEsRespondente1"
                                                    binding="#{FichaPersona5.listaEsRespondente1}"
                                                    converter="#{FichaPersona5.converterEsRespondente1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaPersona5.asistente.opcionesListaEsRespondente1}"
                                                    selected="#{currentRow.value['es_respondente']}"
                                                    toolTip="BundleParametros.es_respondente.ficha_persona"/>
                                                <webuijsf:staticText id="listaEsRespondente1Texto1"
                                                    binding="#{FichaPersona5.listaEsRespondente1Texto1}"/>
                                                <webuijsf:message id="messageEsRespondente1"
                                                    for="listaEsRespondente1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnIdFichaHogar1}"
                                                    toolTip="BundleParametros.id_ficha_hogar.ficha_persona"
                                                    headerText="ficha hogar"
                                                    id="tableColumnIdFichaHogar1"
                                                    sort="codigo_ficha_hogar_1x1y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaHogar1"
                                                    text="#{currentRow.value['codigo_ficha_hogar_1x1y3']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelIdFichaHogar1}"
                                                    id="labelIdFichaHogar1"
                                                    for="campoIdFichaHogar1"/>
                                                <webuijsf:textField id="campoIdFichaHogar1"
                                                    binding="#{FichaPersona5.campoIdFichaHogar1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaPersona5.asistente.textoCampoIdFichaHogar1}"
                                                    toolTip="#{FichaPersona5.asistente.toolTipCampoIdFichaHogar1}"
                                                    validatorExpression="#{FichaPersona5.campoIdFichaHogar1_validate}"/>
                                                <webuijsf:staticText id="campoIdFichaHogar1Texto1"
                                                    binding="#{FichaPersona5.campoIdFichaHogar1Texto1}"
                                                    text="#{currentRow.value['codigo_ficha_hogar_1x1y3']}"/>
                                                <webuijsf:message id="messageIdFichaHogar1"
                                                    for="campoIdFichaHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFichaHogar3"
                                                    rendered="#{FichaPersona5.asistente.tableColumnIdFichaHogar3Rendered}"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaHogar3"
                                                    text="#{currentRow.value['id_ficha_hogar']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersona5.campoIdFichaHogar1Boton1}"
                                                    id="campoIdFichaHogar1Boton1"
                                                    onClick="#{FichaPersona5.asistente.scriptCampoIdFichaHogar1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersona5.campoIdFichaHogar1Boton3}"
                                                    id="campoIdFichaHogar1Boton3"
                                                    onClick="#{FichaPersona5.asistente.scriptCampoIdFichaHogar1Boton2}"
                                                    rendered="#{FichaPersona5.asistente.campoIdFichaHogar1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FichaPersona5.tableColumnIdFichaHogar2}"
                                                    headerText="nombre ficha hogar"
                                                    id="tableColumnIdFichaHogar2"
                                                    rendered="#{FichaPersona5.asistente.campoIdFichaHogar1Boton2Rendered}"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaHogar2"
                                                    text="#{currentRow.value['id_ficha_hogar']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelIdFichaHogar2}"
                                                    id="labelIdFichaHogar2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FichaPersona5.campoIdFichaHogar1Hiper1}"
                                                    id="campoIdFichaHogar1Hiper1"
                                                    onClick="#{FichaPersona5.asistente.scriptCampoIdFichaHogar1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFichaHogar1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroOrdenIdentificacion1}"
                                                    toolTip="BundleParametros.numero_orden_identificacion.ficha_persona"
                                                    headerText="n&#250;mero orden identificaci&#243;n"
                                                    id="tableColumnNumeroOrdenIdentificacion1"
                                                    sort="numero_orden_identificacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroOrdenIdentificacion1"
                                                    text="#{currentRow.value['numero_orden_identificacion']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroOrdenIdentificacion1}"
                                                    id="labelNumeroOrdenIdentificacion1"
                                                    for="campoNumeroOrdenIdentificacion1"/>
                                                <webuijsf:textField id="campoNumeroOrdenIdentificacion1"
                                                    binding="#{FichaPersona5.campoNumeroOrdenIdentificacion1}"
                                                    converter="#{FichaPersona5.converterNumeroOrdenIdentificacion1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['numero_orden_identificacion']}"
                                                    toolTip="BundleParametros.numero_orden_identificacion.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorNumeroOrdenIdentificacion1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdentificacion1Texto1"
                                                    binding="#{FichaPersona5.campoNumeroOrdenIdentificacion1Texto1}"
                                                    text="#{currentRow.value['numero_orden_identificacion']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdentificacion1"
                                                    for="campoNumeroOrdenIdentificacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnPrimerNombre1}"
                                                    toolTip="BundleParametros.primer_nombre.ficha_persona"
                                                    headerText="primer nombre"
                                                    id="tableColumnPrimerNombre1" rendered="false"
                                                    sort="primer_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerNombre1"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelPrimerNombre1}"
                                                    id="labelPrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                <webuijsf:textField id="campoPrimerNombre1"
                                                    binding="#{FichaPersona5.campoPrimerNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1Texto1"
                                                    binding="#{FichaPersona5.campoPrimerNombre1Texto1}"
                                                    text="#{currentRow.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnSegundoNombre1}"
                                                    toolTip="BundleParametros.segundo_nombre.ficha_persona"
                                                    headerText="segundo nombre"
                                                    id="tableColumnSegundoNombre1" rendered="false"
                                                    sort="segundo_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoNombre1"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelSegundoNombre1}"
                                                    id="labelSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                <webuijsf:textField id="campoSegundoNombre1"
                                                    binding="#{FichaPersona5.campoSegundoNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1Texto1"
                                                    binding="#{FichaPersona5.campoSegundoNombre1Texto1}"
                                                    text="#{currentRow.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnPrimerApellido1}"
                                                    toolTip="BundleParametros.primer_apellido.ficha_persona"
                                                    headerText="primer apellido"
                                                    id="tableColumnPrimerApellido1" rendered="false"
                                                    sort="primer_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerApellido1"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelPrimerApellido1}"
                                                    id="labelPrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                <webuijsf:textField id="campoPrimerApellido1"
                                                    binding="#{FichaPersona5.campoPrimerApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1Texto1"
                                                    binding="#{FichaPersona5.campoPrimerApellido1Texto1}"
                                                    text="#{currentRow.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnSegundoApellido1}"
                                                    toolTip="BundleParametros.segundo_apellido.ficha_persona"
                                                    headerText="segundo apellido"
                                                    id="tableColumnSegundoApellido1" rendered="false"
                                                    sort="segundo_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoApellido1"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelSegundoApellido1}"
                                                    id="labelSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                <webuijsf:textField id="campoSegundoApellido1"
                                                    binding="#{FichaPersona5.campoSegundoApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1Texto1"
                                                    binding="#{FichaPersona5.campoSegundoApellido1Texto1}"
                                                    text="#{currentRow.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnApellidoCasada1}"
                                                    toolTip="BundleParametros.apellido_casada.ficha_persona"
                                                    headerText="apellido casada"
                                                    id="tableColumnApellidoCasada1" rendered="false"
                                                    sort="apellido_casada">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextApellidoCasada1"
                                                    text="#{currentRow.value['apellido_casada']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelApellidoCasada1}"
                                                    id="labelApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                <webuijsf:textField id="campoApellidoCasada1"
                                                    binding="#{FichaPersona5.campoApellidoCasada1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['apellido_casada']}"
                                                    toolTip="BundleParametros.apellido_casada.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorApellidoCasada1.validate}"/>
                                                <webuijsf:staticText id="campoApellidoCasada1Texto1"
                                                    binding="#{FichaPersona5.campoApellidoCasada1Texto1}"
                                                    text="#{currentRow.value['apellido_casada']}"/>
                                                <webuijsf:message id="messageApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnApodo1}"
                                                    toolTip="BundleParametros.apodo.ficha_persona"
                                                    headerText="apodo"
                                                    id="tableColumnApodo1" rendered="false"
                                                    sort="apodo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextApodo1"
                                                    text="#{currentRow.value['apodo']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelApodo1}"
                                                    id="labelApodo1"
                                                    for="campoApodo1"/>
                                                <webuijsf:textField id="campoApodo1"
                                                    binding="#{FichaPersona5.campoApodo1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['apodo']}"
                                                    toolTip="BundleParametros.apodo.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorApodo1.validate}"/>
                                                <webuijsf:staticText id="campoApodo1Texto1"
                                                    binding="#{FichaPersona5.campoApodo1Texto1}"
                                                    text="#{currentRow.value['apodo']}"/>
                                                <webuijsf:message id="messageApodo1"
                                                    for="campoApodo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnEdad1}"
                                                    toolTip="BundleParametros.edad.ficha_persona"
                                                    headerText="edad"
                                                    id="tableColumnEdad1" rendered="false"
                                                    sort="edad">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEdad1"
                                                    text="#{currentRow.value['edad']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelEdad1}"
                                                    id="labelEdad1"
                                                    for="campoEdad1"/>
                                                <webuijsf:textField id="campoEdad1"
                                                    binding="#{FichaPersona5.campoEdad1}"
                                                    converter="#{FichaPersona5.converterEdad1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['edad']}"
                                                    toolTip="BundleParametros.edad.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorEdad1.validate}"/>
                                                <webuijsf:staticText id="campoEdad1Texto1"
                                                    binding="#{FichaPersona5.campoEdad1Texto1}"
                                                    text="#{currentRow.value['edad']}"/>
                                                <webuijsf:message id="messageEdad1"
                                                    for="campoEdad1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroSexoPersona1}"
                                                    toolTip="BundleParametros.numero_sexo_persona.ficha_persona"
                                                    headerText="sexo persona"
                                                    id="tableColumnNumeroSexoPersona1" rendered="false"
                                                    sort="codigo_sexo_persona_1x2y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSexoPersona1"
                                                    text="#{currentRow.value['codigo_sexo_persona_1x2y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroSexoPersona1}"
                                                    id="labelNumeroSexoPersona1"
                                                    for="listaNumeroSexoPersona1"/>
                                                <webuijsf:dropDown id="listaNumeroSexoPersona1"
                                                    binding="#{FichaPersona5.listaNumeroSexoPersona1}"
                                                    converter="#{FichaPersona5.converterNumeroSexoPersona1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroSexoPersona1}"
                                                    selected="#{currentRow.value['numero_sexo_persona']}"
                                                    toolTip="BundleParametros.numero_sexo_persona.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSexoPersona1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroSexoPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_sexo_persona_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroSexoPersona1"
                                                    for="listaNumeroSexoPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroEstadoCivil1}"
                                                    toolTip="BundleParametros.numero_estado_civil.ficha_persona"
                                                    headerText="estado civil"
                                                    id="tableColumnNumeroEstadoCivil1" rendered="false"
                                                    sort="codigo_estado_civil_1x3y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroEstadoCivil1"
                                                    text="#{currentRow.value['codigo_estado_civil_1x3y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroEstadoCivil1}"
                                                    id="labelNumeroEstadoCivil1"
                                                    for="listaNumeroEstadoCivil1"/>
                                                <webuijsf:dropDown id="listaNumeroEstadoCivil1"
                                                    binding="#{FichaPersona5.listaNumeroEstadoCivil1}"
                                                    converter="#{FichaPersona5.converterNumeroEstadoCivil1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroEstadoCivil1}"
                                                    selected="#{currentRow.value['numero_estado_civil']}"
                                                    toolTip="BundleParametros.numero_estado_civil.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroEstadoCivil1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroEstadoCivil1Texto1}"
                                                    text="#{currentRow.value['codigo_estado_civil_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroEstadoCivil1"
                                                    for="listaNumeroEstadoCivil1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroTipoPersonaHogar1}"
                                                    toolTip="BundleParametros.numero_tipo_persona_hogar.ficha_persona"
                                                    headerText="tipo persona hogar"
                                                    id="tableColumnNumeroTipoPersonaHogar1"
                                                    sort="codigo_tipo_persona_hoga_1x4y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoPersonaHogar1"
                                                    text="#{currentRow.value['codigo_tipo_persona_hoga_1x4y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroTipoPersonaHogar1}"
                                                    id="labelNumeroTipoPersonaHogar1"
                                                    for="listaNumeroTipoPersonaHogar1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoPersonaHogar1"
                                                    binding="#{FichaPersona5.listaNumeroTipoPersonaHogar1}"
                                                    converter="#{FichaPersona5.converterNumeroTipoPersonaHogar1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroTipoPersonaHogar1}"
                                                    selected="#{currentRow.value['numero_tipo_persona_hogar']}"
                                                    toolTip="BundleParametros.numero_tipo_persona_hogar.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoPersonaHogar1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroTipoPersonaHogar1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_persona_hoga_1x4y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoPersonaHogar1"
                                                    for="listaNumeroTipoPersonaHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroSionoMiembroHogar1}"
                                                    toolTip="BundleParametros.numero_siono_miembro_hogar.ficha_persona"
                                                    headerText="miembro hogar"
                                                    id="tableColumnNumeroSionoMiembroHogar1" rendered="false"
                                                    sort="codigo_siono_1x5y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoMiembroHogar1"
                                                    text="#{currentRow.value['codigo_siono_1x5y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroSionoMiembroHogar1}"
                                                    id="labelNumeroSionoMiembroHogar1"
                                                    for="listaNumeroSionoMiembroHogar1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoMiembroHogar1"
                                                    binding="#{FichaPersona5.listaNumeroSionoMiembroHogar1}"
                                                    converter="#{FichaPersona5.converterNumeroSionoMiembroHogar1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroSionoMiembroHogar1}"
                                                    selected="#{currentRow.value['numero_siono_miembro_hogar']}"
                                                    toolTip="BundleParametros.numero_siono_miembro_hogar.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoMiembroHogar1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroSionoMiembroHogar1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x5y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoMiembroHogar1"
                                                    for="listaNumeroSionoMiembroHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroOrdenIdenConyuge1}"
                                                    toolTip="BundleParametros.numero_orden_iden_conyuge.ficha_persona"
                                                    headerText="n&#250;mero orden identificaci&#243;n conyuge"
                                                    id="tableColumnNumeroOrdenIdenConyuge1" rendered="false"
                                                    sort="numero_orden_iden_conyuge">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroOrdenIdenConyuge1"
                                                    text="#{currentRow.value['numero_orden_iden_conyuge']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroOrdenIdenConyuge1}"
                                                    id="labelNumeroOrdenIdenConyuge1"
                                                    for="campoNumeroOrdenIdenConyuge1"/>
                                                <webuijsf:textField id="campoNumeroOrdenIdenConyuge1"
                                                    binding="#{FichaPersona5.campoNumeroOrdenIdenConyuge1}"
                                                    converter="#{FichaPersona5.converterNumeroOrdenIdenConyuge1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['numero_orden_iden_conyuge']}"
                                                    toolTip="BundleParametros.numero_orden_iden_conyuge.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorNumeroOrdenIdenConyuge1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenConyuge1Texto1"
                                                    binding="#{FichaPersona5.campoNumeroOrdenIdenConyuge1Texto1}"
                                                    text="#{currentRow.value['numero_orden_iden_conyuge']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenConyuge1"
                                                    for="campoNumeroOrdenIdenConyuge1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroOrdenIdenPadre1}"
                                                    toolTip="BundleParametros.numero_orden_iden_padre.ficha_persona"
                                                    headerText="n&#250;mero orden identificaci&#243;n padre"
                                                    id="tableColumnNumeroOrdenIdenPadre1" rendered="false"
                                                    sort="numero_orden_iden_padre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroOrdenIdenPadre1"
                                                    text="#{currentRow.value['numero_orden_iden_padre']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroOrdenIdenPadre1}"
                                                    id="labelNumeroOrdenIdenPadre1"
                                                    for="campoNumeroOrdenIdenPadre1"/>
                                                <webuijsf:textField id="campoNumeroOrdenIdenPadre1"
                                                    binding="#{FichaPersona5.campoNumeroOrdenIdenPadre1}"
                                                    converter="#{FichaPersona5.converterNumeroOrdenIdenPadre1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['numero_orden_iden_padre']}"
                                                    toolTip="BundleParametros.numero_orden_iden_padre.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorNumeroOrdenIdenPadre1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenPadre1Texto1"
                                                    binding="#{FichaPersona5.campoNumeroOrdenIdenPadre1Texto1}"
                                                    text="#{currentRow.value['numero_orden_iden_padre']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenPadre1"
                                                    for="campoNumeroOrdenIdenPadre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroOrdenIdenMadre1}"
                                                    toolTip="BundleParametros.numero_orden_iden_madre.ficha_persona"
                                                    headerText="n&#250;mero orden identificaci&#243;n madre"
                                                    id="tableColumnNumeroOrdenIdenMadre1" rendered="false"
                                                    sort="numero_orden_iden_madre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroOrdenIdenMadre1"
                                                    text="#{currentRow.value['numero_orden_iden_madre']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroOrdenIdenMadre1}"
                                                    id="labelNumeroOrdenIdenMadre1"
                                                    for="campoNumeroOrdenIdenMadre1"/>
                                                <webuijsf:textField id="campoNumeroOrdenIdenMadre1"
                                                    binding="#{FichaPersona5.campoNumeroOrdenIdenMadre1}"
                                                    converter="#{FichaPersona5.converterNumeroOrdenIdenMadre1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['numero_orden_iden_madre']}"
                                                    toolTip="BundleParametros.numero_orden_iden_madre.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorNumeroOrdenIdenMadre1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenMadre1Texto1"
                                                    binding="#{FichaPersona5.campoNumeroOrdenIdenMadre1Texto1}"
                                                    text="#{currentRow.value['numero_orden_iden_madre']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenMadre1"
                                                    for="campoNumeroOrdenIdenMadre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroCedula1}"
                                                    toolTip="BundleParametros.numero_cedula.ficha_persona"
                                                    headerText="n&#250;mero c&#233;dula"
                                                    id="tableColumnNumeroCedula1" rendered="false"
                                                    sort="numero_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCedula1"
                                                    text="#{currentRow.value['numero_cedula']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroCedula1}"
                                                    id="labelNumeroCedula1"
                                                    for="campoNumeroCedula1"/>
                                                <webuijsf:textField id="campoNumeroCedula1"
                                                    binding="#{FichaPersona5.campoNumeroCedula1}"
                                                    converter="#{FichaPersona5.converterNumeroCedula1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['numero_cedula']}"
                                                    toolTip="BundleParametros.numero_cedula.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorNumeroCedula1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedula1Texto1"
                                                    binding="#{FichaPersona5.campoNumeroCedula1Texto1}"
                                                    text="#{currentRow.value['numero_cedula']}"/>
                                                <webuijsf:message id="messageNumeroCedula1"
                                                    for="campoNumeroCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnLetraCedula1}"
                                                    toolTip="BundleParametros.letra_cedula.ficha_persona"
                                                    headerText="letra c&#233;dula"
                                                    id="tableColumnLetraCedula1" rendered="false"
                                                    sort="letra_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextLetraCedula1"
                                                    text="#{currentRow.value['letra_cedula']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelLetraCedula1}"
                                                    id="labelLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                <webuijsf:textField id="campoLetraCedula1"
                                                    binding="#{FichaPersona5.campoLetraCedula1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['letra_cedula']}"
                                                    toolTip="BundleParametros.letra_cedula.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorLetraCedula1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedula1Texto1"
                                                    binding="#{FichaPersona5.campoLetraCedula1Texto1}"
                                                    text="#{currentRow.value['letra_cedula']}"/>
                                                <webuijsf:message id="messageLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroTipoExcepcionCed1}"
                                                    toolTip="BundleParametros.numero_tipo_excepcion_ced.ficha_persona"
                                                    headerText="tipo excepci&#243;n c&#233;dula"
                                                    id="tableColumnNumeroTipoExcepcionCed1" rendered="false"
                                                    sort="codigo_tipo_excepcion_ce_1x6y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoExcepcionCed1"
                                                    text="#{currentRow.value['codigo_tipo_excepcion_ce_1x6y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroTipoExcepcionCed1}"
                                                    id="labelNumeroTipoExcepcionCed1"
                                                    for="listaNumeroTipoExcepcionCed1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoExcepcionCed1"
                                                    binding="#{FichaPersona5.listaNumeroTipoExcepcionCed1}"
                                                    converter="#{FichaPersona5.converterNumeroTipoExcepcionCed1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroTipoExcepcionCed1}"
                                                    selected="#{currentRow.value['numero_tipo_excepcion_ced']}"
                                                    toolTip="BundleParametros.numero_tipo_excepcion_ced.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoExcepcionCed1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroTipoExcepcionCed1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_excepcion_ce_1x6y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoExcepcionCed1"
                                                    for="listaNumeroTipoExcepcionCed1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnFechaNacimiento1}"
                                                    toolTip="BundleParametros.fecha_nacimiento.ficha_persona"
                                                    headerText="fecha nacimiento"
                                                    id="tableColumnFechaNacimiento1" rendered="false"
                                                    sort="fecha_nacimiento">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaNacimiento1"
                                                    text="#{currentRow.value['fecha_nacimiento']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelFechaNacimiento1}"
                                                    id="labelFechaNacimiento1"
                                                    for="campoFechaNacimiento1"/>
                                                <webuijsf:textField id="campoFechaNacimiento1"
                                                    binding="#{FichaPersona5.campoFechaNacimiento1}"
                                                    converter="#{FichaPersona5.converterFechaNacimiento1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['fecha_nacimiento']}"
                                                    toolTip="BundleParametros.fecha_nacimiento.ficha_persona"/>
                                                <webuijsf:staticText id="campoFechaNacimiento1Texto1"
                                                    binding="#{FichaPersona5.campoFechaNacimiento1Texto1}"
                                                    converter="#{FichaPersona5.converterFechaNacimiento1}"
                                                    text="#{currentRow.value['fecha_nacimiento']}"/>
                                                <webuijsf:message id="messageFechaNacimiento1"
                                                    for="campoFechaNacimiento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnIdDepartamentoNacimiento1}"
                                                    toolTip="BundleParametros.id_departamento_nacimiento.ficha_persona"
                                                    headerText="departamento nacimiento"
                                                    id="tableColumnIdDepartamentoNacimiento1" rendered="false"
                                                    sort="codigo_ubicacion_1x7y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamentoNacimiento1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x7y3']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelIdDepartamentoNacimiento1}"
                                                    id="labelIdDepartamentoNacimiento1"
                                                    for="campoIdDepartamentoNacimiento1"/>
                                                <webuijsf:textField id="campoIdDepartamentoNacimiento1"
                                                    binding="#{FichaPersona5.campoIdDepartamentoNacimiento1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{FichaPersona5.asistente.textoCampoIdDepartamentoNacimiento1}"
                                                    toolTip="#{FichaPersona5.asistente.toolTipCampoIdDepartamentoNacimiento1}"
                                                    validatorExpression="#{FichaPersona5.campoIdDepartamentoNacimiento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamentoNacimiento1Texto1"
                                                    binding="#{FichaPersona5.campoIdDepartamentoNacimiento1Texto1}"
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
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersona5.campoIdDepartamentoNacimiento1Boton1}"
                                                    id="campoIdDepartamentoNacimiento1Boton1"
                                                    onClick="#{FichaPersona5.asistente.scriptCampoIdDepartamentoNacimiento1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersona5.campoIdDepartamentoNacimiento1Boton3}"
                                                    id="campoIdDepartamentoNacimiento1Boton3"
                                                    onClick="#{FichaPersona5.asistente.scriptCampoIdDepartamentoNacimiento1Boton2}"
                                                    rendered="#{FichaPersona5.asistente.campoIdDepartamentoNacimiento1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FichaPersona5.tableColumnIdDepartamentoNacimiento2}"
                                                    headerText="nombre departamento nacimiento"
                                                    id="tableColumnIdDepartamentoNacimiento2" rendered="false"
                                                    sort="nombre_ubicacion_1x7y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamentoNacimiento2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x7y4']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelIdDepartamentoNacimiento2}"
                                                    id="labelIdDepartamentoNacimiento2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FichaPersona5.campoIdDepartamentoNacimiento1Hiper1}"
                                                    id="campoIdDepartamentoNacimiento1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x7y4']}"
                                                    onClick="#{FichaPersona5.asistente.scriptCampoIdDepartamentoNacimiento1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDepartamentoNacimiento1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnIdDistritoNacimiento1}"
                                                    toolTip="BundleParametros.id_distrito_nacimiento.ficha_persona"
                                                    headerText="distrito nacimiento"
                                                    id="tableColumnIdDistritoNacimiento1" rendered="false"
                                                    sort="codigo_ubicacion_1x8y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistritoNacimiento1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x8y3']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelIdDistritoNacimiento1}"
                                                    id="labelIdDistritoNacimiento1"
                                                    for="campoIdDistritoNacimiento1"/>
                                                <webuijsf:textField id="campoIdDistritoNacimiento1"
                                                    binding="#{FichaPersona5.campoIdDistritoNacimiento1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{FichaPersona5.asistente.textoCampoIdDistritoNacimiento1}"
                                                    toolTip="#{FichaPersona5.asistente.toolTipCampoIdDistritoNacimiento1}"
                                                    validatorExpression="#{FichaPersona5.campoIdDistritoNacimiento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistritoNacimiento1Texto1"
                                                    binding="#{FichaPersona5.campoIdDistritoNacimiento1Texto1}"
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
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersona5.campoIdDistritoNacimiento1Boton1}"
                                                    id="campoIdDistritoNacimiento1Boton1"
                                                    onClick="#{FichaPersona5.asistente.scriptCampoIdDistritoNacimiento1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersona5.campoIdDistritoNacimiento1Boton3}"
                                                    id="campoIdDistritoNacimiento1Boton3"
                                                    onClick="#{FichaPersona5.asistente.scriptCampoIdDistritoNacimiento1Boton2}"
                                                    rendered="#{FichaPersona5.asistente.campoIdDistritoNacimiento1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FichaPersona5.tableColumnIdDistritoNacimiento2}"
                                                    headerText="nombre distrito nacimiento"
                                                    id="tableColumnIdDistritoNacimiento2" rendered="false"
                                                    sort="nombre_ubicacion_1x8y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistritoNacimiento2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x8y4']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelIdDistritoNacimiento2}"
                                                    id="labelIdDistritoNacimiento2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FichaPersona5.campoIdDistritoNacimiento1Hiper1}"
                                                    id="campoIdDistritoNacimiento1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x8y4']}"
                                                    onClick="#{FichaPersona5.asistente.scriptCampoIdDistritoNacimiento1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDistritoNacimiento1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroTipoAreaLugarNac1}"
                                                    toolTip="BundleParametros.numero_tipo_area_lugar_nac.ficha_persona"
                                                    headerText="tipo area lugar nacimiento"
                                                    id="tableColumnNumeroTipoAreaLugarNac1" rendered="false"
                                                    sort="codigo_tipo_area_1x9y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoAreaLugarNac1"
                                                    text="#{currentRow.value['codigo_tipo_area_1x9y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroTipoAreaLugarNac1}"
                                                    id="labelNumeroTipoAreaLugarNac1"
                                                    for="listaNumeroTipoAreaLugarNac1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoAreaLugarNac1"
                                                    binding="#{FichaPersona5.listaNumeroTipoAreaLugarNac1}"
                                                    converter="#{FichaPersona5.converterNumeroTipoAreaLugarNac1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroTipoAreaLugarNac1}"
                                                    selected="#{currentRow.value['numero_tipo_area_lugar_nac']}"
                                                    toolTip="BundleParametros.numero_tipo_area_lugar_nac.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoAreaLugarNac1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroTipoAreaLugarNac1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_area_1x9y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoAreaLugarNac1"
                                                    for="listaNumeroTipoAreaLugarNac1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroIdiomaHogar1}"
                                                    toolTip="BundleParametros.numero_idioma_hogar.ficha_persona"
                                                    headerText="idioma hogar"
                                                    id="tableColumnNumeroIdiomaHogar1" rendered="false"
                                                    sort="codigo_idioma_hogar_1x10y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroIdiomaHogar1"
                                                    text="#{currentRow.value['codigo_idioma_hogar_1x10y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroIdiomaHogar1}"
                                                    id="labelNumeroIdiomaHogar1"
                                                    for="listaNumeroIdiomaHogar1"/>
                                                <webuijsf:dropDown id="listaNumeroIdiomaHogar1"
                                                    binding="#{FichaPersona5.listaNumeroIdiomaHogar1}"
                                                    converter="#{FichaPersona5.converterNumeroIdiomaHogar1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroIdiomaHogar1}"
                                                    selected="#{currentRow.value['numero_idioma_hogar']}"
                                                    toolTip="BundleParametros.numero_idioma_hogar.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroIdiomaHogar1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroIdiomaHogar1Texto1}"
                                                    text="#{currentRow.value['codigo_idioma_hogar_1x10y2']}"/>
                                                <webuijsf:message id="messageNumeroIdiomaHogar1"
                                                    for="listaNumeroIdiomaHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnOtroIdiomaHogar1}"
                                                    toolTip="BundleParametros.otro_idioma_hogar.ficha_persona"
                                                    headerText="otro idioma hogar"
                                                    id="tableColumnOtroIdiomaHogar1" rendered="false"
                                                    sort="otro_idioma_hogar">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtroIdiomaHogar1"
                                                    text="#{currentRow.value['otro_idioma_hogar']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelOtroIdiomaHogar1}"
                                                    id="labelOtroIdiomaHogar1"
                                                    for="campoOtroIdiomaHogar1"/>
                                                <webuijsf:textField id="campoOtroIdiomaHogar1"
                                                    binding="#{FichaPersona5.campoOtroIdiomaHogar1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otro_idioma_hogar']}"
                                                    toolTip="BundleParametros.otro_idioma_hogar.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorOtroIdiomaHogar1.validate}"/>
                                                <webuijsf:staticText id="campoOtroIdiomaHogar1Texto1"
                                                    binding="#{FichaPersona5.campoOtroIdiomaHogar1Texto1}"
                                                    text="#{currentRow.value['otro_idioma_hogar']}"/>
                                                <webuijsf:message id="messageOtroIdiomaHogar1"
                                                    for="campoOtroIdiomaHogar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroSionoAsistenciaEsc1}"
                                                    toolTip="BundleParametros.numero_siono_asistencia_esc.ficha_persona"
                                                    headerText="asistencia escolar"
                                                    id="tableColumnNumeroSionoAsistenciaEsc1" rendered="false"
                                                    sort="codigo_siono_1x11y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoAsistenciaEsc1"
                                                    text="#{currentRow.value['codigo_siono_1x11y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroSionoAsistenciaEsc1}"
                                                    id="labelNumeroSionoAsistenciaEsc1"
                                                    for="listaNumeroSionoAsistenciaEsc1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoAsistenciaEsc1"
                                                    binding="#{FichaPersona5.listaNumeroSionoAsistenciaEsc1}"
                                                    converter="#{FichaPersona5.converterNumeroSionoAsistenciaEsc1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroSionoAsistenciaEsc1}"
                                                    selected="#{currentRow.value['numero_siono_asistencia_esc']}"
                                                    toolTip="BundleParametros.numero_siono_asistencia_esc.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoAsistenciaEsc1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroSionoAsistenciaEsc1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x11y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoAsistenciaEsc1"
                                                    for="listaNumeroSionoAsistenciaEsc1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroMotivoInaEsc1}"
                                                    toolTip="BundleParametros.numero_motivo_ina_esc.ficha_persona"
                                                    headerText="motivo inasistencia escolar"
                                                    id="tableColumnNumeroMotivoInaEsc1" rendered="false"
                                                    sort="codigo_motivo_ina_esc_1x12y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroMotivoInaEsc1"
                                                    text="#{currentRow.value['codigo_motivo_ina_esc_1x12y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroMotivoInaEsc1}"
                                                    id="labelNumeroMotivoInaEsc1"
                                                    for="listaNumeroMotivoInaEsc1"/>
                                                <webuijsf:dropDown id="listaNumeroMotivoInaEsc1"
                                                    binding="#{FichaPersona5.listaNumeroMotivoInaEsc1}"
                                                    converter="#{FichaPersona5.converterNumeroMotivoInaEsc1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroMotivoInaEsc1}"
                                                    selected="#{currentRow.value['numero_motivo_ina_esc']}"
                                                    toolTip="BundleParametros.numero_motivo_ina_esc.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroMotivoInaEsc1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroMotivoInaEsc1Texto1}"
                                                    text="#{currentRow.value['codigo_motivo_ina_esc_1x12y2']}"/>
                                                <webuijsf:message id="messageNumeroMotivoInaEsc1"
                                                    for="listaNumeroMotivoInaEsc1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnOtroMotivoInaEsc1}"
                                                    toolTip="BundleParametros.otro_motivo_ina_esc.ficha_persona"
                                                    headerText="otro motivo inasistencia escolar"
                                                    id="tableColumnOtroMotivoInaEsc1" rendered="false"
                                                    sort="otro_motivo_ina_esc">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtroMotivoInaEsc1"
                                                    text="#{currentRow.value['otro_motivo_ina_esc']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelOtroMotivoInaEsc1}"
                                                    id="labelOtroMotivoInaEsc1"
                                                    for="campoOtroMotivoInaEsc1"/>
                                                <webuijsf:textField id="campoOtroMotivoInaEsc1"
                                                    binding="#{FichaPersona5.campoOtroMotivoInaEsc1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otro_motivo_ina_esc']}"
                                                    toolTip="BundleParametros.otro_motivo_ina_esc.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorOtroMotivoInaEsc1.validate}"/>
                                                <webuijsf:staticText id="campoOtroMotivoInaEsc1Texto1"
                                                    binding="#{FichaPersona5.campoOtroMotivoInaEsc1Texto1}"
                                                    text="#{currentRow.value['otro_motivo_ina_esc']}"/>
                                                <webuijsf:message id="messageOtroMotivoInaEsc1"
                                                    for="campoOtroMotivoInaEsc1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroSionoMatriculacionEsc1}"
                                                    toolTip="BundleParametros.numero_siono_matriculacion_esc.ficha_persona"
                                                    headerText="matriculaci&#243;n escolar"
                                                    id="tableColumnNumeroSionoMatriculacionEsc1" rendered="false"
                                                    sort="codigo_siono_1x13y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoMatriculacionEsc1"
                                                    text="#{currentRow.value['codigo_siono_1x13y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroSionoMatriculacionEsc1}"
                                                    id="labelNumeroSionoMatriculacionEsc1"
                                                    for="listaNumeroSionoMatriculacionEsc1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoMatriculacionEsc1"
                                                    binding="#{FichaPersona5.listaNumeroSionoMatriculacionEsc1}"
                                                    converter="#{FichaPersona5.converterNumeroSionoMatriculacionEsc1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroSionoMatriculacionEsc1}"
                                                    selected="#{currentRow.value['numero_siono_matriculacion_esc']}"
                                                    toolTip="BundleParametros.numero_siono_matriculacion_esc.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoMatriculacionEsc1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroSionoMatriculacionEsc1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x13y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoMatriculacionEsc1"
                                                    for="listaNumeroSionoMatriculacionEsc1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnUltimoCursoAprobado1}"
                                                    toolTip="BundleParametros.ultimo_curso_aprobado.ficha_persona"
                                                    headerText="ultimo curso aprobado"
                                                    id="tableColumnUltimoCursoAprobado1" rendered="false"
                                                    sort="ultimo_curso_aprobado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextUltimoCursoAprobado1"
                                                    text="#{currentRow.value['ultimo_curso_aprobado']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelUltimoCursoAprobado1}"
                                                    id="labelUltimoCursoAprobado1"
                                                    for="campoUltimoCursoAprobado1"/>
                                                <webuijsf:textField id="campoUltimoCursoAprobado1"
                                                    binding="#{FichaPersona5.campoUltimoCursoAprobado1}"
                                                    converter="#{FichaPersona5.converterUltimoCursoAprobado1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['ultimo_curso_aprobado']}"
                                                    toolTip="BundleParametros.ultimo_curso_aprobado.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorUltimoCursoAprobado1.validate}"/>
                                                <webuijsf:staticText id="campoUltimoCursoAprobado1Texto1"
                                                    binding="#{FichaPersona5.campoUltimoCursoAprobado1Texto1}"
                                                    text="#{currentRow.value['ultimo_curso_aprobado']}"/>
                                                <webuijsf:message id="messageUltimoCursoAprobado1"
                                                    for="campoUltimoCursoAprobado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroNivelEduUltCurAprob1}"
                                                    toolTip="BundleParametros.numero_nivel_edu_ult_cur_aprob.ficha_persona"
                                                    headerText="nivel educativo &#250;ltimo curso aprobado"
                                                    id="tableColumnNumeroNivelEduUltCurAprob1" rendered="false"
                                                    sort="codigo_nivel_educativo_1x14y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroNivelEduUltCurAprob1"
                                                    text="#{currentRow.value['codigo_nivel_educativo_1x14y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroNivelEduUltCurAprob1}"
                                                    id="labelNumeroNivelEduUltCurAprob1"
                                                    for="listaNumeroNivelEduUltCurAprob1"/>
                                                <webuijsf:dropDown id="listaNumeroNivelEduUltCurAprob1"
                                                    binding="#{FichaPersona5.listaNumeroNivelEduUltCurAprob1}"
                                                    converter="#{FichaPersona5.converterNumeroNivelEduUltCurAprob1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroNivelEduUltCurAprob1}"
                                                    selected="#{currentRow.value['numero_nivel_edu_ult_cur_aprob']}"
                                                    toolTip="BundleParametros.numero_nivel_edu_ult_cur_aprob.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroNivelEduUltCurAprob1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroNivelEduUltCurAprob1Texto1}"
                                                    text="#{currentRow.value['codigo_nivel_educativo_1x14y2']}"/>
                                                <webuijsf:message id="messageNumeroNivelEduUltCurAprob1"
                                                    for="listaNumeroNivelEduUltCurAprob1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroSionoCursoNoFormal1}"
                                                    toolTip="BundleParametros.numero_siono_curso_no_formal.ficha_persona"
                                                    headerText="curso no formal"
                                                    id="tableColumnNumeroSionoCursoNoFormal1" rendered="false"
                                                    sort="codigo_siono_1x15y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoCursoNoFormal1"
                                                    text="#{currentRow.value['codigo_siono_1x15y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroSionoCursoNoFormal1}"
                                                    id="labelNumeroSionoCursoNoFormal1"
                                                    for="listaNumeroSionoCursoNoFormal1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoCursoNoFormal1"
                                                    binding="#{FichaPersona5.listaNumeroSionoCursoNoFormal1}"
                                                    converter="#{FichaPersona5.converterNumeroSionoCursoNoFormal1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroSionoCursoNoFormal1}"
                                                    selected="#{currentRow.value['numero_siono_curso_no_formal']}"
                                                    toolTip="BundleParametros.numero_siono_curso_no_formal.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoCursoNoFormal1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroSionoCursoNoFormal1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x15y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoCursoNoFormal1"
                                                    for="listaNumeroSionoCursoNoFormal1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroTipoSeguroMedico1}"
                                                    toolTip="BundleParametros.numero_tipo_seguro_medico.ficha_persona"
                                                    headerText="tipo seguro medico"
                                                    id="tableColumnNumeroTipoSeguroMedico1" rendered="false"
                                                    sort="codigo_tipo_seguro_medi_1x16y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoSeguroMedico1"
                                                    text="#{currentRow.value['codigo_tipo_seguro_medi_1x16y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroTipoSeguroMedico1}"
                                                    id="labelNumeroTipoSeguroMedico1"
                                                    for="listaNumeroTipoSeguroMedico1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoSeguroMedico1"
                                                    binding="#{FichaPersona5.listaNumeroTipoSeguroMedico1}"
                                                    converter="#{FichaPersona5.converterNumeroTipoSeguroMedico1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroTipoSeguroMedico1}"
                                                    selected="#{currentRow.value['numero_tipo_seguro_medico']}"
                                                    toolTip="BundleParametros.numero_tipo_seguro_medico.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoSeguroMedico1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroTipoSeguroMedico1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_seguro_medi_1x16y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoSeguroMedico1"
                                                    for="listaNumeroTipoSeguroMedico1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroEstadoSalud1}"
                                                    toolTip="BundleParametros.numero_estado_salud.ficha_persona"
                                                    headerText="estado salud"
                                                    id="tableColumnNumeroEstadoSalud1" rendered="false"
                                                    sort="codigo_estado_salud_1x17y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroEstadoSalud1"
                                                    text="#{currentRow.value['codigo_estado_salud_1x17y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroEstadoSalud1}"
                                                    id="labelNumeroEstadoSalud1"
                                                    for="listaNumeroEstadoSalud1"/>
                                                <webuijsf:dropDown id="listaNumeroEstadoSalud1"
                                                    binding="#{FichaPersona5.listaNumeroEstadoSalud1}"
                                                    converter="#{FichaPersona5.converterNumeroEstadoSalud1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroEstadoSalud1}"
                                                    selected="#{currentRow.value['numero_estado_salud']}"
                                                    toolTip="BundleParametros.numero_estado_salud.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroEstadoSalud1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroEstadoSalud1Texto1}"
                                                    text="#{currentRow.value['codigo_estado_salud_1x17y2']}"/>
                                                <webuijsf:message id="messageNumeroEstadoSalud1"
                                                    for="listaNumeroEstadoSalud1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroClaseEnfAcc1}"
                                                    toolTip="BundleParametros.numero_clase_enf_acc.ficha_persona"
                                                    headerText="clase enfermedad accidente"
                                                    id="tableColumnNumeroClaseEnfAcc1" rendered="false"
                                                    sort="codigo_clase_enf_acc_1x18y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroClaseEnfAcc1"
                                                    text="#{currentRow.value['codigo_clase_enf_acc_1x18y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroClaseEnfAcc1}"
                                                    id="labelNumeroClaseEnfAcc1"
                                                    for="listaNumeroClaseEnfAcc1"/>
                                                <webuijsf:dropDown id="listaNumeroClaseEnfAcc1"
                                                    binding="#{FichaPersona5.listaNumeroClaseEnfAcc1}"
                                                    converter="#{FichaPersona5.converterNumeroClaseEnfAcc1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroClaseEnfAcc1}"
                                                    selected="#{currentRow.value['numero_clase_enf_acc']}"
                                                    toolTip="BundleParametros.numero_clase_enf_acc.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroClaseEnfAcc1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroClaseEnfAcc1Texto1}"
                                                    text="#{currentRow.value['codigo_clase_enf_acc_1x18y2']}"/>
                                                <webuijsf:message id="messageNumeroClaseEnfAcc1"
                                                    for="listaNumeroClaseEnfAcc1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnOtraClaseEnfAcc1}"
                                                    toolTip="BundleParametros.otra_clase_enf_acc.ficha_persona"
                                                    headerText="otra clase enfermedad accidente"
                                                    id="tableColumnOtraClaseEnfAcc1" rendered="false"
                                                    sort="otra_clase_enf_acc">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtraClaseEnfAcc1"
                                                    text="#{currentRow.value['otra_clase_enf_acc']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelOtraClaseEnfAcc1}"
                                                    id="labelOtraClaseEnfAcc1"
                                                    for="campoOtraClaseEnfAcc1"/>
                                                <webuijsf:textField id="campoOtraClaseEnfAcc1"
                                                    binding="#{FichaPersona5.campoOtraClaseEnfAcc1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otra_clase_enf_acc']}"
                                                    toolTip="BundleParametros.otra_clase_enf_acc.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorOtraClaseEnfAcc1.validate}"/>
                                                <webuijsf:staticText id="campoOtraClaseEnfAcc1Texto1"
                                                    binding="#{FichaPersona5.campoOtraClaseEnfAcc1Texto1}"
                                                    text="#{currentRow.value['otra_clase_enf_acc']}"/>
                                                <webuijsf:message id="messageOtraClaseEnfAcc1"
                                                    for="campoOtraClaseEnfAcc1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroClaseEnfCronica1}"
                                                    toolTip="BundleParametros.numero_clase_enf_cronica.ficha_persona"
                                                    headerText="clase enfermedad cronica"
                                                    id="tableColumnNumeroClaseEnfCronica1" rendered="false"
                                                    sort="codigo_clase_enf_cronic_1x19y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroClaseEnfCronica1"
                                                    text="#{currentRow.value['codigo_clase_enf_cronic_1x19y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroClaseEnfCronica1}"
                                                    id="labelNumeroClaseEnfCronica1"
                                                    for="listaNumeroClaseEnfCronica1"/>
                                                <webuijsf:dropDown id="listaNumeroClaseEnfCronica1"
                                                    binding="#{FichaPersona5.listaNumeroClaseEnfCronica1}"
                                                    converter="#{FichaPersona5.converterNumeroClaseEnfCronica1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroClaseEnfCronica1}"
                                                    selected="#{currentRow.value['numero_clase_enf_cronica']}"
                                                    toolTip="BundleParametros.numero_clase_enf_cronica.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroClaseEnfCronica1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroClaseEnfCronica1Texto1}"
                                                    text="#{currentRow.value['codigo_clase_enf_cronic_1x19y2']}"/>
                                                <webuijsf:message id="messageNumeroClaseEnfCronica1"
                                                    for="listaNumeroClaseEnfCronica1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnOtraClaseEnfCronica1}"
                                                    toolTip="BundleParametros.otra_clase_enf_cronica.ficha_persona"
                                                    headerText="otra clase enfermedad cronica"
                                                    id="tableColumnOtraClaseEnfCronica1" rendered="false"
                                                    sort="otra_clase_enf_cronica">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtraClaseEnfCronica1"
                                                    text="#{currentRow.value['otra_clase_enf_cronica']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelOtraClaseEnfCronica1}"
                                                    id="labelOtraClaseEnfCronica1"
                                                    for="campoOtraClaseEnfCronica1"/>
                                                <webuijsf:textField id="campoOtraClaseEnfCronica1"
                                                    binding="#{FichaPersona5.campoOtraClaseEnfCronica1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otra_clase_enf_cronica']}"
                                                    toolTip="BundleParametros.otra_clase_enf_cronica.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorOtraClaseEnfCronica1.validate}"/>
                                                <webuijsf:staticText id="campoOtraClaseEnfCronica1Texto1"
                                                    binding="#{FichaPersona5.campoOtraClaseEnfCronica1Texto1}"
                                                    text="#{currentRow.value['otra_clase_enf_cronica']}"/>
                                                <webuijsf:message id="messageOtraClaseEnfCronica1"
                                                    for="campoOtraClaseEnfCronica1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroSionoAtencionMedica1}"
                                                    toolTip="BundleParametros.numero_siono_atencion_medica.ficha_persona"
                                                    headerText="atenci&#243;n medica"
                                                    id="tableColumnNumeroSionoAtencionMedica1" rendered="false"
                                                    sort="codigo_siono_1x20y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoAtencionMedica1"
                                                    text="#{currentRow.value['codigo_siono_1x20y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroSionoAtencionMedica1}"
                                                    id="labelNumeroSionoAtencionMedica1"
                                                    for="listaNumeroSionoAtencionMedica1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoAtencionMedica1"
                                                    binding="#{FichaPersona5.listaNumeroSionoAtencionMedica1}"
                                                    converter="#{FichaPersona5.converterNumeroSionoAtencionMedica1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroSionoAtencionMedica1}"
                                                    selected="#{currentRow.value['numero_siono_atencion_medica']}"
                                                    toolTip="BundleParametros.numero_siono_atencion_medica.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoAtencionMedica1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroSionoAtencionMedica1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x20y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoAtencionMedica1"
                                                    for="listaNumeroSionoAtencionMedica1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroMotivoNoAtencion1}"
                                                    toolTip="BundleParametros.numero_motivo_no_atencion.ficha_persona"
                                                    headerText="motivo no atenci&#243;n"
                                                    id="tableColumnNumeroMotivoNoAtencion1" rendered="false"
                                                    sort="codigo_motivo_no_atenci_1x21y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroMotivoNoAtencion1"
                                                    text="#{currentRow.value['codigo_motivo_no_atenci_1x21y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroMotivoNoAtencion1}"
                                                    id="labelNumeroMotivoNoAtencion1"
                                                    for="listaNumeroMotivoNoAtencion1"/>
                                                <webuijsf:dropDown id="listaNumeroMotivoNoAtencion1"
                                                    binding="#{FichaPersona5.listaNumeroMotivoNoAtencion1}"
                                                    converter="#{FichaPersona5.converterNumeroMotivoNoAtencion1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroMotivoNoAtencion1}"
                                                    selected="#{currentRow.value['numero_motivo_no_atencion']}"
                                                    toolTip="BundleParametros.numero_motivo_no_atencion.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroMotivoNoAtencion1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroMotivoNoAtencion1Texto1}"
                                                    text="#{currentRow.value['codigo_motivo_no_atenci_1x21y2']}"/>
                                                <webuijsf:message id="messageNumeroMotivoNoAtencion1"
                                                    for="listaNumeroMotivoNoAtencion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnOtroMotivoNoAtencion1}"
                                                    toolTip="BundleParametros.otro_motivo_no_atencion.ficha_persona"
                                                    headerText="otro motivo no atenci&#243;n"
                                                    id="tableColumnOtroMotivoNoAtencion1" rendered="false"
                                                    sort="otro_motivo_no_atencion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtroMotivoNoAtencion1"
                                                    text="#{currentRow.value['otro_motivo_no_atencion']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelOtroMotivoNoAtencion1}"
                                                    id="labelOtroMotivoNoAtencion1"
                                                    for="campoOtroMotivoNoAtencion1"/>
                                                <webuijsf:textField id="campoOtroMotivoNoAtencion1"
                                                    binding="#{FichaPersona5.campoOtroMotivoNoAtencion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otro_motivo_no_atencion']}"
                                                    toolTip="BundleParametros.otro_motivo_no_atencion.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorOtroMotivoNoAtencion1.validate}"/>
                                                <webuijsf:staticText id="campoOtroMotivoNoAtencion1Texto1"
                                                    binding="#{FichaPersona5.campoOtroMotivoNoAtencion1Texto1}"
                                                    text="#{currentRow.value['otro_motivo_no_atencion']}"/>
                                                <webuijsf:message id="messageOtroMotivoNoAtencion1"
                                                    for="campoOtroMotivoNoAtencion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroSionoCarnetVacunacion1}"
                                                    toolTip="BundleParametros.numero_siono_carnet_vacunacion.ficha_persona"
                                                    headerText="carnet vacunaci&#243;n"
                                                    id="tableColumnNumeroSionoCarnetVacunacion1" rendered="false"
                                                    sort="codigo_siono_1x22y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoCarnetVacunacion1"
                                                    text="#{currentRow.value['codigo_siono_1x22y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroSionoCarnetVacunacion1}"
                                                    id="labelNumeroSionoCarnetVacunacion1"
                                                    for="listaNumeroSionoCarnetVacunacion1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoCarnetVacunacion1"
                                                    binding="#{FichaPersona5.listaNumeroSionoCarnetVacunacion1}"
                                                    converter="#{FichaPersona5.converterNumeroSionoCarnetVacunacion1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroSionoCarnetVacunacion1}"
                                                    selected="#{currentRow.value['numero_siono_carnet_vacunacion']}"
                                                    toolTip="BundleParametros.numero_siono_carnet_vacunacion.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoCarnetVacunacion1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroSionoCarnetVacunacion1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x22y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoCarnetVacunacion1"
                                                    for="listaNumeroSionoCarnetVacunacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroClaseImpedimento1}"
                                                    toolTip="BundleParametros.numero_clase_impedimento.ficha_persona"
                                                    headerText="clase impedimento"
                                                    id="tableColumnNumeroClaseImpedimento1" rendered="false"
                                                    sort="codigo_clase_impediment_1x23y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroClaseImpedimento1"
                                                    text="#{currentRow.value['codigo_clase_impediment_1x23y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroClaseImpedimento1}"
                                                    id="labelNumeroClaseImpedimento1"
                                                    for="listaNumeroClaseImpedimento1"/>
                                                <webuijsf:dropDown id="listaNumeroClaseImpedimento1"
                                                    binding="#{FichaPersona5.listaNumeroClaseImpedimento1}"
                                                    converter="#{FichaPersona5.converterNumeroClaseImpedimento1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroClaseImpedimento1}"
                                                    selected="#{currentRow.value['numero_clase_impedimento']}"
                                                    toolTip="BundleParametros.numero_clase_impedimento.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroClaseImpedimento1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroClaseImpedimento1Texto1}"
                                                    text="#{currentRow.value['codigo_clase_impediment_1x23y2']}"/>
                                                <webuijsf:message id="messageNumeroClaseImpedimento1"
                                                    for="listaNumeroClaseImpedimento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnOtraClaseImpedimento1}"
                                                    toolTip="BundleParametros.otra_clase_impedimento.ficha_persona"
                                                    headerText="otra clase impedimento"
                                                    id="tableColumnOtraClaseImpedimento1" rendered="false"
                                                    sort="otra_clase_impedimento">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtraClaseImpedimento1"
                                                    text="#{currentRow.value['otra_clase_impedimento']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelOtraClaseImpedimento1}"
                                                    id="labelOtraClaseImpedimento1"
                                                    for="campoOtraClaseImpedimento1"/>
                                                <webuijsf:textField id="campoOtraClaseImpedimento1"
                                                    binding="#{FichaPersona5.campoOtraClaseImpedimento1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otra_clase_impedimento']}"
                                                    toolTip="BundleParametros.otra_clase_impedimento.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorOtraClaseImpedimento1.validate}"/>
                                                <webuijsf:staticText id="campoOtraClaseImpedimento1Texto1"
                                                    binding="#{FichaPersona5.campoOtraClaseImpedimento1Texto1}"
                                                    text="#{currentRow.value['otra_clase_impedimento']}"/>
                                                <webuijsf:message id="messageOtraClaseImpedimento1"
                                                    for="campoOtraClaseImpedimento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroCausaImpedimento1}"
                                                    toolTip="BundleParametros.numero_causa_impedimento.ficha_persona"
                                                    headerText="causa impedimento"
                                                    id="tableColumnNumeroCausaImpedimento1" rendered="false"
                                                    sort="codigo_causa_impediment_1x24y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCausaImpedimento1"
                                                    text="#{currentRow.value['codigo_causa_impediment_1x24y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroCausaImpedimento1}"
                                                    id="labelNumeroCausaImpedimento1"
                                                    for="listaNumeroCausaImpedimento1"/>
                                                <webuijsf:dropDown id="listaNumeroCausaImpedimento1"
                                                    binding="#{FichaPersona5.listaNumeroCausaImpedimento1}"
                                                    converter="#{FichaPersona5.converterNumeroCausaImpedimento1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroCausaImpedimento1}"
                                                    selected="#{currentRow.value['numero_causa_impedimento']}"
                                                    toolTip="BundleParametros.numero_causa_impedimento.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroCausaImpedimento1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroCausaImpedimento1Texto1}"
                                                    text="#{currentRow.value['codigo_causa_impediment_1x24y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaImpedimento1"
                                                    for="listaNumeroCausaImpedimento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnOtraCausaImpedimento1}"
                                                    toolTip="BundleParametros.otra_causa_impedimento.ficha_persona"
                                                    headerText="otra causa impedimento"
                                                    id="tableColumnOtraCausaImpedimento1" rendered="false"
                                                    sort="otra_causa_impedimento">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtraCausaImpedimento1"
                                                    text="#{currentRow.value['otra_causa_impedimento']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelOtraCausaImpedimento1}"
                                                    id="labelOtraCausaImpedimento1"
                                                    for="campoOtraCausaImpedimento1"/>
                                                <webuijsf:textField id="campoOtraCausaImpedimento1"
                                                    binding="#{FichaPersona5.campoOtraCausaImpedimento1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otra_causa_impedimento']}"
                                                    toolTip="BundleParametros.otra_causa_impedimento.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorOtraCausaImpedimento1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaImpedimento1Texto1"
                                                    binding="#{FichaPersona5.campoOtraCausaImpedimento1Texto1}"
                                                    text="#{currentRow.value['otra_causa_impedimento']}"/>
                                                <webuijsf:message id="messageOtraCausaImpedimento1"
                                                    for="campoOtraCausaImpedimento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroSionoDifParaCaminar1}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_caminar.ficha_persona"
                                                    headerText="dificultad para caminar"
                                                    id="tableColumnNumeroSionoDifParaCaminar1" rendered="false"
                                                    sort="codigo_siono_1x25y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDifParaCaminar1"
                                                    text="#{currentRow.value['codigo_siono_1x25y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroSionoDifParaCaminar1}"
                                                    id="labelNumeroSionoDifParaCaminar1"
                                                    for="listaNumeroSionoDifParaCaminar1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaCaminar1"
                                                    binding="#{FichaPersona5.listaNumeroSionoDifParaCaminar1}"
                                                    converter="#{FichaPersona5.converterNumeroSionoDifParaCaminar1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroSionoDifParaCaminar1}"
                                                    selected="#{currentRow.value['numero_siono_dif_para_caminar']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_caminar.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaCaminar1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroSionoDifParaCaminar1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x25y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaCaminar1"
                                                    for="listaNumeroSionoDifParaCaminar1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroSionoDifParaVestirse1}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_vestirse.ficha_persona"
                                                    headerText="dificultad para vestirse"
                                                    id="tableColumnNumeroSionoDifParaVestirse1" rendered="false"
                                                    sort="codigo_siono_1x26y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDifParaVestirse1"
                                                    text="#{currentRow.value['codigo_siono_1x26y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroSionoDifParaVestirse1}"
                                                    id="labelNumeroSionoDifParaVestirse1"
                                                    for="listaNumeroSionoDifParaVestirse1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaVestirse1"
                                                    binding="#{FichaPersona5.listaNumeroSionoDifParaVestirse1}"
                                                    converter="#{FichaPersona5.converterNumeroSionoDifParaVestirse1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroSionoDifParaVestirse1}"
                                                    selected="#{currentRow.value['numero_siono_dif_para_vestirse']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_vestirse.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaVestirse1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroSionoDifParaVestirse1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x26y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaVestirse1"
                                                    for="listaNumeroSionoDifParaVestirse1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroSionoDifParaBanarse1}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_banarse.ficha_persona"
                                                    headerText="dificultad para ba&#241;arse"
                                                    id="tableColumnNumeroSionoDifParaBanarse1" rendered="false"
                                                    sort="codigo_siono_1x27y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDifParaBanarse1"
                                                    text="#{currentRow.value['codigo_siono_1x27y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroSionoDifParaBanarse1}"
                                                    id="labelNumeroSionoDifParaBanarse1"
                                                    for="listaNumeroSionoDifParaBanarse1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaBanarse1"
                                                    binding="#{FichaPersona5.listaNumeroSionoDifParaBanarse1}"
                                                    converter="#{FichaPersona5.converterNumeroSionoDifParaBanarse1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroSionoDifParaBanarse1}"
                                                    selected="#{currentRow.value['numero_siono_dif_para_banarse']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_banarse.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaBanarse1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroSionoDifParaBanarse1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x27y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaBanarse1"
                                                    for="listaNumeroSionoDifParaBanarse1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroSionoDifParaComer1}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_comer.ficha_persona"
                                                    headerText="dificultad para comer"
                                                    id="tableColumnNumeroSionoDifParaComer1" rendered="false"
                                                    sort="codigo_siono_1x28y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDifParaComer1"
                                                    text="#{currentRow.value['codigo_siono_1x28y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroSionoDifParaComer1}"
                                                    id="labelNumeroSionoDifParaComer1"
                                                    for="listaNumeroSionoDifParaComer1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaComer1"
                                                    binding="#{FichaPersona5.listaNumeroSionoDifParaComer1}"
                                                    converter="#{FichaPersona5.converterNumeroSionoDifParaComer1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroSionoDifParaComer1}"
                                                    selected="#{currentRow.value['numero_siono_dif_para_comer']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_comer.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaComer1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroSionoDifParaComer1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x28y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaComer1"
                                                    for="listaNumeroSionoDifParaComer1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroSionoDifParaLaCama1}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_la_cama.ficha_persona"
                                                    headerText="dificultad para la cama"
                                                    id="tableColumnNumeroSionoDifParaLaCama1" rendered="false"
                                                    sort="codigo_siono_1x29y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDifParaLaCama1"
                                                    text="#{currentRow.value['codigo_siono_1x29y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroSionoDifParaLaCama1}"
                                                    id="labelNumeroSionoDifParaLaCama1"
                                                    for="listaNumeroSionoDifParaLaCama1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaLaCama1"
                                                    binding="#{FichaPersona5.listaNumeroSionoDifParaLaCama1}"
                                                    converter="#{FichaPersona5.converterNumeroSionoDifParaLaCama1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroSionoDifParaLaCama1}"
                                                    selected="#{currentRow.value['numero_siono_dif_para_la_cama']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_la_cama.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaLaCama1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroSionoDifParaLaCama1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x29y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaLaCama1"
                                                    for="listaNumeroSionoDifParaLaCama1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroSionoDifParaElBano1}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_el_bano.ficha_persona"
                                                    headerText="dificultad para el ba&#241;o"
                                                    id="tableColumnNumeroSionoDifParaElBano1" rendered="false"
                                                    sort="codigo_siono_1x30y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoDifParaElBano1"
                                                    text="#{currentRow.value['codigo_siono_1x30y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroSionoDifParaElBano1}"
                                                    id="labelNumeroSionoDifParaElBano1"
                                                    for="listaNumeroSionoDifParaElBano1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaElBano1"
                                                    binding="#{FichaPersona5.listaNumeroSionoDifParaElBano1}"
                                                    converter="#{FichaPersona5.converterNumeroSionoDifParaElBano1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroSionoDifParaElBano1}"
                                                    selected="#{currentRow.value['numero_siono_dif_para_el_bano']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_el_bano.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaElBano1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroSionoDifParaElBano1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x30y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaElBano1"
                                                    for="listaNumeroSionoDifParaElBano1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroSionoTrabajo1}"
                                                    toolTip="BundleParametros.numero_siono_trabajo.ficha_persona"
                                                    headerText="trabajo"
                                                    id="tableColumnNumeroSionoTrabajo1" rendered="false"
                                                    sort="codigo_siono_1x31y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSionoTrabajo1"
                                                    text="#{currentRow.value['codigo_siono_1x31y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroSionoTrabajo1}"
                                                    id="labelNumeroSionoTrabajo1"
                                                    for="listaNumeroSionoTrabajo1"/>
                                                <webuijsf:dropDown id="listaNumeroSionoTrabajo1"
                                                    binding="#{FichaPersona5.listaNumeroSionoTrabajo1}"
                                                    converter="#{FichaPersona5.converterNumeroSionoTrabajo1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroSionoTrabajo1}"
                                                    selected="#{currentRow.value['numero_siono_trabajo']}"
                                                    toolTip="BundleParametros.numero_siono_trabajo.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoTrabajo1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroSionoTrabajo1Texto1}"
                                                    text="#{currentRow.value['codigo_siono_1x31y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoTrabajo1"
                                                    for="listaNumeroSionoTrabajo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroMotivoNoTrabajo1}"
                                                    toolTip="BundleParametros.numero_motivo_no_trabajo.ficha_persona"
                                                    headerText="motivo no trabajo"
                                                    id="tableColumnNumeroMotivoNoTrabajo1" rendered="false"
                                                    sort="codigo_motivo_no_trabaj_1x32y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroMotivoNoTrabajo1"
                                                    text="#{currentRow.value['codigo_motivo_no_trabaj_1x32y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroMotivoNoTrabajo1}"
                                                    id="labelNumeroMotivoNoTrabajo1"
                                                    for="listaNumeroMotivoNoTrabajo1"/>
                                                <webuijsf:dropDown id="listaNumeroMotivoNoTrabajo1"
                                                    binding="#{FichaPersona5.listaNumeroMotivoNoTrabajo1}"
                                                    converter="#{FichaPersona5.converterNumeroMotivoNoTrabajo1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroMotivoNoTrabajo1}"
                                                    selected="#{currentRow.value['numero_motivo_no_trabajo']}"
                                                    toolTip="BundleParametros.numero_motivo_no_trabajo.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroMotivoNoTrabajo1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroMotivoNoTrabajo1Texto1}"
                                                    text="#{currentRow.value['codigo_motivo_no_trabaj_1x32y2']}"/>
                                                <webuijsf:message id="messageNumeroMotivoNoTrabajo1"
                                                    for="listaNumeroMotivoNoTrabajo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnOtroMotivoNoTrabajo1}"
                                                    toolTip="BundleParametros.otro_motivo_no_trabajo.ficha_persona"
                                                    headerText="otro motivo no trabajo"
                                                    id="tableColumnOtroMotivoNoTrabajo1" rendered="false"
                                                    sort="otro_motivo_no_trabajo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtroMotivoNoTrabajo1"
                                                    text="#{currentRow.value['otro_motivo_no_trabajo']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelOtroMotivoNoTrabajo1}"
                                                    id="labelOtroMotivoNoTrabajo1"
                                                    for="campoOtroMotivoNoTrabajo1"/>
                                                <webuijsf:textField id="campoOtroMotivoNoTrabajo1"
                                                    binding="#{FichaPersona5.campoOtroMotivoNoTrabajo1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['otro_motivo_no_trabajo']}"
                                                    toolTip="BundleParametros.otro_motivo_no_trabajo.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorOtroMotivoNoTrabajo1.validate}"/>
                                                <webuijsf:staticText id="campoOtroMotivoNoTrabajo1Texto1"
                                                    binding="#{FichaPersona5.campoOtroMotivoNoTrabajo1Texto1}"
                                                    text="#{currentRow.value['otro_motivo_no_trabajo']}"/>
                                                <webuijsf:message id="messageOtroMotivoNoTrabajo1"
                                                    for="campoOtroMotivoNoTrabajo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnDescripcionOcupacionPrin1}"
                                                    toolTip="BundleParametros.descripcion_ocupacion_prin.ficha_persona"
                                                    headerText="descripci&#243;n ocupaci&#243;n principal"
                                                    id="tableColumnDescripcionOcupacionPrin1" rendered="false"
                                                    sort="descripcion_ocupacion_prin">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionOcupacionPrin1"
                                                    text="#{currentRow.value['descripcion_ocupacion_prin']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelDescripcionOcupacionPrin1}"
                                                    id="labelDescripcionOcupacionPrin1"
                                                    for="campoDescripcionOcupacionPrin1"/>
                                                <webuijsf:textField id="campoDescripcionOcupacionPrin1"
                                                    binding="#{FichaPersona5.campoDescripcionOcupacionPrin1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_ocupacion_prin']}"
                                                    toolTip="BundleParametros.descripcion_ocupacion_prin.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorDescripcionOcupacionPrin1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionOcupacionPrin1Texto1"
                                                    binding="#{FichaPersona5.campoDescripcionOcupacionPrin1Texto1}"
                                                    text="#{currentRow.value['descripcion_ocupacion_prin']}"/>
                                                <webuijsf:message id="messageDescripcionOcupacionPrin1"
                                                    for="campoDescripcionOcupacionPrin1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnDescripcionDedicacionPrin1}"
                                                    toolTip="BundleParametros.descripcion_dedicacion_prin.ficha_persona"
                                                    headerText="descripci&#243;n dedicaci&#243;n principal"
                                                    id="tableColumnDescripcionDedicacionPrin1" rendered="false"
                                                    sort="descripcion_dedicacion_prin">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDescripcionDedicacionPrin1"
                                                    text="#{currentRow.value['descripcion_dedicacion_prin']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelDescripcionDedicacionPrin1}"
                                                    id="labelDescripcionDedicacionPrin1"
                                                    for="campoDescripcionDedicacionPrin1"/>
                                                <webuijsf:textField id="campoDescripcionDedicacionPrin1"
                                                    binding="#{FichaPersona5.campoDescripcionDedicacionPrin1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['descripcion_dedicacion_prin']}"
                                                    toolTip="BundleParametros.descripcion_dedicacion_prin.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorDescripcionDedicacionPrin1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionDedicacionPrin1Texto1"
                                                    binding="#{FichaPersona5.campoDescripcionDedicacionPrin1Texto1}"
                                                    text="#{currentRow.value['descripcion_dedicacion_prin']}"/>
                                                <webuijsf:message id="messageDescripcionDedicacionPrin1"
                                                    for="campoDescripcionDedicacionPrin1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnNumeroTipoRelacionLab1}"
                                                    toolTip="BundleParametros.numero_tipo_relacion_lab.ficha_persona"
                                                    headerText="tipo relaci&#243;n laboral"
                                                    id="tableColumnNumeroTipoRelacionLab1" rendered="false"
                                                    sort="codigo_tipo_relacion_la_1x33y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoRelacionLab1"
                                                    text="#{currentRow.value['codigo_tipo_relacion_la_1x33y2']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelNumeroTipoRelacionLab1}"
                                                    id="labelNumeroTipoRelacionLab1"
                                                    for="listaNumeroTipoRelacionLab1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoRelacionLab1"
                                                    binding="#{FichaPersona5.listaNumeroTipoRelacionLab1}"
                                                    converter="#{FichaPersona5.converterNumeroTipoRelacionLab1}"
                                                    disabled="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    items="#{FichaPersona5.asistente.opcionesListaNumeroTipoRelacionLab1}"
                                                    selected="#{currentRow.value['numero_tipo_relacion_lab']}"
                                                    toolTip="BundleParametros.numero_tipo_relacion_lab.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoRelacionLab1Texto1"
                                                    binding="#{FichaPersona5.listaNumeroTipoRelacionLab1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_relacion_la_1x33y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoRelacionLab1"
                                                    for="listaNumeroTipoRelacionLab1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnMontoIngresoOcupacionPrin1}"
                                                    toolTip="BundleParametros.monto_ingreso_ocupacion_prin.ficha_persona"
                                                    headerText="monto ingreso ocupaci&#243;n principal"
                                                    id="tableColumnMontoIngresoOcupacionPrin1" rendered="false"
                                                    sort="monto_ingreso_ocupacion_prin">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoOcupacionPrin1"
                                                    text="#{currentRow.value['monto_ingreso_ocupacion_prin']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelMontoIngresoOcupacionPrin1}"
                                                    id="labelMontoIngresoOcupacionPrin1"
                                                    for="campoMontoIngresoOcupacionPrin1"/>
                                                <webuijsf:textField id="campoMontoIngresoOcupacionPrin1"
                                                    binding="#{FichaPersona5.campoMontoIngresoOcupacionPrin1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoOcupacionPrin1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_ocupacion_prin']}"
                                                    toolTip="BundleParametros.monto_ingreso_ocupacion_prin.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorMontoIngresoOcupacionPrin1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoOcupacionPrin1Texto1"
                                                    binding="#{FichaPersona5.campoMontoIngresoOcupacionPrin1Texto1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoOcupacionPrin1}"
                                                    text="#{currentRow.value['monto_ingreso_ocupacion_prin']}"/>
                                                <webuijsf:message id="messageMontoIngresoOcupacionPrin1"
                                                    for="campoMontoIngresoOcupacionPrin1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnMontoIngresoOcupacionSecun1}"
                                                    toolTip="BundleParametros.monto_ingreso_ocupacion_secun.ficha_persona"
                                                    headerText="monto ingreso ocupaci&#243;n secundaria"
                                                    id="tableColumnMontoIngresoOcupacionSecun1" rendered="false"
                                                    sort="monto_ingreso_ocupacion_secun">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoOcupacionSecun1"
                                                    text="#{currentRow.value['monto_ingreso_ocupacion_secun']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelMontoIngresoOcupacionSecun1}"
                                                    id="labelMontoIngresoOcupacionSecun1"
                                                    for="campoMontoIngresoOcupacionSecun1"/>
                                                <webuijsf:textField id="campoMontoIngresoOcupacionSecun1"
                                                    binding="#{FichaPersona5.campoMontoIngresoOcupacionSecun1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoOcupacionSecun1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_ocupacion_secun']}"
                                                    toolTip="BundleParametros.monto_ingreso_ocupacion_secun.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorMontoIngresoOcupacionSecun1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoOcupacionSecun1Texto1"
                                                    binding="#{FichaPersona5.campoMontoIngresoOcupacionSecun1Texto1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoOcupacionSecun1}"
                                                    text="#{currentRow.value['monto_ingreso_ocupacion_secun']}"/>
                                                <webuijsf:message id="messageMontoIngresoOcupacionSecun1"
                                                    for="campoMontoIngresoOcupacionSecun1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnMontoIngresoOtrasOcup1}"
                                                    toolTip="BundleParametros.monto_ingreso_otras_ocup.ficha_persona"
                                                    headerText="monto ingreso otras ocupaciones"
                                                    id="tableColumnMontoIngresoOtrasOcup1" rendered="false"
                                                    sort="monto_ingreso_otras_ocup">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoOtrasOcup1"
                                                    text="#{currentRow.value['monto_ingreso_otras_ocup']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelMontoIngresoOtrasOcup1}"
                                                    id="labelMontoIngresoOtrasOcup1"
                                                    for="campoMontoIngresoOtrasOcup1"/>
                                                <webuijsf:textField id="campoMontoIngresoOtrasOcup1"
                                                    binding="#{FichaPersona5.campoMontoIngresoOtrasOcup1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoOtrasOcup1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_otras_ocup']}"
                                                    toolTip="BundleParametros.monto_ingreso_otras_ocup.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorMontoIngresoOtrasOcup1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoOtrasOcup1Texto1"
                                                    binding="#{FichaPersona5.campoMontoIngresoOtrasOcup1Texto1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoOtrasOcup1}"
                                                    text="#{currentRow.value['monto_ingreso_otras_ocup']}"/>
                                                <webuijsf:message id="messageMontoIngresoOtrasOcup1"
                                                    for="campoMontoIngresoOtrasOcup1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnMontoIngresoAlquileres1}"
                                                    toolTip="BundleParametros.monto_ingreso_alquileres.ficha_persona"
                                                    headerText="monto ingreso alquileres"
                                                    id="tableColumnMontoIngresoAlquileres1" rendered="false"
                                                    sort="monto_ingreso_alquileres">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoAlquileres1"
                                                    text="#{currentRow.value['monto_ingreso_alquileres']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelMontoIngresoAlquileres1}"
                                                    id="labelMontoIngresoAlquileres1"
                                                    for="campoMontoIngresoAlquileres1"/>
                                                <webuijsf:textField id="campoMontoIngresoAlquileres1"
                                                    binding="#{FichaPersona5.campoMontoIngresoAlquileres1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoAlquileres1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_alquileres']}"
                                                    toolTip="BundleParametros.monto_ingreso_alquileres.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorMontoIngresoAlquileres1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoAlquileres1Texto1"
                                                    binding="#{FichaPersona5.campoMontoIngresoAlquileres1Texto1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoAlquileres1}"
                                                    text="#{currentRow.value['monto_ingreso_alquileres']}"/>
                                                <webuijsf:message id="messageMontoIngresoAlquileres1"
                                                    for="campoMontoIngresoAlquileres1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnMontoIngresoIntereses1}"
                                                    toolTip="BundleParametros.monto_ingreso_intereses.ficha_persona"
                                                    headerText="monto ingreso intereses"
                                                    id="tableColumnMontoIngresoIntereses1" rendered="false"
                                                    sort="monto_ingreso_intereses">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoIntereses1"
                                                    text="#{currentRow.value['monto_ingreso_intereses']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelMontoIngresoIntereses1}"
                                                    id="labelMontoIngresoIntereses1"
                                                    for="campoMontoIngresoIntereses1"/>
                                                <webuijsf:textField id="campoMontoIngresoIntereses1"
                                                    binding="#{FichaPersona5.campoMontoIngresoIntereses1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoIntereses1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_intereses']}"
                                                    toolTip="BundleParametros.monto_ingreso_intereses.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorMontoIngresoIntereses1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoIntereses1Texto1"
                                                    binding="#{FichaPersona5.campoMontoIngresoIntereses1Texto1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoIntereses1}"
                                                    text="#{currentRow.value['monto_ingreso_intereses']}"/>
                                                <webuijsf:message id="messageMontoIngresoIntereses1"
                                                    for="campoMontoIngresoIntereses1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnMontoIngresoAyudaFamPais1}"
                                                    toolTip="BundleParametros.monto_ingreso_ayuda_fam_pais.ficha_persona"
                                                    headerText="monto ingreso ayuda familiar pais"
                                                    id="tableColumnMontoIngresoAyudaFamPais1" rendered="false"
                                                    sort="monto_ingreso_ayuda_fam_pais">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoAyudaFamPais1"
                                                    text="#{currentRow.value['monto_ingreso_ayuda_fam_pais']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelMontoIngresoAyudaFamPais1}"
                                                    id="labelMontoIngresoAyudaFamPais1"
                                                    for="campoMontoIngresoAyudaFamPais1"/>
                                                <webuijsf:textField id="campoMontoIngresoAyudaFamPais1"
                                                    binding="#{FichaPersona5.campoMontoIngresoAyudaFamPais1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoAyudaFamPais1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_ayuda_fam_pais']}"
                                                    toolTip="BundleParametros.monto_ingreso_ayuda_fam_pais.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorMontoIngresoAyudaFamPais1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoAyudaFamPais1Texto1"
                                                    binding="#{FichaPersona5.campoMontoIngresoAyudaFamPais1Texto1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoAyudaFamPais1}"
                                                    text="#{currentRow.value['monto_ingreso_ayuda_fam_pais']}"/>
                                                <webuijsf:message id="messageMontoIngresoAyudaFamPais1"
                                                    for="campoMontoIngresoAyudaFamPais1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnMontoIngresoAyudaFamExter1}"
                                                    toolTip="BundleParametros.monto_ingreso_ayuda_fam_exter.ficha_persona"
                                                    headerText="monto ingreso ayuda familiar exterior"
                                                    id="tableColumnMontoIngresoAyudaFamExter1" rendered="false"
                                                    sort="monto_ingreso_ayuda_fam_exter">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoAyudaFamExter1"
                                                    text="#{currentRow.value['monto_ingreso_ayuda_fam_exter']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelMontoIngresoAyudaFamExter1}"
                                                    id="labelMontoIngresoAyudaFamExter1"
                                                    for="campoMontoIngresoAyudaFamExter1"/>
                                                <webuijsf:textField id="campoMontoIngresoAyudaFamExter1"
                                                    binding="#{FichaPersona5.campoMontoIngresoAyudaFamExter1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoAyudaFamExter1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_ayuda_fam_exter']}"
                                                    toolTip="BundleParametros.monto_ingreso_ayuda_fam_exter.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorMontoIngresoAyudaFamExter1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoAyudaFamExter1Texto1"
                                                    binding="#{FichaPersona5.campoMontoIngresoAyudaFamExter1Texto1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoAyudaFamExter1}"
                                                    text="#{currentRow.value['monto_ingreso_ayuda_fam_exter']}"/>
                                                <webuijsf:message id="messageMontoIngresoAyudaFamExter1"
                                                    for="campoMontoIngresoAyudaFamExter1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnMontoIngresoJubilacion1}"
                                                    toolTip="BundleParametros.monto_ingreso_jubilacion.ficha_persona"
                                                    headerText="monto ingreso jubilaci&#243;n"
                                                    id="tableColumnMontoIngresoJubilacion1" rendered="false"
                                                    sort="monto_ingreso_jubilacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoJubilacion1"
                                                    text="#{currentRow.value['monto_ingreso_jubilacion']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelMontoIngresoJubilacion1}"
                                                    id="labelMontoIngresoJubilacion1"
                                                    for="campoMontoIngresoJubilacion1"/>
                                                <webuijsf:textField id="campoMontoIngresoJubilacion1"
                                                    binding="#{FichaPersona5.campoMontoIngresoJubilacion1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoJubilacion1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_jubilacion']}"
                                                    toolTip="BundleParametros.monto_ingreso_jubilacion.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorMontoIngresoJubilacion1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoJubilacion1Texto1"
                                                    binding="#{FichaPersona5.campoMontoIngresoJubilacion1Texto1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoJubilacion1}"
                                                    text="#{currentRow.value['monto_ingreso_jubilacion']}"/>
                                                <webuijsf:message id="messageMontoIngresoJubilacion1"
                                                    for="campoMontoIngresoJubilacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnMontoIngresoPensiones1}"
                                                    toolTip="BundleParametros.monto_ingreso_pensiones.ficha_persona"
                                                    headerText="monto ingreso pensiones"
                                                    id="tableColumnMontoIngresoPensiones1" rendered="false"
                                                    sort="monto_ingreso_pensiones">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoPensiones1"
                                                    text="#{currentRow.value['monto_ingreso_pensiones']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelMontoIngresoPensiones1}"
                                                    id="labelMontoIngresoPensiones1"
                                                    for="campoMontoIngresoPensiones1"/>
                                                <webuijsf:textField id="campoMontoIngresoPensiones1"
                                                    binding="#{FichaPersona5.campoMontoIngresoPensiones1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoPensiones1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_pensiones']}"
                                                    toolTip="BundleParametros.monto_ingreso_pensiones.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorMontoIngresoPensiones1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoPensiones1Texto1"
                                                    binding="#{FichaPersona5.campoMontoIngresoPensiones1Texto1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoPensiones1}"
                                                    text="#{currentRow.value['monto_ingreso_pensiones']}"/>
                                                <webuijsf:message id="messageMontoIngresoPensiones1"
                                                    for="campoMontoIngresoPensiones1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnMontoIngresoTekopora1}"
                                                    toolTip="BundleParametros.monto_ingreso_tekopora.ficha_persona"
                                                    headerText="monto ingreso tekopora"
                                                    id="tableColumnMontoIngresoTekopora1" rendered="false"
                                                    sort="monto_ingreso_tekopora">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoTekopora1"
                                                    text="#{currentRow.value['monto_ingreso_tekopora']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelMontoIngresoTekopora1}"
                                                    id="labelMontoIngresoTekopora1"
                                                    for="campoMontoIngresoTekopora1"/>
                                                <webuijsf:textField id="campoMontoIngresoTekopora1"
                                                    binding="#{FichaPersona5.campoMontoIngresoTekopora1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoTekopora1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_tekopora']}"
                                                    toolTip="BundleParametros.monto_ingreso_tekopora.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorMontoIngresoTekopora1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoTekopora1Texto1"
                                                    binding="#{FichaPersona5.campoMontoIngresoTekopora1Texto1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoTekopora1}"
                                                    text="#{currentRow.value['monto_ingreso_tekopora']}"/>
                                                <webuijsf:message id="messageMontoIngresoTekopora1"
                                                    for="campoMontoIngresoTekopora1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnMontoIngresoProgramas1}"
                                                    toolTip="BundleParametros.monto_ingreso_programas.ficha_persona"
                                                    headerText="monto ingreso programas"
                                                    id="tableColumnMontoIngresoProgramas1" rendered="false"
                                                    sort="monto_ingreso_programas">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoProgramas1"
                                                    text="#{currentRow.value['monto_ingreso_programas']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelMontoIngresoProgramas1}"
                                                    id="labelMontoIngresoProgramas1"
                                                    for="campoMontoIngresoProgramas1"/>
                                                <webuijsf:textField id="campoMontoIngresoProgramas1"
                                                    binding="#{FichaPersona5.campoMontoIngresoProgramas1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoProgramas1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_programas']}"
                                                    toolTip="BundleParametros.monto_ingreso_programas.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorMontoIngresoProgramas1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoProgramas1Texto1"
                                                    binding="#{FichaPersona5.campoMontoIngresoProgramas1Texto1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoProgramas1}"
                                                    text="#{currentRow.value['monto_ingreso_programas']}"/>
                                                <webuijsf:message id="messageMontoIngresoProgramas1"
                                                    for="campoMontoIngresoProgramas1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnMontoIngresoAdicional1}"
                                                    toolTip="BundleParametros.monto_ingreso_adicional.ficha_persona"
                                                    headerText="monto ingreso adicional"
                                                    id="tableColumnMontoIngresoAdicional1" rendered="false"
                                                    sort="monto_ingreso_adicional">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoIngresoAdicional1"
                                                    text="#{currentRow.value['monto_ingreso_adicional']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelMontoIngresoAdicional1}"
                                                    id="labelMontoIngresoAdicional1"
                                                    for="campoMontoIngresoAdicional1"/>
                                                <webuijsf:textField id="campoMontoIngresoAdicional1"
                                                    binding="#{FichaPersona5.campoMontoIngresoAdicional1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoAdicional1}"
                                                    readOnly="#{FichaPersona5.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['monto_ingreso_adicional']}"
                                                    toolTip="BundleParametros.monto_ingreso_adicional.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorMontoIngresoAdicional1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoAdicional1Texto1"
                                                    binding="#{FichaPersona5.campoMontoIngresoAdicional1Texto1}"
                                                    converter="#{FichaPersona5.converterMontoIngresoAdicional1}"
                                                    text="#{currentRow.value['monto_ingreso_adicional']}"/>
                                                <webuijsf:message id="messageMontoIngresoAdicional1"
                                                    for="campoMontoIngresoAdicional1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnTotalIngresoMensual1}"
                                                    toolTip="BundleParametros.total_ingreso_mensual.ficha_persona"
                                                    headerText="total ingreso mensual"
                                                    id="tableColumnTotalIngresoMensual1" rendered="false"
                                                    sort="total_ingreso_mensual">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextTotalIngresoMensual1"
                                                    text="#{currentRow.value['total_ingreso_mensual']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelTotalIngresoMensual1}"
                                                    id="labelTotalIngresoMensual1"
                                                    for="campoTotalIngresoMensual1"/>
                                                <webuijsf:textField id="campoTotalIngresoMensual1"
                                                    binding="#{FichaPersona5.campoTotalIngresoMensual1}"
                                                    converter="#{FichaPersona5.converterTotalIngresoMensual1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['total_ingreso_mensual']}"
                                                    toolTip="BundleParametros.total_ingreso_mensual.ficha_persona"
                                                    validatorExpression="#{FichaPersona5.validatorTotalIngresoMensual1.validate}"/>
                                                <webuijsf:staticText id="campoTotalIngresoMensual1Texto1"
                                                    binding="#{FichaPersona5.campoTotalIngresoMensual1Texto1}"
                                                    converter="#{FichaPersona5.converterTotalIngresoMensual1}"
                                                    text="#{currentRow.value['total_ingreso_mensual']}"/>
                                                <webuijsf:message id="messageTotalIngresoMensual1"
                                                    for="campoTotalIngresoMensual1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnIdPotencialBen1}"
                                                    toolTip="BundleParametros.id_potencial_ben.ficha_persona"
                                                    headerText="potencial beneficiario"
                                                    id="tableColumnIdPotencialBen1" rendered="false"
                                                    sort="codigo_potencial_ben_1x34y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPotencialBen1"
                                                    text="#{currentRow.value['codigo_potencial_ben_1x34y3']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelIdPotencialBen1}"
                                                    id="labelIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                <webuijsf:textField id="campoIdPotencialBen1"
                                                    binding="#{FichaPersona5.campoIdPotencialBen1}"
                                                    readOnly="true"
                                                    text="#{FichaPersona5.asistente.textoCampoIdPotencialBen1}"
                                                    toolTip="#{FichaPersona5.asistente.toolTipCampoIdPotencialBen1}"
                                                    validatorExpression="#{FichaPersona5.campoIdPotencialBen1_validate}"/>
                                                <webuijsf:staticText id="campoIdPotencialBen1Texto1"
                                                    binding="#{FichaPersona5.campoIdPotencialBen1Texto1}"
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
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersona5.campoIdPotencialBen1Boton1}"
                                                    id="campoIdPotencialBen1Boton1"
                                                    onClick="#{FichaPersona5.asistente.scriptCampoIdPotencialBen1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersona5.campoIdPotencialBen1Boton3}"
                                                    id="campoIdPotencialBen1Boton3"
                                                    onClick="#{FichaPersona5.asistente.scriptCampoIdPotencialBen1Boton2}"
                                                    rendered="#{FichaPersona5.asistente.campoIdPotencialBen1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{FichaPersona5.tableColumnIdPotencialBen2}"
                                                    headerText="nombre potencial beneficiario"
                                                    id="tableColumnIdPotencialBen2" rendered="false"
                                                    sort="nombre_potencial_ben_1x34y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPotencialBen2"
                                                    text="#{currentRow.value['nombre_potencial_ben_1x34y4']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelIdPotencialBen2}"
                                                    id="labelIdPotencialBen2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{FichaPersona5.campoIdPotencialBen1Hiper1}"
                                                    id="campoIdPotencialBen1Hiper1"
                                                    text="#{currentRow.value['nombre_potencial_ben_1x34y4']}"
                                                    onClick="#{FichaPersona5.asistente.scriptCampoIdPotencialBen1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdPotencialBen1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnEsFichaPersonaImportada1}"
                                                    toolTip="BundleParametros.es_ficha_persona_importada.ficha_persona"
                                                    headerText="importada"
                                                    id="tableColumnEsFichaPersonaImportada1" rendered="false"
                                                    sort="es_ficha_persona_importada">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsFichaPersonaImportada1"
                                                    text="#{currentRow.value['es_ficha_persona_importada']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelEsFichaPersonaImportada1}"
                                                    id="labelEsFichaPersonaImportada1"
                                                    for="listaEsFichaPersonaImportada1"/>
                                                <webuijsf:dropDown id="listaEsFichaPersonaImportada1"
                                                    binding="#{FichaPersona5.listaEsFichaPersonaImportada1}"
                                                    converter="#{FichaPersona5.converterEsFichaPersonaImportada1}"
                                                    disabled="true"
                                                    items="#{FichaPersona5.asistente.opcionesListaEsFichaPersonaImportada1}"
                                                    selected="#{currentRow.value['es_ficha_persona_importada']}"
                                                    toolTip="BundleParametros.es_ficha_persona_importada.ficha_persona"/>
                                                <webuijsf:staticText id="listaEsFichaPersonaImportada1Texto1"
                                                    binding="#{FichaPersona5.listaEsFichaPersonaImportada1Texto1}"/>
                                                <webuijsf:message id="messageEsFichaPersonaImportada1"
                                                    for="listaEsFichaPersonaImportada1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{FichaPersona5.tableColumnFechaImportacion1}"
                                                    toolTip="BundleParametros.fecha_importacion.ficha_persona"
                                                    headerText="fecha importaci&#243;n"
                                                    id="tableColumnFechaImportacion1" rendered="false"
                                                    sort="fecha_importacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaImportacion1"
                                                    text="#{currentRow.value['fecha_importacion']}"
                                                    rendered="#{FichaPersona5.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{FichaPersona5.labelFechaImportacion1}"
                                                    id="labelFechaImportacion1"
                                                    for="campoFechaImportacion1"/>
                                                <webuijsf:textField id="campoFechaImportacion1"
                                                    binding="#{FichaPersona5.campoFechaImportacion1}"
                                                    converter="#{FichaPersona5.converterFechaImportacion1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_importacion']}"
                                                    toolTip="BundleParametros.fecha_importacion.ficha_persona"/>
                                                <webuijsf:staticText id="campoFechaImportacion1Texto1"
                                                    binding="#{FichaPersona5.campoFechaImportacion1Texto1}"
                                                    converter="#{FichaPersona5.converterFechaImportacion1}"
                                                    text="#{currentRow.value['fecha_importacion']}"/>
                                                <webuijsf:message id="messageFechaImportacion1"
                                                    for="campoFechaImportacion1"/>
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
                                                        binding="#{FichaPersona5.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{FichaPersona5.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{FichaPersona5.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{FichaPersona5.textoFilasPorPagina1Converter1}"
                                                        disabled="#{FichaPersona5.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{FichaPersona5.gestor.filasPorPagina}" 
                                                        validatorExpression="#{FichaPersona5.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{FichaPersona5.botonRepaginar1_action}"
                                                        binding="#{FichaPersona5.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{FichaPersona5.gestor.urlImagenRepaginar}" 
                                                        onClick="#{FichaPersona5.gestor.scriptRepaginar}"
                                                        text="#{FichaPersona5.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{FichaPersona5.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersona5.botonAgregar1_action}"
                                                    binding="#{FichaPersona5.botonAgregar1}"
                                                    disabled="#{FichaPersona5.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{FichaPersona5.gestor.scriptAgregar}"
                                                    rendered="#{FichaPersona5.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersona5.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{FichaPersona5.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FichaPersona5.listaFuncionEdicion1}"
                                                    converter="#{FichaPersona5.converterListaFuncionEdicion1}"
                                                    disabled="#{FichaPersona5.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{FichaPersona5.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{FichaPersona5.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{FichaPersona5.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{FichaPersona5.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersona5.botonEditar1_action}"
                                                    binding="#{FichaPersona5.botonEditar1}"
                                                    disabled="#{FichaPersona5.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{FichaPersona5.gestor.scriptEditar}"
                                                    rendered="#{FichaPersona5.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersona5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{FichaPersona5.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersona5.botonEliminar1_action}"
                                                    binding="#{FichaPersona5.botonEliminar1}"
                                                    disabled="#{FichaPersona5.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{FichaPersona5.gestor.scriptEliminar}"
                                                    rendered="#{FichaPersona5.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersona5.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{FichaPersona5.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersona5.botonAplicar1_action}"
                                                    binding="#{FichaPersona5.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{FichaPersona5.gestor.scriptAplicar}"
                                                    rendered="#{FichaPersona5.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersona5.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{FichaPersona5.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersona5.botonDeshacer1_action}"
                                                    binding="#{FichaPersona5.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{FichaPersona5.gestor.scriptDeshacer}"
                                                    rendered="#{FichaPersona5.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersona5.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{FichaPersona5.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersona5.botonConfirmar1_action}"
                                                    binding="#{FichaPersona5.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{FichaPersona5.gestor.scriptConfirmar}"
                                                    rendered="#{FichaPersona5.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersona5.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{FichaPersona5.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersona5.botonDescartar1_action}"
                                                    binding="#{FichaPersona5.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{FichaPersona5.gestor.scriptDescartar}"
                                                    rendered="#{FichaPersona5.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersona5.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{FichaPersona5.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FichaPersona5.listaFuncionAccion1}"
                                                    converter="#{FichaPersona5.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{FichaPersona5.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{FichaPersona5.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{FichaPersona5.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{FichaPersona5.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersona5.botonProcesar1_action}"
                                                    binding="#{FichaPersona5.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{FichaPersona5.gestor.scriptProcesar}"
                                                    rendered="#{FichaPersona5.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersona5.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{FichaPersona5.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersona5.botonRefrescar1_action}"
                                                    binding="#{FichaPersona5.botonRefrescar1}"
                                                    disabled="#{FichaPersona5.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{FichaPersona5.gestor.scriptRefrescar}"
                                                    rendered="#{FichaPersona5.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersona5.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{FichaPersona5.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersona5.botonReconsultar1_action}"
                                                    binding="#{FichaPersona5.botonReconsultar1}"
                                                    disabled="#{FichaPersona5.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{FichaPersona5.gestor.scriptReconsultar}"
                                                    rendered="#{FichaPersona5.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersona5.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{FichaPersona5.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersona5.botonRetornar1_action}"
                                                    binding="#{FichaPersona5.botonRetornar1}"
                                                    disabled="#{FichaPersona5.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{FichaPersona5.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{FichaPersona5.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersona5.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{FichaPersona5.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{FichaPersona5.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{FichaPersona5.imageHyperlink1_action}"
                                                    binding="#{FichaPersona5.imageHyperlink1}"
                                                    disabled="#{FichaPersona5.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{FichaPersona5.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FichaPersona5.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{FichaPersona5.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.FichaPersona5_imageHyperlink1_toolTip}"/>
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
