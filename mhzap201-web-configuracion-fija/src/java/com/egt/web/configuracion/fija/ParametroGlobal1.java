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
package com.egt.web.configuracion.fija;

import com.egt.data.specific.xdp2.ParametroGlobalCachedRowSetDataProvider2;
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

public class ParametroGlobal1 extends AbstractPageBean
        implements PaginaActualizacionParametroGlobal, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorNumeroParametroGlobal1.setMinimum(0L);
        validatorNumeroParametroGlobal1.setMaximum(1000000000L);
        converterMontoSalarioMinimo1.setMinIntegerDigits(1);
        converterMontoSalarioMinimo1.setMaxIntegerDigits(40);
        converterMontoSalarioMinimo1.setMaxFractionDigits(3);
        validatorMontoSalarioMinimo1.setMinimum(0.0);
        validatorMontoSalarioMinimo1.setMaximum(1.0E13);
        converterPorcentajePensionAlimentaria1.setMinIntegerDigits(1);
        converterPorcentajePensionAlimentaria1.setMaxIntegerDigits(40);
        converterPorcentajePensionAlimentaria1.setMaxFractionDigits(3);
        validatorPorcentajePensionAlimentaria1.setMinimum(0.0);
        validatorPorcentajePensionAlimentaria1.setMaximum(1.0E2);
        validatorMesesValidezCertificadoVida1.setMinimum(0L);
        validatorMesesValidezCertificadoVida1.setMaximum(1000000000L);
        validatorMesesUltimoCobroPension1.setMinimum(0L);
        validatorMesesUltimoCobroPension1.setMaximum(1000000000L);
        converterLimiteIndiceCalidadVida1.setMinIntegerDigits(1);
        converterLimiteIndiceCalidadVida1.setMaxIntegerDigits(40);
        converterLimiteIndiceCalidadVida1.setMaxFractionDigits(3);
        validatorLimiteIndiceCalidadVida1.setMinimum(0.0);
        validatorLimiteIndiceCalidadVida1.setMaximum(1.0E2);
        validatorLimitePensiones1.setMinimum(0L);
        validatorLimitePensiones1.setMaximum(1000000000L);
        parametroGlobalDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.parametroGlobalRowSet}"));
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

    private TableColumn tableColumnNumeroParametroGlobal1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroParametroGlobal1() {
        return tableColumnNumeroParametroGlobal1;
    }

    public void setTableColumnNumeroParametroGlobal1(TableColumn component) {
        this.tableColumnNumeroParametroGlobal1 = component;
    }

    private Label labelNumeroParametroGlobal1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroParametroGlobal1() {
        return labelNumeroParametroGlobal1;
    }

    public void setLabelNumeroParametroGlobal1(Label l) {
        this.labelNumeroParametroGlobal1 = l;
    }

    private TextField campoNumeroParametroGlobal1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroParametroGlobal1() {
        return campoNumeroParametroGlobal1;
    }

    public void setCampoNumeroParametroGlobal1(TextField component) {
        this.campoNumeroParametroGlobal1 = component;
    }

    private StaticText campoNumeroParametroGlobal1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroParametroGlobal1Texto1() {
        return campoNumeroParametroGlobal1Texto1;
    }

    public void setCampoNumeroParametroGlobal1Texto1(StaticText component) {
        this.campoNumeroParametroGlobal1Texto1 = component;
    }

    private IntegerConverter converterNumeroParametroGlobal1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroParametroGlobal1() {
        return converterNumeroParametroGlobal1;
    }
  
    public void setConverterNumeroParametroGlobal1(IntegerConverter converter) {
        this.converterNumeroParametroGlobal1 = converter;
    }
  
    private LongRangeValidator validatorNumeroParametroGlobal1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroParametroGlobal1() {
        return validatorNumeroParametroGlobal1;
    }
  
    public void setValidatorNumeroParametroGlobal1(LongRangeValidator validator) {
        this.validatorNumeroParametroGlobal1 = validator;
    }
  
    private TableColumn tableColumnMontoSalarioMinimo1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnMontoSalarioMinimo1() {
        return tableColumnMontoSalarioMinimo1;
    }

    public void setTableColumnMontoSalarioMinimo1(TableColumn component) {
        this.tableColumnMontoSalarioMinimo1 = component;
    }

    private Label labelMontoSalarioMinimo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoSalarioMinimo1() {
        return labelMontoSalarioMinimo1;
    }

    public void setLabelMontoSalarioMinimo1(Label l) {
        this.labelMontoSalarioMinimo1 = l;
    }

    private TextField campoMontoSalarioMinimo1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoMontoSalarioMinimo1() {
        return campoMontoSalarioMinimo1;
    }

    public void setCampoMontoSalarioMinimo1(TextField component) {
        this.campoMontoSalarioMinimo1 = component;
    }

    private StaticText campoMontoSalarioMinimo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoSalarioMinimo1Texto1() {
        return campoMontoSalarioMinimo1Texto1;
    }

    public void setCampoMontoSalarioMinimo1Texto1(StaticText component) {
        this.campoMontoSalarioMinimo1Texto1 = component;
    }

    private NumberConverter converterMontoSalarioMinimo1 = new NumberConverter();
  
    public NumberConverter getConverterMontoSalarioMinimo1() {
        return converterMontoSalarioMinimo1;
    }
  
    public void setConverterMontoSalarioMinimo1(NumberConverter converter) {
        this.converterMontoSalarioMinimo1 = converter;
    }
  
    private DoubleRangeValidator validatorMontoSalarioMinimo1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorMontoSalarioMinimo1() {
        return validatorMontoSalarioMinimo1;
    }
  
    public void setValidatorMontoSalarioMinimo1(DoubleRangeValidator validator) {
        this.validatorMontoSalarioMinimo1 = validator;
    }
  
    private TableColumn tableColumnPorcentajePensionAlimentaria1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnPorcentajePensionAlimentaria1() {
        return tableColumnPorcentajePensionAlimentaria1;
    }

    public void setTableColumnPorcentajePensionAlimentaria1(TableColumn component) {
        this.tableColumnPorcentajePensionAlimentaria1 = component;
    }

    private Label labelPorcentajePensionAlimentaria1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelPorcentajePensionAlimentaria1() {
        return labelPorcentajePensionAlimentaria1;
    }

    public void setLabelPorcentajePensionAlimentaria1(Label l) {
        this.labelPorcentajePensionAlimentaria1 = l;
    }

    private TextField campoPorcentajePensionAlimentaria1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoPorcentajePensionAlimentaria1() {
        return campoPorcentajePensionAlimentaria1;
    }

    public void setCampoPorcentajePensionAlimentaria1(TextField component) {
        this.campoPorcentajePensionAlimentaria1 = component;
    }

    private StaticText campoPorcentajePensionAlimentaria1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoPorcentajePensionAlimentaria1Texto1() {
        return campoPorcentajePensionAlimentaria1Texto1;
    }

    public void setCampoPorcentajePensionAlimentaria1Texto1(StaticText component) {
        this.campoPorcentajePensionAlimentaria1Texto1 = component;
    }

    private NumberConverter converterPorcentajePensionAlimentaria1 = new NumberConverter();
  
    public NumberConverter getConverterPorcentajePensionAlimentaria1() {
        return converterPorcentajePensionAlimentaria1;
    }
  
    public void setConverterPorcentajePensionAlimentaria1(NumberConverter converter) {
        this.converterPorcentajePensionAlimentaria1 = converter;
    }
  
    private DoubleRangeValidator validatorPorcentajePensionAlimentaria1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorPorcentajePensionAlimentaria1() {
        return validatorPorcentajePensionAlimentaria1;
    }
  
    public void setValidatorPorcentajePensionAlimentaria1(DoubleRangeValidator validator) {
        this.validatorPorcentajePensionAlimentaria1 = validator;
    }
  
    private TableColumn tableColumnEsControlCerVidaActivo1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsControlCerVidaActivo1() {
        return tableColumnEsControlCerVidaActivo1;
    }

    public void setTableColumnEsControlCerVidaActivo1(TableColumn component) {
        this.tableColumnEsControlCerVidaActivo1 = component;
    }

    private Label labelEsControlCerVidaActivo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsControlCerVidaActivo1() {
        return labelEsControlCerVidaActivo1;
    }

    public void setLabelEsControlCerVidaActivo1(Label l) {
        this.labelEsControlCerVidaActivo1 = l;
    }

    private DropDown listaEsControlCerVidaActivo1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsControlCerVidaActivo1() {
        return listaEsControlCerVidaActivo1;
    }

    public void setListaEsControlCerVidaActivo1(DropDown component) {
        this.listaEsControlCerVidaActivo1 = component;
    }

    private StaticText listaEsControlCerVidaActivo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsControlCerVidaActivo1Texto1() {
        return listaEsControlCerVidaActivo1Texto1;
    }

    public void setListaEsControlCerVidaActivo1Texto1(StaticText component) {
        this.listaEsControlCerVidaActivo1Texto1 = component;
    }

    private IntegerConverter converterEsControlCerVidaActivo1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsControlCerVidaActivo1() {
        return converterEsControlCerVidaActivo1;
    }
  
    public void setConverterEsControlCerVidaActivo1(IntegerConverter converter) {
        this.converterEsControlCerVidaActivo1 = converter;
    }
  
    private TableColumn tableColumnMesesValidezCertificadoVida1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnMesesValidezCertificadoVida1() {
        return tableColumnMesesValidezCertificadoVida1;
    }

    public void setTableColumnMesesValidezCertificadoVida1(TableColumn component) {
        this.tableColumnMesesValidezCertificadoVida1 = component;
    }

    private Label labelMesesValidezCertificadoVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMesesValidezCertificadoVida1() {
        return labelMesesValidezCertificadoVida1;
    }

    public void setLabelMesesValidezCertificadoVida1(Label l) {
        this.labelMesesValidezCertificadoVida1 = l;
    }

    private TextField campoMesesValidezCertificadoVida1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoMesesValidezCertificadoVida1() {
        return campoMesesValidezCertificadoVida1;
    }

    public void setCampoMesesValidezCertificadoVida1(TextField component) {
        this.campoMesesValidezCertificadoVida1 = component;
    }

    private StaticText campoMesesValidezCertificadoVida1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMesesValidezCertificadoVida1Texto1() {
        return campoMesesValidezCertificadoVida1Texto1;
    }

    public void setCampoMesesValidezCertificadoVida1Texto1(StaticText component) {
        this.campoMesesValidezCertificadoVida1Texto1 = component;
    }

    private IntegerConverter converterMesesValidezCertificadoVida1 = new IntegerConverter();
  
    public IntegerConverter getConverterMesesValidezCertificadoVida1() {
        return converterMesesValidezCertificadoVida1;
    }
  
    public void setConverterMesesValidezCertificadoVida1(IntegerConverter converter) {
        this.converterMesesValidezCertificadoVida1 = converter;
    }
  
    private LongRangeValidator validatorMesesValidezCertificadoVida1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorMesesValidezCertificadoVida1() {
        return validatorMesesValidezCertificadoVida1;
    }
  
    public void setValidatorMesesValidezCertificadoVida1(LongRangeValidator validator) {
        this.validatorMesesValidezCertificadoVida1 = validator;
    }
  
    private TableColumn tableColumnEsControlCobroPensionActiv1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsControlCobroPensionActiv1() {
        return tableColumnEsControlCobroPensionActiv1;
    }

    public void setTableColumnEsControlCobroPensionActiv1(TableColumn component) {
        this.tableColumnEsControlCobroPensionActiv1 = component;
    }

    private Label labelEsControlCobroPensionActiv1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsControlCobroPensionActiv1() {
        return labelEsControlCobroPensionActiv1;
    }

    public void setLabelEsControlCobroPensionActiv1(Label l) {
        this.labelEsControlCobroPensionActiv1 = l;
    }

    private DropDown listaEsControlCobroPensionActiv1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsControlCobroPensionActiv1() {
        return listaEsControlCobroPensionActiv1;
    }

    public void setListaEsControlCobroPensionActiv1(DropDown component) {
        this.listaEsControlCobroPensionActiv1 = component;
    }

    private StaticText listaEsControlCobroPensionActiv1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsControlCobroPensionActiv1Texto1() {
        return listaEsControlCobroPensionActiv1Texto1;
    }

    public void setListaEsControlCobroPensionActiv1Texto1(StaticText component) {
        this.listaEsControlCobroPensionActiv1Texto1 = component;
    }

    private IntegerConverter converterEsControlCobroPensionActiv1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsControlCobroPensionActiv1() {
        return converterEsControlCobroPensionActiv1;
    }
  
    public void setConverterEsControlCobroPensionActiv1(IntegerConverter converter) {
        this.converterEsControlCobroPensionActiv1 = converter;
    }
  
    private TableColumn tableColumnMesesUltimoCobroPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnMesesUltimoCobroPension1() {
        return tableColumnMesesUltimoCobroPension1;
    }

    public void setTableColumnMesesUltimoCobroPension1(TableColumn component) {
        this.tableColumnMesesUltimoCobroPension1 = component;
    }

    private Label labelMesesUltimoCobroPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMesesUltimoCobroPension1() {
        return labelMesesUltimoCobroPension1;
    }

    public void setLabelMesesUltimoCobroPension1(Label l) {
        this.labelMesesUltimoCobroPension1 = l;
    }

    private TextField campoMesesUltimoCobroPension1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoMesesUltimoCobroPension1() {
        return campoMesesUltimoCobroPension1;
    }

    public void setCampoMesesUltimoCobroPension1(TextField component) {
        this.campoMesesUltimoCobroPension1 = component;
    }

    private StaticText campoMesesUltimoCobroPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMesesUltimoCobroPension1Texto1() {
        return campoMesesUltimoCobroPension1Texto1;
    }

    public void setCampoMesesUltimoCobroPension1Texto1(StaticText component) {
        this.campoMesesUltimoCobroPension1Texto1 = component;
    }

    private IntegerConverter converterMesesUltimoCobroPension1 = new IntegerConverter();
  
    public IntegerConverter getConverterMesesUltimoCobroPension1() {
        return converterMesesUltimoCobroPension1;
    }
  
    public void setConverterMesesUltimoCobroPension1(IntegerConverter converter) {
        this.converterMesesUltimoCobroPension1 = converter;
    }
  
    private LongRangeValidator validatorMesesUltimoCobroPension1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorMesesUltimoCobroPension1() {
        return validatorMesesUltimoCobroPension1;
    }
  
    public void setValidatorMesesUltimoCobroPension1(LongRangeValidator validator) {
        this.validatorMesesUltimoCobroPension1 = validator;
    }
  
    private TableColumn tableColumnEsControlReprocesoPenActiv1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsControlReprocesoPenActiv1() {
        return tableColumnEsControlReprocesoPenActiv1;
    }

    public void setTableColumnEsControlReprocesoPenActiv1(TableColumn component) {
        this.tableColumnEsControlReprocesoPenActiv1 = component;
    }

    private Label labelEsControlReprocesoPenActiv1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsControlReprocesoPenActiv1() {
        return labelEsControlReprocesoPenActiv1;
    }

    public void setLabelEsControlReprocesoPenActiv1(Label l) {
        this.labelEsControlReprocesoPenActiv1 = l;
    }

    private DropDown listaEsControlReprocesoPenActiv1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsControlReprocesoPenActiv1() {
        return listaEsControlReprocesoPenActiv1;
    }

    public void setListaEsControlReprocesoPenActiv1(DropDown component) {
        this.listaEsControlReprocesoPenActiv1 = component;
    }

    private StaticText listaEsControlReprocesoPenActiv1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsControlReprocesoPenActiv1Texto1() {
        return listaEsControlReprocesoPenActiv1Texto1;
    }

    public void setListaEsControlReprocesoPenActiv1Texto1(StaticText component) {
        this.listaEsControlReprocesoPenActiv1Texto1 = component;
    }

    private IntegerConverter converterEsControlReprocesoPenActiv1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsControlReprocesoPenActiv1() {
        return converterEsControlReprocesoPenActiv1;
    }
  
    public void setConverterEsControlReprocesoPenActiv1(IntegerConverter converter) {
        this.converterEsControlReprocesoPenActiv1 = converter;
    }
  
    private TableColumn tableColumnLimiteIndiceCalidadVida1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnLimiteIndiceCalidadVida1() {
        return tableColumnLimiteIndiceCalidadVida1;
    }

    public void setTableColumnLimiteIndiceCalidadVida1(TableColumn component) {
        this.tableColumnLimiteIndiceCalidadVida1 = component;
    }

    private Label labelLimiteIndiceCalidadVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLimiteIndiceCalidadVida1() {
        return labelLimiteIndiceCalidadVida1;
    }

    public void setLabelLimiteIndiceCalidadVida1(Label l) {
        this.labelLimiteIndiceCalidadVida1 = l;
    }

    private TextField campoLimiteIndiceCalidadVida1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoLimiteIndiceCalidadVida1() {
        return campoLimiteIndiceCalidadVida1;
    }

    public void setCampoLimiteIndiceCalidadVida1(TextField component) {
        this.campoLimiteIndiceCalidadVida1 = component;
    }

    private StaticText campoLimiteIndiceCalidadVida1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLimiteIndiceCalidadVida1Texto1() {
        return campoLimiteIndiceCalidadVida1Texto1;
    }

    public void setCampoLimiteIndiceCalidadVida1Texto1(StaticText component) {
        this.campoLimiteIndiceCalidadVida1Texto1 = component;
    }

    private NumberConverter converterLimiteIndiceCalidadVida1 = new NumberConverter();
  
    public NumberConverter getConverterLimiteIndiceCalidadVida1() {
        return converterLimiteIndiceCalidadVida1;
    }
  
    public void setConverterLimiteIndiceCalidadVida1(NumberConverter converter) {
        this.converterLimiteIndiceCalidadVida1 = converter;
    }
  
    private DoubleRangeValidator validatorLimiteIndiceCalidadVida1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorLimiteIndiceCalidadVida1() {
        return validatorLimiteIndiceCalidadVida1;
    }
  
    public void setValidatorLimiteIndiceCalidadVida1(DoubleRangeValidator validator) {
        this.validatorLimiteIndiceCalidadVida1 = validator;
    }
  
    private TableColumn tableColumnLimitePensiones1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnLimitePensiones1() {
        return tableColumnLimitePensiones1;
    }

    public void setTableColumnLimitePensiones1(TableColumn component) {
        this.tableColumnLimitePensiones1 = component;
    }

    private Label labelLimitePensiones1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLimitePensiones1() {
        return labelLimitePensiones1;
    }

    public void setLabelLimitePensiones1(Label l) {
        this.labelLimitePensiones1 = l;
    }

    private TextField campoLimitePensiones1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoLimitePensiones1() {
        return campoLimitePensiones1;
    }

    public void setCampoLimitePensiones1(TextField component) {
        this.campoLimitePensiones1 = component;
    }

    private StaticText campoLimitePensiones1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLimitePensiones1Texto1() {
        return campoLimitePensiones1Texto1;
    }

    public void setCampoLimitePensiones1Texto1(StaticText component) {
        this.campoLimitePensiones1Texto1 = component;
    }

    private IntegerConverter converterLimitePensiones1 = new IntegerConverter();
  
    public IntegerConverter getConverterLimitePensiones1() {
        return converterLimitePensiones1;
    }
  
    public void setConverterLimitePensiones1(IntegerConverter converter) {
        this.converterLimitePensiones1 = converter;
    }
  
    private LongRangeValidator validatorLimitePensiones1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorLimitePensiones1() {
        return validatorLimitePensiones1;
    }
  
    public void setValidatorLimitePensiones1(LongRangeValidator validator) {
        this.validatorLimitePensiones1 = validator;
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

    private ParametroGlobalCachedRowSetDataProvider2 parametroGlobalDataProvider = new ParametroGlobalCachedRowSetDataProvider2();

    @Override
    public ParametroGlobalCachedRowSetDataProvider2 getParametroGlobalDataProvider() {
        return parametroGlobalDataProvider;
    }

    public void setParametroGlobalDataProvider(ParametroGlobalCachedRowSetDataProvider2 crsdp) {
        this.parametroGlobalDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public ParametroGlobal1() {
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
        parametroGlobalDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionParametroGlobal...">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion con tabla">
    private GestorPaginaActualizacionConTabla gestor = new GestorPaginaActualizacionConTabla(this);

    @Override
    public GestorPaginaActualizacionConTabla getGestor() {
        return this.gestor;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad asistente de pagina de actualizacion">
    private AsistentePaginaActualizacionParametroGlobal asistente = new AsistentePaginaActualizacionParametroGlobal(this);

    public AsistentePaginaActualizacionParametroGlobal getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("ParametroGlobal1_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("ParametroGlobal1_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("ParametroGlobal1_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getParametroGlobalDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return ParametroGlobalCachedRowSetDataProvider2.FUNCION_CONSULTAR_PARAMETRO_GLOBAL;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return -1;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return ParametroGlobalCachedRowSetDataProvider2.FUNCION_MODIFICAR_PARAMETRO_GLOBAL;
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
//      return "detalle";
        return null;
    }

    public String getScriptAbrirVentanaVerDetalle() {
//      String urx = URX2.DETALLE_PARAMETRO_GLOBAL;
//      return this.getGestor().getScriptAbrirVentanaVerDetalle(urx);
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
        converterMontoSalarioMinimo1.setMinIntegerDigits(1);
        converterMontoSalarioMinimo1.setMaxIntegerDigits(14);
        converterMontoSalarioMinimo1.setMaxFractionDigits(2);
        converterPorcentajePensionAlimentaria1.setMinIntegerDigits(1);
        converterPorcentajePensionAlimentaria1.setMaxIntegerDigits(3);
        converterPorcentajePensionAlimentaria1.setMaxFractionDigits(4);
        converterLimiteIndiceCalidadVida1.setMinIntegerDigits(1);
        converterLimiteIndiceCalidadVida1.setMaxIntegerDigits(3);
        converterLimiteIndiceCalidadVida1.setMaxFractionDigits(4);
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
            this.getParametroGlobalDataProvider().consultarParametroGlobal(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getParametroGlobalDataProvider().consultarParametroGlobal(filtro);
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
