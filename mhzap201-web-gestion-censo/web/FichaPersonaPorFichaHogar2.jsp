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
                    focus="#{FichaPersonaPorFichaHogar2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{FichaPersonaPorFichaHogar2.gestor.preserveFocus}"
                    preserveScroll="#{FichaPersonaPorFichaHogar2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{FichaPersonaPorFichaHogar2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdFichaPersona1 campoCodigoFichaPersona1 campoNombreFichaPersona1 listaEsRespondente1 campoNumeroOrdenIdentificacion1 campoPrimerNombre1 campoSegundoNombre1 campoPrimerApellido1 campoSegundoApellido1 campoApellidoCasada1 campoApodo1 campoEdad1 listaNumeroSexoPersona1 listaNumeroEstadoCivil1 listaNumeroTipoPersonaHogar1 listaNumeroSionoMiembroHogar1 campoNumeroOrdenIdenConyuge1 campoNumeroOrdenIdenPadre1 campoNumeroOrdenIdenMadre1 campoNumeroCedula1 campoLetraCedula1 listaNumeroTipoExcepcionCed1 campoFechaNacimiento1 campoIdDepartamentoNacimiento1 campoIdDistritoNacimiento1 listaNumeroTipoAreaLugarNac1 listaNumeroIdiomaHogar1 campoOtroIdiomaHogar1 listaNumeroSionoAsistenciaEsc1 listaNumeroMotivoInaEsc1 campoOtroMotivoInaEsc1 listaNumeroSionoMatriculacionEsc1 campoUltimoCursoAprobado1 listaNumeroNivelEduUltCurAprob1 listaNumeroSionoCursoNoFormal1 listaNumeroTipoSeguroMedico1 listaNumeroEstadoSalud1 listaNumeroClaseEnfAcc1 campoOtraClaseEnfAcc1 listaNumeroClaseEnfCronica1 campoOtraClaseEnfCronica1 listaNumeroSionoAtencionMedica1 listaNumeroMotivoNoAtencion1 campoOtroMotivoNoAtencion1 listaNumeroSionoCarnetVacunacion1 listaNumeroClaseImpedimento1 campoOtraClaseImpedimento1 listaNumeroCausaImpedimento1 campoOtraCausaImpedimento1 listaNumeroSionoDifParaCaminar1 listaNumeroSionoDifParaVestirse1 listaNumeroSionoDifParaBanarse1 listaNumeroSionoDifParaComer1 listaNumeroSionoDifParaLaCama1 listaNumeroSionoDifParaElBano1 listaNumeroSionoTrabajo1 listaNumeroMotivoNoTrabajo1 campoOtroMotivoNoTrabajo1 campoDescripcionOcupacionPrin1 campoDescripcionDedicacionPrin1 listaNumeroTipoRelacionLab1 campoMontoIngresoOcupacionPrin1 campoMontoIngresoOcupacionSecun1 campoMontoIngresoOtrasOcup1 campoMontoIngresoAlquileres1 campoMontoIngresoIntereses1 campoMontoIngresoAyudaFamPais1 campoMontoIngresoAyudaFamExter1 campoMontoIngresoJubilacion1 campoMontoIngresoPensiones1 campoMontoIngresoTekopora1 campoMontoIngresoProgramas1 campoMontoIngresoAdicional1 campoTotalIngresoMensual1 campoIdPotencialBen1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{FichaPersonaPorFichaHogar2.breadcrumbs1}" 
                                        id="breadcrumbs1" 
                                        styleClass="pdq-breadcrumbs-1"/>
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
                                                    rendered="#{FichaPersonaPorFichaHogar2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{FichaPersonaPorFichaHogar2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{FichaPersonaPorFichaHogar2.gestor.mensajeDisponible}"
                                                    text="#{FichaPersonaPorFichaHogar2.gestor.mensaje}"
                                                    url="#{FichaPersonaPorFichaHogar2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{FichaPersonaPorFichaHogar2.gestor.filaDisponible}"
                                            styleClass="pdq-grid-detalle-1">
                                        <h:panelGrid
                                            id="gridPanel105"
                                            styleClass="pdq-grid-detalle-cab">
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel106">
                                            <h:panelGrid
                                                id="gridPanel107"
                                                styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid 
                                                    columns="7"
                                                    id="gridPanel108">
                                                    <webuijsf:button
                                                        actionExpression="#{FichaPersonaPorFichaHogar2.botonIrAlPrimero1_action}"
                                                        binding="#{FichaPersonaPorFichaHogar2.botonIrAlPrimero1}"
                                                        disabled="#{FichaPersonaPorFichaHogar2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{FichaPersonaPorFichaHogar2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptIrAlPrimero}"
                                                        text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FichaPersonaPorFichaHogar2.botonIrAlAnterior1_action}"
                                                        binding="#{FichaPersonaPorFichaHogar2.botonIrAlAnterior1}"
                                                        disabled="#{FichaPersonaPorFichaHogar2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{FichaPersonaPorFichaHogar2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptIrAlAnterior}"
                                                        text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FichaPersonaPorFichaHogar2.botonIrAlSiguiente1_action}"
                                                        binding="#{FichaPersonaPorFichaHogar2.botonIrAlSiguiente1}"
                                                        disabled="#{FichaPersonaPorFichaHogar2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{FichaPersonaPorFichaHogar2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptIrAlSiguiente}"
                                                        text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FichaPersonaPorFichaHogar2.botonIrAlUltimo1_action}"
                                                        binding="#{FichaPersonaPorFichaHogar2.botonIrAlUltimo1}"
                                                        disabled="#{FichaPersonaPorFichaHogar2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{FichaPersonaPorFichaHogar2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptIrAlUltimo}"
                                                        text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FichaPersonaPorFichaHogar2.botonProcesarFila1_action}"
                                                        binding="#{FichaPersonaPorFichaHogar2.botonProcesarFila1}"
                                                        disabled="#{FichaPersonaPorFichaHogar2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{FichaPersonaPorFichaHogar2.gestor.urlImagenProcesar}"
                                                        onClick="#{FichaPersonaPorFichaHogar2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{FichaPersonaPorFichaHogar2.asistente.comandoDisponible}"
                                                        text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel109"
                                                styleClass="pdq-grid-detalle-mensajes">
                                                <h:panelGrid
                                                    id="gridPanel110"
                                                    styleClass="pdq-grid-detalle-mensajes-2">
                                                    <webuijsf:staticText
                                                        id="textoTituloConsulta1"
                                                        styleClass="pdq-text-titulo-1"
                                                        text="#{FichaPersonaPorFichaHogar2.gestor.tituloConsulta}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel111">
                                            <h:panelGrid
                                                id="gridPanel112"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{FichaPersonaPorFichaHogar2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{FichaPersonaPorFichaHogar2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{FichaPersonaPorFichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelIdFichaHogar1}"
                                                    id="labelIdFichaHogar1"
                                                    text="ficha hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{FichaPersonaPorFichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{FichaPersonaPorFichaHogar2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{FichaPersonaPorFichaHogar2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaPersona1" rendered="false"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelIdFichaPersona1}"
                                                    id="labelIdFichaPersona1"
                                                    for="campoIdFichaPersona1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaPersona2" rendered="false"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFichaPersona1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdFichaPersona1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterIdFichaPersona1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['id_ficha_persona']}"
                                                    toolTip="BundleParametros.id_ficha_persona.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorIdFichaPersona1.validate}"/>
                                                <webuijsf:staticText id="campoIdFichaPersona1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdFichaPersona1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['id_ficha_persona']}"/>
                                                <webuijsf:message id="messageIdFichaPersona1"
                                                    for="campoIdFichaPersona1"/>
                                                <webuijsf:helpInline id="helpInlineIdFichaPersona1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineIdFichaPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_ficha_persona.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoFichaPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelCodigoFichaPersona1}"
                                                    id="labelCodigoFichaPersona1"
                                                    for="campoCodigoFichaPersona1"
                                                    text="c&#243;digo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoFichaPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoFichaPersona1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoCodigoFichaPersona1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_ficha_persona']}"
                                                    toolTip="BundleParametros.codigo_ficha_persona.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorCodigoFichaPersona1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoFichaPersona1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoCodigoFichaPersona1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_ficha_persona']}"/>
                                                <webuijsf:message id="messageCodigoFichaPersona1"
                                                    for="campoCodigoFichaPersona1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoFichaPersona1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineCodigoFichaPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_ficha_persona.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreFichaPersona1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNombreFichaPersona1}"
                                                    id="labelNombreFichaPersona1"
                                                    for="campoNombreFichaPersona1"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreFichaPersona2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreFichaPersona1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNombreFichaPersona1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['nombre_ficha_persona']}"
                                                    toolTip="BundleParametros.nombre_ficha_persona.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorNombreFichaPersona1.validate}"/>
                                                <webuijsf:staticText id="campoNombreFichaPersona1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNombreFichaPersona1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['nombre_ficha_persona']}"/>
                                                <webuijsf:message id="messageNombreFichaPersona1"
                                                    for="campoNombreFichaPersona1"/>
                                                <webuijsf:helpInline id="helpInlineNombreFichaPersona1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNombreFichaPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_ficha_persona.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsRespondente1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridEsRespondenteRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelEsRespondente1}"
                                                    id="labelEsRespondente1"
                                                    for="listaEsRespondente1"
                                                    text="respondente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsRespondente2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridEsRespondenteRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsRespondente1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaEsRespondente1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterEsRespondente1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaEsRespondente1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['es_respondente']}"
                                                    toolTip="BundleParametros.es_respondente.ficha_persona"/>
                                                <webuijsf:staticText id="listaEsRespondente1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaEsRespondente1Texto1}"/>
                                                <webuijsf:message id="messageEsRespondente1"
                                                    for="listaEsRespondente1"/>
                                                <webuijsf:helpInline id="helpInlineEsRespondente1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineEsRespondente1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_respondente.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroOrdenIdentificacion1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroOrdenIdentificacionRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroOrdenIdentificacion1}"
                                                    id="labelNumeroOrdenIdentificacion1"
                                                    for="campoNumeroOrdenIdentificacion1"
                                                    text="n&#250;mero orden identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroOrdenIdentificacion2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroOrdenIdentificacionRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroOrdenIdentificacion1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroOrdenIdentificacion1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroOrdenIdentificacion1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_orden_identificacion']}"
                                                    toolTip="BundleParametros.numero_orden_identificacion.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorNumeroOrdenIdentificacion1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdentificacion1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroOrdenIdentificacion1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_orden_identificacion']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdentificacion1"
                                                    for="campoNumeroOrdenIdentificacion1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroOrdenIdentificacion1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroOrdenIdentificacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_orden_identificacion.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPrimerNombre1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridPrimerNombreRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelPrimerNombre1}"
                                                    id="labelPrimerNombre1"
                                                    for="campoPrimerNombre1"
                                                    text="primer nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerNombre2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridPrimerNombreRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoPrimerNombre1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoPrimerNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoPrimerNombre1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerNombre1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlinePrimerNombre1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_nombre.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoNombre1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridSegundoNombreRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelSegundoNombre1}"
                                                    id="labelSegundoNombre1"
                                                    for="campoSegundoNombre1"
                                                    text="segundo nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoNombre2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridSegundoNombreRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoSegundoNombre1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoSegundoNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoSegundoNombre1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoNombre1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineSegundoNombre1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_nombre.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPrimerApellido1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridPrimerApellidoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelPrimerApellido1}"
                                                    id="labelPrimerApellido1"
                                                    for="campoPrimerApellido1"
                                                    text="primer apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerApellido2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridPrimerApellidoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoPrimerApellido1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoPrimerApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoPrimerApellido1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerApellido1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlinePrimerApellido1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_apellido.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoApellido1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridSegundoApellidoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelSegundoApellido1}"
                                                    id="labelSegundoApellido1"
                                                    for="campoSegundoApellido1"
                                                    text="segundo apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoApellido2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridSegundoApellidoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoSegundoApellido1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoSegundoApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoSegundoApellido1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoApellido1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineSegundoApellido1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_apellido.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridApellidoCasada1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridApellidoCasadaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelApellidoCasada1}"
                                                    id="labelApellidoCasada1"
                                                    for="campoApellidoCasada1"
                                                    text="apellido casada"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridApellidoCasada2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridApellidoCasadaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoApellidoCasada1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoApellidoCasada1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['apellido_casada']}"
                                                    toolTip="BundleParametros.apellido_casada.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorApellidoCasada1.validate}"/>
                                                <webuijsf:staticText id="campoApellidoCasada1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoApellidoCasada1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['apellido_casada']}"/>
                                                <webuijsf:message id="messageApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                <webuijsf:helpInline id="helpInlineApellidoCasada1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineApellidoCasada1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.apellido_casada.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridApodo1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridApodoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelApodo1}"
                                                    id="labelApodo1"
                                                    for="campoApodo1"
                                                    text="apodo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridApodo2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridApodoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoApodo1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoApodo1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['apodo']}"
                                                    toolTip="BundleParametros.apodo.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorApodo1.validate}"/>
                                                <webuijsf:staticText id="campoApodo1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoApodo1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['apodo']}"/>
                                                <webuijsf:message id="messageApodo1"
                                                    for="campoApodo1"/>
                                                <webuijsf:helpInline id="helpInlineApodo1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineApodo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.apodo.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEdad1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridEdadRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelEdad1}"
                                                    id="labelEdad1"
                                                    for="campoEdad1"
                                                    text="edad"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEdad2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridEdadRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoEdad1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoEdad1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterEdad1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['edad']}"
                                                    toolTip="BundleParametros.edad.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorEdad1.validate}"/>
                                                <webuijsf:staticText id="campoEdad1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoEdad1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['edad']}"/>
                                                <webuijsf:message id="messageEdad1"
                                                    for="campoEdad1"/>
                                                <webuijsf:helpInline id="helpInlineEdad1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineEdad1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.edad.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSexoPersona1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSexoPersonaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSexoPersona1}"
                                                    id="labelNumeroSexoPersona1"
                                                    for="listaNumeroSexoPersona1"
                                                    text="sexo persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSexoPersona2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSexoPersonaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSexoPersona1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSexoPersona1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSexoPersona1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSexoPersona1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_sexo_persona']}"
                                                    toolTip="BundleParametros.numero_sexo_persona.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSexoPersona1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSexoPersona1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_sexo_persona_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroSexoPersona1"
                                                    for="listaNumeroSexoPersona1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSexoPersona1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSexoPersona1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_sexo_persona.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroEstadoCivil1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroEstadoCivilRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroEstadoCivil1}"
                                                    id="labelNumeroEstadoCivil1"
                                                    for="listaNumeroEstadoCivil1"
                                                    text="estado civil"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroEstadoCivil2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroEstadoCivilRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroEstadoCivil1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroEstadoCivil1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroEstadoCivil1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroEstadoCivil1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_estado_civil']}"
                                                    toolTip="BundleParametros.numero_estado_civil.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroEstadoCivil1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroEstadoCivil1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_estado_civil_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroEstadoCivil1"
                                                    for="listaNumeroEstadoCivil1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroEstadoCivil1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroEstadoCivil1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_estado_civil.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoPersonaHogar1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroTipoPersonaHogarRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroTipoPersonaHogar1}"
                                                    id="labelNumeroTipoPersonaHogar1"
                                                    for="listaNumeroTipoPersonaHogar1"
                                                    text="tipo persona hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoPersonaHogar2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroTipoPersonaHogarRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoPersonaHogar1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoPersonaHogar1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroTipoPersonaHogar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroTipoPersonaHogar1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_tipo_persona_hogar']}"
                                                    toolTip="BundleParametros.numero_tipo_persona_hogar.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoPersonaHogar1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoPersonaHogar1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_tipo_persona_hoga_1x4y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoPersonaHogar1"
                                                    for="listaNumeroTipoPersonaHogar1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoPersonaHogar1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroTipoPersonaHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_persona_hogar.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoMiembroHogar1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoMiembroHogarRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoMiembroHogar1}"
                                                    id="labelNumeroSionoMiembroHogar1"
                                                    for="listaNumeroSionoMiembroHogar1"
                                                    text="miembro hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoMiembroHogar2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoMiembroHogarRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoMiembroHogar1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoMiembroHogar1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoMiembroHogar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoMiembroHogar1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_miembro_hogar']}"
                                                    toolTip="BundleParametros.numero_siono_miembro_hogar.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoMiembroHogar1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoMiembroHogar1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x5y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoMiembroHogar1"
                                                    for="listaNumeroSionoMiembroHogar1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoMiembroHogar1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoMiembroHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_miembro_hogar.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroOrdenIdenConyuge1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroOrdenIdenConyugeRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroOrdenIdenConyuge1}"
                                                    id="labelNumeroOrdenIdenConyuge1"
                                                    for="campoNumeroOrdenIdenConyuge1"
                                                    text="n&#250;mero orden identificaci&#243;n conyuge"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroOrdenIdenConyuge2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroOrdenIdenConyugeRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroOrdenIdenConyuge1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroOrdenIdenConyuge1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroOrdenIdenConyuge1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_orden_iden_conyuge']}"
                                                    toolTip="BundleParametros.numero_orden_iden_conyuge.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorNumeroOrdenIdenConyuge1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenConyuge1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroOrdenIdenConyuge1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_orden_iden_conyuge']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenConyuge1"
                                                    for="campoNumeroOrdenIdenConyuge1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroOrdenIdenConyuge1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroOrdenIdenConyuge1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_orden_iden_conyuge.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroOrdenIdenPadre1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroOrdenIdenPadreRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroOrdenIdenPadre1}"
                                                    id="labelNumeroOrdenIdenPadre1"
                                                    for="campoNumeroOrdenIdenPadre1"
                                                    text="n&#250;mero orden identificaci&#243;n padre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroOrdenIdenPadre2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroOrdenIdenPadreRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroOrdenIdenPadre1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroOrdenIdenPadre1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroOrdenIdenPadre1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_orden_iden_padre']}"
                                                    toolTip="BundleParametros.numero_orden_iden_padre.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorNumeroOrdenIdenPadre1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenPadre1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroOrdenIdenPadre1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_orden_iden_padre']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenPadre1"
                                                    for="campoNumeroOrdenIdenPadre1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroOrdenIdenPadre1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroOrdenIdenPadre1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_orden_iden_padre.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroOrdenIdenMadre1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroOrdenIdenMadreRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroOrdenIdenMadre1}"
                                                    id="labelNumeroOrdenIdenMadre1"
                                                    for="campoNumeroOrdenIdenMadre1"
                                                    text="n&#250;mero orden identificaci&#243;n madre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroOrdenIdenMadre2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroOrdenIdenMadreRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroOrdenIdenMadre1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroOrdenIdenMadre1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroOrdenIdenMadre1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_orden_iden_madre']}"
                                                    toolTip="BundleParametros.numero_orden_iden_madre.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorNumeroOrdenIdenMadre1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenMadre1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroOrdenIdenMadre1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_orden_iden_madre']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenMadre1"
                                                    for="campoNumeroOrdenIdenMadre1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroOrdenIdenMadre1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroOrdenIdenMadre1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_orden_iden_madre.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCedula1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroCedulaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroCedula1}"
                                                    id="labelNumeroCedula1"
                                                    for="campoNumeroCedula1"
                                                    text="n&#250;mero c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCedula2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroCedulaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroCedula1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroCedula1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroCedula1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_cedula']}"
                                                    toolTip="BundleParametros.numero_cedula.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorNumeroCedula1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedula1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroCedula1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_cedula']}"/>
                                                <webuijsf:message id="messageNumeroCedula1"
                                                    for="campoNumeroCedula1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCedula1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_cedula.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLetraCedula1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridLetraCedulaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelLetraCedula1}"
                                                    id="labelLetraCedula1"
                                                    for="campoLetraCedula1"
                                                    text="letra c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLetraCedula2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridLetraCedulaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoLetraCedula1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoLetraCedula1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['letra_cedula']}"
                                                    toolTip="BundleParametros.letra_cedula.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorLetraCedula1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedula1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoLetraCedula1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['letra_cedula']}"/>
                                                <webuijsf:message id="messageLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                <webuijsf:helpInline id="helpInlineLetraCedula1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineLetraCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.letra_cedula.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoExcepcionCed1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroTipoExcepcionCedRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroTipoExcepcionCed1}"
                                                    id="labelNumeroTipoExcepcionCed1"
                                                    for="listaNumeroTipoExcepcionCed1"
                                                    text="tipo excepci&#243;n c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoExcepcionCed2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroTipoExcepcionCedRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoExcepcionCed1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoExcepcionCed1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroTipoExcepcionCed1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroTipoExcepcionCed1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_tipo_excepcion_ced']}"
                                                    toolTip="BundleParametros.numero_tipo_excepcion_ced.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoExcepcionCed1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoExcepcionCed1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_tipo_excepcion_ce_1x6y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoExcepcionCed1"
                                                    for="listaNumeroTipoExcepcionCed1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoExcepcionCed1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroTipoExcepcionCed1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_excepcion_ced.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaNacimiento1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridFechaNacimientoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelFechaNacimiento1}"
                                                    id="labelFechaNacimiento1"
                                                    for="campoFechaNacimiento1"
                                                    text="fecha nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaNacimiento2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridFechaNacimientoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaNacimiento1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoFechaNacimiento1}"
                                                    maxDate="#{FichaPersonaPorFichaHogar2.gestor.defaultMaxDate}"
                                                    minDate="#{FichaPersonaPorFichaHogar2.gestor.defaultMinDate}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    selectedDate="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['fecha_nacimiento']}"
                                                    toolTip="BundleParametros.fecha_nacimiento.ficha_persona"/>
                                                <webuijsf:staticText id="campoFechaNacimiento1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoFechaNacimiento1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterFechaNacimiento1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['fecha_nacimiento']}"/>
                                                <webuijsf:message id="messageFechaNacimiento1"
                                                    for="campoFechaNacimiento1"/>
                                                <webuijsf:helpInline id="helpInlineFechaNacimiento1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineFechaNacimiento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_nacimiento.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamentoNacimiento1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridIdDepartamentoNacimientoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelIdDepartamentoNacimiento1}"
                                                    id="labelIdDepartamentoNacimiento1"
                                                    for="campoIdDepartamentoNacimiento1"
                                                    text="departamento nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamentoNacimiento2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridIdDepartamentoNacimientoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDepartamentoNacimiento1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDepartamentoNacimiento1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.asistente.textoCampoIdDepartamentoNacimiento1}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.asistente.toolTipCampoIdDepartamentoNacimiento1}"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.campoIdDepartamentoNacimiento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamentoNacimiento1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDepartamentoNacimiento1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_ubicacion_1x7y3']}"/>
                                                <webuijsf:button id="campoIdDepartamentoNacimiento1Boton1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDepartamentoNacimiento1Boton1}"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdDepartamentoNacimiento1Boton1}"/>
                                                <webuijsf:button id="campoIdDepartamentoNacimiento1Boton3"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDepartamentoNacimiento1Boton3}"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdDepartamentoNacimiento1Boton2}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.asistente.campoIdDepartamentoNacimiento1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDepartamentoNacimiento1"
                                                    for="campoIdDepartamentoNacimiento1"/>
                                                <webuijsf:helpInline id="helpInlineIdDepartamentoNacimiento1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineIdDepartamentoNacimiento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_departamento_nacimiento.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamentoNacimiento3"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.campoIdDepartamentoNacimiento1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelIdDepartamentoNacimiento2}"
                                                    id="labelIdDepartamentoNacimiento2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre departamento nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamentoNacimiento4"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.campoIdDepartamentoNacimiento1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDepartamentoNacimiento1Texto2}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['nombre_ubicacion_1x7y4']}"
                                                    id="campoIdDepartamentoNacimiento1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDepartamentoNacimiento1Boton2}"
                                                    id="campoIdDepartamentoNacimiento1Boton2"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdDepartamentoNacimiento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistritoNacimiento1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridIdDistritoNacimientoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelIdDistritoNacimiento1}"
                                                    id="labelIdDistritoNacimiento1"
                                                    for="campoIdDistritoNacimiento1"
                                                    text="distrito nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistritoNacimiento2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridIdDistritoNacimientoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDistritoNacimiento1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDistritoNacimiento1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.asistente.textoCampoIdDistritoNacimiento1}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.asistente.toolTipCampoIdDistritoNacimiento1}"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.campoIdDistritoNacimiento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistritoNacimiento1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDistritoNacimiento1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_ubicacion_1x8y3']}"/>
                                                <webuijsf:button id="campoIdDistritoNacimiento1Boton1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDistritoNacimiento1Boton1}"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdDistritoNacimiento1Boton1}"/>
                                                <webuijsf:button id="campoIdDistritoNacimiento1Boton3"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDistritoNacimiento1Boton3}"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdDistritoNacimiento1Boton2}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.asistente.campoIdDistritoNacimiento1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDistritoNacimiento1"
                                                    for="campoIdDistritoNacimiento1"/>
                                                <webuijsf:helpInline id="helpInlineIdDistritoNacimiento1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineIdDistritoNacimiento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_distrito_nacimiento.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistritoNacimiento3"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.campoIdDistritoNacimiento1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelIdDistritoNacimiento2}"
                                                    id="labelIdDistritoNacimiento2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre distrito nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistritoNacimiento4"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.campoIdDistritoNacimiento1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDistritoNacimiento1Texto2}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['nombre_ubicacion_1x8y4']}"
                                                    id="campoIdDistritoNacimiento1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDistritoNacimiento1Boton2}"
                                                    id="campoIdDistritoNacimiento1Boton2"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdDistritoNacimiento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoAreaLugarNac1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroTipoAreaLugarNacRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroTipoAreaLugarNac1}"
                                                    id="labelNumeroTipoAreaLugarNac1"
                                                    for="listaNumeroTipoAreaLugarNac1"
                                                    text="tipo area lugar nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoAreaLugarNac2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroTipoAreaLugarNacRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoAreaLugarNac1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoAreaLugarNac1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroTipoAreaLugarNac1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroTipoAreaLugarNac1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_tipo_area_lugar_nac']}"
                                                    toolTip="BundleParametros.numero_tipo_area_lugar_nac.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoAreaLugarNac1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoAreaLugarNac1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_tipo_area_1x9y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoAreaLugarNac1"
                                                    for="listaNumeroTipoAreaLugarNac1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoAreaLugarNac1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroTipoAreaLugarNac1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_area_lugar_nac.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroIdiomaHogar1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroIdiomaHogarRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroIdiomaHogar1}"
                                                    id="labelNumeroIdiomaHogar1"
                                                    for="listaNumeroIdiomaHogar1"
                                                    text="idioma hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroIdiomaHogar2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroIdiomaHogarRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroIdiomaHogar1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroIdiomaHogar1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroIdiomaHogar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroIdiomaHogar1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_idioma_hogar']}"
                                                    toolTip="BundleParametros.numero_idioma_hogar.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroIdiomaHogar1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroIdiomaHogar1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_idioma_hogar_1x10y2']}"/>
                                                <webuijsf:message id="messageNumeroIdiomaHogar1"
                                                    for="listaNumeroIdiomaHogar1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroIdiomaHogar1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroIdiomaHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_idioma_hogar.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtroIdiomaHogar1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridOtroIdiomaHogarRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelOtroIdiomaHogar1}"
                                                    id="labelOtroIdiomaHogar1"
                                                    for="campoOtroIdiomaHogar1"
                                                    text="otro idioma hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtroIdiomaHogar2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridOtroIdiomaHogarRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtroIdiomaHogar1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtroIdiomaHogar1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otro_idioma_hogar']}"
                                                    toolTip="BundleParametros.otro_idioma_hogar.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorOtroIdiomaHogar1.validate}"/>
                                                <webuijsf:staticText id="campoOtroIdiomaHogar1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtroIdiomaHogar1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otro_idioma_hogar']}"/>
                                                <webuijsf:message id="messageOtroIdiomaHogar1"
                                                    for="campoOtroIdiomaHogar1"/>
                                                <webuijsf:helpInline id="helpInlineOtroIdiomaHogar1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineOtroIdiomaHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otro_idioma_hogar.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoAsistenciaEsc1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoAsistenciaEscRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoAsistenciaEsc1}"
                                                    id="labelNumeroSionoAsistenciaEsc1"
                                                    for="listaNumeroSionoAsistenciaEsc1"
                                                    text="asistencia escolar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoAsistenciaEsc2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoAsistenciaEscRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoAsistenciaEsc1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoAsistenciaEsc1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoAsistenciaEsc1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoAsistenciaEsc1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_asistencia_esc']}"
                                                    toolTip="BundleParametros.numero_siono_asistencia_esc.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoAsistenciaEsc1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoAsistenciaEsc1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x11y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoAsistenciaEsc1"
                                                    for="listaNumeroSionoAsistenciaEsc1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoAsistenciaEsc1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoAsistenciaEsc1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_asistencia_esc.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroMotivoInaEsc1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroMotivoInaEscRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroMotivoInaEsc1}"
                                                    id="labelNumeroMotivoInaEsc1"
                                                    for="listaNumeroMotivoInaEsc1"
                                                    text="motivo inasistencia escolar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroMotivoInaEsc2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroMotivoInaEscRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroMotivoInaEsc1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroMotivoInaEsc1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroMotivoInaEsc1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroMotivoInaEsc1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_motivo_ina_esc']}"
                                                    toolTip="BundleParametros.numero_motivo_ina_esc.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroMotivoInaEsc1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroMotivoInaEsc1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_motivo_ina_esc_1x12y2']}"/>
                                                <webuijsf:message id="messageNumeroMotivoInaEsc1"
                                                    for="listaNumeroMotivoInaEsc1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroMotivoInaEsc1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroMotivoInaEsc1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_motivo_ina_esc.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtroMotivoInaEsc1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridOtroMotivoInaEscRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelOtroMotivoInaEsc1}"
                                                    id="labelOtroMotivoInaEsc1"
                                                    for="campoOtroMotivoInaEsc1"
                                                    text="otro motivo inasistencia escolar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtroMotivoInaEsc2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridOtroMotivoInaEscRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtroMotivoInaEsc1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtroMotivoInaEsc1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otro_motivo_ina_esc']}"
                                                    toolTip="BundleParametros.otro_motivo_ina_esc.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorOtroMotivoInaEsc1.validate}"/>
                                                <webuijsf:staticText id="campoOtroMotivoInaEsc1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtroMotivoInaEsc1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otro_motivo_ina_esc']}"/>
                                                <webuijsf:message id="messageOtroMotivoInaEsc1"
                                                    for="campoOtroMotivoInaEsc1"/>
                                                <webuijsf:helpInline id="helpInlineOtroMotivoInaEsc1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineOtroMotivoInaEsc1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otro_motivo_ina_esc.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoMatriculacionEsc1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoMatriculacionEscRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoMatriculacionEsc1}"
                                                    id="labelNumeroSionoMatriculacionEsc1"
                                                    for="listaNumeroSionoMatriculacionEsc1"
                                                    text="matriculaci&#243;n escolar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoMatriculacionEsc2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoMatriculacionEscRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoMatriculacionEsc1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoMatriculacionEsc1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoMatriculacionEsc1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoMatriculacionEsc1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_matriculacion_esc']}"
                                                    toolTip="BundleParametros.numero_siono_matriculacion_esc.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoMatriculacionEsc1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoMatriculacionEsc1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x13y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoMatriculacionEsc1"
                                                    for="listaNumeroSionoMatriculacionEsc1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoMatriculacionEsc1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoMatriculacionEsc1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_matriculacion_esc.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridUltimoCursoAprobado1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridUltimoCursoAprobadoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelUltimoCursoAprobado1}"
                                                    id="labelUltimoCursoAprobado1"
                                                    for="campoUltimoCursoAprobado1"
                                                    text="ultimo curso aprobado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridUltimoCursoAprobado2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridUltimoCursoAprobadoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoUltimoCursoAprobado1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoUltimoCursoAprobado1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterUltimoCursoAprobado1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['ultimo_curso_aprobado']}"
                                                    toolTip="BundleParametros.ultimo_curso_aprobado.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorUltimoCursoAprobado1.validate}"/>
                                                <webuijsf:staticText id="campoUltimoCursoAprobado1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoUltimoCursoAprobado1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['ultimo_curso_aprobado']}"/>
                                                <webuijsf:message id="messageUltimoCursoAprobado1"
                                                    for="campoUltimoCursoAprobado1"/>
                                                <webuijsf:helpInline id="helpInlineUltimoCursoAprobado1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineUltimoCursoAprobado1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.ultimo_curso_aprobado.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroNivelEduUltCurAprob1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroNivelEduUltCurAprobRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroNivelEduUltCurAprob1}"
                                                    id="labelNumeroNivelEduUltCurAprob1"
                                                    for="listaNumeroNivelEduUltCurAprob1"
                                                    text="nivel educativo &#250;ltima curso aprobado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroNivelEduUltCurAprob2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroNivelEduUltCurAprobRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroNivelEduUltCurAprob1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroNivelEduUltCurAprob1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroNivelEduUltCurAprob1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroNivelEduUltCurAprob1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_nivel_edu_ult_cur_aprob']}"
                                                    toolTip="BundleParametros.numero_nivel_edu_ult_cur_aprob.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroNivelEduUltCurAprob1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroNivelEduUltCurAprob1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_nivel_educativo_1x14y2']}"/>
                                                <webuijsf:message id="messageNumeroNivelEduUltCurAprob1"
                                                    for="listaNumeroNivelEduUltCurAprob1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroNivelEduUltCurAprob1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroNivelEduUltCurAprob1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_nivel_edu_ult_cur_aprob.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoCursoNoFormal1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoCursoNoFormalRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoCursoNoFormal1}"
                                                    id="labelNumeroSionoCursoNoFormal1"
                                                    for="listaNumeroSionoCursoNoFormal1"
                                                    text="curso no formal"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoCursoNoFormal2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoCursoNoFormalRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoCursoNoFormal1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoCursoNoFormal1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoCursoNoFormal1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoCursoNoFormal1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_curso_no_formal']}"
                                                    toolTip="BundleParametros.numero_siono_curso_no_formal.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoCursoNoFormal1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoCursoNoFormal1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x15y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoCursoNoFormal1"
                                                    for="listaNumeroSionoCursoNoFormal1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoCursoNoFormal1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoCursoNoFormal1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_curso_no_formal.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoSeguroMedico1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroTipoSeguroMedicoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroTipoSeguroMedico1}"
                                                    id="labelNumeroTipoSeguroMedico1"
                                                    for="listaNumeroTipoSeguroMedico1"
                                                    text="tipo seguro medico"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoSeguroMedico2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroTipoSeguroMedicoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoSeguroMedico1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoSeguroMedico1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroTipoSeguroMedico1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroTipoSeguroMedico1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_tipo_seguro_medico']}"
                                                    toolTip="BundleParametros.numero_tipo_seguro_medico.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoSeguroMedico1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoSeguroMedico1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_tipo_seguro_medi_1x16y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoSeguroMedico1"
                                                    for="listaNumeroTipoSeguroMedico1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoSeguroMedico1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroTipoSeguroMedico1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_seguro_medico.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroEstadoSalud1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroEstadoSaludRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroEstadoSalud1}"
                                                    id="labelNumeroEstadoSalud1"
                                                    for="listaNumeroEstadoSalud1"
                                                    text="estado salud"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroEstadoSalud2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroEstadoSaludRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroEstadoSalud1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroEstadoSalud1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroEstadoSalud1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroEstadoSalud1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_estado_salud']}"
                                                    toolTip="BundleParametros.numero_estado_salud.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroEstadoSalud1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroEstadoSalud1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_estado_salud_1x17y2']}"/>
                                                <webuijsf:message id="messageNumeroEstadoSalud1"
                                                    for="listaNumeroEstadoSalud1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroEstadoSalud1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroEstadoSalud1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_estado_salud.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroClaseEnfAcc1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroClaseEnfAccRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroClaseEnfAcc1}"
                                                    id="labelNumeroClaseEnfAcc1"
                                                    for="listaNumeroClaseEnfAcc1"
                                                    text="clase enfermedad accidente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroClaseEnfAcc2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroClaseEnfAccRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroClaseEnfAcc1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroClaseEnfAcc1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroClaseEnfAcc1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroClaseEnfAcc1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_clase_enf_acc']}"
                                                    toolTip="BundleParametros.numero_clase_enf_acc.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroClaseEnfAcc1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroClaseEnfAcc1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_clase_enf_acc_1x18y2']}"/>
                                                <webuijsf:message id="messageNumeroClaseEnfAcc1"
                                                    for="listaNumeroClaseEnfAcc1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroClaseEnfAcc1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroClaseEnfAcc1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_clase_enf_acc.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraClaseEnfAcc1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridOtraClaseEnfAccRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelOtraClaseEnfAcc1}"
                                                    id="labelOtraClaseEnfAcc1"
                                                    for="campoOtraClaseEnfAcc1"
                                                    text="otra clase enfermedad accidente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraClaseEnfAcc2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridOtraClaseEnfAccRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraClaseEnfAcc1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtraClaseEnfAcc1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otra_clase_enf_acc']}"
                                                    toolTip="BundleParametros.otra_clase_enf_acc.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorOtraClaseEnfAcc1.validate}"/>
                                                <webuijsf:staticText id="campoOtraClaseEnfAcc1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtraClaseEnfAcc1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otra_clase_enf_acc']}"/>
                                                <webuijsf:message id="messageOtraClaseEnfAcc1"
                                                    for="campoOtraClaseEnfAcc1"/>
                                                <webuijsf:helpInline id="helpInlineOtraClaseEnfAcc1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineOtraClaseEnfAcc1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_clase_enf_acc.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroClaseEnfCronica1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroClaseEnfCronicaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroClaseEnfCronica1}"
                                                    id="labelNumeroClaseEnfCronica1"
                                                    for="listaNumeroClaseEnfCronica1"
                                                    text="clase enfermedad cronica"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroClaseEnfCronica2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroClaseEnfCronicaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroClaseEnfCronica1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroClaseEnfCronica1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroClaseEnfCronica1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroClaseEnfCronica1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_clase_enf_cronica']}"
                                                    toolTip="BundleParametros.numero_clase_enf_cronica.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroClaseEnfCronica1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroClaseEnfCronica1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_clase_enf_cronic_1x19y2']}"/>
                                                <webuijsf:message id="messageNumeroClaseEnfCronica1"
                                                    for="listaNumeroClaseEnfCronica1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroClaseEnfCronica1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroClaseEnfCronica1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_clase_enf_cronica.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraClaseEnfCronica1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridOtraClaseEnfCronicaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelOtraClaseEnfCronica1}"
                                                    id="labelOtraClaseEnfCronica1"
                                                    for="campoOtraClaseEnfCronica1"
                                                    text="otra clase enfermedad cronica"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraClaseEnfCronica2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridOtraClaseEnfCronicaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraClaseEnfCronica1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtraClaseEnfCronica1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otra_clase_enf_cronica']}"
                                                    toolTip="BundleParametros.otra_clase_enf_cronica.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorOtraClaseEnfCronica1.validate}"/>
                                                <webuijsf:staticText id="campoOtraClaseEnfCronica1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtraClaseEnfCronica1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otra_clase_enf_cronica']}"/>
                                                <webuijsf:message id="messageOtraClaseEnfCronica1"
                                                    for="campoOtraClaseEnfCronica1"/>
                                                <webuijsf:helpInline id="helpInlineOtraClaseEnfCronica1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineOtraClaseEnfCronica1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_clase_enf_cronica.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoAtencionMedica1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoAtencionMedicaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoAtencionMedica1}"
                                                    id="labelNumeroSionoAtencionMedica1"
                                                    for="listaNumeroSionoAtencionMedica1"
                                                    text="atenci&#243;n medica"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoAtencionMedica2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoAtencionMedicaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoAtencionMedica1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoAtencionMedica1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoAtencionMedica1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoAtencionMedica1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_atencion_medica']}"
                                                    toolTip="BundleParametros.numero_siono_atencion_medica.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoAtencionMedica1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoAtencionMedica1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x20y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoAtencionMedica1"
                                                    for="listaNumeroSionoAtencionMedica1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoAtencionMedica1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoAtencionMedica1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_atencion_medica.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroMotivoNoAtencion1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroMotivoNoAtencionRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroMotivoNoAtencion1}"
                                                    id="labelNumeroMotivoNoAtencion1"
                                                    for="listaNumeroMotivoNoAtencion1"
                                                    text="motivo no atenci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroMotivoNoAtencion2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroMotivoNoAtencionRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroMotivoNoAtencion1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroMotivoNoAtencion1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroMotivoNoAtencion1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroMotivoNoAtencion1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_motivo_no_atencion']}"
                                                    toolTip="BundleParametros.numero_motivo_no_atencion.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroMotivoNoAtencion1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroMotivoNoAtencion1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_motivo_no_atenci_1x21y2']}"/>
                                                <webuijsf:message id="messageNumeroMotivoNoAtencion1"
                                                    for="listaNumeroMotivoNoAtencion1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroMotivoNoAtencion1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroMotivoNoAtencion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_motivo_no_atencion.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtroMotivoNoAtencion1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridOtroMotivoNoAtencionRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelOtroMotivoNoAtencion1}"
                                                    id="labelOtroMotivoNoAtencion1"
                                                    for="campoOtroMotivoNoAtencion1"
                                                    text="otro motivo no atenci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtroMotivoNoAtencion2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridOtroMotivoNoAtencionRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtroMotivoNoAtencion1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtroMotivoNoAtencion1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otro_motivo_no_atencion']}"
                                                    toolTip="BundleParametros.otro_motivo_no_atencion.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorOtroMotivoNoAtencion1.validate}"/>
                                                <webuijsf:staticText id="campoOtroMotivoNoAtencion1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtroMotivoNoAtencion1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otro_motivo_no_atencion']}"/>
                                                <webuijsf:message id="messageOtroMotivoNoAtencion1"
                                                    for="campoOtroMotivoNoAtencion1"/>
                                                <webuijsf:helpInline id="helpInlineOtroMotivoNoAtencion1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineOtroMotivoNoAtencion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otro_motivo_no_atencion.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoCarnetVacunacion1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoCarnetVacunacionRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoCarnetVacunacion1}"
                                                    id="labelNumeroSionoCarnetVacunacion1"
                                                    for="listaNumeroSionoCarnetVacunacion1"
                                                    text="carnet vacunaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoCarnetVacunacion2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoCarnetVacunacionRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoCarnetVacunacion1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoCarnetVacunacion1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoCarnetVacunacion1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoCarnetVacunacion1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_carnet_vacunacion']}"
                                                    toolTip="BundleParametros.numero_siono_carnet_vacunacion.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoCarnetVacunacion1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoCarnetVacunacion1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x22y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoCarnetVacunacion1"
                                                    for="listaNumeroSionoCarnetVacunacion1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoCarnetVacunacion1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoCarnetVacunacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_carnet_vacunacion.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroClaseImpedimento1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroClaseImpedimentoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroClaseImpedimento1}"
                                                    id="labelNumeroClaseImpedimento1"
                                                    for="listaNumeroClaseImpedimento1"
                                                    text="clase impedimento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroClaseImpedimento2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroClaseImpedimentoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroClaseImpedimento1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroClaseImpedimento1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroClaseImpedimento1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroClaseImpedimento1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_clase_impedimento']}"
                                                    toolTip="BundleParametros.numero_clase_impedimento.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroClaseImpedimento1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroClaseImpedimento1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_clase_impediment_1x23y2']}"/>
                                                <webuijsf:message id="messageNumeroClaseImpedimento1"
                                                    for="listaNumeroClaseImpedimento1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroClaseImpedimento1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroClaseImpedimento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_clase_impedimento.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraClaseImpedimento1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridOtraClaseImpedimentoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelOtraClaseImpedimento1}"
                                                    id="labelOtraClaseImpedimento1"
                                                    for="campoOtraClaseImpedimento1"
                                                    text="otra clase impedimento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraClaseImpedimento2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridOtraClaseImpedimentoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraClaseImpedimento1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtraClaseImpedimento1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otra_clase_impedimento']}"
                                                    toolTip="BundleParametros.otra_clase_impedimento.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorOtraClaseImpedimento1.validate}"/>
                                                <webuijsf:staticText id="campoOtraClaseImpedimento1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtraClaseImpedimento1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otra_clase_impedimento']}"/>
                                                <webuijsf:message id="messageOtraClaseImpedimento1"
                                                    for="campoOtraClaseImpedimento1"/>
                                                <webuijsf:helpInline id="helpInlineOtraClaseImpedimento1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineOtraClaseImpedimento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_clase_impedimento.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaImpedimento1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroCausaImpedimentoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroCausaImpedimento1}"
                                                    id="labelNumeroCausaImpedimento1"
                                                    for="listaNumeroCausaImpedimento1"
                                                    text="causa impedimento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaImpedimento2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroCausaImpedimentoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaImpedimento1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroCausaImpedimento1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroCausaImpedimento1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroCausaImpedimento1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_causa_impedimento']}"
                                                    toolTip="BundleParametros.numero_causa_impedimento.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroCausaImpedimento1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroCausaImpedimento1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_causa_impediment_1x24y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaImpedimento1"
                                                    for="listaNumeroCausaImpedimento1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaImpedimento1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroCausaImpedimento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_impedimento.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaImpedimento1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridOtraCausaImpedimentoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelOtraCausaImpedimento1}"
                                                    id="labelOtraCausaImpedimento1"
                                                    for="campoOtraCausaImpedimento1"
                                                    text="otra causa impedimento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaImpedimento2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridOtraCausaImpedimentoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaImpedimento1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtraCausaImpedimento1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otra_causa_impedimento']}"
                                                    toolTip="BundleParametros.otra_causa_impedimento.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorOtraCausaImpedimento1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaImpedimento1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtraCausaImpedimento1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otra_causa_impedimento']}"/>
                                                <webuijsf:message id="messageOtraCausaImpedimento1"
                                                    for="campoOtraCausaImpedimento1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaImpedimento1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineOtraCausaImpedimento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_impedimento.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDifParaCaminar1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoDifParaCaminarRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoDifParaCaminar1}"
                                                    id="labelNumeroSionoDifParaCaminar1"
                                                    for="listaNumeroSionoDifParaCaminar1"
                                                    text="dificultad para caminar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDifParaCaminar2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoDifParaCaminarRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaCaminar1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaCaminar1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoDifParaCaminar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoDifParaCaminar1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_dif_para_caminar']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_caminar.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaCaminar1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaCaminar1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x25y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaCaminar1"
                                                    for="listaNumeroSionoDifParaCaminar1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDifParaCaminar1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoDifParaCaminar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_dif_para_caminar.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDifParaVestirse1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoDifParaVestirseRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoDifParaVestirse1}"
                                                    id="labelNumeroSionoDifParaVestirse1"
                                                    for="listaNumeroSionoDifParaVestirse1"
                                                    text="dificultad para vestirse"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDifParaVestirse2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoDifParaVestirseRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaVestirse1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaVestirse1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoDifParaVestirse1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoDifParaVestirse1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_dif_para_vestirse']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_vestirse.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaVestirse1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaVestirse1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x26y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaVestirse1"
                                                    for="listaNumeroSionoDifParaVestirse1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDifParaVestirse1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoDifParaVestirse1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_dif_para_vestirse.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDifParaBanarse1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoDifParaBanarseRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoDifParaBanarse1}"
                                                    id="labelNumeroSionoDifParaBanarse1"
                                                    for="listaNumeroSionoDifParaBanarse1"
                                                    text="dificultad para ba&#241;arse"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDifParaBanarse2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoDifParaBanarseRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaBanarse1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaBanarse1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoDifParaBanarse1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoDifParaBanarse1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_dif_para_banarse']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_banarse.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaBanarse1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaBanarse1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x27y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaBanarse1"
                                                    for="listaNumeroSionoDifParaBanarse1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDifParaBanarse1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoDifParaBanarse1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_dif_para_banarse.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDifParaComer1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoDifParaComerRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoDifParaComer1}"
                                                    id="labelNumeroSionoDifParaComer1"
                                                    for="listaNumeroSionoDifParaComer1"
                                                    text="dificultad para comer"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDifParaComer2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoDifParaComerRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaComer1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaComer1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoDifParaComer1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoDifParaComer1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_dif_para_comer']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_comer.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaComer1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaComer1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x28y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaComer1"
                                                    for="listaNumeroSionoDifParaComer1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDifParaComer1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoDifParaComer1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_dif_para_comer.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDifParaLaCama1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoDifParaLaCamaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoDifParaLaCama1}"
                                                    id="labelNumeroSionoDifParaLaCama1"
                                                    for="listaNumeroSionoDifParaLaCama1"
                                                    text="dificultad para la cama"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDifParaLaCama2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoDifParaLaCamaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaLaCama1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaLaCama1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoDifParaLaCama1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoDifParaLaCama1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_dif_para_la_cama']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_la_cama.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaLaCama1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaLaCama1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x29y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaLaCama1"
                                                    for="listaNumeroSionoDifParaLaCama1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDifParaLaCama1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoDifParaLaCama1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_dif_para_la_cama.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDifParaElBano1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoDifParaElBanoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoDifParaElBano1}"
                                                    id="labelNumeroSionoDifParaElBano1"
                                                    for="listaNumeroSionoDifParaElBano1"
                                                    text="dificultad para el ba&#241;o"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDifParaElBano2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoDifParaElBanoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaElBano1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaElBano1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoDifParaElBano1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoDifParaElBano1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_dif_para_el_bano']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_el_bano.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaElBano1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaElBano1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x30y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaElBano1"
                                                    for="listaNumeroSionoDifParaElBano1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDifParaElBano1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoDifParaElBano1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_dif_para_el_bano.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoTrabajo1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoTrabajoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoTrabajo1}"
                                                    id="labelNumeroSionoTrabajo1"
                                                    for="listaNumeroSionoTrabajo1"
                                                    text="trabajo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoTrabajo2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroSionoTrabajoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoTrabajo1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoTrabajo1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoTrabajo1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoTrabajo1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_trabajo']}"
                                                    toolTip="BundleParametros.numero_siono_trabajo.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoTrabajo1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoTrabajo1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x31y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoTrabajo1"
                                                    for="listaNumeroSionoTrabajo1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoTrabajo1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoTrabajo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_trabajo.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroMotivoNoTrabajo1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroMotivoNoTrabajoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroMotivoNoTrabajo1}"
                                                    id="labelNumeroMotivoNoTrabajo1"
                                                    for="listaNumeroMotivoNoTrabajo1"
                                                    text="motivo no trabajo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroMotivoNoTrabajo2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroMotivoNoTrabajoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroMotivoNoTrabajo1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroMotivoNoTrabajo1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroMotivoNoTrabajo1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroMotivoNoTrabajo1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_motivo_no_trabajo']}"
                                                    toolTip="BundleParametros.numero_motivo_no_trabajo.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroMotivoNoTrabajo1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroMotivoNoTrabajo1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_motivo_no_trabaj_1x32y2']}"/>
                                                <webuijsf:message id="messageNumeroMotivoNoTrabajo1"
                                                    for="listaNumeroMotivoNoTrabajo1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroMotivoNoTrabajo1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroMotivoNoTrabajo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_motivo_no_trabajo.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtroMotivoNoTrabajo1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridOtroMotivoNoTrabajoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelOtroMotivoNoTrabajo1}"
                                                    id="labelOtroMotivoNoTrabajo1"
                                                    for="campoOtroMotivoNoTrabajo1"
                                                    text="otro motivo no trabajo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtroMotivoNoTrabajo2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridOtroMotivoNoTrabajoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtroMotivoNoTrabajo1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtroMotivoNoTrabajo1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otro_motivo_no_trabajo']}"
                                                    toolTip="BundleParametros.otro_motivo_no_trabajo.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorOtroMotivoNoTrabajo1.validate}"/>
                                                <webuijsf:staticText id="campoOtroMotivoNoTrabajo1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtroMotivoNoTrabajo1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otro_motivo_no_trabajo']}"/>
                                                <webuijsf:message id="messageOtroMotivoNoTrabajo1"
                                                    for="campoOtroMotivoNoTrabajo1"/>
                                                <webuijsf:helpInline id="helpInlineOtroMotivoNoTrabajo1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineOtroMotivoNoTrabajo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otro_motivo_no_trabajo.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDescripcionOcupacionPrin1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridDescripcionOcupacionPrinRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelDescripcionOcupacionPrin1}"
                                                    id="labelDescripcionOcupacionPrin1"
                                                    for="campoDescripcionOcupacionPrin1"
                                                    text="descripci&#243;n ocupaci&#243;n principal"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDescripcionOcupacionPrin2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridDescripcionOcupacionPrinRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoDescripcionOcupacionPrin1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoDescripcionOcupacionPrin1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['descripcion_ocupacion_prin']}"
                                                    toolTip="BundleParametros.descripcion_ocupacion_prin.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorDescripcionOcupacionPrin1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionOcupacionPrin1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoDescripcionOcupacionPrin1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['descripcion_ocupacion_prin']}"/>
                                                <webuijsf:message id="messageDescripcionOcupacionPrin1"
                                                    for="campoDescripcionOcupacionPrin1"/>
                                                <webuijsf:helpInline id="helpInlineDescripcionOcupacionPrin1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineDescripcionOcupacionPrin1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.descripcion_ocupacion_prin.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDescripcionDedicacionPrin1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridDescripcionDedicacionPrinRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelDescripcionDedicacionPrin1}"
                                                    id="labelDescripcionDedicacionPrin1"
                                                    for="campoDescripcionDedicacionPrin1"
                                                    text="descripci&#243;n dedicaci&#243;n principal"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDescripcionDedicacionPrin2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridDescripcionDedicacionPrinRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoDescripcionDedicacionPrin1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoDescripcionDedicacionPrin1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['descripcion_dedicacion_prin']}"
                                                    toolTip="BundleParametros.descripcion_dedicacion_prin.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorDescripcionDedicacionPrin1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionDedicacionPrin1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoDescripcionDedicacionPrin1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['descripcion_dedicacion_prin']}"/>
                                                <webuijsf:message id="messageDescripcionDedicacionPrin1"
                                                    for="campoDescripcionDedicacionPrin1"/>
                                                <webuijsf:helpInline id="helpInlineDescripcionDedicacionPrin1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineDescripcionDedicacionPrin1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.descripcion_dedicacion_prin.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoRelacionLab1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroTipoRelacionLabRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroTipoRelacionLab1}"
                                                    id="labelNumeroTipoRelacionLab1"
                                                    for="listaNumeroTipoRelacionLab1"
                                                    text="tipo relaci&#243;n laboral"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoRelacionLab2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridNumeroTipoRelacionLabRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoRelacionLab1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoRelacionLab1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroTipoRelacionLab1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroTipoRelacionLab1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_tipo_relacion_lab']}"
                                                    toolTip="BundleParametros.numero_tipo_relacion_lab.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoRelacionLab1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoRelacionLab1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_tipo_relacion_la_1x33y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoRelacionLab1"
                                                    for="listaNumeroTipoRelacionLab1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoRelacionLab1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroTipoRelacionLab1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_relacion_lab.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoOcupacionPrin1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoOcupacionPrinRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoOcupacionPrin1}"
                                                    id="labelMontoIngresoOcupacionPrin1"
                                                    for="campoMontoIngresoOcupacionPrin1"
                                                    text="monto ingreso ocupaci&#243;n principal"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoOcupacionPrin2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoOcupacionPrinRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoOcupacionPrin1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoOcupacionPrin1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoOcupacionPrin1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_ocupacion_prin']}"
                                                    toolTip="BundleParametros.monto_ingreso_ocupacion_prin.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoOcupacionPrin1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoOcupacionPrin1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoOcupacionPrin1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoOcupacionPrin1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_ocupacion_prin']}"/>
                                                <webuijsf:message id="messageMontoIngresoOcupacionPrin1"
                                                    for="campoMontoIngresoOcupacionPrin1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoOcupacionPrin1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoOcupacionPrin1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_ocupacion_prin.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoOcupacionSecun1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoOcupacionSecunRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoOcupacionSecun1}"
                                                    id="labelMontoIngresoOcupacionSecun1"
                                                    for="campoMontoIngresoOcupacionSecun1"
                                                    text="monto ingreso ocupaci&#243;n secundaria"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoOcupacionSecun2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoOcupacionSecunRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoOcupacionSecun1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoOcupacionSecun1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoOcupacionSecun1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_ocupacion_secun']}"
                                                    toolTip="BundleParametros.monto_ingreso_ocupacion_secun.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoOcupacionSecun1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoOcupacionSecun1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoOcupacionSecun1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoOcupacionSecun1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_ocupacion_secun']}"/>
                                                <webuijsf:message id="messageMontoIngresoOcupacionSecun1"
                                                    for="campoMontoIngresoOcupacionSecun1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoOcupacionSecun1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoOcupacionSecun1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_ocupacion_secun.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoOtrasOcup1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoOtrasOcupRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoOtrasOcup1}"
                                                    id="labelMontoIngresoOtrasOcup1"
                                                    for="campoMontoIngresoOtrasOcup1"
                                                    text="monto ingreso otras ocupaciones"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoOtrasOcup2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoOtrasOcupRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoOtrasOcup1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoOtrasOcup1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoOtrasOcup1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_otras_ocup']}"
                                                    toolTip="BundleParametros.monto_ingreso_otras_ocup.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoOtrasOcup1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoOtrasOcup1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoOtrasOcup1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoOtrasOcup1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_otras_ocup']}"/>
                                                <webuijsf:message id="messageMontoIngresoOtrasOcup1"
                                                    for="campoMontoIngresoOtrasOcup1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoOtrasOcup1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoOtrasOcup1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_otras_ocup.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoAlquileres1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoAlquileresRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoAlquileres1}"
                                                    id="labelMontoIngresoAlquileres1"
                                                    for="campoMontoIngresoAlquileres1"
                                                    text="monto ingreso alquileres"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoAlquileres2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoAlquileresRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoAlquileres1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoAlquileres1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoAlquileres1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_alquileres']}"
                                                    toolTip="BundleParametros.monto_ingreso_alquileres.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoAlquileres1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoAlquileres1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoAlquileres1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoAlquileres1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_alquileres']}"/>
                                                <webuijsf:message id="messageMontoIngresoAlquileres1"
                                                    for="campoMontoIngresoAlquileres1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoAlquileres1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoAlquileres1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_alquileres.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoIntereses1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoInteresesRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoIntereses1}"
                                                    id="labelMontoIngresoIntereses1"
                                                    for="campoMontoIngresoIntereses1"
                                                    text="monto ingreso intereses"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoIntereses2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoInteresesRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoIntereses1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoIntereses1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoIntereses1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_intereses']}"
                                                    toolTip="BundleParametros.monto_ingreso_intereses.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoIntereses1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoIntereses1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoIntereses1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoIntereses1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_intereses']}"/>
                                                <webuijsf:message id="messageMontoIngresoIntereses1"
                                                    for="campoMontoIngresoIntereses1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoIntereses1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoIntereses1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_intereses.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoAyudaFamPais1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoAyudaFamPaisRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoAyudaFamPais1}"
                                                    id="labelMontoIngresoAyudaFamPais1"
                                                    for="campoMontoIngresoAyudaFamPais1"
                                                    text="monto ingreso ayuda familiar pais"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoAyudaFamPais2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoAyudaFamPaisRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoAyudaFamPais1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoAyudaFamPais1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoAyudaFamPais1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_ayuda_fam_pais']}"
                                                    toolTip="BundleParametros.monto_ingreso_ayuda_fam_pais.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoAyudaFamPais1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoAyudaFamPais1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoAyudaFamPais1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoAyudaFamPais1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_ayuda_fam_pais']}"/>
                                                <webuijsf:message id="messageMontoIngresoAyudaFamPais1"
                                                    for="campoMontoIngresoAyudaFamPais1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoAyudaFamPais1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoAyudaFamPais1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_ayuda_fam_pais.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoAyudaFamExter1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoAyudaFamExterRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoAyudaFamExter1}"
                                                    id="labelMontoIngresoAyudaFamExter1"
                                                    for="campoMontoIngresoAyudaFamExter1"
                                                    text="monto ingreso ayuda familiar exterior"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoAyudaFamExter2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoAyudaFamExterRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoAyudaFamExter1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoAyudaFamExter1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoAyudaFamExter1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_ayuda_fam_exter']}"
                                                    toolTip="BundleParametros.monto_ingreso_ayuda_fam_exter.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoAyudaFamExter1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoAyudaFamExter1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoAyudaFamExter1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoAyudaFamExter1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_ayuda_fam_exter']}"/>
                                                <webuijsf:message id="messageMontoIngresoAyudaFamExter1"
                                                    for="campoMontoIngresoAyudaFamExter1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoAyudaFamExter1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoAyudaFamExter1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_ayuda_fam_exter.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoJubilacion1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoJubilacionRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoJubilacion1}"
                                                    id="labelMontoIngresoJubilacion1"
                                                    for="campoMontoIngresoJubilacion1"
                                                    text="monto ingreso jubilaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoJubilacion2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoJubilacionRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoJubilacion1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoJubilacion1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoJubilacion1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_jubilacion']}"
                                                    toolTip="BundleParametros.monto_ingreso_jubilacion.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoJubilacion1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoJubilacion1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoJubilacion1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoJubilacion1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_jubilacion']}"/>
                                                <webuijsf:message id="messageMontoIngresoJubilacion1"
                                                    for="campoMontoIngresoJubilacion1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoJubilacion1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoJubilacion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_jubilacion.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoPensiones1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoPensionesRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoPensiones1}"
                                                    id="labelMontoIngresoPensiones1"
                                                    for="campoMontoIngresoPensiones1"
                                                    text="monto ingreso pensiones"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoPensiones2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoPensionesRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoPensiones1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoPensiones1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoPensiones1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_pensiones']}"
                                                    toolTip="BundleParametros.monto_ingreso_pensiones.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoPensiones1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoPensiones1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoPensiones1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoPensiones1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_pensiones']}"/>
                                                <webuijsf:message id="messageMontoIngresoPensiones1"
                                                    for="campoMontoIngresoPensiones1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoPensiones1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoPensiones1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_pensiones.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoTekopora1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoTekoporaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoTekopora1}"
                                                    id="labelMontoIngresoTekopora1"
                                                    for="campoMontoIngresoTekopora1"
                                                    text="monto ingreso tekopora"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoTekopora2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoTekoporaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoTekopora1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoTekopora1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoTekopora1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_tekopora']}"
                                                    toolTip="BundleParametros.monto_ingreso_tekopora.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoTekopora1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoTekopora1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoTekopora1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoTekopora1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_tekopora']}"/>
                                                <webuijsf:message id="messageMontoIngresoTekopora1"
                                                    for="campoMontoIngresoTekopora1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoTekopora1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoTekopora1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_tekopora.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoProgramas1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoProgramasRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoProgramas1}"
                                                    id="labelMontoIngresoProgramas1"
                                                    for="campoMontoIngresoProgramas1"
                                                    text="monto ingreso programas"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoProgramas2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoProgramasRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoProgramas1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoProgramas1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoProgramas1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_programas']}"
                                                    toolTip="BundleParametros.monto_ingreso_programas.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoProgramas1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoProgramas1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoProgramas1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoProgramas1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_programas']}"/>
                                                <webuijsf:message id="messageMontoIngresoProgramas1"
                                                    for="campoMontoIngresoProgramas1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoProgramas1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoProgramas1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_programas.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoAdicional1"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoAdicionalRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoAdicional1}"
                                                    id="labelMontoIngresoAdicional1"
                                                    for="campoMontoIngresoAdicional1"
                                                    text="monto ingreso adicional"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoAdicional2"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.gridMontoIngresoAdicionalRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoAdicional1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoAdicional1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoAdicional1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_adicional']}"
                                                    toolTip="BundleParametros.monto_ingreso_adicional.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoAdicional1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoAdicional1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoAdicional1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoAdicional1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_adicional']}"/>
                                                <webuijsf:message id="messageMontoIngresoAdicional1"
                                                    for="campoMontoIngresoAdicional1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoAdicional1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoAdicional1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_adicional.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridTotalIngresoMensual1" rendered="#{FichaPersonaPorFichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelTotalIngresoMensual1}"
                                                    id="labelTotalIngresoMensual1"
                                                    for="campoTotalIngresoMensual1"
                                                    text="total ingreso mensual"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridTotalIngresoMensual2" rendered="#{FichaPersonaPorFichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoTotalIngresoMensual1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoTotalIngresoMensual1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterTotalIngresoMensual1}"
                                                    readOnly="true"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['total_ingreso_mensual']}"
                                                    toolTip="BundleParametros.total_ingreso_mensual.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorTotalIngresoMensual1.validate}"/>
                                                <webuijsf:staticText id="campoTotalIngresoMensual1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoTotalIngresoMensual1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterTotalIngresoMensual1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['total_ingreso_mensual']}"/>
                                                <webuijsf:message id="messageTotalIngresoMensual1"
                                                    for="campoTotalIngresoMensual1"/>
                                                <webuijsf:helpInline id="helpInlineTotalIngresoMensual1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineTotalIngresoMensual1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.total_ingreso_mensual.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPotencialBen1" rendered="#{FichaPersonaPorFichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelIdPotencialBen1}"
                                                    id="labelIdPotencialBen1"
                                                    for="campoIdPotencialBen1"
                                                    text="potencial beneficiario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPotencialBen2" rendered="#{FichaPersonaPorFichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPotencialBen1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdPotencialBen1}"
                                                    readOnly="true"
                                                    text="#{FichaPersonaPorFichaHogar2.asistente.textoCampoIdPotencialBen1}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.asistente.toolTipCampoIdPotencialBen1}"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.campoIdPotencialBen1_validate}"/>
                                                <webuijsf:staticText id="campoIdPotencialBen1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdPotencialBen1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_potencial_ben_1x34y3']}"/>
                                                <webuijsf:button id="campoIdPotencialBen1Boton1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdPotencialBen1Boton1}"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdPotencialBen1Boton1}"/>
                                                <webuijsf:button id="campoIdPotencialBen1Boton3"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdPotencialBen1Boton3}"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdPotencialBen1Boton2}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.asistente.campoIdPotencialBen1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdPotencialBen1"
                                                    for="campoIdPotencialBen1"/>
                                                <webuijsf:helpInline id="helpInlineIdPotencialBen1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineIdPotencialBen1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_potencial_ben.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPotencialBen3" rendered="#{FichaPersonaPorFichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelIdPotencialBen2}"
                                                    id="labelIdPotencialBen2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre potencial beneficiario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPotencialBen4" rendered="#{FichaPersonaPorFichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdPotencialBen1Texto2}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['nombre_potencial_ben_1x34y4']}"
                                                    id="campoIdPotencialBen1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdPotencialBen1Boton2}"
                                                    id="campoIdPotencialBen1Boton2"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdPotencialBen1Boton2}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:tabSet
                                            id="tabSet1"
                                            lite="true"
                                            mini="true"
                                            rendered="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                            selected="tab1">
                                        <webuijsf:tab
                                            id="tab1"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionAntecedentes1Rendered}"
                                            text="antecedentes 1">
                                        <h:panelGrid
                                            id="gridPanel116"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionAntecedentes1Hidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab1"
                                                text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel117"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionAntecedentes1Rendered}">
                                            <h:panelGrid
                                                id="gridEsRespondente1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelEsRespondente1x1}"
                                                    id="labelEsRespondente1x1"
                                                    for="listaEsRespondente1x1"
                                                    text="respondente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsRespondente1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsRespondente1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaEsRespondente1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterEsRespondente1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaEsRespondente1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['es_respondente']}"
                                                    toolTip="BundleParametros.es_respondente.ficha_persona"/>
                                                <webuijsf:staticText id="listaEsRespondente1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaEsRespondente1x1Texto1}"/>
                                                <webuijsf:message id="messageEsRespondente1x1"
                                                    for="listaEsRespondente1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsRespondente1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineEsRespondente1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_respondente.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroOrdenIdentificacion1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroOrdenIdentificacion1x1}"
                                                    id="labelNumeroOrdenIdentificacion1x1"
                                                    for="campoNumeroOrdenIdentificacion1x1"
                                                    text="n&#250;mero orden identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroOrdenIdentificacion1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroOrdenIdentificacion1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroOrdenIdentificacion1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroOrdenIdentificacion1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_orden_identificacion']}"
                                                    toolTip="BundleParametros.numero_orden_identificacion.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorNumeroOrdenIdentificacion1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdentificacion1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroOrdenIdentificacion1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_orden_identificacion']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdentificacion1x1"
                                                    for="campoNumeroOrdenIdentificacion1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroOrdenIdentificacion1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroOrdenIdentificacion1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_orden_identificacion.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPrimerNombre1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelPrimerNombre1x1}"
                                                    id="labelPrimerNombre1x1"
                                                    for="campoPrimerNombre1x1"
                                                    text="primer nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerNombre1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoPrimerNombre1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoPrimerNombre1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoPrimerNombre1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1x1"
                                                    for="campoPrimerNombre1x1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerNombre1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlinePrimerNombre1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_nombre.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoNombre1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelSegundoNombre1x1}"
                                                    id="labelSegundoNombre1x1"
                                                    for="campoSegundoNombre1x1"
                                                    text="segundo nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoNombre1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoSegundoNombre1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoSegundoNombre1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoSegundoNombre1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1x1"
                                                    for="campoSegundoNombre1x1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoNombre1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineSegundoNombre1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_nombre.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPrimerApellido1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelPrimerApellido1x1}"
                                                    id="labelPrimerApellido1x1"
                                                    for="campoPrimerApellido1x1"
                                                    text="primer apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerApellido1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoPrimerApellido1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoPrimerApellido1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoPrimerApellido1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1x1"
                                                    for="campoPrimerApellido1x1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerApellido1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlinePrimerApellido1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_apellido.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoApellido1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelSegundoApellido1x1}"
                                                    id="labelSegundoApellido1x1"
                                                    for="campoSegundoApellido1x1"
                                                    text="segundo apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoApellido1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoSegundoApellido1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoSegundoApellido1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoSegundoApellido1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1x1"
                                                    for="campoSegundoApellido1x1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoApellido1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineSegundoApellido1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_apellido.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridApellidoCasada1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelApellidoCasada1x1}"
                                                    id="labelApellidoCasada1x1"
                                                    for="campoApellidoCasada1x1"
                                                    text="apellido casada"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridApellidoCasada1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoApellidoCasada1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoApellidoCasada1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['apellido_casada']}"
                                                    toolTip="BundleParametros.apellido_casada.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorApellidoCasada1.validate}"/>
                                                <webuijsf:staticText id="campoApellidoCasada1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoApellidoCasada1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['apellido_casada']}"/>
                                                <webuijsf:message id="messageApellidoCasada1x1"
                                                    for="campoApellidoCasada1x1"/>
                                                <webuijsf:helpInline id="helpInlineApellidoCasada1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineApellidoCasada1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.apellido_casada.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridApodo1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelApodo1x1}"
                                                    id="labelApodo1x1"
                                                    for="campoApodo1x1"
                                                    text="apodo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridApodo1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoApodo1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoApodo1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['apodo']}"
                                                    toolTip="BundleParametros.apodo.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorApodo1.validate}"/>
                                                <webuijsf:staticText id="campoApodo1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoApodo1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['apodo']}"/>
                                                <webuijsf:message id="messageApodo1x1"
                                                    for="campoApodo1x1"/>
                                                <webuijsf:helpInline id="helpInlineApodo1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineApodo1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.apodo.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEdad1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelEdad1x1}"
                                                    id="labelEdad1x1"
                                                    for="campoEdad1x1"
                                                    text="edad"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEdad1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoEdad1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoEdad1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterEdad1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['edad']}"
                                                    toolTip="BundleParametros.edad.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorEdad1.validate}"/>
                                                <webuijsf:staticText id="campoEdad1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoEdad1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['edad']}"/>
                                                <webuijsf:message id="messageEdad1x1"
                                                    for="campoEdad1x1"/>
                                                <webuijsf:helpInline id="helpInlineEdad1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineEdad1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.edad.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSexoPersona1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSexoPersona1x1}"
                                                    id="labelNumeroSexoPersona1x1"
                                                    for="listaNumeroSexoPersona1x1"
                                                    text="sexo persona"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSexoPersona1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSexoPersona1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSexoPersona1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSexoPersona1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSexoPersona1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_sexo_persona']}"
                                                    toolTip="BundleParametros.numero_sexo_persona.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSexoPersona1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSexoPersona1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_sexo_persona_1x2y2']}"/>
                                                <webuijsf:message id="messageNumeroSexoPersona1x1"
                                                    for="listaNumeroSexoPersona1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSexoPersona1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSexoPersona1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_sexo_persona.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroEstadoCivil1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroEstadoCivil1x1}"
                                                    id="labelNumeroEstadoCivil1x1"
                                                    for="listaNumeroEstadoCivil1x1"
                                                    text="estado civil"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroEstadoCivil1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroEstadoCivil1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroEstadoCivil1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroEstadoCivil1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroEstadoCivil1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_estado_civil']}"
                                                    toolTip="BundleParametros.numero_estado_civil.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroEstadoCivil1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroEstadoCivil1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_estado_civil_1x3y2']}"/>
                                                <webuijsf:message id="messageNumeroEstadoCivil1x1"
                                                    for="listaNumeroEstadoCivil1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroEstadoCivil1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroEstadoCivil1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_estado_civil.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab2"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionAntecedentes2Rendered}"
                                            text="antecedentes 2">
                                        <h:panelGrid
                                            id="gridPanel118"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionAntecedentes2Hidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab2"
                                                text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel119"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionAntecedentes2Rendered}">
                                            <h:panelGrid
                                                id="gridNumeroTipoPersonaHogar1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroTipoPersonaHogar1x1}"
                                                    id="labelNumeroTipoPersonaHogar1x1"
                                                    for="listaNumeroTipoPersonaHogar1x1"
                                                    text="tipo persona hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoPersonaHogar1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoPersonaHogar1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoPersonaHogar1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroTipoPersonaHogar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroTipoPersonaHogar1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_tipo_persona_hogar']}"
                                                    toolTip="BundleParametros.numero_tipo_persona_hogar.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoPersonaHogar1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoPersonaHogar1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_tipo_persona_hoga_1x4y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoPersonaHogar1x1"
                                                    for="listaNumeroTipoPersonaHogar1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoPersonaHogar1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroTipoPersonaHogar1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_persona_hogar.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoMiembroHogar1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoMiembroHogar1x1}"
                                                    id="labelNumeroSionoMiembroHogar1x1"
                                                    for="listaNumeroSionoMiembroHogar1x1"
                                                    text="miembro hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoMiembroHogar1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoMiembroHogar1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoMiembroHogar1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoMiembroHogar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoMiembroHogar1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_miembro_hogar']}"
                                                    toolTip="BundleParametros.numero_siono_miembro_hogar.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoMiembroHogar1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoMiembroHogar1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x5y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoMiembroHogar1x1"
                                                    for="listaNumeroSionoMiembroHogar1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoMiembroHogar1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoMiembroHogar1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_miembro_hogar.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroOrdenIdenConyuge1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroOrdenIdenConyuge1x1}"
                                                    id="labelNumeroOrdenIdenConyuge1x1"
                                                    for="campoNumeroOrdenIdenConyuge1x1"
                                                    text="n&#250;mero orden identificaci&#243;n conyuge"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroOrdenIdenConyuge1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroOrdenIdenConyuge1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroOrdenIdenConyuge1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroOrdenIdenConyuge1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_orden_iden_conyuge']}"
                                                    toolTip="BundleParametros.numero_orden_iden_conyuge.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorNumeroOrdenIdenConyuge1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenConyuge1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroOrdenIdenConyuge1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_orden_iden_conyuge']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenConyuge1x1"
                                                    for="campoNumeroOrdenIdenConyuge1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroOrdenIdenConyuge1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroOrdenIdenConyuge1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_orden_iden_conyuge.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroOrdenIdenPadre1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroOrdenIdenPadre1x1}"
                                                    id="labelNumeroOrdenIdenPadre1x1"
                                                    for="campoNumeroOrdenIdenPadre1x1"
                                                    text="n&#250;mero orden identificaci&#243;n padre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroOrdenIdenPadre1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroOrdenIdenPadre1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroOrdenIdenPadre1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroOrdenIdenPadre1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_orden_iden_padre']}"
                                                    toolTip="BundleParametros.numero_orden_iden_padre.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorNumeroOrdenIdenPadre1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenPadre1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroOrdenIdenPadre1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_orden_iden_padre']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenPadre1x1"
                                                    for="campoNumeroOrdenIdenPadre1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroOrdenIdenPadre1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroOrdenIdenPadre1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_orden_iden_padre.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroOrdenIdenMadre1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroOrdenIdenMadre1x1}"
                                                    id="labelNumeroOrdenIdenMadre1x1"
                                                    for="campoNumeroOrdenIdenMadre1x1"
                                                    text="n&#250;mero orden identificaci&#243;n madre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroOrdenIdenMadre1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroOrdenIdenMadre1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroOrdenIdenMadre1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroOrdenIdenMadre1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_orden_iden_madre']}"
                                                    toolTip="BundleParametros.numero_orden_iden_madre.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorNumeroOrdenIdenMadre1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenMadre1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroOrdenIdenMadre1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_orden_iden_madre']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenMadre1x1"
                                                    for="campoNumeroOrdenIdenMadre1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroOrdenIdenMadre1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroOrdenIdenMadre1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_orden_iden_madre.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCedula1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroCedula1x1}"
                                                    id="labelNumeroCedula1x1"
                                                    for="campoNumeroCedula1x1"
                                                    text="n&#250;mero c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCedula1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroCedula1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroCedula1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroCedula1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_cedula']}"
                                                    toolTip="BundleParametros.numero_cedula.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorNumeroCedula1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedula1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoNumeroCedula1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_cedula']}"/>
                                                <webuijsf:message id="messageNumeroCedula1x1"
                                                    for="campoNumeroCedula1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCedula1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroCedula1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_cedula.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLetraCedula1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelLetraCedula1x1}"
                                                    id="labelLetraCedula1x1"
                                                    for="campoLetraCedula1x1"
                                                    text="letra c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLetraCedula1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoLetraCedula1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoLetraCedula1x1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['letra_cedula']}"
                                                    toolTip="BundleParametros.letra_cedula.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorLetraCedula1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedula1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoLetraCedula1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['letra_cedula']}"/>
                                                <webuijsf:message id="messageLetraCedula1x1"
                                                    for="campoLetraCedula1x1"/>
                                                <webuijsf:helpInline id="helpInlineLetraCedula1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineLetraCedula1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.letra_cedula.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoExcepcionCed1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroTipoExcepcionCed1x1}"
                                                    id="labelNumeroTipoExcepcionCed1x1"
                                                    for="listaNumeroTipoExcepcionCed1x1"
                                                    text="tipo excepci&#243;n c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoExcepcionCed1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoExcepcionCed1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoExcepcionCed1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroTipoExcepcionCed1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroTipoExcepcionCed1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_tipo_excepcion_ced']}"
                                                    toolTip="BundleParametros.numero_tipo_excepcion_ced.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoExcepcionCed1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoExcepcionCed1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_tipo_excepcion_ce_1x6y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoExcepcionCed1x1"
                                                    for="listaNumeroTipoExcepcionCed1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoExcepcionCed1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroTipoExcepcionCed1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_excepcion_ced.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab3"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionAntecedentes3Rendered}"
                                            text="antecedentes 3">
                                        <h:panelGrid
                                            id="gridPanel120"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionAntecedentes3Hidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab3"
                                                text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel121"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionAntecedentes3Rendered}">
                                            <h:panelGrid
                                                id="gridFechaNacimiento1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelFechaNacimiento1x1}"
                                                    id="labelFechaNacimiento1x1"
                                                    for="campoFechaNacimiento1x1"
                                                    text="fecha nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaNacimiento1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaNacimiento1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoFechaNacimiento1x1}"
                                                    maxDate="#{FichaPersonaPorFichaHogar2.gestor.defaultMaxDate}"
                                                    minDate="#{FichaPersonaPorFichaHogar2.gestor.defaultMinDate}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    selectedDate="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['fecha_nacimiento']}"
                                                    toolTip="BundleParametros.fecha_nacimiento.ficha_persona"/>
                                                <webuijsf:staticText id="campoFechaNacimiento1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoFechaNacimiento1x1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterFechaNacimiento1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['fecha_nacimiento']}"/>
                                                <webuijsf:message id="messageFechaNacimiento1x1"
                                                    for="campoFechaNacimiento1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaNacimiento1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineFechaNacimiento1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_nacimiento.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamentoNacimiento1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelIdDepartamentoNacimiento1x1}"
                                                    id="labelIdDepartamentoNacimiento1x1"
                                                    for="campoIdDepartamentoNacimiento1x1"
                                                    text="departamento nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamentoNacimiento1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDepartamentoNacimiento1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDepartamentoNacimiento1x1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.asistente.textoCampoIdDepartamentoNacimiento1}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.asistente.toolTipCampoIdDepartamentoNacimiento1}"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.campoIdDepartamentoNacimiento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamentoNacimiento1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDepartamentoNacimiento1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_ubicacion_1x7y3']}"/>
                                                <webuijsf:button id="campoIdDepartamentoNacimiento1x1Boton1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDepartamentoNacimiento1x1Boton1}"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdDepartamentoNacimiento1Boton1}"/>
                                                <webuijsf:button id="campoIdDepartamentoNacimiento1x1Boton3"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDepartamentoNacimiento1x1Boton3}"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdDepartamentoNacimiento1Boton2}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.asistente.campoIdDepartamentoNacimiento1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDepartamentoNacimiento1x1"
                                                    for="campoIdDepartamentoNacimiento1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdDepartamentoNacimiento1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineIdDepartamentoNacimiento1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_departamento_nacimiento.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamentoNacimiento1x3"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.campoIdDepartamentoNacimiento1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelIdDepartamentoNacimiento1x2}"
                                                    id="labelIdDepartamentoNacimiento1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre departamento nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamentoNacimiento1x4"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.campoIdDepartamentoNacimiento1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDepartamentoNacimiento1x1Texto2}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['nombre_ubicacion_1x7y4']}"
                                                    id="campoIdDepartamentoNacimiento1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDepartamentoNacimiento1x1Boton2}"
                                                    id="campoIdDepartamentoNacimiento1x1Boton2"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdDepartamentoNacimiento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistritoNacimiento1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelIdDistritoNacimiento1x1}"
                                                    id="labelIdDistritoNacimiento1x1"
                                                    for="campoIdDistritoNacimiento1x1"
                                                    text="distrito nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistritoNacimiento1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDistritoNacimiento1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDistritoNacimiento1x1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.asistente.textoCampoIdDistritoNacimiento1}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.asistente.toolTipCampoIdDistritoNacimiento1}"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.campoIdDistritoNacimiento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistritoNacimiento1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDistritoNacimiento1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_ubicacion_1x8y3']}"/>
                                                <webuijsf:button id="campoIdDistritoNacimiento1x1Boton1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDistritoNacimiento1x1Boton1}"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdDistritoNacimiento1Boton1}"/>
                                                <webuijsf:button id="campoIdDistritoNacimiento1x1Boton3"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDistritoNacimiento1x1Boton3}"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdDistritoNacimiento1Boton2}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.asistente.campoIdDistritoNacimiento1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDistritoNacimiento1x1"
                                                    for="campoIdDistritoNacimiento1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdDistritoNacimiento1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineIdDistritoNacimiento1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_distrito_nacimiento.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistritoNacimiento1x3"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.campoIdDistritoNacimiento1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelIdDistritoNacimiento1x2}"
                                                    id="labelIdDistritoNacimiento1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre distrito nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistritoNacimiento1x4"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.campoIdDistritoNacimiento1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDistritoNacimiento1x1Texto2}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['nombre_ubicacion_1x8y4']}"
                                                    id="campoIdDistritoNacimiento1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdDistritoNacimiento1x1Boton2}"
                                                    id="campoIdDistritoNacimiento1x1Boton2"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdDistritoNacimiento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoAreaLugarNac1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroTipoAreaLugarNac1x1}"
                                                    id="labelNumeroTipoAreaLugarNac1x1"
                                                    for="listaNumeroTipoAreaLugarNac1x1"
                                                    text="tipo area lugar nacimiento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoAreaLugarNac1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoAreaLugarNac1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoAreaLugarNac1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroTipoAreaLugarNac1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroTipoAreaLugarNac1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_tipo_area_lugar_nac']}"
                                                    toolTip="BundleParametros.numero_tipo_area_lugar_nac.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoAreaLugarNac1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoAreaLugarNac1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_tipo_area_1x9y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoAreaLugarNac1x1"
                                                    for="listaNumeroTipoAreaLugarNac1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoAreaLugarNac1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroTipoAreaLugarNac1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_area_lugar_nac.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab4"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionEducacionRendered}"
                                            text="educacion">
                                        <h:panelGrid
                                            id="gridPanel122"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionEducacionHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab4"
                                                text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel123"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionEducacionRendered}">
                                            <h:panelGrid
                                                id="gridNumeroIdiomaHogar1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroIdiomaHogar1x1}"
                                                    id="labelNumeroIdiomaHogar1x1"
                                                    for="listaNumeroIdiomaHogar1x1"
                                                    text="idioma hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroIdiomaHogar1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroIdiomaHogar1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroIdiomaHogar1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroIdiomaHogar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroIdiomaHogar1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_idioma_hogar']}"
                                                    toolTip="BundleParametros.numero_idioma_hogar.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroIdiomaHogar1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroIdiomaHogar1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_idioma_hogar_1x10y2']}"/>
                                                <webuijsf:message id="messageNumeroIdiomaHogar1x1"
                                                    for="listaNumeroIdiomaHogar1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroIdiomaHogar1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroIdiomaHogar1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_idioma_hogar.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtroIdiomaHogar1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelOtroIdiomaHogar1x1}"
                                                    id="labelOtroIdiomaHogar1x1"
                                                    for="campoOtroIdiomaHogar1x1"
                                                    text="otro idioma hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtroIdiomaHogar1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtroIdiomaHogar1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtroIdiomaHogar1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otro_idioma_hogar']}"
                                                    toolTip="BundleParametros.otro_idioma_hogar.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorOtroIdiomaHogar1.validate}"/>
                                                <webuijsf:staticText id="campoOtroIdiomaHogar1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtroIdiomaHogar1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otro_idioma_hogar']}"/>
                                                <webuijsf:message id="messageOtroIdiomaHogar1x1"
                                                    for="campoOtroIdiomaHogar1x1"/>
                                                <webuijsf:helpInline id="helpInlineOtroIdiomaHogar1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineOtroIdiomaHogar1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otro_idioma_hogar.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoAsistenciaEsc1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoAsistenciaEsc1x1}"
                                                    id="labelNumeroSionoAsistenciaEsc1x1"
                                                    for="listaNumeroSionoAsistenciaEsc1x1"
                                                    text="asistencia escolar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoAsistenciaEsc1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoAsistenciaEsc1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoAsistenciaEsc1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoAsistenciaEsc1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoAsistenciaEsc1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_asistencia_esc']}"
                                                    toolTip="BundleParametros.numero_siono_asistencia_esc.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoAsistenciaEsc1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoAsistenciaEsc1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x11y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoAsistenciaEsc1x1"
                                                    for="listaNumeroSionoAsistenciaEsc1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoAsistenciaEsc1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoAsistenciaEsc1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_asistencia_esc.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroMotivoInaEsc1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroMotivoInaEsc1x1}"
                                                    id="labelNumeroMotivoInaEsc1x1"
                                                    for="listaNumeroMotivoInaEsc1x1"
                                                    text="motivo inasistencia escolar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroMotivoInaEsc1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroMotivoInaEsc1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroMotivoInaEsc1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroMotivoInaEsc1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroMotivoInaEsc1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_motivo_ina_esc']}"
                                                    toolTip="BundleParametros.numero_motivo_ina_esc.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroMotivoInaEsc1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroMotivoInaEsc1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_motivo_ina_esc_1x12y2']}"/>
                                                <webuijsf:message id="messageNumeroMotivoInaEsc1x1"
                                                    for="listaNumeroMotivoInaEsc1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroMotivoInaEsc1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroMotivoInaEsc1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_motivo_ina_esc.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtroMotivoInaEsc1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelOtroMotivoInaEsc1x1}"
                                                    id="labelOtroMotivoInaEsc1x1"
                                                    for="campoOtroMotivoInaEsc1x1"
                                                    text="otro motivo inasistencia escolar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtroMotivoInaEsc1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtroMotivoInaEsc1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtroMotivoInaEsc1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otro_motivo_ina_esc']}"
                                                    toolTip="BundleParametros.otro_motivo_ina_esc.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorOtroMotivoInaEsc1.validate}"/>
                                                <webuijsf:staticText id="campoOtroMotivoInaEsc1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtroMotivoInaEsc1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otro_motivo_ina_esc']}"/>
                                                <webuijsf:message id="messageOtroMotivoInaEsc1x1"
                                                    for="campoOtroMotivoInaEsc1x1"/>
                                                <webuijsf:helpInline id="helpInlineOtroMotivoInaEsc1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineOtroMotivoInaEsc1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otro_motivo_ina_esc.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoMatriculacionEsc1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoMatriculacionEsc1x1}"
                                                    id="labelNumeroSionoMatriculacionEsc1x1"
                                                    for="listaNumeroSionoMatriculacionEsc1x1"
                                                    text="matriculaci&#243;n escolar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoMatriculacionEsc1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoMatriculacionEsc1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoMatriculacionEsc1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoMatriculacionEsc1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoMatriculacionEsc1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_matriculacion_esc']}"
                                                    toolTip="BundleParametros.numero_siono_matriculacion_esc.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoMatriculacionEsc1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoMatriculacionEsc1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x13y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoMatriculacionEsc1x1"
                                                    for="listaNumeroSionoMatriculacionEsc1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoMatriculacionEsc1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoMatriculacionEsc1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_matriculacion_esc.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridUltimoCursoAprobado1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelUltimoCursoAprobado1x1}"
                                                    id="labelUltimoCursoAprobado1x1"
                                                    for="campoUltimoCursoAprobado1x1"
                                                    text="ultimo curso aprobado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridUltimoCursoAprobado1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoUltimoCursoAprobado1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoUltimoCursoAprobado1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterUltimoCursoAprobado1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['ultimo_curso_aprobado']}"
                                                    toolTip="BundleParametros.ultimo_curso_aprobado.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorUltimoCursoAprobado1.validate}"/>
                                                <webuijsf:staticText id="campoUltimoCursoAprobado1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoUltimoCursoAprobado1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['ultimo_curso_aprobado']}"/>
                                                <webuijsf:message id="messageUltimoCursoAprobado1x1"
                                                    for="campoUltimoCursoAprobado1x1"/>
                                                <webuijsf:helpInline id="helpInlineUltimoCursoAprobado1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineUltimoCursoAprobado1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.ultimo_curso_aprobado.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroNivelEduUltCurAprob1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroNivelEduUltCurAprob1x1}"
                                                    id="labelNumeroNivelEduUltCurAprob1x1"
                                                    for="listaNumeroNivelEduUltCurAprob1x1"
                                                    text="nivel educativo &#250;ltima curso aprobado"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroNivelEduUltCurAprob1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroNivelEduUltCurAprob1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroNivelEduUltCurAprob1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroNivelEduUltCurAprob1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroNivelEduUltCurAprob1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_nivel_edu_ult_cur_aprob']}"
                                                    toolTip="BundleParametros.numero_nivel_edu_ult_cur_aprob.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroNivelEduUltCurAprob1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroNivelEduUltCurAprob1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_nivel_educativo_1x14y2']}"/>
                                                <webuijsf:message id="messageNumeroNivelEduUltCurAprob1x1"
                                                    for="listaNumeroNivelEduUltCurAprob1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroNivelEduUltCurAprob1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroNivelEduUltCurAprob1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_nivel_edu_ult_cur_aprob.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoCursoNoFormal1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoCursoNoFormal1x1}"
                                                    id="labelNumeroSionoCursoNoFormal1x1"
                                                    for="listaNumeroSionoCursoNoFormal1x1"
                                                    text="curso no formal"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoCursoNoFormal1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoCursoNoFormal1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoCursoNoFormal1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoCursoNoFormal1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoCursoNoFormal1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_curso_no_formal']}"
                                                    toolTip="BundleParametros.numero_siono_curso_no_formal.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoCursoNoFormal1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoCursoNoFormal1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x15y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoCursoNoFormal1x1"
                                                    for="listaNumeroSionoCursoNoFormal1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoCursoNoFormal1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoCursoNoFormal1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_curso_no_formal.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab5"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionSalud1Rendered}"
                                            text="salud 1">
                                        <h:panelGrid
                                            id="gridPanel124"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionSalud1Hidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab5"
                                                text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel125"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionSalud1Rendered}">
                                            <h:panelGrid
                                                id="gridNumeroTipoSeguroMedico1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroTipoSeguroMedico1x1}"
                                                    id="labelNumeroTipoSeguroMedico1x1"
                                                    for="listaNumeroTipoSeguroMedico1x1"
                                                    text="tipo seguro medico"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoSeguroMedico1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoSeguroMedico1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoSeguroMedico1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroTipoSeguroMedico1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroTipoSeguroMedico1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_tipo_seguro_medico']}"
                                                    toolTip="BundleParametros.numero_tipo_seguro_medico.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoSeguroMedico1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoSeguroMedico1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_tipo_seguro_medi_1x16y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoSeguroMedico1x1"
                                                    for="listaNumeroTipoSeguroMedico1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoSeguroMedico1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroTipoSeguroMedico1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_seguro_medico.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroEstadoSalud1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroEstadoSalud1x1}"
                                                    id="labelNumeroEstadoSalud1x1"
                                                    for="listaNumeroEstadoSalud1x1"
                                                    text="estado salud"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroEstadoSalud1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroEstadoSalud1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroEstadoSalud1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroEstadoSalud1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroEstadoSalud1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_estado_salud']}"
                                                    toolTip="BundleParametros.numero_estado_salud.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroEstadoSalud1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroEstadoSalud1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_estado_salud_1x17y2']}"/>
                                                <webuijsf:message id="messageNumeroEstadoSalud1x1"
                                                    for="listaNumeroEstadoSalud1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroEstadoSalud1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroEstadoSalud1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_estado_salud.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroClaseEnfAcc1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroClaseEnfAcc1x1}"
                                                    id="labelNumeroClaseEnfAcc1x1"
                                                    for="listaNumeroClaseEnfAcc1x1"
                                                    text="clase enfermedad accidente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroClaseEnfAcc1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroClaseEnfAcc1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroClaseEnfAcc1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroClaseEnfAcc1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroClaseEnfAcc1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_clase_enf_acc']}"
                                                    toolTip="BundleParametros.numero_clase_enf_acc.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroClaseEnfAcc1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroClaseEnfAcc1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_clase_enf_acc_1x18y2']}"/>
                                                <webuijsf:message id="messageNumeroClaseEnfAcc1x1"
                                                    for="listaNumeroClaseEnfAcc1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroClaseEnfAcc1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroClaseEnfAcc1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_clase_enf_acc.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraClaseEnfAcc1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelOtraClaseEnfAcc1x1}"
                                                    id="labelOtraClaseEnfAcc1x1"
                                                    for="campoOtraClaseEnfAcc1x1"
                                                    text="otra clase enfermedad accidente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraClaseEnfAcc1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraClaseEnfAcc1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtraClaseEnfAcc1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otra_clase_enf_acc']}"
                                                    toolTip="BundleParametros.otra_clase_enf_acc.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorOtraClaseEnfAcc1.validate}"/>
                                                <webuijsf:staticText id="campoOtraClaseEnfAcc1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtraClaseEnfAcc1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otra_clase_enf_acc']}"/>
                                                <webuijsf:message id="messageOtraClaseEnfAcc1x1"
                                                    for="campoOtraClaseEnfAcc1x1"/>
                                                <webuijsf:helpInline id="helpInlineOtraClaseEnfAcc1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineOtraClaseEnfAcc1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_clase_enf_acc.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroClaseEnfCronica1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroClaseEnfCronica1x1}"
                                                    id="labelNumeroClaseEnfCronica1x1"
                                                    for="listaNumeroClaseEnfCronica1x1"
                                                    text="clase enfermedad cronica"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroClaseEnfCronica1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroClaseEnfCronica1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroClaseEnfCronica1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroClaseEnfCronica1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroClaseEnfCronica1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_clase_enf_cronica']}"
                                                    toolTip="BundleParametros.numero_clase_enf_cronica.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroClaseEnfCronica1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroClaseEnfCronica1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_clase_enf_cronic_1x19y2']}"/>
                                                <webuijsf:message id="messageNumeroClaseEnfCronica1x1"
                                                    for="listaNumeroClaseEnfCronica1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroClaseEnfCronica1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroClaseEnfCronica1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_clase_enf_cronica.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraClaseEnfCronica1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelOtraClaseEnfCronica1x1}"
                                                    id="labelOtraClaseEnfCronica1x1"
                                                    for="campoOtraClaseEnfCronica1x1"
                                                    text="otra clase enfermedad cronica"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraClaseEnfCronica1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraClaseEnfCronica1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtraClaseEnfCronica1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otra_clase_enf_cronica']}"
                                                    toolTip="BundleParametros.otra_clase_enf_cronica.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorOtraClaseEnfCronica1.validate}"/>
                                                <webuijsf:staticText id="campoOtraClaseEnfCronica1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtraClaseEnfCronica1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otra_clase_enf_cronica']}"/>
                                                <webuijsf:message id="messageOtraClaseEnfCronica1x1"
                                                    for="campoOtraClaseEnfCronica1x1"/>
                                                <webuijsf:helpInline id="helpInlineOtraClaseEnfCronica1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineOtraClaseEnfCronica1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_clase_enf_cronica.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoAtencionMedica1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoAtencionMedica1x1}"
                                                    id="labelNumeroSionoAtencionMedica1x1"
                                                    for="listaNumeroSionoAtencionMedica1x1"
                                                    text="atenci&#243;n medica"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoAtencionMedica1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoAtencionMedica1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoAtencionMedica1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoAtencionMedica1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoAtencionMedica1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_atencion_medica']}"
                                                    toolTip="BundleParametros.numero_siono_atencion_medica.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoAtencionMedica1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoAtencionMedica1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x20y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoAtencionMedica1x1"
                                                    for="listaNumeroSionoAtencionMedica1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoAtencionMedica1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoAtencionMedica1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_atencion_medica.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroMotivoNoAtencion1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroMotivoNoAtencion1x1}"
                                                    id="labelNumeroMotivoNoAtencion1x1"
                                                    for="listaNumeroMotivoNoAtencion1x1"
                                                    text="motivo no atenci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroMotivoNoAtencion1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroMotivoNoAtencion1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroMotivoNoAtencion1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroMotivoNoAtencion1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroMotivoNoAtencion1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_motivo_no_atencion']}"
                                                    toolTip="BundleParametros.numero_motivo_no_atencion.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroMotivoNoAtencion1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroMotivoNoAtencion1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_motivo_no_atenci_1x21y2']}"/>
                                                <webuijsf:message id="messageNumeroMotivoNoAtencion1x1"
                                                    for="listaNumeroMotivoNoAtencion1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroMotivoNoAtencion1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroMotivoNoAtencion1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_motivo_no_atencion.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtroMotivoNoAtencion1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelOtroMotivoNoAtencion1x1}"
                                                    id="labelOtroMotivoNoAtencion1x1"
                                                    for="campoOtroMotivoNoAtencion1x1"
                                                    text="otro motivo no atenci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtroMotivoNoAtencion1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtroMotivoNoAtencion1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtroMotivoNoAtencion1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otro_motivo_no_atencion']}"
                                                    toolTip="BundleParametros.otro_motivo_no_atencion.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorOtroMotivoNoAtencion1.validate}"/>
                                                <webuijsf:staticText id="campoOtroMotivoNoAtencion1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtroMotivoNoAtencion1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otro_motivo_no_atencion']}"/>
                                                <webuijsf:message id="messageOtroMotivoNoAtencion1x1"
                                                    for="campoOtroMotivoNoAtencion1x1"/>
                                                <webuijsf:helpInline id="helpInlineOtroMotivoNoAtencion1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineOtroMotivoNoAtencion1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otro_motivo_no_atencion.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoCarnetVacunacion1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoCarnetVacunacion1x1}"
                                                    id="labelNumeroSionoCarnetVacunacion1x1"
                                                    for="listaNumeroSionoCarnetVacunacion1x1"
                                                    text="carnet vacunaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoCarnetVacunacion1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoCarnetVacunacion1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoCarnetVacunacion1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoCarnetVacunacion1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoCarnetVacunacion1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_carnet_vacunacion']}"
                                                    toolTip="BundleParametros.numero_siono_carnet_vacunacion.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoCarnetVacunacion1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoCarnetVacunacion1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x22y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoCarnetVacunacion1x1"
                                                    for="listaNumeroSionoCarnetVacunacion1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoCarnetVacunacion1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoCarnetVacunacion1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_carnet_vacunacion.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab6"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionSalud2Rendered}"
                                            text="salud 2">
                                        <h:panelGrid
                                            id="gridPanel126"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionSalud2Hidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab6"
                                                text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel127"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionSalud2Rendered}">
                                            <h:panelGrid
                                                id="gridNumeroClaseImpedimento1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroClaseImpedimento1x1}"
                                                    id="labelNumeroClaseImpedimento1x1"
                                                    for="listaNumeroClaseImpedimento1x1"
                                                    text="clase impedimento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroClaseImpedimento1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroClaseImpedimento1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroClaseImpedimento1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroClaseImpedimento1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroClaseImpedimento1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_clase_impedimento']}"
                                                    toolTip="BundleParametros.numero_clase_impedimento.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroClaseImpedimento1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroClaseImpedimento1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_clase_impediment_1x23y2']}"/>
                                                <webuijsf:message id="messageNumeroClaseImpedimento1x1"
                                                    for="listaNumeroClaseImpedimento1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroClaseImpedimento1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroClaseImpedimento1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_clase_impedimento.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraClaseImpedimento1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelOtraClaseImpedimento1x1}"
                                                    id="labelOtraClaseImpedimento1x1"
                                                    for="campoOtraClaseImpedimento1x1"
                                                    text="otra clase impedimento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraClaseImpedimento1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraClaseImpedimento1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtraClaseImpedimento1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otra_clase_impedimento']}"
                                                    toolTip="BundleParametros.otra_clase_impedimento.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorOtraClaseImpedimento1.validate}"/>
                                                <webuijsf:staticText id="campoOtraClaseImpedimento1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtraClaseImpedimento1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otra_clase_impedimento']}"/>
                                                <webuijsf:message id="messageOtraClaseImpedimento1x1"
                                                    for="campoOtraClaseImpedimento1x1"/>
                                                <webuijsf:helpInline id="helpInlineOtraClaseImpedimento1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineOtraClaseImpedimento1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_clase_impedimento.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCausaImpedimento1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroCausaImpedimento1x1}"
                                                    id="labelNumeroCausaImpedimento1x1"
                                                    for="listaNumeroCausaImpedimento1x1"
                                                    text="causa impedimento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCausaImpedimento1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroCausaImpedimento1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroCausaImpedimento1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroCausaImpedimento1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroCausaImpedimento1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_causa_impedimento']}"
                                                    toolTip="BundleParametros.numero_causa_impedimento.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroCausaImpedimento1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroCausaImpedimento1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_causa_impediment_1x24y2']}"/>
                                                <webuijsf:message id="messageNumeroCausaImpedimento1x1"
                                                    for="listaNumeroCausaImpedimento1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCausaImpedimento1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroCausaImpedimento1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_causa_impedimento.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtraCausaImpedimento1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelOtraCausaImpedimento1x1}"
                                                    id="labelOtraCausaImpedimento1x1"
                                                    for="campoOtraCausaImpedimento1x1"
                                                    text="otra causa impedimento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtraCausaImpedimento1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtraCausaImpedimento1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtraCausaImpedimento1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otra_causa_impedimento']}"
                                                    toolTip="BundleParametros.otra_causa_impedimento.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorOtraCausaImpedimento1.validate}"/>
                                                <webuijsf:staticText id="campoOtraCausaImpedimento1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtraCausaImpedimento1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otra_causa_impedimento']}"/>
                                                <webuijsf:message id="messageOtraCausaImpedimento1x1"
                                                    for="campoOtraCausaImpedimento1x1"/>
                                                <webuijsf:helpInline id="helpInlineOtraCausaImpedimento1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineOtraCausaImpedimento1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otra_causa_impedimento.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDifParaCaminar1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoDifParaCaminar1x1}"
                                                    id="labelNumeroSionoDifParaCaminar1x1"
                                                    for="listaNumeroSionoDifParaCaminar1x1"
                                                    text="dificultad para caminar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDifParaCaminar1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaCaminar1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaCaminar1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoDifParaCaminar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoDifParaCaminar1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_dif_para_caminar']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_caminar.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaCaminar1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaCaminar1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x25y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaCaminar1x1"
                                                    for="listaNumeroSionoDifParaCaminar1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDifParaCaminar1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoDifParaCaminar1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_dif_para_caminar.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDifParaVestirse1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoDifParaVestirse1x1}"
                                                    id="labelNumeroSionoDifParaVestirse1x1"
                                                    for="listaNumeroSionoDifParaVestirse1x1"
                                                    text="dificultad para vestirse"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDifParaVestirse1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaVestirse1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaVestirse1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoDifParaVestirse1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoDifParaVestirse1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_dif_para_vestirse']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_vestirse.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaVestirse1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaVestirse1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x26y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaVestirse1x1"
                                                    for="listaNumeroSionoDifParaVestirse1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDifParaVestirse1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoDifParaVestirse1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_dif_para_vestirse.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDifParaBanarse1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoDifParaBanarse1x1}"
                                                    id="labelNumeroSionoDifParaBanarse1x1"
                                                    for="listaNumeroSionoDifParaBanarse1x1"
                                                    text="dificultad para ba&#241;arse"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDifParaBanarse1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaBanarse1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaBanarse1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoDifParaBanarse1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoDifParaBanarse1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_dif_para_banarse']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_banarse.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaBanarse1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaBanarse1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x27y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaBanarse1x1"
                                                    for="listaNumeroSionoDifParaBanarse1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDifParaBanarse1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoDifParaBanarse1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_dif_para_banarse.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDifParaComer1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoDifParaComer1x1}"
                                                    id="labelNumeroSionoDifParaComer1x1"
                                                    for="listaNumeroSionoDifParaComer1x1"
                                                    text="dificultad para comer"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDifParaComer1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaComer1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaComer1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoDifParaComer1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoDifParaComer1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_dif_para_comer']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_comer.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaComer1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaComer1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x28y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaComer1x1"
                                                    for="listaNumeroSionoDifParaComer1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDifParaComer1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoDifParaComer1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_dif_para_comer.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDifParaLaCama1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoDifParaLaCama1x1}"
                                                    id="labelNumeroSionoDifParaLaCama1x1"
                                                    for="listaNumeroSionoDifParaLaCama1x1"
                                                    text="dificultad para la cama"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDifParaLaCama1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaLaCama1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaLaCama1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoDifParaLaCama1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoDifParaLaCama1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_dif_para_la_cama']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_la_cama.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaLaCama1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaLaCama1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x29y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaLaCama1x1"
                                                    for="listaNumeroSionoDifParaLaCama1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDifParaLaCama1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoDifParaLaCama1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_dif_para_la_cama.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDifParaElBano1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoDifParaElBano1x1}"
                                                    id="labelNumeroSionoDifParaElBano1x1"
                                                    for="listaNumeroSionoDifParaElBano1x1"
                                                    text="dificultad para el ba&#241;o"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDifParaElBano1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDifParaElBano1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaElBano1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoDifParaElBano1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoDifParaElBano1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_dif_para_el_bano']}"
                                                    toolTip="BundleParametros.numero_siono_dif_para_el_bano.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoDifParaElBano1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoDifParaElBano1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x30y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDifParaElBano1x1"
                                                    for="listaNumeroSionoDifParaElBano1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDifParaElBano1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoDifParaElBano1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_dif_para_el_bano.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab7"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionEmpleoRendered}"
                                            text="empleo">
                                        <h:panelGrid
                                            id="gridPanel128"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionEmpleoHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab7"
                                                text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel129"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionEmpleoRendered}">
                                            <h:panelGrid
                                                id="gridNumeroSionoTrabajo1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroSionoTrabajo1x1}"
                                                    id="labelNumeroSionoTrabajo1x1"
                                                    for="listaNumeroSionoTrabajo1x1"
                                                    text="trabajo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoTrabajo1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoTrabajo1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoTrabajo1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroSionoTrabajo1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroSionoTrabajo1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_siono_trabajo']}"
                                                    toolTip="BundleParametros.numero_siono_trabajo.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroSionoTrabajo1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroSionoTrabajo1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_siono_1x31y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoTrabajo1x1"
                                                    for="listaNumeroSionoTrabajo1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoTrabajo1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroSionoTrabajo1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_trabajo.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroMotivoNoTrabajo1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroMotivoNoTrabajo1x1}"
                                                    id="labelNumeroMotivoNoTrabajo1x1"
                                                    for="listaNumeroMotivoNoTrabajo1x1"
                                                    text="motivo no trabajo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroMotivoNoTrabajo1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroMotivoNoTrabajo1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroMotivoNoTrabajo1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroMotivoNoTrabajo1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroMotivoNoTrabajo1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_motivo_no_trabajo']}"
                                                    toolTip="BundleParametros.numero_motivo_no_trabajo.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroMotivoNoTrabajo1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroMotivoNoTrabajo1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_motivo_no_trabaj_1x32y2']}"/>
                                                <webuijsf:message id="messageNumeroMotivoNoTrabajo1x1"
                                                    for="listaNumeroMotivoNoTrabajo1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroMotivoNoTrabajo1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroMotivoNoTrabajo1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_motivo_no_trabajo.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtroMotivoNoTrabajo1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelOtroMotivoNoTrabajo1x1}"
                                                    id="labelOtroMotivoNoTrabajo1x1"
                                                    for="campoOtroMotivoNoTrabajo1x1"
                                                    text="otro motivo no trabajo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtroMotivoNoTrabajo1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtroMotivoNoTrabajo1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtroMotivoNoTrabajo1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otro_motivo_no_trabajo']}"
                                                    toolTip="BundleParametros.otro_motivo_no_trabajo.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorOtroMotivoNoTrabajo1.validate}"/>
                                                <webuijsf:staticText id="campoOtroMotivoNoTrabajo1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoOtroMotivoNoTrabajo1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['otro_motivo_no_trabajo']}"/>
                                                <webuijsf:message id="messageOtroMotivoNoTrabajo1x1"
                                                    for="campoOtroMotivoNoTrabajo1x1"/>
                                                <webuijsf:helpInline id="helpInlineOtroMotivoNoTrabajo1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineOtroMotivoNoTrabajo1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otro_motivo_no_trabajo.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDescripcionOcupacionPrin1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelDescripcionOcupacionPrin1x1}"
                                                    id="labelDescripcionOcupacionPrin1x1"
                                                    for="campoDescripcionOcupacionPrin1x1"
                                                    text="descripci&#243;n ocupaci&#243;n principal"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDescripcionOcupacionPrin1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoDescripcionOcupacionPrin1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoDescripcionOcupacionPrin1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['descripcion_ocupacion_prin']}"
                                                    toolTip="BundleParametros.descripcion_ocupacion_prin.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorDescripcionOcupacionPrin1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionOcupacionPrin1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoDescripcionOcupacionPrin1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['descripcion_ocupacion_prin']}"/>
                                                <webuijsf:message id="messageDescripcionOcupacionPrin1x1"
                                                    for="campoDescripcionOcupacionPrin1x1"/>
                                                <webuijsf:helpInline id="helpInlineDescripcionOcupacionPrin1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineDescripcionOcupacionPrin1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.descripcion_ocupacion_prin.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDescripcionDedicacionPrin1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelDescripcionDedicacionPrin1x1}"
                                                    id="labelDescripcionDedicacionPrin1x1"
                                                    for="campoDescripcionDedicacionPrin1x1"
                                                    text="descripci&#243;n dedicaci&#243;n principal"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDescripcionDedicacionPrin1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoDescripcionDedicacionPrin1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoDescripcionDedicacionPrin1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['descripcion_dedicacion_prin']}"
                                                    toolTip="BundleParametros.descripcion_dedicacion_prin.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorDescripcionDedicacionPrin1.validate}"/>
                                                <webuijsf:staticText id="campoDescripcionDedicacionPrin1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoDescripcionDedicacionPrin1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['descripcion_dedicacion_prin']}"/>
                                                <webuijsf:message id="messageDescripcionDedicacionPrin1x1"
                                                    for="campoDescripcionDedicacionPrin1x1"/>
                                                <webuijsf:helpInline id="helpInlineDescripcionDedicacionPrin1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineDescripcionDedicacionPrin1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.descripcion_dedicacion_prin.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoRelacionLab1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelNumeroTipoRelacionLab1x1}"
                                                    id="labelNumeroTipoRelacionLab1x1"
                                                    for="listaNumeroTipoRelacionLab1x1"
                                                    text="tipo relaci&#243;n laboral"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoRelacionLab1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoRelacionLab1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoRelacionLab1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterNumeroTipoRelacionLab1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    items="#{FichaPersonaPorFichaHogar2.asistente.opcionesListaNumeroTipoRelacionLab1}"
                                                    selected="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['numero_tipo_relacion_lab']}"
                                                    toolTip="BundleParametros.numero_tipo_relacion_lab.ficha_persona"/>
                                                <webuijsf:staticText id="listaNumeroTipoRelacionLab1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.listaNumeroTipoRelacionLab1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_tipo_relacion_la_1x33y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoRelacionLab1x1"
                                                    for="listaNumeroTipoRelacionLab1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoRelacionLab1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineNumeroTipoRelacionLab1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_relacion_lab.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab8"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionIngresosRendered}"
                                            text="ingresos">
                                        <h:panelGrid
                                            id="gridPanel130"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionIngresosHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab8"
                                                text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel131"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionIngresosRendered}">
                                            <h:panelGrid
                                                id="gridMontoIngresoOcupacionPrin1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoOcupacionPrin1x1}"
                                                    id="labelMontoIngresoOcupacionPrin1x1"
                                                    for="campoMontoIngresoOcupacionPrin1x1"
                                                    text="monto ingreso ocupaci&#243;n principal"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoOcupacionPrin1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoOcupacionPrin1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoOcupacionPrin1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoOcupacionPrin1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_ocupacion_prin']}"
                                                    toolTip="BundleParametros.monto_ingreso_ocupacion_prin.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoOcupacionPrin1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoOcupacionPrin1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoOcupacionPrin1x1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoOcupacionPrin1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_ocupacion_prin']}"/>
                                                <webuijsf:message id="messageMontoIngresoOcupacionPrin1x1"
                                                    for="campoMontoIngresoOcupacionPrin1x1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoOcupacionPrin1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoOcupacionPrin1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_ocupacion_prin.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoOcupacionSecun1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoOcupacionSecun1x1}"
                                                    id="labelMontoIngresoOcupacionSecun1x1"
                                                    for="campoMontoIngresoOcupacionSecun1x1"
                                                    text="monto ingreso ocupaci&#243;n secundaria"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoOcupacionSecun1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoOcupacionSecun1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoOcupacionSecun1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoOcupacionSecun1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_ocupacion_secun']}"
                                                    toolTip="BundleParametros.monto_ingreso_ocupacion_secun.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoOcupacionSecun1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoOcupacionSecun1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoOcupacionSecun1x1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoOcupacionSecun1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_ocupacion_secun']}"/>
                                                <webuijsf:message id="messageMontoIngresoOcupacionSecun1x1"
                                                    for="campoMontoIngresoOcupacionSecun1x1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoOcupacionSecun1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoOcupacionSecun1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_ocupacion_secun.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoOtrasOcup1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoOtrasOcup1x1}"
                                                    id="labelMontoIngresoOtrasOcup1x1"
                                                    for="campoMontoIngresoOtrasOcup1x1"
                                                    text="monto ingreso otras ocupaciones"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoOtrasOcup1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoOtrasOcup1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoOtrasOcup1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoOtrasOcup1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_otras_ocup']}"
                                                    toolTip="BundleParametros.monto_ingreso_otras_ocup.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoOtrasOcup1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoOtrasOcup1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoOtrasOcup1x1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoOtrasOcup1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_otras_ocup']}"/>
                                                <webuijsf:message id="messageMontoIngresoOtrasOcup1x1"
                                                    for="campoMontoIngresoOtrasOcup1x1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoOtrasOcup1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoOtrasOcup1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_otras_ocup.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoAlquileres1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoAlquileres1x1}"
                                                    id="labelMontoIngresoAlquileres1x1"
                                                    for="campoMontoIngresoAlquileres1x1"
                                                    text="monto ingreso alquileres"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoAlquileres1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoAlquileres1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoAlquileres1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoAlquileres1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_alquileres']}"
                                                    toolTip="BundleParametros.monto_ingreso_alquileres.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoAlquileres1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoAlquileres1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoAlquileres1x1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoAlquileres1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_alquileres']}"/>
                                                <webuijsf:message id="messageMontoIngresoAlquileres1x1"
                                                    for="campoMontoIngresoAlquileres1x1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoAlquileres1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoAlquileres1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_alquileres.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoIntereses1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoIntereses1x1}"
                                                    id="labelMontoIngresoIntereses1x1"
                                                    for="campoMontoIngresoIntereses1x1"
                                                    text="monto ingreso intereses"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoIntereses1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoIntereses1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoIntereses1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoIntereses1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_intereses']}"
                                                    toolTip="BundleParametros.monto_ingreso_intereses.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoIntereses1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoIntereses1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoIntereses1x1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoIntereses1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_intereses']}"/>
                                                <webuijsf:message id="messageMontoIngresoIntereses1x1"
                                                    for="campoMontoIngresoIntereses1x1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoIntereses1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoIntereses1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_intereses.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoAyudaFamPais1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoAyudaFamPais1x1}"
                                                    id="labelMontoIngresoAyudaFamPais1x1"
                                                    for="campoMontoIngresoAyudaFamPais1x1"
                                                    text="monto ingreso ayuda familiar pais"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoAyudaFamPais1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoAyudaFamPais1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoAyudaFamPais1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoAyudaFamPais1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_ayuda_fam_pais']}"
                                                    toolTip="BundleParametros.monto_ingreso_ayuda_fam_pais.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoAyudaFamPais1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoAyudaFamPais1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoAyudaFamPais1x1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoAyudaFamPais1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_ayuda_fam_pais']}"/>
                                                <webuijsf:message id="messageMontoIngresoAyudaFamPais1x1"
                                                    for="campoMontoIngresoAyudaFamPais1x1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoAyudaFamPais1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoAyudaFamPais1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_ayuda_fam_pais.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoAyudaFamExter1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoAyudaFamExter1x1}"
                                                    id="labelMontoIngresoAyudaFamExter1x1"
                                                    for="campoMontoIngresoAyudaFamExter1x1"
                                                    text="monto ingreso ayuda familiar exterior"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoAyudaFamExter1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoAyudaFamExter1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoAyudaFamExter1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoAyudaFamExter1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_ayuda_fam_exter']}"
                                                    toolTip="BundleParametros.monto_ingreso_ayuda_fam_exter.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoAyudaFamExter1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoAyudaFamExter1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoAyudaFamExter1x1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoAyudaFamExter1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_ayuda_fam_exter']}"/>
                                                <webuijsf:message id="messageMontoIngresoAyudaFamExter1x1"
                                                    for="campoMontoIngresoAyudaFamExter1x1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoAyudaFamExter1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoAyudaFamExter1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_ayuda_fam_exter.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoJubilacion1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoJubilacion1x1}"
                                                    id="labelMontoIngresoJubilacion1x1"
                                                    for="campoMontoIngresoJubilacion1x1"
                                                    text="monto ingreso jubilaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoJubilacion1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoJubilacion1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoJubilacion1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoJubilacion1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_jubilacion']}"
                                                    toolTip="BundleParametros.monto_ingreso_jubilacion.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoJubilacion1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoJubilacion1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoJubilacion1x1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoJubilacion1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_jubilacion']}"/>
                                                <webuijsf:message id="messageMontoIngresoJubilacion1x1"
                                                    for="campoMontoIngresoJubilacion1x1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoJubilacion1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoJubilacion1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_jubilacion.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoPensiones1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoPensiones1x1}"
                                                    id="labelMontoIngresoPensiones1x1"
                                                    for="campoMontoIngresoPensiones1x1"
                                                    text="monto ingreso pensiones"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoPensiones1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoPensiones1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoPensiones1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoPensiones1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_pensiones']}"
                                                    toolTip="BundleParametros.monto_ingreso_pensiones.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoPensiones1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoPensiones1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoPensiones1x1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoPensiones1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_pensiones']}"/>
                                                <webuijsf:message id="messageMontoIngresoPensiones1x1"
                                                    for="campoMontoIngresoPensiones1x1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoPensiones1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoPensiones1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_pensiones.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoTekopora1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoTekopora1x1}"
                                                    id="labelMontoIngresoTekopora1x1"
                                                    for="campoMontoIngresoTekopora1x1"
                                                    text="monto ingreso tekopora"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoTekopora1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoTekopora1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoTekopora1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoTekopora1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_tekopora']}"
                                                    toolTip="BundleParametros.monto_ingreso_tekopora.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoTekopora1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoTekopora1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoTekopora1x1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoTekopora1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_tekopora']}"/>
                                                <webuijsf:message id="messageMontoIngresoTekopora1x1"
                                                    for="campoMontoIngresoTekopora1x1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoTekopora1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoTekopora1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_tekopora.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoProgramas1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoProgramas1x1}"
                                                    id="labelMontoIngresoProgramas1x1"
                                                    for="campoMontoIngresoProgramas1x1"
                                                    text="monto ingreso programas"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoProgramas1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoProgramas1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoProgramas1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoProgramas1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_programas']}"
                                                    toolTip="BundleParametros.monto_ingreso_programas.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoProgramas1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoProgramas1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoProgramas1x1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoProgramas1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_programas']}"/>
                                                <webuijsf:message id="messageMontoIngresoProgramas1x1"
                                                    for="campoMontoIngresoProgramas1x1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoProgramas1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoProgramas1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_programas.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridMontoIngresoAdicional1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelMontoIngresoAdicional1x1}"
                                                    id="labelMontoIngresoAdicional1x1"
                                                    for="campoMontoIngresoAdicional1x1"
                                                    text="monto ingreso adicional"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridMontoIngresoAdicional1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoMontoIngresoAdicional1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoAdicional1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoAdicional1}"
                                                    readOnly="#{FichaPersonaPorFichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_adicional']}"
                                                    toolTip="BundleParametros.monto_ingreso_adicional.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorMontoIngresoAdicional1.validate}"/>
                                                <webuijsf:staticText id="campoMontoIngresoAdicional1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoMontoIngresoAdicional1x1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterMontoIngresoAdicional1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['monto_ingreso_adicional']}"/>
                                                <webuijsf:message id="messageMontoIngresoAdicional1x1"
                                                    for="campoMontoIngresoAdicional1x1"/>
                                                <webuijsf:helpInline id="helpInlineMontoIngresoAdicional1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineMontoIngresoAdicional1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.monto_ingreso_adicional.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridTotalIngresoMensual1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelTotalIngresoMensual1x1}"
                                                    id="labelTotalIngresoMensual1x1"
                                                    for="campoTotalIngresoMensual1x1"
                                                    text="total ingreso mensual"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridTotalIngresoMensual1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoTotalIngresoMensual1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoTotalIngresoMensual1x1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterTotalIngresoMensual1}"
                                                    readOnly="true"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['total_ingreso_mensual']}"
                                                    toolTip="BundleParametros.total_ingreso_mensual.ficha_persona"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.validatorTotalIngresoMensual1.validate}"/>
                                                <webuijsf:staticText id="campoTotalIngresoMensual1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoTotalIngresoMensual1x1Texto1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterTotalIngresoMensual1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['total_ingreso_mensual']}"/>
                                                <webuijsf:message id="messageTotalIngresoMensual1x1"
                                                    for="campoTotalIngresoMensual1x1"/>
                                                <webuijsf:helpInline id="helpInlineTotalIngresoMensual1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineTotalIngresoMensual1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.total_ingreso_mensual.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab9"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionOtrosRendered}"
                                            text="otros">
                                        <h:panelGrid
                                            id="gridPanel132"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionOtrosHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab9"
                                                text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel133"
                                            rendered="#{FichaPersonaPorFichaHogar2.asistente.seccionOtrosRendered}">
                                            <h:panelGrid
                                                id="gridIdPotencialBen1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelIdPotencialBen1x1}"
                                                    id="labelIdPotencialBen1x1"
                                                    for="campoIdPotencialBen1x1"
                                                    text="potencial beneficiario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPotencialBen1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdPotencialBen1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdPotencialBen1x1}"
                                                    readOnly="true"
                                                    text="#{FichaPersonaPorFichaHogar2.asistente.textoCampoIdPotencialBen1}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.asistente.toolTipCampoIdPotencialBen1}"
                                                    validatorExpression="#{FichaPersonaPorFichaHogar2.campoIdPotencialBen1_validate}"/>
                                                <webuijsf:staticText id="campoIdPotencialBen1x1Texto1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdPotencialBen1x1Texto1}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['codigo_potencial_ben_1x34y3']}"/>
                                                <webuijsf:button id="campoIdPotencialBen1x1Boton1"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdPotencialBen1x1Boton1}"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdPotencialBen1Boton1}"/>
                                                <webuijsf:button id="campoIdPotencialBen1x1Boton3"
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdPotencialBen1x1Boton3}"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdPotencialBen1Boton2}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.asistente.campoIdPotencialBen1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdPotencialBen1x1"
                                                    for="campoIdPotencialBen1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdPotencialBen1x1"
                                                    binding="#{FichaPersonaPorFichaHogar2.helpInlineIdPotencialBen1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_potencial_ben.ficha_persona"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdPotencialBen1x3"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.campoIdPotencialBen1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaPersonaPorFichaHogar2.labelIdPotencialBen1x2}"
                                                    id="labelIdPotencialBen1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre potencial beneficiario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdPotencialBen1x4"
                                                rendered="#{FichaPersonaPorFichaHogar2.asistente.campoIdPotencialBen1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdPotencialBen1x1Texto2}"
                                                    text="#{FichaPersonaPorFichaHogar2.fichaPersonaDataProvider.value['nombre_potencial_ben_1x34y4']}"
                                                    id="campoIdPotencialBen1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaPersonaPorFichaHogar2.campoIdPotencialBen1x1Boton2}"
                                                    id="campoIdPotencialBen1x1Boton2"
                                                    onClick="#{FichaPersonaPorFichaHogar2.asistente.scriptCampoIdPotencialBen1Boton2}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        </webuijsf:tabSet>
                                        <h:panelGrid
                                            id="gridPanel134"
                                            styleClass="pdq-grid-detalle-pie">
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel135">
                                            <h:panelGrid
                                                id="gridPanel136"
                                                styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid 
                                                    columns="7"
                                                    id="gridPanel137">
                                                    <webuijsf:button
                                                        actionExpression="#{FichaPersonaPorFichaHogar2.botonIrAlPrimero2_action}"
                                                        binding="#{FichaPersonaPorFichaHogar2.botonIrAlPrimero2}"
                                                        disabled="#{FichaPersonaPorFichaHogar2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{FichaPersonaPorFichaHogar2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptIrAlPrimero}"
                                                        text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FichaPersonaPorFichaHogar2.botonIrAlAnterior2_action}"
                                                        binding="#{FichaPersonaPorFichaHogar2.botonIrAlAnterior2}"
                                                        disabled="#{FichaPersonaPorFichaHogar2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{FichaPersonaPorFichaHogar2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptIrAlAnterior}"
                                                        text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FichaPersonaPorFichaHogar2.botonIrAlSiguiente2_action}"
                                                        binding="#{FichaPersonaPorFichaHogar2.botonIrAlSiguiente2}"
                                                        disabled="#{FichaPersonaPorFichaHogar2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{FichaPersonaPorFichaHogar2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptIrAlSiguiente}"
                                                        text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FichaPersonaPorFichaHogar2.botonIrAlUltimo2_action}"
                                                        binding="#{FichaPersonaPorFichaHogar2.botonIrAlUltimo2}"
                                                        disabled="#{FichaPersonaPorFichaHogar2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{FichaPersonaPorFichaHogar2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptIrAlUltimo}"
                                                        text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FichaPersonaPorFichaHogar2.botonProcesarFila2_action}"
                                                        binding="#{FichaPersonaPorFichaHogar2.botonProcesarFila2}"
                                                        disabled="#{FichaPersonaPorFichaHogar2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{FichaPersonaPorFichaHogar2.gestor.urlImagenProcesar}"
                                                        onClick="#{FichaPersonaPorFichaHogar2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{FichaPersonaPorFichaHogar2.asistente.comandoDisponible}"
                                                        text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel138"
                                                styleClass="pdq-grid-detalle-mensajes">
                                                <h:panelGrid
                                                    id="gridPanel139"
                                                    styleClass="pdq-grid-detalle-mensajes-2">
                                                    <webuijsf:staticText
                                                        id="textoMensajeCambiosPorConfirmar1"
                                                        style="font-weight: bold"
                                                        text="#{FichaPersonaPorFichaHogar2.gestor.mensajeCambiosPorConfirmar}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid 
                                            id="gridPanel140">
                                            <h:panelGrid 
                                                id="gridPanel141">
                                                <webuijsf:anchor 
                                                    id="anchor1"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel142">
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar2.botonAgregar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar2.botonAgregar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptAgregar}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FichaPersonaPorFichaHogar2.listaFuncionEdicion1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterListaFuncionEdicion1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{FichaPersonaPorFichaHogar2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{FichaPersonaPorFichaHogar2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{FichaPersonaPorFichaHogar2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar2.botonEditar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar2.botonEditar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptEditar}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar2.botonEliminar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar2.botonEliminar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptEliminar}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar2.botonAplicar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptAplicar}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar2.botonDeshacer1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptDeshacer}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar2.botonConfirmar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptConfirmar}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar2.botonDescartar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptDescartar}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FichaPersonaPorFichaHogar2.listaFuncionAccion1}"
                                                    converter="#{FichaPersonaPorFichaHogar2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{FichaPersonaPorFichaHogar2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{FichaPersonaPorFichaHogar2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{FichaPersonaPorFichaHogar2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar2.botonProcesar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptProcesar}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar2.botonRefrescar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar2.botonRefrescar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptRefrescar}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar2.botonReconsultar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar2.botonReconsultar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptReconsultar}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaPersonaPorFichaHogar2.botonRetornar1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar2.botonRetornar1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{FichaPersonaPorFichaHogar2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaPersonaPorFichaHogar2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{FichaPersonaPorFichaHogar2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel143"
                                                rendered="#{FichaPersonaPorFichaHogar2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{FichaPersonaPorFichaHogar2.imageHyperlink1_action}"
                                                    binding="#{FichaPersonaPorFichaHogar2.imageHyperlink1}"
                                                    disabled="#{FichaPersonaPorFichaHogar2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{FichaPersonaPorFichaHogar2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FichaPersonaPorFichaHogar2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{FichaPersonaPorFichaHogar2.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.FichaPersonaPorFichaHogar2_imageHyperlink1_toolTip}"/>
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
