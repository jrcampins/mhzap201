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

import com.egt.data.general.xdp2.AplicacionCachedRowSetDataProvider2;
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

public class Aplicacion1 extends AbstractPageBean
        implements PaginaActualizacionAplicacion, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdAplicacion1.setMinimum(0L);
        validatorIdAplicacion1.setMaximum(1000000000000000000L);
        validatorCodigoAplicacion1.setMaximum(100);
        validatorNombreAplicacion1.setMaximum(100);
        validatorDescripcionAplicacion1.setMaximum(8160);
        validatorServidorAplicacion1.setMaximum(100);
        validatorPuertoAplicacion1.setMaximum(10);
        validatorUrlAplicacion1.setMaximum(8160);
        aplicacionDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.aplicacionRowSet}"));
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

    private LongConverter converterIdAplicacion1 = new LongConverter();
  
    public LongConverter getConverterIdAplicacion1() {
        return converterIdAplicacion1;
    }
  
    public void setConverterIdAplicacion1(LongConverter converter) {
        this.converterIdAplicacion1 = converter;
    }
  
    private LongRangeValidator validatorIdAplicacion1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdAplicacion1() {
        return validatorIdAplicacion1;
    }
  
    public void setValidatorIdAplicacion1(LongRangeValidator validator) {
        this.validatorIdAplicacion1 = validator;
    }
  
    private TableColumn tableColumnCodigoAplicacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCodigoAplicacion1() {
        return tableColumnCodigoAplicacion1;
    }

    public void setTableColumnCodigoAplicacion1(TableColumn component) {
        this.tableColumnCodigoAplicacion1 = component;
    }

    private Label labelCodigoAplicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoAplicacion1() {
        return labelCodigoAplicacion1;
    }

    public void setLabelCodigoAplicacion1(Label l) {
        this.labelCodigoAplicacion1 = l;
    }

    private TextField campoCodigoAplicacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoAplicacion1() {
        return campoCodigoAplicacion1;
    }

    public void setCampoCodigoAplicacion1(TextField component) {
        this.campoCodigoAplicacion1 = component;
    }

    private StaticText campoCodigoAplicacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoAplicacion1Texto1() {
        return campoCodigoAplicacion1Texto1;
    }

    public void setCampoCodigoAplicacion1Texto1(StaticText component) {
        this.campoCodigoAplicacion1Texto1 = component;
    }

    private LengthValidator validatorCodigoAplicacion1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoAplicacion1() {
        return validatorCodigoAplicacion1;
    }
  
    public void setValidatorCodigoAplicacion1(LengthValidator validator) {
        this.validatorCodigoAplicacion1 = validator;
    }
  
    private TableColumn tableColumnNombreAplicacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreAplicacion1() {
        return tableColumnNombreAplicacion1;
    }

    public void setTableColumnNombreAplicacion1(TableColumn component) {
        this.tableColumnNombreAplicacion1 = component;
    }

    private Label labelNombreAplicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreAplicacion1() {
        return labelNombreAplicacion1;
    }

    public void setLabelNombreAplicacion1(Label l) {
        this.labelNombreAplicacion1 = l;
    }

    private TextField campoNombreAplicacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreAplicacion1() {
        return campoNombreAplicacion1;
    }

    public void setCampoNombreAplicacion1(TextField component) {
        this.campoNombreAplicacion1 = component;
    }

    private StaticText campoNombreAplicacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreAplicacion1Texto1() {
        return campoNombreAplicacion1Texto1;
    }

    public void setCampoNombreAplicacion1Texto1(StaticText component) {
        this.campoNombreAplicacion1Texto1 = component;
    }

    private LengthValidator validatorNombreAplicacion1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreAplicacion1() {
        return validatorNombreAplicacion1;
    }
  
    public void setValidatorNombreAplicacion1(LengthValidator validator) {
        this.validatorNombreAplicacion1 = validator;
    }
  
    private TableColumn tableColumnDescripcionAplicacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnDescripcionAplicacion1() {
        return tableColumnDescripcionAplicacion1;
    }

    public void setTableColumnDescripcionAplicacion1(TableColumn component) {
        this.tableColumnDescripcionAplicacion1 = component;
    }

    private Label labelDescripcionAplicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDescripcionAplicacion1() {
        return labelDescripcionAplicacion1;
    }

    public void setLabelDescripcionAplicacion1(Label l) {
        this.labelDescripcionAplicacion1 = l;
    }

    private TextArea campoDescripcionAplicacion1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDescripcionAplicacion1() {
        return campoDescripcionAplicacion1;
    }

    public void setCampoDescripcionAplicacion1(TextArea component) {
        this.campoDescripcionAplicacion1 = component;
    }

    private StaticText campoDescripcionAplicacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDescripcionAplicacion1Texto1() {
        return campoDescripcionAplicacion1Texto1;
    }

    public void setCampoDescripcionAplicacion1Texto1(StaticText component) {
        this.campoDescripcionAplicacion1Texto1 = component;
    }

    private LengthValidator validatorDescripcionAplicacion1 = new LengthValidator();
  
    public LengthValidator getValidatorDescripcionAplicacion1() {
        return validatorDescripcionAplicacion1;
    }
  
    public void setValidatorDescripcionAplicacion1(LengthValidator validator) {
        this.validatorDescripcionAplicacion1 = validator;
    }
  
    private TableColumn tableColumnServidorAplicacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnServidorAplicacion1() {
        return tableColumnServidorAplicacion1;
    }

    public void setTableColumnServidorAplicacion1(TableColumn component) {
        this.tableColumnServidorAplicacion1 = component;
    }

    private Label labelServidorAplicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelServidorAplicacion1() {
        return labelServidorAplicacion1;
    }

    public void setLabelServidorAplicacion1(Label l) {
        this.labelServidorAplicacion1 = l;
    }

    private TextField campoServidorAplicacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoServidorAplicacion1() {
        return campoServidorAplicacion1;
    }

    public void setCampoServidorAplicacion1(TextField component) {
        this.campoServidorAplicacion1 = component;
    }

    private StaticText campoServidorAplicacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoServidorAplicacion1Texto1() {
        return campoServidorAplicacion1Texto1;
    }

    public void setCampoServidorAplicacion1Texto1(StaticText component) {
        this.campoServidorAplicacion1Texto1 = component;
    }

    private LengthValidator validatorServidorAplicacion1 = new LengthValidator();
  
    public LengthValidator getValidatorServidorAplicacion1() {
        return validatorServidorAplicacion1;
    }
  
    public void setValidatorServidorAplicacion1(LengthValidator validator) {
        this.validatorServidorAplicacion1 = validator;
    }
  
    private TableColumn tableColumnPuertoAplicacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnPuertoAplicacion1() {
        return tableColumnPuertoAplicacion1;
    }

    public void setTableColumnPuertoAplicacion1(TableColumn component) {
        this.tableColumnPuertoAplicacion1 = component;
    }

    private Label labelPuertoAplicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelPuertoAplicacion1() {
        return labelPuertoAplicacion1;
    }

    public void setLabelPuertoAplicacion1(Label l) {
        this.labelPuertoAplicacion1 = l;
    }

    private TextField campoPuertoAplicacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoPuertoAplicacion1() {
        return campoPuertoAplicacion1;
    }

    public void setCampoPuertoAplicacion1(TextField component) {
        this.campoPuertoAplicacion1 = component;
    }

    private StaticText campoPuertoAplicacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoPuertoAplicacion1Texto1() {
        return campoPuertoAplicacion1Texto1;
    }

    public void setCampoPuertoAplicacion1Texto1(StaticText component) {
        this.campoPuertoAplicacion1Texto1 = component;
    }

    private LengthValidator validatorPuertoAplicacion1 = new LengthValidator();
  
    public LengthValidator getValidatorPuertoAplicacion1() {
        return validatorPuertoAplicacion1;
    }
  
    public void setValidatorPuertoAplicacion1(LengthValidator validator) {
        this.validatorPuertoAplicacion1 = validator;
    }
  
    private TableColumn tableColumnUrlAplicacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnUrlAplicacion1() {
        return tableColumnUrlAplicacion1;
    }

    public void setTableColumnUrlAplicacion1(TableColumn component) {
        this.tableColumnUrlAplicacion1 = component;
    }

    private Label labelUrlAplicacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelUrlAplicacion1() {
        return labelUrlAplicacion1;
    }

    public void setLabelUrlAplicacion1(Label l) {
        this.labelUrlAplicacion1 = l;
    }

    private TextArea campoUrlAplicacion1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoUrlAplicacion1() {
        return campoUrlAplicacion1;
    }

    public void setCampoUrlAplicacion1(TextArea component) {
        this.campoUrlAplicacion1 = component;
    }

    private StaticText campoUrlAplicacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoUrlAplicacion1Texto1() {
        return campoUrlAplicacion1Texto1;
    }

    public void setCampoUrlAplicacion1Texto1(StaticText component) {
        this.campoUrlAplicacion1Texto1 = component;
    }

    private LengthValidator validatorUrlAplicacion1 = new LengthValidator();
  
    public LengthValidator getValidatorUrlAplicacion1() {
        return validatorUrlAplicacion1;
    }
  
    public void setValidatorUrlAplicacion1(LengthValidator validator) {
        this.validatorUrlAplicacion1 = validator;
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

    private AplicacionCachedRowSetDataProvider2 aplicacionDataProvider = new AplicacionCachedRowSetDataProvider2();

    @Override
    public AplicacionCachedRowSetDataProvider2 getAplicacionDataProvider() {
        return aplicacionDataProvider;
    }

    public void setAplicacionDataProvider(AplicacionCachedRowSetDataProvider2 crsdp) {
        this.aplicacionDataProvider = crsdp;
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
    public Aplicacion1() {
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
        aplicacionDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionAplicacion...">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion con tabla">
    private GestorPaginaActualizacionConTabla gestor = new GestorPaginaActualizacionConTabla(this);

    @Override
    public GestorPaginaActualizacionConTabla getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionAplicacion asistente = new AsistentePaginaActualizacionAplicacion(this);

    public AsistentePaginaActualizacionAplicacion getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("Aplicacion1_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("Aplicacion1_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("Aplicacion1_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getAplicacionDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return AplicacionCachedRowSetDataProvider2.FUNCION_CONSULTAR_APLICACION;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return AplicacionCachedRowSetDataProvider2.FUNCION_CREAR_APLICACION;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return AplicacionCachedRowSetDataProvider2.FUNCION_MODIFICAR_APLICACION;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return AplicacionCachedRowSetDataProvider2.FUNCION_ELIMINAR_APLICACION;
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
            this.getAplicacionDataProvider().consultarAplicacion(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getAplicacionDataProvider().consultarAplicacion(filtro);
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
