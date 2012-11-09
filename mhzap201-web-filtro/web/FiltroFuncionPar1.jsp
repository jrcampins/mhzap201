<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{FiltroFuncionPar1.page1}" id="page1">
            <webuijsf:html binding="#{FiltroFuncionPar1.html1}" id="html1">
                <webuijsf:head binding="#{FiltroFuncionPar1.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{FiltroFuncionPar1.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{FiltroFuncionPar1.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{FiltroFuncionPar1.body1}" id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{FiltroFuncionPar1.form1}" id="form1" virtualFormsConfig="virtualForm1 | checkbox1 textoFilasPorPagina1 gridPanel1:table1:tableRowGroup1:tableColumn5:textoValor2 gridPanel1:table1:tableRowGroup1:tableColumn5:textoValor1 gridPanel1:table1:tableRowGroup1:tableColumn5:listaValorRecurso1 gridPanel1:table1:tableRowGroup1:tableColumn5:listaValorLista1 gridPanel1:table1:tableRowGroup1:tableColumn6:textoSignificado1 gridPanel1:table1:tableRowGroup1:tableColumn4:listaOperadorCom1 gridPanel1:table1:tableRowGroup1:tableColumn5:textoCodigoObjeto1 gridPanel1:table1:tableRowGroup1:tableColumn5:textoCodigoRecurso1 gridPanel1:table1:tableRowGroup1:tableColumn3:listaFuncionParametro1 | , virtualForm2 | textoFilasPorPagina1 | botonRepaginar1 , virtualForm3 | checkbox1 | botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonEscogerFila1 botonDetallarFila1 botonRetornarFila1 botonRefrescar1 botonAgregar1 botonDescartar1 botonRetornar1">
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
                                    <webuijsf:breadcrumbs binding="#{FiltroFuncionPar1.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pdq-div-filtro-1"></div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{FiltroFuncionPar1.gridPanel1}" id="gridPanel1">
                                        <h:panelGrid binding="#{FiltroFuncionPar1.gridPanel4}" columns="5" id="gridPanel4">
                                            <webuijsf:image binding="#{FiltroFuncionPar1.imagenMensaje1}" id="imagenMensaje1" url="#{FiltroFuncionPar1.gestor.urlImagenSeveridadMensaje}"/>
                                            <webuijsf:imageHyperlink align="middle" binding="#{FiltroFuncionPar1.hipervinculoMensaje1}"
                                                id="hipervinculoMensaje1" text="#{FiltroFuncionPar1.gestor.mensaje}" url="#{FiltroFuncionPar1.gestor.urlAnclaPie1}"/>
                                        </h:panelGrid>
                                        <webuijsf:table binding="#{FiltroFuncionPar1.table1}" clearSortButton="true" deselectMultipleButton="true"
                                            id="table1" paginateButton="false" paginationControls="true" selectMultipleButton="true" sortPanelToggleButton="true">
                                            <webuijsf:tableRowGroup binding="#{FiltroFuncionPar1.tableRowGroup1}" id="tableRowGroup1" rows="1"
                                                selected="#{FiltroFuncionPar1.gestor.filaEscogida}"
                                                sourceData="#{FiltroFuncionPar1.filtroFuncionParDataProvider}" sourceVar="currentRow">
                                                <webuijsf:tableColumn align="center" binding="#{FiltroFuncionPar1.tableRowGroup1SelectionColumn}"
                                                    id="tableRowGroup1SelectionColumn"
                                                    onClick="setTimeout(function(){document.getElementById('form1:table1').initAllRows()}, 0);" selectId="checkbox1">
                                                    <webuijsf:checkbox binding="#{FiltroFuncionPar1.checkbox1}" id="checkbox1"
                                                        onClick="#{FiltroFuncionPar1.gestor.scriptElegir}"
                                                        selected="#{FiltroFuncionPar1.gestor.filaElegida}" toolTip="casilla de selección múltiple"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="center" binding="#{FiltroFuncionPar1.tableColumn1}" id="tableColumn1">
                                                    <webuijsf:button actionExpression="#{FiltroFuncionPar1.botonEscogerFila1_action}"
                                                        binding="#{FiltroFuncionPar1.botonEscogerFila1}"
                                                        disabled="#{FiltroFuncionPar1.gestor.funcionPickItemInhabilitada}" id="botonEscogerFila1"
                                                        imageURL="#{FiltroFuncionPar1.gestor.urlImagenEscoger}"
                                                        onClick="#{FiltroFuncionPar1.gestor.scriptEscoger}" text="escoger" toolTip="Seleccionar"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncionPar1.botonDetallarFila1_action}"
                                                        binding="#{FiltroFuncionPar1.botonDetallarFila1}"
                                                        disabled="#{FiltroFuncionPar1.gestor.funcionPickItemInhabilitada}" id="botonDetallarFila1"
                                                        imageURL="#{FiltroFuncionPar1.gestor.urlImagenDetallar}"
                                                        onClick="#{FiltroFuncionPar1.gestor.scriptEscoger}"
                                                        rendered="#{FiltroFuncionPar1.gestor.detalleDisponible}" text="detallar" toolTip="Seleccionar y ver detalle"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncionPar1.botonRetornarFila1_action}"
                                                        binding="#{FiltroFuncionPar1.botonRetornarFila1}"
                                                        disabled="#{FiltroFuncionPar1.gestor.funcionReturnInhabilitada}" id="botonRetornarFila1"
                                                        imageURL="#{FiltroFuncionPar1.gestor.urlImagenRetornar}"
                                                        onClick="#{FiltroFuncionPar1.gestor.scriptRetornarRecursoActual}"
                                                        rendered="#{FiltroFuncionPar1.gestor.funcionReturnVisible}" text="retornar" toolTip="Seleccionar y retornar"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn align="right" binding="#{FiltroFuncionPar1.tableColumn2}" headerText="#" id="tableColumn2">
                                                    <webuijsf:imageHyperlink actionExpression="#{FiltroFuncionPar1.hipervinculoFila1_action}"
                                                        binding="#{FiltroFuncionPar1.hipervinculoFila1}" id="hipervinculoFila1"
                                                        imageURL="#{FiltroFuncionPar1.gestor.urlImagenFilaProcesada}"
                                                        text="#{FiltroFuncionPar1.gestor.identificacionFila}" textPosition="left" toolTip="#{FiltroFuncionPar1.gestor.toolTipImagenFilaProcesada}"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{FiltroFuncionPar1.tableColumn3}" headerText="parámetro" id="tableColumn3">
                                                    <webuijsf:dropDown binding="#{FiltroFuncionPar1.listaFuncionParametro1}"
                                                        converter="#{FiltroFuncionPar1.longConverter1}"
                                                        disabled="#{FiltroFuncionPar1.gestor.filaNoProcesada}" id="listaFuncionParametro1"
                                                        items="#{FiltroFuncionPar1.sidekick.opcionesListaFuncionParametro1}"
                                                        label="#{FiltroFuncionPar1.gestor.whiteLabel}"
                                                        onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionParametro1');" required="true"
                                                        selected="#{currentRow.value['id_funcion_parametro']}" validatorExpression="#{FiltroFuncionPar1.listaFuncionParametro1_validate}"/>
                                                    <webuijsf:staticText binding="#{FiltroFuncionPar1.listaFuncionParametro1Texto1}" id="listaFuncionParametro1Texto1"/>
                                                    <webuijsf:message binding="#{FiltroFuncionPar1.message2}" for="listaFuncionParametro1" id="message2"
                                                        showDetail="false" showSummary="true"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{FiltroFuncionPar1.tableColumn4}" headerText="operador" id="tableColumn4">
                                                    <webuijsf:dropDown binding="#{FiltroFuncionPar1.listaOperadorCom1}"
                                                        converter="#{FiltroFuncionPar1.integerConverter1}"
                                                        disabled="#{FiltroFuncionPar1.gestor.filaNoProcesada}" id="listaOperadorCom1"
                                                        items="#{FiltroFuncionPar1.sidekick.opcionesListaOperadorCom1}"
                                                        label="#{FiltroFuncionPar1.gestor.whiteLabel}" required="true" selected="#{currentRow.value['numero_operador_com']}"/>
                                                    <webuijsf:staticText binding="#{FiltroFuncionPar1.listaOperadorCom1Texto1}" id="listaOperadorCom1Texto1"/>
                                                    <webuijsf:message binding="#{FiltroFuncionPar1.message3}" for="listaOperadorCom1"
                                                        id="message3" showDetail="false" showSummary="true"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{FiltroFuncionPar1.tableColumn5}" headerText="valor" id="tableColumn5" sort="valor_parametro">
                                                    <webuijsf:textField binding="#{FiltroFuncionPar1.textoValor1}" id="textoValor1"
                                                        label="#{FiltroFuncionPar1.gestor.whiteLabel}"
                                                        readOnly="#{FiltroFuncionPar1.gestor.filaNoProcesada}"
                                                        rendered="#{FiltroFuncionPar1.sidekick.filaTipoValorContinuo}"
                                                        text="#{currentRow.value['valor_parametro']}" validatorExpression="#{FiltroFuncionPar1.textoValor1_validate}"/>
                                                    <webuijsf:message binding="#{FiltroFuncionPar1.message7}" for="textoValor1" id="message7"
                                                        showDetail="false" showSummary="true"/>
                                                    <webuijsf:textField binding="#{FiltroFuncionPar1.textoValor2}" id="textoValor2"
                                                        label="#{FiltroFuncionPar1.gestor.whiteLabel}"
                                                        readOnly="#{FiltroFuncionPar1.gestor.filaNoProcesada}"
                                                        rendered="#{FiltroFuncionPar1.sidekick.filaTipoValorContinuoFechaHora}"
                                                        text="#{currentRow.value['valor_parametro']}" validatorExpression="#{FiltroFuncionPar1.textoValor2_validate}"/>
                                                    <webuijsf:message binding="#{FiltroFuncionPar1.message10}" for="textoValor2" id="message10"
                                                        showDetail="false" showSummary="true"/>
                                                    <webuijsf:dropDown binding="#{FiltroFuncionPar1.listaValorLista1}"
                                                        converter="#{FiltroFuncionPar1.longConverter1}"
                                                        disabled="#{FiltroFuncionPar1.gestor.filaNoProcesada}" id="listaValorLista1"
                                                        items="#{FiltroFuncionPar1.sidekick.opcionesListaValorLista1}"
                                                        label="#{FiltroFuncionPar1.gestor.whiteLabel}"
                                                        rendered="#{FiltroFuncionPar1.sidekick.filaTipoValorDiscreto}"
                                                        selected="#{currentRow.value['id_valor_lista']}" style="width: 100%"/>
                                                    <webuijsf:staticText binding="#{FiltroFuncionPar1.listaValorLista1Texto1}" id="listaValorLista1Texto1"/>
                                                    <webuijsf:message binding="#{FiltroFuncionPar1.message4}" for="listaValorLista1" id="message4"
                                                        showDetail="false" showSummary="true"/>
                                                    <webuijsf:textField binding="#{FiltroFuncionPar1.textoCodigoObjeto1}" id="textoCodigoObjeto1"
                                                        label="#{FiltroFuncionPar1.gestor.whiteLabel}"
                                                        readOnly="#{FiltroFuncionPar1.gestor.filaNoProcesada}"
                                                        rendered="#{FiltroFuncionPar1.sidekick.filaTipoValorObjeto}"
                                                        text="#{FiltroFuncionPar1.sidekick.codigoObjetoValor}"
                                                        toolTip="#{FiltroFuncionPar1.sidekick.nombreObjetoValor}" validatorExpression="#{FiltroFuncionPar1.textoCodigoObjeto1_validate}"/>
                                                    <webuijsf:button binding="#{FiltroFuncionPar1.textoCodigoObjeto1Boton1}" id="textoCodigoObjeto1Boton1" onClick="#{FiltroFuncionPar1.sidekick.scriptBotonBuscarObjetoValor}"/>
                                                    <webuijsf:message binding="#{FiltroFuncionPar1.message5}" for="textoCodigoObjeto1" id="message5"
                                                        showDetail="false" showSummary="true"/>
                                                    <webuijsf:textField binding="#{FiltroFuncionPar1.textoCodigoRecurso1}" id="textoCodigoRecurso1"
                                                        label="#{FiltroFuncionPar1.gestor.whiteLabel}"
                                                        readOnly="#{FiltroFuncionPar1.gestor.filaNoProcesada}"
                                                        rendered="#{FiltroFuncionPar1.sidekick.filaTipoValorRecurso}"
                                                        text="#{FiltroFuncionPar1.sidekick.codigoRecursoValor}"
                                                        toolTip="#{FiltroFuncionPar1.sidekick.nombreRecursoValor}" validatorExpression="#{FiltroFuncionPar1.textoCodigoRecurso1_validate}"/>
                                                    <webuijsf:button binding="#{FiltroFuncionPar1.textoCodigoRecurso1Boton1}"
                                                        id="textoCodigoRecurso1Boton1" onClick="#{FiltroFuncionPar1.sidekick.scriptBotonBuscarRecursoValor}"/>
                                                    <webuijsf:message binding="#{FiltroFuncionPar1.message6}" for="textoCodigoRecurso1" id="message6"
                                                        showDetail="false" showSummary="true"/>
                                                    <webuijsf:dropDown binding="#{FiltroFuncionPar1.listaValorRecurso1}"
                                                        converter="#{FiltroFuncionPar1.integerConverter1}"
                                                        disabled="#{FiltroFuncionPar1.gestor.filaNoProcesada}" id="listaValorRecurso1"
                                                        items="#{FiltroFuncionPar1.sidekick.opcionesListaValorRecurso1}"
                                                        label="#{FiltroFuncionPar1.gestor.whiteLabel}"
                                                        rendered="#{FiltroFuncionPar1.sidekick.filaTipoValorRecursoConfiguracionFija}" selected="#{FiltroFuncionPar1.idRecursoValorConfiguracionFija}"/>
                                                    <webuijsf:staticText binding="#{FiltroFuncionPar1.listaValorRecurso1Texto1}" id="listaValorRecurso1Texto1"/>
                                                    <webuijsf:message binding="#{FiltroFuncionPar1.message9}" for="listaValorRecurso1" id="message9"
                                                        showDetail="false" showSummary="true"/>
                                                </webuijsf:tableColumn>
                                                <webuijsf:tableColumn binding="#{FiltroFuncionPar1.tableColumn6}" headerText="significado"
                                                    id="tableColumn6" sort="significado_parametro">
                                                    <webuijsf:textField binding="#{FiltroFuncionPar1.textoSignificado1}" id="textoSignificado1"
                                                        label="#{FiltroFuncionPar1.gestor.whiteLabel}"
                                                        readOnly="#{FiltroFuncionPar1.gestor.filaNoProcesada}"
                                                        rendered="#{FiltroFuncionPar1.sidekick.filaTipoValorContinuo}" text="#{currentRow.value['significado_parametro']}"/>
                                                    <webuijsf:message binding="#{FiltroFuncionPar1.message8}" for="textoSignificado1" id="message8"
                                                        showDetail="false" showSummary="true"/>
                                                    <webuijsf:imageHyperlink binding="#{FiltroFuncionPar1.textoCodigoObjeto1Hiper1}"
                                                        id="textoCodigoObjeto1Hiper1" onClick="#{FiltroFuncionPar1.sidekick.scriptBotonVerDetalleObjetoValor}"/>
                                                    <webuijsf:staticText binding="#{FiltroFuncionPar1.textoCodigoRecurso1Texto1}" id="textoCodigoRecurso1Texto1"/>
                                                </webuijsf:tableColumn>
                                            </webuijsf:tableRowGroup>
                                        </webuijsf:table>
                                        <h:panelGrid binding="#{FiltroFuncionPar1.gridPanel2}" id="gridPanel2">
                                            <h:panelGrid binding="#{FiltroFuncionPar1.gridPanel3}" columns="2" id="gridPanel3">
                                                <h:panelGrid binding="#{FiltroFuncionPar1.gridFilasPorPagina1}" id="gridFilasPorPagina1">
                                                    <webuijsf:label binding="#{FiltroFuncionPar1.etiquetaTextoFilasPorPagina1}" for="textoFilasPorPagina1"
                                                        id="etiquetaTextoFilasPorPagina1" text="Filas por página"/>
                                                </h:panelGrid>
                                                <h:panelGrid binding="#{FiltroFuncionPar1.gridFilasPorPagina2}" columns="5" id="gridFilasPorPagina2">
                                                    <webuijsf:textField binding="#{FiltroFuncionPar1.textoFilasPorPagina1}" columns="2"
                                                        converter="#{FiltroFuncionPar1.textoFilasPorPagina1Converter1}"
                                                        disabled="#{FiltroFuncionPar1.gestor.paginacionInhabilitada}" id="textoFilasPorPagina1"
                                                        maxLength="2" text="#{FiltroFuncionPar1.gestor.filasPorPagina}" validatorExpression="#{FiltroFuncionPar1.textoFilasPorPagina1Validator1.validate}"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncionPar1.botonRepaginar1_action}"
                                                        binding="#{FiltroFuncionPar1.botonRepaginar1}" id="botonRepaginar1"
                                                        imageURL="#{FiltroFuncionPar1.gestor.urlImagenRepaginar}"
                                                        onClick="#{FiltroFuncionPar1.gestor.scriptRepaginar}" text="Repaginar" toolTip="Repaginar"/>
                                                    <webuijsf:message binding="#{FiltroFuncionPar1.message1}" for="textoFilasPorPagina1" id="message1"
                                                        showDetail="false" showSummary="true"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar1.gridPanel5}" columns="10" id="gridPanel5">
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar1.botonAgregar1_action}"
                                                    binding="#{FiltroFuncionPar1.botonAgregar1}"
                                                    disabled="#{FiltroFuncionPar1.gestor.funcionInsertInhabilitada}" id="botonAgregar1"
                                                    onClick="#{FiltroFuncionPar1.gestor.scriptAgregar}"
                                                    rendered="#{FiltroFuncionPar1.gestor.funcionInsertHabilitada}" styleClass="pdq-button-1"
                                                    text="Agregar" toolTip="#{FiltroFuncionPar1.botonAgregar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar1.botonEditar1_action}"
                                                    binding="#{FiltroFuncionPar1.botonEditar1}"
                                                    disabled="#{FiltroFuncionPar1.gestor.funcionUpdateInhabilitada}" id="botonEditar1"
                                                    onClick="#{FiltroFuncionPar1.gestor.scriptEditar}"
                                                    rendered="#{FiltroFuncionPar1.gestor.funcionUpdateHabilitada}" styleClass="pdq-button-1"
                                                    text="#{FiltroFuncionPar1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}" toolTip="#{FiltroFuncionPar1.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar1.botonEliminar1_action}"
                                                    binding="#{FiltroFuncionPar1.botonEliminar1}"
                                                    disabled="#{FiltroFuncionPar1.gestor.funcionDeleteInhabilitada}" id="botonEliminar1"
                                                    onClick="#{FiltroFuncionPar1.gestor.scriptEliminar}"
                                                    rendered="#{FiltroFuncionPar1.gestor.funcionDeleteHabilitada}" styleClass="pdq-button-1"
                                                    text="Eliminar" toolTip="#{FiltroFuncionPar1.botonEliminar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar1.botonAplicar1_action}"
                                                    binding="#{FiltroFuncionPar1.botonAplicar1}" id="botonAplicar1"
                                                    onClick="#{FiltroFuncionPar1.gestor.scriptAplicar}"
                                                    rendered="#{FiltroFuncionPar1.gestor.funcionCheckChangesHabilitada}" styleClass="pdq-button-1"
                                                    text="Aplicar" toolTip="#{FiltroFuncionPar1.botonAplicar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar1.botonDeshacer1_action}"
                                                    binding="#{FiltroFuncionPar1.botonDeshacer1}" id="botonDeshacer1"
                                                    onClick="#{FiltroFuncionPar1.gestor.scriptDeshacer}"
                                                    rendered="#{FiltroFuncionPar1.gestor.funcionCancelUpdateHabilitada}" styleClass="pdq-button-1"
                                                    text="Deshacer" toolTip="#{FiltroFuncionPar1.botonDeshacer1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar1.botonConfirmar1_action}"
                                                    binding="#{FiltroFuncionPar1.botonConfirmar1}" id="botonConfirmar1"
                                                    onClick="#{FiltroFuncionPar1.gestor.scriptConfirmar}"
                                                    rendered="#{FiltroFuncionPar1.gestor.funcionCommitHabilitada}" styleClass="pdq-button-1"
                                                    text="Confirmar" toolTip="#{FiltroFuncionPar1.botonAgregar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar1.botonDescartar1_action}"
                                                    binding="#{FiltroFuncionPar1.botonDescartar1}" id="botonDescartar1"
                                                    onClick="#{FiltroFuncionPar1.gestor.scriptDescartar}"
                                                    rendered="#{FiltroFuncionPar1.gestor.funcionRevertHabilitada}" styleClass="pdq-button-1"
                                                    text="Descartar" toolTip="#{FiltroFuncionPar1.botonDescartar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar1.botonRefrescar1_action}"
                                                    binding="#{FiltroFuncionPar1.botonRefrescar1}"
                                                    disabled="#{FiltroFuncionPar1.gestor.funcionSelectInhabilitada}" id="botonRefrescar1"
                                                    onClick="#{FiltroFuncionPar1.gestor.scriptRefrescar}"
                                                    rendered="#{FiltroFuncionPar1.gestor.funcionSelectHabilitada}" styleClass="pdq-button-1"
                                                    text="Refrescar" toolTip="#{FiltroFuncionPar1.botonRefrescar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar1.botonRetornar1_action}"
                                                    binding="#{FiltroFuncionPar1.botonRetornar1}"
                                                    disabled="#{FiltroFuncionPar1.gestor.funcionReturnFilaEscogidaInhabilitada}" id="botonRetornar1"
                                                    onClick="#{FiltroFuncionPar1.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{FiltroFuncionPar1.gestor.funcionReturnVisible}" styleClass="pdq-button-1" text="Retornar" toolTip="#{FiltroFuncionPar1.botonRetornar1.text}"/>
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
                        <webuijsf:anchor binding="#{FiltroFuncionPar1.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
