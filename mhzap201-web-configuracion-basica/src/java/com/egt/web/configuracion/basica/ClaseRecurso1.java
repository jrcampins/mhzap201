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

import com.egt.data.general.xdp2.ClaseRecursoCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.PaginaCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.GrupoAplicacionCachedRowSetDataProvider2;
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

public class ClaseRecurso1 extends AbstractPageBean
        implements PaginaActualizacionClaseRecurso, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdClaseRecurso1.setMinimum(0L);
        validatorIdClaseRecurso1.setMaximum(1000000000000000000L);
        validatorCodigoClaseRecurso1.setMaximum(100);
        validatorNombreClaseRecurso1.setMaximum(100);
        validatorDescripcionClaseRecurso1.setMaximum(8160);
        validatorIdAplicacionWeb1.setMinimum(0L);
        validatorIdAplicacionWeb1.setMaximum(1000000000000000000L);
        validatorLimiteFilasConsulta1.setMinimum(0L);
        validatorLimiteFilasConsulta1.setMaximum(1000000000L);
        validatorLimiteFilasInforme1.setMinimum(0L);
        validatorLimiteFilasInforme1.setMaximum(1000000000L);
        validatorOrdenPresentacion1.setMinimum(0L);
        validatorOrdenPresentacion1.setMaximum(1000000000L);
        validatorEtiquetaHipervinculo1.setMaximum(20);
        validatorAliasClaseRecurso1.setMaximum(100);
        claseRecursoDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.claseRecursoRowSet}"));
        funcionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.funcionReferenceRowSet}"));
        paginaReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.paginaReferenceRowSet}"));
        claseRecursoReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.claseRecursoReferenceRowSet}"));
        grupoAplicacionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.grupoAplicacionReferenceRowSet}"));
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

    private TableColumn tableColumnIdClaseRecurso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdClaseRecurso1() {
        return tableColumnIdClaseRecurso1;
    }

    public void setTableColumnIdClaseRecurso1(TableColumn component) {
        this.tableColumnIdClaseRecurso1 = component;
    }

    private Label labelIdClaseRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecurso1() {
        return labelIdClaseRecurso1;
    }

    public void setLabelIdClaseRecurso1(Label l) {
        this.labelIdClaseRecurso1 = l;
    }

    private TextField campoIdClaseRecurso1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseRecurso1() {
        return campoIdClaseRecurso1;
    }

    public void setCampoIdClaseRecurso1(TextField component) {
        this.campoIdClaseRecurso1 = component;
    }

    private StaticText campoIdClaseRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseRecurso1Texto1() {
        return campoIdClaseRecurso1Texto1;
    }

    public void setCampoIdClaseRecurso1Texto1(StaticText component) {
        this.campoIdClaseRecurso1Texto1 = component;
    }

    private LongConverter converterIdClaseRecurso1 = new LongConverter();
  
    public LongConverter getConverterIdClaseRecurso1() {
        return converterIdClaseRecurso1;
    }
  
    public void setConverterIdClaseRecurso1(LongConverter converter) {
        this.converterIdClaseRecurso1 = converter;
    }
  
    private LongRangeValidator validatorIdClaseRecurso1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdClaseRecurso1() {
        return validatorIdClaseRecurso1;
    }
  
    public void setValidatorIdClaseRecurso1(LongRangeValidator validator) {
        this.validatorIdClaseRecurso1 = validator;
    }
  
    private TableColumn tableColumnCodigoClaseRecurso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCodigoClaseRecurso1() {
        return tableColumnCodigoClaseRecurso1;
    }

    public void setTableColumnCodigoClaseRecurso1(TableColumn component) {
        this.tableColumnCodigoClaseRecurso1 = component;
    }

    private Label labelCodigoClaseRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoClaseRecurso1() {
        return labelCodigoClaseRecurso1;
    }

    public void setLabelCodigoClaseRecurso1(Label l) {
        this.labelCodigoClaseRecurso1 = l;
    }

    private TextField campoCodigoClaseRecurso1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoClaseRecurso1() {
        return campoCodigoClaseRecurso1;
    }

    public void setCampoCodigoClaseRecurso1(TextField component) {
        this.campoCodigoClaseRecurso1 = component;
    }

    private StaticText campoCodigoClaseRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoClaseRecurso1Texto1() {
        return campoCodigoClaseRecurso1Texto1;
    }

    public void setCampoCodigoClaseRecurso1Texto1(StaticText component) {
        this.campoCodigoClaseRecurso1Texto1 = component;
    }

    private LengthValidator validatorCodigoClaseRecurso1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoClaseRecurso1() {
        return validatorCodigoClaseRecurso1;
    }
  
    public void setValidatorCodigoClaseRecurso1(LengthValidator validator) {
        this.validatorCodigoClaseRecurso1 = validator;
    }
  
    private TableColumn tableColumnNombreClaseRecurso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreClaseRecurso1() {
        return tableColumnNombreClaseRecurso1;
    }

    public void setTableColumnNombreClaseRecurso1(TableColumn component) {
        this.tableColumnNombreClaseRecurso1 = component;
    }

    private Label labelNombreClaseRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreClaseRecurso1() {
        return labelNombreClaseRecurso1;
    }

    public void setLabelNombreClaseRecurso1(Label l) {
        this.labelNombreClaseRecurso1 = l;
    }

    private TextField campoNombreClaseRecurso1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreClaseRecurso1() {
        return campoNombreClaseRecurso1;
    }

    public void setCampoNombreClaseRecurso1(TextField component) {
        this.campoNombreClaseRecurso1 = component;
    }

    private StaticText campoNombreClaseRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreClaseRecurso1Texto1() {
        return campoNombreClaseRecurso1Texto1;
    }

    public void setCampoNombreClaseRecurso1Texto1(StaticText component) {
        this.campoNombreClaseRecurso1Texto1 = component;
    }

    private LengthValidator validatorNombreClaseRecurso1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreClaseRecurso1() {
        return validatorNombreClaseRecurso1;
    }
  
    public void setValidatorNombreClaseRecurso1(LengthValidator validator) {
        this.validatorNombreClaseRecurso1 = validator;
    }
  
    private TableColumn tableColumnDescripcionClaseRecurso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnDescripcionClaseRecurso1() {
        return tableColumnDescripcionClaseRecurso1;
    }

    public void setTableColumnDescripcionClaseRecurso1(TableColumn component) {
        this.tableColumnDescripcionClaseRecurso1 = component;
    }

    private Label labelDescripcionClaseRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDescripcionClaseRecurso1() {
        return labelDescripcionClaseRecurso1;
    }

    public void setLabelDescripcionClaseRecurso1(Label l) {
        this.labelDescripcionClaseRecurso1 = l;
    }

    private TextArea campoDescripcionClaseRecurso1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDescripcionClaseRecurso1() {
        return campoDescripcionClaseRecurso1;
    }

    public void setCampoDescripcionClaseRecurso1(TextArea component) {
        this.campoDescripcionClaseRecurso1 = component;
    }

    private StaticText campoDescripcionClaseRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDescripcionClaseRecurso1Texto1() {
        return campoDescripcionClaseRecurso1Texto1;
    }

    public void setCampoDescripcionClaseRecurso1Texto1(StaticText component) {
        this.campoDescripcionClaseRecurso1Texto1 = component;
    }

    private LengthValidator validatorDescripcionClaseRecurso1 = new LengthValidator();
  
    public LengthValidator getValidatorDescripcionClaseRecurso1() {
        return validatorDescripcionClaseRecurso1;
    }
  
    public void setValidatorDescripcionClaseRecurso1(LengthValidator validator) {
        this.validatorDescripcionClaseRecurso1 = validator;
    }
  
    private TableColumn tableColumnEsClaseRecursoIndependiente1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsClaseRecursoIndependiente1() {
        return tableColumnEsClaseRecursoIndependiente1;
    }

    public void setTableColumnEsClaseRecursoIndependiente1(TableColumn component) {
        this.tableColumnEsClaseRecursoIndependiente1 = component;
    }

    private Label labelEsClaseRecursoIndependiente1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsClaseRecursoIndependiente1() {
        return labelEsClaseRecursoIndependiente1;
    }

    public void setLabelEsClaseRecursoIndependiente1(Label l) {
        this.labelEsClaseRecursoIndependiente1 = l;
    }

    private DropDown listaEsClaseRecursoIndependiente1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsClaseRecursoIndependiente1() {
        return listaEsClaseRecursoIndependiente1;
    }

    public void setListaEsClaseRecursoIndependiente1(DropDown component) {
        this.listaEsClaseRecursoIndependiente1 = component;
    }

    private StaticText listaEsClaseRecursoIndependiente1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsClaseRecursoIndependiente1Texto1() {
        return listaEsClaseRecursoIndependiente1Texto1;
    }

    public void setListaEsClaseRecursoIndependiente1Texto1(StaticText component) {
        this.listaEsClaseRecursoIndependiente1Texto1 = component;
    }

    private IntegerConverter converterEsClaseRecursoIndependiente1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsClaseRecursoIndependiente1() {
        return converterEsClaseRecursoIndependiente1;
    }
  
    public void setConverterEsClaseRecursoIndependiente1(IntegerConverter converter) {
        this.converterEsClaseRecursoIndependiente1 = converter;
    }
  
    private TableColumn tableColumnEsClaseRecursoSinDetalle1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsClaseRecursoSinDetalle1() {
        return tableColumnEsClaseRecursoSinDetalle1;
    }

    public void setTableColumnEsClaseRecursoSinDetalle1(TableColumn component) {
        this.tableColumnEsClaseRecursoSinDetalle1 = component;
    }

    private Label labelEsClaseRecursoSinDetalle1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsClaseRecursoSinDetalle1() {
        return labelEsClaseRecursoSinDetalle1;
    }

    public void setLabelEsClaseRecursoSinDetalle1(Label l) {
        this.labelEsClaseRecursoSinDetalle1 = l;
    }

    private DropDown listaEsClaseRecursoSinDetalle1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsClaseRecursoSinDetalle1() {
        return listaEsClaseRecursoSinDetalle1;
    }

    public void setListaEsClaseRecursoSinDetalle1(DropDown component) {
        this.listaEsClaseRecursoSinDetalle1 = component;
    }

    private StaticText listaEsClaseRecursoSinDetalle1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsClaseRecursoSinDetalle1Texto1() {
        return listaEsClaseRecursoSinDetalle1Texto1;
    }

    public void setListaEsClaseRecursoSinDetalle1Texto1(StaticText component) {
        this.listaEsClaseRecursoSinDetalle1Texto1 = component;
    }

    private IntegerConverter converterEsClaseRecursoSinDetalle1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsClaseRecursoSinDetalle1() {
        return converterEsClaseRecursoSinDetalle1;
    }
  
    public void setConverterEsClaseRecursoSinDetalle1(IntegerConverter converter) {
        this.converterEsClaseRecursoSinDetalle1 = converter;
    }
  
    private TableColumn tableColumnEsClaseRecursoConArbol1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsClaseRecursoConArbol1() {
        return tableColumnEsClaseRecursoConArbol1;
    }

    public void setTableColumnEsClaseRecursoConArbol1(TableColumn component) {
        this.tableColumnEsClaseRecursoConArbol1 = component;
    }

    private Label labelEsClaseRecursoConArbol1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsClaseRecursoConArbol1() {
        return labelEsClaseRecursoConArbol1;
    }

    public void setLabelEsClaseRecursoConArbol1(Label l) {
        this.labelEsClaseRecursoConArbol1 = l;
    }

    private DropDown listaEsClaseRecursoConArbol1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsClaseRecursoConArbol1() {
        return listaEsClaseRecursoConArbol1;
    }

    public void setListaEsClaseRecursoConArbol1(DropDown component) {
        this.listaEsClaseRecursoConArbol1 = component;
    }

    private StaticText listaEsClaseRecursoConArbol1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsClaseRecursoConArbol1Texto1() {
        return listaEsClaseRecursoConArbol1Texto1;
    }

    public void setListaEsClaseRecursoConArbol1Texto1(StaticText component) {
        this.listaEsClaseRecursoConArbol1Texto1 = component;
    }

    private IntegerConverter converterEsClaseRecursoConArbol1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsClaseRecursoConArbol1() {
        return converterEsClaseRecursoConArbol1;
    }
  
    public void setConverterEsClaseRecursoConArbol1(IntegerConverter converter) {
        this.converterEsClaseRecursoConArbol1 = converter;
    }
  
    private TableColumn tableColumnNumeroTipoClaseRecurso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoClaseRecurso1() {
        return tableColumnNumeroTipoClaseRecurso1;
    }

    public void setTableColumnNumeroTipoClaseRecurso1(TableColumn component) {
        this.tableColumnNumeroTipoClaseRecurso1 = component;
    }

    private Label labelNumeroTipoClaseRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoClaseRecurso1() {
        return labelNumeroTipoClaseRecurso1;
    }

    public void setLabelNumeroTipoClaseRecurso1(Label l) {
        this.labelNumeroTipoClaseRecurso1 = l;
    }

    private DropDown listaNumeroTipoClaseRecurso1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoClaseRecurso1() {
        return listaNumeroTipoClaseRecurso1;
    }

    public void setListaNumeroTipoClaseRecurso1(DropDown component) {
        this.listaNumeroTipoClaseRecurso1 = component;
    }

    private StaticText listaNumeroTipoClaseRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoClaseRecurso1Texto1() {
        return listaNumeroTipoClaseRecurso1Texto1;
    }

    public void setListaNumeroTipoClaseRecurso1Texto1(StaticText component) {
        this.listaNumeroTipoClaseRecurso1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoClaseRecurso1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoClaseRecurso1() {
        return converterNumeroTipoClaseRecurso1;
    }
  
    public void setConverterNumeroTipoClaseRecurso1(IntegerConverter converter) {
        this.converterNumeroTipoClaseRecurso1 = converter;
    }
  
    private TableColumn tableColumnNumeroTipoRecurso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoRecurso1() {
        return tableColumnNumeroTipoRecurso1;
    }

    public void setTableColumnNumeroTipoRecurso1(TableColumn component) {
        this.tableColumnNumeroTipoRecurso1 = component;
    }

    private Label labelNumeroTipoRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoRecurso1() {
        return labelNumeroTipoRecurso1;
    }

    public void setLabelNumeroTipoRecurso1(Label l) {
        this.labelNumeroTipoRecurso1 = l;
    }

    private DropDown listaNumeroTipoRecurso1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoRecurso1() {
        return listaNumeroTipoRecurso1;
    }

    public void setListaNumeroTipoRecurso1(DropDown component) {
        this.listaNumeroTipoRecurso1 = component;
    }

    private StaticText listaNumeroTipoRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoRecurso1Texto1() {
        return listaNumeroTipoRecurso1Texto1;
    }

    public void setListaNumeroTipoRecurso1Texto1(StaticText component) {
        this.listaNumeroTipoRecurso1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoRecurso1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoRecurso1() {
        return converterNumeroTipoRecurso1;
    }
  
    public void setConverterNumeroTipoRecurso1(IntegerConverter converter) {
        this.converterNumeroTipoRecurso1 = converter;
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

    private TableColumn tableColumnIdPaginaSeleccion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdPaginaSeleccion1() {
        return tableColumnIdPaginaSeleccion1;
    }

    public void setTableColumnIdPaginaSeleccion1(TableColumn component) {
        this.tableColumnIdPaginaSeleccion1 = component;
    }

    private Label labelIdPaginaSeleccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPaginaSeleccion1() {
        return labelIdPaginaSeleccion1;
    }

    public void setLabelIdPaginaSeleccion1(Label l) {
        this.labelIdPaginaSeleccion1 = l;
    }

    private TextField campoIdPaginaSeleccion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdPaginaSeleccion1() {
        return campoIdPaginaSeleccion1;
    }

    public void setCampoIdPaginaSeleccion1(TextField component) {
        this.campoIdPaginaSeleccion1 = component;
    }

    private StaticText campoIdPaginaSeleccion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdPaginaSeleccion1Texto1() {
        return campoIdPaginaSeleccion1Texto1;
    }

    public void setCampoIdPaginaSeleccion1Texto1(StaticText component) {
        this.campoIdPaginaSeleccion1Texto1 = component;
    }

    private Button campoIdPaginaSeleccion1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdPaginaSeleccion1Boton1() {
        return campoIdPaginaSeleccion1Boton1;
    }

    public void setCampoIdPaginaSeleccion1Boton1(Button component) {
        this.campoIdPaginaSeleccion1Boton1 = component;
    }

    private Button campoIdPaginaSeleccion1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPaginaSeleccion1Boton3() {
        return campoIdPaginaSeleccion1Boton3;
    }

    public void setCampoIdPaginaSeleccion1Boton3(Button component) {
        this.campoIdPaginaSeleccion1Boton3 = component;
    }

    private TableColumn tableColumnIdPaginaSeleccion2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdPaginaSeleccion2() {
        return tableColumnIdPaginaSeleccion2;
    }

    public void setTableColumnIdPaginaSeleccion2(TableColumn component) {
        this.tableColumnIdPaginaSeleccion2 = component;
    }

    private Label labelIdPaginaSeleccion2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPaginaSeleccion2() {
        return labelIdPaginaSeleccion2;
    }

    public void setLabelIdPaginaSeleccion2(Label l) {
        this.labelIdPaginaSeleccion2 = l;
    }

    private ImageHyperlink campoIdPaginaSeleccion1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdPaginaSeleccion1Hiper1() {
        return campoIdPaginaSeleccion1Hiper1;
    }

    public void setCampoIdPaginaSeleccion1Hiper1(ImageHyperlink component) {
        this.campoIdPaginaSeleccion1Hiper1 = component;
    }

    private TableColumn tableColumnIdPaginaDetalle1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdPaginaDetalle1() {
        return tableColumnIdPaginaDetalle1;
    }

    public void setTableColumnIdPaginaDetalle1(TableColumn component) {
        this.tableColumnIdPaginaDetalle1 = component;
    }

    private Label labelIdPaginaDetalle1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPaginaDetalle1() {
        return labelIdPaginaDetalle1;
    }

    public void setLabelIdPaginaDetalle1(Label l) {
        this.labelIdPaginaDetalle1 = l;
    }

    private TextField campoIdPaginaDetalle1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdPaginaDetalle1() {
        return campoIdPaginaDetalle1;
    }

    public void setCampoIdPaginaDetalle1(TextField component) {
        this.campoIdPaginaDetalle1 = component;
    }

    private StaticText campoIdPaginaDetalle1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdPaginaDetalle1Texto1() {
        return campoIdPaginaDetalle1Texto1;
    }

    public void setCampoIdPaginaDetalle1Texto1(StaticText component) {
        this.campoIdPaginaDetalle1Texto1 = component;
    }

    private Button campoIdPaginaDetalle1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdPaginaDetalle1Boton1() {
        return campoIdPaginaDetalle1Boton1;
    }

    public void setCampoIdPaginaDetalle1Boton1(Button component) {
        this.campoIdPaginaDetalle1Boton1 = component;
    }

    private Button campoIdPaginaDetalle1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPaginaDetalle1Boton3() {
        return campoIdPaginaDetalle1Boton3;
    }

    public void setCampoIdPaginaDetalle1Boton3(Button component) {
        this.campoIdPaginaDetalle1Boton3 = component;
    }

    private TableColumn tableColumnIdPaginaDetalle2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdPaginaDetalle2() {
        return tableColumnIdPaginaDetalle2;
    }

    public void setTableColumnIdPaginaDetalle2(TableColumn component) {
        this.tableColumnIdPaginaDetalle2 = component;
    }

    private Label labelIdPaginaDetalle2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPaginaDetalle2() {
        return labelIdPaginaDetalle2;
    }

    public void setLabelIdPaginaDetalle2(Label l) {
        this.labelIdPaginaDetalle2 = l;
    }

    private ImageHyperlink campoIdPaginaDetalle1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdPaginaDetalle1Hiper1() {
        return campoIdPaginaDetalle1Hiper1;
    }

    public void setCampoIdPaginaDetalle1Hiper1(ImageHyperlink component) {
        this.campoIdPaginaDetalle1Hiper1 = component;
    }

    private TableColumn tableColumnIdClaseRecursoMaestro1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdClaseRecursoMaestro1() {
        return tableColumnIdClaseRecursoMaestro1;
    }

    public void setTableColumnIdClaseRecursoMaestro1(TableColumn component) {
        this.tableColumnIdClaseRecursoMaestro1 = component;
    }

    private Label labelIdClaseRecursoMaestro1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoMaestro1() {
        return labelIdClaseRecursoMaestro1;
    }

    public void setLabelIdClaseRecursoMaestro1(Label l) {
        this.labelIdClaseRecursoMaestro1 = l;
    }

    private TextField campoIdClaseRecursoMaestro1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseRecursoMaestro1() {
        return campoIdClaseRecursoMaestro1;
    }

    public void setCampoIdClaseRecursoMaestro1(TextField component) {
        this.campoIdClaseRecursoMaestro1 = component;
    }

    private StaticText campoIdClaseRecursoMaestro1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseRecursoMaestro1Texto1() {
        return campoIdClaseRecursoMaestro1Texto1;
    }

    public void setCampoIdClaseRecursoMaestro1Texto1(StaticText component) {
        this.campoIdClaseRecursoMaestro1Texto1 = component;
    }

    private Button campoIdClaseRecursoMaestro1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdClaseRecursoMaestro1Boton1() {
        return campoIdClaseRecursoMaestro1Boton1;
    }

    public void setCampoIdClaseRecursoMaestro1Boton1(Button component) {
        this.campoIdClaseRecursoMaestro1Boton1 = component;
    }

    private Button campoIdClaseRecursoMaestro1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdClaseRecursoMaestro1Boton3() {
        return campoIdClaseRecursoMaestro1Boton3;
    }

    public void setCampoIdClaseRecursoMaestro1Boton3(Button component) {
        this.campoIdClaseRecursoMaestro1Boton3 = component;
    }

    private TableColumn tableColumnIdClaseRecursoMaestro2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdClaseRecursoMaestro2() {
        return tableColumnIdClaseRecursoMaestro2;
    }

    public void setTableColumnIdClaseRecursoMaestro2(TableColumn component) {
        this.tableColumnIdClaseRecursoMaestro2 = component;
    }

    private Label labelIdClaseRecursoMaestro2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoMaestro2() {
        return labelIdClaseRecursoMaestro2;
    }

    public void setLabelIdClaseRecursoMaestro2(Label l) {
        this.labelIdClaseRecursoMaestro2 = l;
    }

    private ImageHyperlink campoIdClaseRecursoMaestro1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdClaseRecursoMaestro1Hiper1() {
        return campoIdClaseRecursoMaestro1Hiper1;
    }

    public void setCampoIdClaseRecursoMaestro1Hiper1(ImageHyperlink component) {
        this.campoIdClaseRecursoMaestro1Hiper1 = component;
    }

    private TableColumn tableColumnIdClaseRecursoSegmento1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdClaseRecursoSegmento1() {
        return tableColumnIdClaseRecursoSegmento1;
    }

    public void setTableColumnIdClaseRecursoSegmento1(TableColumn component) {
        this.tableColumnIdClaseRecursoSegmento1 = component;
    }

    private Label labelIdClaseRecursoSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoSegmento1() {
        return labelIdClaseRecursoSegmento1;
    }

    public void setLabelIdClaseRecursoSegmento1(Label l) {
        this.labelIdClaseRecursoSegmento1 = l;
    }

    private TextField campoIdClaseRecursoSegmento1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseRecursoSegmento1() {
        return campoIdClaseRecursoSegmento1;
    }

    public void setCampoIdClaseRecursoSegmento1(TextField component) {
        this.campoIdClaseRecursoSegmento1 = component;
    }

    private StaticText campoIdClaseRecursoSegmento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseRecursoSegmento1Texto1() {
        return campoIdClaseRecursoSegmento1Texto1;
    }

    public void setCampoIdClaseRecursoSegmento1Texto1(StaticText component) {
        this.campoIdClaseRecursoSegmento1Texto1 = component;
    }

    private Button campoIdClaseRecursoSegmento1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdClaseRecursoSegmento1Boton1() {
        return campoIdClaseRecursoSegmento1Boton1;
    }

    public void setCampoIdClaseRecursoSegmento1Boton1(Button component) {
        this.campoIdClaseRecursoSegmento1Boton1 = component;
    }

    private Button campoIdClaseRecursoSegmento1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdClaseRecursoSegmento1Boton3() {
        return campoIdClaseRecursoSegmento1Boton3;
    }

    public void setCampoIdClaseRecursoSegmento1Boton3(Button component) {
        this.campoIdClaseRecursoSegmento1Boton3 = component;
    }

    private TableColumn tableColumnIdClaseRecursoSegmento2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdClaseRecursoSegmento2() {
        return tableColumnIdClaseRecursoSegmento2;
    }

    public void setTableColumnIdClaseRecursoSegmento2(TableColumn component) {
        this.tableColumnIdClaseRecursoSegmento2 = component;
    }

    private Label labelIdClaseRecursoSegmento2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoSegmento2() {
        return labelIdClaseRecursoSegmento2;
    }

    public void setLabelIdClaseRecursoSegmento2(Label l) {
        this.labelIdClaseRecursoSegmento2 = l;
    }

    private ImageHyperlink campoIdClaseRecursoSegmento1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdClaseRecursoSegmento1Hiper1() {
        return campoIdClaseRecursoSegmento1Hiper1;
    }

    public void setCampoIdClaseRecursoSegmento1Hiper1(ImageHyperlink component) {
        this.campoIdClaseRecursoSegmento1Hiper1 = component;
    }

    private TableColumn tableColumnIdClaseRecursoBase1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdClaseRecursoBase1() {
        return tableColumnIdClaseRecursoBase1;
    }

    public void setTableColumnIdClaseRecursoBase1(TableColumn component) {
        this.tableColumnIdClaseRecursoBase1 = component;
    }

    private Label labelIdClaseRecursoBase1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoBase1() {
        return labelIdClaseRecursoBase1;
    }

    public void setLabelIdClaseRecursoBase1(Label l) {
        this.labelIdClaseRecursoBase1 = l;
    }

    private TextField campoIdClaseRecursoBase1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseRecursoBase1() {
        return campoIdClaseRecursoBase1;
    }

    public void setCampoIdClaseRecursoBase1(TextField component) {
        this.campoIdClaseRecursoBase1 = component;
    }

    private StaticText campoIdClaseRecursoBase1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseRecursoBase1Texto1() {
        return campoIdClaseRecursoBase1Texto1;
    }

    public void setCampoIdClaseRecursoBase1Texto1(StaticText component) {
        this.campoIdClaseRecursoBase1Texto1 = component;
    }

    private Button campoIdClaseRecursoBase1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdClaseRecursoBase1Boton1() {
        return campoIdClaseRecursoBase1Boton1;
    }

    public void setCampoIdClaseRecursoBase1Boton1(Button component) {
        this.campoIdClaseRecursoBase1Boton1 = component;
    }

    private Button campoIdClaseRecursoBase1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdClaseRecursoBase1Boton3() {
        return campoIdClaseRecursoBase1Boton3;
    }

    public void setCampoIdClaseRecursoBase1Boton3(Button component) {
        this.campoIdClaseRecursoBase1Boton3 = component;
    }

    private TableColumn tableColumnIdClaseRecursoBase2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdClaseRecursoBase2() {
        return tableColumnIdClaseRecursoBase2;
    }

    public void setTableColumnIdClaseRecursoBase2(TableColumn component) {
        this.tableColumnIdClaseRecursoBase2 = component;
    }

    private Label labelIdClaseRecursoBase2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoBase2() {
        return labelIdClaseRecursoBase2;
    }

    public void setLabelIdClaseRecursoBase2(Label l) {
        this.labelIdClaseRecursoBase2 = l;
    }

    private ImageHyperlink campoIdClaseRecursoBase1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdClaseRecursoBase1Hiper1() {
        return campoIdClaseRecursoBase1Hiper1;
    }

    public void setCampoIdClaseRecursoBase1Hiper1(ImageHyperlink component) {
        this.campoIdClaseRecursoBase1Hiper1 = component;
    }

    private TableColumn tableColumnIdGrupoAplicacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdGrupoAplicacion1() {
        return tableColumnIdGrupoAplicacion1;
    }

    public void setTableColumnIdGrupoAplicacion1(TableColumn component) {
        this.tableColumnIdGrupoAplicacion1 = component;
    }

    private Label labelIdGrupoAplicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdGrupoAplicacion1() {
        return labelIdGrupoAplicacion1;
    }

    public void setLabelIdGrupoAplicacion1(Label l) {
        this.labelIdGrupoAplicacion1 = l;
    }

    private TextField campoIdGrupoAplicacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdGrupoAplicacion1() {
        return campoIdGrupoAplicacion1;
    }

    public void setCampoIdGrupoAplicacion1(TextField component) {
        this.campoIdGrupoAplicacion1 = component;
    }

    private StaticText campoIdGrupoAplicacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdGrupoAplicacion1Texto1() {
        return campoIdGrupoAplicacion1Texto1;
    }

    public void setCampoIdGrupoAplicacion1Texto1(StaticText component) {
        this.campoIdGrupoAplicacion1Texto1 = component;
    }

    private Button campoIdGrupoAplicacion1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdGrupoAplicacion1Boton1() {
        return campoIdGrupoAplicacion1Boton1;
    }

    public void setCampoIdGrupoAplicacion1Boton1(Button component) {
        this.campoIdGrupoAplicacion1Boton1 = component;
    }

    private Button campoIdGrupoAplicacion1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdGrupoAplicacion1Boton3() {
        return campoIdGrupoAplicacion1Boton3;
    }

    public void setCampoIdGrupoAplicacion1Boton3(Button component) {
        this.campoIdGrupoAplicacion1Boton3 = component;
    }

    private TableColumn tableColumnIdGrupoAplicacion2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdGrupoAplicacion2() {
        return tableColumnIdGrupoAplicacion2;
    }

    public void setTableColumnIdGrupoAplicacion2(TableColumn component) {
        this.tableColumnIdGrupoAplicacion2 = component;
    }

    private Label labelIdGrupoAplicacion2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdGrupoAplicacion2() {
        return labelIdGrupoAplicacion2;
    }

    public void setLabelIdGrupoAplicacion2(Label l) {
        this.labelIdGrupoAplicacion2 = l;
    }

    private ImageHyperlink campoIdGrupoAplicacion1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdGrupoAplicacion1Hiper1() {
        return campoIdGrupoAplicacion1Hiper1;
    }

    public void setCampoIdGrupoAplicacion1Hiper1(ImageHyperlink component) {
        this.campoIdGrupoAplicacion1Hiper1 = component;
    }

    private TableColumn tableColumnIdAplicacionWeb1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdAplicacionWeb1() {
        return tableColumnIdAplicacionWeb1;
    }

    public void setTableColumnIdAplicacionWeb1(TableColumn component) {
        this.tableColumnIdAplicacionWeb1 = component;
    }

    private Label labelIdAplicacionWeb1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdAplicacionWeb1() {
        return labelIdAplicacionWeb1;
    }

    public void setLabelIdAplicacionWeb1(Label l) {
        this.labelIdAplicacionWeb1 = l;
    }

    private TextField campoIdAplicacionWeb1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdAplicacionWeb1() {
        return campoIdAplicacionWeb1;
    }

    public void setCampoIdAplicacionWeb1(TextField component) {
        this.campoIdAplicacionWeb1 = component;
    }

    private StaticText campoIdAplicacionWeb1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdAplicacionWeb1Texto1() {
        return campoIdAplicacionWeb1Texto1;
    }

    public void setCampoIdAplicacionWeb1Texto1(StaticText component) {
        this.campoIdAplicacionWeb1Texto1 = component;
    }

    private LongConverter converterIdAplicacionWeb1 = new LongConverter();
  
    public LongConverter getConverterIdAplicacionWeb1() {
        return converterIdAplicacionWeb1;
    }
  
    public void setConverterIdAplicacionWeb1(LongConverter converter) {
        this.converterIdAplicacionWeb1 = converter;
    }
  
    private LongRangeValidator validatorIdAplicacionWeb1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdAplicacionWeb1() {
        return validatorIdAplicacionWeb1;
    }
  
    public void setValidatorIdAplicacionWeb1(LongRangeValidator validator) {
        this.validatorIdAplicacionWeb1 = validator;
    }
  
    private TableColumn tableColumnLimiteFilasConsulta1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnLimiteFilasConsulta1() {
        return tableColumnLimiteFilasConsulta1;
    }

    public void setTableColumnLimiteFilasConsulta1(TableColumn component) {
        this.tableColumnLimiteFilasConsulta1 = component;
    }

    private Label labelLimiteFilasConsulta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLimiteFilasConsulta1() {
        return labelLimiteFilasConsulta1;
    }

    public void setLabelLimiteFilasConsulta1(Label l) {
        this.labelLimiteFilasConsulta1 = l;
    }

    private TextField campoLimiteFilasConsulta1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoLimiteFilasConsulta1() {
        return campoLimiteFilasConsulta1;
    }

    public void setCampoLimiteFilasConsulta1(TextField component) {
        this.campoLimiteFilasConsulta1 = component;
    }

    private StaticText campoLimiteFilasConsulta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLimiteFilasConsulta1Texto1() {
        return campoLimiteFilasConsulta1Texto1;
    }

    public void setCampoLimiteFilasConsulta1Texto1(StaticText component) {
        this.campoLimiteFilasConsulta1Texto1 = component;
    }

    private IntegerConverter converterLimiteFilasConsulta1 = new IntegerConverter();
  
    public IntegerConverter getConverterLimiteFilasConsulta1() {
        return converterLimiteFilasConsulta1;
    }
  
    public void setConverterLimiteFilasConsulta1(IntegerConverter converter) {
        this.converterLimiteFilasConsulta1 = converter;
    }
  
    private LongRangeValidator validatorLimiteFilasConsulta1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorLimiteFilasConsulta1() {
        return validatorLimiteFilasConsulta1;
    }
  
    public void setValidatorLimiteFilasConsulta1(LongRangeValidator validator) {
        this.validatorLimiteFilasConsulta1 = validator;
    }
  
    private TableColumn tableColumnLimiteFilasInforme1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnLimiteFilasInforme1() {
        return tableColumnLimiteFilasInforme1;
    }

    public void setTableColumnLimiteFilasInforme1(TableColumn component) {
        this.tableColumnLimiteFilasInforme1 = component;
    }

    private Label labelLimiteFilasInforme1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLimiteFilasInforme1() {
        return labelLimiteFilasInforme1;
    }

    public void setLabelLimiteFilasInforme1(Label l) {
        this.labelLimiteFilasInforme1 = l;
    }

    private TextField campoLimiteFilasInforme1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoLimiteFilasInforme1() {
        return campoLimiteFilasInforme1;
    }

    public void setCampoLimiteFilasInforme1(TextField component) {
        this.campoLimiteFilasInforme1 = component;
    }

    private StaticText campoLimiteFilasInforme1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLimiteFilasInforme1Texto1() {
        return campoLimiteFilasInforme1Texto1;
    }

    public void setCampoLimiteFilasInforme1Texto1(StaticText component) {
        this.campoLimiteFilasInforme1Texto1 = component;
    }

    private IntegerConverter converterLimiteFilasInforme1 = new IntegerConverter();
  
    public IntegerConverter getConverterLimiteFilasInforme1() {
        return converterLimiteFilasInforme1;
    }
  
    public void setConverterLimiteFilasInforme1(IntegerConverter converter) {
        this.converterLimiteFilasInforme1 = converter;
    }
  
    private LongRangeValidator validatorLimiteFilasInforme1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorLimiteFilasInforme1() {
        return validatorLimiteFilasInforme1;
    }
  
    public void setValidatorLimiteFilasInforme1(LongRangeValidator validator) {
        this.validatorLimiteFilasInforme1 = validator;
    }
  
    private TableColumn tableColumnOrdenPresentacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnOrdenPresentacion1() {
        return tableColumnOrdenPresentacion1;
    }

    public void setTableColumnOrdenPresentacion1(TableColumn component) {
        this.tableColumnOrdenPresentacion1 = component;
    }

    private Label labelOrdenPresentacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOrdenPresentacion1() {
        return labelOrdenPresentacion1;
    }

    public void setLabelOrdenPresentacion1(Label l) {
        this.labelOrdenPresentacion1 = l;
    }

    private TextField campoOrdenPresentacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOrdenPresentacion1() {
        return campoOrdenPresentacion1;
    }

    public void setCampoOrdenPresentacion1(TextField component) {
        this.campoOrdenPresentacion1 = component;
    }

    private StaticText campoOrdenPresentacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOrdenPresentacion1Texto1() {
        return campoOrdenPresentacion1Texto1;
    }

    public void setCampoOrdenPresentacion1Texto1(StaticText component) {
        this.campoOrdenPresentacion1Texto1 = component;
    }

    private IntegerConverter converterOrdenPresentacion1 = new IntegerConverter();
  
    public IntegerConverter getConverterOrdenPresentacion1() {
        return converterOrdenPresentacion1;
    }
  
    public void setConverterOrdenPresentacion1(IntegerConverter converter) {
        this.converterOrdenPresentacion1 = converter;
    }
  
    private LongRangeValidator validatorOrdenPresentacion1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorOrdenPresentacion1() {
        return validatorOrdenPresentacion1;
    }
  
    public void setValidatorOrdenPresentacion1(LongRangeValidator validator) {
        this.validatorOrdenPresentacion1 = validator;
    }
  
    private TableColumn tableColumnEsClaseRecursoInsertable1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsClaseRecursoInsertable1() {
        return tableColumnEsClaseRecursoInsertable1;
    }

    public void setTableColumnEsClaseRecursoInsertable1(TableColumn component) {
        this.tableColumnEsClaseRecursoInsertable1 = component;
    }

    private Label labelEsClaseRecursoInsertable1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsClaseRecursoInsertable1() {
        return labelEsClaseRecursoInsertable1;
    }

    public void setLabelEsClaseRecursoInsertable1(Label l) {
        this.labelEsClaseRecursoInsertable1 = l;
    }

    private DropDown listaEsClaseRecursoInsertable1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsClaseRecursoInsertable1() {
        return listaEsClaseRecursoInsertable1;
    }

    public void setListaEsClaseRecursoInsertable1(DropDown component) {
        this.listaEsClaseRecursoInsertable1 = component;
    }

    private StaticText listaEsClaseRecursoInsertable1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsClaseRecursoInsertable1Texto1() {
        return listaEsClaseRecursoInsertable1Texto1;
    }

    public void setListaEsClaseRecursoInsertable1Texto1(StaticText component) {
        this.listaEsClaseRecursoInsertable1Texto1 = component;
    }

    private IntegerConverter converterEsClaseRecursoInsertable1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsClaseRecursoInsertable1() {
        return converterEsClaseRecursoInsertable1;
    }
  
    public void setConverterEsClaseRecursoInsertable1(IntegerConverter converter) {
        this.converterEsClaseRecursoInsertable1 = converter;
    }
  
    private TableColumn tableColumnEsClaseRecursoModificable1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsClaseRecursoModificable1() {
        return tableColumnEsClaseRecursoModificable1;
    }

    public void setTableColumnEsClaseRecursoModificable1(TableColumn component) {
        this.tableColumnEsClaseRecursoModificable1 = component;
    }

    private Label labelEsClaseRecursoModificable1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsClaseRecursoModificable1() {
        return labelEsClaseRecursoModificable1;
    }

    public void setLabelEsClaseRecursoModificable1(Label l) {
        this.labelEsClaseRecursoModificable1 = l;
    }

    private DropDown listaEsClaseRecursoModificable1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsClaseRecursoModificable1() {
        return listaEsClaseRecursoModificable1;
    }

    public void setListaEsClaseRecursoModificable1(DropDown component) {
        this.listaEsClaseRecursoModificable1 = component;
    }

    private StaticText listaEsClaseRecursoModificable1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsClaseRecursoModificable1Texto1() {
        return listaEsClaseRecursoModificable1Texto1;
    }

    public void setListaEsClaseRecursoModificable1Texto1(StaticText component) {
        this.listaEsClaseRecursoModificable1Texto1 = component;
    }

    private IntegerConverter converterEsClaseRecursoModificable1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsClaseRecursoModificable1() {
        return converterEsClaseRecursoModificable1;
    }
  
    public void setConverterEsClaseRecursoModificable1(IntegerConverter converter) {
        this.converterEsClaseRecursoModificable1 = converter;
    }
  
    private TableColumn tableColumnEsClaseRecursoEliminable1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsClaseRecursoEliminable1() {
        return tableColumnEsClaseRecursoEliminable1;
    }

    public void setTableColumnEsClaseRecursoEliminable1(TableColumn component) {
        this.tableColumnEsClaseRecursoEliminable1 = component;
    }

    private Label labelEsClaseRecursoEliminable1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsClaseRecursoEliminable1() {
        return labelEsClaseRecursoEliminable1;
    }

    public void setLabelEsClaseRecursoEliminable1(Label l) {
        this.labelEsClaseRecursoEliminable1 = l;
    }

    private DropDown listaEsClaseRecursoEliminable1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsClaseRecursoEliminable1() {
        return listaEsClaseRecursoEliminable1;
    }

    public void setListaEsClaseRecursoEliminable1(DropDown component) {
        this.listaEsClaseRecursoEliminable1 = component;
    }

    private StaticText listaEsClaseRecursoEliminable1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsClaseRecursoEliminable1Texto1() {
        return listaEsClaseRecursoEliminable1Texto1;
    }

    public void setListaEsClaseRecursoEliminable1Texto1(StaticText component) {
        this.listaEsClaseRecursoEliminable1Texto1 = component;
    }

    private IntegerConverter converterEsClaseRecursoEliminable1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsClaseRecursoEliminable1() {
        return converterEsClaseRecursoEliminable1;
    }
  
    public void setConverterEsClaseRecursoEliminable1(IntegerConverter converter) {
        this.converterEsClaseRecursoEliminable1 = converter;
    }
  
    private TableColumn tableColumnEsClaseRecursoExtendida1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsClaseRecursoExtendida1() {
        return tableColumnEsClaseRecursoExtendida1;
    }

    public void setTableColumnEsClaseRecursoExtendida1(TableColumn component) {
        this.tableColumnEsClaseRecursoExtendida1 = component;
    }

    private Label labelEsClaseRecursoExtendida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsClaseRecursoExtendida1() {
        return labelEsClaseRecursoExtendida1;
    }

    public void setLabelEsClaseRecursoExtendida1(Label l) {
        this.labelEsClaseRecursoExtendida1 = l;
    }

    private DropDown listaEsClaseRecursoExtendida1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsClaseRecursoExtendida1() {
        return listaEsClaseRecursoExtendida1;
    }

    public void setListaEsClaseRecursoExtendida1(DropDown component) {
        this.listaEsClaseRecursoExtendida1 = component;
    }

    private StaticText listaEsClaseRecursoExtendida1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsClaseRecursoExtendida1Texto1() {
        return listaEsClaseRecursoExtendida1Texto1;
    }

    public void setListaEsClaseRecursoExtendida1Texto1(StaticText component) {
        this.listaEsClaseRecursoExtendida1Texto1 = component;
    }

    private IntegerConverter converterEsClaseRecursoExtendida1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsClaseRecursoExtendida1() {
        return converterEsClaseRecursoExtendida1;
    }
  
    public void setConverterEsClaseRecursoExtendida1(IntegerConverter converter) {
        this.converterEsClaseRecursoExtendida1 = converter;
    }
  
    private TableColumn tableColumnEtiquetaHipervinculo1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEtiquetaHipervinculo1() {
        return tableColumnEtiquetaHipervinculo1;
    }

    public void setTableColumnEtiquetaHipervinculo1(TableColumn component) {
        this.tableColumnEtiquetaHipervinculo1 = component;
    }

    private Label labelEtiquetaHipervinculo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEtiquetaHipervinculo1() {
        return labelEtiquetaHipervinculo1;
    }

    public void setLabelEtiquetaHipervinculo1(Label l) {
        this.labelEtiquetaHipervinculo1 = l;
    }

    private TextField campoEtiquetaHipervinculo1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoEtiquetaHipervinculo1() {
        return campoEtiquetaHipervinculo1;
    }

    public void setCampoEtiquetaHipervinculo1(TextField component) {
        this.campoEtiquetaHipervinculo1 = component;
    }

    private StaticText campoEtiquetaHipervinculo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoEtiquetaHipervinculo1Texto1() {
        return campoEtiquetaHipervinculo1Texto1;
    }

    public void setCampoEtiquetaHipervinculo1Texto1(StaticText component) {
        this.campoEtiquetaHipervinculo1Texto1 = component;
    }

    private LengthValidator validatorEtiquetaHipervinculo1 = new LengthValidator();
  
    public LengthValidator getValidatorEtiquetaHipervinculo1() {
        return validatorEtiquetaHipervinculo1;
    }
  
    public void setValidatorEtiquetaHipervinculo1(LengthValidator validator) {
        this.validatorEtiquetaHipervinculo1 = validator;
    }
  
    private TableColumn tableColumnEsEnumeradorConNumero1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsEnumeradorConNumero1() {
        return tableColumnEsEnumeradorConNumero1;
    }

    public void setTableColumnEsEnumeradorConNumero1(TableColumn component) {
        this.tableColumnEsEnumeradorConNumero1 = component;
    }

    private Label labelEsEnumeradorConNumero1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsEnumeradorConNumero1() {
        return labelEsEnumeradorConNumero1;
    }

    public void setLabelEsEnumeradorConNumero1(Label l) {
        this.labelEsEnumeradorConNumero1 = l;
    }

    private DropDown listaEsEnumeradorConNumero1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsEnumeradorConNumero1() {
        return listaEsEnumeradorConNumero1;
    }

    public void setListaEsEnumeradorConNumero1(DropDown component) {
        this.listaEsEnumeradorConNumero1 = component;
    }

    private StaticText listaEsEnumeradorConNumero1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsEnumeradorConNumero1Texto1() {
        return listaEsEnumeradorConNumero1Texto1;
    }

    public void setListaEsEnumeradorConNumero1Texto1(StaticText component) {
        this.listaEsEnumeradorConNumero1Texto1 = component;
    }

    private IntegerConverter converterEsEnumeradorConNumero1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsEnumeradorConNumero1() {
        return converterEsEnumeradorConNumero1;
    }
  
    public void setConverterEsEnumeradorConNumero1(IntegerConverter converter) {
        this.converterEsEnumeradorConNumero1 = converter;
    }
  
    private TableColumn tableColumnAliasClaseRecurso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnAliasClaseRecurso1() {
        return tableColumnAliasClaseRecurso1;
    }

    public void setTableColumnAliasClaseRecurso1(TableColumn component) {
        this.tableColumnAliasClaseRecurso1 = component;
    }

    private Label labelAliasClaseRecurso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelAliasClaseRecurso1() {
        return labelAliasClaseRecurso1;
    }

    public void setLabelAliasClaseRecurso1(Label l) {
        this.labelAliasClaseRecurso1 = l;
    }

    private TextField campoAliasClaseRecurso1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoAliasClaseRecurso1() {
        return campoAliasClaseRecurso1;
    }

    public void setCampoAliasClaseRecurso1(TextField component) {
        this.campoAliasClaseRecurso1 = component;
    }

    private StaticText campoAliasClaseRecurso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoAliasClaseRecurso1Texto1() {
        return campoAliasClaseRecurso1Texto1;
    }

    public void setCampoAliasClaseRecurso1Texto1(StaticText component) {
        this.campoAliasClaseRecurso1Texto1 = component;
    }

    private LengthValidator validatorAliasClaseRecurso1 = new LengthValidator();
  
    public LengthValidator getValidatorAliasClaseRecurso1() {
        return validatorAliasClaseRecurso1;
    }
  
    public void setValidatorAliasClaseRecurso1(LengthValidator validator) {
        this.validatorAliasClaseRecurso1 = validator;
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

    private PaginaCachedRowSetDataProvider2 paginaReferenceDataProvider = new PaginaCachedRowSetDataProvider2();

    @Override
    public PaginaCachedRowSetDataProvider2 getPaginaReferenceDataProvider() {
        return paginaReferenceDataProvider;
    }

    public void setPaginaReferenceDataProvider(PaginaCachedRowSetDataProvider2 crsdp) {
        this.paginaReferenceDataProvider = crsdp;
    }

    private ClaseRecursoCachedRowSetDataProvider2 claseRecursoReferenceDataProvider = new ClaseRecursoCachedRowSetDataProvider2();

    @Override
    public ClaseRecursoCachedRowSetDataProvider2 getClaseRecursoReferenceDataProvider() {
        return claseRecursoReferenceDataProvider;
    }

    public void setClaseRecursoReferenceDataProvider(ClaseRecursoCachedRowSetDataProvider2 crsdp) {
        this.claseRecursoReferenceDataProvider = crsdp;
    }

    private GrupoAplicacionCachedRowSetDataProvider2 grupoAplicacionReferenceDataProvider = new GrupoAplicacionCachedRowSetDataProvider2();

    @Override
    public GrupoAplicacionCachedRowSetDataProvider2 getGrupoAplicacionReferenceDataProvider() {
        return grupoAplicacionReferenceDataProvider;
    }

    public void setGrupoAplicacionReferenceDataProvider(GrupoAplicacionCachedRowSetDataProvider2 crsdp) {
        this.grupoAplicacionReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public ClaseRecurso1() {
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
        claseRecursoDataProvider.close();
        funcionReferenceDataProvider.close();
        paginaReferenceDataProvider.close();
        claseRecursoReferenceDataProvider.close();
        grupoAplicacionReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionClaseRecurso...">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion con tabla">
    private GestorPaginaActualizacionConTabla gestor = new GestorPaginaActualizacionConTabla(this);

    @Override
    public GestorPaginaActualizacionConTabla getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionClaseRecurso asistente = new AsistentePaginaActualizacionClaseRecurso(this);

    public AsistentePaginaActualizacionClaseRecurso getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("ClaseRecurso1_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("ClaseRecurso1_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("ClaseRecurso1_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getClaseRecursoDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return ClaseRecursoCachedRowSetDataProvider2.FUNCION_CONSULTAR_CLASE_RECURSO;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return ClaseRecursoCachedRowSetDataProvider2.FUNCION_CREAR_CLASE_RECURSO;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return ClaseRecursoCachedRowSetDataProvider2.FUNCION_MODIFICAR_CLASE_RECURSO;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return ClaseRecursoCachedRowSetDataProvider2.FUNCION_ELIMINAR_CLASE_RECURSO;
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
            this.getClaseRecursoDataProvider().consultarClaseRecurso(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getClaseRecursoDataProvider().consultarClaseRecurso(filtro);
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

    public void campoIdPaginaSeleccion1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdPaginaSeleccion1_validate(context, component, value);
    }

    public void campoIdPaginaDetalle1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdPaginaDetalle1_validate(context, component, value);
    }

    public void campoIdClaseRecursoMaestro1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdClaseRecursoMaestro1_validate(context, component, value);
    }

    public void campoIdClaseRecursoSegmento1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdClaseRecursoSegmento1_validate(context, component, value);
    }

    public void campoIdClaseRecursoBase1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdClaseRecursoBase1_validate(context, component, value);
    }

    public void campoIdGrupoAplicacion1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdGrupoAplicacion1_validate(context, component, value);
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
