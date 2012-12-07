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

import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.DominioCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.GrupoProcesoCachedRowSetDataProvider2;
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

public class FuncionPorDominio1 extends AbstractPageBean
        implements PaginaActualizacionFuncionPorDominio, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla, PaginaConsultaConMaestro {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdFuncion1.setMinimum(0L);
        validatorIdFuncion1.setMaximum(1000000000000000000L);
        validatorCodigoFuncion1.setMaximum(100);
        validatorNombreFuncion1.setMaximum(100);
        validatorDescripcionFuncion1.setMaximum(8160);
        validatorClausulaWhere1.setMaximum(8160);
        validatorClausulaOrder1.setMaximum(8160);
        funcionDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.funcionRowSet}"));
        dominioDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.dominioRowSet}"));
        grupoProcesoReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.grupoProcesoReferenceRowSet}"));
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

    private TableColumn tableColumnIdFuncion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncion1() {
        return tableColumnIdFuncion1;
    }

    public void setTableColumnIdFuncion1(TableColumn component) {
        this.tableColumnIdFuncion1 = component;
    }

    private Label labelIdFuncion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncion1() {
        return labelIdFuncion1;
    }

    public void setLabelIdFuncion1(Label l) {
        this.labelIdFuncion1 = l;
    }

    private TextField campoIdFuncion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncion1() {
        return campoIdFuncion1;
    }

    public void setCampoIdFuncion1(TextField component) {
        this.campoIdFuncion1 = component;
    }

    private StaticText campoIdFuncion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncion1Texto1() {
        return campoIdFuncion1Texto1;
    }

    public void setCampoIdFuncion1Texto1(StaticText component) {
        this.campoIdFuncion1Texto1 = component;
    }

    private LongConverter converterIdFuncion1 = new LongConverter();
  
    public LongConverter getConverterIdFuncion1() {
        return converterIdFuncion1;
    }
  
    public void setConverterIdFuncion1(LongConverter converter) {
        this.converterIdFuncion1 = converter;
    }
  
    private LongRangeValidator validatorIdFuncion1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdFuncion1() {
        return validatorIdFuncion1;
    }
  
    public void setValidatorIdFuncion1(LongRangeValidator validator) {
        this.validatorIdFuncion1 = validator;
    }
  
    private TableColumn tableColumnCodigoFuncion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCodigoFuncion1() {
        return tableColumnCodigoFuncion1;
    }

    public void setTableColumnCodigoFuncion1(TableColumn component) {
        this.tableColumnCodigoFuncion1 = component;
    }

    private Label labelCodigoFuncion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoFuncion1() {
        return labelCodigoFuncion1;
    }

    public void setLabelCodigoFuncion1(Label l) {
        this.labelCodigoFuncion1 = l;
    }

    private TextField campoCodigoFuncion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoFuncion1() {
        return campoCodigoFuncion1;
    }

    public void setCampoCodigoFuncion1(TextField component) {
        this.campoCodigoFuncion1 = component;
    }

    private StaticText campoCodigoFuncion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoFuncion1Texto1() {
        return campoCodigoFuncion1Texto1;
    }

    public void setCampoCodigoFuncion1Texto1(StaticText component) {
        this.campoCodigoFuncion1Texto1 = component;
    }

    private LengthValidator validatorCodigoFuncion1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoFuncion1() {
        return validatorCodigoFuncion1;
    }
  
    public void setValidatorCodigoFuncion1(LengthValidator validator) {
        this.validatorCodigoFuncion1 = validator;
    }
  
    private TableColumn tableColumnNombreFuncion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreFuncion1() {
        return tableColumnNombreFuncion1;
    }

    public void setTableColumnNombreFuncion1(TableColumn component) {
        this.tableColumnNombreFuncion1 = component;
    }

    private Label labelNombreFuncion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreFuncion1() {
        return labelNombreFuncion1;
    }

    public void setLabelNombreFuncion1(Label l) {
        this.labelNombreFuncion1 = l;
    }

    private TextField campoNombreFuncion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreFuncion1() {
        return campoNombreFuncion1;
    }

    public void setCampoNombreFuncion1(TextField component) {
        this.campoNombreFuncion1 = component;
    }

    private StaticText campoNombreFuncion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreFuncion1Texto1() {
        return campoNombreFuncion1Texto1;
    }

    public void setCampoNombreFuncion1Texto1(StaticText component) {
        this.campoNombreFuncion1Texto1 = component;
    }

    private LengthValidator validatorNombreFuncion1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreFuncion1() {
        return validatorNombreFuncion1;
    }
  
    public void setValidatorNombreFuncion1(LengthValidator validator) {
        this.validatorNombreFuncion1 = validator;
    }
  
    private TableColumn tableColumnDescripcionFuncion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnDescripcionFuncion1() {
        return tableColumnDescripcionFuncion1;
    }

    public void setTableColumnDescripcionFuncion1(TableColumn component) {
        this.tableColumnDescripcionFuncion1 = component;
    }

    private Label labelDescripcionFuncion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDescripcionFuncion1() {
        return labelDescripcionFuncion1;
    }

    public void setLabelDescripcionFuncion1(Label l) {
        this.labelDescripcionFuncion1 = l;
    }

    private TextArea campoDescripcionFuncion1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDescripcionFuncion1() {
        return campoDescripcionFuncion1;
    }

    public void setCampoDescripcionFuncion1(TextArea component) {
        this.campoDescripcionFuncion1 = component;
    }

    private StaticText campoDescripcionFuncion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDescripcionFuncion1Texto1() {
        return campoDescripcionFuncion1Texto1;
    }

    public void setCampoDescripcionFuncion1Texto1(StaticText component) {
        this.campoDescripcionFuncion1Texto1 = component;
    }

    private LengthValidator validatorDescripcionFuncion1 = new LengthValidator();
  
    public LengthValidator getValidatorDescripcionFuncion1() {
        return validatorDescripcionFuncion1;
    }
  
    public void setValidatorDescripcionFuncion1(LengthValidator validator) {
        this.validatorDescripcionFuncion1 = validator;
    }
  
    private TableColumn tableColumnNumeroTipoFuncion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoFuncion1() {
        return tableColumnNumeroTipoFuncion1;
    }

    public void setTableColumnNumeroTipoFuncion1(TableColumn component) {
        this.tableColumnNumeroTipoFuncion1 = component;
    }

    private Label labelNumeroTipoFuncion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoFuncion1() {
        return labelNumeroTipoFuncion1;
    }

    public void setLabelNumeroTipoFuncion1(Label l) {
        this.labelNumeroTipoFuncion1 = l;
    }

    private DropDown listaNumeroTipoFuncion1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoFuncion1() {
        return listaNumeroTipoFuncion1;
    }

    public void setListaNumeroTipoFuncion1(DropDown component) {
        this.listaNumeroTipoFuncion1 = component;
    }

    private StaticText listaNumeroTipoFuncion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoFuncion1Texto1() {
        return listaNumeroTipoFuncion1Texto1;
    }

    public void setListaNumeroTipoFuncion1Texto1(StaticText component) {
        this.listaNumeroTipoFuncion1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoFuncion1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoFuncion1() {
        return converterNumeroTipoFuncion1;
    }
  
    public void setConverterNumeroTipoFuncion1(IntegerConverter converter) {
        this.converterNumeroTipoFuncion1 = converter;
    }
  
    private TableColumn tableColumnNumeroTipoRastroFun1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoRastroFun1() {
        return tableColumnNumeroTipoRastroFun1;
    }

    public void setTableColumnNumeroTipoRastroFun1(TableColumn component) {
        this.tableColumnNumeroTipoRastroFun1 = component;
    }

    private Label labelNumeroTipoRastroFun1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoRastroFun1() {
        return labelNumeroTipoRastroFun1;
    }

    public void setLabelNumeroTipoRastroFun1(Label l) {
        this.labelNumeroTipoRastroFun1 = l;
    }

    private DropDown listaNumeroTipoRastroFun1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoRastroFun1() {
        return listaNumeroTipoRastroFun1;
    }

    public void setListaNumeroTipoRastroFun1(DropDown component) {
        this.listaNumeroTipoRastroFun1 = component;
    }

    private StaticText listaNumeroTipoRastroFun1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoRastroFun1Texto1() {
        return listaNumeroTipoRastroFun1Texto1;
    }

    public void setListaNumeroTipoRastroFun1Texto1(StaticText component) {
        this.listaNumeroTipoRastroFun1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoRastroFun1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoRastroFun1() {
        return converterNumeroTipoRastroFun1;
    }
  
    public void setConverterNumeroTipoRastroFun1(IntegerConverter converter) {
        this.converterNumeroTipoRastroFun1 = converter;
    }
  
    private TableColumn tableColumnClausulaWhere1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnClausulaWhere1() {
        return tableColumnClausulaWhere1;
    }

    public void setTableColumnClausulaWhere1(TableColumn component) {
        this.tableColumnClausulaWhere1 = component;
    }

    private Label labelClausulaWhere1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelClausulaWhere1() {
        return labelClausulaWhere1;
    }

    public void setLabelClausulaWhere1(Label l) {
        this.labelClausulaWhere1 = l;
    }

    private TextArea campoClausulaWhere1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoClausulaWhere1() {
        return campoClausulaWhere1;
    }

    public void setCampoClausulaWhere1(TextArea component) {
        this.campoClausulaWhere1 = component;
    }

    private StaticText campoClausulaWhere1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoClausulaWhere1Texto1() {
        return campoClausulaWhere1Texto1;
    }

    public void setCampoClausulaWhere1Texto1(StaticText component) {
        this.campoClausulaWhere1Texto1 = component;
    }

    private LengthValidator validatorClausulaWhere1 = new LengthValidator();
  
    public LengthValidator getValidatorClausulaWhere1() {
        return validatorClausulaWhere1;
    }
  
    public void setValidatorClausulaWhere1(LengthValidator validator) {
        this.validatorClausulaWhere1 = validator;
    }
  
    private TableColumn tableColumnClausulaOrder1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnClausulaOrder1() {
        return tableColumnClausulaOrder1;
    }

    public void setTableColumnClausulaOrder1(TableColumn component) {
        this.tableColumnClausulaOrder1 = component;
    }

    private Label labelClausulaOrder1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelClausulaOrder1() {
        return labelClausulaOrder1;
    }

    public void setLabelClausulaOrder1(Label l) {
        this.labelClausulaOrder1 = l;
    }

    private TextArea campoClausulaOrder1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoClausulaOrder1() {
        return campoClausulaOrder1;
    }

    public void setCampoClausulaOrder1(TextArea component) {
        this.campoClausulaOrder1 = component;
    }

    private StaticText campoClausulaOrder1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoClausulaOrder1Texto1() {
        return campoClausulaOrder1Texto1;
    }

    public void setCampoClausulaOrder1Texto1(StaticText component) {
        this.campoClausulaOrder1Texto1 = component;
    }

    private LengthValidator validatorClausulaOrder1 = new LengthValidator();
  
    public LengthValidator getValidatorClausulaOrder1() {
        return validatorClausulaOrder1;
    }
  
    public void setValidatorClausulaOrder1(LengthValidator validator) {
        this.validatorClausulaOrder1 = validator;
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
  
    private TableColumn tableColumnEsProgramatica1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsProgramatica1() {
        return tableColumnEsProgramatica1;
    }

    public void setTableColumnEsProgramatica1(TableColumn component) {
        this.tableColumnEsProgramatica1 = component;
    }

    private Label labelEsProgramatica1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsProgramatica1() {
        return labelEsProgramatica1;
    }

    public void setLabelEsProgramatica1(Label l) {
        this.labelEsProgramatica1 = l;
    }

    private DropDown listaEsProgramatica1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsProgramatica1() {
        return listaEsProgramatica1;
    }

    public void setListaEsProgramatica1(DropDown component) {
        this.listaEsProgramatica1 = component;
    }

    private StaticText listaEsProgramatica1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsProgramatica1Texto1() {
        return listaEsProgramatica1Texto1;
    }

    public void setListaEsProgramatica1Texto1(StaticText component) {
        this.listaEsProgramatica1Texto1 = component;
    }

    private IntegerConverter converterEsProgramatica1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsProgramatica1() {
        return converterEsProgramatica1;
    }
  
    public void setConverterEsProgramatica1(IntegerConverter converter) {
        this.converterEsProgramatica1 = converter;
    }
  
    private TableColumn tableColumnEsPersonalizada1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsPersonalizada1() {
        return tableColumnEsPersonalizada1;
    }

    public void setTableColumnEsPersonalizada1(TableColumn component) {
        this.tableColumnEsPersonalizada1 = component;
    }

    private Label labelEsPersonalizada1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonalizada1() {
        return labelEsPersonalizada1;
    }

    public void setLabelEsPersonalizada1(Label l) {
        this.labelEsPersonalizada1 = l;
    }

    private DropDown listaEsPersonalizada1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPersonalizada1() {
        return listaEsPersonalizada1;
    }

    public void setListaEsPersonalizada1(DropDown component) {
        this.listaEsPersonalizada1 = component;
    }

    private StaticText listaEsPersonalizada1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonalizada1Texto1() {
        return listaEsPersonalizada1Texto1;
    }

    public void setListaEsPersonalizada1Texto1(StaticText component) {
        this.listaEsPersonalizada1Texto1 = component;
    }

    private IntegerConverter converterEsPersonalizada1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPersonalizada1() {
        return converterEsPersonalizada1;
    }
  
    public void setConverterEsPersonalizada1(IntegerConverter converter) {
        this.converterEsPersonalizada1 = converter;
    }
  
    private TableColumn tableColumnEsSegmentada1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsSegmentada1() {
        return tableColumnEsSegmentada1;
    }

    public void setTableColumnEsSegmentada1(TableColumn component) {
        this.tableColumnEsSegmentada1 = component;
    }

    private Label labelEsSegmentada1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsSegmentada1() {
        return labelEsSegmentada1;
    }

    public void setLabelEsSegmentada1(Label l) {
        this.labelEsSegmentada1 = l;
    }

    private DropDown listaEsSegmentada1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsSegmentada1() {
        return listaEsSegmentada1;
    }

    public void setListaEsSegmentada1(DropDown component) {
        this.listaEsSegmentada1 = component;
    }

    private StaticText listaEsSegmentada1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsSegmentada1Texto1() {
        return listaEsSegmentada1Texto1;
    }

    public void setListaEsSegmentada1Texto1(StaticText component) {
        this.listaEsSegmentada1Texto1 = component;
    }

    private IntegerConverter converterEsSegmentada1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsSegmentada1() {
        return converterEsSegmentada1;
    }
  
    public void setConverterEsSegmentada1(IntegerConverter converter) {
        this.converterEsSegmentada1 = converter;
    }
  
    private TableColumn tableColumnIdGrupoProceso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdGrupoProceso1() {
        return tableColumnIdGrupoProceso1;
    }

    public void setTableColumnIdGrupoProceso1(TableColumn component) {
        this.tableColumnIdGrupoProceso1 = component;
    }

    private Label labelIdGrupoProceso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdGrupoProceso1() {
        return labelIdGrupoProceso1;
    }

    public void setLabelIdGrupoProceso1(Label l) {
        this.labelIdGrupoProceso1 = l;
    }

    private TextField campoIdGrupoProceso1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdGrupoProceso1() {
        return campoIdGrupoProceso1;
    }

    public void setCampoIdGrupoProceso1(TextField component) {
        this.campoIdGrupoProceso1 = component;
    }

    private StaticText campoIdGrupoProceso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdGrupoProceso1Texto1() {
        return campoIdGrupoProceso1Texto1;
    }

    public void setCampoIdGrupoProceso1Texto1(StaticText component) {
        this.campoIdGrupoProceso1Texto1 = component;
    }

    private Button campoIdGrupoProceso1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdGrupoProceso1Boton1() {
        return campoIdGrupoProceso1Boton1;
    }

    public void setCampoIdGrupoProceso1Boton1(Button component) {
        this.campoIdGrupoProceso1Boton1 = component;
    }

    private Button campoIdGrupoProceso1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdGrupoProceso1Boton3() {
        return campoIdGrupoProceso1Boton3;
    }

    public void setCampoIdGrupoProceso1Boton3(Button component) {
        this.campoIdGrupoProceso1Boton3 = component;
    }

    private TableColumn tableColumnIdGrupoProceso2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdGrupoProceso2() {
        return tableColumnIdGrupoProceso2;
    }

    public void setTableColumnIdGrupoProceso2(TableColumn component) {
        this.tableColumnIdGrupoProceso2 = component;
    }

    private Label labelIdGrupoProceso2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdGrupoProceso2() {
        return labelIdGrupoProceso2;
    }

    public void setLabelIdGrupoProceso2(Label l) {
        this.labelIdGrupoProceso2 = l;
    }

    private ImageHyperlink campoIdGrupoProceso1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdGrupoProceso1Hiper1() {
        return campoIdGrupoProceso1Hiper1;
    }

    public void setCampoIdGrupoProceso1Hiper1(ImageHyperlink component) {
        this.campoIdGrupoProceso1Hiper1 = component;
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

    private FuncionCachedRowSetDataProvider2 funcionDataProvider = new FuncionCachedRowSetDataProvider2();

    @Override
    public FuncionCachedRowSetDataProvider2 getFuncionDataProvider() {
        return funcionDataProvider;
    }

    public void setFuncionDataProvider(FuncionCachedRowSetDataProvider2 crsdp) {
        this.funcionDataProvider = crsdp;
    }

    private DominioCachedRowSetDataProvider2 dominioDataProvider = new DominioCachedRowSetDataProvider2();

    @Override
    public DominioCachedRowSetDataProvider2 getDominioDataProvider() {
        return dominioDataProvider;
    }

    public void setDominioDataProvider(DominioCachedRowSetDataProvider2 crsdp) {
        this.dominioDataProvider = crsdp;
    }

    private GrupoProcesoCachedRowSetDataProvider2 grupoProcesoReferenceDataProvider = new GrupoProcesoCachedRowSetDataProvider2();

    @Override
    public GrupoProcesoCachedRowSetDataProvider2 getGrupoProcesoReferenceDataProvider() {
        return grupoProcesoReferenceDataProvider;
    }

    public void setGrupoProcesoReferenceDataProvider(GrupoProcesoCachedRowSetDataProvider2 crsdp) {
        this.grupoProcesoReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public FuncionPorDominio1() {
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
        funcionDataProvider.close();
        dominioDataProvider.close();
        grupoProcesoReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionFuncion...">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion con tabla">
    private GestorPaginaActualizacionConTabla gestor = new GestorPaginaActualizacionConTabla(this);

    @Override
    public GestorPaginaActualizacionConTabla getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionFuncionPorDominio asistente = new AsistentePaginaActualizacionFuncionPorDominio(this);

    public AsistentePaginaActualizacionFuncionPorDominio getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("FuncionPorDominio1_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("FuncionPorDominio1_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("FuncionPorDominio1_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getFuncionDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return FuncionCachedRowSetDataProvider2.FUNCION_CONSULTAR_FUNCION;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return FuncionCachedRowSetDataProvider2.FUNCION_CREAR_FUNCION;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return FuncionCachedRowSetDataProvider2.FUNCION_MODIFICAR_FUNCION;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return FuncionCachedRowSetDataProvider2.FUNCION_ELIMINAR_FUNCION;
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
        return this.getDominioDataProvider();
    }

    @Override
    public String getColumnaIdentificacionRecursoMaestro() {
        return FuncionCachedRowSetDataProvider2.COLUMNA_ID_DOMINIO;
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
            this.getFuncionDataProvider().consultarFuncion(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getFuncionDataProvider().consultarFuncion(filtro);
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
    public void campoIdGrupoProceso1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdGrupoProceso1_validate(context, component, value);
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
