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

import com.egt.data.general.xdp3.OpcionMenuCachedRowSetDataProvider3;
import com.egt.data.general.xdp2.AplicacionCachedRowSetDataProvider2;
import com.egt.data.general.xdp2.PaginaCachedRowSetDataProvider2;
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

public class OpcionMenu1 extends AbstractPageBean
        implements PaginaActualizacionOpcionMenu, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdOpcionMenu1.setMinimum(0L);
        validatorIdOpcionMenu1.setMaximum(1000000000000000000L);
        validatorCodigoOpcionMenu1.setMaximum(30);
        validatorNombreOpcionMenu1.setMaximum(100);
        validatorDescripcionOpcionMenu1.setMaximum(8160);
        validatorUrlOpcionMenu1.setMaximum(8160);
        opcionMenuDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.opcionMenuRowSet}"));
        aplicacionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.aplicacionReferenceRowSet}"));
        paginaReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.paginaReferenceRowSet}"));
        opcionMenuReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.opcionMenuReferenceRowSet}"));
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

    private TableColumn tableColumnIdOpcionMenu1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdOpcionMenu1() {
        return tableColumnIdOpcionMenu1;
    }

    public void setTableColumnIdOpcionMenu1(TableColumn component) {
        this.tableColumnIdOpcionMenu1 = component;
    }

    private Label labelIdOpcionMenu1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdOpcionMenu1() {
        return labelIdOpcionMenu1;
    }

    public void setLabelIdOpcionMenu1(Label l) {
        this.labelIdOpcionMenu1 = l;
    }

    private TextField campoIdOpcionMenu1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdOpcionMenu1() {
        return campoIdOpcionMenu1;
    }

    public void setCampoIdOpcionMenu1(TextField component) {
        this.campoIdOpcionMenu1 = component;
    }

    private StaticText campoIdOpcionMenu1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdOpcionMenu1Texto1() {
        return campoIdOpcionMenu1Texto1;
    }

    public void setCampoIdOpcionMenu1Texto1(StaticText component) {
        this.campoIdOpcionMenu1Texto1 = component;
    }

    private LongConverter converterIdOpcionMenu1 = new LongConverter();
  
    public LongConverter getConverterIdOpcionMenu1() {
        return converterIdOpcionMenu1;
    }
  
    public void setConverterIdOpcionMenu1(LongConverter converter) {
        this.converterIdOpcionMenu1 = converter;
    }
  
    private LongRangeValidator validatorIdOpcionMenu1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdOpcionMenu1() {
        return validatorIdOpcionMenu1;
    }
  
    public void setValidatorIdOpcionMenu1(LongRangeValidator validator) {
        this.validatorIdOpcionMenu1 = validator;
    }
  
    private TableColumn tableColumnCodigoOpcionMenu1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCodigoOpcionMenu1() {
        return tableColumnCodigoOpcionMenu1;
    }

    public void setTableColumnCodigoOpcionMenu1(TableColumn component) {
        this.tableColumnCodigoOpcionMenu1 = component;
    }

    private Label labelCodigoOpcionMenu1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoOpcionMenu1() {
        return labelCodigoOpcionMenu1;
    }

    public void setLabelCodigoOpcionMenu1(Label l) {
        this.labelCodigoOpcionMenu1 = l;
    }

    private TextField campoCodigoOpcionMenu1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoOpcionMenu1() {
        return campoCodigoOpcionMenu1;
    }

    public void setCampoCodigoOpcionMenu1(TextField component) {
        this.campoCodigoOpcionMenu1 = component;
    }

    private StaticText campoCodigoOpcionMenu1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoOpcionMenu1Texto1() {
        return campoCodigoOpcionMenu1Texto1;
    }

    public void setCampoCodigoOpcionMenu1Texto1(StaticText component) {
        this.campoCodigoOpcionMenu1Texto1 = component;
    }

    private LengthValidator validatorCodigoOpcionMenu1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoOpcionMenu1() {
        return validatorCodigoOpcionMenu1;
    }
  
    public void setValidatorCodigoOpcionMenu1(LengthValidator validator) {
        this.validatorCodigoOpcionMenu1 = validator;
    }
  
    private TableColumn tableColumnNombreOpcionMenu1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreOpcionMenu1() {
        return tableColumnNombreOpcionMenu1;
    }

    public void setTableColumnNombreOpcionMenu1(TableColumn component) {
        this.tableColumnNombreOpcionMenu1 = component;
    }

    private Label labelNombreOpcionMenu1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreOpcionMenu1() {
        return labelNombreOpcionMenu1;
    }

    public void setLabelNombreOpcionMenu1(Label l) {
        this.labelNombreOpcionMenu1 = l;
    }

    private TextField campoNombreOpcionMenu1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreOpcionMenu1() {
        return campoNombreOpcionMenu1;
    }

    public void setCampoNombreOpcionMenu1(TextField component) {
        this.campoNombreOpcionMenu1 = component;
    }

    private StaticText campoNombreOpcionMenu1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreOpcionMenu1Texto1() {
        return campoNombreOpcionMenu1Texto1;
    }

    public void setCampoNombreOpcionMenu1Texto1(StaticText component) {
        this.campoNombreOpcionMenu1Texto1 = component;
    }

    private LengthValidator validatorNombreOpcionMenu1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreOpcionMenu1() {
        return validatorNombreOpcionMenu1;
    }
  
    public void setValidatorNombreOpcionMenu1(LengthValidator validator) {
        this.validatorNombreOpcionMenu1 = validator;
    }
  
    private TableColumn tableColumnDescripcionOpcionMenu1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnDescripcionOpcionMenu1() {
        return tableColumnDescripcionOpcionMenu1;
    }

    public void setTableColumnDescripcionOpcionMenu1(TableColumn component) {
        this.tableColumnDescripcionOpcionMenu1 = component;
    }

    private Label labelDescripcionOpcionMenu1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDescripcionOpcionMenu1() {
        return labelDescripcionOpcionMenu1;
    }

    public void setLabelDescripcionOpcionMenu1(Label l) {
        this.labelDescripcionOpcionMenu1 = l;
    }

    private TextArea campoDescripcionOpcionMenu1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDescripcionOpcionMenu1() {
        return campoDescripcionOpcionMenu1;
    }

    public void setCampoDescripcionOpcionMenu1(TextArea component) {
        this.campoDescripcionOpcionMenu1 = component;
    }

    private StaticText campoDescripcionOpcionMenu1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDescripcionOpcionMenu1Texto1() {
        return campoDescripcionOpcionMenu1Texto1;
    }

    public void setCampoDescripcionOpcionMenu1Texto1(StaticText component) {
        this.campoDescripcionOpcionMenu1Texto1 = component;
    }

    private LengthValidator validatorDescripcionOpcionMenu1 = new LengthValidator();
  
    public LengthValidator getValidatorDescripcionOpcionMenu1() {
        return validatorDescripcionOpcionMenu1;
    }
  
    public void setValidatorDescripcionOpcionMenu1(LengthValidator validator) {
        this.validatorDescripcionOpcionMenu1 = validator;
    }
  
    private TableColumn tableColumnUrlOpcionMenu1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnUrlOpcionMenu1() {
        return tableColumnUrlOpcionMenu1;
    }

    public void setTableColumnUrlOpcionMenu1(TableColumn component) {
        this.tableColumnUrlOpcionMenu1 = component;
    }

    private Label labelUrlOpcionMenu1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelUrlOpcionMenu1() {
        return labelUrlOpcionMenu1;
    }

    public void setLabelUrlOpcionMenu1(Label l) {
        this.labelUrlOpcionMenu1 = l;
    }

    private TextArea campoUrlOpcionMenu1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoUrlOpcionMenu1() {
        return campoUrlOpcionMenu1;
    }

    public void setCampoUrlOpcionMenu1(TextArea component) {
        this.campoUrlOpcionMenu1 = component;
    }

    private StaticText campoUrlOpcionMenu1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoUrlOpcionMenu1Texto1() {
        return campoUrlOpcionMenu1Texto1;
    }

    public void setCampoUrlOpcionMenu1Texto1(StaticText component) {
        this.campoUrlOpcionMenu1Texto1 = component;
    }

    private LengthValidator validatorUrlOpcionMenu1 = new LengthValidator();
  
    public LengthValidator getValidatorUrlOpcionMenu1() {
        return validatorUrlOpcionMenu1;
    }
  
    public void setValidatorUrlOpcionMenu1(LengthValidator validator) {
        this.validatorUrlOpcionMenu1 = validator;
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

    private Button campoIdPagina1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdPagina1Boton1() {
        return campoIdPagina1Boton1;
    }

    public void setCampoIdPagina1Boton1(Button component) {
        this.campoIdPagina1Boton1 = component;
    }

    private Button campoIdPagina1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPagina1Boton3() {
        return campoIdPagina1Boton3;
    }

    public void setCampoIdPagina1Boton3(Button component) {
        this.campoIdPagina1Boton3 = component;
    }

    private TableColumn tableColumnIdPagina2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdPagina2() {
        return tableColumnIdPagina2;
    }

    public void setTableColumnIdPagina2(TableColumn component) {
        this.tableColumnIdPagina2 = component;
    }

    private Label labelIdPagina2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPagina2() {
        return labelIdPagina2;
    }

    public void setLabelIdPagina2(Label l) {
        this.labelIdPagina2 = l;
    }

    private ImageHyperlink campoIdPagina1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdPagina1Hiper1() {
        return campoIdPagina1Hiper1;
    }

    public void setCampoIdPagina1Hiper1(ImageHyperlink component) {
        this.campoIdPagina1Hiper1 = component;
    }

    private TableColumn tableColumnIdOpcionMenuSuperior1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdOpcionMenuSuperior1() {
        return tableColumnIdOpcionMenuSuperior1;
    }

    public void setTableColumnIdOpcionMenuSuperior1(TableColumn component) {
        this.tableColumnIdOpcionMenuSuperior1 = component;
    }

    private Label labelIdOpcionMenuSuperior1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdOpcionMenuSuperior1() {
        return labelIdOpcionMenuSuperior1;
    }

    public void setLabelIdOpcionMenuSuperior1(Label l) {
        this.labelIdOpcionMenuSuperior1 = l;
    }

    private TextField campoIdOpcionMenuSuperior1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdOpcionMenuSuperior1() {
        return campoIdOpcionMenuSuperior1;
    }

    public void setCampoIdOpcionMenuSuperior1(TextField component) {
        this.campoIdOpcionMenuSuperior1 = component;
    }

    private StaticText campoIdOpcionMenuSuperior1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdOpcionMenuSuperior1Texto1() {
        return campoIdOpcionMenuSuperior1Texto1;
    }

    public void setCampoIdOpcionMenuSuperior1Texto1(StaticText component) {
        this.campoIdOpcionMenuSuperior1Texto1 = component;
    }

    private Button campoIdOpcionMenuSuperior1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdOpcionMenuSuperior1Boton1() {
        return campoIdOpcionMenuSuperior1Boton1;
    }

    public void setCampoIdOpcionMenuSuperior1Boton1(Button component) {
        this.campoIdOpcionMenuSuperior1Boton1 = component;
    }

    private Button campoIdOpcionMenuSuperior1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdOpcionMenuSuperior1Boton3() {
        return campoIdOpcionMenuSuperior1Boton3;
    }

    public void setCampoIdOpcionMenuSuperior1Boton3(Button component) {
        this.campoIdOpcionMenuSuperior1Boton3 = component;
    }

    private TableColumn tableColumnIdOpcionMenuSuperior2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdOpcionMenuSuperior2() {
        return tableColumnIdOpcionMenuSuperior2;
    }

    public void setTableColumnIdOpcionMenuSuperior2(TableColumn component) {
        this.tableColumnIdOpcionMenuSuperior2 = component;
    }

    private Label labelIdOpcionMenuSuperior2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdOpcionMenuSuperior2() {
        return labelIdOpcionMenuSuperior2;
    }

    public void setLabelIdOpcionMenuSuperior2(Label l) {
        this.labelIdOpcionMenuSuperior2 = l;
    }

    private ImageHyperlink campoIdOpcionMenuSuperior1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdOpcionMenuSuperior1Hiper1() {
        return campoIdOpcionMenuSuperior1Hiper1;
    }

    public void setCampoIdOpcionMenuSuperior1Hiper1(ImageHyperlink component) {
        this.campoIdOpcionMenuSuperior1Hiper1 = component;
    }

    private TableColumn tableColumnEsOpcionMenuInactiva1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsOpcionMenuInactiva1() {
        return tableColumnEsOpcionMenuInactiva1;
    }

    public void setTableColumnEsOpcionMenuInactiva1(TableColumn component) {
        this.tableColumnEsOpcionMenuInactiva1 = component;
    }

    private Label labelEsOpcionMenuInactiva1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsOpcionMenuInactiva1() {
        return labelEsOpcionMenuInactiva1;
    }

    public void setLabelEsOpcionMenuInactiva1(Label l) {
        this.labelEsOpcionMenuInactiva1 = l;
    }

    private DropDown listaEsOpcionMenuInactiva1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsOpcionMenuInactiva1() {
        return listaEsOpcionMenuInactiva1;
    }

    public void setListaEsOpcionMenuInactiva1(DropDown component) {
        this.listaEsOpcionMenuInactiva1 = component;
    }

    private StaticText listaEsOpcionMenuInactiva1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsOpcionMenuInactiva1Texto1() {
        return listaEsOpcionMenuInactiva1Texto1;
    }

    public void setListaEsOpcionMenuInactiva1Texto1(StaticText component) {
        this.listaEsOpcionMenuInactiva1Texto1 = component;
    }

    private IntegerConverter converterEsOpcionMenuInactiva1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsOpcionMenuInactiva1() {
        return converterEsOpcionMenuInactiva1;
    }
  
    public void setConverterEsOpcionMenuInactiva1(IntegerConverter converter) {
        this.converterEsOpcionMenuInactiva1 = converter;
    }
  
    private TableColumn tableColumnEsOpcionMenuSincronizada1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsOpcionMenuSincronizada1() {
        return tableColumnEsOpcionMenuSincronizada1;
    }

    public void setTableColumnEsOpcionMenuSincronizada1(TableColumn component) {
        this.tableColumnEsOpcionMenuSincronizada1 = component;
    }

    private Label labelEsOpcionMenuSincronizada1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsOpcionMenuSincronizada1() {
        return labelEsOpcionMenuSincronizada1;
    }

    public void setLabelEsOpcionMenuSincronizada1(Label l) {
        this.labelEsOpcionMenuSincronizada1 = l;
    }

    private DropDown listaEsOpcionMenuSincronizada1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsOpcionMenuSincronizada1() {
        return listaEsOpcionMenuSincronizada1;
    }

    public void setListaEsOpcionMenuSincronizada1(DropDown component) {
        this.listaEsOpcionMenuSincronizada1 = component;
    }

    private StaticText listaEsOpcionMenuSincronizada1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsOpcionMenuSincronizada1Texto1() {
        return listaEsOpcionMenuSincronizada1Texto1;
    }

    public void setListaEsOpcionMenuSincronizada1Texto1(StaticText component) {
        this.listaEsOpcionMenuSincronizada1Texto1 = component;
    }

    private IntegerConverter converterEsOpcionMenuSincronizada1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsOpcionMenuSincronizada1() {
        return converterEsOpcionMenuSincronizada1;
    }
  
    public void setConverterEsOpcionMenuSincronizada1(IntegerConverter converter) {
        this.converterEsOpcionMenuSincronizada1 = converter;
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

    private OpcionMenuCachedRowSetDataProvider3 opcionMenuDataProvider = new OpcionMenuCachedRowSetDataProvider3();

    @Override
    public OpcionMenuCachedRowSetDataProvider3 getOpcionMenuDataProvider() {
        return opcionMenuDataProvider;
    }

    public void setOpcionMenuDataProvider(OpcionMenuCachedRowSetDataProvider3 crsdp) {
        this.opcionMenuDataProvider = crsdp;
    }

    private AplicacionCachedRowSetDataProvider2 aplicacionReferenceDataProvider = new AplicacionCachedRowSetDataProvider2();

    @Override
    public AplicacionCachedRowSetDataProvider2 getAplicacionReferenceDataProvider() {
        return aplicacionReferenceDataProvider;
    }

    public void setAplicacionReferenceDataProvider(AplicacionCachedRowSetDataProvider2 crsdp) {
        this.aplicacionReferenceDataProvider = crsdp;
    }

    private PaginaCachedRowSetDataProvider2 paginaReferenceDataProvider = new PaginaCachedRowSetDataProvider2();

    @Override
    public PaginaCachedRowSetDataProvider2 getPaginaReferenceDataProvider() {
        return paginaReferenceDataProvider;
    }

    public void setPaginaReferenceDataProvider(PaginaCachedRowSetDataProvider2 crsdp) {
        this.paginaReferenceDataProvider = crsdp;
    }

    private OpcionMenuCachedRowSetDataProvider3 opcionMenuReferenceDataProvider = new OpcionMenuCachedRowSetDataProvider3();

    @Override
    public OpcionMenuCachedRowSetDataProvider3 getOpcionMenuReferenceDataProvider() {
        return opcionMenuReferenceDataProvider;
    }

    public void setOpcionMenuReferenceDataProvider(OpcionMenuCachedRowSetDataProvider3 crsdp) {
        this.opcionMenuReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public OpcionMenu1() {
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
        opcionMenuDataProvider.close();
        aplicacionReferenceDataProvider.close();
        paginaReferenceDataProvider.close();
        opcionMenuReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionOpcionMenu...">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion con tabla">
    private GestorPaginaActualizacionConTabla gestor = new GestorPaginaActualizacionConTabla(this);

    @Override
    public GestorPaginaActualizacionConTabla getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionOpcionMenu asistente = new AsistentePaginaActualizacionOpcionMenu(this);

    public AsistentePaginaActualizacionOpcionMenu getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("OpcionMenu1_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("OpcionMenu1_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("OpcionMenu1_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getOpcionMenuDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return OpcionMenuCachedRowSetDataProvider3.FUNCION_CONSULTAR_OPCION_MENU;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return OpcionMenuCachedRowSetDataProvider3.FUNCION_CREAR_OPCION_MENU;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return OpcionMenuCachedRowSetDataProvider3.FUNCION_MODIFICAR_OPCION_MENU;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return OpcionMenuCachedRowSetDataProvider3.FUNCION_ELIMINAR_OPCION_MENU;
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
            this.getOpcionMenuDataProvider().consultarOpcionMenu(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getOpcionMenuDataProvider().consultarOpcionMenu(filtro);
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

    public void campoIdPagina1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdPagina1_validate(context, component, value);
    }

    public void campoIdOpcionMenuSuperior1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdOpcionMenuSuperior1_validate(context, component, value);
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
