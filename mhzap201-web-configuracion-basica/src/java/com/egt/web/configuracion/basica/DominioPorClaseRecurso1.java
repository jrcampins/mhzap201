/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.configuracion.basica;

import com.egt.data.general.xdp2.DominioCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ClaseRecursoCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.PaqueteCachedRowSetDataProvider2;
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

public class DominioPorClaseRecurso1 extends AbstractPageBean
        implements PaginaActualizacionDominioPorClaseRecurso, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla, PaginaConsultaConMaestro {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdDominio1.setMinimum(0L);
        validatorIdDominio1.setMaximum(1000000000000000000L);
        validatorCodigoDominio1.setMaximum(100);
        validatorNombreDominio1.setMaximum(100);
        validatorDescripcionDominio1.setMaximum(8160);
        validatorNombreTabla1.setMaximum(100);
        dominioDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.dominioRowSet}"));
        claseRecursoDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.claseRecursoRowSet}"));
        funcionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.funcionReferenceRowSet}"));
        dominioReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.dominioReferenceRowSet}"));
        paqueteReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.paqueteReferenceRowSet}"));
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

    private TableColumn tableColumnIdDominio1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdDominio1() {
        return tableColumnIdDominio1;
    }

    public void setTableColumnIdDominio1(TableColumn component) {
        this.tableColumnIdDominio1 = component;
    }

    private Label labelIdDominio1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDominio1() {
        return labelIdDominio1;
    }

    public void setLabelIdDominio1(Label l) {
        this.labelIdDominio1 = l;
    }

    private TextField campoIdDominio1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdDominio1() {
        return campoIdDominio1;
    }

    public void setCampoIdDominio1(TextField component) {
        this.campoIdDominio1 = component;
    }

    private StaticText campoIdDominio1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDominio1Texto1() {
        return campoIdDominio1Texto1;
    }

    public void setCampoIdDominio1Texto1(StaticText component) {
        this.campoIdDominio1Texto1 = component;
    }

    private LongConverter converterIdDominio1 = new LongConverter();
  
    public LongConverter getConverterIdDominio1() {
        return converterIdDominio1;
    }
  
    public void setConverterIdDominio1(LongConverter converter) {
        this.converterIdDominio1 = converter;
    }
  
    private LongRangeValidator validatorIdDominio1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdDominio1() {
        return validatorIdDominio1;
    }
  
    public void setValidatorIdDominio1(LongRangeValidator validator) {
        this.validatorIdDominio1 = validator;
    }
  
    private TableColumn tableColumnCodigoDominio1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCodigoDominio1() {
        return tableColumnCodigoDominio1;
    }

    public void setTableColumnCodigoDominio1(TableColumn component) {
        this.tableColumnCodigoDominio1 = component;
    }

    private Label labelCodigoDominio1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoDominio1() {
        return labelCodigoDominio1;
    }

    public void setLabelCodigoDominio1(Label l) {
        this.labelCodigoDominio1 = l;
    }

    private TextField campoCodigoDominio1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoDominio1() {
        return campoCodigoDominio1;
    }

    public void setCampoCodigoDominio1(TextField component) {
        this.campoCodigoDominio1 = component;
    }

    private StaticText campoCodigoDominio1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoDominio1Texto1() {
        return campoCodigoDominio1Texto1;
    }

    public void setCampoCodigoDominio1Texto1(StaticText component) {
        this.campoCodigoDominio1Texto1 = component;
    }

    private LengthValidator validatorCodigoDominio1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoDominio1() {
        return validatorCodigoDominio1;
    }
  
    public void setValidatorCodigoDominio1(LengthValidator validator) {
        this.validatorCodigoDominio1 = validator;
    }
  
    private TableColumn tableColumnNombreDominio1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreDominio1() {
        return tableColumnNombreDominio1;
    }

    public void setTableColumnNombreDominio1(TableColumn component) {
        this.tableColumnNombreDominio1 = component;
    }

    private Label labelNombreDominio1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreDominio1() {
        return labelNombreDominio1;
    }

    public void setLabelNombreDominio1(Label l) {
        this.labelNombreDominio1 = l;
    }

    private TextField campoNombreDominio1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreDominio1() {
        return campoNombreDominio1;
    }

    public void setCampoNombreDominio1(TextField component) {
        this.campoNombreDominio1 = component;
    }

    private StaticText campoNombreDominio1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreDominio1Texto1() {
        return campoNombreDominio1Texto1;
    }

    public void setCampoNombreDominio1Texto1(StaticText component) {
        this.campoNombreDominio1Texto1 = component;
    }

    private LengthValidator validatorNombreDominio1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreDominio1() {
        return validatorNombreDominio1;
    }
  
    public void setValidatorNombreDominio1(LengthValidator validator) {
        this.validatorNombreDominio1 = validator;
    }
  
    private TableColumn tableColumnDescripcionDominio1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnDescripcionDominio1() {
        return tableColumnDescripcionDominio1;
    }

    public void setTableColumnDescripcionDominio1(TableColumn component) {
        this.tableColumnDescripcionDominio1 = component;
    }

    private Label labelDescripcionDominio1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDescripcionDominio1() {
        return labelDescripcionDominio1;
    }

    public void setLabelDescripcionDominio1(Label l) {
        this.labelDescripcionDominio1 = l;
    }

    private TextArea campoDescripcionDominio1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDescripcionDominio1() {
        return campoDescripcionDominio1;
    }

    public void setCampoDescripcionDominio1(TextArea component) {
        this.campoDescripcionDominio1 = component;
    }

    private StaticText campoDescripcionDominio1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDescripcionDominio1Texto1() {
        return campoDescripcionDominio1Texto1;
    }

    public void setCampoDescripcionDominio1Texto1(StaticText component) {
        this.campoDescripcionDominio1Texto1 = component;
    }

    private LengthValidator validatorDescripcionDominio1 = new LengthValidator();
  
    public LengthValidator getValidatorDescripcionDominio1() {
        return validatorDescripcionDominio1;
    }
  
    public void setValidatorDescripcionDominio1(LengthValidator validator) {
        this.validatorDescripcionDominio1 = validator;
    }
  
    private TableColumn tableColumnNombreTabla1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreTabla1() {
        return tableColumnNombreTabla1;
    }

    public void setTableColumnNombreTabla1(TableColumn component) {
        this.tableColumnNombreTabla1 = component;
    }

    private Label labelNombreTabla1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreTabla1() {
        return labelNombreTabla1;
    }

    public void setLabelNombreTabla1(Label l) {
        this.labelNombreTabla1 = l;
    }

    private TextField campoNombreTabla1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreTabla1() {
        return campoNombreTabla1;
    }

    public void setCampoNombreTabla1(TextField component) {
        this.campoNombreTabla1 = component;
    }

    private StaticText campoNombreTabla1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreTabla1Texto1() {
        return campoNombreTabla1Texto1;
    }

    public void setCampoNombreTabla1Texto1(StaticText component) {
        this.campoNombreTabla1Texto1 = component;
    }

    private LengthValidator validatorNombreTabla1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreTabla1() {
        return validatorNombreTabla1;
    }
  
    public void setValidatorNombreTabla1(LengthValidator validator) {
        this.validatorNombreTabla1 = validator;
    }
  
    private TableColumn tableColumnNumeroTipoDominio1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoDominio1() {
        return tableColumnNumeroTipoDominio1;
    }

    public void setTableColumnNumeroTipoDominio1(TableColumn component) {
        this.tableColumnNumeroTipoDominio1 = component;
    }

    private Label labelNumeroTipoDominio1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoDominio1() {
        return labelNumeroTipoDominio1;
    }

    public void setLabelNumeroTipoDominio1(Label l) {
        this.labelNumeroTipoDominio1 = l;
    }

    private DropDown listaNumeroTipoDominio1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoDominio1() {
        return listaNumeroTipoDominio1;
    }

    public void setListaNumeroTipoDominio1(DropDown component) {
        this.listaNumeroTipoDominio1 = component;
    }

    private StaticText listaNumeroTipoDominio1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoDominio1Texto1() {
        return listaNumeroTipoDominio1Texto1;
    }

    public void setListaNumeroTipoDominio1Texto1(StaticText component) {
        this.listaNumeroTipoDominio1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoDominio1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoDominio1() {
        return converterNumeroTipoDominio1;
    }
  
    public void setConverterNumeroTipoDominio1(IntegerConverter converter) {
        this.converterNumeroTipoDominio1 = converter;
    }
  
    private TableColumn tableColumnIdFuncionSeleccion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionSeleccion1() {
        return tableColumnIdFuncionSeleccion1;
    }

    public void setTableColumnIdFuncionSeleccion1(TableColumn component) {
        this.tableColumnIdFuncionSeleccion1 = component;
    }

    private Label labelIdFuncionSeleccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionSeleccion1() {
        return labelIdFuncionSeleccion1;
    }

    public void setLabelIdFuncionSeleccion1(Label l) {
        this.labelIdFuncionSeleccion1 = l;
    }

    private TextField campoIdFuncionSeleccion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionSeleccion1() {
        return campoIdFuncionSeleccion1;
    }

    public void setCampoIdFuncionSeleccion1(TextField component) {
        this.campoIdFuncionSeleccion1 = component;
    }

    private StaticText campoIdFuncionSeleccion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionSeleccion1Texto1() {
        return campoIdFuncionSeleccion1Texto1;
    }

    public void setCampoIdFuncionSeleccion1Texto1(StaticText component) {
        this.campoIdFuncionSeleccion1Texto1 = component;
    }

    private Button campoIdFuncionSeleccion1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionSeleccion1Boton1() {
        return campoIdFuncionSeleccion1Boton1;
    }

    public void setCampoIdFuncionSeleccion1Boton1(Button component) {
        this.campoIdFuncionSeleccion1Boton1 = component;
    }

    private Button campoIdFuncionSeleccion1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionSeleccion1Boton3() {
        return campoIdFuncionSeleccion1Boton3;
    }

    public void setCampoIdFuncionSeleccion1Boton3(Button component) {
        this.campoIdFuncionSeleccion1Boton3 = component;
    }

    private TableColumn tableColumnIdFuncionSeleccion2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionSeleccion2() {
        return tableColumnIdFuncionSeleccion2;
    }

    public void setTableColumnIdFuncionSeleccion2(TableColumn component) {
        this.tableColumnIdFuncionSeleccion2 = component;
    }

    private Label labelIdFuncionSeleccion2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionSeleccion2() {
        return labelIdFuncionSeleccion2;
    }

    public void setLabelIdFuncionSeleccion2(Label l) {
        this.labelIdFuncionSeleccion2 = l;
    }

    private ImageHyperlink campoIdFuncionSeleccion1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdFuncionSeleccion1Hiper1() {
        return campoIdFuncionSeleccion1Hiper1;
    }

    public void setCampoIdFuncionSeleccion1Hiper1(ImageHyperlink component) {
        this.campoIdFuncionSeleccion1Hiper1 = component;
    }

    private TableColumn tableColumnIdDominioSegmento1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdDominioSegmento1() {
        return tableColumnIdDominioSegmento1;
    }

    public void setTableColumnIdDominioSegmento1(TableColumn component) {
        this.tableColumnIdDominioSegmento1 = component;
    }

    private Label labelIdDominioSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDominioSegmento1() {
        return labelIdDominioSegmento1;
    }

    public void setLabelIdDominioSegmento1(Label l) {
        this.labelIdDominioSegmento1 = l;
    }

    private TextField campoIdDominioSegmento1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdDominioSegmento1() {
        return campoIdDominioSegmento1;
    }

    public void setCampoIdDominioSegmento1(TextField component) {
        this.campoIdDominioSegmento1 = component;
    }

    private StaticText campoIdDominioSegmento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDominioSegmento1Texto1() {
        return campoIdDominioSegmento1Texto1;
    }

    public void setCampoIdDominioSegmento1Texto1(StaticText component) {
        this.campoIdDominioSegmento1Texto1 = component;
    }

    private Button campoIdDominioSegmento1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDominioSegmento1Boton1() {
        return campoIdDominioSegmento1Boton1;
    }

    public void setCampoIdDominioSegmento1Boton1(Button component) {
        this.campoIdDominioSegmento1Boton1 = component;
    }

    private Button campoIdDominioSegmento1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDominioSegmento1Boton3() {
        return campoIdDominioSegmento1Boton3;
    }

    public void setCampoIdDominioSegmento1Boton3(Button component) {
        this.campoIdDominioSegmento1Boton3 = component;
    }

    private TableColumn tableColumnIdDominioSegmento2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdDominioSegmento2() {
        return tableColumnIdDominioSegmento2;
    }

    public void setTableColumnIdDominioSegmento2(TableColumn component) {
        this.tableColumnIdDominioSegmento2 = component;
    }

    private Label labelIdDominioSegmento2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDominioSegmento2() {
        return labelIdDominioSegmento2;
    }

    public void setLabelIdDominioSegmento2(Label l) {
        this.labelIdDominioSegmento2 = l;
    }

    private ImageHyperlink campoIdDominioSegmento1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdDominioSegmento1Hiper1() {
        return campoIdDominioSegmento1Hiper1;
    }

    public void setCampoIdDominioSegmento1Hiper1(ImageHyperlink component) {
        this.campoIdDominioSegmento1Hiper1 = component;
    }

    private TableColumn tableColumnIdPaquete1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdPaquete1() {
        return tableColumnIdPaquete1;
    }

    public void setTableColumnIdPaquete1(TableColumn component) {
        this.tableColumnIdPaquete1 = component;
    }

    private Label labelIdPaquete1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPaquete1() {
        return labelIdPaquete1;
    }

    public void setLabelIdPaquete1(Label l) {
        this.labelIdPaquete1 = l;
    }

    private TextField campoIdPaquete1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdPaquete1() {
        return campoIdPaquete1;
    }

    public void setCampoIdPaquete1(TextField component) {
        this.campoIdPaquete1 = component;
    }

    private StaticText campoIdPaquete1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdPaquete1Texto1() {
        return campoIdPaquete1Texto1;
    }

    public void setCampoIdPaquete1Texto1(StaticText component) {
        this.campoIdPaquete1Texto1 = component;
    }

    private Button campoIdPaquete1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdPaquete1Boton1() {
        return campoIdPaquete1Boton1;
    }

    public void setCampoIdPaquete1Boton1(Button component) {
        this.campoIdPaquete1Boton1 = component;
    }

    private Button campoIdPaquete1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPaquete1Boton3() {
        return campoIdPaquete1Boton3;
    }

    public void setCampoIdPaquete1Boton3(Button component) {
        this.campoIdPaquete1Boton3 = component;
    }

    private TableColumn tableColumnIdPaquete2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdPaquete2() {
        return tableColumnIdPaquete2;
    }

    public void setTableColumnIdPaquete2(TableColumn component) {
        this.tableColumnIdPaquete2 = component;
    }

    private Label labelIdPaquete2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPaquete2() {
        return labelIdPaquete2;
    }

    public void setLabelIdPaquete2(Label l) {
        this.labelIdPaquete2 = l;
    }

    private ImageHyperlink campoIdPaquete1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdPaquete1Hiper1() {
        return campoIdPaquete1Hiper1;
    }

    public void setCampoIdPaquete1Hiper1(ImageHyperlink component) {
        this.campoIdPaquete1Hiper1 = component;
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

    private ImageHyperlink imageHyperlink2 = new com.egt.core.jsf.component.Hipervinculo();

    public ImageHyperlink getImageHyperlink2() {
        return imageHyperlink2;
    }

    public void setImageHyperlink2(ImageHyperlink component) {
        this.imageHyperlink2 = component;
    }

    private ImageHyperlink imageHyperlink3 = new com.egt.core.jsf.component.Hipervinculo();

    public ImageHyperlink getImageHyperlink3() {
        return imageHyperlink3;
    }

    public void setImageHyperlink3(ImageHyperlink component) {
        this.imageHyperlink3 = component;
    }

    private ImageHyperlink imageHyperlink4 = new com.egt.core.jsf.component.Hipervinculo();

    public ImageHyperlink getImageHyperlink4() {
        return imageHyperlink4;
    }

    public void setImageHyperlink4(ImageHyperlink component) {
        this.imageHyperlink4 = component;
    }

    private DominioCachedRowSetDataProvider2 dominioDataProvider = new DominioCachedRowSetDataProvider2();

    @Override
    public DominioCachedRowSetDataProvider2 getDominioDataProvider() {
        return dominioDataProvider;
    }

    public void setDominioDataProvider(DominioCachedRowSetDataProvider2 crsdp) {
        this.dominioDataProvider = crsdp;
    }

    private ClaseRecursoCachedRowSetDataProvider2 claseRecursoDataProvider = new ClaseRecursoCachedRowSetDataProvider2();

    @Override
    public ClaseRecursoCachedRowSetDataProvider2 getClaseRecursoDataProvider() {
        return claseRecursoDataProvider;
    }

    public void setClaseRecursoDataProvider(ClaseRecursoCachedRowSetDataProvider2 crsdp) {
        this.claseRecursoDataProvider = crsdp;
    }

    private FuncionCachedRowSetDataProvider2 funcionReferenceDataProvider = new FuncionCachedRowSetDataProvider2();

    @Override
    public FuncionCachedRowSetDataProvider2 getFuncionReferenceDataProvider() {
        return funcionReferenceDataProvider;
    }

    public void setFuncionReferenceDataProvider(FuncionCachedRowSetDataProvider2 crsdp) {
        this.funcionReferenceDataProvider = crsdp;
    }

    private DominioCachedRowSetDataProvider2 dominioReferenceDataProvider = new DominioCachedRowSetDataProvider2();

    @Override
    public DominioCachedRowSetDataProvider2 getDominioReferenceDataProvider() {
        return dominioReferenceDataProvider;
    }

    public void setDominioReferenceDataProvider(DominioCachedRowSetDataProvider2 crsdp) {
        this.dominioReferenceDataProvider = crsdp;
    }

    private PaqueteCachedRowSetDataProvider2 paqueteReferenceDataProvider = new PaqueteCachedRowSetDataProvider2();

    @Override
    public PaqueteCachedRowSetDataProvider2 getPaqueteReferenceDataProvider() {
        return paqueteReferenceDataProvider;
    }

    public void setPaqueteReferenceDataProvider(PaqueteCachedRowSetDataProvider2 crsdp) {
        this.paqueteReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public DominioPorClaseRecurso1() {
    }

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para el manejo de eventos de la pagina: init, preprocess, prerender y destroy">
    @Override
    @PostConstruct
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
    @PreDestroy
    public void destroy() {
        dominioDataProvider.close();
        claseRecursoDataProvider.close();
        funcionReferenceDataProvider.close();
        dominioReferenceDataProvider.close();
        paqueteReferenceDataProvider.close();
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
    @Override
    public String getEtiquetaClaseMaestro() {
        return ETIQUETA_CLASE_MAESTRO;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionDominio...">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion con tabla">
    private GestorPaginaActualizacionConTabla gestor = new GestorPaginaActualizacionConTabla(this);

    @Override
    public GestorPaginaActualizacionConTabla getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionDominioPorClaseRecurso asistente = new AsistentePaginaActualizacionDominioPorClaseRecurso(this);

    public AsistentePaginaActualizacionDominioPorClaseRecurso getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("DominioPorClaseRecurso1_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("DominioPorClaseRecurso1_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("DominioPorClaseRecurso1_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getDominioDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return DominioCachedRowSetDataProvider2.FUNCION_CONSULTAR_DOMINIO;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return DominioCachedRowSetDataProvider2.FUNCION_CREAR_DOMINIO;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return DominioCachedRowSetDataProvider2.FUNCION_MODIFICAR_DOMINIO;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return DominioCachedRowSetDataProvider2.FUNCION_ELIMINAR_DOMINIO;
    }

    @Override
    public Option[] getOpcionesListaFuncionEdicion() {
        return this.getAsistente().getOpcionesListaFuncionEdicion();
    }

    @Override
    public Option[] getOpcionesListaFuncionAccion() {
        return this.getAsistente().getOpcionesListaFuncionAccion();
    }

    @Override
    public RecursoCachedRowSetDataProvider getRecursoMaestroDataProvider() {
        return this.getClaseRecursoDataProvider();
    }

    @Override
    public String getColumnaIdentificacionRecursoMaestro() {
        return DominioCachedRowSetDataProvider2.COLUMNA_ID_CLASE_RECURSO;
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
            this.getDominioDataProvider().consultarDominio(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getDominioDataProvider().consultarDominio(filtro);
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
        this.getGestor().agregar();
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
    public void campoIdFuncionSeleccion1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncionSeleccion1_validate(context, component, value);
    }

    public void campoIdDominioSegmento1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdDominioSegmento1_validate(context, component, value);
    }

    public void campoIdPaquete1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdPaquete1_validate(context, component, value);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las acciones de los hipervinculos">
    public String imageHyperlink1_action() {
        if (this.getGestor().vincular()) {
        } else {
            return null;
        }
        return "case1";
    }

    public String imageHyperlink2_action() {
        if (this.getGestor().vincular()) {
        } else {
            return null;
        }
        return "case2";
    }

    public String imageHyperlink3_action() {
        if (this.getGestor().vincular()) {
        } else {
            return null;
        }
        return "case3";
    }

    public String imageHyperlink4_action() {
        if (this.getGestor().vincular()) {
        } else {
            return null;
        }
        return "case4";
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
