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

import com.egt.data.general.xdp2.FuncionParametroCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.FuncionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ParametroCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.ClaseRecursoCachedRowSetDataProvider2;
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

public class FuncionParametroPorFuncion1 extends AbstractPageBean
        implements PaginaActualizacionFuncionParametroPorFuncion, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla, PaginaConsultaConMaestro {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdFuncionParametro1.setMinimum(0L);
        validatorIdFuncionParametro1.setMaximum(1000000000000000000L);
        validatorIdListaValor1.setMinimum(0L);
        validatorIdListaValor1.setMaximum(1000000000000000000L);
        validatorIdClaseObjetoValor1.setMinimum(0L);
        validatorIdClaseObjetoValor1.setMaximum(1000000000000000000L);
        validatorValorMinimo1.setMaximum(100);
        validatorValorMaximo1.setMaximum(100);
        validatorValorOmision1.setMaximum(100);
        funcionParametroDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.funcionParametroRowSet}"));
        funcionDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.funcionRowSet}"));
        parametroReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.parametroReferenceRowSet}"));
        funcionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.funcionReferenceRowSet}"));
        claseRecursoReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.claseRecursoReferenceRowSet}"));
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

    private TableColumn tableColumnIdFuncionParametro1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionParametro1() {
        return tableColumnIdFuncionParametro1;
    }

    public void setTableColumnIdFuncionParametro1(TableColumn component) {
        this.tableColumnIdFuncionParametro1 = component;
    }

    private Label labelIdFuncionParametro1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionParametro1() {
        return labelIdFuncionParametro1;
    }

    public void setLabelIdFuncionParametro1(Label l) {
        this.labelIdFuncionParametro1 = l;
    }

    private TextField campoIdFuncionParametro1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionParametro1() {
        return campoIdFuncionParametro1;
    }

    public void setCampoIdFuncionParametro1(TextField component) {
        this.campoIdFuncionParametro1 = component;
    }

    private StaticText campoIdFuncionParametro1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionParametro1Texto1() {
        return campoIdFuncionParametro1Texto1;
    }

    public void setCampoIdFuncionParametro1Texto1(StaticText component) {
        this.campoIdFuncionParametro1Texto1 = component;
    }

    private LongConverter converterIdFuncionParametro1 = new LongConverter();
  
    public LongConverter getConverterIdFuncionParametro1() {
        return converterIdFuncionParametro1;
    }
  
    public void setConverterIdFuncionParametro1(LongConverter converter) {
        this.converterIdFuncionParametro1 = converter;
    }
  
    private LongRangeValidator validatorIdFuncionParametro1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdFuncionParametro1() {
        return validatorIdFuncionParametro1;
    }
  
    public void setValidatorIdFuncionParametro1(LongRangeValidator validator) {
        this.validatorIdFuncionParametro1 = validator;
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

    private TableColumn tableColumnNumeroTipoParametro1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoParametro1() {
        return tableColumnNumeroTipoParametro1;
    }

    public void setTableColumnNumeroTipoParametro1(TableColumn component) {
        this.tableColumnNumeroTipoParametro1 = component;
    }

    private Label labelNumeroTipoParametro1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoParametro1() {
        return labelNumeroTipoParametro1;
    }

    public void setLabelNumeroTipoParametro1(Label l) {
        this.labelNumeroTipoParametro1 = l;
    }

    private DropDown listaNumeroTipoParametro1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoParametro1() {
        return listaNumeroTipoParametro1;
    }

    public void setListaNumeroTipoParametro1(DropDown component) {
        this.listaNumeroTipoParametro1 = component;
    }

    private StaticText listaNumeroTipoParametro1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoParametro1Texto1() {
        return listaNumeroTipoParametro1Texto1;
    }

    public void setListaNumeroTipoParametro1Texto1(StaticText component) {
        this.listaNumeroTipoParametro1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoParametro1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoParametro1() {
        return converterNumeroTipoParametro1;
    }
  
    public void setConverterNumeroTipoParametro1(IntegerConverter converter) {
        this.converterNumeroTipoParametro1 = converter;
    }
  
    private TableColumn tableColumnNumeroTipoComparacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoComparacion1() {
        return tableColumnNumeroTipoComparacion1;
    }

    public void setTableColumnNumeroTipoComparacion1(TableColumn component) {
        this.tableColumnNumeroTipoComparacion1 = component;
    }

    private Label labelNumeroTipoComparacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoComparacion1() {
        return labelNumeroTipoComparacion1;
    }

    public void setLabelNumeroTipoComparacion1(Label l) {
        this.labelNumeroTipoComparacion1 = l;
    }

    private DropDown listaNumeroTipoComparacion1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoComparacion1() {
        return listaNumeroTipoComparacion1;
    }

    public void setListaNumeroTipoComparacion1(DropDown component) {
        this.listaNumeroTipoComparacion1 = component;
    }

    private StaticText listaNumeroTipoComparacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoComparacion1Texto1() {
        return listaNumeroTipoComparacion1Texto1;
    }

    public void setListaNumeroTipoComparacion1Texto1(StaticText component) {
        this.listaNumeroTipoComparacion1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoComparacion1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoComparacion1() {
        return converterNumeroTipoComparacion1;
    }
  
    public void setConverterNumeroTipoComparacion1(IntegerConverter converter) {
        this.converterNumeroTipoComparacion1 = converter;
    }
  
    private TableColumn tableColumnIdFuncionReferencia1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionReferencia1() {
        return tableColumnIdFuncionReferencia1;
    }

    public void setTableColumnIdFuncionReferencia1(TableColumn component) {
        this.tableColumnIdFuncionReferencia1 = component;
    }

    private Label labelIdFuncionReferencia1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionReferencia1() {
        return labelIdFuncionReferencia1;
    }

    public void setLabelIdFuncionReferencia1(Label l) {
        this.labelIdFuncionReferencia1 = l;
    }

    private TextField campoIdFuncionReferencia1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionReferencia1() {
        return campoIdFuncionReferencia1;
    }

    public void setCampoIdFuncionReferencia1(TextField component) {
        this.campoIdFuncionReferencia1 = component;
    }

    private StaticText campoIdFuncionReferencia1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionReferencia1Texto1() {
        return campoIdFuncionReferencia1Texto1;
    }

    public void setCampoIdFuncionReferencia1Texto1(StaticText component) {
        this.campoIdFuncionReferencia1Texto1 = component;
    }

    private Button campoIdFuncionReferencia1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionReferencia1Boton1() {
        return campoIdFuncionReferencia1Boton1;
    }

    public void setCampoIdFuncionReferencia1Boton1(Button component) {
        this.campoIdFuncionReferencia1Boton1 = component;
    }

    private Button campoIdFuncionReferencia1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionReferencia1Boton3() {
        return campoIdFuncionReferencia1Boton3;
    }

    public void setCampoIdFuncionReferencia1Boton3(Button component) {
        this.campoIdFuncionReferencia1Boton3 = component;
    }

    private TableColumn tableColumnIdFuncionReferencia2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionReferencia2() {
        return tableColumnIdFuncionReferencia2;
    }

    public void setTableColumnIdFuncionReferencia2(TableColumn component) {
        this.tableColumnIdFuncionReferencia2 = component;
    }

    private Label labelIdFuncionReferencia2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionReferencia2() {
        return labelIdFuncionReferencia2;
    }

    public void setLabelIdFuncionReferencia2(Label l) {
        this.labelIdFuncionReferencia2 = l;
    }

    private ImageHyperlink campoIdFuncionReferencia1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdFuncionReferencia1Hiper1() {
        return campoIdFuncionReferencia1Hiper1;
    }

    public void setCampoIdFuncionReferencia1Hiper1(ImageHyperlink component) {
        this.campoIdFuncionReferencia1Hiper1 = component;
    }

    private TableColumn tableColumnNumeroTipoValor1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoValor1() {
        return tableColumnNumeroTipoValor1;
    }

    public void setTableColumnNumeroTipoValor1(TableColumn component) {
        this.tableColumnNumeroTipoValor1 = component;
    }

    private Label labelNumeroTipoValor1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoValor1() {
        return labelNumeroTipoValor1;
    }

    public void setLabelNumeroTipoValor1(Label l) {
        this.labelNumeroTipoValor1 = l;
    }

    private DropDown listaNumeroTipoValor1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoValor1() {
        return listaNumeroTipoValor1;
    }

    public void setListaNumeroTipoValor1(DropDown component) {
        this.listaNumeroTipoValor1 = component;
    }

    private StaticText listaNumeroTipoValor1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoValor1Texto1() {
        return listaNumeroTipoValor1Texto1;
    }

    public void setListaNumeroTipoValor1Texto1(StaticText component) {
        this.listaNumeroTipoValor1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoValor1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoValor1() {
        return converterNumeroTipoValor1;
    }
  
    public void setConverterNumeroTipoValor1(IntegerConverter converter) {
        this.converterNumeroTipoValor1 = converter;
    }
  
    private TableColumn tableColumnIdListaValor1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdListaValor1() {
        return tableColumnIdListaValor1;
    }

    public void setTableColumnIdListaValor1(TableColumn component) {
        this.tableColumnIdListaValor1 = component;
    }

    private Label labelIdListaValor1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdListaValor1() {
        return labelIdListaValor1;
    }

    public void setLabelIdListaValor1(Label l) {
        this.labelIdListaValor1 = l;
    }

    private TextField campoIdListaValor1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdListaValor1() {
        return campoIdListaValor1;
    }

    public void setCampoIdListaValor1(TextField component) {
        this.campoIdListaValor1 = component;
    }

    private StaticText campoIdListaValor1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdListaValor1Texto1() {
        return campoIdListaValor1Texto1;
    }

    public void setCampoIdListaValor1Texto1(StaticText component) {
        this.campoIdListaValor1Texto1 = component;
    }

    private LongConverter converterIdListaValor1 = new LongConverter();
  
    public LongConverter getConverterIdListaValor1() {
        return converterIdListaValor1;
    }
  
    public void setConverterIdListaValor1(LongConverter converter) {
        this.converterIdListaValor1 = converter;
    }
  
    private LongRangeValidator validatorIdListaValor1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdListaValor1() {
        return validatorIdListaValor1;
    }
  
    public void setValidatorIdListaValor1(LongRangeValidator validator) {
        this.validatorIdListaValor1 = validator;
    }
  
    private TableColumn tableColumnIdClaseObjetoValor1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdClaseObjetoValor1() {
        return tableColumnIdClaseObjetoValor1;
    }

    public void setTableColumnIdClaseObjetoValor1(TableColumn component) {
        this.tableColumnIdClaseObjetoValor1 = component;
    }

    private Label labelIdClaseObjetoValor1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseObjetoValor1() {
        return labelIdClaseObjetoValor1;
    }

    public void setLabelIdClaseObjetoValor1(Label l) {
        this.labelIdClaseObjetoValor1 = l;
    }

    private TextField campoIdClaseObjetoValor1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseObjetoValor1() {
        return campoIdClaseObjetoValor1;
    }

    public void setCampoIdClaseObjetoValor1(TextField component) {
        this.campoIdClaseObjetoValor1 = component;
    }

    private StaticText campoIdClaseObjetoValor1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseObjetoValor1Texto1() {
        return campoIdClaseObjetoValor1Texto1;
    }

    public void setCampoIdClaseObjetoValor1Texto1(StaticText component) {
        this.campoIdClaseObjetoValor1Texto1 = component;
    }

    private LongConverter converterIdClaseObjetoValor1 = new LongConverter();
  
    public LongConverter getConverterIdClaseObjetoValor1() {
        return converterIdClaseObjetoValor1;
    }
  
    public void setConverterIdClaseObjetoValor1(LongConverter converter) {
        this.converterIdClaseObjetoValor1 = converter;
    }
  
    private LongRangeValidator validatorIdClaseObjetoValor1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdClaseObjetoValor1() {
        return validatorIdClaseObjetoValor1;
    }
  
    public void setValidatorIdClaseObjetoValor1(LongRangeValidator validator) {
        this.validatorIdClaseObjetoValor1 = validator;
    }
  
    private TableColumn tableColumnIdClaseRecursoValor1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdClaseRecursoValor1() {
        return tableColumnIdClaseRecursoValor1;
    }

    public void setTableColumnIdClaseRecursoValor1(TableColumn component) {
        this.tableColumnIdClaseRecursoValor1 = component;
    }

    private Label labelIdClaseRecursoValor1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoValor1() {
        return labelIdClaseRecursoValor1;
    }

    public void setLabelIdClaseRecursoValor1(Label l) {
        this.labelIdClaseRecursoValor1 = l;
    }

    private TextField campoIdClaseRecursoValor1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdClaseRecursoValor1() {
        return campoIdClaseRecursoValor1;
    }

    public void setCampoIdClaseRecursoValor1(TextField component) {
        this.campoIdClaseRecursoValor1 = component;
    }

    private StaticText campoIdClaseRecursoValor1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdClaseRecursoValor1Texto1() {
        return campoIdClaseRecursoValor1Texto1;
    }

    public void setCampoIdClaseRecursoValor1Texto1(StaticText component) {
        this.campoIdClaseRecursoValor1Texto1 = component;
    }

    private Button campoIdClaseRecursoValor1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdClaseRecursoValor1Boton1() {
        return campoIdClaseRecursoValor1Boton1;
    }

    public void setCampoIdClaseRecursoValor1Boton1(Button component) {
        this.campoIdClaseRecursoValor1Boton1 = component;
    }

    private Button campoIdClaseRecursoValor1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdClaseRecursoValor1Boton3() {
        return campoIdClaseRecursoValor1Boton3;
    }

    public void setCampoIdClaseRecursoValor1Boton3(Button component) {
        this.campoIdClaseRecursoValor1Boton3 = component;
    }

    private TableColumn tableColumnIdClaseRecursoValor2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdClaseRecursoValor2() {
        return tableColumnIdClaseRecursoValor2;
    }

    public void setTableColumnIdClaseRecursoValor2(TableColumn component) {
        this.tableColumnIdClaseRecursoValor2 = component;
    }

    private Label labelIdClaseRecursoValor2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdClaseRecursoValor2() {
        return labelIdClaseRecursoValor2;
    }

    public void setLabelIdClaseRecursoValor2(Label l) {
        this.labelIdClaseRecursoValor2 = l;
    }

    private ImageHyperlink campoIdClaseRecursoValor1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdClaseRecursoValor1Hiper1() {
        return campoIdClaseRecursoValor1Hiper1;
    }

    public void setCampoIdClaseRecursoValor1Hiper1(ImageHyperlink component) {
        this.campoIdClaseRecursoValor1Hiper1 = component;
    }

    private TableColumn tableColumnValorMinimo1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnValorMinimo1() {
        return tableColumnValorMinimo1;
    }

    public void setTableColumnValorMinimo1(TableColumn component) {
        this.tableColumnValorMinimo1 = component;
    }

    private Label labelValorMinimo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelValorMinimo1() {
        return labelValorMinimo1;
    }

    public void setLabelValorMinimo1(Label l) {
        this.labelValorMinimo1 = l;
    }

    private TextField campoValorMinimo1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoValorMinimo1() {
        return campoValorMinimo1;
    }

    public void setCampoValorMinimo1(TextField component) {
        this.campoValorMinimo1 = component;
    }

    private StaticText campoValorMinimo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoValorMinimo1Texto1() {
        return campoValorMinimo1Texto1;
    }

    public void setCampoValorMinimo1Texto1(StaticText component) {
        this.campoValorMinimo1Texto1 = component;
    }

    private LengthValidator validatorValorMinimo1 = new LengthValidator();
  
    public LengthValidator getValidatorValorMinimo1() {
        return validatorValorMinimo1;
    }
  
    public void setValidatorValorMinimo1(LengthValidator validator) {
        this.validatorValorMinimo1 = validator;
    }
  
    private TableColumn tableColumnValorMaximo1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnValorMaximo1() {
        return tableColumnValorMaximo1;
    }

    public void setTableColumnValorMaximo1(TableColumn component) {
        this.tableColumnValorMaximo1 = component;
    }

    private Label labelValorMaximo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelValorMaximo1() {
        return labelValorMaximo1;
    }

    public void setLabelValorMaximo1(Label l) {
        this.labelValorMaximo1 = l;
    }

    private TextField campoValorMaximo1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoValorMaximo1() {
        return campoValorMaximo1;
    }

    public void setCampoValorMaximo1(TextField component) {
        this.campoValorMaximo1 = component;
    }

    private StaticText campoValorMaximo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoValorMaximo1Texto1() {
        return campoValorMaximo1Texto1;
    }

    public void setCampoValorMaximo1Texto1(StaticText component) {
        this.campoValorMaximo1Texto1 = component;
    }

    private LengthValidator validatorValorMaximo1 = new LengthValidator();
  
    public LengthValidator getValidatorValorMaximo1() {
        return validatorValorMaximo1;
    }
  
    public void setValidatorValorMaximo1(LengthValidator validator) {
        this.validatorValorMaximo1 = validator;
    }
  
    private TableColumn tableColumnValorOmision1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnValorOmision1() {
        return tableColumnValorOmision1;
    }

    public void setTableColumnValorOmision1(TableColumn component) {
        this.tableColumnValorOmision1 = component;
    }

    private Label labelValorOmision1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelValorOmision1() {
        return labelValorOmision1;
    }

    public void setLabelValorOmision1(Label l) {
        this.labelValorOmision1 = l;
    }

    private TextField campoValorOmision1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoValorOmision1() {
        return campoValorOmision1;
    }

    public void setCampoValorOmision1(TextField component) {
        this.campoValorOmision1 = component;
    }

    private StaticText campoValorOmision1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoValorOmision1Texto1() {
        return campoValorOmision1Texto1;
    }

    public void setCampoValorOmision1Texto1(StaticText component) {
        this.campoValorOmision1Texto1 = component;
    }

    private LengthValidator validatorValorOmision1 = new LengthValidator();
  
    public LengthValidator getValidatorValorOmision1() {
        return validatorValorOmision1;
    }
  
    public void setValidatorValorOmision1(LengthValidator validator) {
        this.validatorValorOmision1 = validator;
    }
  
    private TableColumn tableColumnEsParametroSinRastro1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsParametroSinRastro1() {
        return tableColumnEsParametroSinRastro1;
    }

    public void setTableColumnEsParametroSinRastro1(TableColumn component) {
        this.tableColumnEsParametroSinRastro1 = component;
    }

    private Label labelEsParametroSinRastro1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsParametroSinRastro1() {
        return labelEsParametroSinRastro1;
    }

    public void setLabelEsParametroSinRastro1(Label l) {
        this.labelEsParametroSinRastro1 = l;
    }

    private DropDown listaEsParametroSinRastro1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsParametroSinRastro1() {
        return listaEsParametroSinRastro1;
    }

    public void setListaEsParametroSinRastro1(DropDown component) {
        this.listaEsParametroSinRastro1 = component;
    }

    private StaticText listaEsParametroSinRastro1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsParametroSinRastro1Texto1() {
        return listaEsParametroSinRastro1Texto1;
    }

    public void setListaEsParametroSinRastro1Texto1(StaticText component) {
        this.listaEsParametroSinRastro1Texto1 = component;
    }

    private IntegerConverter converterEsParametroSinRastro1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsParametroSinRastro1() {
        return converterEsParametroSinRastro1;
    }
  
    public void setConverterEsParametroSinRastro1(IntegerConverter converter) {
        this.converterEsParametroSinRastro1 = converter;
    }
  
    private TableColumn tableColumnEsParametroSegmento1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsParametroSegmento1() {
        return tableColumnEsParametroSegmento1;
    }

    public void setTableColumnEsParametroSegmento1(TableColumn component) {
        this.tableColumnEsParametroSegmento1 = component;
    }

    private Label labelEsParametroSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsParametroSegmento1() {
        return labelEsParametroSegmento1;
    }

    public void setLabelEsParametroSegmento1(Label l) {
        this.labelEsParametroSegmento1 = l;
    }

    private DropDown listaEsParametroSegmento1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsParametroSegmento1() {
        return listaEsParametroSegmento1;
    }

    public void setListaEsParametroSegmento1(DropDown component) {
        this.listaEsParametroSegmento1 = component;
    }

    private StaticText listaEsParametroSegmento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsParametroSegmento1Texto1() {
        return listaEsParametroSegmento1Texto1;
    }

    public void setListaEsParametroSegmento1Texto1(StaticText component) {
        this.listaEsParametroSegmento1Texto1 = component;
    }

    private IntegerConverter converterEsParametroSegmento1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsParametroSegmento1() {
        return converterEsParametroSegmento1;
    }
  
    public void setConverterEsParametroSegmento1(IntegerConverter converter) {
        this.converterEsParametroSegmento1 = converter;
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

    private FuncionParametroCachedRowSetDataProvider2 funcionParametroDataProvider = new FuncionParametroCachedRowSetDataProvider2();

    @Override
    public FuncionParametroCachedRowSetDataProvider2 getFuncionParametroDataProvider() {
        return funcionParametroDataProvider;
    }

    public void setFuncionParametroDataProvider(FuncionParametroCachedRowSetDataProvider2 crsdp) {
        this.funcionParametroDataProvider = crsdp;
    }

    private FuncionCachedRowSetDataProvider2 funcionDataProvider = new FuncionCachedRowSetDataProvider2();

    @Override
    public FuncionCachedRowSetDataProvider2 getFuncionDataProvider() {
        return funcionDataProvider;
    }

    public void setFuncionDataProvider(FuncionCachedRowSetDataProvider2 crsdp) {
        this.funcionDataProvider = crsdp;
    }

    private ParametroCachedRowSetDataProvider2 parametroReferenceDataProvider = new ParametroCachedRowSetDataProvider2();

    @Override
    public ParametroCachedRowSetDataProvider2 getParametroReferenceDataProvider() {
        return parametroReferenceDataProvider;
    }

    public void setParametroReferenceDataProvider(ParametroCachedRowSetDataProvider2 crsdp) {
        this.parametroReferenceDataProvider = crsdp;
    }

    private FuncionCachedRowSetDataProvider2 funcionReferenceDataProvider = new FuncionCachedRowSetDataProvider2();

    @Override
    public FuncionCachedRowSetDataProvider2 getFuncionReferenceDataProvider() {
        return funcionReferenceDataProvider;
    }

    public void setFuncionReferenceDataProvider(FuncionCachedRowSetDataProvider2 crsdp) {
        this.funcionReferenceDataProvider = crsdp;
    }

    private ClaseRecursoCachedRowSetDataProvider2 claseRecursoReferenceDataProvider = new ClaseRecursoCachedRowSetDataProvider2();

    @Override
    public ClaseRecursoCachedRowSetDataProvider2 getClaseRecursoReferenceDataProvider() {
        return claseRecursoReferenceDataProvider;
    }

    public void setClaseRecursoReferenceDataProvider(ClaseRecursoCachedRowSetDataProvider2 crsdp) {
        this.claseRecursoReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public FuncionParametroPorFuncion1() {
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
        funcionParametroDataProvider.close();
        funcionDataProvider.close();
        parametroReferenceDataProvider.close();
        funcionReferenceDataProvider.close();
        claseRecursoReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionFuncionParametro...">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion con tabla">
    private GestorPaginaActualizacionConTabla gestor = new GestorPaginaActualizacionConTabla(this);

    @Override
    public GestorPaginaActualizacionConTabla getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionFuncionParametroPorFuncion asistente = new AsistentePaginaActualizacionFuncionParametroPorFuncion(this);

    public AsistentePaginaActualizacionFuncionParametroPorFuncion getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("FuncionParametroPorFuncion1_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("FuncionParametroPorFuncion1_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("FuncionParametroPorFuncion1_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getFuncionParametroDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return FuncionParametroCachedRowSetDataProvider2.FUNCION_CONSULTAR_FUNCION_PARAMETRO;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return FuncionParametroCachedRowSetDataProvider2.FUNCION_CREAR_FUNCION_PARAMETRO;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return FuncionParametroCachedRowSetDataProvider2.FUNCION_MODIFICAR_FUNCION_PARAMETRO;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return FuncionParametroCachedRowSetDataProvider2.FUNCION_ELIMINAR_FUNCION_PARAMETRO;
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
        return this.getFuncionDataProvider();
    }

    @Override
    public String getColumnaIdentificacionRecursoMaestro() {
        return FuncionParametroCachedRowSetDataProvider2.COLUMNA_ID_FUNCION;
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
            this.getFuncionParametroDataProvider().consultarFuncionParametro(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getFuncionParametroDataProvider().consultarFuncionParametro(filtro);
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
    public void campoIdParametro1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdParametro1_validate(context, component, value);
    }

    public void campoIdFuncionReferencia1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncionReferencia1_validate(context, component, value);
    }

    public void campoIdClaseRecursoValor1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdClaseRecursoValor1_validate(context, component, value);
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
