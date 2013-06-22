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

import com.egt.data.specific.xdp2.ObjecionElePenCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.ProveedorDatExtCachedRowSetDataProvider2;
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

public class ObjecionElePen5 extends AbstractPageBean
        implements PaginaActualizacionObjecionElePen, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdObjecionElePen1.setMinimum(0L);
        validatorIdObjecionElePen1.setMaximum(1000000000000000000L);
        converterFechaUltimaActualizacion1.setPattern("dd/MM/yyyy");
        converterFechaUltimaActualizacion1.setType("date");
        validatorNombreArchivoUltimaAct1.setMaximum(200);
        validatorObservaciones1.setMaximum(8160);
        converterFechaAnulacion1.setPattern("dd/MM/yyyy");
        converterFechaAnulacion1.setType("date");
        validatorObservacionesAnulacion1.setMaximum(8160);
        validatorReferencia1.setMaximum(8160);
        objecionElePenDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.objecionElePenRowSet}"));
        personaReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.personaReferenceRowSet}"));
        proveedorDatExtReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.proveedorDatExtReferenceRowSet}"));
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

    private TableColumn tableColumnIdObjecionElePen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdObjecionElePen1() {
        return tableColumnIdObjecionElePen1;
    }

    public void setTableColumnIdObjecionElePen1(TableColumn component) {
        this.tableColumnIdObjecionElePen1 = component;
    }

    private Label labelIdObjecionElePen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdObjecionElePen1() {
        return labelIdObjecionElePen1;
    }

    public void setLabelIdObjecionElePen1(Label l) {
        this.labelIdObjecionElePen1 = l;
    }

    private TextField campoIdObjecionElePen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdObjecionElePen1() {
        return campoIdObjecionElePen1;
    }

    public void setCampoIdObjecionElePen1(TextField component) {
        this.campoIdObjecionElePen1 = component;
    }

    private StaticText campoIdObjecionElePen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdObjecionElePen1Texto1() {
        return campoIdObjecionElePen1Texto1;
    }

    public void setCampoIdObjecionElePen1Texto1(StaticText component) {
        this.campoIdObjecionElePen1Texto1 = component;
    }

    private LongConverter converterIdObjecionElePen1 = new LongConverter();
  
    public LongConverter getConverterIdObjecionElePen1() {
        return converterIdObjecionElePen1;
    }
  
    public void setConverterIdObjecionElePen1(LongConverter converter) {
        this.converterIdObjecionElePen1 = converter;
    }
  
    private LongRangeValidator validatorIdObjecionElePen1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdObjecionElePen1() {
        return validatorIdObjecionElePen1;
    }
  
    public void setValidatorIdObjecionElePen1(LongRangeValidator validator) {
        this.validatorIdObjecionElePen1 = validator;
    }
  
    private TableColumn tableColumnIdPersona1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdPersona1() {
        return tableColumnIdPersona1;
    }

    public void setTableColumnIdPersona1(TableColumn component) {
        this.tableColumnIdPersona1 = component;
    }

    private Label labelIdPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPersona1() {
        return labelIdPersona1;
    }

    public void setLabelIdPersona1(Label l) {
        this.labelIdPersona1 = l;
    }

    private TextField campoIdPersona1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdPersona1() {
        return campoIdPersona1;
    }

    public void setCampoIdPersona1(TextField component) {
        this.campoIdPersona1 = component;
    }

    private StaticText campoIdPersona1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdPersona1Texto1() {
        return campoIdPersona1Texto1;
    }

    public void setCampoIdPersona1Texto1(StaticText component) {
        this.campoIdPersona1Texto1 = component;
    }

    private Button campoIdPersona1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdPersona1Boton1() {
        return campoIdPersona1Boton1;
    }

    public void setCampoIdPersona1Boton1(Button component) {
        this.campoIdPersona1Boton1 = component;
    }

    private Button campoIdPersona1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPersona1Boton3() {
        return campoIdPersona1Boton3;
    }

    public void setCampoIdPersona1Boton3(Button component) {
        this.campoIdPersona1Boton3 = component;
    }

    private TableColumn tableColumnIdPersona2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdPersona2() {
        return tableColumnIdPersona2;
    }

    public void setTableColumnIdPersona2(TableColumn component) {
        this.tableColumnIdPersona2 = component;
    }

    private Label labelIdPersona2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPersona2() {
        return labelIdPersona2;
    }

    public void setLabelIdPersona2(Label l) {
        this.labelIdPersona2 = l;
    }

    private ImageHyperlink campoIdPersona1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdPersona1Hiper1() {
        return campoIdPersona1Hiper1;
    }

    public void setCampoIdPersona1Hiper1(ImageHyperlink component) {
        this.campoIdPersona1Hiper1 = component;
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

    private TableColumn tableColumnNumeroTipoObjElePen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoObjElePen1() {
        return tableColumnNumeroTipoObjElePen1;
    }

    public void setTableColumnNumeroTipoObjElePen1(TableColumn component) {
        this.tableColumnNumeroTipoObjElePen1 = component;
    }

    private Label labelNumeroTipoObjElePen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoObjElePen1() {
        return labelNumeroTipoObjElePen1;
    }

    public void setLabelNumeroTipoObjElePen1(Label l) {
        this.labelNumeroTipoObjElePen1 = l;
    }

    private DropDown listaNumeroTipoObjElePen1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoObjElePen1() {
        return listaNumeroTipoObjElePen1;
    }

    public void setListaNumeroTipoObjElePen1(DropDown component) {
        this.listaNumeroTipoObjElePen1 = component;
    }

    private StaticText listaNumeroTipoObjElePen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoObjElePen1Texto1() {
        return listaNumeroTipoObjElePen1Texto1;
    }

    public void setListaNumeroTipoObjElePen1Texto1(StaticText component) {
        this.listaNumeroTipoObjElePen1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoObjElePen1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoObjElePen1() {
        return converterNumeroTipoObjElePen1;
    }
  
    public void setConverterNumeroTipoObjElePen1(IntegerConverter converter) {
        this.converterNumeroTipoObjElePen1 = converter;
    }
  
    private TableColumn tableColumnEsObjecionElePenInactiva1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsObjecionElePenInactiva1() {
        return tableColumnEsObjecionElePenInactiva1;
    }

    public void setTableColumnEsObjecionElePenInactiva1(TableColumn component) {
        this.tableColumnEsObjecionElePenInactiva1 = component;
    }

    private Label labelEsObjecionElePenInactiva1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsObjecionElePenInactiva1() {
        return labelEsObjecionElePenInactiva1;
    }

    public void setLabelEsObjecionElePenInactiva1(Label l) {
        this.labelEsObjecionElePenInactiva1 = l;
    }

    private DropDown listaEsObjecionElePenInactiva1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsObjecionElePenInactiva1() {
        return listaEsObjecionElePenInactiva1;
    }

    public void setListaEsObjecionElePenInactiva1(DropDown component) {
        this.listaEsObjecionElePenInactiva1 = component;
    }

    private StaticText listaEsObjecionElePenInactiva1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsObjecionElePenInactiva1Texto1() {
        return listaEsObjecionElePenInactiva1Texto1;
    }

    public void setListaEsObjecionElePenInactiva1Texto1(StaticText component) {
        this.listaEsObjecionElePenInactiva1Texto1 = component;
    }

    private IntegerConverter converterEsObjecionElePenInactiva1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsObjecionElePenInactiva1() {
        return converterEsObjecionElePenInactiva1;
    }
  
    public void setConverterEsObjecionElePenInactiva1(IntegerConverter converter) {
        this.converterEsObjecionElePenInactiva1 = converter;
    }
  
    private TableColumn tableColumnFechaUltimaActualizacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaUltimaActualizacion1() {
        return tableColumnFechaUltimaActualizacion1;
    }

    public void setTableColumnFechaUltimaActualizacion1(TableColumn component) {
        this.tableColumnFechaUltimaActualizacion1 = component;
    }

    private Label labelFechaUltimaActualizacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaUltimaActualizacion1() {
        return labelFechaUltimaActualizacion1;
    }

    public void setLabelFechaUltimaActualizacion1(Label l) {
        this.labelFechaUltimaActualizacion1 = l;
    }

    private TextField campoFechaUltimaActualizacion1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaUltimaActualizacion1() {
        return campoFechaUltimaActualizacion1;
    }

    public void setCampoFechaUltimaActualizacion1(TextField component) {
        this.campoFechaUltimaActualizacion1 = component;
    }

    private StaticText campoFechaUltimaActualizacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaUltimaActualizacion1Texto1() {
        return campoFechaUltimaActualizacion1Texto1;
    }

    public void setCampoFechaUltimaActualizacion1Texto1(StaticText component) {
        this.campoFechaUltimaActualizacion1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaUltimaActualizacion1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaUltimaActualizacion1() {
        return converterFechaUltimaActualizacion1;
    }
  
    public void setConverterFechaUltimaActualizacion1(SqlTimestampConverter converter) {
        this.converterFechaUltimaActualizacion1 = converter;
    }
  
    private TableColumn tableColumnNombreArchivoUltimaAct1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreArchivoUltimaAct1() {
        return tableColumnNombreArchivoUltimaAct1;
    }

    public void setTableColumnNombreArchivoUltimaAct1(TableColumn component) {
        this.tableColumnNombreArchivoUltimaAct1 = component;
    }

    private Label labelNombreArchivoUltimaAct1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreArchivoUltimaAct1() {
        return labelNombreArchivoUltimaAct1;
    }

    public void setLabelNombreArchivoUltimaAct1(Label l) {
        this.labelNombreArchivoUltimaAct1 = l;
    }

    private TextArea campoNombreArchivoUltimaAct1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNombreArchivoUltimaAct1() {
        return campoNombreArchivoUltimaAct1;
    }

    public void setCampoNombreArchivoUltimaAct1(TextArea component) {
        this.campoNombreArchivoUltimaAct1 = component;
    }

    private StaticText campoNombreArchivoUltimaAct1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreArchivoUltimaAct1Texto1() {
        return campoNombreArchivoUltimaAct1Texto1;
    }

    public void setCampoNombreArchivoUltimaAct1Texto1(StaticText component) {
        this.campoNombreArchivoUltimaAct1Texto1 = component;
    }

    private Button campoNombreArchivoUltimaAct1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoNombreArchivoUltimaAct1Boton3() {
        return campoNombreArchivoUltimaAct1Boton3;
    }

    public void setCampoNombreArchivoUltimaAct1Boton3(Button component) {
        this.campoNombreArchivoUltimaAct1Boton3 = component;
    }

    private LengthValidator validatorNombreArchivoUltimaAct1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreArchivoUltimaAct1() {
        return validatorNombreArchivoUltimaAct1;
    }
  
    public void setValidatorNombreArchivoUltimaAct1(LengthValidator validator) {
        this.validatorNombreArchivoUltimaAct1 = validator;
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
  
    private TableColumn tableColumnFechaAnulacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaAnulacion1() {
        return tableColumnFechaAnulacion1;
    }

    public void setTableColumnFechaAnulacion1(TableColumn component) {
        this.tableColumnFechaAnulacion1 = component;
    }

    private Label labelFechaAnulacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaAnulacion1() {
        return labelFechaAnulacion1;
    }

    public void setLabelFechaAnulacion1(Label l) {
        this.labelFechaAnulacion1 = l;
    }

    private TextField campoFechaAnulacion1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaAnulacion1() {
        return campoFechaAnulacion1;
    }

    public void setCampoFechaAnulacion1(TextField component) {
        this.campoFechaAnulacion1 = component;
    }

    private StaticText campoFechaAnulacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaAnulacion1Texto1() {
        return campoFechaAnulacion1Texto1;
    }

    public void setCampoFechaAnulacion1Texto1(StaticText component) {
        this.campoFechaAnulacion1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaAnulacion1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaAnulacion1() {
        return converterFechaAnulacion1;
    }
  
    public void setConverterFechaAnulacion1(SqlTimestampConverter converter) {
        this.converterFechaAnulacion1 = converter;
    }
  
    private TableColumn tableColumnObservacionesAnulacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnObservacionesAnulacion1() {
        return tableColumnObservacionesAnulacion1;
    }

    public void setTableColumnObservacionesAnulacion1(TableColumn component) {
        this.tableColumnObservacionesAnulacion1 = component;
    }

    private Label labelObservacionesAnulacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelObservacionesAnulacion1() {
        return labelObservacionesAnulacion1;
    }

    public void setLabelObservacionesAnulacion1(Label l) {
        this.labelObservacionesAnulacion1 = l;
    }

    private TextArea campoObservacionesAnulacion1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoObservacionesAnulacion1() {
        return campoObservacionesAnulacion1;
    }

    public void setCampoObservacionesAnulacion1(TextArea component) {
        this.campoObservacionesAnulacion1 = component;
    }

    private StaticText campoObservacionesAnulacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoObservacionesAnulacion1Texto1() {
        return campoObservacionesAnulacion1Texto1;
    }

    public void setCampoObservacionesAnulacion1Texto1(StaticText component) {
        this.campoObservacionesAnulacion1Texto1 = component;
    }

    private LengthValidator validatorObservacionesAnulacion1 = new LengthValidator();
  
    public LengthValidator getValidatorObservacionesAnulacion1() {
        return validatorObservacionesAnulacion1;
    }
  
    public void setValidatorObservacionesAnulacion1(LengthValidator validator) {
        this.validatorObservacionesAnulacion1 = validator;
    }
  
    private TableColumn tableColumnReferencia1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnReferencia1() {
        return tableColumnReferencia1;
    }

    public void setTableColumnReferencia1(TableColumn component) {
        this.tableColumnReferencia1 = component;
    }

    private Label labelReferencia1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelReferencia1() {
        return labelReferencia1;
    }

    public void setLabelReferencia1(Label l) {
        this.labelReferencia1 = l;
    }

    private TextArea campoReferencia1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoReferencia1() {
        return campoReferencia1;
    }

    public void setCampoReferencia1(TextArea component) {
        this.campoReferencia1 = component;
    }

    private StaticText campoReferencia1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoReferencia1Texto1() {
        return campoReferencia1Texto1;
    }

    public void setCampoReferencia1Texto1(StaticText component) {
        this.campoReferencia1Texto1 = component;
    }

    private LengthValidator validatorReferencia1 = new LengthValidator();
  
    public LengthValidator getValidatorReferencia1() {
        return validatorReferencia1;
    }
  
    public void setValidatorReferencia1(LengthValidator validator) {
        this.validatorReferencia1 = validator;
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

    private ObjecionElePenCachedRowSetDataProvider2 objecionElePenDataProvider = new ObjecionElePenCachedRowSetDataProvider2();

    @Override
    public ObjecionElePenCachedRowSetDataProvider2 getObjecionElePenDataProvider() {
        return objecionElePenDataProvider;
    }

    public void setObjecionElePenDataProvider(ObjecionElePenCachedRowSetDataProvider2 crsdp) {
        this.objecionElePenDataProvider = crsdp;
    }

    private PersonaCachedRowSetDataProvider2 personaReferenceDataProvider = new PersonaCachedRowSetDataProvider2();

    @Override
    public PersonaCachedRowSetDataProvider2 getPersonaReferenceDataProvider() {
        return personaReferenceDataProvider;
    }

    public void setPersonaReferenceDataProvider(PersonaCachedRowSetDataProvider2 crsdp) {
        this.personaReferenceDataProvider = crsdp;
    }

    private ProveedorDatExtCachedRowSetDataProvider2 proveedorDatExtReferenceDataProvider = new ProveedorDatExtCachedRowSetDataProvider2();

    @Override
    public ProveedorDatExtCachedRowSetDataProvider2 getProveedorDatExtReferenceDataProvider() {
        return proveedorDatExtReferenceDataProvider;
    }

    public void setProveedorDatExtReferenceDataProvider(ProveedorDatExtCachedRowSetDataProvider2 crsdp) {
        this.proveedorDatExtReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public ObjecionElePen5() {
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
        objecionElePenDataProvider.close();
        personaReferenceDataProvider.close();
        proveedorDatExtReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionObjecionElePen...">
    @Override
    public TextField getTextFieldCampoFechaUltimaActualizacion1() {
        return this.getCampoFechaUltimaActualizacion1();
    }

    @Override
    public TextField getTextFieldCampoFechaAnulacion1() {
        return this.getCampoFechaAnulacion1();
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
    private AsistentePaginaActualizacionObjecionElePen asistente = new AsistentePaginaActualizacionObjecionElePen(this);

    public AsistentePaginaActualizacionObjecionElePen getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("ObjecionElePen5_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("ObjecionElePen5_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("ObjecionElePen5_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getObjecionElePenDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return ObjecionElePenCachedRowSetDataProvider2.FUNCION_CONSULTAR_OBJECION_ELE_PEN;
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
            this.getObjecionElePenDataProvider().consultarObjecionElePen(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getObjecionElePenDataProvider().consultarObjecionElePen(filtro);
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
    public void campoIdPersona1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdPersona1_validate(context, component, value);
    }

    public void campoIdProveedorDatExt1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdProveedorDatExt1_validate(context, component, value);
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
        String urx = URX2.COMANDO_OBJECION_ELE_PEN;
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
    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
