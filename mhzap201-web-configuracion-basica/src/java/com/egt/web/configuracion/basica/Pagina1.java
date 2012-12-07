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

import com.egt.data.general.xdp2.PaginaCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.AplicacionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.DominioCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ParametroCachedRowSetDataProvider2;
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

public class Pagina1 extends AbstractPageBean
        implements PaginaActualizacionPagina, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdPagina1.setMinimum(0L);
        validatorIdPagina1.setMaximum(1000000000000000000L);
        validatorCodigoPagina1.setMaximum(100);
        validatorNombrePagina1.setMaximum(100);
        validatorDescripcionPagina1.setMaximum(8160);
        validatorUrlPagina1.setMaximum(8160);
        paginaDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.paginaRowSet}"));
        aplicacionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.aplicacionReferenceRowSet}"));
        dominioReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.dominioReferenceRowSet}"));
        parametroReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.parametroReferenceRowSet}"));
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

    private TableColumn tableColumnIdPagina1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdPagina1() {
        return tableColumnIdPagina1;
    }

    public void setTableColumnIdPagina1(TableColumn component) {
        this.tableColumnIdPagina1 = component;
    }

    private Label labelIdPagina1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPagina1() {
        return labelIdPagina1;
    }

    public void setLabelIdPagina1(Label l) {
        this.labelIdPagina1 = l;
    }

    private TextField campoIdPagina1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdPagina1() {
        return campoIdPagina1;
    }

    public void setCampoIdPagina1(TextField component) {
        this.campoIdPagina1 = component;
    }

    private StaticText campoIdPagina1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdPagina1Texto1() {
        return campoIdPagina1Texto1;
    }

    public void setCampoIdPagina1Texto1(StaticText component) {
        this.campoIdPagina1Texto1 = component;
    }

    private LongConverter converterIdPagina1 = new LongConverter();
  
    public LongConverter getConverterIdPagina1() {
        return converterIdPagina1;
    }
  
    public void setConverterIdPagina1(LongConverter converter) {
        this.converterIdPagina1 = converter;
    }
  
    private LongRangeValidator validatorIdPagina1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdPagina1() {
        return validatorIdPagina1;
    }
  
    public void setValidatorIdPagina1(LongRangeValidator validator) {
        this.validatorIdPagina1 = validator;
    }
  
    private TableColumn tableColumnCodigoPagina1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCodigoPagina1() {
        return tableColumnCodigoPagina1;
    }

    public void setTableColumnCodigoPagina1(TableColumn component) {
        this.tableColumnCodigoPagina1 = component;
    }

    private Label labelCodigoPagina1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoPagina1() {
        return labelCodigoPagina1;
    }

    public void setLabelCodigoPagina1(Label l) {
        this.labelCodigoPagina1 = l;
    }

    private TextField campoCodigoPagina1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoPagina1() {
        return campoCodigoPagina1;
    }

    public void setCampoCodigoPagina1(TextField component) {
        this.campoCodigoPagina1 = component;
    }

    private StaticText campoCodigoPagina1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoPagina1Texto1() {
        return campoCodigoPagina1Texto1;
    }

    public void setCampoCodigoPagina1Texto1(StaticText component) {
        this.campoCodigoPagina1Texto1 = component;
    }

    private LengthValidator validatorCodigoPagina1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoPagina1() {
        return validatorCodigoPagina1;
    }
  
    public void setValidatorCodigoPagina1(LengthValidator validator) {
        this.validatorCodigoPagina1 = validator;
    }
  
    private TableColumn tableColumnNombrePagina1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombrePagina1() {
        return tableColumnNombrePagina1;
    }

    public void setTableColumnNombrePagina1(TableColumn component) {
        this.tableColumnNombrePagina1 = component;
    }

    private Label labelNombrePagina1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombrePagina1() {
        return labelNombrePagina1;
    }

    public void setLabelNombrePagina1(Label l) {
        this.labelNombrePagina1 = l;
    }

    private TextField campoNombrePagina1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombrePagina1() {
        return campoNombrePagina1;
    }

    public void setCampoNombrePagina1(TextField component) {
        this.campoNombrePagina1 = component;
    }

    private StaticText campoNombrePagina1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombrePagina1Texto1() {
        return campoNombrePagina1Texto1;
    }

    public void setCampoNombrePagina1Texto1(StaticText component) {
        this.campoNombrePagina1Texto1 = component;
    }

    private LengthValidator validatorNombrePagina1 = new LengthValidator();
  
    public LengthValidator getValidatorNombrePagina1() {
        return validatorNombrePagina1;
    }
  
    public void setValidatorNombrePagina1(LengthValidator validator) {
        this.validatorNombrePagina1 = validator;
    }
  
    private TableColumn tableColumnDescripcionPagina1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnDescripcionPagina1() {
        return tableColumnDescripcionPagina1;
    }

    public void setTableColumnDescripcionPagina1(TableColumn component) {
        this.tableColumnDescripcionPagina1 = component;
    }

    private Label labelDescripcionPagina1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDescripcionPagina1() {
        return labelDescripcionPagina1;
    }

    public void setLabelDescripcionPagina1(Label l) {
        this.labelDescripcionPagina1 = l;
    }

    private TextArea campoDescripcionPagina1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDescripcionPagina1() {
        return campoDescripcionPagina1;
    }

    public void setCampoDescripcionPagina1(TextArea component) {
        this.campoDescripcionPagina1 = component;
    }

    private StaticText campoDescripcionPagina1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDescripcionPagina1Texto1() {
        return campoDescripcionPagina1Texto1;
    }

    public void setCampoDescripcionPagina1Texto1(StaticText component) {
        this.campoDescripcionPagina1Texto1 = component;
    }

    private LengthValidator validatorDescripcionPagina1 = new LengthValidator();
  
    public LengthValidator getValidatorDescripcionPagina1() {
        return validatorDescripcionPagina1;
    }
  
    public void setValidatorDescripcionPagina1(LengthValidator validator) {
        this.validatorDescripcionPagina1 = validator;
    }
  
    private TableColumn tableColumnUrlPagina1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnUrlPagina1() {
        return tableColumnUrlPagina1;
    }

    public void setTableColumnUrlPagina1(TableColumn component) {
        this.tableColumnUrlPagina1 = component;
    }

    private Label labelUrlPagina1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelUrlPagina1() {
        return labelUrlPagina1;
    }

    public void setLabelUrlPagina1(Label l) {
        this.labelUrlPagina1 = l;
    }

    private TextArea campoUrlPagina1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoUrlPagina1() {
        return campoUrlPagina1;
    }

    public void setCampoUrlPagina1(TextArea component) {
        this.campoUrlPagina1 = component;
    }

    private StaticText campoUrlPagina1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoUrlPagina1Texto1() {
        return campoUrlPagina1Texto1;
    }

    public void setCampoUrlPagina1Texto1(StaticText component) {
        this.campoUrlPagina1Texto1 = component;
    }

    private LengthValidator validatorUrlPagina1 = new LengthValidator();
  
    public LengthValidator getValidatorUrlPagina1() {
        return validatorUrlPagina1;
    }
  
    public void setValidatorUrlPagina1(LengthValidator validator) {
        this.validatorUrlPagina1 = validator;
    }
  
    private TableColumn tableColumnIdAplicacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdAplicacion1() {
        return tableColumnIdAplicacion1;
    }

    public void setTableColumnIdAplicacion1(TableColumn component) {
        this.tableColumnIdAplicacion1 = component;
    }

    private Label labelIdAplicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdAplicacion1() {
        return labelIdAplicacion1;
    }

    public void setLabelIdAplicacion1(Label l) {
        this.labelIdAplicacion1 = l;
    }

    private TextField campoIdAplicacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdAplicacion1() {
        return campoIdAplicacion1;
    }

    public void setCampoIdAplicacion1(TextField component) {
        this.campoIdAplicacion1 = component;
    }

    private StaticText campoIdAplicacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdAplicacion1Texto1() {
        return campoIdAplicacion1Texto1;
    }

    public void setCampoIdAplicacion1Texto1(StaticText component) {
        this.campoIdAplicacion1Texto1 = component;
    }

    private Button campoIdAplicacion1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdAplicacion1Boton1() {
        return campoIdAplicacion1Boton1;
    }

    public void setCampoIdAplicacion1Boton1(Button component) {
        this.campoIdAplicacion1Boton1 = component;
    }

    private Button campoIdAplicacion1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdAplicacion1Boton3() {
        return campoIdAplicacion1Boton3;
    }

    public void setCampoIdAplicacion1Boton3(Button component) {
        this.campoIdAplicacion1Boton3 = component;
    }

    private TableColumn tableColumnIdAplicacion2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdAplicacion2() {
        return tableColumnIdAplicacion2;
    }

    public void setTableColumnIdAplicacion2(TableColumn component) {
        this.tableColumnIdAplicacion2 = component;
    }

    private Label labelIdAplicacion2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdAplicacion2() {
        return labelIdAplicacion2;
    }

    public void setLabelIdAplicacion2(Label l) {
        this.labelIdAplicacion2 = l;
    }

    private ImageHyperlink campoIdAplicacion1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdAplicacion1Hiper1() {
        return campoIdAplicacion1Hiper1;
    }

    public void setCampoIdAplicacion1Hiper1(ImageHyperlink component) {
        this.campoIdAplicacion1Hiper1 = component;
    }

    private TableColumn tableColumnEsPublica1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsPublica1() {
        return tableColumnEsPublica1;
    }

    public void setTableColumnEsPublica1(TableColumn component) {
        this.tableColumnEsPublica1 = component;
    }

    private Label labelEsPublica1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPublica1() {
        return labelEsPublica1;
    }

    public void setLabelEsPublica1(Label l) {
        this.labelEsPublica1 = l;
    }

    private DropDown listaEsPublica1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPublica1() {
        return listaEsPublica1;
    }

    public void setListaEsPublica1(DropDown component) {
        this.listaEsPublica1 = component;
    }

    private StaticText listaEsPublica1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPublica1Texto1() {
        return listaEsPublica1Texto1;
    }

    public void setListaEsPublica1Texto1(StaticText component) {
        this.listaEsPublica1Texto1 = component;
    }

    private IntegerConverter converterEsPublica1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPublica1() {
        return converterEsPublica1;
    }
  
    public void setConverterEsPublica1(IntegerConverter converter) {
        this.converterEsPublica1 = converter;
    }
  
    private TableColumn tableColumnNumeroTipoPagina1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoPagina1() {
        return tableColumnNumeroTipoPagina1;
    }

    public void setTableColumnNumeroTipoPagina1(TableColumn component) {
        this.tableColumnNumeroTipoPagina1 = component;
    }

    private Label labelNumeroTipoPagina1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoPagina1() {
        return labelNumeroTipoPagina1;
    }

    public void setLabelNumeroTipoPagina1(Label l) {
        this.labelNumeroTipoPagina1 = l;
    }

    private DropDown listaNumeroTipoPagina1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoPagina1() {
        return listaNumeroTipoPagina1;
    }

    public void setListaNumeroTipoPagina1(DropDown component) {
        this.listaNumeroTipoPagina1 = component;
    }

    private StaticText listaNumeroTipoPagina1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoPagina1Texto1() {
        return listaNumeroTipoPagina1Texto1;
    }

    public void setListaNumeroTipoPagina1Texto1(StaticText component) {
        this.listaNumeroTipoPagina1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoPagina1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoPagina1() {
        return converterNumeroTipoPagina1;
    }
  
    public void setConverterNumeroTipoPagina1(IntegerConverter converter) {
        this.converterNumeroTipoPagina1 = converter;
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

    private Button campoIdDominio1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDominio1Boton1() {
        return campoIdDominio1Boton1;
    }

    public void setCampoIdDominio1Boton1(Button component) {
        this.campoIdDominio1Boton1 = component;
    }

    private Button campoIdDominio1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDominio1Boton3() {
        return campoIdDominio1Boton3;
    }

    public void setCampoIdDominio1Boton3(Button component) {
        this.campoIdDominio1Boton3 = component;
    }

    private TableColumn tableColumnIdDominio2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdDominio2() {
        return tableColumnIdDominio2;
    }

    public void setTableColumnIdDominio2(TableColumn component) {
        this.tableColumnIdDominio2 = component;
    }

    private Label labelIdDominio2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDominio2() {
        return labelIdDominio2;
    }

    public void setLabelIdDominio2(Label l) {
        this.labelIdDominio2 = l;
    }

    private ImageHyperlink campoIdDominio1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdDominio1Hiper1() {
        return campoIdDominio1Hiper1;
    }

    public void setCampoIdDominio1Hiper1(ImageHyperlink component) {
        this.campoIdDominio1Hiper1 = component;
    }

    private TableColumn tableColumnIdDominioMaestro1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdDominioMaestro1() {
        return tableColumnIdDominioMaestro1;
    }

    public void setTableColumnIdDominioMaestro1(TableColumn component) {
        this.tableColumnIdDominioMaestro1 = component;
    }

    private Label labelIdDominioMaestro1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDominioMaestro1() {
        return labelIdDominioMaestro1;
    }

    public void setLabelIdDominioMaestro1(Label l) {
        this.labelIdDominioMaestro1 = l;
    }

    private TextField campoIdDominioMaestro1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdDominioMaestro1() {
        return campoIdDominioMaestro1;
    }

    public void setCampoIdDominioMaestro1(TextField component) {
        this.campoIdDominioMaestro1 = component;
    }

    private StaticText campoIdDominioMaestro1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDominioMaestro1Texto1() {
        return campoIdDominioMaestro1Texto1;
    }

    public void setCampoIdDominioMaestro1Texto1(StaticText component) {
        this.campoIdDominioMaestro1Texto1 = component;
    }

    private Button campoIdDominioMaestro1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDominioMaestro1Boton1() {
        return campoIdDominioMaestro1Boton1;
    }

    public void setCampoIdDominioMaestro1Boton1(Button component) {
        this.campoIdDominioMaestro1Boton1 = component;
    }

    private Button campoIdDominioMaestro1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDominioMaestro1Boton3() {
        return campoIdDominioMaestro1Boton3;
    }

    public void setCampoIdDominioMaestro1Boton3(Button component) {
        this.campoIdDominioMaestro1Boton3 = component;
    }

    private TableColumn tableColumnIdDominioMaestro2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdDominioMaestro2() {
        return tableColumnIdDominioMaestro2;
    }

    public void setTableColumnIdDominioMaestro2(TableColumn component) {
        this.tableColumnIdDominioMaestro2 = component;
    }

    private Label labelIdDominioMaestro2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDominioMaestro2() {
        return labelIdDominioMaestro2;
    }

    public void setLabelIdDominioMaestro2(Label l) {
        this.labelIdDominioMaestro2 = l;
    }

    private ImageHyperlink campoIdDominioMaestro1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdDominioMaestro1Hiper1() {
        return campoIdDominioMaestro1Hiper1;
    }

    public void setCampoIdDominioMaestro1Hiper1(ImageHyperlink component) {
        this.campoIdDominioMaestro1Hiper1 = component;
    }

    private TableColumn tableColumnIdParametro1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdParametro1() {
        return tableColumnIdParametro1;
    }

    public void setTableColumnIdParametro1(TableColumn component) {
        this.tableColumnIdParametro1 = component;
    }

    private Label labelIdParametro1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdParametro1() {
        return labelIdParametro1;
    }

    public void setLabelIdParametro1(Label l) {
        this.labelIdParametro1 = l;
    }

    private TextField campoIdParametro1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdParametro1() {
        return campoIdParametro1;
    }

    public void setCampoIdParametro1(TextField component) {
        this.campoIdParametro1 = component;
    }

    private StaticText campoIdParametro1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdParametro1Texto1() {
        return campoIdParametro1Texto1;
    }

    public void setCampoIdParametro1Texto1(StaticText component) {
        this.campoIdParametro1Texto1 = component;
    }

    private Button campoIdParametro1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdParametro1Boton1() {
        return campoIdParametro1Boton1;
    }

    public void setCampoIdParametro1Boton1(Button component) {
        this.campoIdParametro1Boton1 = component;
    }

    private Button campoIdParametro1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdParametro1Boton3() {
        return campoIdParametro1Boton3;
    }

    public void setCampoIdParametro1Boton3(Button component) {
        this.campoIdParametro1Boton3 = component;
    }

    private TableColumn tableColumnIdParametro2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdParametro2() {
        return tableColumnIdParametro2;
    }

    public void setTableColumnIdParametro2(TableColumn component) {
        this.tableColumnIdParametro2 = component;
    }

    private Label labelIdParametro2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdParametro2() {
        return labelIdParametro2;
    }

    public void setLabelIdParametro2(Label l) {
        this.labelIdParametro2 = l;
    }

    private ImageHyperlink campoIdParametro1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdParametro1Hiper1() {
        return campoIdParametro1Hiper1;
    }

    public void setCampoIdParametro1Hiper1(ImageHyperlink component) {
        this.campoIdParametro1Hiper1 = component;
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

    private PaginaCachedRowSetDataProvider2 paginaDataProvider = new PaginaCachedRowSetDataProvider2();

    @Override
    public PaginaCachedRowSetDataProvider2 getPaginaDataProvider() {
        return paginaDataProvider;
    }

    public void setPaginaDataProvider(PaginaCachedRowSetDataProvider2 crsdp) {
        this.paginaDataProvider = crsdp;
    }

    private AplicacionCachedRowSetDataProvider2 aplicacionReferenceDataProvider = new AplicacionCachedRowSetDataProvider2();

    @Override
    public AplicacionCachedRowSetDataProvider2 getAplicacionReferenceDataProvider() {
        return aplicacionReferenceDataProvider;
    }

    public void setAplicacionReferenceDataProvider(AplicacionCachedRowSetDataProvider2 crsdp) {
        this.aplicacionReferenceDataProvider = crsdp;
    }

    private DominioCachedRowSetDataProvider2 dominioReferenceDataProvider = new DominioCachedRowSetDataProvider2();

    @Override
    public DominioCachedRowSetDataProvider2 getDominioReferenceDataProvider() {
        return dominioReferenceDataProvider;
    }

    public void setDominioReferenceDataProvider(DominioCachedRowSetDataProvider2 crsdp) {
        this.dominioReferenceDataProvider = crsdp;
    }

    private ParametroCachedRowSetDataProvider2 parametroReferenceDataProvider = new ParametroCachedRowSetDataProvider2();

    @Override
    public ParametroCachedRowSetDataProvider2 getParametroReferenceDataProvider() {
        return parametroReferenceDataProvider;
    }

    public void setParametroReferenceDataProvider(ParametroCachedRowSetDataProvider2 crsdp) {
        this.parametroReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public Pagina1() {
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
        paginaDataProvider.close();
        aplicacionReferenceDataProvider.close();
        dominioReferenceDataProvider.close();
        parametroReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionPagina...">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion con tabla">
    private GestorPaginaActualizacionConTabla gestor = new GestorPaginaActualizacionConTabla(this);

    @Override
    public GestorPaginaActualizacionConTabla getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionPagina asistente = new AsistentePaginaActualizacionPagina(this);

    public AsistentePaginaActualizacionPagina getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("Pagina1_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("Pagina1_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("Pagina1_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getPaginaDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return PaginaCachedRowSetDataProvider2.FUNCION_CONSULTAR_PAGINA;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return PaginaCachedRowSetDataProvider2.FUNCION_CREAR_PAGINA;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return PaginaCachedRowSetDataProvider2.FUNCION_MODIFICAR_PAGINA;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return PaginaCachedRowSetDataProvider2.FUNCION_ELIMINAR_PAGINA;
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
            this.getPaginaDataProvider().consultarPagina(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getPaginaDataProvider().consultarPagina(filtro);
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
    public void campoIdAplicacion1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdAplicacion1_validate(context, component, value);
    }

    public void campoIdDominio1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdDominio1_validate(context, component, value);
    }

    public void campoIdDominioMaestro1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdDominioMaestro1_validate(context, component, value);
    }

    public void campoIdParametro1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdParametro1_validate(context, component, value);
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
