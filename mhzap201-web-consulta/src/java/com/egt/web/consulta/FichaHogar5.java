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

import com.egt.data.specific.xdp2.FichaHogarCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FuncionarioCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
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
import javax.ejb.EJB;
import com.egt.ejb.business.jms.BusinessProcessMessengerLocal;
import com.egt.ejb.business.process.FichaHogarBusinessProcessLocal;

public class FichaHogar5 extends AbstractPageBean
        implements PaginaActualizacionFichaHogar, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdFichaHogar1.setMinimum(0L);
        validatorIdFichaHogar1.setMaximum(1000000000000000000L);
        validatorCodigoFichaHogar1.setMaximum(30);
        converterFechaEntrevista1.setPattern("dd/MM/yyyy");
        converterFechaEntrevista1.setType("date");
        validatorObservaciones1.setMaximum(8160);
        validatorHusoUtm1.setMinimum(1L);
        validatorHusoUtm1.setMaximum(60L);
        validatorFranjaUtm1.setMaximum(1);
        validatorDistanciaEsteUtm1.setMinimum(0L);
        validatorDistanciaEsteUtm1.setMaximum(1000000000L);
        validatorDistanciaNorteUtm1.setMinimum(0L);
        validatorDistanciaNorteUtm1.setMaximum(1000000000L);
        validatorNumeroFormulario1.setMinimum(0L);
        validatorNumeroFormulario1.setMaximum(1000000000L);
        validatorNumeroVivienda1.setMinimum(0L);
        validatorNumeroVivienda1.setMaximum(1000000000L);
        validatorNumeroHogar1.setMinimum(0L);
        validatorNumeroHogar1.setMaximum(1000000000L);
        validatorManzana1.setMaximum(30);
        validatorDireccion1.setMaximum(8160);
        validatorTotalPersonas1.setMinimum(0L);
        validatorTotalPersonas1.setMaximum(1000000000L);
        validatorTotalHombres1.setMinimum(0L);
        validatorTotalHombres1.setMaximum(1000000000L);
        validatorTotalMujeres1.setMinimum(0L);
        validatorTotalMujeres1.setMaximum(1000000000L);
        validatorOtroTipoOcupacionViv1.setMaximum(100);
        validatorCantidadPiezas1.setMinimum(0L);
        validatorCantidadPiezas1.setMaximum(1000000000L);
        validatorCantidadDormitorios1.setMinimum(0L);
        validatorCantidadDormitorios1.setMaximum(1000000000L);
        validatorNumeroTelefonoCelular1.setMaximum(50);
        validatorNumeroTelefonoLineaBaja1.setMaximum(50);
        validatorNombreJefeHogar1.setMaximum(100);
        validatorNumeroCedulaJefeHogar1.setMinimum(0L);
        validatorNumeroCedulaJefeHogar1.setMaximum(1000000000L);
        validatorLetraCedulaJefeHogar1.setMaximum(1);
        validatorNumeroOrdenIdenJefeHogar1.setMinimum(0L);
        validatorNumeroOrdenIdenJefeHogar1.setMaximum(1000000000L);
        validatorNombreRespondente1.setMaximum(100);
        validatorNumeroCedulaRespondente1.setMinimum(0L);
        validatorNumeroCedulaRespondente1.setMaximum(1000000000L);
        validatorLetraCedulaRespondente1.setMaximum(1);
        validatorNumeroOrdenIdenRespondente1.setMinimum(0L);
        validatorNumeroOrdenIdenRespondente1.setMaximum(1000000000L);
        converterIndiceCalidadVida1.setMinIntegerDigits(1);
        converterIndiceCalidadVida1.setMaxIntegerDigits(40);
        converterIndiceCalidadVida1.setMaxFractionDigits(3);
        validatorIndiceCalidadVida1.setMinimum(0.0);
        validatorIndiceCalidadVida1.setMaximum(1.0E2);
        fichaHogarDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fichaHogarRowSet}"));
        funcionarioReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.funcionarioReferenceRowSet}"));
        ubicacionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.ubicacionReferenceRowSet}"));
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

    private TableColumn tableColumnIdFichaHogar1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFichaHogar1() {
        return tableColumnIdFichaHogar1;
    }

    public void setTableColumnIdFichaHogar1(TableColumn component) {
        this.tableColumnIdFichaHogar1 = component;
    }

    private Label labelIdFichaHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaHogar1() {
        return labelIdFichaHogar1;
    }

    public void setLabelIdFichaHogar1(Label l) {
        this.labelIdFichaHogar1 = l;
    }

    private TextField campoIdFichaHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFichaHogar1() {
        return campoIdFichaHogar1;
    }

    public void setCampoIdFichaHogar1(TextField component) {
        this.campoIdFichaHogar1 = component;
    }

    private StaticText campoIdFichaHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFichaHogar1Texto1() {
        return campoIdFichaHogar1Texto1;
    }

    public void setCampoIdFichaHogar1Texto1(StaticText component) {
        this.campoIdFichaHogar1Texto1 = component;
    }

    private LongConverter converterIdFichaHogar1 = new LongConverter();
  
    public LongConverter getConverterIdFichaHogar1() {
        return converterIdFichaHogar1;
    }
  
    public void setConverterIdFichaHogar1(LongConverter converter) {
        this.converterIdFichaHogar1 = converter;
    }
  
    private LongRangeValidator validatorIdFichaHogar1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdFichaHogar1() {
        return validatorIdFichaHogar1;
    }
  
    public void setValidatorIdFichaHogar1(LongRangeValidator validator) {
        this.validatorIdFichaHogar1 = validator;
    }
  
    private TableColumn tableColumnCodigoFichaHogar1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCodigoFichaHogar1() {
        return tableColumnCodigoFichaHogar1;
    }

    public void setTableColumnCodigoFichaHogar1(TableColumn component) {
        this.tableColumnCodigoFichaHogar1 = component;
    }

    private Label labelCodigoFichaHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoFichaHogar1() {
        return labelCodigoFichaHogar1;
    }

    public void setLabelCodigoFichaHogar1(Label l) {
        this.labelCodigoFichaHogar1 = l;
    }

    private TextField campoCodigoFichaHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoFichaHogar1() {
        return campoCodigoFichaHogar1;
    }

    public void setCampoCodigoFichaHogar1(TextField component) {
        this.campoCodigoFichaHogar1 = component;
    }

    private StaticText campoCodigoFichaHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoFichaHogar1Texto1() {
        return campoCodigoFichaHogar1Texto1;
    }

    public void setCampoCodigoFichaHogar1Texto1(StaticText component) {
        this.campoCodigoFichaHogar1Texto1 = component;
    }

    private LengthValidator validatorCodigoFichaHogar1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoFichaHogar1() {
        return validatorCodigoFichaHogar1;
    }
  
    public void setValidatorCodigoFichaHogar1(LengthValidator validator) {
        this.validatorCodigoFichaHogar1 = validator;
    }
  
    private TableColumn tableColumnFechaEntrevista1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaEntrevista1() {
        return tableColumnFechaEntrevista1;
    }

    public void setTableColumnFechaEntrevista1(TableColumn component) {
        this.tableColumnFechaEntrevista1 = component;
    }

    private Label labelFechaEntrevista1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaEntrevista1() {
        return labelFechaEntrevista1;
    }

    public void setLabelFechaEntrevista1(Label l) {
        this.labelFechaEntrevista1 = l;
    }

    private TextField campoFechaEntrevista1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaEntrevista1() {
        return campoFechaEntrevista1;
    }

    public void setCampoFechaEntrevista1(TextField component) {
        this.campoFechaEntrevista1 = component;
    }

    private TextField campoFechaEntrevista1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaEntrevista1x1() {
        return campoFechaEntrevista1x1;
    }

    public void setCampoFechaEntrevista1x1(TextField component) {
        this.campoFechaEntrevista1x1 = component;
    }

    private StaticText campoFechaEntrevista1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaEntrevista1Texto1() {
        return campoFechaEntrevista1Texto1;
    }

    public void setCampoFechaEntrevista1Texto1(StaticText component) {
        this.campoFechaEntrevista1Texto1 = component;
    }

    private StaticText campoFechaEntrevista1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaEntrevista1x1Texto1() {
        return campoFechaEntrevista1x1Texto1;
    }

    public void setCampoFechaEntrevista1x1Texto1(StaticText component) {
        this.campoFechaEntrevista1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaEntrevista1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaEntrevista1() {
        return converterFechaEntrevista1;
    }
  
    public void setConverterFechaEntrevista1(SqlTimestampConverter converter) {
        this.converterFechaEntrevista1 = converter;
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

    private TextField campoIdFuncionarioCensista1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdFuncionarioCensista1x1() {
        return campoIdFuncionarioCensista1x1;
    }

    public void setCampoIdFuncionarioCensista1x1(TextField component) {
        this.campoIdFuncionarioCensista1x1 = component;
    }

    private StaticText campoIdFuncionarioCensista1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioCensista1Texto1() {
        return campoIdFuncionarioCensista1Texto1;
    }

    public void setCampoIdFuncionarioCensista1Texto1(StaticText component) {
        this.campoIdFuncionarioCensista1Texto1 = component;
    }

    private StaticText campoIdFuncionarioCensista1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioCensista1x1Texto1() {
        return campoIdFuncionarioCensista1x1Texto1;
    }

    public void setCampoIdFuncionarioCensista1x1Texto1(StaticText component) {
        this.campoIdFuncionarioCensista1x1Texto1 = component;
    }

    private Button campoIdFuncionarioCensista1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioCensista1Boton1() {
        return campoIdFuncionarioCensista1Boton1;
    }

    public void setCampoIdFuncionarioCensista1Boton1(Button component) {
        this.campoIdFuncionarioCensista1Boton1 = component;
    }

    private Button campoIdFuncionarioCensista1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioCensista1x1Boton1() {
        return campoIdFuncionarioCensista1x1Boton1;
    }

    public void setCampoIdFuncionarioCensista1x1Boton1(Button component) {
        this.campoIdFuncionarioCensista1x1Boton1 = component;
    }

    private Button campoIdFuncionarioCensista1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioCensista1Boton3() {
        return campoIdFuncionarioCensista1Boton3;
    }

    public void setCampoIdFuncionarioCensista1Boton3(Button component) {
        this.campoIdFuncionarioCensista1Boton3 = component;
    }

    private Button campoIdFuncionarioCensista1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioCensista1x1Boton3() {
        return campoIdFuncionarioCensista1x1Boton3;
    }

    public void setCampoIdFuncionarioCensista1x1Boton3(Button component) {
        this.campoIdFuncionarioCensista1x1Boton3 = component;
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

    private TableColumn tableColumnIdFuncionarioSupervisor1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionarioSupervisor1() {
        return tableColumnIdFuncionarioSupervisor1;
    }

    public void setTableColumnIdFuncionarioSupervisor1(TableColumn component) {
        this.tableColumnIdFuncionarioSupervisor1 = component;
    }

    private Label labelIdFuncionarioSupervisor1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioSupervisor1() {
        return labelIdFuncionarioSupervisor1;
    }

    public void setLabelIdFuncionarioSupervisor1(Label l) {
        this.labelIdFuncionarioSupervisor1 = l;
    }

    private TextField campoIdFuncionarioSupervisor1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionarioSupervisor1() {
        return campoIdFuncionarioSupervisor1;
    }

    public void setCampoIdFuncionarioSupervisor1(TextField component) {
        this.campoIdFuncionarioSupervisor1 = component;
    }

    private TextField campoIdFuncionarioSupervisor1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdFuncionarioSupervisor1x1() {
        return campoIdFuncionarioSupervisor1x1;
    }

    public void setCampoIdFuncionarioSupervisor1x1(TextField component) {
        this.campoIdFuncionarioSupervisor1x1 = component;
    }

    private StaticText campoIdFuncionarioSupervisor1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioSupervisor1Texto1() {
        return campoIdFuncionarioSupervisor1Texto1;
    }

    public void setCampoIdFuncionarioSupervisor1Texto1(StaticText component) {
        this.campoIdFuncionarioSupervisor1Texto1 = component;
    }

    private StaticText campoIdFuncionarioSupervisor1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioSupervisor1x1Texto1() {
        return campoIdFuncionarioSupervisor1x1Texto1;
    }

    public void setCampoIdFuncionarioSupervisor1x1Texto1(StaticText component) {
        this.campoIdFuncionarioSupervisor1x1Texto1 = component;
    }

    private Button campoIdFuncionarioSupervisor1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioSupervisor1Boton1() {
        return campoIdFuncionarioSupervisor1Boton1;
    }

    public void setCampoIdFuncionarioSupervisor1Boton1(Button component) {
        this.campoIdFuncionarioSupervisor1Boton1 = component;
    }

    private Button campoIdFuncionarioSupervisor1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioSupervisor1x1Boton1() {
        return campoIdFuncionarioSupervisor1x1Boton1;
    }

    public void setCampoIdFuncionarioSupervisor1x1Boton1(Button component) {
        this.campoIdFuncionarioSupervisor1x1Boton1 = component;
    }

    private Button campoIdFuncionarioSupervisor1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioSupervisor1Boton3() {
        return campoIdFuncionarioSupervisor1Boton3;
    }

    public void setCampoIdFuncionarioSupervisor1Boton3(Button component) {
        this.campoIdFuncionarioSupervisor1Boton3 = component;
    }

    private Button campoIdFuncionarioSupervisor1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioSupervisor1x1Boton3() {
        return campoIdFuncionarioSupervisor1x1Boton3;
    }

    public void setCampoIdFuncionarioSupervisor1x1Boton3(Button component) {
        this.campoIdFuncionarioSupervisor1x1Boton3 = component;
    }

    private TableColumn tableColumnIdFuncionarioSupervisor2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionarioSupervisor2() {
        return tableColumnIdFuncionarioSupervisor2;
    }

    public void setTableColumnIdFuncionarioSupervisor2(TableColumn component) {
        this.tableColumnIdFuncionarioSupervisor2 = component;
    }

    private Label labelIdFuncionarioSupervisor2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioSupervisor2() {
        return labelIdFuncionarioSupervisor2;
    }

    public void setLabelIdFuncionarioSupervisor2(Label l) {
        this.labelIdFuncionarioSupervisor2 = l;
    }

    private ImageHyperlink campoIdFuncionarioSupervisor1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdFuncionarioSupervisor1Hiper1() {
        return campoIdFuncionarioSupervisor1Hiper1;
    }

    public void setCampoIdFuncionarioSupervisor1Hiper1(ImageHyperlink component) {
        this.campoIdFuncionarioSupervisor1Hiper1 = component;
    }

    private TableColumn tableColumnIdFuncionarioCriticoDeco1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionarioCriticoDeco1() {
        return tableColumnIdFuncionarioCriticoDeco1;
    }

    public void setTableColumnIdFuncionarioCriticoDeco1(TableColumn component) {
        this.tableColumnIdFuncionarioCriticoDeco1 = component;
    }

    private Label labelIdFuncionarioCriticoDeco1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioCriticoDeco1() {
        return labelIdFuncionarioCriticoDeco1;
    }

    public void setLabelIdFuncionarioCriticoDeco1(Label l) {
        this.labelIdFuncionarioCriticoDeco1 = l;
    }

    private TextField campoIdFuncionarioCriticoDeco1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionarioCriticoDeco1() {
        return campoIdFuncionarioCriticoDeco1;
    }

    public void setCampoIdFuncionarioCriticoDeco1(TextField component) {
        this.campoIdFuncionarioCriticoDeco1 = component;
    }

    private TextField campoIdFuncionarioCriticoDeco1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdFuncionarioCriticoDeco1x1() {
        return campoIdFuncionarioCriticoDeco1x1;
    }

    public void setCampoIdFuncionarioCriticoDeco1x1(TextField component) {
        this.campoIdFuncionarioCriticoDeco1x1 = component;
    }

    private StaticText campoIdFuncionarioCriticoDeco1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioCriticoDeco1Texto1() {
        return campoIdFuncionarioCriticoDeco1Texto1;
    }

    public void setCampoIdFuncionarioCriticoDeco1Texto1(StaticText component) {
        this.campoIdFuncionarioCriticoDeco1Texto1 = component;
    }

    private StaticText campoIdFuncionarioCriticoDeco1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioCriticoDeco1x1Texto1() {
        return campoIdFuncionarioCriticoDeco1x1Texto1;
    }

    public void setCampoIdFuncionarioCriticoDeco1x1Texto1(StaticText component) {
        this.campoIdFuncionarioCriticoDeco1x1Texto1 = component;
    }

    private Button campoIdFuncionarioCriticoDeco1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioCriticoDeco1Boton1() {
        return campoIdFuncionarioCriticoDeco1Boton1;
    }

    public void setCampoIdFuncionarioCriticoDeco1Boton1(Button component) {
        this.campoIdFuncionarioCriticoDeco1Boton1 = component;
    }

    private Button campoIdFuncionarioCriticoDeco1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioCriticoDeco1x1Boton1() {
        return campoIdFuncionarioCriticoDeco1x1Boton1;
    }

    public void setCampoIdFuncionarioCriticoDeco1x1Boton1(Button component) {
        this.campoIdFuncionarioCriticoDeco1x1Boton1 = component;
    }

    private Button campoIdFuncionarioCriticoDeco1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioCriticoDeco1Boton3() {
        return campoIdFuncionarioCriticoDeco1Boton3;
    }

    public void setCampoIdFuncionarioCriticoDeco1Boton3(Button component) {
        this.campoIdFuncionarioCriticoDeco1Boton3 = component;
    }

    private Button campoIdFuncionarioCriticoDeco1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioCriticoDeco1x1Boton3() {
        return campoIdFuncionarioCriticoDeco1x1Boton3;
    }

    public void setCampoIdFuncionarioCriticoDeco1x1Boton3(Button component) {
        this.campoIdFuncionarioCriticoDeco1x1Boton3 = component;
    }

    private TableColumn tableColumnIdFuncionarioCriticoDeco2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionarioCriticoDeco2() {
        return tableColumnIdFuncionarioCriticoDeco2;
    }

    public void setTableColumnIdFuncionarioCriticoDeco2(TableColumn component) {
        this.tableColumnIdFuncionarioCriticoDeco2 = component;
    }

    private Label labelIdFuncionarioCriticoDeco2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioCriticoDeco2() {
        return labelIdFuncionarioCriticoDeco2;
    }

    public void setLabelIdFuncionarioCriticoDeco2(Label l) {
        this.labelIdFuncionarioCriticoDeco2 = l;
    }

    private ImageHyperlink campoIdFuncionarioCriticoDeco1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdFuncionarioCriticoDeco1Hiper1() {
        return campoIdFuncionarioCriticoDeco1Hiper1;
    }

    public void setCampoIdFuncionarioCriticoDeco1Hiper1(ImageHyperlink component) {
        this.campoIdFuncionarioCriticoDeco1Hiper1 = component;
    }

    private TableColumn tableColumnIdFuncionarioDigitador1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionarioDigitador1() {
        return tableColumnIdFuncionarioDigitador1;
    }

    public void setTableColumnIdFuncionarioDigitador1(TableColumn component) {
        this.tableColumnIdFuncionarioDigitador1 = component;
    }

    private Label labelIdFuncionarioDigitador1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioDigitador1() {
        return labelIdFuncionarioDigitador1;
    }

    public void setLabelIdFuncionarioDigitador1(Label l) {
        this.labelIdFuncionarioDigitador1 = l;
    }

    private TextField campoIdFuncionarioDigitador1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionarioDigitador1() {
        return campoIdFuncionarioDigitador1;
    }

    public void setCampoIdFuncionarioDigitador1(TextField component) {
        this.campoIdFuncionarioDigitador1 = component;
    }

    private TextField campoIdFuncionarioDigitador1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdFuncionarioDigitador1x1() {
        return campoIdFuncionarioDigitador1x1;
    }

    public void setCampoIdFuncionarioDigitador1x1(TextField component) {
        this.campoIdFuncionarioDigitador1x1 = component;
    }

    private StaticText campoIdFuncionarioDigitador1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioDigitador1Texto1() {
        return campoIdFuncionarioDigitador1Texto1;
    }

    public void setCampoIdFuncionarioDigitador1Texto1(StaticText component) {
        this.campoIdFuncionarioDigitador1Texto1 = component;
    }

    private StaticText campoIdFuncionarioDigitador1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioDigitador1x1Texto1() {
        return campoIdFuncionarioDigitador1x1Texto1;
    }

    public void setCampoIdFuncionarioDigitador1x1Texto1(StaticText component) {
        this.campoIdFuncionarioDigitador1x1Texto1 = component;
    }

    private Button campoIdFuncionarioDigitador1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioDigitador1Boton1() {
        return campoIdFuncionarioDigitador1Boton1;
    }

    public void setCampoIdFuncionarioDigitador1Boton1(Button component) {
        this.campoIdFuncionarioDigitador1Boton1 = component;
    }

    private Button campoIdFuncionarioDigitador1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioDigitador1x1Boton1() {
        return campoIdFuncionarioDigitador1x1Boton1;
    }

    public void setCampoIdFuncionarioDigitador1x1Boton1(Button component) {
        this.campoIdFuncionarioDigitador1x1Boton1 = component;
    }

    private Button campoIdFuncionarioDigitador1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioDigitador1Boton3() {
        return campoIdFuncionarioDigitador1Boton3;
    }

    public void setCampoIdFuncionarioDigitador1Boton3(Button component) {
        this.campoIdFuncionarioDigitador1Boton3 = component;
    }

    private Button campoIdFuncionarioDigitador1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioDigitador1x1Boton3() {
        return campoIdFuncionarioDigitador1x1Boton3;
    }

    public void setCampoIdFuncionarioDigitador1x1Boton3(Button component) {
        this.campoIdFuncionarioDigitador1x1Boton3 = component;
    }

    private TableColumn tableColumnIdFuncionarioDigitador2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionarioDigitador2() {
        return tableColumnIdFuncionarioDigitador2;
    }

    public void setTableColumnIdFuncionarioDigitador2(TableColumn component) {
        this.tableColumnIdFuncionarioDigitador2 = component;
    }

    private Label labelIdFuncionarioDigitador2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioDigitador2() {
        return labelIdFuncionarioDigitador2;
    }

    public void setLabelIdFuncionarioDigitador2(Label l) {
        this.labelIdFuncionarioDigitador2 = l;
    }

    private ImageHyperlink campoIdFuncionarioDigitador1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdFuncionarioDigitador1Hiper1() {
        return campoIdFuncionarioDigitador1Hiper1;
    }

    public void setCampoIdFuncionarioDigitador1Hiper1(ImageHyperlink component) {
        this.campoIdFuncionarioDigitador1Hiper1 = component;
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

    private TextArea campoObservaciones1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoObservaciones1x1() {
        return campoObservaciones1x1;
    }

    public void setCampoObservaciones1x1(TextArea component) {
        this.campoObservaciones1x1 = component;
    }

    private StaticText campoObservaciones1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoObservaciones1Texto1() {
        return campoObservaciones1Texto1;
    }

    public void setCampoObservaciones1Texto1(StaticText component) {
        this.campoObservaciones1Texto1 = component;
    }

    private StaticText campoObservaciones1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoObservaciones1x1Texto1() {
        return campoObservaciones1x1Texto1;
    }

    public void setCampoObservaciones1x1Texto1(StaticText component) {
        this.campoObservaciones1x1Texto1 = component;
    }

    private LengthValidator validatorObservaciones1 = new LengthValidator();
  
    public LengthValidator getValidatorObservaciones1() {
        return validatorObservaciones1;
    }
  
    public void setValidatorObservaciones1(LengthValidator validator) {
        this.validatorObservaciones1 = validator;
    }
  
    private TableColumn tableColumnHusoUtm1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnHusoUtm1() {
        return tableColumnHusoUtm1;
    }

    public void setTableColumnHusoUtm1(TableColumn component) {
        this.tableColumnHusoUtm1 = component;
    }

    private Label labelHusoUtm1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelHusoUtm1() {
        return labelHusoUtm1;
    }

    public void setLabelHusoUtm1(Label l) {
        this.labelHusoUtm1 = l;
    }

    private TextField campoHusoUtm1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoHusoUtm1() {
        return campoHusoUtm1;
    }

    public void setCampoHusoUtm1(TextField component) {
        this.campoHusoUtm1 = component;
    }

    private TextField campoHusoUtm1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoHusoUtm1x1() {
        return campoHusoUtm1x1;
    }

    public void setCampoHusoUtm1x1(TextField component) {
        this.campoHusoUtm1x1 = component;
    }

    private StaticText campoHusoUtm1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoHusoUtm1Texto1() {
        return campoHusoUtm1Texto1;
    }

    public void setCampoHusoUtm1Texto1(StaticText component) {
        this.campoHusoUtm1Texto1 = component;
    }

    private StaticText campoHusoUtm1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoHusoUtm1x1Texto1() {
        return campoHusoUtm1x1Texto1;
    }

    public void setCampoHusoUtm1x1Texto1(StaticText component) {
        this.campoHusoUtm1x1Texto1 = component;
    }

    private IntegerConverter converterHusoUtm1 = new IntegerConverter();
  
    public IntegerConverter getConverterHusoUtm1() {
        return converterHusoUtm1;
    }
  
    public void setConverterHusoUtm1(IntegerConverter converter) {
        this.converterHusoUtm1 = converter;
    }
  
    private LongRangeValidator validatorHusoUtm1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorHusoUtm1() {
        return validatorHusoUtm1;
    }
  
    public void setValidatorHusoUtm1(LongRangeValidator validator) {
        this.validatorHusoUtm1 = validator;
    }
  
    private TableColumn tableColumnFranjaUtm1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFranjaUtm1() {
        return tableColumnFranjaUtm1;
    }

    public void setTableColumnFranjaUtm1(TableColumn component) {
        this.tableColumnFranjaUtm1 = component;
    }

    private Label labelFranjaUtm1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFranjaUtm1() {
        return labelFranjaUtm1;
    }

    public void setLabelFranjaUtm1(Label l) {
        this.labelFranjaUtm1 = l;
    }

    private TextField campoFranjaUtm1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoFranjaUtm1() {
        return campoFranjaUtm1;
    }

    public void setCampoFranjaUtm1(TextField component) {
        this.campoFranjaUtm1 = component;
    }

    private TextField campoFranjaUtm1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFranjaUtm1x1() {
        return campoFranjaUtm1x1;
    }

    public void setCampoFranjaUtm1x1(TextField component) {
        this.campoFranjaUtm1x1 = component;
    }

    private StaticText campoFranjaUtm1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFranjaUtm1Texto1() {
        return campoFranjaUtm1Texto1;
    }

    public void setCampoFranjaUtm1Texto1(StaticText component) {
        this.campoFranjaUtm1Texto1 = component;
    }

    private StaticText campoFranjaUtm1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFranjaUtm1x1Texto1() {
        return campoFranjaUtm1x1Texto1;
    }

    public void setCampoFranjaUtm1x1Texto1(StaticText component) {
        this.campoFranjaUtm1x1Texto1 = component;
    }

    private LengthValidator validatorFranjaUtm1 = new LengthValidator();
  
    public LengthValidator getValidatorFranjaUtm1() {
        return validatorFranjaUtm1;
    }
  
    public void setValidatorFranjaUtm1(LengthValidator validator) {
        this.validatorFranjaUtm1 = validator;
    }
  
    private TableColumn tableColumnDistanciaEsteUtm1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnDistanciaEsteUtm1() {
        return tableColumnDistanciaEsteUtm1;
    }

    public void setTableColumnDistanciaEsteUtm1(TableColumn component) {
        this.tableColumnDistanciaEsteUtm1 = component;
    }

    private Label labelDistanciaEsteUtm1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDistanciaEsteUtm1() {
        return labelDistanciaEsteUtm1;
    }

    public void setLabelDistanciaEsteUtm1(Label l) {
        this.labelDistanciaEsteUtm1 = l;
    }

    private TextField campoDistanciaEsteUtm1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoDistanciaEsteUtm1() {
        return campoDistanciaEsteUtm1;
    }

    public void setCampoDistanciaEsteUtm1(TextField component) {
        this.campoDistanciaEsteUtm1 = component;
    }

    private TextField campoDistanciaEsteUtm1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoDistanciaEsteUtm1x1() {
        return campoDistanciaEsteUtm1x1;
    }

    public void setCampoDistanciaEsteUtm1x1(TextField component) {
        this.campoDistanciaEsteUtm1x1 = component;
    }

    private StaticText campoDistanciaEsteUtm1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDistanciaEsteUtm1Texto1() {
        return campoDistanciaEsteUtm1Texto1;
    }

    public void setCampoDistanciaEsteUtm1Texto1(StaticText component) {
        this.campoDistanciaEsteUtm1Texto1 = component;
    }

    private StaticText campoDistanciaEsteUtm1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDistanciaEsteUtm1x1Texto1() {
        return campoDistanciaEsteUtm1x1Texto1;
    }

    public void setCampoDistanciaEsteUtm1x1Texto1(StaticText component) {
        this.campoDistanciaEsteUtm1x1Texto1 = component;
    }

    private IntegerConverter converterDistanciaEsteUtm1 = new IntegerConverter();
  
    public IntegerConverter getConverterDistanciaEsteUtm1() {
        return converterDistanciaEsteUtm1;
    }
  
    public void setConverterDistanciaEsteUtm1(IntegerConverter converter) {
        this.converterDistanciaEsteUtm1 = converter;
    }
  
    private LongRangeValidator validatorDistanciaEsteUtm1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorDistanciaEsteUtm1() {
        return validatorDistanciaEsteUtm1;
    }
  
    public void setValidatorDistanciaEsteUtm1(LongRangeValidator validator) {
        this.validatorDistanciaEsteUtm1 = validator;
    }
  
    private TableColumn tableColumnDistanciaNorteUtm1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnDistanciaNorteUtm1() {
        return tableColumnDistanciaNorteUtm1;
    }

    public void setTableColumnDistanciaNorteUtm1(TableColumn component) {
        this.tableColumnDistanciaNorteUtm1 = component;
    }

    private Label labelDistanciaNorteUtm1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDistanciaNorteUtm1() {
        return labelDistanciaNorteUtm1;
    }

    public void setLabelDistanciaNorteUtm1(Label l) {
        this.labelDistanciaNorteUtm1 = l;
    }

    private TextField campoDistanciaNorteUtm1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoDistanciaNorteUtm1() {
        return campoDistanciaNorteUtm1;
    }

    public void setCampoDistanciaNorteUtm1(TextField component) {
        this.campoDistanciaNorteUtm1 = component;
    }

    private TextField campoDistanciaNorteUtm1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoDistanciaNorteUtm1x1() {
        return campoDistanciaNorteUtm1x1;
    }

    public void setCampoDistanciaNorteUtm1x1(TextField component) {
        this.campoDistanciaNorteUtm1x1 = component;
    }

    private StaticText campoDistanciaNorteUtm1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDistanciaNorteUtm1Texto1() {
        return campoDistanciaNorteUtm1Texto1;
    }

    public void setCampoDistanciaNorteUtm1Texto1(StaticText component) {
        this.campoDistanciaNorteUtm1Texto1 = component;
    }

    private StaticText campoDistanciaNorteUtm1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDistanciaNorteUtm1x1Texto1() {
        return campoDistanciaNorteUtm1x1Texto1;
    }

    public void setCampoDistanciaNorteUtm1x1Texto1(StaticText component) {
        this.campoDistanciaNorteUtm1x1Texto1 = component;
    }

    private IntegerConverter converterDistanciaNorteUtm1 = new IntegerConverter();
  
    public IntegerConverter getConverterDistanciaNorteUtm1() {
        return converterDistanciaNorteUtm1;
    }
  
    public void setConverterDistanciaNorteUtm1(IntegerConverter converter) {
        this.converterDistanciaNorteUtm1 = converter;
    }
  
    private LongRangeValidator validatorDistanciaNorteUtm1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorDistanciaNorteUtm1() {
        return validatorDistanciaNorteUtm1;
    }
  
    public void setValidatorDistanciaNorteUtm1(LongRangeValidator validator) {
        this.validatorDistanciaNorteUtm1 = validator;
    }
  
    private TableColumn tableColumnNumeroFormulario1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroFormulario1() {
        return tableColumnNumeroFormulario1;
    }

    public void setTableColumnNumeroFormulario1(TableColumn component) {
        this.tableColumnNumeroFormulario1 = component;
    }

    private Label labelNumeroFormulario1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroFormulario1() {
        return labelNumeroFormulario1;
    }

    public void setLabelNumeroFormulario1(Label l) {
        this.labelNumeroFormulario1 = l;
    }

    private TextField campoNumeroFormulario1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroFormulario1() {
        return campoNumeroFormulario1;
    }

    public void setCampoNumeroFormulario1(TextField component) {
        this.campoNumeroFormulario1 = component;
    }

    private TextField campoNumeroFormulario1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroFormulario1x1() {
        return campoNumeroFormulario1x1;
    }

    public void setCampoNumeroFormulario1x1(TextField component) {
        this.campoNumeroFormulario1x1 = component;
    }

    private StaticText campoNumeroFormulario1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroFormulario1Texto1() {
        return campoNumeroFormulario1Texto1;
    }

    public void setCampoNumeroFormulario1Texto1(StaticText component) {
        this.campoNumeroFormulario1Texto1 = component;
    }

    private StaticText campoNumeroFormulario1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroFormulario1x1Texto1() {
        return campoNumeroFormulario1x1Texto1;
    }

    public void setCampoNumeroFormulario1x1Texto1(StaticText component) {
        this.campoNumeroFormulario1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroFormulario1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroFormulario1() {
        return converterNumeroFormulario1;
    }
  
    public void setConverterNumeroFormulario1(IntegerConverter converter) {
        this.converterNumeroFormulario1 = converter;
    }
  
    private LongRangeValidator validatorNumeroFormulario1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroFormulario1() {
        return validatorNumeroFormulario1;
    }
  
    public void setValidatorNumeroFormulario1(LongRangeValidator validator) {
        this.validatorNumeroFormulario1 = validator;
    }
  
    private TableColumn tableColumnNumeroVivienda1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroVivienda1() {
        return tableColumnNumeroVivienda1;
    }

    public void setTableColumnNumeroVivienda1(TableColumn component) {
        this.tableColumnNumeroVivienda1 = component;
    }

    private Label labelNumeroVivienda1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroVivienda1() {
        return labelNumeroVivienda1;
    }

    public void setLabelNumeroVivienda1(Label l) {
        this.labelNumeroVivienda1 = l;
    }

    private TextField campoNumeroVivienda1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroVivienda1() {
        return campoNumeroVivienda1;
    }

    public void setCampoNumeroVivienda1(TextField component) {
        this.campoNumeroVivienda1 = component;
    }

    private TextField campoNumeroVivienda1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroVivienda1x1() {
        return campoNumeroVivienda1x1;
    }

    public void setCampoNumeroVivienda1x1(TextField component) {
        this.campoNumeroVivienda1x1 = component;
    }

    private StaticText campoNumeroVivienda1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroVivienda1Texto1() {
        return campoNumeroVivienda1Texto1;
    }

    public void setCampoNumeroVivienda1Texto1(StaticText component) {
        this.campoNumeroVivienda1Texto1 = component;
    }

    private StaticText campoNumeroVivienda1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroVivienda1x1Texto1() {
        return campoNumeroVivienda1x1Texto1;
    }

    public void setCampoNumeroVivienda1x1Texto1(StaticText component) {
        this.campoNumeroVivienda1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroVivienda1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroVivienda1() {
        return converterNumeroVivienda1;
    }
  
    public void setConverterNumeroVivienda1(IntegerConverter converter) {
        this.converterNumeroVivienda1 = converter;
    }
  
    private LongRangeValidator validatorNumeroVivienda1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroVivienda1() {
        return validatorNumeroVivienda1;
    }
  
    public void setValidatorNumeroVivienda1(LongRangeValidator validator) {
        this.validatorNumeroVivienda1 = validator;
    }
  
    private TableColumn tableColumnNumeroHogar1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroHogar1() {
        return tableColumnNumeroHogar1;
    }

    public void setTableColumnNumeroHogar1(TableColumn component) {
        this.tableColumnNumeroHogar1 = component;
    }

    private Label labelNumeroHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroHogar1() {
        return labelNumeroHogar1;
    }

    public void setLabelNumeroHogar1(Label l) {
        this.labelNumeroHogar1 = l;
    }

    private TextField campoNumeroHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroHogar1() {
        return campoNumeroHogar1;
    }

    public void setCampoNumeroHogar1(TextField component) {
        this.campoNumeroHogar1 = component;
    }

    private TextField campoNumeroHogar1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroHogar1x1() {
        return campoNumeroHogar1x1;
    }

    public void setCampoNumeroHogar1x1(TextField component) {
        this.campoNumeroHogar1x1 = component;
    }

    private StaticText campoNumeroHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroHogar1Texto1() {
        return campoNumeroHogar1Texto1;
    }

    public void setCampoNumeroHogar1Texto1(StaticText component) {
        this.campoNumeroHogar1Texto1 = component;
    }

    private StaticText campoNumeroHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroHogar1x1Texto1() {
        return campoNumeroHogar1x1Texto1;
    }

    public void setCampoNumeroHogar1x1Texto1(StaticText component) {
        this.campoNumeroHogar1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroHogar1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroHogar1() {
        return converterNumeroHogar1;
    }
  
    public void setConverterNumeroHogar1(IntegerConverter converter) {
        this.converterNumeroHogar1 = converter;
    }
  
    private LongRangeValidator validatorNumeroHogar1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroHogar1() {
        return validatorNumeroHogar1;
    }
  
    public void setValidatorNumeroHogar1(LongRangeValidator validator) {
        this.validatorNumeroHogar1 = validator;
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

    private TextField campoIdDepartamento1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdDepartamento1x1() {
        return campoIdDepartamento1x1;
    }

    public void setCampoIdDepartamento1x1(TextField component) {
        this.campoIdDepartamento1x1 = component;
    }

    private StaticText campoIdDepartamento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDepartamento1Texto1() {
        return campoIdDepartamento1Texto1;
    }

    public void setCampoIdDepartamento1Texto1(StaticText component) {
        this.campoIdDepartamento1Texto1 = component;
    }

    private StaticText campoIdDepartamento1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDepartamento1x1Texto1() {
        return campoIdDepartamento1x1Texto1;
    }

    public void setCampoIdDepartamento1x1Texto1(StaticText component) {
        this.campoIdDepartamento1x1Texto1 = component;
    }

    private Button campoIdDepartamento1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDepartamento1Boton1() {
        return campoIdDepartamento1Boton1;
    }

    public void setCampoIdDepartamento1Boton1(Button component) {
        this.campoIdDepartamento1Boton1 = component;
    }

    private Button campoIdDepartamento1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDepartamento1x1Boton1() {
        return campoIdDepartamento1x1Boton1;
    }

    public void setCampoIdDepartamento1x1Boton1(Button component) {
        this.campoIdDepartamento1x1Boton1 = component;
    }

    private Button campoIdDepartamento1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDepartamento1Boton3() {
        return campoIdDepartamento1Boton3;
    }

    public void setCampoIdDepartamento1Boton3(Button component) {
        this.campoIdDepartamento1Boton3 = component;
    }

    private Button campoIdDepartamento1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDepartamento1x1Boton3() {
        return campoIdDepartamento1x1Boton3;
    }

    public void setCampoIdDepartamento1x1Boton3(Button component) {
        this.campoIdDepartamento1x1Boton3 = component;
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

    private TextField campoIdDistrito1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdDistrito1x1() {
        return campoIdDistrito1x1;
    }

    public void setCampoIdDistrito1x1(TextField component) {
        this.campoIdDistrito1x1 = component;
    }

    private StaticText campoIdDistrito1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDistrito1Texto1() {
        return campoIdDistrito1Texto1;
    }

    public void setCampoIdDistrito1Texto1(StaticText component) {
        this.campoIdDistrito1Texto1 = component;
    }

    private StaticText campoIdDistrito1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDistrito1x1Texto1() {
        return campoIdDistrito1x1Texto1;
    }

    public void setCampoIdDistrito1x1Texto1(StaticText component) {
        this.campoIdDistrito1x1Texto1 = component;
    }

    private Button campoIdDistrito1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDistrito1Boton1() {
        return campoIdDistrito1Boton1;
    }

    public void setCampoIdDistrito1Boton1(Button component) {
        this.campoIdDistrito1Boton1 = component;
    }

    private Button campoIdDistrito1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDistrito1x1Boton1() {
        return campoIdDistrito1x1Boton1;
    }

    public void setCampoIdDistrito1x1Boton1(Button component) {
        this.campoIdDistrito1x1Boton1 = component;
    }

    private Button campoIdDistrito1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDistrito1Boton3() {
        return campoIdDistrito1Boton3;
    }

    public void setCampoIdDistrito1Boton3(Button component) {
        this.campoIdDistrito1Boton3 = component;
    }

    private Button campoIdDistrito1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDistrito1x1Boton3() {
        return campoIdDistrito1x1Boton3;
    }

    public void setCampoIdDistrito1x1Boton3(Button component) {
        this.campoIdDistrito1x1Boton3 = component;
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

    private TableColumn tableColumnNumeroTipoArea1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoArea1() {
        return tableColumnNumeroTipoArea1;
    }

    public void setTableColumnNumeroTipoArea1(TableColumn component) {
        this.tableColumnNumeroTipoArea1 = component;
    }

    private Label labelNumeroTipoArea1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoArea1() {
        return labelNumeroTipoArea1;
    }

    public void setLabelNumeroTipoArea1(Label l) {
        this.labelNumeroTipoArea1 = l;
    }

    private DropDown listaNumeroTipoArea1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoArea1() {
        return listaNumeroTipoArea1;
    }

    public void setListaNumeroTipoArea1(DropDown component) {
        this.listaNumeroTipoArea1 = component;
    }

    private DropDown listaNumeroTipoArea1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoArea1x1() {
        return listaNumeroTipoArea1x1;
    }

    public void setListaNumeroTipoArea1x1(DropDown component) {
        this.listaNumeroTipoArea1x1 = component;
    }

    private StaticText listaNumeroTipoArea1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoArea1Texto1() {
        return listaNumeroTipoArea1Texto1;
    }

    public void setListaNumeroTipoArea1Texto1(StaticText component) {
        this.listaNumeroTipoArea1Texto1 = component;
    }

    private StaticText listaNumeroTipoArea1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoArea1x1Texto1() {
        return listaNumeroTipoArea1x1Texto1;
    }

    public void setListaNumeroTipoArea1x1Texto1(StaticText component) {
        this.listaNumeroTipoArea1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoArea1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoArea1() {
        return converterNumeroTipoArea1;
    }
  
    public void setConverterNumeroTipoArea1(IntegerConverter converter) {
        this.converterNumeroTipoArea1 = converter;
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

    private TextField campoIdBarrio1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdBarrio1x1() {
        return campoIdBarrio1x1;
    }

    public void setCampoIdBarrio1x1(TextField component) {
        this.campoIdBarrio1x1 = component;
    }

    private StaticText campoIdBarrio1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdBarrio1Texto1() {
        return campoIdBarrio1Texto1;
    }

    public void setCampoIdBarrio1Texto1(StaticText component) {
        this.campoIdBarrio1Texto1 = component;
    }

    private StaticText campoIdBarrio1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdBarrio1x1Texto1() {
        return campoIdBarrio1x1Texto1;
    }

    public void setCampoIdBarrio1x1Texto1(StaticText component) {
        this.campoIdBarrio1x1Texto1 = component;
    }

    private Button campoIdBarrio1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdBarrio1Boton1() {
        return campoIdBarrio1Boton1;
    }

    public void setCampoIdBarrio1Boton1(Button component) {
        this.campoIdBarrio1Boton1 = component;
    }

    private Button campoIdBarrio1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdBarrio1x1Boton1() {
        return campoIdBarrio1x1Boton1;
    }

    public void setCampoIdBarrio1x1Boton1(Button component) {
        this.campoIdBarrio1x1Boton1 = component;
    }

    private Button campoIdBarrio1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdBarrio1Boton3() {
        return campoIdBarrio1Boton3;
    }

    public void setCampoIdBarrio1Boton3(Button component) {
        this.campoIdBarrio1Boton3 = component;
    }

    private Button campoIdBarrio1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdBarrio1x1Boton3() {
        return campoIdBarrio1x1Boton3;
    }

    public void setCampoIdBarrio1x1Boton3(Button component) {
        this.campoIdBarrio1x1Boton3 = component;
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

    private TableColumn tableColumnManzana1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnManzana1() {
        return tableColumnManzana1;
    }

    public void setTableColumnManzana1(TableColumn component) {
        this.tableColumnManzana1 = component;
    }

    private Label labelManzana1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelManzana1() {
        return labelManzana1;
    }

    public void setLabelManzana1(Label l) {
        this.labelManzana1 = l;
    }

    private TextField campoManzana1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoManzana1() {
        return campoManzana1;
    }

    public void setCampoManzana1(TextField component) {
        this.campoManzana1 = component;
    }

    private TextField campoManzana1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoManzana1x1() {
        return campoManzana1x1;
    }

    public void setCampoManzana1x1(TextField component) {
        this.campoManzana1x1 = component;
    }

    private StaticText campoManzana1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoManzana1Texto1() {
        return campoManzana1Texto1;
    }

    public void setCampoManzana1Texto1(StaticText component) {
        this.campoManzana1Texto1 = component;
    }

    private StaticText campoManzana1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoManzana1x1Texto1() {
        return campoManzana1x1Texto1;
    }

    public void setCampoManzana1x1Texto1(StaticText component) {
        this.campoManzana1x1Texto1 = component;
    }

    private LengthValidator validatorManzana1 = new LengthValidator();
  
    public LengthValidator getValidatorManzana1() {
        return validatorManzana1;
    }
  
    public void setValidatorManzana1(LengthValidator validator) {
        this.validatorManzana1 = validator;
    }
  
    private TableColumn tableColumnDireccion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnDireccion1() {
        return tableColumnDireccion1;
    }

    public void setTableColumnDireccion1(TableColumn component) {
        this.tableColumnDireccion1 = component;
    }

    private Label labelDireccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDireccion1() {
        return labelDireccion1;
    }

    public void setLabelDireccion1(Label l) {
        this.labelDireccion1 = l;
    }

    private TextArea campoDireccion1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoDireccion1() {
        return campoDireccion1;
    }

    public void setCampoDireccion1(TextArea component) {
        this.campoDireccion1 = component;
    }

    private TextArea campoDireccion1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoDireccion1x1() {
        return campoDireccion1x1;
    }

    public void setCampoDireccion1x1(TextArea component) {
        this.campoDireccion1x1 = component;
    }

    private StaticText campoDireccion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDireccion1Texto1() {
        return campoDireccion1Texto1;
    }

    public void setCampoDireccion1Texto1(StaticText component) {
        this.campoDireccion1Texto1 = component;
    }

    private StaticText campoDireccion1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDireccion1x1Texto1() {
        return campoDireccion1x1Texto1;
    }

    public void setCampoDireccion1x1Texto1(StaticText component) {
        this.campoDireccion1x1Texto1 = component;
    }

    private LengthValidator validatorDireccion1 = new LengthValidator();
  
    public LengthValidator getValidatorDireccion1() {
        return validatorDireccion1;
    }
  
    public void setValidatorDireccion1(LengthValidator validator) {
        this.validatorDireccion1 = validator;
    }
  
    private TableColumn tableColumnTotalPersonas1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnTotalPersonas1() {
        return tableColumnTotalPersonas1;
    }

    public void setTableColumnTotalPersonas1(TableColumn component) {
        this.tableColumnTotalPersonas1 = component;
    }

    private Label labelTotalPersonas1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelTotalPersonas1() {
        return labelTotalPersonas1;
    }

    public void setLabelTotalPersonas1(Label l) {
        this.labelTotalPersonas1 = l;
    }

    private TextField campoTotalPersonas1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoTotalPersonas1() {
        return campoTotalPersonas1;
    }

    public void setCampoTotalPersonas1(TextField component) {
        this.campoTotalPersonas1 = component;
    }

    private TextField campoTotalPersonas1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoTotalPersonas1x1() {
        return campoTotalPersonas1x1;
    }

    public void setCampoTotalPersonas1x1(TextField component) {
        this.campoTotalPersonas1x1 = component;
    }

    private StaticText campoTotalPersonas1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoTotalPersonas1Texto1() {
        return campoTotalPersonas1Texto1;
    }

    public void setCampoTotalPersonas1Texto1(StaticText component) {
        this.campoTotalPersonas1Texto1 = component;
    }

    private StaticText campoTotalPersonas1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoTotalPersonas1x1Texto1() {
        return campoTotalPersonas1x1Texto1;
    }

    public void setCampoTotalPersonas1x1Texto1(StaticText component) {
        this.campoTotalPersonas1x1Texto1 = component;
    }

    private IntegerConverter converterTotalPersonas1 = new IntegerConverter();
  
    public IntegerConverter getConverterTotalPersonas1() {
        return converterTotalPersonas1;
    }
  
    public void setConverterTotalPersonas1(IntegerConverter converter) {
        this.converterTotalPersonas1 = converter;
    }
  
    private LongRangeValidator validatorTotalPersonas1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorTotalPersonas1() {
        return validatorTotalPersonas1;
    }
  
    public void setValidatorTotalPersonas1(LongRangeValidator validator) {
        this.validatorTotalPersonas1 = validator;
    }
  
    private TableColumn tableColumnTotalHombres1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnTotalHombres1() {
        return tableColumnTotalHombres1;
    }

    public void setTableColumnTotalHombres1(TableColumn component) {
        this.tableColumnTotalHombres1 = component;
    }

    private Label labelTotalHombres1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelTotalHombres1() {
        return labelTotalHombres1;
    }

    public void setLabelTotalHombres1(Label l) {
        this.labelTotalHombres1 = l;
    }

    private TextField campoTotalHombres1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoTotalHombres1() {
        return campoTotalHombres1;
    }

    public void setCampoTotalHombres1(TextField component) {
        this.campoTotalHombres1 = component;
    }

    private TextField campoTotalHombres1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoTotalHombres1x1() {
        return campoTotalHombres1x1;
    }

    public void setCampoTotalHombres1x1(TextField component) {
        this.campoTotalHombres1x1 = component;
    }

    private StaticText campoTotalHombres1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoTotalHombres1Texto1() {
        return campoTotalHombres1Texto1;
    }

    public void setCampoTotalHombres1Texto1(StaticText component) {
        this.campoTotalHombres1Texto1 = component;
    }

    private StaticText campoTotalHombres1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoTotalHombres1x1Texto1() {
        return campoTotalHombres1x1Texto1;
    }

    public void setCampoTotalHombres1x1Texto1(StaticText component) {
        this.campoTotalHombres1x1Texto1 = component;
    }

    private IntegerConverter converterTotalHombres1 = new IntegerConverter();
  
    public IntegerConverter getConverterTotalHombres1() {
        return converterTotalHombres1;
    }
  
    public void setConverterTotalHombres1(IntegerConverter converter) {
        this.converterTotalHombres1 = converter;
    }
  
    private LongRangeValidator validatorTotalHombres1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorTotalHombres1() {
        return validatorTotalHombres1;
    }
  
    public void setValidatorTotalHombres1(LongRangeValidator validator) {
        this.validatorTotalHombres1 = validator;
    }
  
    private TableColumn tableColumnTotalMujeres1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnTotalMujeres1() {
        return tableColumnTotalMujeres1;
    }

    public void setTableColumnTotalMujeres1(TableColumn component) {
        this.tableColumnTotalMujeres1 = component;
    }

    private Label labelTotalMujeres1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelTotalMujeres1() {
        return labelTotalMujeres1;
    }

    public void setLabelTotalMujeres1(Label l) {
        this.labelTotalMujeres1 = l;
    }

    private TextField campoTotalMujeres1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoTotalMujeres1() {
        return campoTotalMujeres1;
    }

    public void setCampoTotalMujeres1(TextField component) {
        this.campoTotalMujeres1 = component;
    }

    private TextField campoTotalMujeres1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoTotalMujeres1x1() {
        return campoTotalMujeres1x1;
    }

    public void setCampoTotalMujeres1x1(TextField component) {
        this.campoTotalMujeres1x1 = component;
    }

    private StaticText campoTotalMujeres1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoTotalMujeres1Texto1() {
        return campoTotalMujeres1Texto1;
    }

    public void setCampoTotalMujeres1Texto1(StaticText component) {
        this.campoTotalMujeres1Texto1 = component;
    }

    private StaticText campoTotalMujeres1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoTotalMujeres1x1Texto1() {
        return campoTotalMujeres1x1Texto1;
    }

    public void setCampoTotalMujeres1x1Texto1(StaticText component) {
        this.campoTotalMujeres1x1Texto1 = component;
    }

    private IntegerConverter converterTotalMujeres1 = new IntegerConverter();
  
    public IntegerConverter getConverterTotalMujeres1() {
        return converterTotalMujeres1;
    }
  
    public void setConverterTotalMujeres1(IntegerConverter converter) {
        this.converterTotalMujeres1 = converter;
    }
  
    private LongRangeValidator validatorTotalMujeres1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorTotalMujeres1() {
        return validatorTotalMujeres1;
    }
  
    public void setValidatorTotalMujeres1(LongRangeValidator validator) {
        this.validatorTotalMujeres1 = validator;
    }
  
    private TableColumn tableColumnNumeroTipoMatParedes1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoMatParedes1() {
        return tableColumnNumeroTipoMatParedes1;
    }

    public void setTableColumnNumeroTipoMatParedes1(TableColumn component) {
        this.tableColumnNumeroTipoMatParedes1 = component;
    }

    private Label labelNumeroTipoMatParedes1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoMatParedes1() {
        return labelNumeroTipoMatParedes1;
    }

    public void setLabelNumeroTipoMatParedes1(Label l) {
        this.labelNumeroTipoMatParedes1 = l;
    }

    private DropDown listaNumeroTipoMatParedes1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoMatParedes1() {
        return listaNumeroTipoMatParedes1;
    }

    public void setListaNumeroTipoMatParedes1(DropDown component) {
        this.listaNumeroTipoMatParedes1 = component;
    }

    private DropDown listaNumeroTipoMatParedes1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoMatParedes1x1() {
        return listaNumeroTipoMatParedes1x1;
    }

    public void setListaNumeroTipoMatParedes1x1(DropDown component) {
        this.listaNumeroTipoMatParedes1x1 = component;
    }

    private StaticText listaNumeroTipoMatParedes1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoMatParedes1Texto1() {
        return listaNumeroTipoMatParedes1Texto1;
    }

    public void setListaNumeroTipoMatParedes1Texto1(StaticText component) {
        this.listaNumeroTipoMatParedes1Texto1 = component;
    }

    private StaticText listaNumeroTipoMatParedes1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoMatParedes1x1Texto1() {
        return listaNumeroTipoMatParedes1x1Texto1;
    }

    public void setListaNumeroTipoMatParedes1x1Texto1(StaticText component) {
        this.listaNumeroTipoMatParedes1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoMatParedes1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoMatParedes1() {
        return converterNumeroTipoMatParedes1;
    }
  
    public void setConverterNumeroTipoMatParedes1(IntegerConverter converter) {
        this.converterNumeroTipoMatParedes1 = converter;
    }
  
    private TableColumn tableColumnNumeroTipoMatPiso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoMatPiso1() {
        return tableColumnNumeroTipoMatPiso1;
    }

    public void setTableColumnNumeroTipoMatPiso1(TableColumn component) {
        this.tableColumnNumeroTipoMatPiso1 = component;
    }

    private Label labelNumeroTipoMatPiso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoMatPiso1() {
        return labelNumeroTipoMatPiso1;
    }

    public void setLabelNumeroTipoMatPiso1(Label l) {
        this.labelNumeroTipoMatPiso1 = l;
    }

    private DropDown listaNumeroTipoMatPiso1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoMatPiso1() {
        return listaNumeroTipoMatPiso1;
    }

    public void setListaNumeroTipoMatPiso1(DropDown component) {
        this.listaNumeroTipoMatPiso1 = component;
    }

    private DropDown listaNumeroTipoMatPiso1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoMatPiso1x1() {
        return listaNumeroTipoMatPiso1x1;
    }

    public void setListaNumeroTipoMatPiso1x1(DropDown component) {
        this.listaNumeroTipoMatPiso1x1 = component;
    }

    private StaticText listaNumeroTipoMatPiso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoMatPiso1Texto1() {
        return listaNumeroTipoMatPiso1Texto1;
    }

    public void setListaNumeroTipoMatPiso1Texto1(StaticText component) {
        this.listaNumeroTipoMatPiso1Texto1 = component;
    }

    private StaticText listaNumeroTipoMatPiso1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoMatPiso1x1Texto1() {
        return listaNumeroTipoMatPiso1x1Texto1;
    }

    public void setListaNumeroTipoMatPiso1x1Texto1(StaticText component) {
        this.listaNumeroTipoMatPiso1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoMatPiso1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoMatPiso1() {
        return converterNumeroTipoMatPiso1;
    }
  
    public void setConverterNumeroTipoMatPiso1(IntegerConverter converter) {
        this.converterNumeroTipoMatPiso1 = converter;
    }
  
    private TableColumn tableColumnNumeroTipoMatTecho1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoMatTecho1() {
        return tableColumnNumeroTipoMatTecho1;
    }

    public void setTableColumnNumeroTipoMatTecho1(TableColumn component) {
        this.tableColumnNumeroTipoMatTecho1 = component;
    }

    private Label labelNumeroTipoMatTecho1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoMatTecho1() {
        return labelNumeroTipoMatTecho1;
    }

    public void setLabelNumeroTipoMatTecho1(Label l) {
        this.labelNumeroTipoMatTecho1 = l;
    }

    private DropDown listaNumeroTipoMatTecho1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoMatTecho1() {
        return listaNumeroTipoMatTecho1;
    }

    public void setListaNumeroTipoMatTecho1(DropDown component) {
        this.listaNumeroTipoMatTecho1 = component;
    }

    private DropDown listaNumeroTipoMatTecho1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoMatTecho1x1() {
        return listaNumeroTipoMatTecho1x1;
    }

    public void setListaNumeroTipoMatTecho1x1(DropDown component) {
        this.listaNumeroTipoMatTecho1x1 = component;
    }

    private StaticText listaNumeroTipoMatTecho1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoMatTecho1Texto1() {
        return listaNumeroTipoMatTecho1Texto1;
    }

    public void setListaNumeroTipoMatTecho1Texto1(StaticText component) {
        this.listaNumeroTipoMatTecho1Texto1 = component;
    }

    private StaticText listaNumeroTipoMatTecho1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoMatTecho1x1Texto1() {
        return listaNumeroTipoMatTecho1x1Texto1;
    }

    public void setListaNumeroTipoMatTecho1x1Texto1(StaticText component) {
        this.listaNumeroTipoMatTecho1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoMatTecho1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoMatTecho1() {
        return converterNumeroTipoMatTecho1;
    }
  
    public void setConverterNumeroTipoMatTecho1(IntegerConverter converter) {
        this.converterNumeroTipoMatTecho1 = converter;
    }
  
    private TableColumn tableColumnNumeroTipoOcupacionViv1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoOcupacionViv1() {
        return tableColumnNumeroTipoOcupacionViv1;
    }

    public void setTableColumnNumeroTipoOcupacionViv1(TableColumn component) {
        this.tableColumnNumeroTipoOcupacionViv1 = component;
    }

    private Label labelNumeroTipoOcupacionViv1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoOcupacionViv1() {
        return labelNumeroTipoOcupacionViv1;
    }

    public void setLabelNumeroTipoOcupacionViv1(Label l) {
        this.labelNumeroTipoOcupacionViv1 = l;
    }

    private DropDown listaNumeroTipoOcupacionViv1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoOcupacionViv1() {
        return listaNumeroTipoOcupacionViv1;
    }

    public void setListaNumeroTipoOcupacionViv1(DropDown component) {
        this.listaNumeroTipoOcupacionViv1 = component;
    }

    private DropDown listaNumeroTipoOcupacionViv1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoOcupacionViv1x1() {
        return listaNumeroTipoOcupacionViv1x1;
    }

    public void setListaNumeroTipoOcupacionViv1x1(DropDown component) {
        this.listaNumeroTipoOcupacionViv1x1 = component;
    }

    private StaticText listaNumeroTipoOcupacionViv1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoOcupacionViv1Texto1() {
        return listaNumeroTipoOcupacionViv1Texto1;
    }

    public void setListaNumeroTipoOcupacionViv1Texto1(StaticText component) {
        this.listaNumeroTipoOcupacionViv1Texto1 = component;
    }

    private StaticText listaNumeroTipoOcupacionViv1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoOcupacionViv1x1Texto1() {
        return listaNumeroTipoOcupacionViv1x1Texto1;
    }

    public void setListaNumeroTipoOcupacionViv1x1Texto1(StaticText component) {
        this.listaNumeroTipoOcupacionViv1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoOcupacionViv1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoOcupacionViv1() {
        return converterNumeroTipoOcupacionViv1;
    }
  
    public void setConverterNumeroTipoOcupacionViv1(IntegerConverter converter) {
        this.converterNumeroTipoOcupacionViv1 = converter;
    }
  
    private TableColumn tableColumnOtroTipoOcupacionViv1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnOtroTipoOcupacionViv1() {
        return tableColumnOtroTipoOcupacionViv1;
    }

    public void setTableColumnOtroTipoOcupacionViv1(TableColumn component) {
        this.tableColumnOtroTipoOcupacionViv1 = component;
    }

    private Label labelOtroTipoOcupacionViv1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtroTipoOcupacionViv1() {
        return labelOtroTipoOcupacionViv1;
    }

    public void setLabelOtroTipoOcupacionViv1(Label l) {
        this.labelOtroTipoOcupacionViv1 = l;
    }

    private TextField campoOtroTipoOcupacionViv1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOtroTipoOcupacionViv1() {
        return campoOtroTipoOcupacionViv1;
    }

    public void setCampoOtroTipoOcupacionViv1(TextField component) {
        this.campoOtroTipoOcupacionViv1 = component;
    }

    private TextField campoOtroTipoOcupacionViv1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtroTipoOcupacionViv1x1() {
        return campoOtroTipoOcupacionViv1x1;
    }

    public void setCampoOtroTipoOcupacionViv1x1(TextField component) {
        this.campoOtroTipoOcupacionViv1x1 = component;
    }

    private StaticText campoOtroTipoOcupacionViv1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtroTipoOcupacionViv1Texto1() {
        return campoOtroTipoOcupacionViv1Texto1;
    }

    public void setCampoOtroTipoOcupacionViv1Texto1(StaticText component) {
        this.campoOtroTipoOcupacionViv1Texto1 = component;
    }

    private StaticText campoOtroTipoOcupacionViv1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtroTipoOcupacionViv1x1Texto1() {
        return campoOtroTipoOcupacionViv1x1Texto1;
    }

    public void setCampoOtroTipoOcupacionViv1x1Texto1(StaticText component) {
        this.campoOtroTipoOcupacionViv1x1Texto1 = component;
    }

    private LengthValidator validatorOtroTipoOcupacionViv1 = new LengthValidator();
  
    public LengthValidator getValidatorOtroTipoOcupacionViv1() {
        return validatorOtroTipoOcupacionViv1;
    }
  
    public void setValidatorOtroTipoOcupacionViv1(LengthValidator validator) {
        this.validatorOtroTipoOcupacionViv1 = validator;
    }
  
    private TableColumn tableColumnCantidadPiezas1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCantidadPiezas1() {
        return tableColumnCantidadPiezas1;
    }

    public void setTableColumnCantidadPiezas1(TableColumn component) {
        this.tableColumnCantidadPiezas1 = component;
    }

    private Label labelCantidadPiezas1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCantidadPiezas1() {
        return labelCantidadPiezas1;
    }

    public void setLabelCantidadPiezas1(Label l) {
        this.labelCantidadPiezas1 = l;
    }

    private TextField campoCantidadPiezas1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCantidadPiezas1() {
        return campoCantidadPiezas1;
    }

    public void setCampoCantidadPiezas1(TextField component) {
        this.campoCantidadPiezas1 = component;
    }

    private TextField campoCantidadPiezas1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoCantidadPiezas1x1() {
        return campoCantidadPiezas1x1;
    }

    public void setCampoCantidadPiezas1x1(TextField component) {
        this.campoCantidadPiezas1x1 = component;
    }

    private StaticText campoCantidadPiezas1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCantidadPiezas1Texto1() {
        return campoCantidadPiezas1Texto1;
    }

    public void setCampoCantidadPiezas1Texto1(StaticText component) {
        this.campoCantidadPiezas1Texto1 = component;
    }

    private StaticText campoCantidadPiezas1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCantidadPiezas1x1Texto1() {
        return campoCantidadPiezas1x1Texto1;
    }

    public void setCampoCantidadPiezas1x1Texto1(StaticText component) {
        this.campoCantidadPiezas1x1Texto1 = component;
    }

    private IntegerConverter converterCantidadPiezas1 = new IntegerConverter();
  
    public IntegerConverter getConverterCantidadPiezas1() {
        return converterCantidadPiezas1;
    }
  
    public void setConverterCantidadPiezas1(IntegerConverter converter) {
        this.converterCantidadPiezas1 = converter;
    }
  
    private LongRangeValidator validatorCantidadPiezas1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorCantidadPiezas1() {
        return validatorCantidadPiezas1;
    }
  
    public void setValidatorCantidadPiezas1(LongRangeValidator validator) {
        this.validatorCantidadPiezas1 = validator;
    }
  
    private TableColumn tableColumnCantidadDormitorios1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCantidadDormitorios1() {
        return tableColumnCantidadDormitorios1;
    }

    public void setTableColumnCantidadDormitorios1(TableColumn component) {
        this.tableColumnCantidadDormitorios1 = component;
    }

    private Label labelCantidadDormitorios1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCantidadDormitorios1() {
        return labelCantidadDormitorios1;
    }

    public void setLabelCantidadDormitorios1(Label l) {
        this.labelCantidadDormitorios1 = l;
    }

    private TextField campoCantidadDormitorios1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCantidadDormitorios1() {
        return campoCantidadDormitorios1;
    }

    public void setCampoCantidadDormitorios1(TextField component) {
        this.campoCantidadDormitorios1 = component;
    }

    private TextField campoCantidadDormitorios1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoCantidadDormitorios1x1() {
        return campoCantidadDormitorios1x1;
    }

    public void setCampoCantidadDormitorios1x1(TextField component) {
        this.campoCantidadDormitorios1x1 = component;
    }

    private StaticText campoCantidadDormitorios1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCantidadDormitorios1Texto1() {
        return campoCantidadDormitorios1Texto1;
    }

    public void setCampoCantidadDormitorios1Texto1(StaticText component) {
        this.campoCantidadDormitorios1Texto1 = component;
    }

    private StaticText campoCantidadDormitorios1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCantidadDormitorios1x1Texto1() {
        return campoCantidadDormitorios1x1Texto1;
    }

    public void setCampoCantidadDormitorios1x1Texto1(StaticText component) {
        this.campoCantidadDormitorios1x1Texto1 = component;
    }

    private IntegerConverter converterCantidadDormitorios1 = new IntegerConverter();
  
    public IntegerConverter getConverterCantidadDormitorios1() {
        return converterCantidadDormitorios1;
    }
  
    public void setConverterCantidadDormitorios1(IntegerConverter converter) {
        this.converterCantidadDormitorios1 = converter;
    }
  
    private LongRangeValidator validatorCantidadDormitorios1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorCantidadDormitorios1() {
        return validatorCantidadDormitorios1;
    }
  
    public void setValidatorCantidadDormitorios1(LongRangeValidator validator) {
        this.validatorCantidadDormitorios1 = validator;
    }
  
    private TableColumn tableColumnNumeroSionoPiezaCocina1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroSionoPiezaCocina1() {
        return tableColumnNumeroSionoPiezaCocina1;
    }

    public void setTableColumnNumeroSionoPiezaCocina1(TableColumn component) {
        this.tableColumnNumeroSionoPiezaCocina1 = component;
    }

    private Label labelNumeroSionoPiezaCocina1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoPiezaCocina1() {
        return labelNumeroSionoPiezaCocina1;
    }

    public void setLabelNumeroSionoPiezaCocina1(Label l) {
        this.labelNumeroSionoPiezaCocina1 = l;
    }

    private DropDown listaNumeroSionoPiezaCocina1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoPiezaCocina1() {
        return listaNumeroSionoPiezaCocina1;
    }

    public void setListaNumeroSionoPiezaCocina1(DropDown component) {
        this.listaNumeroSionoPiezaCocina1 = component;
    }

    private DropDown listaNumeroSionoPiezaCocina1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoPiezaCocina1x1() {
        return listaNumeroSionoPiezaCocina1x1;
    }

    public void setListaNumeroSionoPiezaCocina1x1(DropDown component) {
        this.listaNumeroSionoPiezaCocina1x1 = component;
    }

    private StaticText listaNumeroSionoPiezaCocina1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoPiezaCocina1Texto1() {
        return listaNumeroSionoPiezaCocina1Texto1;
    }

    public void setListaNumeroSionoPiezaCocina1Texto1(StaticText component) {
        this.listaNumeroSionoPiezaCocina1Texto1 = component;
    }

    private StaticText listaNumeroSionoPiezaCocina1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoPiezaCocina1x1Texto1() {
        return listaNumeroSionoPiezaCocina1x1Texto1;
    }

    public void setListaNumeroSionoPiezaCocina1x1Texto1(StaticText component) {
        this.listaNumeroSionoPiezaCocina1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoPiezaCocina1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoPiezaCocina1() {
        return converterNumeroSionoPiezaCocina1;
    }
  
    public void setConverterNumeroSionoPiezaCocina1(IntegerConverter converter) {
        this.converterNumeroSionoPiezaCocina1 = converter;
    }
  
    private TableColumn tableColumnNumeroTipoCombustible1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoCombustible1() {
        return tableColumnNumeroTipoCombustible1;
    }

    public void setTableColumnNumeroTipoCombustible1(TableColumn component) {
        this.tableColumnNumeroTipoCombustible1 = component;
    }

    private Label labelNumeroTipoCombustible1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoCombustible1() {
        return labelNumeroTipoCombustible1;
    }

    public void setLabelNumeroTipoCombustible1(Label l) {
        this.labelNumeroTipoCombustible1 = l;
    }

    private DropDown listaNumeroTipoCombustible1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoCombustible1() {
        return listaNumeroTipoCombustible1;
    }

    public void setListaNumeroTipoCombustible1(DropDown component) {
        this.listaNumeroTipoCombustible1 = component;
    }

    private DropDown listaNumeroTipoCombustible1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoCombustible1x1() {
        return listaNumeroTipoCombustible1x1;
    }

    public void setListaNumeroTipoCombustible1x1(DropDown component) {
        this.listaNumeroTipoCombustible1x1 = component;
    }

    private StaticText listaNumeroTipoCombustible1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoCombustible1Texto1() {
        return listaNumeroTipoCombustible1Texto1;
    }

    public void setListaNumeroTipoCombustible1Texto1(StaticText component) {
        this.listaNumeroTipoCombustible1Texto1 = component;
    }

    private StaticText listaNumeroTipoCombustible1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoCombustible1x1Texto1() {
        return listaNumeroTipoCombustible1x1Texto1;
    }

    public void setListaNumeroTipoCombustible1x1Texto1(StaticText component) {
        this.listaNumeroTipoCombustible1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoCombustible1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoCombustible1() {
        return converterNumeroTipoCombustible1;
    }
  
    public void setConverterNumeroTipoCombustible1(IntegerConverter converter) {
        this.converterNumeroTipoCombustible1 = converter;
    }
  
    private TableColumn tableColumnNumeroTipoPiezaBano1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoPiezaBano1() {
        return tableColumnNumeroTipoPiezaBano1;
    }

    public void setTableColumnNumeroTipoPiezaBano1(TableColumn component) {
        this.tableColumnNumeroTipoPiezaBano1 = component;
    }

    private Label labelNumeroTipoPiezaBano1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoPiezaBano1() {
        return labelNumeroTipoPiezaBano1;
    }

    public void setLabelNumeroTipoPiezaBano1(Label l) {
        this.labelNumeroTipoPiezaBano1 = l;
    }

    private DropDown listaNumeroTipoPiezaBano1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoPiezaBano1() {
        return listaNumeroTipoPiezaBano1;
    }

    public void setListaNumeroTipoPiezaBano1(DropDown component) {
        this.listaNumeroTipoPiezaBano1 = component;
    }

    private DropDown listaNumeroTipoPiezaBano1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoPiezaBano1x1() {
        return listaNumeroTipoPiezaBano1x1;
    }

    public void setListaNumeroTipoPiezaBano1x1(DropDown component) {
        this.listaNumeroTipoPiezaBano1x1 = component;
    }

    private StaticText listaNumeroTipoPiezaBano1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoPiezaBano1Texto1() {
        return listaNumeroTipoPiezaBano1Texto1;
    }

    public void setListaNumeroTipoPiezaBano1Texto1(StaticText component) {
        this.listaNumeroTipoPiezaBano1Texto1 = component;
    }

    private StaticText listaNumeroTipoPiezaBano1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoPiezaBano1x1Texto1() {
        return listaNumeroTipoPiezaBano1x1Texto1;
    }

    public void setListaNumeroTipoPiezaBano1x1Texto1(StaticText component) {
        this.listaNumeroTipoPiezaBano1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoPiezaBano1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoPiezaBano1() {
        return converterNumeroTipoPiezaBano1;
    }
  
    public void setConverterNumeroTipoPiezaBano1(IntegerConverter converter) {
        this.converterNumeroTipoPiezaBano1 = converter;
    }
  
    private TableColumn tableColumnNumeroTipoServicioSan1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoServicioSan1() {
        return tableColumnNumeroTipoServicioSan1;
    }

    public void setTableColumnNumeroTipoServicioSan1(TableColumn component) {
        this.tableColumnNumeroTipoServicioSan1 = component;
    }

    private Label labelNumeroTipoServicioSan1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoServicioSan1() {
        return labelNumeroTipoServicioSan1;
    }

    public void setLabelNumeroTipoServicioSan1(Label l) {
        this.labelNumeroTipoServicioSan1 = l;
    }

    private DropDown listaNumeroTipoServicioSan1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoServicioSan1() {
        return listaNumeroTipoServicioSan1;
    }

    public void setListaNumeroTipoServicioSan1(DropDown component) {
        this.listaNumeroTipoServicioSan1 = component;
    }

    private DropDown listaNumeroTipoServicioSan1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoServicioSan1x1() {
        return listaNumeroTipoServicioSan1x1;
    }

    public void setListaNumeroTipoServicioSan1x1(DropDown component) {
        this.listaNumeroTipoServicioSan1x1 = component;
    }

    private StaticText listaNumeroTipoServicioSan1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoServicioSan1Texto1() {
        return listaNumeroTipoServicioSan1Texto1;
    }

    public void setListaNumeroTipoServicioSan1Texto1(StaticText component) {
        this.listaNumeroTipoServicioSan1Texto1 = component;
    }

    private StaticText listaNumeroTipoServicioSan1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoServicioSan1x1Texto1() {
        return listaNumeroTipoServicioSan1x1Texto1;
    }

    public void setListaNumeroTipoServicioSan1x1Texto1(StaticText component) {
        this.listaNumeroTipoServicioSan1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoServicioSan1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoServicioSan1() {
        return converterNumeroTipoServicioSan1;
    }
  
    public void setConverterNumeroTipoServicioSan1(IntegerConverter converter) {
        this.converterNumeroTipoServicioSan1 = converter;
    }
  
    private TableColumn tableColumnNumeroTipoServicioAgua1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoServicioAgua1() {
        return tableColumnNumeroTipoServicioAgua1;
    }

    public void setTableColumnNumeroTipoServicioAgua1(TableColumn component) {
        this.tableColumnNumeroTipoServicioAgua1 = component;
    }

    private Label labelNumeroTipoServicioAgua1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoServicioAgua1() {
        return labelNumeroTipoServicioAgua1;
    }

    public void setLabelNumeroTipoServicioAgua1(Label l) {
        this.labelNumeroTipoServicioAgua1 = l;
    }

    private DropDown listaNumeroTipoServicioAgua1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoServicioAgua1() {
        return listaNumeroTipoServicioAgua1;
    }

    public void setListaNumeroTipoServicioAgua1(DropDown component) {
        this.listaNumeroTipoServicioAgua1 = component;
    }

    private DropDown listaNumeroTipoServicioAgua1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoServicioAgua1x1() {
        return listaNumeroTipoServicioAgua1x1;
    }

    public void setListaNumeroTipoServicioAgua1x1(DropDown component) {
        this.listaNumeroTipoServicioAgua1x1 = component;
    }

    private StaticText listaNumeroTipoServicioAgua1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoServicioAgua1Texto1() {
        return listaNumeroTipoServicioAgua1Texto1;
    }

    public void setListaNumeroTipoServicioAgua1Texto1(StaticText component) {
        this.listaNumeroTipoServicioAgua1Texto1 = component;
    }

    private StaticText listaNumeroTipoServicioAgua1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoServicioAgua1x1Texto1() {
        return listaNumeroTipoServicioAgua1x1Texto1;
    }

    public void setListaNumeroTipoServicioAgua1x1Texto1(StaticText component) {
        this.listaNumeroTipoServicioAgua1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoServicioAgua1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoServicioAgua1() {
        return converterNumeroTipoServicioAgua1;
    }
  
    public void setConverterNumeroTipoServicioAgua1(IntegerConverter converter) {
        this.converterNumeroTipoServicioAgua1 = converter;
    }
  
    private TableColumn tableColumnNumeroTipoAbaAgua1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoAbaAgua1() {
        return tableColumnNumeroTipoAbaAgua1;
    }

    public void setTableColumnNumeroTipoAbaAgua1(TableColumn component) {
        this.tableColumnNumeroTipoAbaAgua1 = component;
    }

    private Label labelNumeroTipoAbaAgua1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoAbaAgua1() {
        return labelNumeroTipoAbaAgua1;
    }

    public void setLabelNumeroTipoAbaAgua1(Label l) {
        this.labelNumeroTipoAbaAgua1 = l;
    }

    private DropDown listaNumeroTipoAbaAgua1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoAbaAgua1() {
        return listaNumeroTipoAbaAgua1;
    }

    public void setListaNumeroTipoAbaAgua1(DropDown component) {
        this.listaNumeroTipoAbaAgua1 = component;
    }

    private DropDown listaNumeroTipoAbaAgua1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoAbaAgua1x1() {
        return listaNumeroTipoAbaAgua1x1;
    }

    public void setListaNumeroTipoAbaAgua1x1(DropDown component) {
        this.listaNumeroTipoAbaAgua1x1 = component;
    }

    private StaticText listaNumeroTipoAbaAgua1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoAbaAgua1Texto1() {
        return listaNumeroTipoAbaAgua1Texto1;
    }

    public void setListaNumeroTipoAbaAgua1Texto1(StaticText component) {
        this.listaNumeroTipoAbaAgua1Texto1 = component;
    }

    private StaticText listaNumeroTipoAbaAgua1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoAbaAgua1x1Texto1() {
        return listaNumeroTipoAbaAgua1x1Texto1;
    }

    public void setListaNumeroTipoAbaAgua1x1Texto1(StaticText component) {
        this.listaNumeroTipoAbaAgua1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoAbaAgua1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoAbaAgua1() {
        return converterNumeroTipoAbaAgua1;
    }
  
    public void setConverterNumeroTipoAbaAgua1(IntegerConverter converter) {
        this.converterNumeroTipoAbaAgua1 = converter;
    }
  
    private TableColumn tableColumnNumeroSionoCorrienteElec1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroSionoCorrienteElec1() {
        return tableColumnNumeroSionoCorrienteElec1;
    }

    public void setTableColumnNumeroSionoCorrienteElec1(TableColumn component) {
        this.tableColumnNumeroSionoCorrienteElec1 = component;
    }

    private Label labelNumeroSionoCorrienteElec1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoCorrienteElec1() {
        return labelNumeroSionoCorrienteElec1;
    }

    public void setLabelNumeroSionoCorrienteElec1(Label l) {
        this.labelNumeroSionoCorrienteElec1 = l;
    }

    private DropDown listaNumeroSionoCorrienteElec1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoCorrienteElec1() {
        return listaNumeroSionoCorrienteElec1;
    }

    public void setListaNumeroSionoCorrienteElec1(DropDown component) {
        this.listaNumeroSionoCorrienteElec1 = component;
    }

    private DropDown listaNumeroSionoCorrienteElec1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoCorrienteElec1x1() {
        return listaNumeroSionoCorrienteElec1x1;
    }

    public void setListaNumeroSionoCorrienteElec1x1(DropDown component) {
        this.listaNumeroSionoCorrienteElec1x1 = component;
    }

    private StaticText listaNumeroSionoCorrienteElec1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoCorrienteElec1Texto1() {
        return listaNumeroSionoCorrienteElec1Texto1;
    }

    public void setListaNumeroSionoCorrienteElec1Texto1(StaticText component) {
        this.listaNumeroSionoCorrienteElec1Texto1 = component;
    }

    private StaticText listaNumeroSionoCorrienteElec1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoCorrienteElec1x1Texto1() {
        return listaNumeroSionoCorrienteElec1x1Texto1;
    }

    public void setListaNumeroSionoCorrienteElec1x1Texto1(StaticText component) {
        this.listaNumeroSionoCorrienteElec1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoCorrienteElec1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoCorrienteElec1() {
        return converterNumeroSionoCorrienteElec1;
    }
  
    public void setConverterNumeroSionoCorrienteElec1(IntegerConverter converter) {
        this.converterNumeroSionoCorrienteElec1 = converter;
    }
  
    private TableColumn tableColumnNumeroTipoDesechoBas1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoDesechoBas1() {
        return tableColumnNumeroTipoDesechoBas1;
    }

    public void setTableColumnNumeroTipoDesechoBas1(TableColumn component) {
        this.tableColumnNumeroTipoDesechoBas1 = component;
    }

    private Label labelNumeroTipoDesechoBas1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoDesechoBas1() {
        return labelNumeroTipoDesechoBas1;
    }

    public void setLabelNumeroTipoDesechoBas1(Label l) {
        this.labelNumeroTipoDesechoBas1 = l;
    }

    private DropDown listaNumeroTipoDesechoBas1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoDesechoBas1() {
        return listaNumeroTipoDesechoBas1;
    }

    public void setListaNumeroTipoDesechoBas1(DropDown component) {
        this.listaNumeroTipoDesechoBas1 = component;
    }

    private DropDown listaNumeroTipoDesechoBas1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoDesechoBas1x1() {
        return listaNumeroTipoDesechoBas1x1;
    }

    public void setListaNumeroTipoDesechoBas1x1(DropDown component) {
        this.listaNumeroTipoDesechoBas1x1 = component;
    }

    private StaticText listaNumeroTipoDesechoBas1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoDesechoBas1Texto1() {
        return listaNumeroTipoDesechoBas1Texto1;
    }

    public void setListaNumeroTipoDesechoBas1Texto1(StaticText component) {
        this.listaNumeroTipoDesechoBas1Texto1 = component;
    }

    private StaticText listaNumeroTipoDesechoBas1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoDesechoBas1x1Texto1() {
        return listaNumeroTipoDesechoBas1x1Texto1;
    }

    public void setListaNumeroTipoDesechoBas1x1Texto1(StaticText component) {
        this.listaNumeroTipoDesechoBas1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoDesechoBas1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoDesechoBas1() {
        return converterNumeroTipoDesechoBas1;
    }
  
    public void setConverterNumeroTipoDesechoBas1(IntegerConverter converter) {
        this.converterNumeroTipoDesechoBas1 = converter;
    }
  
    private TableColumn tableColumnNumeroSionoTelefonoCelular1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroSionoTelefonoCelular1() {
        return tableColumnNumeroSionoTelefonoCelular1;
    }

    public void setTableColumnNumeroSionoTelefonoCelular1(TableColumn component) {
        this.tableColumnNumeroSionoTelefonoCelular1 = component;
    }

    private Label labelNumeroSionoTelefonoCelular1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoTelefonoCelular1() {
        return labelNumeroSionoTelefonoCelular1;
    }

    public void setLabelNumeroSionoTelefonoCelular1(Label l) {
        this.labelNumeroSionoTelefonoCelular1 = l;
    }

    private DropDown listaNumeroSionoTelefonoCelular1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoTelefonoCelular1() {
        return listaNumeroSionoTelefonoCelular1;
    }

    public void setListaNumeroSionoTelefonoCelular1(DropDown component) {
        this.listaNumeroSionoTelefonoCelular1 = component;
    }

    private DropDown listaNumeroSionoTelefonoCelular1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoTelefonoCelular1x1() {
        return listaNumeroSionoTelefonoCelular1x1;
    }

    public void setListaNumeroSionoTelefonoCelular1x1(DropDown component) {
        this.listaNumeroSionoTelefonoCelular1x1 = component;
    }

    private StaticText listaNumeroSionoTelefonoCelular1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoTelefonoCelular1Texto1() {
        return listaNumeroSionoTelefonoCelular1Texto1;
    }

    public void setListaNumeroSionoTelefonoCelular1Texto1(StaticText component) {
        this.listaNumeroSionoTelefonoCelular1Texto1 = component;
    }

    private StaticText listaNumeroSionoTelefonoCelular1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoTelefonoCelular1x1Texto1() {
        return listaNumeroSionoTelefonoCelular1x1Texto1;
    }

    public void setListaNumeroSionoTelefonoCelular1x1Texto1(StaticText component) {
        this.listaNumeroSionoTelefonoCelular1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoTelefonoCelular1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoTelefonoCelular1() {
        return converterNumeroSionoTelefonoCelular1;
    }
  
    public void setConverterNumeroSionoTelefonoCelular1(IntegerConverter converter) {
        this.converterNumeroSionoTelefonoCelular1 = converter;
    }
  
    private TableColumn tableColumnNumeroTelefonoCelular1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTelefonoCelular1() {
        return tableColumnNumeroTelefonoCelular1;
    }

    public void setTableColumnNumeroTelefonoCelular1(TableColumn component) {
        this.tableColumnNumeroTelefonoCelular1 = component;
    }

    private Label labelNumeroTelefonoCelular1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTelefonoCelular1() {
        return labelNumeroTelefonoCelular1;
    }

    public void setLabelNumeroTelefonoCelular1(Label l) {
        this.labelNumeroTelefonoCelular1 = l;
    }

    private TextField campoNumeroTelefonoCelular1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroTelefonoCelular1() {
        return campoNumeroTelefonoCelular1;
    }

    public void setCampoNumeroTelefonoCelular1(TextField component) {
        this.campoNumeroTelefonoCelular1 = component;
    }

    private TextField campoNumeroTelefonoCelular1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroTelefonoCelular1x1() {
        return campoNumeroTelefonoCelular1x1;
    }

    public void setCampoNumeroTelefonoCelular1x1(TextField component) {
        this.campoNumeroTelefonoCelular1x1 = component;
    }

    private StaticText campoNumeroTelefonoCelular1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroTelefonoCelular1Texto1() {
        return campoNumeroTelefonoCelular1Texto1;
    }

    public void setCampoNumeroTelefonoCelular1Texto1(StaticText component) {
        this.campoNumeroTelefonoCelular1Texto1 = component;
    }

    private StaticText campoNumeroTelefonoCelular1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroTelefonoCelular1x1Texto1() {
        return campoNumeroTelefonoCelular1x1Texto1;
    }

    public void setCampoNumeroTelefonoCelular1x1Texto1(StaticText component) {
        this.campoNumeroTelefonoCelular1x1Texto1 = component;
    }

    private LengthValidator validatorNumeroTelefonoCelular1 = new LengthValidator();
  
    public LengthValidator getValidatorNumeroTelefonoCelular1() {
        return validatorNumeroTelefonoCelular1;
    }
  
    public void setValidatorNumeroTelefonoCelular1(LengthValidator validator) {
        this.validatorNumeroTelefonoCelular1 = validator;
    }
  
    private TableColumn tableColumnNumeroSionoTlfLineaBaja1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroSionoTlfLineaBaja1() {
        return tableColumnNumeroSionoTlfLineaBaja1;
    }

    public void setTableColumnNumeroSionoTlfLineaBaja1(TableColumn component) {
        this.tableColumnNumeroSionoTlfLineaBaja1 = component;
    }

    private Label labelNumeroSionoTlfLineaBaja1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoTlfLineaBaja1() {
        return labelNumeroSionoTlfLineaBaja1;
    }

    public void setLabelNumeroSionoTlfLineaBaja1(Label l) {
        this.labelNumeroSionoTlfLineaBaja1 = l;
    }

    private DropDown listaNumeroSionoTlfLineaBaja1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoTlfLineaBaja1() {
        return listaNumeroSionoTlfLineaBaja1;
    }

    public void setListaNumeroSionoTlfLineaBaja1(DropDown component) {
        this.listaNumeroSionoTlfLineaBaja1 = component;
    }

    private DropDown listaNumeroSionoTlfLineaBaja1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoTlfLineaBaja1x1() {
        return listaNumeroSionoTlfLineaBaja1x1;
    }

    public void setListaNumeroSionoTlfLineaBaja1x1(DropDown component) {
        this.listaNumeroSionoTlfLineaBaja1x1 = component;
    }

    private StaticText listaNumeroSionoTlfLineaBaja1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoTlfLineaBaja1Texto1() {
        return listaNumeroSionoTlfLineaBaja1Texto1;
    }

    public void setListaNumeroSionoTlfLineaBaja1Texto1(StaticText component) {
        this.listaNumeroSionoTlfLineaBaja1Texto1 = component;
    }

    private StaticText listaNumeroSionoTlfLineaBaja1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoTlfLineaBaja1x1Texto1() {
        return listaNumeroSionoTlfLineaBaja1x1Texto1;
    }

    public void setListaNumeroSionoTlfLineaBaja1x1Texto1(StaticText component) {
        this.listaNumeroSionoTlfLineaBaja1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoTlfLineaBaja1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoTlfLineaBaja1() {
        return converterNumeroSionoTlfLineaBaja1;
    }
  
    public void setConverterNumeroSionoTlfLineaBaja1(IntegerConverter converter) {
        this.converterNumeroSionoTlfLineaBaja1 = converter;
    }
  
    private TableColumn tableColumnNumeroTelefonoLineaBaja1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTelefonoLineaBaja1() {
        return tableColumnNumeroTelefonoLineaBaja1;
    }

    public void setTableColumnNumeroTelefonoLineaBaja1(TableColumn component) {
        this.tableColumnNumeroTelefonoLineaBaja1 = component;
    }

    private Label labelNumeroTelefonoLineaBaja1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTelefonoLineaBaja1() {
        return labelNumeroTelefonoLineaBaja1;
    }

    public void setLabelNumeroTelefonoLineaBaja1(Label l) {
        this.labelNumeroTelefonoLineaBaja1 = l;
    }

    private TextField campoNumeroTelefonoLineaBaja1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroTelefonoLineaBaja1() {
        return campoNumeroTelefonoLineaBaja1;
    }

    public void setCampoNumeroTelefonoLineaBaja1(TextField component) {
        this.campoNumeroTelefonoLineaBaja1 = component;
    }

    private TextField campoNumeroTelefonoLineaBaja1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroTelefonoLineaBaja1x1() {
        return campoNumeroTelefonoLineaBaja1x1;
    }

    public void setCampoNumeroTelefonoLineaBaja1x1(TextField component) {
        this.campoNumeroTelefonoLineaBaja1x1 = component;
    }

    private StaticText campoNumeroTelefonoLineaBaja1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroTelefonoLineaBaja1Texto1() {
        return campoNumeroTelefonoLineaBaja1Texto1;
    }

    public void setCampoNumeroTelefonoLineaBaja1Texto1(StaticText component) {
        this.campoNumeroTelefonoLineaBaja1Texto1 = component;
    }

    private StaticText campoNumeroTelefonoLineaBaja1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroTelefonoLineaBaja1x1Texto1() {
        return campoNumeroTelefonoLineaBaja1x1Texto1;
    }

    public void setCampoNumeroTelefonoLineaBaja1x1Texto1(StaticText component) {
        this.campoNumeroTelefonoLineaBaja1x1Texto1 = component;
    }

    private LengthValidator validatorNumeroTelefonoLineaBaja1 = new LengthValidator();
  
    public LengthValidator getValidatorNumeroTelefonoLineaBaja1() {
        return validatorNumeroTelefonoLineaBaja1;
    }
  
    public void setValidatorNumeroTelefonoLineaBaja1(LengthValidator validator) {
        this.validatorNumeroTelefonoLineaBaja1 = validator;
    }
  
    private TableColumn tableColumnNumeroSionoDispHeladera1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroSionoDispHeladera1() {
        return tableColumnNumeroSionoDispHeladera1;
    }

    public void setTableColumnNumeroSionoDispHeladera1(TableColumn component) {
        this.tableColumnNumeroSionoDispHeladera1 = component;
    }

    private Label labelNumeroSionoDispHeladera1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispHeladera1() {
        return labelNumeroSionoDispHeladera1;
    }

    public void setLabelNumeroSionoDispHeladera1(Label l) {
        this.labelNumeroSionoDispHeladera1 = l;
    }

    private DropDown listaNumeroSionoDispHeladera1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDispHeladera1() {
        return listaNumeroSionoDispHeladera1;
    }

    public void setListaNumeroSionoDispHeladera1(DropDown component) {
        this.listaNumeroSionoDispHeladera1 = component;
    }

    private DropDown listaNumeroSionoDispHeladera1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDispHeladera1x1() {
        return listaNumeroSionoDispHeladera1x1;
    }

    public void setListaNumeroSionoDispHeladera1x1(DropDown component) {
        this.listaNumeroSionoDispHeladera1x1 = component;
    }

    private StaticText listaNumeroSionoDispHeladera1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispHeladera1Texto1() {
        return listaNumeroSionoDispHeladera1Texto1;
    }

    public void setListaNumeroSionoDispHeladera1Texto1(StaticText component) {
        this.listaNumeroSionoDispHeladera1Texto1 = component;
    }

    private StaticText listaNumeroSionoDispHeladera1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispHeladera1x1Texto1() {
        return listaNumeroSionoDispHeladera1x1Texto1;
    }

    public void setListaNumeroSionoDispHeladera1x1Texto1(StaticText component) {
        this.listaNumeroSionoDispHeladera1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDispHeladera1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDispHeladera1() {
        return converterNumeroSionoDispHeladera1;
    }
  
    public void setConverterNumeroSionoDispHeladera1(IntegerConverter converter) {
        this.converterNumeroSionoDispHeladera1 = converter;
    }
  
    private TableColumn tableColumnNumeroSionoDispLavarropas1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroSionoDispLavarropas1() {
        return tableColumnNumeroSionoDispLavarropas1;
    }

    public void setTableColumnNumeroSionoDispLavarropas1(TableColumn component) {
        this.tableColumnNumeroSionoDispLavarropas1 = component;
    }

    private Label labelNumeroSionoDispLavarropas1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispLavarropas1() {
        return labelNumeroSionoDispLavarropas1;
    }

    public void setLabelNumeroSionoDispLavarropas1(Label l) {
        this.labelNumeroSionoDispLavarropas1 = l;
    }

    private DropDown listaNumeroSionoDispLavarropas1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDispLavarropas1() {
        return listaNumeroSionoDispLavarropas1;
    }

    public void setListaNumeroSionoDispLavarropas1(DropDown component) {
        this.listaNumeroSionoDispLavarropas1 = component;
    }

    private DropDown listaNumeroSionoDispLavarropas1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDispLavarropas1x1() {
        return listaNumeroSionoDispLavarropas1x1;
    }

    public void setListaNumeroSionoDispLavarropas1x1(DropDown component) {
        this.listaNumeroSionoDispLavarropas1x1 = component;
    }

    private StaticText listaNumeroSionoDispLavarropas1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispLavarropas1Texto1() {
        return listaNumeroSionoDispLavarropas1Texto1;
    }

    public void setListaNumeroSionoDispLavarropas1Texto1(StaticText component) {
        this.listaNumeroSionoDispLavarropas1Texto1 = component;
    }

    private StaticText listaNumeroSionoDispLavarropas1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispLavarropas1x1Texto1() {
        return listaNumeroSionoDispLavarropas1x1Texto1;
    }

    public void setListaNumeroSionoDispLavarropas1x1Texto1(StaticText component) {
        this.listaNumeroSionoDispLavarropas1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDispLavarropas1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDispLavarropas1() {
        return converterNumeroSionoDispLavarropas1;
    }
  
    public void setConverterNumeroSionoDispLavarropas1(IntegerConverter converter) {
        this.converterNumeroSionoDispLavarropas1 = converter;
    }
  
    private TableColumn tableColumnNumeroSionoDispTermo1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroSionoDispTermo1() {
        return tableColumnNumeroSionoDispTermo1;
    }

    public void setTableColumnNumeroSionoDispTermo1(TableColumn component) {
        this.tableColumnNumeroSionoDispTermo1 = component;
    }

    private Label labelNumeroSionoDispTermo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispTermo1() {
        return labelNumeroSionoDispTermo1;
    }

    public void setLabelNumeroSionoDispTermo1(Label l) {
        this.labelNumeroSionoDispTermo1 = l;
    }

    private DropDown listaNumeroSionoDispTermo1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDispTermo1() {
        return listaNumeroSionoDispTermo1;
    }

    public void setListaNumeroSionoDispTermo1(DropDown component) {
        this.listaNumeroSionoDispTermo1 = component;
    }

    private DropDown listaNumeroSionoDispTermo1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDispTermo1x1() {
        return listaNumeroSionoDispTermo1x1;
    }

    public void setListaNumeroSionoDispTermo1x1(DropDown component) {
        this.listaNumeroSionoDispTermo1x1 = component;
    }

    private StaticText listaNumeroSionoDispTermo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispTermo1Texto1() {
        return listaNumeroSionoDispTermo1Texto1;
    }

    public void setListaNumeroSionoDispTermo1Texto1(StaticText component) {
        this.listaNumeroSionoDispTermo1Texto1 = component;
    }

    private StaticText listaNumeroSionoDispTermo1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispTermo1x1Texto1() {
        return listaNumeroSionoDispTermo1x1Texto1;
    }

    public void setListaNumeroSionoDispTermo1x1Texto1(StaticText component) {
        this.listaNumeroSionoDispTermo1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDispTermo1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDispTermo1() {
        return converterNumeroSionoDispTermo1;
    }
  
    public void setConverterNumeroSionoDispTermo1(IntegerConverter converter) {
        this.converterNumeroSionoDispTermo1 = converter;
    }
  
    private TableColumn tableColumnNumeroSionoDispAireAcon1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroSionoDispAireAcon1() {
        return tableColumnNumeroSionoDispAireAcon1;
    }

    public void setTableColumnNumeroSionoDispAireAcon1(TableColumn component) {
        this.tableColumnNumeroSionoDispAireAcon1 = component;
    }

    private Label labelNumeroSionoDispAireAcon1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispAireAcon1() {
        return labelNumeroSionoDispAireAcon1;
    }

    public void setLabelNumeroSionoDispAireAcon1(Label l) {
        this.labelNumeroSionoDispAireAcon1 = l;
    }

    private DropDown listaNumeroSionoDispAireAcon1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDispAireAcon1() {
        return listaNumeroSionoDispAireAcon1;
    }

    public void setListaNumeroSionoDispAireAcon1(DropDown component) {
        this.listaNumeroSionoDispAireAcon1 = component;
    }

    private DropDown listaNumeroSionoDispAireAcon1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDispAireAcon1x1() {
        return listaNumeroSionoDispAireAcon1x1;
    }

    public void setListaNumeroSionoDispAireAcon1x1(DropDown component) {
        this.listaNumeroSionoDispAireAcon1x1 = component;
    }

    private StaticText listaNumeroSionoDispAireAcon1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispAireAcon1Texto1() {
        return listaNumeroSionoDispAireAcon1Texto1;
    }

    public void setListaNumeroSionoDispAireAcon1Texto1(StaticText component) {
        this.listaNumeroSionoDispAireAcon1Texto1 = component;
    }

    private StaticText listaNumeroSionoDispAireAcon1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispAireAcon1x1Texto1() {
        return listaNumeroSionoDispAireAcon1x1Texto1;
    }

    public void setListaNumeroSionoDispAireAcon1x1Texto1(StaticText component) {
        this.listaNumeroSionoDispAireAcon1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDispAireAcon1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDispAireAcon1() {
        return converterNumeroSionoDispAireAcon1;
    }
  
    public void setConverterNumeroSionoDispAireAcon1(IntegerConverter converter) {
        this.converterNumeroSionoDispAireAcon1 = converter;
    }
  
    private TableColumn tableColumnNumeroSionoDispAutomovil1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroSionoDispAutomovil1() {
        return tableColumnNumeroSionoDispAutomovil1;
    }

    public void setTableColumnNumeroSionoDispAutomovil1(TableColumn component) {
        this.tableColumnNumeroSionoDispAutomovil1 = component;
    }

    private Label labelNumeroSionoDispAutomovil1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispAutomovil1() {
        return labelNumeroSionoDispAutomovil1;
    }

    public void setLabelNumeroSionoDispAutomovil1(Label l) {
        this.labelNumeroSionoDispAutomovil1 = l;
    }

    private DropDown listaNumeroSionoDispAutomovil1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDispAutomovil1() {
        return listaNumeroSionoDispAutomovil1;
    }

    public void setListaNumeroSionoDispAutomovil1(DropDown component) {
        this.listaNumeroSionoDispAutomovil1 = component;
    }

    private DropDown listaNumeroSionoDispAutomovil1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDispAutomovil1x1() {
        return listaNumeroSionoDispAutomovil1x1;
    }

    public void setListaNumeroSionoDispAutomovil1x1(DropDown component) {
        this.listaNumeroSionoDispAutomovil1x1 = component;
    }

    private StaticText listaNumeroSionoDispAutomovil1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispAutomovil1Texto1() {
        return listaNumeroSionoDispAutomovil1Texto1;
    }

    public void setListaNumeroSionoDispAutomovil1Texto1(StaticText component) {
        this.listaNumeroSionoDispAutomovil1Texto1 = component;
    }

    private StaticText listaNumeroSionoDispAutomovil1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispAutomovil1x1Texto1() {
        return listaNumeroSionoDispAutomovil1x1Texto1;
    }

    public void setListaNumeroSionoDispAutomovil1x1Texto1(StaticText component) {
        this.listaNumeroSionoDispAutomovil1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDispAutomovil1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDispAutomovil1() {
        return converterNumeroSionoDispAutomovil1;
    }
  
    public void setConverterNumeroSionoDispAutomovil1(IntegerConverter converter) {
        this.converterNumeroSionoDispAutomovil1 = converter;
    }
  
    private TableColumn tableColumnNumeroSionoDispCamion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroSionoDispCamion1() {
        return tableColumnNumeroSionoDispCamion1;
    }

    public void setTableColumnNumeroSionoDispCamion1(TableColumn component) {
        this.tableColumnNumeroSionoDispCamion1 = component;
    }

    private Label labelNumeroSionoDispCamion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispCamion1() {
        return labelNumeroSionoDispCamion1;
    }

    public void setLabelNumeroSionoDispCamion1(Label l) {
        this.labelNumeroSionoDispCamion1 = l;
    }

    private DropDown listaNumeroSionoDispCamion1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDispCamion1() {
        return listaNumeroSionoDispCamion1;
    }

    public void setListaNumeroSionoDispCamion1(DropDown component) {
        this.listaNumeroSionoDispCamion1 = component;
    }

    private DropDown listaNumeroSionoDispCamion1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDispCamion1x1() {
        return listaNumeroSionoDispCamion1x1;
    }

    public void setListaNumeroSionoDispCamion1x1(DropDown component) {
        this.listaNumeroSionoDispCamion1x1 = component;
    }

    private StaticText listaNumeroSionoDispCamion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispCamion1Texto1() {
        return listaNumeroSionoDispCamion1Texto1;
    }

    public void setListaNumeroSionoDispCamion1Texto1(StaticText component) {
        this.listaNumeroSionoDispCamion1Texto1 = component;
    }

    private StaticText listaNumeroSionoDispCamion1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispCamion1x1Texto1() {
        return listaNumeroSionoDispCamion1x1Texto1;
    }

    public void setListaNumeroSionoDispCamion1x1Texto1(StaticText component) {
        this.listaNumeroSionoDispCamion1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDispCamion1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDispCamion1() {
        return converterNumeroSionoDispCamion1;
    }
  
    public void setConverterNumeroSionoDispCamion1(IntegerConverter converter) {
        this.converterNumeroSionoDispCamion1 = converter;
    }
  
    private TableColumn tableColumnNumeroSionoDispMotocicleta1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroSionoDispMotocicleta1() {
        return tableColumnNumeroSionoDispMotocicleta1;
    }

    public void setTableColumnNumeroSionoDispMotocicleta1(TableColumn component) {
        this.tableColumnNumeroSionoDispMotocicleta1 = component;
    }

    private Label labelNumeroSionoDispMotocicleta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDispMotocicleta1() {
        return labelNumeroSionoDispMotocicleta1;
    }

    public void setLabelNumeroSionoDispMotocicleta1(Label l) {
        this.labelNumeroSionoDispMotocicleta1 = l;
    }

    private DropDown listaNumeroSionoDispMotocicleta1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDispMotocicleta1() {
        return listaNumeroSionoDispMotocicleta1;
    }

    public void setListaNumeroSionoDispMotocicleta1(DropDown component) {
        this.listaNumeroSionoDispMotocicleta1 = component;
    }

    private DropDown listaNumeroSionoDispMotocicleta1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDispMotocicleta1x1() {
        return listaNumeroSionoDispMotocicleta1x1;
    }

    public void setListaNumeroSionoDispMotocicleta1x1(DropDown component) {
        this.listaNumeroSionoDispMotocicleta1x1 = component;
    }

    private StaticText listaNumeroSionoDispMotocicleta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispMotocicleta1Texto1() {
        return listaNumeroSionoDispMotocicleta1Texto1;
    }

    public void setListaNumeroSionoDispMotocicleta1Texto1(StaticText component) {
        this.listaNumeroSionoDispMotocicleta1Texto1 = component;
    }

    private StaticText listaNumeroSionoDispMotocicleta1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDispMotocicleta1x1Texto1() {
        return listaNumeroSionoDispMotocicleta1x1Texto1;
    }

    public void setListaNumeroSionoDispMotocicleta1x1Texto1(StaticText component) {
        this.listaNumeroSionoDispMotocicleta1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDispMotocicleta1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDispMotocicleta1() {
        return converterNumeroSionoDispMotocicleta1;
    }
  
    public void setConverterNumeroSionoDispMotocicleta1(IntegerConverter converter) {
        this.converterNumeroSionoDispMotocicleta1 = converter;
    }
  
    private TableColumn tableColumnNombreJefeHogar1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreJefeHogar1() {
        return tableColumnNombreJefeHogar1;
    }

    public void setTableColumnNombreJefeHogar1(TableColumn component) {
        this.tableColumnNombreJefeHogar1 = component;
    }

    private Label labelNombreJefeHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreJefeHogar1() {
        return labelNombreJefeHogar1;
    }

    public void setLabelNombreJefeHogar1(Label l) {
        this.labelNombreJefeHogar1 = l;
    }

    private TextField campoNombreJefeHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreJefeHogar1() {
        return campoNombreJefeHogar1;
    }

    public void setCampoNombreJefeHogar1(TextField component) {
        this.campoNombreJefeHogar1 = component;
    }

    private TextField campoNombreJefeHogar1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNombreJefeHogar1x1() {
        return campoNombreJefeHogar1x1;
    }

    public void setCampoNombreJefeHogar1x1(TextField component) {
        this.campoNombreJefeHogar1x1 = component;
    }

    private StaticText campoNombreJefeHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreJefeHogar1Texto1() {
        return campoNombreJefeHogar1Texto1;
    }

    public void setCampoNombreJefeHogar1Texto1(StaticText component) {
        this.campoNombreJefeHogar1Texto1 = component;
    }

    private StaticText campoNombreJefeHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreJefeHogar1x1Texto1() {
        return campoNombreJefeHogar1x1Texto1;
    }

    public void setCampoNombreJefeHogar1x1Texto1(StaticText component) {
        this.campoNombreJefeHogar1x1Texto1 = component;
    }

    private LengthValidator validatorNombreJefeHogar1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreJefeHogar1() {
        return validatorNombreJefeHogar1;
    }
  
    public void setValidatorNombreJefeHogar1(LengthValidator validator) {
        this.validatorNombreJefeHogar1 = validator;
    }
  
    private TableColumn tableColumnNumeroCedulaJefeHogar1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroCedulaJefeHogar1() {
        return tableColumnNumeroCedulaJefeHogar1;
    }

    public void setTableColumnNumeroCedulaJefeHogar1(TableColumn component) {
        this.tableColumnNumeroCedulaJefeHogar1 = component;
    }

    private Label labelNumeroCedulaJefeHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCedulaJefeHogar1() {
        return labelNumeroCedulaJefeHogar1;
    }

    public void setLabelNumeroCedulaJefeHogar1(Label l) {
        this.labelNumeroCedulaJefeHogar1 = l;
    }

    private TextField campoNumeroCedulaJefeHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroCedulaJefeHogar1() {
        return campoNumeroCedulaJefeHogar1;
    }

    public void setCampoNumeroCedulaJefeHogar1(TextField component) {
        this.campoNumeroCedulaJefeHogar1 = component;
    }

    private TextField campoNumeroCedulaJefeHogar1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroCedulaJefeHogar1x1() {
        return campoNumeroCedulaJefeHogar1x1;
    }

    public void setCampoNumeroCedulaJefeHogar1x1(TextField component) {
        this.campoNumeroCedulaJefeHogar1x1 = component;
    }

    private StaticText campoNumeroCedulaJefeHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroCedulaJefeHogar1Texto1() {
        return campoNumeroCedulaJefeHogar1Texto1;
    }

    public void setCampoNumeroCedulaJefeHogar1Texto1(StaticText component) {
        this.campoNumeroCedulaJefeHogar1Texto1 = component;
    }

    private StaticText campoNumeroCedulaJefeHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroCedulaJefeHogar1x1Texto1() {
        return campoNumeroCedulaJefeHogar1x1Texto1;
    }

    public void setCampoNumeroCedulaJefeHogar1x1Texto1(StaticText component) {
        this.campoNumeroCedulaJefeHogar1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroCedulaJefeHogar1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCedulaJefeHogar1() {
        return converterNumeroCedulaJefeHogar1;
    }
  
    public void setConverterNumeroCedulaJefeHogar1(IntegerConverter converter) {
        this.converterNumeroCedulaJefeHogar1 = converter;
    }
  
    private LongRangeValidator validatorNumeroCedulaJefeHogar1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroCedulaJefeHogar1() {
        return validatorNumeroCedulaJefeHogar1;
    }
  
    public void setValidatorNumeroCedulaJefeHogar1(LongRangeValidator validator) {
        this.validatorNumeroCedulaJefeHogar1 = validator;
    }
  
    private TableColumn tableColumnLetraCedulaJefeHogar1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnLetraCedulaJefeHogar1() {
        return tableColumnLetraCedulaJefeHogar1;
    }

    public void setTableColumnLetraCedulaJefeHogar1(TableColumn component) {
        this.tableColumnLetraCedulaJefeHogar1 = component;
    }

    private Label labelLetraCedulaJefeHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLetraCedulaJefeHogar1() {
        return labelLetraCedulaJefeHogar1;
    }

    public void setLabelLetraCedulaJefeHogar1(Label l) {
        this.labelLetraCedulaJefeHogar1 = l;
    }

    private TextField campoLetraCedulaJefeHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoLetraCedulaJefeHogar1() {
        return campoLetraCedulaJefeHogar1;
    }

    public void setCampoLetraCedulaJefeHogar1(TextField component) {
        this.campoLetraCedulaJefeHogar1 = component;
    }

    private TextField campoLetraCedulaJefeHogar1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoLetraCedulaJefeHogar1x1() {
        return campoLetraCedulaJefeHogar1x1;
    }

    public void setCampoLetraCedulaJefeHogar1x1(TextField component) {
        this.campoLetraCedulaJefeHogar1x1 = component;
    }

    private StaticText campoLetraCedulaJefeHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLetraCedulaJefeHogar1Texto1() {
        return campoLetraCedulaJefeHogar1Texto1;
    }

    public void setCampoLetraCedulaJefeHogar1Texto1(StaticText component) {
        this.campoLetraCedulaJefeHogar1Texto1 = component;
    }

    private StaticText campoLetraCedulaJefeHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLetraCedulaJefeHogar1x1Texto1() {
        return campoLetraCedulaJefeHogar1x1Texto1;
    }

    public void setCampoLetraCedulaJefeHogar1x1Texto1(StaticText component) {
        this.campoLetraCedulaJefeHogar1x1Texto1 = component;
    }

    private LengthValidator validatorLetraCedulaJefeHogar1 = new LengthValidator();
  
    public LengthValidator getValidatorLetraCedulaJefeHogar1() {
        return validatorLetraCedulaJefeHogar1;
    }
  
    public void setValidatorLetraCedulaJefeHogar1(LengthValidator validator) {
        this.validatorLetraCedulaJefeHogar1 = validator;
    }
  
    private TableColumn tableColumnNumeroOrdenIdenJefeHogar1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroOrdenIdenJefeHogar1() {
        return tableColumnNumeroOrdenIdenJefeHogar1;
    }

    public void setTableColumnNumeroOrdenIdenJefeHogar1(TableColumn component) {
        this.tableColumnNumeroOrdenIdenJefeHogar1 = component;
    }

    private Label labelNumeroOrdenIdenJefeHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroOrdenIdenJefeHogar1() {
        return labelNumeroOrdenIdenJefeHogar1;
    }

    public void setLabelNumeroOrdenIdenJefeHogar1(Label l) {
        this.labelNumeroOrdenIdenJefeHogar1 = l;
    }

    private TextField campoNumeroOrdenIdenJefeHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroOrdenIdenJefeHogar1() {
        return campoNumeroOrdenIdenJefeHogar1;
    }

    public void setCampoNumeroOrdenIdenJefeHogar1(TextField component) {
        this.campoNumeroOrdenIdenJefeHogar1 = component;
    }

    private TextField campoNumeroOrdenIdenJefeHogar1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroOrdenIdenJefeHogar1x1() {
        return campoNumeroOrdenIdenJefeHogar1x1;
    }

    public void setCampoNumeroOrdenIdenJefeHogar1x1(TextField component) {
        this.campoNumeroOrdenIdenJefeHogar1x1 = component;
    }

    private StaticText campoNumeroOrdenIdenJefeHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroOrdenIdenJefeHogar1Texto1() {
        return campoNumeroOrdenIdenJefeHogar1Texto1;
    }

    public void setCampoNumeroOrdenIdenJefeHogar1Texto1(StaticText component) {
        this.campoNumeroOrdenIdenJefeHogar1Texto1 = component;
    }

    private StaticText campoNumeroOrdenIdenJefeHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroOrdenIdenJefeHogar1x1Texto1() {
        return campoNumeroOrdenIdenJefeHogar1x1Texto1;
    }

    public void setCampoNumeroOrdenIdenJefeHogar1x1Texto1(StaticText component) {
        this.campoNumeroOrdenIdenJefeHogar1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroOrdenIdenJefeHogar1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroOrdenIdenJefeHogar1() {
        return converterNumeroOrdenIdenJefeHogar1;
    }
  
    public void setConverterNumeroOrdenIdenJefeHogar1(IntegerConverter converter) {
        this.converterNumeroOrdenIdenJefeHogar1 = converter;
    }
  
    private LongRangeValidator validatorNumeroOrdenIdenJefeHogar1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroOrdenIdenJefeHogar1() {
        return validatorNumeroOrdenIdenJefeHogar1;
    }
  
    public void setValidatorNumeroOrdenIdenJefeHogar1(LongRangeValidator validator) {
        this.validatorNumeroOrdenIdenJefeHogar1 = validator;
    }
  
    private TableColumn tableColumnNombreRespondente1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreRespondente1() {
        return tableColumnNombreRespondente1;
    }

    public void setTableColumnNombreRespondente1(TableColumn component) {
        this.tableColumnNombreRespondente1 = component;
    }

    private Label labelNombreRespondente1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreRespondente1() {
        return labelNombreRespondente1;
    }

    public void setLabelNombreRespondente1(Label l) {
        this.labelNombreRespondente1 = l;
    }

    private TextField campoNombreRespondente1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreRespondente1() {
        return campoNombreRespondente1;
    }

    public void setCampoNombreRespondente1(TextField component) {
        this.campoNombreRespondente1 = component;
    }

    private TextField campoNombreRespondente1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNombreRespondente1x1() {
        return campoNombreRespondente1x1;
    }

    public void setCampoNombreRespondente1x1(TextField component) {
        this.campoNombreRespondente1x1 = component;
    }

    private StaticText campoNombreRespondente1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreRespondente1Texto1() {
        return campoNombreRespondente1Texto1;
    }

    public void setCampoNombreRespondente1Texto1(StaticText component) {
        this.campoNombreRespondente1Texto1 = component;
    }

    private StaticText campoNombreRespondente1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreRespondente1x1Texto1() {
        return campoNombreRespondente1x1Texto1;
    }

    public void setCampoNombreRespondente1x1Texto1(StaticText component) {
        this.campoNombreRespondente1x1Texto1 = component;
    }

    private LengthValidator validatorNombreRespondente1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreRespondente1() {
        return validatorNombreRespondente1;
    }
  
    public void setValidatorNombreRespondente1(LengthValidator validator) {
        this.validatorNombreRespondente1 = validator;
    }
  
    private TableColumn tableColumnNumeroCedulaRespondente1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroCedulaRespondente1() {
        return tableColumnNumeroCedulaRespondente1;
    }

    public void setTableColumnNumeroCedulaRespondente1(TableColumn component) {
        this.tableColumnNumeroCedulaRespondente1 = component;
    }

    private Label labelNumeroCedulaRespondente1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCedulaRespondente1() {
        return labelNumeroCedulaRespondente1;
    }

    public void setLabelNumeroCedulaRespondente1(Label l) {
        this.labelNumeroCedulaRespondente1 = l;
    }

    private TextField campoNumeroCedulaRespondente1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroCedulaRespondente1() {
        return campoNumeroCedulaRespondente1;
    }

    public void setCampoNumeroCedulaRespondente1(TextField component) {
        this.campoNumeroCedulaRespondente1 = component;
    }

    private TextField campoNumeroCedulaRespondente1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroCedulaRespondente1x1() {
        return campoNumeroCedulaRespondente1x1;
    }

    public void setCampoNumeroCedulaRespondente1x1(TextField component) {
        this.campoNumeroCedulaRespondente1x1 = component;
    }

    private StaticText campoNumeroCedulaRespondente1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroCedulaRespondente1Texto1() {
        return campoNumeroCedulaRespondente1Texto1;
    }

    public void setCampoNumeroCedulaRespondente1Texto1(StaticText component) {
        this.campoNumeroCedulaRespondente1Texto1 = component;
    }

    private StaticText campoNumeroCedulaRespondente1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroCedulaRespondente1x1Texto1() {
        return campoNumeroCedulaRespondente1x1Texto1;
    }

    public void setCampoNumeroCedulaRespondente1x1Texto1(StaticText component) {
        this.campoNumeroCedulaRespondente1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroCedulaRespondente1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCedulaRespondente1() {
        return converterNumeroCedulaRespondente1;
    }
  
    public void setConverterNumeroCedulaRespondente1(IntegerConverter converter) {
        this.converterNumeroCedulaRespondente1 = converter;
    }
  
    private LongRangeValidator validatorNumeroCedulaRespondente1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroCedulaRespondente1() {
        return validatorNumeroCedulaRespondente1;
    }
  
    public void setValidatorNumeroCedulaRespondente1(LongRangeValidator validator) {
        this.validatorNumeroCedulaRespondente1 = validator;
    }
  
    private TableColumn tableColumnLetraCedulaRespondente1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnLetraCedulaRespondente1() {
        return tableColumnLetraCedulaRespondente1;
    }

    public void setTableColumnLetraCedulaRespondente1(TableColumn component) {
        this.tableColumnLetraCedulaRespondente1 = component;
    }

    private Label labelLetraCedulaRespondente1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLetraCedulaRespondente1() {
        return labelLetraCedulaRespondente1;
    }

    public void setLabelLetraCedulaRespondente1(Label l) {
        this.labelLetraCedulaRespondente1 = l;
    }

    private TextField campoLetraCedulaRespondente1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoLetraCedulaRespondente1() {
        return campoLetraCedulaRespondente1;
    }

    public void setCampoLetraCedulaRespondente1(TextField component) {
        this.campoLetraCedulaRespondente1 = component;
    }

    private TextField campoLetraCedulaRespondente1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoLetraCedulaRespondente1x1() {
        return campoLetraCedulaRespondente1x1;
    }

    public void setCampoLetraCedulaRespondente1x1(TextField component) {
        this.campoLetraCedulaRespondente1x1 = component;
    }

    private StaticText campoLetraCedulaRespondente1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLetraCedulaRespondente1Texto1() {
        return campoLetraCedulaRespondente1Texto1;
    }

    public void setCampoLetraCedulaRespondente1Texto1(StaticText component) {
        this.campoLetraCedulaRespondente1Texto1 = component;
    }

    private StaticText campoLetraCedulaRespondente1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLetraCedulaRespondente1x1Texto1() {
        return campoLetraCedulaRespondente1x1Texto1;
    }

    public void setCampoLetraCedulaRespondente1x1Texto1(StaticText component) {
        this.campoLetraCedulaRespondente1x1Texto1 = component;
    }

    private LengthValidator validatorLetraCedulaRespondente1 = new LengthValidator();
  
    public LengthValidator getValidatorLetraCedulaRespondente1() {
        return validatorLetraCedulaRespondente1;
    }
  
    public void setValidatorLetraCedulaRespondente1(LengthValidator validator) {
        this.validatorLetraCedulaRespondente1 = validator;
    }
  
    private TableColumn tableColumnNumeroOrdenIdenRespondente1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroOrdenIdenRespondente1() {
        return tableColumnNumeroOrdenIdenRespondente1;
    }

    public void setTableColumnNumeroOrdenIdenRespondente1(TableColumn component) {
        this.tableColumnNumeroOrdenIdenRespondente1 = component;
    }

    private Label labelNumeroOrdenIdenRespondente1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroOrdenIdenRespondente1() {
        return labelNumeroOrdenIdenRespondente1;
    }

    public void setLabelNumeroOrdenIdenRespondente1(Label l) {
        this.labelNumeroOrdenIdenRespondente1 = l;
    }

    private TextField campoNumeroOrdenIdenRespondente1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroOrdenIdenRespondente1() {
        return campoNumeroOrdenIdenRespondente1;
    }

    public void setCampoNumeroOrdenIdenRespondente1(TextField component) {
        this.campoNumeroOrdenIdenRespondente1 = component;
    }

    private TextField campoNumeroOrdenIdenRespondente1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroOrdenIdenRespondente1x1() {
        return campoNumeroOrdenIdenRespondente1x1;
    }

    public void setCampoNumeroOrdenIdenRespondente1x1(TextField component) {
        this.campoNumeroOrdenIdenRespondente1x1 = component;
    }

    private StaticText campoNumeroOrdenIdenRespondente1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroOrdenIdenRespondente1Texto1() {
        return campoNumeroOrdenIdenRespondente1Texto1;
    }

    public void setCampoNumeroOrdenIdenRespondente1Texto1(StaticText component) {
        this.campoNumeroOrdenIdenRespondente1Texto1 = component;
    }

    private StaticText campoNumeroOrdenIdenRespondente1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroOrdenIdenRespondente1x1Texto1() {
        return campoNumeroOrdenIdenRespondente1x1Texto1;
    }

    public void setCampoNumeroOrdenIdenRespondente1x1Texto1(StaticText component) {
        this.campoNumeroOrdenIdenRespondente1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroOrdenIdenRespondente1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroOrdenIdenRespondente1() {
        return converterNumeroOrdenIdenRespondente1;
    }
  
    public void setConverterNumeroOrdenIdenRespondente1(IntegerConverter converter) {
        this.converterNumeroOrdenIdenRespondente1 = converter;
    }
  
    private LongRangeValidator validatorNumeroOrdenIdenRespondente1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroOrdenIdenRespondente1() {
        return validatorNumeroOrdenIdenRespondente1;
    }
  
    public void setValidatorNumeroOrdenIdenRespondente1(LongRangeValidator validator) {
        this.validatorNumeroOrdenIdenRespondente1 = validator;
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

    private TextField campoIdProveedorDatExt1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdProveedorDatExt1x1() {
        return campoIdProveedorDatExt1x1;
    }

    public void setCampoIdProveedorDatExt1x1(TextField component) {
        this.campoIdProveedorDatExt1x1 = component;
    }

    private StaticText campoIdProveedorDatExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdProveedorDatExt1Texto1() {
        return campoIdProveedorDatExt1Texto1;
    }

    public void setCampoIdProveedorDatExt1Texto1(StaticText component) {
        this.campoIdProveedorDatExt1Texto1 = component;
    }

    private StaticText campoIdProveedorDatExt1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdProveedorDatExt1x1Texto1() {
        return campoIdProveedorDatExt1x1Texto1;
    }

    public void setCampoIdProveedorDatExt1x1Texto1(StaticText component) {
        this.campoIdProveedorDatExt1x1Texto1 = component;
    }

    private Button campoIdProveedorDatExt1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdProveedorDatExt1Boton1() {
        return campoIdProveedorDatExt1Boton1;
    }

    public void setCampoIdProveedorDatExt1Boton1(Button component) {
        this.campoIdProveedorDatExt1Boton1 = component;
    }

    private Button campoIdProveedorDatExt1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdProveedorDatExt1x1Boton1() {
        return campoIdProveedorDatExt1x1Boton1;
    }

    public void setCampoIdProveedorDatExt1x1Boton1(Button component) {
        this.campoIdProveedorDatExt1x1Boton1 = component;
    }

    private Button campoIdProveedorDatExt1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdProveedorDatExt1Boton3() {
        return campoIdProveedorDatExt1Boton3;
    }

    public void setCampoIdProveedorDatExt1Boton3(Button component) {
        this.campoIdProveedorDatExt1Boton3 = component;
    }

    private Button campoIdProveedorDatExt1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdProveedorDatExt1x1Boton3() {
        return campoIdProveedorDatExt1x1Boton3;
    }

    public void setCampoIdProveedorDatExt1x1Boton3(Button component) {
        this.campoIdProveedorDatExt1x1Boton3 = component;
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

    private TextField campoIndiceCalidadVida1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIndiceCalidadVida1x1() {
        return campoIndiceCalidadVida1x1;
    }

    public void setCampoIndiceCalidadVida1x1(TextField component) {
        this.campoIndiceCalidadVida1x1 = component;
    }

    private StaticText campoIndiceCalidadVida1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIndiceCalidadVida1Texto1() {
        return campoIndiceCalidadVida1Texto1;
    }

    public void setCampoIndiceCalidadVida1Texto1(StaticText component) {
        this.campoIndiceCalidadVida1Texto1 = component;
    }

    private StaticText campoIndiceCalidadVida1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIndiceCalidadVida1x1Texto1() {
        return campoIndiceCalidadVida1x1Texto1;
    }

    public void setCampoIndiceCalidadVida1x1Texto1(StaticText component) {
        this.campoIndiceCalidadVida1x1Texto1 = component;
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
  
    private TableColumn tableColumnEsFichaHogarInactiva1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsFichaHogarInactiva1() {
        return tableColumnEsFichaHogarInactiva1;
    }

    public void setTableColumnEsFichaHogarInactiva1(TableColumn component) {
        this.tableColumnEsFichaHogarInactiva1 = component;
    }

    private Label labelEsFichaHogarInactiva1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsFichaHogarInactiva1() {
        return labelEsFichaHogarInactiva1;
    }

    public void setLabelEsFichaHogarInactiva1(Label l) {
        this.labelEsFichaHogarInactiva1 = l;
    }

    private DropDown listaEsFichaHogarInactiva1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsFichaHogarInactiva1() {
        return listaEsFichaHogarInactiva1;
    }

    public void setListaEsFichaHogarInactiva1(DropDown component) {
        this.listaEsFichaHogarInactiva1 = component;
    }

    private DropDown listaEsFichaHogarInactiva1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsFichaHogarInactiva1x1() {
        return listaEsFichaHogarInactiva1x1;
    }

    public void setListaEsFichaHogarInactiva1x1(DropDown component) {
        this.listaEsFichaHogarInactiva1x1 = component;
    }

    private StaticText listaEsFichaHogarInactiva1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsFichaHogarInactiva1Texto1() {
        return listaEsFichaHogarInactiva1Texto1;
    }

    public void setListaEsFichaHogarInactiva1Texto1(StaticText component) {
        this.listaEsFichaHogarInactiva1Texto1 = component;
    }

    private StaticText listaEsFichaHogarInactiva1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsFichaHogarInactiva1x1Texto1() {
        return listaEsFichaHogarInactiva1x1Texto1;
    }

    public void setListaEsFichaHogarInactiva1x1Texto1(StaticText component) {
        this.listaEsFichaHogarInactiva1x1Texto1 = component;
    }

    private IntegerConverter converterEsFichaHogarInactiva1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsFichaHogarInactiva1() {
        return converterEsFichaHogarInactiva1;
    }
  
    public void setConverterEsFichaHogarInactiva1(IntegerConverter converter) {
        this.converterEsFichaHogarInactiva1 = converter;
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

    private FichaHogarCachedRowSetDataProvider2 fichaHogarDataProvider = new FichaHogarCachedRowSetDataProvider2();

    @Override
    public FichaHogarCachedRowSetDataProvider2 getFichaHogarDataProvider() {
        return fichaHogarDataProvider;
    }

    public void setFichaHogarDataProvider(FichaHogarCachedRowSetDataProvider2 crsdp) {
        this.fichaHogarDataProvider = crsdp;
    }

    private FuncionarioCachedRowSetDataProvider2 funcionarioReferenceDataProvider = new FuncionarioCachedRowSetDataProvider2();

    @Override
    public FuncionarioCachedRowSetDataProvider2 getFuncionarioReferenceDataProvider() {
        return funcionarioReferenceDataProvider;
    }

    public void setFuncionarioReferenceDataProvider(FuncionarioCachedRowSetDataProvider2 crsdp) {
        this.funcionarioReferenceDataProvider = crsdp;
    }

    private UbicacionCachedRowSetDataProvider2 ubicacionReferenceDataProvider = new UbicacionCachedRowSetDataProvider2();

    @Override
    public UbicacionCachedRowSetDataProvider2 getUbicacionReferenceDataProvider() {
        return ubicacionReferenceDataProvider;
    }

    public void setUbicacionReferenceDataProvider(UbicacionCachedRowSetDataProvider2 crsdp) {
        this.ubicacionReferenceDataProvider = crsdp;
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
    public FichaHogar5() {
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
        fichaHogarDataProvider.close();
        funcionarioReferenceDataProvider.close();
        ubicacionReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionFichaHogar...">
    @Override
    public TextField getTextFieldCampoFechaEntrevista1() {
        return this.getCampoFechaEntrevista1();
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
    private AsistentePaginaActualizacionFichaHogar asistente = new AsistentePaginaActualizacionFichaHogar(this);

    public AsistentePaginaActualizacionFichaHogar getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("FichaHogar5_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("FichaHogar5_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("FichaHogar5_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getFichaHogarDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return FichaHogarCachedRowSetDataProvider2.FUNCION_CONSULTAR_FICHA_HOGAR;
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
            this.getFichaHogarDataProvider().consultarFichaHogar(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getFichaHogarDataProvider().consultarFichaHogar(filtro);
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
    public void campoIdFuncionarioCensista1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncionarioCensista1_validate(context, component, value);
    }

    public void campoIdFuncionarioSupervisor1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncionarioSupervisor1_validate(context, component, value);
    }

    public void campoIdFuncionarioCriticoDeco1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncionarioCriticoDeco1_validate(context, component, value);
    }

    public void campoIdFuncionarioDigitador1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncionarioDigitador1_validate(context, component, value);
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
        String urx = URX2.COMANDO_FICHA_HOGAR;
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
    FichaHogarBusinessProcessLocal fichaHogarBusinessProcess;

    @Override
    public Object getFichaHogarBusinessProcess() {
        return fichaHogarBusinessProcess;
    }

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @Override
    public Object getMessenger() {
        return messenger;
    }

    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
