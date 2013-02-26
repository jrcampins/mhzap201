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

import com.egt.data.specific.xdp2.PotencialBenCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.EtniaIndigenaCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FuncionarioCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FichaPersonaCachedRowSetDataProvider2;
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
import com.egt.ejb.business.process.PotencialBenBusinessProcessLocal;
import com.egt.ejb.core.reporter.ReporterBrokerLocal;

public class PotencialBen5 extends AbstractPageBean
        implements PaginaActualizacionPotencialBen, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdPotencialBen1.setMinimum(0L);
        validatorIdPotencialBen1.setMaximum(1000000000000000000L);
        validatorCodigoPotencialBen1.setMaximum(30);
        validatorNombrePotencialBen1.setMaximum(100);
        validatorNumeroCedula1.setMinimum(1L);
        validatorNumeroCedula1.setMaximum(1000000000L);
        validatorLetraCedula1.setMaximum(1);
        converterFechaExpedicionCedula1.setPattern("dd/MM/yyyy");
        converterFechaExpedicionCedula1.setType("date");
        converterFechaVencimientoCedula1.setPattern("dd/MM/yyyy");
        converterFechaVencimientoCedula1.setType("date");
        validatorPrimerNombre1.setMaximum(30);
        validatorSegundoNombre1.setMaximum(30);
        validatorPrimerApellido1.setMaximum(30);
        validatorSegundoApellido1.setMaximum(30);
        validatorApellidoCasada1.setMaximum(30);
        validatorApodo1.setMaximum(30);
        converterFechaNacimiento1.setPattern("dd/MM/yyyy");
        converterFechaNacimiento1.setType("date");
        validatorEdad1.setMinimum(0L);
        validatorEdad1.setMaximum(1000000000L);
        validatorNombreComunidadIndigena1.setMaximum(100);
        validatorManzana1.setMaximum(30);
        validatorCompania1.setMaximum(100);
        validatorDireccion1.setMaximum(8160);
        validatorNombreResponsableHogar1.setMaximum(100);
        validatorNumeroTelefonoRespHogar1.setMaximum(50);
        validatorNombreReferente1.setMaximum(100);
        validatorNumeroTelefonoReferente1.setMaximum(50);
        converterFechaValidacionCenso1.setPattern("dd/MM/yyyy");
        converterFechaValidacionCenso1.setType("date");
        validatorOtraCausaInvCenso1.setMaximum(100);
        validatorComentariosValidacionCenso1.setMaximum(8160);
        converterFechaReclamoCenso1.setPattern("dd/MM/yyyy");
        converterFechaReclamoCenso1.setType("date");
        validatorComentariosReclamoCenso1.setMaximum(8160);
        converterFechaAprobacionReclamoCenso1.setPattern("dd/MM/yyyy");
        converterFechaAprobacionReclamoCenso1.setType("date");
        validatorComentariosAprReclCen1.setMaximum(8160);
        converterFechaDenegacionReclamoCenso1.setPattern("dd/MM/yyyy");
        converterFechaDenegacionReclamoCenso1.setType("date");
        validatorOtraCausaDenReclCen1.setMaximum(100);
        validatorComentariosDenReclCen1.setMaximum(8160);
        converterFechaRegistroPotBen1.setPattern("dd/MM/yyyy");
        converterFechaRegistroPotBen1.setType("date");
        converterFechaUltimaVisitaCenso1.setPattern("dd/MM/yyyy");
        converterFechaUltimaVisitaCenso1.setType("date");
        validatorObservacionesUltVisitaCen1.setMaximum(8160);
        validatorReferenciaDireccion1.setMaximum(8160);
        converterIndiceCalidadVida1.setMinIntegerDigits(1);
        converterIndiceCalidadVida1.setMaxIntegerDigits(40);
        converterIndiceCalidadVida1.setMaxFractionDigits(3);
        validatorIndiceCalidadVida1.setMinimum(0.0);
        validatorIndiceCalidadVida1.setMaximum(1.0E2);
        validatorLote1.setMinimum(0L);
        validatorLote1.setMaximum(1000000000000000000L);
        potencialBenDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.potencialBenRowSet}"));
        personaReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.personaReferenceRowSet}"));
        etniaIndigenaReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.etniaIndigenaReferenceRowSet}"));
        ubicacionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.ubicacionReferenceRowSet}"));
        funcionarioReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.funcionarioReferenceRowSet}"));
        fichaPersonaReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fichaPersonaReferenceRowSet}"));
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

    private LongConverter converterIdPotencialBen1 = new LongConverter();
  
    public LongConverter getConverterIdPotencialBen1() {
        return converterIdPotencialBen1;
    }
  
    public void setConverterIdPotencialBen1(LongConverter converter) {
        this.converterIdPotencialBen1 = converter;
    }
  
    private LongRangeValidator validatorIdPotencialBen1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdPotencialBen1() {
        return validatorIdPotencialBen1;
    }
  
    public void setValidatorIdPotencialBen1(LongRangeValidator validator) {
        this.validatorIdPotencialBen1 = validator;
    }
  
    private TableColumn tableColumnCodigoPotencialBen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCodigoPotencialBen1() {
        return tableColumnCodigoPotencialBen1;
    }

    public void setTableColumnCodigoPotencialBen1(TableColumn component) {
        this.tableColumnCodigoPotencialBen1 = component;
    }

    private Label labelCodigoPotencialBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoPotencialBen1() {
        return labelCodigoPotencialBen1;
    }

    public void setLabelCodigoPotencialBen1(Label l) {
        this.labelCodigoPotencialBen1 = l;
    }

    private TextField campoCodigoPotencialBen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoPotencialBen1() {
        return campoCodigoPotencialBen1;
    }

    public void setCampoCodigoPotencialBen1(TextField component) {
        this.campoCodigoPotencialBen1 = component;
    }

    private StaticText campoCodigoPotencialBen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoPotencialBen1Texto1() {
        return campoCodigoPotencialBen1Texto1;
    }

    public void setCampoCodigoPotencialBen1Texto1(StaticText component) {
        this.campoCodigoPotencialBen1Texto1 = component;
    }

    private LengthValidator validatorCodigoPotencialBen1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoPotencialBen1() {
        return validatorCodigoPotencialBen1;
    }
  
    public void setValidatorCodigoPotencialBen1(LengthValidator validator) {
        this.validatorCodigoPotencialBen1 = validator;
    }
  
    private TableColumn tableColumnNombrePotencialBen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombrePotencialBen1() {
        return tableColumnNombrePotencialBen1;
    }

    public void setTableColumnNombrePotencialBen1(TableColumn component) {
        this.tableColumnNombrePotencialBen1 = component;
    }

    private Label labelNombrePotencialBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombrePotencialBen1() {
        return labelNombrePotencialBen1;
    }

    public void setLabelNombrePotencialBen1(Label l) {
        this.labelNombrePotencialBen1 = l;
    }

    private TextField campoNombrePotencialBen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombrePotencialBen1() {
        return campoNombrePotencialBen1;
    }

    public void setCampoNombrePotencialBen1(TextField component) {
        this.campoNombrePotencialBen1 = component;
    }

    private StaticText campoNombrePotencialBen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombrePotencialBen1Texto1() {
        return campoNombrePotencialBen1Texto1;
    }

    public void setCampoNombrePotencialBen1Texto1(StaticText component) {
        this.campoNombrePotencialBen1Texto1 = component;
    }

    private LengthValidator validatorNombrePotencialBen1 = new LengthValidator();
  
    public LengthValidator getValidatorNombrePotencialBen1() {
        return validatorNombrePotencialBen1;
    }
  
    public void setValidatorNombrePotencialBen1(LengthValidator validator) {
        this.validatorNombrePotencialBen1 = validator;
    }
  
    private TableColumn tableColumnNumeroTipoRegPotBen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoRegPotBen1() {
        return tableColumnNumeroTipoRegPotBen1;
    }

    public void setTableColumnNumeroTipoRegPotBen1(TableColumn component) {
        this.tableColumnNumeroTipoRegPotBen1 = component;
    }

    private Label labelNumeroTipoRegPotBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoRegPotBen1() {
        return labelNumeroTipoRegPotBen1;
    }

    public void setLabelNumeroTipoRegPotBen1(Label l) {
        this.labelNumeroTipoRegPotBen1 = l;
    }

    private DropDown listaNumeroTipoRegPotBen1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoRegPotBen1() {
        return listaNumeroTipoRegPotBen1;
    }

    public void setListaNumeroTipoRegPotBen1(DropDown component) {
        this.listaNumeroTipoRegPotBen1 = component;
    }

    private DropDown listaNumeroTipoRegPotBen1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoRegPotBen1x1() {
        return listaNumeroTipoRegPotBen1x1;
    }

    public void setListaNumeroTipoRegPotBen1x1(DropDown component) {
        this.listaNumeroTipoRegPotBen1x1 = component;
    }

    private StaticText listaNumeroTipoRegPotBen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoRegPotBen1Texto1() {
        return listaNumeroTipoRegPotBen1Texto1;
    }

    public void setListaNumeroTipoRegPotBen1Texto1(StaticText component) {
        this.listaNumeroTipoRegPotBen1Texto1 = component;
    }

    private StaticText listaNumeroTipoRegPotBen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoRegPotBen1x1Texto1() {
        return listaNumeroTipoRegPotBen1x1Texto1;
    }

    public void setListaNumeroTipoRegPotBen1x1Texto1(StaticText component) {
        this.listaNumeroTipoRegPotBen1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoRegPotBen1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoRegPotBen1() {
        return converterNumeroTipoRegPotBen1;
    }
  
    public void setConverterNumeroTipoRegPotBen1(IntegerConverter converter) {
        this.converterNumeroTipoRegPotBen1 = converter;
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

    private TextField campoIdPersona1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdPersona1x1() {
        return campoIdPersona1x1;
    }

    public void setCampoIdPersona1x1(TextField component) {
        this.campoIdPersona1x1 = component;
    }

    private StaticText campoIdPersona1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdPersona1Texto1() {
        return campoIdPersona1Texto1;
    }

    public void setCampoIdPersona1Texto1(StaticText component) {
        this.campoIdPersona1Texto1 = component;
    }

    private StaticText campoIdPersona1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdPersona1x1Texto1() {
        return campoIdPersona1x1Texto1;
    }

    public void setCampoIdPersona1x1Texto1(StaticText component) {
        this.campoIdPersona1x1Texto1 = component;
    }

    private Button campoIdPersona1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdPersona1Boton1() {
        return campoIdPersona1Boton1;
    }

    public void setCampoIdPersona1Boton1(Button component) {
        this.campoIdPersona1Boton1 = component;
    }

    private Button campoIdPersona1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdPersona1x1Boton1() {
        return campoIdPersona1x1Boton1;
    }

    public void setCampoIdPersona1x1Boton1(Button component) {
        this.campoIdPersona1x1Boton1 = component;
    }

    private Button campoIdPersona1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPersona1Boton3() {
        return campoIdPersona1Boton3;
    }

    public void setCampoIdPersona1Boton3(Button component) {
        this.campoIdPersona1Boton3 = component;
    }

    private Button campoIdPersona1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPersona1x1Boton3() {
        return campoIdPersona1x1Boton3;
    }

    public void setCampoIdPersona1x1Boton3(Button component) {
        this.campoIdPersona1x1Boton3 = component;
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

    private TableColumn tableColumnNumeroCedula1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroCedula1() {
        return tableColumnNumeroCedula1;
    }

    public void setTableColumnNumeroCedula1(TableColumn component) {
        this.tableColumnNumeroCedula1 = component;
    }

    private Label labelNumeroCedula1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCedula1() {
        return labelNumeroCedula1;
    }

    public void setLabelNumeroCedula1(Label l) {
        this.labelNumeroCedula1 = l;
    }

    private TextField campoNumeroCedula1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroCedula1() {
        return campoNumeroCedula1;
    }

    public void setCampoNumeroCedula1(TextField component) {
        this.campoNumeroCedula1 = component;
    }

    private TextField campoNumeroCedula1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroCedula1x1() {
        return campoNumeroCedula1x1;
    }

    public void setCampoNumeroCedula1x1(TextField component) {
        this.campoNumeroCedula1x1 = component;
    }

    private StaticText campoNumeroCedula1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroCedula1Texto1() {
        return campoNumeroCedula1Texto1;
    }

    public void setCampoNumeroCedula1Texto1(StaticText component) {
        this.campoNumeroCedula1Texto1 = component;
    }

    private StaticText campoNumeroCedula1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroCedula1x1Texto1() {
        return campoNumeroCedula1x1Texto1;
    }

    public void setCampoNumeroCedula1x1Texto1(StaticText component) {
        this.campoNumeroCedula1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroCedula1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCedula1() {
        return converterNumeroCedula1;
    }
  
    public void setConverterNumeroCedula1(IntegerConverter converter) {
        this.converterNumeroCedula1 = converter;
    }
  
    private LongRangeValidator validatorNumeroCedula1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroCedula1() {
        return validatorNumeroCedula1;
    }
  
    public void setValidatorNumeroCedula1(LongRangeValidator validator) {
        this.validatorNumeroCedula1 = validator;
    }
  
    private TableColumn tableColumnLetraCedula1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnLetraCedula1() {
        return tableColumnLetraCedula1;
    }

    public void setTableColumnLetraCedula1(TableColumn component) {
        this.tableColumnLetraCedula1 = component;
    }

    private Label labelLetraCedula1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLetraCedula1() {
        return labelLetraCedula1;
    }

    public void setLabelLetraCedula1(Label l) {
        this.labelLetraCedula1 = l;
    }

    private TextField campoLetraCedula1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoLetraCedula1() {
        return campoLetraCedula1;
    }

    public void setCampoLetraCedula1(TextField component) {
        this.campoLetraCedula1 = component;
    }

    private TextField campoLetraCedula1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoLetraCedula1x1() {
        return campoLetraCedula1x1;
    }

    public void setCampoLetraCedula1x1(TextField component) {
        this.campoLetraCedula1x1 = component;
    }

    private StaticText campoLetraCedula1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLetraCedula1Texto1() {
        return campoLetraCedula1Texto1;
    }

    public void setCampoLetraCedula1Texto1(StaticText component) {
        this.campoLetraCedula1Texto1 = component;
    }

    private StaticText campoLetraCedula1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLetraCedula1x1Texto1() {
        return campoLetraCedula1x1Texto1;
    }

    public void setCampoLetraCedula1x1Texto1(StaticText component) {
        this.campoLetraCedula1x1Texto1 = component;
    }

    private LengthValidator validatorLetraCedula1 = new LengthValidator();
  
    public LengthValidator getValidatorLetraCedula1() {
        return validatorLetraCedula1;
    }
  
    public void setValidatorLetraCedula1(LengthValidator validator) {
        this.validatorLetraCedula1 = validator;
    }
  
    private TableColumn tableColumnFechaExpedicionCedula1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaExpedicionCedula1() {
        return tableColumnFechaExpedicionCedula1;
    }

    public void setTableColumnFechaExpedicionCedula1(TableColumn component) {
        this.tableColumnFechaExpedicionCedula1 = component;
    }

    private Label labelFechaExpedicionCedula1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaExpedicionCedula1() {
        return labelFechaExpedicionCedula1;
    }

    public void setLabelFechaExpedicionCedula1(Label l) {
        this.labelFechaExpedicionCedula1 = l;
    }

    private TextField campoFechaExpedicionCedula1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaExpedicionCedula1() {
        return campoFechaExpedicionCedula1;
    }

    public void setCampoFechaExpedicionCedula1(TextField component) {
        this.campoFechaExpedicionCedula1 = component;
    }

    private TextField campoFechaExpedicionCedula1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaExpedicionCedula1x1() {
        return campoFechaExpedicionCedula1x1;
    }

    public void setCampoFechaExpedicionCedula1x1(TextField component) {
        this.campoFechaExpedicionCedula1x1 = component;
    }

    private StaticText campoFechaExpedicionCedula1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaExpedicionCedula1Texto1() {
        return campoFechaExpedicionCedula1Texto1;
    }

    public void setCampoFechaExpedicionCedula1Texto1(StaticText component) {
        this.campoFechaExpedicionCedula1Texto1 = component;
    }

    private StaticText campoFechaExpedicionCedula1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaExpedicionCedula1x1Texto1() {
        return campoFechaExpedicionCedula1x1Texto1;
    }

    public void setCampoFechaExpedicionCedula1x1Texto1(StaticText component) {
        this.campoFechaExpedicionCedula1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaExpedicionCedula1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaExpedicionCedula1() {
        return converterFechaExpedicionCedula1;
    }
  
    public void setConverterFechaExpedicionCedula1(SqlTimestampConverter converter) {
        this.converterFechaExpedicionCedula1 = converter;
    }
  
    private TableColumn tableColumnFechaVencimientoCedula1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaVencimientoCedula1() {
        return tableColumnFechaVencimientoCedula1;
    }

    public void setTableColumnFechaVencimientoCedula1(TableColumn component) {
        this.tableColumnFechaVencimientoCedula1 = component;
    }

    private Label labelFechaVencimientoCedula1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaVencimientoCedula1() {
        return labelFechaVencimientoCedula1;
    }

    public void setLabelFechaVencimientoCedula1(Label l) {
        this.labelFechaVencimientoCedula1 = l;
    }

    private TextField campoFechaVencimientoCedula1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaVencimientoCedula1() {
        return campoFechaVencimientoCedula1;
    }

    public void setCampoFechaVencimientoCedula1(TextField component) {
        this.campoFechaVencimientoCedula1 = component;
    }

    private TextField campoFechaVencimientoCedula1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaVencimientoCedula1x1() {
        return campoFechaVencimientoCedula1x1;
    }

    public void setCampoFechaVencimientoCedula1x1(TextField component) {
        this.campoFechaVencimientoCedula1x1 = component;
    }

    private StaticText campoFechaVencimientoCedula1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaVencimientoCedula1Texto1() {
        return campoFechaVencimientoCedula1Texto1;
    }

    public void setCampoFechaVencimientoCedula1Texto1(StaticText component) {
        this.campoFechaVencimientoCedula1Texto1 = component;
    }

    private StaticText campoFechaVencimientoCedula1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaVencimientoCedula1x1Texto1() {
        return campoFechaVencimientoCedula1x1Texto1;
    }

    public void setCampoFechaVencimientoCedula1x1Texto1(StaticText component) {
        this.campoFechaVencimientoCedula1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaVencimientoCedula1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaVencimientoCedula1() {
        return converterFechaVencimientoCedula1;
    }
  
    public void setConverterFechaVencimientoCedula1(SqlTimestampConverter converter) {
        this.converterFechaVencimientoCedula1 = converter;
    }
  
    private TableColumn tableColumnPrimerNombre1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnPrimerNombre1() {
        return tableColumnPrimerNombre1;
    }

    public void setTableColumnPrimerNombre1(TableColumn component) {
        this.tableColumnPrimerNombre1 = component;
    }

    private Label labelPrimerNombre1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelPrimerNombre1() {
        return labelPrimerNombre1;
    }

    public void setLabelPrimerNombre1(Label l) {
        this.labelPrimerNombre1 = l;
    }

    private TextField campoPrimerNombre1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoPrimerNombre1() {
        return campoPrimerNombre1;
    }

    public void setCampoPrimerNombre1(TextField component) {
        this.campoPrimerNombre1 = component;
    }

    private TextField campoPrimerNombre1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoPrimerNombre1x1() {
        return campoPrimerNombre1x1;
    }

    public void setCampoPrimerNombre1x1(TextField component) {
        this.campoPrimerNombre1x1 = component;
    }

    private StaticText campoPrimerNombre1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoPrimerNombre1Texto1() {
        return campoPrimerNombre1Texto1;
    }

    public void setCampoPrimerNombre1Texto1(StaticText component) {
        this.campoPrimerNombre1Texto1 = component;
    }

    private StaticText campoPrimerNombre1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoPrimerNombre1x1Texto1() {
        return campoPrimerNombre1x1Texto1;
    }

    public void setCampoPrimerNombre1x1Texto1(StaticText component) {
        this.campoPrimerNombre1x1Texto1 = component;
    }

    private LengthValidator validatorPrimerNombre1 = new LengthValidator();
  
    public LengthValidator getValidatorPrimerNombre1() {
        return validatorPrimerNombre1;
    }
  
    public void setValidatorPrimerNombre1(LengthValidator validator) {
        this.validatorPrimerNombre1 = validator;
    }
  
    private TableColumn tableColumnSegundoNombre1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnSegundoNombre1() {
        return tableColumnSegundoNombre1;
    }

    public void setTableColumnSegundoNombre1(TableColumn component) {
        this.tableColumnSegundoNombre1 = component;
    }

    private Label labelSegundoNombre1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelSegundoNombre1() {
        return labelSegundoNombre1;
    }

    public void setLabelSegundoNombre1(Label l) {
        this.labelSegundoNombre1 = l;
    }

    private TextField campoSegundoNombre1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoSegundoNombre1() {
        return campoSegundoNombre1;
    }

    public void setCampoSegundoNombre1(TextField component) {
        this.campoSegundoNombre1 = component;
    }

    private TextField campoSegundoNombre1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoSegundoNombre1x1() {
        return campoSegundoNombre1x1;
    }

    public void setCampoSegundoNombre1x1(TextField component) {
        this.campoSegundoNombre1x1 = component;
    }

    private StaticText campoSegundoNombre1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoSegundoNombre1Texto1() {
        return campoSegundoNombre1Texto1;
    }

    public void setCampoSegundoNombre1Texto1(StaticText component) {
        this.campoSegundoNombre1Texto1 = component;
    }

    private StaticText campoSegundoNombre1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoSegundoNombre1x1Texto1() {
        return campoSegundoNombre1x1Texto1;
    }

    public void setCampoSegundoNombre1x1Texto1(StaticText component) {
        this.campoSegundoNombre1x1Texto1 = component;
    }

    private LengthValidator validatorSegundoNombre1 = new LengthValidator();
  
    public LengthValidator getValidatorSegundoNombre1() {
        return validatorSegundoNombre1;
    }
  
    public void setValidatorSegundoNombre1(LengthValidator validator) {
        this.validatorSegundoNombre1 = validator;
    }
  
    private TableColumn tableColumnPrimerApellido1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnPrimerApellido1() {
        return tableColumnPrimerApellido1;
    }

    public void setTableColumnPrimerApellido1(TableColumn component) {
        this.tableColumnPrimerApellido1 = component;
    }

    private Label labelPrimerApellido1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelPrimerApellido1() {
        return labelPrimerApellido1;
    }

    public void setLabelPrimerApellido1(Label l) {
        this.labelPrimerApellido1 = l;
    }

    private TextField campoPrimerApellido1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoPrimerApellido1() {
        return campoPrimerApellido1;
    }

    public void setCampoPrimerApellido1(TextField component) {
        this.campoPrimerApellido1 = component;
    }

    private TextField campoPrimerApellido1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoPrimerApellido1x1() {
        return campoPrimerApellido1x1;
    }

    public void setCampoPrimerApellido1x1(TextField component) {
        this.campoPrimerApellido1x1 = component;
    }

    private StaticText campoPrimerApellido1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoPrimerApellido1Texto1() {
        return campoPrimerApellido1Texto1;
    }

    public void setCampoPrimerApellido1Texto1(StaticText component) {
        this.campoPrimerApellido1Texto1 = component;
    }

    private StaticText campoPrimerApellido1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoPrimerApellido1x1Texto1() {
        return campoPrimerApellido1x1Texto1;
    }

    public void setCampoPrimerApellido1x1Texto1(StaticText component) {
        this.campoPrimerApellido1x1Texto1 = component;
    }

    private LengthValidator validatorPrimerApellido1 = new LengthValidator();
  
    public LengthValidator getValidatorPrimerApellido1() {
        return validatorPrimerApellido1;
    }
  
    public void setValidatorPrimerApellido1(LengthValidator validator) {
        this.validatorPrimerApellido1 = validator;
    }
  
    private TableColumn tableColumnSegundoApellido1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnSegundoApellido1() {
        return tableColumnSegundoApellido1;
    }

    public void setTableColumnSegundoApellido1(TableColumn component) {
        this.tableColumnSegundoApellido1 = component;
    }

    private Label labelSegundoApellido1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelSegundoApellido1() {
        return labelSegundoApellido1;
    }

    public void setLabelSegundoApellido1(Label l) {
        this.labelSegundoApellido1 = l;
    }

    private TextField campoSegundoApellido1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoSegundoApellido1() {
        return campoSegundoApellido1;
    }

    public void setCampoSegundoApellido1(TextField component) {
        this.campoSegundoApellido1 = component;
    }

    private TextField campoSegundoApellido1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoSegundoApellido1x1() {
        return campoSegundoApellido1x1;
    }

    public void setCampoSegundoApellido1x1(TextField component) {
        this.campoSegundoApellido1x1 = component;
    }

    private StaticText campoSegundoApellido1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoSegundoApellido1Texto1() {
        return campoSegundoApellido1Texto1;
    }

    public void setCampoSegundoApellido1Texto1(StaticText component) {
        this.campoSegundoApellido1Texto1 = component;
    }

    private StaticText campoSegundoApellido1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoSegundoApellido1x1Texto1() {
        return campoSegundoApellido1x1Texto1;
    }

    public void setCampoSegundoApellido1x1Texto1(StaticText component) {
        this.campoSegundoApellido1x1Texto1 = component;
    }

    private LengthValidator validatorSegundoApellido1 = new LengthValidator();
  
    public LengthValidator getValidatorSegundoApellido1() {
        return validatorSegundoApellido1;
    }
  
    public void setValidatorSegundoApellido1(LengthValidator validator) {
        this.validatorSegundoApellido1 = validator;
    }
  
    private TableColumn tableColumnApellidoCasada1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnApellidoCasada1() {
        return tableColumnApellidoCasada1;
    }

    public void setTableColumnApellidoCasada1(TableColumn component) {
        this.tableColumnApellidoCasada1 = component;
    }

    private Label labelApellidoCasada1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelApellidoCasada1() {
        return labelApellidoCasada1;
    }

    public void setLabelApellidoCasada1(Label l) {
        this.labelApellidoCasada1 = l;
    }

    private TextField campoApellidoCasada1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoApellidoCasada1() {
        return campoApellidoCasada1;
    }

    public void setCampoApellidoCasada1(TextField component) {
        this.campoApellidoCasada1 = component;
    }

    private TextField campoApellidoCasada1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoApellidoCasada1x1() {
        return campoApellidoCasada1x1;
    }

    public void setCampoApellidoCasada1x1(TextField component) {
        this.campoApellidoCasada1x1 = component;
    }

    private StaticText campoApellidoCasada1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoApellidoCasada1Texto1() {
        return campoApellidoCasada1Texto1;
    }

    public void setCampoApellidoCasada1Texto1(StaticText component) {
        this.campoApellidoCasada1Texto1 = component;
    }

    private StaticText campoApellidoCasada1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoApellidoCasada1x1Texto1() {
        return campoApellidoCasada1x1Texto1;
    }

    public void setCampoApellidoCasada1x1Texto1(StaticText component) {
        this.campoApellidoCasada1x1Texto1 = component;
    }

    private LengthValidator validatorApellidoCasada1 = new LengthValidator();
  
    public LengthValidator getValidatorApellidoCasada1() {
        return validatorApellidoCasada1;
    }
  
    public void setValidatorApellidoCasada1(LengthValidator validator) {
        this.validatorApellidoCasada1 = validator;
    }
  
    private TableColumn tableColumnApodo1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnApodo1() {
        return tableColumnApodo1;
    }

    public void setTableColumnApodo1(TableColumn component) {
        this.tableColumnApodo1 = component;
    }

    private Label labelApodo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelApodo1() {
        return labelApodo1;
    }

    public void setLabelApodo1(Label l) {
        this.labelApodo1 = l;
    }

    private TextField campoApodo1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoApodo1() {
        return campoApodo1;
    }

    public void setCampoApodo1(TextField component) {
        this.campoApodo1 = component;
    }

    private TextField campoApodo1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoApodo1x1() {
        return campoApodo1x1;
    }

    public void setCampoApodo1x1(TextField component) {
        this.campoApodo1x1 = component;
    }

    private StaticText campoApodo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoApodo1Texto1() {
        return campoApodo1Texto1;
    }

    public void setCampoApodo1Texto1(StaticText component) {
        this.campoApodo1Texto1 = component;
    }

    private StaticText campoApodo1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoApodo1x1Texto1() {
        return campoApodo1x1Texto1;
    }

    public void setCampoApodo1x1Texto1(StaticText component) {
        this.campoApodo1x1Texto1 = component;
    }

    private LengthValidator validatorApodo1 = new LengthValidator();
  
    public LengthValidator getValidatorApodo1() {
        return validatorApodo1;
    }
  
    public void setValidatorApodo1(LengthValidator validator) {
        this.validatorApodo1 = validator;
    }
  
    private TableColumn tableColumnFechaNacimiento1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaNacimiento1() {
        return tableColumnFechaNacimiento1;
    }

    public void setTableColumnFechaNacimiento1(TableColumn component) {
        this.tableColumnFechaNacimiento1 = component;
    }

    private Label labelFechaNacimiento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaNacimiento1() {
        return labelFechaNacimiento1;
    }

    public void setLabelFechaNacimiento1(Label l) {
        this.labelFechaNacimiento1 = l;
    }

    private TextField campoFechaNacimiento1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaNacimiento1() {
        return campoFechaNacimiento1;
    }

    public void setCampoFechaNacimiento1(TextField component) {
        this.campoFechaNacimiento1 = component;
    }

    private TextField campoFechaNacimiento1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaNacimiento1x1() {
        return campoFechaNacimiento1x1;
    }

    public void setCampoFechaNacimiento1x1(TextField component) {
        this.campoFechaNacimiento1x1 = component;
    }

    private StaticText campoFechaNacimiento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaNacimiento1Texto1() {
        return campoFechaNacimiento1Texto1;
    }

    public void setCampoFechaNacimiento1Texto1(StaticText component) {
        this.campoFechaNacimiento1Texto1 = component;
    }

    private StaticText campoFechaNacimiento1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaNacimiento1x1Texto1() {
        return campoFechaNacimiento1x1Texto1;
    }

    public void setCampoFechaNacimiento1x1Texto1(StaticText component) {
        this.campoFechaNacimiento1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaNacimiento1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaNacimiento1() {
        return converterFechaNacimiento1;
    }
  
    public void setConverterFechaNacimiento1(SqlTimestampConverter converter) {
        this.converterFechaNacimiento1 = converter;
    }
  
    private TableColumn tableColumnEdad1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEdad1() {
        return tableColumnEdad1;
    }

    public void setTableColumnEdad1(TableColumn component) {
        this.tableColumnEdad1 = component;
    }

    private Label labelEdad1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEdad1() {
        return labelEdad1;
    }

    public void setLabelEdad1(Label l) {
        this.labelEdad1 = l;
    }

    private TextField campoEdad1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoEdad1() {
        return campoEdad1;
    }

    public void setCampoEdad1(TextField component) {
        this.campoEdad1 = component;
    }

    private TextField campoEdad1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoEdad1x1() {
        return campoEdad1x1;
    }

    public void setCampoEdad1x1(TextField component) {
        this.campoEdad1x1 = component;
    }

    private StaticText campoEdad1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoEdad1Texto1() {
        return campoEdad1Texto1;
    }

    public void setCampoEdad1Texto1(StaticText component) {
        this.campoEdad1Texto1 = component;
    }

    private StaticText campoEdad1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoEdad1x1Texto1() {
        return campoEdad1x1Texto1;
    }

    public void setCampoEdad1x1Texto1(StaticText component) {
        this.campoEdad1x1Texto1 = component;
    }

    private IntegerConverter converterEdad1 = new IntegerConverter();
  
    public IntegerConverter getConverterEdad1() {
        return converterEdad1;
    }
  
    public void setConverterEdad1(IntegerConverter converter) {
        this.converterEdad1 = converter;
    }
  
    private LongRangeValidator validatorEdad1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorEdad1() {
        return validatorEdad1;
    }
  
    public void setValidatorEdad1(LongRangeValidator validator) {
        this.validatorEdad1 = validator;
    }
  
    private TableColumn tableColumnEsParaguayoNatural1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsParaguayoNatural1() {
        return tableColumnEsParaguayoNatural1;
    }

    public void setTableColumnEsParaguayoNatural1(TableColumn component) {
        this.tableColumnEsParaguayoNatural1 = component;
    }

    private Label labelEsParaguayoNatural1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsParaguayoNatural1() {
        return labelEsParaguayoNatural1;
    }

    public void setLabelEsParaguayoNatural1(Label l) {
        this.labelEsParaguayoNatural1 = l;
    }

    private DropDown listaEsParaguayoNatural1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsParaguayoNatural1() {
        return listaEsParaguayoNatural1;
    }

    public void setListaEsParaguayoNatural1(DropDown component) {
        this.listaEsParaguayoNatural1 = component;
    }

    private DropDown listaEsParaguayoNatural1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsParaguayoNatural1x1() {
        return listaEsParaguayoNatural1x1;
    }

    public void setListaEsParaguayoNatural1x1(DropDown component) {
        this.listaEsParaguayoNatural1x1 = component;
    }

    private StaticText listaEsParaguayoNatural1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsParaguayoNatural1Texto1() {
        return listaEsParaguayoNatural1Texto1;
    }

    public void setListaEsParaguayoNatural1Texto1(StaticText component) {
        this.listaEsParaguayoNatural1Texto1 = component;
    }

    private StaticText listaEsParaguayoNatural1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsParaguayoNatural1x1Texto1() {
        return listaEsParaguayoNatural1x1Texto1;
    }

    public void setListaEsParaguayoNatural1x1Texto1(StaticText component) {
        this.listaEsParaguayoNatural1x1Texto1 = component;
    }

    private IntegerConverter converterEsParaguayoNatural1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsParaguayoNatural1() {
        return converterEsParaguayoNatural1;
    }
  
    public void setConverterEsParaguayoNatural1(IntegerConverter converter) {
        this.converterEsParaguayoNatural1 = converter;
    }
  
    private TableColumn tableColumnEsIndigena1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsIndigena1() {
        return tableColumnEsIndigena1;
    }

    public void setTableColumnEsIndigena1(TableColumn component) {
        this.tableColumnEsIndigena1 = component;
    }

    private Label labelEsIndigena1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsIndigena1() {
        return labelEsIndigena1;
    }

    public void setLabelEsIndigena1(Label l) {
        this.labelEsIndigena1 = l;
    }

    private DropDown listaEsIndigena1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsIndigena1() {
        return listaEsIndigena1;
    }

    public void setListaEsIndigena1(DropDown component) {
        this.listaEsIndigena1 = component;
    }

    private DropDown listaEsIndigena1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsIndigena1x1() {
        return listaEsIndigena1x1;
    }

    public void setListaEsIndigena1x1(DropDown component) {
        this.listaEsIndigena1x1 = component;
    }

    private StaticText listaEsIndigena1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsIndigena1Texto1() {
        return listaEsIndigena1Texto1;
    }

    public void setListaEsIndigena1Texto1(StaticText component) {
        this.listaEsIndigena1Texto1 = component;
    }

    private StaticText listaEsIndigena1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsIndigena1x1Texto1() {
        return listaEsIndigena1x1Texto1;
    }

    public void setListaEsIndigena1x1Texto1(StaticText component) {
        this.listaEsIndigena1x1Texto1 = component;
    }

    private IntegerConverter converterEsIndigena1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsIndigena1() {
        return converterEsIndigena1;
    }
  
    public void setConverterEsIndigena1(IntegerConverter converter) {
        this.converterEsIndigena1 = converter;
    }
  
    private TableColumn tableColumnIdEtniaIndigena1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdEtniaIndigena1() {
        return tableColumnIdEtniaIndigena1;
    }

    public void setTableColumnIdEtniaIndigena1(TableColumn component) {
        this.tableColumnIdEtniaIndigena1 = component;
    }

    private Label labelIdEtniaIndigena1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdEtniaIndigena1() {
        return labelIdEtniaIndigena1;
    }

    public void setLabelIdEtniaIndigena1(Label l) {
        this.labelIdEtniaIndigena1 = l;
    }

    private TextField campoIdEtniaIndigena1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdEtniaIndigena1() {
        return campoIdEtniaIndigena1;
    }

    public void setCampoIdEtniaIndigena1(TextField component) {
        this.campoIdEtniaIndigena1 = component;
    }

    private TextField campoIdEtniaIndigena1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdEtniaIndigena1x1() {
        return campoIdEtniaIndigena1x1;
    }

    public void setCampoIdEtniaIndigena1x1(TextField component) {
        this.campoIdEtniaIndigena1x1 = component;
    }

    private StaticText campoIdEtniaIndigena1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdEtniaIndigena1Texto1() {
        return campoIdEtniaIndigena1Texto1;
    }

    public void setCampoIdEtniaIndigena1Texto1(StaticText component) {
        this.campoIdEtniaIndigena1Texto1 = component;
    }

    private StaticText campoIdEtniaIndigena1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdEtniaIndigena1x1Texto1() {
        return campoIdEtniaIndigena1x1Texto1;
    }

    public void setCampoIdEtniaIndigena1x1Texto1(StaticText component) {
        this.campoIdEtniaIndigena1x1Texto1 = component;
    }

    private Button campoIdEtniaIndigena1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdEtniaIndigena1Boton1() {
        return campoIdEtniaIndigena1Boton1;
    }

    public void setCampoIdEtniaIndigena1Boton1(Button component) {
        this.campoIdEtniaIndigena1Boton1 = component;
    }

    private Button campoIdEtniaIndigena1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdEtniaIndigena1x1Boton1() {
        return campoIdEtniaIndigena1x1Boton1;
    }

    public void setCampoIdEtniaIndigena1x1Boton1(Button component) {
        this.campoIdEtniaIndigena1x1Boton1 = component;
    }

    private Button campoIdEtniaIndigena1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdEtniaIndigena1Boton3() {
        return campoIdEtniaIndigena1Boton3;
    }

    public void setCampoIdEtniaIndigena1Boton3(Button component) {
        this.campoIdEtniaIndigena1Boton3 = component;
    }

    private Button campoIdEtniaIndigena1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdEtniaIndigena1x1Boton3() {
        return campoIdEtniaIndigena1x1Boton3;
    }

    public void setCampoIdEtniaIndigena1x1Boton3(Button component) {
        this.campoIdEtniaIndigena1x1Boton3 = component;
    }

    private TableColumn tableColumnIdEtniaIndigena2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdEtniaIndigena2() {
        return tableColumnIdEtniaIndigena2;
    }

    public void setTableColumnIdEtniaIndigena2(TableColumn component) {
        this.tableColumnIdEtniaIndigena2 = component;
    }

    private Label labelIdEtniaIndigena2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdEtniaIndigena2() {
        return labelIdEtniaIndigena2;
    }

    public void setLabelIdEtniaIndigena2(Label l) {
        this.labelIdEtniaIndigena2 = l;
    }

    private ImageHyperlink campoIdEtniaIndigena1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdEtniaIndigena1Hiper1() {
        return campoIdEtniaIndigena1Hiper1;
    }

    public void setCampoIdEtniaIndigena1Hiper1(ImageHyperlink component) {
        this.campoIdEtniaIndigena1Hiper1 = component;
    }

    private TableColumn tableColumnNombreComunidadIndigena1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreComunidadIndigena1() {
        return tableColumnNombreComunidadIndigena1;
    }

    public void setTableColumnNombreComunidadIndigena1(TableColumn component) {
        this.tableColumnNombreComunidadIndigena1 = component;
    }

    private Label labelNombreComunidadIndigena1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreComunidadIndigena1() {
        return labelNombreComunidadIndigena1;
    }

    public void setLabelNombreComunidadIndigena1(Label l) {
        this.labelNombreComunidadIndigena1 = l;
    }

    private TextField campoNombreComunidadIndigena1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreComunidadIndigena1() {
        return campoNombreComunidadIndigena1;
    }

    public void setCampoNombreComunidadIndigena1(TextField component) {
        this.campoNombreComunidadIndigena1 = component;
    }

    private TextField campoNombreComunidadIndigena1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNombreComunidadIndigena1x1() {
        return campoNombreComunidadIndigena1x1;
    }

    public void setCampoNombreComunidadIndigena1x1(TextField component) {
        this.campoNombreComunidadIndigena1x1 = component;
    }

    private StaticText campoNombreComunidadIndigena1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreComunidadIndigena1Texto1() {
        return campoNombreComunidadIndigena1Texto1;
    }

    public void setCampoNombreComunidadIndigena1Texto1(StaticText component) {
        this.campoNombreComunidadIndigena1Texto1 = component;
    }

    private StaticText campoNombreComunidadIndigena1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreComunidadIndigena1x1Texto1() {
        return campoNombreComunidadIndigena1x1Texto1;
    }

    public void setCampoNombreComunidadIndigena1x1Texto1(StaticText component) {
        this.campoNombreComunidadIndigena1x1Texto1 = component;
    }

    private LengthValidator validatorNombreComunidadIndigena1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreComunidadIndigena1() {
        return validatorNombreComunidadIndigena1;
    }
  
    public void setValidatorNombreComunidadIndigena1(LengthValidator validator) {
        this.validatorNombreComunidadIndigena1 = validator;
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
  
    private TableColumn tableColumnCompania1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCompania1() {
        return tableColumnCompania1;
    }

    public void setTableColumnCompania1(TableColumn component) {
        this.tableColumnCompania1 = component;
    }

    private Label labelCompania1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCompania1() {
        return labelCompania1;
    }

    public void setLabelCompania1(Label l) {
        this.labelCompania1 = l;
    }

    private TextField campoCompania1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCompania1() {
        return campoCompania1;
    }

    public void setCampoCompania1(TextField component) {
        this.campoCompania1 = component;
    }

    private TextField campoCompania1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoCompania1x1() {
        return campoCompania1x1;
    }

    public void setCampoCompania1x1(TextField component) {
        this.campoCompania1x1 = component;
    }

    private StaticText campoCompania1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCompania1Texto1() {
        return campoCompania1Texto1;
    }

    public void setCampoCompania1Texto1(StaticText component) {
        this.campoCompania1Texto1 = component;
    }

    private StaticText campoCompania1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCompania1x1Texto1() {
        return campoCompania1x1Texto1;
    }

    public void setCampoCompania1x1Texto1(StaticText component) {
        this.campoCompania1x1Texto1 = component;
    }

    private LengthValidator validatorCompania1 = new LengthValidator();
  
    public LengthValidator getValidatorCompania1() {
        return validatorCompania1;
    }
  
    public void setValidatorCompania1(LengthValidator validator) {
        this.validatorCompania1 = validator;
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
  
    private TableColumn tableColumnNombreResponsableHogar1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreResponsableHogar1() {
        return tableColumnNombreResponsableHogar1;
    }

    public void setTableColumnNombreResponsableHogar1(TableColumn component) {
        this.tableColumnNombreResponsableHogar1 = component;
    }

    private Label labelNombreResponsableHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreResponsableHogar1() {
        return labelNombreResponsableHogar1;
    }

    public void setLabelNombreResponsableHogar1(Label l) {
        this.labelNombreResponsableHogar1 = l;
    }

    private TextField campoNombreResponsableHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreResponsableHogar1() {
        return campoNombreResponsableHogar1;
    }

    public void setCampoNombreResponsableHogar1(TextField component) {
        this.campoNombreResponsableHogar1 = component;
    }

    private TextField campoNombreResponsableHogar1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNombreResponsableHogar1x1() {
        return campoNombreResponsableHogar1x1;
    }

    public void setCampoNombreResponsableHogar1x1(TextField component) {
        this.campoNombreResponsableHogar1x1 = component;
    }

    private StaticText campoNombreResponsableHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreResponsableHogar1Texto1() {
        return campoNombreResponsableHogar1Texto1;
    }

    public void setCampoNombreResponsableHogar1Texto1(StaticText component) {
        this.campoNombreResponsableHogar1Texto1 = component;
    }

    private StaticText campoNombreResponsableHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreResponsableHogar1x1Texto1() {
        return campoNombreResponsableHogar1x1Texto1;
    }

    public void setCampoNombreResponsableHogar1x1Texto1(StaticText component) {
        this.campoNombreResponsableHogar1x1Texto1 = component;
    }

    private LengthValidator validatorNombreResponsableHogar1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreResponsableHogar1() {
        return validatorNombreResponsableHogar1;
    }
  
    public void setValidatorNombreResponsableHogar1(LengthValidator validator) {
        this.validatorNombreResponsableHogar1 = validator;
    }
  
    private TableColumn tableColumnNumeroTelefonoRespHogar1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTelefonoRespHogar1() {
        return tableColumnNumeroTelefonoRespHogar1;
    }

    public void setTableColumnNumeroTelefonoRespHogar1(TableColumn component) {
        this.tableColumnNumeroTelefonoRespHogar1 = component;
    }

    private Label labelNumeroTelefonoRespHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTelefonoRespHogar1() {
        return labelNumeroTelefonoRespHogar1;
    }

    public void setLabelNumeroTelefonoRespHogar1(Label l) {
        this.labelNumeroTelefonoRespHogar1 = l;
    }

    private TextField campoNumeroTelefonoRespHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroTelefonoRespHogar1() {
        return campoNumeroTelefonoRespHogar1;
    }

    public void setCampoNumeroTelefonoRespHogar1(TextField component) {
        this.campoNumeroTelefonoRespHogar1 = component;
    }

    private TextField campoNumeroTelefonoRespHogar1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroTelefonoRespHogar1x1() {
        return campoNumeroTelefonoRespHogar1x1;
    }

    public void setCampoNumeroTelefonoRespHogar1x1(TextField component) {
        this.campoNumeroTelefonoRespHogar1x1 = component;
    }

    private StaticText campoNumeroTelefonoRespHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroTelefonoRespHogar1Texto1() {
        return campoNumeroTelefonoRespHogar1Texto1;
    }

    public void setCampoNumeroTelefonoRespHogar1Texto1(StaticText component) {
        this.campoNumeroTelefonoRespHogar1Texto1 = component;
    }

    private StaticText campoNumeroTelefonoRespHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroTelefonoRespHogar1x1Texto1() {
        return campoNumeroTelefonoRespHogar1x1Texto1;
    }

    public void setCampoNumeroTelefonoRespHogar1x1Texto1(StaticText component) {
        this.campoNumeroTelefonoRespHogar1x1Texto1 = component;
    }

    private LengthValidator validatorNumeroTelefonoRespHogar1 = new LengthValidator();
  
    public LengthValidator getValidatorNumeroTelefonoRespHogar1() {
        return validatorNumeroTelefonoRespHogar1;
    }
  
    public void setValidatorNumeroTelefonoRespHogar1(LengthValidator validator) {
        this.validatorNumeroTelefonoRespHogar1 = validator;
    }
  
    private TableColumn tableColumnEsPersonaConJubilacion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsPersonaConJubilacion1() {
        return tableColumnEsPersonaConJubilacion1;
    }

    public void setTableColumnEsPersonaConJubilacion1(TableColumn component) {
        this.tableColumnEsPersonaConJubilacion1 = component;
    }

    private Label labelEsPersonaConJubilacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConJubilacion1() {
        return labelEsPersonaConJubilacion1;
    }

    public void setLabelEsPersonaConJubilacion1(Label l) {
        this.labelEsPersonaConJubilacion1 = l;
    }

    private DropDown listaEsPersonaConJubilacion1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPersonaConJubilacion1() {
        return listaEsPersonaConJubilacion1;
    }

    public void setListaEsPersonaConJubilacion1(DropDown component) {
        this.listaEsPersonaConJubilacion1 = component;
    }

    private DropDown listaEsPersonaConJubilacion1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPersonaConJubilacion1x1() {
        return listaEsPersonaConJubilacion1x1;
    }

    public void setListaEsPersonaConJubilacion1x1(DropDown component) {
        this.listaEsPersonaConJubilacion1x1 = component;
    }

    private StaticText listaEsPersonaConJubilacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConJubilacion1Texto1() {
        return listaEsPersonaConJubilacion1Texto1;
    }

    public void setListaEsPersonaConJubilacion1Texto1(StaticText component) {
        this.listaEsPersonaConJubilacion1Texto1 = component;
    }

    private StaticText listaEsPersonaConJubilacion1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConJubilacion1x1Texto1() {
        return listaEsPersonaConJubilacion1x1Texto1;
    }

    public void setListaEsPersonaConJubilacion1x1Texto1(StaticText component) {
        this.listaEsPersonaConJubilacion1x1Texto1 = component;
    }

    private IntegerConverter converterEsPersonaConJubilacion1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPersonaConJubilacion1() {
        return converterEsPersonaConJubilacion1;
    }
  
    public void setConverterEsPersonaConJubilacion1(IntegerConverter converter) {
        this.converterEsPersonaConJubilacion1 = converter;
    }
  
    private TableColumn tableColumnEsPersonaConPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsPersonaConPension1() {
        return tableColumnEsPersonaConPension1;
    }

    public void setTableColumnEsPersonaConPension1(TableColumn component) {
        this.tableColumnEsPersonaConPension1 = component;
    }

    private Label labelEsPersonaConPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConPension1() {
        return labelEsPersonaConPension1;
    }

    public void setLabelEsPersonaConPension1(Label l) {
        this.labelEsPersonaConPension1 = l;
    }

    private DropDown listaEsPersonaConPension1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPersonaConPension1() {
        return listaEsPersonaConPension1;
    }

    public void setListaEsPersonaConPension1(DropDown component) {
        this.listaEsPersonaConPension1 = component;
    }

    private DropDown listaEsPersonaConPension1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPersonaConPension1x1() {
        return listaEsPersonaConPension1x1;
    }

    public void setListaEsPersonaConPension1x1(DropDown component) {
        this.listaEsPersonaConPension1x1 = component;
    }

    private StaticText listaEsPersonaConPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConPension1Texto1() {
        return listaEsPersonaConPension1Texto1;
    }

    public void setListaEsPersonaConPension1Texto1(StaticText component) {
        this.listaEsPersonaConPension1Texto1 = component;
    }

    private StaticText listaEsPersonaConPension1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConPension1x1Texto1() {
        return listaEsPersonaConPension1x1Texto1;
    }

    public void setListaEsPersonaConPension1x1Texto1(StaticText component) {
        this.listaEsPersonaConPension1x1Texto1 = component;
    }

    private IntegerConverter converterEsPersonaConPension1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPersonaConPension1() {
        return converterEsPersonaConPension1;
    }
  
    public void setConverterEsPersonaConPension1(IntegerConverter converter) {
        this.converterEsPersonaConPension1 = converter;
    }
  
    private TableColumn tableColumnEsPersonaConSubsidio1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsPersonaConSubsidio1() {
        return tableColumnEsPersonaConSubsidio1;
    }

    public void setTableColumnEsPersonaConSubsidio1(TableColumn component) {
        this.tableColumnEsPersonaConSubsidio1 = component;
    }

    private Label labelEsPersonaConSubsidio1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConSubsidio1() {
        return labelEsPersonaConSubsidio1;
    }

    public void setLabelEsPersonaConSubsidio1(Label l) {
        this.labelEsPersonaConSubsidio1 = l;
    }

    private DropDown listaEsPersonaConSubsidio1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPersonaConSubsidio1() {
        return listaEsPersonaConSubsidio1;
    }

    public void setListaEsPersonaConSubsidio1(DropDown component) {
        this.listaEsPersonaConSubsidio1 = component;
    }

    private DropDown listaEsPersonaConSubsidio1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPersonaConSubsidio1x1() {
        return listaEsPersonaConSubsidio1x1;
    }

    public void setListaEsPersonaConSubsidio1x1(DropDown component) {
        this.listaEsPersonaConSubsidio1x1 = component;
    }

    private StaticText listaEsPersonaConSubsidio1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConSubsidio1Texto1() {
        return listaEsPersonaConSubsidio1Texto1;
    }

    public void setListaEsPersonaConSubsidio1Texto1(StaticText component) {
        this.listaEsPersonaConSubsidio1Texto1 = component;
    }

    private StaticText listaEsPersonaConSubsidio1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConSubsidio1x1Texto1() {
        return listaEsPersonaConSubsidio1x1Texto1;
    }

    public void setListaEsPersonaConSubsidio1x1Texto1(StaticText component) {
        this.listaEsPersonaConSubsidio1x1Texto1 = component;
    }

    private IntegerConverter converterEsPersonaConSubsidio1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPersonaConSubsidio1() {
        return converterEsPersonaConSubsidio1;
    }
  
    public void setConverterEsPersonaConSubsidio1(IntegerConverter converter) {
        this.converterEsPersonaConSubsidio1 = converter;
    }
  
    private TableColumn tableColumnNombreReferente1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNombreReferente1() {
        return tableColumnNombreReferente1;
    }

    public void setTableColumnNombreReferente1(TableColumn component) {
        this.tableColumnNombreReferente1 = component;
    }

    private Label labelNombreReferente1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreReferente1() {
        return labelNombreReferente1;
    }

    public void setLabelNombreReferente1(Label l) {
        this.labelNombreReferente1 = l;
    }

    private TextField campoNombreReferente1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreReferente1() {
        return campoNombreReferente1;
    }

    public void setCampoNombreReferente1(TextField component) {
        this.campoNombreReferente1 = component;
    }

    private TextField campoNombreReferente1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNombreReferente1x1() {
        return campoNombreReferente1x1;
    }

    public void setCampoNombreReferente1x1(TextField component) {
        this.campoNombreReferente1x1 = component;
    }

    private StaticText campoNombreReferente1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreReferente1Texto1() {
        return campoNombreReferente1Texto1;
    }

    public void setCampoNombreReferente1Texto1(StaticText component) {
        this.campoNombreReferente1Texto1 = component;
    }

    private StaticText campoNombreReferente1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreReferente1x1Texto1() {
        return campoNombreReferente1x1Texto1;
    }

    public void setCampoNombreReferente1x1Texto1(StaticText component) {
        this.campoNombreReferente1x1Texto1 = component;
    }

    private LengthValidator validatorNombreReferente1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreReferente1() {
        return validatorNombreReferente1;
    }
  
    public void setValidatorNombreReferente1(LengthValidator validator) {
        this.validatorNombreReferente1 = validator;
    }
  
    private TableColumn tableColumnNumeroTelefonoReferente1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTelefonoReferente1() {
        return tableColumnNumeroTelefonoReferente1;
    }

    public void setTableColumnNumeroTelefonoReferente1(TableColumn component) {
        this.tableColumnNumeroTelefonoReferente1 = component;
    }

    private Label labelNumeroTelefonoReferente1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTelefonoReferente1() {
        return labelNumeroTelefonoReferente1;
    }

    public void setLabelNumeroTelefonoReferente1(Label l) {
        this.labelNumeroTelefonoReferente1 = l;
    }

    private TextField campoNumeroTelefonoReferente1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroTelefonoReferente1() {
        return campoNumeroTelefonoReferente1;
    }

    public void setCampoNumeroTelefonoReferente1(TextField component) {
        this.campoNumeroTelefonoReferente1 = component;
    }

    private TextField campoNumeroTelefonoReferente1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroTelefonoReferente1x1() {
        return campoNumeroTelefonoReferente1x1;
    }

    public void setCampoNumeroTelefonoReferente1x1(TextField component) {
        this.campoNumeroTelefonoReferente1x1 = component;
    }

    private StaticText campoNumeroTelefonoReferente1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroTelefonoReferente1Texto1() {
        return campoNumeroTelefonoReferente1Texto1;
    }

    public void setCampoNumeroTelefonoReferente1Texto1(StaticText component) {
        this.campoNumeroTelefonoReferente1Texto1 = component;
    }

    private StaticText campoNumeroTelefonoReferente1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroTelefonoReferente1x1Texto1() {
        return campoNumeroTelefonoReferente1x1Texto1;
    }

    public void setCampoNumeroTelefonoReferente1x1Texto1(StaticText component) {
        this.campoNumeroTelefonoReferente1x1Texto1 = component;
    }

    private LengthValidator validatorNumeroTelefonoReferente1 = new LengthValidator();
  
    public LengthValidator getValidatorNumeroTelefonoReferente1() {
        return validatorNumeroTelefonoReferente1;
    }
  
    public void setValidatorNumeroTelefonoReferente1(LengthValidator validator) {
        this.validatorNumeroTelefonoReferente1 = validator;
    }
  
    private TableColumn tableColumnNumeroCondicionCenso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroCondicionCenso1() {
        return tableColumnNumeroCondicionCenso1;
    }

    public void setTableColumnNumeroCondicionCenso1(TableColumn component) {
        this.tableColumnNumeroCondicionCenso1 = component;
    }

    private Label labelNumeroCondicionCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionCenso1() {
        return labelNumeroCondicionCenso1;
    }

    public void setLabelNumeroCondicionCenso1(Label l) {
        this.labelNumeroCondicionCenso1 = l;
    }

    private DropDown listaNumeroCondicionCenso1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroCondicionCenso1() {
        return listaNumeroCondicionCenso1;
    }

    public void setListaNumeroCondicionCenso1(DropDown component) {
        this.listaNumeroCondicionCenso1 = component;
    }

    private DropDown listaNumeroCondicionCenso1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCondicionCenso1x1() {
        return listaNumeroCondicionCenso1x1;
    }

    public void setListaNumeroCondicionCenso1x1(DropDown component) {
        this.listaNumeroCondicionCenso1x1 = component;
    }

    private StaticText listaNumeroCondicionCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCondicionCenso1Texto1() {
        return listaNumeroCondicionCenso1Texto1;
    }

    public void setListaNumeroCondicionCenso1Texto1(StaticText component) {
        this.listaNumeroCondicionCenso1Texto1 = component;
    }

    private StaticText listaNumeroCondicionCenso1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCondicionCenso1x1Texto1() {
        return listaNumeroCondicionCenso1x1Texto1;
    }

    public void setListaNumeroCondicionCenso1x1Texto1(StaticText component) {
        this.listaNumeroCondicionCenso1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroCondicionCenso1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCondicionCenso1() {
        return converterNumeroCondicionCenso1;
    }
  
    public void setConverterNumeroCondicionCenso1(IntegerConverter converter) {
        this.converterNumeroCondicionCenso1 = converter;
    }
  
    private TableColumn tableColumnFechaValidacionCenso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaValidacionCenso1() {
        return tableColumnFechaValidacionCenso1;
    }

    public void setTableColumnFechaValidacionCenso1(TableColumn component) {
        this.tableColumnFechaValidacionCenso1 = component;
    }

    private Label labelFechaValidacionCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaValidacionCenso1() {
        return labelFechaValidacionCenso1;
    }

    public void setLabelFechaValidacionCenso1(Label l) {
        this.labelFechaValidacionCenso1 = l;
    }

    private TextField campoFechaValidacionCenso1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaValidacionCenso1() {
        return campoFechaValidacionCenso1;
    }

    public void setCampoFechaValidacionCenso1(TextField component) {
        this.campoFechaValidacionCenso1 = component;
    }

    private TextField campoFechaValidacionCenso1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaValidacionCenso1x1() {
        return campoFechaValidacionCenso1x1;
    }

    public void setCampoFechaValidacionCenso1x1(TextField component) {
        this.campoFechaValidacionCenso1x1 = component;
    }

    private StaticText campoFechaValidacionCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaValidacionCenso1Texto1() {
        return campoFechaValidacionCenso1Texto1;
    }

    public void setCampoFechaValidacionCenso1Texto1(StaticText component) {
        this.campoFechaValidacionCenso1Texto1 = component;
    }

    private StaticText campoFechaValidacionCenso1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaValidacionCenso1x1Texto1() {
        return campoFechaValidacionCenso1x1Texto1;
    }

    public void setCampoFechaValidacionCenso1x1Texto1(StaticText component) {
        this.campoFechaValidacionCenso1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaValidacionCenso1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaValidacionCenso1() {
        return converterFechaValidacionCenso1;
    }
  
    public void setConverterFechaValidacionCenso1(SqlTimestampConverter converter) {
        this.converterFechaValidacionCenso1 = converter;
    }
  
    private TableColumn tableColumnIdFuncionarioValidacionCen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionarioValidacionCen1() {
        return tableColumnIdFuncionarioValidacionCen1;
    }

    public void setTableColumnIdFuncionarioValidacionCen1(TableColumn component) {
        this.tableColumnIdFuncionarioValidacionCen1 = component;
    }

    private Label labelIdFuncionarioValidacionCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioValidacionCen1() {
        return labelIdFuncionarioValidacionCen1;
    }

    public void setLabelIdFuncionarioValidacionCen1(Label l) {
        this.labelIdFuncionarioValidacionCen1 = l;
    }

    private TextField campoIdFuncionarioValidacionCen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionarioValidacionCen1() {
        return campoIdFuncionarioValidacionCen1;
    }

    public void setCampoIdFuncionarioValidacionCen1(TextField component) {
        this.campoIdFuncionarioValidacionCen1 = component;
    }

    private TextField campoIdFuncionarioValidacionCen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdFuncionarioValidacionCen1x1() {
        return campoIdFuncionarioValidacionCen1x1;
    }

    public void setCampoIdFuncionarioValidacionCen1x1(TextField component) {
        this.campoIdFuncionarioValidacionCen1x1 = component;
    }

    private StaticText campoIdFuncionarioValidacionCen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioValidacionCen1Texto1() {
        return campoIdFuncionarioValidacionCen1Texto1;
    }

    public void setCampoIdFuncionarioValidacionCen1Texto1(StaticText component) {
        this.campoIdFuncionarioValidacionCen1Texto1 = component;
    }

    private StaticText campoIdFuncionarioValidacionCen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioValidacionCen1x1Texto1() {
        return campoIdFuncionarioValidacionCen1x1Texto1;
    }

    public void setCampoIdFuncionarioValidacionCen1x1Texto1(StaticText component) {
        this.campoIdFuncionarioValidacionCen1x1Texto1 = component;
    }

    private Button campoIdFuncionarioValidacionCen1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioValidacionCen1Boton1() {
        return campoIdFuncionarioValidacionCen1Boton1;
    }

    public void setCampoIdFuncionarioValidacionCen1Boton1(Button component) {
        this.campoIdFuncionarioValidacionCen1Boton1 = component;
    }

    private Button campoIdFuncionarioValidacionCen1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioValidacionCen1x1Boton1() {
        return campoIdFuncionarioValidacionCen1x1Boton1;
    }

    public void setCampoIdFuncionarioValidacionCen1x1Boton1(Button component) {
        this.campoIdFuncionarioValidacionCen1x1Boton1 = component;
    }

    private Button campoIdFuncionarioValidacionCen1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioValidacionCen1Boton3() {
        return campoIdFuncionarioValidacionCen1Boton3;
    }

    public void setCampoIdFuncionarioValidacionCen1Boton3(Button component) {
        this.campoIdFuncionarioValidacionCen1Boton3 = component;
    }

    private Button campoIdFuncionarioValidacionCen1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioValidacionCen1x1Boton3() {
        return campoIdFuncionarioValidacionCen1x1Boton3;
    }

    public void setCampoIdFuncionarioValidacionCen1x1Boton3(Button component) {
        this.campoIdFuncionarioValidacionCen1x1Boton3 = component;
    }

    private TableColumn tableColumnIdFuncionarioValidacionCen2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionarioValidacionCen2() {
        return tableColumnIdFuncionarioValidacionCen2;
    }

    public void setTableColumnIdFuncionarioValidacionCen2(TableColumn component) {
        this.tableColumnIdFuncionarioValidacionCen2 = component;
    }

    private Label labelIdFuncionarioValidacionCen2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioValidacionCen2() {
        return labelIdFuncionarioValidacionCen2;
    }

    public void setLabelIdFuncionarioValidacionCen2(Label l) {
        this.labelIdFuncionarioValidacionCen2 = l;
    }

    private ImageHyperlink campoIdFuncionarioValidacionCen1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdFuncionarioValidacionCen1Hiper1() {
        return campoIdFuncionarioValidacionCen1Hiper1;
    }

    public void setCampoIdFuncionarioValidacionCen1Hiper1(ImageHyperlink component) {
        this.campoIdFuncionarioValidacionCen1Hiper1 = component;
    }

    private TableColumn tableColumnNumeroCausaInvCenso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroCausaInvCenso1() {
        return tableColumnNumeroCausaInvCenso1;
    }

    public void setTableColumnNumeroCausaInvCenso1(TableColumn component) {
        this.tableColumnNumeroCausaInvCenso1 = component;
    }

    private Label labelNumeroCausaInvCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaInvCenso1() {
        return labelNumeroCausaInvCenso1;
    }

    public void setLabelNumeroCausaInvCenso1(Label l) {
        this.labelNumeroCausaInvCenso1 = l;
    }

    private DropDown listaNumeroCausaInvCenso1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroCausaInvCenso1() {
        return listaNumeroCausaInvCenso1;
    }

    public void setListaNumeroCausaInvCenso1(DropDown component) {
        this.listaNumeroCausaInvCenso1 = component;
    }

    private DropDown listaNumeroCausaInvCenso1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCausaInvCenso1x1() {
        return listaNumeroCausaInvCenso1x1;
    }

    public void setListaNumeroCausaInvCenso1x1(DropDown component) {
        this.listaNumeroCausaInvCenso1x1 = component;
    }

    private StaticText listaNumeroCausaInvCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaInvCenso1Texto1() {
        return listaNumeroCausaInvCenso1Texto1;
    }

    public void setListaNumeroCausaInvCenso1Texto1(StaticText component) {
        this.listaNumeroCausaInvCenso1Texto1 = component;
    }

    private StaticText listaNumeroCausaInvCenso1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaInvCenso1x1Texto1() {
        return listaNumeroCausaInvCenso1x1Texto1;
    }

    public void setListaNumeroCausaInvCenso1x1Texto1(StaticText component) {
        this.listaNumeroCausaInvCenso1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroCausaInvCenso1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCausaInvCenso1() {
        return converterNumeroCausaInvCenso1;
    }
  
    public void setConverterNumeroCausaInvCenso1(IntegerConverter converter) {
        this.converterNumeroCausaInvCenso1 = converter;
    }
  
    private TableColumn tableColumnOtraCausaInvCenso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnOtraCausaInvCenso1() {
        return tableColumnOtraCausaInvCenso1;
    }

    public void setTableColumnOtraCausaInvCenso1(TableColumn component) {
        this.tableColumnOtraCausaInvCenso1 = component;
    }

    private Label labelOtraCausaInvCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaInvCenso1() {
        return labelOtraCausaInvCenso1;
    }

    public void setLabelOtraCausaInvCenso1(Label l) {
        this.labelOtraCausaInvCenso1 = l;
    }

    private TextField campoOtraCausaInvCenso1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOtraCausaInvCenso1() {
        return campoOtraCausaInvCenso1;
    }

    public void setCampoOtraCausaInvCenso1(TextField component) {
        this.campoOtraCausaInvCenso1 = component;
    }

    private TextField campoOtraCausaInvCenso1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtraCausaInvCenso1x1() {
        return campoOtraCausaInvCenso1x1;
    }

    public void setCampoOtraCausaInvCenso1x1(TextField component) {
        this.campoOtraCausaInvCenso1x1 = component;
    }

    private StaticText campoOtraCausaInvCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaInvCenso1Texto1() {
        return campoOtraCausaInvCenso1Texto1;
    }

    public void setCampoOtraCausaInvCenso1Texto1(StaticText component) {
        this.campoOtraCausaInvCenso1Texto1 = component;
    }

    private StaticText campoOtraCausaInvCenso1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaInvCenso1x1Texto1() {
        return campoOtraCausaInvCenso1x1Texto1;
    }

    public void setCampoOtraCausaInvCenso1x1Texto1(StaticText component) {
        this.campoOtraCausaInvCenso1x1Texto1 = component;
    }

    private LengthValidator validatorOtraCausaInvCenso1 = new LengthValidator();
  
    public LengthValidator getValidatorOtraCausaInvCenso1() {
        return validatorOtraCausaInvCenso1;
    }
  
    public void setValidatorOtraCausaInvCenso1(LengthValidator validator) {
        this.validatorOtraCausaInvCenso1 = validator;
    }
  
    private TableColumn tableColumnComentariosValidacionCenso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosValidacionCenso1() {
        return tableColumnComentariosValidacionCenso1;
    }

    public void setTableColumnComentariosValidacionCenso1(TableColumn component) {
        this.tableColumnComentariosValidacionCenso1 = component;
    }

    private Label labelComentariosValidacionCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosValidacionCenso1() {
        return labelComentariosValidacionCenso1;
    }

    public void setLabelComentariosValidacionCenso1(Label l) {
        this.labelComentariosValidacionCenso1 = l;
    }

    private TextArea campoComentariosValidacionCenso1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosValidacionCenso1() {
        return campoComentariosValidacionCenso1;
    }

    public void setCampoComentariosValidacionCenso1(TextArea component) {
        this.campoComentariosValidacionCenso1 = component;
    }

    private TextArea campoComentariosValidacionCenso1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosValidacionCenso1x1() {
        return campoComentariosValidacionCenso1x1;
    }

    public void setCampoComentariosValidacionCenso1x1(TextArea component) {
        this.campoComentariosValidacionCenso1x1 = component;
    }

    private StaticText campoComentariosValidacionCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosValidacionCenso1Texto1() {
        return campoComentariosValidacionCenso1Texto1;
    }

    public void setCampoComentariosValidacionCenso1Texto1(StaticText component) {
        this.campoComentariosValidacionCenso1Texto1 = component;
    }

    private StaticText campoComentariosValidacionCenso1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosValidacionCenso1x1Texto1() {
        return campoComentariosValidacionCenso1x1Texto1;
    }

    public void setCampoComentariosValidacionCenso1x1Texto1(StaticText component) {
        this.campoComentariosValidacionCenso1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosValidacionCenso1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosValidacionCenso1() {
        return validatorComentariosValidacionCenso1;
    }
  
    public void setValidatorComentariosValidacionCenso1(LengthValidator validator) {
        this.validatorComentariosValidacionCenso1 = validator;
    }
  
    private TableColumn tableColumnIdFichaPersona1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFichaPersona1() {
        return tableColumnIdFichaPersona1;
    }

    public void setTableColumnIdFichaPersona1(TableColumn component) {
        this.tableColumnIdFichaPersona1 = component;
    }

    private Label labelIdFichaPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaPersona1() {
        return labelIdFichaPersona1;
    }

    public void setLabelIdFichaPersona1(Label l) {
        this.labelIdFichaPersona1 = l;
    }

    private TextField campoIdFichaPersona1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFichaPersona1() {
        return campoIdFichaPersona1;
    }

    public void setCampoIdFichaPersona1(TextField component) {
        this.campoIdFichaPersona1 = component;
    }

    private TextField campoIdFichaPersona1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdFichaPersona1x1() {
        return campoIdFichaPersona1x1;
    }

    public void setCampoIdFichaPersona1x1(TextField component) {
        this.campoIdFichaPersona1x1 = component;
    }

    private StaticText campoIdFichaPersona1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFichaPersona1Texto1() {
        return campoIdFichaPersona1Texto1;
    }

    public void setCampoIdFichaPersona1Texto1(StaticText component) {
        this.campoIdFichaPersona1Texto1 = component;
    }

    private StaticText campoIdFichaPersona1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFichaPersona1x1Texto1() {
        return campoIdFichaPersona1x1Texto1;
    }

    public void setCampoIdFichaPersona1x1Texto1(StaticText component) {
        this.campoIdFichaPersona1x1Texto1 = component;
    }

    private Button campoIdFichaPersona1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFichaPersona1Boton1() {
        return campoIdFichaPersona1Boton1;
    }

    public void setCampoIdFichaPersona1Boton1(Button component) {
        this.campoIdFichaPersona1Boton1 = component;
    }

    private Button campoIdFichaPersona1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFichaPersona1x1Boton1() {
        return campoIdFichaPersona1x1Boton1;
    }

    public void setCampoIdFichaPersona1x1Boton1(Button component) {
        this.campoIdFichaPersona1x1Boton1 = component;
    }

    private Button campoIdFichaPersona1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFichaPersona1Boton3() {
        return campoIdFichaPersona1Boton3;
    }

    public void setCampoIdFichaPersona1Boton3(Button component) {
        this.campoIdFichaPersona1Boton3 = component;
    }

    private Button campoIdFichaPersona1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFichaPersona1x1Boton3() {
        return campoIdFichaPersona1x1Boton3;
    }

    public void setCampoIdFichaPersona1x1Boton3(Button component) {
        this.campoIdFichaPersona1x1Boton3 = component;
    }

    private TableColumn tableColumnIdFichaPersona2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFichaPersona2() {
        return tableColumnIdFichaPersona2;
    }

    public void setTableColumnIdFichaPersona2(TableColumn component) {
        this.tableColumnIdFichaPersona2 = component;
    }

    private Label labelIdFichaPersona2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaPersona2() {
        return labelIdFichaPersona2;
    }

    public void setLabelIdFichaPersona2(Label l) {
        this.labelIdFichaPersona2 = l;
    }

    private ImageHyperlink campoIdFichaPersona1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdFichaPersona1Hiper1() {
        return campoIdFichaPersona1Hiper1;
    }

    public void setCampoIdFichaPersona1Hiper1(ImageHyperlink component) {
        this.campoIdFichaPersona1Hiper1 = component;
    }

    private TableColumn tableColumnNumeroCondicionReclCen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroCondicionReclCen1() {
        return tableColumnNumeroCondicionReclCen1;
    }

    public void setTableColumnNumeroCondicionReclCen1(TableColumn component) {
        this.tableColumnNumeroCondicionReclCen1 = component;
    }

    private Label labelNumeroCondicionReclCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionReclCen1() {
        return labelNumeroCondicionReclCen1;
    }

    public void setLabelNumeroCondicionReclCen1(Label l) {
        this.labelNumeroCondicionReclCen1 = l;
    }

    private DropDown listaNumeroCondicionReclCen1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroCondicionReclCen1() {
        return listaNumeroCondicionReclCen1;
    }

    public void setListaNumeroCondicionReclCen1(DropDown component) {
        this.listaNumeroCondicionReclCen1 = component;
    }

    private DropDown listaNumeroCondicionReclCen1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCondicionReclCen1x1() {
        return listaNumeroCondicionReclCen1x1;
    }

    public void setListaNumeroCondicionReclCen1x1(DropDown component) {
        this.listaNumeroCondicionReclCen1x1 = component;
    }

    private StaticText listaNumeroCondicionReclCen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCondicionReclCen1Texto1() {
        return listaNumeroCondicionReclCen1Texto1;
    }

    public void setListaNumeroCondicionReclCen1Texto1(StaticText component) {
        this.listaNumeroCondicionReclCen1Texto1 = component;
    }

    private StaticText listaNumeroCondicionReclCen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCondicionReclCen1x1Texto1() {
        return listaNumeroCondicionReclCen1x1Texto1;
    }

    public void setListaNumeroCondicionReclCen1x1Texto1(StaticText component) {
        this.listaNumeroCondicionReclCen1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroCondicionReclCen1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCondicionReclCen1() {
        return converterNumeroCondicionReclCen1;
    }
  
    public void setConverterNumeroCondicionReclCen1(IntegerConverter converter) {
        this.converterNumeroCondicionReclCen1 = converter;
    }
  
    private TableColumn tableColumnFechaReclamoCenso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaReclamoCenso1() {
        return tableColumnFechaReclamoCenso1;
    }

    public void setTableColumnFechaReclamoCenso1(TableColumn component) {
        this.tableColumnFechaReclamoCenso1 = component;
    }

    private Label labelFechaReclamoCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaReclamoCenso1() {
        return labelFechaReclamoCenso1;
    }

    public void setLabelFechaReclamoCenso1(Label l) {
        this.labelFechaReclamoCenso1 = l;
    }

    private TextField campoFechaReclamoCenso1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaReclamoCenso1() {
        return campoFechaReclamoCenso1;
    }

    public void setCampoFechaReclamoCenso1(TextField component) {
        this.campoFechaReclamoCenso1 = component;
    }

    private TextField campoFechaReclamoCenso1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaReclamoCenso1x1() {
        return campoFechaReclamoCenso1x1;
    }

    public void setCampoFechaReclamoCenso1x1(TextField component) {
        this.campoFechaReclamoCenso1x1 = component;
    }

    private StaticText campoFechaReclamoCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaReclamoCenso1Texto1() {
        return campoFechaReclamoCenso1Texto1;
    }

    public void setCampoFechaReclamoCenso1Texto1(StaticText component) {
        this.campoFechaReclamoCenso1Texto1 = component;
    }

    private StaticText campoFechaReclamoCenso1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaReclamoCenso1x1Texto1() {
        return campoFechaReclamoCenso1x1Texto1;
    }

    public void setCampoFechaReclamoCenso1x1Texto1(StaticText component) {
        this.campoFechaReclamoCenso1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaReclamoCenso1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaReclamoCenso1() {
        return converterFechaReclamoCenso1;
    }
  
    public void setConverterFechaReclamoCenso1(SqlTimestampConverter converter) {
        this.converterFechaReclamoCenso1 = converter;
    }
  
    private TableColumn tableColumnComentariosReclamoCenso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosReclamoCenso1() {
        return tableColumnComentariosReclamoCenso1;
    }

    public void setTableColumnComentariosReclamoCenso1(TableColumn component) {
        this.tableColumnComentariosReclamoCenso1 = component;
    }

    private Label labelComentariosReclamoCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosReclamoCenso1() {
        return labelComentariosReclamoCenso1;
    }

    public void setLabelComentariosReclamoCenso1(Label l) {
        this.labelComentariosReclamoCenso1 = l;
    }

    private TextArea campoComentariosReclamoCenso1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosReclamoCenso1() {
        return campoComentariosReclamoCenso1;
    }

    public void setCampoComentariosReclamoCenso1(TextArea component) {
        this.campoComentariosReclamoCenso1 = component;
    }

    private TextArea campoComentariosReclamoCenso1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosReclamoCenso1x1() {
        return campoComentariosReclamoCenso1x1;
    }

    public void setCampoComentariosReclamoCenso1x1(TextArea component) {
        this.campoComentariosReclamoCenso1x1 = component;
    }

    private StaticText campoComentariosReclamoCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosReclamoCenso1Texto1() {
        return campoComentariosReclamoCenso1Texto1;
    }

    public void setCampoComentariosReclamoCenso1Texto1(StaticText component) {
        this.campoComentariosReclamoCenso1Texto1 = component;
    }

    private StaticText campoComentariosReclamoCenso1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosReclamoCenso1x1Texto1() {
        return campoComentariosReclamoCenso1x1Texto1;
    }

    public void setCampoComentariosReclamoCenso1x1Texto1(StaticText component) {
        this.campoComentariosReclamoCenso1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosReclamoCenso1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosReclamoCenso1() {
        return validatorComentariosReclamoCenso1;
    }
  
    public void setValidatorComentariosReclamoCenso1(LengthValidator validator) {
        this.validatorComentariosReclamoCenso1 = validator;
    }
  
    private TableColumn tableColumnFechaAprobacionReclamoCenso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaAprobacionReclamoCenso1() {
        return tableColumnFechaAprobacionReclamoCenso1;
    }

    public void setTableColumnFechaAprobacionReclamoCenso1(TableColumn component) {
        this.tableColumnFechaAprobacionReclamoCenso1 = component;
    }

    private Label labelFechaAprobacionReclamoCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaAprobacionReclamoCenso1() {
        return labelFechaAprobacionReclamoCenso1;
    }

    public void setLabelFechaAprobacionReclamoCenso1(Label l) {
        this.labelFechaAprobacionReclamoCenso1 = l;
    }

    private TextField campoFechaAprobacionReclamoCenso1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaAprobacionReclamoCenso1() {
        return campoFechaAprobacionReclamoCenso1;
    }

    public void setCampoFechaAprobacionReclamoCenso1(TextField component) {
        this.campoFechaAprobacionReclamoCenso1 = component;
    }

    private TextField campoFechaAprobacionReclamoCenso1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaAprobacionReclamoCenso1x1() {
        return campoFechaAprobacionReclamoCenso1x1;
    }

    public void setCampoFechaAprobacionReclamoCenso1x1(TextField component) {
        this.campoFechaAprobacionReclamoCenso1x1 = component;
    }

    private StaticText campoFechaAprobacionReclamoCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaAprobacionReclamoCenso1Texto1() {
        return campoFechaAprobacionReclamoCenso1Texto1;
    }

    public void setCampoFechaAprobacionReclamoCenso1Texto1(StaticText component) {
        this.campoFechaAprobacionReclamoCenso1Texto1 = component;
    }

    private StaticText campoFechaAprobacionReclamoCenso1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaAprobacionReclamoCenso1x1Texto1() {
        return campoFechaAprobacionReclamoCenso1x1Texto1;
    }

    public void setCampoFechaAprobacionReclamoCenso1x1Texto1(StaticText component) {
        this.campoFechaAprobacionReclamoCenso1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaAprobacionReclamoCenso1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaAprobacionReclamoCenso1() {
        return converterFechaAprobacionReclamoCenso1;
    }
  
    public void setConverterFechaAprobacionReclamoCenso1(SqlTimestampConverter converter) {
        this.converterFechaAprobacionReclamoCenso1 = converter;
    }
  
    private TableColumn tableColumnComentariosAprReclCen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosAprReclCen1() {
        return tableColumnComentariosAprReclCen1;
    }

    public void setTableColumnComentariosAprReclCen1(TableColumn component) {
        this.tableColumnComentariosAprReclCen1 = component;
    }

    private Label labelComentariosAprReclCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAprReclCen1() {
        return labelComentariosAprReclCen1;
    }

    public void setLabelComentariosAprReclCen1(Label l) {
        this.labelComentariosAprReclCen1 = l;
    }

    private TextArea campoComentariosAprReclCen1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosAprReclCen1() {
        return campoComentariosAprReclCen1;
    }

    public void setCampoComentariosAprReclCen1(TextArea component) {
        this.campoComentariosAprReclCen1 = component;
    }

    private TextArea campoComentariosAprReclCen1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosAprReclCen1x1() {
        return campoComentariosAprReclCen1x1;
    }

    public void setCampoComentariosAprReclCen1x1(TextArea component) {
        this.campoComentariosAprReclCen1x1 = component;
    }

    private StaticText campoComentariosAprReclCen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosAprReclCen1Texto1() {
        return campoComentariosAprReclCen1Texto1;
    }

    public void setCampoComentariosAprReclCen1Texto1(StaticText component) {
        this.campoComentariosAprReclCen1Texto1 = component;
    }

    private StaticText campoComentariosAprReclCen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosAprReclCen1x1Texto1() {
        return campoComentariosAprReclCen1x1Texto1;
    }

    public void setCampoComentariosAprReclCen1x1Texto1(StaticText component) {
        this.campoComentariosAprReclCen1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosAprReclCen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosAprReclCen1() {
        return validatorComentariosAprReclCen1;
    }
  
    public void setValidatorComentariosAprReclCen1(LengthValidator validator) {
        this.validatorComentariosAprReclCen1 = validator;
    }
  
    private TableColumn tableColumnFechaDenegacionReclamoCenso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaDenegacionReclamoCenso1() {
        return tableColumnFechaDenegacionReclamoCenso1;
    }

    public void setTableColumnFechaDenegacionReclamoCenso1(TableColumn component) {
        this.tableColumnFechaDenegacionReclamoCenso1 = component;
    }

    private Label labelFechaDenegacionReclamoCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaDenegacionReclamoCenso1() {
        return labelFechaDenegacionReclamoCenso1;
    }

    public void setLabelFechaDenegacionReclamoCenso1(Label l) {
        this.labelFechaDenegacionReclamoCenso1 = l;
    }

    private TextField campoFechaDenegacionReclamoCenso1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaDenegacionReclamoCenso1() {
        return campoFechaDenegacionReclamoCenso1;
    }

    public void setCampoFechaDenegacionReclamoCenso1(TextField component) {
        this.campoFechaDenegacionReclamoCenso1 = component;
    }

    private TextField campoFechaDenegacionReclamoCenso1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaDenegacionReclamoCenso1x1() {
        return campoFechaDenegacionReclamoCenso1x1;
    }

    public void setCampoFechaDenegacionReclamoCenso1x1(TextField component) {
        this.campoFechaDenegacionReclamoCenso1x1 = component;
    }

    private StaticText campoFechaDenegacionReclamoCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaDenegacionReclamoCenso1Texto1() {
        return campoFechaDenegacionReclamoCenso1Texto1;
    }

    public void setCampoFechaDenegacionReclamoCenso1Texto1(StaticText component) {
        this.campoFechaDenegacionReclamoCenso1Texto1 = component;
    }

    private StaticText campoFechaDenegacionReclamoCenso1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaDenegacionReclamoCenso1x1Texto1() {
        return campoFechaDenegacionReclamoCenso1x1Texto1;
    }

    public void setCampoFechaDenegacionReclamoCenso1x1Texto1(StaticText component) {
        this.campoFechaDenegacionReclamoCenso1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaDenegacionReclamoCenso1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaDenegacionReclamoCenso1() {
        return converterFechaDenegacionReclamoCenso1;
    }
  
    public void setConverterFechaDenegacionReclamoCenso1(SqlTimestampConverter converter) {
        this.converterFechaDenegacionReclamoCenso1 = converter;
    }
  
    private TableColumn tableColumnNumeroCausaDenReclCen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroCausaDenReclCen1() {
        return tableColumnNumeroCausaDenReclCen1;
    }

    public void setTableColumnNumeroCausaDenReclCen1(TableColumn component) {
        this.tableColumnNumeroCausaDenReclCen1 = component;
    }

    private Label labelNumeroCausaDenReclCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaDenReclCen1() {
        return labelNumeroCausaDenReclCen1;
    }

    public void setLabelNumeroCausaDenReclCen1(Label l) {
        this.labelNumeroCausaDenReclCen1 = l;
    }

    private DropDown listaNumeroCausaDenReclCen1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroCausaDenReclCen1() {
        return listaNumeroCausaDenReclCen1;
    }

    public void setListaNumeroCausaDenReclCen1(DropDown component) {
        this.listaNumeroCausaDenReclCen1 = component;
    }

    private DropDown listaNumeroCausaDenReclCen1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCausaDenReclCen1x1() {
        return listaNumeroCausaDenReclCen1x1;
    }

    public void setListaNumeroCausaDenReclCen1x1(DropDown component) {
        this.listaNumeroCausaDenReclCen1x1 = component;
    }

    private StaticText listaNumeroCausaDenReclCen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaDenReclCen1Texto1() {
        return listaNumeroCausaDenReclCen1Texto1;
    }

    public void setListaNumeroCausaDenReclCen1Texto1(StaticText component) {
        this.listaNumeroCausaDenReclCen1Texto1 = component;
    }

    private StaticText listaNumeroCausaDenReclCen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaDenReclCen1x1Texto1() {
        return listaNumeroCausaDenReclCen1x1Texto1;
    }

    public void setListaNumeroCausaDenReclCen1x1Texto1(StaticText component) {
        this.listaNumeroCausaDenReclCen1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroCausaDenReclCen1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCausaDenReclCen1() {
        return converterNumeroCausaDenReclCen1;
    }
  
    public void setConverterNumeroCausaDenReclCen1(IntegerConverter converter) {
        this.converterNumeroCausaDenReclCen1 = converter;
    }
  
    private TableColumn tableColumnOtraCausaDenReclCen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnOtraCausaDenReclCen1() {
        return tableColumnOtraCausaDenReclCen1;
    }

    public void setTableColumnOtraCausaDenReclCen1(TableColumn component) {
        this.tableColumnOtraCausaDenReclCen1 = component;
    }

    private Label labelOtraCausaDenReclCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaDenReclCen1() {
        return labelOtraCausaDenReclCen1;
    }

    public void setLabelOtraCausaDenReclCen1(Label l) {
        this.labelOtraCausaDenReclCen1 = l;
    }

    private TextField campoOtraCausaDenReclCen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOtraCausaDenReclCen1() {
        return campoOtraCausaDenReclCen1;
    }

    public void setCampoOtraCausaDenReclCen1(TextField component) {
        this.campoOtraCausaDenReclCen1 = component;
    }

    private TextField campoOtraCausaDenReclCen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtraCausaDenReclCen1x1() {
        return campoOtraCausaDenReclCen1x1;
    }

    public void setCampoOtraCausaDenReclCen1x1(TextField component) {
        this.campoOtraCausaDenReclCen1x1 = component;
    }

    private StaticText campoOtraCausaDenReclCen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaDenReclCen1Texto1() {
        return campoOtraCausaDenReclCen1Texto1;
    }

    public void setCampoOtraCausaDenReclCen1Texto1(StaticText component) {
        this.campoOtraCausaDenReclCen1Texto1 = component;
    }

    private StaticText campoOtraCausaDenReclCen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaDenReclCen1x1Texto1() {
        return campoOtraCausaDenReclCen1x1Texto1;
    }

    public void setCampoOtraCausaDenReclCen1x1Texto1(StaticText component) {
        this.campoOtraCausaDenReclCen1x1Texto1 = component;
    }

    private LengthValidator validatorOtraCausaDenReclCen1 = new LengthValidator();
  
    public LengthValidator getValidatorOtraCausaDenReclCen1() {
        return validatorOtraCausaDenReclCen1;
    }
  
    public void setValidatorOtraCausaDenReclCen1(LengthValidator validator) {
        this.validatorOtraCausaDenReclCen1 = validator;
    }
  
    private TableColumn tableColumnComentariosDenReclCen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosDenReclCen1() {
        return tableColumnComentariosDenReclCen1;
    }

    public void setTableColumnComentariosDenReclCen1(TableColumn component) {
        this.tableColumnComentariosDenReclCen1 = component;
    }

    private Label labelComentariosDenReclCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosDenReclCen1() {
        return labelComentariosDenReclCen1;
    }

    public void setLabelComentariosDenReclCen1(Label l) {
        this.labelComentariosDenReclCen1 = l;
    }

    private TextArea campoComentariosDenReclCen1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosDenReclCen1() {
        return campoComentariosDenReclCen1;
    }

    public void setCampoComentariosDenReclCen1(TextArea component) {
        this.campoComentariosDenReclCen1 = component;
    }

    private TextArea campoComentariosDenReclCen1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosDenReclCen1x1() {
        return campoComentariosDenReclCen1x1;
    }

    public void setCampoComentariosDenReclCen1x1(TextArea component) {
        this.campoComentariosDenReclCen1x1 = component;
    }

    private StaticText campoComentariosDenReclCen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosDenReclCen1Texto1() {
        return campoComentariosDenReclCen1Texto1;
    }

    public void setCampoComentariosDenReclCen1Texto1(StaticText component) {
        this.campoComentariosDenReclCen1Texto1 = component;
    }

    private StaticText campoComentariosDenReclCen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosDenReclCen1x1Texto1() {
        return campoComentariosDenReclCen1x1Texto1;
    }

    public void setCampoComentariosDenReclCen1x1Texto1(StaticText component) {
        this.campoComentariosDenReclCen1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosDenReclCen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosDenReclCen1() {
        return validatorComentariosDenReclCen1;
    }
  
    public void setValidatorComentariosDenReclCen1(LengthValidator validator) {
        this.validatorComentariosDenReclCen1 = validator;
    }
  
    private TableColumn tableColumnFechaRegistroPotBen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaRegistroPotBen1() {
        return tableColumnFechaRegistroPotBen1;
    }

    public void setTableColumnFechaRegistroPotBen1(TableColumn component) {
        this.tableColumnFechaRegistroPotBen1 = component;
    }

    private Label labelFechaRegistroPotBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaRegistroPotBen1() {
        return labelFechaRegistroPotBen1;
    }

    public void setLabelFechaRegistroPotBen1(Label l) {
        this.labelFechaRegistroPotBen1 = l;
    }

    private TextField campoFechaRegistroPotBen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaRegistroPotBen1() {
        return campoFechaRegistroPotBen1;
    }

    public void setCampoFechaRegistroPotBen1(TextField component) {
        this.campoFechaRegistroPotBen1 = component;
    }

    private TextField campoFechaRegistroPotBen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaRegistroPotBen1x1() {
        return campoFechaRegistroPotBen1x1;
    }

    public void setCampoFechaRegistroPotBen1x1(TextField component) {
        this.campoFechaRegistroPotBen1x1 = component;
    }

    private StaticText campoFechaRegistroPotBen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaRegistroPotBen1Texto1() {
        return campoFechaRegistroPotBen1Texto1;
    }

    public void setCampoFechaRegistroPotBen1Texto1(StaticText component) {
        this.campoFechaRegistroPotBen1Texto1 = component;
    }

    private StaticText campoFechaRegistroPotBen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaRegistroPotBen1x1Texto1() {
        return campoFechaRegistroPotBen1x1Texto1;
    }

    public void setCampoFechaRegistroPotBen1x1Texto1(StaticText component) {
        this.campoFechaRegistroPotBen1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaRegistroPotBen1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaRegistroPotBen1() {
        return converterFechaRegistroPotBen1;
    }
  
    public void setConverterFechaRegistroPotBen1(SqlTimestampConverter converter) {
        this.converterFechaRegistroPotBen1 = converter;
    }
  
    private TableColumn tableColumnIdUsuarioRegPotBen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdUsuarioRegPotBen1() {
        return tableColumnIdUsuarioRegPotBen1;
    }

    public void setTableColumnIdUsuarioRegPotBen1(TableColumn component) {
        this.tableColumnIdUsuarioRegPotBen1 = component;
    }

    private Label labelIdUsuarioRegPotBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuarioRegPotBen1() {
        return labelIdUsuarioRegPotBen1;
    }

    public void setLabelIdUsuarioRegPotBen1(Label l) {
        this.labelIdUsuarioRegPotBen1 = l;
    }

    private TextField campoIdUsuarioRegPotBen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdUsuarioRegPotBen1() {
        return campoIdUsuarioRegPotBen1;
    }

    public void setCampoIdUsuarioRegPotBen1(TextField component) {
        this.campoIdUsuarioRegPotBen1 = component;
    }

    private TextField campoIdUsuarioRegPotBen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdUsuarioRegPotBen1x1() {
        return campoIdUsuarioRegPotBen1x1;
    }

    public void setCampoIdUsuarioRegPotBen1x1(TextField component) {
        this.campoIdUsuarioRegPotBen1x1 = component;
    }

    private StaticText campoIdUsuarioRegPotBen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdUsuarioRegPotBen1Texto1() {
        return campoIdUsuarioRegPotBen1Texto1;
    }

    public void setCampoIdUsuarioRegPotBen1Texto1(StaticText component) {
        this.campoIdUsuarioRegPotBen1Texto1 = component;
    }

    private StaticText campoIdUsuarioRegPotBen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdUsuarioRegPotBen1x1Texto1() {
        return campoIdUsuarioRegPotBen1x1Texto1;
    }

    public void setCampoIdUsuarioRegPotBen1x1Texto1(StaticText component) {
        this.campoIdUsuarioRegPotBen1x1Texto1 = component;
    }

    private Button campoIdUsuarioRegPotBen1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdUsuarioRegPotBen1Boton1() {
        return campoIdUsuarioRegPotBen1Boton1;
    }

    public void setCampoIdUsuarioRegPotBen1Boton1(Button component) {
        this.campoIdUsuarioRegPotBen1Boton1 = component;
    }

    private Button campoIdUsuarioRegPotBen1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdUsuarioRegPotBen1x1Boton1() {
        return campoIdUsuarioRegPotBen1x1Boton1;
    }

    public void setCampoIdUsuarioRegPotBen1x1Boton1(Button component) {
        this.campoIdUsuarioRegPotBen1x1Boton1 = component;
    }

    private Button campoIdUsuarioRegPotBen1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUsuarioRegPotBen1Boton3() {
        return campoIdUsuarioRegPotBen1Boton3;
    }

    public void setCampoIdUsuarioRegPotBen1Boton3(Button component) {
        this.campoIdUsuarioRegPotBen1Boton3 = component;
    }

    private Button campoIdUsuarioRegPotBen1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUsuarioRegPotBen1x1Boton3() {
        return campoIdUsuarioRegPotBen1x1Boton3;
    }

    public void setCampoIdUsuarioRegPotBen1x1Boton3(Button component) {
        this.campoIdUsuarioRegPotBen1x1Boton3 = component;
    }

    private TableColumn tableColumnIdUsuarioRegPotBen2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdUsuarioRegPotBen2() {
        return tableColumnIdUsuarioRegPotBen2;
    }

    public void setTableColumnIdUsuarioRegPotBen2(TableColumn component) {
        this.tableColumnIdUsuarioRegPotBen2 = component;
    }

    private Label labelIdUsuarioRegPotBen2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuarioRegPotBen2() {
        return labelIdUsuarioRegPotBen2;
    }

    public void setLabelIdUsuarioRegPotBen2(Label l) {
        this.labelIdUsuarioRegPotBen2 = l;
    }

    private ImageHyperlink campoIdUsuarioRegPotBen1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdUsuarioRegPotBen1Hiper1() {
        return campoIdUsuarioRegPotBen1Hiper1;
    }

    public void setCampoIdUsuarioRegPotBen1Hiper1(ImageHyperlink component) {
        this.campoIdUsuarioRegPotBen1Hiper1 = component;
    }

    private TableColumn tableColumnEsPotencialBenInactivo1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsPotencialBenInactivo1() {
        return tableColumnEsPotencialBenInactivo1;
    }

    public void setTableColumnEsPotencialBenInactivo1(TableColumn component) {
        this.tableColumnEsPotencialBenInactivo1 = component;
    }

    private Label labelEsPotencialBenInactivo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPotencialBenInactivo1() {
        return labelEsPotencialBenInactivo1;
    }

    public void setLabelEsPotencialBenInactivo1(Label l) {
        this.labelEsPotencialBenInactivo1 = l;
    }

    private DropDown listaEsPotencialBenInactivo1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPotencialBenInactivo1() {
        return listaEsPotencialBenInactivo1;
    }

    public void setListaEsPotencialBenInactivo1(DropDown component) {
        this.listaEsPotencialBenInactivo1 = component;
    }

    private DropDown listaEsPotencialBenInactivo1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPotencialBenInactivo1x1() {
        return listaEsPotencialBenInactivo1x1;
    }

    public void setListaEsPotencialBenInactivo1x1(DropDown component) {
        this.listaEsPotencialBenInactivo1x1 = component;
    }

    private StaticText listaEsPotencialBenInactivo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPotencialBenInactivo1Texto1() {
        return listaEsPotencialBenInactivo1Texto1;
    }

    public void setListaEsPotencialBenInactivo1Texto1(StaticText component) {
        this.listaEsPotencialBenInactivo1Texto1 = component;
    }

    private StaticText listaEsPotencialBenInactivo1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPotencialBenInactivo1x1Texto1() {
        return listaEsPotencialBenInactivo1x1Texto1;
    }

    public void setListaEsPotencialBenInactivo1x1Texto1(StaticText component) {
        this.listaEsPotencialBenInactivo1x1Texto1 = component;
    }

    private IntegerConverter converterEsPotencialBenInactivo1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPotencialBenInactivo1() {
        return converterEsPotencialBenInactivo1;
    }
  
    public void setConverterEsPotencialBenInactivo1(IntegerConverter converter) {
        this.converterEsPotencialBenInactivo1 = converter;
    }
  
    private TableColumn tableColumnFechaUltimaVisitaCenso1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaUltimaVisitaCenso1() {
        return tableColumnFechaUltimaVisitaCenso1;
    }

    public void setTableColumnFechaUltimaVisitaCenso1(TableColumn component) {
        this.tableColumnFechaUltimaVisitaCenso1 = component;
    }

    private Label labelFechaUltimaVisitaCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaUltimaVisitaCenso1() {
        return labelFechaUltimaVisitaCenso1;
    }

    public void setLabelFechaUltimaVisitaCenso1(Label l) {
        this.labelFechaUltimaVisitaCenso1 = l;
    }

    private TextField campoFechaUltimaVisitaCenso1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaUltimaVisitaCenso1() {
        return campoFechaUltimaVisitaCenso1;
    }

    public void setCampoFechaUltimaVisitaCenso1(TextField component) {
        this.campoFechaUltimaVisitaCenso1 = component;
    }

    private TextField campoFechaUltimaVisitaCenso1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaUltimaVisitaCenso1x1() {
        return campoFechaUltimaVisitaCenso1x1;
    }

    public void setCampoFechaUltimaVisitaCenso1x1(TextField component) {
        this.campoFechaUltimaVisitaCenso1x1 = component;
    }

    private StaticText campoFechaUltimaVisitaCenso1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaUltimaVisitaCenso1Texto1() {
        return campoFechaUltimaVisitaCenso1Texto1;
    }

    public void setCampoFechaUltimaVisitaCenso1Texto1(StaticText component) {
        this.campoFechaUltimaVisitaCenso1Texto1 = component;
    }

    private StaticText campoFechaUltimaVisitaCenso1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaUltimaVisitaCenso1x1Texto1() {
        return campoFechaUltimaVisitaCenso1x1Texto1;
    }

    public void setCampoFechaUltimaVisitaCenso1x1Texto1(StaticText component) {
        this.campoFechaUltimaVisitaCenso1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaUltimaVisitaCenso1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaUltimaVisitaCenso1() {
        return converterFechaUltimaVisitaCenso1;
    }
  
    public void setConverterFechaUltimaVisitaCenso1(SqlTimestampConverter converter) {
        this.converterFechaUltimaVisitaCenso1 = converter;
    }
  
    private TableColumn tableColumnObservacionesUltVisitaCen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnObservacionesUltVisitaCen1() {
        return tableColumnObservacionesUltVisitaCen1;
    }

    public void setTableColumnObservacionesUltVisitaCen1(TableColumn component) {
        this.tableColumnObservacionesUltVisitaCen1 = component;
    }

    private Label labelObservacionesUltVisitaCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelObservacionesUltVisitaCen1() {
        return labelObservacionesUltVisitaCen1;
    }

    public void setLabelObservacionesUltVisitaCen1(Label l) {
        this.labelObservacionesUltVisitaCen1 = l;
    }

    private TextArea campoObservacionesUltVisitaCen1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoObservacionesUltVisitaCen1() {
        return campoObservacionesUltVisitaCen1;
    }

    public void setCampoObservacionesUltVisitaCen1(TextArea component) {
        this.campoObservacionesUltVisitaCen1 = component;
    }

    private TextArea campoObservacionesUltVisitaCen1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoObservacionesUltVisitaCen1x1() {
        return campoObservacionesUltVisitaCen1x1;
    }

    public void setCampoObservacionesUltVisitaCen1x1(TextArea component) {
        this.campoObservacionesUltVisitaCen1x1 = component;
    }

    private StaticText campoObservacionesUltVisitaCen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoObservacionesUltVisitaCen1Texto1() {
        return campoObservacionesUltVisitaCen1Texto1;
    }

    public void setCampoObservacionesUltVisitaCen1Texto1(StaticText component) {
        this.campoObservacionesUltVisitaCen1Texto1 = component;
    }

    private StaticText campoObservacionesUltVisitaCen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoObservacionesUltVisitaCen1x1Texto1() {
        return campoObservacionesUltVisitaCen1x1Texto1;
    }

    public void setCampoObservacionesUltVisitaCen1x1Texto1(StaticText component) {
        this.campoObservacionesUltVisitaCen1x1Texto1 = component;
    }

    private LengthValidator validatorObservacionesUltVisitaCen1 = new LengthValidator();
  
    public LengthValidator getValidatorObservacionesUltVisitaCen1() {
        return validatorObservacionesUltVisitaCen1;
    }
  
    public void setValidatorObservacionesUltVisitaCen1(LengthValidator validator) {
        this.validatorObservacionesUltVisitaCen1 = validator;
    }
  
    private TableColumn tableColumnIdFuncionarioUltVisitaCen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionarioUltVisitaCen1() {
        return tableColumnIdFuncionarioUltVisitaCen1;
    }

    public void setTableColumnIdFuncionarioUltVisitaCen1(TableColumn component) {
        this.tableColumnIdFuncionarioUltVisitaCen1 = component;
    }

    private Label labelIdFuncionarioUltVisitaCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioUltVisitaCen1() {
        return labelIdFuncionarioUltVisitaCen1;
    }

    public void setLabelIdFuncionarioUltVisitaCen1(Label l) {
        this.labelIdFuncionarioUltVisitaCen1 = l;
    }

    private TextField campoIdFuncionarioUltVisitaCen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionarioUltVisitaCen1() {
        return campoIdFuncionarioUltVisitaCen1;
    }

    public void setCampoIdFuncionarioUltVisitaCen1(TextField component) {
        this.campoIdFuncionarioUltVisitaCen1 = component;
    }

    private TextField campoIdFuncionarioUltVisitaCen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdFuncionarioUltVisitaCen1x1() {
        return campoIdFuncionarioUltVisitaCen1x1;
    }

    public void setCampoIdFuncionarioUltVisitaCen1x1(TextField component) {
        this.campoIdFuncionarioUltVisitaCen1x1 = component;
    }

    private StaticText campoIdFuncionarioUltVisitaCen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioUltVisitaCen1Texto1() {
        return campoIdFuncionarioUltVisitaCen1Texto1;
    }

    public void setCampoIdFuncionarioUltVisitaCen1Texto1(StaticText component) {
        this.campoIdFuncionarioUltVisitaCen1Texto1 = component;
    }

    private StaticText campoIdFuncionarioUltVisitaCen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioUltVisitaCen1x1Texto1() {
        return campoIdFuncionarioUltVisitaCen1x1Texto1;
    }

    public void setCampoIdFuncionarioUltVisitaCen1x1Texto1(StaticText component) {
        this.campoIdFuncionarioUltVisitaCen1x1Texto1 = component;
    }

    private Button campoIdFuncionarioUltVisitaCen1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioUltVisitaCen1Boton1() {
        return campoIdFuncionarioUltVisitaCen1Boton1;
    }

    public void setCampoIdFuncionarioUltVisitaCen1Boton1(Button component) {
        this.campoIdFuncionarioUltVisitaCen1Boton1 = component;
    }

    private Button campoIdFuncionarioUltVisitaCen1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioUltVisitaCen1x1Boton1() {
        return campoIdFuncionarioUltVisitaCen1x1Boton1;
    }

    public void setCampoIdFuncionarioUltVisitaCen1x1Boton1(Button component) {
        this.campoIdFuncionarioUltVisitaCen1x1Boton1 = component;
    }

    private Button campoIdFuncionarioUltVisitaCen1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioUltVisitaCen1Boton3() {
        return campoIdFuncionarioUltVisitaCen1Boton3;
    }

    public void setCampoIdFuncionarioUltVisitaCen1Boton3(Button component) {
        this.campoIdFuncionarioUltVisitaCen1Boton3 = component;
    }

    private Button campoIdFuncionarioUltVisitaCen1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioUltVisitaCen1x1Boton3() {
        return campoIdFuncionarioUltVisitaCen1x1Boton3;
    }

    public void setCampoIdFuncionarioUltVisitaCen1x1Boton3(Button component) {
        this.campoIdFuncionarioUltVisitaCen1x1Boton3 = component;
    }

    private TableColumn tableColumnIdFuncionarioUltVisitaCen2 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnIdFuncionarioUltVisitaCen2() {
        return tableColumnIdFuncionarioUltVisitaCen2;
    }

    public void setTableColumnIdFuncionarioUltVisitaCen2(TableColumn component) {
        this.tableColumnIdFuncionarioUltVisitaCen2 = component;
    }

    private Label labelIdFuncionarioUltVisitaCen2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioUltVisitaCen2() {
        return labelIdFuncionarioUltVisitaCen2;
    }

    public void setLabelIdFuncionarioUltVisitaCen2(Label l) {
        this.labelIdFuncionarioUltVisitaCen2 = l;
    }

    private ImageHyperlink campoIdFuncionarioUltVisitaCen1Hiper1 = new com.egt.core.jsf.component.HipervinculoVerDetalle();

    public ImageHyperlink getCampoIdFuncionarioUltVisitaCen1Hiper1() {
        return campoIdFuncionarioUltVisitaCen1Hiper1;
    }

    public void setCampoIdFuncionarioUltVisitaCen1Hiper1(ImageHyperlink component) {
        this.campoIdFuncionarioUltVisitaCen1Hiper1 = component;
    }

    private TableColumn tableColumnReferenciaDireccion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnReferenciaDireccion1() {
        return tableColumnReferenciaDireccion1;
    }

    public void setTableColumnReferenciaDireccion1(TableColumn component) {
        this.tableColumnReferenciaDireccion1 = component;
    }

    private Label labelReferenciaDireccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelReferenciaDireccion1() {
        return labelReferenciaDireccion1;
    }

    public void setLabelReferenciaDireccion1(Label l) {
        this.labelReferenciaDireccion1 = l;
    }

    private TextArea campoReferenciaDireccion1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoReferenciaDireccion1() {
        return campoReferenciaDireccion1;
    }

    public void setCampoReferenciaDireccion1(TextArea component) {
        this.campoReferenciaDireccion1 = component;
    }

    private TextArea campoReferenciaDireccion1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoReferenciaDireccion1x1() {
        return campoReferenciaDireccion1x1;
    }

    public void setCampoReferenciaDireccion1x1(TextArea component) {
        this.campoReferenciaDireccion1x1 = component;
    }

    private StaticText campoReferenciaDireccion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoReferenciaDireccion1Texto1() {
        return campoReferenciaDireccion1Texto1;
    }

    public void setCampoReferenciaDireccion1Texto1(StaticText component) {
        this.campoReferenciaDireccion1Texto1 = component;
    }

    private StaticText campoReferenciaDireccion1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoReferenciaDireccion1x1Texto1() {
        return campoReferenciaDireccion1x1Texto1;
    }

    public void setCampoReferenciaDireccion1x1Texto1(StaticText component) {
        this.campoReferenciaDireccion1x1Texto1 = component;
    }

    private LengthValidator validatorReferenciaDireccion1 = new LengthValidator();
  
    public LengthValidator getValidatorReferenciaDireccion1() {
        return validatorReferenciaDireccion1;
    }
  
    public void setValidatorReferenciaDireccion1(LengthValidator validator) {
        this.validatorReferenciaDireccion1 = validator;
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
  
    private TableColumn tableColumnEsPotencialBenMigrado1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsPotencialBenMigrado1() {
        return tableColumnEsPotencialBenMigrado1;
    }

    public void setTableColumnEsPotencialBenMigrado1(TableColumn component) {
        this.tableColumnEsPotencialBenMigrado1 = component;
    }

    private Label labelEsPotencialBenMigrado1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPotencialBenMigrado1() {
        return labelEsPotencialBenMigrado1;
    }

    public void setLabelEsPotencialBenMigrado1(Label l) {
        this.labelEsPotencialBenMigrado1 = l;
    }

    private DropDown listaEsPotencialBenMigrado1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPotencialBenMigrado1() {
        return listaEsPotencialBenMigrado1;
    }

    public void setListaEsPotencialBenMigrado1(DropDown component) {
        this.listaEsPotencialBenMigrado1 = component;
    }

    private DropDown listaEsPotencialBenMigrado1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPotencialBenMigrado1x1() {
        return listaEsPotencialBenMigrado1x1;
    }

    public void setListaEsPotencialBenMigrado1x1(DropDown component) {
        this.listaEsPotencialBenMigrado1x1 = component;
    }

    private StaticText listaEsPotencialBenMigrado1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPotencialBenMigrado1Texto1() {
        return listaEsPotencialBenMigrado1Texto1;
    }

    public void setListaEsPotencialBenMigrado1Texto1(StaticText component) {
        this.listaEsPotencialBenMigrado1Texto1 = component;
    }

    private StaticText listaEsPotencialBenMigrado1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPotencialBenMigrado1x1Texto1() {
        return listaEsPotencialBenMigrado1x1Texto1;
    }

    public void setListaEsPotencialBenMigrado1x1Texto1(StaticText component) {
        this.listaEsPotencialBenMigrado1x1Texto1 = component;
    }

    private IntegerConverter converterEsPotencialBenMigrado1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPotencialBenMigrado1() {
        return converterEsPotencialBenMigrado1;
    }
  
    public void setConverterEsPotencialBenMigrado1(IntegerConverter converter) {
        this.converterEsPotencialBenMigrado1 = converter;
    }
  
    private TableColumn tableColumnLote1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnLote1() {
        return tableColumnLote1;
    }

    public void setTableColumnLote1(TableColumn component) {
        this.tableColumnLote1 = component;
    }

    private Label labelLote1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLote1() {
        return labelLote1;
    }

    public void setLabelLote1(Label l) {
        this.labelLote1 = l;
    }

    private TextField campoLote1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoLote1() {
        return campoLote1;
    }

    public void setCampoLote1(TextField component) {
        this.campoLote1 = component;
    }

    private TextField campoLote1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoLote1x1() {
        return campoLote1x1;
    }

    public void setCampoLote1x1(TextField component) {
        this.campoLote1x1 = component;
    }

    private StaticText campoLote1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLote1Texto1() {
        return campoLote1Texto1;
    }

    public void setCampoLote1Texto1(StaticText component) {
        this.campoLote1Texto1 = component;
    }

    private StaticText campoLote1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoLote1x1Texto1() {
        return campoLote1x1Texto1;
    }

    public void setCampoLote1x1Texto1(StaticText component) {
        this.campoLote1x1Texto1 = component;
    }

    private LongConverter converterLote1 = new LongConverter();
  
    public LongConverter getConverterLote1() {
        return converterLote1;
    }
  
    public void setConverterLote1(LongConverter converter) {
        this.converterLote1 = converter;
    }
  
    private LongRangeValidator validatorLote1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorLote1() {
        return validatorLote1;
    }
  
    public void setValidatorLote1(LongRangeValidator validator) {
        this.validatorLote1 = validator;
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

    private PotencialBenCachedRowSetDataProvider2 potencialBenDataProvider = new PotencialBenCachedRowSetDataProvider2();

    @Override
    public PotencialBenCachedRowSetDataProvider2 getPotencialBenDataProvider() {
        return potencialBenDataProvider;
    }

    public void setPotencialBenDataProvider(PotencialBenCachedRowSetDataProvider2 crsdp) {
        this.potencialBenDataProvider = crsdp;
    }

    private PersonaCachedRowSetDataProvider2 personaReferenceDataProvider = new PersonaCachedRowSetDataProvider2();

    @Override
    public PersonaCachedRowSetDataProvider2 getPersonaReferenceDataProvider() {
        return personaReferenceDataProvider;
    }

    public void setPersonaReferenceDataProvider(PersonaCachedRowSetDataProvider2 crsdp) {
        this.personaReferenceDataProvider = crsdp;
    }

    private EtniaIndigenaCachedRowSetDataProvider2 etniaIndigenaReferenceDataProvider = new EtniaIndigenaCachedRowSetDataProvider2();

    @Override
    public EtniaIndigenaCachedRowSetDataProvider2 getEtniaIndigenaReferenceDataProvider() {
        return etniaIndigenaReferenceDataProvider;
    }

    public void setEtniaIndigenaReferenceDataProvider(EtniaIndigenaCachedRowSetDataProvider2 crsdp) {
        this.etniaIndigenaReferenceDataProvider = crsdp;
    }

    private UbicacionCachedRowSetDataProvider2 ubicacionReferenceDataProvider = new UbicacionCachedRowSetDataProvider2();

    @Override
    public UbicacionCachedRowSetDataProvider2 getUbicacionReferenceDataProvider() {
        return ubicacionReferenceDataProvider;
    }

    public void setUbicacionReferenceDataProvider(UbicacionCachedRowSetDataProvider2 crsdp) {
        this.ubicacionReferenceDataProvider = crsdp;
    }

    private FuncionarioCachedRowSetDataProvider2 funcionarioReferenceDataProvider = new FuncionarioCachedRowSetDataProvider2();

    @Override
    public FuncionarioCachedRowSetDataProvider2 getFuncionarioReferenceDataProvider() {
        return funcionarioReferenceDataProvider;
    }

    public void setFuncionarioReferenceDataProvider(FuncionarioCachedRowSetDataProvider2 crsdp) {
        this.funcionarioReferenceDataProvider = crsdp;
    }

    private FichaPersonaCachedRowSetDataProvider2 fichaPersonaReferenceDataProvider = new FichaPersonaCachedRowSetDataProvider2();

    @Override
    public FichaPersonaCachedRowSetDataProvider2 getFichaPersonaReferenceDataProvider() {
        return fichaPersonaReferenceDataProvider;
    }

    public void setFichaPersonaReferenceDataProvider(FichaPersonaCachedRowSetDataProvider2 crsdp) {
        this.fichaPersonaReferenceDataProvider = crsdp;
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
    public PotencialBen5() {
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
        potencialBenDataProvider.close();
        personaReferenceDataProvider.close();
        etniaIndigenaReferenceDataProvider.close();
        ubicacionReferenceDataProvider.close();
        funcionarioReferenceDataProvider.close();
        fichaPersonaReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionPotencialBen...">
    @Override
    public TextField getTextFieldCampoFechaExpedicionCedula1() {
        return this.getCampoFechaExpedicionCedula1();
    }

    @Override
    public TextField getTextFieldCampoFechaVencimientoCedula1() {
        return this.getCampoFechaVencimientoCedula1();
    }

    @Override
    public TextField getTextFieldCampoFechaNacimiento1() {
        return this.getCampoFechaNacimiento1();
    }

    @Override
    public TextField getTextFieldCampoFechaValidacionCenso1() {
        return this.getCampoFechaValidacionCenso1();
    }

    @Override
    public TextField getTextFieldCampoFechaReclamoCenso1() {
        return this.getCampoFechaReclamoCenso1();
    }

    @Override
    public TextField getTextFieldCampoFechaAprobacionReclamoCenso1() {
        return this.getCampoFechaAprobacionReclamoCenso1();
    }

    @Override
    public TextField getTextFieldCampoFechaDenegacionReclamoCenso1() {
        return this.getCampoFechaDenegacionReclamoCenso1();
    }

    @Override
    public TextField getTextFieldCampoFechaRegistroPotBen1() {
        return this.getCampoFechaRegistroPotBen1();
    }

    @Override
    public TextField getTextFieldCampoFechaUltimaVisitaCenso1() {
        return this.getCampoFechaUltimaVisitaCenso1();
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
    private AsistentePaginaActualizacionPotencialBen asistente = new AsistentePaginaActualizacionPotencialBen(this);

    public AsistentePaginaActualizacionPotencialBen getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("PotencialBen5_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("PotencialBen5_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("PotencialBen5_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getPotencialBenDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return PotencialBenCachedRowSetDataProvider2.FUNCION_CONSULTAR_POTENCIAL_BEN;
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
            this.getPotencialBenDataProvider().consultarPotencialBen(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getPotencialBenDataProvider().consultarPotencialBen(filtro);
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
    public void campoIdPersona1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdPersona1_validate(context, component, value);
    }

    public void campoIdEtniaIndigena1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdEtniaIndigena1_validate(context, component, value);
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

    public void campoIdFuncionarioValidacionCen1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncionarioValidacionCen1_validate(context, component, value);
    }

    public void campoIdFichaPersona1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFichaPersona1_validate(context, component, value);
    }

    public void campoIdUsuarioRegPotBen1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdUsuarioRegPotBen1_validate(context, component, value);
    }

    public void campoIdFuncionarioUltVisitaCen1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncionarioUltVisitaCen1_validate(context, component, value);
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
        String urx = URX2.COMANDO_POTENCIAL_BEN;
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
    PotencialBenBusinessProcessLocal potencialBenBusinessProcess;

    @Override
    public Object getPotencialBenBusinessProcess() {
        return potencialBenBusinessProcess;
    }

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @Override
    public Object getMessenger() {
        return messenger;
    }

    @EJB
    private ReporterBrokerLocal reporter;

    @Override
    public Object getReporter() {
        return reporter;
    }

    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
