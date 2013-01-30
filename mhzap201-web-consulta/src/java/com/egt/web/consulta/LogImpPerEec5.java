/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
 * En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
 * programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
 * no podra ser considerada como violacion del copyright.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.consulta;

import com.egt.data.specific.xdp2.LogImpPerEecCachedRowSetDataProvider2;
import com.egt.base.constants.CBM2;
import com.egt.base.constants.URX2;
import com.egt.base.util.BundleWebui;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.GestorBusquedaReferencia;
import com.egt.core.aplicacion.web.GestorPaginaActualizacion;
import com.egt.core.aplicacion.web.GestorPaginaActualizacionConArbol;
import com.egt.core.aplicacion.web.GestorPaginaActualizacionConTabla;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.egt.core.aplicacion.web.PaginaActualizacionConAccionMultiple;
import com.egt.core.aplicacion.web.PaginaActualizacionConEdicionMultiple;
import com.egt.core.aplicacion.web.PaginaConsultaConArbol;
import com.egt.core.aplicacion.web.PaginaConsultaConFiltro;
import com.egt.core.aplicacion.web.PaginaConsultaConMaestro;
import com.egt.core.aplicacion.web.PaginaConsultaConTabla;
import com.egt.core.aplicacion.web.RowProcessor;
import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.enums.EnumColumnaEtiqueta;
import com.egt.core.enums.EnumOpcionZumNodo;
import com.egt.core.jsf.JSF;
import com.egt.core.util.STP;
import com.egt.core.util.Utils;
import com.sun.rave.faces.converter.SqlTimestampConverter;
import com.sun.data.provider.RowKey;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.sun.webui.jsf.component.Anchor;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Breadcrumbs;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.Checkbox;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.HelpInline;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.ImageComponent;
import com.sun.webui.jsf.component.ImageHyperlink;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.Link;
import com.sun.webui.jsf.component.Message;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.Script;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.Table;
import com.sun.webui.jsf.component.TableColumn;
import com.sun.webui.jsf.component.TableRowGroup;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.component.Tree;
import com.sun.webui.jsf.component.Upload;
import com.sun.webui.jsf.model.Option;
import java.io.File;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.application.NavigationHandler;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;
import javax.faces.convert.IntegerConverter;
import javax.faces.convert.LongConverter;
import javax.faces.convert.NumberConverter;
import javax.faces.event.ValueChangeEvent;
import javax.faces.validator.DoubleRangeValidator;
import javax.faces.validator.LengthValidator;
import javax.faces.validator.LongRangeValidator;
import javax.faces.validator.ValidatorException;

public class LogImpPerEec5 extends AbstractPageBean
        implements PaginaActualizacionLogImpPerEec, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdLogImpPerEec1.setMinimum(0L);
        validatorIdLogImpPerEec1.setMaximum(1000000000000000000L);
        validatorDptod1.setMaximum(8160);
        validatorDistritod1.setMaximum(8160);
        validatorDistripg1.setMaximum(8160);
        validatorArea1.setMaximum(8160);
        validatorBarrio1.setMaximum(8160);
        validatorManzana1.setMaximum(8160);
        validatorFormulario1.setMaximum(8160);
        validatorVivi1.setMaximum(8160);
        validatorHogar1.setMaximum(8160);
        validatorOrden1.setMaximum(8160);
        validatorP301.setMaximum(8160);
        validatorP311.setMaximum(8160);
        validatorP321.setMaximum(8160);
        validatorP331.setMaximum(8160);
        validatorP341.setMaximum(8160);
        validatorP351.setMaximum(8160);
        validatorP36OrdenConyugue1.setMaximum(8160);
        validatorP36OrdenPadre1.setMaximum(8160);
        validatorP36OrdenMadre1.setMaximum(8160);
        validatorP371.setMaximum(8160);
        validatorP37Cedula1.setMaximum(8160);
        validatorP38Dia1.setMaximum(8160);
        validatorP38Mes1.setMaximum(8160);
        validatorP38Ano1.setMaximum(8160);
        validatorP39pais1.setMaximum(8160);
        validatorP39dpto1.setMaximum(8160);
        validatorP39dist1.setMaximum(8160);
        validatorP39area1.setMaximum(8160);
        validatorP40Idioma1.setMaximum(8160);
        validatorP40otr1.setMaximum(8160);
        validatorP411.setMaximum(8160);
        validatorP421.setMaximum(8160);
        validatorP431.setMaximum(8160);
        validatorP4445t1.setMaximum(8160);
        validatorP441.setMaximum(8160);
        validatorP451.setMaximum(8160);
        validatorP461.setMaximum(8160);
        validatorP471.setMaximum(8160);
        validatorP481.setMaximum(8160);
        validatorP491.setMaximum(8160);
        validatorP49Otr1.setMaximum(8160);
        validatorP501.setMaximum(8160);
        validatorP50Otr1.setMaximum(8160);
        validatorP511.setMaximum(8160);
        validatorP521.setMaximum(8160);
        validatorP52Otr1.setMaximum(8160);
        validatorP531.setMaximum(8160);
        validatorP541.setMaximum(8160);
        validatorP54a1.setMaximum(8160);
        validatorP54Otr1.setMaximum(8160);
        validatorP551.setMaximum(8160);
        validatorP55Otr1.setMaximum(8160);
        validatorP561.setMaximum(8160);
        validatorP571.setMaximum(8160);
        validatorP581.setMaximum(8160);
        validatorP591.setMaximum(8160);
        validatorP601.setMaximum(8160);
        validatorP611.setMaximum(8160);
        validatorP621.setMaximum(8160);
        validatorP631.setMaximum(8160);
        validatorP63Especificar1.setMaximum(8160);
        validatorP64des1.setMaximum(8160);
        validatorP64c1.setMaximum(8160);
        validatorP65des1.setMaximum(8160);
        validatorP65c1.setMaximum(8160);
        validatorP661.setMaximum(8160);
        validatorP67a1.setMaximum(8160);
        validatorP67b1.setMaximum(8160);
        validatorP67c1.setMaximum(8160);
        validatorP67d1.setMaximum(8160);
        validatorP67e1.setMaximum(8160);
        validatorP67f1.setMaximum(8160);
        validatorP67g1.setMaximum(8160);
        validatorP67h1.setMaximum(8160);
        validatorP67i1.setMaximum(8160);
        validatorP67j1.setMaximum(8160);
        validatorP67k1.setMaximum(8160);
        validatorP67l1.setMaximum(8160);
        validatorP67tot1.setMaximum(8160);
        validatorObservacion1.setMaximum(8160);
        converterFechaHoraTransaccion1.setPattern("dd/MM/yyyy hh:mm aa");
        converterFechaHoraTransaccion1.setType("both");
        validatorNombreArchivo1.setMaximum(8160);
        validatorCodigoArchivo1.setMaximum(8160);
        logImpPerEecDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.logImpPerEecRowSet}"));
    }

    private Form form1 = new Form();

    @Override
    public Form getForm1() {
        return form1;
    }

    public void setForm1(Form component) {
        this.form1 = component;
    }

    private Breadcrumbs breadcrumbs1 = new Breadcrumbs();

    @Override
    public Breadcrumbs getBreadcrumbs1() {
        return breadcrumbs1;
    }

    public void setBreadcrumbs1(Breadcrumbs component) {
        this.breadcrumbs1 = component;
    }

    private Table table1 = new Table();
  
    @Override
    public Table getTable1() {
        return table1;
    }
  
    public void setTable1(Table t) {
        this.table1 = t;
    }
  
    private TableRowGroup tableRowGroup1 = new com.egt.core.jsf.component.GrupoFilasTabla();

    @Override
    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    @Override
    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }

    private Checkbox checkbox1 = new Checkbox();
  
    @Override
    public Checkbox getCheckbox1() {
        return checkbox1;
    }
  
    public void setCheckbox1(Checkbox c) {
        this.checkbox1 = c;
    }
  
    private TableColumn tableColumn1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumn1() {
        return tableColumn1;
    }

    public void setTableColumn1(TableColumn tc) {
        this.tableColumn1 = tc;
    }

    private Button botonEscogerFila1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonEscogerFila1() {
        return botonEscogerFila1;
    }

    public void setBotonEscogerFila1(Button b) {
        this.botonEscogerFila1 = b;
    }

    private Button botonDetallarFila1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonDetallarFila1() {
        return botonDetallarFila1;
    }

    public void setBotonDetallarFila1(Button b) {
        this.botonDetallarFila1 = b;
    }

    private Button botonProcesarFila1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonProcesarFila1() {
        return botonProcesarFila1;
    }

    public void setBotonProcesarFila1(Button b) {
        this.botonProcesarFila1 = b;
    }

    private Button botonRetornarFila1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonRetornarFila1() {
        return botonRetornarFila1;
    }

    public void setBotonRetornarFila1(Button b) {
        this.botonRetornarFila1 = b;
    }

    private TableColumn tableColumn2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumn2() {
        return tableColumn2;
    }

    public void setTableColumn2(TableColumn tc) {
        this.tableColumn2 = tc;
    }

    private ImageHyperlink hipervinculoAccionFila1 = new com.egt.core.jsf.component.Hipervinculo();

    public ImageHyperlink getHipervinculoAccionFila1() {
        return hipervinculoAccionFila1;
    }

    public void setHipervinculoAccionFila1(ImageHyperlink ih) {
        this.hipervinculoAccionFila1 = ih;
    }

    private TableColumn tableColumn3 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumn3() {
        return tableColumn3;
    }

    public void setTableColumn3(TableColumn tc) {
        this.tableColumn3 = tc;
    }

    private ImageHyperlink hipervinculoDetallarFila1 = new com.egt.core.jsf.component.Hipervinculo();

    public ImageHyperlink getHipervinculoDetallarFila1() {
        return hipervinculoDetallarFila1;
    }

    public void setHipervinculoDetallarFila1(ImageHyperlink ih) {
        this.hipervinculoDetallarFila1 = ih;
    }

    private TableColumn tableColumnIdLogImpPerEec1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdLogImpPerEec1() {
        return tableColumnIdLogImpPerEec1;
    }

    public void setTableColumnIdLogImpPerEec1(TableColumn component) {
        this.tableColumnIdLogImpPerEec1 = component;
    }

    private Label labelIdLogImpPerEec1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdLogImpPerEec1() {
        return labelIdLogImpPerEec1;
    }

    public void setLabelIdLogImpPerEec1(Label l) {
        this.labelIdLogImpPerEec1 = l;
    }

    private TextField campoIdLogImpPerEec1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdLogImpPerEec1() {
        return campoIdLogImpPerEec1;
    }

    public void setCampoIdLogImpPerEec1(TextField component) {
        this.campoIdLogImpPerEec1 = component;
    }

    private StaticText campoIdLogImpPerEec1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdLogImpPerEec1Texto1() {
        return campoIdLogImpPerEec1Texto1;
    }

    public void setCampoIdLogImpPerEec1Texto1(StaticText component) {
        this.campoIdLogImpPerEec1Texto1 = component;
    }

    private LongConverter converterIdLogImpPerEec1 = new LongConverter();
  
    public LongConverter getConverterIdLogImpPerEec1() {
        return converterIdLogImpPerEec1;
    }
  
    public void setConverterIdLogImpPerEec1(LongConverter converter) {
        this.converterIdLogImpPerEec1 = converter;
    }
  
    private LongRangeValidator validatorIdLogImpPerEec1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdLogImpPerEec1() {
        return validatorIdLogImpPerEec1;
    }
  
    public void setValidatorIdLogImpPerEec1(LongRangeValidator validator) {
        this.validatorIdLogImpPerEec1 = validator;
    }
  
    private TableColumn tableColumnDptod1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnDptod1() {
        return tableColumnDptod1;
    }

    public void setTableColumnDptod1(TableColumn component) {
        this.tableColumnDptod1 = component;
    }

    private Label labelDptod1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDptod1() {
        return labelDptod1;
    }

    public void setLabelDptod1(Label l) {
        this.labelDptod1 = l;
    }

    private TextArea campoDptod1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDptod1() {
        return campoDptod1;
    }

    public void setCampoDptod1(TextArea component) {
        this.campoDptod1 = component;
    }

    private StaticText campoDptod1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDptod1Texto1() {
        return campoDptod1Texto1;
    }

    public void setCampoDptod1Texto1(StaticText component) {
        this.campoDptod1Texto1 = component;
    }

    private LengthValidator validatorDptod1 = new LengthValidator();
  
    public LengthValidator getValidatorDptod1() {
        return validatorDptod1;
    }
  
    public void setValidatorDptod1(LengthValidator validator) {
        this.validatorDptod1 = validator;
    }
  
    private TableColumn tableColumnDistritod1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnDistritod1() {
        return tableColumnDistritod1;
    }

    public void setTableColumnDistritod1(TableColumn component) {
        this.tableColumnDistritod1 = component;
    }

    private Label labelDistritod1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDistritod1() {
        return labelDistritod1;
    }

    public void setLabelDistritod1(Label l) {
        this.labelDistritod1 = l;
    }

    private TextArea campoDistritod1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDistritod1() {
        return campoDistritod1;
    }

    public void setCampoDistritod1(TextArea component) {
        this.campoDistritod1 = component;
    }

    private StaticText campoDistritod1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDistritod1Texto1() {
        return campoDistritod1Texto1;
    }

    public void setCampoDistritod1Texto1(StaticText component) {
        this.campoDistritod1Texto1 = component;
    }

    private LengthValidator validatorDistritod1 = new LengthValidator();
  
    public LengthValidator getValidatorDistritod1() {
        return validatorDistritod1;
    }
  
    public void setValidatorDistritod1(LengthValidator validator) {
        this.validatorDistritod1 = validator;
    }
  
    private TableColumn tableColumnDistripg1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnDistripg1() {
        return tableColumnDistripg1;
    }

    public void setTableColumnDistripg1(TableColumn component) {
        this.tableColumnDistripg1 = component;
    }

    private Label labelDistripg1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDistripg1() {
        return labelDistripg1;
    }

    public void setLabelDistripg1(Label l) {
        this.labelDistripg1 = l;
    }

    private TextArea campoDistripg1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDistripg1() {
        return campoDistripg1;
    }

    public void setCampoDistripg1(TextArea component) {
        this.campoDistripg1 = component;
    }

    private StaticText campoDistripg1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDistripg1Texto1() {
        return campoDistripg1Texto1;
    }

    public void setCampoDistripg1Texto1(StaticText component) {
        this.campoDistripg1Texto1 = component;
    }

    private LengthValidator validatorDistripg1 = new LengthValidator();
  
    public LengthValidator getValidatorDistripg1() {
        return validatorDistripg1;
    }
  
    public void setValidatorDistripg1(LengthValidator validator) {
        this.validatorDistripg1 = validator;
    }
  
    private TableColumn tableColumnArea1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnArea1() {
        return tableColumnArea1;
    }

    public void setTableColumnArea1(TableColumn component) {
        this.tableColumnArea1 = component;
    }

    private Label labelArea1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelArea1() {
        return labelArea1;
    }

    public void setLabelArea1(Label l) {
        this.labelArea1 = l;
    }

    private TextArea campoArea1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoArea1() {
        return campoArea1;
    }

    public void setCampoArea1(TextArea component) {
        this.campoArea1 = component;
    }

    private StaticText campoArea1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoArea1Texto1() {
        return campoArea1Texto1;
    }

    public void setCampoArea1Texto1(StaticText component) {
        this.campoArea1Texto1 = component;
    }

    private LengthValidator validatorArea1 = new LengthValidator();
  
    public LengthValidator getValidatorArea1() {
        return validatorArea1;
    }
  
    public void setValidatorArea1(LengthValidator validator) {
        this.validatorArea1 = validator;
    }
  
    private TableColumn tableColumnBarrio1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnBarrio1() {
        return tableColumnBarrio1;
    }

    public void setTableColumnBarrio1(TableColumn component) {
        this.tableColumnBarrio1 = component;
    }

    private Label labelBarrio1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelBarrio1() {
        return labelBarrio1;
    }

    public void setLabelBarrio1(Label l) {
        this.labelBarrio1 = l;
    }

    private TextArea campoBarrio1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoBarrio1() {
        return campoBarrio1;
    }

    public void setCampoBarrio1(TextArea component) {
        this.campoBarrio1 = component;
    }

    private StaticText campoBarrio1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoBarrio1Texto1() {
        return campoBarrio1Texto1;
    }

    public void setCampoBarrio1Texto1(StaticText component) {
        this.campoBarrio1Texto1 = component;
    }

    private LengthValidator validatorBarrio1 = new LengthValidator();
  
    public LengthValidator getValidatorBarrio1() {
        return validatorBarrio1;
    }
  
    public void setValidatorBarrio1(LengthValidator validator) {
        this.validatorBarrio1 = validator;
    }
  
    private TableColumn tableColumnManzana1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnManzana1() {
        return tableColumnManzana1;
    }

    public void setTableColumnManzana1(TableColumn component) {
        this.tableColumnManzana1 = component;
    }

    private Label labelManzana1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelManzana1() {
        return labelManzana1;
    }

    public void setLabelManzana1(Label l) {
        this.labelManzana1 = l;
    }

    private TextArea campoManzana1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoManzana1() {
        return campoManzana1;
    }

    public void setCampoManzana1(TextArea component) {
        this.campoManzana1 = component;
    }

    private StaticText campoManzana1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoManzana1Texto1() {
        return campoManzana1Texto1;
    }

    public void setCampoManzana1Texto1(StaticText component) {
        this.campoManzana1Texto1 = component;
    }

    private LengthValidator validatorManzana1 = new LengthValidator();
  
    public LengthValidator getValidatorManzana1() {
        return validatorManzana1;
    }
  
    public void setValidatorManzana1(LengthValidator validator) {
        this.validatorManzana1 = validator;
    }
  
    private TableColumn tableColumnFormulario1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFormulario1() {
        return tableColumnFormulario1;
    }

    public void setTableColumnFormulario1(TableColumn component) {
        this.tableColumnFormulario1 = component;
    }

    private Label labelFormulario1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFormulario1() {
        return labelFormulario1;
    }

    public void setLabelFormulario1(Label l) {
        this.labelFormulario1 = l;
    }

    private TextArea campoFormulario1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoFormulario1() {
        return campoFormulario1;
    }

    public void setCampoFormulario1(TextArea component) {
        this.campoFormulario1 = component;
    }

    private StaticText campoFormulario1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFormulario1Texto1() {
        return campoFormulario1Texto1;
    }

    public void setCampoFormulario1Texto1(StaticText component) {
        this.campoFormulario1Texto1 = component;
    }

    private LengthValidator validatorFormulario1 = new LengthValidator();
  
    public LengthValidator getValidatorFormulario1() {
        return validatorFormulario1;
    }
  
    public void setValidatorFormulario1(LengthValidator validator) {
        this.validatorFormulario1 = validator;
    }
  
    private TableColumn tableColumnVivi1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVivi1() {
        return tableColumnVivi1;
    }

    public void setTableColumnVivi1(TableColumn component) {
        this.tableColumnVivi1 = component;
    }

    private Label labelVivi1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVivi1() {
        return labelVivi1;
    }

    public void setLabelVivi1(Label l) {
        this.labelVivi1 = l;
    }

    private TextArea campoVivi1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVivi1() {
        return campoVivi1;
    }

    public void setCampoVivi1(TextArea component) {
        this.campoVivi1 = component;
    }

    private StaticText campoVivi1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVivi1Texto1() {
        return campoVivi1Texto1;
    }

    public void setCampoVivi1Texto1(StaticText component) {
        this.campoVivi1Texto1 = component;
    }

    private LengthValidator validatorVivi1 = new LengthValidator();
  
    public LengthValidator getValidatorVivi1() {
        return validatorVivi1;
    }
  
    public void setValidatorVivi1(LengthValidator validator) {
        this.validatorVivi1 = validator;
    }
  
    private TableColumn tableColumnHogar1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnHogar1() {
        return tableColumnHogar1;
    }

    public void setTableColumnHogar1(TableColumn component) {
        this.tableColumnHogar1 = component;
    }

    private Label labelHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelHogar1() {
        return labelHogar1;
    }

    public void setLabelHogar1(Label l) {
        this.labelHogar1 = l;
    }

    private TextArea campoHogar1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoHogar1() {
        return campoHogar1;
    }

    public void setCampoHogar1(TextArea component) {
        this.campoHogar1 = component;
    }

    private StaticText campoHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoHogar1Texto1() {
        return campoHogar1Texto1;
    }

    public void setCampoHogar1Texto1(StaticText component) {
        this.campoHogar1Texto1 = component;
    }

    private LengthValidator validatorHogar1 = new LengthValidator();
  
    public LengthValidator getValidatorHogar1() {
        return validatorHogar1;
    }
  
    public void setValidatorHogar1(LengthValidator validator) {
        this.validatorHogar1 = validator;
    }
  
    private TableColumn tableColumnOrden1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnOrden1() {
        return tableColumnOrden1;
    }

    public void setTableColumnOrden1(TableColumn component) {
        this.tableColumnOrden1 = component;
    }

    private Label labelOrden1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOrden1() {
        return labelOrden1;
    }

    public void setLabelOrden1(Label l) {
        this.labelOrden1 = l;
    }

    private TextArea campoOrden1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoOrden1() {
        return campoOrden1;
    }

    public void setCampoOrden1(TextArea component) {
        this.campoOrden1 = component;
    }

    private StaticText campoOrden1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOrden1Texto1() {
        return campoOrden1Texto1;
    }

    public void setCampoOrden1Texto1(StaticText component) {
        this.campoOrden1Texto1 = component;
    }

    private LengthValidator validatorOrden1 = new LengthValidator();
  
    public LengthValidator getValidatorOrden1() {
        return validatorOrden1;
    }
  
    public void setValidatorOrden1(LengthValidator validator) {
        this.validatorOrden1 = validator;
    }
  
    private TableColumn tableColumnP301 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP301() {
        return tableColumnP301;
    }

    public void setTableColumnP301(TableColumn component) {
        this.tableColumnP301 = component;
    }

    private Label labelP301 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP301() {
        return labelP301;
    }

    public void setLabelP301(Label l) {
        this.labelP301 = l;
    }

    private TextArea campoP301 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP301() {
        return campoP301;
    }

    public void setCampoP301(TextArea component) {
        this.campoP301 = component;
    }

    private StaticText campoP301Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP301Texto1() {
        return campoP301Texto1;
    }

    public void setCampoP301Texto1(StaticText component) {
        this.campoP301Texto1 = component;
    }

    private LengthValidator validatorP301 = new LengthValidator();
  
    public LengthValidator getValidatorP301() {
        return validatorP301;
    }
  
    public void setValidatorP301(LengthValidator validator) {
        this.validatorP301 = validator;
    }
  
    private TableColumn tableColumnP311 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP311() {
        return tableColumnP311;
    }

    public void setTableColumnP311(TableColumn component) {
        this.tableColumnP311 = component;
    }

    private Label labelP311 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP311() {
        return labelP311;
    }

    public void setLabelP311(Label l) {
        this.labelP311 = l;
    }

    private TextArea campoP311 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP311() {
        return campoP311;
    }

    public void setCampoP311(TextArea component) {
        this.campoP311 = component;
    }

    private StaticText campoP311Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP311Texto1() {
        return campoP311Texto1;
    }

    public void setCampoP311Texto1(StaticText component) {
        this.campoP311Texto1 = component;
    }

    private LengthValidator validatorP311 = new LengthValidator();
  
    public LengthValidator getValidatorP311() {
        return validatorP311;
    }
  
    public void setValidatorP311(LengthValidator validator) {
        this.validatorP311 = validator;
    }
  
    private TableColumn tableColumnP321 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP321() {
        return tableColumnP321;
    }

    public void setTableColumnP321(TableColumn component) {
        this.tableColumnP321 = component;
    }

    private Label labelP321 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP321() {
        return labelP321;
    }

    public void setLabelP321(Label l) {
        this.labelP321 = l;
    }

    private TextArea campoP321 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP321() {
        return campoP321;
    }

    public void setCampoP321(TextArea component) {
        this.campoP321 = component;
    }

    private StaticText campoP321Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP321Texto1() {
        return campoP321Texto1;
    }

    public void setCampoP321Texto1(StaticText component) {
        this.campoP321Texto1 = component;
    }

    private LengthValidator validatorP321 = new LengthValidator();
  
    public LengthValidator getValidatorP321() {
        return validatorP321;
    }
  
    public void setValidatorP321(LengthValidator validator) {
        this.validatorP321 = validator;
    }
  
    private TableColumn tableColumnP331 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP331() {
        return tableColumnP331;
    }

    public void setTableColumnP331(TableColumn component) {
        this.tableColumnP331 = component;
    }

    private Label labelP331 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP331() {
        return labelP331;
    }

    public void setLabelP331(Label l) {
        this.labelP331 = l;
    }

    private TextArea campoP331 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP331() {
        return campoP331;
    }

    public void setCampoP331(TextArea component) {
        this.campoP331 = component;
    }

    private StaticText campoP331Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP331Texto1() {
        return campoP331Texto1;
    }

    public void setCampoP331Texto1(StaticText component) {
        this.campoP331Texto1 = component;
    }

    private LengthValidator validatorP331 = new LengthValidator();
  
    public LengthValidator getValidatorP331() {
        return validatorP331;
    }
  
    public void setValidatorP331(LengthValidator validator) {
        this.validatorP331 = validator;
    }
  
    private TableColumn tableColumnP341 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP341() {
        return tableColumnP341;
    }

    public void setTableColumnP341(TableColumn component) {
        this.tableColumnP341 = component;
    }

    private Label labelP341 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP341() {
        return labelP341;
    }

    public void setLabelP341(Label l) {
        this.labelP341 = l;
    }

    private TextArea campoP341 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP341() {
        return campoP341;
    }

    public void setCampoP341(TextArea component) {
        this.campoP341 = component;
    }

    private StaticText campoP341Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP341Texto1() {
        return campoP341Texto1;
    }

    public void setCampoP341Texto1(StaticText component) {
        this.campoP341Texto1 = component;
    }

    private LengthValidator validatorP341 = new LengthValidator();
  
    public LengthValidator getValidatorP341() {
        return validatorP341;
    }
  
    public void setValidatorP341(LengthValidator validator) {
        this.validatorP341 = validator;
    }
  
    private TableColumn tableColumnP351 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP351() {
        return tableColumnP351;
    }

    public void setTableColumnP351(TableColumn component) {
        this.tableColumnP351 = component;
    }

    private Label labelP351 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP351() {
        return labelP351;
    }

    public void setLabelP351(Label l) {
        this.labelP351 = l;
    }

    private TextArea campoP351 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP351() {
        return campoP351;
    }

    public void setCampoP351(TextArea component) {
        this.campoP351 = component;
    }

    private StaticText campoP351Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP351Texto1() {
        return campoP351Texto1;
    }

    public void setCampoP351Texto1(StaticText component) {
        this.campoP351Texto1 = component;
    }

    private LengthValidator validatorP351 = new LengthValidator();
  
    public LengthValidator getValidatorP351() {
        return validatorP351;
    }
  
    public void setValidatorP351(LengthValidator validator) {
        this.validatorP351 = validator;
    }
  
    private TableColumn tableColumnP36OrdenConyugue1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP36OrdenConyugue1() {
        return tableColumnP36OrdenConyugue1;
    }

    public void setTableColumnP36OrdenConyugue1(TableColumn component) {
        this.tableColumnP36OrdenConyugue1 = component;
    }

    private Label labelP36OrdenConyugue1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP36OrdenConyugue1() {
        return labelP36OrdenConyugue1;
    }

    public void setLabelP36OrdenConyugue1(Label l) {
        this.labelP36OrdenConyugue1 = l;
    }

    private TextArea campoP36OrdenConyugue1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP36OrdenConyugue1() {
        return campoP36OrdenConyugue1;
    }

    public void setCampoP36OrdenConyugue1(TextArea component) {
        this.campoP36OrdenConyugue1 = component;
    }

    private StaticText campoP36OrdenConyugue1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP36OrdenConyugue1Texto1() {
        return campoP36OrdenConyugue1Texto1;
    }

    public void setCampoP36OrdenConyugue1Texto1(StaticText component) {
        this.campoP36OrdenConyugue1Texto1 = component;
    }

    private LengthValidator validatorP36OrdenConyugue1 = new LengthValidator();
  
    public LengthValidator getValidatorP36OrdenConyugue1() {
        return validatorP36OrdenConyugue1;
    }
  
    public void setValidatorP36OrdenConyugue1(LengthValidator validator) {
        this.validatorP36OrdenConyugue1 = validator;
    }
  
    private TableColumn tableColumnP36OrdenPadre1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP36OrdenPadre1() {
        return tableColumnP36OrdenPadre1;
    }

    public void setTableColumnP36OrdenPadre1(TableColumn component) {
        this.tableColumnP36OrdenPadre1 = component;
    }

    private Label labelP36OrdenPadre1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP36OrdenPadre1() {
        return labelP36OrdenPadre1;
    }

    public void setLabelP36OrdenPadre1(Label l) {
        this.labelP36OrdenPadre1 = l;
    }

    private TextArea campoP36OrdenPadre1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP36OrdenPadre1() {
        return campoP36OrdenPadre1;
    }

    public void setCampoP36OrdenPadre1(TextArea component) {
        this.campoP36OrdenPadre1 = component;
    }

    private StaticText campoP36OrdenPadre1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP36OrdenPadre1Texto1() {
        return campoP36OrdenPadre1Texto1;
    }

    public void setCampoP36OrdenPadre1Texto1(StaticText component) {
        this.campoP36OrdenPadre1Texto1 = component;
    }

    private LengthValidator validatorP36OrdenPadre1 = new LengthValidator();
  
    public LengthValidator getValidatorP36OrdenPadre1() {
        return validatorP36OrdenPadre1;
    }
  
    public void setValidatorP36OrdenPadre1(LengthValidator validator) {
        this.validatorP36OrdenPadre1 = validator;
    }
  
    private TableColumn tableColumnP36OrdenMadre1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP36OrdenMadre1() {
        return tableColumnP36OrdenMadre1;
    }

    public void setTableColumnP36OrdenMadre1(TableColumn component) {
        this.tableColumnP36OrdenMadre1 = component;
    }

    private Label labelP36OrdenMadre1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP36OrdenMadre1() {
        return labelP36OrdenMadre1;
    }

    public void setLabelP36OrdenMadre1(Label l) {
        this.labelP36OrdenMadre1 = l;
    }

    private TextArea campoP36OrdenMadre1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP36OrdenMadre1() {
        return campoP36OrdenMadre1;
    }

    public void setCampoP36OrdenMadre1(TextArea component) {
        this.campoP36OrdenMadre1 = component;
    }

    private StaticText campoP36OrdenMadre1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP36OrdenMadre1Texto1() {
        return campoP36OrdenMadre1Texto1;
    }

    public void setCampoP36OrdenMadre1Texto1(StaticText component) {
        this.campoP36OrdenMadre1Texto1 = component;
    }

    private LengthValidator validatorP36OrdenMadre1 = new LengthValidator();
  
    public LengthValidator getValidatorP36OrdenMadre1() {
        return validatorP36OrdenMadre1;
    }
  
    public void setValidatorP36OrdenMadre1(LengthValidator validator) {
        this.validatorP36OrdenMadre1 = validator;
    }
  
    private TableColumn tableColumnP371 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP371() {
        return tableColumnP371;
    }

    public void setTableColumnP371(TableColumn component) {
        this.tableColumnP371 = component;
    }

    private Label labelP371 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP371() {
        return labelP371;
    }

    public void setLabelP371(Label l) {
        this.labelP371 = l;
    }

    private TextArea campoP371 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP371() {
        return campoP371;
    }

    public void setCampoP371(TextArea component) {
        this.campoP371 = component;
    }

    private StaticText campoP371Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP371Texto1() {
        return campoP371Texto1;
    }

    public void setCampoP371Texto1(StaticText component) {
        this.campoP371Texto1 = component;
    }

    private LengthValidator validatorP371 = new LengthValidator();
  
    public LengthValidator getValidatorP371() {
        return validatorP371;
    }
  
    public void setValidatorP371(LengthValidator validator) {
        this.validatorP371 = validator;
    }
  
    private TableColumn tableColumnP37Cedula1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP37Cedula1() {
        return tableColumnP37Cedula1;
    }

    public void setTableColumnP37Cedula1(TableColumn component) {
        this.tableColumnP37Cedula1 = component;
    }

    private Label labelP37Cedula1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP37Cedula1() {
        return labelP37Cedula1;
    }

    public void setLabelP37Cedula1(Label l) {
        this.labelP37Cedula1 = l;
    }

    private TextArea campoP37Cedula1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP37Cedula1() {
        return campoP37Cedula1;
    }

    public void setCampoP37Cedula1(TextArea component) {
        this.campoP37Cedula1 = component;
    }

    private StaticText campoP37Cedula1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP37Cedula1Texto1() {
        return campoP37Cedula1Texto1;
    }

    public void setCampoP37Cedula1Texto1(StaticText component) {
        this.campoP37Cedula1Texto1 = component;
    }

    private LengthValidator validatorP37Cedula1 = new LengthValidator();
  
    public LengthValidator getValidatorP37Cedula1() {
        return validatorP37Cedula1;
    }
  
    public void setValidatorP37Cedula1(LengthValidator validator) {
        this.validatorP37Cedula1 = validator;
    }
  
    private TableColumn tableColumnP38Dia1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP38Dia1() {
        return tableColumnP38Dia1;
    }

    public void setTableColumnP38Dia1(TableColumn component) {
        this.tableColumnP38Dia1 = component;
    }

    private Label labelP38Dia1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP38Dia1() {
        return labelP38Dia1;
    }

    public void setLabelP38Dia1(Label l) {
        this.labelP38Dia1 = l;
    }

    private TextArea campoP38Dia1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP38Dia1() {
        return campoP38Dia1;
    }

    public void setCampoP38Dia1(TextArea component) {
        this.campoP38Dia1 = component;
    }

    private StaticText campoP38Dia1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP38Dia1Texto1() {
        return campoP38Dia1Texto1;
    }

    public void setCampoP38Dia1Texto1(StaticText component) {
        this.campoP38Dia1Texto1 = component;
    }

    private LengthValidator validatorP38Dia1 = new LengthValidator();
  
    public LengthValidator getValidatorP38Dia1() {
        return validatorP38Dia1;
    }
  
    public void setValidatorP38Dia1(LengthValidator validator) {
        this.validatorP38Dia1 = validator;
    }
  
    private TableColumn tableColumnP38Mes1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP38Mes1() {
        return tableColumnP38Mes1;
    }

    public void setTableColumnP38Mes1(TableColumn component) {
        this.tableColumnP38Mes1 = component;
    }

    private Label labelP38Mes1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP38Mes1() {
        return labelP38Mes1;
    }

    public void setLabelP38Mes1(Label l) {
        this.labelP38Mes1 = l;
    }

    private TextArea campoP38Mes1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP38Mes1() {
        return campoP38Mes1;
    }

    public void setCampoP38Mes1(TextArea component) {
        this.campoP38Mes1 = component;
    }

    private StaticText campoP38Mes1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP38Mes1Texto1() {
        return campoP38Mes1Texto1;
    }

    public void setCampoP38Mes1Texto1(StaticText component) {
        this.campoP38Mes1Texto1 = component;
    }

    private LengthValidator validatorP38Mes1 = new LengthValidator();
  
    public LengthValidator getValidatorP38Mes1() {
        return validatorP38Mes1;
    }
  
    public void setValidatorP38Mes1(LengthValidator validator) {
        this.validatorP38Mes1 = validator;
    }
  
    private TableColumn tableColumnP38Ano1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP38Ano1() {
        return tableColumnP38Ano1;
    }

    public void setTableColumnP38Ano1(TableColumn component) {
        this.tableColumnP38Ano1 = component;
    }

    private Label labelP38Ano1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP38Ano1() {
        return labelP38Ano1;
    }

    public void setLabelP38Ano1(Label l) {
        this.labelP38Ano1 = l;
    }

    private TextArea campoP38Ano1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP38Ano1() {
        return campoP38Ano1;
    }

    public void setCampoP38Ano1(TextArea component) {
        this.campoP38Ano1 = component;
    }

    private StaticText campoP38Ano1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP38Ano1Texto1() {
        return campoP38Ano1Texto1;
    }

    public void setCampoP38Ano1Texto1(StaticText component) {
        this.campoP38Ano1Texto1 = component;
    }

    private LengthValidator validatorP38Ano1 = new LengthValidator();
  
    public LengthValidator getValidatorP38Ano1() {
        return validatorP38Ano1;
    }
  
    public void setValidatorP38Ano1(LengthValidator validator) {
        this.validatorP38Ano1 = validator;
    }
  
    private TableColumn tableColumnP39pais1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP39pais1() {
        return tableColumnP39pais1;
    }

    public void setTableColumnP39pais1(TableColumn component) {
        this.tableColumnP39pais1 = component;
    }

    private Label labelP39pais1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP39pais1() {
        return labelP39pais1;
    }

    public void setLabelP39pais1(Label l) {
        this.labelP39pais1 = l;
    }

    private TextArea campoP39pais1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP39pais1() {
        return campoP39pais1;
    }

    public void setCampoP39pais1(TextArea component) {
        this.campoP39pais1 = component;
    }

    private StaticText campoP39pais1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP39pais1Texto1() {
        return campoP39pais1Texto1;
    }

    public void setCampoP39pais1Texto1(StaticText component) {
        this.campoP39pais1Texto1 = component;
    }

    private LengthValidator validatorP39pais1 = new LengthValidator();
  
    public LengthValidator getValidatorP39pais1() {
        return validatorP39pais1;
    }
  
    public void setValidatorP39pais1(LengthValidator validator) {
        this.validatorP39pais1 = validator;
    }
  
    private TableColumn tableColumnP39dpto1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP39dpto1() {
        return tableColumnP39dpto1;
    }

    public void setTableColumnP39dpto1(TableColumn component) {
        this.tableColumnP39dpto1 = component;
    }

    private Label labelP39dpto1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP39dpto1() {
        return labelP39dpto1;
    }

    public void setLabelP39dpto1(Label l) {
        this.labelP39dpto1 = l;
    }

    private TextArea campoP39dpto1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP39dpto1() {
        return campoP39dpto1;
    }

    public void setCampoP39dpto1(TextArea component) {
        this.campoP39dpto1 = component;
    }

    private StaticText campoP39dpto1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP39dpto1Texto1() {
        return campoP39dpto1Texto1;
    }

    public void setCampoP39dpto1Texto1(StaticText component) {
        this.campoP39dpto1Texto1 = component;
    }

    private LengthValidator validatorP39dpto1 = new LengthValidator();
  
    public LengthValidator getValidatorP39dpto1() {
        return validatorP39dpto1;
    }
  
    public void setValidatorP39dpto1(LengthValidator validator) {
        this.validatorP39dpto1 = validator;
    }
  
    private TableColumn tableColumnP39dist1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP39dist1() {
        return tableColumnP39dist1;
    }

    public void setTableColumnP39dist1(TableColumn component) {
        this.tableColumnP39dist1 = component;
    }

    private Label labelP39dist1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP39dist1() {
        return labelP39dist1;
    }

    public void setLabelP39dist1(Label l) {
        this.labelP39dist1 = l;
    }

    private TextArea campoP39dist1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP39dist1() {
        return campoP39dist1;
    }

    public void setCampoP39dist1(TextArea component) {
        this.campoP39dist1 = component;
    }

    private StaticText campoP39dist1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP39dist1Texto1() {
        return campoP39dist1Texto1;
    }

    public void setCampoP39dist1Texto1(StaticText component) {
        this.campoP39dist1Texto1 = component;
    }

    private LengthValidator validatorP39dist1 = new LengthValidator();
  
    public LengthValidator getValidatorP39dist1() {
        return validatorP39dist1;
    }
  
    public void setValidatorP39dist1(LengthValidator validator) {
        this.validatorP39dist1 = validator;
    }
  
    private TableColumn tableColumnP39area1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP39area1() {
        return tableColumnP39area1;
    }

    public void setTableColumnP39area1(TableColumn component) {
        this.tableColumnP39area1 = component;
    }

    private Label labelP39area1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP39area1() {
        return labelP39area1;
    }

    public void setLabelP39area1(Label l) {
        this.labelP39area1 = l;
    }

    private TextArea campoP39area1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP39area1() {
        return campoP39area1;
    }

    public void setCampoP39area1(TextArea component) {
        this.campoP39area1 = component;
    }

    private StaticText campoP39area1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP39area1Texto1() {
        return campoP39area1Texto1;
    }

    public void setCampoP39area1Texto1(StaticText component) {
        this.campoP39area1Texto1 = component;
    }

    private LengthValidator validatorP39area1 = new LengthValidator();
  
    public LengthValidator getValidatorP39area1() {
        return validatorP39area1;
    }
  
    public void setValidatorP39area1(LengthValidator validator) {
        this.validatorP39area1 = validator;
    }
  
    private TableColumn tableColumnP40Idioma1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP40Idioma1() {
        return tableColumnP40Idioma1;
    }

    public void setTableColumnP40Idioma1(TableColumn component) {
        this.tableColumnP40Idioma1 = component;
    }

    private Label labelP40Idioma1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP40Idioma1() {
        return labelP40Idioma1;
    }

    public void setLabelP40Idioma1(Label l) {
        this.labelP40Idioma1 = l;
    }

    private TextArea campoP40Idioma1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP40Idioma1() {
        return campoP40Idioma1;
    }

    public void setCampoP40Idioma1(TextArea component) {
        this.campoP40Idioma1 = component;
    }

    private StaticText campoP40Idioma1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP40Idioma1Texto1() {
        return campoP40Idioma1Texto1;
    }

    public void setCampoP40Idioma1Texto1(StaticText component) {
        this.campoP40Idioma1Texto1 = component;
    }

    private LengthValidator validatorP40Idioma1 = new LengthValidator();
  
    public LengthValidator getValidatorP40Idioma1() {
        return validatorP40Idioma1;
    }
  
    public void setValidatorP40Idioma1(LengthValidator validator) {
        this.validatorP40Idioma1 = validator;
    }
  
    private TableColumn tableColumnP40otr1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP40otr1() {
        return tableColumnP40otr1;
    }

    public void setTableColumnP40otr1(TableColumn component) {
        this.tableColumnP40otr1 = component;
    }

    private Label labelP40otr1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP40otr1() {
        return labelP40otr1;
    }

    public void setLabelP40otr1(Label l) {
        this.labelP40otr1 = l;
    }

    private TextArea campoP40otr1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP40otr1() {
        return campoP40otr1;
    }

    public void setCampoP40otr1(TextArea component) {
        this.campoP40otr1 = component;
    }

    private StaticText campoP40otr1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP40otr1Texto1() {
        return campoP40otr1Texto1;
    }

    public void setCampoP40otr1Texto1(StaticText component) {
        this.campoP40otr1Texto1 = component;
    }

    private LengthValidator validatorP40otr1 = new LengthValidator();
  
    public LengthValidator getValidatorP40otr1() {
        return validatorP40otr1;
    }
  
    public void setValidatorP40otr1(LengthValidator validator) {
        this.validatorP40otr1 = validator;
    }
  
    private TableColumn tableColumnP411 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP411() {
        return tableColumnP411;
    }

    public void setTableColumnP411(TableColumn component) {
        this.tableColumnP411 = component;
    }

    private Label labelP411 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP411() {
        return labelP411;
    }

    public void setLabelP411(Label l) {
        this.labelP411 = l;
    }

    private TextArea campoP411 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP411() {
        return campoP411;
    }

    public void setCampoP411(TextArea component) {
        this.campoP411 = component;
    }

    private StaticText campoP411Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP411Texto1() {
        return campoP411Texto1;
    }

    public void setCampoP411Texto1(StaticText component) {
        this.campoP411Texto1 = component;
    }

    private LengthValidator validatorP411 = new LengthValidator();
  
    public LengthValidator getValidatorP411() {
        return validatorP411;
    }
  
    public void setValidatorP411(LengthValidator validator) {
        this.validatorP411 = validator;
    }
  
    private TableColumn tableColumnP421 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP421() {
        return tableColumnP421;
    }

    public void setTableColumnP421(TableColumn component) {
        this.tableColumnP421 = component;
    }

    private Label labelP421 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP421() {
        return labelP421;
    }

    public void setLabelP421(Label l) {
        this.labelP421 = l;
    }

    private TextArea campoP421 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP421() {
        return campoP421;
    }

    public void setCampoP421(TextArea component) {
        this.campoP421 = component;
    }

    private StaticText campoP421Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP421Texto1() {
        return campoP421Texto1;
    }

    public void setCampoP421Texto1(StaticText component) {
        this.campoP421Texto1 = component;
    }

    private LengthValidator validatorP421 = new LengthValidator();
  
    public LengthValidator getValidatorP421() {
        return validatorP421;
    }
  
    public void setValidatorP421(LengthValidator validator) {
        this.validatorP421 = validator;
    }
  
    private TableColumn tableColumnP431 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP431() {
        return tableColumnP431;
    }

    public void setTableColumnP431(TableColumn component) {
        this.tableColumnP431 = component;
    }

    private Label labelP431 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP431() {
        return labelP431;
    }

    public void setLabelP431(Label l) {
        this.labelP431 = l;
    }

    private TextArea campoP431 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP431() {
        return campoP431;
    }

    public void setCampoP431(TextArea component) {
        this.campoP431 = component;
    }

    private StaticText campoP431Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP431Texto1() {
        return campoP431Texto1;
    }

    public void setCampoP431Texto1(StaticText component) {
        this.campoP431Texto1 = component;
    }

    private LengthValidator validatorP431 = new LengthValidator();
  
    public LengthValidator getValidatorP431() {
        return validatorP431;
    }
  
    public void setValidatorP431(LengthValidator validator) {
        this.validatorP431 = validator;
    }
  
    private TableColumn tableColumnP4445t1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP4445t1() {
        return tableColumnP4445t1;
    }

    public void setTableColumnP4445t1(TableColumn component) {
        this.tableColumnP4445t1 = component;
    }

    private Label labelP4445t1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP4445t1() {
        return labelP4445t1;
    }

    public void setLabelP4445t1(Label l) {
        this.labelP4445t1 = l;
    }

    private TextArea campoP4445t1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP4445t1() {
        return campoP4445t1;
    }

    public void setCampoP4445t1(TextArea component) {
        this.campoP4445t1 = component;
    }

    private StaticText campoP4445t1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP4445t1Texto1() {
        return campoP4445t1Texto1;
    }

    public void setCampoP4445t1Texto1(StaticText component) {
        this.campoP4445t1Texto1 = component;
    }

    private LengthValidator validatorP4445t1 = new LengthValidator();
  
    public LengthValidator getValidatorP4445t1() {
        return validatorP4445t1;
    }
  
    public void setValidatorP4445t1(LengthValidator validator) {
        this.validatorP4445t1 = validator;
    }
  
    private TableColumn tableColumnP441 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP441() {
        return tableColumnP441;
    }

    public void setTableColumnP441(TableColumn component) {
        this.tableColumnP441 = component;
    }

    private Label labelP441 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP441() {
        return labelP441;
    }

    public void setLabelP441(Label l) {
        this.labelP441 = l;
    }

    private TextArea campoP441 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP441() {
        return campoP441;
    }

    public void setCampoP441(TextArea component) {
        this.campoP441 = component;
    }

    private StaticText campoP441Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP441Texto1() {
        return campoP441Texto1;
    }

    public void setCampoP441Texto1(StaticText component) {
        this.campoP441Texto1 = component;
    }

    private LengthValidator validatorP441 = new LengthValidator();
  
    public LengthValidator getValidatorP441() {
        return validatorP441;
    }
  
    public void setValidatorP441(LengthValidator validator) {
        this.validatorP441 = validator;
    }
  
    private TableColumn tableColumnP451 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP451() {
        return tableColumnP451;
    }

    public void setTableColumnP451(TableColumn component) {
        this.tableColumnP451 = component;
    }

    private Label labelP451 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP451() {
        return labelP451;
    }

    public void setLabelP451(Label l) {
        this.labelP451 = l;
    }

    private TextArea campoP451 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP451() {
        return campoP451;
    }

    public void setCampoP451(TextArea component) {
        this.campoP451 = component;
    }

    private StaticText campoP451Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP451Texto1() {
        return campoP451Texto1;
    }

    public void setCampoP451Texto1(StaticText component) {
        this.campoP451Texto1 = component;
    }

    private LengthValidator validatorP451 = new LengthValidator();
  
    public LengthValidator getValidatorP451() {
        return validatorP451;
    }
  
    public void setValidatorP451(LengthValidator validator) {
        this.validatorP451 = validator;
    }
  
    private TableColumn tableColumnP461 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP461() {
        return tableColumnP461;
    }

    public void setTableColumnP461(TableColumn component) {
        this.tableColumnP461 = component;
    }

    private Label labelP461 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP461() {
        return labelP461;
    }

    public void setLabelP461(Label l) {
        this.labelP461 = l;
    }

    private TextArea campoP461 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP461() {
        return campoP461;
    }

    public void setCampoP461(TextArea component) {
        this.campoP461 = component;
    }

    private StaticText campoP461Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP461Texto1() {
        return campoP461Texto1;
    }

    public void setCampoP461Texto1(StaticText component) {
        this.campoP461Texto1 = component;
    }

    private LengthValidator validatorP461 = new LengthValidator();
  
    public LengthValidator getValidatorP461() {
        return validatorP461;
    }
  
    public void setValidatorP461(LengthValidator validator) {
        this.validatorP461 = validator;
    }
  
    private TableColumn tableColumnP471 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP471() {
        return tableColumnP471;
    }

    public void setTableColumnP471(TableColumn component) {
        this.tableColumnP471 = component;
    }

    private Label labelP471 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP471() {
        return labelP471;
    }

    public void setLabelP471(Label l) {
        this.labelP471 = l;
    }

    private TextArea campoP471 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP471() {
        return campoP471;
    }

    public void setCampoP471(TextArea component) {
        this.campoP471 = component;
    }

    private StaticText campoP471Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP471Texto1() {
        return campoP471Texto1;
    }

    public void setCampoP471Texto1(StaticText component) {
        this.campoP471Texto1 = component;
    }

    private LengthValidator validatorP471 = new LengthValidator();
  
    public LengthValidator getValidatorP471() {
        return validatorP471;
    }
  
    public void setValidatorP471(LengthValidator validator) {
        this.validatorP471 = validator;
    }
  
    private TableColumn tableColumnP481 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP481() {
        return tableColumnP481;
    }

    public void setTableColumnP481(TableColumn component) {
        this.tableColumnP481 = component;
    }

    private Label labelP481 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP481() {
        return labelP481;
    }

    public void setLabelP481(Label l) {
        this.labelP481 = l;
    }

    private TextArea campoP481 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP481() {
        return campoP481;
    }

    public void setCampoP481(TextArea component) {
        this.campoP481 = component;
    }

    private StaticText campoP481Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP481Texto1() {
        return campoP481Texto1;
    }

    public void setCampoP481Texto1(StaticText component) {
        this.campoP481Texto1 = component;
    }

    private LengthValidator validatorP481 = new LengthValidator();
  
    public LengthValidator getValidatorP481() {
        return validatorP481;
    }
  
    public void setValidatorP481(LengthValidator validator) {
        this.validatorP481 = validator;
    }
  
    private TableColumn tableColumnP491 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP491() {
        return tableColumnP491;
    }

    public void setTableColumnP491(TableColumn component) {
        this.tableColumnP491 = component;
    }

    private Label labelP491 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP491() {
        return labelP491;
    }

    public void setLabelP491(Label l) {
        this.labelP491 = l;
    }

    private TextArea campoP491 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP491() {
        return campoP491;
    }

    public void setCampoP491(TextArea component) {
        this.campoP491 = component;
    }

    private StaticText campoP491Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP491Texto1() {
        return campoP491Texto1;
    }

    public void setCampoP491Texto1(StaticText component) {
        this.campoP491Texto1 = component;
    }

    private LengthValidator validatorP491 = new LengthValidator();
  
    public LengthValidator getValidatorP491() {
        return validatorP491;
    }
  
    public void setValidatorP491(LengthValidator validator) {
        this.validatorP491 = validator;
    }
  
    private TableColumn tableColumnP49Otr1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP49Otr1() {
        return tableColumnP49Otr1;
    }

    public void setTableColumnP49Otr1(TableColumn component) {
        this.tableColumnP49Otr1 = component;
    }

    private Label labelP49Otr1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP49Otr1() {
        return labelP49Otr1;
    }

    public void setLabelP49Otr1(Label l) {
        this.labelP49Otr1 = l;
    }

    private TextArea campoP49Otr1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP49Otr1() {
        return campoP49Otr1;
    }

    public void setCampoP49Otr1(TextArea component) {
        this.campoP49Otr1 = component;
    }

    private StaticText campoP49Otr1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP49Otr1Texto1() {
        return campoP49Otr1Texto1;
    }

    public void setCampoP49Otr1Texto1(StaticText component) {
        this.campoP49Otr1Texto1 = component;
    }

    private LengthValidator validatorP49Otr1 = new LengthValidator();
  
    public LengthValidator getValidatorP49Otr1() {
        return validatorP49Otr1;
    }
  
    public void setValidatorP49Otr1(LengthValidator validator) {
        this.validatorP49Otr1 = validator;
    }
  
    private TableColumn tableColumnP501 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP501() {
        return tableColumnP501;
    }

    public void setTableColumnP501(TableColumn component) {
        this.tableColumnP501 = component;
    }

    private Label labelP501 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP501() {
        return labelP501;
    }

    public void setLabelP501(Label l) {
        this.labelP501 = l;
    }

    private TextArea campoP501 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP501() {
        return campoP501;
    }

    public void setCampoP501(TextArea component) {
        this.campoP501 = component;
    }

    private StaticText campoP501Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP501Texto1() {
        return campoP501Texto1;
    }

    public void setCampoP501Texto1(StaticText component) {
        this.campoP501Texto1 = component;
    }

    private LengthValidator validatorP501 = new LengthValidator();
  
    public LengthValidator getValidatorP501() {
        return validatorP501;
    }
  
    public void setValidatorP501(LengthValidator validator) {
        this.validatorP501 = validator;
    }
  
    private TableColumn tableColumnP50Otr1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP50Otr1() {
        return tableColumnP50Otr1;
    }

    public void setTableColumnP50Otr1(TableColumn component) {
        this.tableColumnP50Otr1 = component;
    }

    private Label labelP50Otr1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP50Otr1() {
        return labelP50Otr1;
    }

    public void setLabelP50Otr1(Label l) {
        this.labelP50Otr1 = l;
    }

    private TextArea campoP50Otr1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP50Otr1() {
        return campoP50Otr1;
    }

    public void setCampoP50Otr1(TextArea component) {
        this.campoP50Otr1 = component;
    }

    private StaticText campoP50Otr1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP50Otr1Texto1() {
        return campoP50Otr1Texto1;
    }

    public void setCampoP50Otr1Texto1(StaticText component) {
        this.campoP50Otr1Texto1 = component;
    }

    private LengthValidator validatorP50Otr1 = new LengthValidator();
  
    public LengthValidator getValidatorP50Otr1() {
        return validatorP50Otr1;
    }
  
    public void setValidatorP50Otr1(LengthValidator validator) {
        this.validatorP50Otr1 = validator;
    }
  
    private TableColumn tableColumnP511 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP511() {
        return tableColumnP511;
    }

    public void setTableColumnP511(TableColumn component) {
        this.tableColumnP511 = component;
    }

    private Label labelP511 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP511() {
        return labelP511;
    }

    public void setLabelP511(Label l) {
        this.labelP511 = l;
    }

    private TextArea campoP511 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP511() {
        return campoP511;
    }

    public void setCampoP511(TextArea component) {
        this.campoP511 = component;
    }

    private StaticText campoP511Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP511Texto1() {
        return campoP511Texto1;
    }

    public void setCampoP511Texto1(StaticText component) {
        this.campoP511Texto1 = component;
    }

    private LengthValidator validatorP511 = new LengthValidator();
  
    public LengthValidator getValidatorP511() {
        return validatorP511;
    }
  
    public void setValidatorP511(LengthValidator validator) {
        this.validatorP511 = validator;
    }
  
    private TableColumn tableColumnP521 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP521() {
        return tableColumnP521;
    }

    public void setTableColumnP521(TableColumn component) {
        this.tableColumnP521 = component;
    }

    private Label labelP521 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP521() {
        return labelP521;
    }

    public void setLabelP521(Label l) {
        this.labelP521 = l;
    }

    private TextArea campoP521 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP521() {
        return campoP521;
    }

    public void setCampoP521(TextArea component) {
        this.campoP521 = component;
    }

    private StaticText campoP521Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP521Texto1() {
        return campoP521Texto1;
    }

    public void setCampoP521Texto1(StaticText component) {
        this.campoP521Texto1 = component;
    }

    private LengthValidator validatorP521 = new LengthValidator();
  
    public LengthValidator getValidatorP521() {
        return validatorP521;
    }
  
    public void setValidatorP521(LengthValidator validator) {
        this.validatorP521 = validator;
    }
  
    private TableColumn tableColumnP52Otr1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP52Otr1() {
        return tableColumnP52Otr1;
    }

    public void setTableColumnP52Otr1(TableColumn component) {
        this.tableColumnP52Otr1 = component;
    }

    private Label labelP52Otr1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP52Otr1() {
        return labelP52Otr1;
    }

    public void setLabelP52Otr1(Label l) {
        this.labelP52Otr1 = l;
    }

    private TextArea campoP52Otr1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP52Otr1() {
        return campoP52Otr1;
    }

    public void setCampoP52Otr1(TextArea component) {
        this.campoP52Otr1 = component;
    }

    private StaticText campoP52Otr1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP52Otr1Texto1() {
        return campoP52Otr1Texto1;
    }

    public void setCampoP52Otr1Texto1(StaticText component) {
        this.campoP52Otr1Texto1 = component;
    }

    private LengthValidator validatorP52Otr1 = new LengthValidator();
  
    public LengthValidator getValidatorP52Otr1() {
        return validatorP52Otr1;
    }
  
    public void setValidatorP52Otr1(LengthValidator validator) {
        this.validatorP52Otr1 = validator;
    }
  
    private TableColumn tableColumnP531 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP531() {
        return tableColumnP531;
    }

    public void setTableColumnP531(TableColumn component) {
        this.tableColumnP531 = component;
    }

    private Label labelP531 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP531() {
        return labelP531;
    }

    public void setLabelP531(Label l) {
        this.labelP531 = l;
    }

    private TextArea campoP531 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP531() {
        return campoP531;
    }

    public void setCampoP531(TextArea component) {
        this.campoP531 = component;
    }

    private StaticText campoP531Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP531Texto1() {
        return campoP531Texto1;
    }

    public void setCampoP531Texto1(StaticText component) {
        this.campoP531Texto1 = component;
    }

    private LengthValidator validatorP531 = new LengthValidator();
  
    public LengthValidator getValidatorP531() {
        return validatorP531;
    }
  
    public void setValidatorP531(LengthValidator validator) {
        this.validatorP531 = validator;
    }
  
    private TableColumn tableColumnP541 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP541() {
        return tableColumnP541;
    }

    public void setTableColumnP541(TableColumn component) {
        this.tableColumnP541 = component;
    }

    private Label labelP541 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP541() {
        return labelP541;
    }

    public void setLabelP541(Label l) {
        this.labelP541 = l;
    }

    private TextArea campoP541 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP541() {
        return campoP541;
    }

    public void setCampoP541(TextArea component) {
        this.campoP541 = component;
    }

    private StaticText campoP541Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP541Texto1() {
        return campoP541Texto1;
    }

    public void setCampoP541Texto1(StaticText component) {
        this.campoP541Texto1 = component;
    }

    private LengthValidator validatorP541 = new LengthValidator();
  
    public LengthValidator getValidatorP541() {
        return validatorP541;
    }
  
    public void setValidatorP541(LengthValidator validator) {
        this.validatorP541 = validator;
    }
  
    private TableColumn tableColumnP54a1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP54a1() {
        return tableColumnP54a1;
    }

    public void setTableColumnP54a1(TableColumn component) {
        this.tableColumnP54a1 = component;
    }

    private Label labelP54a1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP54a1() {
        return labelP54a1;
    }

    public void setLabelP54a1(Label l) {
        this.labelP54a1 = l;
    }

    private TextArea campoP54a1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP54a1() {
        return campoP54a1;
    }

    public void setCampoP54a1(TextArea component) {
        this.campoP54a1 = component;
    }

    private StaticText campoP54a1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP54a1Texto1() {
        return campoP54a1Texto1;
    }

    public void setCampoP54a1Texto1(StaticText component) {
        this.campoP54a1Texto1 = component;
    }

    private LengthValidator validatorP54a1 = new LengthValidator();
  
    public LengthValidator getValidatorP54a1() {
        return validatorP54a1;
    }
  
    public void setValidatorP54a1(LengthValidator validator) {
        this.validatorP54a1 = validator;
    }
  
    private TableColumn tableColumnP54Otr1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP54Otr1() {
        return tableColumnP54Otr1;
    }

    public void setTableColumnP54Otr1(TableColumn component) {
        this.tableColumnP54Otr1 = component;
    }

    private Label labelP54Otr1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP54Otr1() {
        return labelP54Otr1;
    }

    public void setLabelP54Otr1(Label l) {
        this.labelP54Otr1 = l;
    }

    private TextArea campoP54Otr1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP54Otr1() {
        return campoP54Otr1;
    }

    public void setCampoP54Otr1(TextArea component) {
        this.campoP54Otr1 = component;
    }

    private StaticText campoP54Otr1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP54Otr1Texto1() {
        return campoP54Otr1Texto1;
    }

    public void setCampoP54Otr1Texto1(StaticText component) {
        this.campoP54Otr1Texto1 = component;
    }

    private LengthValidator validatorP54Otr1 = new LengthValidator();
  
    public LengthValidator getValidatorP54Otr1() {
        return validatorP54Otr1;
    }
  
    public void setValidatorP54Otr1(LengthValidator validator) {
        this.validatorP54Otr1 = validator;
    }
  
    private TableColumn tableColumnP551 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP551() {
        return tableColumnP551;
    }

    public void setTableColumnP551(TableColumn component) {
        this.tableColumnP551 = component;
    }

    private Label labelP551 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP551() {
        return labelP551;
    }

    public void setLabelP551(Label l) {
        this.labelP551 = l;
    }

    private TextArea campoP551 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP551() {
        return campoP551;
    }

    public void setCampoP551(TextArea component) {
        this.campoP551 = component;
    }

    private StaticText campoP551Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP551Texto1() {
        return campoP551Texto1;
    }

    public void setCampoP551Texto1(StaticText component) {
        this.campoP551Texto1 = component;
    }

    private LengthValidator validatorP551 = new LengthValidator();
  
    public LengthValidator getValidatorP551() {
        return validatorP551;
    }
  
    public void setValidatorP551(LengthValidator validator) {
        this.validatorP551 = validator;
    }
  
    private TableColumn tableColumnP55Otr1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP55Otr1() {
        return tableColumnP55Otr1;
    }

    public void setTableColumnP55Otr1(TableColumn component) {
        this.tableColumnP55Otr1 = component;
    }

    private Label labelP55Otr1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP55Otr1() {
        return labelP55Otr1;
    }

    public void setLabelP55Otr1(Label l) {
        this.labelP55Otr1 = l;
    }

    private TextArea campoP55Otr1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP55Otr1() {
        return campoP55Otr1;
    }

    public void setCampoP55Otr1(TextArea component) {
        this.campoP55Otr1 = component;
    }

    private StaticText campoP55Otr1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP55Otr1Texto1() {
        return campoP55Otr1Texto1;
    }

    public void setCampoP55Otr1Texto1(StaticText component) {
        this.campoP55Otr1Texto1 = component;
    }

    private LengthValidator validatorP55Otr1 = new LengthValidator();
  
    public LengthValidator getValidatorP55Otr1() {
        return validatorP55Otr1;
    }
  
    public void setValidatorP55Otr1(LengthValidator validator) {
        this.validatorP55Otr1 = validator;
    }
  
    private TableColumn tableColumnP561 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP561() {
        return tableColumnP561;
    }

    public void setTableColumnP561(TableColumn component) {
        this.tableColumnP561 = component;
    }

    private Label labelP561 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP561() {
        return labelP561;
    }

    public void setLabelP561(Label l) {
        this.labelP561 = l;
    }

    private TextArea campoP561 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP561() {
        return campoP561;
    }

    public void setCampoP561(TextArea component) {
        this.campoP561 = component;
    }

    private StaticText campoP561Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP561Texto1() {
        return campoP561Texto1;
    }

    public void setCampoP561Texto1(StaticText component) {
        this.campoP561Texto1 = component;
    }

    private LengthValidator validatorP561 = new LengthValidator();
  
    public LengthValidator getValidatorP561() {
        return validatorP561;
    }
  
    public void setValidatorP561(LengthValidator validator) {
        this.validatorP561 = validator;
    }
  
    private TableColumn tableColumnP571 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP571() {
        return tableColumnP571;
    }

    public void setTableColumnP571(TableColumn component) {
        this.tableColumnP571 = component;
    }

    private Label labelP571 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP571() {
        return labelP571;
    }

    public void setLabelP571(Label l) {
        this.labelP571 = l;
    }

    private TextArea campoP571 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP571() {
        return campoP571;
    }

    public void setCampoP571(TextArea component) {
        this.campoP571 = component;
    }

    private StaticText campoP571Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP571Texto1() {
        return campoP571Texto1;
    }

    public void setCampoP571Texto1(StaticText component) {
        this.campoP571Texto1 = component;
    }

    private LengthValidator validatorP571 = new LengthValidator();
  
    public LengthValidator getValidatorP571() {
        return validatorP571;
    }
  
    public void setValidatorP571(LengthValidator validator) {
        this.validatorP571 = validator;
    }
  
    private TableColumn tableColumnP581 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP581() {
        return tableColumnP581;
    }

    public void setTableColumnP581(TableColumn component) {
        this.tableColumnP581 = component;
    }

    private Label labelP581 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP581() {
        return labelP581;
    }

    public void setLabelP581(Label l) {
        this.labelP581 = l;
    }

    private TextArea campoP581 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP581() {
        return campoP581;
    }

    public void setCampoP581(TextArea component) {
        this.campoP581 = component;
    }

    private StaticText campoP581Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP581Texto1() {
        return campoP581Texto1;
    }

    public void setCampoP581Texto1(StaticText component) {
        this.campoP581Texto1 = component;
    }

    private LengthValidator validatorP581 = new LengthValidator();
  
    public LengthValidator getValidatorP581() {
        return validatorP581;
    }
  
    public void setValidatorP581(LengthValidator validator) {
        this.validatorP581 = validator;
    }
  
    private TableColumn tableColumnP591 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP591() {
        return tableColumnP591;
    }

    public void setTableColumnP591(TableColumn component) {
        this.tableColumnP591 = component;
    }

    private Label labelP591 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP591() {
        return labelP591;
    }

    public void setLabelP591(Label l) {
        this.labelP591 = l;
    }

    private TextArea campoP591 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP591() {
        return campoP591;
    }

    public void setCampoP591(TextArea component) {
        this.campoP591 = component;
    }

    private StaticText campoP591Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP591Texto1() {
        return campoP591Texto1;
    }

    public void setCampoP591Texto1(StaticText component) {
        this.campoP591Texto1 = component;
    }

    private LengthValidator validatorP591 = new LengthValidator();
  
    public LengthValidator getValidatorP591() {
        return validatorP591;
    }
  
    public void setValidatorP591(LengthValidator validator) {
        this.validatorP591 = validator;
    }
  
    private TableColumn tableColumnP601 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP601() {
        return tableColumnP601;
    }

    public void setTableColumnP601(TableColumn component) {
        this.tableColumnP601 = component;
    }

    private Label labelP601 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP601() {
        return labelP601;
    }

    public void setLabelP601(Label l) {
        this.labelP601 = l;
    }

    private TextArea campoP601 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP601() {
        return campoP601;
    }

    public void setCampoP601(TextArea component) {
        this.campoP601 = component;
    }

    private StaticText campoP601Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP601Texto1() {
        return campoP601Texto1;
    }

    public void setCampoP601Texto1(StaticText component) {
        this.campoP601Texto1 = component;
    }

    private LengthValidator validatorP601 = new LengthValidator();
  
    public LengthValidator getValidatorP601() {
        return validatorP601;
    }
  
    public void setValidatorP601(LengthValidator validator) {
        this.validatorP601 = validator;
    }
  
    private TableColumn tableColumnP611 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP611() {
        return tableColumnP611;
    }

    public void setTableColumnP611(TableColumn component) {
        this.tableColumnP611 = component;
    }

    private Label labelP611 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP611() {
        return labelP611;
    }

    public void setLabelP611(Label l) {
        this.labelP611 = l;
    }

    private TextArea campoP611 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP611() {
        return campoP611;
    }

    public void setCampoP611(TextArea component) {
        this.campoP611 = component;
    }

    private StaticText campoP611Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP611Texto1() {
        return campoP611Texto1;
    }

    public void setCampoP611Texto1(StaticText component) {
        this.campoP611Texto1 = component;
    }

    private LengthValidator validatorP611 = new LengthValidator();
  
    public LengthValidator getValidatorP611() {
        return validatorP611;
    }
  
    public void setValidatorP611(LengthValidator validator) {
        this.validatorP611 = validator;
    }
  
    private TableColumn tableColumnP621 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP621() {
        return tableColumnP621;
    }

    public void setTableColumnP621(TableColumn component) {
        this.tableColumnP621 = component;
    }

    private Label labelP621 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP621() {
        return labelP621;
    }

    public void setLabelP621(Label l) {
        this.labelP621 = l;
    }

    private TextArea campoP621 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP621() {
        return campoP621;
    }

    public void setCampoP621(TextArea component) {
        this.campoP621 = component;
    }

    private StaticText campoP621Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP621Texto1() {
        return campoP621Texto1;
    }

    public void setCampoP621Texto1(StaticText component) {
        this.campoP621Texto1 = component;
    }

    private LengthValidator validatorP621 = new LengthValidator();
  
    public LengthValidator getValidatorP621() {
        return validatorP621;
    }
  
    public void setValidatorP621(LengthValidator validator) {
        this.validatorP621 = validator;
    }
  
    private TableColumn tableColumnP631 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP631() {
        return tableColumnP631;
    }

    public void setTableColumnP631(TableColumn component) {
        this.tableColumnP631 = component;
    }

    private Label labelP631 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP631() {
        return labelP631;
    }

    public void setLabelP631(Label l) {
        this.labelP631 = l;
    }

    private TextArea campoP631 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP631() {
        return campoP631;
    }

    public void setCampoP631(TextArea component) {
        this.campoP631 = component;
    }

    private StaticText campoP631Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP631Texto1() {
        return campoP631Texto1;
    }

    public void setCampoP631Texto1(StaticText component) {
        this.campoP631Texto1 = component;
    }

    private LengthValidator validatorP631 = new LengthValidator();
  
    public LengthValidator getValidatorP631() {
        return validatorP631;
    }
  
    public void setValidatorP631(LengthValidator validator) {
        this.validatorP631 = validator;
    }
  
    private TableColumn tableColumnP63Especificar1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP63Especificar1() {
        return tableColumnP63Especificar1;
    }

    public void setTableColumnP63Especificar1(TableColumn component) {
        this.tableColumnP63Especificar1 = component;
    }

    private Label labelP63Especificar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP63Especificar1() {
        return labelP63Especificar1;
    }

    public void setLabelP63Especificar1(Label l) {
        this.labelP63Especificar1 = l;
    }

    private TextArea campoP63Especificar1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP63Especificar1() {
        return campoP63Especificar1;
    }

    public void setCampoP63Especificar1(TextArea component) {
        this.campoP63Especificar1 = component;
    }

    private StaticText campoP63Especificar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP63Especificar1Texto1() {
        return campoP63Especificar1Texto1;
    }

    public void setCampoP63Especificar1Texto1(StaticText component) {
        this.campoP63Especificar1Texto1 = component;
    }

    private LengthValidator validatorP63Especificar1 = new LengthValidator();
  
    public LengthValidator getValidatorP63Especificar1() {
        return validatorP63Especificar1;
    }
  
    public void setValidatorP63Especificar1(LengthValidator validator) {
        this.validatorP63Especificar1 = validator;
    }
  
    private TableColumn tableColumnP64des1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP64des1() {
        return tableColumnP64des1;
    }

    public void setTableColumnP64des1(TableColumn component) {
        this.tableColumnP64des1 = component;
    }

    private Label labelP64des1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP64des1() {
        return labelP64des1;
    }

    public void setLabelP64des1(Label l) {
        this.labelP64des1 = l;
    }

    private TextArea campoP64des1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP64des1() {
        return campoP64des1;
    }

    public void setCampoP64des1(TextArea component) {
        this.campoP64des1 = component;
    }

    private StaticText campoP64des1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP64des1Texto1() {
        return campoP64des1Texto1;
    }

    public void setCampoP64des1Texto1(StaticText component) {
        this.campoP64des1Texto1 = component;
    }

    private LengthValidator validatorP64des1 = new LengthValidator();
  
    public LengthValidator getValidatorP64des1() {
        return validatorP64des1;
    }
  
    public void setValidatorP64des1(LengthValidator validator) {
        this.validatorP64des1 = validator;
    }
  
    private TableColumn tableColumnP64c1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP64c1() {
        return tableColumnP64c1;
    }

    public void setTableColumnP64c1(TableColumn component) {
        this.tableColumnP64c1 = component;
    }

    private Label labelP64c1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP64c1() {
        return labelP64c1;
    }

    public void setLabelP64c1(Label l) {
        this.labelP64c1 = l;
    }

    private TextArea campoP64c1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP64c1() {
        return campoP64c1;
    }

    public void setCampoP64c1(TextArea component) {
        this.campoP64c1 = component;
    }

    private StaticText campoP64c1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP64c1Texto1() {
        return campoP64c1Texto1;
    }

    public void setCampoP64c1Texto1(StaticText component) {
        this.campoP64c1Texto1 = component;
    }

    private LengthValidator validatorP64c1 = new LengthValidator();
  
    public LengthValidator getValidatorP64c1() {
        return validatorP64c1;
    }
  
    public void setValidatorP64c1(LengthValidator validator) {
        this.validatorP64c1 = validator;
    }
  
    private TableColumn tableColumnP65des1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP65des1() {
        return tableColumnP65des1;
    }

    public void setTableColumnP65des1(TableColumn component) {
        this.tableColumnP65des1 = component;
    }

    private Label labelP65des1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP65des1() {
        return labelP65des1;
    }

    public void setLabelP65des1(Label l) {
        this.labelP65des1 = l;
    }

    private TextArea campoP65des1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP65des1() {
        return campoP65des1;
    }

    public void setCampoP65des1(TextArea component) {
        this.campoP65des1 = component;
    }

    private StaticText campoP65des1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP65des1Texto1() {
        return campoP65des1Texto1;
    }

    public void setCampoP65des1Texto1(StaticText component) {
        this.campoP65des1Texto1 = component;
    }

    private LengthValidator validatorP65des1 = new LengthValidator();
  
    public LengthValidator getValidatorP65des1() {
        return validatorP65des1;
    }
  
    public void setValidatorP65des1(LengthValidator validator) {
        this.validatorP65des1 = validator;
    }
  
    private TableColumn tableColumnP65c1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP65c1() {
        return tableColumnP65c1;
    }

    public void setTableColumnP65c1(TableColumn component) {
        this.tableColumnP65c1 = component;
    }

    private Label labelP65c1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP65c1() {
        return labelP65c1;
    }

    public void setLabelP65c1(Label l) {
        this.labelP65c1 = l;
    }

    private TextArea campoP65c1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP65c1() {
        return campoP65c1;
    }

    public void setCampoP65c1(TextArea component) {
        this.campoP65c1 = component;
    }

    private StaticText campoP65c1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP65c1Texto1() {
        return campoP65c1Texto1;
    }

    public void setCampoP65c1Texto1(StaticText component) {
        this.campoP65c1Texto1 = component;
    }

    private LengthValidator validatorP65c1 = new LengthValidator();
  
    public LengthValidator getValidatorP65c1() {
        return validatorP65c1;
    }
  
    public void setValidatorP65c1(LengthValidator validator) {
        this.validatorP65c1 = validator;
    }
  
    private TableColumn tableColumnP661 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP661() {
        return tableColumnP661;
    }

    public void setTableColumnP661(TableColumn component) {
        this.tableColumnP661 = component;
    }

    private Label labelP661 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP661() {
        return labelP661;
    }

    public void setLabelP661(Label l) {
        this.labelP661 = l;
    }

    private TextArea campoP661 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP661() {
        return campoP661;
    }

    public void setCampoP661(TextArea component) {
        this.campoP661 = component;
    }

    private StaticText campoP661Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP661Texto1() {
        return campoP661Texto1;
    }

    public void setCampoP661Texto1(StaticText component) {
        this.campoP661Texto1 = component;
    }

    private LengthValidator validatorP661 = new LengthValidator();
  
    public LengthValidator getValidatorP661() {
        return validatorP661;
    }
  
    public void setValidatorP661(LengthValidator validator) {
        this.validatorP661 = validator;
    }
  
    private TableColumn tableColumnP67a1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP67a1() {
        return tableColumnP67a1;
    }

    public void setTableColumnP67a1(TableColumn component) {
        this.tableColumnP67a1 = component;
    }

    private Label labelP67a1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP67a1() {
        return labelP67a1;
    }

    public void setLabelP67a1(Label l) {
        this.labelP67a1 = l;
    }

    private TextArea campoP67a1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP67a1() {
        return campoP67a1;
    }

    public void setCampoP67a1(TextArea component) {
        this.campoP67a1 = component;
    }

    private StaticText campoP67a1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP67a1Texto1() {
        return campoP67a1Texto1;
    }

    public void setCampoP67a1Texto1(StaticText component) {
        this.campoP67a1Texto1 = component;
    }

    private LengthValidator validatorP67a1 = new LengthValidator();
  
    public LengthValidator getValidatorP67a1() {
        return validatorP67a1;
    }
  
    public void setValidatorP67a1(LengthValidator validator) {
        this.validatorP67a1 = validator;
    }
  
    private TableColumn tableColumnP67b1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP67b1() {
        return tableColumnP67b1;
    }

    public void setTableColumnP67b1(TableColumn component) {
        this.tableColumnP67b1 = component;
    }

    private Label labelP67b1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP67b1() {
        return labelP67b1;
    }

    public void setLabelP67b1(Label l) {
        this.labelP67b1 = l;
    }

    private TextArea campoP67b1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP67b1() {
        return campoP67b1;
    }

    public void setCampoP67b1(TextArea component) {
        this.campoP67b1 = component;
    }

    private StaticText campoP67b1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP67b1Texto1() {
        return campoP67b1Texto1;
    }

    public void setCampoP67b1Texto1(StaticText component) {
        this.campoP67b1Texto1 = component;
    }

    private LengthValidator validatorP67b1 = new LengthValidator();
  
    public LengthValidator getValidatorP67b1() {
        return validatorP67b1;
    }
  
    public void setValidatorP67b1(LengthValidator validator) {
        this.validatorP67b1 = validator;
    }
  
    private TableColumn tableColumnP67c1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP67c1() {
        return tableColumnP67c1;
    }

    public void setTableColumnP67c1(TableColumn component) {
        this.tableColumnP67c1 = component;
    }

    private Label labelP67c1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP67c1() {
        return labelP67c1;
    }

    public void setLabelP67c1(Label l) {
        this.labelP67c1 = l;
    }

    private TextArea campoP67c1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP67c1() {
        return campoP67c1;
    }

    public void setCampoP67c1(TextArea component) {
        this.campoP67c1 = component;
    }

    private StaticText campoP67c1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP67c1Texto1() {
        return campoP67c1Texto1;
    }

    public void setCampoP67c1Texto1(StaticText component) {
        this.campoP67c1Texto1 = component;
    }

    private LengthValidator validatorP67c1 = new LengthValidator();
  
    public LengthValidator getValidatorP67c1() {
        return validatorP67c1;
    }
  
    public void setValidatorP67c1(LengthValidator validator) {
        this.validatorP67c1 = validator;
    }
  
    private TableColumn tableColumnP67d1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP67d1() {
        return tableColumnP67d1;
    }

    public void setTableColumnP67d1(TableColumn component) {
        this.tableColumnP67d1 = component;
    }

    private Label labelP67d1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP67d1() {
        return labelP67d1;
    }

    public void setLabelP67d1(Label l) {
        this.labelP67d1 = l;
    }

    private TextArea campoP67d1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP67d1() {
        return campoP67d1;
    }

    public void setCampoP67d1(TextArea component) {
        this.campoP67d1 = component;
    }

    private StaticText campoP67d1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP67d1Texto1() {
        return campoP67d1Texto1;
    }

    public void setCampoP67d1Texto1(StaticText component) {
        this.campoP67d1Texto1 = component;
    }

    private LengthValidator validatorP67d1 = new LengthValidator();
  
    public LengthValidator getValidatorP67d1() {
        return validatorP67d1;
    }
  
    public void setValidatorP67d1(LengthValidator validator) {
        this.validatorP67d1 = validator;
    }
  
    private TableColumn tableColumnP67e1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP67e1() {
        return tableColumnP67e1;
    }

    public void setTableColumnP67e1(TableColumn component) {
        this.tableColumnP67e1 = component;
    }

    private Label labelP67e1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP67e1() {
        return labelP67e1;
    }

    public void setLabelP67e1(Label l) {
        this.labelP67e1 = l;
    }

    private TextArea campoP67e1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP67e1() {
        return campoP67e1;
    }

    public void setCampoP67e1(TextArea component) {
        this.campoP67e1 = component;
    }

    private StaticText campoP67e1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP67e1Texto1() {
        return campoP67e1Texto1;
    }

    public void setCampoP67e1Texto1(StaticText component) {
        this.campoP67e1Texto1 = component;
    }

    private LengthValidator validatorP67e1 = new LengthValidator();
  
    public LengthValidator getValidatorP67e1() {
        return validatorP67e1;
    }
  
    public void setValidatorP67e1(LengthValidator validator) {
        this.validatorP67e1 = validator;
    }
  
    private TableColumn tableColumnP67f1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP67f1() {
        return tableColumnP67f1;
    }

    public void setTableColumnP67f1(TableColumn component) {
        this.tableColumnP67f1 = component;
    }

    private Label labelP67f1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP67f1() {
        return labelP67f1;
    }

    public void setLabelP67f1(Label l) {
        this.labelP67f1 = l;
    }

    private TextArea campoP67f1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP67f1() {
        return campoP67f1;
    }

    public void setCampoP67f1(TextArea component) {
        this.campoP67f1 = component;
    }

    private StaticText campoP67f1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP67f1Texto1() {
        return campoP67f1Texto1;
    }

    public void setCampoP67f1Texto1(StaticText component) {
        this.campoP67f1Texto1 = component;
    }

    private LengthValidator validatorP67f1 = new LengthValidator();
  
    public LengthValidator getValidatorP67f1() {
        return validatorP67f1;
    }
  
    public void setValidatorP67f1(LengthValidator validator) {
        this.validatorP67f1 = validator;
    }
  
    private TableColumn tableColumnP67g1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP67g1() {
        return tableColumnP67g1;
    }

    public void setTableColumnP67g1(TableColumn component) {
        this.tableColumnP67g1 = component;
    }

    private Label labelP67g1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP67g1() {
        return labelP67g1;
    }

    public void setLabelP67g1(Label l) {
        this.labelP67g1 = l;
    }

    private TextArea campoP67g1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP67g1() {
        return campoP67g1;
    }

    public void setCampoP67g1(TextArea component) {
        this.campoP67g1 = component;
    }

    private StaticText campoP67g1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP67g1Texto1() {
        return campoP67g1Texto1;
    }

    public void setCampoP67g1Texto1(StaticText component) {
        this.campoP67g1Texto1 = component;
    }

    private LengthValidator validatorP67g1 = new LengthValidator();
  
    public LengthValidator getValidatorP67g1() {
        return validatorP67g1;
    }
  
    public void setValidatorP67g1(LengthValidator validator) {
        this.validatorP67g1 = validator;
    }
  
    private TableColumn tableColumnP67h1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP67h1() {
        return tableColumnP67h1;
    }

    public void setTableColumnP67h1(TableColumn component) {
        this.tableColumnP67h1 = component;
    }

    private Label labelP67h1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP67h1() {
        return labelP67h1;
    }

    public void setLabelP67h1(Label l) {
        this.labelP67h1 = l;
    }

    private TextArea campoP67h1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP67h1() {
        return campoP67h1;
    }

    public void setCampoP67h1(TextArea component) {
        this.campoP67h1 = component;
    }

    private StaticText campoP67h1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP67h1Texto1() {
        return campoP67h1Texto1;
    }

    public void setCampoP67h1Texto1(StaticText component) {
        this.campoP67h1Texto1 = component;
    }

    private LengthValidator validatorP67h1 = new LengthValidator();
  
    public LengthValidator getValidatorP67h1() {
        return validatorP67h1;
    }
  
    public void setValidatorP67h1(LengthValidator validator) {
        this.validatorP67h1 = validator;
    }
  
    private TableColumn tableColumnP67i1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP67i1() {
        return tableColumnP67i1;
    }

    public void setTableColumnP67i1(TableColumn component) {
        this.tableColumnP67i1 = component;
    }

    private Label labelP67i1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP67i1() {
        return labelP67i1;
    }

    public void setLabelP67i1(Label l) {
        this.labelP67i1 = l;
    }

    private TextArea campoP67i1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP67i1() {
        return campoP67i1;
    }

    public void setCampoP67i1(TextArea component) {
        this.campoP67i1 = component;
    }

    private StaticText campoP67i1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP67i1Texto1() {
        return campoP67i1Texto1;
    }

    public void setCampoP67i1Texto1(StaticText component) {
        this.campoP67i1Texto1 = component;
    }

    private LengthValidator validatorP67i1 = new LengthValidator();
  
    public LengthValidator getValidatorP67i1() {
        return validatorP67i1;
    }
  
    public void setValidatorP67i1(LengthValidator validator) {
        this.validatorP67i1 = validator;
    }
  
    private TableColumn tableColumnP67j1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP67j1() {
        return tableColumnP67j1;
    }

    public void setTableColumnP67j1(TableColumn component) {
        this.tableColumnP67j1 = component;
    }

    private Label labelP67j1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP67j1() {
        return labelP67j1;
    }

    public void setLabelP67j1(Label l) {
        this.labelP67j1 = l;
    }

    private TextArea campoP67j1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP67j1() {
        return campoP67j1;
    }

    public void setCampoP67j1(TextArea component) {
        this.campoP67j1 = component;
    }

    private StaticText campoP67j1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP67j1Texto1() {
        return campoP67j1Texto1;
    }

    public void setCampoP67j1Texto1(StaticText component) {
        this.campoP67j1Texto1 = component;
    }

    private LengthValidator validatorP67j1 = new LengthValidator();
  
    public LengthValidator getValidatorP67j1() {
        return validatorP67j1;
    }
  
    public void setValidatorP67j1(LengthValidator validator) {
        this.validatorP67j1 = validator;
    }
  
    private TableColumn tableColumnP67k1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP67k1() {
        return tableColumnP67k1;
    }

    public void setTableColumnP67k1(TableColumn component) {
        this.tableColumnP67k1 = component;
    }

    private Label labelP67k1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP67k1() {
        return labelP67k1;
    }

    public void setLabelP67k1(Label l) {
        this.labelP67k1 = l;
    }

    private TextArea campoP67k1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP67k1() {
        return campoP67k1;
    }

    public void setCampoP67k1(TextArea component) {
        this.campoP67k1 = component;
    }

    private StaticText campoP67k1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP67k1Texto1() {
        return campoP67k1Texto1;
    }

    public void setCampoP67k1Texto1(StaticText component) {
        this.campoP67k1Texto1 = component;
    }

    private LengthValidator validatorP67k1 = new LengthValidator();
  
    public LengthValidator getValidatorP67k1() {
        return validatorP67k1;
    }
  
    public void setValidatorP67k1(LengthValidator validator) {
        this.validatorP67k1 = validator;
    }
  
    private TableColumn tableColumnP67l1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP67l1() {
        return tableColumnP67l1;
    }

    public void setTableColumnP67l1(TableColumn component) {
        this.tableColumnP67l1 = component;
    }

    private Label labelP67l1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP67l1() {
        return labelP67l1;
    }

    public void setLabelP67l1(Label l) {
        this.labelP67l1 = l;
    }

    private TextArea campoP67l1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP67l1() {
        return campoP67l1;
    }

    public void setCampoP67l1(TextArea component) {
        this.campoP67l1 = component;
    }

    private StaticText campoP67l1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP67l1Texto1() {
        return campoP67l1Texto1;
    }

    public void setCampoP67l1Texto1(StaticText component) {
        this.campoP67l1Texto1 = component;
    }

    private LengthValidator validatorP67l1 = new LengthValidator();
  
    public LengthValidator getValidatorP67l1() {
        return validatorP67l1;
    }
  
    public void setValidatorP67l1(LengthValidator validator) {
        this.validatorP67l1 = validator;
    }
  
    private TableColumn tableColumnP67tot1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnP67tot1() {
        return tableColumnP67tot1;
    }

    public void setTableColumnP67tot1(TableColumn component) {
        this.tableColumnP67tot1 = component;
    }

    private Label labelP67tot1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelP67tot1() {
        return labelP67tot1;
    }

    public void setLabelP67tot1(Label l) {
        this.labelP67tot1 = l;
    }

    private TextArea campoP67tot1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoP67tot1() {
        return campoP67tot1;
    }

    public void setCampoP67tot1(TextArea component) {
        this.campoP67tot1 = component;
    }

    private StaticText campoP67tot1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoP67tot1Texto1() {
        return campoP67tot1Texto1;
    }

    public void setCampoP67tot1Texto1(StaticText component) {
        this.campoP67tot1Texto1 = component;
    }

    private LengthValidator validatorP67tot1 = new LengthValidator();
  
    public LengthValidator getValidatorP67tot1() {
        return validatorP67tot1;
    }
  
    public void setValidatorP67tot1(LengthValidator validator) {
        this.validatorP67tot1 = validator;
    }
  
    private TableColumn tableColumnEsImportado1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsImportado1() {
        return tableColumnEsImportado1;
    }

    public void setTableColumnEsImportado1(TableColumn component) {
        this.tableColumnEsImportado1 = component;
    }

    private Label labelEsImportado1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsImportado1() {
        return labelEsImportado1;
    }

    public void setLabelEsImportado1(Label l) {
        this.labelEsImportado1 = l;
    }

    private DropDown listaEsImportado1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsImportado1() {
        return listaEsImportado1;
    }

    public void setListaEsImportado1(DropDown component) {
        this.listaEsImportado1 = component;
    }

    private StaticText listaEsImportado1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsImportado1Texto1() {
        return listaEsImportado1Texto1;
    }

    public void setListaEsImportado1Texto1(StaticText component) {
        this.listaEsImportado1Texto1 = component;
    }

    private IntegerConverter converterEsImportado1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsImportado1() {
        return converterEsImportado1;
    }
  
    public void setConverterEsImportado1(IntegerConverter converter) {
        this.converterEsImportado1 = converter;
    }
  
    private TableColumn tableColumnObservacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnObservacion1() {
        return tableColumnObservacion1;
    }

    public void setTableColumnObservacion1(TableColumn component) {
        this.tableColumnObservacion1 = component;
    }

    private Label labelObservacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelObservacion1() {
        return labelObservacion1;
    }

    public void setLabelObservacion1(Label l) {
        this.labelObservacion1 = l;
    }

    private TextArea campoObservacion1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoObservacion1() {
        return campoObservacion1;
    }

    public void setCampoObservacion1(TextArea component) {
        this.campoObservacion1 = component;
    }

    private StaticText campoObservacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoObservacion1Texto1() {
        return campoObservacion1Texto1;
    }

    public void setCampoObservacion1Texto1(StaticText component) {
        this.campoObservacion1Texto1 = component;
    }

    private LengthValidator validatorObservacion1 = new LengthValidator();
  
    public LengthValidator getValidatorObservacion1() {
        return validatorObservacion1;
    }
  
    public void setValidatorObservacion1(LengthValidator validator) {
        this.validatorObservacion1 = validator;
    }
  
    private TableColumn tableColumnFechaHoraTransaccion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaHoraTransaccion1() {
        return tableColumnFechaHoraTransaccion1;
    }

    public void setTableColumnFechaHoraTransaccion1(TableColumn component) {
        this.tableColumnFechaHoraTransaccion1 = component;
    }

    private Label labelFechaHoraTransaccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaHoraTransaccion1() {
        return labelFechaHoraTransaccion1;
    }

    public void setLabelFechaHoraTransaccion1(Label l) {
        this.labelFechaHoraTransaccion1 = l;
    }

    private TextField campoFechaHoraTransaccion1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaHoraTransaccion1() {
        return campoFechaHoraTransaccion1;
    }

    public void setCampoFechaHoraTransaccion1(TextField component) {
        this.campoFechaHoraTransaccion1 = component;
    }

    private StaticText campoFechaHoraTransaccion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaHoraTransaccion1Texto1() {
        return campoFechaHoraTransaccion1Texto1;
    }

    public void setCampoFechaHoraTransaccion1Texto1(StaticText component) {
        this.campoFechaHoraTransaccion1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaHoraTransaccion1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaHoraTransaccion1() {
        return converterFechaHoraTransaccion1;
    }
  
    public void setConverterFechaHoraTransaccion1(SqlTimestampConverter converter) {
        this.converterFechaHoraTransaccion1 = converter;
    }
  
    private TableColumn tableColumnNombreArchivo1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreArchivo1() {
        return tableColumnNombreArchivo1;
    }

    public void setTableColumnNombreArchivo1(TableColumn component) {
        this.tableColumnNombreArchivo1 = component;
    }

    private Label labelNombreArchivo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreArchivo1() {
        return labelNombreArchivo1;
    }

    public void setLabelNombreArchivo1(Label l) {
        this.labelNombreArchivo1 = l;
    }

    private TextArea campoNombreArchivo1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNombreArchivo1() {
        return campoNombreArchivo1;
    }

    public void setCampoNombreArchivo1(TextArea component) {
        this.campoNombreArchivo1 = component;
    }

    private StaticText campoNombreArchivo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreArchivo1Texto1() {
        return campoNombreArchivo1Texto1;
    }

    public void setCampoNombreArchivo1Texto1(StaticText component) {
        this.campoNombreArchivo1Texto1 = component;
    }

    private Button campoNombreArchivo1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoNombreArchivo1Boton3() {
        return campoNombreArchivo1Boton3;
    }

    public void setCampoNombreArchivo1Boton3(Button component) {
        this.campoNombreArchivo1Boton3 = component;
    }

    private LengthValidator validatorNombreArchivo1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreArchivo1() {
        return validatorNombreArchivo1;
    }
  
    public void setValidatorNombreArchivo1(LengthValidator validator) {
        this.validatorNombreArchivo1 = validator;
    }
  
    private TableColumn tableColumnCodigoArchivo1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCodigoArchivo1() {
        return tableColumnCodigoArchivo1;
    }

    public void setTableColumnCodigoArchivo1(TableColumn component) {
        this.tableColumnCodigoArchivo1 = component;
    }

    private Label labelCodigoArchivo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoArchivo1() {
        return labelCodigoArchivo1;
    }

    public void setLabelCodigoArchivo1(Label l) {
        this.labelCodigoArchivo1 = l;
    }

    private TextArea campoCodigoArchivo1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoCodigoArchivo1() {
        return campoCodigoArchivo1;
    }

    public void setCampoCodigoArchivo1(TextArea component) {
        this.campoCodigoArchivo1 = component;
    }

    private StaticText campoCodigoArchivo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoArchivo1Texto1() {
        return campoCodigoArchivo1Texto1;
    }

    public void setCampoCodigoArchivo1Texto1(StaticText component) {
        this.campoCodigoArchivo1Texto1 = component;
    }

    private LengthValidator validatorCodigoArchivo1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoArchivo1() {
        return validatorCodigoArchivo1;
    }
  
    public void setValidatorCodigoArchivo1(LengthValidator validator) {
        this.validatorCodigoArchivo1 = validator;
    }
  
    private Label etiquetaTextoFilasPorPagina1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getEtiquetaTextoFilasPorPagina1() {
        return etiquetaTextoFilasPorPagina1;
    }

    public void setEtiquetaTextoFilasPorPagina1(Label l) {
        this.etiquetaTextoFilasPorPagina1 = l;
    }

    private TextField textoFilasPorPagina1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getTextoFilasPorPagina1() {
        return textoFilasPorPagina1;
    }

    public void setTextoFilasPorPagina1(TextField tf) {
        this.textoFilasPorPagina1 = tf;
    }

    private Button botonRepaginar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonRepaginar1() {
        return botonRepaginar1;
    }

    public void setBotonRepaginar1(Button b) {
        this.botonRepaginar1 = b;
    }

    private IntegerConverter textoFilasPorPagina1Converter1 = new IntegerConverter();
  
    public IntegerConverter getTextoFilasPorPagina1Converter1() {
        return textoFilasPorPagina1Converter1;
    }
  
    public void setTextoFilasPorPagina1Converter1(IntegerConverter ic) {
        this.textoFilasPorPagina1Converter1 = ic;
    }
  
    private LongRangeValidator textoFilasPorPagina1Validator1 = new LongRangeValidator();
  
    public LongRangeValidator getTextoFilasPorPagina1Validator1() {
        return textoFilasPorPagina1Validator1;
    }
  
    public void setTextoFilasPorPagina1Validator1(LongRangeValidator lrv) {
        this.textoFilasPorPagina1Validator1 = lrv;
    }
  
    private Button botonAgregar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonAgregar1() {
        return botonAgregar1;
    }

    public void setBotonAgregar1(Button component) {
        this.botonAgregar1 = component;
    }

    private DropDown listaFuncionEdicion1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaFuncionEdicion1() {
        return listaFuncionEdicion1;
    }

    public void setListaFuncionEdicion1(DropDown component) {
        this.listaFuncionEdicion1 = component;
    }

    private LongConverter converterListaFuncionEdicion1 = new LongConverter();
  
    public LongConverter getConverterListaFuncionEdicion1() {
        return converterListaFuncionEdicion1;
    } 
  
    public void setConverterListaFuncionEdicion1(LongConverter component) {
        this.converterListaFuncionEdicion1 = component;
    }
  
    private Button botonEditar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonEditar1() {
        return botonEditar1;
    }

    public void setBotonEditar1(Button component) {
        this.botonEditar1 = component;
    }

    private Button botonDeshacer1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonDeshacer1() {
        return botonDeshacer1;
    }

    public void setBotonDeshacer1(Button component) {
        this.botonDeshacer1 = component;
    }

    private Button botonEliminar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonEliminar1() {
        return botonEliminar1;
    }

    public void setBotonEliminar1(Button component) {
        this.botonEliminar1 = component;
    }

    private Button botonAplicar1 = new com.egt.core.jsf.component.Boton();

    @Override
    public Button getBotonAplicar1() {
        return botonAplicar1;
    }

    public void setBotonAplicar1(Button component) {
        this.botonAplicar1 = component;
    }

    private Button botonConfirmar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonConfirmar1() {
        return botonConfirmar1;
    }

    public void setBotonConfirmar1(Button component) {
        this.botonConfirmar1 = component;
    }

    private Button botonDescartar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonDescartar1() {
        return botonDescartar1;
    }

    public void setBotonDescartar1(Button component) {
        this.botonDescartar1 = component;
    }

    private DropDown listaFuncionAccion1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaFuncionAccion1() {
        return listaFuncionAccion1;
    }

    public void setListaFuncionAccion1(DropDown component) {
        this.listaFuncionAccion1 = component;
    }

    private LongConverter converterListaFuncionAccion1 = new LongConverter();
  
    public LongConverter getConverterListaFuncionAccion1() {
        return converterListaFuncionAccion1;
    } 
  
    public void setConverterListaFuncionAccion1(LongConverter component) {
        this.converterListaFuncionAccion1 = component;
    }
  
    private Button botonProcesar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonProcesar1() {
        return botonProcesar1;
    }

    public void setBotonProcesar1(Button component) {
        this.botonProcesar1 = component;
    }

    private Button botonRefrescar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonRefrescar1() {
        return botonRefrescar1;
    }

    public void setBotonRefrescar1(Button component) {
        this.botonRefrescar1 = component;
    }

    private Button botonReconsultar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonReconsultar1() {
        return botonReconsultar1;
    }

    public void setBotonReconsultar1(Button component) {
        this.botonReconsultar1 = component;
    }

    private Button botonRetornar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonRetornar1() {
        return botonRetornar1;
    }

    public void setBotonRetornar1(Button component) {
        this.botonRetornar1 = component;
    }

    private ImageHyperlink imageHyperlink1 = new com.egt.core.jsf.component.Hipervinculo();

    public ImageHyperlink getImageHyperlink1() {
        return imageHyperlink1;
    }

    public void setImageHyperlink1(ImageHyperlink component) {
        this.imageHyperlink1 = component;
    }

    private LogImpPerEecCachedRowSetDataProvider2 logImpPerEecDataProvider = new LogImpPerEecCachedRowSetDataProvider2();

    @Override
    public LogImpPerEecCachedRowSetDataProvider2 getLogImpPerEecDataProvider() {
        return logImpPerEecDataProvider;
    }

    public void setLogImpPerEecDataProvider(LogImpPerEecCachedRowSetDataProvider2 crsdp) {
        this.logImpPerEecDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public LogImpPerEec5() {
    }

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para el manejo de eventos de la pagina: init, preprocess, prerender y destroy">
    @Override
    //@PostConstruct
    public void init() {
        // Realizar iniciaciones heredadas de la superclase
        super.init();
        // Realizar iniciaciones que deben finalizar **antes** de que se inicien los componentes administrados
        this.preiniciar();
        // <editor-fold defaultstate="collapsed" desc="Inicio de componentes administrados por el programa">
        // Iniciar componentes administrados automaticamente
        // *Nota* - esta logica NO debe modificarse
        try {
            _init();
        } catch (Exception e) {
            log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
        // </editor-fold>
        // Realizar iniciaciones que deben finalizar *despues* de que se inicien los componentes administrados
        this.iniciar();
    }

    @Override
    public void preprocess() {
        this.preprocesar();
    }

    @Override
    public void prerender() {
        this.prepresentar();
    }

    @Override
    //@PreDestroy
    public void destroy() {
        logImpPerEecDataProvider.close();
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades estandar para el manejo de los beans de contexto: request, session y application">
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades y metodos de la interfaz PaginaAbstracta">
    @Override
    public FacesContext getFacesContext() {
        return super.getFacesContext();
    }

    @Override
    public Object getBean(String name) {
        return super.getBean(name);
    }

    @Override
    public boolean isPostBack() {
        return super.isPostBack();
    }

    @Override
    public void erase() {
        super.erase();
    }

    @Override
    public void info(String summary) {
        super.info(summary);
    }

    @Override
    public void warn(String summary) {
        super.warn(summary);
    }

    @Override
    public void error(String summary) {
        super.error(summary);
    }

    @Override
    public void fatal(String summary) {
        super.fatal(summary);
    }

    @Override
    public void log(String message) {
        super.log(message);
    }

    @Override
    public void log(String message, Throwable throwable) {
        super.log(message, throwable);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades de la interfaz PaginaBasica">
    @Override
    public ContextoPeticionEstandar getContextoPeticion() {
        return (ContextoPeticionEstandar) this.getRequestBean1().getContextoPeticion();
    }

    @Override
    public ContextoSesionEstandar getContextoSesion() {
        return (ContextoSesionEstandar) this.getSessionBean1().getContextoSesion();
    }

    @Override
    public ContextoAplicacionEstandar getContextoAplicacion() {
        return (ContextoAplicacionEstandar) this.getApplicationBean1().getContextoAplicacion();
    }

    @Override
    public String getEtiquetaMigasPan() {
        return ETIQUETA_MIGAS_PAN;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades de la interfaz PaginaConsulta">
    @Override
    public boolean isConsultaPendiente() {
        return this.getGestor().isConsultaPendiente();
    }

    @Override
    public void setConsultaPendiente(boolean consultaPendiente) {
        this.getGestor().setConsultaPendiente(consultaPendiente);
    }

    @Override
    public String getEtiquetaClaseDetalle() {
        return ETIQUETA_CLASE_DETALLE;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades de la interfaz PaginaConsultaConMaestro">
    public String getEtiquetaClaseMaestro() {
        return ETIQUETA_CLASE_MAESTRO;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionLogImpPerEec...">
    @Override
    public TextField getTextFieldCampoFechaHoraTransaccion1() {
        return this.getCampoFechaHoraTransaccion1();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion con tabla">
    private GestorPaginaActualizacionConTabla gestor = new GestorPaginaActualizacionConTabla(this);

    @Override
    public GestorPaginaActualizacionConTabla getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionLogImpPerEec asistente = new AsistentePaginaActualizacionLogImpPerEec(this);

    public AsistentePaginaActualizacionLogImpPerEec getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("LogImpPerEec5_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("LogImpPerEec5_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("LogImpPerEec5_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getLogImpPerEecDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return LogImpPerEecCachedRowSetDataProvider2.FUNCION_CONSULTAR_LOG_IMP_PER_EEC;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return -1;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return -1;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return -1;
    }

    @Override
    public Option[] getOpcionesListaFuncionEdicion() {
        return this.getAsistente().getOpcionesListaFuncionEdicion();
    }

    @Override
    public Option[] getOpcionesListaFuncionAccion() {
        return this.getAsistente().getOpcionesListaFuncionAccion();
    }

    public RecursoCachedRowSetDataProvider getRecursoMaestroDataProvider() {
        return null;
    }

    public String getColumnaIdentificacionRecursoMaestro() {
        return null;
    }

    @Override
    public String getVinculoPaginaConsultaConArbol() {
        return "arbol";
    }

    @Override
    public String getVinculoPaginaConsultaDetalle() {
        return "detalle";
    }

    public String getScriptAbrirVentanaVerDetalle() {
        return null;
    }

    protected void preiniciar() {
        /*
         * Esta funcion debe ejecutarse al comienzo de init(),
         * *antes* de que se inicien los componentes administrados.
         */
        this.getGestor().preiniciar();
    }

    protected void iniciar() {
        /*
         * Esta funcion debe ejecutarse al final de init(),
         * *despues* de que se inicien los componentes administrados.
         */
        this.getGestor().iniciar();
    }

    protected void preprocesar() {
        /*
         * Esta funcion debe ejecutarse al final de preprocess().
         */
        this.getGestor().preprocesar();
    }

    protected void prepresentar() {
        /*
         * Esta funcion debe ejecutarse al final de prerender().
         */
        this.getGestor().prepresentar();
    }

    @Override
    public void consultar() {
        FiltroBusqueda filtro = this.getGestor().getFiltroBusqueda(
                this.getContextoPeticion().getFiltroFuncionSelect(),
                this.getContextoPeticion().getCodigoFuncionSelect(),
                this.getContextoPeticion().getNombreFuncionSelect());

        this.consultar(filtro);
    }

    @Override
    public void consultar(Long filtro) {
        try {
            this.getLogImpPerEecDataProvider().consultarLogImpPerEec(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getLogImpPerEecDataProvider().consultarLogImpPerEec(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void posconsultar() {
    /*
     * ejecutar las funciones de consulta de los data provider "secundarios" de la pagina,
     * tales como, por ejemplo, los data provider de las listas desplegables y otros componentes,
     * que NO correspondan a recursos del tipo "Gestión Manual" (NO modificables por el usuario).
     */

    /*
     * invocar posrefrescar() para consultar los recursos del tipo "Gestión Manual".
     */
    // this.posrefrescar();
    }

    @Override
    public void posrefrescar() {
    /*
     * ejecutar las funciones de consulta de los data provider "secundarios" de la pagina,
     * tales como, por ejemplo, los data provider de las listas desplegables y otros componentes,
     * que correspondan a recursos del tipo "Gestión Manual" (modificables por el usuario).
     */
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para refrescar, agregar, editar, deshacer y eliminar de la plantilla #1">
    public String botonEscogerFila1_action() {
        this.getGestor().escoger();
        return null;
    }

    public String botonDetallarFila1_action() {
        if (this.getGestor().escoger()) {
            return this.getGestor().accionVincularDetalle();
        }
        return null;
    }

    public String botonRetornarFila1_action() {
        this.getGestor().retornar();
        return null;
    }

    public String hipervinculoDetallarFila1_action() {
        if (this.getGestor().escoger()) {
            return this.getGestor().accionVincularDetalle();
        }
        return null;
    }

    public String botonRepaginar1_action() {
        this.getGestor().repaginar();
        return null;
    }

    public String botonAgregar1_action() {
        if (this.getGestor().agregar()) {
            return this.getGestor().accionVincularDetalle();
        }
        return null;
    }

    public String botonEditar1_action() {
        this.getGestor().editar();
        return null;
    }

    public String botonEliminar1_action() {
        this.getGestor().eliminar();
        return null;
    }

    public String botonAplicar1_action() {
        this.getGestor().aplicar();
        return null;
    }

    public String botonDeshacer1_action() {
        this.getGestor().deshacer();
        return null;
    }

    public String botonConfirmar1_action() {
        this.getGestor().confirmar();
        return null;
    }

    public String botonDescartar1_action() {
        this.getGestor().descartar();
        return null;
    }

    public String botonProcesar1_action() {
        this.getAsistente().procesar();
        return null;
    }

    public String botonRefrescar1_action() {
        this.getGestor().refrescar();
        return null;
    }

    public String botonReconsultar1_action() {
        this.getGestor().reconsultar();
        return null;
    }

    public String botonRetornar1_action() {
        this.getGestor().retornar();
        return null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para validar referencias">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las acciones de los hipervinculos">
    public String imageHyperlink1_action() {
        if (this.getGestor().vincular()) {
        } else {
            return null;
        }
        return "case1";
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las acciones especificas de la pagina">
    public String botonProcesarFila1_action() {
        return null;
    }

    public String getScriptAbrirVentanaProcesarFila1() {
        return null;
    }

    public String hipervinculoAccionFila1_action() {
        this.getGestor().escoger();
        this.getGestor().procesar(new RowProcessor() {
            // override metodo processRow
            @Override
            public void processRow(RowKey rowKey) throws Exception {
                accionFila1(rowKey);
            }
        });
        return null;
    }

    public String getScriptAbrirVentanaAccionFila1() {
        return null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para ejecutar funciones">
    public void accionFila1(RowKey rowKey) {
        long funcion = -1; /* TODO: cambiar -1 por el id de la funcion a ejecutar */
        boolean ok = this.getRecursoDataProvider().esFilaAutorizada(rowKey, funcion);
        if (ok) {
            // TODO: ejecutar funcion
        }
    }
 
    // </editor-fold>
/**/
    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
