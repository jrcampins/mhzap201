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

import com.egt.data.specific.xdp2.LogProImpArcExtCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.ArchivoDatosExtCachedRowSetDataProvider2;
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

public class LogProImpArcExt5 extends AbstractPageBean
        implements PaginaActualizacionLogProImpArcExt, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdLogProImpArcExt1.setMinimum(0L);
        validatorIdLogProImpArcExt1.setMaximum(1000000000000000000L);
        validatorCodigoTipoArcDatExt1.setMaximum(30);
        validatorNombreProveedorDatExt1.setMaximum(100);
        validatorCodigoProveedorDatExt1.setMaximum(30);
        validatorCodigoArchivoDatosExt1.setMaximum(100);
        validatorRutaArchivoDatosExt1.setMaximum(255);
        validatorObservacion1.setMaximum(8160);
        converterFechaHoraTransaccion1.setPattern("dd/MM/yyyy hh:mm aa");
        converterFechaHoraTransaccion1.setType("both");
        logProImpArcExtDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.logProImpArcExtRowSet}"));
        archivoDatosExtReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.archivoDatosExtReferenceRowSet}"));
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

    private TableColumn tableColumnIdLogProImpArcExt1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdLogProImpArcExt1() {
        return tableColumnIdLogProImpArcExt1;
    }

    public void setTableColumnIdLogProImpArcExt1(TableColumn component) {
        this.tableColumnIdLogProImpArcExt1 = component;
    }

    private Label labelIdLogProImpArcExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdLogProImpArcExt1() {
        return labelIdLogProImpArcExt1;
    }

    public void setLabelIdLogProImpArcExt1(Label l) {
        this.labelIdLogProImpArcExt1 = l;
    }

    private TextField campoIdLogProImpArcExt1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdLogProImpArcExt1() {
        return campoIdLogProImpArcExt1;
    }

    public void setCampoIdLogProImpArcExt1(TextField component) {
        this.campoIdLogProImpArcExt1 = component;
    }

    private StaticText campoIdLogProImpArcExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdLogProImpArcExt1Texto1() {
        return campoIdLogProImpArcExt1Texto1;
    }

    public void setCampoIdLogProImpArcExt1Texto1(StaticText component) {
        this.campoIdLogProImpArcExt1Texto1 = component;
    }

    private LongConverter converterIdLogProImpArcExt1 = new LongConverter();
  
    public LongConverter getConverterIdLogProImpArcExt1() {
        return converterIdLogProImpArcExt1;
    }
  
    public void setConverterIdLogProImpArcExt1(LongConverter converter) {
        this.converterIdLogProImpArcExt1 = converter;
    }
  
    private LongRangeValidator validatorIdLogProImpArcExt1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdLogProImpArcExt1() {
        return validatorIdLogProImpArcExt1;
    }
  
    public void setValidatorIdLogProImpArcExt1(LongRangeValidator validator) {
        this.validatorIdLogProImpArcExt1 = validator;
    }
  
    private TableColumn tableColumnIdArchivoDatosExt1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdArchivoDatosExt1() {
        return tableColumnIdArchivoDatosExt1;
    }

    public void setTableColumnIdArchivoDatosExt1(TableColumn component) {
        this.tableColumnIdArchivoDatosExt1 = component;
    }

    private Label labelIdArchivoDatosExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdArchivoDatosExt1() {
        return labelIdArchivoDatosExt1;
    }

    public void setLabelIdArchivoDatosExt1(Label l) {
        this.labelIdArchivoDatosExt1 = l;
    }

    private TextField campoIdArchivoDatosExt1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdArchivoDatosExt1() {
        return campoIdArchivoDatosExt1;
    }

    public void setCampoIdArchivoDatosExt1(TextField component) {
        this.campoIdArchivoDatosExt1 = component;
    }

    private StaticText campoIdArchivoDatosExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdArchivoDatosExt1Texto1() {
        return campoIdArchivoDatosExt1Texto1;
    }

    public void setCampoIdArchivoDatosExt1Texto1(StaticText component) {
        this.campoIdArchivoDatosExt1Texto1 = component;
    }

    private Button campoIdArchivoDatosExt1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdArchivoDatosExt1Boton1() {
        return campoIdArchivoDatosExt1Boton1;
    }

    public void setCampoIdArchivoDatosExt1Boton1(Button component) {
        this.campoIdArchivoDatosExt1Boton1 = component;
    }

    private Button campoIdArchivoDatosExt1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdArchivoDatosExt1Boton3() {
        return campoIdArchivoDatosExt1Boton3;
    }

    public void setCampoIdArchivoDatosExt1Boton3(Button component) {
        this.campoIdArchivoDatosExt1Boton3 = component;
    }

    private TableColumn tableColumnIdArchivoDatosExt2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdArchivoDatosExt2() {
        return tableColumnIdArchivoDatosExt2;
    }

    public void setTableColumnIdArchivoDatosExt2(TableColumn component) {
        this.tableColumnIdArchivoDatosExt2 = component;
    }

    private Label labelIdArchivoDatosExt2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdArchivoDatosExt2() {
        return labelIdArchivoDatosExt2;
    }

    public void setLabelIdArchivoDatosExt2(Label l) {
        this.labelIdArchivoDatosExt2 = l;
    }

    private ImageHyperlink campoIdArchivoDatosExt1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdArchivoDatosExt1Hiper1() {
        return campoIdArchivoDatosExt1Hiper1;
    }

    public void setCampoIdArchivoDatosExt1Hiper1(ImageHyperlink component) {
        this.campoIdArchivoDatosExt1Hiper1 = component;
    }

    private TableColumn tableColumnCodigoTipoArcDatExt1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCodigoTipoArcDatExt1() {
        return tableColumnCodigoTipoArcDatExt1;
    }

    public void setTableColumnCodigoTipoArcDatExt1(TableColumn component) {
        this.tableColumnCodigoTipoArcDatExt1 = component;
    }

    private Label labelCodigoTipoArcDatExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoTipoArcDatExt1() {
        return labelCodigoTipoArcDatExt1;
    }

    public void setLabelCodigoTipoArcDatExt1(Label l) {
        this.labelCodigoTipoArcDatExt1 = l;
    }

    private TextField campoCodigoTipoArcDatExt1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoTipoArcDatExt1() {
        return campoCodigoTipoArcDatExt1;
    }

    public void setCampoCodigoTipoArcDatExt1(TextField component) {
        this.campoCodigoTipoArcDatExt1 = component;
    }

    private StaticText campoCodigoTipoArcDatExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoTipoArcDatExt1Texto1() {
        return campoCodigoTipoArcDatExt1Texto1;
    }

    public void setCampoCodigoTipoArcDatExt1Texto1(StaticText component) {
        this.campoCodigoTipoArcDatExt1Texto1 = component;
    }

    private LengthValidator validatorCodigoTipoArcDatExt1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoTipoArcDatExt1() {
        return validatorCodigoTipoArcDatExt1;
    }
  
    public void setValidatorCodigoTipoArcDatExt1(LengthValidator validator) {
        this.validatorCodigoTipoArcDatExt1 = validator;
    }
  
    private TableColumn tableColumnNumeroTipoArcDatExt1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoArcDatExt1() {
        return tableColumnNumeroTipoArcDatExt1;
    }

    public void setTableColumnNumeroTipoArcDatExt1(TableColumn component) {
        this.tableColumnNumeroTipoArcDatExt1 = component;
    }

    private Label labelNumeroTipoArcDatExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoArcDatExt1() {
        return labelNumeroTipoArcDatExt1;
    }

    public void setLabelNumeroTipoArcDatExt1(Label l) {
        this.labelNumeroTipoArcDatExt1 = l;
    }

    private DropDown listaNumeroTipoArcDatExt1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoArcDatExt1() {
        return listaNumeroTipoArcDatExt1;
    }

    public void setListaNumeroTipoArcDatExt1(DropDown component) {
        this.listaNumeroTipoArcDatExt1 = component;
    }

    private StaticText listaNumeroTipoArcDatExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoArcDatExt1Texto1() {
        return listaNumeroTipoArcDatExt1Texto1;
    }

    public void setListaNumeroTipoArcDatExt1Texto1(StaticText component) {
        this.listaNumeroTipoArcDatExt1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoArcDatExt1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoArcDatExt1() {
        return converterNumeroTipoArcDatExt1;
    }
  
    public void setConverterNumeroTipoArcDatExt1(IntegerConverter converter) {
        this.converterNumeroTipoArcDatExt1 = converter;
    }
  
    private TableColumn tableColumnNombreProveedorDatExt1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreProveedorDatExt1() {
        return tableColumnNombreProveedorDatExt1;
    }

    public void setTableColumnNombreProveedorDatExt1(TableColumn component) {
        this.tableColumnNombreProveedorDatExt1 = component;
    }

    private Label labelNombreProveedorDatExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreProveedorDatExt1() {
        return labelNombreProveedorDatExt1;
    }

    public void setLabelNombreProveedorDatExt1(Label l) {
        this.labelNombreProveedorDatExt1 = l;
    }

    private TextField campoNombreProveedorDatExt1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreProveedorDatExt1() {
        return campoNombreProveedorDatExt1;
    }

    public void setCampoNombreProveedorDatExt1(TextField component) {
        this.campoNombreProveedorDatExt1 = component;
    }

    private StaticText campoNombreProveedorDatExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreProveedorDatExt1Texto1() {
        return campoNombreProveedorDatExt1Texto1;
    }

    public void setCampoNombreProveedorDatExt1Texto1(StaticText component) {
        this.campoNombreProveedorDatExt1Texto1 = component;
    }

    private LengthValidator validatorNombreProveedorDatExt1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreProveedorDatExt1() {
        return validatorNombreProveedorDatExt1;
    }
  
    public void setValidatorNombreProveedorDatExt1(LengthValidator validator) {
        this.validatorNombreProveedorDatExt1 = validator;
    }
  
    private TableColumn tableColumnCodigoProveedorDatExt1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCodigoProveedorDatExt1() {
        return tableColumnCodigoProveedorDatExt1;
    }

    public void setTableColumnCodigoProveedorDatExt1(TableColumn component) {
        this.tableColumnCodigoProveedorDatExt1 = component;
    }

    private Label labelCodigoProveedorDatExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoProveedorDatExt1() {
        return labelCodigoProveedorDatExt1;
    }

    public void setLabelCodigoProveedorDatExt1(Label l) {
        this.labelCodigoProveedorDatExt1 = l;
    }

    private TextField campoCodigoProveedorDatExt1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoProveedorDatExt1() {
        return campoCodigoProveedorDatExt1;
    }

    public void setCampoCodigoProveedorDatExt1(TextField component) {
        this.campoCodigoProveedorDatExt1 = component;
    }

    private StaticText campoCodigoProveedorDatExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoProveedorDatExt1Texto1() {
        return campoCodigoProveedorDatExt1Texto1;
    }

    public void setCampoCodigoProveedorDatExt1Texto1(StaticText component) {
        this.campoCodigoProveedorDatExt1Texto1 = component;
    }

    private LengthValidator validatorCodigoProveedorDatExt1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoProveedorDatExt1() {
        return validatorCodigoProveedorDatExt1;
    }
  
    public void setValidatorCodigoProveedorDatExt1(LengthValidator validator) {
        this.validatorCodigoProveedorDatExt1 = validator;
    }
  
    private TableColumn tableColumnCodigoArchivoDatosExt1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCodigoArchivoDatosExt1() {
        return tableColumnCodigoArchivoDatosExt1;
    }

    public void setTableColumnCodigoArchivoDatosExt1(TableColumn component) {
        this.tableColumnCodigoArchivoDatosExt1 = component;
    }

    private Label labelCodigoArchivoDatosExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoArchivoDatosExt1() {
        return labelCodigoArchivoDatosExt1;
    }

    public void setLabelCodigoArchivoDatosExt1(Label l) {
        this.labelCodigoArchivoDatosExt1 = l;
    }

    private TextField campoCodigoArchivoDatosExt1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoArchivoDatosExt1() {
        return campoCodigoArchivoDatosExt1;
    }

    public void setCampoCodigoArchivoDatosExt1(TextField component) {
        this.campoCodigoArchivoDatosExt1 = component;
    }

    private StaticText campoCodigoArchivoDatosExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoArchivoDatosExt1Texto1() {
        return campoCodigoArchivoDatosExt1Texto1;
    }

    public void setCampoCodigoArchivoDatosExt1Texto1(StaticText component) {
        this.campoCodigoArchivoDatosExt1Texto1 = component;
    }

    private LengthValidator validatorCodigoArchivoDatosExt1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoArchivoDatosExt1() {
        return validatorCodigoArchivoDatosExt1;
    }
  
    public void setValidatorCodigoArchivoDatosExt1(LengthValidator validator) {
        this.validatorCodigoArchivoDatosExt1 = validator;
    }
  
    private TableColumn tableColumnRutaArchivoDatosExt1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnRutaArchivoDatosExt1() {
        return tableColumnRutaArchivoDatosExt1;
    }

    public void setTableColumnRutaArchivoDatosExt1(TableColumn component) {
        this.tableColumnRutaArchivoDatosExt1 = component;
    }

    private Label labelRutaArchivoDatosExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelRutaArchivoDatosExt1() {
        return labelRutaArchivoDatosExt1;
    }

    public void setLabelRutaArchivoDatosExt1(Label l) {
        this.labelRutaArchivoDatosExt1 = l;
    }

    private TextArea campoRutaArchivoDatosExt1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoRutaArchivoDatosExt1() {
        return campoRutaArchivoDatosExt1;
    }

    public void setCampoRutaArchivoDatosExt1(TextArea component) {
        this.campoRutaArchivoDatosExt1 = component;
    }

    private StaticText campoRutaArchivoDatosExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoRutaArchivoDatosExt1Texto1() {
        return campoRutaArchivoDatosExt1Texto1;
    }

    public void setCampoRutaArchivoDatosExt1Texto1(StaticText component) {
        this.campoRutaArchivoDatosExt1Texto1 = component;
    }

    private LengthValidator validatorRutaArchivoDatosExt1 = new LengthValidator();
  
    public LengthValidator getValidatorRutaArchivoDatosExt1() {
        return validatorRutaArchivoDatosExt1;
    }
  
    public void setValidatorRutaArchivoDatosExt1(LengthValidator validator) {
        this.validatorRutaArchivoDatosExt1 = validator;
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

    private LogProImpArcExtCachedRowSetDataProvider2 logProImpArcExtDataProvider = new LogProImpArcExtCachedRowSetDataProvider2();

    @Override
    public LogProImpArcExtCachedRowSetDataProvider2 getLogProImpArcExtDataProvider() {
        return logProImpArcExtDataProvider;
    }

    public void setLogProImpArcExtDataProvider(LogProImpArcExtCachedRowSetDataProvider2 crsdp) {
        this.logProImpArcExtDataProvider = crsdp;
    }

    private ArchivoDatosExtCachedRowSetDataProvider2 archivoDatosExtReferenceDataProvider = new ArchivoDatosExtCachedRowSetDataProvider2();

    @Override
    public ArchivoDatosExtCachedRowSetDataProvider2 getArchivoDatosExtReferenceDataProvider() {
        return archivoDatosExtReferenceDataProvider;
    }

    public void setArchivoDatosExtReferenceDataProvider(ArchivoDatosExtCachedRowSetDataProvider2 crsdp) {
        this.archivoDatosExtReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public LogProImpArcExt5() {
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
        logProImpArcExtDataProvider.close();
        archivoDatosExtReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionLogProImpArcExt...">
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
    private AsistentePaginaActualizacionLogProImpArcExt asistente = new AsistentePaginaActualizacionLogProImpArcExt(this);

    public AsistentePaginaActualizacionLogProImpArcExt getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("LogProImpArcExt5_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("LogProImpArcExt5_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("LogProImpArcExt5_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getLogProImpArcExtDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return LogProImpArcExtCachedRowSetDataProvider2.FUNCION_CONSULTAR_LOG_PRO_IMP_ARC_EXT;
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
            this.getLogProImpArcExtDataProvider().consultarLogProImpArcExt(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getLogProImpArcExtDataProvider().consultarLogProImpArcExt(filtro);
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
    public void campoIdArchivoDatosExt1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdArchivoDatosExt1_validate(context, component, value);
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
