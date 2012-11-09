<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{FiltroFuncion2.page1}" id="page1">
            <webuijsf:html binding="#{FiltroFuncion2.html1}" id="html1">
                <webuijsf:head binding="#{FiltroFuncion2.head1}" id="head1" title="#{ApplicationBean1.nombreAplicacion}">
                    <webuijsf:link binding="#{FiltroFuncion2.link1}" id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:script binding="#{FiltroFuncion2.script1}" id="script1" url="/resources/javascript1.js"/>
                </webuijsf:head>
                <webuijsf:body binding="#{FiltroFuncion2.body1}" id="body1" onClick="#{ApplicationBean1.contextoAplicacion.onClickJavaScript}"
                    onDblClick="#{ApplicationBean1.contextoAplicacion.onDblClickJavaScript}"
                    onKeyPress="#{ApplicationBean1.contextoAplicacion.onKeyPressJavaScript}" onLoad="#{ApplicationBean1.contextoAplicacion.onLoadJavaScript}"
                    onUnload="#{ApplicationBean1.contextoAplicacion.onUnloadJavaScript}" styleClass="pdq-body-1">
                    <webuijsf:form binding="#{FiltroFuncion2.form1}" id="form1" virtualFormsConfig="virtualForm1 | textField1 textField2 textField3 textArea1 | , virtualForm2 | | , virtualForm3 | | botonEditar1 botonDeshacer1 botonEliminar1 , virtualForm4 | | botonRefrescar1 botonAgregar1 botonDescartar1 botonRetornar1">
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
                                    <webuijsf:breadcrumbs binding="#{FiltroFuncion2.breadcrumbs1}" id="breadcrumbs1" styleClass="pdq-breadcrumbs-1"/>
                                </div>
                                <div class="pos-div-detalle">
                                    <h:panelGrid binding="#{FiltroFuncion2.gridPanel1}" id="gridPanel1">
                                        <h:panelGrid binding="#{FiltroFuncion2.gridPanel31}" id="gridPanel31">
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel32}" columns="5" id="gridPanel32">
                                                <webuijsf:image binding="#{FiltroFuncion2.imagenMensaje1}" id="imagenMensaje1" url="#{FiltroFuncion2.gestor.urlImagenSeveridadMensaje}"/>
                                                <webuijsf:imageHyperlink align="middle" binding="#{FiltroFuncion2.hipervinculoMensaje1}"
                                                    id="hipervinculoMensaje1" text="#{FiltroFuncion2.gestor.mensaje}" url="#{FiltroFuncion2.gestor.urlAnclaPie1}"/>
                                            </h:panelGrid>
                                        </h:panelGrid>
<h:panelGrid id="gridPanel2" styleClass="pdq-grid-detalle-1" binding="#{FiltroFuncion2.gridPanel2}" rendered="#{FiltroFuncion2.gestor.filaDisponible}">
<h:panelGrid id="gridPanel201" styleClass="pdq-grid-detalle-cab">
<h:panelGrid id="gridPanel202" columns="2">
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel33}" id="gridPanel33" styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid binding="#{FiltroFuncion2.gridPanel3}" columns="4" id="gridPanel3">
                                                    <webuijsf:button actionExpression="#{FiltroFuncion2.botonIrAlPrimero1_action}"
                                                        binding="#{FiltroFuncion2.botonIrAlPrimero1}" disabled="#{FiltroFuncion2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero1" imageURL="#{FiltroFuncion2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{FiltroFuncion2.gestor.scriptIrAlPrimero}" text="|&lt;" toolTip="Ir al primero"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncion2.botonIrAlAnterior1_action}"
                                                        binding="#{FiltroFuncion2.botonIrAlAnterior1}" disabled="#{FiltroFuncion2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior1" imageURL="#{FiltroFuncion2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{FiltroFuncion2.gestor.scriptIrAlAnterior}" text="&lt;" toolTip="Ir al anterior"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncion2.botonIrAlSiguiente1_action}"
                                                        binding="#{FiltroFuncion2.botonIrAlSiguiente1}" disabled="#{FiltroFuncion2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente1" imageURL="#{FiltroFuncion2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{FiltroFuncion2.gestor.scriptIrAlSiguiente}" text="&gt;" toolTip="Ir al siguiente"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncion2.botonIrAlUltimo1_action}"
                                                        binding="#{FiltroFuncion2.botonIrAlUltimo1}" disabled="#{FiltroFuncion2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo1" imageURL="#{FiltroFuncion2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{FiltroFuncion2.gestor.scriptIrAlUltimo}" text="&gt;|" toolTip="Ir al último"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel4}" id="gridPanel4" styleClass="pdq-grid-detalle-mensajes">
                                                <webuijsf:staticText binding="#{FiltroFuncion2.textoTituloConsulta1}" id="textoTituloConsulta1"
                                                    style="font-weight: bold" text="#{FiltroFuncion2.gestor.tituloConsulta}"/>
                                            </h:panelGrid>
</h:panelGrid><!--gridPanel202-->
</h:panelGrid><!--gridPanel201-->
<h:panelGrid id="gridPanel203" columns="2">
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel5}" id="gridPanel5" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncion2.etiquetaIdentificacionFila1}" id="etiquetaIdentificacionFila1" text="referencia (#)"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel6}" columns="5" id="gridPanel6">
                                                <webuijsf:staticText binding="#{FiltroFuncion2.textoIdentificacionFila1}" id="textoIdentificacionFila1"
                                                    style="font-weight: bold" text="#{FiltroFuncion2.gestor.identificacionFila}"/>
                                                <webuijsf:image binding="#{FiltroFuncion2.imagenFilaProcesada1}" id="imagenFilaProcesada1"
                                                    toolTip="#{FiltroFuncion2.gestor.toolTipImagenFilaProcesada}" url="#{FiltroFuncion2.gestor.urlImagenFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel7}" id="gridPanel7"
                                                rendered="#{FiltroFuncion2.gestor.paginaConsultaConMaestro}" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncion2.etiquetaDenominacionFilaMaestro1}"
                                                    id="etiquetaDenominacionFilaMaestro1" text="función"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel8}" columns="5" id="gridPanel8" rendered="#{FiltroFuncion2.gestor.paginaConsultaConMaestro}">
                                                <webuijsf:staticText binding="#{FiltroFuncion2.textoDenominacionFilaMaestro1}"
                                                    id="textoDenominacionFilaMaestro1" style="font-weight: bold" text="#{FiltroFuncion2.gestor.denominacionFilaMaestro}"/>
                                                <webuijsf:image binding="#{FiltroFuncion2.imagenFilaMaestro1}" id="imagenFilaMaestro1" toolTip="recurso maestro" url="#{FiltroFuncion2.gestor.urlImagenMaestroFilaProcesada}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel9}" id="gridPanel9" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncion2.label3}" id="label3" text="id"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel10}" columns="5" id="gridPanel10">
                                                <webuijsf:textField binding="#{FiltroFuncion2.textField1}" id="textField1" readOnly="true" text="#{FiltroFuncion2.filtroFuncionDataProvider.value['id_filtro_funcion']}"/>
                                                <webuijsf:message binding="#{FiltroFuncion2.message1}" for="textField1" id="message1" showDetail="false" showSummary="true"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel11}" id="gridPanel11" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncion2.label4}" id="label4" text="código"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel12}" columns="5" id="gridPanel12">
                                                <webuijsf:textField binding="#{FiltroFuncion2.textField2}" columns="50" id="textField2" readOnly="true" text="#{FiltroFuncion2.filtroFuncionDataProvider.value['codigo_filtro_funcion']}"/>
                                                <webuijsf:message binding="#{FiltroFuncion2.message2}" for="textField2" id="message2" showDetail="false" showSummary="true"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel13}" id="gridPanel13" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncion2.label5}" id="label5" text="nombre"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel14}" columns="5" id="gridPanel14">
                                                <webuijsf:textField binding="#{FiltroFuncion2.textField3}" columns="100" id="textField3" maxLength="100"
                                                    readOnly="#{FiltroFuncion2.gestor.filaNoProcesada}" required="true"
                                                    text="#{FiltroFuncion2.filtroFuncionDataProvider.value['nombre_filtro_funcion']}" validatorExpression="#{FiltroFuncion2.lengthValidator2.validate}"/>
                                                <webuijsf:message binding="#{FiltroFuncion2.message3}" for="textField3" id="message3" showDetail="false" showSummary="true"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel15}" id="gridPanel15" styleClass="pdq-grid-etiqueta-1">
                                                <webuijsf:label binding="#{FiltroFuncion2.label6}" id="label6" text="descripción"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel16}" columns="5" id="gridPanel16">
                                                <webuijsf:textArea binding="#{FiltroFuncion2.textArea1}" columns="100" id="textArea1"
                                                    readOnly="#{FiltroFuncion2.gestor.filaNoProcesada}" rows="3"
                                                    text="#{FiltroFuncion2.filtroFuncionDataProvider.value['descripcion_filtro_funcion']}" validatorExpression="#{FiltroFuncion2.lengthValidator3.validate}"/>
                                                <webuijsf:message binding="#{FiltroFuncion2.message4}" for="textArea1" id="message4" showDetail="false" showSummary="true"/>
                                            </h:panelGrid>
</h:panelGrid><!--gridPanel203-->
<h:panelGrid  id="gridPanel204" styleClass="pdq-grid-detalle-pie">
<h:panelGrid  id="gridPanel205" columns="2">
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel34}" id="gridPanel34" styleClass="pdq-grid-detalle-botones">
                                                <h:panelGrid binding="#{FiltroFuncion2.gridPanel25}" columns="4" id="gridPanel25">
                                                    <webuijsf:button actionExpression="#{FiltroFuncion2.botonIrAlPrimero1_action}"
                                                        binding="#{FiltroFuncion2.botonIrAlPrimero2}" disabled="#{FiltroFuncion2.gestor.loteSinFilas}"
                                                        id="botonIrAlPrimero2" imageURL="#{FiltroFuncion2.gestor.urlImagenIrAlPrimero}"
                                                        onClick="#{FiltroFuncion2.gestor.scriptIrAlPrimero}" text="|&lt;" toolTip="Ir al primero"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncion2.botonIrAlAnterior1_action}"
                                                        binding="#{FiltroFuncion2.botonIrAlAnterior2}" disabled="#{FiltroFuncion2.gestor.loteSinFilas}"
                                                        id="botonIrAlAnterior2" imageURL="#{FiltroFuncion2.gestor.urlImagenIrAlAnterior}"
                                                        onClick="#{FiltroFuncion2.gestor.scriptIrAlAnterior}" text="&lt;" toolTip="Ir al anterior"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncion2.botonIrAlSiguiente1_action}"
                                                        binding="#{FiltroFuncion2.botonIrAlSiguiente2}" disabled="#{FiltroFuncion2.gestor.loteSinFilas}"
                                                        id="botonIrAlSiguiente2" imageURL="#{FiltroFuncion2.gestor.urlImagenIrAlSiguiente}"
                                                        onClick="#{FiltroFuncion2.gestor.scriptIrAlSiguiente}" text="&gt;" toolTip="Ir al siguiente"/>
                                                    <webuijsf:button actionExpression="#{FiltroFuncion2.botonIrAlUltimo1_action}"
                                                        binding="#{FiltroFuncion2.botonIrAlUltimo2}" disabled="#{FiltroFuncion2.gestor.loteSinFilas}"
                                                        id="botonIrAlUltimo2" imageURL="#{FiltroFuncion2.gestor.urlImagenIrAlUltimo}"
                                                        onClick="#{FiltroFuncion2.gestor.scriptIrAlUltimo}" text="&gt;|" toolTip="Ir al último"/>
                                                </h:panelGrid>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel35}" id="gridPanel35" styleClass="pdq-grid-detalle-mensajes">
                                                <webuijsf:staticText binding="#{FiltroFuncion2.textoMensajeCambiosPorConfirmar1}"
                                                    id="textoMensajeCambiosPorConfirmar1" style="font-weight: bold" text="#{FiltroFuncion2.gestor.mensajeCambiosPorConfirmar}"/>
                                            </h:panelGrid>
</h:panelGrid><!--gridPanel205-->
</h:panelGrid><!--gridPanel204-->
</h:panelGrid><!--gridPanel2-->
                                        <h:panelGrid binding="#{FiltroFuncion2.gridPanel28}" id="gridPanel28">
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel17}" id="gridPanel17">
                                                <webuijsf:anchor binding="#{FiltroFuncion2.anchor1}" id="anchor1"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel29}" columns="10" id="gridPanel29">
                                                <webuijsf:button actionExpression="#{FiltroFuncion2.botonAgregar1_action}"
                                                    binding="#{FiltroFuncion2.botonAgregar1}" disabled="#{FiltroFuncion2.gestor.funcionInsertInhabilitada}"
                                                    id="botonAgregar1" onClick="#{FiltroFuncion2.gestor.scriptAgregar}"
                                                    rendered="#{FiltroFuncion2.gestor.funcionInsertHabilitada}" styleClass="pdq-button-1" text="Agregar" toolTip="#{FiltroFuncion2.botonAgregar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncion2.botonEditar1_action}"
                                                    binding="#{FiltroFuncion2.botonEditar1}" disabled="#{FiltroFuncion2.gestor.funcionUpdateInhabilitada}"
                                                    id="botonEditar1" onClick="#{FiltroFuncion2.gestor.scriptEditar}"
                                                    rendered="#{FiltroFuncion2.gestor.funcionUpdateHabilitada}" styleClass="pdq-button-1"
                                                    text="#{FiltroFuncion2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}" toolTip="#{FiltroFuncion2.gestor.etiquetaOpcionSeleccionadaListaFuncionEdicion}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncion2.botonEliminar1_action}"
                                                    binding="#{FiltroFuncion2.botonEliminar1}" disabled="#{FiltroFuncion2.gestor.funcionDeleteInhabilitada}"
                                                    id="botonEliminar1" onClick="#{FiltroFuncion2.gestor.scriptEliminar}"
                                                    rendered="#{FiltroFuncion2.gestor.funcionDeleteHabilitada}" styleClass="pdq-button-1" text="Eliminar" toolTip="#{FiltroFuncion2.botonEliminar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncion2.botonAplicar1_action}"
                                                    binding="#{FiltroFuncion2.botonAplicar1}" id="botonAplicar1"
                                                    onClick="#{FiltroFuncion2.gestor.scriptAplicar}"
                                                    rendered="#{FiltroFuncion2.gestor.funcionCheckChangesHabilitada}" styleClass="pdq-button-1" text="Aplicar" toolTip="#{FiltroFuncion2.botonAplicar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncion2.botonDeshacer1_action}"
                                                    binding="#{FiltroFuncion2.botonDeshacer1}" id="botonDeshacer1"
                                                    onClick="#{FiltroFuncion2.gestor.scriptDeshacer}"
                                                    rendered="#{FiltroFuncion2.gestor.funcionCancelUpdateHabilitada}" styleClass="pdq-button-1" text="Deshacer" toolTip="#{FiltroFuncion2.botonDeshacer1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncion2.botonConfirmar1_action}"
                                                    binding="#{FiltroFuncion2.botonConfirmar1}" id="botonConfirmar1"
                                                    onClick="#{FiltroFuncion2.gestor.scriptConfirmar}"
                                                    rendered="#{FiltroFuncion2.gestor.funcionCommitHabilitada}" styleClass="pdq-button-1" text="Confirmar" toolTip="#{FiltroFuncion2.botonAgregar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncion2.botonDescartar1_action}"
                                                    binding="#{FiltroFuncion2.botonDescartar1}" id="botonDescartar1"
                                                    onClick="#{FiltroFuncion2.gestor.scriptDescartar}"
                                                    rendered="#{FiltroFuncion2.gestor.funcionRevertHabilitada}" styleClass="pdq-button-1" text="Descartar" toolTip="#{FiltroFuncion2.botonDescartar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncion2.botonRefrescar1_action}"
                                                    binding="#{FiltroFuncion2.botonRefrescar1}" disabled="#{FiltroFuncion2.gestor.funcionSelectInhabilitada}"
                                                    id="botonRefrescar1" onClick="#{FiltroFuncion2.gestor.scriptRefrescar}"
                                                    rendered="#{FiltroFuncion2.gestor.funcionSelectHabilitada}" styleClass="pdq-button-1" text="Refrescar" toolTip="#{FiltroFuncion2.botonRefrescar1.text}"/>
                                                <webuijsf:button actionExpression="#{FiltroFuncion2.botonRetornar1_action}"
                                                    binding="#{FiltroFuncion2.botonRetornar1}"
                                                    disabled="#{FiltroFuncion2.gestor.funcionReturnFilaEscogidaInhabilitada}" id="botonRetornar1"
                                                    onClick="#{FiltroFuncion2.gestor.scriptRetornarRecursoEscogido}"
                                                    rendered="#{FiltroFuncion2.gestor.funcionReturnVisible}" styleClass="pdq-button-1" text="Retornar" toolTip="#{FiltroFuncion2.botonRetornar1.text}"/>
                                            </h:panelGrid>
                                            <h:panelGrid binding="#{FiltroFuncion2.gridPanel30}" columns="10" id="gridPanel30">
                                                <webuijsf:imageHyperlink actionExpression="#{FiltroFuncion2.imageHyperlink1_action}"
                                                    binding="#{FiltroFuncion2.imageHyperlink1}" disabled="#{FiltroFuncion2.gestor.funcionOpenLinkInhabilitada}"
                                                    id="imageHyperlink1" imageURL="#{FiltroFuncion2.gestor.urlImagenAbrirVinculo}"
                                                    onClick="#{FiltroFuncion2.gestor.scriptAbrirVinculo}" styleClass="pdq-hyperlink-1" text="Criterios" toolTip="Criterios por filtro"/>
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
                        <webuijsf:anchor binding="#{FiltroFuncion2.anclaPie1}" id="anclaPie1"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
