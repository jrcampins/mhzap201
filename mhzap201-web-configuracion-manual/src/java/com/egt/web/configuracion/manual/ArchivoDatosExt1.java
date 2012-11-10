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
package com.egt.web.configuracion.manual;

import com.egt.data.specific.xdp2.ArchivoDatosExtCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.ProveedorDatExtCachedRowSetDataProvider2;
import com.egt.data.general.xdp3.UsuarioCachedRowSetDataProvider3;
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
import javax.ejb.EJB;
import com.egt.ejb.business.jms.BusinessProcessMessengerLocal;
import com.egt.ejb.business.process.ArchivoDatosExtBusinessProcessLocal;

public class ArchivoDatosExt1 extends AbstractPageBean
        implements PaginaActualizacionArchivoDatosExt, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdArchivoDatosExt1.setMinimum(0L);
        validatorIdArchivoDatosExt1.setMaximum(1000000000000000000L);
        validatorCodigoArchivoDatosExt1.setMaximum(100);
        validatorNombreArchivoDatosExt1.setMaximum(100);
        converterFechaHoraUltimaCarga1.setPattern("dd/MM/yyyy hh:mm aa");
        converterFechaHoraUltimaCarga1.setType("both");
        converterFechaHoraUltimaImportacion1.setPattern("dd/MM/yyyy hh:mm aa");
        converterFechaHoraUltimaImportacion1.setType("both");
        archivoDatosExtDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.archivoDatosExtRowSet}"));
        proveedorDatExtReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.proveedorDatExtReferenceRowSet}"));
        usuarioReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.usuarioReferenceRowSet}"));
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

    private LongConverter converterIdArchivoDatosExt1 = new LongConverter();
  
    public LongConverter getConverterIdArchivoDatosExt1() {
        return converterIdArchivoDatosExt1;
    }
  
    public void setConverterIdArchivoDatosExt1(LongConverter converter) {
        this.converterIdArchivoDatosExt1 = converter;
    }
  
    private LongRangeValidator validatorIdArchivoDatosExt1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdArchivoDatosExt1() {
        return validatorIdArchivoDatosExt1;
    }
  
    public void setValidatorIdArchivoDatosExt1(LongRangeValidator validator) {
        this.validatorIdArchivoDatosExt1 = validator;
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
  
    private TableColumn tableColumnNombreArchivoDatosExt1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreArchivoDatosExt1() {
        return tableColumnNombreArchivoDatosExt1;
    }

    public void setTableColumnNombreArchivoDatosExt1(TableColumn component) {
        this.tableColumnNombreArchivoDatosExt1 = component;
    }

    private Label labelNombreArchivoDatosExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreArchivoDatosExt1() {
        return labelNombreArchivoDatosExt1;
    }

    public void setLabelNombreArchivoDatosExt1(Label l) {
        this.labelNombreArchivoDatosExt1 = l;
    }

    private TextField campoNombreArchivoDatosExt1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreArchivoDatosExt1() {
        return campoNombreArchivoDatosExt1;
    }

    public void setCampoNombreArchivoDatosExt1(TextField component) {
        this.campoNombreArchivoDatosExt1 = component;
    }

    private StaticText campoNombreArchivoDatosExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreArchivoDatosExt1Texto1() {
        return campoNombreArchivoDatosExt1Texto1;
    }

    public void setCampoNombreArchivoDatosExt1Texto1(StaticText component) {
        this.campoNombreArchivoDatosExt1Texto1 = component;
    }

    private Button campoNombreArchivoDatosExt1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoNombreArchivoDatosExt1Boton3() {
        return campoNombreArchivoDatosExt1Boton3;
    }

    public void setCampoNombreArchivoDatosExt1Boton3(Button component) {
        this.campoNombreArchivoDatosExt1Boton3 = component;
    }

    private LengthValidator validatorNombreArchivoDatosExt1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreArchivoDatosExt1() {
        return validatorNombreArchivoDatosExt1;
    }
  
    public void setValidatorNombreArchivoDatosExt1(LengthValidator validator) {
        this.validatorNombreArchivoDatosExt1 = validator;
    }
  
    private TableColumn tableColumnIdProveedorDatExt1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdProveedorDatExt1() {
        return tableColumnIdProveedorDatExt1;
    }

    public void setTableColumnIdProveedorDatExt1(TableColumn component) {
        this.tableColumnIdProveedorDatExt1 = component;
    }

    private Label labelIdProveedorDatExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdProveedorDatExt1() {
        return labelIdProveedorDatExt1;
    }

    public void setLabelIdProveedorDatExt1(Label l) {
        this.labelIdProveedorDatExt1 = l;
    }

    private TextField campoIdProveedorDatExt1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdProveedorDatExt1() {
        return campoIdProveedorDatExt1;
    }

    public void setCampoIdProveedorDatExt1(TextField component) {
        this.campoIdProveedorDatExt1 = component;
    }

    private StaticText campoIdProveedorDatExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdProveedorDatExt1Texto1() {
        return campoIdProveedorDatExt1Texto1;
    }

    public void setCampoIdProveedorDatExt1Texto1(StaticText component) {
        this.campoIdProveedorDatExt1Texto1 = component;
    }

    private Button campoIdProveedorDatExt1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdProveedorDatExt1Boton1() {
        return campoIdProveedorDatExt1Boton1;
    }

    public void setCampoIdProveedorDatExt1Boton1(Button component) {
        this.campoIdProveedorDatExt1Boton1 = component;
    }

    private Button campoIdProveedorDatExt1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdProveedorDatExt1Boton3() {
        return campoIdProveedorDatExt1Boton3;
    }

    public void setCampoIdProveedorDatExt1Boton3(Button component) {
        this.campoIdProveedorDatExt1Boton3 = component;
    }

    private TableColumn tableColumnIdProveedorDatExt2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdProveedorDatExt2() {
        return tableColumnIdProveedorDatExt2;
    }

    public void setTableColumnIdProveedorDatExt2(TableColumn component) {
        this.tableColumnIdProveedorDatExt2 = component;
    }

    private Label labelIdProveedorDatExt2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdProveedorDatExt2() {
        return labelIdProveedorDatExt2;
    }

    public void setLabelIdProveedorDatExt2(Label l) {
        this.labelIdProveedorDatExt2 = l;
    }

    private ImageHyperlink campoIdProveedorDatExt1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdProveedorDatExt1Hiper1() {
        return campoIdProveedorDatExt1Hiper1;
    }

    public void setCampoIdProveedorDatExt1Hiper1(ImageHyperlink component) {
        this.campoIdProveedorDatExt1Hiper1 = component;
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
  
    private TableColumn tableColumnEsArchivoDatosExtImportado1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsArchivoDatosExtImportado1() {
        return tableColumnEsArchivoDatosExtImportado1;
    }

    public void setTableColumnEsArchivoDatosExtImportado1(TableColumn component) {
        this.tableColumnEsArchivoDatosExtImportado1 = component;
    }

    private Label labelEsArchivoDatosExtImportado1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsArchivoDatosExtImportado1() {
        return labelEsArchivoDatosExtImportado1;
    }

    public void setLabelEsArchivoDatosExtImportado1(Label l) {
        this.labelEsArchivoDatosExtImportado1 = l;
    }

    private DropDown listaEsArchivoDatosExtImportado1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsArchivoDatosExtImportado1() {
        return listaEsArchivoDatosExtImportado1;
    }

    public void setListaEsArchivoDatosExtImportado1(DropDown component) {
        this.listaEsArchivoDatosExtImportado1 = component;
    }

    private StaticText listaEsArchivoDatosExtImportado1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsArchivoDatosExtImportado1Texto1() {
        return listaEsArchivoDatosExtImportado1Texto1;
    }

    public void setListaEsArchivoDatosExtImportado1Texto1(StaticText component) {
        this.listaEsArchivoDatosExtImportado1Texto1 = component;
    }

    private IntegerConverter converterEsArchivoDatosExtImportado1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsArchivoDatosExtImportado1() {
        return converterEsArchivoDatosExtImportado1;
    }
  
    public void setConverterEsArchivoDatosExtImportado1(IntegerConverter converter) {
        this.converterEsArchivoDatosExtImportado1 = converter;
    }
  
    private TableColumn tableColumnFechaHoraUltimaCarga1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaHoraUltimaCarga1() {
        return tableColumnFechaHoraUltimaCarga1;
    }

    public void setTableColumnFechaHoraUltimaCarga1(TableColumn component) {
        this.tableColumnFechaHoraUltimaCarga1 = component;
    }

    private Label labelFechaHoraUltimaCarga1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaHoraUltimaCarga1() {
        return labelFechaHoraUltimaCarga1;
    }

    public void setLabelFechaHoraUltimaCarga1(Label l) {
        this.labelFechaHoraUltimaCarga1 = l;
    }

    private TextField campoFechaHoraUltimaCarga1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaHoraUltimaCarga1() {
        return campoFechaHoraUltimaCarga1;
    }

    public void setCampoFechaHoraUltimaCarga1(TextField component) {
        this.campoFechaHoraUltimaCarga1 = component;
    }

    private StaticText campoFechaHoraUltimaCarga1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaHoraUltimaCarga1Texto1() {
        return campoFechaHoraUltimaCarga1Texto1;
    }

    public void setCampoFechaHoraUltimaCarga1Texto1(StaticText component) {
        this.campoFechaHoraUltimaCarga1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaHoraUltimaCarga1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaHoraUltimaCarga1() {
        return converterFechaHoraUltimaCarga1;
    }
  
    public void setConverterFechaHoraUltimaCarga1(SqlTimestampConverter converter) {
        this.converterFechaHoraUltimaCarga1 = converter;
    }
  
    private TableColumn tableColumnIdUsuarioUltimaCarga1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdUsuarioUltimaCarga1() {
        return tableColumnIdUsuarioUltimaCarga1;
    }

    public void setTableColumnIdUsuarioUltimaCarga1(TableColumn component) {
        this.tableColumnIdUsuarioUltimaCarga1 = component;
    }

    private Label labelIdUsuarioUltimaCarga1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuarioUltimaCarga1() {
        return labelIdUsuarioUltimaCarga1;
    }

    public void setLabelIdUsuarioUltimaCarga1(Label l) {
        this.labelIdUsuarioUltimaCarga1 = l;
    }

    private TextField campoIdUsuarioUltimaCarga1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdUsuarioUltimaCarga1() {
        return campoIdUsuarioUltimaCarga1;
    }

    public void setCampoIdUsuarioUltimaCarga1(TextField component) {
        this.campoIdUsuarioUltimaCarga1 = component;
    }

    private StaticText campoIdUsuarioUltimaCarga1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdUsuarioUltimaCarga1Texto1() {
        return campoIdUsuarioUltimaCarga1Texto1;
    }

    public void setCampoIdUsuarioUltimaCarga1Texto1(StaticText component) {
        this.campoIdUsuarioUltimaCarga1Texto1 = component;
    }

    private Button campoIdUsuarioUltimaCarga1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdUsuarioUltimaCarga1Boton1() {
        return campoIdUsuarioUltimaCarga1Boton1;
    }

    public void setCampoIdUsuarioUltimaCarga1Boton1(Button component) {
        this.campoIdUsuarioUltimaCarga1Boton1 = component;
    }

    private Button campoIdUsuarioUltimaCarga1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUsuarioUltimaCarga1Boton3() {
        return campoIdUsuarioUltimaCarga1Boton3;
    }

    public void setCampoIdUsuarioUltimaCarga1Boton3(Button component) {
        this.campoIdUsuarioUltimaCarga1Boton3 = component;
    }

    private TableColumn tableColumnIdUsuarioUltimaCarga2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdUsuarioUltimaCarga2() {
        return tableColumnIdUsuarioUltimaCarga2;
    }

    public void setTableColumnIdUsuarioUltimaCarga2(TableColumn component) {
        this.tableColumnIdUsuarioUltimaCarga2 = component;
    }

    private Label labelIdUsuarioUltimaCarga2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuarioUltimaCarga2() {
        return labelIdUsuarioUltimaCarga2;
    }

    public void setLabelIdUsuarioUltimaCarga2(Label l) {
        this.labelIdUsuarioUltimaCarga2 = l;
    }

    private ImageHyperlink campoIdUsuarioUltimaCarga1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdUsuarioUltimaCarga1Hiper1() {
        return campoIdUsuarioUltimaCarga1Hiper1;
    }

    public void setCampoIdUsuarioUltimaCarga1Hiper1(ImageHyperlink component) {
        this.campoIdUsuarioUltimaCarga1Hiper1 = component;
    }

    private TableColumn tableColumnFechaHoraUltimaImportacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaHoraUltimaImportacion1() {
        return tableColumnFechaHoraUltimaImportacion1;
    }

    public void setTableColumnFechaHoraUltimaImportacion1(TableColumn component) {
        this.tableColumnFechaHoraUltimaImportacion1 = component;
    }

    private Label labelFechaHoraUltimaImportacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaHoraUltimaImportacion1() {
        return labelFechaHoraUltimaImportacion1;
    }

    public void setLabelFechaHoraUltimaImportacion1(Label l) {
        this.labelFechaHoraUltimaImportacion1 = l;
    }

    private TextField campoFechaHoraUltimaImportacion1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaHoraUltimaImportacion1() {
        return campoFechaHoraUltimaImportacion1;
    }

    public void setCampoFechaHoraUltimaImportacion1(TextField component) {
        this.campoFechaHoraUltimaImportacion1 = component;
    }

    private StaticText campoFechaHoraUltimaImportacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaHoraUltimaImportacion1Texto1() {
        return campoFechaHoraUltimaImportacion1Texto1;
    }

    public void setCampoFechaHoraUltimaImportacion1Texto1(StaticText component) {
        this.campoFechaHoraUltimaImportacion1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaHoraUltimaImportacion1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaHoraUltimaImportacion1() {
        return converterFechaHoraUltimaImportacion1;
    }
  
    public void setConverterFechaHoraUltimaImportacion1(SqlTimestampConverter converter) {
        this.converterFechaHoraUltimaImportacion1 = converter;
    }
  
    private TableColumn tableColumnIdUsuarioUltimaImportacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdUsuarioUltimaImportacion1() {
        return tableColumnIdUsuarioUltimaImportacion1;
    }

    public void setTableColumnIdUsuarioUltimaImportacion1(TableColumn component) {
        this.tableColumnIdUsuarioUltimaImportacion1 = component;
    }

    private Label labelIdUsuarioUltimaImportacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuarioUltimaImportacion1() {
        return labelIdUsuarioUltimaImportacion1;
    }

    public void setLabelIdUsuarioUltimaImportacion1(Label l) {
        this.labelIdUsuarioUltimaImportacion1 = l;
    }

    private TextField campoIdUsuarioUltimaImportacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdUsuarioUltimaImportacion1() {
        return campoIdUsuarioUltimaImportacion1;
    }

    public void setCampoIdUsuarioUltimaImportacion1(TextField component) {
        this.campoIdUsuarioUltimaImportacion1 = component;
    }

    private StaticText campoIdUsuarioUltimaImportacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdUsuarioUltimaImportacion1Texto1() {
        return campoIdUsuarioUltimaImportacion1Texto1;
    }

    public void setCampoIdUsuarioUltimaImportacion1Texto1(StaticText component) {
        this.campoIdUsuarioUltimaImportacion1Texto1 = component;
    }

    private Button campoIdUsuarioUltimaImportacion1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdUsuarioUltimaImportacion1Boton1() {
        return campoIdUsuarioUltimaImportacion1Boton1;
    }

    public void setCampoIdUsuarioUltimaImportacion1Boton1(Button component) {
        this.campoIdUsuarioUltimaImportacion1Boton1 = component;
    }

    private Button campoIdUsuarioUltimaImportacion1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUsuarioUltimaImportacion1Boton3() {
        return campoIdUsuarioUltimaImportacion1Boton3;
    }

    public void setCampoIdUsuarioUltimaImportacion1Boton3(Button component) {
        this.campoIdUsuarioUltimaImportacion1Boton3 = component;
    }

    private TableColumn tableColumnIdUsuarioUltimaImportacion2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdUsuarioUltimaImportacion2() {
        return tableColumnIdUsuarioUltimaImportacion2;
    }

    public void setTableColumnIdUsuarioUltimaImportacion2(TableColumn component) {
        this.tableColumnIdUsuarioUltimaImportacion2 = component;
    }

    private Label labelIdUsuarioUltimaImportacion2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuarioUltimaImportacion2() {
        return labelIdUsuarioUltimaImportacion2;
    }

    public void setLabelIdUsuarioUltimaImportacion2(Label l) {
        this.labelIdUsuarioUltimaImportacion2 = l;
    }

    private ImageHyperlink campoIdUsuarioUltimaImportacion1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdUsuarioUltimaImportacion1Hiper1() {
        return campoIdUsuarioUltimaImportacion1Hiper1;
    }

    public void setCampoIdUsuarioUltimaImportacion1Hiper1(ImageHyperlink component) {
        this.campoIdUsuarioUltimaImportacion1Hiper1 = component;
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

    private ArchivoDatosExtCachedRowSetDataProvider2 archivoDatosExtDataProvider = new ArchivoDatosExtCachedRowSetDataProvider2();

    @Override
    public ArchivoDatosExtCachedRowSetDataProvider2 getArchivoDatosExtDataProvider() {
        return archivoDatosExtDataProvider;
    }

    public void setArchivoDatosExtDataProvider(ArchivoDatosExtCachedRowSetDataProvider2 crsdp) {
        this.archivoDatosExtDataProvider = crsdp;
    }

    private ProveedorDatExtCachedRowSetDataProvider2 proveedorDatExtReferenceDataProvider = new ProveedorDatExtCachedRowSetDataProvider2();

    @Override
    public ProveedorDatExtCachedRowSetDataProvider2 getProveedorDatExtReferenceDataProvider() {
        return proveedorDatExtReferenceDataProvider;
    }

    public void setProveedorDatExtReferenceDataProvider(ProveedorDatExtCachedRowSetDataProvider2 crsdp) {
        this.proveedorDatExtReferenceDataProvider = crsdp;
    }

    private UsuarioCachedRowSetDataProvider3 usuarioReferenceDataProvider = new UsuarioCachedRowSetDataProvider3();

    @Override
    public UsuarioCachedRowSetDataProvider3 getUsuarioReferenceDataProvider() {
        return usuarioReferenceDataProvider;
    }

    public void setUsuarioReferenceDataProvider(UsuarioCachedRowSetDataProvider3 crsdp) {
        this.usuarioReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public ArchivoDatosExt1() {
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
        archivoDatosExtDataProvider.close();
        proveedorDatExtReferenceDataProvider.close();
        usuarioReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionArchivoDatosExt...">
    @Override
    public TextField getTextFieldCampoFechaHoraUltimaCarga1() {
        return this.getCampoFechaHoraUltimaCarga1();
    }

    @Override
    public TextField getTextFieldCampoFechaHoraUltimaImportacion1() {
        return this.getCampoFechaHoraUltimaImportacion1();
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
    private AsistentePaginaActualizacionArchivoDatosExt asistente = new AsistentePaginaActualizacionArchivoDatosExt(this);

    public AsistentePaginaActualizacionArchivoDatosExt getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("ArchivoDatosExt1_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("ArchivoDatosExt1_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("ArchivoDatosExt1_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getArchivoDatosExtDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return ArchivoDatosExtCachedRowSetDataProvider2.FUNCION_CONSULTAR_ARCHIVO_DATOS_EXT;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return ArchivoDatosExtCachedRowSetDataProvider2.FUNCION_CREAR_ARCHIVO_DATOS_EXT;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return ArchivoDatosExtCachedRowSetDataProvider2.FUNCION_MODIFICAR_ARCHIVO_DATOS_EXT;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return ArchivoDatosExtCachedRowSetDataProvider2.FUNCION_ELIMINAR_ARCHIVO_DATOS_EXT;
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
            this.getArchivoDatosExtDataProvider().consultarArchivoDatosExt(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getArchivoDatosExtDataProvider().consultarArchivoDatosExt(filtro);
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
    public void campoIdProveedorDatExt1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdProveedorDatExt1_validate(context, component, value);
    }

    public void campoIdUsuarioUltimaCarga1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdUsuarioUltimaCarga1_validate(context, component, value);
    }

    public void campoIdUsuarioUltimaImportacion1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdUsuarioUltimaImportacion1_validate(context, component, value);
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
        String urx = URX2.COMANDO_ARCHIVO_DATOS_EXT;
        return this.getGestor().getScriptAbrirVentana(urx);
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
    @EJB
    ArchivoDatosExtBusinessProcessLocal archivoDatosExtBusinessProcess;

    @Override
    public Object getArchivoDatosExtBusinessProcess() {
        return archivoDatosExtBusinessProcess;
    }

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @Override
    public Object getMessenger() {
        return messenger;
    }

    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
