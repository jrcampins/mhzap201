<?xml version="1.0" encoding="UTF-8"?>
<!--
   Copyright (C) 2008, EGT Consultores, C.A.
   Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
   de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
   Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
   vea la licencia "GNU General Public License" para obtener mas información.
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{Favoritos.form1}" id="form1" virtualFormsConfig="virtualForm1 | checkbox1 campoIdPaginaUsuario1 campoIdPagina1 campoIdUsuario1 textoFilasPorPagina1 listaFuncionEdicion1 listaFuncionAccion1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 listaFuncionEdicion1 listaFuncionAccion1 | listaFuncionEdicion1 listaFuncionAccion1 botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonProcesarFila1 botonRetornarFila1 botonRefrescar1 botonAgregar1 botonDescartar1 botonRetornar1">
                        <div class="pos-div-cab-1">
                            <jsp:directive.include file="FragmentoCabeza1.jspf"/>
                        </div>
                        <div class="pos-div-cab-2">
                            <jsp:directive.include file="FragmentoCabeza2P.jspf"/>
                        </div>
                        <div class="pos-div-fork">
                            <div class="pos-div-col-izq">
                                <jsp:directive.include file="FragmentoColumnaIzquierda.jspf"/>
                            </div>
                            <div class="pos-div-col-der">
                                <div class="pos-div-cab-3">
                                    <jsp:directive.include file="FragmentoCabeza3.jspf"/>
                                    <webuijsf:breadcrumbs binding="#{Favoritos.breadcrumbs1}" id="breadcrumbs1" rendered="#{Favoritos.gestor.designing}" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1">
                                    <jsp:directive.include file="FragmentoFiltro.jspf"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid id="gridPanel101">
                                        <h:panelGrid id="gridPanel102">
                                            <h:panelGrid columns="2" id="gridPanel103">
                                                <webuijsf:image id="imagenMensaje1" rendered="#{Favoritos.gestor.urlImagenSeveridadMensajeDisponible}" url="#{Favoritos.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" id="hipervinculoMensaje1"
                                                    rendered="#{Favoritos.gestor.mensajeDisponible}" text="#{Favoritos.gestor.mensaje}" url="#{Favoritos.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
                                        <webuijsf:table binding="#{Favoritos.table1}" clearSortButton="true" deselectMultipleButton="true" id="table1"
                                            paginateButton="false" paginationControls="true" selectMultipleButton="true" sortPanelToggleButton="true" width="600">
                                            <webuijsf:tableRowGroup binding="#{Favoritos.tableRowGroup1}" id="tableRowGroup1" rows="1"
                                                sourceData="#{Favoritos.paginaUsuarioDataProvider}" sourceVar="currentRow">
                                                <webuijsf:tableColumn align="center" id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" selectId="checkbox1">
                                                    <webuijsf:checkbox binding="#{Favoritos.checkbox1}" id="checkbox1"
                                                        onClick="#{Favoritos.gestor.scriptElegir}" selected="#{Favoritos.gestor.filaElegida}" toolTip="#{Favoritos.gestor.i18n.toolTipCheckboxSeleccionMultiple}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="center" binding="#{Favoritos.tableColumn1}" id="tableColumn1" rendered="false">
                                                    <webuijsf:button actionExpression="#{Favoritos.botonEscogerFila1_action}"
                                                        binding="#{Favoritos.botonEscogerFila1}" disabled="#{Favoritos.gestor.funcionPickItemInhabilitada}"
                                                        id="botonEscogerFila1" imageURL="#{Favoritos.gestor.urlImagenEscoger}"
                                                        onClick="#{Favoritos.gestor.scriptEscoger}" text="#{Favoritos.gestor.i18n.textoBotonEscogerFila}" toolTip="#{Favoritos.gestor.i18n.toolTipBotonEscogerFila}"/>
                                                    <webuijsf:button actionExpression="#{Favoritos.botonDetallarFila1_action}"
                                                        binding="#{Favoritos.botonDetallarFila1}" disabled="#{Favoritos.gestor.funcionPickItemInhabilitada}"
                                                        id="botonDetallarFila1" imageURL="#{Favoritos.gestor.urlImagenDetallar}"
                                                        onClick="#{Favoritos.scriptAbrirVentanaVerDetalle}" rendered="#{Favoritos.gestor.detalleDisponible}"
                                                        text="#{Favoritos.gestor.i18n.textoBotonDetallarFila}" toolTip="#{Favoritos.gestor.i18n.toolTipBotonDetallarFila}"/>
                                                    <webuijsf:button actionExpression="#{Favoritos.botonProcesarFila1_action}"
                                                        binding="#{Favoritos.botonProcesarFila1}" disabled="#{Favoritos.gestor.funcionPickItemInhabilitada}"
                                                        id="botonProcesarFila1" imageURL="#{Favoritos.gestor.urlImagenProcesar}"
                                                        onClick="#{Favoritos.scriptAbrirVentanaProcesarFila1}"
                                                        rendered="#{Favoritos.asistente.comandoDisponible}"
                                                        text="#{Favoritos.gestor.i18n.textoBotonProcesarFila}" toolTip="#{Favoritos.gestor.i18n.toolTipBotonProcesarFila}"/>
                                                    <webuijsf:button actionExpression="#{Favoritos.botonRetornarFila1_action}"
                                                        binding="#{Favoritos.botonRetornarFila1}" disabled="#{Favoritos.gestor.funcionReturnInhabilitada}"
                                                        id="botonRetornarFila1" imageURL="#{Favoritos.gestor.urlImagenRetornar}"
                                                        onClick="#{Favoritos.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{Favoritos.gestor.funcionReturnVisible}"
                                                        text="#{Favoritos.gestor.i18n.textoBotonRetornarFila}" toolTip="#{Favoritos.gestor.i18n.toolTipBotonRetornarFila}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Favoritos.tableColumn2}" id="tableColumn2" rendered="false">
                                                    <webuijsf:imageHyperlink actionExpression="#{Favoritos.hipervinculoAccionFila1_action}"
                                                        binding="#{Favoritos.hipervinculoAccionFila1}" disabled="#{Favoritos.gestor.loteConCambios}"
                                                        id="hipervinculoAccionFila1" imageURL="#{Favoritos.gestor.urlImagenEjecutarVinculo}"
                                                        onClick="#{Favoritos.scriptAbrirVentanaAccionFila1}" text="Accion1" toolTip="#{bundle.Favoritos_hipervinculoAccionFila1_toolTip}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="right" binding="#{Favoritos.tableColumn3}"
                                                    headerText="#{Favoritos.gestor.i18n.textoEtiquetaIdentificacionFila}" id="tableColumn3" rendered="false" toolTip="#{Favoritos.gestor.i18n.toolTipEtiquetaIdentificacionFila}">
                                                    <webuijsf:imageHyperlink actionExpression="#{Favoritos.hipervinculoDetallarFila1_action}"
                                                        binding="#{Favoritos.hipervinculoDetallarFila1}" id="hipervinculoDetallarFila1"
                                                        imageURL="#{Favoritos.gestor.urlImagenFilaProcesada}" text="#{Favoritos.gestor.identificacionFila}"
                                                        textPosition="left" toolTip="#{Favoritos.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Favoritos.tableColumnIdPaginaUsuario1}" headerText="id"
                                                    id="tableColumnIdPaginaUsuario1" rendered="false" sort="id_pagina_usuario">
                                                    <webuijsf:staticText id="hiddenStaticTextIdPaginaUsuario1" rendered="#{Favoritos.gestor.designing}" text="#{currentRow.value['id_pagina_usuario']}"/>
                                                    <webuijsf:label binding="#{Favoritos.labelIdPaginaUsuario1}" for="campoIdPaginaUsuario1" id="labelIdPaginaUsuario1"/>
                                                    <webuijsf:textField binding="#{Favoritos.campoIdPaginaUsuario1}"
                                                        converter="#{Favoritos.converterIdPaginaUsuario1}" id="campoIdPaginaUsuario1" readOnly="true"
                                                        text="#{currentRow.value['id_pagina_usuario']}" validatorExpression="#{Favoritos.validatorIdPaginaUsuario1.validate}"/>
                                                    <webuijsf:staticText binding="#{Favoritos.campoIdPaginaUsuario1Texto1}" id="campoIdPaginaUsuario1Texto1"/>
                                                    <webuijsf:message for="campoIdPaginaUsuario1" id="messageIdPaginaUsuario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Favoritos.tableColumnIdPagina1}" headerText="pagina" id="tableColumnIdPagina1"
                                                    rendered="false" sort="codigo_pagina">
                                                    <webuijsf:staticText id="hiddenStaticTextIdPagina1" rendered="#{Favoritos.gestor.designing}" text="#{currentRow.value['codigo_pagina']}"/>
                                                    <webuijsf:label binding="#{Favoritos.labelIdPagina1}" for="campoIdPagina1" id="labelIdPagina1"/>
                                                    <webuijsf:textField binding="#{Favoritos.campoIdPagina1}" id="campoIdPagina1"
                                                        readOnly="#{Favoritos.gestor.filaNoProcesada}" required="true"
                                                        text="#{Favoritos.asistente.textoCampoIdPagina1}" toolTip="#{Favoritos.asistente.toolTipCampoIdPagina1}" validatorExpression="#{Favoritos.campoIdPagina1_validate}"/>
                                                    <webuijsf:staticText binding="#{Favoritos.campoIdPagina1Texto1}" id="campoIdPagina1Texto1" text="#{currentRow.value['codigo_pagina']}"/>
                                                    <webuijsf:message for="campoIdPagina1" id="messageIdPagina1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="center" id="tableColumnIdPagina3" rendered="false">
                                                    <webuijsf:staticText id="hiddenStaticTextIdPagina3" rendered="#{Favoritos.gestor.designing}" text="#{currentRow.value['id_pagina']}"/>
                                                    <webuijsf:button binding="#{Favoritos.campoIdPagina1Boton1}" id="campoIdPagina1Boton1" onClick="#{Favoritos.asistente.scriptCampoIdPagina1Boton1}"/>
                                                    <webuijsf:button binding="#{Favoritos.campoIdPagina1Boton3}" id="campoIdPagina1Boton3"
                                                        onClick="#{Favoritos.asistente.scriptCampoIdPagina1Boton2}" visible="#{Favoritos.asistente.campoIdPagina1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Favoritos.tableColumnIdPagina2}" id="tableColumnIdPagina2"
                                                    rendered="#{Favoritos.asistente.campoIdPagina1Boton2Rendered}" sort="nombre_pagina" styleClass="pdq-estilo-id-2">
                                                    <webuijsf:staticText id="hiddenStaticTextIdPagina2" rendered="#{Favoritos.gestor.designing}" text="#{currentRow.value['nombre_pagina']}"/>
                                                    <webuijsf:label binding="#{Favoritos.labelIdPagina2}" id="labelIdPagina2" text=""/>
                                                    <webuijsf:imageHyperlink binding="#{Favoritos.campoIdPagina1Hiper1}" id="campoIdPagina1Hiper1"
                                                        imageURL="#{Favoritos.gestor.urlImagenAbrirVinculoHabilitado}" target="_self"
                                                        text="#{currentRow.value['nombre_pagina']}" toolTip="Abrir página..." url="#{Favoritos.asistente.urlCampoIdPagina1Boton2}"/>
                                                    <webuijsf:button id="campoIdPagina1Boton2" rendered="false"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Favoritos.tableColumnIdUsuario1}" headerText="usuario"
                                                    id="tableColumnIdUsuario1" rendered="false" sort="codigo_usuario">
                                                    <webuijsf:staticText id="hiddenStaticTextIdUsuario1" rendered="#{Favoritos.gestor.designing}" text="#{currentRow.value['codigo_usuario']}"/>
                                                    <webuijsf:label binding="#{Favoritos.labelIdUsuario1}" for="campoIdUsuario1" id="labelIdUsuario1"/>
                                                    <webuijsf:textField binding="#{Favoritos.campoIdUsuario1}" id="campoIdUsuario1"
                                                        readOnly="#{Favoritos.gestor.filaNoProcesada}" required="true"
                                                        text="#{Favoritos.asistente.textoCampoIdUsuario1}"
                                                        toolTip="#{Favoritos.asistente.toolTipCampoIdUsuario1}" validatorExpression="#{Favoritos.campoIdUsuario1_validate}"/>
                                                    <webuijsf:staticText binding="#{Favoritos.campoIdUsuario1Texto1}" id="campoIdUsuario1Texto1" text="#{currentRow.value['codigo_usuario']}"/>
                                                    <webuijsf:message for="campoIdUsuario1" id="messageIdUsuario1"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="center" id="tableColumnIdUsuario3" rendered="false">
                                                    <webuijsf:staticText id="hiddenStaticTextIdUsuario3" rendered="#{Favoritos.gestor.designing}" text="#{currentRow.value['id_usuario']}"/>
                                                    <webuijsf:button binding="#{Favoritos.campoIdUsuario1Boton1}" id="campoIdUsuario1Boton1" onClick="#{Favoritos.asistente.scriptCampoIdUsuario1Boton1}"/>
                                                    <webuijsf:button binding="#{Favoritos.campoIdUsuario1Boton3}" id="campoIdUsuario1Boton3"
                                                        onClick="#{Favoritos.asistente.scriptCampoIdUsuario1Boton2}" visible="#{Favoritos.asistente.campoIdUsuario1Boton3Rendered}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{Favoritos.tableColumnIdUsuario2}" headerText="nombre usuario"
                                                    id="tableColumnIdUsuario2" rendered="false" sort="nombre_usuario" styleClass="pdq-estilo-id-2">
                                                    <webuijsf:staticText id="hiddenStaticTextIdUsuario2" rendered="#{Favoritos.gestor.designing}" text="#{currentRow.value['nombre_usuario']}"/>
                                                    <webuijsf:label binding="#{Favoritos.labelIdUsuario2}" id="labelIdUsuario2" text=""/>
                                                    <webuijsf:imageHyperlink binding="#{Favoritos.campoIdUsuario1Hiper1}" id="campoIdUsuario1Hiper1"
                                                        onClick="#{Favoritos.asistente.scriptCampoIdUsuario1Boton2}" text="#{currentRow.value['nombre_usuario']}"/>
                                                    <webuijsf:button id="campoIdUsuario1Boton2" rendered="false"/>
                                                </webuijsf:tableColumn>
                                            </webuijsf:tableRowGroup>
                                        </webuijsf:table>
                                        <h:panelGrid id="gridPanel104">
                                            <h:panelGrid columns="2" id="gridPanel105">
                                                <h:panelGrid id="gridPanel106">
                                                    <webuijsf:label binding="#{Favoritos.etiquetaTextoFilasPorPagina1}" for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" text="#{Favoritos.gestor.i18n.textoEtiquetaTextoFilasPorPagina}"/>
                                                </h:panelGrid>
                                                <h:panelGrid columns="3" id="gridPanel107">
                                                    <webuijsf:textField binding="#{Favoritos.textoFilasPorPagina1}" columns="2"
                                                        converter="#{Favoritos.textoFilasPorPagina1Converter1}"
                                                        disabled="#{Favoritos.gestor.paginacionInhabilitada}" id="textoFilasPorPagina1" maxLength="2"
                                                        text="#{Favoritos.gestor.filasPorPagina}" validatorExpression="#{Favoritos.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button actionExpression="#{Favoritos.botonRepaginar1_action}"
                                                        binding="#{Favoritos.botonRepaginar1}" id="botonRepaginar1"
                                                        imageURL="#{Favoritos.gestor.urlImagenRepaginar}" onClick="#{Favoritos.gestor.scriptRepaginar}"
                                                        text="#{Favoritos.gestor.i18n.textoBotonRepaginar}" toolTip="#{Favoritos.gestor.i18n.toolTipBotonRepaginar}"/>
                                                    <webuijsf:message for="textoFilasPorPagina1" id="messageFilasPorPagina1"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid columns="12" id="gridPanel108">
                                                <webuijsf:button actionExpression="#{Favoritos.botonAgregar1_action}" binding="#{Favoritos.botonAgregar1}"
                                                    disabled="#{Favoritos.gestor.funcionInsertInhabilitada}" id="botonAgregar1"
                                                    onClick="#{Favoritos.gestor.scriptAgregar}" rendered="#{Favoritos.gestor.funcionInsertHabilitada}"
                                                    styleClass="pdq-button-1" text="#{Favoritos.gestor.i18n.textoBotonAgregar}" toolTip="#{Favoritos.gestor.i18n.toolTipBotonAgregar}"/>
                                                <webuijsf:dropDown binding="#{Favoritos.listaFuncionEdicion1}"
                                                    converter="#{Favoritos.converterListaFuncionEdicion1}" disabled="#{Favoritos.gestor.loteConCambios}"
                                                    id="listaFuncionEdicion1" items="#{Favoritos.opcionesListaFuncionEdicion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionEdicion1');"
                                                    rendered="#{Favoritos.gestor.edicionMultiFuncionHabilitada}"
                                                    selected="#{Favoritos.gestor.funcionEdicionSeleccionada}" toolTip="#{Favoritos.gestor.i18n.toolTipListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{Favoritos.botonEditar1_action}" binding="#{Favoritos.botonEditar1}"
                                                    disabled="#{Favoritos.gestor.funcionUpdateInhabilitada}" id="botonEditar1"
                                                    onClick="#{Favoritos.gestor.scriptEditar}" rendered="#{Favoritos.gestor.funcionUpdateHabilitada}"
                                                    styleClass="pdq-button-1" text="#{Favoritos.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}" toolTip="#{Favoritos.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{Favoritos.botonEliminar1_action}" binding="#{Favoritos.botonEliminar1}"
                                                    disabled="#{Favoritos.gestor.funcionDeleteInhabilitada}" id="botonEliminar1"
                                                    onClick="#{Favoritos.gestor.scriptEliminar}" rendered="#{Favoritos.gestor.funcionDeleteHabilitada}"
                                                    styleClass="pdq-button-1" text="#{Favoritos.gestor.i18n.textoBotonEliminar}" toolTip="#{Favoritos.gestor.i18n.toolTipBotonEliminar}"/>
                                                <webuijsf:button actionExpression="#{Favoritos.botonAplicar1_action}" binding="#{Favoritos.botonAplicar1}"
                                                    id="botonAplicar1" onClick="#{Favoritos.gestor.scriptAplicar}"
                                                    rendered="#{Favoritos.gestor.funcionCheckChangesHabilitada}" styleClass="pdq-button-1"
                                                    text="#{Favoritos.gestor.i18n.textoBotonAplicar}" toolTip="#{Favoritos.gestor.i18n.toolTipBotonAplicar}"/>
                                                <webuijsf:button actionExpression="#{Favoritos.botonDeshacer1_action}" binding="#{Favoritos.botonDeshacer1}"
                                                    id="botonDeshacer1" onClick="#{Favoritos.gestor.scriptDeshacer}"
                                                    rendered="#{Favoritos.gestor.funcionCancelUpdateHabilitada}" styleClass="pdq-button-1"
                                                    text="#{Favoritos.gestor.i18n.textoBotonDeshacer}" toolTip="#{Favoritos.gestor.i18n.toolTipBotonDeshacer}"/>
                                                <webuijsf:button actionExpression="#{Favoritos.botonConfirmar1_action}" binding="#{Favoritos.botonConfirmar1}"
                                                    id="botonConfirmar1" onClick="#{Favoritos.gestor.scriptConfirmar}"
                                                    rendered="#{Favoritos.gestor.funcionCommitHabilitada}" styleClass="pdq-button-1"
                                                    text="#{Favoritos.gestor.i18n.textoBotonConfirmar}" toolTip="#{Favoritos.gestor.i18n.toolTipBotonConfirmar}"/>
                                                <webuijsf:button actionExpression="#{Favoritos.botonDescartar1_action}" binding="#{Favoritos.botonDescartar1}"
                                                    id="botonDescartar1" onClick="#{Favoritos.gestor.scriptDescartar}"
                                                    rendered="#{Favoritos.gestor.funcionRevertHabilitada}" styleClass="pdq-button-1"
                                                    text="#{Favoritos.gestor.i18n.textoBotonDescartar}" toolTip="#{Favoritos.gestor.i18n.toolTipBotonDescartar}"/>
                                                <webuijsf:dropDown binding="#{Favoritos.listaFuncionAccion1}"
                                                    converter="#{Favoritos.converterListaFuncionAccion1}" id="listaFuncionAccion1"
                                                    items="#{Favoritos.opcionesListaFuncionAccion}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionAccion1');"
                                                    rendered="#{Favoritos.gestor.accionMultiFuncionHabilitada}"
                                                    selected="#{Favoritos.gestor.funcionAccionSeleccionada}" toolTip="#{Favoritos.gestor.i18n.toolTipListaFuncionAccion}"/>
                                                <webuijsf:button actionExpression="#{Favoritos.botonProcesar1_action}" binding="#{Favoritos.botonProcesar1}"
                                                    id="botonProcesar1" onClick="#{Favoritos.gestor.scriptProcesar}"
                                                    rendered="#{Favoritos.gestor.funcionExecuteHabilitada}" styleClass="pdq-button-1"
                                                    text="#{Favoritos.gestor.i18n.textoBotonProcesar}" toolTip="#{Favoritos.gestor.i18n.toolTipBotonProcesar}"/>
                                                <webuijsf:button actionExpression="#{Favoritos.botonRefrescar1_action}" binding="#{Favoritos.botonRefrescar1}"
                                                    disabled="#{Favoritos.gestor.funcionSelectInhabilitada}" id="botonRefrescar1"
                                                    onClick="#{Favoritos.gestor.scriptRefrescar}" rendered="#{Favoritos.gestor.funcionRefreshHabilitada}"
                                                    styleClass="pdq-button-1" text="#{Favoritos.gestor.i18n.textoBotonRefrescar}" toolTip="#{Favoritos.gestor.i18n.toolTipBotonRefrescar}"/>
                                                <webuijsf:button actionExpression="#{Favoritos.botonRetornar1_action}" binding="#{Favoritos.botonRetornar1}"
                                                    disabled="#{Favoritos.gestor.funcionReturnFilaEscogidaInhabilitada}" id="botonRetornar1"
                                                    onClick="#{Favoritos.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{Favoritos.gestor.funcionReturnVisible}" styleClass="pdq-button-1"
                                                    text="#{Favoritos.gestor.i18n.textoBotonRetornar}" toolTip="#{Favoritos.gestor.i18n.toolTipBotonRetornar}"/>
                                            </h:panelGrid>
                                            <h:panelGrid columns="1" id="gridPanel109">
                                                <webuijsf:imageHyperlink actionExpression="#{Favoritos.imageHyperlink1_action}"
                                                    binding="#{Favoritos.imageHyperlink1}" disabled="#{Favoritos.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1" imageURL="#{Favoritos.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{Favoritos.gestor.scriptAbrirVinculo}" rendered="#{Favoritos.gestor.designing}"
                                                    styleClass="pdq-hyperlink-1" text="Hyperlink1" toolTip="#{bundle.Favoritos_imageHyperlink1_toolTip}"/>
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
