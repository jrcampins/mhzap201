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

import com.egt.data.specific.xdp2.LogImpHogEecCachedRowSetDataProvider2;
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

public class LogImpHogEec5 extends AbstractPageBean
        implements PaginaActualizacionLogImpHogEec, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdLogImpHogEec1.setMinimum(0L);
        validatorIdLogImpHogEec1.setMaximum(1000000000000000000L);
        validatorDptod1.setMaximum(8160);
        validatorDistritod1.setMaximum(8160);
        validatorDistripg1.setMaximum(8160);
        validatorArea1.setMaximum(8160);
        validatorBarrio1.setMaximum(8160);
        validatorManzana1.setMaximum(8160);
        validatorFormulario1.setMaximum(8160);
        validatorVivi1.setMaximum(8160);
        validatorHogar1.setMaximum(8160);
        validatorDireccion1.setMaximum(8160);
        validatorNroDe1.setMaximum(8160);
        validatorTelefono1.setMaximum(8160);
        validatorFecha1.setMaximum(8160);
        validatorDia1.setMaximum(8160);
        validatorMes1.setMaximum(8160);
        validatorAno1.setMaximum(8160);
        validatorV10t1.setMaximum(8160);
        validatorV111.setMaximum(8160);
        validatorV121.setMaximum(8160);
        validatorV131.setMaximum(8160);
        validatorV141.setMaximum(8160);
        validatorV151.setMaximum(8160);
        validatorV161.setMaximum(8160);
        validatorV16Otr1.setMaximum(8160);
        validatorV17a1.setMaximum(8160);
        validatorV17b1.setMaximum(8160);
        validatorV181.setMaximum(8160);
        validatorV191.setMaximum(8160);
        validatorV201.setMaximum(8160);
        validatorV211.setMaximum(8160);
        validatorV221.setMaximum(8160);
        validatorV231.setMaximum(8160);
        validatorV241.setMaximum(8160);
        validatorV251.setMaximum(8160);
        validatorV261.setMaximum(8160);
        validatorV26espCelular1.setMaximum(8160);
        validatorV271.setMaximum(8160);
        validatorV27espLinea1.setMaximum(8160);
        validatorV2811.setMaximum(8160);
        validatorV2821.setMaximum(8160);
        validatorV2831.setMaximum(8160);
        validatorV2841.setMaximum(8160);
        validatorV2851.setMaximum(8160);
        validatorV2861.setMaximum(8160);
        validatorV2871.setMaximum(8160);
        validatorV2881.setMaximum(8160);
        validatorV29nombreJefe1.setMaximum(8160);
        validatorCedulajefe1.setMaximum(8160);
        validatorVar000011.setMaximum(8160);
        validatorObservacion1.setMaximum(8160);
        converterFechaHoraTransaccion1.setPattern("dd/MM/yyyy hh:mm aa");
        converterFechaHoraTransaccion1.setType("both");
        validatorNombreArchivo1.setMaximum(8160);
        validatorCodigoArchivo1.setMaximum(8160);
        logImpHogEecDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.logImpHogEecRowSet}"));
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

    private TableColumn tableColumnIdLogImpHogEec1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdLogImpHogEec1() {
        return tableColumnIdLogImpHogEec1;
    }

    public void setTableColumnIdLogImpHogEec1(TableColumn component) {
        this.tableColumnIdLogImpHogEec1 = component;
    }

    private Label labelIdLogImpHogEec1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdLogImpHogEec1() {
        return labelIdLogImpHogEec1;
    }

    public void setLabelIdLogImpHogEec1(Label l) {
        this.labelIdLogImpHogEec1 = l;
    }

    private TextField campoIdLogImpHogEec1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdLogImpHogEec1() {
        return campoIdLogImpHogEec1;
    }

    public void setCampoIdLogImpHogEec1(TextField component) {
        this.campoIdLogImpHogEec1 = component;
    }

    private StaticText campoIdLogImpHogEec1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdLogImpHogEec1Texto1() {
        return campoIdLogImpHogEec1Texto1;
    }

    public void setCampoIdLogImpHogEec1Texto1(StaticText component) {
        this.campoIdLogImpHogEec1Texto1 = component;
    }

    private LongConverter converterIdLogImpHogEec1 = new LongConverter();
  
    public LongConverter getConverterIdLogImpHogEec1() {
        return converterIdLogImpHogEec1;
    }
  
    public void setConverterIdLogImpHogEec1(LongConverter converter) {
        this.converterIdLogImpHogEec1 = converter;
    }
  
    private LongRangeValidator validatorIdLogImpHogEec1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdLogImpHogEec1() {
        return validatorIdLogImpHogEec1;
    }
  
    public void setValidatorIdLogImpHogEec1(LongRangeValidator validator) {
        this.validatorIdLogImpHogEec1 = validator;
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
  
    private TableColumn tableColumnDireccion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnDireccion1() {
        return tableColumnDireccion1;
    }

    public void setTableColumnDireccion1(TableColumn component) {
        this.tableColumnDireccion1 = component;
    }

    private Label labelDireccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDireccion1() {
        return labelDireccion1;
    }

    public void setLabelDireccion1(Label l) {
        this.labelDireccion1 = l;
    }

    private TextArea campoDireccion1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDireccion1() {
        return campoDireccion1;
    }

    public void setCampoDireccion1(TextArea component) {
        this.campoDireccion1 = component;
    }

    private StaticText campoDireccion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDireccion1Texto1() {
        return campoDireccion1Texto1;
    }

    public void setCampoDireccion1Texto1(StaticText component) {
        this.campoDireccion1Texto1 = component;
    }

    private LengthValidator validatorDireccion1 = new LengthValidator();
  
    public LengthValidator getValidatorDireccion1() {
        return validatorDireccion1;
    }
  
    public void setValidatorDireccion1(LengthValidator validator) {
        this.validatorDireccion1 = validator;
    }
  
    private TableColumn tableColumnNroDe1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNroDe1() {
        return tableColumnNroDe1;
    }

    public void setTableColumnNroDe1(TableColumn component) {
        this.tableColumnNroDe1 = component;
    }

    private Label labelNroDe1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNroDe1() {
        return labelNroDe1;
    }

    public void setLabelNroDe1(Label l) {
        this.labelNroDe1 = l;
    }

    private TextArea campoNroDe1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNroDe1() {
        return campoNroDe1;
    }

    public void setCampoNroDe1(TextArea component) {
        this.campoNroDe1 = component;
    }

    private StaticText campoNroDe1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNroDe1Texto1() {
        return campoNroDe1Texto1;
    }

    public void setCampoNroDe1Texto1(StaticText component) {
        this.campoNroDe1Texto1 = component;
    }

    private LengthValidator validatorNroDe1 = new LengthValidator();
  
    public LengthValidator getValidatorNroDe1() {
        return validatorNroDe1;
    }
  
    public void setValidatorNroDe1(LengthValidator validator) {
        this.validatorNroDe1 = validator;
    }
  
    private TableColumn tableColumnTelefono1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnTelefono1() {
        return tableColumnTelefono1;
    }

    public void setTableColumnTelefono1(TableColumn component) {
        this.tableColumnTelefono1 = component;
    }

    private Label labelTelefono1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelTelefono1() {
        return labelTelefono1;
    }

    public void setLabelTelefono1(Label l) {
        this.labelTelefono1 = l;
    }

    private TextArea campoTelefono1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoTelefono1() {
        return campoTelefono1;
    }

    public void setCampoTelefono1(TextArea component) {
        this.campoTelefono1 = component;
    }

    private StaticText campoTelefono1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoTelefono1Texto1() {
        return campoTelefono1Texto1;
    }

    public void setCampoTelefono1Texto1(StaticText component) {
        this.campoTelefono1Texto1 = component;
    }

    private LengthValidator validatorTelefono1 = new LengthValidator();
  
    public LengthValidator getValidatorTelefono1() {
        return validatorTelefono1;
    }
  
    public void setValidatorTelefono1(LengthValidator validator) {
        this.validatorTelefono1 = validator;
    }
  
    private TableColumn tableColumnFecha1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFecha1() {
        return tableColumnFecha1;
    }

    public void setTableColumnFecha1(TableColumn component) {
        this.tableColumnFecha1 = component;
    }

    private Label labelFecha1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFecha1() {
        return labelFecha1;
    }

    public void setLabelFecha1(Label l) {
        this.labelFecha1 = l;
    }

    private TextArea campoFecha1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoFecha1() {
        return campoFecha1;
    }

    public void setCampoFecha1(TextArea component) {
        this.campoFecha1 = component;
    }

    private StaticText campoFecha1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFecha1Texto1() {
        return campoFecha1Texto1;
    }

    public void setCampoFecha1Texto1(StaticText component) {
        this.campoFecha1Texto1 = component;
    }

    private LengthValidator validatorFecha1 = new LengthValidator();
  
    public LengthValidator getValidatorFecha1() {
        return validatorFecha1;
    }
  
    public void setValidatorFecha1(LengthValidator validator) {
        this.validatorFecha1 = validator;
    }
  
    private TableColumn tableColumnDia1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnDia1() {
        return tableColumnDia1;
    }

    public void setTableColumnDia1(TableColumn component) {
        this.tableColumnDia1 = component;
    }

    private Label labelDia1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDia1() {
        return labelDia1;
    }

    public void setLabelDia1(Label l) {
        this.labelDia1 = l;
    }

    private TextArea campoDia1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDia1() {
        return campoDia1;
    }

    public void setCampoDia1(TextArea component) {
        this.campoDia1 = component;
    }

    private StaticText campoDia1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDia1Texto1() {
        return campoDia1Texto1;
    }

    public void setCampoDia1Texto1(StaticText component) {
        this.campoDia1Texto1 = component;
    }

    private LengthValidator validatorDia1 = new LengthValidator();
  
    public LengthValidator getValidatorDia1() {
        return validatorDia1;
    }
  
    public void setValidatorDia1(LengthValidator validator) {
        this.validatorDia1 = validator;
    }
  
    private TableColumn tableColumnMes1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnMes1() {
        return tableColumnMes1;
    }

    public void setTableColumnMes1(TableColumn component) {
        this.tableColumnMes1 = component;
    }

    private Label labelMes1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMes1() {
        return labelMes1;
    }

    public void setLabelMes1(Label l) {
        this.labelMes1 = l;
    }

    private TextArea campoMes1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoMes1() {
        return campoMes1;
    }

    public void setCampoMes1(TextArea component) {
        this.campoMes1 = component;
    }

    private StaticText campoMes1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMes1Texto1() {
        return campoMes1Texto1;
    }

    public void setCampoMes1Texto1(StaticText component) {
        this.campoMes1Texto1 = component;
    }

    private LengthValidator validatorMes1 = new LengthValidator();
  
    public LengthValidator getValidatorMes1() {
        return validatorMes1;
    }
  
    public void setValidatorMes1(LengthValidator validator) {
        this.validatorMes1 = validator;
    }
  
    private TableColumn tableColumnAno1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnAno1() {
        return tableColumnAno1;
    }

    public void setTableColumnAno1(TableColumn component) {
        this.tableColumnAno1 = component;
    }

    private Label labelAno1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelAno1() {
        return labelAno1;
    }

    public void setLabelAno1(Label l) {
        this.labelAno1 = l;
    }

    private TextArea campoAno1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoAno1() {
        return campoAno1;
    }

    public void setCampoAno1(TextArea component) {
        this.campoAno1 = component;
    }

    private StaticText campoAno1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoAno1Texto1() {
        return campoAno1Texto1;
    }

    public void setCampoAno1Texto1(StaticText component) {
        this.campoAno1Texto1 = component;
    }

    private LengthValidator validatorAno1 = new LengthValidator();
  
    public LengthValidator getValidatorAno1() {
        return validatorAno1;
    }
  
    public void setValidatorAno1(LengthValidator validator) {
        this.validatorAno1 = validator;
    }
  
    private TableColumn tableColumnV10t1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV10t1() {
        return tableColumnV10t1;
    }

    public void setTableColumnV10t1(TableColumn component) {
        this.tableColumnV10t1 = component;
    }

    private Label labelV10t1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV10t1() {
        return labelV10t1;
    }

    public void setLabelV10t1(Label l) {
        this.labelV10t1 = l;
    }

    private TextArea campoV10t1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV10t1() {
        return campoV10t1;
    }

    public void setCampoV10t1(TextArea component) {
        this.campoV10t1 = component;
    }

    private StaticText campoV10t1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV10t1Texto1() {
        return campoV10t1Texto1;
    }

    public void setCampoV10t1Texto1(StaticText component) {
        this.campoV10t1Texto1 = component;
    }

    private LengthValidator validatorV10t1 = new LengthValidator();
  
    public LengthValidator getValidatorV10t1() {
        return validatorV10t1;
    }
  
    public void setValidatorV10t1(LengthValidator validator) {
        this.validatorV10t1 = validator;
    }
  
    private TableColumn tableColumnV111 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV111() {
        return tableColumnV111;
    }

    public void setTableColumnV111(TableColumn component) {
        this.tableColumnV111 = component;
    }

    private Label labelV111 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV111() {
        return labelV111;
    }

    public void setLabelV111(Label l) {
        this.labelV111 = l;
    }

    private TextArea campoV111 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV111() {
        return campoV111;
    }

    public void setCampoV111(TextArea component) {
        this.campoV111 = component;
    }

    private StaticText campoV111Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV111Texto1() {
        return campoV111Texto1;
    }

    public void setCampoV111Texto1(StaticText component) {
        this.campoV111Texto1 = component;
    }

    private LengthValidator validatorV111 = new LengthValidator();
  
    public LengthValidator getValidatorV111() {
        return validatorV111;
    }
  
    public void setValidatorV111(LengthValidator validator) {
        this.validatorV111 = validator;
    }
  
    private TableColumn tableColumnV121 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV121() {
        return tableColumnV121;
    }

    public void setTableColumnV121(TableColumn component) {
        this.tableColumnV121 = component;
    }

    private Label labelV121 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV121() {
        return labelV121;
    }

    public void setLabelV121(Label l) {
        this.labelV121 = l;
    }

    private TextArea campoV121 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV121() {
        return campoV121;
    }

    public void setCampoV121(TextArea component) {
        this.campoV121 = component;
    }

    private StaticText campoV121Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV121Texto1() {
        return campoV121Texto1;
    }

    public void setCampoV121Texto1(StaticText component) {
        this.campoV121Texto1 = component;
    }

    private LengthValidator validatorV121 = new LengthValidator();
  
    public LengthValidator getValidatorV121() {
        return validatorV121;
    }
  
    public void setValidatorV121(LengthValidator validator) {
        this.validatorV121 = validator;
    }
  
    private TableColumn tableColumnV131 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV131() {
        return tableColumnV131;
    }

    public void setTableColumnV131(TableColumn component) {
        this.tableColumnV131 = component;
    }

    private Label labelV131 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV131() {
        return labelV131;
    }

    public void setLabelV131(Label l) {
        this.labelV131 = l;
    }

    private TextArea campoV131 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV131() {
        return campoV131;
    }

    public void setCampoV131(TextArea component) {
        this.campoV131 = component;
    }

    private StaticText campoV131Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV131Texto1() {
        return campoV131Texto1;
    }

    public void setCampoV131Texto1(StaticText component) {
        this.campoV131Texto1 = component;
    }

    private LengthValidator validatorV131 = new LengthValidator();
  
    public LengthValidator getValidatorV131() {
        return validatorV131;
    }
  
    public void setValidatorV131(LengthValidator validator) {
        this.validatorV131 = validator;
    }
  
    private TableColumn tableColumnV141 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV141() {
        return tableColumnV141;
    }

    public void setTableColumnV141(TableColumn component) {
        this.tableColumnV141 = component;
    }

    private Label labelV141 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV141() {
        return labelV141;
    }

    public void setLabelV141(Label l) {
        this.labelV141 = l;
    }

    private TextArea campoV141 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV141() {
        return campoV141;
    }

    public void setCampoV141(TextArea component) {
        this.campoV141 = component;
    }

    private StaticText campoV141Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV141Texto1() {
        return campoV141Texto1;
    }

    public void setCampoV141Texto1(StaticText component) {
        this.campoV141Texto1 = component;
    }

    private LengthValidator validatorV141 = new LengthValidator();
  
    public LengthValidator getValidatorV141() {
        return validatorV141;
    }
  
    public void setValidatorV141(LengthValidator validator) {
        this.validatorV141 = validator;
    }
  
    private TableColumn tableColumnV151 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV151() {
        return tableColumnV151;
    }

    public void setTableColumnV151(TableColumn component) {
        this.tableColumnV151 = component;
    }

    private Label labelV151 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV151() {
        return labelV151;
    }

    public void setLabelV151(Label l) {
        this.labelV151 = l;
    }

    private TextArea campoV151 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV151() {
        return campoV151;
    }

    public void setCampoV151(TextArea component) {
        this.campoV151 = component;
    }

    private StaticText campoV151Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV151Texto1() {
        return campoV151Texto1;
    }

    public void setCampoV151Texto1(StaticText component) {
        this.campoV151Texto1 = component;
    }

    private LengthValidator validatorV151 = new LengthValidator();
  
    public LengthValidator getValidatorV151() {
        return validatorV151;
    }
  
    public void setValidatorV151(LengthValidator validator) {
        this.validatorV151 = validator;
    }
  
    private TableColumn tableColumnV161 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV161() {
        return tableColumnV161;
    }

    public void setTableColumnV161(TableColumn component) {
        this.tableColumnV161 = component;
    }

    private Label labelV161 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV161() {
        return labelV161;
    }

    public void setLabelV161(Label l) {
        this.labelV161 = l;
    }

    private TextArea campoV161 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV161() {
        return campoV161;
    }

    public void setCampoV161(TextArea component) {
        this.campoV161 = component;
    }

    private StaticText campoV161Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV161Texto1() {
        return campoV161Texto1;
    }

    public void setCampoV161Texto1(StaticText component) {
        this.campoV161Texto1 = component;
    }

    private LengthValidator validatorV161 = new LengthValidator();
  
    public LengthValidator getValidatorV161() {
        return validatorV161;
    }
  
    public void setValidatorV161(LengthValidator validator) {
        this.validatorV161 = validator;
    }
  
    private TableColumn tableColumnV16Otr1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV16Otr1() {
        return tableColumnV16Otr1;
    }

    public void setTableColumnV16Otr1(TableColumn component) {
        this.tableColumnV16Otr1 = component;
    }

    private Label labelV16Otr1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV16Otr1() {
        return labelV16Otr1;
    }

    public void setLabelV16Otr1(Label l) {
        this.labelV16Otr1 = l;
    }

    private TextArea campoV16Otr1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV16Otr1() {
        return campoV16Otr1;
    }

    public void setCampoV16Otr1(TextArea component) {
        this.campoV16Otr1 = component;
    }

    private StaticText campoV16Otr1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV16Otr1Texto1() {
        return campoV16Otr1Texto1;
    }

    public void setCampoV16Otr1Texto1(StaticText component) {
        this.campoV16Otr1Texto1 = component;
    }

    private LengthValidator validatorV16Otr1 = new LengthValidator();
  
    public LengthValidator getValidatorV16Otr1() {
        return validatorV16Otr1;
    }
  
    public void setValidatorV16Otr1(LengthValidator validator) {
        this.validatorV16Otr1 = validator;
    }
  
    private TableColumn tableColumnV17a1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV17a1() {
        return tableColumnV17a1;
    }

    public void setTableColumnV17a1(TableColumn component) {
        this.tableColumnV17a1 = component;
    }

    private Label labelV17a1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV17a1() {
        return labelV17a1;
    }

    public void setLabelV17a1(Label l) {
        this.labelV17a1 = l;
    }

    private TextArea campoV17a1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV17a1() {
        return campoV17a1;
    }

    public void setCampoV17a1(TextArea component) {
        this.campoV17a1 = component;
    }

    private StaticText campoV17a1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV17a1Texto1() {
        return campoV17a1Texto1;
    }

    public void setCampoV17a1Texto1(StaticText component) {
        this.campoV17a1Texto1 = component;
    }

    private LengthValidator validatorV17a1 = new LengthValidator();
  
    public LengthValidator getValidatorV17a1() {
        return validatorV17a1;
    }
  
    public void setValidatorV17a1(LengthValidator validator) {
        this.validatorV17a1 = validator;
    }
  
    private TableColumn tableColumnV17b1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV17b1() {
        return tableColumnV17b1;
    }

    public void setTableColumnV17b1(TableColumn component) {
        this.tableColumnV17b1 = component;
    }

    private Label labelV17b1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV17b1() {
        return labelV17b1;
    }

    public void setLabelV17b1(Label l) {
        this.labelV17b1 = l;
    }

    private TextArea campoV17b1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV17b1() {
        return campoV17b1;
    }

    public void setCampoV17b1(TextArea component) {
        this.campoV17b1 = component;
    }

    private StaticText campoV17b1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV17b1Texto1() {
        return campoV17b1Texto1;
    }

    public void setCampoV17b1Texto1(StaticText component) {
        this.campoV17b1Texto1 = component;
    }

    private LengthValidator validatorV17b1 = new LengthValidator();
  
    public LengthValidator getValidatorV17b1() {
        return validatorV17b1;
    }
  
    public void setValidatorV17b1(LengthValidator validator) {
        this.validatorV17b1 = validator;
    }
  
    private TableColumn tableColumnV181 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV181() {
        return tableColumnV181;
    }

    public void setTableColumnV181(TableColumn component) {
        this.tableColumnV181 = component;
    }

    private Label labelV181 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV181() {
        return labelV181;
    }

    public void setLabelV181(Label l) {
        this.labelV181 = l;
    }

    private TextArea campoV181 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV181() {
        return campoV181;
    }

    public void setCampoV181(TextArea component) {
        this.campoV181 = component;
    }

    private StaticText campoV181Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV181Texto1() {
        return campoV181Texto1;
    }

    public void setCampoV181Texto1(StaticText component) {
        this.campoV181Texto1 = component;
    }

    private LengthValidator validatorV181 = new LengthValidator();
  
    public LengthValidator getValidatorV181() {
        return validatorV181;
    }
  
    public void setValidatorV181(LengthValidator validator) {
        this.validatorV181 = validator;
    }
  
    private TableColumn tableColumnV191 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV191() {
        return tableColumnV191;
    }

    public void setTableColumnV191(TableColumn component) {
        this.tableColumnV191 = component;
    }

    private Label labelV191 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV191() {
        return labelV191;
    }

    public void setLabelV191(Label l) {
        this.labelV191 = l;
    }

    private TextArea campoV191 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV191() {
        return campoV191;
    }

    public void setCampoV191(TextArea component) {
        this.campoV191 = component;
    }

    private StaticText campoV191Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV191Texto1() {
        return campoV191Texto1;
    }

    public void setCampoV191Texto1(StaticText component) {
        this.campoV191Texto1 = component;
    }

    private LengthValidator validatorV191 = new LengthValidator();
  
    public LengthValidator getValidatorV191() {
        return validatorV191;
    }
  
    public void setValidatorV191(LengthValidator validator) {
        this.validatorV191 = validator;
    }
  
    private TableColumn tableColumnV201 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV201() {
        return tableColumnV201;
    }

    public void setTableColumnV201(TableColumn component) {
        this.tableColumnV201 = component;
    }

    private Label labelV201 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV201() {
        return labelV201;
    }

    public void setLabelV201(Label l) {
        this.labelV201 = l;
    }

    private TextArea campoV201 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV201() {
        return campoV201;
    }

    public void setCampoV201(TextArea component) {
        this.campoV201 = component;
    }

    private StaticText campoV201Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV201Texto1() {
        return campoV201Texto1;
    }

    public void setCampoV201Texto1(StaticText component) {
        this.campoV201Texto1 = component;
    }

    private LengthValidator validatorV201 = new LengthValidator();
  
    public LengthValidator getValidatorV201() {
        return validatorV201;
    }
  
    public void setValidatorV201(LengthValidator validator) {
        this.validatorV201 = validator;
    }
  
    private TableColumn tableColumnV211 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV211() {
        return tableColumnV211;
    }

    public void setTableColumnV211(TableColumn component) {
        this.tableColumnV211 = component;
    }

    private Label labelV211 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV211() {
        return labelV211;
    }

    public void setLabelV211(Label l) {
        this.labelV211 = l;
    }

    private TextArea campoV211 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV211() {
        return campoV211;
    }

    public void setCampoV211(TextArea component) {
        this.campoV211 = component;
    }

    private StaticText campoV211Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV211Texto1() {
        return campoV211Texto1;
    }

    public void setCampoV211Texto1(StaticText component) {
        this.campoV211Texto1 = component;
    }

    private LengthValidator validatorV211 = new LengthValidator();
  
    public LengthValidator getValidatorV211() {
        return validatorV211;
    }
  
    public void setValidatorV211(LengthValidator validator) {
        this.validatorV211 = validator;
    }
  
    private TableColumn tableColumnV221 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV221() {
        return tableColumnV221;
    }

    public void setTableColumnV221(TableColumn component) {
        this.tableColumnV221 = component;
    }

    private Label labelV221 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV221() {
        return labelV221;
    }

    public void setLabelV221(Label l) {
        this.labelV221 = l;
    }

    private TextArea campoV221 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV221() {
        return campoV221;
    }

    public void setCampoV221(TextArea component) {
        this.campoV221 = component;
    }

    private StaticText campoV221Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV221Texto1() {
        return campoV221Texto1;
    }

    public void setCampoV221Texto1(StaticText component) {
        this.campoV221Texto1 = component;
    }

    private LengthValidator validatorV221 = new LengthValidator();
  
    public LengthValidator getValidatorV221() {
        return validatorV221;
    }
  
    public void setValidatorV221(LengthValidator validator) {
        this.validatorV221 = validator;
    }
  
    private TableColumn tableColumnV231 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV231() {
        return tableColumnV231;
    }

    public void setTableColumnV231(TableColumn component) {
        this.tableColumnV231 = component;
    }

    private Label labelV231 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV231() {
        return labelV231;
    }

    public void setLabelV231(Label l) {
        this.labelV231 = l;
    }

    private TextArea campoV231 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV231() {
        return campoV231;
    }

    public void setCampoV231(TextArea component) {
        this.campoV231 = component;
    }

    private StaticText campoV231Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV231Texto1() {
        return campoV231Texto1;
    }

    public void setCampoV231Texto1(StaticText component) {
        this.campoV231Texto1 = component;
    }

    private LengthValidator validatorV231 = new LengthValidator();
  
    public LengthValidator getValidatorV231() {
        return validatorV231;
    }
  
    public void setValidatorV231(LengthValidator validator) {
        this.validatorV231 = validator;
    }
  
    private TableColumn tableColumnV241 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV241() {
        return tableColumnV241;
    }

    public void setTableColumnV241(TableColumn component) {
        this.tableColumnV241 = component;
    }

    private Label labelV241 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV241() {
        return labelV241;
    }

    public void setLabelV241(Label l) {
        this.labelV241 = l;
    }

    private TextArea campoV241 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV241() {
        return campoV241;
    }

    public void setCampoV241(TextArea component) {
        this.campoV241 = component;
    }

    private StaticText campoV241Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV241Texto1() {
        return campoV241Texto1;
    }

    public void setCampoV241Texto1(StaticText component) {
        this.campoV241Texto1 = component;
    }

    private LengthValidator validatorV241 = new LengthValidator();
  
    public LengthValidator getValidatorV241() {
        return validatorV241;
    }
  
    public void setValidatorV241(LengthValidator validator) {
        this.validatorV241 = validator;
    }
  
    private TableColumn tableColumnV251 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV251() {
        return tableColumnV251;
    }

    public void setTableColumnV251(TableColumn component) {
        this.tableColumnV251 = component;
    }

    private Label labelV251 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV251() {
        return labelV251;
    }

    public void setLabelV251(Label l) {
        this.labelV251 = l;
    }

    private TextArea campoV251 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV251() {
        return campoV251;
    }

    public void setCampoV251(TextArea component) {
        this.campoV251 = component;
    }

    private StaticText campoV251Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV251Texto1() {
        return campoV251Texto1;
    }

    public void setCampoV251Texto1(StaticText component) {
        this.campoV251Texto1 = component;
    }

    private LengthValidator validatorV251 = new LengthValidator();
  
    public LengthValidator getValidatorV251() {
        return validatorV251;
    }
  
    public void setValidatorV251(LengthValidator validator) {
        this.validatorV251 = validator;
    }
  
    private TableColumn tableColumnV261 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV261() {
        return tableColumnV261;
    }

    public void setTableColumnV261(TableColumn component) {
        this.tableColumnV261 = component;
    }

    private Label labelV261 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV261() {
        return labelV261;
    }

    public void setLabelV261(Label l) {
        this.labelV261 = l;
    }

    private TextArea campoV261 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV261() {
        return campoV261;
    }

    public void setCampoV261(TextArea component) {
        this.campoV261 = component;
    }

    private StaticText campoV261Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV261Texto1() {
        return campoV261Texto1;
    }

    public void setCampoV261Texto1(StaticText component) {
        this.campoV261Texto1 = component;
    }

    private LengthValidator validatorV261 = new LengthValidator();
  
    public LengthValidator getValidatorV261() {
        return validatorV261;
    }
  
    public void setValidatorV261(LengthValidator validator) {
        this.validatorV261 = validator;
    }
  
    private TableColumn tableColumnV26espCelular1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV26espCelular1() {
        return tableColumnV26espCelular1;
    }

    public void setTableColumnV26espCelular1(TableColumn component) {
        this.tableColumnV26espCelular1 = component;
    }

    private Label labelV26espCelular1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV26espCelular1() {
        return labelV26espCelular1;
    }

    public void setLabelV26espCelular1(Label l) {
        this.labelV26espCelular1 = l;
    }

    private TextArea campoV26espCelular1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV26espCelular1() {
        return campoV26espCelular1;
    }

    public void setCampoV26espCelular1(TextArea component) {
        this.campoV26espCelular1 = component;
    }

    private StaticText campoV26espCelular1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV26espCelular1Texto1() {
        return campoV26espCelular1Texto1;
    }

    public void setCampoV26espCelular1Texto1(StaticText component) {
        this.campoV26espCelular1Texto1 = component;
    }

    private LengthValidator validatorV26espCelular1 = new LengthValidator();
  
    public LengthValidator getValidatorV26espCelular1() {
        return validatorV26espCelular1;
    }
  
    public void setValidatorV26espCelular1(LengthValidator validator) {
        this.validatorV26espCelular1 = validator;
    }
  
    private TableColumn tableColumnV271 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV271() {
        return tableColumnV271;
    }

    public void setTableColumnV271(TableColumn component) {
        this.tableColumnV271 = component;
    }

    private Label labelV271 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV271() {
        return labelV271;
    }

    public void setLabelV271(Label l) {
        this.labelV271 = l;
    }

    private TextArea campoV271 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV271() {
        return campoV271;
    }

    public void setCampoV271(TextArea component) {
        this.campoV271 = component;
    }

    private StaticText campoV271Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV271Texto1() {
        return campoV271Texto1;
    }

    public void setCampoV271Texto1(StaticText component) {
        this.campoV271Texto1 = component;
    }

    private LengthValidator validatorV271 = new LengthValidator();
  
    public LengthValidator getValidatorV271() {
        return validatorV271;
    }
  
    public void setValidatorV271(LengthValidator validator) {
        this.validatorV271 = validator;
    }
  
    private TableColumn tableColumnV27espLinea1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV27espLinea1() {
        return tableColumnV27espLinea1;
    }

    public void setTableColumnV27espLinea1(TableColumn component) {
        this.tableColumnV27espLinea1 = component;
    }

    private Label labelV27espLinea1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV27espLinea1() {
        return labelV27espLinea1;
    }

    public void setLabelV27espLinea1(Label l) {
        this.labelV27espLinea1 = l;
    }

    private TextArea campoV27espLinea1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV27espLinea1() {
        return campoV27espLinea1;
    }

    public void setCampoV27espLinea1(TextArea component) {
        this.campoV27espLinea1 = component;
    }

    private StaticText campoV27espLinea1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV27espLinea1Texto1() {
        return campoV27espLinea1Texto1;
    }

    public void setCampoV27espLinea1Texto1(StaticText component) {
        this.campoV27espLinea1Texto1 = component;
    }

    private LengthValidator validatorV27espLinea1 = new LengthValidator();
  
    public LengthValidator getValidatorV27espLinea1() {
        return validatorV27espLinea1;
    }
  
    public void setValidatorV27espLinea1(LengthValidator validator) {
        this.validatorV27espLinea1 = validator;
    }
  
    private TableColumn tableColumnV2811 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV2811() {
        return tableColumnV2811;
    }

    public void setTableColumnV2811(TableColumn component) {
        this.tableColumnV2811 = component;
    }

    private Label labelV2811 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV2811() {
        return labelV2811;
    }

    public void setLabelV2811(Label l) {
        this.labelV2811 = l;
    }

    private TextArea campoV2811 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV2811() {
        return campoV2811;
    }

    public void setCampoV2811(TextArea component) {
        this.campoV2811 = component;
    }

    private StaticText campoV2811Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV2811Texto1() {
        return campoV2811Texto1;
    }

    public void setCampoV2811Texto1(StaticText component) {
        this.campoV2811Texto1 = component;
    }

    private LengthValidator validatorV2811 = new LengthValidator();
  
    public LengthValidator getValidatorV2811() {
        return validatorV2811;
    }
  
    public void setValidatorV2811(LengthValidator validator) {
        this.validatorV2811 = validator;
    }
  
    private TableColumn tableColumnV2821 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV2821() {
        return tableColumnV2821;
    }

    public void setTableColumnV2821(TableColumn component) {
        this.tableColumnV2821 = component;
    }

    private Label labelV2821 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV2821() {
        return labelV2821;
    }

    public void setLabelV2821(Label l) {
        this.labelV2821 = l;
    }

    private TextArea campoV2821 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV2821() {
        return campoV2821;
    }

    public void setCampoV2821(TextArea component) {
        this.campoV2821 = component;
    }

    private StaticText campoV2821Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV2821Texto1() {
        return campoV2821Texto1;
    }

    public void setCampoV2821Texto1(StaticText component) {
        this.campoV2821Texto1 = component;
    }

    private LengthValidator validatorV2821 = new LengthValidator();
  
    public LengthValidator getValidatorV2821() {
        return validatorV2821;
    }
  
    public void setValidatorV2821(LengthValidator validator) {
        this.validatorV2821 = validator;
    }
  
    private TableColumn tableColumnV2831 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV2831() {
        return tableColumnV2831;
    }

    public void setTableColumnV2831(TableColumn component) {
        this.tableColumnV2831 = component;
    }

    private Label labelV2831 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV2831() {
        return labelV2831;
    }

    public void setLabelV2831(Label l) {
        this.labelV2831 = l;
    }

    private TextArea campoV2831 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV2831() {
        return campoV2831;
    }

    public void setCampoV2831(TextArea component) {
        this.campoV2831 = component;
    }

    private StaticText campoV2831Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV2831Texto1() {
        return campoV2831Texto1;
    }

    public void setCampoV2831Texto1(StaticText component) {
        this.campoV2831Texto1 = component;
    }

    private LengthValidator validatorV2831 = new LengthValidator();
  
    public LengthValidator getValidatorV2831() {
        return validatorV2831;
    }
  
    public void setValidatorV2831(LengthValidator validator) {
        this.validatorV2831 = validator;
    }
  
    private TableColumn tableColumnV2841 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV2841() {
        return tableColumnV2841;
    }

    public void setTableColumnV2841(TableColumn component) {
        this.tableColumnV2841 = component;
    }

    private Label labelV2841 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV2841() {
        return labelV2841;
    }

    public void setLabelV2841(Label l) {
        this.labelV2841 = l;
    }

    private TextArea campoV2841 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV2841() {
        return campoV2841;
    }

    public void setCampoV2841(TextArea component) {
        this.campoV2841 = component;
    }

    private StaticText campoV2841Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV2841Texto1() {
        return campoV2841Texto1;
    }

    public void setCampoV2841Texto1(StaticText component) {
        this.campoV2841Texto1 = component;
    }

    private LengthValidator validatorV2841 = new LengthValidator();
  
    public LengthValidator getValidatorV2841() {
        return validatorV2841;
    }
  
    public void setValidatorV2841(LengthValidator validator) {
        this.validatorV2841 = validator;
    }
  
    private TableColumn tableColumnV2851 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV2851() {
        return tableColumnV2851;
    }

    public void setTableColumnV2851(TableColumn component) {
        this.tableColumnV2851 = component;
    }

    private Label labelV2851 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV2851() {
        return labelV2851;
    }

    public void setLabelV2851(Label l) {
        this.labelV2851 = l;
    }

    private TextArea campoV2851 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV2851() {
        return campoV2851;
    }

    public void setCampoV2851(TextArea component) {
        this.campoV2851 = component;
    }

    private StaticText campoV2851Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV2851Texto1() {
        return campoV2851Texto1;
    }

    public void setCampoV2851Texto1(StaticText component) {
        this.campoV2851Texto1 = component;
    }

    private LengthValidator validatorV2851 = new LengthValidator();
  
    public LengthValidator getValidatorV2851() {
        return validatorV2851;
    }
  
    public void setValidatorV2851(LengthValidator validator) {
        this.validatorV2851 = validator;
    }
  
    private TableColumn tableColumnV2861 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV2861() {
        return tableColumnV2861;
    }

    public void setTableColumnV2861(TableColumn component) {
        this.tableColumnV2861 = component;
    }

    private Label labelV2861 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV2861() {
        return labelV2861;
    }

    public void setLabelV2861(Label l) {
        this.labelV2861 = l;
    }

    private TextArea campoV2861 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV2861() {
        return campoV2861;
    }

    public void setCampoV2861(TextArea component) {
        this.campoV2861 = component;
    }

    private StaticText campoV2861Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV2861Texto1() {
        return campoV2861Texto1;
    }

    public void setCampoV2861Texto1(StaticText component) {
        this.campoV2861Texto1 = component;
    }

    private LengthValidator validatorV2861 = new LengthValidator();
  
    public LengthValidator getValidatorV2861() {
        return validatorV2861;
    }
  
    public void setValidatorV2861(LengthValidator validator) {
        this.validatorV2861 = validator;
    }
  
    private TableColumn tableColumnV2871 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV2871() {
        return tableColumnV2871;
    }

    public void setTableColumnV2871(TableColumn component) {
        this.tableColumnV2871 = component;
    }

    private Label labelV2871 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV2871() {
        return labelV2871;
    }

    public void setLabelV2871(Label l) {
        this.labelV2871 = l;
    }

    private TextArea campoV2871 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV2871() {
        return campoV2871;
    }

    public void setCampoV2871(TextArea component) {
        this.campoV2871 = component;
    }

    private StaticText campoV2871Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV2871Texto1() {
        return campoV2871Texto1;
    }

    public void setCampoV2871Texto1(StaticText component) {
        this.campoV2871Texto1 = component;
    }

    private LengthValidator validatorV2871 = new LengthValidator();
  
    public LengthValidator getValidatorV2871() {
        return validatorV2871;
    }
  
    public void setValidatorV2871(LengthValidator validator) {
        this.validatorV2871 = validator;
    }
  
    private TableColumn tableColumnV2881 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV2881() {
        return tableColumnV2881;
    }

    public void setTableColumnV2881(TableColumn component) {
        this.tableColumnV2881 = component;
    }

    private Label labelV2881 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV2881() {
        return labelV2881;
    }

    public void setLabelV2881(Label l) {
        this.labelV2881 = l;
    }

    private TextArea campoV2881 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV2881() {
        return campoV2881;
    }

    public void setCampoV2881(TextArea component) {
        this.campoV2881 = component;
    }

    private StaticText campoV2881Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV2881Texto1() {
        return campoV2881Texto1;
    }

    public void setCampoV2881Texto1(StaticText component) {
        this.campoV2881Texto1 = component;
    }

    private LengthValidator validatorV2881 = new LengthValidator();
  
    public LengthValidator getValidatorV2881() {
        return validatorV2881;
    }
  
    public void setValidatorV2881(LengthValidator validator) {
        this.validatorV2881 = validator;
    }
  
    private TableColumn tableColumnV29nombreJefe1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnV29nombreJefe1() {
        return tableColumnV29nombreJefe1;
    }

    public void setTableColumnV29nombreJefe1(TableColumn component) {
        this.tableColumnV29nombreJefe1 = component;
    }

    private Label labelV29nombreJefe1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelV29nombreJefe1() {
        return labelV29nombreJefe1;
    }

    public void setLabelV29nombreJefe1(Label l) {
        this.labelV29nombreJefe1 = l;
    }

    private TextArea campoV29nombreJefe1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoV29nombreJefe1() {
        return campoV29nombreJefe1;
    }

    public void setCampoV29nombreJefe1(TextArea component) {
        this.campoV29nombreJefe1 = component;
    }

    private StaticText campoV29nombreJefe1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoV29nombreJefe1Texto1() {
        return campoV29nombreJefe1Texto1;
    }

    public void setCampoV29nombreJefe1Texto1(StaticText component) {
        this.campoV29nombreJefe1Texto1 = component;
    }

    private LengthValidator validatorV29nombreJefe1 = new LengthValidator();
  
    public LengthValidator getValidatorV29nombreJefe1() {
        return validatorV29nombreJefe1;
    }
  
    public void setValidatorV29nombreJefe1(LengthValidator validator) {
        this.validatorV29nombreJefe1 = validator;
    }
  
    private TableColumn tableColumnCedulajefe1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCedulajefe1() {
        return tableColumnCedulajefe1;
    }

    public void setTableColumnCedulajefe1(TableColumn component) {
        this.tableColumnCedulajefe1 = component;
    }

    private Label labelCedulajefe1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCedulajefe1() {
        return labelCedulajefe1;
    }

    public void setLabelCedulajefe1(Label l) {
        this.labelCedulajefe1 = l;
    }

    private TextArea campoCedulajefe1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoCedulajefe1() {
        return campoCedulajefe1;
    }

    public void setCampoCedulajefe1(TextArea component) {
        this.campoCedulajefe1 = component;
    }

    private StaticText campoCedulajefe1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCedulajefe1Texto1() {
        return campoCedulajefe1Texto1;
    }

    public void setCampoCedulajefe1Texto1(StaticText component) {
        this.campoCedulajefe1Texto1 = component;
    }

    private LengthValidator validatorCedulajefe1 = new LengthValidator();
  
    public LengthValidator getValidatorCedulajefe1() {
        return validatorCedulajefe1;
    }
  
    public void setValidatorCedulajefe1(LengthValidator validator) {
        this.validatorCedulajefe1 = validator;
    }
  
    private TableColumn tableColumnVar000011 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnVar000011() {
        return tableColumnVar000011;
    }

    public void setTableColumnVar000011(TableColumn component) {
        this.tableColumnVar000011 = component;
    }

    private Label labelVar000011 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelVar000011() {
        return labelVar000011;
    }

    public void setLabelVar000011(Label l) {
        this.labelVar000011 = l;
    }

    private TextArea campoVar000011 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoVar000011() {
        return campoVar000011;
    }

    public void setCampoVar000011(TextArea component) {
        this.campoVar000011 = component;
    }

    private StaticText campoVar000011Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoVar000011Texto1() {
        return campoVar000011Texto1;
    }

    public void setCampoVar000011Texto1(StaticText component) {
        this.campoVar000011Texto1 = component;
    }

    private LengthValidator validatorVar000011 = new LengthValidator();
  
    public LengthValidator getValidatorVar000011() {
        return validatorVar000011;
    }
  
    public void setValidatorVar000011(LengthValidator validator) {
        this.validatorVar000011 = validator;
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

    private LogImpHogEecCachedRowSetDataProvider2 logImpHogEecDataProvider = new LogImpHogEecCachedRowSetDataProvider2();

    @Override
    public LogImpHogEecCachedRowSetDataProvider2 getLogImpHogEecDataProvider() {
        return logImpHogEecDataProvider;
    }

    public void setLogImpHogEecDataProvider(LogImpHogEecCachedRowSetDataProvider2 crsdp) {
        this.logImpHogEecDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public LogImpHogEec5() {
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
        logImpHogEecDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionLogImpHogEec...">
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
    private AsistentePaginaActualizacionLogImpHogEec asistente = new AsistentePaginaActualizacionLogImpHogEec(this);

    public AsistentePaginaActualizacionLogImpHogEec getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("LogImpHogEec5_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("LogImpHogEec5_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("LogImpHogEec5_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getLogImpHogEecDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return LogImpHogEecCachedRowSetDataProvider2.FUNCION_CONSULTAR_LOG_IMP_HOG_EEC;
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
            this.getLogImpHogEecDataProvider().consultarLogImpHogEec(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getLogImpHogEecDataProvider().consultarLogImpHogEec(filtro);
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
