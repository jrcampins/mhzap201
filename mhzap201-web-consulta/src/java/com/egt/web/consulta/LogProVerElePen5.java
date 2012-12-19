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

import com.egt.data.specific.xdp2.LogProVerElePenCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
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

public class LogProVerElePen5 extends AbstractPageBean
        implements PaginaActualizacionLogProVerElePen, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdLogProVerElePen1.setMinimum(0L);
        validatorIdLogProVerElePen1.setMaximum(1000000000000000000L);
        validatorCodigoPersona1.setMaximum(30);
        validatorNombrePersona1.setMaximum(100);
        converterIndiceCalidadVida1.setMinIntegerDigits(1);
        converterIndiceCalidadVida1.setMaxIntegerDigits(40);
        converterIndiceCalidadVida1.setMaxFractionDigits(3);
        validatorIndiceCalidadVida1.setMinimum(0.0);
        validatorIndiceCalidadVida1.setMaximum(1.0E2);
        validatorObservacion1.setMaximum(8160);
        converterFechaHoraTransaccion1.setPattern("dd/MM/yyyy hh:mm aa");
        converterFechaHoraTransaccion1.setType("both");
        logProVerElePenDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.logProVerElePenRowSet}"));
        personaReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.personaReferenceRowSet}"));
        ubicacionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.ubicacionReferenceRowSet}"));
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

    private TableColumn tableColumnIdLogProVerElePen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdLogProVerElePen1() {
        return tableColumnIdLogProVerElePen1;
    }

    public void setTableColumnIdLogProVerElePen1(TableColumn component) {
        this.tableColumnIdLogProVerElePen1 = component;
    }

    private Label labelIdLogProVerElePen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdLogProVerElePen1() {
        return labelIdLogProVerElePen1;
    }

    public void setLabelIdLogProVerElePen1(Label l) {
        this.labelIdLogProVerElePen1 = l;
    }

    private TextField campoIdLogProVerElePen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdLogProVerElePen1() {
        return campoIdLogProVerElePen1;
    }

    public void setCampoIdLogProVerElePen1(TextField component) {
        this.campoIdLogProVerElePen1 = component;
    }

    private StaticText campoIdLogProVerElePen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdLogProVerElePen1Texto1() {
        return campoIdLogProVerElePen1Texto1;
    }

    public void setCampoIdLogProVerElePen1Texto1(StaticText component) {
        this.campoIdLogProVerElePen1Texto1 = component;
    }

    private LongConverter converterIdLogProVerElePen1 = new LongConverter();
  
    public LongConverter getConverterIdLogProVerElePen1() {
        return converterIdLogProVerElePen1;
    }
  
    public void setConverterIdLogProVerElePen1(LongConverter converter) {
        this.converterIdLogProVerElePen1 = converter;
    }
  
    private LongRangeValidator validatorIdLogProVerElePen1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdLogProVerElePen1() {
        return validatorIdLogProVerElePen1;
    }
  
    public void setValidatorIdLogProVerElePen1(LongRangeValidator validator) {
        this.validatorIdLogProVerElePen1 = validator;
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

    private TableColumn tableColumnCodigoPersona1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCodigoPersona1() {
        return tableColumnCodigoPersona1;
    }

    public void setTableColumnCodigoPersona1(TableColumn component) {
        this.tableColumnCodigoPersona1 = component;
    }

    private Label labelCodigoPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoPersona1() {
        return labelCodigoPersona1;
    }

    public void setLabelCodigoPersona1(Label l) {
        this.labelCodigoPersona1 = l;
    }

    private TextField campoCodigoPersona1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoPersona1() {
        return campoCodigoPersona1;
    }

    public void setCampoCodigoPersona1(TextField component) {
        this.campoCodigoPersona1 = component;
    }

    private StaticText campoCodigoPersona1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoPersona1Texto1() {
        return campoCodigoPersona1Texto1;
    }

    public void setCampoCodigoPersona1Texto1(StaticText component) {
        this.campoCodigoPersona1Texto1 = component;
    }

    private LengthValidator validatorCodigoPersona1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoPersona1() {
        return validatorCodigoPersona1;
    }
  
    public void setValidatorCodigoPersona1(LengthValidator validator) {
        this.validatorCodigoPersona1 = validator;
    }
  
    private TableColumn tableColumnNombrePersona1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombrePersona1() {
        return tableColumnNombrePersona1;
    }

    public void setTableColumnNombrePersona1(TableColumn component) {
        this.tableColumnNombrePersona1 = component;
    }

    private Label labelNombrePersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombrePersona1() {
        return labelNombrePersona1;
    }

    public void setLabelNombrePersona1(Label l) {
        this.labelNombrePersona1 = l;
    }

    private TextField campoNombrePersona1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombrePersona1() {
        return campoNombrePersona1;
    }

    public void setCampoNombrePersona1(TextField component) {
        this.campoNombrePersona1 = component;
    }

    private StaticText campoNombrePersona1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombrePersona1Texto1() {
        return campoNombrePersona1Texto1;
    }

    public void setCampoNombrePersona1Texto1(StaticText component) {
        this.campoNombrePersona1Texto1 = component;
    }

    private LengthValidator validatorNombrePersona1 = new LengthValidator();
  
    public LengthValidator getValidatorNombrePersona1() {
        return validatorNombrePersona1;
    }
  
    public void setValidatorNombrePersona1(LengthValidator validator) {
        this.validatorNombrePersona1 = validator;
    }
  
    private TableColumn tableColumnIdDepartamento1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdDepartamento1() {
        return tableColumnIdDepartamento1;
    }

    public void setTableColumnIdDepartamento1(TableColumn component) {
        this.tableColumnIdDepartamento1 = component;
    }

    private Label labelIdDepartamento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamento1() {
        return labelIdDepartamento1;
    }

    public void setLabelIdDepartamento1(Label l) {
        this.labelIdDepartamento1 = l;
    }

    private TextField campoIdDepartamento1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdDepartamento1() {
        return campoIdDepartamento1;
    }

    public void setCampoIdDepartamento1(TextField component) {
        this.campoIdDepartamento1 = component;
    }

    private StaticText campoIdDepartamento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDepartamento1Texto1() {
        return campoIdDepartamento1Texto1;
    }

    public void setCampoIdDepartamento1Texto1(StaticText component) {
        this.campoIdDepartamento1Texto1 = component;
    }

    private Button campoIdDepartamento1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDepartamento1Boton1() {
        return campoIdDepartamento1Boton1;
    }

    public void setCampoIdDepartamento1Boton1(Button component) {
        this.campoIdDepartamento1Boton1 = component;
    }

    private Button campoIdDepartamento1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDepartamento1Boton3() {
        return campoIdDepartamento1Boton3;
    }

    public void setCampoIdDepartamento1Boton3(Button component) {
        this.campoIdDepartamento1Boton3 = component;
    }

    private TableColumn tableColumnIdDepartamento2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdDepartamento2() {
        return tableColumnIdDepartamento2;
    }

    public void setTableColumnIdDepartamento2(TableColumn component) {
        this.tableColumnIdDepartamento2 = component;
    }

    private Label labelIdDepartamento2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamento2() {
        return labelIdDepartamento2;
    }

    public void setLabelIdDepartamento2(Label l) {
        this.labelIdDepartamento2 = l;
    }

    private ImageHyperlink campoIdDepartamento1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdDepartamento1Hiper1() {
        return campoIdDepartamento1Hiper1;
    }

    public void setCampoIdDepartamento1Hiper1(ImageHyperlink component) {
        this.campoIdDepartamento1Hiper1 = component;
    }

    private TableColumn tableColumnIdDistrito1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdDistrito1() {
        return tableColumnIdDistrito1;
    }

    public void setTableColumnIdDistrito1(TableColumn component) {
        this.tableColumnIdDistrito1 = component;
    }

    private Label labelIdDistrito1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDistrito1() {
        return labelIdDistrito1;
    }

    public void setLabelIdDistrito1(Label l) {
        this.labelIdDistrito1 = l;
    }

    private TextField campoIdDistrito1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdDistrito1() {
        return campoIdDistrito1;
    }

    public void setCampoIdDistrito1(TextField component) {
        this.campoIdDistrito1 = component;
    }

    private StaticText campoIdDistrito1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDistrito1Texto1() {
        return campoIdDistrito1Texto1;
    }

    public void setCampoIdDistrito1Texto1(StaticText component) {
        this.campoIdDistrito1Texto1 = component;
    }

    private Button campoIdDistrito1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDistrito1Boton1() {
        return campoIdDistrito1Boton1;
    }

    public void setCampoIdDistrito1Boton1(Button component) {
        this.campoIdDistrito1Boton1 = component;
    }

    private Button campoIdDistrito1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDistrito1Boton3() {
        return campoIdDistrito1Boton3;
    }

    public void setCampoIdDistrito1Boton3(Button component) {
        this.campoIdDistrito1Boton3 = component;
    }

    private TableColumn tableColumnIdDistrito2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdDistrito2() {
        return tableColumnIdDistrito2;
    }

    public void setTableColumnIdDistrito2(TableColumn component) {
        this.tableColumnIdDistrito2 = component;
    }

    private Label labelIdDistrito2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDistrito2() {
        return labelIdDistrito2;
    }

    public void setLabelIdDistrito2(Label l) {
        this.labelIdDistrito2 = l;
    }

    private ImageHyperlink campoIdDistrito1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdDistrito1Hiper1() {
        return campoIdDistrito1Hiper1;
    }

    public void setCampoIdDistrito1Hiper1(ImageHyperlink component) {
        this.campoIdDistrito1Hiper1 = component;
    }

    private TableColumn tableColumnIdBarrio1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdBarrio1() {
        return tableColumnIdBarrio1;
    }

    public void setTableColumnIdBarrio1(TableColumn component) {
        this.tableColumnIdBarrio1 = component;
    }

    private Label labelIdBarrio1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdBarrio1() {
        return labelIdBarrio1;
    }

    public void setLabelIdBarrio1(Label l) {
        this.labelIdBarrio1 = l;
    }

    private TextField campoIdBarrio1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdBarrio1() {
        return campoIdBarrio1;
    }

    public void setCampoIdBarrio1(TextField component) {
        this.campoIdBarrio1 = component;
    }

    private StaticText campoIdBarrio1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdBarrio1Texto1() {
        return campoIdBarrio1Texto1;
    }

    public void setCampoIdBarrio1Texto1(StaticText component) {
        this.campoIdBarrio1Texto1 = component;
    }

    private Button campoIdBarrio1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdBarrio1Boton1() {
        return campoIdBarrio1Boton1;
    }

    public void setCampoIdBarrio1Boton1(Button component) {
        this.campoIdBarrio1Boton1 = component;
    }

    private Button campoIdBarrio1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdBarrio1Boton3() {
        return campoIdBarrio1Boton3;
    }

    public void setCampoIdBarrio1Boton3(Button component) {
        this.campoIdBarrio1Boton3 = component;
    }

    private TableColumn tableColumnIdBarrio2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdBarrio2() {
        return tableColumnIdBarrio2;
    }

    public void setTableColumnIdBarrio2(TableColumn component) {
        this.tableColumnIdBarrio2 = component;
    }

    private Label labelIdBarrio2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdBarrio2() {
        return labelIdBarrio2;
    }

    public void setLabelIdBarrio2(Label l) {
        this.labelIdBarrio2 = l;
    }

    private ImageHyperlink campoIdBarrio1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdBarrio1Hiper1() {
        return campoIdBarrio1Hiper1;
    }

    public void setCampoIdBarrio1Hiper1(ImageHyperlink component) {
        this.campoIdBarrio1Hiper1 = component;
    }

    private TableColumn tableColumnIndiceCalidadVida1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIndiceCalidadVida1() {
        return tableColumnIndiceCalidadVida1;
    }

    public void setTableColumnIndiceCalidadVida1(TableColumn component) {
        this.tableColumnIndiceCalidadVida1 = component;
    }

    private Label labelIndiceCalidadVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIndiceCalidadVida1() {
        return labelIndiceCalidadVida1;
    }

    public void setLabelIndiceCalidadVida1(Label l) {
        this.labelIndiceCalidadVida1 = l;
    }

    private TextField campoIndiceCalidadVida1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIndiceCalidadVida1() {
        return campoIndiceCalidadVida1;
    }

    public void setCampoIndiceCalidadVida1(TextField component) {
        this.campoIndiceCalidadVida1 = component;
    }

    private StaticText campoIndiceCalidadVida1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIndiceCalidadVida1Texto1() {
        return campoIndiceCalidadVida1Texto1;
    }

    public void setCampoIndiceCalidadVida1Texto1(StaticText component) {
        this.campoIndiceCalidadVida1Texto1 = component;
    }

    private NumberConverter converterIndiceCalidadVida1 = new NumberConverter();
  
    public NumberConverter getConverterIndiceCalidadVida1() {
        return converterIndiceCalidadVida1;
    }
  
    public void setConverterIndiceCalidadVida1(NumberConverter converter) {
        this.converterIndiceCalidadVida1 = converter;
    }
  
    private DoubleRangeValidator validatorIndiceCalidadVida1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorIndiceCalidadVida1() {
        return validatorIndiceCalidadVida1;
    }
  
    public void setValidatorIndiceCalidadVida1(DoubleRangeValidator validator) {
        this.validatorIndiceCalidadVida1 = validator;
    }
  
    private TableColumn tableColumnNumeroCondicionPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroCondicionPension1() {
        return tableColumnNumeroCondicionPension1;
    }

    public void setTableColumnNumeroCondicionPension1(TableColumn component) {
        this.tableColumnNumeroCondicionPension1 = component;
    }

    private Label labelNumeroCondicionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionPension1() {
        return labelNumeroCondicionPension1;
    }

    public void setLabelNumeroCondicionPension1(Label l) {
        this.labelNumeroCondicionPension1 = l;
    }

    private DropDown listaNumeroCondicionPension1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroCondicionPension1() {
        return listaNumeroCondicionPension1;
    }

    public void setListaNumeroCondicionPension1(DropDown component) {
        this.listaNumeroCondicionPension1 = component;
    }

    private StaticText listaNumeroCondicionPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCondicionPension1Texto1() {
        return listaNumeroCondicionPension1Texto1;
    }

    public void setListaNumeroCondicionPension1Texto1(StaticText component) {
        this.listaNumeroCondicionPension1Texto1 = component;
    }

    private IntegerConverter converterNumeroCondicionPension1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCondicionPension1() {
        return converterNumeroCondicionPension1;
    }
  
    public void setConverterNumeroCondicionPension1(IntegerConverter converter) {
        this.converterNumeroCondicionPension1 = converter;
    }
  
    private TableColumn tableColumnNumeroCondicionDenuPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroCondicionDenuPen1() {
        return tableColumnNumeroCondicionDenuPen1;
    }

    public void setTableColumnNumeroCondicionDenuPen1(TableColumn component) {
        this.tableColumnNumeroCondicionDenuPen1 = component;
    }

    private Label labelNumeroCondicionDenuPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionDenuPen1() {
        return labelNumeroCondicionDenuPen1;
    }

    public void setLabelNumeroCondicionDenuPen1(Label l) {
        this.labelNumeroCondicionDenuPen1 = l;
    }

    private DropDown listaNumeroCondicionDenuPen1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroCondicionDenuPen1() {
        return listaNumeroCondicionDenuPen1;
    }

    public void setListaNumeroCondicionDenuPen1(DropDown component) {
        this.listaNumeroCondicionDenuPen1 = component;
    }

    private StaticText listaNumeroCondicionDenuPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCondicionDenuPen1Texto1() {
        return listaNumeroCondicionDenuPen1Texto1;
    }

    public void setListaNumeroCondicionDenuPen1Texto1(StaticText component) {
        this.listaNumeroCondicionDenuPen1Texto1 = component;
    }

    private IntegerConverter converterNumeroCondicionDenuPen1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCondicionDenuPen1() {
        return converterNumeroCondicionDenuPen1;
    }
  
    public void setConverterNumeroCondicionDenuPen1(IntegerConverter converter) {
        this.converterNumeroCondicionDenuPen1 = converter;
    }
  
    private TableColumn tableColumnNumeroCondicionRecoPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroCondicionRecoPen1() {
        return tableColumnNumeroCondicionRecoPen1;
    }

    public void setTableColumnNumeroCondicionRecoPen1(TableColumn component) {
        this.tableColumnNumeroCondicionRecoPen1 = component;
    }

    private Label labelNumeroCondicionRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionRecoPen1() {
        return labelNumeroCondicionRecoPen1;
    }

    public void setLabelNumeroCondicionRecoPen1(Label l) {
        this.labelNumeroCondicionRecoPen1 = l;
    }

    private DropDown listaNumeroCondicionRecoPen1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroCondicionRecoPen1() {
        return listaNumeroCondicionRecoPen1;
    }

    public void setListaNumeroCondicionRecoPen1(DropDown component) {
        this.listaNumeroCondicionRecoPen1 = component;
    }

    private StaticText listaNumeroCondicionRecoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCondicionRecoPen1Texto1() {
        return listaNumeroCondicionRecoPen1Texto1;
    }

    public void setListaNumeroCondicionRecoPen1Texto1(StaticText component) {
        this.listaNumeroCondicionRecoPen1Texto1 = component;
    }

    private IntegerConverter converterNumeroCondicionRecoPen1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCondicionRecoPen1() {
        return converterNumeroCondicionRecoPen1;
    }
  
    public void setConverterNumeroCondicionRecoPen1(IntegerConverter converter) {
        this.converterNumeroCondicionRecoPen1 = converter;
    }
  
    private TableColumn tableColumnEsProcesado1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsProcesado1() {
        return tableColumnEsProcesado1;
    }

    public void setTableColumnEsProcesado1(TableColumn component) {
        this.tableColumnEsProcesado1 = component;
    }

    private Label labelEsProcesado1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsProcesado1() {
        return labelEsProcesado1;
    }

    public void setLabelEsProcesado1(Label l) {
        this.labelEsProcesado1 = l;
    }

    private DropDown listaEsProcesado1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsProcesado1() {
        return listaEsProcesado1;
    }

    public void setListaEsProcesado1(DropDown component) {
        this.listaEsProcesado1 = component;
    }

    private StaticText listaEsProcesado1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsProcesado1Texto1() {
        return listaEsProcesado1Texto1;
    }

    public void setListaEsProcesado1Texto1(StaticText component) {
        this.listaEsProcesado1Texto1 = component;
    }

    private IntegerConverter converterEsProcesado1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsProcesado1() {
        return converterEsProcesado1;
    }
  
    public void setConverterEsProcesado1(IntegerConverter converter) {
        this.converterEsProcesado1 = converter;
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

    private LogProVerElePenCachedRowSetDataProvider2 logProVerElePenDataProvider = new LogProVerElePenCachedRowSetDataProvider2();

    @Override
    public LogProVerElePenCachedRowSetDataProvider2 getLogProVerElePenDataProvider() {
        return logProVerElePenDataProvider;
    }

    public void setLogProVerElePenDataProvider(LogProVerElePenCachedRowSetDataProvider2 crsdp) {
        this.logProVerElePenDataProvider = crsdp;
    }

    private PersonaCachedRowSetDataProvider2 personaReferenceDataProvider = new PersonaCachedRowSetDataProvider2();

    @Override
    public PersonaCachedRowSetDataProvider2 getPersonaReferenceDataProvider() {
        return personaReferenceDataProvider;
    }

    public void setPersonaReferenceDataProvider(PersonaCachedRowSetDataProvider2 crsdp) {
        this.personaReferenceDataProvider = crsdp;
    }

    private UbicacionCachedRowSetDataProvider2 ubicacionReferenceDataProvider = new UbicacionCachedRowSetDataProvider2();

    @Override
    public UbicacionCachedRowSetDataProvider2 getUbicacionReferenceDataProvider() {
        return ubicacionReferenceDataProvider;
    }

    public void setUbicacionReferenceDataProvider(UbicacionCachedRowSetDataProvider2 crsdp) {
        this.ubicacionReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public LogProVerElePen5() {
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
        logProVerElePenDataProvider.close();
        personaReferenceDataProvider.close();
        ubicacionReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionLogProVerElePen...">
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
    private AsistentePaginaActualizacionLogProVerElePen asistente = new AsistentePaginaActualizacionLogProVerElePen(this);

    public AsistentePaginaActualizacionLogProVerElePen getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("LogProVerElePen5_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("LogProVerElePen5_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("LogProVerElePen5_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getLogProVerElePenDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return LogProVerElePenCachedRowSetDataProvider2.FUNCION_CONSULTAR_LOG_PRO_VER_ELE_PEN;
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
        converterIndiceCalidadVida1.setMinIntegerDigits(1);
        converterIndiceCalidadVida1.setMaxIntegerDigits(3);
        converterIndiceCalidadVida1.setMaxFractionDigits(4);
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
            this.getLogProVerElePenDataProvider().consultarLogProVerElePen(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getLogProVerElePenDataProvider().consultarLogProVerElePen(filtro);
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

    public void campoIdDepartamento1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdDepartamento1_validate(context, component, value);
    }

    public void campoIdDistrito1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdDistrito1_validate(context, component, value);
    }

    public void campoIdBarrio1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdBarrio1_validate(context, component, value);
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
