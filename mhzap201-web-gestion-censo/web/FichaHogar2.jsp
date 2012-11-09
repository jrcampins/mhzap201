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
                    focus="#{FichaHogar2.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{FichaHogar2.gestor.preserveFocus}"
                    preserveScroll="#{FichaHogar2.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{FichaHogar2.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdFichaHogar1 campoCodigoFichaHogar1 campoFechaEntrevista1 campoIdFuncionarioCensista1 campoIdFuncionarioSupervisor1 campoIdFuncionarioCriticoDeco1 campoIdFuncionarioDigitador1 campoObservaciones1 campoHusoUtm1 campoFranjaUtm1 campoDistanciaEsteUtm1 campoDistanciaNorteUtm1 campoNumeroFormulario1 campoNumeroVivienda1 campoNumeroHogar1 campoIdDepartamento1 campoIdDistrito1 listaNumeroTipoArea1 campoIdBarrio1 campoManzana1 campoDireccion1 campoTotalPersonas1 campoTotalHombres1 campoTotalMujeres1 listaNumeroTipoMatParedes1 listaNumeroTipoMatPiso1 listaNumeroTipoMatTecho1 listaNumeroTipoOcupacionViv1 campoOtroTipoOcupacionViv1 campoCantidadPiezas1 campoCantidadDormitorios1 listaNumeroSionoPiezaCocina1 listaNumeroTipoCombustible1 listaNumeroTipoPiezaBano1 listaNumeroTipoServicioSan1 listaNumeroTipoServicioAgua1 listaNumeroTipoAbaAgua1 listaNumeroSionoCorrienteElec1 listaNumeroTipoDesechoBas1 listaNumeroSionoTelefonoCelular1 campoNumeroTelefonoCelular1 listaNumeroSionoTlfLineaBaja1 campoNumeroTelefonoLineaBaja1 listaNumeroSionoDispHeladera1 listaNumeroSionoDispLavarropas1 listaNumeroSionoDispTermo1 listaNumeroSionoDispAireAcon1 listaNumeroSionoDispAutomovil1 listaNumeroSionoDispCamion1 listaNumeroSionoDispMotocicleta1 campoNombreJefeHogar1 campoNumeroCedulaJefeHogar1 campoLetraCedulaJefeHogar1 campoNumeroOrdenIdenJefeHogar1 campoNombreRespondente1 campoNumeroCedulaRespondente1 campoLetraCedulaRespondente1 campoNumeroOrdenIdenRespondente1 campoIdProveedorDatExt1 campoIndiceCalidadVida1 listaEsFichaHogarInactiva1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{FichaHogar2.breadcrumbs1}" 
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
                                                    rendered="#{FichaHogar2.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{FichaHogar2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{FichaHogar2.gestor.mensajeDisponible}"
                                                    text="#{FichaHogar2.gestor.mensaje}"
                                                    url="#{FichaHogar2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{FichaHogar2.gestor.filaDisponible}"
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
                                                        actionExpression="#{FichaHogar2.botonIrAlPrimero1_action}"
                                                        binding="#{FichaHogar2.botonIrAlPrimero1}"
                                                        disabled="#{FichaHogar2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{FichaHogar2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{FichaHogar2.gestor.scriptIrAlPrimero}"
                                                        text="#{FichaHogar2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FichaHogar2.botonIrAlAnterior1_action}"
                                                        binding="#{FichaHogar2.botonIrAlAnterior1}"
                                                        disabled="#{FichaHogar2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{FichaHogar2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{FichaHogar2.gestor.scriptIrAlAnterior}"
                                                        text="#{FichaHogar2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FichaHogar2.botonIrAlSiguiente1_action}"
                                                        binding="#{FichaHogar2.botonIrAlSiguiente1}"
                                                        disabled="#{FichaHogar2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{FichaHogar2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{FichaHogar2.gestor.scriptIrAlSiguiente}"
                                                        text="#{FichaHogar2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FichaHogar2.botonIrAlUltimo1_action}"
                                                        binding="#{FichaHogar2.botonIrAlUltimo1}"
                                                        disabled="#{FichaHogar2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{FichaHogar2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{FichaHogar2.gestor.scriptIrAlUltimo}"
                                                        text="#{FichaHogar2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FichaHogar2.botonProcesarFila1_action}"
                                                        binding="#{FichaHogar2.botonProcesarFila1}"
                                                        disabled="#{FichaHogar2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{FichaHogar2.gestor.urlImagenProcesar}"
                                                        onClick="#{FichaHogar2.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{FichaHogar2.asistente.comandoDisponible}"
                                                        text="#{FichaHogar2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{FichaHogar2.gestor.tituloConsulta}"/>
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
                                                    binding="#{FichaHogar2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{FichaHogar2.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{FichaHogar2.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{FichaHogar2.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{FichaHogar2.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{FichaHogar2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{FichaHogar2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{FichaHogar2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFichaHogar1" rendered="false"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFichaHogar1}"
                                                    id="labelIdFichaHogar1"
                                                    for="campoIdFichaHogar1"
                                                    text="id"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFichaHogar2" rendered="false"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFichaHogar1"
                                                    binding="#{FichaHogar2.campoIdFichaHogar1}"
                                                    converter="#{FichaHogar2.converterIdFichaHogar1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['id_ficha_hogar']}"
                                                    toolTip="BundleParametros.id_ficha_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorIdFichaHogar1.validate}"/>
                                                <webuijsf:staticText id="campoIdFichaHogar1Texto1"
                                                    binding="#{FichaHogar2.campoIdFichaHogar1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['id_ficha_hogar']}"/>
                                                <webuijsf:message id="messageIdFichaHogar1"
                                                    for="campoIdFichaHogar1"/>
                                                <webuijsf:helpInline id="helpInlineIdFichaHogar1"
                                                    binding="#{FichaHogar2.helpInlineIdFichaHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_ficha_hogar.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoFichaHogar1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelCodigoFichaHogar1}"
                                                    id="labelCodigoFichaHogar1"
                                                    for="campoCodigoFichaHogar1"
                                                    text="codigo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoFichaHogar2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoFichaHogar1"
                                                    binding="#{FichaHogar2.campoCodigoFichaHogar1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_ficha_hogar']}"
                                                    toolTip="BundleParametros.codigo_ficha_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorCodigoFichaHogar1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoFichaHogar1Texto1"
                                                    binding="#{FichaHogar2.campoCodigoFichaHogar1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_ficha_hogar']}"/>
                                                <webuijsf:message id="messageCodigoFichaHogar1"
                                                    for="campoCodigoFichaHogar1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoFichaHogar1"
                                                    binding="#{FichaHogar2.helpInlineCodigoFichaHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_ficha_hogar.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioCensista1"
                                                rendered="#{FichaHogar2.asistente.gridIdFuncionarioCensistaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFuncionarioCensista1}"
                                                    id="labelIdFuncionarioCensista1"
                                                    for="campoIdFuncionarioCensista1"
                                                    text="funcionario censista"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioCensista2"
                                                rendered="#{FichaHogar2.asistente.gridIdFuncionarioCensistaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionarioCensista1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioCensista1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.asistente.textoCampoIdFuncionarioCensista1}"
                                                    toolTip="#{FichaHogar2.asistente.toolTipCampoIdFuncionarioCensista1}"
                                                    validatorExpression="#{FichaHogar2.campoIdFuncionarioCensista1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioCensista1Texto1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioCensista1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_funcionario_1x1y3']}"/>
                                                <webuijsf:button id="campoIdFuncionarioCensista1Boton1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioCensista1Boton1}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioCensista1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionarioCensista1Boton3"
                                                    binding="#{FichaHogar2.campoIdFuncionarioCensista1Boton3}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioCensista1Boton2}"
                                                    rendered="#{FichaHogar2.asistente.campoIdFuncionarioCensista1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionarioCensista1"
                                                    for="campoIdFuncionarioCensista1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionarioCensista1"
                                                    binding="#{FichaHogar2.helpInlineIdFuncionarioCensista1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcionario_censista.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioCensista3"
                                                rendered="#{FichaHogar2.asistente.campoIdFuncionarioCensista1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFuncionarioCensista2}"
                                                    id="labelIdFuncionarioCensista2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcionario censista"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioCensista4"
                                                rendered="#{FichaHogar2.asistente.campoIdFuncionarioCensista1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaHogar2.campoIdFuncionarioCensista1Texto2}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_funcionario_1x1y4']}"
                                                    id="campoIdFuncionarioCensista1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar2.campoIdFuncionarioCensista1Boton2}"
                                                    id="campoIdFuncionarioCensista1Boton2"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioCensista1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioSupervisor1"
                                                rendered="#{FichaHogar2.asistente.gridIdFuncionarioSupervisorRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFuncionarioSupervisor1}"
                                                    id="labelIdFuncionarioSupervisor1"
                                                    for="campoIdFuncionarioSupervisor1"
                                                    text="funcionario supervisor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioSupervisor2"
                                                rendered="#{FichaHogar2.asistente.gridIdFuncionarioSupervisorRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionarioSupervisor1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioSupervisor1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.asistente.textoCampoIdFuncionarioSupervisor1}"
                                                    toolTip="#{FichaHogar2.asistente.toolTipCampoIdFuncionarioSupervisor1}"
                                                    validatorExpression="#{FichaHogar2.campoIdFuncionarioSupervisor1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioSupervisor1Texto1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioSupervisor1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_funcionario_1x2y3']}"/>
                                                <webuijsf:button id="campoIdFuncionarioSupervisor1Boton1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioSupervisor1Boton1}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioSupervisor1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionarioSupervisor1Boton3"
                                                    binding="#{FichaHogar2.campoIdFuncionarioSupervisor1Boton3}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioSupervisor1Boton2}"
                                                    rendered="#{FichaHogar2.asistente.campoIdFuncionarioSupervisor1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionarioSupervisor1"
                                                    for="campoIdFuncionarioSupervisor1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionarioSupervisor1"
                                                    binding="#{FichaHogar2.helpInlineIdFuncionarioSupervisor1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcionario_supervisor.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioSupervisor3"
                                                rendered="#{FichaHogar2.asistente.campoIdFuncionarioSupervisor1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFuncionarioSupervisor2}"
                                                    id="labelIdFuncionarioSupervisor2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcionario supervisor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioSupervisor4"
                                                rendered="#{FichaHogar2.asistente.campoIdFuncionarioSupervisor1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaHogar2.campoIdFuncionarioSupervisor1Texto2}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_funcionario_1x2y4']}"
                                                    id="campoIdFuncionarioSupervisor1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar2.campoIdFuncionarioSupervisor1Boton2}"
                                                    id="campoIdFuncionarioSupervisor1Boton2"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioSupervisor1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioCriticoDeco1"
                                                rendered="#{FichaHogar2.asistente.gridIdFuncionarioCriticoDecoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFuncionarioCriticoDeco1}"
                                                    id="labelIdFuncionarioCriticoDeco1"
                                                    for="campoIdFuncionarioCriticoDeco1"
                                                    text="funcionario critico deco"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioCriticoDeco2"
                                                rendered="#{FichaHogar2.asistente.gridIdFuncionarioCriticoDecoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionarioCriticoDeco1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioCriticoDeco1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.asistente.textoCampoIdFuncionarioCriticoDeco1}"
                                                    toolTip="#{FichaHogar2.asistente.toolTipCampoIdFuncionarioCriticoDeco1}"
                                                    validatorExpression="#{FichaHogar2.campoIdFuncionarioCriticoDeco1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioCriticoDeco1Texto1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioCriticoDeco1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_funcionario_1x3y3']}"/>
                                                <webuijsf:button id="campoIdFuncionarioCriticoDeco1Boton1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioCriticoDeco1Boton1}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioCriticoDeco1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionarioCriticoDeco1Boton3"
                                                    binding="#{FichaHogar2.campoIdFuncionarioCriticoDeco1Boton3}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioCriticoDeco1Boton2}"
                                                    rendered="#{FichaHogar2.asistente.campoIdFuncionarioCriticoDeco1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionarioCriticoDeco1"
                                                    for="campoIdFuncionarioCriticoDeco1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionarioCriticoDeco1"
                                                    binding="#{FichaHogar2.helpInlineIdFuncionarioCriticoDeco1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcionario_critico_deco.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioCriticoDeco3"
                                                rendered="#{FichaHogar2.asistente.campoIdFuncionarioCriticoDeco1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFuncionarioCriticoDeco2}"
                                                    id="labelIdFuncionarioCriticoDeco2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcionario critico deco"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioCriticoDeco4"
                                                rendered="#{FichaHogar2.asistente.campoIdFuncionarioCriticoDeco1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaHogar2.campoIdFuncionarioCriticoDeco1Texto2}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_funcionario_1x3y4']}"
                                                    id="campoIdFuncionarioCriticoDeco1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar2.campoIdFuncionarioCriticoDeco1Boton2}"
                                                    id="campoIdFuncionarioCriticoDeco1Boton2"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioCriticoDeco1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioDigitador1"
                                                rendered="#{FichaHogar2.asistente.gridIdFuncionarioDigitadorRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFuncionarioDigitador1}"
                                                    id="labelIdFuncionarioDigitador1"
                                                    for="campoIdFuncionarioDigitador1"
                                                    text="funcionario digitador"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioDigitador2"
                                                rendered="#{FichaHogar2.asistente.gridIdFuncionarioDigitadorRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionarioDigitador1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioDigitador1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.asistente.textoCampoIdFuncionarioDigitador1}"
                                                    toolTip="#{FichaHogar2.asistente.toolTipCampoIdFuncionarioDigitador1}"
                                                    validatorExpression="#{FichaHogar2.campoIdFuncionarioDigitador1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioDigitador1Texto1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioDigitador1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_funcionario_1x4y3']}"/>
                                                <webuijsf:button id="campoIdFuncionarioDigitador1Boton1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioDigitador1Boton1}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioDigitador1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionarioDigitador1Boton3"
                                                    binding="#{FichaHogar2.campoIdFuncionarioDigitador1Boton3}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioDigitador1Boton2}"
                                                    rendered="#{FichaHogar2.asistente.campoIdFuncionarioDigitador1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionarioDigitador1"
                                                    for="campoIdFuncionarioDigitador1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionarioDigitador1"
                                                    binding="#{FichaHogar2.helpInlineIdFuncionarioDigitador1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcionario_digitador.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioDigitador3"
                                                rendered="#{FichaHogar2.asistente.campoIdFuncionarioDigitador1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFuncionarioDigitador2}"
                                                    id="labelIdFuncionarioDigitador2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcionario digitador"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioDigitador4"
                                                rendered="#{FichaHogar2.asistente.campoIdFuncionarioDigitador1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaHogar2.campoIdFuncionarioDigitador1Texto2}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_funcionario_1x4y4']}"
                                                    id="campoIdFuncionarioDigitador1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar2.campoIdFuncionarioDigitador1Boton2}"
                                                    id="campoIdFuncionarioDigitador1Boton2"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioDigitador1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroFormulario1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroFormularioRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroFormulario1}"
                                                    id="labelNumeroFormulario1"
                                                    for="campoNumeroFormulario1"
                                                    text="numero formulario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroFormulario2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroFormularioRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroFormulario1"
                                                    binding="#{FichaHogar2.campoNumeroFormulario1}"
                                                    converter="#{FichaHogar2.converterNumeroFormulario1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_formulario']}"
                                                    toolTip="BundleParametros.numero_formulario.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroFormulario1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroFormulario1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroFormulario1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_formulario']}"/>
                                                <webuijsf:message id="messageNumeroFormulario1"
                                                    for="campoNumeroFormulario1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroFormulario1"
                                                    binding="#{FichaHogar2.helpInlineNumeroFormulario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_formulario.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroVivienda1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroViviendaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroVivienda1}"
                                                    id="labelNumeroVivienda1"
                                                    for="campoNumeroVivienda1"
                                                    text="numero vivienda"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroVivienda2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroViviendaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroVivienda1"
                                                    binding="#{FichaHogar2.campoNumeroVivienda1}"
                                                    converter="#{FichaHogar2.converterNumeroVivienda1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_vivienda']}"
                                                    toolTip="BundleParametros.numero_vivienda.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroVivienda1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroVivienda1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroVivienda1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_vivienda']}"/>
                                                <webuijsf:message id="messageNumeroVivienda1"
                                                    for="campoNumeroVivienda1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroVivienda1"
                                                    binding="#{FichaHogar2.helpInlineNumeroVivienda1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_vivienda.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroHogar1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroHogarRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroHogar1}"
                                                    id="labelNumeroHogar1"
                                                    for="campoNumeroHogar1"
                                                    text="numero hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroHogar2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroHogarRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroHogar1"
                                                    binding="#{FichaHogar2.campoNumeroHogar1}"
                                                    converter="#{FichaHogar2.converterNumeroHogar1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_hogar']}"
                                                    toolTip="BundleParametros.numero_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroHogar1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroHogar1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_hogar']}"/>
                                                <webuijsf:message id="messageNumeroHogar1"
                                                    for="campoNumeroHogar1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroHogar1"
                                                    binding="#{FichaHogar2.helpInlineNumeroHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_hogar.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaEntrevista1"
                                                rendered="#{FichaHogar2.asistente.gridFechaEntrevistaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelFechaEntrevista1}"
                                                    id="labelFechaEntrevista1"
                                                    for="campoFechaEntrevista1"
                                                    text="fecha entrevista"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaEntrevista2"
                                                rendered="#{FichaHogar2.asistente.gridFechaEntrevistaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaEntrevista1"
                                                    binding="#{FichaHogar2.campoFechaEntrevista1}"
                                                    maxDate="#{FichaHogar2.gestor.defaultMaxDate}"
                                                    minDate="#{FichaHogar2.gestor.defaultMinDate}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    selectedDate="#{FichaHogar2.fichaHogarDataProvider.value['fecha_entrevista']}"
                                                    toolTip="BundleParametros.fecha_entrevista.ficha_hogar"/>
                                                <webuijsf:staticText id="campoFechaEntrevista1Texto1"
                                                    binding="#{FichaHogar2.campoFechaEntrevista1Texto1}"
                                                    converter="#{FichaHogar2.converterFechaEntrevista1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['fecha_entrevista']}"/>
                                                <webuijsf:message id="messageFechaEntrevista1"
                                                    for="campoFechaEntrevista1"/>
                                                <webuijsf:helpInline id="helpInlineFechaEntrevista1"
                                                    binding="#{FichaHogar2.helpInlineFechaEntrevista1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_entrevista.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservaciones1"
                                                rendered="#{FichaHogar2.asistente.gridObservacionesRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelObservaciones1}"
                                                    id="labelObservaciones1"
                                                    for="campoObservaciones1"
                                                    text="observaciones"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservaciones2"
                                                rendered="#{FichaHogar2.asistente.gridObservacionesRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservaciones1"
                                                    binding="#{FichaHogar2.campoObservaciones1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['observaciones']}"
                                                    toolTip="BundleParametros.observaciones.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorObservaciones1.validate}"/>
                                                <webuijsf:staticText id="campoObservaciones1Texto1"
                                                    binding="#{FichaHogar2.campoObservaciones1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['observaciones']}"/>
                                                <webuijsf:message id="messageObservaciones1"
                                                    for="campoObservaciones1"/>
                                                <webuijsf:helpInline id="helpInlineObservaciones1"
                                                    binding="#{FichaHogar2.helpInlineObservaciones1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observaciones.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridHusoUtm1"
                                                rendered="#{FichaHogar2.asistente.gridHusoUtmRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelHusoUtm1}"
                                                    id="labelHusoUtm1"
                                                    for="campoHusoUtm1"
                                                    text="huso utm"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridHusoUtm2"
                                                rendered="#{FichaHogar2.asistente.gridHusoUtmRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoHusoUtm1"
                                                    binding="#{FichaHogar2.campoHusoUtm1}"
                                                    converter="#{FichaHogar2.converterHusoUtm1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['huso_utm']}"
                                                    toolTip="BundleParametros.huso_utm.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorHusoUtm1.validate}"/>
                                                <webuijsf:staticText id="campoHusoUtm1Texto1"
                                                    binding="#{FichaHogar2.campoHusoUtm1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['huso_utm']}"/>
                                                <webuijsf:message id="messageHusoUtm1"
                                                    for="campoHusoUtm1"/>
                                                <webuijsf:helpInline id="helpInlineHusoUtm1"
                                                    binding="#{FichaHogar2.helpInlineHusoUtm1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.huso_utm.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFranjaUtm1"
                                                rendered="#{FichaHogar2.asistente.gridFranjaUtmRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelFranjaUtm1}"
                                                    id="labelFranjaUtm1"
                                                    for="campoFranjaUtm1"
                                                    text="franja utm"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFranjaUtm2"
                                                rendered="#{FichaHogar2.asistente.gridFranjaUtmRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFranjaUtm1"
                                                    binding="#{FichaHogar2.campoFranjaUtm1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['franja_utm']}"
                                                    toolTip="BundleParametros.franja_utm.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorFranjaUtm1.validate}"/>
                                                <webuijsf:staticText id="campoFranjaUtm1Texto1"
                                                    binding="#{FichaHogar2.campoFranjaUtm1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['franja_utm']}"/>
                                                <webuijsf:message id="messageFranjaUtm1"
                                                    for="campoFranjaUtm1"/>
                                                <webuijsf:helpInline id="helpInlineFranjaUtm1"
                                                    binding="#{FichaHogar2.helpInlineFranjaUtm1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.franja_utm.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDistanciaEsteUtm1"
                                                rendered="#{FichaHogar2.asistente.gridDistanciaEsteUtmRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelDistanciaEsteUtm1}"
                                                    id="labelDistanciaEsteUtm1"
                                                    for="campoDistanciaEsteUtm1"
                                                    text="distancia este utm"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDistanciaEsteUtm2"
                                                rendered="#{FichaHogar2.asistente.gridDistanciaEsteUtmRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoDistanciaEsteUtm1"
                                                    binding="#{FichaHogar2.campoDistanciaEsteUtm1}"
                                                    converter="#{FichaHogar2.converterDistanciaEsteUtm1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['distancia_este_utm']}"
                                                    toolTip="BundleParametros.distancia_este_utm.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorDistanciaEsteUtm1.validate}"/>
                                                <webuijsf:staticText id="campoDistanciaEsteUtm1Texto1"
                                                    binding="#{FichaHogar2.campoDistanciaEsteUtm1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['distancia_este_utm']}"/>
                                                <webuijsf:message id="messageDistanciaEsteUtm1"
                                                    for="campoDistanciaEsteUtm1"/>
                                                <webuijsf:helpInline id="helpInlineDistanciaEsteUtm1"
                                                    binding="#{FichaHogar2.helpInlineDistanciaEsteUtm1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.distancia_este_utm.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDistanciaNorteUtm1"
                                                rendered="#{FichaHogar2.asistente.gridDistanciaNorteUtmRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelDistanciaNorteUtm1}"
                                                    id="labelDistanciaNorteUtm1"
                                                    for="campoDistanciaNorteUtm1"
                                                    text="distancia norte utm"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDistanciaNorteUtm2"
                                                rendered="#{FichaHogar2.asistente.gridDistanciaNorteUtmRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoDistanciaNorteUtm1"
                                                    binding="#{FichaHogar2.campoDistanciaNorteUtm1}"
                                                    converter="#{FichaHogar2.converterDistanciaNorteUtm1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['distancia_norte_utm']}"
                                                    toolTip="BundleParametros.distancia_norte_utm.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorDistanciaNorteUtm1.validate}"/>
                                                <webuijsf:staticText id="campoDistanciaNorteUtm1Texto1"
                                                    binding="#{FichaHogar2.campoDistanciaNorteUtm1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['distancia_norte_utm']}"/>
                                                <webuijsf:message id="messageDistanciaNorteUtm1"
                                                    for="campoDistanciaNorteUtm1"/>
                                                <webuijsf:helpInline id="helpInlineDistanciaNorteUtm1"
                                                    binding="#{FichaHogar2.helpInlineDistanciaNorteUtm1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.distancia_norte_utm.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridManzana1"
                                                rendered="#{FichaHogar2.asistente.gridManzanaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelManzana1}"
                                                    id="labelManzana1"
                                                    for="campoManzana1"
                                                    text="manzana"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridManzana2"
                                                rendered="#{FichaHogar2.asistente.gridManzanaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoManzana1"
                                                    binding="#{FichaHogar2.campoManzana1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['manzana']}"
                                                    toolTip="BundleParametros.manzana.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorManzana1.validate}"/>
                                                <webuijsf:staticText id="campoManzana1Texto1"
                                                    binding="#{FichaHogar2.campoManzana1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['manzana']}"/>
                                                <webuijsf:message id="messageManzana1"
                                                    for="campoManzana1"/>
                                                <webuijsf:helpInline id="helpInlineManzana1"
                                                    binding="#{FichaHogar2.helpInlineManzana1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.manzana.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento1"
                                                rendered="#{FichaHogar2.asistente.gridIdDepartamentoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdDepartamento1}"
                                                    id="labelIdDepartamento1"
                                                    for="campoIdDepartamento1"
                                                    text="departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento2"
                                                rendered="#{FichaHogar2.asistente.gridIdDepartamentoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDepartamento1"
                                                    binding="#{FichaHogar2.campoIdDepartamento1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.asistente.textoCampoIdDepartamento1}"
                                                    toolTip="#{FichaHogar2.asistente.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{FichaHogar2.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1Texto1"
                                                    binding="#{FichaHogar2.campoIdDepartamento1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_ubicacion_1x5y3']}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton1"
                                                    binding="#{FichaHogar2.campoIdDepartamento1Boton1}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button id="campoIdDepartamento1Boton3"
                                                    binding="#{FichaHogar2.campoIdDepartamento1Boton3}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{FichaHogar2.asistente.campoIdDepartamento1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDepartamento1"
                                                    for="campoIdDepartamento1"/>
                                                <webuijsf:helpInline id="helpInlineIdDepartamento1"
                                                    binding="#{FichaHogar2.helpInlineIdDepartamento1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_departamento.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento3"
                                                rendered="#{FichaHogar2.asistente.campoIdDepartamento1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdDepartamento2}"
                                                    id="labelIdDepartamento2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento4"
                                                rendered="#{FichaHogar2.asistente.campoIdDepartamento1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaHogar2.campoIdDepartamento1Texto2}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_ubicacion_1x5y4']}"
                                                    id="campoIdDepartamento1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar2.campoIdDepartamento1Boton2}"
                                                    id="campoIdDepartamento1Boton2"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdDepartamento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito1"
                                                rendered="#{FichaHogar2.asistente.gridIdDistritoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdDistrito1}"
                                                    id="labelIdDistrito1"
                                                    for="campoIdDistrito1"
                                                    text="distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito2"
                                                rendered="#{FichaHogar2.asistente.gridIdDistritoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDistrito1"
                                                    binding="#{FichaHogar2.campoIdDistrito1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.asistente.textoCampoIdDistrito1}"
                                                    toolTip="#{FichaHogar2.asistente.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{FichaHogar2.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1Texto1"
                                                    binding="#{FichaHogar2.campoIdDistrito1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_ubicacion_1x6y3']}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton1"
                                                    binding="#{FichaHogar2.campoIdDistrito1Boton1}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button id="campoIdDistrito1Boton3"
                                                    binding="#{FichaHogar2.campoIdDistrito1Boton3}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{FichaHogar2.asistente.campoIdDistrito1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDistrito1"
                                                    for="campoIdDistrito1"/>
                                                <webuijsf:helpInline id="helpInlineIdDistrito1"
                                                    binding="#{FichaHogar2.helpInlineIdDistrito1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_distrito.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito3"
                                                rendered="#{FichaHogar2.asistente.campoIdDistrito1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdDistrito2}"
                                                    id="labelIdDistrito2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito4"
                                                rendered="#{FichaHogar2.asistente.campoIdDistrito1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaHogar2.campoIdDistrito1Texto2}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_ubicacion_1x6y4']}"
                                                    id="campoIdDistrito1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar2.campoIdDistrito1Boton2}"
                                                    id="campoIdDistrito1Boton2"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdDistrito1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoArea1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoAreaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoArea1}"
                                                    id="labelNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"
                                                    text="tipo area"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoArea2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoAreaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoArea1"
                                                    binding="#{FichaHogar2.listaNumeroTipoArea1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoArea1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoArea1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_area']}"
                                                    toolTip="BundleParametros.numero_tipo_area.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoArea1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoArea1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_area_1x7y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoArea1"
                                                    for="listaNumeroTipoArea1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoArea1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoArea1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_area.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio1"
                                                rendered="#{FichaHogar2.asistente.gridIdBarrioRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdBarrio1}"
                                                    id="labelIdBarrio1"
                                                    for="campoIdBarrio1"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio2"
                                                rendered="#{FichaHogar2.asistente.gridIdBarrioRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdBarrio1"
                                                    binding="#{FichaHogar2.campoIdBarrio1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.asistente.textoCampoIdBarrio1}"
                                                    toolTip="#{FichaHogar2.asistente.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{FichaHogar2.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1Texto1"
                                                    binding="#{FichaHogar2.campoIdBarrio1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_ubicacion_1x8y3']}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton1"
                                                    binding="#{FichaHogar2.campoIdBarrio1Boton1}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button id="campoIdBarrio1Boton3"
                                                    binding="#{FichaHogar2.campoIdBarrio1Boton3}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{FichaHogar2.asistente.campoIdBarrio1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdBarrio1"
                                                    for="campoIdBarrio1"/>
                                                <webuijsf:helpInline id="helpInlineIdBarrio1"
                                                    binding="#{FichaHogar2.helpInlineIdBarrio1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_barrio.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio3"
                                                rendered="#{FichaHogar2.asistente.campoIdBarrio1Panel2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdBarrio2}"
                                                    id="labelIdBarrio2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio4"
                                                rendered="#{FichaHogar2.asistente.campoIdBarrio1Panel2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaHogar2.campoIdBarrio1Texto2}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_ubicacion_1x8y4']}"
                                                    id="campoIdBarrio1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar2.campoIdBarrio1Boton2}"
                                                    id="campoIdBarrio1Boton2"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdBarrio1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDireccion1"
                                                rendered="#{FichaHogar2.asistente.gridDireccionRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelDireccion1}"
                                                    id="labelDireccion1"
                                                    for="campoDireccion1"
                                                    text="direccion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDireccion2"
                                                rendered="#{FichaHogar2.asistente.gridDireccionRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDireccion1"
                                                    binding="#{FichaHogar2.campoDireccion1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['direccion']}"
                                                    toolTip="BundleParametros.direccion.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoDireccion1Texto1"
                                                    binding="#{FichaHogar2.campoDireccion1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['direccion']}"/>
                                                <webuijsf:message id="messageDireccion1"
                                                    for="campoDireccion1"/>
                                                <webuijsf:helpInline id="helpInlineDireccion1"
                                                    binding="#{FichaHogar2.helpInlineDireccion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.direccion.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridTotalPersonas1"
                                                rendered="#{FichaHogar2.asistente.gridTotalPersonasRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelTotalPersonas1}"
                                                    id="labelTotalPersonas1"
                                                    for="campoTotalPersonas1"
                                                    text="total personas"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridTotalPersonas2"
                                                rendered="#{FichaHogar2.asistente.gridTotalPersonasRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoTotalPersonas1"
                                                    binding="#{FichaHogar2.campoTotalPersonas1}"
                                                    converter="#{FichaHogar2.converterTotalPersonas1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['total_personas']}"
                                                    toolTip="BundleParametros.total_personas.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorTotalPersonas1.validate}"/>
                                                <webuijsf:staticText id="campoTotalPersonas1Texto1"
                                                    binding="#{FichaHogar2.campoTotalPersonas1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['total_personas']}"/>
                                                <webuijsf:message id="messageTotalPersonas1"
                                                    for="campoTotalPersonas1"/>
                                                <webuijsf:helpInline id="helpInlineTotalPersonas1"
                                                    binding="#{FichaHogar2.helpInlineTotalPersonas1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.total_personas.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridTotalHombres1"
                                                rendered="#{FichaHogar2.asistente.gridTotalHombresRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelTotalHombres1}"
                                                    id="labelTotalHombres1"
                                                    for="campoTotalHombres1"
                                                    text="total hombres"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridTotalHombres2"
                                                rendered="#{FichaHogar2.asistente.gridTotalHombresRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoTotalHombres1"
                                                    binding="#{FichaHogar2.campoTotalHombres1}"
                                                    converter="#{FichaHogar2.converterTotalHombres1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['total_hombres']}"
                                                    toolTip="BundleParametros.total_hombres.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorTotalHombres1.validate}"/>
                                                <webuijsf:staticText id="campoTotalHombres1Texto1"
                                                    binding="#{FichaHogar2.campoTotalHombres1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['total_hombres']}"/>
                                                <webuijsf:message id="messageTotalHombres1"
                                                    for="campoTotalHombres1"/>
                                                <webuijsf:helpInline id="helpInlineTotalHombres1"
                                                    binding="#{FichaHogar2.helpInlineTotalHombres1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.total_hombres.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridTotalMujeres1"
                                                rendered="#{FichaHogar2.asistente.gridTotalMujeresRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelTotalMujeres1}"
                                                    id="labelTotalMujeres1"
                                                    for="campoTotalMujeres1"
                                                    text="total mujeres"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridTotalMujeres2"
                                                rendered="#{FichaHogar2.asistente.gridTotalMujeresRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoTotalMujeres1"
                                                    binding="#{FichaHogar2.campoTotalMujeres1}"
                                                    converter="#{FichaHogar2.converterTotalMujeres1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['total_mujeres']}"
                                                    toolTip="BundleParametros.total_mujeres.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorTotalMujeres1.validate}"/>
                                                <webuijsf:staticText id="campoTotalMujeres1Texto1"
                                                    binding="#{FichaHogar2.campoTotalMujeres1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['total_mujeres']}"/>
                                                <webuijsf:message id="messageTotalMujeres1"
                                                    for="campoTotalMujeres1"/>
                                                <webuijsf:helpInline id="helpInlineTotalMujeres1"
                                                    binding="#{FichaHogar2.helpInlineTotalMujeres1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.total_mujeres.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoMatParedes1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoMatParedesRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoMatParedes1}"
                                                    id="labelNumeroTipoMatParedes1"
                                                    for="listaNumeroTipoMatParedes1"
                                                    text="tipo mat paredes"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoMatParedes2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoMatParedesRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoMatParedes1"
                                                    binding="#{FichaHogar2.listaNumeroTipoMatParedes1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoMatParedes1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoMatParedes1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_mat_paredes']}"
                                                    toolTip="BundleParametros.numero_tipo_mat_paredes.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoMatParedes1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoMatParedes1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_mat_paredes_1x10y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoMatParedes1"
                                                    for="listaNumeroTipoMatParedes1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoMatParedes1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoMatParedes1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_mat_paredes.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoMatPiso1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoMatPisoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoMatPiso1}"
                                                    id="labelNumeroTipoMatPiso1"
                                                    for="listaNumeroTipoMatPiso1"
                                                    text="tipo mat piso"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoMatPiso2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoMatPisoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoMatPiso1"
                                                    binding="#{FichaHogar2.listaNumeroTipoMatPiso1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoMatPiso1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoMatPiso1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_mat_piso']}"
                                                    toolTip="BundleParametros.numero_tipo_mat_piso.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoMatPiso1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoMatPiso1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_mat_piso_1x11y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoMatPiso1"
                                                    for="listaNumeroTipoMatPiso1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoMatPiso1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoMatPiso1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_mat_piso.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoMatTecho1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoMatTechoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoMatTecho1}"
                                                    id="labelNumeroTipoMatTecho1"
                                                    for="listaNumeroTipoMatTecho1"
                                                    text="tipo mat techo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoMatTecho2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoMatTechoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoMatTecho1"
                                                    binding="#{FichaHogar2.listaNumeroTipoMatTecho1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoMatTecho1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoMatTecho1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_mat_techo']}"
                                                    toolTip="BundleParametros.numero_tipo_mat_techo.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoMatTecho1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoMatTecho1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_mat_techo_1x12y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoMatTecho1"
                                                    for="listaNumeroTipoMatTecho1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoMatTecho1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoMatTecho1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_mat_techo.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoOcupacionViv1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoOcupacionVivRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoOcupacionViv1}"
                                                    id="labelNumeroTipoOcupacionViv1"
                                                    for="listaNumeroTipoOcupacionViv1"
                                                    text="tipo ocupacion viv"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoOcupacionViv2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoOcupacionVivRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoOcupacionViv1"
                                                    binding="#{FichaHogar2.listaNumeroTipoOcupacionViv1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoOcupacionViv1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoOcupacionViv1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_ocupacion_viv']}"
                                                    toolTip="BundleParametros.numero_tipo_ocupacion_viv.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoOcupacionViv1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoOcupacionViv1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_ocupacion_v_1x13y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoOcupacionViv1"
                                                    for="listaNumeroTipoOcupacionViv1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoOcupacionViv1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoOcupacionViv1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_ocupacion_viv.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtroTipoOcupacionViv1"
                                                rendered="#{FichaHogar2.asistente.gridOtroTipoOcupacionVivRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelOtroTipoOcupacionViv1}"
                                                    id="labelOtroTipoOcupacionViv1"
                                                    for="campoOtroTipoOcupacionViv1"
                                                    text="otro tipo ocupacion viv"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtroTipoOcupacionViv2"
                                                rendered="#{FichaHogar2.asistente.gridOtroTipoOcupacionVivRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtroTipoOcupacionViv1"
                                                    binding="#{FichaHogar2.campoOtroTipoOcupacionViv1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['otro_tipo_ocupacion_viv']}"
                                                    toolTip="BundleParametros.otro_tipo_ocupacion_viv.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorOtroTipoOcupacionViv1.validate}"/>
                                                <webuijsf:staticText id="campoOtroTipoOcupacionViv1Texto1"
                                                    binding="#{FichaHogar2.campoOtroTipoOcupacionViv1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['otro_tipo_ocupacion_viv']}"/>
                                                <webuijsf:message id="messageOtroTipoOcupacionViv1"
                                                    for="campoOtroTipoOcupacionViv1"/>
                                                <webuijsf:helpInline id="helpInlineOtroTipoOcupacionViv1"
                                                    binding="#{FichaHogar2.helpInlineOtroTipoOcupacionViv1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otro_tipo_ocupacion_viv.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCantidadPiezas1"
                                                rendered="#{FichaHogar2.asistente.gridCantidadPiezasRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelCantidadPiezas1}"
                                                    id="labelCantidadPiezas1"
                                                    for="campoCantidadPiezas1"
                                                    text="cantidad piezas"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCantidadPiezas2"
                                                rendered="#{FichaHogar2.asistente.gridCantidadPiezasRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCantidadPiezas1"
                                                    binding="#{FichaHogar2.campoCantidadPiezas1}"
                                                    converter="#{FichaHogar2.converterCantidadPiezas1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['cantidad_piezas']}"
                                                    toolTip="BundleParametros.cantidad_piezas.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorCantidadPiezas1.validate}"/>
                                                <webuijsf:staticText id="campoCantidadPiezas1Texto1"
                                                    binding="#{FichaHogar2.campoCantidadPiezas1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['cantidad_piezas']}"/>
                                                <webuijsf:message id="messageCantidadPiezas1"
                                                    for="campoCantidadPiezas1"/>
                                                <webuijsf:helpInline id="helpInlineCantidadPiezas1"
                                                    binding="#{FichaHogar2.helpInlineCantidadPiezas1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.cantidad_piezas.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCantidadDormitorios1"
                                                rendered="#{FichaHogar2.asistente.gridCantidadDormitoriosRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelCantidadDormitorios1}"
                                                    id="labelCantidadDormitorios1"
                                                    for="campoCantidadDormitorios1"
                                                    text="cantidad dormitorios"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCantidadDormitorios2"
                                                rendered="#{FichaHogar2.asistente.gridCantidadDormitoriosRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCantidadDormitorios1"
                                                    binding="#{FichaHogar2.campoCantidadDormitorios1}"
                                                    converter="#{FichaHogar2.converterCantidadDormitorios1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['cantidad_dormitorios']}"
                                                    toolTip="BundleParametros.cantidad_dormitorios.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorCantidadDormitorios1.validate}"/>
                                                <webuijsf:staticText id="campoCantidadDormitorios1Texto1"
                                                    binding="#{FichaHogar2.campoCantidadDormitorios1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['cantidad_dormitorios']}"/>
                                                <webuijsf:message id="messageCantidadDormitorios1"
                                                    for="campoCantidadDormitorios1"/>
                                                <webuijsf:helpInline id="helpInlineCantidadDormitorios1"
                                                    binding="#{FichaHogar2.helpInlineCantidadDormitorios1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.cantidad_dormitorios.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoPiezaCocina1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoPiezaCocinaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoPiezaCocina1}"
                                                    id="labelNumeroSionoPiezaCocina1"
                                                    for="listaNumeroSionoPiezaCocina1"
                                                    text="pieza cocina"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoPiezaCocina2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoPiezaCocinaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoPiezaCocina1"
                                                    binding="#{FichaHogar2.listaNumeroSionoPiezaCocina1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoPiezaCocina1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoPiezaCocina1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_pieza_cocina']}"
                                                    toolTip="BundleParametros.numero_siono_pieza_cocina.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoPiezaCocina1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoPiezaCocina1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x14y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoPiezaCocina1"
                                                    for="listaNumeroSionoPiezaCocina1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoPiezaCocina1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoPiezaCocina1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_pieza_cocina.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoCombustible1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoCombustibleRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoCombustible1}"
                                                    id="labelNumeroTipoCombustible1"
                                                    for="listaNumeroTipoCombustible1"
                                                    text="tipo combustible"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoCombustible2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoCombustibleRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoCombustible1"
                                                    binding="#{FichaHogar2.listaNumeroTipoCombustible1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoCombustible1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoCombustible1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_combustible']}"
                                                    toolTip="BundleParametros.numero_tipo_combustible.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoCombustible1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoCombustible1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_combustible_1x15y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoCombustible1"
                                                    for="listaNumeroTipoCombustible1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoCombustible1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoCombustible1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_combustible.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoPiezaBano1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoPiezaBanoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoPiezaBano1}"
                                                    id="labelNumeroTipoPiezaBano1"
                                                    for="listaNumeroTipoPiezaBano1"
                                                    text="tipo pieza bano"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoPiezaBano2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoPiezaBanoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoPiezaBano1"
                                                    binding="#{FichaHogar2.listaNumeroTipoPiezaBano1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoPiezaBano1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoPiezaBano1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_pieza_bano']}"
                                                    toolTip="BundleParametros.numero_tipo_pieza_bano.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoPiezaBano1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoPiezaBano1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_pieza_bano_1x16y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoPiezaBano1"
                                                    for="listaNumeroTipoPiezaBano1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoPiezaBano1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoPiezaBano1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_pieza_bano.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoServicioSan1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoServicioSanRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoServicioSan1}"
                                                    id="labelNumeroTipoServicioSan1"
                                                    for="listaNumeroTipoServicioSan1"
                                                    text="tipo servicio san"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoServicioSan2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoServicioSanRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoServicioSan1"
                                                    binding="#{FichaHogar2.listaNumeroTipoServicioSan1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoServicioSan1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoServicioSan1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_servicio_san']}"
                                                    toolTip="BundleParametros.numero_tipo_servicio_san.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoServicioSan1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoServicioSan1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_servicio_sa_1x17y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoServicioSan1"
                                                    for="listaNumeroTipoServicioSan1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoServicioSan1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoServicioSan1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_servicio_san.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoServicioAgua1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoServicioAguaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoServicioAgua1}"
                                                    id="labelNumeroTipoServicioAgua1"
                                                    for="listaNumeroTipoServicioAgua1"
                                                    text="tipo servicio agua"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoServicioAgua2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoServicioAguaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoServicioAgua1"
                                                    binding="#{FichaHogar2.listaNumeroTipoServicioAgua1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoServicioAgua1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoServicioAgua1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_servicio_agua']}"
                                                    toolTip="BundleParametros.numero_tipo_servicio_agua.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoServicioAgua1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoServicioAgua1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_servicio_ag_1x18y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoServicioAgua1"
                                                    for="listaNumeroTipoServicioAgua1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoServicioAgua1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoServicioAgua1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_servicio_agua.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoAbaAgua1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoAbaAguaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoAbaAgua1}"
                                                    id="labelNumeroTipoAbaAgua1"
                                                    for="listaNumeroTipoAbaAgua1"
                                                    text="tipo aba agua"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoAbaAgua2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoAbaAguaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoAbaAgua1"
                                                    binding="#{FichaHogar2.listaNumeroTipoAbaAgua1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoAbaAgua1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoAbaAgua1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_aba_agua']}"
                                                    toolTip="BundleParametros.numero_tipo_aba_agua.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoAbaAgua1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoAbaAgua1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_aba_agua_1x19y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoAbaAgua1"
                                                    for="listaNumeroTipoAbaAgua1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoAbaAgua1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoAbaAgua1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_aba_agua.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoCorrienteElec1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoCorrienteElecRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoCorrienteElec1}"
                                                    id="labelNumeroSionoCorrienteElec1"
                                                    for="listaNumeroSionoCorrienteElec1"
                                                    text="corriente elec"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoCorrienteElec2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoCorrienteElecRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoCorrienteElec1"
                                                    binding="#{FichaHogar2.listaNumeroSionoCorrienteElec1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoCorrienteElec1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoCorrienteElec1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_corriente_elec']}"
                                                    toolTip="BundleParametros.numero_siono_corriente_elec.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoCorrienteElec1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoCorrienteElec1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x20y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoCorrienteElec1"
                                                    for="listaNumeroSionoCorrienteElec1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoCorrienteElec1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoCorrienteElec1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_corriente_elec.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoDesechoBas1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoDesechoBasRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoDesechoBas1}"
                                                    id="labelNumeroTipoDesechoBas1"
                                                    for="listaNumeroTipoDesechoBas1"
                                                    text="tipo desecho bas"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoDesechoBas2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTipoDesechoBasRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoDesechoBas1"
                                                    binding="#{FichaHogar2.listaNumeroTipoDesechoBas1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoDesechoBas1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoDesechoBas1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_desecho_bas']}"
                                                    toolTip="BundleParametros.numero_tipo_desecho_bas.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoDesechoBas1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoDesechoBas1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_desecho_bas_1x21y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoDesechoBas1"
                                                    for="listaNumeroTipoDesechoBas1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoDesechoBas1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoDesechoBas1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_desecho_bas.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoTelefonoCelular1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoTelefonoCelularRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoTelefonoCelular1}"
                                                    id="labelNumeroSionoTelefonoCelular1"
                                                    for="listaNumeroSionoTelefonoCelular1"
                                                    text="telefono celular"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoTelefonoCelular2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoTelefonoCelularRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoTelefonoCelular1"
                                                    binding="#{FichaHogar2.listaNumeroSionoTelefonoCelular1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoTelefonoCelular1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoTelefonoCelular1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_telefono_celular']}"
                                                    toolTip="BundleParametros.numero_siono_telefono_celular.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoTelefonoCelular1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoTelefonoCelular1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x22y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoTelefonoCelular1"
                                                    for="listaNumeroSionoTelefonoCelular1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoTelefonoCelular1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoTelefonoCelular1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_telefono_celular.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTelefonoCelular1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTelefonoCelularRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTelefonoCelular1}"
                                                    id="labelNumeroTelefonoCelular1"
                                                    for="campoNumeroTelefonoCelular1"
                                                    text="numero telefono celular"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTelefonoCelular2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTelefonoCelularRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroTelefonoCelular1"
                                                    binding="#{FichaHogar2.campoNumeroTelefonoCelular1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_telefono_celular']}"
                                                    toolTip="BundleParametros.numero_telefono_celular.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroTelefonoCelular1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoCelular1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroTelefonoCelular1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_telefono_celular']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoCelular1"
                                                    for="campoNumeroTelefonoCelular1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTelefonoCelular1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTelefonoCelular1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_telefono_celular.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoTlfLineaBaja1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoTlfLineaBajaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoTlfLineaBaja1}"
                                                    id="labelNumeroSionoTlfLineaBaja1"
                                                    for="listaNumeroSionoTlfLineaBaja1"
                                                    text="tlf linea baja"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoTlfLineaBaja2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoTlfLineaBajaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoTlfLineaBaja1"
                                                    binding="#{FichaHogar2.listaNumeroSionoTlfLineaBaja1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoTlfLineaBaja1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoTlfLineaBaja1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_tlf_linea_baja']}"
                                                    toolTip="BundleParametros.numero_siono_tlf_linea_baja.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoTlfLineaBaja1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoTlfLineaBaja1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x23y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoTlfLineaBaja1"
                                                    for="listaNumeroSionoTlfLineaBaja1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoTlfLineaBaja1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoTlfLineaBaja1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_tlf_linea_baja.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTelefonoLineaBaja1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTelefonoLineaBajaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTelefonoLineaBaja1}"
                                                    id="labelNumeroTelefonoLineaBaja1"
                                                    for="campoNumeroTelefonoLineaBaja1"
                                                    text="numero telefono linea baja"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTelefonoLineaBaja2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroTelefonoLineaBajaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroTelefonoLineaBaja1"
                                                    binding="#{FichaHogar2.campoNumeroTelefonoLineaBaja1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_telefono_linea_baja']}"
                                                    toolTip="BundleParametros.numero_telefono_linea_baja.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroTelefonoLineaBaja1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoLineaBaja1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroTelefonoLineaBaja1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_telefono_linea_baja']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoLineaBaja1"
                                                    for="campoNumeroTelefonoLineaBaja1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTelefonoLineaBaja1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTelefonoLineaBaja1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_telefono_linea_baja.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDispHeladera1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoDispHeladeraRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoDispHeladera1}"
                                                    id="labelNumeroSionoDispHeladera1"
                                                    for="listaNumeroSionoDispHeladera1"
                                                    text="disp heladera"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDispHeladera2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoDispHeladeraRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDispHeladera1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispHeladera1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoDispHeladera1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoDispHeladera1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_disp_heladera']}"
                                                    toolTip="BundleParametros.numero_siono_disp_heladera.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispHeladera1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispHeladera1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x24y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispHeladera1"
                                                    for="listaNumeroSionoDispHeladera1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDispHeladera1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoDispHeladera1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_disp_heladera.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDispLavarropas1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoDispLavarropasRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoDispLavarropas1}"
                                                    id="labelNumeroSionoDispLavarropas1"
                                                    for="listaNumeroSionoDispLavarropas1"
                                                    text="disp lavarropas"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDispLavarropas2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoDispLavarropasRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDispLavarropas1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispLavarropas1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoDispLavarropas1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoDispLavarropas1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_disp_lavarropas']}"
                                                    toolTip="BundleParametros.numero_siono_disp_lavarropas.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispLavarropas1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispLavarropas1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x25y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispLavarropas1"
                                                    for="listaNumeroSionoDispLavarropas1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDispLavarropas1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoDispLavarropas1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_disp_lavarropas.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDispTermo1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoDispTermoRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoDispTermo1}"
                                                    id="labelNumeroSionoDispTermo1"
                                                    for="listaNumeroSionoDispTermo1"
                                                    text="disp termo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDispTermo2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoDispTermoRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDispTermo1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispTermo1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoDispTermo1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoDispTermo1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_disp_termo']}"
                                                    toolTip="BundleParametros.numero_siono_disp_termo.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispTermo1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispTermo1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x26y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispTermo1"
                                                    for="listaNumeroSionoDispTermo1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDispTermo1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoDispTermo1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_disp_termo.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDispAireAcon1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoDispAireAconRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoDispAireAcon1}"
                                                    id="labelNumeroSionoDispAireAcon1"
                                                    for="listaNumeroSionoDispAireAcon1"
                                                    text="disp aire acon"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDispAireAcon2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoDispAireAconRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDispAireAcon1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispAireAcon1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoDispAireAcon1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoDispAireAcon1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_disp_aire_acon']}"
                                                    toolTip="BundleParametros.numero_siono_disp_aire_acon.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispAireAcon1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispAireAcon1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x27y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispAireAcon1"
                                                    for="listaNumeroSionoDispAireAcon1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDispAireAcon1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoDispAireAcon1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_disp_aire_acon.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDispAutomovil1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoDispAutomovilRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoDispAutomovil1}"
                                                    id="labelNumeroSionoDispAutomovil1"
                                                    for="listaNumeroSionoDispAutomovil1"
                                                    text="disp automovil"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDispAutomovil2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoDispAutomovilRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDispAutomovil1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispAutomovil1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoDispAutomovil1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoDispAutomovil1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_disp_automovil']}"
                                                    toolTip="BundleParametros.numero_siono_disp_automovil.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispAutomovil1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispAutomovil1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x28y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispAutomovil1"
                                                    for="listaNumeroSionoDispAutomovil1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDispAutomovil1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoDispAutomovil1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_disp_automovil.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDispCamion1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoDispCamionRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoDispCamion1}"
                                                    id="labelNumeroSionoDispCamion1"
                                                    for="listaNumeroSionoDispCamion1"
                                                    text="disp camion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDispCamion2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoDispCamionRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDispCamion1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispCamion1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoDispCamion1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoDispCamion1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_disp_camion']}"
                                                    toolTip="BundleParametros.numero_siono_disp_camion.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispCamion1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispCamion1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x29y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispCamion1"
                                                    for="listaNumeroSionoDispCamion1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDispCamion1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoDispCamion1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_disp_camion.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDispMotocicleta1"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoDispMotocicletaRendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoDispMotocicleta1}"
                                                    id="labelNumeroSionoDispMotocicleta1"
                                                    for="listaNumeroSionoDispMotocicleta1"
                                                    text="disp motocicleta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDispMotocicleta2"
                                                rendered="#{FichaHogar2.asistente.gridNumeroSionoDispMotocicletaRendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDispMotocicleta1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispMotocicleta1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoDispMotocicleta1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoDispMotocicleta1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_disp_motocicleta']}"
                                                    toolTip="BundleParametros.numero_siono_disp_motocicleta.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispMotocicleta1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispMotocicleta1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x30y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispMotocicleta1"
                                                    for="listaNumeroSionoDispMotocicleta1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDispMotocicleta1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoDispMotocicleta1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_disp_motocicleta.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreJefeHogar1" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNombreJefeHogar1}"
                                                    id="labelNombreJefeHogar1"
                                                    for="campoNombreJefeHogar1"
                                                    text="nombre jefe hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreJefeHogar2" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreJefeHogar1"
                                                    binding="#{FichaHogar2.campoNombreJefeHogar1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_jefe_hogar']}"
                                                    toolTip="BundleParametros.nombre_jefe_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNombreJefeHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNombreJefeHogar1Texto1"
                                                    binding="#{FichaHogar2.campoNombreJefeHogar1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_jefe_hogar']}"/>
                                                <webuijsf:message id="messageNombreJefeHogar1"
                                                    for="campoNombreJefeHogar1"/>
                                                <webuijsf:helpInline id="helpInlineNombreJefeHogar1"
                                                    binding="#{FichaHogar2.helpInlineNombreJefeHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_jefe_hogar.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCedulaJefeHogar1" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroCedulaJefeHogar1}"
                                                    id="labelNumeroCedulaJefeHogar1"
                                                    for="campoNumeroCedulaJefeHogar1"
                                                    text="numero cedula jefe hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCedulaJefeHogar2" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroCedulaJefeHogar1"
                                                    binding="#{FichaHogar2.campoNumeroCedulaJefeHogar1}"
                                                    converter="#{FichaHogar2.converterNumeroCedulaJefeHogar1}"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_cedula_jefe_hogar']}"
                                                    toolTip="BundleParametros.numero_cedula_jefe_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroCedulaJefeHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedulaJefeHogar1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroCedulaJefeHogar1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_cedula_jefe_hogar']}"/>
                                                <webuijsf:message id="messageNumeroCedulaJefeHogar1"
                                                    for="campoNumeroCedulaJefeHogar1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCedulaJefeHogar1"
                                                    binding="#{FichaHogar2.helpInlineNumeroCedulaJefeHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_cedula_jefe_hogar.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLetraCedulaJefeHogar1" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelLetraCedulaJefeHogar1}"
                                                    id="labelLetraCedulaJefeHogar1"
                                                    for="campoLetraCedulaJefeHogar1"
                                                    text="letra cedula jefe hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLetraCedulaJefeHogar2" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoLetraCedulaJefeHogar1"
                                                    binding="#{FichaHogar2.campoLetraCedulaJefeHogar1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['letra_cedula_jefe_hogar']}"
                                                    toolTip="BundleParametros.letra_cedula_jefe_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorLetraCedulaJefeHogar1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedulaJefeHogar1Texto1"
                                                    binding="#{FichaHogar2.campoLetraCedulaJefeHogar1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['letra_cedula_jefe_hogar']}"/>
                                                <webuijsf:message id="messageLetraCedulaJefeHogar1"
                                                    for="campoLetraCedulaJefeHogar1"/>
                                                <webuijsf:helpInline id="helpInlineLetraCedulaJefeHogar1"
                                                    binding="#{FichaHogar2.helpInlineLetraCedulaJefeHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.letra_cedula_jefe_hogar.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroOrdenIdenJefeHogar1" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroOrdenIdenJefeHogar1}"
                                                    id="labelNumeroOrdenIdenJefeHogar1"
                                                    for="campoNumeroOrdenIdenJefeHogar1"
                                                    text="numero orden iden jefe hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroOrdenIdenJefeHogar2" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroOrdenIdenJefeHogar1"
                                                    binding="#{FichaHogar2.campoNumeroOrdenIdenJefeHogar1}"
                                                    converter="#{FichaHogar2.converterNumeroOrdenIdenJefeHogar1}"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_orden_iden_jefe_hogar']}"
                                                    toolTip="BundleParametros.numero_orden_iden_jefe_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroOrdenIdenJefeHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenJefeHogar1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroOrdenIdenJefeHogar1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_orden_iden_jefe_hogar']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenJefeHogar1"
                                                    for="campoNumeroOrdenIdenJefeHogar1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroOrdenIdenJefeHogar1"
                                                    binding="#{FichaHogar2.helpInlineNumeroOrdenIdenJefeHogar1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_orden_iden_jefe_hogar.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreRespondente1" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNombreRespondente1}"
                                                    id="labelNombreRespondente1"
                                                    for="campoNombreRespondente1"
                                                    text="nombre respondente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreRespondente2" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreRespondente1"
                                                    binding="#{FichaHogar2.campoNombreRespondente1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_respondente']}"
                                                    toolTip="BundleParametros.nombre_respondente.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNombreRespondente1.validate}"/>
                                                <webuijsf:staticText id="campoNombreRespondente1Texto1"
                                                    binding="#{FichaHogar2.campoNombreRespondente1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_respondente']}"/>
                                                <webuijsf:message id="messageNombreRespondente1"
                                                    for="campoNombreRespondente1"/>
                                                <webuijsf:helpInline id="helpInlineNombreRespondente1"
                                                    binding="#{FichaHogar2.helpInlineNombreRespondente1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_respondente.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCedulaRespondente1" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroCedulaRespondente1}"
                                                    id="labelNumeroCedulaRespondente1"
                                                    for="campoNumeroCedulaRespondente1"
                                                    text="numero cedula respondente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCedulaRespondente2" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroCedulaRespondente1"
                                                    binding="#{FichaHogar2.campoNumeroCedulaRespondente1}"
                                                    converter="#{FichaHogar2.converterNumeroCedulaRespondente1}"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_cedula_respondente']}"
                                                    toolTip="BundleParametros.numero_cedula_respondente.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroCedulaRespondente1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedulaRespondente1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroCedulaRespondente1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_cedula_respondente']}"/>
                                                <webuijsf:message id="messageNumeroCedulaRespondente1"
                                                    for="campoNumeroCedulaRespondente1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCedulaRespondente1"
                                                    binding="#{FichaHogar2.helpInlineNumeroCedulaRespondente1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_cedula_respondente.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLetraCedulaRespondente1" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelLetraCedulaRespondente1}"
                                                    id="labelLetraCedulaRespondente1"
                                                    for="campoLetraCedulaRespondente1"
                                                    text="letra cedula respondente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLetraCedulaRespondente2" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoLetraCedulaRespondente1"
                                                    binding="#{FichaHogar2.campoLetraCedulaRespondente1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['letra_cedula_respondente']}"
                                                    toolTip="BundleParametros.letra_cedula_respondente.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorLetraCedulaRespondente1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedulaRespondente1Texto1"
                                                    binding="#{FichaHogar2.campoLetraCedulaRespondente1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['letra_cedula_respondente']}"/>
                                                <webuijsf:message id="messageLetraCedulaRespondente1"
                                                    for="campoLetraCedulaRespondente1"/>
                                                <webuijsf:helpInline id="helpInlineLetraCedulaRespondente1"
                                                    binding="#{FichaHogar2.helpInlineLetraCedulaRespondente1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.letra_cedula_respondente.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroOrdenIdenRespondente1" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroOrdenIdenRespondente1}"
                                                    id="labelNumeroOrdenIdenRespondente1"
                                                    for="campoNumeroOrdenIdenRespondente1"
                                                    text="numero orden iden respondente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroOrdenIdenRespondente2" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroOrdenIdenRespondente1"
                                                    binding="#{FichaHogar2.campoNumeroOrdenIdenRespondente1}"
                                                    converter="#{FichaHogar2.converterNumeroOrdenIdenRespondente1}"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_orden_iden_respondente']}"
                                                    toolTip="BundleParametros.numero_orden_iden_respondente.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroOrdenIdenRespondente1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenRespondente1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroOrdenIdenRespondente1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_orden_iden_respondente']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenRespondente1"
                                                    for="campoNumeroOrdenIdenRespondente1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroOrdenIdenRespondente1"
                                                    binding="#{FichaHogar2.helpInlineNumeroOrdenIdenRespondente1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_orden_iden_respondente.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdProveedorDatExt1" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdProveedorDatExt1}"
                                                    id="labelIdProveedorDatExt1"
                                                    for="campoIdProveedorDatExt1"
                                                    text="proveedor dat ext"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdProveedorDatExt2" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdProveedorDatExt1"
                                                    binding="#{FichaHogar2.campoIdProveedorDatExt1}"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.asistente.textoCampoIdProveedorDatExt1}"
                                                    toolTip="#{FichaHogar2.asistente.toolTipCampoIdProveedorDatExt1}"
                                                    validatorExpression="#{FichaHogar2.campoIdProveedorDatExt1_validate}"/>
                                                <webuijsf:staticText id="campoIdProveedorDatExt1Texto1"
                                                    binding="#{FichaHogar2.campoIdProveedorDatExt1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_proveedor_dat_ex_1x31y3']}"/>
                                                <webuijsf:button id="campoIdProveedorDatExt1Boton1"
                                                    binding="#{FichaHogar2.campoIdProveedorDatExt1Boton1}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdProveedorDatExt1Boton1}"/>
                                                <webuijsf:button id="campoIdProveedorDatExt1Boton3"
                                                    binding="#{FichaHogar2.campoIdProveedorDatExt1Boton3}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdProveedorDatExt1Boton2}"
                                                    rendered="#{FichaHogar2.asistente.campoIdProveedorDatExt1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdProveedorDatExt1"
                                                    for="campoIdProveedorDatExt1"/>
                                                <webuijsf:helpInline id="helpInlineIdProveedorDatExt1"
                                                    binding="#{FichaHogar2.helpInlineIdProveedorDatExt1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_proveedor_dat_ext.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdProveedorDatExt3" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdProveedorDatExt2}"
                                                    id="labelIdProveedorDatExt2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre proveedor dat ext"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdProveedorDatExt4" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaHogar2.campoIdProveedorDatExt1Texto2}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_proveedor_dat_ex_1x31y4']}"
                                                    id="campoIdProveedorDatExt1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar2.campoIdProveedorDatExt1Boton2}"
                                                    id="campoIdProveedorDatExt1Boton2"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdProveedorDatExt1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIndiceCalidadVida1" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIndiceCalidadVida1}"
                                                    id="labelIndiceCalidadVida1"
                                                    for="campoIndiceCalidadVida1"
                                                    text="indice calidad vida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIndiceCalidadVida2" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIndiceCalidadVida1"
                                                    binding="#{FichaHogar2.campoIndiceCalidadVida1}"
                                                    converter="#{FichaHogar2.converterIndiceCalidadVida1}"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['indice_calidad_vida']}"
                                                    toolTip="BundleParametros.indice_calidad_vida.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorIndiceCalidadVida1.validate}"/>
                                                <webuijsf:staticText id="campoIndiceCalidadVida1Texto1"
                                                    binding="#{FichaHogar2.campoIndiceCalidadVida1Texto1}"
                                                    converter="#{FichaHogar2.converterIndiceCalidadVida1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['indice_calidad_vida']}"/>
                                                <webuijsf:message id="messageIndiceCalidadVida1"
                                                    for="campoIndiceCalidadVida1"/>
                                                <webuijsf:helpInline id="helpInlineIndiceCalidadVida1"
                                                    binding="#{FichaHogar2.helpInlineIndiceCalidadVida1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.indice_calidad_vida.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsFichaHogarInactiva1" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelEsFichaHogarInactiva1}"
                                                    id="labelEsFichaHogarInactiva1"
                                                    for="listaEsFichaHogarInactiva1"
                                                    text="inactiva"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsFichaHogarInactiva2" rendered="#{FichaHogar2.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsFichaHogarInactiva1"
                                                    binding="#{FichaHogar2.listaEsFichaHogarInactiva1}"
                                                    converter="#{FichaHogar2.converterEsFichaHogarInactiva1}"
                                                    disabled="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaEsFichaHogarInactiva1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['es_ficha_hogar_inactiva']}"
                                                    toolTip="BundleParametros.es_ficha_hogar_inactiva.ficha_hogar"/>
                                                <webuijsf:staticText id="listaEsFichaHogarInactiva1Texto1"
                                                    binding="#{FichaHogar2.listaEsFichaHogarInactiva1Texto1}"/>
                                                <webuijsf:message id="messageEsFichaHogarInactiva1"
                                                    for="listaEsFichaHogarInactiva1"/>
                                                <webuijsf:helpInline id="helpInlineEsFichaHogarInactiva1"
                                                    binding="#{FichaHogar2.helpInlineEsFichaHogarInactiva1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_ficha_hogar_inactiva.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:tabSet
                                            id="tabSet1"
                                            lite="true"
                                            mini="true"
                                            rendered="#{FichaHogar2.gestor.filaNoProcesada}"
                                            selected="tab1">
                                        <webuijsf:tab
                                            id="tab1"
                                            rendered="#{FichaHogar2.asistente.seccionPortadaRendered}"
                                            text="portada">
                                        <h:panelGrid
                                            id="gridPanel116"
                                            rendered="#{FichaHogar2.asistente.seccionPortadaHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab1"
                                                text="#{FichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel117"
                                            rendered="#{FichaHogar2.asistente.seccionPortadaRendered}">
                                            <h:panelGrid
                                                id="gridIdFuncionarioCensista1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFuncionarioCensista1x1}"
                                                    id="labelIdFuncionarioCensista1x1"
                                                    for="campoIdFuncionarioCensista1x1"
                                                    text="funcionario censista"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioCensista1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionarioCensista1x1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioCensista1x1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.asistente.textoCampoIdFuncionarioCensista1}"
                                                    toolTip="#{FichaHogar2.asistente.toolTipCampoIdFuncionarioCensista1}"
                                                    validatorExpression="#{FichaHogar2.campoIdFuncionarioCensista1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioCensista1x1Texto1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioCensista1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_funcionario_1x1y3']}"/>
                                                <webuijsf:button id="campoIdFuncionarioCensista1x1Boton1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioCensista1x1Boton1}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioCensista1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionarioCensista1x1Boton3"
                                                    binding="#{FichaHogar2.campoIdFuncionarioCensista1x1Boton3}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioCensista1Boton2}"
                                                    rendered="#{FichaHogar2.asistente.campoIdFuncionarioCensista1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionarioCensista1x1"
                                                    for="campoIdFuncionarioCensista1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionarioCensista1x1"
                                                    binding="#{FichaHogar2.helpInlineIdFuncionarioCensista1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcionario_censista.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioCensista1x3"
                                                rendered="#{FichaHogar2.asistente.campoIdFuncionarioCensista1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFuncionarioCensista1x2}"
                                                    id="labelIdFuncionarioCensista1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcionario censista"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioCensista1x4"
                                                rendered="#{FichaHogar2.asistente.campoIdFuncionarioCensista1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaHogar2.campoIdFuncionarioCensista1x1Texto2}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_funcionario_1x1y4']}"
                                                    id="campoIdFuncionarioCensista1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar2.campoIdFuncionarioCensista1x1Boton2}"
                                                    id="campoIdFuncionarioCensista1x1Boton2"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioCensista1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioSupervisor1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFuncionarioSupervisor1x1}"
                                                    id="labelIdFuncionarioSupervisor1x1"
                                                    for="campoIdFuncionarioSupervisor1x1"
                                                    text="funcionario supervisor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioSupervisor1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionarioSupervisor1x1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioSupervisor1x1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.asistente.textoCampoIdFuncionarioSupervisor1}"
                                                    toolTip="#{FichaHogar2.asistente.toolTipCampoIdFuncionarioSupervisor1}"
                                                    validatorExpression="#{FichaHogar2.campoIdFuncionarioSupervisor1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioSupervisor1x1Texto1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioSupervisor1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_funcionario_1x2y3']}"/>
                                                <webuijsf:button id="campoIdFuncionarioSupervisor1x1Boton1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioSupervisor1x1Boton1}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioSupervisor1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionarioSupervisor1x1Boton3"
                                                    binding="#{FichaHogar2.campoIdFuncionarioSupervisor1x1Boton3}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioSupervisor1Boton2}"
                                                    rendered="#{FichaHogar2.asistente.campoIdFuncionarioSupervisor1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionarioSupervisor1x1"
                                                    for="campoIdFuncionarioSupervisor1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionarioSupervisor1x1"
                                                    binding="#{FichaHogar2.helpInlineIdFuncionarioSupervisor1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcionario_supervisor.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioSupervisor1x3"
                                                rendered="#{FichaHogar2.asistente.campoIdFuncionarioSupervisor1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFuncionarioSupervisor1x2}"
                                                    id="labelIdFuncionarioSupervisor1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcionario supervisor"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioSupervisor1x4"
                                                rendered="#{FichaHogar2.asistente.campoIdFuncionarioSupervisor1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaHogar2.campoIdFuncionarioSupervisor1x1Texto2}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_funcionario_1x2y4']}"
                                                    id="campoIdFuncionarioSupervisor1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar2.campoIdFuncionarioSupervisor1x1Boton2}"
                                                    id="campoIdFuncionarioSupervisor1x1Boton2"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioSupervisor1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioCriticoDeco1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFuncionarioCriticoDeco1x1}"
                                                    id="labelIdFuncionarioCriticoDeco1x1"
                                                    for="campoIdFuncionarioCriticoDeco1x1"
                                                    text="funcionario critico deco"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioCriticoDeco1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionarioCriticoDeco1x1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioCriticoDeco1x1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.asistente.textoCampoIdFuncionarioCriticoDeco1}"
                                                    toolTip="#{FichaHogar2.asistente.toolTipCampoIdFuncionarioCriticoDeco1}"
                                                    validatorExpression="#{FichaHogar2.campoIdFuncionarioCriticoDeco1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioCriticoDeco1x1Texto1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioCriticoDeco1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_funcionario_1x3y3']}"/>
                                                <webuijsf:button id="campoIdFuncionarioCriticoDeco1x1Boton1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioCriticoDeco1x1Boton1}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioCriticoDeco1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionarioCriticoDeco1x1Boton3"
                                                    binding="#{FichaHogar2.campoIdFuncionarioCriticoDeco1x1Boton3}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioCriticoDeco1Boton2}"
                                                    rendered="#{FichaHogar2.asistente.campoIdFuncionarioCriticoDeco1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionarioCriticoDeco1x1"
                                                    for="campoIdFuncionarioCriticoDeco1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionarioCriticoDeco1x1"
                                                    binding="#{FichaHogar2.helpInlineIdFuncionarioCriticoDeco1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcionario_critico_deco.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioCriticoDeco1x3"
                                                rendered="#{FichaHogar2.asistente.campoIdFuncionarioCriticoDeco1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFuncionarioCriticoDeco1x2}"
                                                    id="labelIdFuncionarioCriticoDeco1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcionario critico deco"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioCriticoDeco1x4"
                                                rendered="#{FichaHogar2.asistente.campoIdFuncionarioCriticoDeco1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaHogar2.campoIdFuncionarioCriticoDeco1x1Texto2}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_funcionario_1x3y4']}"
                                                    id="campoIdFuncionarioCriticoDeco1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar2.campoIdFuncionarioCriticoDeco1x1Boton2}"
                                                    id="campoIdFuncionarioCriticoDeco1x1Boton2"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioCriticoDeco1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioDigitador1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFuncionarioDigitador1x1}"
                                                    id="labelIdFuncionarioDigitador1x1"
                                                    for="campoIdFuncionarioDigitador1x1"
                                                    text="funcionario digitador"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioDigitador1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionarioDigitador1x1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioDigitador1x1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.asistente.textoCampoIdFuncionarioDigitador1}"
                                                    toolTip="#{FichaHogar2.asistente.toolTipCampoIdFuncionarioDigitador1}"
                                                    validatorExpression="#{FichaHogar2.campoIdFuncionarioDigitador1_validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionarioDigitador1x1Texto1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioDigitador1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_funcionario_1x4y3']}"/>
                                                <webuijsf:button id="campoIdFuncionarioDigitador1x1Boton1"
                                                    binding="#{FichaHogar2.campoIdFuncionarioDigitador1x1Boton1}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioDigitador1Boton1}"/>
                                                <webuijsf:button id="campoIdFuncionarioDigitador1x1Boton3"
                                                    binding="#{FichaHogar2.campoIdFuncionarioDigitador1x1Boton3}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioDigitador1Boton2}"
                                                    rendered="#{FichaHogar2.asistente.campoIdFuncionarioDigitador1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdFuncionarioDigitador1x1"
                                                    for="campoIdFuncionarioDigitador1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionarioDigitador1x1"
                                                    binding="#{FichaHogar2.helpInlineIdFuncionarioDigitador1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcionario_digitador.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionarioDigitador1x3"
                                                rendered="#{FichaHogar2.asistente.campoIdFuncionarioDigitador1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdFuncionarioDigitador1x2}"
                                                    id="labelIdFuncionarioDigitador1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre funcionario digitador"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionarioDigitador1x4"
                                                rendered="#{FichaHogar2.asistente.campoIdFuncionarioDigitador1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaHogar2.campoIdFuncionarioDigitador1x1Texto2}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_funcionario_1x4y4']}"
                                                    id="campoIdFuncionarioDigitador1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar2.campoIdFuncionarioDigitador1x1Boton2}"
                                                    id="campoIdFuncionarioDigitador1x1Boton2"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdFuncionarioDigitador1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroFormulario1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroFormulario1x1}"
                                                    id="labelNumeroFormulario1x1"
                                                    for="campoNumeroFormulario1x1"
                                                    text="numero formulario"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroFormulario1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroFormulario1x1"
                                                    binding="#{FichaHogar2.campoNumeroFormulario1x1}"
                                                    converter="#{FichaHogar2.converterNumeroFormulario1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_formulario']}"
                                                    toolTip="BundleParametros.numero_formulario.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroFormulario1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroFormulario1x1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroFormulario1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_formulario']}"/>
                                                <webuijsf:message id="messageNumeroFormulario1x1"
                                                    for="campoNumeroFormulario1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroFormulario1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroFormulario1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_formulario.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroVivienda1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroVivienda1x1}"
                                                    id="labelNumeroVivienda1x1"
                                                    for="campoNumeroVivienda1x1"
                                                    text="numero vivienda"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroVivienda1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroVivienda1x1"
                                                    binding="#{FichaHogar2.campoNumeroVivienda1x1}"
                                                    converter="#{FichaHogar2.converterNumeroVivienda1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_vivienda']}"
                                                    toolTip="BundleParametros.numero_vivienda.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroVivienda1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroVivienda1x1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroVivienda1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_vivienda']}"/>
                                                <webuijsf:message id="messageNumeroVivienda1x1"
                                                    for="campoNumeroVivienda1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroVivienda1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroVivienda1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_vivienda.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroHogar1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroHogar1x1}"
                                                    id="labelNumeroHogar1x1"
                                                    for="campoNumeroHogar1x1"
                                                    text="numero hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroHogar1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroHogar1x1"
                                                    binding="#{FichaHogar2.campoNumeroHogar1x1}"
                                                    converter="#{FichaHogar2.converterNumeroHogar1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_hogar']}"
                                                    toolTip="BundleParametros.numero_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroHogar1x1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroHogar1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_hogar']}"/>
                                                <webuijsf:message id="messageNumeroHogar1x1"
                                                    for="campoNumeroHogar1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroHogar1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroHogar1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_hogar.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFechaEntrevista1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelFechaEntrevista1x1}"
                                                    id="labelFechaEntrevista1x1"
                                                    for="campoFechaEntrevista1x1"
                                                    text="fecha entrevista"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFechaEntrevista1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:calendar id="campoFechaEntrevista1x1"
                                                    binding="#{FichaHogar2.campoFechaEntrevista1x1}"
                                                    maxDate="#{FichaHogar2.gestor.defaultMaxDate}"
                                                    minDate="#{FichaHogar2.gestor.defaultMinDate}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    selectedDate="#{FichaHogar2.fichaHogarDataProvider.value['fecha_entrevista']}"
                                                    toolTip="BundleParametros.fecha_entrevista.ficha_hogar"/>
                                                <webuijsf:staticText id="campoFechaEntrevista1x1Texto1"
                                                    binding="#{FichaHogar2.campoFechaEntrevista1x1Texto1}"
                                                    converter="#{FichaHogar2.converterFechaEntrevista1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['fecha_entrevista']}"/>
                                                <webuijsf:message id="messageFechaEntrevista1x1"
                                                    for="campoFechaEntrevista1x1"/>
                                                <webuijsf:helpInline id="helpInlineFechaEntrevista1x1"
                                                    binding="#{FichaHogar2.helpInlineFechaEntrevista1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.fecha_entrevista.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridObservaciones1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelObservaciones1x1}"
                                                    id="labelObservaciones1x1"
                                                    for="campoObservaciones1x1"
                                                    text="observaciones"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridObservaciones1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoObservaciones1x1"
                                                    binding="#{FichaHogar2.campoObservaciones1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['observaciones']}"
                                                    toolTip="BundleParametros.observaciones.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorObservaciones1.validate}"/>
                                                <webuijsf:staticText id="campoObservaciones1x1Texto1"
                                                    binding="#{FichaHogar2.campoObservaciones1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['observaciones']}"/>
                                                <webuijsf:message id="messageObservaciones1x1"
                                                    for="campoObservaciones1x1"/>
                                                <webuijsf:helpInline id="helpInlineObservaciones1x1"
                                                    binding="#{FichaHogar2.helpInlineObservaciones1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.observaciones.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab2"
                                            rendered="#{FichaHogar2.asistente.seccionPosicionamientoRendered}"
                                            text="posicionamiento">
                                        <h:panelGrid
                                            id="gridPanel118"
                                            rendered="#{FichaHogar2.asistente.seccionPosicionamientoHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab2"
                                                text="#{FichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel119"
                                            rendered="#{FichaHogar2.asistente.seccionPosicionamientoRendered}">
                                            <h:panelGrid
                                                id="gridHusoUtm1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelHusoUtm1x1}"
                                                    id="labelHusoUtm1x1"
                                                    for="campoHusoUtm1x1"
                                                    text="huso utm"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridHusoUtm1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoHusoUtm1x1"
                                                    binding="#{FichaHogar2.campoHusoUtm1x1}"
                                                    converter="#{FichaHogar2.converterHusoUtm1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['huso_utm']}"
                                                    toolTip="BundleParametros.huso_utm.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorHusoUtm1.validate}"/>
                                                <webuijsf:staticText id="campoHusoUtm1x1Texto1"
                                                    binding="#{FichaHogar2.campoHusoUtm1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['huso_utm']}"/>
                                                <webuijsf:message id="messageHusoUtm1x1"
                                                    for="campoHusoUtm1x1"/>
                                                <webuijsf:helpInline id="helpInlineHusoUtm1x1"
                                                    binding="#{FichaHogar2.helpInlineHusoUtm1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.huso_utm.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridFranjaUtm1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelFranjaUtm1x1}"
                                                    id="labelFranjaUtm1x1"
                                                    for="campoFranjaUtm1x1"
                                                    text="franja utm"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridFranjaUtm1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoFranjaUtm1x1"
                                                    binding="#{FichaHogar2.campoFranjaUtm1x1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['franja_utm']}"
                                                    toolTip="BundleParametros.franja_utm.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorFranjaUtm1.validate}"/>
                                                <webuijsf:staticText id="campoFranjaUtm1x1Texto1"
                                                    binding="#{FichaHogar2.campoFranjaUtm1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['franja_utm']}"/>
                                                <webuijsf:message id="messageFranjaUtm1x1"
                                                    for="campoFranjaUtm1x1"/>
                                                <webuijsf:helpInline id="helpInlineFranjaUtm1x1"
                                                    binding="#{FichaHogar2.helpInlineFranjaUtm1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.franja_utm.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDistanciaEsteUtm1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelDistanciaEsteUtm1x1}"
                                                    id="labelDistanciaEsteUtm1x1"
                                                    for="campoDistanciaEsteUtm1x1"
                                                    text="distancia este utm"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDistanciaEsteUtm1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoDistanciaEsteUtm1x1"
                                                    binding="#{FichaHogar2.campoDistanciaEsteUtm1x1}"
                                                    converter="#{FichaHogar2.converterDistanciaEsteUtm1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['distancia_este_utm']}"
                                                    toolTip="BundleParametros.distancia_este_utm.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorDistanciaEsteUtm1.validate}"/>
                                                <webuijsf:staticText id="campoDistanciaEsteUtm1x1Texto1"
                                                    binding="#{FichaHogar2.campoDistanciaEsteUtm1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['distancia_este_utm']}"/>
                                                <webuijsf:message id="messageDistanciaEsteUtm1x1"
                                                    for="campoDistanciaEsteUtm1x1"/>
                                                <webuijsf:helpInline id="helpInlineDistanciaEsteUtm1x1"
                                                    binding="#{FichaHogar2.helpInlineDistanciaEsteUtm1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.distancia_este_utm.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDistanciaNorteUtm1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelDistanciaNorteUtm1x1}"
                                                    id="labelDistanciaNorteUtm1x1"
                                                    for="campoDistanciaNorteUtm1x1"
                                                    text="distancia norte utm"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDistanciaNorteUtm1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoDistanciaNorteUtm1x1"
                                                    binding="#{FichaHogar2.campoDistanciaNorteUtm1x1}"
                                                    converter="#{FichaHogar2.converterDistanciaNorteUtm1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['distancia_norte_utm']}"
                                                    toolTip="BundleParametros.distancia_norte_utm.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorDistanciaNorteUtm1.validate}"/>
                                                <webuijsf:staticText id="campoDistanciaNorteUtm1x1Texto1"
                                                    binding="#{FichaHogar2.campoDistanciaNorteUtm1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['distancia_norte_utm']}"/>
                                                <webuijsf:message id="messageDistanciaNorteUtm1x1"
                                                    for="campoDistanciaNorteUtm1x1"/>
                                                <webuijsf:helpInline id="helpInlineDistanciaNorteUtm1x1"
                                                    binding="#{FichaHogar2.helpInlineDistanciaNorteUtm1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.distancia_norte_utm.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab3"
                                            rendered="#{FichaHogar2.asistente.seccionUbicacionRendered}"
                                            text="ubicaci&#243;n">
                                        <h:panelGrid
                                            id="gridPanel120"
                                            rendered="#{FichaHogar2.asistente.seccionUbicacionHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab3"
                                                text="#{FichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel121"
                                            rendered="#{FichaHogar2.asistente.seccionUbicacionRendered}">
                                            <h:panelGrid
                                                id="gridManzana1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelManzana1x1}"
                                                    id="labelManzana1x1"
                                                    for="campoManzana1x1"
                                                    text="manzana"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridManzana1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoManzana1x1"
                                                    binding="#{FichaHogar2.campoManzana1x1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['manzana']}"
                                                    toolTip="BundleParametros.manzana.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorManzana1.validate}"/>
                                                <webuijsf:staticText id="campoManzana1x1Texto1"
                                                    binding="#{FichaHogar2.campoManzana1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['manzana']}"/>
                                                <webuijsf:message id="messageManzana1x1"
                                                    for="campoManzana1x1"/>
                                                <webuijsf:helpInline id="helpInlineManzana1x1"
                                                    binding="#{FichaHogar2.helpInlineManzana1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.manzana.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdDepartamento1x1}"
                                                    id="labelIdDepartamento1x1"
                                                    for="campoIdDepartamento1x1"
                                                    text="departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDepartamento1x1"
                                                    binding="#{FichaHogar2.campoIdDepartamento1x1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.asistente.textoCampoIdDepartamento1}"
                                                    toolTip="#{FichaHogar2.asistente.toolTipCampoIdDepartamento1}"
                                                    validatorExpression="#{FichaHogar2.campoIdDepartamento1_validate}"/>
                                                <webuijsf:staticText id="campoIdDepartamento1x1Texto1"
                                                    binding="#{FichaHogar2.campoIdDepartamento1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_ubicacion_1x5y3']}"/>
                                                <webuijsf:button id="campoIdDepartamento1x1Boton1"
                                                    binding="#{FichaHogar2.campoIdDepartamento1x1Boton1}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdDepartamento1Boton1}"/>
                                                <webuijsf:button id="campoIdDepartamento1x1Boton3"
                                                    binding="#{FichaHogar2.campoIdDepartamento1x1Boton3}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdDepartamento1Boton2}"
                                                    rendered="#{FichaHogar2.asistente.campoIdDepartamento1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDepartamento1x1"
                                                    for="campoIdDepartamento1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdDepartamento1x1"
                                                    binding="#{FichaHogar2.helpInlineIdDepartamento1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_departamento.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDepartamento1x3"
                                                rendered="#{FichaHogar2.asistente.campoIdDepartamento1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdDepartamento1x2}"
                                                    id="labelIdDepartamento1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre departamento"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDepartamento1x4"
                                                rendered="#{FichaHogar2.asistente.campoIdDepartamento1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaHogar2.campoIdDepartamento1x1Texto2}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_ubicacion_1x5y4']}"
                                                    id="campoIdDepartamento1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar2.campoIdDepartamento1x1Boton2}"
                                                    id="campoIdDepartamento1x1Boton2"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdDepartamento1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdDistrito1x1}"
                                                    id="labelIdDistrito1x1"
                                                    for="campoIdDistrito1x1"
                                                    text="distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdDistrito1x1"
                                                    binding="#{FichaHogar2.campoIdDistrito1x1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.asistente.textoCampoIdDistrito1}"
                                                    toolTip="#{FichaHogar2.asistente.toolTipCampoIdDistrito1}"
                                                    validatorExpression="#{FichaHogar2.campoIdDistrito1_validate}"/>
                                                <webuijsf:staticText id="campoIdDistrito1x1Texto1"
                                                    binding="#{FichaHogar2.campoIdDistrito1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_ubicacion_1x6y3']}"/>
                                                <webuijsf:button id="campoIdDistrito1x1Boton1"
                                                    binding="#{FichaHogar2.campoIdDistrito1x1Boton1}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdDistrito1Boton1}"/>
                                                <webuijsf:button id="campoIdDistrito1x1Boton3"
                                                    binding="#{FichaHogar2.campoIdDistrito1x1Boton3}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdDistrito1Boton2}"
                                                    rendered="#{FichaHogar2.asistente.campoIdDistrito1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdDistrito1x1"
                                                    for="campoIdDistrito1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdDistrito1x1"
                                                    binding="#{FichaHogar2.helpInlineIdDistrito1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_distrito.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdDistrito1x3"
                                                rendered="#{FichaHogar2.asistente.campoIdDistrito1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdDistrito1x2}"
                                                    id="labelIdDistrito1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre distrito"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdDistrito1x4"
                                                rendered="#{FichaHogar2.asistente.campoIdDistrito1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaHogar2.campoIdDistrito1x1Texto2}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_ubicacion_1x6y4']}"
                                                    id="campoIdDistrito1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar2.campoIdDistrito1x1Boton2}"
                                                    id="campoIdDistrito1x1Boton2"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdDistrito1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoArea1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoArea1x1}"
                                                    id="labelNumeroTipoArea1x1"
                                                    for="listaNumeroTipoArea1x1"
                                                    text="tipo area"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoArea1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoArea1x1"
                                                    binding="#{FichaHogar2.listaNumeroTipoArea1x1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoArea1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoArea1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_area']}"
                                                    toolTip="BundleParametros.numero_tipo_area.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoArea1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoArea1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_area_1x7y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoArea1x1"
                                                    for="listaNumeroTipoArea1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoArea1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoArea1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_area.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdBarrio1x1}"
                                                    id="labelIdBarrio1x1"
                                                    for="campoIdBarrio1x1"
                                                    text="barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdBarrio1x1"
                                                    binding="#{FichaHogar2.campoIdBarrio1x1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.asistente.textoCampoIdBarrio1}"
                                                    toolTip="#{FichaHogar2.asistente.toolTipCampoIdBarrio1}"
                                                    validatorExpression="#{FichaHogar2.campoIdBarrio1_validate}"/>
                                                <webuijsf:staticText id="campoIdBarrio1x1Texto1"
                                                    binding="#{FichaHogar2.campoIdBarrio1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_ubicacion_1x8y3']}"/>
                                                <webuijsf:button id="campoIdBarrio1x1Boton1"
                                                    binding="#{FichaHogar2.campoIdBarrio1x1Boton1}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdBarrio1Boton1}"/>
                                                <webuijsf:button id="campoIdBarrio1x1Boton3"
                                                    binding="#{FichaHogar2.campoIdBarrio1x1Boton3}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdBarrio1Boton2}"
                                                    rendered="#{FichaHogar2.asistente.campoIdBarrio1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdBarrio1x1"
                                                    for="campoIdBarrio1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdBarrio1x1"
                                                    binding="#{FichaHogar2.helpInlineIdBarrio1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_barrio.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdBarrio1x3"
                                                rendered="#{FichaHogar2.asistente.campoIdBarrio1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdBarrio1x2}"
                                                    id="labelIdBarrio1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre barrio"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdBarrio1x4"
                                                rendered="#{FichaHogar2.asistente.campoIdBarrio1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaHogar2.campoIdBarrio1x1Texto2}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_ubicacion_1x8y4']}"
                                                    id="campoIdBarrio1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar2.campoIdBarrio1x1Boton2}"
                                                    id="campoIdBarrio1x1Boton2"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdBarrio1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridDireccion1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelDireccion1x1}"
                                                    id="labelDireccion1x1"
                                                    for="campoDireccion1x1"
                                                    text="direccion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridDireccion1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textArea id="campoDireccion1x1"
                                                    binding="#{FichaHogar2.campoDireccion1x1}"
                                                    columns="100" rows="3"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['direccion']}"
                                                    toolTip="BundleParametros.direccion.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorDireccion1.validate}"/>
                                                <webuijsf:staticText id="campoDireccion1x1Texto1"
                                                    binding="#{FichaHogar2.campoDireccion1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['direccion']}"/>
                                                <webuijsf:message id="messageDireccion1x1"
                                                    for="campoDireccion1x1"/>
                                                <webuijsf:helpInline id="helpInlineDireccion1x1"
                                                    binding="#{FichaHogar2.helpInlineDireccion1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.direccion.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab4"
                                            rendered="#{FichaHogar2.asistente.seccionResumenRendered}"
                                            text="resumen">
                                        <h:panelGrid
                                            id="gridPanel122"
                                            rendered="#{FichaHogar2.asistente.seccionResumenHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab4"
                                                text="#{FichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel123"
                                            rendered="#{FichaHogar2.asistente.seccionResumenRendered}">
                                            <h:panelGrid
                                                id="gridTotalPersonas1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelTotalPersonas1x1}"
                                                    id="labelTotalPersonas1x1"
                                                    for="campoTotalPersonas1x1"
                                                    text="total personas"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridTotalPersonas1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoTotalPersonas1x1"
                                                    binding="#{FichaHogar2.campoTotalPersonas1x1}"
                                                    converter="#{FichaHogar2.converterTotalPersonas1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['total_personas']}"
                                                    toolTip="BundleParametros.total_personas.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorTotalPersonas1.validate}"/>
                                                <webuijsf:staticText id="campoTotalPersonas1x1Texto1"
                                                    binding="#{FichaHogar2.campoTotalPersonas1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['total_personas']}"/>
                                                <webuijsf:message id="messageTotalPersonas1x1"
                                                    for="campoTotalPersonas1x1"/>
                                                <webuijsf:helpInline id="helpInlineTotalPersonas1x1"
                                                    binding="#{FichaHogar2.helpInlineTotalPersonas1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.total_personas.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridTotalHombres1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelTotalHombres1x1}"
                                                    id="labelTotalHombres1x1"
                                                    for="campoTotalHombres1x1"
                                                    text="total hombres"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridTotalHombres1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoTotalHombres1x1"
                                                    binding="#{FichaHogar2.campoTotalHombres1x1}"
                                                    converter="#{FichaHogar2.converterTotalHombres1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['total_hombres']}"
                                                    toolTip="BundleParametros.total_hombres.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorTotalHombres1.validate}"/>
                                                <webuijsf:staticText id="campoTotalHombres1x1Texto1"
                                                    binding="#{FichaHogar2.campoTotalHombres1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['total_hombres']}"/>
                                                <webuijsf:message id="messageTotalHombres1x1"
                                                    for="campoTotalHombres1x1"/>
                                                <webuijsf:helpInline id="helpInlineTotalHombres1x1"
                                                    binding="#{FichaHogar2.helpInlineTotalHombres1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.total_hombres.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridTotalMujeres1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelTotalMujeres1x1}"
                                                    id="labelTotalMujeres1x1"
                                                    for="campoTotalMujeres1x1"
                                                    text="total mujeres"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridTotalMujeres1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoTotalMujeres1x1"
                                                    binding="#{FichaHogar2.campoTotalMujeres1x1}"
                                                    converter="#{FichaHogar2.converterTotalMujeres1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['total_mujeres']}"
                                                    toolTip="BundleParametros.total_mujeres.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorTotalMujeres1.validate}"/>
                                                <webuijsf:staticText id="campoTotalMujeres1x1Texto1"
                                                    binding="#{FichaHogar2.campoTotalMujeres1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['total_mujeres']}"/>
                                                <webuijsf:message id="messageTotalMujeres1x1"
                                                    for="campoTotalMujeres1x1"/>
                                                <webuijsf:helpInline id="helpInlineTotalMujeres1x1"
                                                    binding="#{FichaHogar2.helpInlineTotalMujeres1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.total_mujeres.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab5"
                                            rendered="#{FichaHogar2.asistente.seccionVivienda1Rendered}"
                                            text="vivienda 1">
                                        <h:panelGrid
                                            id="gridPanel124"
                                            rendered="#{FichaHogar2.asistente.seccionVivienda1Hidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab5"
                                                text="#{FichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel125"
                                            rendered="#{FichaHogar2.asistente.seccionVivienda1Rendered}">
                                            <h:panelGrid
                                                id="gridNumeroTipoMatParedes1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoMatParedes1x1}"
                                                    id="labelNumeroTipoMatParedes1x1"
                                                    for="listaNumeroTipoMatParedes1x1"
                                                    text="tipo mat paredes"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoMatParedes1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoMatParedes1x1"
                                                    binding="#{FichaHogar2.listaNumeroTipoMatParedes1x1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoMatParedes1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoMatParedes1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_mat_paredes']}"
                                                    toolTip="BundleParametros.numero_tipo_mat_paredes.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoMatParedes1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoMatParedes1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_mat_paredes_1x10y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoMatParedes1x1"
                                                    for="listaNumeroTipoMatParedes1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoMatParedes1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoMatParedes1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_mat_paredes.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoMatPiso1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoMatPiso1x1}"
                                                    id="labelNumeroTipoMatPiso1x1"
                                                    for="listaNumeroTipoMatPiso1x1"
                                                    text="tipo mat piso"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoMatPiso1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoMatPiso1x1"
                                                    binding="#{FichaHogar2.listaNumeroTipoMatPiso1x1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoMatPiso1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoMatPiso1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_mat_piso']}"
                                                    toolTip="BundleParametros.numero_tipo_mat_piso.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoMatPiso1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoMatPiso1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_mat_piso_1x11y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoMatPiso1x1"
                                                    for="listaNumeroTipoMatPiso1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoMatPiso1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoMatPiso1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_mat_piso.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoMatTecho1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoMatTecho1x1}"
                                                    id="labelNumeroTipoMatTecho1x1"
                                                    for="listaNumeroTipoMatTecho1x1"
                                                    text="tipo mat techo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoMatTecho1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoMatTecho1x1"
                                                    binding="#{FichaHogar2.listaNumeroTipoMatTecho1x1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoMatTecho1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoMatTecho1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_mat_techo']}"
                                                    toolTip="BundleParametros.numero_tipo_mat_techo.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoMatTecho1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoMatTecho1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_mat_techo_1x12y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoMatTecho1x1"
                                                    for="listaNumeroTipoMatTecho1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoMatTecho1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoMatTecho1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_mat_techo.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoOcupacionViv1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoOcupacionViv1x1}"
                                                    id="labelNumeroTipoOcupacionViv1x1"
                                                    for="listaNumeroTipoOcupacionViv1x1"
                                                    text="tipo ocupacion viv"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoOcupacionViv1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoOcupacionViv1x1"
                                                    binding="#{FichaHogar2.listaNumeroTipoOcupacionViv1x1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoOcupacionViv1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoOcupacionViv1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_ocupacion_viv']}"
                                                    toolTip="BundleParametros.numero_tipo_ocupacion_viv.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoOcupacionViv1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoOcupacionViv1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_ocupacion_v_1x13y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoOcupacionViv1x1"
                                                    for="listaNumeroTipoOcupacionViv1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoOcupacionViv1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoOcupacionViv1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_ocupacion_viv.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridOtroTipoOcupacionViv1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelOtroTipoOcupacionViv1x1}"
                                                    id="labelOtroTipoOcupacionViv1x1"
                                                    for="campoOtroTipoOcupacionViv1x1"
                                                    text="otro tipo ocupacion viv"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridOtroTipoOcupacionViv1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoOtroTipoOcupacionViv1x1"
                                                    binding="#{FichaHogar2.campoOtroTipoOcupacionViv1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['otro_tipo_ocupacion_viv']}"
                                                    toolTip="BundleParametros.otro_tipo_ocupacion_viv.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorOtroTipoOcupacionViv1.validate}"/>
                                                <webuijsf:staticText id="campoOtroTipoOcupacionViv1x1Texto1"
                                                    binding="#{FichaHogar2.campoOtroTipoOcupacionViv1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['otro_tipo_ocupacion_viv']}"/>
                                                <webuijsf:message id="messageOtroTipoOcupacionViv1x1"
                                                    for="campoOtroTipoOcupacionViv1x1"/>
                                                <webuijsf:helpInline id="helpInlineOtroTipoOcupacionViv1x1"
                                                    binding="#{FichaHogar2.helpInlineOtroTipoOcupacionViv1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.otro_tipo_ocupacion_viv.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCantidadPiezas1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelCantidadPiezas1x1}"
                                                    id="labelCantidadPiezas1x1"
                                                    for="campoCantidadPiezas1x1"
                                                    text="cantidad piezas"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCantidadPiezas1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCantidadPiezas1x1"
                                                    binding="#{FichaHogar2.campoCantidadPiezas1x1}"
                                                    converter="#{FichaHogar2.converterCantidadPiezas1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['cantidad_piezas']}"
                                                    toolTip="BundleParametros.cantidad_piezas.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorCantidadPiezas1.validate}"/>
                                                <webuijsf:staticText id="campoCantidadPiezas1x1Texto1"
                                                    binding="#{FichaHogar2.campoCantidadPiezas1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['cantidad_piezas']}"/>
                                                <webuijsf:message id="messageCantidadPiezas1x1"
                                                    for="campoCantidadPiezas1x1"/>
                                                <webuijsf:helpInline id="helpInlineCantidadPiezas1x1"
                                                    binding="#{FichaHogar2.helpInlineCantidadPiezas1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.cantidad_piezas.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCantidadDormitorios1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelCantidadDormitorios1x1}"
                                                    id="labelCantidadDormitorios1x1"
                                                    for="campoCantidadDormitorios1x1"
                                                    text="cantidad dormitorios"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCantidadDormitorios1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCantidadDormitorios1x1"
                                                    binding="#{FichaHogar2.campoCantidadDormitorios1x1}"
                                                    converter="#{FichaHogar2.converterCantidadDormitorios1}"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['cantidad_dormitorios']}"
                                                    toolTip="BundleParametros.cantidad_dormitorios.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorCantidadDormitorios1.validate}"/>
                                                <webuijsf:staticText id="campoCantidadDormitorios1x1Texto1"
                                                    binding="#{FichaHogar2.campoCantidadDormitorios1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['cantidad_dormitorios']}"/>
                                                <webuijsf:message id="messageCantidadDormitorios1x1"
                                                    for="campoCantidadDormitorios1x1"/>
                                                <webuijsf:helpInline id="helpInlineCantidadDormitorios1x1"
                                                    binding="#{FichaHogar2.helpInlineCantidadDormitorios1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.cantidad_dormitorios.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab6"
                                            rendered="#{FichaHogar2.asistente.seccionVivienda2Rendered}"
                                            text="vivienda 2">
                                        <h:panelGrid
                                            id="gridPanel126"
                                            rendered="#{FichaHogar2.asistente.seccionVivienda2Hidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab6"
                                                text="#{FichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel127"
                                            rendered="#{FichaHogar2.asistente.seccionVivienda2Rendered}">
                                            <h:panelGrid
                                                id="gridNumeroSionoPiezaCocina1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoPiezaCocina1x1}"
                                                    id="labelNumeroSionoPiezaCocina1x1"
                                                    for="listaNumeroSionoPiezaCocina1x1"
                                                    text="pieza cocina"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoPiezaCocina1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoPiezaCocina1x1"
                                                    binding="#{FichaHogar2.listaNumeroSionoPiezaCocina1x1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoPiezaCocina1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoPiezaCocina1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_pieza_cocina']}"
                                                    toolTip="BundleParametros.numero_siono_pieza_cocina.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoPiezaCocina1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoPiezaCocina1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x14y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoPiezaCocina1x1"
                                                    for="listaNumeroSionoPiezaCocina1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoPiezaCocina1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoPiezaCocina1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_pieza_cocina.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoCombustible1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoCombustible1x1}"
                                                    id="labelNumeroTipoCombustible1x1"
                                                    for="listaNumeroTipoCombustible1x1"
                                                    text="tipo combustible"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoCombustible1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoCombustible1x1"
                                                    binding="#{FichaHogar2.listaNumeroTipoCombustible1x1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoCombustible1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoCombustible1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_combustible']}"
                                                    toolTip="BundleParametros.numero_tipo_combustible.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoCombustible1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoCombustible1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_combustible_1x15y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoCombustible1x1"
                                                    for="listaNumeroTipoCombustible1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoCombustible1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoCombustible1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_combustible.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoPiezaBano1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoPiezaBano1x1}"
                                                    id="labelNumeroTipoPiezaBano1x1"
                                                    for="listaNumeroTipoPiezaBano1x1"
                                                    text="tipo pieza bano"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoPiezaBano1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoPiezaBano1x1"
                                                    binding="#{FichaHogar2.listaNumeroTipoPiezaBano1x1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoPiezaBano1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoPiezaBano1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_pieza_bano']}"
                                                    toolTip="BundleParametros.numero_tipo_pieza_bano.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoPiezaBano1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoPiezaBano1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_pieza_bano_1x16y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoPiezaBano1x1"
                                                    for="listaNumeroTipoPiezaBano1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoPiezaBano1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoPiezaBano1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_pieza_bano.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoServicioSan1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoServicioSan1x1}"
                                                    id="labelNumeroTipoServicioSan1x1"
                                                    for="listaNumeroTipoServicioSan1x1"
                                                    text="tipo servicio san"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoServicioSan1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoServicioSan1x1"
                                                    binding="#{FichaHogar2.listaNumeroTipoServicioSan1x1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoServicioSan1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoServicioSan1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_servicio_san']}"
                                                    toolTip="BundleParametros.numero_tipo_servicio_san.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoServicioSan1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoServicioSan1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_servicio_sa_1x17y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoServicioSan1x1"
                                                    for="listaNumeroTipoServicioSan1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoServicioSan1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoServicioSan1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_servicio_san.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoServicioAgua1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoServicioAgua1x1}"
                                                    id="labelNumeroTipoServicioAgua1x1"
                                                    for="listaNumeroTipoServicioAgua1x1"
                                                    text="tipo servicio agua"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoServicioAgua1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoServicioAgua1x1"
                                                    binding="#{FichaHogar2.listaNumeroTipoServicioAgua1x1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoServicioAgua1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoServicioAgua1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_servicio_agua']}"
                                                    toolTip="BundleParametros.numero_tipo_servicio_agua.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoServicioAgua1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoServicioAgua1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_servicio_ag_1x18y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoServicioAgua1x1"
                                                    for="listaNumeroTipoServicioAgua1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoServicioAgua1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoServicioAgua1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_servicio_agua.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoAbaAgua1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoAbaAgua1x1}"
                                                    id="labelNumeroTipoAbaAgua1x1"
                                                    for="listaNumeroTipoAbaAgua1x1"
                                                    text="tipo aba agua"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoAbaAgua1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoAbaAgua1x1"
                                                    binding="#{FichaHogar2.listaNumeroTipoAbaAgua1x1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoAbaAgua1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoAbaAgua1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_aba_agua']}"
                                                    toolTip="BundleParametros.numero_tipo_aba_agua.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoAbaAgua1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoAbaAgua1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_aba_agua_1x19y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoAbaAgua1x1"
                                                    for="listaNumeroTipoAbaAgua1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoAbaAgua1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoAbaAgua1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_aba_agua.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoCorrienteElec1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoCorrienteElec1x1}"
                                                    id="labelNumeroSionoCorrienteElec1x1"
                                                    for="listaNumeroSionoCorrienteElec1x1"
                                                    text="corriente elec"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoCorrienteElec1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoCorrienteElec1x1"
                                                    binding="#{FichaHogar2.listaNumeroSionoCorrienteElec1x1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoCorrienteElec1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoCorrienteElec1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_corriente_elec']}"
                                                    toolTip="BundleParametros.numero_siono_corriente_elec.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoCorrienteElec1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoCorrienteElec1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x20y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoCorrienteElec1x1"
                                                    for="listaNumeroSionoCorrienteElec1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoCorrienteElec1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoCorrienteElec1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_corriente_elec.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTipoDesechoBas1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTipoDesechoBas1x1}"
                                                    id="labelNumeroTipoDesechoBas1x1"
                                                    for="listaNumeroTipoDesechoBas1x1"
                                                    text="tipo desecho bas"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTipoDesechoBas1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroTipoDesechoBas1x1"
                                                    binding="#{FichaHogar2.listaNumeroTipoDesechoBas1x1}"
                                                    converter="#{FichaHogar2.converterNumeroTipoDesechoBas1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroTipoDesechoBas1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_tipo_desecho_bas']}"
                                                    toolTip="BundleParametros.numero_tipo_desecho_bas.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroTipoDesechoBas1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroTipoDesechoBas1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_tipo_desecho_bas_1x21y2']}"/>
                                                <webuijsf:message id="messageNumeroTipoDesechoBas1x1"
                                                    for="listaNumeroTipoDesechoBas1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTipoDesechoBas1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTipoDesechoBas1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_tipo_desecho_bas.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab7"
                                            rendered="#{FichaHogar2.asistente.seccionVivienda3Rendered}"
                                            text="vivienda 3">
                                        <h:panelGrid
                                            id="gridPanel128"
                                            rendered="#{FichaHogar2.asistente.seccionVivienda3Hidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab7"
                                                text="#{FichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel129"
                                            rendered="#{FichaHogar2.asistente.seccionVivienda3Rendered}">
                                            <h:panelGrid
                                                id="gridNumeroSionoTelefonoCelular1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoTelefonoCelular1x1}"
                                                    id="labelNumeroSionoTelefonoCelular1x1"
                                                    for="listaNumeroSionoTelefonoCelular1x1"
                                                    text="telefono celular"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoTelefonoCelular1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoTelefonoCelular1x1"
                                                    binding="#{FichaHogar2.listaNumeroSionoTelefonoCelular1x1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoTelefonoCelular1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoTelefonoCelular1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_telefono_celular']}"
                                                    toolTip="BundleParametros.numero_siono_telefono_celular.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoTelefonoCelular1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoTelefonoCelular1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x22y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoTelefonoCelular1x1"
                                                    for="listaNumeroSionoTelefonoCelular1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoTelefonoCelular1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoTelefonoCelular1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_telefono_celular.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTelefonoCelular1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTelefonoCelular1x1}"
                                                    id="labelNumeroTelefonoCelular1x1"
                                                    for="campoNumeroTelefonoCelular1x1"
                                                    text="numero telefono celular"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTelefonoCelular1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroTelefonoCelular1x1"
                                                    binding="#{FichaHogar2.campoNumeroTelefonoCelular1x1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_telefono_celular']}"
                                                    toolTip="BundleParametros.numero_telefono_celular.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroTelefonoCelular1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoCelular1x1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroTelefonoCelular1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_telefono_celular']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoCelular1x1"
                                                    for="campoNumeroTelefonoCelular1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTelefonoCelular1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTelefonoCelular1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_telefono_celular.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoTlfLineaBaja1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoTlfLineaBaja1x1}"
                                                    id="labelNumeroSionoTlfLineaBaja1x1"
                                                    for="listaNumeroSionoTlfLineaBaja1x1"
                                                    text="tlf linea baja"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoTlfLineaBaja1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoTlfLineaBaja1x1"
                                                    binding="#{FichaHogar2.listaNumeroSionoTlfLineaBaja1x1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoTlfLineaBaja1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoTlfLineaBaja1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_tlf_linea_baja']}"
                                                    toolTip="BundleParametros.numero_siono_tlf_linea_baja.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoTlfLineaBaja1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoTlfLineaBaja1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x23y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoTlfLineaBaja1x1"
                                                    for="listaNumeroSionoTlfLineaBaja1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoTlfLineaBaja1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoTlfLineaBaja1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_tlf_linea_baja.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroTelefonoLineaBaja1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroTelefonoLineaBaja1x1}"
                                                    id="labelNumeroTelefonoLineaBaja1x1"
                                                    for="campoNumeroTelefonoLineaBaja1x1"
                                                    text="numero telefono linea baja"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroTelefonoLineaBaja1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroTelefonoLineaBaja1x1"
                                                    binding="#{FichaHogar2.campoNumeroTelefonoLineaBaja1x1}"
                                                    columns="20"
                                                    maxLength="50"
                                                    readOnly="#{FichaHogar2.gestor.filaNoProcesada}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_telefono_linea_baja']}"
                                                    toolTip="BundleParametros.numero_telefono_linea_baja.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroTelefonoLineaBaja1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroTelefonoLineaBaja1x1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroTelefonoLineaBaja1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_telefono_linea_baja']}"/>
                                                <webuijsf:message id="messageNumeroTelefonoLineaBaja1x1"
                                                    for="campoNumeroTelefonoLineaBaja1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroTelefonoLineaBaja1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroTelefonoLineaBaja1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_telefono_linea_baja.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab8"
                                            rendered="#{FichaHogar2.asistente.seccionVivienda4Rendered}"
                                            text="vivienda 4">
                                        <h:panelGrid
                                            id="gridPanel130"
                                            rendered="#{FichaHogar2.asistente.seccionVivienda4Hidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab8"
                                                text="#{FichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel131"
                                            rendered="#{FichaHogar2.asistente.seccionVivienda4Rendered}">
                                            <h:panelGrid
                                                id="gridNumeroSionoDispHeladera1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoDispHeladera1x1}"
                                                    id="labelNumeroSionoDispHeladera1x1"
                                                    for="listaNumeroSionoDispHeladera1x1"
                                                    text="disp heladera"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDispHeladera1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDispHeladera1x1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispHeladera1x1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoDispHeladera1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoDispHeladera1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_disp_heladera']}"
                                                    toolTip="BundleParametros.numero_siono_disp_heladera.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispHeladera1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispHeladera1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x24y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispHeladera1x1"
                                                    for="listaNumeroSionoDispHeladera1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDispHeladera1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoDispHeladera1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_disp_heladera.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDispLavarropas1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoDispLavarropas1x1}"
                                                    id="labelNumeroSionoDispLavarropas1x1"
                                                    for="listaNumeroSionoDispLavarropas1x1"
                                                    text="disp lavarropas"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDispLavarropas1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDispLavarropas1x1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispLavarropas1x1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoDispLavarropas1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoDispLavarropas1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_disp_lavarropas']}"
                                                    toolTip="BundleParametros.numero_siono_disp_lavarropas.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispLavarropas1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispLavarropas1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x25y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispLavarropas1x1"
                                                    for="listaNumeroSionoDispLavarropas1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDispLavarropas1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoDispLavarropas1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_disp_lavarropas.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDispTermo1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoDispTermo1x1}"
                                                    id="labelNumeroSionoDispTermo1x1"
                                                    for="listaNumeroSionoDispTermo1x1"
                                                    text="disp termo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDispTermo1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDispTermo1x1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispTermo1x1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoDispTermo1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoDispTermo1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_disp_termo']}"
                                                    toolTip="BundleParametros.numero_siono_disp_termo.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispTermo1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispTermo1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x26y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispTermo1x1"
                                                    for="listaNumeroSionoDispTermo1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDispTermo1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoDispTermo1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_disp_termo.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDispAireAcon1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoDispAireAcon1x1}"
                                                    id="labelNumeroSionoDispAireAcon1x1"
                                                    for="listaNumeroSionoDispAireAcon1x1"
                                                    text="disp aire acon"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDispAireAcon1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDispAireAcon1x1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispAireAcon1x1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoDispAireAcon1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoDispAireAcon1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_disp_aire_acon']}"
                                                    toolTip="BundleParametros.numero_siono_disp_aire_acon.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispAireAcon1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispAireAcon1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x27y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispAireAcon1x1"
                                                    for="listaNumeroSionoDispAireAcon1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDispAireAcon1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoDispAireAcon1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_disp_aire_acon.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDispAutomovil1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoDispAutomovil1x1}"
                                                    id="labelNumeroSionoDispAutomovil1x1"
                                                    for="listaNumeroSionoDispAutomovil1x1"
                                                    text="disp automovil"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDispAutomovil1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDispAutomovil1x1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispAutomovil1x1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoDispAutomovil1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoDispAutomovil1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_disp_automovil']}"
                                                    toolTip="BundleParametros.numero_siono_disp_automovil.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispAutomovil1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispAutomovil1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x28y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispAutomovil1x1"
                                                    for="listaNumeroSionoDispAutomovil1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDispAutomovil1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoDispAutomovil1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_disp_automovil.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDispCamion1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoDispCamion1x1}"
                                                    id="labelNumeroSionoDispCamion1x1"
                                                    for="listaNumeroSionoDispCamion1x1"
                                                    text="disp camion"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDispCamion1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDispCamion1x1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispCamion1x1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoDispCamion1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoDispCamion1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_disp_camion']}"
                                                    toolTip="BundleParametros.numero_siono_disp_camion.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispCamion1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispCamion1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x29y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispCamion1x1"
                                                    for="listaNumeroSionoDispCamion1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDispCamion1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoDispCamion1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_disp_camion.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroSionoDispMotocicleta1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroSionoDispMotocicleta1x1}"
                                                    id="labelNumeroSionoDispMotocicleta1x1"
                                                    for="listaNumeroSionoDispMotocicleta1x1"
                                                    text="disp motocicleta"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroSionoDispMotocicleta1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaNumeroSionoDispMotocicleta1x1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispMotocicleta1x1}"
                                                    converter="#{FichaHogar2.converterNumeroSionoDispMotocicleta1}"
                                                    disabled="#{FichaHogar2.gestor.filaNoProcesada}" required="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaNumeroSionoDispMotocicleta1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['numero_siono_disp_motocicleta']}"
                                                    toolTip="BundleParametros.numero_siono_disp_motocicleta.ficha_hogar"/>
                                                <webuijsf:staticText id="listaNumeroSionoDispMotocicleta1x1Texto1"
                                                    binding="#{FichaHogar2.listaNumeroSionoDispMotocicleta1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_siono_1x30y2']}"/>
                                                <webuijsf:message id="messageNumeroSionoDispMotocicleta1x1"
                                                    for="listaNumeroSionoDispMotocicleta1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroSionoDispMotocicleta1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroSionoDispMotocicleta1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_siono_disp_motocicleta.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab9"
                                            rendered="#{FichaHogar2.asistente.seccionJefeRendered}"
                                            text="jefe">
                                        <h:panelGrid
                                            id="gridPanel132"
                                            rendered="#{FichaHogar2.asistente.seccionJefeHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab9"
                                                text="#{FichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel133"
                                            rendered="#{FichaHogar2.asistente.seccionJefeRendered}">
                                            <h:panelGrid
                                                id="gridNombreJefeHogar1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNombreJefeHogar1x1}"
                                                    id="labelNombreJefeHogar1x1"
                                                    for="campoNombreJefeHogar1x1"
                                                    text="nombre jefe hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreJefeHogar1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreJefeHogar1x1"
                                                    binding="#{FichaHogar2.campoNombreJefeHogar1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_jefe_hogar']}"
                                                    toolTip="BundleParametros.nombre_jefe_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNombreJefeHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNombreJefeHogar1x1Texto1"
                                                    binding="#{FichaHogar2.campoNombreJefeHogar1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_jefe_hogar']}"/>
                                                <webuijsf:message id="messageNombreJefeHogar1x1"
                                                    for="campoNombreJefeHogar1x1"/>
                                                <webuijsf:helpInline id="helpInlineNombreJefeHogar1x1"
                                                    binding="#{FichaHogar2.helpInlineNombreJefeHogar1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_jefe_hogar.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCedulaJefeHogar1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroCedulaJefeHogar1x1}"
                                                    id="labelNumeroCedulaJefeHogar1x1"
                                                    for="campoNumeroCedulaJefeHogar1x1"
                                                    text="numero cedula jefe hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCedulaJefeHogar1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroCedulaJefeHogar1x1"
                                                    binding="#{FichaHogar2.campoNumeroCedulaJefeHogar1x1}"
                                                    converter="#{FichaHogar2.converterNumeroCedulaJefeHogar1}"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_cedula_jefe_hogar']}"
                                                    toolTip="BundleParametros.numero_cedula_jefe_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroCedulaJefeHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedulaJefeHogar1x1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroCedulaJefeHogar1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_cedula_jefe_hogar']}"/>
                                                <webuijsf:message id="messageNumeroCedulaJefeHogar1x1"
                                                    for="campoNumeroCedulaJefeHogar1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCedulaJefeHogar1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroCedulaJefeHogar1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_cedula_jefe_hogar.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLetraCedulaJefeHogar1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelLetraCedulaJefeHogar1x1}"
                                                    id="labelLetraCedulaJefeHogar1x1"
                                                    for="campoLetraCedulaJefeHogar1x1"
                                                    text="letra cedula jefe hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLetraCedulaJefeHogar1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoLetraCedulaJefeHogar1x1"
                                                    binding="#{FichaHogar2.campoLetraCedulaJefeHogar1x1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['letra_cedula_jefe_hogar']}"
                                                    toolTip="BundleParametros.letra_cedula_jefe_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorLetraCedulaJefeHogar1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedulaJefeHogar1x1Texto1"
                                                    binding="#{FichaHogar2.campoLetraCedulaJefeHogar1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['letra_cedula_jefe_hogar']}"/>
                                                <webuijsf:message id="messageLetraCedulaJefeHogar1x1"
                                                    for="campoLetraCedulaJefeHogar1x1"/>
                                                <webuijsf:helpInline id="helpInlineLetraCedulaJefeHogar1x1"
                                                    binding="#{FichaHogar2.helpInlineLetraCedulaJefeHogar1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.letra_cedula_jefe_hogar.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroOrdenIdenJefeHogar1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroOrdenIdenJefeHogar1x1}"
                                                    id="labelNumeroOrdenIdenJefeHogar1x1"
                                                    for="campoNumeroOrdenIdenJefeHogar1x1"
                                                    text="numero orden iden jefe hogar"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroOrdenIdenJefeHogar1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroOrdenIdenJefeHogar1x1"
                                                    binding="#{FichaHogar2.campoNumeroOrdenIdenJefeHogar1x1}"
                                                    converter="#{FichaHogar2.converterNumeroOrdenIdenJefeHogar1}"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_orden_iden_jefe_hogar']}"
                                                    toolTip="BundleParametros.numero_orden_iden_jefe_hogar.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroOrdenIdenJefeHogar1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenJefeHogar1x1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroOrdenIdenJefeHogar1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_orden_iden_jefe_hogar']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenJefeHogar1x1"
                                                    for="campoNumeroOrdenIdenJefeHogar1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroOrdenIdenJefeHogar1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroOrdenIdenJefeHogar1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_orden_iden_jefe_hogar.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab10"
                                            rendered="#{FichaHogar2.asistente.seccionRespondenteRendered}"
                                            text="respondente">
                                        <h:panelGrid
                                            id="gridPanel134"
                                            rendered="#{FichaHogar2.asistente.seccionRespondenteHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab10"
                                                text="#{FichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel135"
                                            rendered="#{FichaHogar2.asistente.seccionRespondenteRendered}">
                                            <h:panelGrid
                                                id="gridNombreRespondente1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNombreRespondente1x1}"
                                                    id="labelNombreRespondente1x1"
                                                    for="campoNombreRespondente1x1"
                                                    text="nombre respondente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreRespondente1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreRespondente1x1"
                                                    binding="#{FichaHogar2.campoNombreRespondente1x1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_respondente']}"
                                                    toolTip="BundleParametros.nombre_respondente.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNombreRespondente1.validate}"/>
                                                <webuijsf:staticText id="campoNombreRespondente1x1Texto1"
                                                    binding="#{FichaHogar2.campoNombreRespondente1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_respondente']}"/>
                                                <webuijsf:message id="messageNombreRespondente1x1"
                                                    for="campoNombreRespondente1x1"/>
                                                <webuijsf:helpInline id="helpInlineNombreRespondente1x1"
                                                    binding="#{FichaHogar2.helpInlineNombreRespondente1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_respondente.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCedulaRespondente1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroCedulaRespondente1x1}"
                                                    id="labelNumeroCedulaRespondente1x1"
                                                    for="campoNumeroCedulaRespondente1x1"
                                                    text="numero cedula respondente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCedulaRespondente1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroCedulaRespondente1x1"
                                                    binding="#{FichaHogar2.campoNumeroCedulaRespondente1x1}"
                                                    converter="#{FichaHogar2.converterNumeroCedulaRespondente1}"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_cedula_respondente']}"
                                                    toolTip="BundleParametros.numero_cedula_respondente.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroCedulaRespondente1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedulaRespondente1x1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroCedulaRespondente1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_cedula_respondente']}"/>
                                                <webuijsf:message id="messageNumeroCedulaRespondente1x1"
                                                    for="campoNumeroCedulaRespondente1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCedulaRespondente1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroCedulaRespondente1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_cedula_respondente.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLetraCedulaRespondente1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelLetraCedulaRespondente1x1}"
                                                    id="labelLetraCedulaRespondente1x1"
                                                    for="campoLetraCedulaRespondente1x1"
                                                    text="letra cedula respondente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLetraCedulaRespondente1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoLetraCedulaRespondente1x1"
                                                    binding="#{FichaHogar2.campoLetraCedulaRespondente1x1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['letra_cedula_respondente']}"
                                                    toolTip="BundleParametros.letra_cedula_respondente.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorLetraCedulaRespondente1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedulaRespondente1x1Texto1"
                                                    binding="#{FichaHogar2.campoLetraCedulaRespondente1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['letra_cedula_respondente']}"/>
                                                <webuijsf:message id="messageLetraCedulaRespondente1x1"
                                                    for="campoLetraCedulaRespondente1x1"/>
                                                <webuijsf:helpInline id="helpInlineLetraCedulaRespondente1x1"
                                                    binding="#{FichaHogar2.helpInlineLetraCedulaRespondente1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.letra_cedula_respondente.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroOrdenIdenRespondente1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelNumeroOrdenIdenRespondente1x1}"
                                                    id="labelNumeroOrdenIdenRespondente1x1"
                                                    for="campoNumeroOrdenIdenRespondente1x1"
                                                    text="numero orden iden respondente"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroOrdenIdenRespondente1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroOrdenIdenRespondente1x1"
                                                    binding="#{FichaHogar2.campoNumeroOrdenIdenRespondente1x1}"
                                                    converter="#{FichaHogar2.converterNumeroOrdenIdenRespondente1}"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_orden_iden_respondente']}"
                                                    toolTip="BundleParametros.numero_orden_iden_respondente.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorNumeroOrdenIdenRespondente1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroOrdenIdenRespondente1x1Texto1"
                                                    binding="#{FichaHogar2.campoNumeroOrdenIdenRespondente1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['numero_orden_iden_respondente']}"/>
                                                <webuijsf:message id="messageNumeroOrdenIdenRespondente1x1"
                                                    for="campoNumeroOrdenIdenRespondente1x1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroOrdenIdenRespondente1x1"
                                                    binding="#{FichaHogar2.helpInlineNumeroOrdenIdenRespondente1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_orden_iden_respondente.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        <webuijsf:tab
                                            id="tab11"
                                            rendered="#{FichaHogar2.asistente.seccionEtcRendered}"
                                            text="etc">
                                        <h:panelGrid
                                            id="gridPanel136"
                                            rendered="#{FichaHogar2.asistente.seccionEtcHidden}">
                                            <webuijsf:staticText
                                                id="hiddenStaticTextTab11"
                                                text="#{FichaHogar2.gestor.i18n.textHiddenStaticTextTab}"/>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel137"
                                            rendered="#{FichaHogar2.asistente.seccionEtcRendered}">
                                            <h:panelGrid
                                                id="gridIdProveedorDatExt1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdProveedorDatExt1x1}"
                                                    id="labelIdProveedorDatExt1x1"
                                                    for="campoIdProveedorDatExt1x1"
                                                    text="proveedor dat ext"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdProveedorDatExt1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdProveedorDatExt1x1"
                                                    binding="#{FichaHogar2.campoIdProveedorDatExt1x1}"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.asistente.textoCampoIdProveedorDatExt1}"
                                                    toolTip="#{FichaHogar2.asistente.toolTipCampoIdProveedorDatExt1}"
                                                    validatorExpression="#{FichaHogar2.campoIdProveedorDatExt1_validate}"/>
                                                <webuijsf:staticText id="campoIdProveedorDatExt1x1Texto1"
                                                    binding="#{FichaHogar2.campoIdProveedorDatExt1x1Texto1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['codigo_proveedor_dat_ex_1x31y3']}"/>
                                                <webuijsf:button id="campoIdProveedorDatExt1x1Boton1"
                                                    binding="#{FichaHogar2.campoIdProveedorDatExt1x1Boton1}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdProveedorDatExt1Boton1}"/>
                                                <webuijsf:button id="campoIdProveedorDatExt1x1Boton3"
                                                    binding="#{FichaHogar2.campoIdProveedorDatExt1x1Boton3}"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdProveedorDatExt1Boton2}"
                                                    rendered="#{FichaHogar2.asistente.campoIdProveedorDatExt1Boton3Rendered}"/>
                                                <webuijsf:message id="messageIdProveedorDatExt1x1"
                                                    for="campoIdProveedorDatExt1x1"/>
                                                <webuijsf:helpInline id="helpInlineIdProveedorDatExt1x1"
                                                    binding="#{FichaHogar2.helpInlineIdProveedorDatExt1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_proveedor_dat_ext.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdProveedorDatExt1x3"
                                                rendered="#{FichaHogar2.asistente.campoIdProveedorDatExt1Boton2Rendered}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIdProveedorDatExt1x2}"
                                                    id="labelIdProveedorDatExt1x2"
                                                    styleClass="pdq-estilo-id-2"
                                                    text="nombre proveedor dat ext"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdProveedorDatExt1x4"
                                                rendered="#{FichaHogar2.asistente.campoIdProveedorDatExt1Boton2Rendered}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    binding="#{FichaHogar2.campoIdProveedorDatExt1x1Texto2}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['nombre_proveedor_dat_ex_1x31y4']}"
                                                    id="campoIdProveedorDatExt1x1Texto2"/>
                                                <webuijsf:button
                                                    binding="#{FichaHogar2.campoIdProveedorDatExt1x1Boton2}"
                                                    id="campoIdProveedorDatExt1x1Boton2"
                                                    onClick="#{FichaHogar2.asistente.scriptCampoIdProveedorDatExt1Boton2}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIndiceCalidadVida1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelIndiceCalidadVida1x1}"
                                                    id="labelIndiceCalidadVida1x1"
                                                    for="campoIndiceCalidadVida1x1"
                                                    text="indice calidad vida"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIndiceCalidadVida1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIndiceCalidadVida1x1"
                                                    binding="#{FichaHogar2.campoIndiceCalidadVida1x1}"
                                                    converter="#{FichaHogar2.converterIndiceCalidadVida1}"
                                                    readOnly="true"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['indice_calidad_vida']}"
                                                    toolTip="BundleParametros.indice_calidad_vida.ficha_hogar"
                                                    validatorExpression="#{FichaHogar2.validatorIndiceCalidadVida1.validate}"/>
                                                <webuijsf:staticText id="campoIndiceCalidadVida1x1Texto1"
                                                    binding="#{FichaHogar2.campoIndiceCalidadVida1x1Texto1}"
                                                    converter="#{FichaHogar2.converterIndiceCalidadVida1}"
                                                    text="#{FichaHogar2.fichaHogarDataProvider.value['indice_calidad_vida']}"/>
                                                <webuijsf:message id="messageIndiceCalidadVida1x1"
                                                    for="campoIndiceCalidadVida1x1"/>
                                                <webuijsf:helpInline id="helpInlineIndiceCalidadVida1x1"
                                                    binding="#{FichaHogar2.helpInlineIndiceCalidadVida1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.indice_calidad_vida.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridEsFichaHogarInactiva1x1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{FichaHogar2.labelEsFichaHogarInactiva1x1}"
                                                    id="labelEsFichaHogarInactiva1x1"
                                                    for="listaEsFichaHogarInactiva1x1"
                                                    text="inactiva"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridEsFichaHogarInactiva1x2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:dropDown id="listaEsFichaHogarInactiva1x1"
                                                    binding="#{FichaHogar2.listaEsFichaHogarInactiva1x1}"
                                                    converter="#{FichaHogar2.converterEsFichaHogarInactiva1}"
                                                    disabled="true"
                                                    items="#{FichaHogar2.asistente.opcionesListaEsFichaHogarInactiva1}"
                                                    selected="#{FichaHogar2.fichaHogarDataProvider.value['es_ficha_hogar_inactiva']}"
                                                    toolTip="BundleParametros.es_ficha_hogar_inactiva.ficha_hogar"/>
                                                <webuijsf:staticText id="listaEsFichaHogarInactiva1x1Texto1"
                                                    binding="#{FichaHogar2.listaEsFichaHogarInactiva1x1Texto1}"/>
                                                <webuijsf:message id="messageEsFichaHogarInactiva1x1"
                                                    for="listaEsFichaHogarInactiva1x1"/>
                                                <webuijsf:helpInline id="helpInlineEsFichaHogarInactiva1x1"
                                                    binding="#{FichaHogar2.helpInlineEsFichaHogarInactiva1x1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.es_ficha_hogar_inactiva.ficha_hogar"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </webuijsf:tab>
                                        </webuijsf:tabSet>
                                        <h:panelGrid
                                            id="gridPanel138"
                                            styleClass="pdq-grid-detalle-pie">
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel139">
                                            <h:panelGrid
                                                id="gridPanel140"
                                                styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid 
                                                    columns="7"
                                                    id="gridPanel141">
                                                    <webuijsf:button
                                                        actionExpression="#{FichaHogar2.botonIrAlPrimero2_action}"
                                                        binding="#{FichaHogar2.botonIrAlPrimero2}"
                                                        disabled="#{FichaHogar2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{FichaHogar2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{FichaHogar2.gestor.scriptIrAlPrimero}"
                                                        text="#{FichaHogar2.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FichaHogar2.botonIrAlAnterior2_action}"
                                                        binding="#{FichaHogar2.botonIrAlAnterior2}"
                                                        disabled="#{FichaHogar2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{FichaHogar2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{FichaHogar2.gestor.scriptIrAlAnterior}"
                                                        text="#{FichaHogar2.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FichaHogar2.botonIrAlSiguiente2_action}"
                                                        binding="#{FichaHogar2.botonIrAlSiguiente2}"
                                                        disabled="#{FichaHogar2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{FichaHogar2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{FichaHogar2.gestor.scriptIrAlSiguiente}"
                                                        text="#{FichaHogar2.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FichaHogar2.botonIrAlUltimo2_action}"
                                                        binding="#{FichaHogar2.botonIrAlUltimo2}"
                                                        disabled="#{FichaHogar2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{FichaHogar2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{FichaHogar2.gestor.scriptIrAlUltimo}"
                                                        text="#{FichaHogar2.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{FichaHogar2.botonProcesarFila2_action}"
                                                        binding="#{FichaHogar2.botonProcesarFila2}"
                                                        disabled="#{FichaHogar2.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{FichaHogar2.gestor.urlImagenProcesar}"
                                                        onClick="#{FichaHogar2.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{FichaHogar2.asistente.comandoDisponible}"
                                                        text="#{FichaHogar2.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel142"
                                                styleClass="pdq-grid-detalle-mensajes">
                                                <h:panelGrid
                                                    id="gridPanel143"
                                                    styleClass="pdq-grid-detalle-mensajes-2">
                                                    <webuijsf:staticText
                                                        id="textoMensajeCambiosPorConfirmar1"
                                                        style="font-weight: bold"
                                                        text="#{FichaHogar2.gestor.mensajeCambiosPorConfirmar}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid 
                                            id="gridPanel144">
                                            <h:panelGrid 
                                                id="gridPanel145">
                                                <webuijsf:anchor 
                                                    id="anchor1"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel146">
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar2.botonAgregar1_action}"
                                                    binding="#{FichaHogar2.botonAgregar1}"
                                                    disabled="#{FichaHogar2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{FichaHogar2.gestor.scriptAgregar}"
                                                    rendered="#{FichaHogar2.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar2.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FichaHogar2.listaFuncionEdicion1}"
                                                    converter="#{FichaHogar2.converterListaFuncionEdicion1}"
                                                    disabled="#{FichaHogar2.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{FichaHogar2.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{FichaHogar2.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{FichaHogar2.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{FichaHogar2.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar2.botonEditar1_action}"
                                                    binding="#{FichaHogar2.botonEditar1}"
                                                    disabled="#{FichaHogar2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{FichaHogar2.gestor.scriptEditar}"
                                                    rendered="#{FichaHogar2.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{FichaHogar2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar2.botonEliminar1_action}"
                                                    binding="#{FichaHogar2.botonEliminar1}"
                                                    disabled="#{FichaHogar2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{FichaHogar2.gestor.scriptEliminar}"
                                                    rendered="#{FichaHogar2.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar2.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar2.botonAplicar1_action}"
                                                    binding="#{FichaHogar2.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{FichaHogar2.gestor.scriptAplicar}"
                                                    rendered="#{FichaHogar2.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar2.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar2.botonDeshacer1_action}"
                                                    binding="#{FichaHogar2.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{FichaHogar2.gestor.scriptDeshacer}"
                                                    rendered="#{FichaHogar2.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar2.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar2.botonConfirmar1_action}"
                                                    binding="#{FichaHogar2.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{FichaHogar2.gestor.scriptConfirmar}"
                                                    rendered="#{FichaHogar2.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar2.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar2.botonDescartar1_action}"
                                                    binding="#{FichaHogar2.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{FichaHogar2.gestor.scriptDescartar}"
                                                    rendered="#{FichaHogar2.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar2.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{FichaHogar2.listaFuncionAccion1}"
                                                    converter="#{FichaHogar2.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{FichaHogar2.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{FichaHogar2.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{FichaHogar2.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{FichaHogar2.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar2.botonProcesar1_action}"
                                                    binding="#{FichaHogar2.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{FichaHogar2.gestor.scriptProcesar}"
                                                    rendered="#{FichaHogar2.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar2.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar2.botonRefrescar1_action}"
                                                    binding="#{FichaHogar2.botonRefrescar1}"
                                                    disabled="#{FichaHogar2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{FichaHogar2.gestor.scriptRefrescar}"
                                                    rendered="#{FichaHogar2.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar2.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar2.botonReconsultar1_action}"
                                                    binding="#{FichaHogar2.botonReconsultar1}"
                                                    disabled="#{FichaHogar2.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{FichaHogar2.gestor.scriptReconsultar}"
                                                    rendered="#{FichaHogar2.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar2.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{FichaHogar2.botonRetornar1_action}"
                                                    binding="#{FichaHogar2.botonRetornar1}"
                                                    disabled="#{FichaHogar2.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{FichaHogar2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{FichaHogar2.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{FichaHogar2.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{FichaHogar2.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="2" 
                                                id="gridPanel147"
                                                rendered="#{FichaHogar2.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{FichaHogar2.imageHyperlink1_action}"
                                                    binding="#{FichaHogar2.imageHyperlink1}"
                                                    disabled="#{FichaHogar2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{FichaHogar2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FichaHogar2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.FichaHogar2_imageHyperlink1_toolTip}"/>
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{FichaHogar2.imageHyperlink2_action}"
                                                    binding="#{FichaHogar2.imageHyperlink2}"
                                                    disabled="#{FichaHogar2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink2"
                                                    imageURL="#{FichaHogar2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FichaHogar2.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{FichaHogar2.gestor.designing}"
                                                    text="Hyperlink2"
                                                    toolTip="#{bundle.FichaHogar2_imageHyperlink2_toolTip}"/>
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
