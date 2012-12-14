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
                    focus="#{Funcionario6.gestor.focus}"
                    id="body1"
                    onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}"
                    onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}"
                    preserveFocus="#{Funcionario6.gestor.preserveFocus}"
                    preserveScroll="#{Funcionario6.gestor.preserveScroll}"
                    styleClass="pdq-body-1">
                    <webuijsf:form 
                        binding="#{Funcionario6.form1}" 
                        id="form1" 
                        virtualFormsConfig="virtualForm1 | campoIdFuncionario1 campoCodigoFuncionario1 campoNombreFuncionario1 campoNumeroCedula1 campoLetraCedula1 campoPrimerNombre1 campoSegundoNombre1 campoPrimerApellido1 campoSegundoApellido1 campoApellidoCasada1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | | , virtualForm3 | listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonAgregar1 botonDescartar1 botonRefrescar1 botonReconsultar1 botonRetornar1 ">
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
                                        binding="#{Funcionario6.breadcrumbs1}" 
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
                                                    rendered="#{Funcionario6.gestor.urlImagenSeveridadMensajeDisponible}"
                                                    url="#{Funcionario6.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink
                                                    align="middle"
                                                    id="hipervinculoMensaje1"
                                                    rendered="#{Funcionario6.gestor.mensajeDisponible}"
                                                    text="#{Funcionario6.gestor.mensaje}"
                                                    url="#{Funcionario6.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel104"
                                            rendered="#{Funcionario6.gestor.filaDisponible}"
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
                                                        actionExpression="#{Funcionario6.botonIrAlPrimero1_action}"
                                                        binding="#{Funcionario6.botonIrAlPrimero1}"
                                                        disabled="#{Funcionario6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1"
                                                        imageURL="#{Funcionario6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Funcionario6.gestor.scriptIrAlPrimero}"
                                                        text="#{Funcionario6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Funcionario6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Funcionario6.botonIrAlAnterior1_action}"
                                                        binding="#{Funcionario6.botonIrAlAnterior1}"
                                                        disabled="#{Funcionario6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1"
                                                        imageURL="#{Funcionario6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Funcionario6.gestor.scriptIrAlAnterior}"
                                                        text="#{Funcionario6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Funcionario6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Funcionario6.botonIrAlSiguiente1_action}"
                                                        binding="#{Funcionario6.botonIrAlSiguiente1}"
                                                        disabled="#{Funcionario6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1"
                                                        imageURL="#{Funcionario6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Funcionario6.gestor.scriptIrAlSiguiente}"
                                                        text="#{Funcionario6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Funcionario6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Funcionario6.botonIrAlUltimo1_action}"
                                                        binding="#{Funcionario6.botonIrAlUltimo1}"
                                                        disabled="#{Funcionario6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1"
                                                        imageURL="#{Funcionario6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Funcionario6.gestor.scriptIrAlUltimo}"
                                                        text="#{Funcionario6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Funcionario6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Funcionario6.botonProcesarFila1_action}"
                                                        binding="#{Funcionario6.botonProcesarFila1}"
                                                        disabled="#{Funcionario6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1"
                                                        imageURL="#{Funcionario6.gestor.urlImagenProcesar}"
                                                        onClick="#{Funcionario6.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Funcionario6.asistente.comandoDisponible}"
                                                        text="#{Funcionario6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Funcionario6.gestor.i18n.toolTipBotonProcesarFila}"/>
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
                                                        text="#{Funcionario6.gestor.tituloConsulta}"/>
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
                                                    binding="#{Funcionario6.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1"
                                                    text="#{Funcionario6.gestor.i18n.textoEtiquetaIdentificacionFila}"
                                                    toolTip="#{Funcionario6.gestor.i18n.toolTipEtiquetaIdentificacionFila}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel113"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoIdentificacionFila1"
                                                    style="font-weight: bold"
                                                    text="#{Funcionario6.gestor.identificacionFila}"/>
                                                <webuijsf:image
                                                    id="imagenFilaProcesada1"
                                                    toolTip="#{Funcionario6.gestor.toolTipImagenFilaProcesada}"
                                                    url="#{Funcionario6.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel114"
                                                rendered="#{Funcionario6.gestor.designing}"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcionario6.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1"
                                                    text="?"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPanel115"
                                                rendered="#{Funcionario6.gestor.designing}"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:staticText
                                                    id="textoDenominacionFilaMaestro1"
                                                    style="font-weight: bold"
                                                    text="#{Funcionario6.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image
                                                    id="imagenFilaMaestro1"
                                                    url="#{Funcionario6.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridIdFuncionario1" rendered="false"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcionario6.labelIdFuncionario1}"
                                                    id="labelIdFuncionario1"
                                                    for="campoIdFuncionario1"
                                                    text="identificaci&#243;n"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridIdFuncionario2" rendered="false"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoIdFuncionario1"
                                                    binding="#{Funcionario6.campoIdFuncionario1}"
                                                    converter="#{Funcionario6.converterIdFuncionario1}"
                                                    readOnly="#{Funcionario6.gestor.filaNoProcesada}"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['id_funcionario']}"
                                                    toolTip="BundleParametros.id_funcionario.funcionario"
                                                    validatorExpression="#{Funcionario6.validatorIdFuncionario1.validate}"/>
                                                <webuijsf:staticText id="campoIdFuncionario1Texto1"
                                                    binding="#{Funcionario6.campoIdFuncionario1Texto1}"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['id_funcionario']}"/>
                                                <webuijsf:message id="messageIdFuncionario1"
                                                    for="campoIdFuncionario1"/>
                                                <webuijsf:helpInline id="helpInlineIdFuncionario1"
                                                    binding="#{Funcionario6.helpInlineIdFuncionario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.id_funcionario.funcionario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridCodigoFuncionario1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcionario6.labelCodigoFuncionario1}"
                                                    id="labelCodigoFuncionario1"
                                                    for="campoCodigoFuncionario1"
                                                    text="c&#243;digo"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridCodigoFuncionario2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoCodigoFuncionario1"
                                                    binding="#{Funcionario6.campoCodigoFuncionario1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="true"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['codigo_funcionario']}"
                                                    toolTip="BundleParametros.codigo_funcionario.funcionario"
                                                    validatorExpression="#{Funcionario6.validatorCodigoFuncionario1.validate}"/>
                                                <webuijsf:staticText id="campoCodigoFuncionario1Texto1"
                                                    binding="#{Funcionario6.campoCodigoFuncionario1Texto1}"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['codigo_funcionario']}"/>
                                                <webuijsf:message id="messageCodigoFuncionario1"
                                                    for="campoCodigoFuncionario1"/>
                                                <webuijsf:helpInline id="helpInlineCodigoFuncionario1"
                                                    binding="#{Funcionario6.helpInlineCodigoFuncionario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.codigo_funcionario.funcionario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNombreFuncionario1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcionario6.labelNombreFuncionario1}"
                                                    id="labelNombreFuncionario1"
                                                    for="campoNombreFuncionario1"
                                                    text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNombreFuncionario2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNombreFuncionario1"
                                                    binding="#{Funcionario6.campoNombreFuncionario1}"
                                                    columns="50"
                                                    maxLength="100"
                                                    readOnly="true"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['nombre_funcionario']}"
                                                    toolTip="BundleParametros.nombre_funcionario.funcionario"
                                                    validatorExpression="#{Funcionario6.validatorNombreFuncionario1.validate}"/>
                                                <webuijsf:staticText id="campoNombreFuncionario1Texto1"
                                                    binding="#{Funcionario6.campoNombreFuncionario1Texto1}"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['nombre_funcionario']}"/>
                                                <webuijsf:message id="messageNombreFuncionario1"
                                                    for="campoNombreFuncionario1"/>
                                                <webuijsf:helpInline id="helpInlineNombreFuncionario1"
                                                    binding="#{Funcionario6.helpInlineNombreFuncionario1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.nombre_funcionario.funcionario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridNumeroCedula1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcionario6.labelNumeroCedula1}"
                                                    id="labelNumeroCedula1"
                                                    for="campoNumeroCedula1"
                                                    text="n&#250;mero c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridNumeroCedula2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoNumeroCedula1"
                                                    binding="#{Funcionario6.campoNumeroCedula1}"
                                                    converter="#{Funcionario6.converterNumeroCedula1}"
                                                    readOnly="#{Funcionario6.gestor.filaNoProcesada}" required="true"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['numero_cedula']}"
                                                    toolTip="BundleParametros.numero_cedula.funcionario"
                                                    validatorExpression="#{Funcionario6.validatorNumeroCedula1.validate}"/>
                                                <webuijsf:staticText id="campoNumeroCedula1Texto1"
                                                    binding="#{Funcionario6.campoNumeroCedula1Texto1}"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['numero_cedula']}"/>
                                                <webuijsf:message id="messageNumeroCedula1"
                                                    for="campoNumeroCedula1"/>
                                                <webuijsf:helpInline id="helpInlineNumeroCedula1"
                                                    binding="#{Funcionario6.helpInlineNumeroCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.numero_cedula.funcionario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridLetraCedula1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcionario6.labelLetraCedula1}"
                                                    id="labelLetraCedula1"
                                                    for="campoLetraCedula1"
                                                    text="letra c&#233;dula"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridLetraCedula2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoLetraCedula1"
                                                    binding="#{Funcionario6.campoLetraCedula1}"
                                                    columns="1"
                                                    maxLength="1"
                                                    readOnly="#{Funcionario6.gestor.filaNoProcesada}"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['letra_cedula']}"
                                                    toolTip="BundleParametros.letra_cedula.funcionario"
                                                    validatorExpression="#{Funcionario6.validatorLetraCedula1.validate}"/>
                                                <webuijsf:staticText id="campoLetraCedula1Texto1"
                                                    binding="#{Funcionario6.campoLetraCedula1Texto1}"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['letra_cedula']}"/>
                                                <webuijsf:message id="messageLetraCedula1"
                                                    for="campoLetraCedula1"/>
                                                <webuijsf:helpInline id="helpInlineLetraCedula1"
                                                    binding="#{Funcionario6.helpInlineLetraCedula1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.letra_cedula.funcionario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPrimerNombre1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcionario6.labelPrimerNombre1}"
                                                    id="labelPrimerNombre1"
                                                    for="campoPrimerNombre1"
                                                    text="primer nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerNombre2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoPrimerNombre1"
                                                    binding="#{Funcionario6.campoPrimerNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Funcionario6.gestor.filaNoProcesada}" required="true"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['primer_nombre']}"
                                                    toolTip="BundleParametros.primer_nombre.funcionario"
                                                    validatorExpression="#{Funcionario6.validatorPrimerNombre1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerNombre1Texto1"
                                                    binding="#{Funcionario6.campoPrimerNombre1Texto1}"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['primer_nombre']}"/>
                                                <webuijsf:message id="messagePrimerNombre1"
                                                    for="campoPrimerNombre1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerNombre1"
                                                    binding="#{Funcionario6.helpInlinePrimerNombre1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_nombre.funcionario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoNombre1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcionario6.labelSegundoNombre1}"
                                                    id="labelSegundoNombre1"
                                                    for="campoSegundoNombre1"
                                                    text="segundo nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoNombre2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoSegundoNombre1"
                                                    binding="#{Funcionario6.campoSegundoNombre1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Funcionario6.gestor.filaNoProcesada}"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['segundo_nombre']}"
                                                    toolTip="BundleParametros.segundo_nombre.funcionario"
                                                    validatorExpression="#{Funcionario6.validatorSegundoNombre1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoNombre1Texto1"
                                                    binding="#{Funcionario6.campoSegundoNombre1Texto1}"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['segundo_nombre']}"/>
                                                <webuijsf:message id="messageSegundoNombre1"
                                                    for="campoSegundoNombre1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoNombre1"
                                                    binding="#{Funcionario6.helpInlineSegundoNombre1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_nombre.funcionario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPrimerApellido1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcionario6.labelPrimerApellido1}"
                                                    id="labelPrimerApellido1"
                                                    for="campoPrimerApellido1"
                                                    text="primer apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridPrimerApellido2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoPrimerApellido1"
                                                    binding="#{Funcionario6.campoPrimerApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Funcionario6.gestor.filaNoProcesada}" required="true"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['primer_apellido']}"
                                                    toolTip="BundleParametros.primer_apellido.funcionario"
                                                    validatorExpression="#{Funcionario6.validatorPrimerApellido1.validate}"/>
                                                <webuijsf:staticText id="campoPrimerApellido1Texto1"
                                                    binding="#{Funcionario6.campoPrimerApellido1Texto1}"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['primer_apellido']}"/>
                                                <webuijsf:message id="messagePrimerApellido1"
                                                    for="campoPrimerApellido1"/>
                                                <webuijsf:helpInline id="helpInlinePrimerApellido1"
                                                    binding="#{Funcionario6.helpInlinePrimerApellido1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.primer_apellido.funcionario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridSegundoApellido1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcionario6.labelSegundoApellido1}"
                                                    id="labelSegundoApellido1"
                                                    for="campoSegundoApellido1"
                                                    text="segundo apellido"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridSegundoApellido2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoSegundoApellido1"
                                                    binding="#{Funcionario6.campoSegundoApellido1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Funcionario6.gestor.filaNoProcesada}"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['segundo_apellido']}"
                                                    toolTip="BundleParametros.segundo_apellido.funcionario"
                                                    validatorExpression="#{Funcionario6.validatorSegundoApellido1.validate}"/>
                                                <webuijsf:staticText id="campoSegundoApellido1Texto1"
                                                    binding="#{Funcionario6.campoSegundoApellido1Texto1}"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['segundo_apellido']}"/>
                                                <webuijsf:message id="messageSegundoApellido1"
                                                    for="campoSegundoApellido1"/>
                                                <webuijsf:helpInline id="helpInlineSegundoApellido1"
                                                    binding="#{Funcionario6.helpInlineSegundoApellido1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.segundo_apellido.funcionario"
                                                    type="field"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridApellidoCasada1"
                                                styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label
                                                    binding="#{Funcionario6.labelApellidoCasada1}"
                                                    id="labelApellidoCasada1"
                                                    for="campoApellidoCasada1"
                                                    text="apellido casada"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="7"
                                                id="gridApellidoCasada2"
                                                styleClass="pdq-grid-elemento-1">
                                                <webuijsf:textField id="campoApellidoCasada1"
                                                    binding="#{Funcionario6.campoApellidoCasada1}"
                                                    columns="20"
                                                    maxLength="30"
                                                    readOnly="#{Funcionario6.gestor.filaNoProcesada}"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['apellido_casada']}"
                                                    toolTip="BundleParametros.apellido_casada.funcionario"
                                                    validatorExpression="#{Funcionario6.validatorApellidoCasada1.validate}"/>
                                                <webuijsf:staticText id="campoApellidoCasada1Texto1"
                                                    binding="#{Funcionario6.campoApellidoCasada1Texto1}"
                                                    text="#{Funcionario6.funcionarioDataProvider.value['apellido_casada']}"/>
                                                <webuijsf:message id="messageApellidoCasada1"
                                                    for="campoApellidoCasada1"/>
                                                <webuijsf:helpInline id="helpInlineApellidoCasada1"
                                                    binding="#{Funcionario6.helpInlineApellidoCasada1}"
                                                    rendered="#{SessionBean1.contextoSesion.helpInlineRendered}"
                                                    styleClass="pdq-helpInline-field"
                                                    text="BundleParametros.apellido_casada.funcionario"
                                                    type="field"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid
                                            id="gridPanel116"
                                            styleClass="pdq-grid-detalle-pie">
                                        <h:panelGrid
                                            columns="2"
                                            id="gridPanel117">
                                            <h:panelGrid
                                                id="gridPanel118"
                                                styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid 
                                                    columns="7"
                                                    id="gridPanel119">
                                                    <webuijsf:button
                                                        actionExpression="#{Funcionario6.botonIrAlPrimero2_action}"
                                                        binding="#{Funcionario6.botonIrAlPrimero2}"
                                                        disabled="#{Funcionario6.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2"
                                                        imageURL="#{Funcionario6.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{Funcionario6.gestor.scriptIrAlPrimero}"
                                                        text="#{Funcionario6.gestor.i18n.textoBotonIrAlPrimero}"
                                                        toolTip="#{Funcionario6.gestor.i18n.toolTipBotonIrAlPrimero}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Funcionario6.botonIrAlAnterior2_action}"
                                                        binding="#{Funcionario6.botonIrAlAnterior2}"
                                                        disabled="#{Funcionario6.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2"
                                                        imageURL="#{Funcionario6.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{Funcionario6.gestor.scriptIrAlAnterior}"
                                                        text="#{Funcionario6.gestor.i18n.textoBotonIrAlAnterior}"
                                                        toolTip="#{Funcionario6.gestor.i18n.toolTipBotonIrAlAnterior}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Funcionario6.botonIrAlSiguiente2_action}"
                                                        binding="#{Funcionario6.botonIrAlSiguiente2}"
                                                        disabled="#{Funcionario6.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2"
                                                        imageURL="#{Funcionario6.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{Funcionario6.gestor.scriptIrAlSiguiente}"
                                                        text="#{Funcionario6.gestor.i18n.textoBotonIrAlSiguiente}"
                                                        toolTip="#{Funcionario6.gestor.i18n.toolTipBotonIrAlSiguiente}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Funcionario6.botonIrAlUltimo2_action}"
                                                        binding="#{Funcionario6.botonIrAlUltimo2}"
                                                        disabled="#{Funcionario6.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2"
                                                        imageURL="#{Funcionario6.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{Funcionario6.gestor.scriptIrAlUltimo}"
                                                        text="#{Funcionario6.gestor.i18n.textoBotonIrAlUltimo}"
                                                        toolTip="#{Funcionario6.gestor.i18n.toolTipBotonIrAlUltimo}"/>
                                                    <webuijsf:button
                                                        actionExpression="#{Funcionario6.botonProcesarFila2_action}"
                                                        binding="#{Funcionario6.botonProcesarFila2}"
                                                        disabled="#{Funcionario6.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila2"
                                                        imageURL="#{Funcionario6.gestor.urlImagenProcesar}"
                                                        onClick="#{Funcionario6.scriptAbrirVentanaProcesarFila2}"
                                                        rendered="#{Funcionario6.asistente.comandoDisponible}"
                                                        text="#{Funcionario6.gestor.i18n.textoBotonProcesarFila}"
                                                        toolTip="#{Funcionario6.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                id="gridPanel120"
                                                styleClass="pdq-grid-detalle-mensajes">
                                                <h:panelGrid
                                                    id="gridPanel121"
                                                    styleClass="pdq-grid-detalle-mensajes-2">
                                                    <webuijsf:staticText
                                                        id="textoMensajeCambiosPorConfirmar1"
                                                        style="font-weight: bold"
                                                        text="#{Funcionario6.gestor.mensajeCambiosPorConfirmar}"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        </h:panelGrid>
                                        </h:panelGrid>
                                        <h:panelGrid 
                                            id="gridPanel122">
                                            <h:panelGrid 
                                                id="gridPanel123">
                                                <webuijsf:anchor 
                                                    id="anchor1"/>
                                            </h:panelGrid>
                                            <h:panelGrid
                                                columns="13"
                                                id="gridPanel124">
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario6.botonAgregar1_action}"
                                                    binding="#{Funcionario6.botonAgregar1}"
                                                    disabled="#{Funcionario6.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1"
                                                    onClick="#{Funcionario6.gestor.scriptAgregar}"
                                                    rendered="#{Funcionario6.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario6.gestor.i18n.textoBotonAgregar}"
                                                    toolTip="#{Funcionario6.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Funcionario6.listaFuncionEdicion1}"
                                                    converter="#{Funcionario6.converterListaFuncionEdicion1}"
                                                    disabled="#{Funcionario6.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1"
                                                    items="#{Funcionario6.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Funcionario6.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Funcionario6.gestor.funcionEdicionSeleccionada}"
                                                    toolTip="#{Funcionario6.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario6.botonEditar1_action}"
                                                    binding="#{Funcionario6.botonEditar1}"
                                                    disabled="#{Funcionario6.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1"
                                                    onClick="#{Funcionario6.gestor.scriptEditar}"
                                                    rendered="#{Funcionario6.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"
                                                    toolTip="#{Funcionario6.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario6.botonEliminar1_action}"
                                                    binding="#{Funcionario6.botonEliminar1}"
                                                    disabled="#{Funcionario6.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1"
                                                    onClick="#{Funcionario6.gestor.scriptEliminar}"
                                                    rendered="#{Funcionario6.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario6.gestor.i18n.textoBotonEliminar}"
                                                    toolTip="#{Funcionario6.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario6.botonAplicar1_action}"
                                                    binding="#{Funcionario6.botonAplicar1}"
                                                    id="botonAplicar1"
                                                    onClick="#{Funcionario6.gestor.scriptAplicar}"
                                                    rendered="#{Funcionario6.gestor.funcionCheckChangesHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario6.gestor.i18n.textoBotonAplicar}"
                                                    toolTip="#{Funcionario6.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario6.botonDeshacer1_action}"
                                                    binding="#{Funcionario6.botonDeshacer1}"
                                                    id="botonDeshacer1"
                                                    onClick="#{Funcionario6.gestor.scriptDeshacer}"
                                                    rendered="#{Funcionario6.gestor.funcionCancelUpdateHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario6.gestor.i18n.textoBotonDeshacer}"
                                                    toolTip="#{Funcionario6.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario6.botonConfirmar1_action}"
                                                    binding="#{Funcionario6.botonConfirmar1}"
                                                    id="botonConfirmar1"
                                                    onClick="#{Funcionario6.gestor.scriptConfirmar}"
                                                    rendered="#{Funcionario6.gestor.funcionCommitHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario6.gestor.i18n.textoBotonConfirmar}"
                                                    toolTip="#{Funcionario6.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario6.botonDescartar1_action}"
                                                    binding="#{Funcionario6.botonDescartar1}"
                                                    id="botonDescartar1"
                                                    onClick="#{Funcionario6.gestor.scriptDescartar}"
                                                    rendered="#{Funcionario6.gestor.funcionRevertHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario6.gestor.i18n.textoBotonDescartar}"
                                                    toolTip="#{Funcionario6.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown
                                                    binding="#{Funcionario6.listaFuncionAccion1}"
                                                    converter="#{Funcionario6.converterListaFuncionAccion1}"
                                                    id="listaFuncionAccion1"
                                                    items="#{Funcionario6.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Funcionario6.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Funcionario6.gestor.funcionAccionSeleccionada}"
                                                    toolTip="#{Funcionario6.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario6.botonProcesar1_action}"
                                                    binding="#{Funcionario6.botonProcesar1}"
                                                    id="botonProcesar1"
                                                    onClick="#{Funcionario6.gestor.scriptProcesar}"
                                                    rendered="#{Funcionario6.gestor.funcionExecuteHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario6.gestor.i18n.textoBotonProcesar}"
                                                    toolTip="#{Funcionario6.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario6.botonRefrescar1_action}"
                                                    binding="#{Funcionario6.botonRefrescar1}"
                                                    disabled="#{Funcionario6.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1"
                                                    onClick="#{Funcionario6.gestor.scriptRefrescar}"
                                                    rendered="#{Funcionario6.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario6.gestor.i18n.textoBotonRefrescar}"
                                                    toolTip="#{Funcionario6.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario6.botonReconsultar1_action}"
                                                    binding="#{Funcionario6.botonReconsultar1}"
                                                    disabled="#{Funcionario6.gestor.funcionSelectInhabilitada}"
                                                    id="botonReconsultar1"
                                                    onClick="#{Funcionario6.gestor.scriptReconsultar}"
                                                    rendered="#{Funcionario6.gestor.funcionRequeryHabilitada}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario6.gestor.i18n.textoBotonReconsultar}"
                                                    toolTip="#{Funcionario6.gestor.i18n.toolTipBotonReconsultar}"/>
                                                <webuijsf:button
                                                    actionExpression="#{Funcionario6.botonRetornar1_action}"
                                                    binding="#{Funcionario6.botonRetornar1}"
                                                    disabled="#{Funcionario6.gestor.funcionReturnFilaEscogidaInhabilitada}"
                                                    id="botonRetornar1"
                                                    onClick="#{Funcionario6.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Funcionario6.gestor.funcionReturnVisible}"
                                                    styleClass="pdq-button-1"
                                                    text="#{Funcionario6.gestor.i18n.textoBotonRetornar}"
                                                    toolTip="#{Funcionario6.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid 
                                                columns="1" 
                                                id="gridPanel125"
                                                rendered="#{Funcionario6.gestor.funcionOpenLinkHabilitada}">
                                                <webuijsf:imageHyperlink
                                                    actionExpression="#{Funcionario6.imageHyperlink1_action}"
                                                    binding="#{Funcionario6.imageHyperlink1}"
                                                    disabled="#{Funcionario6.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1"
                                                    imageURL="#{Funcionario6.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Funcionario6.gestor.scriptAbrirVinculo}"
                                                    styleClass="pdq-hyperlink-1"
                                                    rendered="#{Funcionario6.gestor.designing}"
                                                    text="Hyperlink1"
                                                    toolTip="#{bundle.Funcionario6_imageHyperlink1_toolTip}"/>
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
