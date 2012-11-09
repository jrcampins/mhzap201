<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{FiltroFuncionPar2.page1}" id="page1">
            <webuijsf:html binding="#{FiltroFuncionPar2.html1}" id="html1">
                <webuijsf:head binding="#{FiltroFuncionPar2.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{FiltroFuncionPar2.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{FiltroFuncionPar2.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{FiltroFuncionPar2.body1}" id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{FiltroFuncionPar2.form1}" id="form1" virtualFormsConfig="virtualForm1 | listaValorRecurso1 textoValor1 listaValorLista1 listaFuncionParametro1 textoSignificado1 textoCodigoRecurso1 textoCodigoObjeto1 listaOperadorCom1 fechaValor1 | , virtualForm2 | | , virtualForm3 | | botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonRefrescar1 botonAgregar1 botonDescartar1 botonRetornar1">
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
                                    <webuijsf:breadcrumbs binding="#{FiltroFuncionPar2.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel1}" id="gridPanel1">
                                        <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel30}" id="gridPanel30">
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel39}" columns="5" id="gridPanel39">
                                                <webuijsf:image binding="#{FiltroFuncionPar2.imagenMensaje1}" id="imagenMensaje1" url="#{FiltroFuncionPar2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" binding="#{FiltroFuncionPar2.hipervinculoMensaje1}"
                                                    id="hipervinculoMensaje1" text="#{FiltroFuncionPar2.gestor.mensaje}" url="#{FiltroFuncionPar2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
<h:panelGrid id="gridPanel2" styleClass="pdq-grid-detalle-1" binding="#{FiltroFuncionPar2.gridPanel2}" rendered="#{FiltroFuncionPar2.gestor.filaDisponible}">
<h:panelGrid id="gridPanel201" styleClass="pdq-grid-detalle-cab">
<h:panelGrid id="gridPanel202" columns="2">
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel40}" id="gridPanel40" styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel3}" columns="4" id="gridPanel3">
                                                    <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonIrAlPrimero1_action}"
                                                        binding="#{FiltroFuncionPar2.botonIrAlPrimero1}"
                                                        disabled="#{FiltroFuncionPar2.gestor.loteSinFilas}" id="botonIrAlPrimero1"
                                                        imageURL="#{FiltroFuncionPar2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{FiltroFuncionPar2.gestor.scriptIrAlPrimero}" text="|&lt;" toolTip="Ir al primero"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonIrAlAnterior1_action}"
                                                        binding="#{FiltroFuncionPar2.botonIrAlAnterior1}"
                                                        disabled="#{FiltroFuncionPar2.gestor.loteSinFilas}" id="botonIrAlAnterior1"
                                                        imageURL="#{FiltroFuncionPar2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{FiltroFuncionPar2.gestor.scriptIrAlAnterior}" text="&lt;" toolTip="Ir al anterior"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonIrAlSiguiente1_action}"
                                                        binding="#{FiltroFuncionPar2.botonIrAlSiguiente1}"
                                                        disabled="#{FiltroFuncionPar2.gestor.loteSinFilas}" id="botonIrAlSiguiente1"
                                                        imageURL="#{FiltroFuncionPar2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{FiltroFuncionPar2.gestor.scriptIrAlSiguiente}" text="&gt;" toolTip="Ir al siguiente"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonIrAlUltimo1_action}"
                                                        binding="#{FiltroFuncionPar2.botonIrAlUltimo1}"
                                                        disabled="#{FiltroFuncionPar2.gestor.loteSinFilas}" id="botonIrAlUltimo1"
                                                        imageURL="#{FiltroFuncionPar2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{FiltroFuncionPar2.gestor.scriptIrAlUltimo}" text="&gt;|" toolTip="Ir al último"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel4}" id="gridPanel4" styleClass="pdq-grid-detalle-mensajes">
                                                <webuijsf:staticText binding="#{FiltroFuncionPar2.textoTituloConsulta1}" id="textoTituloConsulta1"
                                                    style="font-weight: bold" text="#{FiltroFuncionPar2.gestor.tituloConsulta}"/>
                                            </h:panelGrid>
</h:panelGrid><!--gridPanel202-->
</h:panelGrid><!--gridPanel201-->
<h:panelGrid id="gridPanel203" columns="2">
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel5}" id="gridPanel5" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncionPar2.etiquetaIdentificacionFila1}"
                                                    id="etiquetaIdentificacionFila1" text="referencia (#)"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel6}" columns="5" id="gridPanel6">
                                                <webuijsf:staticText binding="#{FiltroFuncionPar2.textoIdentificacionFila1}" id="textoIdentificacionFila1"
                                                    style="font-weight: bold" text="#{FiltroFuncionPar2.gestor.identificacionFila}"/>
                                                <webuijsf:image binding="#{FiltroFuncionPar2.imagenFilaProcesada1}" id="imagenFilaProcesada1"
                                                    toolTip="#{FiltroFuncionPar2.gestor.toolTipImagenFilaProcesada}" url="#{FiltroFuncionPar2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel7}" id="gridPanel7"
                                                rendered="#{FiltroFuncionPar2.gestor.paginaConsultaConMaestro}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncionPar2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1" text="filtro"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel8}" columns="5" id="gridPanel8" rendered="#{FiltroFuncionPar2.gestor.paginaConsultaConMaestro}">
                                                <webuijsf:staticText binding="#{FiltroFuncionPar2.textoDenominacionFilaMaestro1}"
                                                    id="textoDenominacionFilaMaestro1" style="font-weight: bold" text="#{FiltroFuncionPar2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image binding="#{FiltroFuncionPar2.imagenFilaMaestro1}" id="imagenFilaMaestro1"
                                                    toolTip="recurso maestro" url="#{FiltroFuncionPar2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel9}" id="gridPanel9" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncionPar2.label3}" id="label3" text="id"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel10}" columns="5" id="gridPanel10">
                                                <webuijsf:textField binding="#{FiltroFuncionPar2.textField1}" id="textField1" readOnly="true" text="#{FiltroFuncionPar2.filtroFuncionParDataProvider.value['id_filtro_funcion_par']}"/>
                                                <webuijsf:message binding="#{FiltroFuncionPar2.message1}" for="textField1" id="message1"
                                                    showDetail="false" showSummary="true"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel11}" id="gridPanel11" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncionPar2.label4}" id="label4" text="parámetro"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel12}" columns="5" id="gridPanel12">
                                                <webuijsf:dropDown binding="#{FiltroFuncionPar2.listaFuncionParametro1}"
                                                    converter="#{FiltroFuncionPar2.longConverter1}"
                                                    disabled="#{FiltroFuncionPar2.gestor.filaNoProcesada}" id="listaFuncionParametro1"
                                                    items="#{FiltroFuncionPar2.sidekick.opcionesListaFuncionParametro1}"
                                                    label="#{FiltroFuncionPar2.gestor.whiteLabel}"
                                                    onChange="webui.suntheme.common.timeoutSubmitForm(this.form, 'listaFuncionParametro1');" required="true"
                                                    selected="#{FiltroFuncionPar2.filtroFuncionParDataProvider.idFuncionParametro}" validatorExpression="#{FiltroFuncionPar2.listaFuncionParametro1_validate}"/>
                                                <webuijsf:staticText binding="#{FiltroFuncionPar2.listaFuncionParametro1Texto1}" id="listaFuncionParametro1Texto1"/>
                                                <webuijsf:message binding="#{FiltroFuncionPar2.message2}" for="listaFuncionParametro1" id="message2"
                                                    showDetail="false" showSummary="true"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel13}" id="gridPanel13" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncionPar2.label5}" id="label5" text="operador"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel14}" columns="5" id="gridPanel14">
                                                <webuijsf:dropDown binding="#{FiltroFuncionPar2.listaOperadorCom1}"
                                                    converter="#{FiltroFuncionPar2.integerConverter1}"
                                                    disabled="#{FiltroFuncionPar2.gestor.filaNoProcesada}" id="listaOperadorCom1"
                                                    items="#{FiltroFuncionPar2.sidekick.opcionesListaOperadorCom1}"
                                                    label="#{FiltroFuncionPar2.gestor.whiteLabel}" required="true" selected="#{FiltroFuncionPar2.filtroFuncionParDataProvider.numeroOperadorCom}"/>
                                                <webuijsf:staticText binding="#{FiltroFuncionPar2.listaOperadorCom1Texto1}" id="listaOperadorCom1Texto1"/>
                                                <webuijsf:message binding="#{FiltroFuncionPar2.message3}" for="listaOperadorCom1" id="message3"
                                                    showDetail="false" showSummary="true"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel17}" id="gridPanel17"
                                                rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorDiscreto}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncionPar2.label7}" id="label7" text="valor"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel18}" columns="5" id="gridPanel18" rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorDiscreto}">
                                                <webuijsf:dropDown binding="#{FiltroFuncionPar2.listaValorLista1}"
                                                    converter="#{FiltroFuncionPar2.longConverter1}"
                                                    disabled="#{FiltroFuncionPar2.gestor.filaNoProcesada}" id="listaValorLista1"
                                                    items="#{FiltroFuncionPar2.sidekick.opcionesListaValorLista1}"
                                                    label="#{FiltroFuncionPar2.gestor.whiteLabel}" selected="#{FiltroFuncionPar2.filtroFuncionParDataProvider.idValorLista}"/>
                                                <webuijsf:staticText binding="#{FiltroFuncionPar2.listaValorLista1Texto1}" id="listaValorLista1Texto1"/>
                                                <webuijsf:message binding="#{FiltroFuncionPar2.message5}" for="listaValorLista1" id="message5"
                                                    showDetail="false" showSummary="true"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel19}" id="gridPanel19"
                                                rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorObjeto}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncionPar2.label8}" id="label8" text="código objeto"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel20}" columns="5" id="gridPanel20" rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorObjeto}">
                                                <webuijsf:textField binding="#{FiltroFuncionPar2.textoCodigoObjeto1}" columns="50" id="textoCodigoObjeto1"
                                                    label="#{FiltroFuncionPar2.gestor.whiteLabel}"
                                                    readOnly="#{FiltroFuncionPar2.gestor.filaNoProcesada}"
                                                    text="#{FiltroFuncionPar2.sidekick.codigoObjetoValor}"
                                                    toolTip="#{FiltroFuncionPar2.sidekick.nombreObjetoValor}" validatorExpression="#{FiltroFuncionPar2.textoCodigoObjeto1_validate}"/>
                                                <webuijsf:button binding="#{FiltroFuncionPar2.textoCodigoObjeto1Boton1}" id="textoCodigoObjeto1Boton1" onClick="#{FiltroFuncionPar2.sidekick.scriptBotonBuscarObjetoValor}"/>
                                                <webuijsf:message binding="#{FiltroFuncionPar2.message6}" for="textoCodigoObjeto1" id="message6"
                                                    showDetail="false" showSummary="true"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel33}" id="gridPanel33"
                                                rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorObjeto}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncionPar2.label11}" id="label11" text="nombre objeto"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel34}" columns="5" id="gridPanel34" rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorObjeto}">
                                                <webuijsf:staticText binding="#{FiltroFuncionPar2.textoCodigoObjeto1Texto1}" id="textoCodigoObjeto1Texto1"/>
                                                <webuijsf:button binding="#{FiltroFuncionPar2.textoCodigoObjeto1Boton2}" id="textoCodigoObjeto1Boton2" onClick="#{FiltroFuncionPar2.sidekick.scriptBotonVerDetalleObjetoValor}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel35}" id="gridPanel35"
                                                rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorRecursoConfiguracionFija}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncionPar2.label13}" id="label13" text="valor"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel36}" columns="5" id="gridPanel36" rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorRecursoConfiguracionFija}">
                                                <webuijsf:dropDown binding="#{FiltroFuncionPar2.listaValorRecurso1}"
                                                    converter="#{FiltroFuncionPar2.integerConverter1}"
                                                    disabled="#{FiltroFuncionPar2.gestor.filaNoProcesada}" id="listaValorRecurso1"
                                                    items="#{FiltroFuncionPar2.sidekick.opcionesListaValorRecurso1}"
                                                    label="#{FiltroFuncionPar2.gestor.whiteLabel}" selected="#{FiltroFuncionPar2.filtroFuncionParDataProvider.idRecursoValorConfiguracionFija}"/>
                                                <webuijsf:staticText binding="#{FiltroFuncionPar2.listaValorRecurso1Texto1}" id="listaValorRecurso1Texto1"/>
                                                <webuijsf:message binding="#{FiltroFuncionPar2.message9}" for="listaValorRecurso1" id="message9"
                                                    showDetail="false" showSummary="true"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel21}" id="gridPanel21"
                                                rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorRecurso}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncionPar2.label9}" id="label9" text="código recurso"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel22}" columns="5" id="gridPanel22" rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorRecurso}">
                                                <webuijsf:textField binding="#{FiltroFuncionPar2.textoCodigoRecurso1}" columns="50"
                                                    id="textoCodigoRecurso1" label="#{FiltroFuncionPar2.gestor.whiteLabel}"
                                                    readOnly="#{FiltroFuncionPar2.gestor.filaNoProcesada}"
                                                    text="#{FiltroFuncionPar2.sidekick.codigoRecursoValor}"
                                                    toolTip="#{FiltroFuncionPar2.sidekick.nombreRecursoValor}" validatorExpression="#{FiltroFuncionPar2.textoCodigoRecurso1_validate}"/>
                                                <webuijsf:button binding="#{FiltroFuncionPar2.textoCodigoRecurso1Boton1}" id="textoCodigoRecurso1Boton1" onClick="#{FiltroFuncionPar2.sidekick.scriptBotonBuscarRecursoValor}"/>
                                                <webuijsf:message binding="#{FiltroFuncionPar2.message7}" for="textoCodigoRecurso1" id="message7"
                                                    showDetail="false" showSummary="true"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel31}" id="gridPanel31"
                                                rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorRecurso}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncionPar2.label12}" id="label12" text="nombre recurso"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel32}" columns="5" id="gridPanel32" rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorRecurso}">
                                                <webuijsf:staticText binding="#{FiltroFuncionPar2.textoCodigoRecurso1Texto1}" id="textoCodigoRecurso1Texto1"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel23}" id="gridPanel23"
                                                rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorContinuo}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncionPar2.label10}" id="label10" text="valor"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel24}" columns="5" id="gridPanel24" rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorContinuo}">
                                                <webuijsf:textField binding="#{FiltroFuncionPar2.textoValor1}" columns="50" id="textoValor1"
                                                    label="#{FiltroFuncionPar2.gestor.whiteLabel}"
                                                    readOnly="#{FiltroFuncionPar2.gestor.filaNoProcesada}"
                                                    text="#{FiltroFuncionPar2.filtroFuncionParDataProvider.value['valor_parametro']}" validatorExpression="#{FiltroFuncionPar2.textoValor1_validate}"/>
                                                <webuijsf:message binding="#{FiltroFuncionPar2.message8}" for="textoValor1" id="message8"
                                                    showDetail="false" showSummary="true"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel37}" id="gridPanel37"
                                                rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorContinuoFechaHora}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncionPar2.label14}" id="label14" text="valor"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel38}" columns="5" id="gridPanel38" rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorContinuoFechaHora}">
                                                <webuijsf:calendar binding="#{FiltroFuncionPar2.fechaValor1}" columns="10" id="fechaValor1"
                                                    label="#{FiltroFuncionPar2.gestor.whiteLabel}"
                                                    readOnly="#{FiltroFuncionPar2.gestor.filaNoProcesada}" selectedDate="#{FiltroFuncionPar2.filtroFuncionParDataProvider.valorParametroFechaHora}"/>
                                                <webuijsf:staticText binding="#{FiltroFuncionPar2.fechaValor1Texto1}" id="fechaValor1Texto1"/>
                                                <webuijsf:message binding="#{FiltroFuncionPar2.message10}" for="fechaValor1" id="message10"
                                                    showDetail="false" showSummary="true"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel15}" id="gridPanel15"
                                                rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorContinuo}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncionPar2.label6}" id="label6" text="significado"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel16}" columns="5" id="gridPanel16" rendered="#{FiltroFuncionPar2.sidekick.filaTipoValorContinuo}">
                                                <webuijsf:textArea binding="#{FiltroFuncionPar2.textoSignificado1}" columns="100" id="textoSignificado1"
                                                    label="#{FiltroFuncionPar2.gestor.whiteLabel}"
                                                    readOnly="#{FiltroFuncionPar2.gestor.filaNoProcesada}" rows="5"
                                                    text="#{FiltroFuncionPar2.filtroFuncionParDataProvider.value['significado_parametro']}" validatorExpression="#{FiltroFuncionPar2.lengthValidator3.validate}"/>
                                                <webuijsf:message binding="#{FiltroFuncionPar2.message4}" for="textoSignificado1" id="message4"
                                                    showDetail="false" showSummary="true"/>
                                            </h:panelGrid>
</h:panelGrid><!--gridPanel203-->
<h:panelGrid  id="gridPanel204" styleClass="pdq-grid-detalle-pie">
<h:panelGrid  id="gridPanel205" columns="2">
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel41}" id="gridPanel41" styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel25}" columns="4" id="gridPanel25">
                                                    <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonIrAlPrimero1_action}"
                                                        binding="#{FiltroFuncionPar2.botonIrAlPrimero2}"
                                                        disabled="#{FiltroFuncionPar2.gestor.loteSinFilas}" id="botonIrAlPrimero2"
                                                        imageURL="#{FiltroFuncionPar2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{FiltroFuncionPar2.gestor.scriptIrAlPrimero}" text="|&lt;" toolTip="Ir al primero"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonIrAlAnterior1_action}"
                                                        binding="#{FiltroFuncionPar2.botonIrAlAnterior2}"
                                                        disabled="#{FiltroFuncionPar2.gestor.loteSinFilas}" id="botonIrAlAnterior2"
                                                        imageURL="#{FiltroFuncionPar2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{FiltroFuncionPar2.gestor.scriptIrAlAnterior}" text="&lt;" toolTip="Ir al anterior"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonIrAlSiguiente1_action}"
                                                        binding="#{FiltroFuncionPar2.botonIrAlSiguiente2}"
                                                        disabled="#{FiltroFuncionPar2.gestor.loteSinFilas}" id="botonIrAlSiguiente2"
                                                        imageURL="#{FiltroFuncionPar2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{FiltroFuncionPar2.gestor.scriptIrAlSiguiente}" text="&gt;" toolTip="Ir al siguiente"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonIrAlUltimo1_action}"
                                                        binding="#{FiltroFuncionPar2.botonIrAlUltimo2}"
                                                        disabled="#{FiltroFuncionPar2.gestor.loteSinFilas}" id="botonIrAlUltimo2"
                                                        imageURL="#{FiltroFuncionPar2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{FiltroFuncionPar2.gestor.scriptIrAlUltimo}" text="&gt;|" toolTip="Ir al último"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel42}" id="gridPanel42" styleClass="pdq-grid-detalle-mensajes">
                                                <webuijsf:staticText binding="#{FiltroFuncionPar2.textoMensajeCambiosPorConfirmar1}"
                                                    id="textoMensajeCambiosPorConfirmar1" style="font-weight: bold" text="#{FiltroFuncionPar2.gestor.mensajeCambiosPorConfirmar}"/>
                                            </h:panelGrid>
</h:panelGrid><!--gridPanel205-->
</h:panelGrid><!--gridPanel204-->
</h:panelGrid><!--gridPanel2-->
                                        <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel28}" id="gridPanel28">
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel26}" id="gridPanel26">
                                                <webuijsf:anchor binding="#{FiltroFuncionPar2.anchor1}" id="anchor1"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncionPar2.gridPanel29}" columns="10" id="gridPanel29">
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonAgregar1_action}"
                                                    binding="#{FiltroFuncionPar2.botonAgregar1}"
                                                    disabled="#{FiltroFuncionPar2.gestor.funcionInsertInhabilitada}" id="botonAgregar1"
                                                    onClick="#{FiltroFuncionPar2.gestor.scriptAgregar}"
                                                    rendered="#{FiltroFuncionPar2.gestor.funcionInsertHabilitada}" styleClass="pdq-button-1"
                                                    text="Agregar" toolTip="#{FiltroFuncionPar2.botonAgregar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonEditar1_action}"
                                                    binding="#{FiltroFuncionPar2.botonEditar1}"
                                                    disabled="#{FiltroFuncionPar2.gestor.funcionUpdateInhabilitada}" id="botonEditar1"
                                                    onClick="#{FiltroFuncionPar2.gestor.scriptEditar}"
                                                    rendered="#{FiltroFuncionPar2.gestor.funcionUpdateHabilitada}" styleClass="pdq-button-1"
                                                    text="#{FiltroFuncionPar2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}" toolTip="#{FiltroFuncionPar2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonEliminar1_action}"
                                                    binding="#{FiltroFuncionPar2.botonEliminar1}"
                                                    disabled="#{FiltroFuncionPar2.gestor.funcionDeleteInhabilitada}" id="botonEliminar1"
                                                    onClick="#{FiltroFuncionPar2.gestor.scriptEliminar}"
                                                    rendered="#{FiltroFuncionPar2.gestor.funcionDeleteHabilitada}" styleClass="pdq-button-1"
                                                    text="Eliminar" toolTip="#{FiltroFuncionPar2.botonEliminar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonAplicar1_action}"
                                                    binding="#{FiltroFuncionPar2.botonAplicar1}" id="botonAplicar1"
                                                    onClick="#{FiltroFuncionPar2.gestor.scriptAplicar}"
                                                    rendered="#{FiltroFuncionPar2.gestor.funcionCheckChangesHabilitada}" styleClass="pdq-button-1"
                                                    text="Aplicar" toolTip="#{FiltroFuncionPar2.botonAplicar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonDeshacer1_action}"
                                                    binding="#{FiltroFuncionPar2.botonDeshacer1}" id="botonDeshacer1"
                                                    onClick="#{FiltroFuncionPar2.gestor.scriptDeshacer}"
                                                    rendered="#{FiltroFuncionPar2.gestor.funcionCancelUpdateHabilitada}" styleClass="pdq-button-1"
                                                    text="Deshacer" toolTip="#{FiltroFuncionPar2.botonDeshacer1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonConfirmar1_action}"
                                                    binding="#{FiltroFuncionPar2.botonConfirmar1}" id="botonConfirmar1"
                                                    onClick="#{FiltroFuncionPar2.gestor.scriptConfirmar}"
                                                    rendered="#{FiltroFuncionPar2.gestor.funcionCommitHabilitada}" styleClass="pdq-button-1"
                                                    text="Confirmar" toolTip="#{FiltroFuncionPar2.botonAgregar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonDescartar1_action}"
                                                    binding="#{FiltroFuncionPar2.botonDescartar1}" id="botonDescartar1"
                                                    onClick="#{FiltroFuncionPar2.gestor.scriptDescartar}"
                                                    rendered="#{FiltroFuncionPar2.gestor.funcionRevertHabilitada}" styleClass="pdq-button-1"
                                                    text="Descartar" toolTip="#{FiltroFuncionPar2.botonDescartar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonRefrescar1_action}"
                                                    binding="#{FiltroFuncionPar2.botonRefrescar1}"
                                                    disabled="#{FiltroFuncionPar2.gestor.funcionSelectInhabilitada}" id="botonRefrescar1"
                                                    onClick="#{FiltroFuncionPar2.gestor.scriptRefrescar}"
                                                    rendered="#{FiltroFuncionPar2.gestor.funcionSelectHabilitada}" styleClass="pdq-button-1"
                                                    text="Refrescar" toolTip="#{FiltroFuncionPar2.botonRefrescar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncionPar2.botonRetornar1_action}"
                                                    binding="#{FiltroFuncionPar2.botonRetornar1}"
                                                    disabled="#{FiltroFuncionPar2.gestor.funcionReturnFilaEscogidaInhabilitada}" id="botonRetornar1"
                                                    onClick="#{FiltroFuncionPar2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{FiltroFuncionPar2.gestor.funcionReturnVisible}" styleClass="pdq-button-1" text="Retornar" toolTip="#{FiltroFuncionPar2.botonRetornar1.text}"/>
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
                        <webuijsf:anchor binding="#{FiltroFuncionPar2.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
