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
package com.egt.web.gestion.censo;

import com.egt.data.specific.xdp2.VisitaCensoCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.PotencialBenCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FuncionarioCachedRowSetDataProvider2;
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

public class VisitaCenso1 extends AbstractPageBean
        implements PaginaActualizacionVisitaCenso, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdVisitaCenso1.setMinimum(0L);
        validatorIdVisitaCenso1.setMaximum(1000000000000000000L);
        converterFechaVisita1.setPattern("dd/MM/yyyy");
        converterFechaVisita1.setType("date");
        validatorObservaciones1.setMaximum(8160);
        visitaCensoDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.visitaCensoRowSet}"));
        potencialBenReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.potencialBenReferenceRowSet}"));
        funcionarioReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.funcionarioReferenceRowSet}"));
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

    private TableColumn tableColumnIdVisitaCenso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdVisitaCenso1() {
        return tableColumnIdVisitaCenso1;
    }

    public void setTableColumnIdVisitaCenso1(TableColumn component) {
        this.tableColumnIdVisitaCenso1 = component;
    }

    private Label labelIdVisitaCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdVisitaCenso1() {
        return labelIdVisitaCenso1;
    }

    public void setLabelIdVisitaCenso1(Label l) {
        this.labelIdVisitaCenso1 = l;
    }

    private TextField campoIdVisitaCenso1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdVisitaCenso1() {
        return campoIdVisitaCenso1;
    }

    public void setCampoIdVisitaCenso1(TextField component) {
        this.campoIdVisitaCenso1 = component;
    }

    private StaticText campoIdVisitaCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdVisitaCenso1Texto1() {
        return campoIdVisitaCenso1Texto1;
    }

    public void setCampoIdVisitaCenso1Texto1(StaticText component) {
        this.campoIdVisitaCenso1Texto1 = component;
    }

    private LongConverter converterIdVisitaCenso1 = new LongConverter();
  
    public LongConverter getConverterIdVisitaCenso1() {
        return converterIdVisitaCenso1;
    }
  
    public void setConverterIdVisitaCenso1(LongConverter converter) {
        this.converterIdVisitaCenso1 = converter;
    }
  
    private LongRangeValidator validatorIdVisitaCenso1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdVisitaCenso1() {
        return validatorIdVisitaCenso1;
    }
  
    public void setValidatorIdVisitaCenso1(LongRangeValidator validator) {
        this.validatorIdVisitaCenso1 = validator;
    }
  
    private TableColumn tableColumnIdPotencialBen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdPotencialBen1() {
        return tableColumnIdPotencialBen1;
    }

    public void setTableColumnIdPotencialBen1(TableColumn component) {
        this.tableColumnIdPotencialBen1 = component;
    }

    private Label labelIdPotencialBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPotencialBen1() {
        return labelIdPotencialBen1;
    }

    public void setLabelIdPotencialBen1(Label l) {
        this.labelIdPotencialBen1 = l;
    }

    private TextField campoIdPotencialBen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdPotencialBen1() {
        return campoIdPotencialBen1;
    }

    public void setCampoIdPotencialBen1(TextField component) {
        this.campoIdPotencialBen1 = component;
    }

    private StaticText campoIdPotencialBen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdPotencialBen1Texto1() {
        return campoIdPotencialBen1Texto1;
    }

    public void setCampoIdPotencialBen1Texto1(StaticText component) {
        this.campoIdPotencialBen1Texto1 = component;
    }

    private Button campoIdPotencialBen1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdPotencialBen1Boton1() {
        return campoIdPotencialBen1Boton1;
    }

    public void setCampoIdPotencialBen1Boton1(Button component) {
        this.campoIdPotencialBen1Boton1 = component;
    }

    private Button campoIdPotencialBen1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPotencialBen1Boton3() {
        return campoIdPotencialBen1Boton3;
    }

    public void setCampoIdPotencialBen1Boton3(Button component) {
        this.campoIdPotencialBen1Boton3 = component;
    }

    private TableColumn tableColumnIdPotencialBen2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdPotencialBen2() {
        return tableColumnIdPotencialBen2;
    }

    public void setTableColumnIdPotencialBen2(TableColumn component) {
        this.tableColumnIdPotencialBen2 = component;
    }

    private Label labelIdPotencialBen2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPotencialBen2() {
        return labelIdPotencialBen2;
    }

    public void setLabelIdPotencialBen2(Label l) {
        this.labelIdPotencialBen2 = l;
    }

    private ImageHyperlink campoIdPotencialBen1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdPotencialBen1Hiper1() {
        return campoIdPotencialBen1Hiper1;
    }

    public void setCampoIdPotencialBen1Hiper1(ImageHyperlink component) {
        this.campoIdPotencialBen1Hiper1 = component;
    }

    private TableColumn tableColumnIdFuncionarioCensista1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionarioCensista1() {
        return tableColumnIdFuncionarioCensista1;
    }

    public void setTableColumnIdFuncionarioCensista1(TableColumn component) {
        this.tableColumnIdFuncionarioCensista1 = component;
    }

    private Label labelIdFuncionarioCensista1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioCensista1() {
        return labelIdFuncionarioCensista1;
    }

    public void setLabelIdFuncionarioCensista1(Label l) {
        this.labelIdFuncionarioCensista1 = l;
    }

    private TextField campoIdFuncionarioCensista1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionarioCensista1() {
        return campoIdFuncionarioCensista1;
    }

    public void setCampoIdFuncionarioCensista1(TextField component) {
        this.campoIdFuncionarioCensista1 = component;
    }

    private StaticText campoIdFuncionarioCensista1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioCensista1Texto1() {
        return campoIdFuncionarioCensista1Texto1;
    }

    public void setCampoIdFuncionarioCensista1Texto1(StaticText component) {
        this.campoIdFuncionarioCensista1Texto1 = component;
    }

    private Button campoIdFuncionarioCensista1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioCensista1Boton1() {
        return campoIdFuncionarioCensista1Boton1;
    }

    public void setCampoIdFuncionarioCensista1Boton1(Button component) {
        this.campoIdFuncionarioCensista1Boton1 = component;
    }

    private Button campoIdFuncionarioCensista1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioCensista1Boton3() {
        return campoIdFuncionarioCensista1Boton3;
    }

    public void setCampoIdFuncionarioCensista1Boton3(Button component) {
        this.campoIdFuncionarioCensista1Boton3 = component;
    }

    private TableColumn tableColumnIdFuncionarioCensista2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionarioCensista2() {
        return tableColumnIdFuncionarioCensista2;
    }

    public void setTableColumnIdFuncionarioCensista2(TableColumn component) {
        this.tableColumnIdFuncionarioCensista2 = component;
    }

    private Label labelIdFuncionarioCensista2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioCensista2() {
        return labelIdFuncionarioCensista2;
    }

    public void setLabelIdFuncionarioCensista2(Label l) {
        this.labelIdFuncionarioCensista2 = l;
    }

    private ImageHyperlink campoIdFuncionarioCensista1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdFuncionarioCensista1Hiper1() {
        return campoIdFuncionarioCensista1Hiper1;
    }

    public void setCampoIdFuncionarioCensista1Hiper1(ImageHyperlink component) {
        this.campoIdFuncionarioCensista1Hiper1 = component;
    }

    private TableColumn tableColumnFechaVisita1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaVisita1() {
        return tableColumnFechaVisita1;
    }

    public void setTableColumnFechaVisita1(TableColumn component) {
        this.tableColumnFechaVisita1 = component;
    }

    private Label labelFechaVisita1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaVisita1() {
        return labelFechaVisita1;
    }

    public void setLabelFechaVisita1(Label l) {
        this.labelFechaVisita1 = l;
    }

    private TextField campoFechaVisita1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaVisita1() {
        return campoFechaVisita1;
    }

    public void setCampoFechaVisita1(TextField component) {
        this.campoFechaVisita1 = component;
    }

    private StaticText campoFechaVisita1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaVisita1Texto1() {
        return campoFechaVisita1Texto1;
    }

    public void setCampoFechaVisita1Texto1(StaticText component) {
        this.campoFechaVisita1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaVisita1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaVisita1() {
        return converterFechaVisita1;
    }
  
    public void setConverterFechaVisita1(SqlTimestampConverter converter) {
        this.converterFechaVisita1 = converter;
    }
  
    private TableColumn tableColumnObservaciones1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnObservaciones1() {
        return tableColumnObservaciones1;
    }

    public void setTableColumnObservaciones1(TableColumn component) {
        this.tableColumnObservaciones1 = component;
    }

    private Label labelObservaciones1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelObservaciones1() {
        return labelObservaciones1;
    }

    public void setLabelObservaciones1(Label l) {
        this.labelObservaciones1 = l;
    }

    private TextArea campoObservaciones1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoObservaciones1() {
        return campoObservaciones1;
    }

    public void setCampoObservaciones1(TextArea component) {
        this.campoObservaciones1 = component;
    }

    private StaticText campoObservaciones1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoObservaciones1Texto1() {
        return campoObservaciones1Texto1;
    }

    public void setCampoObservaciones1Texto1(StaticText component) {
        this.campoObservaciones1Texto1 = component;
    }

    private LengthValidator validatorObservaciones1 = new LengthValidator();
  
    public LengthValidator getValidatorObservaciones1() {
        return validatorObservaciones1;
    }
  
    public void setValidatorObservaciones1(LengthValidator validator) {
        this.validatorObservaciones1 = validator;
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

    private VisitaCensoCachedRowSetDataProvider2 visitaCensoDataProvider = new VisitaCensoCachedRowSetDataProvider2();

    @Override
    public VisitaCensoCachedRowSetDataProvider2 getVisitaCensoDataProvider() {
        return visitaCensoDataProvider;
    }

    public void setVisitaCensoDataProvider(VisitaCensoCachedRowSetDataProvider2 crsdp) {
        this.visitaCensoDataProvider = crsdp;
    }

    private PotencialBenCachedRowSetDataProvider2 potencialBenReferenceDataProvider = new PotencialBenCachedRowSetDataProvider2();

    @Override
    public PotencialBenCachedRowSetDataProvider2 getPotencialBenReferenceDataProvider() {
        return potencialBenReferenceDataProvider;
    }

    public void setPotencialBenReferenceDataProvider(PotencialBenCachedRowSetDataProvider2 crsdp) {
        this.potencialBenReferenceDataProvider = crsdp;
    }

    private FuncionarioCachedRowSetDataProvider2 funcionarioReferenceDataProvider = new FuncionarioCachedRowSetDataProvider2();

    @Override
    public FuncionarioCachedRowSetDataProvider2 getFuncionarioReferenceDataProvider() {
        return funcionarioReferenceDataProvider;
    }

    public void setFuncionarioReferenceDataProvider(FuncionarioCachedRowSetDataProvider2 crsdp) {
        this.funcionarioReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public VisitaCenso1() {
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
        visitaCensoDataProvider.close();
        potencialBenReferenceDataProvider.close();
        funcionarioReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionVisitaCenso...">
    @Override
    public TextField getTextFieldCampoFechaVisita1() {
        return this.getCampoFechaVisita1();
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
    private AsistentePaginaActualizacionVisitaCenso asistente = new AsistentePaginaActualizacionVisitaCenso(this);

    public AsistentePaginaActualizacionVisitaCenso getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("VisitaCenso1_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("VisitaCenso1_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("VisitaCenso1_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getVisitaCensoDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return VisitaCensoCachedRowSetDataProvider2.FUNCION_CONSULTAR_VISITA_CENSO;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return VisitaCensoCachedRowSetDataProvider2.FUNCION_CREAR_VISITA_CENSO;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return VisitaCensoCachedRowSetDataProvider2.FUNCION_MODIFICAR_VISITA_CENSO;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return VisitaCensoCachedRowSetDataProvider2.FUNCION_ELIMINAR_VISITA_CENSO;
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
            this.getVisitaCensoDataProvider().consultarVisitaCenso(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getVisitaCensoDataProvider().consultarVisitaCenso(filtro);
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
    public void campoIdPotencialBen1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdPotencialBen1_validate(context, component, value);
    }

    public void campoIdFuncionarioCensista1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncionarioCensista1_validate(context, component, value);
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
