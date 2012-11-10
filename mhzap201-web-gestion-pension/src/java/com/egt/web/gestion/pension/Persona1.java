/*
 * Copyright (C) 2009, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.gestion.pension;

import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.EtniaIndigenaCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FichaPersonaCachedRowSetDataProvider2;
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
import com.egt.ejb.business.process.PersonaBusinessProcessLocal;
import com.egt.ejb.core.reporter.ReporterBrokerLocal;

public class Persona1 extends AbstractPageBean
        implements PaginaActualizacionPersona, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple, PaginaConsultaConFiltro, PaginaConsultaConTabla {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        textoFilasPorPagina1Validator1.setMinimum(1L);
        textoFilasPorPagina1Validator1.setMaximum(50L);
        validatorIdPersona1.setMinimum(0L);
        validatorIdPersona1.setMaximum(1000000000000000000L);
        validatorCodigoPersona1.setMaximum(30);
        validatorNombrePersona1.setMaximum(100);
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
        validatorNombreComunidadIndigena1.setMaximum(100);
        validatorDireccion1.setMaximum(8160);
        validatorNumeroTelefonoLineaBaja1.setMaximum(50);
        validatorNumeroTelefonoCelular1.setMaximum(50);
        validatorCertificadoVida1.setMaximum(30);
        converterFechaCertificadoVida1.setPattern("dd/MM/yyyy");
        converterFechaCertificadoVida1.setType("date");
        validatorComentariosAnulCerVida1.setMaximum(8160);
        validatorCertificadoDefuncion1.setMaximum(30);
        converterFechaCertificadoDefuncion1.setPattern("dd/MM/yyyy");
        converterFechaCertificadoDefuncion1.setType("date");
        validatorComentariosAnulCerDefuncion1.setMaximum(8160);
        converterMontoPension1.setMinIntegerDigits(1);
        converterMontoPension1.setMaxIntegerDigits(40);
        converterMontoPension1.setMaxFractionDigits(3);
        validatorMontoPension1.setMinimum(0.0);
        validatorMontoPension1.setMaximum(1.0E13);
        converterFechaSolicitudPension1.setPattern("dd/MM/yyyy");
        converterFechaSolicitudPension1.setType("date");
        validatorComentariosSolicitudPension1.setMaximum(8160);
        converterFechaAprobacionPension1.setPattern("dd/MM/yyyy");
        converterFechaAprobacionPension1.setType("date");
        validatorComentariosAprobacionPension1.setMaximum(8160);
        converterFechaOtorgamientoPen1.setPattern("dd/MM/yyyy");
        converterFechaOtorgamientoPen1.setType("date");
        validatorComentariosOtorgamientoPen1.setMaximum(8160);
        converterFechaDenegacionPension1.setPattern("dd/MM/yyyy");
        converterFechaDenegacionPension1.setType("date");
        validatorOtraCausaDenPension1.setMaximum(100);
        validatorComentariosDenegacionPension1.setMaximum(8160);
        converterFechaRevocacionPension1.setPattern("dd/MM/yyyy");
        converterFechaRevocacionPension1.setType("date");
        validatorOtraCausaRevPension1.setMaximum(100);
        validatorComentariosRevocacionPension1.setMaximum(8160);
        converterFechaSolicitudRecoPen1.setPattern("dd/MM/yyyy");
        converterFechaSolicitudRecoPen1.setType("date");
        validatorComentariosSolicitudRecoPen1.setMaximum(8160);
        converterFechaAprobacionRecoPen1.setPattern("dd/MM/yyyy");
        converterFechaAprobacionRecoPen1.setType("date");
        validatorComentariosAprRecoPen1.setMaximum(8160);
        converterFechaDenegacionRecoPen1.setPattern("dd/MM/yyyy");
        converterFechaDenegacionRecoPen1.setType("date");
        validatorOtraCausaDenRecoPen1.setMaximum(100);
        validatorComentariosDenRecoPen1.setMaximum(8160);
        converterFechaRegistroDenunciaPen1.setPattern("dd/MM/yyyy");
        converterFechaRegistroDenunciaPen1.setType("date");
        validatorComentariosRegistroDenuPen1.setMaximum(8160);
        converterFechaConfirmacionDenuPen1.setPattern("dd/MM/yyyy");
        converterFechaConfirmacionDenuPen1.setType("date");
        validatorComentariosConfDenuPen1.setMaximum(8160);
        converterFechaDesmentidoDenunciaPen1.setPattern("dd/MM/yyyy");
        converterFechaDesmentidoDenunciaPen1.setType("date");
        validatorComentariosDesDenuPen1.setMaximum(8160);
        converterFechaFichaPersona1.setPattern("dd/MM/yyyy");
        converterFechaFichaPersona1.setType("date");
        converterIndiceCalidadVida1.setMinIntegerDigits(1);
        converterIndiceCalidadVida1.setMaxIntegerDigits(40);
        converterIndiceCalidadVida1.setMaxFractionDigits(3);
        validatorIndiceCalidadVida1.setMinimum(0.0);
        validatorIndiceCalidadVida1.setMaximum(1.0E2);
        converterFechaUltimoCobroPension1.setPattern("dd/MM/yyyy");
        converterFechaUltimoCobroPension1.setType("date");
        validatorNotasAnulFecUltCobPen1.setMaximum(8160);
        converterFechaHoraUltActJupe1.setPattern("dd/MM/yyyy hh:mm aa");
        converterFechaHoraUltActJupe1.setType("both");
        validatorNumeroResolucionOtorPen1.setMaximum(50);
        converterFechaResolucionOtorPen1.setPattern("dd/MM/yyyy");
        converterFechaResolucionOtorPen1.setType("date");
        personaDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.personaRowSet}"));
        etniaIndigenaReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.etniaIndigenaReferenceRowSet}"));
        ubicacionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.ubicacionReferenceRowSet}"));
        fichaPersonaReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fichaPersonaReferenceRowSet}"));
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

    private LongConverter converterIdPersona1 = new LongConverter();
  
    public LongConverter getConverterIdPersona1() {
        return converterIdPersona1;
    }
  
    public void setConverterIdPersona1(LongConverter converter) {
        this.converterIdPersona1 = converter;
    }
  
    private LongRangeValidator validatorIdPersona1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdPersona1() {
        return validatorIdPersona1;
    }
  
    public void setValidatorIdPersona1(LongRangeValidator validator) {
        this.validatorIdPersona1 = validator;
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
  
    private TableColumn tableColumnNumeroSexoPersona1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroSexoPersona1() {
        return tableColumnNumeroSexoPersona1;
    }

    public void setTableColumnNumeroSexoPersona1(TableColumn component) {
        this.tableColumnNumeroSexoPersona1 = component;
    }

    private Label labelNumeroSexoPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSexoPersona1() {
        return labelNumeroSexoPersona1;
    }

    public void setLabelNumeroSexoPersona1(Label l) {
        this.labelNumeroSexoPersona1 = l;
    }

    private DropDown listaNumeroSexoPersona1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSexoPersona1() {
        return listaNumeroSexoPersona1;
    }

    public void setListaNumeroSexoPersona1(DropDown component) {
        this.listaNumeroSexoPersona1 = component;
    }

    private DropDown listaNumeroSexoPersona1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSexoPersona1x1() {
        return listaNumeroSexoPersona1x1;
    }

    public void setListaNumeroSexoPersona1x1(DropDown component) {
        this.listaNumeroSexoPersona1x1 = component;
    }

    private StaticText listaNumeroSexoPersona1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSexoPersona1Texto1() {
        return listaNumeroSexoPersona1Texto1;
    }

    public void setListaNumeroSexoPersona1Texto1(StaticText component) {
        this.listaNumeroSexoPersona1Texto1 = component;
    }

    private StaticText listaNumeroSexoPersona1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSexoPersona1x1Texto1() {
        return listaNumeroSexoPersona1x1Texto1;
    }

    public void setListaNumeroSexoPersona1x1Texto1(StaticText component) {
        this.listaNumeroSexoPersona1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSexoPersona1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSexoPersona1() {
        return converterNumeroSexoPersona1;
    }
  
    public void setConverterNumeroSexoPersona1(IntegerConverter converter) {
        this.converterNumeroSexoPersona1 = converter;
    }
  
    private TableColumn tableColumnNumeroEstadoCivil1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroEstadoCivil1() {
        return tableColumnNumeroEstadoCivil1;
    }

    public void setTableColumnNumeroEstadoCivil1(TableColumn component) {
        this.tableColumnNumeroEstadoCivil1 = component;
    }

    private Label labelNumeroEstadoCivil1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroEstadoCivil1() {
        return labelNumeroEstadoCivil1;
    }

    public void setLabelNumeroEstadoCivil1(Label l) {
        this.labelNumeroEstadoCivil1 = l;
    }

    private DropDown listaNumeroEstadoCivil1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroEstadoCivil1() {
        return listaNumeroEstadoCivil1;
    }

    public void setListaNumeroEstadoCivil1(DropDown component) {
        this.listaNumeroEstadoCivil1 = component;
    }

    private DropDown listaNumeroEstadoCivil1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroEstadoCivil1x1() {
        return listaNumeroEstadoCivil1x1;
    }

    public void setListaNumeroEstadoCivil1x1(DropDown component) {
        this.listaNumeroEstadoCivil1x1 = component;
    }

    private StaticText listaNumeroEstadoCivil1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroEstadoCivil1Texto1() {
        return listaNumeroEstadoCivil1Texto1;
    }

    public void setListaNumeroEstadoCivil1Texto1(StaticText component) {
        this.listaNumeroEstadoCivil1Texto1 = component;
    }

    private StaticText listaNumeroEstadoCivil1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroEstadoCivil1x1Texto1() {
        return listaNumeroEstadoCivil1x1Texto1;
    }

    public void setListaNumeroEstadoCivil1x1Texto1(StaticText component) {
        this.listaNumeroEstadoCivil1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroEstadoCivil1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroEstadoCivil1() {
        return converterNumeroEstadoCivil1;
    }
  
    public void setConverterNumeroEstadoCivil1(IntegerConverter converter) {
        this.converterNumeroEstadoCivil1 = converter;
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
  
    private TableColumn tableColumnCertificadoVida1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCertificadoVida1() {
        return tableColumnCertificadoVida1;
    }

    public void setTableColumnCertificadoVida1(TableColumn component) {
        this.tableColumnCertificadoVida1 = component;
    }

    private Label labelCertificadoVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCertificadoVida1() {
        return labelCertificadoVida1;
    }

    public void setLabelCertificadoVida1(Label l) {
        this.labelCertificadoVida1 = l;
    }

    private TextField campoCertificadoVida1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCertificadoVida1() {
        return campoCertificadoVida1;
    }

    public void setCampoCertificadoVida1(TextField component) {
        this.campoCertificadoVida1 = component;
    }

    private TextField campoCertificadoVida1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoCertificadoVida1x1() {
        return campoCertificadoVida1x1;
    }

    public void setCampoCertificadoVida1x1(TextField component) {
        this.campoCertificadoVida1x1 = component;
    }

    private StaticText campoCertificadoVida1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCertificadoVida1Texto1() {
        return campoCertificadoVida1Texto1;
    }

    public void setCampoCertificadoVida1Texto1(StaticText component) {
        this.campoCertificadoVida1Texto1 = component;
    }

    private StaticText campoCertificadoVida1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCertificadoVida1x1Texto1() {
        return campoCertificadoVida1x1Texto1;
    }

    public void setCampoCertificadoVida1x1Texto1(StaticText component) {
        this.campoCertificadoVida1x1Texto1 = component;
    }

    private LengthValidator validatorCertificadoVida1 = new LengthValidator();
  
    public LengthValidator getValidatorCertificadoVida1() {
        return validatorCertificadoVida1;
    }
  
    public void setValidatorCertificadoVida1(LengthValidator validator) {
        this.validatorCertificadoVida1 = validator;
    }
  
    private TableColumn tableColumnFechaCertificadoVida1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaCertificadoVida1() {
        return tableColumnFechaCertificadoVida1;
    }

    public void setTableColumnFechaCertificadoVida1(TableColumn component) {
        this.tableColumnFechaCertificadoVida1 = component;
    }

    private Label labelFechaCertificadoVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaCertificadoVida1() {
        return labelFechaCertificadoVida1;
    }

    public void setLabelFechaCertificadoVida1(Label l) {
        this.labelFechaCertificadoVida1 = l;
    }

    private TextField campoFechaCertificadoVida1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaCertificadoVida1() {
        return campoFechaCertificadoVida1;
    }

    public void setCampoFechaCertificadoVida1(TextField component) {
        this.campoFechaCertificadoVida1 = component;
    }

    private TextField campoFechaCertificadoVida1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaCertificadoVida1x1() {
        return campoFechaCertificadoVida1x1;
    }

    public void setCampoFechaCertificadoVida1x1(TextField component) {
        this.campoFechaCertificadoVida1x1 = component;
    }

    private StaticText campoFechaCertificadoVida1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaCertificadoVida1Texto1() {
        return campoFechaCertificadoVida1Texto1;
    }

    public void setCampoFechaCertificadoVida1Texto1(StaticText component) {
        this.campoFechaCertificadoVida1Texto1 = component;
    }

    private StaticText campoFechaCertificadoVida1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaCertificadoVida1x1Texto1() {
        return campoFechaCertificadoVida1x1Texto1;
    }

    public void setCampoFechaCertificadoVida1x1Texto1(StaticText component) {
        this.campoFechaCertificadoVida1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaCertificadoVida1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaCertificadoVida1() {
        return converterFechaCertificadoVida1;
    }
  
    public void setConverterFechaCertificadoVida1(SqlTimestampConverter converter) {
        this.converterFechaCertificadoVida1 = converter;
    }
  
    private TableColumn tableColumnEsCertificadoVidaAnulado1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsCertificadoVidaAnulado1() {
        return tableColumnEsCertificadoVidaAnulado1;
    }

    public void setTableColumnEsCertificadoVidaAnulado1(TableColumn component) {
        this.tableColumnEsCertificadoVidaAnulado1 = component;
    }

    private Label labelEsCertificadoVidaAnulado1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsCertificadoVidaAnulado1() {
        return labelEsCertificadoVidaAnulado1;
    }

    public void setLabelEsCertificadoVidaAnulado1(Label l) {
        this.labelEsCertificadoVidaAnulado1 = l;
    }

    private DropDown listaEsCertificadoVidaAnulado1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsCertificadoVidaAnulado1() {
        return listaEsCertificadoVidaAnulado1;
    }

    public void setListaEsCertificadoVidaAnulado1(DropDown component) {
        this.listaEsCertificadoVidaAnulado1 = component;
    }

    private DropDown listaEsCertificadoVidaAnulado1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsCertificadoVidaAnulado1x1() {
        return listaEsCertificadoVidaAnulado1x1;
    }

    public void setListaEsCertificadoVidaAnulado1x1(DropDown component) {
        this.listaEsCertificadoVidaAnulado1x1 = component;
    }

    private StaticText listaEsCertificadoVidaAnulado1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsCertificadoVidaAnulado1Texto1() {
        return listaEsCertificadoVidaAnulado1Texto1;
    }

    public void setListaEsCertificadoVidaAnulado1Texto1(StaticText component) {
        this.listaEsCertificadoVidaAnulado1Texto1 = component;
    }

    private StaticText listaEsCertificadoVidaAnulado1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsCertificadoVidaAnulado1x1Texto1() {
        return listaEsCertificadoVidaAnulado1x1Texto1;
    }

    public void setListaEsCertificadoVidaAnulado1x1Texto1(StaticText component) {
        this.listaEsCertificadoVidaAnulado1x1Texto1 = component;
    }

    private IntegerConverter converterEsCertificadoVidaAnulado1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsCertificadoVidaAnulado1() {
        return converterEsCertificadoVidaAnulado1;
    }
  
    public void setConverterEsCertificadoVidaAnulado1(IntegerConverter converter) {
        this.converterEsCertificadoVidaAnulado1 = converter;
    }
  
    private TableColumn tableColumnComentariosAnulCerVida1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosAnulCerVida1() {
        return tableColumnComentariosAnulCerVida1;
    }

    public void setTableColumnComentariosAnulCerVida1(TableColumn component) {
        this.tableColumnComentariosAnulCerVida1 = component;
    }

    private Label labelComentariosAnulCerVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAnulCerVida1() {
        return labelComentariosAnulCerVida1;
    }

    public void setLabelComentariosAnulCerVida1(Label l) {
        this.labelComentariosAnulCerVida1 = l;
    }

    private TextArea campoComentariosAnulCerVida1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosAnulCerVida1() {
        return campoComentariosAnulCerVida1;
    }

    public void setCampoComentariosAnulCerVida1(TextArea component) {
        this.campoComentariosAnulCerVida1 = component;
    }

    private TextArea campoComentariosAnulCerVida1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosAnulCerVida1x1() {
        return campoComentariosAnulCerVida1x1;
    }

    public void setCampoComentariosAnulCerVida1x1(TextArea component) {
        this.campoComentariosAnulCerVida1x1 = component;
    }

    private StaticText campoComentariosAnulCerVida1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosAnulCerVida1Texto1() {
        return campoComentariosAnulCerVida1Texto1;
    }

    public void setCampoComentariosAnulCerVida1Texto1(StaticText component) {
        this.campoComentariosAnulCerVida1Texto1 = component;
    }

    private StaticText campoComentariosAnulCerVida1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosAnulCerVida1x1Texto1() {
        return campoComentariosAnulCerVida1x1Texto1;
    }

    public void setCampoComentariosAnulCerVida1x1Texto1(StaticText component) {
        this.campoComentariosAnulCerVida1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosAnulCerVida1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosAnulCerVida1() {
        return validatorComentariosAnulCerVida1;
    }
  
    public void setValidatorComentariosAnulCerVida1(LengthValidator validator) {
        this.validatorComentariosAnulCerVida1 = validator;
    }
  
    private TableColumn tableColumnCertificadoDefuncion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnCertificadoDefuncion1() {
        return tableColumnCertificadoDefuncion1;
    }

    public void setTableColumnCertificadoDefuncion1(TableColumn component) {
        this.tableColumnCertificadoDefuncion1 = component;
    }

    private Label labelCertificadoDefuncion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCertificadoDefuncion1() {
        return labelCertificadoDefuncion1;
    }

    public void setLabelCertificadoDefuncion1(Label l) {
        this.labelCertificadoDefuncion1 = l;
    }

    private TextField campoCertificadoDefuncion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCertificadoDefuncion1() {
        return campoCertificadoDefuncion1;
    }

    public void setCampoCertificadoDefuncion1(TextField component) {
        this.campoCertificadoDefuncion1 = component;
    }

    private TextField campoCertificadoDefuncion1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoCertificadoDefuncion1x1() {
        return campoCertificadoDefuncion1x1;
    }

    public void setCampoCertificadoDefuncion1x1(TextField component) {
        this.campoCertificadoDefuncion1x1 = component;
    }

    private StaticText campoCertificadoDefuncion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCertificadoDefuncion1Texto1() {
        return campoCertificadoDefuncion1Texto1;
    }

    public void setCampoCertificadoDefuncion1Texto1(StaticText component) {
        this.campoCertificadoDefuncion1Texto1 = component;
    }

    private StaticText campoCertificadoDefuncion1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCertificadoDefuncion1x1Texto1() {
        return campoCertificadoDefuncion1x1Texto1;
    }

    public void setCampoCertificadoDefuncion1x1Texto1(StaticText component) {
        this.campoCertificadoDefuncion1x1Texto1 = component;
    }

    private LengthValidator validatorCertificadoDefuncion1 = new LengthValidator();
  
    public LengthValidator getValidatorCertificadoDefuncion1() {
        return validatorCertificadoDefuncion1;
    }
  
    public void setValidatorCertificadoDefuncion1(LengthValidator validator) {
        this.validatorCertificadoDefuncion1 = validator;
    }
  
    private TableColumn tableColumnFechaCertificadoDefuncion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaCertificadoDefuncion1() {
        return tableColumnFechaCertificadoDefuncion1;
    }

    public void setTableColumnFechaCertificadoDefuncion1(TableColumn component) {
        this.tableColumnFechaCertificadoDefuncion1 = component;
    }

    private Label labelFechaCertificadoDefuncion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaCertificadoDefuncion1() {
        return labelFechaCertificadoDefuncion1;
    }

    public void setLabelFechaCertificadoDefuncion1(Label l) {
        this.labelFechaCertificadoDefuncion1 = l;
    }

    private TextField campoFechaCertificadoDefuncion1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaCertificadoDefuncion1() {
        return campoFechaCertificadoDefuncion1;
    }

    public void setCampoFechaCertificadoDefuncion1(TextField component) {
        this.campoFechaCertificadoDefuncion1 = component;
    }

    private TextField campoFechaCertificadoDefuncion1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaCertificadoDefuncion1x1() {
        return campoFechaCertificadoDefuncion1x1;
    }

    public void setCampoFechaCertificadoDefuncion1x1(TextField component) {
        this.campoFechaCertificadoDefuncion1x1 = component;
    }

    private StaticText campoFechaCertificadoDefuncion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaCertificadoDefuncion1Texto1() {
        return campoFechaCertificadoDefuncion1Texto1;
    }

    public void setCampoFechaCertificadoDefuncion1Texto1(StaticText component) {
        this.campoFechaCertificadoDefuncion1Texto1 = component;
    }

    private StaticText campoFechaCertificadoDefuncion1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaCertificadoDefuncion1x1Texto1() {
        return campoFechaCertificadoDefuncion1x1Texto1;
    }

    public void setCampoFechaCertificadoDefuncion1x1Texto1(StaticText component) {
        this.campoFechaCertificadoDefuncion1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaCertificadoDefuncion1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaCertificadoDefuncion1() {
        return converterFechaCertificadoDefuncion1;
    }
  
    public void setConverterFechaCertificadoDefuncion1(SqlTimestampConverter converter) {
        this.converterFechaCertificadoDefuncion1 = converter;
    }
  
    private TableColumn tableColumnEsCerDefuncionAnulado1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsCerDefuncionAnulado1() {
        return tableColumnEsCerDefuncionAnulado1;
    }

    public void setTableColumnEsCerDefuncionAnulado1(TableColumn component) {
        this.tableColumnEsCerDefuncionAnulado1 = component;
    }

    private Label labelEsCerDefuncionAnulado1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsCerDefuncionAnulado1() {
        return labelEsCerDefuncionAnulado1;
    }

    public void setLabelEsCerDefuncionAnulado1(Label l) {
        this.labelEsCerDefuncionAnulado1 = l;
    }

    private DropDown listaEsCerDefuncionAnulado1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsCerDefuncionAnulado1() {
        return listaEsCerDefuncionAnulado1;
    }

    public void setListaEsCerDefuncionAnulado1(DropDown component) {
        this.listaEsCerDefuncionAnulado1 = component;
    }

    private DropDown listaEsCerDefuncionAnulado1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsCerDefuncionAnulado1x1() {
        return listaEsCerDefuncionAnulado1x1;
    }

    public void setListaEsCerDefuncionAnulado1x1(DropDown component) {
        this.listaEsCerDefuncionAnulado1x1 = component;
    }

    private StaticText listaEsCerDefuncionAnulado1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsCerDefuncionAnulado1Texto1() {
        return listaEsCerDefuncionAnulado1Texto1;
    }

    public void setListaEsCerDefuncionAnulado1Texto1(StaticText component) {
        this.listaEsCerDefuncionAnulado1Texto1 = component;
    }

    private StaticText listaEsCerDefuncionAnulado1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsCerDefuncionAnulado1x1Texto1() {
        return listaEsCerDefuncionAnulado1x1Texto1;
    }

    public void setListaEsCerDefuncionAnulado1x1Texto1(StaticText component) {
        this.listaEsCerDefuncionAnulado1x1Texto1 = component;
    }

    private IntegerConverter converterEsCerDefuncionAnulado1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsCerDefuncionAnulado1() {
        return converterEsCerDefuncionAnulado1;
    }
  
    public void setConverterEsCerDefuncionAnulado1(IntegerConverter converter) {
        this.converterEsCerDefuncionAnulado1 = converter;
    }
  
    private TableColumn tableColumnComentariosAnulCerDefuncion1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosAnulCerDefuncion1() {
        return tableColumnComentariosAnulCerDefuncion1;
    }

    public void setTableColumnComentariosAnulCerDefuncion1(TableColumn component) {
        this.tableColumnComentariosAnulCerDefuncion1 = component;
    }

    private Label labelComentariosAnulCerDefuncion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAnulCerDefuncion1() {
        return labelComentariosAnulCerDefuncion1;
    }

    public void setLabelComentariosAnulCerDefuncion1(Label l) {
        this.labelComentariosAnulCerDefuncion1 = l;
    }

    private TextArea campoComentariosAnulCerDefuncion1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosAnulCerDefuncion1() {
        return campoComentariosAnulCerDefuncion1;
    }

    public void setCampoComentariosAnulCerDefuncion1(TextArea component) {
        this.campoComentariosAnulCerDefuncion1 = component;
    }

    private TextArea campoComentariosAnulCerDefuncion1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosAnulCerDefuncion1x1() {
        return campoComentariosAnulCerDefuncion1x1;
    }

    public void setCampoComentariosAnulCerDefuncion1x1(TextArea component) {
        this.campoComentariosAnulCerDefuncion1x1 = component;
    }

    private StaticText campoComentariosAnulCerDefuncion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosAnulCerDefuncion1Texto1() {
        return campoComentariosAnulCerDefuncion1Texto1;
    }

    public void setCampoComentariosAnulCerDefuncion1Texto1(StaticText component) {
        this.campoComentariosAnulCerDefuncion1Texto1 = component;
    }

    private StaticText campoComentariosAnulCerDefuncion1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosAnulCerDefuncion1x1Texto1() {
        return campoComentariosAnulCerDefuncion1x1Texto1;
    }

    public void setCampoComentariosAnulCerDefuncion1x1Texto1(StaticText component) {
        this.campoComentariosAnulCerDefuncion1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosAnulCerDefuncion1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosAnulCerDefuncion1() {
        return validatorComentariosAnulCerDefuncion1;
    }
  
    public void setValidatorComentariosAnulCerDefuncion1(LengthValidator validator) {
        this.validatorComentariosAnulCerDefuncion1 = validator;
    }
  
    private TableColumn tableColumnEsPersonaConEmpleo1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsPersonaConEmpleo1() {
        return tableColumnEsPersonaConEmpleo1;
    }

    public void setTableColumnEsPersonaConEmpleo1(TableColumn component) {
        this.tableColumnEsPersonaConEmpleo1 = component;
    }

    private Label labelEsPersonaConEmpleo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConEmpleo1() {
        return labelEsPersonaConEmpleo1;
    }

    public void setLabelEsPersonaConEmpleo1(Label l) {
        this.labelEsPersonaConEmpleo1 = l;
    }

    private DropDown listaEsPersonaConEmpleo1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPersonaConEmpleo1() {
        return listaEsPersonaConEmpleo1;
    }

    public void setListaEsPersonaConEmpleo1(DropDown component) {
        this.listaEsPersonaConEmpleo1 = component;
    }

    private DropDown listaEsPersonaConEmpleo1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPersonaConEmpleo1x1() {
        return listaEsPersonaConEmpleo1x1;
    }

    public void setListaEsPersonaConEmpleo1x1(DropDown component) {
        this.listaEsPersonaConEmpleo1x1 = component;
    }

    private StaticText listaEsPersonaConEmpleo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConEmpleo1Texto1() {
        return listaEsPersonaConEmpleo1Texto1;
    }

    public void setListaEsPersonaConEmpleo1Texto1(StaticText component) {
        this.listaEsPersonaConEmpleo1Texto1 = component;
    }

    private StaticText listaEsPersonaConEmpleo1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConEmpleo1x1Texto1() {
        return listaEsPersonaConEmpleo1x1Texto1;
    }

    public void setListaEsPersonaConEmpleo1x1Texto1(StaticText component) {
        this.listaEsPersonaConEmpleo1x1Texto1 = component;
    }

    private IntegerConverter converterEsPersonaConEmpleo1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPersonaConEmpleo1() {
        return converterEsPersonaConEmpleo1;
    }
  
    public void setConverterEsPersonaConEmpleo1(IntegerConverter converter) {
        this.converterEsPersonaConEmpleo1 = converter;
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
  
    private TableColumn tableColumnEsPersonaConDeuda1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsPersonaConDeuda1() {
        return tableColumnEsPersonaConDeuda1;
    }

    public void setTableColumnEsPersonaConDeuda1(TableColumn component) {
        this.tableColumnEsPersonaConDeuda1 = component;
    }

    private Label labelEsPersonaConDeuda1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConDeuda1() {
        return labelEsPersonaConDeuda1;
    }

    public void setLabelEsPersonaConDeuda1(Label l) {
        this.labelEsPersonaConDeuda1 = l;
    }

    private DropDown listaEsPersonaConDeuda1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPersonaConDeuda1() {
        return listaEsPersonaConDeuda1;
    }

    public void setListaEsPersonaConDeuda1(DropDown component) {
        this.listaEsPersonaConDeuda1 = component;
    }

    private DropDown listaEsPersonaConDeuda1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPersonaConDeuda1x1() {
        return listaEsPersonaConDeuda1x1;
    }

    public void setListaEsPersonaConDeuda1x1(DropDown component) {
        this.listaEsPersonaConDeuda1x1 = component;
    }

    private StaticText listaEsPersonaConDeuda1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConDeuda1Texto1() {
        return listaEsPersonaConDeuda1Texto1;
    }

    public void setListaEsPersonaConDeuda1Texto1(StaticText component) {
        this.listaEsPersonaConDeuda1Texto1 = component;
    }

    private StaticText listaEsPersonaConDeuda1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConDeuda1x1Texto1() {
        return listaEsPersonaConDeuda1x1Texto1;
    }

    public void setListaEsPersonaConDeuda1x1Texto1(StaticText component) {
        this.listaEsPersonaConDeuda1x1Texto1 = component;
    }

    private IntegerConverter converterEsPersonaConDeuda1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPersonaConDeuda1() {
        return converterEsPersonaConDeuda1;
    }
  
    public void setConverterEsPersonaConDeuda1(IntegerConverter converter) {
        this.converterEsPersonaConDeuda1 = converter;
    }
  
    private TableColumn tableColumnEsPersonaConPenaJudicial1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsPersonaConPenaJudicial1() {
        return tableColumnEsPersonaConPenaJudicial1;
    }

    public void setTableColumnEsPersonaConPenaJudicial1(TableColumn component) {
        this.tableColumnEsPersonaConPenaJudicial1 = component;
    }

    private Label labelEsPersonaConPenaJudicial1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConPenaJudicial1() {
        return labelEsPersonaConPenaJudicial1;
    }

    public void setLabelEsPersonaConPenaJudicial1(Label l) {
        this.labelEsPersonaConPenaJudicial1 = l;
    }

    private DropDown listaEsPersonaConPenaJudicial1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPersonaConPenaJudicial1() {
        return listaEsPersonaConPenaJudicial1;
    }

    public void setListaEsPersonaConPenaJudicial1(DropDown component) {
        this.listaEsPersonaConPenaJudicial1 = component;
    }

    private DropDown listaEsPersonaConPenaJudicial1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPersonaConPenaJudicial1x1() {
        return listaEsPersonaConPenaJudicial1x1;
    }

    public void setListaEsPersonaConPenaJudicial1x1(DropDown component) {
        this.listaEsPersonaConPenaJudicial1x1 = component;
    }

    private StaticText listaEsPersonaConPenaJudicial1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConPenaJudicial1Texto1() {
        return listaEsPersonaConPenaJudicial1Texto1;
    }

    public void setListaEsPersonaConPenaJudicial1Texto1(StaticText component) {
        this.listaEsPersonaConPenaJudicial1Texto1 = component;
    }

    private StaticText listaEsPersonaConPenaJudicial1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConPenaJudicial1x1Texto1() {
        return listaEsPersonaConPenaJudicial1x1Texto1;
    }

    public void setListaEsPersonaConPenaJudicial1x1Texto1(StaticText component) {
        this.listaEsPersonaConPenaJudicial1x1Texto1 = component;
    }

    private IntegerConverter converterEsPersonaConPenaJudicial1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPersonaConPenaJudicial1() {
        return converterEsPersonaConPenaJudicial1;
    }
  
    public void setConverterEsPersonaConPenaJudicial1(IntegerConverter converter) {
        this.converterEsPersonaConPenaJudicial1 = converter;
    }
  
    private TableColumn tableColumnEsPersonaConCerVida1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsPersonaConCerVida1() {
        return tableColumnEsPersonaConCerVida1;
    }

    public void setTableColumnEsPersonaConCerVida1(TableColumn component) {
        this.tableColumnEsPersonaConCerVida1 = component;
    }

    private Label labelEsPersonaConCerVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConCerVida1() {
        return labelEsPersonaConCerVida1;
    }

    public void setLabelEsPersonaConCerVida1(Label l) {
        this.labelEsPersonaConCerVida1 = l;
    }

    private DropDown listaEsPersonaConCerVida1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPersonaConCerVida1() {
        return listaEsPersonaConCerVida1;
    }

    public void setListaEsPersonaConCerVida1(DropDown component) {
        this.listaEsPersonaConCerVida1 = component;
    }

    private DropDown listaEsPersonaConCerVida1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPersonaConCerVida1x1() {
        return listaEsPersonaConCerVida1x1;
    }

    public void setListaEsPersonaConCerVida1x1(DropDown component) {
        this.listaEsPersonaConCerVida1x1 = component;
    }

    private StaticText listaEsPersonaConCerVida1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConCerVida1Texto1() {
        return listaEsPersonaConCerVida1Texto1;
    }

    public void setListaEsPersonaConCerVida1Texto1(StaticText component) {
        this.listaEsPersonaConCerVida1Texto1 = component;
    }

    private StaticText listaEsPersonaConCerVida1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConCerVida1x1Texto1() {
        return listaEsPersonaConCerVida1x1Texto1;
    }

    public void setListaEsPersonaConCerVida1x1Texto1(StaticText component) {
        this.listaEsPersonaConCerVida1x1Texto1 = component;
    }

    private IntegerConverter converterEsPersonaConCerVida1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPersonaConCerVida1() {
        return converterEsPersonaConCerVida1;
    }
  
    public void setConverterEsPersonaConCerVida1(IntegerConverter converter) {
        this.converterEsPersonaConCerVida1 = converter;
    }
  
    private TableColumn tableColumnEsPersonaConCartaRenuncia1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsPersonaConCartaRenuncia1() {
        return tableColumnEsPersonaConCartaRenuncia1;
    }

    public void setTableColumnEsPersonaConCartaRenuncia1(TableColumn component) {
        this.tableColumnEsPersonaConCartaRenuncia1 = component;
    }

    private Label labelEsPersonaConCartaRenuncia1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConCartaRenuncia1() {
        return labelEsPersonaConCartaRenuncia1;
    }

    public void setLabelEsPersonaConCartaRenuncia1(Label l) {
        this.labelEsPersonaConCartaRenuncia1 = l;
    }

    private DropDown listaEsPersonaConCartaRenuncia1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPersonaConCartaRenuncia1() {
        return listaEsPersonaConCartaRenuncia1;
    }

    public void setListaEsPersonaConCartaRenuncia1(DropDown component) {
        this.listaEsPersonaConCartaRenuncia1 = component;
    }

    private DropDown listaEsPersonaConCartaRenuncia1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPersonaConCartaRenuncia1x1() {
        return listaEsPersonaConCartaRenuncia1x1;
    }

    public void setListaEsPersonaConCartaRenuncia1x1(DropDown component) {
        this.listaEsPersonaConCartaRenuncia1x1 = component;
    }

    private StaticText listaEsPersonaConCartaRenuncia1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConCartaRenuncia1Texto1() {
        return listaEsPersonaConCartaRenuncia1Texto1;
    }

    public void setListaEsPersonaConCartaRenuncia1Texto1(StaticText component) {
        this.listaEsPersonaConCartaRenuncia1Texto1 = component;
    }

    private StaticText listaEsPersonaConCartaRenuncia1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConCartaRenuncia1x1Texto1() {
        return listaEsPersonaConCartaRenuncia1x1Texto1;
    }

    public void setListaEsPersonaConCartaRenuncia1x1Texto1(StaticText component) {
        this.listaEsPersonaConCartaRenuncia1x1Texto1 = component;
    }

    private IntegerConverter converterEsPersonaConCartaRenuncia1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPersonaConCartaRenuncia1() {
        return converterEsPersonaConCartaRenuncia1;
    }
  
    public void setConverterEsPersonaConCartaRenuncia1(IntegerConverter converter) {
        this.converterEsPersonaConCartaRenuncia1 = converter;
    }
  
    private TableColumn tableColumnEsPersonaElegibleParaPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsPersonaElegibleParaPen1() {
        return tableColumnEsPersonaElegibleParaPen1;
    }

    public void setTableColumnEsPersonaElegibleParaPen1(TableColumn component) {
        this.tableColumnEsPersonaElegibleParaPen1 = component;
    }

    private Label labelEsPersonaElegibleParaPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaElegibleParaPen1() {
        return labelEsPersonaElegibleParaPen1;
    }

    public void setLabelEsPersonaElegibleParaPen1(Label l) {
        this.labelEsPersonaElegibleParaPen1 = l;
    }

    private DropDown listaEsPersonaElegibleParaPen1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPersonaElegibleParaPen1() {
        return listaEsPersonaElegibleParaPen1;
    }

    public void setListaEsPersonaElegibleParaPen1(DropDown component) {
        this.listaEsPersonaElegibleParaPen1 = component;
    }

    private DropDown listaEsPersonaElegibleParaPen1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPersonaElegibleParaPen1x1() {
        return listaEsPersonaElegibleParaPen1x1;
    }

    public void setListaEsPersonaElegibleParaPen1x1(DropDown component) {
        this.listaEsPersonaElegibleParaPen1x1 = component;
    }

    private StaticText listaEsPersonaElegibleParaPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaElegibleParaPen1Texto1() {
        return listaEsPersonaElegibleParaPen1Texto1;
    }

    public void setListaEsPersonaElegibleParaPen1Texto1(StaticText component) {
        this.listaEsPersonaElegibleParaPen1Texto1 = component;
    }

    private StaticText listaEsPersonaElegibleParaPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaElegibleParaPen1x1Texto1() {
        return listaEsPersonaElegibleParaPen1x1Texto1;
    }

    public void setListaEsPersonaElegibleParaPen1x1Texto1(StaticText component) {
        this.listaEsPersonaElegibleParaPen1x1Texto1 = component;
    }

    private IntegerConverter converterEsPersonaElegibleParaPen1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPersonaElegibleParaPen1() {
        return converterEsPersonaElegibleParaPen1;
    }
  
    public void setConverterEsPersonaElegibleParaPen1(IntegerConverter converter) {
        this.converterEsPersonaElegibleParaPen1 = converter;
    }
  
    private TableColumn tableColumnEsPersonaAcreditadaParaPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnEsPersonaAcreditadaParaPen1() {
        return tableColumnEsPersonaAcreditadaParaPen1;
    }

    public void setTableColumnEsPersonaAcreditadaParaPen1(TableColumn component) {
        this.tableColumnEsPersonaAcreditadaParaPen1 = component;
    }

    private Label labelEsPersonaAcreditadaParaPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaAcreditadaParaPen1() {
        return labelEsPersonaAcreditadaParaPen1;
    }

    public void setLabelEsPersonaAcreditadaParaPen1(Label l) {
        this.labelEsPersonaAcreditadaParaPen1 = l;
    }

    private DropDown listaEsPersonaAcreditadaParaPen1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPersonaAcreditadaParaPen1() {
        return listaEsPersonaAcreditadaParaPen1;
    }

    public void setListaEsPersonaAcreditadaParaPen1(DropDown component) {
        this.listaEsPersonaAcreditadaParaPen1 = component;
    }

    private DropDown listaEsPersonaAcreditadaParaPen1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPersonaAcreditadaParaPen1x1() {
        return listaEsPersonaAcreditadaParaPen1x1;
    }

    public void setListaEsPersonaAcreditadaParaPen1x1(DropDown component) {
        this.listaEsPersonaAcreditadaParaPen1x1 = component;
    }

    private StaticText listaEsPersonaAcreditadaParaPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaAcreditadaParaPen1Texto1() {
        return listaEsPersonaAcreditadaParaPen1Texto1;
    }

    public void setListaEsPersonaAcreditadaParaPen1Texto1(StaticText component) {
        this.listaEsPersonaAcreditadaParaPen1Texto1 = component;
    }

    private StaticText listaEsPersonaAcreditadaParaPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaAcreditadaParaPen1x1Texto1() {
        return listaEsPersonaAcreditadaParaPen1x1Texto1;
    }

    public void setListaEsPersonaAcreditadaParaPen1x1Texto1(StaticText component) {
        this.listaEsPersonaAcreditadaParaPen1x1Texto1 = component;
    }

    private IntegerConverter converterEsPersonaAcreditadaParaPen1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPersonaAcreditadaParaPen1() {
        return converterEsPersonaAcreditadaParaPen1;
    }
  
    public void setConverterEsPersonaAcreditadaParaPen1(IntegerConverter converter) {
        this.converterEsPersonaAcreditadaParaPen1 = converter;
    }
  
    private TableColumn tableColumnMontoPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnMontoPension1() {
        return tableColumnMontoPension1;
    }

    public void setTableColumnMontoPension1(TableColumn component) {
        this.tableColumnMontoPension1 = component;
    }

    private Label labelMontoPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoPension1() {
        return labelMontoPension1;
    }

    public void setLabelMontoPension1(Label l) {
        this.labelMontoPension1 = l;
    }

    private TextField campoMontoPension1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoMontoPension1() {
        return campoMontoPension1;
    }

    public void setCampoMontoPension1(TextField component) {
        this.campoMontoPension1 = component;
    }

    private TextField campoMontoPension1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoMontoPension1x1() {
        return campoMontoPension1x1;
    }

    public void setCampoMontoPension1x1(TextField component) {
        this.campoMontoPension1x1 = component;
    }

    private StaticText campoMontoPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoPension1Texto1() {
        return campoMontoPension1Texto1;
    }

    public void setCampoMontoPension1Texto1(StaticText component) {
        this.campoMontoPension1Texto1 = component;
    }

    private StaticText campoMontoPension1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoPension1x1Texto1() {
        return campoMontoPension1x1Texto1;
    }

    public void setCampoMontoPension1x1Texto1(StaticText component) {
        this.campoMontoPension1x1Texto1 = component;
    }

    private NumberConverter converterMontoPension1 = new NumberConverter();
  
    public NumberConverter getConverterMontoPension1() {
        return converterMontoPension1;
    }
  
    public void setConverterMontoPension1(NumberConverter converter) {
        this.converterMontoPension1 = converter;
    }
  
    private DoubleRangeValidator validatorMontoPension1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorMontoPension1() {
        return validatorMontoPension1;
    }
  
    public void setValidatorMontoPension1(DoubleRangeValidator validator) {
        this.validatorMontoPension1 = validator;
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

    private DropDown listaNumeroCondicionPension1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCondicionPension1x1() {
        return listaNumeroCondicionPension1x1;
    }

    public void setListaNumeroCondicionPension1x1(DropDown component) {
        this.listaNumeroCondicionPension1x1 = component;
    }

    private StaticText listaNumeroCondicionPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCondicionPension1Texto1() {
        return listaNumeroCondicionPension1Texto1;
    }

    public void setListaNumeroCondicionPension1Texto1(StaticText component) {
        this.listaNumeroCondicionPension1Texto1 = component;
    }

    private StaticText listaNumeroCondicionPension1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCondicionPension1x1Texto1() {
        return listaNumeroCondicionPension1x1Texto1;
    }

    public void setListaNumeroCondicionPension1x1Texto1(StaticText component) {
        this.listaNumeroCondicionPension1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroCondicionPension1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCondicionPension1() {
        return converterNumeroCondicionPension1;
    }
  
    public void setConverterNumeroCondicionPension1(IntegerConverter converter) {
        this.converterNumeroCondicionPension1 = converter;
    }
  
    private TableColumn tableColumnFechaSolicitudPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaSolicitudPension1() {
        return tableColumnFechaSolicitudPension1;
    }

    public void setTableColumnFechaSolicitudPension1(TableColumn component) {
        this.tableColumnFechaSolicitudPension1 = component;
    }

    private Label labelFechaSolicitudPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaSolicitudPension1() {
        return labelFechaSolicitudPension1;
    }

    public void setLabelFechaSolicitudPension1(Label l) {
        this.labelFechaSolicitudPension1 = l;
    }

    private TextField campoFechaSolicitudPension1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaSolicitudPension1() {
        return campoFechaSolicitudPension1;
    }

    public void setCampoFechaSolicitudPension1(TextField component) {
        this.campoFechaSolicitudPension1 = component;
    }

    private TextField campoFechaSolicitudPension1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaSolicitudPension1x1() {
        return campoFechaSolicitudPension1x1;
    }

    public void setCampoFechaSolicitudPension1x1(TextField component) {
        this.campoFechaSolicitudPension1x1 = component;
    }

    private StaticText campoFechaSolicitudPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaSolicitudPension1Texto1() {
        return campoFechaSolicitudPension1Texto1;
    }

    public void setCampoFechaSolicitudPension1Texto1(StaticText component) {
        this.campoFechaSolicitudPension1Texto1 = component;
    }

    private StaticText campoFechaSolicitudPension1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaSolicitudPension1x1Texto1() {
        return campoFechaSolicitudPension1x1Texto1;
    }

    public void setCampoFechaSolicitudPension1x1Texto1(StaticText component) {
        this.campoFechaSolicitudPension1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaSolicitudPension1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaSolicitudPension1() {
        return converterFechaSolicitudPension1;
    }
  
    public void setConverterFechaSolicitudPension1(SqlTimestampConverter converter) {
        this.converterFechaSolicitudPension1 = converter;
    }
  
    private TableColumn tableColumnComentariosSolicitudPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosSolicitudPension1() {
        return tableColumnComentariosSolicitudPension1;
    }

    public void setTableColumnComentariosSolicitudPension1(TableColumn component) {
        this.tableColumnComentariosSolicitudPension1 = component;
    }

    private Label labelComentariosSolicitudPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosSolicitudPension1() {
        return labelComentariosSolicitudPension1;
    }

    public void setLabelComentariosSolicitudPension1(Label l) {
        this.labelComentariosSolicitudPension1 = l;
    }

    private TextArea campoComentariosSolicitudPension1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosSolicitudPension1() {
        return campoComentariosSolicitudPension1;
    }

    public void setCampoComentariosSolicitudPension1(TextArea component) {
        this.campoComentariosSolicitudPension1 = component;
    }

    private TextArea campoComentariosSolicitudPension1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosSolicitudPension1x1() {
        return campoComentariosSolicitudPension1x1;
    }

    public void setCampoComentariosSolicitudPension1x1(TextArea component) {
        this.campoComentariosSolicitudPension1x1 = component;
    }

    private StaticText campoComentariosSolicitudPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosSolicitudPension1Texto1() {
        return campoComentariosSolicitudPension1Texto1;
    }

    public void setCampoComentariosSolicitudPension1Texto1(StaticText component) {
        this.campoComentariosSolicitudPension1Texto1 = component;
    }

    private StaticText campoComentariosSolicitudPension1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosSolicitudPension1x1Texto1() {
        return campoComentariosSolicitudPension1x1Texto1;
    }

    public void setCampoComentariosSolicitudPension1x1Texto1(StaticText component) {
        this.campoComentariosSolicitudPension1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosSolicitudPension1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosSolicitudPension1() {
        return validatorComentariosSolicitudPension1;
    }
  
    public void setValidatorComentariosSolicitudPension1(LengthValidator validator) {
        this.validatorComentariosSolicitudPension1 = validator;
    }
  
    private TableColumn tableColumnFechaAprobacionPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaAprobacionPension1() {
        return tableColumnFechaAprobacionPension1;
    }

    public void setTableColumnFechaAprobacionPension1(TableColumn component) {
        this.tableColumnFechaAprobacionPension1 = component;
    }

    private Label labelFechaAprobacionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaAprobacionPension1() {
        return labelFechaAprobacionPension1;
    }

    public void setLabelFechaAprobacionPension1(Label l) {
        this.labelFechaAprobacionPension1 = l;
    }

    private TextField campoFechaAprobacionPension1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaAprobacionPension1() {
        return campoFechaAprobacionPension1;
    }

    public void setCampoFechaAprobacionPension1(TextField component) {
        this.campoFechaAprobacionPension1 = component;
    }

    private TextField campoFechaAprobacionPension1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaAprobacionPension1x1() {
        return campoFechaAprobacionPension1x1;
    }

    public void setCampoFechaAprobacionPension1x1(TextField component) {
        this.campoFechaAprobacionPension1x1 = component;
    }

    private StaticText campoFechaAprobacionPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaAprobacionPension1Texto1() {
        return campoFechaAprobacionPension1Texto1;
    }

    public void setCampoFechaAprobacionPension1Texto1(StaticText component) {
        this.campoFechaAprobacionPension1Texto1 = component;
    }

    private StaticText campoFechaAprobacionPension1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaAprobacionPension1x1Texto1() {
        return campoFechaAprobacionPension1x1Texto1;
    }

    public void setCampoFechaAprobacionPension1x1Texto1(StaticText component) {
        this.campoFechaAprobacionPension1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaAprobacionPension1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaAprobacionPension1() {
        return converterFechaAprobacionPension1;
    }
  
    public void setConverterFechaAprobacionPension1(SqlTimestampConverter converter) {
        this.converterFechaAprobacionPension1 = converter;
    }
  
    private TableColumn tableColumnComentariosAprobacionPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosAprobacionPension1() {
        return tableColumnComentariosAprobacionPension1;
    }

    public void setTableColumnComentariosAprobacionPension1(TableColumn component) {
        this.tableColumnComentariosAprobacionPension1 = component;
    }

    private Label labelComentariosAprobacionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAprobacionPension1() {
        return labelComentariosAprobacionPension1;
    }

    public void setLabelComentariosAprobacionPension1(Label l) {
        this.labelComentariosAprobacionPension1 = l;
    }

    private TextArea campoComentariosAprobacionPension1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosAprobacionPension1() {
        return campoComentariosAprobacionPension1;
    }

    public void setCampoComentariosAprobacionPension1(TextArea component) {
        this.campoComentariosAprobacionPension1 = component;
    }

    private TextArea campoComentariosAprobacionPension1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosAprobacionPension1x1() {
        return campoComentariosAprobacionPension1x1;
    }

    public void setCampoComentariosAprobacionPension1x1(TextArea component) {
        this.campoComentariosAprobacionPension1x1 = component;
    }

    private StaticText campoComentariosAprobacionPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosAprobacionPension1Texto1() {
        return campoComentariosAprobacionPension1Texto1;
    }

    public void setCampoComentariosAprobacionPension1Texto1(StaticText component) {
        this.campoComentariosAprobacionPension1Texto1 = component;
    }

    private StaticText campoComentariosAprobacionPension1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosAprobacionPension1x1Texto1() {
        return campoComentariosAprobacionPension1x1Texto1;
    }

    public void setCampoComentariosAprobacionPension1x1Texto1(StaticText component) {
        this.campoComentariosAprobacionPension1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosAprobacionPension1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosAprobacionPension1() {
        return validatorComentariosAprobacionPension1;
    }
  
    public void setValidatorComentariosAprobacionPension1(LengthValidator validator) {
        this.validatorComentariosAprobacionPension1 = validator;
    }
  
    private TableColumn tableColumnFechaOtorgamientoPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaOtorgamientoPen1() {
        return tableColumnFechaOtorgamientoPen1;
    }

    public void setTableColumnFechaOtorgamientoPen1(TableColumn component) {
        this.tableColumnFechaOtorgamientoPen1 = component;
    }

    private Label labelFechaOtorgamientoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaOtorgamientoPen1() {
        return labelFechaOtorgamientoPen1;
    }

    public void setLabelFechaOtorgamientoPen1(Label l) {
        this.labelFechaOtorgamientoPen1 = l;
    }

    private TextField campoFechaOtorgamientoPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaOtorgamientoPen1() {
        return campoFechaOtorgamientoPen1;
    }

    public void setCampoFechaOtorgamientoPen1(TextField component) {
        this.campoFechaOtorgamientoPen1 = component;
    }

    private TextField campoFechaOtorgamientoPen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaOtorgamientoPen1x1() {
        return campoFechaOtorgamientoPen1x1;
    }

    public void setCampoFechaOtorgamientoPen1x1(TextField component) {
        this.campoFechaOtorgamientoPen1x1 = component;
    }

    private StaticText campoFechaOtorgamientoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaOtorgamientoPen1Texto1() {
        return campoFechaOtorgamientoPen1Texto1;
    }

    public void setCampoFechaOtorgamientoPen1Texto1(StaticText component) {
        this.campoFechaOtorgamientoPen1Texto1 = component;
    }

    private StaticText campoFechaOtorgamientoPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaOtorgamientoPen1x1Texto1() {
        return campoFechaOtorgamientoPen1x1Texto1;
    }

    public void setCampoFechaOtorgamientoPen1x1Texto1(StaticText component) {
        this.campoFechaOtorgamientoPen1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaOtorgamientoPen1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaOtorgamientoPen1() {
        return converterFechaOtorgamientoPen1;
    }
  
    public void setConverterFechaOtorgamientoPen1(SqlTimestampConverter converter) {
        this.converterFechaOtorgamientoPen1 = converter;
    }
  
    private TableColumn tableColumnComentariosOtorgamientoPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosOtorgamientoPen1() {
        return tableColumnComentariosOtorgamientoPen1;
    }

    public void setTableColumnComentariosOtorgamientoPen1(TableColumn component) {
        this.tableColumnComentariosOtorgamientoPen1 = component;
    }

    private Label labelComentariosOtorgamientoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosOtorgamientoPen1() {
        return labelComentariosOtorgamientoPen1;
    }

    public void setLabelComentariosOtorgamientoPen1(Label l) {
        this.labelComentariosOtorgamientoPen1 = l;
    }

    private TextArea campoComentariosOtorgamientoPen1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosOtorgamientoPen1() {
        return campoComentariosOtorgamientoPen1;
    }

    public void setCampoComentariosOtorgamientoPen1(TextArea component) {
        this.campoComentariosOtorgamientoPen1 = component;
    }

    private TextArea campoComentariosOtorgamientoPen1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosOtorgamientoPen1x1() {
        return campoComentariosOtorgamientoPen1x1;
    }

    public void setCampoComentariosOtorgamientoPen1x1(TextArea component) {
        this.campoComentariosOtorgamientoPen1x1 = component;
    }

    private StaticText campoComentariosOtorgamientoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosOtorgamientoPen1Texto1() {
        return campoComentariosOtorgamientoPen1Texto1;
    }

    public void setCampoComentariosOtorgamientoPen1Texto1(StaticText component) {
        this.campoComentariosOtorgamientoPen1Texto1 = component;
    }

    private StaticText campoComentariosOtorgamientoPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosOtorgamientoPen1x1Texto1() {
        return campoComentariosOtorgamientoPen1x1Texto1;
    }

    public void setCampoComentariosOtorgamientoPen1x1Texto1(StaticText component) {
        this.campoComentariosOtorgamientoPen1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosOtorgamientoPen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosOtorgamientoPen1() {
        return validatorComentariosOtorgamientoPen1;
    }
  
    public void setValidatorComentariosOtorgamientoPen1(LengthValidator validator) {
        this.validatorComentariosOtorgamientoPen1 = validator;
    }
  
    private TableColumn tableColumnFechaDenegacionPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaDenegacionPension1() {
        return tableColumnFechaDenegacionPension1;
    }

    public void setTableColumnFechaDenegacionPension1(TableColumn component) {
        this.tableColumnFechaDenegacionPension1 = component;
    }

    private Label labelFechaDenegacionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaDenegacionPension1() {
        return labelFechaDenegacionPension1;
    }

    public void setLabelFechaDenegacionPension1(Label l) {
        this.labelFechaDenegacionPension1 = l;
    }

    private TextField campoFechaDenegacionPension1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaDenegacionPension1() {
        return campoFechaDenegacionPension1;
    }

    public void setCampoFechaDenegacionPension1(TextField component) {
        this.campoFechaDenegacionPension1 = component;
    }

    private TextField campoFechaDenegacionPension1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaDenegacionPension1x1() {
        return campoFechaDenegacionPension1x1;
    }

    public void setCampoFechaDenegacionPension1x1(TextField component) {
        this.campoFechaDenegacionPension1x1 = component;
    }

    private StaticText campoFechaDenegacionPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaDenegacionPension1Texto1() {
        return campoFechaDenegacionPension1Texto1;
    }

    public void setCampoFechaDenegacionPension1Texto1(StaticText component) {
        this.campoFechaDenegacionPension1Texto1 = component;
    }

    private StaticText campoFechaDenegacionPension1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaDenegacionPension1x1Texto1() {
        return campoFechaDenegacionPension1x1Texto1;
    }

    public void setCampoFechaDenegacionPension1x1Texto1(StaticText component) {
        this.campoFechaDenegacionPension1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaDenegacionPension1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaDenegacionPension1() {
        return converterFechaDenegacionPension1;
    }
  
    public void setConverterFechaDenegacionPension1(SqlTimestampConverter converter) {
        this.converterFechaDenegacionPension1 = converter;
    }
  
    private TableColumn tableColumnNumeroCausaDenPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroCausaDenPension1() {
        return tableColumnNumeroCausaDenPension1;
    }

    public void setTableColumnNumeroCausaDenPension1(TableColumn component) {
        this.tableColumnNumeroCausaDenPension1 = component;
    }

    private Label labelNumeroCausaDenPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaDenPension1() {
        return labelNumeroCausaDenPension1;
    }

    public void setLabelNumeroCausaDenPension1(Label l) {
        this.labelNumeroCausaDenPension1 = l;
    }

    private DropDown listaNumeroCausaDenPension1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroCausaDenPension1() {
        return listaNumeroCausaDenPension1;
    }

    public void setListaNumeroCausaDenPension1(DropDown component) {
        this.listaNumeroCausaDenPension1 = component;
    }

    private DropDown listaNumeroCausaDenPension1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCausaDenPension1x1() {
        return listaNumeroCausaDenPension1x1;
    }

    public void setListaNumeroCausaDenPension1x1(DropDown component) {
        this.listaNumeroCausaDenPension1x1 = component;
    }

    private StaticText listaNumeroCausaDenPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaDenPension1Texto1() {
        return listaNumeroCausaDenPension1Texto1;
    }

    public void setListaNumeroCausaDenPension1Texto1(StaticText component) {
        this.listaNumeroCausaDenPension1Texto1 = component;
    }

    private StaticText listaNumeroCausaDenPension1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaDenPension1x1Texto1() {
        return listaNumeroCausaDenPension1x1Texto1;
    }

    public void setListaNumeroCausaDenPension1x1Texto1(StaticText component) {
        this.listaNumeroCausaDenPension1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroCausaDenPension1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCausaDenPension1() {
        return converterNumeroCausaDenPension1;
    }
  
    public void setConverterNumeroCausaDenPension1(IntegerConverter converter) {
        this.converterNumeroCausaDenPension1 = converter;
    }
  
    private TableColumn tableColumnOtraCausaDenPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnOtraCausaDenPension1() {
        return tableColumnOtraCausaDenPension1;
    }

    public void setTableColumnOtraCausaDenPension1(TableColumn component) {
        this.tableColumnOtraCausaDenPension1 = component;
    }

    private Label labelOtraCausaDenPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaDenPension1() {
        return labelOtraCausaDenPension1;
    }

    public void setLabelOtraCausaDenPension1(Label l) {
        this.labelOtraCausaDenPension1 = l;
    }

    private TextField campoOtraCausaDenPension1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOtraCausaDenPension1() {
        return campoOtraCausaDenPension1;
    }

    public void setCampoOtraCausaDenPension1(TextField component) {
        this.campoOtraCausaDenPension1 = component;
    }

    private TextField campoOtraCausaDenPension1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtraCausaDenPension1x1() {
        return campoOtraCausaDenPension1x1;
    }

    public void setCampoOtraCausaDenPension1x1(TextField component) {
        this.campoOtraCausaDenPension1x1 = component;
    }

    private StaticText campoOtraCausaDenPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaDenPension1Texto1() {
        return campoOtraCausaDenPension1Texto1;
    }

    public void setCampoOtraCausaDenPension1Texto1(StaticText component) {
        this.campoOtraCausaDenPension1Texto1 = component;
    }

    private StaticText campoOtraCausaDenPension1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaDenPension1x1Texto1() {
        return campoOtraCausaDenPension1x1Texto1;
    }

    public void setCampoOtraCausaDenPension1x1Texto1(StaticText component) {
        this.campoOtraCausaDenPension1x1Texto1 = component;
    }

    private LengthValidator validatorOtraCausaDenPension1 = new LengthValidator();
  
    public LengthValidator getValidatorOtraCausaDenPension1() {
        return validatorOtraCausaDenPension1;
    }
  
    public void setValidatorOtraCausaDenPension1(LengthValidator validator) {
        this.validatorOtraCausaDenPension1 = validator;
    }
  
    private TableColumn tableColumnComentariosDenegacionPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosDenegacionPension1() {
        return tableColumnComentariosDenegacionPension1;
    }

    public void setTableColumnComentariosDenegacionPension1(TableColumn component) {
        this.tableColumnComentariosDenegacionPension1 = component;
    }

    private Label labelComentariosDenegacionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosDenegacionPension1() {
        return labelComentariosDenegacionPension1;
    }

    public void setLabelComentariosDenegacionPension1(Label l) {
        this.labelComentariosDenegacionPension1 = l;
    }

    private TextArea campoComentariosDenegacionPension1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosDenegacionPension1() {
        return campoComentariosDenegacionPension1;
    }

    public void setCampoComentariosDenegacionPension1(TextArea component) {
        this.campoComentariosDenegacionPension1 = component;
    }

    private TextArea campoComentariosDenegacionPension1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosDenegacionPension1x1() {
        return campoComentariosDenegacionPension1x1;
    }

    public void setCampoComentariosDenegacionPension1x1(TextArea component) {
        this.campoComentariosDenegacionPension1x1 = component;
    }

    private StaticText campoComentariosDenegacionPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosDenegacionPension1Texto1() {
        return campoComentariosDenegacionPension1Texto1;
    }

    public void setCampoComentariosDenegacionPension1Texto1(StaticText component) {
        this.campoComentariosDenegacionPension1Texto1 = component;
    }

    private StaticText campoComentariosDenegacionPension1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosDenegacionPension1x1Texto1() {
        return campoComentariosDenegacionPension1x1Texto1;
    }

    public void setCampoComentariosDenegacionPension1x1Texto1(StaticText component) {
        this.campoComentariosDenegacionPension1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosDenegacionPension1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosDenegacionPension1() {
        return validatorComentariosDenegacionPension1;
    }
  
    public void setValidatorComentariosDenegacionPension1(LengthValidator validator) {
        this.validatorComentariosDenegacionPension1 = validator;
    }
  
    private TableColumn tableColumnFechaRevocacionPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaRevocacionPension1() {
        return tableColumnFechaRevocacionPension1;
    }

    public void setTableColumnFechaRevocacionPension1(TableColumn component) {
        this.tableColumnFechaRevocacionPension1 = component;
    }

    private Label labelFechaRevocacionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaRevocacionPension1() {
        return labelFechaRevocacionPension1;
    }

    public void setLabelFechaRevocacionPension1(Label l) {
        this.labelFechaRevocacionPension1 = l;
    }

    private TextField campoFechaRevocacionPension1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaRevocacionPension1() {
        return campoFechaRevocacionPension1;
    }

    public void setCampoFechaRevocacionPension1(TextField component) {
        this.campoFechaRevocacionPension1 = component;
    }

    private TextField campoFechaRevocacionPension1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaRevocacionPension1x1() {
        return campoFechaRevocacionPension1x1;
    }

    public void setCampoFechaRevocacionPension1x1(TextField component) {
        this.campoFechaRevocacionPension1x1 = component;
    }

    private StaticText campoFechaRevocacionPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaRevocacionPension1Texto1() {
        return campoFechaRevocacionPension1Texto1;
    }

    public void setCampoFechaRevocacionPension1Texto1(StaticText component) {
        this.campoFechaRevocacionPension1Texto1 = component;
    }

    private StaticText campoFechaRevocacionPension1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaRevocacionPension1x1Texto1() {
        return campoFechaRevocacionPension1x1Texto1;
    }

    public void setCampoFechaRevocacionPension1x1Texto1(StaticText component) {
        this.campoFechaRevocacionPension1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaRevocacionPension1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaRevocacionPension1() {
        return converterFechaRevocacionPension1;
    }
  
    public void setConverterFechaRevocacionPension1(SqlTimestampConverter converter) {
        this.converterFechaRevocacionPension1 = converter;
    }
  
    private TableColumn tableColumnNumeroCausaRevPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroCausaRevPension1() {
        return tableColumnNumeroCausaRevPension1;
    }

    public void setTableColumnNumeroCausaRevPension1(TableColumn component) {
        this.tableColumnNumeroCausaRevPension1 = component;
    }

    private Label labelNumeroCausaRevPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaRevPension1() {
        return labelNumeroCausaRevPension1;
    }

    public void setLabelNumeroCausaRevPension1(Label l) {
        this.labelNumeroCausaRevPension1 = l;
    }

    private DropDown listaNumeroCausaRevPension1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroCausaRevPension1() {
        return listaNumeroCausaRevPension1;
    }

    public void setListaNumeroCausaRevPension1(DropDown component) {
        this.listaNumeroCausaRevPension1 = component;
    }

    private DropDown listaNumeroCausaRevPension1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCausaRevPension1x1() {
        return listaNumeroCausaRevPension1x1;
    }

    public void setListaNumeroCausaRevPension1x1(DropDown component) {
        this.listaNumeroCausaRevPension1x1 = component;
    }

    private StaticText listaNumeroCausaRevPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaRevPension1Texto1() {
        return listaNumeroCausaRevPension1Texto1;
    }

    public void setListaNumeroCausaRevPension1Texto1(StaticText component) {
        this.listaNumeroCausaRevPension1Texto1 = component;
    }

    private StaticText listaNumeroCausaRevPension1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaRevPension1x1Texto1() {
        return listaNumeroCausaRevPension1x1Texto1;
    }

    public void setListaNumeroCausaRevPension1x1Texto1(StaticText component) {
        this.listaNumeroCausaRevPension1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroCausaRevPension1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCausaRevPension1() {
        return converterNumeroCausaRevPension1;
    }
  
    public void setConverterNumeroCausaRevPension1(IntegerConverter converter) {
        this.converterNumeroCausaRevPension1 = converter;
    }
  
    private TableColumn tableColumnOtraCausaRevPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnOtraCausaRevPension1() {
        return tableColumnOtraCausaRevPension1;
    }

    public void setTableColumnOtraCausaRevPension1(TableColumn component) {
        this.tableColumnOtraCausaRevPension1 = component;
    }

    private Label labelOtraCausaRevPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaRevPension1() {
        return labelOtraCausaRevPension1;
    }

    public void setLabelOtraCausaRevPension1(Label l) {
        this.labelOtraCausaRevPension1 = l;
    }

    private TextField campoOtraCausaRevPension1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOtraCausaRevPension1() {
        return campoOtraCausaRevPension1;
    }

    public void setCampoOtraCausaRevPension1(TextField component) {
        this.campoOtraCausaRevPension1 = component;
    }

    private TextField campoOtraCausaRevPension1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtraCausaRevPension1x1() {
        return campoOtraCausaRevPension1x1;
    }

    public void setCampoOtraCausaRevPension1x1(TextField component) {
        this.campoOtraCausaRevPension1x1 = component;
    }

    private StaticText campoOtraCausaRevPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaRevPension1Texto1() {
        return campoOtraCausaRevPension1Texto1;
    }

    public void setCampoOtraCausaRevPension1Texto1(StaticText component) {
        this.campoOtraCausaRevPension1Texto1 = component;
    }

    private StaticText campoOtraCausaRevPension1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaRevPension1x1Texto1() {
        return campoOtraCausaRevPension1x1Texto1;
    }

    public void setCampoOtraCausaRevPension1x1Texto1(StaticText component) {
        this.campoOtraCausaRevPension1x1Texto1 = component;
    }

    private LengthValidator validatorOtraCausaRevPension1 = new LengthValidator();
  
    public LengthValidator getValidatorOtraCausaRevPension1() {
        return validatorOtraCausaRevPension1;
    }
  
    public void setValidatorOtraCausaRevPension1(LengthValidator validator) {
        this.validatorOtraCausaRevPension1 = validator;
    }
  
    private TableColumn tableColumnComentariosRevocacionPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosRevocacionPension1() {
        return tableColumnComentariosRevocacionPension1;
    }

    public void setTableColumnComentariosRevocacionPension1(TableColumn component) {
        this.tableColumnComentariosRevocacionPension1 = component;
    }

    private Label labelComentariosRevocacionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosRevocacionPension1() {
        return labelComentariosRevocacionPension1;
    }

    public void setLabelComentariosRevocacionPension1(Label l) {
        this.labelComentariosRevocacionPension1 = l;
    }

    private TextArea campoComentariosRevocacionPension1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosRevocacionPension1() {
        return campoComentariosRevocacionPension1;
    }

    public void setCampoComentariosRevocacionPension1(TextArea component) {
        this.campoComentariosRevocacionPension1 = component;
    }

    private TextArea campoComentariosRevocacionPension1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosRevocacionPension1x1() {
        return campoComentariosRevocacionPension1x1;
    }

    public void setCampoComentariosRevocacionPension1x1(TextArea component) {
        this.campoComentariosRevocacionPension1x1 = component;
    }

    private StaticText campoComentariosRevocacionPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosRevocacionPension1Texto1() {
        return campoComentariosRevocacionPension1Texto1;
    }

    public void setCampoComentariosRevocacionPension1Texto1(StaticText component) {
        this.campoComentariosRevocacionPension1Texto1 = component;
    }

    private StaticText campoComentariosRevocacionPension1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosRevocacionPension1x1Texto1() {
        return campoComentariosRevocacionPension1x1Texto1;
    }

    public void setCampoComentariosRevocacionPension1x1Texto1(StaticText component) {
        this.campoComentariosRevocacionPension1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosRevocacionPension1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosRevocacionPension1() {
        return validatorComentariosRevocacionPension1;
    }
  
    public void setValidatorComentariosRevocacionPension1(LengthValidator validator) {
        this.validatorComentariosRevocacionPension1 = validator;
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

    private DropDown listaNumeroCondicionRecoPen1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCondicionRecoPen1x1() {
        return listaNumeroCondicionRecoPen1x1;
    }

    public void setListaNumeroCondicionRecoPen1x1(DropDown component) {
        this.listaNumeroCondicionRecoPen1x1 = component;
    }

    private StaticText listaNumeroCondicionRecoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCondicionRecoPen1Texto1() {
        return listaNumeroCondicionRecoPen1Texto1;
    }

    public void setListaNumeroCondicionRecoPen1Texto1(StaticText component) {
        this.listaNumeroCondicionRecoPen1Texto1 = component;
    }

    private StaticText listaNumeroCondicionRecoPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCondicionRecoPen1x1Texto1() {
        return listaNumeroCondicionRecoPen1x1Texto1;
    }

    public void setListaNumeroCondicionRecoPen1x1Texto1(StaticText component) {
        this.listaNumeroCondicionRecoPen1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroCondicionRecoPen1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCondicionRecoPen1() {
        return converterNumeroCondicionRecoPen1;
    }
  
    public void setConverterNumeroCondicionRecoPen1(IntegerConverter converter) {
        this.converterNumeroCondicionRecoPen1 = converter;
    }
  
    private TableColumn tableColumnFechaSolicitudRecoPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaSolicitudRecoPen1() {
        return tableColumnFechaSolicitudRecoPen1;
    }

    public void setTableColumnFechaSolicitudRecoPen1(TableColumn component) {
        this.tableColumnFechaSolicitudRecoPen1 = component;
    }

    private Label labelFechaSolicitudRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaSolicitudRecoPen1() {
        return labelFechaSolicitudRecoPen1;
    }

    public void setLabelFechaSolicitudRecoPen1(Label l) {
        this.labelFechaSolicitudRecoPen1 = l;
    }

    private TextField campoFechaSolicitudRecoPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaSolicitudRecoPen1() {
        return campoFechaSolicitudRecoPen1;
    }

    public void setCampoFechaSolicitudRecoPen1(TextField component) {
        this.campoFechaSolicitudRecoPen1 = component;
    }

    private TextField campoFechaSolicitudRecoPen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaSolicitudRecoPen1x1() {
        return campoFechaSolicitudRecoPen1x1;
    }

    public void setCampoFechaSolicitudRecoPen1x1(TextField component) {
        this.campoFechaSolicitudRecoPen1x1 = component;
    }

    private StaticText campoFechaSolicitudRecoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaSolicitudRecoPen1Texto1() {
        return campoFechaSolicitudRecoPen1Texto1;
    }

    public void setCampoFechaSolicitudRecoPen1Texto1(StaticText component) {
        this.campoFechaSolicitudRecoPen1Texto1 = component;
    }

    private StaticText campoFechaSolicitudRecoPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaSolicitudRecoPen1x1Texto1() {
        return campoFechaSolicitudRecoPen1x1Texto1;
    }

    public void setCampoFechaSolicitudRecoPen1x1Texto1(StaticText component) {
        this.campoFechaSolicitudRecoPen1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaSolicitudRecoPen1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaSolicitudRecoPen1() {
        return converterFechaSolicitudRecoPen1;
    }
  
    public void setConverterFechaSolicitudRecoPen1(SqlTimestampConverter converter) {
        this.converterFechaSolicitudRecoPen1 = converter;
    }
  
    private TableColumn tableColumnComentariosSolicitudRecoPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosSolicitudRecoPen1() {
        return tableColumnComentariosSolicitudRecoPen1;
    }

    public void setTableColumnComentariosSolicitudRecoPen1(TableColumn component) {
        this.tableColumnComentariosSolicitudRecoPen1 = component;
    }

    private Label labelComentariosSolicitudRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosSolicitudRecoPen1() {
        return labelComentariosSolicitudRecoPen1;
    }

    public void setLabelComentariosSolicitudRecoPen1(Label l) {
        this.labelComentariosSolicitudRecoPen1 = l;
    }

    private TextArea campoComentariosSolicitudRecoPen1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosSolicitudRecoPen1() {
        return campoComentariosSolicitudRecoPen1;
    }

    public void setCampoComentariosSolicitudRecoPen1(TextArea component) {
        this.campoComentariosSolicitudRecoPen1 = component;
    }

    private TextArea campoComentariosSolicitudRecoPen1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosSolicitudRecoPen1x1() {
        return campoComentariosSolicitudRecoPen1x1;
    }

    public void setCampoComentariosSolicitudRecoPen1x1(TextArea component) {
        this.campoComentariosSolicitudRecoPen1x1 = component;
    }

    private StaticText campoComentariosSolicitudRecoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosSolicitudRecoPen1Texto1() {
        return campoComentariosSolicitudRecoPen1Texto1;
    }

    public void setCampoComentariosSolicitudRecoPen1Texto1(StaticText component) {
        this.campoComentariosSolicitudRecoPen1Texto1 = component;
    }

    private StaticText campoComentariosSolicitudRecoPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosSolicitudRecoPen1x1Texto1() {
        return campoComentariosSolicitudRecoPen1x1Texto1;
    }

    public void setCampoComentariosSolicitudRecoPen1x1Texto1(StaticText component) {
        this.campoComentariosSolicitudRecoPen1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosSolicitudRecoPen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosSolicitudRecoPen1() {
        return validatorComentariosSolicitudRecoPen1;
    }
  
    public void setValidatorComentariosSolicitudRecoPen1(LengthValidator validator) {
        this.validatorComentariosSolicitudRecoPen1 = validator;
    }
  
    private TableColumn tableColumnFechaAprobacionRecoPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaAprobacionRecoPen1() {
        return tableColumnFechaAprobacionRecoPen1;
    }

    public void setTableColumnFechaAprobacionRecoPen1(TableColumn component) {
        this.tableColumnFechaAprobacionRecoPen1 = component;
    }

    private Label labelFechaAprobacionRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaAprobacionRecoPen1() {
        return labelFechaAprobacionRecoPen1;
    }

    public void setLabelFechaAprobacionRecoPen1(Label l) {
        this.labelFechaAprobacionRecoPen1 = l;
    }

    private TextField campoFechaAprobacionRecoPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaAprobacionRecoPen1() {
        return campoFechaAprobacionRecoPen1;
    }

    public void setCampoFechaAprobacionRecoPen1(TextField component) {
        this.campoFechaAprobacionRecoPen1 = component;
    }

    private TextField campoFechaAprobacionRecoPen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaAprobacionRecoPen1x1() {
        return campoFechaAprobacionRecoPen1x1;
    }

    public void setCampoFechaAprobacionRecoPen1x1(TextField component) {
        this.campoFechaAprobacionRecoPen1x1 = component;
    }

    private StaticText campoFechaAprobacionRecoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaAprobacionRecoPen1Texto1() {
        return campoFechaAprobacionRecoPen1Texto1;
    }

    public void setCampoFechaAprobacionRecoPen1Texto1(StaticText component) {
        this.campoFechaAprobacionRecoPen1Texto1 = component;
    }

    private StaticText campoFechaAprobacionRecoPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaAprobacionRecoPen1x1Texto1() {
        return campoFechaAprobacionRecoPen1x1Texto1;
    }

    public void setCampoFechaAprobacionRecoPen1x1Texto1(StaticText component) {
        this.campoFechaAprobacionRecoPen1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaAprobacionRecoPen1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaAprobacionRecoPen1() {
        return converterFechaAprobacionRecoPen1;
    }
  
    public void setConverterFechaAprobacionRecoPen1(SqlTimestampConverter converter) {
        this.converterFechaAprobacionRecoPen1 = converter;
    }
  
    private TableColumn tableColumnComentariosAprRecoPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosAprRecoPen1() {
        return tableColumnComentariosAprRecoPen1;
    }

    public void setTableColumnComentariosAprRecoPen1(TableColumn component) {
        this.tableColumnComentariosAprRecoPen1 = component;
    }

    private Label labelComentariosAprRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAprRecoPen1() {
        return labelComentariosAprRecoPen1;
    }

    public void setLabelComentariosAprRecoPen1(Label l) {
        this.labelComentariosAprRecoPen1 = l;
    }

    private TextArea campoComentariosAprRecoPen1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosAprRecoPen1() {
        return campoComentariosAprRecoPen1;
    }

    public void setCampoComentariosAprRecoPen1(TextArea component) {
        this.campoComentariosAprRecoPen1 = component;
    }

    private TextArea campoComentariosAprRecoPen1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosAprRecoPen1x1() {
        return campoComentariosAprRecoPen1x1;
    }

    public void setCampoComentariosAprRecoPen1x1(TextArea component) {
        this.campoComentariosAprRecoPen1x1 = component;
    }

    private StaticText campoComentariosAprRecoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosAprRecoPen1Texto1() {
        return campoComentariosAprRecoPen1Texto1;
    }

    public void setCampoComentariosAprRecoPen1Texto1(StaticText component) {
        this.campoComentariosAprRecoPen1Texto1 = component;
    }

    private StaticText campoComentariosAprRecoPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosAprRecoPen1x1Texto1() {
        return campoComentariosAprRecoPen1x1Texto1;
    }

    public void setCampoComentariosAprRecoPen1x1Texto1(StaticText component) {
        this.campoComentariosAprRecoPen1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosAprRecoPen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosAprRecoPen1() {
        return validatorComentariosAprRecoPen1;
    }
  
    public void setValidatorComentariosAprRecoPen1(LengthValidator validator) {
        this.validatorComentariosAprRecoPen1 = validator;
    }
  
    private TableColumn tableColumnFechaDenegacionRecoPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaDenegacionRecoPen1() {
        return tableColumnFechaDenegacionRecoPen1;
    }

    public void setTableColumnFechaDenegacionRecoPen1(TableColumn component) {
        this.tableColumnFechaDenegacionRecoPen1 = component;
    }

    private Label labelFechaDenegacionRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaDenegacionRecoPen1() {
        return labelFechaDenegacionRecoPen1;
    }

    public void setLabelFechaDenegacionRecoPen1(Label l) {
        this.labelFechaDenegacionRecoPen1 = l;
    }

    private TextField campoFechaDenegacionRecoPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaDenegacionRecoPen1() {
        return campoFechaDenegacionRecoPen1;
    }

    public void setCampoFechaDenegacionRecoPen1(TextField component) {
        this.campoFechaDenegacionRecoPen1 = component;
    }

    private TextField campoFechaDenegacionRecoPen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaDenegacionRecoPen1x1() {
        return campoFechaDenegacionRecoPen1x1;
    }

    public void setCampoFechaDenegacionRecoPen1x1(TextField component) {
        this.campoFechaDenegacionRecoPen1x1 = component;
    }

    private StaticText campoFechaDenegacionRecoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaDenegacionRecoPen1Texto1() {
        return campoFechaDenegacionRecoPen1Texto1;
    }

    public void setCampoFechaDenegacionRecoPen1Texto1(StaticText component) {
        this.campoFechaDenegacionRecoPen1Texto1 = component;
    }

    private StaticText campoFechaDenegacionRecoPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaDenegacionRecoPen1x1Texto1() {
        return campoFechaDenegacionRecoPen1x1Texto1;
    }

    public void setCampoFechaDenegacionRecoPen1x1Texto1(StaticText component) {
        this.campoFechaDenegacionRecoPen1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaDenegacionRecoPen1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaDenegacionRecoPen1() {
        return converterFechaDenegacionRecoPen1;
    }
  
    public void setConverterFechaDenegacionRecoPen1(SqlTimestampConverter converter) {
        this.converterFechaDenegacionRecoPen1 = converter;
    }
  
    private TableColumn tableColumnNumeroCausaDenRecoPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroCausaDenRecoPen1() {
        return tableColumnNumeroCausaDenRecoPen1;
    }

    public void setTableColumnNumeroCausaDenRecoPen1(TableColumn component) {
        this.tableColumnNumeroCausaDenRecoPen1 = component;
    }

    private Label labelNumeroCausaDenRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaDenRecoPen1() {
        return labelNumeroCausaDenRecoPen1;
    }

    public void setLabelNumeroCausaDenRecoPen1(Label l) {
        this.labelNumeroCausaDenRecoPen1 = l;
    }

    private DropDown listaNumeroCausaDenRecoPen1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroCausaDenRecoPen1() {
        return listaNumeroCausaDenRecoPen1;
    }

    public void setListaNumeroCausaDenRecoPen1(DropDown component) {
        this.listaNumeroCausaDenRecoPen1 = component;
    }

    private DropDown listaNumeroCausaDenRecoPen1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCausaDenRecoPen1x1() {
        return listaNumeroCausaDenRecoPen1x1;
    }

    public void setListaNumeroCausaDenRecoPen1x1(DropDown component) {
        this.listaNumeroCausaDenRecoPen1x1 = component;
    }

    private StaticText listaNumeroCausaDenRecoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaDenRecoPen1Texto1() {
        return listaNumeroCausaDenRecoPen1Texto1;
    }

    public void setListaNumeroCausaDenRecoPen1Texto1(StaticText component) {
        this.listaNumeroCausaDenRecoPen1Texto1 = component;
    }

    private StaticText listaNumeroCausaDenRecoPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaDenRecoPen1x1Texto1() {
        return listaNumeroCausaDenRecoPen1x1Texto1;
    }

    public void setListaNumeroCausaDenRecoPen1x1Texto1(StaticText component) {
        this.listaNumeroCausaDenRecoPen1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroCausaDenRecoPen1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCausaDenRecoPen1() {
        return converterNumeroCausaDenRecoPen1;
    }
  
    public void setConverterNumeroCausaDenRecoPen1(IntegerConverter converter) {
        this.converterNumeroCausaDenRecoPen1 = converter;
    }
  
    private TableColumn tableColumnOtraCausaDenRecoPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnOtraCausaDenRecoPen1() {
        return tableColumnOtraCausaDenRecoPen1;
    }

    public void setTableColumnOtraCausaDenRecoPen1(TableColumn component) {
        this.tableColumnOtraCausaDenRecoPen1 = component;
    }

    private Label labelOtraCausaDenRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaDenRecoPen1() {
        return labelOtraCausaDenRecoPen1;
    }

    public void setLabelOtraCausaDenRecoPen1(Label l) {
        this.labelOtraCausaDenRecoPen1 = l;
    }

    private TextField campoOtraCausaDenRecoPen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOtraCausaDenRecoPen1() {
        return campoOtraCausaDenRecoPen1;
    }

    public void setCampoOtraCausaDenRecoPen1(TextField component) {
        this.campoOtraCausaDenRecoPen1 = component;
    }

    private TextField campoOtraCausaDenRecoPen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtraCausaDenRecoPen1x1() {
        return campoOtraCausaDenRecoPen1x1;
    }

    public void setCampoOtraCausaDenRecoPen1x1(TextField component) {
        this.campoOtraCausaDenRecoPen1x1 = component;
    }

    private StaticText campoOtraCausaDenRecoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaDenRecoPen1Texto1() {
        return campoOtraCausaDenRecoPen1Texto1;
    }

    public void setCampoOtraCausaDenRecoPen1Texto1(StaticText component) {
        this.campoOtraCausaDenRecoPen1Texto1 = component;
    }

    private StaticText campoOtraCausaDenRecoPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaDenRecoPen1x1Texto1() {
        return campoOtraCausaDenRecoPen1x1Texto1;
    }

    public void setCampoOtraCausaDenRecoPen1x1Texto1(StaticText component) {
        this.campoOtraCausaDenRecoPen1x1Texto1 = component;
    }

    private LengthValidator validatorOtraCausaDenRecoPen1 = new LengthValidator();
  
    public LengthValidator getValidatorOtraCausaDenRecoPen1() {
        return validatorOtraCausaDenRecoPen1;
    }
  
    public void setValidatorOtraCausaDenRecoPen1(LengthValidator validator) {
        this.validatorOtraCausaDenRecoPen1 = validator;
    }
  
    private TableColumn tableColumnComentariosDenRecoPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosDenRecoPen1() {
        return tableColumnComentariosDenRecoPen1;
    }

    public void setTableColumnComentariosDenRecoPen1(TableColumn component) {
        this.tableColumnComentariosDenRecoPen1 = component;
    }

    private Label labelComentariosDenRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosDenRecoPen1() {
        return labelComentariosDenRecoPen1;
    }

    public void setLabelComentariosDenRecoPen1(Label l) {
        this.labelComentariosDenRecoPen1 = l;
    }

    private TextArea campoComentariosDenRecoPen1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosDenRecoPen1() {
        return campoComentariosDenRecoPen1;
    }

    public void setCampoComentariosDenRecoPen1(TextArea component) {
        this.campoComentariosDenRecoPen1 = component;
    }

    private TextArea campoComentariosDenRecoPen1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosDenRecoPen1x1() {
        return campoComentariosDenRecoPen1x1;
    }

    public void setCampoComentariosDenRecoPen1x1(TextArea component) {
        this.campoComentariosDenRecoPen1x1 = component;
    }

    private StaticText campoComentariosDenRecoPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosDenRecoPen1Texto1() {
        return campoComentariosDenRecoPen1Texto1;
    }

    public void setCampoComentariosDenRecoPen1Texto1(StaticText component) {
        this.campoComentariosDenRecoPen1Texto1 = component;
    }

    private StaticText campoComentariosDenRecoPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosDenRecoPen1x1Texto1() {
        return campoComentariosDenRecoPen1x1Texto1;
    }

    public void setCampoComentariosDenRecoPen1x1Texto1(StaticText component) {
        this.campoComentariosDenRecoPen1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosDenRecoPen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosDenRecoPen1() {
        return validatorComentariosDenRecoPen1;
    }
  
    public void setValidatorComentariosDenRecoPen1(LengthValidator validator) {
        this.validatorComentariosDenRecoPen1 = validator;
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

    private DropDown listaNumeroCondicionDenuPen1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCondicionDenuPen1x1() {
        return listaNumeroCondicionDenuPen1x1;
    }

    public void setListaNumeroCondicionDenuPen1x1(DropDown component) {
        this.listaNumeroCondicionDenuPen1x1 = component;
    }

    private StaticText listaNumeroCondicionDenuPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCondicionDenuPen1Texto1() {
        return listaNumeroCondicionDenuPen1Texto1;
    }

    public void setListaNumeroCondicionDenuPen1Texto1(StaticText component) {
        this.listaNumeroCondicionDenuPen1Texto1 = component;
    }

    private StaticText listaNumeroCondicionDenuPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCondicionDenuPen1x1Texto1() {
        return listaNumeroCondicionDenuPen1x1Texto1;
    }

    public void setListaNumeroCondicionDenuPen1x1Texto1(StaticText component) {
        this.listaNumeroCondicionDenuPen1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroCondicionDenuPen1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCondicionDenuPen1() {
        return converterNumeroCondicionDenuPen1;
    }
  
    public void setConverterNumeroCondicionDenuPen1(IntegerConverter converter) {
        this.converterNumeroCondicionDenuPen1 = converter;
    }
  
    private TableColumn tableColumnFechaRegistroDenunciaPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaRegistroDenunciaPen1() {
        return tableColumnFechaRegistroDenunciaPen1;
    }

    public void setTableColumnFechaRegistroDenunciaPen1(TableColumn component) {
        this.tableColumnFechaRegistroDenunciaPen1 = component;
    }

    private Label labelFechaRegistroDenunciaPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaRegistroDenunciaPen1() {
        return labelFechaRegistroDenunciaPen1;
    }

    public void setLabelFechaRegistroDenunciaPen1(Label l) {
        this.labelFechaRegistroDenunciaPen1 = l;
    }

    private TextField campoFechaRegistroDenunciaPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaRegistroDenunciaPen1() {
        return campoFechaRegistroDenunciaPen1;
    }

    public void setCampoFechaRegistroDenunciaPen1(TextField component) {
        this.campoFechaRegistroDenunciaPen1 = component;
    }

    private TextField campoFechaRegistroDenunciaPen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaRegistroDenunciaPen1x1() {
        return campoFechaRegistroDenunciaPen1x1;
    }

    public void setCampoFechaRegistroDenunciaPen1x1(TextField component) {
        this.campoFechaRegistroDenunciaPen1x1 = component;
    }

    private StaticText campoFechaRegistroDenunciaPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaRegistroDenunciaPen1Texto1() {
        return campoFechaRegistroDenunciaPen1Texto1;
    }

    public void setCampoFechaRegistroDenunciaPen1Texto1(StaticText component) {
        this.campoFechaRegistroDenunciaPen1Texto1 = component;
    }

    private StaticText campoFechaRegistroDenunciaPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaRegistroDenunciaPen1x1Texto1() {
        return campoFechaRegistroDenunciaPen1x1Texto1;
    }

    public void setCampoFechaRegistroDenunciaPen1x1Texto1(StaticText component) {
        this.campoFechaRegistroDenunciaPen1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaRegistroDenunciaPen1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaRegistroDenunciaPen1() {
        return converterFechaRegistroDenunciaPen1;
    }
  
    public void setConverterFechaRegistroDenunciaPen1(SqlTimestampConverter converter) {
        this.converterFechaRegistroDenunciaPen1 = converter;
    }
  
    private TableColumn tableColumnComentariosRegistroDenuPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosRegistroDenuPen1() {
        return tableColumnComentariosRegistroDenuPen1;
    }

    public void setTableColumnComentariosRegistroDenuPen1(TableColumn component) {
        this.tableColumnComentariosRegistroDenuPen1 = component;
    }

    private Label labelComentariosRegistroDenuPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosRegistroDenuPen1() {
        return labelComentariosRegistroDenuPen1;
    }

    public void setLabelComentariosRegistroDenuPen1(Label l) {
        this.labelComentariosRegistroDenuPen1 = l;
    }

    private TextArea campoComentariosRegistroDenuPen1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosRegistroDenuPen1() {
        return campoComentariosRegistroDenuPen1;
    }

    public void setCampoComentariosRegistroDenuPen1(TextArea component) {
        this.campoComentariosRegistroDenuPen1 = component;
    }

    private TextArea campoComentariosRegistroDenuPen1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosRegistroDenuPen1x1() {
        return campoComentariosRegistroDenuPen1x1;
    }

    public void setCampoComentariosRegistroDenuPen1x1(TextArea component) {
        this.campoComentariosRegistroDenuPen1x1 = component;
    }

    private StaticText campoComentariosRegistroDenuPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosRegistroDenuPen1Texto1() {
        return campoComentariosRegistroDenuPen1Texto1;
    }

    public void setCampoComentariosRegistroDenuPen1Texto1(StaticText component) {
        this.campoComentariosRegistroDenuPen1Texto1 = component;
    }

    private StaticText campoComentariosRegistroDenuPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosRegistroDenuPen1x1Texto1() {
        return campoComentariosRegistroDenuPen1x1Texto1;
    }

    public void setCampoComentariosRegistroDenuPen1x1Texto1(StaticText component) {
        this.campoComentariosRegistroDenuPen1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosRegistroDenuPen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosRegistroDenuPen1() {
        return validatorComentariosRegistroDenuPen1;
    }
  
    public void setValidatorComentariosRegistroDenuPen1(LengthValidator validator) {
        this.validatorComentariosRegistroDenuPen1 = validator;
    }
  
    private TableColumn tableColumnFechaConfirmacionDenuPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaConfirmacionDenuPen1() {
        return tableColumnFechaConfirmacionDenuPen1;
    }

    public void setTableColumnFechaConfirmacionDenuPen1(TableColumn component) {
        this.tableColumnFechaConfirmacionDenuPen1 = component;
    }

    private Label labelFechaConfirmacionDenuPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaConfirmacionDenuPen1() {
        return labelFechaConfirmacionDenuPen1;
    }

    public void setLabelFechaConfirmacionDenuPen1(Label l) {
        this.labelFechaConfirmacionDenuPen1 = l;
    }

    private TextField campoFechaConfirmacionDenuPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaConfirmacionDenuPen1() {
        return campoFechaConfirmacionDenuPen1;
    }

    public void setCampoFechaConfirmacionDenuPen1(TextField component) {
        this.campoFechaConfirmacionDenuPen1 = component;
    }

    private TextField campoFechaConfirmacionDenuPen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaConfirmacionDenuPen1x1() {
        return campoFechaConfirmacionDenuPen1x1;
    }

    public void setCampoFechaConfirmacionDenuPen1x1(TextField component) {
        this.campoFechaConfirmacionDenuPen1x1 = component;
    }

    private StaticText campoFechaConfirmacionDenuPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaConfirmacionDenuPen1Texto1() {
        return campoFechaConfirmacionDenuPen1Texto1;
    }

    public void setCampoFechaConfirmacionDenuPen1Texto1(StaticText component) {
        this.campoFechaConfirmacionDenuPen1Texto1 = component;
    }

    private StaticText campoFechaConfirmacionDenuPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaConfirmacionDenuPen1x1Texto1() {
        return campoFechaConfirmacionDenuPen1x1Texto1;
    }

    public void setCampoFechaConfirmacionDenuPen1x1Texto1(StaticText component) {
        this.campoFechaConfirmacionDenuPen1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaConfirmacionDenuPen1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaConfirmacionDenuPen1() {
        return converterFechaConfirmacionDenuPen1;
    }
  
    public void setConverterFechaConfirmacionDenuPen1(SqlTimestampConverter converter) {
        this.converterFechaConfirmacionDenuPen1 = converter;
    }
  
    private TableColumn tableColumnComentariosConfDenuPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosConfDenuPen1() {
        return tableColumnComentariosConfDenuPen1;
    }

    public void setTableColumnComentariosConfDenuPen1(TableColumn component) {
        this.tableColumnComentariosConfDenuPen1 = component;
    }

    private Label labelComentariosConfDenuPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosConfDenuPen1() {
        return labelComentariosConfDenuPen1;
    }

    public void setLabelComentariosConfDenuPen1(Label l) {
        this.labelComentariosConfDenuPen1 = l;
    }

    private TextArea campoComentariosConfDenuPen1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosConfDenuPen1() {
        return campoComentariosConfDenuPen1;
    }

    public void setCampoComentariosConfDenuPen1(TextArea component) {
        this.campoComentariosConfDenuPen1 = component;
    }

    private TextArea campoComentariosConfDenuPen1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosConfDenuPen1x1() {
        return campoComentariosConfDenuPen1x1;
    }

    public void setCampoComentariosConfDenuPen1x1(TextArea component) {
        this.campoComentariosConfDenuPen1x1 = component;
    }

    private StaticText campoComentariosConfDenuPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosConfDenuPen1Texto1() {
        return campoComentariosConfDenuPen1Texto1;
    }

    public void setCampoComentariosConfDenuPen1Texto1(StaticText component) {
        this.campoComentariosConfDenuPen1Texto1 = component;
    }

    private StaticText campoComentariosConfDenuPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosConfDenuPen1x1Texto1() {
        return campoComentariosConfDenuPen1x1Texto1;
    }

    public void setCampoComentariosConfDenuPen1x1Texto1(StaticText component) {
        this.campoComentariosConfDenuPen1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosConfDenuPen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosConfDenuPen1() {
        return validatorComentariosConfDenuPen1;
    }
  
    public void setValidatorComentariosConfDenuPen1(LengthValidator validator) {
        this.validatorComentariosConfDenuPen1 = validator;
    }
  
    private TableColumn tableColumnFechaDesmentidoDenunciaPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaDesmentidoDenunciaPen1() {
        return tableColumnFechaDesmentidoDenunciaPen1;
    }

    public void setTableColumnFechaDesmentidoDenunciaPen1(TableColumn component) {
        this.tableColumnFechaDesmentidoDenunciaPen1 = component;
    }

    private Label labelFechaDesmentidoDenunciaPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaDesmentidoDenunciaPen1() {
        return labelFechaDesmentidoDenunciaPen1;
    }

    public void setLabelFechaDesmentidoDenunciaPen1(Label l) {
        this.labelFechaDesmentidoDenunciaPen1 = l;
    }

    private TextField campoFechaDesmentidoDenunciaPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaDesmentidoDenunciaPen1() {
        return campoFechaDesmentidoDenunciaPen1;
    }

    public void setCampoFechaDesmentidoDenunciaPen1(TextField component) {
        this.campoFechaDesmentidoDenunciaPen1 = component;
    }

    private TextField campoFechaDesmentidoDenunciaPen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaDesmentidoDenunciaPen1x1() {
        return campoFechaDesmentidoDenunciaPen1x1;
    }

    public void setCampoFechaDesmentidoDenunciaPen1x1(TextField component) {
        this.campoFechaDesmentidoDenunciaPen1x1 = component;
    }

    private StaticText campoFechaDesmentidoDenunciaPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaDesmentidoDenunciaPen1Texto1() {
        return campoFechaDesmentidoDenunciaPen1Texto1;
    }

    public void setCampoFechaDesmentidoDenunciaPen1Texto1(StaticText component) {
        this.campoFechaDesmentidoDenunciaPen1Texto1 = component;
    }

    private StaticText campoFechaDesmentidoDenunciaPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaDesmentidoDenunciaPen1x1Texto1() {
        return campoFechaDesmentidoDenunciaPen1x1Texto1;
    }

    public void setCampoFechaDesmentidoDenunciaPen1x1Texto1(StaticText component) {
        this.campoFechaDesmentidoDenunciaPen1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaDesmentidoDenunciaPen1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaDesmentidoDenunciaPen1() {
        return converterFechaDesmentidoDenunciaPen1;
    }
  
    public void setConverterFechaDesmentidoDenunciaPen1(SqlTimestampConverter converter) {
        this.converterFechaDesmentidoDenunciaPen1 = converter;
    }
  
    private TableColumn tableColumnComentariosDesDenuPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnComentariosDesDenuPen1() {
        return tableColumnComentariosDesDenuPen1;
    }

    public void setTableColumnComentariosDesDenuPen1(TableColumn component) {
        this.tableColumnComentariosDesDenuPen1 = component;
    }

    private Label labelComentariosDesDenuPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosDesDenuPen1() {
        return labelComentariosDesDenuPen1;
    }

    public void setLabelComentariosDesDenuPen1(Label l) {
        this.labelComentariosDesDenuPen1 = l;
    }

    private TextArea campoComentariosDesDenuPen1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoComentariosDesDenuPen1() {
        return campoComentariosDesDenuPen1;
    }

    public void setCampoComentariosDesDenuPen1(TextArea component) {
        this.campoComentariosDesDenuPen1 = component;
    }

    private TextArea campoComentariosDesDenuPen1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoComentariosDesDenuPen1x1() {
        return campoComentariosDesDenuPen1x1;
    }

    public void setCampoComentariosDesDenuPen1x1(TextArea component) {
        this.campoComentariosDesDenuPen1x1 = component;
    }

    private StaticText campoComentariosDesDenuPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosDesDenuPen1Texto1() {
        return campoComentariosDesDenuPen1Texto1;
    }

    public void setCampoComentariosDesDenuPen1Texto1(StaticText component) {
        this.campoComentariosDesDenuPen1Texto1 = component;
    }

    private StaticText campoComentariosDesDenuPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoComentariosDesDenuPen1x1Texto1() {
        return campoComentariosDesDenuPen1x1Texto1;
    }

    public void setCampoComentariosDesDenuPen1x1Texto1(StaticText component) {
        this.campoComentariosDesDenuPen1x1Texto1 = component;
    }

    private LengthValidator validatorComentariosDesDenuPen1 = new LengthValidator();
  
    public LengthValidator getValidatorComentariosDesDenuPen1() {
        return validatorComentariosDesDenuPen1;
    }
  
    public void setValidatorComentariosDesDenuPen1(LengthValidator validator) {
        this.validatorComentariosDesDenuPen1 = validator;
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

    private TableColumn tableColumnFechaFichaPersona1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaFichaPersona1() {
        return tableColumnFechaFichaPersona1;
    }

    public void setTableColumnFechaFichaPersona1(TableColumn component) {
        this.tableColumnFechaFichaPersona1 = component;
    }

    private Label labelFechaFichaPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaFichaPersona1() {
        return labelFechaFichaPersona1;
    }

    public void setLabelFechaFichaPersona1(Label l) {
        this.labelFechaFichaPersona1 = l;
    }

    private TextField campoFechaFichaPersona1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaFichaPersona1() {
        return campoFechaFichaPersona1;
    }

    public void setCampoFechaFichaPersona1(TextField component) {
        this.campoFechaFichaPersona1 = component;
    }

    private TextField campoFechaFichaPersona1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaFichaPersona1x1() {
        return campoFechaFichaPersona1x1;
    }

    public void setCampoFechaFichaPersona1x1(TextField component) {
        this.campoFechaFichaPersona1x1 = component;
    }

    private StaticText campoFechaFichaPersona1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaFichaPersona1Texto1() {
        return campoFechaFichaPersona1Texto1;
    }

    public void setCampoFechaFichaPersona1Texto1(StaticText component) {
        this.campoFechaFichaPersona1Texto1 = component;
    }

    private StaticText campoFechaFichaPersona1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaFichaPersona1x1Texto1() {
        return campoFechaFichaPersona1x1Texto1;
    }

    public void setCampoFechaFichaPersona1x1Texto1(StaticText component) {
        this.campoFechaFichaPersona1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaFichaPersona1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaFichaPersona1() {
        return converterFechaFichaPersona1;
    }
  
    public void setConverterFechaFichaPersona1(SqlTimestampConverter converter) {
        this.converterFechaFichaPersona1 = converter;
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
  
    private TableColumn tableColumnFechaUltimoCobroPension1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaUltimoCobroPension1() {
        return tableColumnFechaUltimoCobroPension1;
    }

    public void setTableColumnFechaUltimoCobroPension1(TableColumn component) {
        this.tableColumnFechaUltimoCobroPension1 = component;
    }

    private Label labelFechaUltimoCobroPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaUltimoCobroPension1() {
        return labelFechaUltimoCobroPension1;
    }

    public void setLabelFechaUltimoCobroPension1(Label l) {
        this.labelFechaUltimoCobroPension1 = l;
    }

    private TextField campoFechaUltimoCobroPension1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaUltimoCobroPension1() {
        return campoFechaUltimoCobroPension1;
    }

    public void setCampoFechaUltimoCobroPension1(TextField component) {
        this.campoFechaUltimoCobroPension1 = component;
    }

    private TextField campoFechaUltimoCobroPension1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaUltimoCobroPension1x1() {
        return campoFechaUltimoCobroPension1x1;
    }

    public void setCampoFechaUltimoCobroPension1x1(TextField component) {
        this.campoFechaUltimoCobroPension1x1 = component;
    }

    private StaticText campoFechaUltimoCobroPension1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaUltimoCobroPension1Texto1() {
        return campoFechaUltimoCobroPension1Texto1;
    }

    public void setCampoFechaUltimoCobroPension1Texto1(StaticText component) {
        this.campoFechaUltimoCobroPension1Texto1 = component;
    }

    private StaticText campoFechaUltimoCobroPension1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaUltimoCobroPension1x1Texto1() {
        return campoFechaUltimoCobroPension1x1Texto1;
    }

    public void setCampoFechaUltimoCobroPension1x1Texto1(StaticText component) {
        this.campoFechaUltimoCobroPension1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaUltimoCobroPension1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaUltimoCobroPension1() {
        return converterFechaUltimoCobroPension1;
    }
  
    public void setConverterFechaUltimoCobroPension1(SqlTimestampConverter converter) {
        this.converterFechaUltimoCobroPension1 = converter;
    }
  
    private TableColumn tableColumnNotasAnulFecUltCobPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNotasAnulFecUltCobPen1() {
        return tableColumnNotasAnulFecUltCobPen1;
    }

    public void setTableColumnNotasAnulFecUltCobPen1(TableColumn component) {
        this.tableColumnNotasAnulFecUltCobPen1 = component;
    }

    private Label labelNotasAnulFecUltCobPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNotasAnulFecUltCobPen1() {
        return labelNotasAnulFecUltCobPen1;
    }

    public void setLabelNotasAnulFecUltCobPen1(Label l) {
        this.labelNotasAnulFecUltCobPen1 = l;
    }

    private TextArea campoNotasAnulFecUltCobPen1 = new com.egt.core.jsf.component.AreaTexto();

    @Override
    public TextArea getCampoNotasAnulFecUltCobPen1() {
        return campoNotasAnulFecUltCobPen1;
    }

    public void setCampoNotasAnulFecUltCobPen1(TextArea component) {
        this.campoNotasAnulFecUltCobPen1 = component;
    }

    private TextArea campoNotasAnulFecUltCobPen1x1 = new com.egt.core.jsf.component.AreaTexto();

    public TextArea getCampoNotasAnulFecUltCobPen1x1() {
        return campoNotasAnulFecUltCobPen1x1;
    }

    public void setCampoNotasAnulFecUltCobPen1x1(TextArea component) {
        this.campoNotasAnulFecUltCobPen1x1 = component;
    }

    private StaticText campoNotasAnulFecUltCobPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNotasAnulFecUltCobPen1Texto1() {
        return campoNotasAnulFecUltCobPen1Texto1;
    }

    public void setCampoNotasAnulFecUltCobPen1Texto1(StaticText component) {
        this.campoNotasAnulFecUltCobPen1Texto1 = component;
    }

    private StaticText campoNotasAnulFecUltCobPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNotasAnulFecUltCobPen1x1Texto1() {
        return campoNotasAnulFecUltCobPen1x1Texto1;
    }

    public void setCampoNotasAnulFecUltCobPen1x1Texto1(StaticText component) {
        this.campoNotasAnulFecUltCobPen1x1Texto1 = component;
    }

    private LengthValidator validatorNotasAnulFecUltCobPen1 = new LengthValidator();
  
    public LengthValidator getValidatorNotasAnulFecUltCobPen1() {
        return validatorNotasAnulFecUltCobPen1;
    }
  
    public void setValidatorNotasAnulFecUltCobPen1(LengthValidator validator) {
        this.validatorNotasAnulFecUltCobPen1 = validator;
    }
  
    private TableColumn tableColumnNumeroTipoActJupe1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroTipoActJupe1() {
        return tableColumnNumeroTipoActJupe1;
    }

    public void setTableColumnNumeroTipoActJupe1(TableColumn component) {
        this.tableColumnNumeroTipoActJupe1 = component;
    }

    private Label labelNumeroTipoActJupe1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoActJupe1() {
        return labelNumeroTipoActJupe1;
    }

    public void setLabelNumeroTipoActJupe1(Label l) {
        this.labelNumeroTipoActJupe1 = l;
    }

    private DropDown listaNumeroTipoActJupe1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoActJupe1() {
        return listaNumeroTipoActJupe1;
    }

    public void setListaNumeroTipoActJupe1(DropDown component) {
        this.listaNumeroTipoActJupe1 = component;
    }

    private DropDown listaNumeroTipoActJupe1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoActJupe1x1() {
        return listaNumeroTipoActJupe1x1;
    }

    public void setListaNumeroTipoActJupe1x1(DropDown component) {
        this.listaNumeroTipoActJupe1x1 = component;
    }

    private StaticText listaNumeroTipoActJupe1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoActJupe1Texto1() {
        return listaNumeroTipoActJupe1Texto1;
    }

    public void setListaNumeroTipoActJupe1Texto1(StaticText component) {
        this.listaNumeroTipoActJupe1Texto1 = component;
    }

    private StaticText listaNumeroTipoActJupe1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoActJupe1x1Texto1() {
        return listaNumeroTipoActJupe1x1Texto1;
    }

    public void setListaNumeroTipoActJupe1x1Texto1(StaticText component) {
        this.listaNumeroTipoActJupe1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoActJupe1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoActJupe1() {
        return converterNumeroTipoActJupe1;
    }
  
    public void setConverterNumeroTipoActJupe1(IntegerConverter converter) {
        this.converterNumeroTipoActJupe1 = converter;
    }
  
    private TableColumn tableColumnFechaHoraUltActJupe1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaHoraUltActJupe1() {
        return tableColumnFechaHoraUltActJupe1;
    }

    public void setTableColumnFechaHoraUltActJupe1(TableColumn component) {
        this.tableColumnFechaHoraUltActJupe1 = component;
    }

    private Label labelFechaHoraUltActJupe1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaHoraUltActJupe1() {
        return labelFechaHoraUltActJupe1;
    }

    public void setLabelFechaHoraUltActJupe1(Label l) {
        this.labelFechaHoraUltActJupe1 = l;
    }

    private TextField campoFechaHoraUltActJupe1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaHoraUltActJupe1() {
        return campoFechaHoraUltActJupe1;
    }

    public void setCampoFechaHoraUltActJupe1(TextField component) {
        this.campoFechaHoraUltActJupe1 = component;
    }

    private TextField campoFechaHoraUltActJupe1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaHoraUltActJupe1x1() {
        return campoFechaHoraUltActJupe1x1;
    }

    public void setCampoFechaHoraUltActJupe1x1(TextField component) {
        this.campoFechaHoraUltActJupe1x1 = component;
    }

    private StaticText campoFechaHoraUltActJupe1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaHoraUltActJupe1Texto1() {
        return campoFechaHoraUltActJupe1Texto1;
    }

    public void setCampoFechaHoraUltActJupe1Texto1(StaticText component) {
        this.campoFechaHoraUltActJupe1Texto1 = component;
    }

    private StaticText campoFechaHoraUltActJupe1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaHoraUltActJupe1x1Texto1() {
        return campoFechaHoraUltActJupe1x1Texto1;
    }

    public void setCampoFechaHoraUltActJupe1x1Texto1(StaticText component) {
        this.campoFechaHoraUltActJupe1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaHoraUltActJupe1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaHoraUltActJupe1() {
        return converterFechaHoraUltActJupe1;
    }
  
    public void setConverterFechaHoraUltActJupe1(SqlTimestampConverter converter) {
        this.converterFechaHoraUltActJupe1 = converter;
    }
  
    private TableColumn tableColumnNumeroResolucionOtorPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnNumeroResolucionOtorPen1() {
        return tableColumnNumeroResolucionOtorPen1;
    }

    public void setTableColumnNumeroResolucionOtorPen1(TableColumn component) {
        this.tableColumnNumeroResolucionOtorPen1 = component;
    }

    private Label labelNumeroResolucionOtorPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroResolucionOtorPen1() {
        return labelNumeroResolucionOtorPen1;
    }

    public void setLabelNumeroResolucionOtorPen1(Label l) {
        this.labelNumeroResolucionOtorPen1 = l;
    }

    private TextField campoNumeroResolucionOtorPen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroResolucionOtorPen1() {
        return campoNumeroResolucionOtorPen1;
    }

    public void setCampoNumeroResolucionOtorPen1(TextField component) {
        this.campoNumeroResolucionOtorPen1 = component;
    }

    private TextField campoNumeroResolucionOtorPen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroResolucionOtorPen1x1() {
        return campoNumeroResolucionOtorPen1x1;
    }

    public void setCampoNumeroResolucionOtorPen1x1(TextField component) {
        this.campoNumeroResolucionOtorPen1x1 = component;
    }

    private StaticText campoNumeroResolucionOtorPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroResolucionOtorPen1Texto1() {
        return campoNumeroResolucionOtorPen1Texto1;
    }

    public void setCampoNumeroResolucionOtorPen1Texto1(StaticText component) {
        this.campoNumeroResolucionOtorPen1Texto1 = component;
    }

    private StaticText campoNumeroResolucionOtorPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroResolucionOtorPen1x1Texto1() {
        return campoNumeroResolucionOtorPen1x1Texto1;
    }

    public void setCampoNumeroResolucionOtorPen1x1Texto1(StaticText component) {
        this.campoNumeroResolucionOtorPen1x1Texto1 = component;
    }

    private LengthValidator validatorNumeroResolucionOtorPen1 = new LengthValidator();
  
    public LengthValidator getValidatorNumeroResolucionOtorPen1() {
        return validatorNumeroResolucionOtorPen1;
    }
  
    public void setValidatorNumeroResolucionOtorPen1(LengthValidator validator) {
        this.validatorNumeroResolucionOtorPen1 = validator;
    }
  
    private TableColumn tableColumnFechaResolucionOtorPen1 = new com.egt.core.jsf.component.ColumnaTabla();

    public TableColumn getTableColumnFechaResolucionOtorPen1() {
        return tableColumnFechaResolucionOtorPen1;
    }

    public void setTableColumnFechaResolucionOtorPen1(TableColumn component) {
        this.tableColumnFechaResolucionOtorPen1 = component;
    }

    private Label labelFechaResolucionOtorPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaResolucionOtorPen1() {
        return labelFechaResolucionOtorPen1;
    }

    public void setLabelFechaResolucionOtorPen1(Label l) {
        this.labelFechaResolucionOtorPen1 = l;
    }

    private TextField campoFechaResolucionOtorPen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaResolucionOtorPen1() {
        return campoFechaResolucionOtorPen1;
    }

    public void setCampoFechaResolucionOtorPen1(TextField component) {
        this.campoFechaResolucionOtorPen1 = component;
    }

    private TextField campoFechaResolucionOtorPen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoFechaResolucionOtorPen1x1() {
        return campoFechaResolucionOtorPen1x1;
    }

    public void setCampoFechaResolucionOtorPen1x1(TextField component) {
        this.campoFechaResolucionOtorPen1x1 = component;
    }

    private StaticText campoFechaResolucionOtorPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaResolucionOtorPen1Texto1() {
        return campoFechaResolucionOtorPen1Texto1;
    }

    public void setCampoFechaResolucionOtorPen1Texto1(StaticText component) {
        this.campoFechaResolucionOtorPen1Texto1 = component;
    }

    private StaticText campoFechaResolucionOtorPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaResolucionOtorPen1x1Texto1() {
        return campoFechaResolucionOtorPen1x1Texto1;
    }

    public void setCampoFechaResolucionOtorPen1x1Texto1(StaticText component) {
        this.campoFechaResolucionOtorPen1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaResolucionOtorPen1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaResolucionOtorPen1() {
        return converterFechaResolucionOtorPen1;
    }
  
    public void setConverterFechaResolucionOtorPen1(SqlTimestampConverter converter) {
        this.converterFechaResolucionOtorPen1 = converter;
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

    private PersonaCachedRowSetDataProvider2 personaDataProvider = new PersonaCachedRowSetDataProvider2();

    @Override
    public PersonaCachedRowSetDataProvider2 getPersonaDataProvider() {
        return personaDataProvider;
    }

    public void setPersonaDataProvider(PersonaCachedRowSetDataProvider2 crsdp) {
        this.personaDataProvider = crsdp;
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

    private FichaPersonaCachedRowSetDataProvider2 fichaPersonaReferenceDataProvider = new FichaPersonaCachedRowSetDataProvider2();

    @Override
    public FichaPersonaCachedRowSetDataProvider2 getFichaPersonaReferenceDataProvider() {
        return fichaPersonaReferenceDataProvider;
    }

    public void setFichaPersonaReferenceDataProvider(FichaPersonaCachedRowSetDataProvider2 crsdp) {
        this.fichaPersonaReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public Persona1() {
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
        personaDataProvider.close();
        etniaIndigenaReferenceDataProvider.close();
        ubicacionReferenceDataProvider.close();
        fichaPersonaReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionPersona...">
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
    public TextField getTextFieldCampoFechaCertificadoVida1() {
        return this.getCampoFechaCertificadoVida1();
    }

    @Override
    public TextField getTextFieldCampoFechaCertificadoDefuncion1() {
        return this.getCampoFechaCertificadoDefuncion1();
    }

    @Override
    public TextField getTextFieldCampoFechaSolicitudPension1() {
        return this.getCampoFechaSolicitudPension1();
    }

    @Override
    public TextField getTextFieldCampoFechaAprobacionPension1() {
        return this.getCampoFechaAprobacionPension1();
    }

    @Override
    public TextField getTextFieldCampoFechaOtorgamientoPen1() {
        return this.getCampoFechaOtorgamientoPen1();
    }

    @Override
    public TextField getTextFieldCampoFechaDenegacionPension1() {
        return this.getCampoFechaDenegacionPension1();
    }

    @Override
    public TextField getTextFieldCampoFechaRevocacionPension1() {
        return this.getCampoFechaRevocacionPension1();
    }

    @Override
    public TextField getTextFieldCampoFechaSolicitudRecoPen1() {
        return this.getCampoFechaSolicitudRecoPen1();
    }

    @Override
    public TextField getTextFieldCampoFechaAprobacionRecoPen1() {
        return this.getCampoFechaAprobacionRecoPen1();
    }

    @Override
    public TextField getTextFieldCampoFechaDenegacionRecoPen1() {
        return this.getCampoFechaDenegacionRecoPen1();
    }

    @Override
    public TextField getTextFieldCampoFechaRegistroDenunciaPen1() {
        return this.getCampoFechaRegistroDenunciaPen1();
    }

    @Override
    public TextField getTextFieldCampoFechaConfirmacionDenuPen1() {
        return this.getCampoFechaConfirmacionDenuPen1();
    }

    @Override
    public TextField getTextFieldCampoFechaDesmentidoDenunciaPen1() {
        return this.getCampoFechaDesmentidoDenunciaPen1();
    }

    @Override
    public TextField getTextFieldCampoFechaFichaPersona1() {
        return this.getCampoFechaFichaPersona1();
    }

    @Override
    public TextField getTextFieldCampoFechaUltimoCobroPension1() {
        return this.getCampoFechaUltimoCobroPension1();
    }

    @Override
    public TextField getTextFieldCampoFechaHoraUltActJupe1() {
        return this.getCampoFechaHoraUltActJupe1();
    }

    @Override
    public TextField getTextFieldCampoFechaResolucionOtorPen1() {
        return this.getCampoFechaResolucionOtorPen1();
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
    private AsistentePaginaActualizacionPersona asistente = new AsistentePaginaActualizacionPersona(this);

    public AsistentePaginaActualizacionPersona getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("Persona1_ETIQUETA_MIGAS_PAN");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("Persona1_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("Persona1_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getPersonaDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return PersonaCachedRowSetDataProvider2.FUNCION_CONSULTAR_PERSONA;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return PersonaCachedRowSetDataProvider2.FUNCION_CREAR_PERSONA;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return PersonaCachedRowSetDataProvider2.FUNCION_MODIFICAR_PERSONA;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return PersonaCachedRowSetDataProvider2.FUNCION_ELIMINAR_PERSONA;
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
        converterMontoPension1.setMinIntegerDigits(1);
        converterMontoPension1.setMaxIntegerDigits(14);
        converterMontoPension1.setMaxFractionDigits(2);
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
            this.getPersonaDataProvider().consultarPersona(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    @Override
    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getPersonaDataProvider().consultarPersona(filtro);
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

    public void campoIdFichaPersona1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFichaPersona1_validate(context, component, value);
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
        String urx = URX2.COMANDO_PERSONA;
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
    PersonaBusinessProcessLocal personaBusinessProcess;

    @Override
    public Object getPersonaBusinessProcess() {
        return personaBusinessProcess;
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
