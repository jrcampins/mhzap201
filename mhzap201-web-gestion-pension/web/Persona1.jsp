<?xml version="1.0" encoding="UTF-8"?>
<!--
   Copyright (C) 2009, EGT Consultores, C.A.
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
                    focus="#{Persona1.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Persona1.gestor.preserveFocus}"
                    preserveScroll="#{Persona1.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Persona1.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | checkbox1 campoIdPersona1 campoCodigoPersona1 campoNombrePersona1 campoNumeroCedula1 campoLetraCedula1 campoFechaExpedicionCedula1 campoFechaVencimientoCedula1 campoPrimerNombre1 campoSegundoNombre1 campoPrimerApellido1 campoSegundoApellido1 campoApellidoCasada1 campoApodo1 campoFechaNacimiento1 listaNumeroSexoPersona1 listaNumeroEstadoCivil1 listaEsParaguayoNatural1 listaEsIndigena1 campoIdEtniaIndigena1 campoNombreComunidadIndigena1 campoIdDepartamento1 campoIdDistrito1 listaNumeroTipoArea1 campoIdBarrio1 campoDireccion1 campoNumeroTelefonoLineaBaja1 campoNumeroTelefonoCelular1 campoCertificadoVida1 campoFechaCertificadoVida1 listaEsCertificadoVidaAnulado1 campoComentariosAnulCerVida1 campoCertificadoDefuncion1 campoFechaCertificadoDefuncion1 listaEsCerDefuncionAnulado1 campoComentariosAnulCerDefuncion1 listaEsPersonaConEmpleo1 listaEsPersonaConJubilacion1 listaEsPersonaConPension1 listaEsPersonaConSubsidio1 listaEsPersonaConDeuda1 listaEsPersonaConPenaJudicial1 listaEsPersonaConCerVida1 listaEsPersonaConCartaRenuncia1 listaEsPersonaElegibleParaPen1 listaEsPersonaAcreditadaParaPen1 listaEsPersonaConCopiaCedula1 listaEsPersonaConDeclaracionJur1 campoMontoPension1 listaNumeroCondicionPension1 campoFechaSolicitudPension1 campoComentariosSolicitudPension1 campoFechaAprobacionPension1 campoComentariosAprobacionPension1 campoFechaOtorgamientoPen1 campoNumeroResolucionOtorPen1 campoFechaResolucionOtorPen1 campoComentariosOtorgamientoPen1 campoFechaObjecionPension1 listaNumeroCausaDenPension1 campoOtraCausaDenPension1 campoComentariosObjecionPension1 campoFechaDenegacionPension1 campoNumeroResolucionDenPen1 campoFechaResolucionDenPen1 campoComentariosDenegacionPension1 campoFechaRevocacionPension1 listaNumeroCausaRevPension1 campoOtraCausaRevPension1 campoComentariosRevocacionPension1 listaNumeroCondicionRecoPen1 campoFechaSolicitudRecoPen1 campoComentariosSolicitudRecoPen1 campoFechaAprobacionRecoPen1 campoComentariosAprRecoPen1 campoFechaDenegacionRecoPen1 listaNumeroCausaDenRecoPen1 campoOtraCausaDenRecoPen1 campoComentariosDenRecoPen1 listaNumeroCondicionDenuPen1 campoFechaRegistroDenunciaPen1 campoComentariosRegistroDenuPen1 campoFechaConfirmacionDenuPen1 campoComentariosConfDenuPen1 campoFechaDesmentidoDenunciaPen1 campoComentariosDesDenuPen1 campoIdFichaPersona1 campoFechaFichaPersona1 campoIndiceCalidadVida1 campoFechaUltimoCobroPension1 campoNotasAnulFecUltCobPen1 listaNumeroTipoActJupe1 campoFechaHoraUltActJupe1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Persona1.breadcrumbs1}" 
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
                                                    rendered="#{Persona1.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Persona1.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Persona1.gestor.mensajeDisponible}"
                                                    text="#{Persona1.gestor.mensaje}"
                                                    url="#{Persona1.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table
                                            binding="#{Persona1.table1}"
                                            clearSortButton="true" 
                                            deselectMultipleButton="true" 
                                            id="table1"
                                            paginateButton="false"
                                            paginationControls="true" 
                                            selectMultipleButton="true" 
                                            sortPanelToggleButton="true"
                                            width="960">
                                            <webuijsf:tableRowGroup 
                                                binding="#{Persona1.tableRowGroup1}" 
                                                id="tableRowGroup1" 
                                                rows="1"
                                                selected="#{Persona1.gestor.filaEscogida}" 
                                                sourceData="#{Persona1.personaDataProvider}" 
                                                sourceVar="currentRow">
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" 
                                                    selectId="checkbox1">
                                                    <webuijsf:checkbox 
                                                        binding="#{Persona1.checkbox1}" 
                                                        id="checkbox1"
                                                        onClick="#{Persona1.gestor.scriptElegir}" 
                                                        selected="#{Persona1.gestor.filaElegida}" 
                                                        toolTip="#{Persona1.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="center" 
                                                    binding="#{Persona1.tableColumn1}" 
                                                    id="tableColumn1">
                                                    <webuijsf:button 
                                                        actionExpression="#{Persona1.botonEscogerFila1_action}"
                                                        binding="#{Persona1.botonEscogerFila1}"
                                                        disabled="#{Persona1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonEscogerFila1"
                                                        imageURL="#{Persona1.gestor.urlImagenEscoger}" 
                                                        onClick="#{Persona1.gestor.scriptEscoger}"
                                                        text="#{Persona1.gestor.i18n.textoBotonEscogerFila}"
                                                        toolTip="#{Persona1.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Persona1.botonDetallarFila1_action}"
                                                        binding="#{Persona1.botonDetallarFila1}"
                                                        disabled="#{Persona1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonDetallarFila1"
                                                        imageURL="#{Persona1.gestor.urlImagenDetallar}" 
                                                        onClick="#{Persona1.scriptAbrirVentanaVerDetalle}"
                                                        rendered="#{Persona1.gestor.detalleDisponible}" 
                                                        text="#{Persona1.gestor.i18n.textoBotonDetallarFila}"
                                                        toolTip="#{Persona1.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Persona1.botonProcesarFila1_action}"
                                                        binding="#{Persona1.botonProcesarFila1}"
                                                        disabled="#{Persona1.gestor.funcionPickItemInhabilitada}" 
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Persona1.gestor.urlImagenProcesar}" 
                                                        onClick="#{Persona1.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Persona1.asistente.comandoDisponible}" 
                                                        text="#{Persona1.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Persona1.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Persona1.botonRetornarFila1_action}"
                                                        binding="#{Persona1.botonRetornarFila1}" 
                                                        disabled="#{Persona1.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1"
                                                        imageURL="#{Persona1.gestor.urlImagenRetornar}"
                                                        onClick="#{Persona1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{Persona1.gestor.funcionReturnVisible}" 
                                                        text="#{Persona1.gestor.i18n.textoBotonRetornarFila}"
                                                        toolTip="#{Persona1.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumn2}"
                                                    id="tableColumn2"
                                                    rendered="#{Persona1.gestor.designing}">
                                                    <webuijsf:imageHyperlink
                                                        actionExpression="#{Persona1.hipervinculoAccionFila1_action}"
                                                        binding="#{Persona1.hipervinculoAccionFila1}"
                                                        disabled="#{Persona1.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1"
                                                        imageURL="#{Persona1.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{Persona1.scriptAbrirVentanaAccionFila1}"
                                                        text="Accion1"
                                                        toolTip="#{bundle.Persona1_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    align="right" 
                                                    binding="#{Persona1.tableColumn3}" 
                                                    headerText="#{Persona1.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Persona1.gestor.i18n.toolTipEtiquetaIdentificacionFila}"
                                                    id="tableColumn3">
                                                    <webuijsf:imageHyperlink 
                                                        actionExpression="#{Persona1.hipervinculoDetallarFila1_action}"
                                                        binding="#{Persona1.hipervinculoDetallarFila1}" 
                                                        id="hipervinculoDetallarFila1"
                                                        imageURL="#{Persona1.gestor.urlImagenFilaProcesada}"
                                                        textPosition="left" 
                                                        text="#{Persona1.gestor.identificacionFila}" 
                                                        toolTip="#{Persona1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnIdPersona1}"
                                                    headerText="identificaci&#243;n"
                                                    id="tableColumnIdPersona1" rendered="false"
                                                    sort="id_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdPersona1"
                                                    text="#{currentRow.value['id_persona']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelIdPersona1}"
                                                    id="labelIdPersona1"
                                                    for="campoIdPersona1"/>
                                                <webuijsf:textField id="campoIdPersona1"
                                                    binding="#{Persona1.campoIdPersona1}"
                                                    converter="#{Persona1.converterIdPersona1}"
                                                    readOnly="#{Persona1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['id_persona']}"
                                                    toolTip="BundleParametros.id_persona.persona"
                                                    validatorExpression="#{Persona1.validatorIdPersona1.validate}"/>
                                                <webuijsf:staticText id="campoIdPersona1Texto1"
                                                    binding="#{Persona1.campoIdPersona1Texto1}"
                                                    text="#{currentRow.value['id_persona']}"/>
                                                <webuijsf:message id="messageIdPersona1"
                                                    for="campoIdPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnCodigoPersona1}"
                                                    headerText="c&#243;digo"
                                                    id="tableColumnCodigoPersona1"
                                                    sort="codigo_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCodigoPersona1"
                                                    text="#{currentRow.value['codigo_persona']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelCodigoPersona1}"
                                                    id="labelCodigoPersona1"
                                                    for="campoCodigoPersona1"/>
                                                <webuijsf:textField id="campoCodigoPersona1"
                                                    binding="#{Persona1.campoCodigoPersona1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{currentRow.value['codigo_persona']}"
                                                    toolTip="BundleParametros.codigo_persona.persona"
                                                    validatorExpression="#{Persona1.validatorCodigoPersona1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoPersona1Texto1"
                                                    binding="#{Persona1.campoCodigoPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_persona']}"/>
                                                <webuijsf:message id="messageCodigoPersona1"
                                                    for="campoCodigoPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNombrePersona1}"
                                                    headerText="nombre"
                                                    id="tableColumnNombrePersona1"
                                                    sort="nombre_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombrePersona1"
                                                    text="#{currentRow.value['nombre_persona']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNombrePersona1}"
                                                    id="labelNombrePersona1"
                                                    for="campoNombrePersona1"/>
                                                <webuijsf:textField id="campoNombrePersona1"
                                                    binding="#{Persona1.campoNombrePersona1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{currentRow.value['nombre_persona']}"
                                                    toolTip="BundleParametros.nombre_persona.persona"
                                                    validatorExpression="#{Persona1.validatorNombrePersona1.validate}"/>
                                                <webuijsf:staticText id="campoNombrePersona1Texto1"
                                                    binding="#{Persona1.campoNombrePersona1Texto1}"
                                                    text="#{currentRow.value['nombre_persona']}"/>
                                                <webuijsf:message id="messageNombrePersona1"
                                                    for="campoNombrePersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNumeroCedula1}"
                                                    headerText="n&#250;mero c&#233;dula"
                                                    id="tableColumnNumeroCedula1" rendered="false"
                                                    sort="numero_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCedula1"
                                                    text="#{currentRow.value['numero_cedula']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNumeroCedula1}"
                                                    id="labelNumeroCedula1"
                                                    for="campoNumeroCedula1"/>
                                                <webuijsf:textField id="campoNumeroCedula1"
                                                    binding="#{Persona1.campoNumeroCedula1}"
                                                    converter="#{Persona1.converterNumeroCedula1}"
                                                    readOnly="#{Persona1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['numero_cedula']}"
                                                    toolTip="BundleParametros.numero_cedula.persona"
                                                    validatorExpression="#{Persona1.validatorNumeroCedula1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedula1Texto1"
                                                    binding="#{Persona1.campoNumeroCedula1Texto1}"
                                                    text="#{currentRow.value['numero_cedula']}"/>
                                                <webuijsf:message id="messageNumeroCedula1"
                                                    for="campoNumeroCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnLetraCedula1}"
                                                    headerText="letra c&#233;dula"
                                                    id="tableColumnLetraCedula1" rendered="false"
                                                    sort="letra_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextLetraCedula1"
                                                    text="#{currentRow.value['letra_cedula']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelLetraCedula1}"
                                                    id="labelLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                <webuijsf:textField id="campoLetraCedula1"
                                                    binding="#{Persona1.campoLetraCedula1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="#{Persona1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['letra_cedula']}"
                                                    toolTip="BundleParametros.letra_cedula.persona"
                                                    validatorExpression="#{Persona1.validatorLetraCedula1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedula1Texto1"
                                                    binding="#{Persona1.campoLetraCedula1Texto1}"
                                                    text="#{currentRow.value['letra_cedula']}"/>
                                                <webuijsf:message id="messageLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaExpedicionCedula1}"
                                                    headerText="fecha expedici&#243;n c&#233;dula"
                                                    id="tableColumnFechaExpedicionCedula1" rendered="false"
                                                    sort="fecha_expedicion_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaExpedicionCedula1"
                                                    text="#{currentRow.value['fecha_expedicion_cedula']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaExpedicionCedula1}"
                                                    id="labelFechaExpedicionCedula1"
                                                    for="campoFechaExpedicionCedula1"/>
                                                <webuijsf:textField id="campoFechaExpedicionCedula1"
                                                    binding="#{Persona1.campoFechaExpedicionCedula1}"
                                                    converter="#{Persona1.converterFechaExpedicionCedula1}"
                                                    readOnly="#{Persona1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_expedicion_cedula']}"
                                                    toolTip="BundleParametros.fecha_expedicion_cedula.persona"/>
                                                <webuijsf:staticText id="campoFechaExpedicionCedula1Texto1"
                                                    binding="#{Persona1.campoFechaExpedicionCedula1Texto1}"
                                                    converter="#{Persona1.converterFechaExpedicionCedula1}"
                                                    text="#{currentRow.value['fecha_expedicion_cedula']}"/>
                                                <webuijsf:message id="messageFechaExpedicionCedula1"
                                                    for="campoFechaExpedicionCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaVencimientoCedula1}"
                                                    headerText="fecha vencimiento c&#233;dula"
                                                    id="tableColumnFechaVencimientoCedula1" rendered="false"
                                                    sort="fecha_vencimiento_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaVencimientoCedula1"
                                                    text="#{currentRow.value['fecha_vencimiento_cedula']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaVencimientoCedula1}"
                                                    id="labelFechaVencimientoCedula1"
                                                    for="campoFechaVencimientoCedula1"/>
                                                <webuijsf:textField id="campoFechaVencimientoCedula1"
                                                    binding="#{Persona1.campoFechaVencimientoCedula1}"
                                                    converter="#{Persona1.converterFechaVencimientoCedula1}"
                                                    readOnly="#{Persona1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_vencimiento_cedula']}"
                                                    toolTip="BundleParametros.fecha_vencimiento_cedula.persona"/>
                                                <webuijsf:staticText id="campoFechaVencimientoCedula1Texto1"
                                                    binding="#{Persona1.campoFechaVencimientoCedula1Texto1}"
                                                    converter="#{Persona1.converterFechaVencimientoCedula1}"
                                                    text="#{currentRow.value['fecha_vencimiento_cedula']}"/>
                                                <webuijsf:message id="messageFechaVencimientoCedula1"
                                                    for="campoFechaVencimientoCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnPrimerNombre1}"
                                                    headerText="primer nombre"
                                                    id="tableColumnPrimerNombre1" rendered="false"
                                                    sort="primer_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerNombre1"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelPrimerNombre1}"
                                                    id="labelPrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                <webuijsf:textField id="campoPrimerNombre1"
                                                    binding="#{Persona1.campoPrimerNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.persona"
                                                    validatorExpression="#{Persona1.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1Texto1"
                                                    binding="#{Persona1.campoPrimerNombre1Texto1}"
                                                    text="#{currentRow.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnSegundoNombre1}"
                                                    headerText="segundo nombre"
                                                    id="tableColumnSegundoNombre1" rendered="false"
                                                    sort="segundo_nombre">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoNombre1"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelSegundoNombre1}"
                                                    id="labelSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                <webuijsf:textField id="campoSegundoNombre1"
                                                    binding="#{Persona1.campoSegundoNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona1.gestor.filaNoModificada}"
                                                    text="#{currentRow.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.persona"
                                                    validatorExpression="#{Persona1.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1Texto1"
                                                    binding="#{Persona1.campoSegundoNombre1Texto1}"
                                                    text="#{currentRow.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnPrimerApellido1}"
                                                    headerText="primer apellido"
                                                    id="tableColumnPrimerApellido1" rendered="false"
                                                    sort="primer_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextPrimerApellido1"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelPrimerApellido1}"
                                                    id="labelPrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                <webuijsf:textField id="campoPrimerApellido1"
                                                    binding="#{Persona1.campoPrimerApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.persona"
                                                    validatorExpression="#{Persona1.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1Texto1"
                                                    binding="#{Persona1.campoPrimerApellido1Texto1}"
                                                    text="#{currentRow.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnSegundoApellido1}"
                                                    headerText="segundo apellido"
                                                    id="tableColumnSegundoApellido1" rendered="false"
                                                    sort="segundo_apellido">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextSegundoApellido1"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelSegundoApellido1}"
                                                    id="labelSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                <webuijsf:textField id="campoSegundoApellido1"
                                                    binding="#{Persona1.campoSegundoApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona1.gestor.filaNoModificada}"
                                                    text="#{currentRow.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.persona"
                                                    validatorExpression="#{Persona1.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1Texto1"
                                                    binding="#{Persona1.campoSegundoApellido1Texto1}"
                                                    text="#{currentRow.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnApellidoCasada1}"
                                                    headerText="apellido casada"
                                                    id="tableColumnApellidoCasada1" rendered="false"
                                                    sort="apellido_casada">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextApellidoCasada1"
                                                    text="#{currentRow.value['apellido_casada']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelApellidoCasada1}"
                                                    id="labelApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                <webuijsf:textField id="campoApellidoCasada1"
                                                    binding="#{Persona1.campoApellidoCasada1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona1.gestor.filaNoModificada}"
                                                    text="#{currentRow.value['apellido_casada']}"
                                                    toolTip="BundleParametros.apellido_casada.persona"
                                                    validatorExpression="#{Persona1.validatorApellidoCasada1.validate}"/>
                                                <webuijsf:staticText id="campoApellidoCasada1Texto1"
                                                    binding="#{Persona1.campoApellidoCasada1Texto1}"
                                                    text="#{currentRow.value['apellido_casada']}"/>
                                                <webuijsf:message id="messageApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnApodo1}"
                                                    headerText="apodo"
                                                    id="tableColumnApodo1" rendered="false"
                                                    sort="apodo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextApodo1"
                                                    text="#{currentRow.value['apodo']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelApodo1}"
                                                    id="labelApodo1"
                                                    for="campoApodo1"/>
                                                <webuijsf:textField id="campoApodo1"
                                                    binding="#{Persona1.campoApodo1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Persona1.gestor.filaNoModificada}"
                                                    text="#{currentRow.value['apodo']}"
                                                    toolTip="BundleParametros.apodo.persona"
                                                    validatorExpression="#{Persona1.validatorApodo1.validate}"/>
                                                <webuijsf:staticText id="campoApodo1Texto1"
                                                    binding="#{Persona1.campoApodo1Texto1}"
                                                    text="#{currentRow.value['apodo']}"/>
                                                <webuijsf:message id="messageApodo1"
                                                    for="campoApodo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaNacimiento1}"
                                                    headerText="fecha nacimiento"
                                                    id="tableColumnFechaNacimiento1"
                                                    sort="fecha_nacimiento">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaNacimiento1"
                                                    text="#{currentRow.value['fecha_nacimiento']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaNacimiento1}"
                                                    id="labelFechaNacimiento1"
                                                    for="campoFechaNacimiento1"/>
                                                <webuijsf:textField id="campoFechaNacimiento1"
                                                    binding="#{Persona1.campoFechaNacimiento1}"
                                                    converter="#{Persona1.converterFechaNacimiento1}"
                                                    readOnly="#{Persona1.gestor.filaNoProcesada}" required="true"
                                                    text="#{currentRow.value['fecha_nacimiento']}"
                                                    toolTip="BundleParametros.fecha_nacimiento.persona"/>
                                                <webuijsf:staticText id="campoFechaNacimiento1Texto1"
                                                    binding="#{Persona1.campoFechaNacimiento1Texto1}"
                                                    converter="#{Persona1.converterFechaNacimiento1}"
                                                    text="#{currentRow.value['fecha_nacimiento']}"/>
                                                <webuijsf:message id="messageFechaNacimiento1"
                                                    for="campoFechaNacimiento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNumeroSexoPersona1}"
                                                    headerText="sexo"
                                                    id="tableColumnNumeroSexoPersona1" rendered="false"
                                                    sort="codigo_sexo_persona_1x1y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroSexoPersona1"
                                                    text="#{currentRow.value['codigo_sexo_persona_1x1y2']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNumeroSexoPersona1}"
                                                    id="labelNumeroSexoPersona1"
                                                    for="listaNumeroSexoPersona1"/>
                                                <webuijsf:dropDown id="listaNumeroSexoPersona1"
                                                    binding="#{Persona1.listaNumeroSexoPersona1}"
                                                    converter="#{Persona1.converterNumeroSexoPersona1}"
                                                    disabled="#{Persona1.gestor.filaNoProcesada}" required="true"
                                                    items="#{Persona1.asistente.opcionesListaNumeroSexoPersona1}"
                                                    selected="#{currentRow.value['numero_sexo_persona']}"
                                                    toolTip="BundleParametros.numero_sexo_persona.persona"/>
                                                <webuijsf:staticText id="listaNumeroSexoPersona1Texto1"
                                                    binding="#{Persona1.listaNumeroSexoPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_sexo_persona_1x1y2']}"/>
                                                <webuijsf:message id="messageNumeroSexoPersona1"
                                                    for="listaNumeroSexoPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNumeroEstadoCivil1}"
                                                    headerText="estado civil"
                                                    id="tableColumnNumeroEstadoCivil1" rendered="false"
                                                    sort="codigo_estado_civil_1x2y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroEstadoCivil1"
                                                    text="#{currentRow.value['codigo_estado_civil_1x2y2']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNumeroEstadoCivil1}"
                                                    id="labelNumeroEstadoCivil1"
                                                    for="listaNumeroEstadoCivil1"/>
                                                <webuijsf:dropDown id="listaNumeroEstadoCivil1"
                                                    binding="#{Persona1.listaNumeroEstadoCivil1}"
                                                    converter="#{Persona1.converterNumeroEstadoCivil1}"
                                                    disabled="#{Persona1.gestor.filaNoProcesada}" required="true"
                                                    items="#{Persona1.asistente.opcionesListaNumeroEstadoCivil1}"
                                                    selected="#{currentRow.value['numero_estado_civil']}"
                                                    toolTip="BundleParametros.numero_estado_civil.persona"/>
                                                <webuijsf:staticText id="listaNumeroEstadoCivil1Texto1"
                                                    binding="#{Persona1.listaNumeroEstadoCivil1Texto1}"
                                                    text="#{currentRow.value['codigo_estado_civil_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroEstadoCivil1"
                                                    for="listaNumeroEstadoCivil1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnEsParaguayoNatural1}"
                                                    headerText="paraguayo natural"
                                                    id="tableColumnEsParaguayoNatural1"
                                                    sort="es_paraguayo_natural">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsParaguayoNatural1"
                                                    text="#{currentRow.value['es_paraguayo_natural']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelEsParaguayoNatural1}"
                                                    id="labelEsParaguayoNatural1"
                                                    for="listaEsParaguayoNatural1"/>
                                                <webuijsf:dropDown id="listaEsParaguayoNatural1"
                                                    binding="#{Persona1.listaEsParaguayoNatural1}"
                                                    converter="#{Persona1.converterEsParaguayoNatural1}"
                                                    disabled="#{Persona1.gestor.filaNoProcesada}" required="true"
                                                    items="#{Persona1.asistente.opcionesListaEsParaguayoNatural1}"
                                                    selected="#{currentRow.value['es_paraguayo_natural']}"
                                                    toolTip="BundleParametros.es_paraguayo_natural.persona"/>
                                                <webuijsf:staticText id="listaEsParaguayoNatural1Texto1"
                                                    binding="#{Persona1.listaEsParaguayoNatural1Texto1}"/>
                                                <webuijsf:message id="messageEsParaguayoNatural1"
                                                    for="listaEsParaguayoNatural1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnEsIndigena1}"
                                                    headerText="indigena"
                                                    id="tableColumnEsIndigena1"
                                                    sort="es_indigena">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsIndigena1"
                                                    text="#{currentRow.value['es_indigena']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelEsIndigena1}"
                                                    id="labelEsIndigena1"
                                                    for="listaEsIndigena1"/>
                                                <webuijsf:dropDown id="listaEsIndigena1"
                                                    binding="#{Persona1.listaEsIndigena1}"
                                                    converter="#{Persona1.converterEsIndigena1}"
                                                    disabled="#{Persona1.gestor.filaNoProcesada}" required="true"
                                                    items="#{Persona1.asistente.opcionesListaEsIndigena1}"
                                                    selected="#{currentRow.value['es_indigena']}"
                                                    toolTip="BundleParametros.es_indigena.persona"/>
                                                <webuijsf:staticText id="listaEsIndigena1Texto1"
                                                    binding="#{Persona1.listaEsIndigena1Texto1}"/>
                                                <webuijsf:message id="messageEsIndigena1"
                                                    for="listaEsIndigena1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnIdEtniaIndigena1}"
                                                    headerText="etnia indigena"
                                                    id="tableColumnIdEtniaIndigena1" rendered="false"
                                                    sort="codigo_etnia_indigena_1x3y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdEtniaIndigena1"
                                                    text="#{currentRow.value['codigo_etnia_indigena_1x3y3']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelIdEtniaIndigena1}"
                                                    id="labelIdEtniaIndigena1"
                                                    for="campoIdEtniaIndigena1"/>
                                                <webuijsf:textField id="campoIdEtniaIndigena1"
                                                    binding="#{Persona1.campoIdEtniaIndigena1}"
                                                    readOnly="#{Persona1.gestor.filaNoProcesada}"
                                                    text="#{Persona1.asistente.textoCampoIdEtniaIndigena1}"
                                                    toolTip="#{Persona1.asistente.toolTipCampoIdEtniaIndigena1}"
                                                    validatorExpression="#{Persona1.campoIdEtniaIndigena1_validate}"/>
                                                <webuijsf:staticText id="campoIdEtniaIndigena1Texto1"
                                                    binding="#{Persona1.campoIdEtniaIndigena1Texto1}"
                                                    text="#{currentRow.value['codigo_etnia_indigena_1x3y3']}"/>
                                                <webuijsf:message id="messageIdEtniaIndigena1"
                                                    for="campoIdEtniaIndigena1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdEtniaIndigena3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdEtniaIndigena3"
                                                    text="#{currentRow.value['id_etnia_indigena']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{Persona1.campoIdEtniaIndigena1Boton1}"
                                                    id="campoIdEtniaIndigena1Boton1"
                                                    onClick="#{Persona1.asistente.scriptCampoIdEtniaIndigena1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{Persona1.campoIdEtniaIndigena1Boton3}"
                                                    id="campoIdEtniaIndigena1Boton3"
                                                    onClick="#{Persona1.asistente.scriptCampoIdEtniaIndigena1Boton2}"
                                                    rendered="#{Persona1.asistente.campoIdEtniaIndigena1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{Persona1.tableColumnIdEtniaIndigena2}"
                                                    headerText="nombre etnia indigena"
                                                    id="tableColumnIdEtniaIndigena2" rendered="false"
                                                    sort="nombre_etnia_indigena_1x3y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdEtniaIndigena2"
                                                    text="#{currentRow.value['nombre_etnia_indigena_1x3y4']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelIdEtniaIndigena2}"
                                                    id="labelIdEtniaIndigena2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{Persona1.campoIdEtniaIndigena1Hiper1}"
                                                    id="campoIdEtniaIndigena1Hiper1"
                                                    text="#{currentRow.value['nombre_etnia_indigena_1x3y4']}"
                                                    onClick="#{Persona1.asistente.scriptCampoIdEtniaIndigena1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdEtniaIndigena1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNombreComunidadIndigena1}"
                                                    headerText="nombre comunidad indigena"
                                                    id="tableColumnNombreComunidadIndigena1" rendered="false"
                                                    sort="nombre_comunidad_indigena">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNombreComunidadIndigena1"
                                                    text="#{currentRow.value['nombre_comunidad_indigena']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNombreComunidadIndigena1}"
                                                    id="labelNombreComunidadIndigena1"
                                                    for="campoNombreComunidadIndigena1"/>
                                                <webuijsf:textField id="campoNombreComunidadIndigena1"
                                                    binding="#{Persona1.campoNombreComunidadIndigena1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{Persona1.gestor.filaNoProcesada}"
                                                    text="#{currentRow.value['nombre_comunidad_indigena']}"
                                                    toolTip="BundleParametros.nombre_comunidad_indigena.persona"
                                                    validatorExpression="#{Persona1.validatorNombreComunidadIndigena1.validate}"/>
                                                <webuijsf:staticText id="campoNombreComunidadIndigena1Texto1"
                                                    binding="#{Persona1.campoNombreComunidadIndigena1Texto1}"
                                                    text="#{currentRow.value['nombre_comunidad_indigena']}"/>
                                                <webuijsf:message id="messageNombreComunidadIndigena1"
                                                    for="campoNombreComunidadIndigena1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnIdDepartamento1}"
                                                    headerText="departamento"
                                                    id="tableColumnIdDepartamento1" rendered="false"
                                                    sort="codigo_ubicacion_1x4y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamento1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x4y3']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelIdDepartamento1}"
                                                    id="labelIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                <webuijsf:textField id="campoIdDepartamento1"
                                                    binding="#{Persona1.campoIdDepartamento1}"
                                                    readOnly="#{Persona1.gestor.filaNoModificada}"
                                                    text="#{Persona1.asistente.textoCampoIdDepartamento1}"
                                                    toolTip="#{Persona1.asistente.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{Persona1.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1Texto1"
                                                    binding="#{Persona1.campoIdDepartamento1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x4y3']}"/>
                                                <webuijsf:message id="messageIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdDepartamento3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamento3"
                                                    text="#{currentRow.value['id_departamento']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{Persona1.campoIdDepartamento1Boton1}"
                                                    id="campoIdDepartamento1Boton1"
                                                    onClick="#{Persona1.asistente.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{Persona1.campoIdDepartamento1Boton3}"
                                                    id="campoIdDepartamento1Boton3"
                                                    onClick="#{Persona1.asistente.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{Persona1.asistente.campoIdDepartamento1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{Persona1.tableColumnIdDepartamento2}"
                                                    headerText="nombre departamento"
                                                    id="tableColumnIdDepartamento2" rendered="false"
                                                    sort="nombre_ubicacion_1x4y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDepartamento2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x4y4']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelIdDepartamento2}"
                                                    id="labelIdDepartamento2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{Persona1.campoIdDepartamento1Hiper1}"
                                                    id="campoIdDepartamento1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x4y4']}"
                                                    onClick="#{Persona1.asistente.scriptCampoIdDepartamento1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDepartamento1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnIdDistrito1}"
                                                    headerText="distrito"
                                                    id="tableColumnIdDistrito1" rendered="false"
                                                    sort="codigo_ubicacion_1x5y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistrito1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x5y3']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelIdDistrito1}"
                                                    id="labelIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                <webuijsf:textField id="campoIdDistrito1"
                                                    binding="#{Persona1.campoIdDistrito1}"
                                                    readOnly="#{Persona1.gestor.filaNoModificada}"
                                                    text="#{Persona1.asistente.textoCampoIdDistrito1}"
                                                    toolTip="#{Persona1.asistente.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{Persona1.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1Texto1"
                                                    binding="#{Persona1.campoIdDistrito1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x5y3']}"/>
                                                <webuijsf:message id="messageIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdDistrito3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistrito3"
                                                    text="#{currentRow.value['id_distrito']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{Persona1.campoIdDistrito1Boton1}"
                                                    id="campoIdDistrito1Boton1"
                                                    onClick="#{Persona1.asistente.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{Persona1.campoIdDistrito1Boton3}"
                                                    id="campoIdDistrito1Boton3"
                                                    onClick="#{Persona1.asistente.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{Persona1.asistente.campoIdDistrito1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{Persona1.tableColumnIdDistrito2}"
                                                    headerText="nombre distrito"
                                                    id="tableColumnIdDistrito2" rendered="false"
                                                    sort="nombre_ubicacion_1x5y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdDistrito2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x5y4']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelIdDistrito2}"
                                                    id="labelIdDistrito2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{Persona1.campoIdDistrito1Hiper1}"
                                                    id="campoIdDistrito1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x5y4']}"
                                                    onClick="#{Persona1.asistente.scriptCampoIdDistrito1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdDistrito1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNumeroTipoArea1}"
                                                    headerText="tipo area"
                                                    id="tableColumnNumeroTipoArea1" rendered="false"
                                                    sort="codigo_tipo_area_1x6y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoArea1"
                                                    text="#{currentRow.value['codigo_tipo_area_1x6y2']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNumeroTipoArea1}"
                                                    id="labelNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoArea1"
                                                    binding="#{Persona1.listaNumeroTipoArea1}"
                                                    converter="#{Persona1.converterNumeroTipoArea1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaNumeroTipoArea1}"
                                                    selected="#{currentRow.value['numero_tipo_area']}"
                                                    toolTip="BundleParametros.numero_tipo_area.persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoArea1Texto1"
                                                    binding="#{Persona1.listaNumeroTipoArea1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_area_1x6y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnIdBarrio1}"
                                                    headerText="barrio"
                                                    id="tableColumnIdBarrio1" rendered="false"
                                                    sort="codigo_ubicacion_1x7y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdBarrio1"
                                                    text="#{currentRow.value['codigo_ubicacion_1x7y3']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelIdBarrio1}"
                                                    id="labelIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                <webuijsf:textField id="campoIdBarrio1"
                                                    binding="#{Persona1.campoIdBarrio1}"
                                                    readOnly="#{Persona1.gestor.filaNoModificada}"
                                                    text="#{Persona1.asistente.textoCampoIdBarrio1}"
                                                    toolTip="#{Persona1.asistente.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{Persona1.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1Texto1"
                                                    binding="#{Persona1.campoIdBarrio1Texto1}"
                                                    text="#{currentRow.value['codigo_ubicacion_1x7y3']}"/>
                                                <webuijsf:message id="messageIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdBarrio3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdBarrio3"
                                                    text="#{currentRow.value['id_barrio']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{Persona1.campoIdBarrio1Boton1}"
                                                    id="campoIdBarrio1Boton1"
                                                    onClick="#{Persona1.asistente.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{Persona1.campoIdBarrio1Boton3}"
                                                    id="campoIdBarrio1Boton3"
                                                    onClick="#{Persona1.asistente.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{Persona1.asistente.campoIdBarrio1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{Persona1.tableColumnIdBarrio2}"
                                                    headerText="nombre barrio"
                                                    id="tableColumnIdBarrio2" rendered="false"
                                                    sort="nombre_ubicacion_1x7y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdBarrio2"
                                                    text="#{currentRow.value['nombre_ubicacion_1x7y4']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelIdBarrio2}"
                                                    id="labelIdBarrio2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{Persona1.campoIdBarrio1Hiper1}"
                                                    id="campoIdBarrio1Hiper1"
                                                    text="#{currentRow.value['nombre_ubicacion_1x7y4']}"
                                                    onClick="#{Persona1.asistente.scriptCampoIdBarrio1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdBarrio1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnDireccion1}"
                                                    headerText="direcci&#243;n"
                                                    id="tableColumnDireccion1" rendered="false"
                                                    sort="direccion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextDireccion1"
                                                    text="#{currentRow.value['direccion']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelDireccion1}"
                                                    id="labelDireccion1"
                                                    for="campoDireccion1"/>
                                                <webuijsf:textArea id="campoDireccion1"
                                                    binding="#{Persona1.campoDireccion1}"
                                                    columns="50" rows="3"
                                                    readOnly="#{Persona1.gestor.filaNoModificada}"
                                                    text="#{currentRow.value['direccion']}"
                                                    toolTip="BundleParametros.direccion.persona"
                                                    validatorExpression="#{Persona1.validatorDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoDireccion1Texto1"
                                                    binding="#{Persona1.campoDireccion1Texto1}"
                                                    text="#{currentRow.value['direccion']}"/>
                                                <webuijsf:message id="messageDireccion1"
                                                    for="campoDireccion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNumeroTelefonoLineaBaja1}"
                                                    headerText="n&#250;mero tel&#233;fono linea baja"
                                                    id="tableColumnNumeroTelefonoLineaBaja1" rendered="false"
                                                    sort="numero_telefono_linea_baja">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTelefonoLineaBaja1"
                                                    text="#{currentRow.value['numero_telefono_linea_baja']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNumeroTelefonoLineaBaja1}"
                                                    id="labelNumeroTelefonoLineaBaja1"
                                                    for="campoNumeroTelefonoLineaBaja1"/>
                                                <webuijsf:textField id="campoNumeroTelefonoLineaBaja1"
                                                    binding="#{Persona1.campoNumeroTelefonoLineaBaja1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{Persona1.gestor.filaNoModificada}"
                                                    text="#{currentRow.value['numero_telefono_linea_baja']}"
                                                    toolTip="BundleParametros.numero_telefono_linea_baja.persona"
                                                    validatorExpression="#{Persona1.validatorNumeroTelefonoLineaBaja1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoLineaBaja1Texto1"
                                                    binding="#{Persona1.campoNumeroTelefonoLineaBaja1Texto1}"
                                                    text="#{currentRow.value['numero_telefono_linea_baja']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoLineaBaja1"
                                                    for="campoNumeroTelefonoLineaBaja1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNumeroTelefonoCelular1}"
                                                    headerText="n&#250;mero tel&#233;fono celular"
                                                    id="tableColumnNumeroTelefonoCelular1" rendered="false"
                                                    sort="numero_telefono_celular">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTelefonoCelular1"
                                                    text="#{currentRow.value['numero_telefono_celular']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNumeroTelefonoCelular1}"
                                                    id="labelNumeroTelefonoCelular1"
                                                    for="campoNumeroTelefonoCelular1"/>
                                                <webuijsf:textField id="campoNumeroTelefonoCelular1"
                                                    binding="#{Persona1.campoNumeroTelefonoCelular1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{Persona1.gestor.filaNoModificada}"
                                                    text="#{currentRow.value['numero_telefono_celular']}"
                                                    toolTip="BundleParametros.numero_telefono_celular.persona"
                                                    validatorExpression="#{Persona1.validatorNumeroTelefonoCelular1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoCelular1Texto1"
                                                    binding="#{Persona1.campoNumeroTelefonoCelular1Texto1}"
                                                    text="#{currentRow.value['numero_telefono_celular']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoCelular1"
                                                    for="campoNumeroTelefonoCelular1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnCertificadoVida1}"
                                                    headerText="certificado vida"
                                                    id="tableColumnCertificadoVida1" rendered="false"
                                                    sort="certificado_vida">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCertificadoVida1"
                                                    text="#{currentRow.value['certificado_vida']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelCertificadoVida1}"
                                                    id="labelCertificadoVida1"
                                                    for="campoCertificadoVida1"/>
                                                <webuijsf:textField id="campoCertificadoVida1"
                                                    binding="#{Persona1.campoCertificadoVida1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{currentRow.value['certificado_vida']}"
                                                    toolTip="BundleParametros.certificado_vida.persona"
                                                    validatorExpression="#{Persona1.validatorCertificadoVida1.validate}"/>
                                                <webuijsf:staticText id="campoCertificadoVida1Texto1"
                                                    binding="#{Persona1.campoCertificadoVida1Texto1}"
                                                    text="#{currentRow.value['certificado_vida']}"/>
                                                <webuijsf:message id="messageCertificadoVida1"
                                                    for="campoCertificadoVida1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaCertificadoVida1}"
                                                    headerText="fecha certificado vida"
                                                    id="tableColumnFechaCertificadoVida1" rendered="false"
                                                    sort="fecha_certificado_vida">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaCertificadoVida1"
                                                    text="#{currentRow.value['fecha_certificado_vida']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaCertificadoVida1}"
                                                    id="labelFechaCertificadoVida1"
                                                    for="campoFechaCertificadoVida1"/>
                                                <webuijsf:textField id="campoFechaCertificadoVida1"
                                                    binding="#{Persona1.campoFechaCertificadoVida1}"
                                                    converter="#{Persona1.converterFechaCertificadoVida1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_certificado_vida']}"
                                                    toolTip="BundleParametros.fecha_certificado_vida.persona"/>
                                                <webuijsf:staticText id="campoFechaCertificadoVida1Texto1"
                                                    binding="#{Persona1.campoFechaCertificadoVida1Texto1}"
                                                    converter="#{Persona1.converterFechaCertificadoVida1}"
                                                    text="#{currentRow.value['fecha_certificado_vida']}"/>
                                                <webuijsf:message id="messageFechaCertificadoVida1"
                                                    for="campoFechaCertificadoVida1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnEsCertificadoVidaAnulado1}"
                                                    headerText="certificado vida anulado"
                                                    id="tableColumnEsCertificadoVidaAnulado1" rendered="false"
                                                    sort="es_certificado_vida_anulado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsCertificadoVidaAnulado1"
                                                    text="#{currentRow.value['es_certificado_vida_anulado']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelEsCertificadoVidaAnulado1}"
                                                    id="labelEsCertificadoVidaAnulado1"
                                                    for="listaEsCertificadoVidaAnulado1"/>
                                                <webuijsf:dropDown id="listaEsCertificadoVidaAnulado1"
                                                    binding="#{Persona1.listaEsCertificadoVidaAnulado1}"
                                                    converter="#{Persona1.converterEsCertificadoVidaAnulado1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaEsCertificadoVidaAnulado1}"
                                                    selected="#{currentRow.value['es_certificado_vida_anulado']}"
                                                    toolTip="BundleParametros.es_certificado_vida_anulado.persona"/>
                                                <webuijsf:staticText id="listaEsCertificadoVidaAnulado1Texto1"
                                                    binding="#{Persona1.listaEsCertificadoVidaAnulado1Texto1}"/>
                                                <webuijsf:message id="messageEsCertificadoVidaAnulado1"
                                                    for="listaEsCertificadoVidaAnulado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnComentariosAnulCerVida1}"
                                                    headerText="comentarios anulaci&#243;n certificado vida"
                                                    id="tableColumnComentariosAnulCerVida1" rendered="false"
                                                    sort="comentarios_anul_cer_vida">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosAnulCerVida1"
                                                    text="#{currentRow.value['comentarios_anul_cer_vida']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelComentariosAnulCerVida1}"
                                                    id="labelComentariosAnulCerVida1"
                                                    for="campoComentariosAnulCerVida1"/>
                                                <webuijsf:textArea id="campoComentariosAnulCerVida1"
                                                    binding="#{Persona1.campoComentariosAnulCerVida1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_anul_cer_vida']}"
                                                    toolTip="BundleParametros.comentarios_anul_cer_vida.persona"
                                                    validatorExpression="#{Persona1.validatorComentariosAnulCerVida1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAnulCerVida1Texto1"
                                                    binding="#{Persona1.campoComentariosAnulCerVida1Texto1}"
                                                    text="#{currentRow.value['comentarios_anul_cer_vida']}"/>
                                                <webuijsf:message id="messageComentariosAnulCerVida1"
                                                    for="campoComentariosAnulCerVida1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnCertificadoDefuncion1}"
                                                    headerText="certificado defunci&#243;n"
                                                    id="tableColumnCertificadoDefuncion1" rendered="false"
                                                    sort="certificado_defuncion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextCertificadoDefuncion1"
                                                    text="#{currentRow.value['certificado_defuncion']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelCertificadoDefuncion1}"
                                                    id="labelCertificadoDefuncion1"
                                                    for="campoCertificadoDefuncion1"/>
                                                <webuijsf:textField id="campoCertificadoDefuncion1"
                                                    binding="#{Persona1.campoCertificadoDefuncion1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{currentRow.value['certificado_defuncion']}"
                                                    toolTip="BundleParametros.certificado_defuncion.persona"
                                                    validatorExpression="#{Persona1.validatorCertificadoDefuncion1.validate}"/>
                                                <webuijsf:staticText id="campoCertificadoDefuncion1Texto1"
                                                    binding="#{Persona1.campoCertificadoDefuncion1Texto1}"
                                                    text="#{currentRow.value['certificado_defuncion']}"/>
                                                <webuijsf:message id="messageCertificadoDefuncion1"
                                                    for="campoCertificadoDefuncion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaCertificadoDefuncion1}"
                                                    headerText="fecha certificado defunci&#243;n"
                                                    id="tableColumnFechaCertificadoDefuncion1" rendered="false"
                                                    sort="fecha_certificado_defuncion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaCertificadoDefuncion1"
                                                    text="#{currentRow.value['fecha_certificado_defuncion']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaCertificadoDefuncion1}"
                                                    id="labelFechaCertificadoDefuncion1"
                                                    for="campoFechaCertificadoDefuncion1"/>
                                                <webuijsf:textField id="campoFechaCertificadoDefuncion1"
                                                    binding="#{Persona1.campoFechaCertificadoDefuncion1}"
                                                    converter="#{Persona1.converterFechaCertificadoDefuncion1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_certificado_defuncion']}"
                                                    toolTip="BundleParametros.fecha_certificado_defuncion.persona"/>
                                                <webuijsf:staticText id="campoFechaCertificadoDefuncion1Texto1"
                                                    binding="#{Persona1.campoFechaCertificadoDefuncion1Texto1}"
                                                    converter="#{Persona1.converterFechaCertificadoDefuncion1}"
                                                    text="#{currentRow.value['fecha_certificado_defuncion']}"/>
                                                <webuijsf:message id="messageFechaCertificadoDefuncion1"
                                                    for="campoFechaCertificadoDefuncion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnEsCerDefuncionAnulado1}"
                                                    headerText="certificado defunci&#243;n anulado"
                                                    id="tableColumnEsCerDefuncionAnulado1" rendered="false"
                                                    sort="es_cer_defuncion_anulado">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsCerDefuncionAnulado1"
                                                    text="#{currentRow.value['es_cer_defuncion_anulado']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelEsCerDefuncionAnulado1}"
                                                    id="labelEsCerDefuncionAnulado1"
                                                    for="listaEsCerDefuncionAnulado1"/>
                                                <webuijsf:dropDown id="listaEsCerDefuncionAnulado1"
                                                    binding="#{Persona1.listaEsCerDefuncionAnulado1}"
                                                    converter="#{Persona1.converterEsCerDefuncionAnulado1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaEsCerDefuncionAnulado1}"
                                                    selected="#{currentRow.value['es_cer_defuncion_anulado']}"
                                                    toolTip="BundleParametros.es_cer_defuncion_anulado.persona"/>
                                                <webuijsf:staticText id="listaEsCerDefuncionAnulado1Texto1"
                                                    binding="#{Persona1.listaEsCerDefuncionAnulado1Texto1}"/>
                                                <webuijsf:message id="messageEsCerDefuncionAnulado1"
                                                    for="listaEsCerDefuncionAnulado1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnComentariosAnulCerDefuncion1}"
                                                    headerText="comentarios anulaci&#243;n certificado defunci&#243;n"
                                                    id="tableColumnComentariosAnulCerDefuncion1" rendered="false"
                                                    sort="comentarios_anul_cer_defuncion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosAnulCerDefuncion1"
                                                    text="#{currentRow.value['comentarios_anul_cer_defuncion']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelComentariosAnulCerDefuncion1}"
                                                    id="labelComentariosAnulCerDefuncion1"
                                                    for="campoComentariosAnulCerDefuncion1"/>
                                                <webuijsf:textArea id="campoComentariosAnulCerDefuncion1"
                                                    binding="#{Persona1.campoComentariosAnulCerDefuncion1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_anul_cer_defuncion']}"
                                                    toolTip="BundleParametros.comentarios_anul_cer_defuncion.persona"
                                                    validatorExpression="#{Persona1.validatorComentariosAnulCerDefuncion1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAnulCerDefuncion1Texto1"
                                                    binding="#{Persona1.campoComentariosAnulCerDefuncion1Texto1}"
                                                    text="#{currentRow.value['comentarios_anul_cer_defuncion']}"/>
                                                <webuijsf:message id="messageComentariosAnulCerDefuncion1"
                                                    for="campoComentariosAnulCerDefuncion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnEsPersonaConEmpleo1}"
                                                    headerText="con empleo"
                                                    id="tableColumnEsPersonaConEmpleo1" rendered="false"
                                                    sort="es_persona_con_empleo">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPersonaConEmpleo1"
                                                    text="#{currentRow.value['es_persona_con_empleo']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelEsPersonaConEmpleo1}"
                                                    id="labelEsPersonaConEmpleo1"
                                                    for="listaEsPersonaConEmpleo1"/>
                                                <webuijsf:dropDown id="listaEsPersonaConEmpleo1"
                                                    binding="#{Persona1.listaEsPersonaConEmpleo1}"
                                                    converter="#{Persona1.converterEsPersonaConEmpleo1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaEsPersonaConEmpleo1}"
                                                    selected="#{currentRow.value['es_persona_con_empleo']}"
                                                    toolTip="BundleParametros.es_persona_con_empleo.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConEmpleo1Texto1"
                                                    binding="#{Persona1.listaEsPersonaConEmpleo1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConEmpleo1"
                                                    for="listaEsPersonaConEmpleo1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnEsPersonaConJubilacion1}"
                                                    headerText="con jubilaci&#243;n"
                                                    id="tableColumnEsPersonaConJubilacion1" rendered="false"
                                                    sort="es_persona_con_jubilacion">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPersonaConJubilacion1"
                                                    text="#{currentRow.value['es_persona_con_jubilacion']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelEsPersonaConJubilacion1}"
                                                    id="labelEsPersonaConJubilacion1"
                                                    for="listaEsPersonaConJubilacion1"/>
                                                <webuijsf:dropDown id="listaEsPersonaConJubilacion1"
                                                    binding="#{Persona1.listaEsPersonaConJubilacion1}"
                                                    converter="#{Persona1.converterEsPersonaConJubilacion1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaEsPersonaConJubilacion1}"
                                                    selected="#{currentRow.value['es_persona_con_jubilacion']}"
                                                    toolTip="BundleParametros.es_persona_con_jubilacion.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConJubilacion1Texto1"
                                                    binding="#{Persona1.listaEsPersonaConJubilacion1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConJubilacion1"
                                                    for="listaEsPersonaConJubilacion1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnEsPersonaConPension1}"
                                                    headerText="con pensi&#243;n"
                                                    id="tableColumnEsPersonaConPension1" rendered="false"
                                                    sort="es_persona_con_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPersonaConPension1"
                                                    text="#{currentRow.value['es_persona_con_pension']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelEsPersonaConPension1}"
                                                    id="labelEsPersonaConPension1"
                                                    for="listaEsPersonaConPension1"/>
                                                <webuijsf:dropDown id="listaEsPersonaConPension1"
                                                    binding="#{Persona1.listaEsPersonaConPension1}"
                                                    converter="#{Persona1.converterEsPersonaConPension1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaEsPersonaConPension1}"
                                                    selected="#{currentRow.value['es_persona_con_pension']}"
                                                    toolTip="BundleParametros.es_persona_con_pension.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConPension1Texto1"
                                                    binding="#{Persona1.listaEsPersonaConPension1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConPension1"
                                                    for="listaEsPersonaConPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnEsPersonaConSubsidio1}"
                                                    headerText="con subsidio"
                                                    id="tableColumnEsPersonaConSubsidio1" rendered="false"
                                                    sort="es_persona_con_subsidio">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPersonaConSubsidio1"
                                                    text="#{currentRow.value['es_persona_con_subsidio']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelEsPersonaConSubsidio1}"
                                                    id="labelEsPersonaConSubsidio1"
                                                    for="listaEsPersonaConSubsidio1"/>
                                                <webuijsf:dropDown id="listaEsPersonaConSubsidio1"
                                                    binding="#{Persona1.listaEsPersonaConSubsidio1}"
                                                    converter="#{Persona1.converterEsPersonaConSubsidio1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaEsPersonaConSubsidio1}"
                                                    selected="#{currentRow.value['es_persona_con_subsidio']}"
                                                    toolTip="BundleParametros.es_persona_con_subsidio.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConSubsidio1Texto1"
                                                    binding="#{Persona1.listaEsPersonaConSubsidio1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConSubsidio1"
                                                    for="listaEsPersonaConSubsidio1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnEsPersonaConDeuda1}"
                                                    headerText="con deuda"
                                                    id="tableColumnEsPersonaConDeuda1" rendered="false"
                                                    sort="es_persona_con_deuda">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPersonaConDeuda1"
                                                    text="#{currentRow.value['es_persona_con_deuda']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelEsPersonaConDeuda1}"
                                                    id="labelEsPersonaConDeuda1"
                                                    for="listaEsPersonaConDeuda1"/>
                                                <webuijsf:dropDown id="listaEsPersonaConDeuda1"
                                                    binding="#{Persona1.listaEsPersonaConDeuda1}"
                                                    converter="#{Persona1.converterEsPersonaConDeuda1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaEsPersonaConDeuda1}"
                                                    selected="#{currentRow.value['es_persona_con_deuda']}"
                                                    toolTip="BundleParametros.es_persona_con_deuda.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConDeuda1Texto1"
                                                    binding="#{Persona1.listaEsPersonaConDeuda1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConDeuda1"
                                                    for="listaEsPersonaConDeuda1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnEsPersonaConPenaJudicial1}"
                                                    headerText="con pena judicial"
                                                    id="tableColumnEsPersonaConPenaJudicial1" rendered="false"
                                                    sort="es_persona_con_pena_judicial">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPersonaConPenaJudicial1"
                                                    text="#{currentRow.value['es_persona_con_pena_judicial']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelEsPersonaConPenaJudicial1}"
                                                    id="labelEsPersonaConPenaJudicial1"
                                                    for="listaEsPersonaConPenaJudicial1"/>
                                                <webuijsf:dropDown id="listaEsPersonaConPenaJudicial1"
                                                    binding="#{Persona1.listaEsPersonaConPenaJudicial1}"
                                                    converter="#{Persona1.converterEsPersonaConPenaJudicial1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaEsPersonaConPenaJudicial1}"
                                                    selected="#{currentRow.value['es_persona_con_pena_judicial']}"
                                                    toolTip="BundleParametros.es_persona_con_pena_judicial.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConPenaJudicial1Texto1"
                                                    binding="#{Persona1.listaEsPersonaConPenaJudicial1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConPenaJudicial1"
                                                    for="listaEsPersonaConPenaJudicial1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnEsPersonaConCerVida1}"
                                                    headerText="con certificado vida"
                                                    id="tableColumnEsPersonaConCerVida1" rendered="false"
                                                    sort="es_persona_con_cer_vida">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPersonaConCerVida1"
                                                    text="#{currentRow.value['es_persona_con_cer_vida']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelEsPersonaConCerVida1}"
                                                    id="labelEsPersonaConCerVida1"
                                                    for="listaEsPersonaConCerVida1"/>
                                                <webuijsf:dropDown id="listaEsPersonaConCerVida1"
                                                    binding="#{Persona1.listaEsPersonaConCerVida1}"
                                                    converter="#{Persona1.converterEsPersonaConCerVida1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaEsPersonaConCerVida1}"
                                                    selected="#{currentRow.value['es_persona_con_cer_vida']}"
                                                    toolTip="BundleParametros.es_persona_con_cer_vida.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConCerVida1Texto1"
                                                    binding="#{Persona1.listaEsPersonaConCerVida1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConCerVida1"
                                                    for="listaEsPersonaConCerVida1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnEsPersonaConCartaRenuncia1}"
                                                    headerText="con carta renuncia"
                                                    id="tableColumnEsPersonaConCartaRenuncia1" rendered="false"
                                                    sort="es_persona_con_carta_renuncia">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPersonaConCartaRenuncia1"
                                                    text="#{currentRow.value['es_persona_con_carta_renuncia']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelEsPersonaConCartaRenuncia1}"
                                                    id="labelEsPersonaConCartaRenuncia1"
                                                    for="listaEsPersonaConCartaRenuncia1"/>
                                                <webuijsf:dropDown id="listaEsPersonaConCartaRenuncia1"
                                                    binding="#{Persona1.listaEsPersonaConCartaRenuncia1}"
                                                    converter="#{Persona1.converterEsPersonaConCartaRenuncia1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaEsPersonaConCartaRenuncia1}"
                                                    selected="#{currentRow.value['es_persona_con_carta_renuncia']}"
                                                    toolTip="BundleParametros.es_persona_con_carta_renuncia.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConCartaRenuncia1Texto1"
                                                    binding="#{Persona1.listaEsPersonaConCartaRenuncia1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConCartaRenuncia1"
                                                    for="listaEsPersonaConCartaRenuncia1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnEsPersonaElegibleParaPen1}"
                                                    headerText="elegible para pensi&#243;n"
                                                    id="tableColumnEsPersonaElegibleParaPen1" rendered="false"
                                                    sort="es_persona_elegible_para_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPersonaElegibleParaPen1"
                                                    text="#{currentRow.value['es_persona_elegible_para_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelEsPersonaElegibleParaPen1}"
                                                    id="labelEsPersonaElegibleParaPen1"
                                                    for="listaEsPersonaElegibleParaPen1"/>
                                                <webuijsf:dropDown id="listaEsPersonaElegibleParaPen1"
                                                    binding="#{Persona1.listaEsPersonaElegibleParaPen1}"
                                                    converter="#{Persona1.converterEsPersonaElegibleParaPen1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaEsPersonaElegibleParaPen1}"
                                                    selected="#{currentRow.value['es_persona_elegible_para_pen']}"
                                                    toolTip="BundleParametros.es_persona_elegible_para_pen.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaElegibleParaPen1Texto1"
                                                    binding="#{Persona1.listaEsPersonaElegibleParaPen1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaElegibleParaPen1"
                                                    for="listaEsPersonaElegibleParaPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnEsPersonaAcreditadaParaPen1}"
                                                    headerText="acreditada para pensi&#243;n"
                                                    id="tableColumnEsPersonaAcreditadaParaPen1" rendered="false"
                                                    sort="es_persona_acreditada_para_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPersonaAcreditadaParaPen1"
                                                    text="#{currentRow.value['es_persona_acreditada_para_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelEsPersonaAcreditadaParaPen1}"
                                                    id="labelEsPersonaAcreditadaParaPen1"
                                                    for="listaEsPersonaAcreditadaParaPen1"/>
                                                <webuijsf:dropDown id="listaEsPersonaAcreditadaParaPen1"
                                                    binding="#{Persona1.listaEsPersonaAcreditadaParaPen1}"
                                                    converter="#{Persona1.converterEsPersonaAcreditadaParaPen1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaEsPersonaAcreditadaParaPen1}"
                                                    selected="#{currentRow.value['es_persona_acreditada_para_pen']}"
                                                    toolTip="BundleParametros.es_persona_acreditada_para_pen.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaAcreditadaParaPen1Texto1"
                                                    binding="#{Persona1.listaEsPersonaAcreditadaParaPen1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaAcreditadaParaPen1"
                                                    for="listaEsPersonaAcreditadaParaPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnEsPersonaConCopiaCedula1}"
                                                    headerText="con copia c&#233;dula"
                                                    id="tableColumnEsPersonaConCopiaCedula1" rendered="false"
                                                    sort="es_persona_con_copia_cedula">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPersonaConCopiaCedula1"
                                                    text="#{currentRow.value['es_persona_con_copia_cedula']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelEsPersonaConCopiaCedula1}"
                                                    id="labelEsPersonaConCopiaCedula1"
                                                    for="listaEsPersonaConCopiaCedula1"/>
                                                <webuijsf:dropDown id="listaEsPersonaConCopiaCedula1"
                                                    binding="#{Persona1.listaEsPersonaConCopiaCedula1}"
                                                    converter="#{Persona1.converterEsPersonaConCopiaCedula1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaEsPersonaConCopiaCedula1}"
                                                    selected="#{currentRow.value['es_persona_con_copia_cedula']}"
                                                    toolTip="BundleParametros.es_persona_con_copia_cedula.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConCopiaCedula1Texto1"
                                                    binding="#{Persona1.listaEsPersonaConCopiaCedula1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConCopiaCedula1"
                                                    for="listaEsPersonaConCopiaCedula1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnEsPersonaConDeclaracionJur1}"
                                                    headerText="con declaraci&#243;n jurada"
                                                    id="tableColumnEsPersonaConDeclaracionJur1" rendered="false"
                                                    sort="es_persona_con_declaracion_jur">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextEsPersonaConDeclaracionJur1"
                                                    text="#{currentRow.value['es_persona_con_declaracion_jur']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelEsPersonaConDeclaracionJur1}"
                                                    id="labelEsPersonaConDeclaracionJur1"
                                                    for="listaEsPersonaConDeclaracionJur1"/>
                                                <webuijsf:dropDown id="listaEsPersonaConDeclaracionJur1"
                                                    binding="#{Persona1.listaEsPersonaConDeclaracionJur1}"
                                                    converter="#{Persona1.converterEsPersonaConDeclaracionJur1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaEsPersonaConDeclaracionJur1}"
                                                    selected="#{currentRow.value['es_persona_con_declaracion_jur']}"
                                                    toolTip="BundleParametros.es_persona_con_declaracion_jur.persona"/>
                                                <webuijsf:staticText id="listaEsPersonaConDeclaracionJur1Texto1"
                                                    binding="#{Persona1.listaEsPersonaConDeclaracionJur1Texto1}"/>
                                                <webuijsf:message id="messageEsPersonaConDeclaracionJur1"
                                                    for="listaEsPersonaConDeclaracionJur1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnMontoPension1}"
                                                    headerText="monto pensi&#243;n"
                                                    id="tableColumnMontoPension1" rendered="false"
                                                    sort="monto_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextMontoPension1"
                                                    text="#{currentRow.value['monto_pension']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelMontoPension1}"
                                                    id="labelMontoPension1"
                                                    for="campoMontoPension1"/>
                                                <webuijsf:textField id="campoMontoPension1"
                                                    binding="#{Persona1.campoMontoPension1}"
                                                    converter="#{Persona1.converterMontoPension1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['monto_pension']}"
                                                    toolTip="BundleParametros.monto_pension.persona"
                                                    validatorExpression="#{Persona1.validatorMontoPension1.validate}"/>
                                                <webuijsf:staticText id="campoMontoPension1Texto1"
                                                    binding="#{Persona1.campoMontoPension1Texto1}"
                                                    converter="#{Persona1.converterMontoPension1}"
                                                    text="#{currentRow.value['monto_pension']}"/>
                                                <webuijsf:message id="messageMontoPension1"
                                                    for="campoMontoPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNumeroCondicionPension1}"
                                                    headerText="condici&#243;n pensi&#243;n"
                                                    id="tableColumnNumeroCondicionPension1" rendered="false"
                                                    sort="codigo_condicion_pension_1x9y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCondicionPension1"
                                                    text="#{currentRow.value['codigo_condicion_pension_1x9y2']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNumeroCondicionPension1}"
                                                    id="labelNumeroCondicionPension1"
                                                    for="listaNumeroCondicionPension1"/>
                                                <webuijsf:dropDown id="listaNumeroCondicionPension1"
                                                    binding="#{Persona1.listaNumeroCondicionPension1}"
                                                    converter="#{Persona1.converterNumeroCondicionPension1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaNumeroCondicionPension1}"
                                                    selected="#{currentRow.value['numero_condicion_pension']}"
                                                    toolTip="BundleParametros.numero_condicion_pension.persona"/>
                                                <webuijsf:staticText id="listaNumeroCondicionPension1Texto1"
                                                    binding="#{Persona1.listaNumeroCondicionPension1Texto1}"
                                                    text="#{currentRow.value['codigo_condicion_pension_1x9y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionPension1"
                                                    for="listaNumeroCondicionPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaSolicitudPension1}"
                                                    headerText="fecha solicitud pensi&#243;n"
                                                    id="tableColumnFechaSolicitudPension1" rendered="false"
                                                    sort="fecha_solicitud_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaSolicitudPension1"
                                                    text="#{currentRow.value['fecha_solicitud_pension']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaSolicitudPension1}"
                                                    id="labelFechaSolicitudPension1"
                                                    for="campoFechaSolicitudPension1"/>
                                                <webuijsf:textField id="campoFechaSolicitudPension1"
                                                    binding="#{Persona1.campoFechaSolicitudPension1}"
                                                    converter="#{Persona1.converterFechaSolicitudPension1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_solicitud_pension']}"
                                                    toolTip="BundleParametros.fecha_solicitud_pension.persona"/>
                                                <webuijsf:staticText id="campoFechaSolicitudPension1Texto1"
                                                    binding="#{Persona1.campoFechaSolicitudPension1Texto1}"
                                                    converter="#{Persona1.converterFechaSolicitudPension1}"
                                                    text="#{currentRow.value['fecha_solicitud_pension']}"/>
                                                <webuijsf:message id="messageFechaSolicitudPension1"
                                                    for="campoFechaSolicitudPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnComentariosSolicitudPension1}"
                                                    headerText="comentarios solicitud pensi&#243;n"
                                                    id="tableColumnComentariosSolicitudPension1" rendered="false"
                                                    sort="comentarios_solicitud_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosSolicitudPension1"
                                                    text="#{currentRow.value['comentarios_solicitud_pension']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelComentariosSolicitudPension1}"
                                                    id="labelComentariosSolicitudPension1"
                                                    for="campoComentariosSolicitudPension1"/>
                                                <webuijsf:textArea id="campoComentariosSolicitudPension1"
                                                    binding="#{Persona1.campoComentariosSolicitudPension1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_solicitud_pension']}"
                                                    toolTip="BundleParametros.comentarios_solicitud_pension.persona"
                                                    validatorExpression="#{Persona1.validatorComentariosSolicitudPension1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosSolicitudPension1Texto1"
                                                    binding="#{Persona1.campoComentariosSolicitudPension1Texto1}"
                                                    text="#{currentRow.value['comentarios_solicitud_pension']}"/>
                                                <webuijsf:message id="messageComentariosSolicitudPension1"
                                                    for="campoComentariosSolicitudPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaAprobacionPension1}"
                                                    headerText="fecha aprobaci&#243;n pensi&#243;n"
                                                    id="tableColumnFechaAprobacionPension1" rendered="false"
                                                    sort="fecha_aprobacion_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaAprobacionPension1"
                                                    text="#{currentRow.value['fecha_aprobacion_pension']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaAprobacionPension1}"
                                                    id="labelFechaAprobacionPension1"
                                                    for="campoFechaAprobacionPension1"/>
                                                <webuijsf:textField id="campoFechaAprobacionPension1"
                                                    binding="#{Persona1.campoFechaAprobacionPension1}"
                                                    converter="#{Persona1.converterFechaAprobacionPension1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_aprobacion_pension']}"
                                                    toolTip="BundleParametros.fecha_aprobacion_pension.persona"/>
                                                <webuijsf:staticText id="campoFechaAprobacionPension1Texto1"
                                                    binding="#{Persona1.campoFechaAprobacionPension1Texto1}"
                                                    converter="#{Persona1.converterFechaAprobacionPension1}"
                                                    text="#{currentRow.value['fecha_aprobacion_pension']}"/>
                                                <webuijsf:message id="messageFechaAprobacionPension1"
                                                    for="campoFechaAprobacionPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnComentariosAprobacionPension1}"
                                                    headerText="comentarios aprobaci&#243;n pensi&#243;n"
                                                    id="tableColumnComentariosAprobacionPension1" rendered="false"
                                                    sort="comentarios_aprobacion_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosAprobacionPension1"
                                                    text="#{currentRow.value['comentarios_aprobacion_pension']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelComentariosAprobacionPension1}"
                                                    id="labelComentariosAprobacionPension1"
                                                    for="campoComentariosAprobacionPension1"/>
                                                <webuijsf:textArea id="campoComentariosAprobacionPension1"
                                                    binding="#{Persona1.campoComentariosAprobacionPension1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_aprobacion_pension']}"
                                                    toolTip="BundleParametros.comentarios_aprobacion_pension.persona"
                                                    validatorExpression="#{Persona1.validatorComentariosAprobacionPension1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAprobacionPension1Texto1"
                                                    binding="#{Persona1.campoComentariosAprobacionPension1Texto1}"
                                                    text="#{currentRow.value['comentarios_aprobacion_pension']}"/>
                                                <webuijsf:message id="messageComentariosAprobacionPension1"
                                                    for="campoComentariosAprobacionPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaOtorgamientoPen1}"
                                                    headerText="fecha otorgamiento pensi&#243;n"
                                                    id="tableColumnFechaOtorgamientoPen1" rendered="false"
                                                    sort="fecha_otorgamiento_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaOtorgamientoPen1"
                                                    text="#{currentRow.value['fecha_otorgamiento_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaOtorgamientoPen1}"
                                                    id="labelFechaOtorgamientoPen1"
                                                    for="campoFechaOtorgamientoPen1"/>
                                                <webuijsf:textField id="campoFechaOtorgamientoPen1"
                                                    binding="#{Persona1.campoFechaOtorgamientoPen1}"
                                                    converter="#{Persona1.converterFechaOtorgamientoPen1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_otorgamiento_pen']}"
                                                    toolTip="BundleParametros.fecha_otorgamiento_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaOtorgamientoPen1Texto1"
                                                    binding="#{Persona1.campoFechaOtorgamientoPen1Texto1}"
                                                    converter="#{Persona1.converterFechaOtorgamientoPen1}"
                                                    text="#{currentRow.value['fecha_otorgamiento_pen']}"/>
                                                <webuijsf:message id="messageFechaOtorgamientoPen1"
                                                    for="campoFechaOtorgamientoPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNumeroResolucionOtorPen1}"
                                                    headerText="n&#250;mero resoluci&#243;n otorgamiento pensi&#243;n"
                                                    id="tableColumnNumeroResolucionOtorPen1" rendered="false"
                                                    sort="numero_resolucion_otor_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroResolucionOtorPen1"
                                                    text="#{currentRow.value['numero_resolucion_otor_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNumeroResolucionOtorPen1}"
                                                    id="labelNumeroResolucionOtorPen1"
                                                    for="campoNumeroResolucionOtorPen1"/>
                                                <webuijsf:textField id="campoNumeroResolucionOtorPen1"
                                                    binding="#{Persona1.campoNumeroResolucionOtorPen1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="true"
                                                    text="#{currentRow.value['numero_resolucion_otor_pen']}"
                                                    toolTip="BundleParametros.numero_resolucion_otor_pen.persona"
                                                    validatorExpression="#{Persona1.validatorNumeroResolucionOtorPen1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroResolucionOtorPen1Texto1"
                                                    binding="#{Persona1.campoNumeroResolucionOtorPen1Texto1}"
                                                    text="#{currentRow.value['numero_resolucion_otor_pen']}"/>
                                                <webuijsf:message id="messageNumeroResolucionOtorPen1"
                                                    for="campoNumeroResolucionOtorPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaResolucionOtorPen1}"
                                                    headerText="fecha resoluci&#243;n otorgamiento pensi&#243;n"
                                                    id="tableColumnFechaResolucionOtorPen1" rendered="false"
                                                    sort="fecha_resolucion_otor_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaResolucionOtorPen1"
                                                    text="#{currentRow.value['fecha_resolucion_otor_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaResolucionOtorPen1}"
                                                    id="labelFechaResolucionOtorPen1"
                                                    for="campoFechaResolucionOtorPen1"/>
                                                <webuijsf:textField id="campoFechaResolucionOtorPen1"
                                                    binding="#{Persona1.campoFechaResolucionOtorPen1}"
                                                    converter="#{Persona1.converterFechaResolucionOtorPen1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_resolucion_otor_pen']}"
                                                    toolTip="BundleParametros.fecha_resolucion_otor_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaResolucionOtorPen1Texto1"
                                                    binding="#{Persona1.campoFechaResolucionOtorPen1Texto1}"
                                                    converter="#{Persona1.converterFechaResolucionOtorPen1}"
                                                    text="#{currentRow.value['fecha_resolucion_otor_pen']}"/>
                                                <webuijsf:message id="messageFechaResolucionOtorPen1"
                                                    for="campoFechaResolucionOtorPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnComentariosOtorgamientoPen1}"
                                                    headerText="comentarios otorgamiento pensi&#243;n"
                                                    id="tableColumnComentariosOtorgamientoPen1" rendered="false"
                                                    sort="comentarios_otorgamiento_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosOtorgamientoPen1"
                                                    text="#{currentRow.value['comentarios_otorgamiento_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelComentariosOtorgamientoPen1}"
                                                    id="labelComentariosOtorgamientoPen1"
                                                    for="campoComentariosOtorgamientoPen1"/>
                                                <webuijsf:textArea id="campoComentariosOtorgamientoPen1"
                                                    binding="#{Persona1.campoComentariosOtorgamientoPen1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_otorgamiento_pen']}"
                                                    toolTip="BundleParametros.comentarios_otorgamiento_pen.persona"
                                                    validatorExpression="#{Persona1.validatorComentariosOtorgamientoPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosOtorgamientoPen1Texto1"
                                                    binding="#{Persona1.campoComentariosOtorgamientoPen1Texto1}"
                                                    text="#{currentRow.value['comentarios_otorgamiento_pen']}"/>
                                                <webuijsf:message id="messageComentariosOtorgamientoPen1"
                                                    for="campoComentariosOtorgamientoPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaObjecionPension1}"
                                                    headerText="fecha objeci&#243;n pensi&#243;n"
                                                    id="tableColumnFechaObjecionPension1" rendered="false"
                                                    sort="fecha_objecion_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaObjecionPension1"
                                                    text="#{currentRow.value['fecha_objecion_pension']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaObjecionPension1}"
                                                    id="labelFechaObjecionPension1"
                                                    for="campoFechaObjecionPension1"/>
                                                <webuijsf:textField id="campoFechaObjecionPension1"
                                                    binding="#{Persona1.campoFechaObjecionPension1}"
                                                    converter="#{Persona1.converterFechaObjecionPension1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_objecion_pension']}"
                                                    toolTip="BundleParametros.fecha_objecion_pension.persona"/>
                                                <webuijsf:staticText id="campoFechaObjecionPension1Texto1"
                                                    binding="#{Persona1.campoFechaObjecionPension1Texto1}"
                                                    converter="#{Persona1.converterFechaObjecionPension1}"
                                                    text="#{currentRow.value['fecha_objecion_pension']}"/>
                                                <webuijsf:message id="messageFechaObjecionPension1"
                                                    for="campoFechaObjecionPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNumeroCausaDenPension1}"
                                                    headerText="causa denegaci&#243;n pensi&#243;n"
                                                    id="tableColumnNumeroCausaDenPension1" rendered="false"
                                                    sort="codigo_causa_den_pensio_1x10y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCausaDenPension1"
                                                    text="#{currentRow.value['codigo_causa_den_pensio_1x10y2']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNumeroCausaDenPension1}"
                                                    id="labelNumeroCausaDenPension1"
                                                    for="listaNumeroCausaDenPension1"/>
                                                <webuijsf:dropDown id="listaNumeroCausaDenPension1"
                                                    binding="#{Persona1.listaNumeroCausaDenPension1}"
                                                    converter="#{Persona1.converterNumeroCausaDenPension1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaNumeroCausaDenPension1}"
                                                    selected="#{currentRow.value['numero_causa_den_pension']}"
                                                    toolTip="BundleParametros.numero_causa_den_pension.persona"/>
                                                <webuijsf:staticText id="listaNumeroCausaDenPension1Texto1"
                                                    binding="#{Persona1.listaNumeroCausaDenPension1Texto1}"
                                                    text="#{currentRow.value['codigo_causa_den_pensio_1x10y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaDenPension1"
                                                    for="listaNumeroCausaDenPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnOtraCausaDenPension1}"
                                                    headerText="otra causa denegaci&#243;n pensi&#243;n"
                                                    id="tableColumnOtraCausaDenPension1" rendered="false"
                                                    sort="otra_causa_den_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtraCausaDenPension1"
                                                    text="#{currentRow.value['otra_causa_den_pension']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelOtraCausaDenPension1}"
                                                    id="labelOtraCausaDenPension1"
                                                    for="campoOtraCausaDenPension1"/>
                                                <webuijsf:textField id="campoOtraCausaDenPension1"
                                                    binding="#{Persona1.campoOtraCausaDenPension1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{currentRow.value['otra_causa_den_pension']}"
                                                    toolTip="BundleParametros.otra_causa_den_pension.persona"
                                                    validatorExpression="#{Persona1.validatorOtraCausaDenPension1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaDenPension1Texto1"
                                                    binding="#{Persona1.campoOtraCausaDenPension1Texto1}"
                                                    text="#{currentRow.value['otra_causa_den_pension']}"/>
                                                <webuijsf:message id="messageOtraCausaDenPension1"
                                                    for="campoOtraCausaDenPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnComentariosObjecionPension1}"
                                                    headerText="comentarios objeci&#243;n pensi&#243;n"
                                                    id="tableColumnComentariosObjecionPension1" rendered="false"
                                                    sort="comentarios_objecion_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosObjecionPension1"
                                                    text="#{currentRow.value['comentarios_objecion_pension']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelComentariosObjecionPension1}"
                                                    id="labelComentariosObjecionPension1"
                                                    for="campoComentariosObjecionPension1"/>
                                                <webuijsf:textArea id="campoComentariosObjecionPension1"
                                                    binding="#{Persona1.campoComentariosObjecionPension1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_objecion_pension']}"
                                                    toolTip="BundleParametros.comentarios_objecion_pension.persona"
                                                    validatorExpression="#{Persona1.validatorComentariosObjecionPension1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosObjecionPension1Texto1"
                                                    binding="#{Persona1.campoComentariosObjecionPension1Texto1}"
                                                    text="#{currentRow.value['comentarios_objecion_pension']}"/>
                                                <webuijsf:message id="messageComentariosObjecionPension1"
                                                    for="campoComentariosObjecionPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaDenegacionPension1}"
                                                    headerText="fecha denegaci&#243;n pensi&#243;n"
                                                    id="tableColumnFechaDenegacionPension1" rendered="false"
                                                    sort="fecha_denegacion_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaDenegacionPension1"
                                                    text="#{currentRow.value['fecha_denegacion_pension']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaDenegacionPension1}"
                                                    id="labelFechaDenegacionPension1"
                                                    for="campoFechaDenegacionPension1"/>
                                                <webuijsf:textField id="campoFechaDenegacionPension1"
                                                    binding="#{Persona1.campoFechaDenegacionPension1}"
                                                    converter="#{Persona1.converterFechaDenegacionPension1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_denegacion_pension']}"
                                                    toolTip="BundleParametros.fecha_denegacion_pension.persona"/>
                                                <webuijsf:staticText id="campoFechaDenegacionPension1Texto1"
                                                    binding="#{Persona1.campoFechaDenegacionPension1Texto1}"
                                                    converter="#{Persona1.converterFechaDenegacionPension1}"
                                                    text="#{currentRow.value['fecha_denegacion_pension']}"/>
                                                <webuijsf:message id="messageFechaDenegacionPension1"
                                                    for="campoFechaDenegacionPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNumeroResolucionDenPen1}"
                                                    headerText="n&#250;mero resoluci&#243;n denegaci&#243;n pensi&#243;n"
                                                    id="tableColumnNumeroResolucionDenPen1" rendered="false"
                                                    sort="numero_resolucion_den_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroResolucionDenPen1"
                                                    text="#{currentRow.value['numero_resolucion_den_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNumeroResolucionDenPen1}"
                                                    id="labelNumeroResolucionDenPen1"
                                                    for="campoNumeroResolucionDenPen1"/>
                                                <webuijsf:textField id="campoNumeroResolucionDenPen1"
                                                    binding="#{Persona1.campoNumeroResolucionDenPen1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="true"
                                                    text="#{currentRow.value['numero_resolucion_den_pen']}"
                                                    toolTip="BundleParametros.numero_resolucion_den_pen.persona"
                                                    validatorExpression="#{Persona1.validatorNumeroResolucionDenPen1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroResolucionDenPen1Texto1"
                                                    binding="#{Persona1.campoNumeroResolucionDenPen1Texto1}"
                                                    text="#{currentRow.value['numero_resolucion_den_pen']}"/>
                                                <webuijsf:message id="messageNumeroResolucionDenPen1"
                                                    for="campoNumeroResolucionDenPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaResolucionDenPen1}"
                                                    headerText="fecha resoluci&#243;n denegaci&#243;n pensi&#243;n"
                                                    id="tableColumnFechaResolucionDenPen1" rendered="false"
                                                    sort="fecha_resolucion_den_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaResolucionDenPen1"
                                                    text="#{currentRow.value['fecha_resolucion_den_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaResolucionDenPen1}"
                                                    id="labelFechaResolucionDenPen1"
                                                    for="campoFechaResolucionDenPen1"/>
                                                <webuijsf:textField id="campoFechaResolucionDenPen1"
                                                    binding="#{Persona1.campoFechaResolucionDenPen1}"
                                                    converter="#{Persona1.converterFechaResolucionDenPen1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_resolucion_den_pen']}"
                                                    toolTip="BundleParametros.fecha_resolucion_den_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaResolucionDenPen1Texto1"
                                                    binding="#{Persona1.campoFechaResolucionDenPen1Texto1}"
                                                    converter="#{Persona1.converterFechaResolucionDenPen1}"
                                                    text="#{currentRow.value['fecha_resolucion_den_pen']}"/>
                                                <webuijsf:message id="messageFechaResolucionDenPen1"
                                                    for="campoFechaResolucionDenPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnComentariosDenegacionPension1}"
                                                    headerText="comentarios denegaci&#243;n pensi&#243;n"
                                                    id="tableColumnComentariosDenegacionPension1" rendered="false"
                                                    sort="comentarios_denegacion_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosDenegacionPension1"
                                                    text="#{currentRow.value['comentarios_denegacion_pension']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelComentariosDenegacionPension1}"
                                                    id="labelComentariosDenegacionPension1"
                                                    for="campoComentariosDenegacionPension1"/>
                                                <webuijsf:textArea id="campoComentariosDenegacionPension1"
                                                    binding="#{Persona1.campoComentariosDenegacionPension1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_denegacion_pension']}"
                                                    toolTip="BundleParametros.comentarios_denegacion_pension.persona"
                                                    validatorExpression="#{Persona1.validatorComentariosDenegacionPension1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosDenegacionPension1Texto1"
                                                    binding="#{Persona1.campoComentariosDenegacionPension1Texto1}"
                                                    text="#{currentRow.value['comentarios_denegacion_pension']}"/>
                                                <webuijsf:message id="messageComentariosDenegacionPension1"
                                                    for="campoComentariosDenegacionPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaRevocacionPension1}"
                                                    headerText="fecha revocaci&#243;n pensi&#243;n"
                                                    id="tableColumnFechaRevocacionPension1" rendered="false"
                                                    sort="fecha_revocacion_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaRevocacionPension1"
                                                    text="#{currentRow.value['fecha_revocacion_pension']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaRevocacionPension1}"
                                                    id="labelFechaRevocacionPension1"
                                                    for="campoFechaRevocacionPension1"/>
                                                <webuijsf:textField id="campoFechaRevocacionPension1"
                                                    binding="#{Persona1.campoFechaRevocacionPension1}"
                                                    converter="#{Persona1.converterFechaRevocacionPension1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_revocacion_pension']}"
                                                    toolTip="BundleParametros.fecha_revocacion_pension.persona"/>
                                                <webuijsf:staticText id="campoFechaRevocacionPension1Texto1"
                                                    binding="#{Persona1.campoFechaRevocacionPension1Texto1}"
                                                    converter="#{Persona1.converterFechaRevocacionPension1}"
                                                    text="#{currentRow.value['fecha_revocacion_pension']}"/>
                                                <webuijsf:message id="messageFechaRevocacionPension1"
                                                    for="campoFechaRevocacionPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNumeroCausaRevPension1}"
                                                    headerText="causa revocaci&#243;n pensi&#243;n"
                                                    id="tableColumnNumeroCausaRevPension1" rendered="false"
                                                    sort="codigo_causa_rev_pensio_1x11y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCausaRevPension1"
                                                    text="#{currentRow.value['codigo_causa_rev_pensio_1x11y2']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNumeroCausaRevPension1}"
                                                    id="labelNumeroCausaRevPension1"
                                                    for="listaNumeroCausaRevPension1"/>
                                                <webuijsf:dropDown id="listaNumeroCausaRevPension1"
                                                    binding="#{Persona1.listaNumeroCausaRevPension1}"
                                                    converter="#{Persona1.converterNumeroCausaRevPension1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaNumeroCausaRevPension1}"
                                                    selected="#{currentRow.value['numero_causa_rev_pension']}"
                                                    toolTip="BundleParametros.numero_causa_rev_pension.persona"/>
                                                <webuijsf:staticText id="listaNumeroCausaRevPension1Texto1"
                                                    binding="#{Persona1.listaNumeroCausaRevPension1Texto1}"
                                                    text="#{currentRow.value['codigo_causa_rev_pensio_1x11y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaRevPension1"
                                                    for="listaNumeroCausaRevPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnOtraCausaRevPension1}"
                                                    headerText="otra causa revocaci&#243;n pensi&#243;n"
                                                    id="tableColumnOtraCausaRevPension1" rendered="false"
                                                    sort="otra_causa_rev_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtraCausaRevPension1"
                                                    text="#{currentRow.value['otra_causa_rev_pension']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelOtraCausaRevPension1}"
                                                    id="labelOtraCausaRevPension1"
                                                    for="campoOtraCausaRevPension1"/>
                                                <webuijsf:textField id="campoOtraCausaRevPension1"
                                                    binding="#{Persona1.campoOtraCausaRevPension1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{currentRow.value['otra_causa_rev_pension']}"
                                                    toolTip="BundleParametros.otra_causa_rev_pension.persona"
                                                    validatorExpression="#{Persona1.validatorOtraCausaRevPension1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaRevPension1Texto1"
                                                    binding="#{Persona1.campoOtraCausaRevPension1Texto1}"
                                                    text="#{currentRow.value['otra_causa_rev_pension']}"/>
                                                <webuijsf:message id="messageOtraCausaRevPension1"
                                                    for="campoOtraCausaRevPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnComentariosRevocacionPension1}"
                                                    headerText="comentarios revocaci&#243;n pensi&#243;n"
                                                    id="tableColumnComentariosRevocacionPension1" rendered="false"
                                                    sort="comentarios_revocacion_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosRevocacionPension1"
                                                    text="#{currentRow.value['comentarios_revocacion_pension']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelComentariosRevocacionPension1}"
                                                    id="labelComentariosRevocacionPension1"
                                                    for="campoComentariosRevocacionPension1"/>
                                                <webuijsf:textArea id="campoComentariosRevocacionPension1"
                                                    binding="#{Persona1.campoComentariosRevocacionPension1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_revocacion_pension']}"
                                                    toolTip="BundleParametros.comentarios_revocacion_pension.persona"
                                                    validatorExpression="#{Persona1.validatorComentariosRevocacionPension1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosRevocacionPension1Texto1"
                                                    binding="#{Persona1.campoComentariosRevocacionPension1Texto1}"
                                                    text="#{currentRow.value['comentarios_revocacion_pension']}"/>
                                                <webuijsf:message id="messageComentariosRevocacionPension1"
                                                    for="campoComentariosRevocacionPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNumeroCondicionRecoPen1}"
                                                    headerText="condici&#243;n reconsideraci&#243;n pensi&#243;n"
                                                    id="tableColumnNumeroCondicionRecoPen1" rendered="false"
                                                    sort="codigo_condicion_reco_p_1x12y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCondicionRecoPen1"
                                                    text="#{currentRow.value['codigo_condicion_reco_p_1x12y2']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNumeroCondicionRecoPen1}"
                                                    id="labelNumeroCondicionRecoPen1"
                                                    for="listaNumeroCondicionRecoPen1"/>
                                                <webuijsf:dropDown id="listaNumeroCondicionRecoPen1"
                                                    binding="#{Persona1.listaNumeroCondicionRecoPen1}"
                                                    converter="#{Persona1.converterNumeroCondicionRecoPen1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaNumeroCondicionRecoPen1}"
                                                    selected="#{currentRow.value['numero_condicion_reco_pen']}"
                                                    toolTip="BundleParametros.numero_condicion_reco_pen.persona"/>
                                                <webuijsf:staticText id="listaNumeroCondicionRecoPen1Texto1"
                                                    binding="#{Persona1.listaNumeroCondicionRecoPen1Texto1}"
                                                    text="#{currentRow.value['codigo_condicion_reco_p_1x12y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionRecoPen1"
                                                    for="listaNumeroCondicionRecoPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaSolicitudRecoPen1}"
                                                    headerText="fecha solicitud reconsideraci&#243;n pensi&#243;n"
                                                    id="tableColumnFechaSolicitudRecoPen1" rendered="false"
                                                    sort="fecha_solicitud_reco_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaSolicitudRecoPen1"
                                                    text="#{currentRow.value['fecha_solicitud_reco_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaSolicitudRecoPen1}"
                                                    id="labelFechaSolicitudRecoPen1"
                                                    for="campoFechaSolicitudRecoPen1"/>
                                                <webuijsf:textField id="campoFechaSolicitudRecoPen1"
                                                    binding="#{Persona1.campoFechaSolicitudRecoPen1}"
                                                    converter="#{Persona1.converterFechaSolicitudRecoPen1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_solicitud_reco_pen']}"
                                                    toolTip="BundleParametros.fecha_solicitud_reco_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaSolicitudRecoPen1Texto1"
                                                    binding="#{Persona1.campoFechaSolicitudRecoPen1Texto1}"
                                                    converter="#{Persona1.converterFechaSolicitudRecoPen1}"
                                                    text="#{currentRow.value['fecha_solicitud_reco_pen']}"/>
                                                <webuijsf:message id="messageFechaSolicitudRecoPen1"
                                                    for="campoFechaSolicitudRecoPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnComentariosSolicitudRecoPen1}"
                                                    headerText="comentarios solicitud reconsideraci&#243;n pensi&#243;n"
                                                    id="tableColumnComentariosSolicitudRecoPen1" rendered="false"
                                                    sort="comentarios_solicitud_reco_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosSolicitudRecoPen1"
                                                    text="#{currentRow.value['comentarios_solicitud_reco_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelComentariosSolicitudRecoPen1}"
                                                    id="labelComentariosSolicitudRecoPen1"
                                                    for="campoComentariosSolicitudRecoPen1"/>
                                                <webuijsf:textArea id="campoComentariosSolicitudRecoPen1"
                                                    binding="#{Persona1.campoComentariosSolicitudRecoPen1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_solicitud_reco_pen']}"
                                                    toolTip="BundleParametros.comentarios_solicitud_reco_pen.persona"
                                                    validatorExpression="#{Persona1.validatorComentariosSolicitudRecoPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosSolicitudRecoPen1Texto1"
                                                    binding="#{Persona1.campoComentariosSolicitudRecoPen1Texto1}"
                                                    text="#{currentRow.value['comentarios_solicitud_reco_pen']}"/>
                                                <webuijsf:message id="messageComentariosSolicitudRecoPen1"
                                                    for="campoComentariosSolicitudRecoPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaAprobacionRecoPen1}"
                                                    headerText="fecha aprobaci&#243;n reconsideraci&#243;n pensi&#243;n"
                                                    id="tableColumnFechaAprobacionRecoPen1" rendered="false"
                                                    sort="fecha_aprobacion_reco_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaAprobacionRecoPen1"
                                                    text="#{currentRow.value['fecha_aprobacion_reco_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaAprobacionRecoPen1}"
                                                    id="labelFechaAprobacionRecoPen1"
                                                    for="campoFechaAprobacionRecoPen1"/>
                                                <webuijsf:textField id="campoFechaAprobacionRecoPen1"
                                                    binding="#{Persona1.campoFechaAprobacionRecoPen1}"
                                                    converter="#{Persona1.converterFechaAprobacionRecoPen1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_aprobacion_reco_pen']}"
                                                    toolTip="BundleParametros.fecha_aprobacion_reco_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaAprobacionRecoPen1Texto1"
                                                    binding="#{Persona1.campoFechaAprobacionRecoPen1Texto1}"
                                                    converter="#{Persona1.converterFechaAprobacionRecoPen1}"
                                                    text="#{currentRow.value['fecha_aprobacion_reco_pen']}"/>
                                                <webuijsf:message id="messageFechaAprobacionRecoPen1"
                                                    for="campoFechaAprobacionRecoPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnComentariosAprRecoPen1}"
                                                    headerText="comentarios aprobaci&#243;n reconsideraci&#243;n pensi&#243;n"
                                                    id="tableColumnComentariosAprRecoPen1" rendered="false"
                                                    sort="comentarios_apr_reco_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosAprRecoPen1"
                                                    text="#{currentRow.value['comentarios_apr_reco_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelComentariosAprRecoPen1}"
                                                    id="labelComentariosAprRecoPen1"
                                                    for="campoComentariosAprRecoPen1"/>
                                                <webuijsf:textArea id="campoComentariosAprRecoPen1"
                                                    binding="#{Persona1.campoComentariosAprRecoPen1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_apr_reco_pen']}"
                                                    toolTip="BundleParametros.comentarios_apr_reco_pen.persona"
                                                    validatorExpression="#{Persona1.validatorComentariosAprRecoPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosAprRecoPen1Texto1"
                                                    binding="#{Persona1.campoComentariosAprRecoPen1Texto1}"
                                                    text="#{currentRow.value['comentarios_apr_reco_pen']}"/>
                                                <webuijsf:message id="messageComentariosAprRecoPen1"
                                                    for="campoComentariosAprRecoPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaDenegacionRecoPen1}"
                                                    headerText="fecha denegaci&#243;n reconsideraci&#243;n pensi&#243;n"
                                                    id="tableColumnFechaDenegacionRecoPen1" rendered="false"
                                                    sort="fecha_denegacion_reco_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaDenegacionRecoPen1"
                                                    text="#{currentRow.value['fecha_denegacion_reco_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaDenegacionRecoPen1}"
                                                    id="labelFechaDenegacionRecoPen1"
                                                    for="campoFechaDenegacionRecoPen1"/>
                                                <webuijsf:textField id="campoFechaDenegacionRecoPen1"
                                                    binding="#{Persona1.campoFechaDenegacionRecoPen1}"
                                                    converter="#{Persona1.converterFechaDenegacionRecoPen1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_denegacion_reco_pen']}"
                                                    toolTip="BundleParametros.fecha_denegacion_reco_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaDenegacionRecoPen1Texto1"
                                                    binding="#{Persona1.campoFechaDenegacionRecoPen1Texto1}"
                                                    converter="#{Persona1.converterFechaDenegacionRecoPen1}"
                                                    text="#{currentRow.value['fecha_denegacion_reco_pen']}"/>
                                                <webuijsf:message id="messageFechaDenegacionRecoPen1"
                                                    for="campoFechaDenegacionRecoPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNumeroCausaDenRecoPen1}"
                                                    headerText="causa denegaci&#243;n reconsideraci&#243;n pensi&#243;n"
                                                    id="tableColumnNumeroCausaDenRecoPen1" rendered="false"
                                                    sort="codigo_causa_den_reco_p_1x13y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCausaDenRecoPen1"
                                                    text="#{currentRow.value['codigo_causa_den_reco_p_1x13y2']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNumeroCausaDenRecoPen1}"
                                                    id="labelNumeroCausaDenRecoPen1"
                                                    for="listaNumeroCausaDenRecoPen1"/>
                                                <webuijsf:dropDown id="listaNumeroCausaDenRecoPen1"
                                                    binding="#{Persona1.listaNumeroCausaDenRecoPen1}"
                                                    converter="#{Persona1.converterNumeroCausaDenRecoPen1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaNumeroCausaDenRecoPen1}"
                                                    selected="#{currentRow.value['numero_causa_den_reco_pen']}"
                                                    toolTip="BundleParametros.numero_causa_den_reco_pen.persona"/>
                                                <webuijsf:staticText id="listaNumeroCausaDenRecoPen1Texto1"
                                                    binding="#{Persona1.listaNumeroCausaDenRecoPen1Texto1}"
                                                    text="#{currentRow.value['codigo_causa_den_reco_p_1x13y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaDenRecoPen1"
                                                    for="listaNumeroCausaDenRecoPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnOtraCausaDenRecoPen1}"
                                                    headerText="otra causa denegaci&#243;n reconsideraci&#243;n pensi&#243;n"
                                                    id="tableColumnOtraCausaDenRecoPen1" rendered="false"
                                                    sort="otra_causa_den_reco_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextOtraCausaDenRecoPen1"
                                                    text="#{currentRow.value['otra_causa_den_reco_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelOtraCausaDenRecoPen1}"
                                                    id="labelOtraCausaDenRecoPen1"
                                                    for="campoOtraCausaDenRecoPen1"/>
                                                <webuijsf:textField id="campoOtraCausaDenRecoPen1"
                                                    binding="#{Persona1.campoOtraCausaDenRecoPen1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{currentRow.value['otra_causa_den_reco_pen']}"
                                                    toolTip="BundleParametros.otra_causa_den_reco_pen.persona"
                                                    validatorExpression="#{Persona1.validatorOtraCausaDenRecoPen1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaDenRecoPen1Texto1"
                                                    binding="#{Persona1.campoOtraCausaDenRecoPen1Texto1}"
                                                    text="#{currentRow.value['otra_causa_den_reco_pen']}"/>
                                                <webuijsf:message id="messageOtraCausaDenRecoPen1"
                                                    for="campoOtraCausaDenRecoPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnComentariosDenRecoPen1}"
                                                    headerText="comentarios denegaci&#243;n reconsideraci&#243;n pensi&#243;n"
                                                    id="tableColumnComentariosDenRecoPen1" rendered="false"
                                                    sort="comentarios_den_reco_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosDenRecoPen1"
                                                    text="#{currentRow.value['comentarios_den_reco_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelComentariosDenRecoPen1}"
                                                    id="labelComentariosDenRecoPen1"
                                                    for="campoComentariosDenRecoPen1"/>
                                                <webuijsf:textArea id="campoComentariosDenRecoPen1"
                                                    binding="#{Persona1.campoComentariosDenRecoPen1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_den_reco_pen']}"
                                                    toolTip="BundleParametros.comentarios_den_reco_pen.persona"
                                                    validatorExpression="#{Persona1.validatorComentariosDenRecoPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosDenRecoPen1Texto1"
                                                    binding="#{Persona1.campoComentariosDenRecoPen1Texto1}"
                                                    text="#{currentRow.value['comentarios_den_reco_pen']}"/>
                                                <webuijsf:message id="messageComentariosDenRecoPen1"
                                                    for="campoComentariosDenRecoPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNumeroCondicionDenuPen1}"
                                                    headerText="condici&#243;n denuncia pensi&#243;n"
                                                    id="tableColumnNumeroCondicionDenuPen1" rendered="false"
                                                    sort="codigo_condicion_denu_p_1x14y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroCondicionDenuPen1"
                                                    text="#{currentRow.value['codigo_condicion_denu_p_1x14y2']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNumeroCondicionDenuPen1}"
                                                    id="labelNumeroCondicionDenuPen1"
                                                    for="listaNumeroCondicionDenuPen1"/>
                                                <webuijsf:dropDown id="listaNumeroCondicionDenuPen1"
                                                    binding="#{Persona1.listaNumeroCondicionDenuPen1}"
                                                    converter="#{Persona1.converterNumeroCondicionDenuPen1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaNumeroCondicionDenuPen1}"
                                                    selected="#{currentRow.value['numero_condicion_denu_pen']}"
                                                    toolTip="BundleParametros.numero_condicion_denu_pen.persona"/>
                                                <webuijsf:staticText id="listaNumeroCondicionDenuPen1Texto1"
                                                    binding="#{Persona1.listaNumeroCondicionDenuPen1Texto1}"
                                                    text="#{currentRow.value['codigo_condicion_denu_p_1x14y2']}"/>
                                                <webuijsf:message id="messageNumeroCondicionDenuPen1"
                                                    for="listaNumeroCondicionDenuPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaRegistroDenunciaPen1}"
                                                    headerText="fecha registro denuncia pensi&#243;n"
                                                    id="tableColumnFechaRegistroDenunciaPen1" rendered="false"
                                                    sort="fecha_registro_denuncia_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaRegistroDenunciaPen1"
                                                    text="#{currentRow.value['fecha_registro_denuncia_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaRegistroDenunciaPen1}"
                                                    id="labelFechaRegistroDenunciaPen1"
                                                    for="campoFechaRegistroDenunciaPen1"/>
                                                <webuijsf:textField id="campoFechaRegistroDenunciaPen1"
                                                    binding="#{Persona1.campoFechaRegistroDenunciaPen1}"
                                                    converter="#{Persona1.converterFechaRegistroDenunciaPen1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_registro_denuncia_pen']}"
                                                    toolTip="BundleParametros.fecha_registro_denuncia_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaRegistroDenunciaPen1Texto1"
                                                    binding="#{Persona1.campoFechaRegistroDenunciaPen1Texto1}"
                                                    converter="#{Persona1.converterFechaRegistroDenunciaPen1}"
                                                    text="#{currentRow.value['fecha_registro_denuncia_pen']}"/>
                                                <webuijsf:message id="messageFechaRegistroDenunciaPen1"
                                                    for="campoFechaRegistroDenunciaPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnComentariosRegistroDenuPen1}"
                                                    headerText="comentarios registro denuncia pensi&#243;n"
                                                    id="tableColumnComentariosRegistroDenuPen1" rendered="false"
                                                    sort="comentarios_registro_denu_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosRegistroDenuPen1"
                                                    text="#{currentRow.value['comentarios_registro_denu_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelComentariosRegistroDenuPen1}"
                                                    id="labelComentariosRegistroDenuPen1"
                                                    for="campoComentariosRegistroDenuPen1"/>
                                                <webuijsf:textArea id="campoComentariosRegistroDenuPen1"
                                                    binding="#{Persona1.campoComentariosRegistroDenuPen1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_registro_denu_pen']}"
                                                    toolTip="BundleParametros.comentarios_registro_denu_pen.persona"
                                                    validatorExpression="#{Persona1.validatorComentariosRegistroDenuPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosRegistroDenuPen1Texto1"
                                                    binding="#{Persona1.campoComentariosRegistroDenuPen1Texto1}"
                                                    text="#{currentRow.value['comentarios_registro_denu_pen']}"/>
                                                <webuijsf:message id="messageComentariosRegistroDenuPen1"
                                                    for="campoComentariosRegistroDenuPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaConfirmacionDenuPen1}"
                                                    headerText="fecha confirmaci&#243;n denuncia pensi&#243;n"
                                                    id="tableColumnFechaConfirmacionDenuPen1" rendered="false"
                                                    sort="fecha_confirmacion_denu_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaConfirmacionDenuPen1"
                                                    text="#{currentRow.value['fecha_confirmacion_denu_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaConfirmacionDenuPen1}"
                                                    id="labelFechaConfirmacionDenuPen1"
                                                    for="campoFechaConfirmacionDenuPen1"/>
                                                <webuijsf:textField id="campoFechaConfirmacionDenuPen1"
                                                    binding="#{Persona1.campoFechaConfirmacionDenuPen1}"
                                                    converter="#{Persona1.converterFechaConfirmacionDenuPen1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_confirmacion_denu_pen']}"
                                                    toolTip="BundleParametros.fecha_confirmacion_denu_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaConfirmacionDenuPen1Texto1"
                                                    binding="#{Persona1.campoFechaConfirmacionDenuPen1Texto1}"
                                                    converter="#{Persona1.converterFechaConfirmacionDenuPen1}"
                                                    text="#{currentRow.value['fecha_confirmacion_denu_pen']}"/>
                                                <webuijsf:message id="messageFechaConfirmacionDenuPen1"
                                                    for="campoFechaConfirmacionDenuPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnComentariosConfDenuPen1}"
                                                    headerText="comentarios confirmaci&#243;n denuncia pensi&#243;n"
                                                    id="tableColumnComentariosConfDenuPen1" rendered="false"
                                                    sort="comentarios_conf_denu_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosConfDenuPen1"
                                                    text="#{currentRow.value['comentarios_conf_denu_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelComentariosConfDenuPen1}"
                                                    id="labelComentariosConfDenuPen1"
                                                    for="campoComentariosConfDenuPen1"/>
                                                <webuijsf:textArea id="campoComentariosConfDenuPen1"
                                                    binding="#{Persona1.campoComentariosConfDenuPen1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_conf_denu_pen']}"
                                                    toolTip="BundleParametros.comentarios_conf_denu_pen.persona"
                                                    validatorExpression="#{Persona1.validatorComentariosConfDenuPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosConfDenuPen1Texto1"
                                                    binding="#{Persona1.campoComentariosConfDenuPen1Texto1}"
                                                    text="#{currentRow.value['comentarios_conf_denu_pen']}"/>
                                                <webuijsf:message id="messageComentariosConfDenuPen1"
                                                    for="campoComentariosConfDenuPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaDesmentidoDenunciaPen1}"
                                                    headerText="fecha desmentido denuncia pensi&#243;n"
                                                    id="tableColumnFechaDesmentidoDenunciaPen1" rendered="false"
                                                    sort="fecha_desmentido_denuncia_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaDesmentidoDenunciaPen1"
                                                    text="#{currentRow.value['fecha_desmentido_denuncia_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaDesmentidoDenunciaPen1}"
                                                    id="labelFechaDesmentidoDenunciaPen1"
                                                    for="campoFechaDesmentidoDenunciaPen1"/>
                                                <webuijsf:textField id="campoFechaDesmentidoDenunciaPen1"
                                                    binding="#{Persona1.campoFechaDesmentidoDenunciaPen1}"
                                                    converter="#{Persona1.converterFechaDesmentidoDenunciaPen1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_desmentido_denuncia_pen']}"
                                                    toolTip="BundleParametros.fecha_desmentido_denuncia_pen.persona"/>
                                                <webuijsf:staticText id="campoFechaDesmentidoDenunciaPen1Texto1"
                                                    binding="#{Persona1.campoFechaDesmentidoDenunciaPen1Texto1}"
                                                    converter="#{Persona1.converterFechaDesmentidoDenunciaPen1}"
                                                    text="#{currentRow.value['fecha_desmentido_denuncia_pen']}"/>
                                                <webuijsf:message id="messageFechaDesmentidoDenunciaPen1"
                                                    for="campoFechaDesmentidoDenunciaPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnComentariosDesDenuPen1}"
                                                    headerText="comentarios desmentido denuncia pensi&#243;n"
                                                    id="tableColumnComentariosDesDenuPen1" rendered="false"
                                                    sort="comentarios_des_denu_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextComentariosDesDenuPen1"
                                                    text="#{currentRow.value['comentarios_des_denu_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelComentariosDesDenuPen1}"
                                                    id="labelComentariosDesDenuPen1"
                                                    for="campoComentariosDesDenuPen1"/>
                                                <webuijsf:textArea id="campoComentariosDesDenuPen1"
                                                    binding="#{Persona1.campoComentariosDesDenuPen1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['comentarios_des_denu_pen']}"
                                                    toolTip="BundleParametros.comentarios_des_denu_pen.persona"
                                                    validatorExpression="#{Persona1.validatorComentariosDesDenuPen1.validate}"/>
                                                <webuijsf:staticText id="campoComentariosDesDenuPen1Texto1"
                                                    binding="#{Persona1.campoComentariosDesDenuPen1Texto1}"
                                                    text="#{currentRow.value['comentarios_des_denu_pen']}"/>
                                                <webuijsf:message id="messageComentariosDesDenuPen1"
                                                    for="campoComentariosDesDenuPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnIdFichaPersona1}"
                                                    headerText="ficha"
                                                    id="tableColumnIdFichaPersona1" rendered="false"
                                                    sort="codigo_ficha_persona_1x15y3">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaPersona1"
                                                    text="#{currentRow.value['codigo_ficha_persona_1x15y3']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelIdFichaPersona1}"
                                                    id="labelIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                <webuijsf:textField id="campoIdFichaPersona1"
                                                    binding="#{Persona1.campoIdFichaPersona1}"
                                                    readOnly="true"
                                                    text="#{Persona1.asistente.textoCampoIdFichaPersona1}"
                                                    toolTip="#{Persona1.asistente.toolTipCampoIdFichaPersona1}"
                                                    validatorExpression="#{Persona1.campoIdFichaPersona1_validate}"/>
                                                <webuijsf:staticText id="campoIdFichaPersona1Texto1"
                                                    binding="#{Persona1.campoIdFichaPersona1Texto1}"
                                                    text="#{currentRow.value['codigo_ficha_persona_1x15y3']}"/>
                                                <webuijsf:message id="messageIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    id="tableColumnIdFichaPersona3" rendered="false"
                                                    align="center">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaPersona3"
                                                    text="#{currentRow.value['id_ficha_persona']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:button
                                                    binding="#{Persona1.campoIdFichaPersona1Boton1}"
                                                    id="campoIdFichaPersona1Boton1"
                                                    onClick="#{Persona1.asistente.scriptCampoIdFichaPersona1Boton1}"/>
                                                <webuijsf:button
                                                    binding="#{Persona1.campoIdFichaPersona1Boton3}"
                                                    id="campoIdFichaPersona1Boton3"
                                                    onClick="#{Persona1.asistente.scriptCampoIdFichaPersona1Boton2}"
                                                    rendered="#{Persona1.asistente.campoIdFichaPersona1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn 
                                                    binding="#{Persona1.tableColumnIdFichaPersona2}"
                                                    headerText="nombre ficha"
                                                    id="tableColumnIdFichaPersona2" rendered="false"
                                                    sort="nombre_ficha_persona_1x15y4"
                                                    styleClass="pdq-estilo-id-2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIdFichaPersona2"
                                                    text="#{currentRow.value['nombre_ficha_persona_1x15y4']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelIdFichaPersona2}"
                                                    id="labelIdFichaPersona2"
                                                    text=""/>
                                                <webuijsf:imageHyperlink
                                                    binding="#{Persona1.campoIdFichaPersona1Hiper1}"
                                                    id="campoIdFichaPersona1Hiper1"
                                                    text="#{currentRow.value['nombre_ficha_persona_1x15y4']}"
                                                    onClick="#{Persona1.asistente.scriptCampoIdFichaPersona1Boton2}"/>
                                                <webuijsf:button
                                                    id="campoIdFichaPersona1Boton2"
                                                    rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaFichaPersona1}"
                                                    headerText="fecha ficha"
                                                    id="tableColumnFechaFichaPersona1" rendered="false"
                                                    sort="fecha_ficha_persona">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaFichaPersona1"
                                                    text="#{currentRow.value['fecha_ficha_persona']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaFichaPersona1}"
                                                    id="labelFechaFichaPersona1"
                                                    for="campoFechaFichaPersona1"/>
                                                <webuijsf:textField id="campoFechaFichaPersona1"
                                                    binding="#{Persona1.campoFechaFichaPersona1}"
                                                    converter="#{Persona1.converterFechaFichaPersona1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_ficha_persona']}"
                                                    toolTip="BundleParametros.fecha_ficha_persona.persona"/>
                                                <webuijsf:staticText id="campoFechaFichaPersona1Texto1"
                                                    binding="#{Persona1.campoFechaFichaPersona1Texto1}"
                                                    converter="#{Persona1.converterFechaFichaPersona1}"
                                                    text="#{currentRow.value['fecha_ficha_persona']}"/>
                                                <webuijsf:message id="messageFechaFichaPersona1"
                                                    for="campoFechaFichaPersona1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnIndiceCalidadVida1}"
                                                    headerText="indice calidad vida"
                                                    id="tableColumnIndiceCalidadVida1" rendered="false"
                                                    sort="indice_calidad_vida">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextIndiceCalidadVida1"
                                                    text="#{currentRow.value['indice_calidad_vida']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelIndiceCalidadVida1}"
                                                    id="labelIndiceCalidadVida1"
                                                    for="campoIndiceCalidadVida1"/>
                                                <webuijsf:textField id="campoIndiceCalidadVida1"
                                                    binding="#{Persona1.campoIndiceCalidadVida1}"
                                                    converter="#{Persona1.converterIndiceCalidadVida1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['indice_calidad_vida']}"
                                                    toolTip="BundleParametros.indice_calidad_vida.persona"
                                                    validatorExpression="#{Persona1.validatorIndiceCalidadVida1.validate}"/>
                                                <webuijsf:staticText id="campoIndiceCalidadVida1Texto1"
                                                    binding="#{Persona1.campoIndiceCalidadVida1Texto1}"
                                                    converter="#{Persona1.converterIndiceCalidadVida1}"
                                                    text="#{currentRow.value['indice_calidad_vida']}"/>
                                                <webuijsf:message id="messageIndiceCalidadVida1"
                                                    for="campoIndiceCalidadVida1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaUltimoCobroPension1}"
                                                    headerText="fecha ultimo cobro pensi&#243;n"
                                                    id="tableColumnFechaUltimoCobroPension1" rendered="false"
                                                    sort="fecha_ultimo_cobro_pension">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaUltimoCobroPension1"
                                                    text="#{currentRow.value['fecha_ultimo_cobro_pension']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaUltimoCobroPension1}"
                                                    id="labelFechaUltimoCobroPension1"
                                                    for="campoFechaUltimoCobroPension1"/>
                                                <webuijsf:textField id="campoFechaUltimoCobroPension1"
                                                    binding="#{Persona1.campoFechaUltimoCobroPension1}"
                                                    converter="#{Persona1.converterFechaUltimoCobroPension1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_ultimo_cobro_pension']}"
                                                    toolTip="BundleParametros.fecha_ultimo_cobro_pension.persona"/>
                                                <webuijsf:staticText id="campoFechaUltimoCobroPension1Texto1"
                                                    binding="#{Persona1.campoFechaUltimoCobroPension1Texto1}"
                                                    converter="#{Persona1.converterFechaUltimoCobroPension1}"
                                                    text="#{currentRow.value['fecha_ultimo_cobro_pension']}"/>
                                                <webuijsf:message id="messageFechaUltimoCobroPension1"
                                                    for="campoFechaUltimoCobroPension1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNotasAnulFecUltCobPen1}"
                                                    headerText="notas anulaci&#243;n fecha &#250;ltimo cobro pensi&#243;n"
                                                    id="tableColumnNotasAnulFecUltCobPen1" rendered="false"
                                                    sort="notas_anul_fec_ult_cob_pen">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNotasAnulFecUltCobPen1"
                                                    text="#{currentRow.value['notas_anul_fec_ult_cob_pen']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNotasAnulFecUltCobPen1}"
                                                    id="labelNotasAnulFecUltCobPen1"
                                                    for="campoNotasAnulFecUltCobPen1"/>
                                                <webuijsf:textArea id="campoNotasAnulFecUltCobPen1"
                                                    binding="#{Persona1.campoNotasAnulFecUltCobPen1}"
                                                    columns="50" rows="3"
                                                    readOnly="true"
                                                    text="#{currentRow.value['notas_anul_fec_ult_cob_pen']}"
                                                    toolTip="BundleParametros.notas_anul_fec_ult_cob_pen.persona"
                                                    validatorExpression="#{Persona1.validatorNotasAnulFecUltCobPen1.validate}"/>
                                                <webuijsf:staticText id="campoNotasAnulFecUltCobPen1Texto1"
                                                    binding="#{Persona1.campoNotasAnulFecUltCobPen1Texto1}"
                                                    text="#{currentRow.value['notas_anul_fec_ult_cob_pen']}"/>
                                                <webuijsf:message id="messageNotasAnulFecUltCobPen1"
                                                    for="campoNotasAnulFecUltCobPen1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnNumeroTipoActJupe1}"
                                                    headerText="tipo actualizaci&#243;n jupe"
                                                    id="tableColumnNumeroTipoActJupe1" rendered="false"
                                                    sort="codigo_tipo_act_jupe_1x16y2">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextNumeroTipoActJupe1"
                                                    text="#{currentRow.value['codigo_tipo_act_jupe_1x16y2']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelNumeroTipoActJupe1}"
                                                    id="labelNumeroTipoActJupe1"
                                                    for="listaNumeroTipoActJupe1"/>
                                                <webuijsf:dropDown id="listaNumeroTipoActJupe1"
                                                    binding="#{Persona1.listaNumeroTipoActJupe1}"
                                                    converter="#{Persona1.converterNumeroTipoActJupe1}"
                                                    disabled="true"
                                                    items="#{Persona1.asistente.opcionesListaNumeroTipoActJupe1}"
                                                    selected="#{currentRow.value['numero_tipo_act_jupe']}"
                                                    toolTip="BundleParametros.numero_tipo_act_jupe.persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoActJupe1Texto1"
                                                    binding="#{Persona1.listaNumeroTipoActJupe1Texto1}"
                                                    text="#{currentRow.value['codigo_tipo_act_jupe_1x16y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoActJupe1"
                                                    for="listaNumeroTipoActJupe1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn
                                                    binding="#{Persona1.tableColumnFechaHoraUltActJupe1}"
                                                    headerText="fecha hora &#250;ltima actualizaci&#243;n jupe"
                                                    id="tableColumnFechaHoraUltActJupe1" rendered="false"
                                                    sort="fecha_hora_ult_act_jupe">
                                                <webuijsf:staticText
                                                    id="hiddenStaticTextFechaHoraUltActJupe1"
                                                    text="#{currentRow.value['fecha_hora_ult_act_jupe']}"
                                                    rendered="#{Persona1.gestor.designing}"/>
                                                <webuijsf:label
                                                    binding="#{Persona1.labelFechaHoraUltActJupe1}"
                                                    id="labelFechaHoraUltActJupe1"
                                                    for="campoFechaHoraUltActJupe1"/>
                                                <webuijsf:textField id="campoFechaHoraUltActJupe1"
                                                    binding="#{Persona1.campoFechaHoraUltActJupe1}"
                                                    converter="#{Persona1.converterFechaHoraUltActJupe1}"
                                                    readOnly="true"
                                                    text="#{currentRow.value['fecha_hora_ult_act_jupe']}"
                                                    toolTip="BundleParametros.fecha_hora_ult_act_jupe.persona"/>
                                                <webuijsf:staticText id="campoFechaHoraUltActJupe1Texto1"
                                                    binding="#{Persona1.campoFechaHoraUltActJupe1Texto1}"
                                                    converter="#{Persona1.converterFechaHoraUltActJupe1}"
                                                    text="#{currentRow.value['fecha_hora_ult_act_jupe']}"/>
                                                <webuijsf:message id="messageFechaHoraUltActJupe1"
                                                    for="campoFechaHoraUltActJupe1"/>
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
                                                        binding="#{Persona1.etiquetaTextoFilasPorPagina1}" 
                                                        for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" 
                                                        text="#{Persona1.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid 
                                                    columns="3" 
                                                    id="gridPanel107">
                                                    <webuijsf:textField 
                                                        binding="#{Persona1.textoFilasPorPagina1}" 
                                                        columns="2"
                                                        converter="#{Persona1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{Persona1.gestor.paginacionInhabilitada}" 
                                                        id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{Persona1.gestor.filasPorPagina}" 
                                                        validatorExpression="#{Persona1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button 
                                                        actionExpression="#{Persona1.botonRepaginar1_action}"
                                                        binding="#{Persona1.botonRepaginar1}" 
                                                        id="botonRepaginar1"
                                                        imageURL="#{Persona1.gestor.urlImagenRepaginar}" 
                                                        onClick="#{Persona1.gestor.scriptRepaginar}"
                                                        text="#{Persona1.gestor.i18n.textoBotonRepaginar}"
                                                        toolTip="#{Persona1.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message 
                                                        for="textoFilasPorPagina1" 
                                                        id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel108">
                                                <webuijsf:button
                                                    actionExpression="#{Persona1.botonAgregar1_action}"
                                                    binding="#{Persona1.botonAgregar1}"
                                                    disabled="#{Persona1.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Persona1.gestor.scriptAgregar}"
                                                    rendered="#{Persona1.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona1.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Persona1.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Persona1.listaFuncionEdicion1}"
                                                    converter="#{Persona1.converterListaFuncionEdicion1}"
                                                    disabled="#{Persona1.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Persona1.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Persona1.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Persona1.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Persona1.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona1.botonEditar1_action}"
                                                    binding="#{Persona1.botonEditar1}"
                                                    disabled="#{Persona1.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Persona1.gestor.scriptEditar}"
                                                    rendered="#{Persona1.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Persona1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona1.botonEliminar1_action}"
                                                    binding="#{Persona1.botonEliminar1}"
                                                    disabled="#{Persona1.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Persona1.gestor.scriptEliminar}"
                                                    rendered="#{Persona1.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona1.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Persona1.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona1.botonAplicar1_action}"
                                                    binding="#{Persona1.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Persona1.gestor.scriptAplicar}"
                                                    rendered="#{Persona1.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona1.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Persona1.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona1.botonDeshacer1_action}"
                                                    binding="#{Persona1.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Persona1.gestor.scriptDeshacer}"
                                                    rendered="#{Persona1.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona1.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Persona1.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona1.botonConfirmar1_action}"
                                                    binding="#{Persona1.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Persona1.gestor.scriptConfirmar}"
                                                    rendered="#{Persona1.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona1.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Persona1.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona1.botonDescartar1_action}"
                                                    binding="#{Persona1.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Persona1.gestor.scriptDescartar}"
                                                    rendered="#{Persona1.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona1.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Persona1.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Persona1.listaFuncionAccion1}"
                                                    converter="#{Persona1.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Persona1.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Persona1.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Persona1.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Persona1.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona1.botonProcesar1_action}"
                                                    binding="#{Persona1.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Persona1.gestor.scriptProcesar}"
                                                    rendered="#{Persona1.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona1.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Persona1.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona1.botonRefrescar1_action}"
                                                    binding="#{Persona1.botonRefrescar1}"
                                                    disabled="#{Persona1.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Persona1.gestor.scriptRefrescar}"
                                                    rendered="#{Persona1.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona1.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Persona1.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona1.botonReconsultar1_action}"
                                                    binding="#{Persona1.botonReconsultar1}"
                                                    disabled="#{Persona1.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Persona1.gestor.scriptReconsultar}"
                                                    rendered="#{Persona1.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona1.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Persona1.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Persona1.botonRetornar1_action}"
                                                    binding="#{Persona1.botonRetornar1}"
                                                    disabled="#{Persona1.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Persona1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Persona1.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Persona1.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Persona1.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel109"
                                                rendered="#{Persona1.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Persona1.imageHyperlink1_action}"
                                                    binding="#{Persona1.imageHyperlink1}"
                                                    disabled="#{Persona1.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Persona1.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Persona1.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Persona1.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Persona1_imageHyperlink1_toolTip}"/>
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
