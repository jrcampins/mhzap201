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
package com.egt.web.consulta;

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

public class Persona6 extends AbstractPageBean
        implements PaginaActualizacionPersona, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
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
        validatorNumeroResolucionDenPen1.setMaximum(50);
        converterFechaResolucionDenPen1.setPattern("dd/MM/yyyy");
        converterFechaResolucionDenPen1.setType("date");
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

    private Button botonIrAlPrimero1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonIrAlPrimero1() {
        return botonIrAlPrimero1;
    }

    public void setBotonIrAlPrimero1(Button component) {
        this.botonIrAlPrimero1 = component;
    }

    private Button botonIrAlAnterior1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonIrAlAnterior1() {
        return botonIrAlAnterior1;
    }

    public void setBotonIrAlAnterior1(Button component) {
        this.botonIrAlAnterior1 = component;
    }

    private Button botonIrAlSiguiente1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonIrAlSiguiente1() {
        return botonIrAlSiguiente1;
    }

    public void setBotonIrAlSiguiente1(Button component) {
        this.botonIrAlSiguiente1 = component;
    }

    private Button botonIrAlUltimo1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonIrAlUltimo1() {
        return botonIrAlUltimo1;
    }

    public void setBotonIrAlUltimo1(Button component) {
        this.botonIrAlUltimo1 = component;
    }

    private Button botonProcesarFila1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonProcesarFila1() {
        return botonProcesarFila1;
    }

    public void setBotonProcesarFila1(Button b) {
        this.botonProcesarFila1 = b;
    }

    private Label etiquetaIdentificacionFila1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getEtiquetaIdentificacionFila1() {
        return etiquetaIdentificacionFila1;
    }

    public void setEtiquetaIdentificacionFila1(Label l) {
        this.etiquetaIdentificacionFila1 = l;
    }

    private Label etiquetaDenominacionFilaMaestro1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getEtiquetaDenominacionFilaMaestro1() {
        return etiquetaDenominacionFilaMaestro1;
    }

    public void setEtiquetaDenominacionFilaMaestro1(Label l) {
        this.etiquetaDenominacionFilaMaestro1 = l;
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

    private HelpInline helpInlineIdPersona1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdPersona1() {
        return helpInlineIdPersona1;
    }

    public void setHelpInlineIdPersona1(HelpInline hi) {
        this.helpInlineIdPersona1 = hi;
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

    private HelpInline helpInlineCodigoPersona1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCodigoPersona1() {
        return helpInlineCodigoPersona1;
    }

    public void setHelpInlineCodigoPersona1(HelpInline hi) {
        this.helpInlineCodigoPersona1 = hi;
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

    private HelpInline helpInlineNombrePersona1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombrePersona1() {
        return helpInlineNombrePersona1;
    }

    public void setHelpInlineNombrePersona1(HelpInline hi) {
        this.helpInlineNombrePersona1 = hi;
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
  
    private Label labelNumeroCedula1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCedula1() {
        return labelNumeroCedula1;
    }

    public void setLabelNumeroCedula1(Label l) {
        this.labelNumeroCedula1 = l;
    }

    private Label labelNumeroCedula1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCedula1x1() {
        return labelNumeroCedula1x1;
    }

    public void setLabelNumeroCedula1x1(Label l) {
        this.labelNumeroCedula1x1 = l;
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

    private HelpInline helpInlineNumeroCedula1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCedula1() {
        return helpInlineNumeroCedula1;
    }

    public void setHelpInlineNumeroCedula1(HelpInline hi) {
        this.helpInlineNumeroCedula1 = hi;
    }

    private HelpInline helpInlineNumeroCedula1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCedula1x1() {
        return helpInlineNumeroCedula1x1;
    }

    public void setHelpInlineNumeroCedula1x1(HelpInline hi) {
        this.helpInlineNumeroCedula1x1 = hi;
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
  
    private Label labelLetraCedula1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLetraCedula1() {
        return labelLetraCedula1;
    }

    public void setLabelLetraCedula1(Label l) {
        this.labelLetraCedula1 = l;
    }

    private Label labelLetraCedula1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelLetraCedula1x1() {
        return labelLetraCedula1x1;
    }

    public void setLabelLetraCedula1x1(Label l) {
        this.labelLetraCedula1x1 = l;
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

    private HelpInline helpInlineLetraCedula1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineLetraCedula1() {
        return helpInlineLetraCedula1;
    }

    public void setHelpInlineLetraCedula1(HelpInline hi) {
        this.helpInlineLetraCedula1 = hi;
    }

    private HelpInline helpInlineLetraCedula1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineLetraCedula1x1() {
        return helpInlineLetraCedula1x1;
    }

    public void setHelpInlineLetraCedula1x1(HelpInline hi) {
        this.helpInlineLetraCedula1x1 = hi;
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
  
    private Label labelFechaExpedicionCedula1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaExpedicionCedula1() {
        return labelFechaExpedicionCedula1;
    }

    public void setLabelFechaExpedicionCedula1(Label l) {
        this.labelFechaExpedicionCedula1 = l;
    }

    private Label labelFechaExpedicionCedula1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaExpedicionCedula1x1() {
        return labelFechaExpedicionCedula1x1;
    }

    public void setLabelFechaExpedicionCedula1x1(Label l) {
        this.labelFechaExpedicionCedula1x1 = l;
    }

    private Calendar campoFechaExpedicionCedula1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaExpedicionCedula1() {
        return campoFechaExpedicionCedula1;
    }

    public void setCampoFechaExpedicionCedula1(Calendar component) {
        this.campoFechaExpedicionCedula1 = component;
    }

    private Calendar campoFechaExpedicionCedula1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaExpedicionCedula1x1() {
        return campoFechaExpedicionCedula1x1;
    }

    public void setCampoFechaExpedicionCedula1x1(Calendar component) {
        this.campoFechaExpedicionCedula1x1 = component;
    }

    private HelpInline helpInlineFechaExpedicionCedula1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaExpedicionCedula1() {
        return helpInlineFechaExpedicionCedula1;
    }

    public void setHelpInlineFechaExpedicionCedula1(HelpInline hi) {
        this.helpInlineFechaExpedicionCedula1 = hi;
    }

    private HelpInline helpInlineFechaExpedicionCedula1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaExpedicionCedula1x1() {
        return helpInlineFechaExpedicionCedula1x1;
    }

    public void setHelpInlineFechaExpedicionCedula1x1(HelpInline hi) {
        this.helpInlineFechaExpedicionCedula1x1 = hi;
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
  
    private Label labelFechaVencimientoCedula1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaVencimientoCedula1() {
        return labelFechaVencimientoCedula1;
    }

    public void setLabelFechaVencimientoCedula1(Label l) {
        this.labelFechaVencimientoCedula1 = l;
    }

    private Label labelFechaVencimientoCedula1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaVencimientoCedula1x1() {
        return labelFechaVencimientoCedula1x1;
    }

    public void setLabelFechaVencimientoCedula1x1(Label l) {
        this.labelFechaVencimientoCedula1x1 = l;
    }

    private Calendar campoFechaVencimientoCedula1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaVencimientoCedula1() {
        return campoFechaVencimientoCedula1;
    }

    public void setCampoFechaVencimientoCedula1(Calendar component) {
        this.campoFechaVencimientoCedula1 = component;
    }

    private Calendar campoFechaVencimientoCedula1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaVencimientoCedula1x1() {
        return campoFechaVencimientoCedula1x1;
    }

    public void setCampoFechaVencimientoCedula1x1(Calendar component) {
        this.campoFechaVencimientoCedula1x1 = component;
    }

    private HelpInline helpInlineFechaVencimientoCedula1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaVencimientoCedula1() {
        return helpInlineFechaVencimientoCedula1;
    }

    public void setHelpInlineFechaVencimientoCedula1(HelpInline hi) {
        this.helpInlineFechaVencimientoCedula1 = hi;
    }

    private HelpInline helpInlineFechaVencimientoCedula1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaVencimientoCedula1x1() {
        return helpInlineFechaVencimientoCedula1x1;
    }

    public void setHelpInlineFechaVencimientoCedula1x1(HelpInline hi) {
        this.helpInlineFechaVencimientoCedula1x1 = hi;
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
  
    private Label labelPrimerNombre1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelPrimerNombre1() {
        return labelPrimerNombre1;
    }

    public void setLabelPrimerNombre1(Label l) {
        this.labelPrimerNombre1 = l;
    }

    private Label labelPrimerNombre1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelPrimerNombre1x1() {
        return labelPrimerNombre1x1;
    }

    public void setLabelPrimerNombre1x1(Label l) {
        this.labelPrimerNombre1x1 = l;
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

    private HelpInline helpInlinePrimerNombre1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlinePrimerNombre1() {
        return helpInlinePrimerNombre1;
    }

    public void setHelpInlinePrimerNombre1(HelpInline hi) {
        this.helpInlinePrimerNombre1 = hi;
    }

    private HelpInline helpInlinePrimerNombre1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlinePrimerNombre1x1() {
        return helpInlinePrimerNombre1x1;
    }

    public void setHelpInlinePrimerNombre1x1(HelpInline hi) {
        this.helpInlinePrimerNombre1x1 = hi;
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
  
    private Label labelSegundoNombre1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelSegundoNombre1() {
        return labelSegundoNombre1;
    }

    public void setLabelSegundoNombre1(Label l) {
        this.labelSegundoNombre1 = l;
    }

    private Label labelSegundoNombre1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelSegundoNombre1x1() {
        return labelSegundoNombre1x1;
    }

    public void setLabelSegundoNombre1x1(Label l) {
        this.labelSegundoNombre1x1 = l;
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

    private HelpInline helpInlineSegundoNombre1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineSegundoNombre1() {
        return helpInlineSegundoNombre1;
    }

    public void setHelpInlineSegundoNombre1(HelpInline hi) {
        this.helpInlineSegundoNombre1 = hi;
    }

    private HelpInline helpInlineSegundoNombre1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineSegundoNombre1x1() {
        return helpInlineSegundoNombre1x1;
    }

    public void setHelpInlineSegundoNombre1x1(HelpInline hi) {
        this.helpInlineSegundoNombre1x1 = hi;
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
  
    private Label labelPrimerApellido1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelPrimerApellido1() {
        return labelPrimerApellido1;
    }

    public void setLabelPrimerApellido1(Label l) {
        this.labelPrimerApellido1 = l;
    }

    private Label labelPrimerApellido1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelPrimerApellido1x1() {
        return labelPrimerApellido1x1;
    }

    public void setLabelPrimerApellido1x1(Label l) {
        this.labelPrimerApellido1x1 = l;
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

    private HelpInline helpInlinePrimerApellido1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlinePrimerApellido1() {
        return helpInlinePrimerApellido1;
    }

    public void setHelpInlinePrimerApellido1(HelpInline hi) {
        this.helpInlinePrimerApellido1 = hi;
    }

    private HelpInline helpInlinePrimerApellido1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlinePrimerApellido1x1() {
        return helpInlinePrimerApellido1x1;
    }

    public void setHelpInlinePrimerApellido1x1(HelpInline hi) {
        this.helpInlinePrimerApellido1x1 = hi;
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
  
    private Label labelSegundoApellido1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelSegundoApellido1() {
        return labelSegundoApellido1;
    }

    public void setLabelSegundoApellido1(Label l) {
        this.labelSegundoApellido1 = l;
    }

    private Label labelSegundoApellido1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelSegundoApellido1x1() {
        return labelSegundoApellido1x1;
    }

    public void setLabelSegundoApellido1x1(Label l) {
        this.labelSegundoApellido1x1 = l;
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

    private HelpInline helpInlineSegundoApellido1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineSegundoApellido1() {
        return helpInlineSegundoApellido1;
    }

    public void setHelpInlineSegundoApellido1(HelpInline hi) {
        this.helpInlineSegundoApellido1 = hi;
    }

    private HelpInline helpInlineSegundoApellido1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineSegundoApellido1x1() {
        return helpInlineSegundoApellido1x1;
    }

    public void setHelpInlineSegundoApellido1x1(HelpInline hi) {
        this.helpInlineSegundoApellido1x1 = hi;
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
  
    private Label labelApellidoCasada1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelApellidoCasada1() {
        return labelApellidoCasada1;
    }

    public void setLabelApellidoCasada1(Label l) {
        this.labelApellidoCasada1 = l;
    }

    private Label labelApellidoCasada1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelApellidoCasada1x1() {
        return labelApellidoCasada1x1;
    }

    public void setLabelApellidoCasada1x1(Label l) {
        this.labelApellidoCasada1x1 = l;
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

    private HelpInline helpInlineApellidoCasada1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineApellidoCasada1() {
        return helpInlineApellidoCasada1;
    }

    public void setHelpInlineApellidoCasada1(HelpInline hi) {
        this.helpInlineApellidoCasada1 = hi;
    }

    private HelpInline helpInlineApellidoCasada1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineApellidoCasada1x1() {
        return helpInlineApellidoCasada1x1;
    }

    public void setHelpInlineApellidoCasada1x1(HelpInline hi) {
        this.helpInlineApellidoCasada1x1 = hi;
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
  
    private Label labelApodo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelApodo1() {
        return labelApodo1;
    }

    public void setLabelApodo1(Label l) {
        this.labelApodo1 = l;
    }

    private Label labelApodo1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelApodo1x1() {
        return labelApodo1x1;
    }

    public void setLabelApodo1x1(Label l) {
        this.labelApodo1x1 = l;
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

    private HelpInline helpInlineApodo1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineApodo1() {
        return helpInlineApodo1;
    }

    public void setHelpInlineApodo1(HelpInline hi) {
        this.helpInlineApodo1 = hi;
    }

    private HelpInline helpInlineApodo1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineApodo1x1() {
        return helpInlineApodo1x1;
    }

    public void setHelpInlineApodo1x1(HelpInline hi) {
        this.helpInlineApodo1x1 = hi;
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
  
    private Label labelFechaNacimiento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaNacimiento1() {
        return labelFechaNacimiento1;
    }

    public void setLabelFechaNacimiento1(Label l) {
        this.labelFechaNacimiento1 = l;
    }

    private Label labelFechaNacimiento1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaNacimiento1x1() {
        return labelFechaNacimiento1x1;
    }

    public void setLabelFechaNacimiento1x1(Label l) {
        this.labelFechaNacimiento1x1 = l;
    }

    private Calendar campoFechaNacimiento1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaNacimiento1() {
        return campoFechaNacimiento1;
    }

    public void setCampoFechaNacimiento1(Calendar component) {
        this.campoFechaNacimiento1 = component;
    }

    private Calendar campoFechaNacimiento1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaNacimiento1x1() {
        return campoFechaNacimiento1x1;
    }

    public void setCampoFechaNacimiento1x1(Calendar component) {
        this.campoFechaNacimiento1x1 = component;
    }

    private HelpInline helpInlineFechaNacimiento1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaNacimiento1() {
        return helpInlineFechaNacimiento1;
    }

    public void setHelpInlineFechaNacimiento1(HelpInline hi) {
        this.helpInlineFechaNacimiento1 = hi;
    }

    private HelpInline helpInlineFechaNacimiento1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaNacimiento1x1() {
        return helpInlineFechaNacimiento1x1;
    }

    public void setHelpInlineFechaNacimiento1x1(HelpInline hi) {
        this.helpInlineFechaNacimiento1x1 = hi;
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
  
    private Label labelNumeroSexoPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSexoPersona1() {
        return labelNumeroSexoPersona1;
    }

    public void setLabelNumeroSexoPersona1(Label l) {
        this.labelNumeroSexoPersona1 = l;
    }

    private Label labelNumeroSexoPersona1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSexoPersona1x1() {
        return labelNumeroSexoPersona1x1;
    }

    public void setLabelNumeroSexoPersona1x1(Label l) {
        this.labelNumeroSexoPersona1x1 = l;
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

    private HelpInline helpInlineNumeroSexoPersona1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSexoPersona1() {
        return helpInlineNumeroSexoPersona1;
    }

    public void setHelpInlineNumeroSexoPersona1(HelpInline hi) {
        this.helpInlineNumeroSexoPersona1 = hi;
    }

    private HelpInline helpInlineNumeroSexoPersona1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSexoPersona1x1() {
        return helpInlineNumeroSexoPersona1x1;
    }

    public void setHelpInlineNumeroSexoPersona1x1(HelpInline hi) {
        this.helpInlineNumeroSexoPersona1x1 = hi;
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
  
    private Label labelNumeroEstadoCivil1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroEstadoCivil1() {
        return labelNumeroEstadoCivil1;
    }

    public void setLabelNumeroEstadoCivil1(Label l) {
        this.labelNumeroEstadoCivil1 = l;
    }

    private Label labelNumeroEstadoCivil1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroEstadoCivil1x1() {
        return labelNumeroEstadoCivil1x1;
    }

    public void setLabelNumeroEstadoCivil1x1(Label l) {
        this.labelNumeroEstadoCivil1x1 = l;
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

    private HelpInline helpInlineNumeroEstadoCivil1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroEstadoCivil1() {
        return helpInlineNumeroEstadoCivil1;
    }

    public void setHelpInlineNumeroEstadoCivil1(HelpInline hi) {
        this.helpInlineNumeroEstadoCivil1 = hi;
    }

    private HelpInline helpInlineNumeroEstadoCivil1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroEstadoCivil1x1() {
        return helpInlineNumeroEstadoCivil1x1;
    }

    public void setHelpInlineNumeroEstadoCivil1x1(HelpInline hi) {
        this.helpInlineNumeroEstadoCivil1x1 = hi;
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
  
    private Label labelEsParaguayoNatural1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsParaguayoNatural1() {
        return labelEsParaguayoNatural1;
    }

    public void setLabelEsParaguayoNatural1(Label l) {
        this.labelEsParaguayoNatural1 = l;
    }

    private Label labelEsParaguayoNatural1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsParaguayoNatural1x1() {
        return labelEsParaguayoNatural1x1;
    }

    public void setLabelEsParaguayoNatural1x1(Label l) {
        this.labelEsParaguayoNatural1x1 = l;
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

    private HelpInline helpInlineEsParaguayoNatural1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsParaguayoNatural1() {
        return helpInlineEsParaguayoNatural1;
    }

    public void setHelpInlineEsParaguayoNatural1(HelpInline hi) {
        this.helpInlineEsParaguayoNatural1 = hi;
    }

    private HelpInline helpInlineEsParaguayoNatural1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsParaguayoNatural1x1() {
        return helpInlineEsParaguayoNatural1x1;
    }

    public void setHelpInlineEsParaguayoNatural1x1(HelpInline hi) {
        this.helpInlineEsParaguayoNatural1x1 = hi;
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
  
    private Label labelEsIndigena1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsIndigena1() {
        return labelEsIndigena1;
    }

    public void setLabelEsIndigena1(Label l) {
        this.labelEsIndigena1 = l;
    }

    private Label labelEsIndigena1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsIndigena1x1() {
        return labelEsIndigena1x1;
    }

    public void setLabelEsIndigena1x1(Label l) {
        this.labelEsIndigena1x1 = l;
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

    private HelpInline helpInlineEsIndigena1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsIndigena1() {
        return helpInlineEsIndigena1;
    }

    public void setHelpInlineEsIndigena1(HelpInline hi) {
        this.helpInlineEsIndigena1 = hi;
    }

    private HelpInline helpInlineEsIndigena1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsIndigena1x1() {
        return helpInlineEsIndigena1x1;
    }

    public void setHelpInlineEsIndigena1x1(HelpInline hi) {
        this.helpInlineEsIndigena1x1 = hi;
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
  
    private Label labelIdEtniaIndigena1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdEtniaIndigena1() {
        return labelIdEtniaIndigena1;
    }

    public void setLabelIdEtniaIndigena1(Label l) {
        this.labelIdEtniaIndigena1 = l;
    }

    private Label labelIdEtniaIndigena1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdEtniaIndigena1x1() {
        return labelIdEtniaIndigena1x1;
    }

    public void setLabelIdEtniaIndigena1x1(Label l) {
        this.labelIdEtniaIndigena1x1 = l;
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

    private HelpInline helpInlineIdEtniaIndigena1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdEtniaIndigena1() {
        return helpInlineIdEtniaIndigena1;
    }

    public void setHelpInlineIdEtniaIndigena1(HelpInline hi) {
        this.helpInlineIdEtniaIndigena1 = hi;
    }

    private HelpInline helpInlineIdEtniaIndigena1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdEtniaIndigena1x1() {
        return helpInlineIdEtniaIndigena1x1;
    }

    public void setHelpInlineIdEtniaIndigena1x1(HelpInline hi) {
        this.helpInlineIdEtniaIndigena1x1 = hi;
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

    private Label labelIdEtniaIndigena2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdEtniaIndigena2() {
        return labelIdEtniaIndigena2;
    }

    public void setLabelIdEtniaIndigena2(Label l) {
        this.labelIdEtniaIndigena2 = l;
    }

    private Label labelIdEtniaIndigena1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdEtniaIndigena1x2() {
        return labelIdEtniaIndigena1x2;
    }

    public void setLabelIdEtniaIndigena1x2(Label l) {
        this.labelIdEtniaIndigena1x2 = l;
    }

    private StaticText campoIdEtniaIndigena1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdEtniaIndigena1Texto2() {
        return campoIdEtniaIndigena1Texto2;
    }

    public void setCampoIdEtniaIndigena1Texto2(StaticText component) {
        this.campoIdEtniaIndigena1Texto2 = component;
    }

    private StaticText campoIdEtniaIndigena1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdEtniaIndigena1x1Texto2() {
        return campoIdEtniaIndigena1x1Texto2;
    }

    public void setCampoIdEtniaIndigena1x1Texto2(StaticText component) {
        this.campoIdEtniaIndigena1x1Texto2 = component;
    }

    private Button campoIdEtniaIndigena1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdEtniaIndigena1Boton2() {
        return campoIdEtniaIndigena1Boton2;
    }

    public void setCampoIdEtniaIndigena1Boton2(Button component) {
        this.campoIdEtniaIndigena1Boton2 = component;
    }

    private Button campoIdEtniaIndigena1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdEtniaIndigena1x1Boton2() {
        return campoIdEtniaIndigena1x1Boton2;
    }

    public void setCampoIdEtniaIndigena1x1Boton2(Button component) {
        this.campoIdEtniaIndigena1x1Boton2 = component;
    }

    private Label labelNombreComunidadIndigena1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreComunidadIndigena1() {
        return labelNombreComunidadIndigena1;
    }

    public void setLabelNombreComunidadIndigena1(Label l) {
        this.labelNombreComunidadIndigena1 = l;
    }

    private Label labelNombreComunidadIndigena1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreComunidadIndigena1x1() {
        return labelNombreComunidadIndigena1x1;
    }

    public void setLabelNombreComunidadIndigena1x1(Label l) {
        this.labelNombreComunidadIndigena1x1 = l;
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

    private HelpInline helpInlineNombreComunidadIndigena1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreComunidadIndigena1() {
        return helpInlineNombreComunidadIndigena1;
    }

    public void setHelpInlineNombreComunidadIndigena1(HelpInline hi) {
        this.helpInlineNombreComunidadIndigena1 = hi;
    }

    private HelpInline helpInlineNombreComunidadIndigena1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreComunidadIndigena1x1() {
        return helpInlineNombreComunidadIndigena1x1;
    }

    public void setHelpInlineNombreComunidadIndigena1x1(HelpInline hi) {
        this.helpInlineNombreComunidadIndigena1x1 = hi;
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
  
    private Label labelIdDepartamento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamento1() {
        return labelIdDepartamento1;
    }

    public void setLabelIdDepartamento1(Label l) {
        this.labelIdDepartamento1 = l;
    }

    private Label labelIdDepartamento1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamento1x1() {
        return labelIdDepartamento1x1;
    }

    public void setLabelIdDepartamento1x1(Label l) {
        this.labelIdDepartamento1x1 = l;
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

    private HelpInline helpInlineIdDepartamento1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdDepartamento1() {
        return helpInlineIdDepartamento1;
    }

    public void setHelpInlineIdDepartamento1(HelpInline hi) {
        this.helpInlineIdDepartamento1 = hi;
    }

    private HelpInline helpInlineIdDepartamento1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdDepartamento1x1() {
        return helpInlineIdDepartamento1x1;
    }

    public void setHelpInlineIdDepartamento1x1(HelpInline hi) {
        this.helpInlineIdDepartamento1x1 = hi;
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

    private Label labelIdDepartamento2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamento2() {
        return labelIdDepartamento2;
    }

    public void setLabelIdDepartamento2(Label l) {
        this.labelIdDepartamento2 = l;
    }

    private Label labelIdDepartamento1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamento1x2() {
        return labelIdDepartamento1x2;
    }

    public void setLabelIdDepartamento1x2(Label l) {
        this.labelIdDepartamento1x2 = l;
    }

    private StaticText campoIdDepartamento1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdDepartamento1Texto2() {
        return campoIdDepartamento1Texto2;
    }

    public void setCampoIdDepartamento1Texto2(StaticText component) {
        this.campoIdDepartamento1Texto2 = component;
    }

    private StaticText campoIdDepartamento1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdDepartamento1x1Texto2() {
        return campoIdDepartamento1x1Texto2;
    }

    public void setCampoIdDepartamento1x1Texto2(StaticText component) {
        this.campoIdDepartamento1x1Texto2 = component;
    }

    private Button campoIdDepartamento1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDepartamento1Boton2() {
        return campoIdDepartamento1Boton2;
    }

    public void setCampoIdDepartamento1Boton2(Button component) {
        this.campoIdDepartamento1Boton2 = component;
    }

    private Button campoIdDepartamento1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDepartamento1x1Boton2() {
        return campoIdDepartamento1x1Boton2;
    }

    public void setCampoIdDepartamento1x1Boton2(Button component) {
        this.campoIdDepartamento1x1Boton2 = component;
    }

    private Label labelIdDistrito1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDistrito1() {
        return labelIdDistrito1;
    }

    public void setLabelIdDistrito1(Label l) {
        this.labelIdDistrito1 = l;
    }

    private Label labelIdDistrito1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDistrito1x1() {
        return labelIdDistrito1x1;
    }

    public void setLabelIdDistrito1x1(Label l) {
        this.labelIdDistrito1x1 = l;
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

    private HelpInline helpInlineIdDistrito1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdDistrito1() {
        return helpInlineIdDistrito1;
    }

    public void setHelpInlineIdDistrito1(HelpInline hi) {
        this.helpInlineIdDistrito1 = hi;
    }

    private HelpInline helpInlineIdDistrito1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdDistrito1x1() {
        return helpInlineIdDistrito1x1;
    }

    public void setHelpInlineIdDistrito1x1(HelpInline hi) {
        this.helpInlineIdDistrito1x1 = hi;
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

    private Label labelIdDistrito2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDistrito2() {
        return labelIdDistrito2;
    }

    public void setLabelIdDistrito2(Label l) {
        this.labelIdDistrito2 = l;
    }

    private Label labelIdDistrito1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDistrito1x2() {
        return labelIdDistrito1x2;
    }

    public void setLabelIdDistrito1x2(Label l) {
        this.labelIdDistrito1x2 = l;
    }

    private StaticText campoIdDistrito1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdDistrito1Texto2() {
        return campoIdDistrito1Texto2;
    }

    public void setCampoIdDistrito1Texto2(StaticText component) {
        this.campoIdDistrito1Texto2 = component;
    }

    private StaticText campoIdDistrito1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdDistrito1x1Texto2() {
        return campoIdDistrito1x1Texto2;
    }

    public void setCampoIdDistrito1x1Texto2(StaticText component) {
        this.campoIdDistrito1x1Texto2 = component;
    }

    private Button campoIdDistrito1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDistrito1Boton2() {
        return campoIdDistrito1Boton2;
    }

    public void setCampoIdDistrito1Boton2(Button component) {
        this.campoIdDistrito1Boton2 = component;
    }

    private Button campoIdDistrito1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDistrito1x1Boton2() {
        return campoIdDistrito1x1Boton2;
    }

    public void setCampoIdDistrito1x1Boton2(Button component) {
        this.campoIdDistrito1x1Boton2 = component;
    }

    private Label labelNumeroTipoArea1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoArea1() {
        return labelNumeroTipoArea1;
    }

    public void setLabelNumeroTipoArea1(Label l) {
        this.labelNumeroTipoArea1 = l;
    }

    private Label labelNumeroTipoArea1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoArea1x1() {
        return labelNumeroTipoArea1x1;
    }

    public void setLabelNumeroTipoArea1x1(Label l) {
        this.labelNumeroTipoArea1x1 = l;
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

    private HelpInline helpInlineNumeroTipoArea1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoArea1() {
        return helpInlineNumeroTipoArea1;
    }

    public void setHelpInlineNumeroTipoArea1(HelpInline hi) {
        this.helpInlineNumeroTipoArea1 = hi;
    }

    private HelpInline helpInlineNumeroTipoArea1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoArea1x1() {
        return helpInlineNumeroTipoArea1x1;
    }

    public void setHelpInlineNumeroTipoArea1x1(HelpInline hi) {
        this.helpInlineNumeroTipoArea1x1 = hi;
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
  
    private Label labelIdBarrio1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdBarrio1() {
        return labelIdBarrio1;
    }

    public void setLabelIdBarrio1(Label l) {
        this.labelIdBarrio1 = l;
    }

    private Label labelIdBarrio1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdBarrio1x1() {
        return labelIdBarrio1x1;
    }

    public void setLabelIdBarrio1x1(Label l) {
        this.labelIdBarrio1x1 = l;
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

    private HelpInline helpInlineIdBarrio1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdBarrio1() {
        return helpInlineIdBarrio1;
    }

    public void setHelpInlineIdBarrio1(HelpInline hi) {
        this.helpInlineIdBarrio1 = hi;
    }

    private HelpInline helpInlineIdBarrio1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdBarrio1x1() {
        return helpInlineIdBarrio1x1;
    }

    public void setHelpInlineIdBarrio1x1(HelpInline hi) {
        this.helpInlineIdBarrio1x1 = hi;
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

    private Label labelIdBarrio2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdBarrio2() {
        return labelIdBarrio2;
    }

    public void setLabelIdBarrio2(Label l) {
        this.labelIdBarrio2 = l;
    }

    private Label labelIdBarrio1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdBarrio1x2() {
        return labelIdBarrio1x2;
    }

    public void setLabelIdBarrio1x2(Label l) {
        this.labelIdBarrio1x2 = l;
    }

    private StaticText campoIdBarrio1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdBarrio1Texto2() {
        return campoIdBarrio1Texto2;
    }

    public void setCampoIdBarrio1Texto2(StaticText component) {
        this.campoIdBarrio1Texto2 = component;
    }

    private StaticText campoIdBarrio1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdBarrio1x1Texto2() {
        return campoIdBarrio1x1Texto2;
    }

    public void setCampoIdBarrio1x1Texto2(StaticText component) {
        this.campoIdBarrio1x1Texto2 = component;
    }

    private Button campoIdBarrio1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdBarrio1Boton2() {
        return campoIdBarrio1Boton2;
    }

    public void setCampoIdBarrio1Boton2(Button component) {
        this.campoIdBarrio1Boton2 = component;
    }

    private Button campoIdBarrio1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdBarrio1x1Boton2() {
        return campoIdBarrio1x1Boton2;
    }

    public void setCampoIdBarrio1x1Boton2(Button component) {
        this.campoIdBarrio1x1Boton2 = component;
    }

    private Label labelDireccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDireccion1() {
        return labelDireccion1;
    }

    public void setLabelDireccion1(Label l) {
        this.labelDireccion1 = l;
    }

    private Label labelDireccion1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDireccion1x1() {
        return labelDireccion1x1;
    }

    public void setLabelDireccion1x1(Label l) {
        this.labelDireccion1x1 = l;
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

    private HelpInline helpInlineDireccion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineDireccion1() {
        return helpInlineDireccion1;
    }

    public void setHelpInlineDireccion1(HelpInline hi) {
        this.helpInlineDireccion1 = hi;
    }

    private HelpInline helpInlineDireccion1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineDireccion1x1() {
        return helpInlineDireccion1x1;
    }

    public void setHelpInlineDireccion1x1(HelpInline hi) {
        this.helpInlineDireccion1x1 = hi;
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
  
    private Label labelNumeroTelefonoLineaBaja1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTelefonoLineaBaja1() {
        return labelNumeroTelefonoLineaBaja1;
    }

    public void setLabelNumeroTelefonoLineaBaja1(Label l) {
        this.labelNumeroTelefonoLineaBaja1 = l;
    }

    private Label labelNumeroTelefonoLineaBaja1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTelefonoLineaBaja1x1() {
        return labelNumeroTelefonoLineaBaja1x1;
    }

    public void setLabelNumeroTelefonoLineaBaja1x1(Label l) {
        this.labelNumeroTelefonoLineaBaja1x1 = l;
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

    private HelpInline helpInlineNumeroTelefonoLineaBaja1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTelefonoLineaBaja1() {
        return helpInlineNumeroTelefonoLineaBaja1;
    }

    public void setHelpInlineNumeroTelefonoLineaBaja1(HelpInline hi) {
        this.helpInlineNumeroTelefonoLineaBaja1 = hi;
    }

    private HelpInline helpInlineNumeroTelefonoLineaBaja1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTelefonoLineaBaja1x1() {
        return helpInlineNumeroTelefonoLineaBaja1x1;
    }

    public void setHelpInlineNumeroTelefonoLineaBaja1x1(HelpInline hi) {
        this.helpInlineNumeroTelefonoLineaBaja1x1 = hi;
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
  
    private Label labelNumeroTelefonoCelular1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTelefonoCelular1() {
        return labelNumeroTelefonoCelular1;
    }

    public void setLabelNumeroTelefonoCelular1(Label l) {
        this.labelNumeroTelefonoCelular1 = l;
    }

    private Label labelNumeroTelefonoCelular1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTelefonoCelular1x1() {
        return labelNumeroTelefonoCelular1x1;
    }

    public void setLabelNumeroTelefonoCelular1x1(Label l) {
        this.labelNumeroTelefonoCelular1x1 = l;
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

    private HelpInline helpInlineNumeroTelefonoCelular1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTelefonoCelular1() {
        return helpInlineNumeroTelefonoCelular1;
    }

    public void setHelpInlineNumeroTelefonoCelular1(HelpInline hi) {
        this.helpInlineNumeroTelefonoCelular1 = hi;
    }

    private HelpInline helpInlineNumeroTelefonoCelular1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTelefonoCelular1x1() {
        return helpInlineNumeroTelefonoCelular1x1;
    }

    public void setHelpInlineNumeroTelefonoCelular1x1(HelpInline hi) {
        this.helpInlineNumeroTelefonoCelular1x1 = hi;
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
  
    private Label labelCertificadoVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCertificadoVida1() {
        return labelCertificadoVida1;
    }

    public void setLabelCertificadoVida1(Label l) {
        this.labelCertificadoVida1 = l;
    }

    private Label labelCertificadoVida1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCertificadoVida1x1() {
        return labelCertificadoVida1x1;
    }

    public void setLabelCertificadoVida1x1(Label l) {
        this.labelCertificadoVida1x1 = l;
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

    private HelpInline helpInlineCertificadoVida1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCertificadoVida1() {
        return helpInlineCertificadoVida1;
    }

    public void setHelpInlineCertificadoVida1(HelpInline hi) {
        this.helpInlineCertificadoVida1 = hi;
    }

    private HelpInline helpInlineCertificadoVida1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCertificadoVida1x1() {
        return helpInlineCertificadoVida1x1;
    }

    public void setHelpInlineCertificadoVida1x1(HelpInline hi) {
        this.helpInlineCertificadoVida1x1 = hi;
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
  
    private Label labelFechaCertificadoVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaCertificadoVida1() {
        return labelFechaCertificadoVida1;
    }

    public void setLabelFechaCertificadoVida1(Label l) {
        this.labelFechaCertificadoVida1 = l;
    }

    private Label labelFechaCertificadoVida1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaCertificadoVida1x1() {
        return labelFechaCertificadoVida1x1;
    }

    public void setLabelFechaCertificadoVida1x1(Label l) {
        this.labelFechaCertificadoVida1x1 = l;
    }

    private Calendar campoFechaCertificadoVida1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaCertificadoVida1() {
        return campoFechaCertificadoVida1;
    }

    public void setCampoFechaCertificadoVida1(Calendar component) {
        this.campoFechaCertificadoVida1 = component;
    }

    private Calendar campoFechaCertificadoVida1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaCertificadoVida1x1() {
        return campoFechaCertificadoVida1x1;
    }

    public void setCampoFechaCertificadoVida1x1(Calendar component) {
        this.campoFechaCertificadoVida1x1 = component;
    }

    private HelpInline helpInlineFechaCertificadoVida1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaCertificadoVida1() {
        return helpInlineFechaCertificadoVida1;
    }

    public void setHelpInlineFechaCertificadoVida1(HelpInline hi) {
        this.helpInlineFechaCertificadoVida1 = hi;
    }

    private HelpInline helpInlineFechaCertificadoVida1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaCertificadoVida1x1() {
        return helpInlineFechaCertificadoVida1x1;
    }

    public void setHelpInlineFechaCertificadoVida1x1(HelpInline hi) {
        this.helpInlineFechaCertificadoVida1x1 = hi;
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
  
    private Label labelEsCertificadoVidaAnulado1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsCertificadoVidaAnulado1() {
        return labelEsCertificadoVidaAnulado1;
    }

    public void setLabelEsCertificadoVidaAnulado1(Label l) {
        this.labelEsCertificadoVidaAnulado1 = l;
    }

    private Label labelEsCertificadoVidaAnulado1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsCertificadoVidaAnulado1x1() {
        return labelEsCertificadoVidaAnulado1x1;
    }

    public void setLabelEsCertificadoVidaAnulado1x1(Label l) {
        this.labelEsCertificadoVidaAnulado1x1 = l;
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

    private HelpInline helpInlineEsCertificadoVidaAnulado1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsCertificadoVidaAnulado1() {
        return helpInlineEsCertificadoVidaAnulado1;
    }

    public void setHelpInlineEsCertificadoVidaAnulado1(HelpInline hi) {
        this.helpInlineEsCertificadoVidaAnulado1 = hi;
    }

    private HelpInline helpInlineEsCertificadoVidaAnulado1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsCertificadoVidaAnulado1x1() {
        return helpInlineEsCertificadoVidaAnulado1x1;
    }

    public void setHelpInlineEsCertificadoVidaAnulado1x1(HelpInline hi) {
        this.helpInlineEsCertificadoVidaAnulado1x1 = hi;
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
  
    private Label labelComentariosAnulCerVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAnulCerVida1() {
        return labelComentariosAnulCerVida1;
    }

    public void setLabelComentariosAnulCerVida1(Label l) {
        this.labelComentariosAnulCerVida1 = l;
    }

    private Label labelComentariosAnulCerVida1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAnulCerVida1x1() {
        return labelComentariosAnulCerVida1x1;
    }

    public void setLabelComentariosAnulCerVida1x1(Label l) {
        this.labelComentariosAnulCerVida1x1 = l;
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

    private HelpInline helpInlineComentariosAnulCerVida1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosAnulCerVida1() {
        return helpInlineComentariosAnulCerVida1;
    }

    public void setHelpInlineComentariosAnulCerVida1(HelpInline hi) {
        this.helpInlineComentariosAnulCerVida1 = hi;
    }

    private HelpInline helpInlineComentariosAnulCerVida1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosAnulCerVida1x1() {
        return helpInlineComentariosAnulCerVida1x1;
    }

    public void setHelpInlineComentariosAnulCerVida1x1(HelpInline hi) {
        this.helpInlineComentariosAnulCerVida1x1 = hi;
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
  
    private Label labelCertificadoDefuncion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCertificadoDefuncion1() {
        return labelCertificadoDefuncion1;
    }

    public void setLabelCertificadoDefuncion1(Label l) {
        this.labelCertificadoDefuncion1 = l;
    }

    private Label labelCertificadoDefuncion1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCertificadoDefuncion1x1() {
        return labelCertificadoDefuncion1x1;
    }

    public void setLabelCertificadoDefuncion1x1(Label l) {
        this.labelCertificadoDefuncion1x1 = l;
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

    private HelpInline helpInlineCertificadoDefuncion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCertificadoDefuncion1() {
        return helpInlineCertificadoDefuncion1;
    }

    public void setHelpInlineCertificadoDefuncion1(HelpInline hi) {
        this.helpInlineCertificadoDefuncion1 = hi;
    }

    private HelpInline helpInlineCertificadoDefuncion1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCertificadoDefuncion1x1() {
        return helpInlineCertificadoDefuncion1x1;
    }

    public void setHelpInlineCertificadoDefuncion1x1(HelpInline hi) {
        this.helpInlineCertificadoDefuncion1x1 = hi;
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
  
    private Label labelFechaCertificadoDefuncion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaCertificadoDefuncion1() {
        return labelFechaCertificadoDefuncion1;
    }

    public void setLabelFechaCertificadoDefuncion1(Label l) {
        this.labelFechaCertificadoDefuncion1 = l;
    }

    private Label labelFechaCertificadoDefuncion1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaCertificadoDefuncion1x1() {
        return labelFechaCertificadoDefuncion1x1;
    }

    public void setLabelFechaCertificadoDefuncion1x1(Label l) {
        this.labelFechaCertificadoDefuncion1x1 = l;
    }

    private Calendar campoFechaCertificadoDefuncion1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaCertificadoDefuncion1() {
        return campoFechaCertificadoDefuncion1;
    }

    public void setCampoFechaCertificadoDefuncion1(Calendar component) {
        this.campoFechaCertificadoDefuncion1 = component;
    }

    private Calendar campoFechaCertificadoDefuncion1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaCertificadoDefuncion1x1() {
        return campoFechaCertificadoDefuncion1x1;
    }

    public void setCampoFechaCertificadoDefuncion1x1(Calendar component) {
        this.campoFechaCertificadoDefuncion1x1 = component;
    }

    private HelpInline helpInlineFechaCertificadoDefuncion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaCertificadoDefuncion1() {
        return helpInlineFechaCertificadoDefuncion1;
    }

    public void setHelpInlineFechaCertificadoDefuncion1(HelpInline hi) {
        this.helpInlineFechaCertificadoDefuncion1 = hi;
    }

    private HelpInline helpInlineFechaCertificadoDefuncion1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaCertificadoDefuncion1x1() {
        return helpInlineFechaCertificadoDefuncion1x1;
    }

    public void setHelpInlineFechaCertificadoDefuncion1x1(HelpInline hi) {
        this.helpInlineFechaCertificadoDefuncion1x1 = hi;
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
  
    private Label labelEsCerDefuncionAnulado1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsCerDefuncionAnulado1() {
        return labelEsCerDefuncionAnulado1;
    }

    public void setLabelEsCerDefuncionAnulado1(Label l) {
        this.labelEsCerDefuncionAnulado1 = l;
    }

    private Label labelEsCerDefuncionAnulado1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsCerDefuncionAnulado1x1() {
        return labelEsCerDefuncionAnulado1x1;
    }

    public void setLabelEsCerDefuncionAnulado1x1(Label l) {
        this.labelEsCerDefuncionAnulado1x1 = l;
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

    private HelpInline helpInlineEsCerDefuncionAnulado1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsCerDefuncionAnulado1() {
        return helpInlineEsCerDefuncionAnulado1;
    }

    public void setHelpInlineEsCerDefuncionAnulado1(HelpInline hi) {
        this.helpInlineEsCerDefuncionAnulado1 = hi;
    }

    private HelpInline helpInlineEsCerDefuncionAnulado1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsCerDefuncionAnulado1x1() {
        return helpInlineEsCerDefuncionAnulado1x1;
    }

    public void setHelpInlineEsCerDefuncionAnulado1x1(HelpInline hi) {
        this.helpInlineEsCerDefuncionAnulado1x1 = hi;
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
  
    private Label labelComentariosAnulCerDefuncion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAnulCerDefuncion1() {
        return labelComentariosAnulCerDefuncion1;
    }

    public void setLabelComentariosAnulCerDefuncion1(Label l) {
        this.labelComentariosAnulCerDefuncion1 = l;
    }

    private Label labelComentariosAnulCerDefuncion1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAnulCerDefuncion1x1() {
        return labelComentariosAnulCerDefuncion1x1;
    }

    public void setLabelComentariosAnulCerDefuncion1x1(Label l) {
        this.labelComentariosAnulCerDefuncion1x1 = l;
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

    private HelpInline helpInlineComentariosAnulCerDefuncion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosAnulCerDefuncion1() {
        return helpInlineComentariosAnulCerDefuncion1;
    }

    public void setHelpInlineComentariosAnulCerDefuncion1(HelpInline hi) {
        this.helpInlineComentariosAnulCerDefuncion1 = hi;
    }

    private HelpInline helpInlineComentariosAnulCerDefuncion1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosAnulCerDefuncion1x1() {
        return helpInlineComentariosAnulCerDefuncion1x1;
    }

    public void setHelpInlineComentariosAnulCerDefuncion1x1(HelpInline hi) {
        this.helpInlineComentariosAnulCerDefuncion1x1 = hi;
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
  
    private Label labelEsPersonaConEmpleo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConEmpleo1() {
        return labelEsPersonaConEmpleo1;
    }

    public void setLabelEsPersonaConEmpleo1(Label l) {
        this.labelEsPersonaConEmpleo1 = l;
    }

    private Label labelEsPersonaConEmpleo1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConEmpleo1x1() {
        return labelEsPersonaConEmpleo1x1;
    }

    public void setLabelEsPersonaConEmpleo1x1(Label l) {
        this.labelEsPersonaConEmpleo1x1 = l;
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

    private HelpInline helpInlineEsPersonaConEmpleo1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConEmpleo1() {
        return helpInlineEsPersonaConEmpleo1;
    }

    public void setHelpInlineEsPersonaConEmpleo1(HelpInline hi) {
        this.helpInlineEsPersonaConEmpleo1 = hi;
    }

    private HelpInline helpInlineEsPersonaConEmpleo1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConEmpleo1x1() {
        return helpInlineEsPersonaConEmpleo1x1;
    }

    public void setHelpInlineEsPersonaConEmpleo1x1(HelpInline hi) {
        this.helpInlineEsPersonaConEmpleo1x1 = hi;
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
  
    private Label labelEsPersonaConJubilacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConJubilacion1() {
        return labelEsPersonaConJubilacion1;
    }

    public void setLabelEsPersonaConJubilacion1(Label l) {
        this.labelEsPersonaConJubilacion1 = l;
    }

    private Label labelEsPersonaConJubilacion1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConJubilacion1x1() {
        return labelEsPersonaConJubilacion1x1;
    }

    public void setLabelEsPersonaConJubilacion1x1(Label l) {
        this.labelEsPersonaConJubilacion1x1 = l;
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

    private HelpInline helpInlineEsPersonaConJubilacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConJubilacion1() {
        return helpInlineEsPersonaConJubilacion1;
    }

    public void setHelpInlineEsPersonaConJubilacion1(HelpInline hi) {
        this.helpInlineEsPersonaConJubilacion1 = hi;
    }

    private HelpInline helpInlineEsPersonaConJubilacion1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConJubilacion1x1() {
        return helpInlineEsPersonaConJubilacion1x1;
    }

    public void setHelpInlineEsPersonaConJubilacion1x1(HelpInline hi) {
        this.helpInlineEsPersonaConJubilacion1x1 = hi;
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
  
    private Label labelEsPersonaConPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConPension1() {
        return labelEsPersonaConPension1;
    }

    public void setLabelEsPersonaConPension1(Label l) {
        this.labelEsPersonaConPension1 = l;
    }

    private Label labelEsPersonaConPension1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConPension1x1() {
        return labelEsPersonaConPension1x1;
    }

    public void setLabelEsPersonaConPension1x1(Label l) {
        this.labelEsPersonaConPension1x1 = l;
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

    private HelpInline helpInlineEsPersonaConPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConPension1() {
        return helpInlineEsPersonaConPension1;
    }

    public void setHelpInlineEsPersonaConPension1(HelpInline hi) {
        this.helpInlineEsPersonaConPension1 = hi;
    }

    private HelpInline helpInlineEsPersonaConPension1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConPension1x1() {
        return helpInlineEsPersonaConPension1x1;
    }

    public void setHelpInlineEsPersonaConPension1x1(HelpInline hi) {
        this.helpInlineEsPersonaConPension1x1 = hi;
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
  
    private Label labelEsPersonaConSubsidio1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConSubsidio1() {
        return labelEsPersonaConSubsidio1;
    }

    public void setLabelEsPersonaConSubsidio1(Label l) {
        this.labelEsPersonaConSubsidio1 = l;
    }

    private Label labelEsPersonaConSubsidio1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConSubsidio1x1() {
        return labelEsPersonaConSubsidio1x1;
    }

    public void setLabelEsPersonaConSubsidio1x1(Label l) {
        this.labelEsPersonaConSubsidio1x1 = l;
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

    private HelpInline helpInlineEsPersonaConSubsidio1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConSubsidio1() {
        return helpInlineEsPersonaConSubsidio1;
    }

    public void setHelpInlineEsPersonaConSubsidio1(HelpInline hi) {
        this.helpInlineEsPersonaConSubsidio1 = hi;
    }

    private HelpInline helpInlineEsPersonaConSubsidio1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConSubsidio1x1() {
        return helpInlineEsPersonaConSubsidio1x1;
    }

    public void setHelpInlineEsPersonaConSubsidio1x1(HelpInline hi) {
        this.helpInlineEsPersonaConSubsidio1x1 = hi;
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
  
    private Label labelEsPersonaConDeuda1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConDeuda1() {
        return labelEsPersonaConDeuda1;
    }

    public void setLabelEsPersonaConDeuda1(Label l) {
        this.labelEsPersonaConDeuda1 = l;
    }

    private Label labelEsPersonaConDeuda1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConDeuda1x1() {
        return labelEsPersonaConDeuda1x1;
    }

    public void setLabelEsPersonaConDeuda1x1(Label l) {
        this.labelEsPersonaConDeuda1x1 = l;
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

    private HelpInline helpInlineEsPersonaConDeuda1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConDeuda1() {
        return helpInlineEsPersonaConDeuda1;
    }

    public void setHelpInlineEsPersonaConDeuda1(HelpInline hi) {
        this.helpInlineEsPersonaConDeuda1 = hi;
    }

    private HelpInline helpInlineEsPersonaConDeuda1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConDeuda1x1() {
        return helpInlineEsPersonaConDeuda1x1;
    }

    public void setHelpInlineEsPersonaConDeuda1x1(HelpInline hi) {
        this.helpInlineEsPersonaConDeuda1x1 = hi;
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
  
    private Label labelEsPersonaConPenaJudicial1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConPenaJudicial1() {
        return labelEsPersonaConPenaJudicial1;
    }

    public void setLabelEsPersonaConPenaJudicial1(Label l) {
        this.labelEsPersonaConPenaJudicial1 = l;
    }

    private Label labelEsPersonaConPenaJudicial1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConPenaJudicial1x1() {
        return labelEsPersonaConPenaJudicial1x1;
    }

    public void setLabelEsPersonaConPenaJudicial1x1(Label l) {
        this.labelEsPersonaConPenaJudicial1x1 = l;
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

    private HelpInline helpInlineEsPersonaConPenaJudicial1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConPenaJudicial1() {
        return helpInlineEsPersonaConPenaJudicial1;
    }

    public void setHelpInlineEsPersonaConPenaJudicial1(HelpInline hi) {
        this.helpInlineEsPersonaConPenaJudicial1 = hi;
    }

    private HelpInline helpInlineEsPersonaConPenaJudicial1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConPenaJudicial1x1() {
        return helpInlineEsPersonaConPenaJudicial1x1;
    }

    public void setHelpInlineEsPersonaConPenaJudicial1x1(HelpInline hi) {
        this.helpInlineEsPersonaConPenaJudicial1x1 = hi;
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
  
    private Label labelEsPersonaConCerVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConCerVida1() {
        return labelEsPersonaConCerVida1;
    }

    public void setLabelEsPersonaConCerVida1(Label l) {
        this.labelEsPersonaConCerVida1 = l;
    }

    private Label labelEsPersonaConCerVida1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConCerVida1x1() {
        return labelEsPersonaConCerVida1x1;
    }

    public void setLabelEsPersonaConCerVida1x1(Label l) {
        this.labelEsPersonaConCerVida1x1 = l;
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

    private HelpInline helpInlineEsPersonaConCerVida1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConCerVida1() {
        return helpInlineEsPersonaConCerVida1;
    }

    public void setHelpInlineEsPersonaConCerVida1(HelpInline hi) {
        this.helpInlineEsPersonaConCerVida1 = hi;
    }

    private HelpInline helpInlineEsPersonaConCerVida1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConCerVida1x1() {
        return helpInlineEsPersonaConCerVida1x1;
    }

    public void setHelpInlineEsPersonaConCerVida1x1(HelpInline hi) {
        this.helpInlineEsPersonaConCerVida1x1 = hi;
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
  
    private Label labelEsPersonaConCartaRenuncia1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConCartaRenuncia1() {
        return labelEsPersonaConCartaRenuncia1;
    }

    public void setLabelEsPersonaConCartaRenuncia1(Label l) {
        this.labelEsPersonaConCartaRenuncia1 = l;
    }

    private Label labelEsPersonaConCartaRenuncia1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConCartaRenuncia1x1() {
        return labelEsPersonaConCartaRenuncia1x1;
    }

    public void setLabelEsPersonaConCartaRenuncia1x1(Label l) {
        this.labelEsPersonaConCartaRenuncia1x1 = l;
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

    private HelpInline helpInlineEsPersonaConCartaRenuncia1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConCartaRenuncia1() {
        return helpInlineEsPersonaConCartaRenuncia1;
    }

    public void setHelpInlineEsPersonaConCartaRenuncia1(HelpInline hi) {
        this.helpInlineEsPersonaConCartaRenuncia1 = hi;
    }

    private HelpInline helpInlineEsPersonaConCartaRenuncia1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConCartaRenuncia1x1() {
        return helpInlineEsPersonaConCartaRenuncia1x1;
    }

    public void setHelpInlineEsPersonaConCartaRenuncia1x1(HelpInline hi) {
        this.helpInlineEsPersonaConCartaRenuncia1x1 = hi;
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
  
    private Label labelEsPersonaElegibleParaPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaElegibleParaPen1() {
        return labelEsPersonaElegibleParaPen1;
    }

    public void setLabelEsPersonaElegibleParaPen1(Label l) {
        this.labelEsPersonaElegibleParaPen1 = l;
    }

    private Label labelEsPersonaElegibleParaPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaElegibleParaPen1x1() {
        return labelEsPersonaElegibleParaPen1x1;
    }

    public void setLabelEsPersonaElegibleParaPen1x1(Label l) {
        this.labelEsPersonaElegibleParaPen1x1 = l;
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

    private HelpInline helpInlineEsPersonaElegibleParaPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaElegibleParaPen1() {
        return helpInlineEsPersonaElegibleParaPen1;
    }

    public void setHelpInlineEsPersonaElegibleParaPen1(HelpInline hi) {
        this.helpInlineEsPersonaElegibleParaPen1 = hi;
    }

    private HelpInline helpInlineEsPersonaElegibleParaPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaElegibleParaPen1x1() {
        return helpInlineEsPersonaElegibleParaPen1x1;
    }

    public void setHelpInlineEsPersonaElegibleParaPen1x1(HelpInline hi) {
        this.helpInlineEsPersonaElegibleParaPen1x1 = hi;
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
  
    private Label labelEsPersonaAcreditadaParaPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaAcreditadaParaPen1() {
        return labelEsPersonaAcreditadaParaPen1;
    }

    public void setLabelEsPersonaAcreditadaParaPen1(Label l) {
        this.labelEsPersonaAcreditadaParaPen1 = l;
    }

    private Label labelEsPersonaAcreditadaParaPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaAcreditadaParaPen1x1() {
        return labelEsPersonaAcreditadaParaPen1x1;
    }

    public void setLabelEsPersonaAcreditadaParaPen1x1(Label l) {
        this.labelEsPersonaAcreditadaParaPen1x1 = l;
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

    private HelpInline helpInlineEsPersonaAcreditadaParaPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaAcreditadaParaPen1() {
        return helpInlineEsPersonaAcreditadaParaPen1;
    }

    public void setHelpInlineEsPersonaAcreditadaParaPen1(HelpInline hi) {
        this.helpInlineEsPersonaAcreditadaParaPen1 = hi;
    }

    private HelpInline helpInlineEsPersonaAcreditadaParaPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaAcreditadaParaPen1x1() {
        return helpInlineEsPersonaAcreditadaParaPen1x1;
    }

    public void setHelpInlineEsPersonaAcreditadaParaPen1x1(HelpInline hi) {
        this.helpInlineEsPersonaAcreditadaParaPen1x1 = hi;
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
  
    private Label labelEsPersonaConCopiaCedula1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConCopiaCedula1() {
        return labelEsPersonaConCopiaCedula1;
    }

    public void setLabelEsPersonaConCopiaCedula1(Label l) {
        this.labelEsPersonaConCopiaCedula1 = l;
    }

    private Label labelEsPersonaConCopiaCedula1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConCopiaCedula1x1() {
        return labelEsPersonaConCopiaCedula1x1;
    }

    public void setLabelEsPersonaConCopiaCedula1x1(Label l) {
        this.labelEsPersonaConCopiaCedula1x1 = l;
    }

    private DropDown listaEsPersonaConCopiaCedula1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPersonaConCopiaCedula1() {
        return listaEsPersonaConCopiaCedula1;
    }

    public void setListaEsPersonaConCopiaCedula1(DropDown component) {
        this.listaEsPersonaConCopiaCedula1 = component;
    }

    private DropDown listaEsPersonaConCopiaCedula1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPersonaConCopiaCedula1x1() {
        return listaEsPersonaConCopiaCedula1x1;
    }

    public void setListaEsPersonaConCopiaCedula1x1(DropDown component) {
        this.listaEsPersonaConCopiaCedula1x1 = component;
    }

    private HelpInline helpInlineEsPersonaConCopiaCedula1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConCopiaCedula1() {
        return helpInlineEsPersonaConCopiaCedula1;
    }

    public void setHelpInlineEsPersonaConCopiaCedula1(HelpInline hi) {
        this.helpInlineEsPersonaConCopiaCedula1 = hi;
    }

    private HelpInline helpInlineEsPersonaConCopiaCedula1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConCopiaCedula1x1() {
        return helpInlineEsPersonaConCopiaCedula1x1;
    }

    public void setHelpInlineEsPersonaConCopiaCedula1x1(HelpInline hi) {
        this.helpInlineEsPersonaConCopiaCedula1x1 = hi;
    }

    private StaticText listaEsPersonaConCopiaCedula1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConCopiaCedula1Texto1() {
        return listaEsPersonaConCopiaCedula1Texto1;
    }

    public void setListaEsPersonaConCopiaCedula1Texto1(StaticText component) {
        this.listaEsPersonaConCopiaCedula1Texto1 = component;
    }

    private StaticText listaEsPersonaConCopiaCedula1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConCopiaCedula1x1Texto1() {
        return listaEsPersonaConCopiaCedula1x1Texto1;
    }

    public void setListaEsPersonaConCopiaCedula1x1Texto1(StaticText component) {
        this.listaEsPersonaConCopiaCedula1x1Texto1 = component;
    }

    private IntegerConverter converterEsPersonaConCopiaCedula1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPersonaConCopiaCedula1() {
        return converterEsPersonaConCopiaCedula1;
    }
  
    public void setConverterEsPersonaConCopiaCedula1(IntegerConverter converter) {
        this.converterEsPersonaConCopiaCedula1 = converter;
    }
  
    private Label labelEsPersonaConDeclaracionJur1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConDeclaracionJur1() {
        return labelEsPersonaConDeclaracionJur1;
    }

    public void setLabelEsPersonaConDeclaracionJur1(Label l) {
        this.labelEsPersonaConDeclaracionJur1 = l;
    }

    private Label labelEsPersonaConDeclaracionJur1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPersonaConDeclaracionJur1x1() {
        return labelEsPersonaConDeclaracionJur1x1;
    }

    public void setLabelEsPersonaConDeclaracionJur1x1(Label l) {
        this.labelEsPersonaConDeclaracionJur1x1 = l;
    }

    private DropDown listaEsPersonaConDeclaracionJur1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsPersonaConDeclaracionJur1() {
        return listaEsPersonaConDeclaracionJur1;
    }

    public void setListaEsPersonaConDeclaracionJur1(DropDown component) {
        this.listaEsPersonaConDeclaracionJur1 = component;
    }

    private DropDown listaEsPersonaConDeclaracionJur1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsPersonaConDeclaracionJur1x1() {
        return listaEsPersonaConDeclaracionJur1x1;
    }

    public void setListaEsPersonaConDeclaracionJur1x1(DropDown component) {
        this.listaEsPersonaConDeclaracionJur1x1 = component;
    }

    private HelpInline helpInlineEsPersonaConDeclaracionJur1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConDeclaracionJur1() {
        return helpInlineEsPersonaConDeclaracionJur1;
    }

    public void setHelpInlineEsPersonaConDeclaracionJur1(HelpInline hi) {
        this.helpInlineEsPersonaConDeclaracionJur1 = hi;
    }

    private HelpInline helpInlineEsPersonaConDeclaracionJur1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPersonaConDeclaracionJur1x1() {
        return helpInlineEsPersonaConDeclaracionJur1x1;
    }

    public void setHelpInlineEsPersonaConDeclaracionJur1x1(HelpInline hi) {
        this.helpInlineEsPersonaConDeclaracionJur1x1 = hi;
    }

    private StaticText listaEsPersonaConDeclaracionJur1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConDeclaracionJur1Texto1() {
        return listaEsPersonaConDeclaracionJur1Texto1;
    }

    public void setListaEsPersonaConDeclaracionJur1Texto1(StaticText component) {
        this.listaEsPersonaConDeclaracionJur1Texto1 = component;
    }

    private StaticText listaEsPersonaConDeclaracionJur1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsPersonaConDeclaracionJur1x1Texto1() {
        return listaEsPersonaConDeclaracionJur1x1Texto1;
    }

    public void setListaEsPersonaConDeclaracionJur1x1Texto1(StaticText component) {
        this.listaEsPersonaConDeclaracionJur1x1Texto1 = component;
    }

    private IntegerConverter converterEsPersonaConDeclaracionJur1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsPersonaConDeclaracionJur1() {
        return converterEsPersonaConDeclaracionJur1;
    }
  
    public void setConverterEsPersonaConDeclaracionJur1(IntegerConverter converter) {
        this.converterEsPersonaConDeclaracionJur1 = converter;
    }
  
    private Label labelMontoPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoPension1() {
        return labelMontoPension1;
    }

    public void setLabelMontoPension1(Label l) {
        this.labelMontoPension1 = l;
    }

    private Label labelMontoPension1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoPension1x1() {
        return labelMontoPension1x1;
    }

    public void setLabelMontoPension1x1(Label l) {
        this.labelMontoPension1x1 = l;
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

    private HelpInline helpInlineMontoPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoPension1() {
        return helpInlineMontoPension1;
    }

    public void setHelpInlineMontoPension1(HelpInline hi) {
        this.helpInlineMontoPension1 = hi;
    }

    private HelpInline helpInlineMontoPension1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoPension1x1() {
        return helpInlineMontoPension1x1;
    }

    public void setHelpInlineMontoPension1x1(HelpInline hi) {
        this.helpInlineMontoPension1x1 = hi;
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
  
    private Label labelNumeroCondicionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionPension1() {
        return labelNumeroCondicionPension1;
    }

    public void setLabelNumeroCondicionPension1(Label l) {
        this.labelNumeroCondicionPension1 = l;
    }

    private Label labelNumeroCondicionPension1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionPension1x1() {
        return labelNumeroCondicionPension1x1;
    }

    public void setLabelNumeroCondicionPension1x1(Label l) {
        this.labelNumeroCondicionPension1x1 = l;
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

    private HelpInline helpInlineNumeroCondicionPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCondicionPension1() {
        return helpInlineNumeroCondicionPension1;
    }

    public void setHelpInlineNumeroCondicionPension1(HelpInline hi) {
        this.helpInlineNumeroCondicionPension1 = hi;
    }

    private HelpInline helpInlineNumeroCondicionPension1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCondicionPension1x1() {
        return helpInlineNumeroCondicionPension1x1;
    }

    public void setHelpInlineNumeroCondicionPension1x1(HelpInline hi) {
        this.helpInlineNumeroCondicionPension1x1 = hi;
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
  
    private Label labelFechaSolicitudPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaSolicitudPension1() {
        return labelFechaSolicitudPension1;
    }

    public void setLabelFechaSolicitudPension1(Label l) {
        this.labelFechaSolicitudPension1 = l;
    }

    private Label labelFechaSolicitudPension1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaSolicitudPension1x1() {
        return labelFechaSolicitudPension1x1;
    }

    public void setLabelFechaSolicitudPension1x1(Label l) {
        this.labelFechaSolicitudPension1x1 = l;
    }

    private Calendar campoFechaSolicitudPension1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaSolicitudPension1() {
        return campoFechaSolicitudPension1;
    }

    public void setCampoFechaSolicitudPension1(Calendar component) {
        this.campoFechaSolicitudPension1 = component;
    }

    private Calendar campoFechaSolicitudPension1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaSolicitudPension1x1() {
        return campoFechaSolicitudPension1x1;
    }

    public void setCampoFechaSolicitudPension1x1(Calendar component) {
        this.campoFechaSolicitudPension1x1 = component;
    }

    private HelpInline helpInlineFechaSolicitudPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaSolicitudPension1() {
        return helpInlineFechaSolicitudPension1;
    }

    public void setHelpInlineFechaSolicitudPension1(HelpInline hi) {
        this.helpInlineFechaSolicitudPension1 = hi;
    }

    private HelpInline helpInlineFechaSolicitudPension1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaSolicitudPension1x1() {
        return helpInlineFechaSolicitudPension1x1;
    }

    public void setHelpInlineFechaSolicitudPension1x1(HelpInline hi) {
        this.helpInlineFechaSolicitudPension1x1 = hi;
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
  
    private Label labelComentariosSolicitudPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosSolicitudPension1() {
        return labelComentariosSolicitudPension1;
    }

    public void setLabelComentariosSolicitudPension1(Label l) {
        this.labelComentariosSolicitudPension1 = l;
    }

    private Label labelComentariosSolicitudPension1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosSolicitudPension1x1() {
        return labelComentariosSolicitudPension1x1;
    }

    public void setLabelComentariosSolicitudPension1x1(Label l) {
        this.labelComentariosSolicitudPension1x1 = l;
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

    private HelpInline helpInlineComentariosSolicitudPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosSolicitudPension1() {
        return helpInlineComentariosSolicitudPension1;
    }

    public void setHelpInlineComentariosSolicitudPension1(HelpInline hi) {
        this.helpInlineComentariosSolicitudPension1 = hi;
    }

    private HelpInline helpInlineComentariosSolicitudPension1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosSolicitudPension1x1() {
        return helpInlineComentariosSolicitudPension1x1;
    }

    public void setHelpInlineComentariosSolicitudPension1x1(HelpInline hi) {
        this.helpInlineComentariosSolicitudPension1x1 = hi;
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
  
    private Label labelFechaAprobacionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaAprobacionPension1() {
        return labelFechaAprobacionPension1;
    }

    public void setLabelFechaAprobacionPension1(Label l) {
        this.labelFechaAprobacionPension1 = l;
    }

    private Label labelFechaAprobacionPension1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaAprobacionPension1x1() {
        return labelFechaAprobacionPension1x1;
    }

    public void setLabelFechaAprobacionPension1x1(Label l) {
        this.labelFechaAprobacionPension1x1 = l;
    }

    private Calendar campoFechaAprobacionPension1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaAprobacionPension1() {
        return campoFechaAprobacionPension1;
    }

    public void setCampoFechaAprobacionPension1(Calendar component) {
        this.campoFechaAprobacionPension1 = component;
    }

    private Calendar campoFechaAprobacionPension1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaAprobacionPension1x1() {
        return campoFechaAprobacionPension1x1;
    }

    public void setCampoFechaAprobacionPension1x1(Calendar component) {
        this.campoFechaAprobacionPension1x1 = component;
    }

    private HelpInline helpInlineFechaAprobacionPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaAprobacionPension1() {
        return helpInlineFechaAprobacionPension1;
    }

    public void setHelpInlineFechaAprobacionPension1(HelpInline hi) {
        this.helpInlineFechaAprobacionPension1 = hi;
    }

    private HelpInline helpInlineFechaAprobacionPension1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaAprobacionPension1x1() {
        return helpInlineFechaAprobacionPension1x1;
    }

    public void setHelpInlineFechaAprobacionPension1x1(HelpInline hi) {
        this.helpInlineFechaAprobacionPension1x1 = hi;
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
  
    private Label labelComentariosAprobacionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAprobacionPension1() {
        return labelComentariosAprobacionPension1;
    }

    public void setLabelComentariosAprobacionPension1(Label l) {
        this.labelComentariosAprobacionPension1 = l;
    }

    private Label labelComentariosAprobacionPension1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAprobacionPension1x1() {
        return labelComentariosAprobacionPension1x1;
    }

    public void setLabelComentariosAprobacionPension1x1(Label l) {
        this.labelComentariosAprobacionPension1x1 = l;
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

    private HelpInline helpInlineComentariosAprobacionPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosAprobacionPension1() {
        return helpInlineComentariosAprobacionPension1;
    }

    public void setHelpInlineComentariosAprobacionPension1(HelpInline hi) {
        this.helpInlineComentariosAprobacionPension1 = hi;
    }

    private HelpInline helpInlineComentariosAprobacionPension1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosAprobacionPension1x1() {
        return helpInlineComentariosAprobacionPension1x1;
    }

    public void setHelpInlineComentariosAprobacionPension1x1(HelpInline hi) {
        this.helpInlineComentariosAprobacionPension1x1 = hi;
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
  
    private Label labelFechaOtorgamientoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaOtorgamientoPen1() {
        return labelFechaOtorgamientoPen1;
    }

    public void setLabelFechaOtorgamientoPen1(Label l) {
        this.labelFechaOtorgamientoPen1 = l;
    }

    private Label labelFechaOtorgamientoPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaOtorgamientoPen1x1() {
        return labelFechaOtorgamientoPen1x1;
    }

    public void setLabelFechaOtorgamientoPen1x1(Label l) {
        this.labelFechaOtorgamientoPen1x1 = l;
    }

    private Calendar campoFechaOtorgamientoPen1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaOtorgamientoPen1() {
        return campoFechaOtorgamientoPen1;
    }

    public void setCampoFechaOtorgamientoPen1(Calendar component) {
        this.campoFechaOtorgamientoPen1 = component;
    }

    private Calendar campoFechaOtorgamientoPen1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaOtorgamientoPen1x1() {
        return campoFechaOtorgamientoPen1x1;
    }

    public void setCampoFechaOtorgamientoPen1x1(Calendar component) {
        this.campoFechaOtorgamientoPen1x1 = component;
    }

    private HelpInline helpInlineFechaOtorgamientoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaOtorgamientoPen1() {
        return helpInlineFechaOtorgamientoPen1;
    }

    public void setHelpInlineFechaOtorgamientoPen1(HelpInline hi) {
        this.helpInlineFechaOtorgamientoPen1 = hi;
    }

    private HelpInline helpInlineFechaOtorgamientoPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaOtorgamientoPen1x1() {
        return helpInlineFechaOtorgamientoPen1x1;
    }

    public void setHelpInlineFechaOtorgamientoPen1x1(HelpInline hi) {
        this.helpInlineFechaOtorgamientoPen1x1 = hi;
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
  
    private Label labelComentariosOtorgamientoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosOtorgamientoPen1() {
        return labelComentariosOtorgamientoPen1;
    }

    public void setLabelComentariosOtorgamientoPen1(Label l) {
        this.labelComentariosOtorgamientoPen1 = l;
    }

    private Label labelComentariosOtorgamientoPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosOtorgamientoPen1x1() {
        return labelComentariosOtorgamientoPen1x1;
    }

    public void setLabelComentariosOtorgamientoPen1x1(Label l) {
        this.labelComentariosOtorgamientoPen1x1 = l;
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

    private HelpInline helpInlineComentariosOtorgamientoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosOtorgamientoPen1() {
        return helpInlineComentariosOtorgamientoPen1;
    }

    public void setHelpInlineComentariosOtorgamientoPen1(HelpInline hi) {
        this.helpInlineComentariosOtorgamientoPen1 = hi;
    }

    private HelpInline helpInlineComentariosOtorgamientoPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosOtorgamientoPen1x1() {
        return helpInlineComentariosOtorgamientoPen1x1;
    }

    public void setHelpInlineComentariosOtorgamientoPen1x1(HelpInline hi) {
        this.helpInlineComentariosOtorgamientoPen1x1 = hi;
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
  
    private Label labelFechaDenegacionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaDenegacionPension1() {
        return labelFechaDenegacionPension1;
    }

    public void setLabelFechaDenegacionPension1(Label l) {
        this.labelFechaDenegacionPension1 = l;
    }

    private Label labelFechaDenegacionPension1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaDenegacionPension1x1() {
        return labelFechaDenegacionPension1x1;
    }

    public void setLabelFechaDenegacionPension1x1(Label l) {
        this.labelFechaDenegacionPension1x1 = l;
    }

    private Calendar campoFechaDenegacionPension1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaDenegacionPension1() {
        return campoFechaDenegacionPension1;
    }

    public void setCampoFechaDenegacionPension1(Calendar component) {
        this.campoFechaDenegacionPension1 = component;
    }

    private Calendar campoFechaDenegacionPension1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaDenegacionPension1x1() {
        return campoFechaDenegacionPension1x1;
    }

    public void setCampoFechaDenegacionPension1x1(Calendar component) {
        this.campoFechaDenegacionPension1x1 = component;
    }

    private HelpInline helpInlineFechaDenegacionPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaDenegacionPension1() {
        return helpInlineFechaDenegacionPension1;
    }

    public void setHelpInlineFechaDenegacionPension1(HelpInline hi) {
        this.helpInlineFechaDenegacionPension1 = hi;
    }

    private HelpInline helpInlineFechaDenegacionPension1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaDenegacionPension1x1() {
        return helpInlineFechaDenegacionPension1x1;
    }

    public void setHelpInlineFechaDenegacionPension1x1(HelpInline hi) {
        this.helpInlineFechaDenegacionPension1x1 = hi;
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
  
    private Label labelNumeroCausaDenPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaDenPension1() {
        return labelNumeroCausaDenPension1;
    }

    public void setLabelNumeroCausaDenPension1(Label l) {
        this.labelNumeroCausaDenPension1 = l;
    }

    private Label labelNumeroCausaDenPension1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaDenPension1x1() {
        return labelNumeroCausaDenPension1x1;
    }

    public void setLabelNumeroCausaDenPension1x1(Label l) {
        this.labelNumeroCausaDenPension1x1 = l;
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

    private HelpInline helpInlineNumeroCausaDenPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaDenPension1() {
        return helpInlineNumeroCausaDenPension1;
    }

    public void setHelpInlineNumeroCausaDenPension1(HelpInline hi) {
        this.helpInlineNumeroCausaDenPension1 = hi;
    }

    private HelpInline helpInlineNumeroCausaDenPension1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaDenPension1x1() {
        return helpInlineNumeroCausaDenPension1x1;
    }

    public void setHelpInlineNumeroCausaDenPension1x1(HelpInline hi) {
        this.helpInlineNumeroCausaDenPension1x1 = hi;
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
  
    private Label labelOtraCausaDenPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaDenPension1() {
        return labelOtraCausaDenPension1;
    }

    public void setLabelOtraCausaDenPension1(Label l) {
        this.labelOtraCausaDenPension1 = l;
    }

    private Label labelOtraCausaDenPension1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaDenPension1x1() {
        return labelOtraCausaDenPension1x1;
    }

    public void setLabelOtraCausaDenPension1x1(Label l) {
        this.labelOtraCausaDenPension1x1 = l;
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

    private HelpInline helpInlineOtraCausaDenPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaDenPension1() {
        return helpInlineOtraCausaDenPension1;
    }

    public void setHelpInlineOtraCausaDenPension1(HelpInline hi) {
        this.helpInlineOtraCausaDenPension1 = hi;
    }

    private HelpInline helpInlineOtraCausaDenPension1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaDenPension1x1() {
        return helpInlineOtraCausaDenPension1x1;
    }

    public void setHelpInlineOtraCausaDenPension1x1(HelpInline hi) {
        this.helpInlineOtraCausaDenPension1x1 = hi;
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
  
    private Label labelComentariosDenegacionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosDenegacionPension1() {
        return labelComentariosDenegacionPension1;
    }

    public void setLabelComentariosDenegacionPension1(Label l) {
        this.labelComentariosDenegacionPension1 = l;
    }

    private Label labelComentariosDenegacionPension1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosDenegacionPension1x1() {
        return labelComentariosDenegacionPension1x1;
    }

    public void setLabelComentariosDenegacionPension1x1(Label l) {
        this.labelComentariosDenegacionPension1x1 = l;
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

    private HelpInline helpInlineComentariosDenegacionPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosDenegacionPension1() {
        return helpInlineComentariosDenegacionPension1;
    }

    public void setHelpInlineComentariosDenegacionPension1(HelpInline hi) {
        this.helpInlineComentariosDenegacionPension1 = hi;
    }

    private HelpInline helpInlineComentariosDenegacionPension1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosDenegacionPension1x1() {
        return helpInlineComentariosDenegacionPension1x1;
    }

    public void setHelpInlineComentariosDenegacionPension1x1(HelpInline hi) {
        this.helpInlineComentariosDenegacionPension1x1 = hi;
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
  
    private Label labelFechaRevocacionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaRevocacionPension1() {
        return labelFechaRevocacionPension1;
    }

    public void setLabelFechaRevocacionPension1(Label l) {
        this.labelFechaRevocacionPension1 = l;
    }

    private Label labelFechaRevocacionPension1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaRevocacionPension1x1() {
        return labelFechaRevocacionPension1x1;
    }

    public void setLabelFechaRevocacionPension1x1(Label l) {
        this.labelFechaRevocacionPension1x1 = l;
    }

    private Calendar campoFechaRevocacionPension1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaRevocacionPension1() {
        return campoFechaRevocacionPension1;
    }

    public void setCampoFechaRevocacionPension1(Calendar component) {
        this.campoFechaRevocacionPension1 = component;
    }

    private Calendar campoFechaRevocacionPension1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaRevocacionPension1x1() {
        return campoFechaRevocacionPension1x1;
    }

    public void setCampoFechaRevocacionPension1x1(Calendar component) {
        this.campoFechaRevocacionPension1x1 = component;
    }

    private HelpInline helpInlineFechaRevocacionPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaRevocacionPension1() {
        return helpInlineFechaRevocacionPension1;
    }

    public void setHelpInlineFechaRevocacionPension1(HelpInline hi) {
        this.helpInlineFechaRevocacionPension1 = hi;
    }

    private HelpInline helpInlineFechaRevocacionPension1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaRevocacionPension1x1() {
        return helpInlineFechaRevocacionPension1x1;
    }

    public void setHelpInlineFechaRevocacionPension1x1(HelpInline hi) {
        this.helpInlineFechaRevocacionPension1x1 = hi;
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
  
    private Label labelNumeroCausaRevPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaRevPension1() {
        return labelNumeroCausaRevPension1;
    }

    public void setLabelNumeroCausaRevPension1(Label l) {
        this.labelNumeroCausaRevPension1 = l;
    }

    private Label labelNumeroCausaRevPension1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaRevPension1x1() {
        return labelNumeroCausaRevPension1x1;
    }

    public void setLabelNumeroCausaRevPension1x1(Label l) {
        this.labelNumeroCausaRevPension1x1 = l;
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

    private HelpInline helpInlineNumeroCausaRevPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaRevPension1() {
        return helpInlineNumeroCausaRevPension1;
    }

    public void setHelpInlineNumeroCausaRevPension1(HelpInline hi) {
        this.helpInlineNumeroCausaRevPension1 = hi;
    }

    private HelpInline helpInlineNumeroCausaRevPension1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaRevPension1x1() {
        return helpInlineNumeroCausaRevPension1x1;
    }

    public void setHelpInlineNumeroCausaRevPension1x1(HelpInline hi) {
        this.helpInlineNumeroCausaRevPension1x1 = hi;
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
  
    private Label labelOtraCausaRevPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaRevPension1() {
        return labelOtraCausaRevPension1;
    }

    public void setLabelOtraCausaRevPension1(Label l) {
        this.labelOtraCausaRevPension1 = l;
    }

    private Label labelOtraCausaRevPension1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaRevPension1x1() {
        return labelOtraCausaRevPension1x1;
    }

    public void setLabelOtraCausaRevPension1x1(Label l) {
        this.labelOtraCausaRevPension1x1 = l;
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

    private HelpInline helpInlineOtraCausaRevPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaRevPension1() {
        return helpInlineOtraCausaRevPension1;
    }

    public void setHelpInlineOtraCausaRevPension1(HelpInline hi) {
        this.helpInlineOtraCausaRevPension1 = hi;
    }

    private HelpInline helpInlineOtraCausaRevPension1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaRevPension1x1() {
        return helpInlineOtraCausaRevPension1x1;
    }

    public void setHelpInlineOtraCausaRevPension1x1(HelpInline hi) {
        this.helpInlineOtraCausaRevPension1x1 = hi;
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
  
    private Label labelComentariosRevocacionPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosRevocacionPension1() {
        return labelComentariosRevocacionPension1;
    }

    public void setLabelComentariosRevocacionPension1(Label l) {
        this.labelComentariosRevocacionPension1 = l;
    }

    private Label labelComentariosRevocacionPension1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosRevocacionPension1x1() {
        return labelComentariosRevocacionPension1x1;
    }

    public void setLabelComentariosRevocacionPension1x1(Label l) {
        this.labelComentariosRevocacionPension1x1 = l;
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

    private HelpInline helpInlineComentariosRevocacionPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosRevocacionPension1() {
        return helpInlineComentariosRevocacionPension1;
    }

    public void setHelpInlineComentariosRevocacionPension1(HelpInline hi) {
        this.helpInlineComentariosRevocacionPension1 = hi;
    }

    private HelpInline helpInlineComentariosRevocacionPension1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosRevocacionPension1x1() {
        return helpInlineComentariosRevocacionPension1x1;
    }

    public void setHelpInlineComentariosRevocacionPension1x1(HelpInline hi) {
        this.helpInlineComentariosRevocacionPension1x1 = hi;
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
  
    private Label labelNumeroCondicionRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionRecoPen1() {
        return labelNumeroCondicionRecoPen1;
    }

    public void setLabelNumeroCondicionRecoPen1(Label l) {
        this.labelNumeroCondicionRecoPen1 = l;
    }

    private Label labelNumeroCondicionRecoPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionRecoPen1x1() {
        return labelNumeroCondicionRecoPen1x1;
    }

    public void setLabelNumeroCondicionRecoPen1x1(Label l) {
        this.labelNumeroCondicionRecoPen1x1 = l;
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

    private HelpInline helpInlineNumeroCondicionRecoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCondicionRecoPen1() {
        return helpInlineNumeroCondicionRecoPen1;
    }

    public void setHelpInlineNumeroCondicionRecoPen1(HelpInline hi) {
        this.helpInlineNumeroCondicionRecoPen1 = hi;
    }

    private HelpInline helpInlineNumeroCondicionRecoPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCondicionRecoPen1x1() {
        return helpInlineNumeroCondicionRecoPen1x1;
    }

    public void setHelpInlineNumeroCondicionRecoPen1x1(HelpInline hi) {
        this.helpInlineNumeroCondicionRecoPen1x1 = hi;
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
  
    private Label labelFechaSolicitudRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaSolicitudRecoPen1() {
        return labelFechaSolicitudRecoPen1;
    }

    public void setLabelFechaSolicitudRecoPen1(Label l) {
        this.labelFechaSolicitudRecoPen1 = l;
    }

    private Label labelFechaSolicitudRecoPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaSolicitudRecoPen1x1() {
        return labelFechaSolicitudRecoPen1x1;
    }

    public void setLabelFechaSolicitudRecoPen1x1(Label l) {
        this.labelFechaSolicitudRecoPen1x1 = l;
    }

    private Calendar campoFechaSolicitudRecoPen1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaSolicitudRecoPen1() {
        return campoFechaSolicitudRecoPen1;
    }

    public void setCampoFechaSolicitudRecoPen1(Calendar component) {
        this.campoFechaSolicitudRecoPen1 = component;
    }

    private Calendar campoFechaSolicitudRecoPen1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaSolicitudRecoPen1x1() {
        return campoFechaSolicitudRecoPen1x1;
    }

    public void setCampoFechaSolicitudRecoPen1x1(Calendar component) {
        this.campoFechaSolicitudRecoPen1x1 = component;
    }

    private HelpInline helpInlineFechaSolicitudRecoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaSolicitudRecoPen1() {
        return helpInlineFechaSolicitudRecoPen1;
    }

    public void setHelpInlineFechaSolicitudRecoPen1(HelpInline hi) {
        this.helpInlineFechaSolicitudRecoPen1 = hi;
    }

    private HelpInline helpInlineFechaSolicitudRecoPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaSolicitudRecoPen1x1() {
        return helpInlineFechaSolicitudRecoPen1x1;
    }

    public void setHelpInlineFechaSolicitudRecoPen1x1(HelpInline hi) {
        this.helpInlineFechaSolicitudRecoPen1x1 = hi;
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
  
    private Label labelComentariosSolicitudRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosSolicitudRecoPen1() {
        return labelComentariosSolicitudRecoPen1;
    }

    public void setLabelComentariosSolicitudRecoPen1(Label l) {
        this.labelComentariosSolicitudRecoPen1 = l;
    }

    private Label labelComentariosSolicitudRecoPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosSolicitudRecoPen1x1() {
        return labelComentariosSolicitudRecoPen1x1;
    }

    public void setLabelComentariosSolicitudRecoPen1x1(Label l) {
        this.labelComentariosSolicitudRecoPen1x1 = l;
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

    private HelpInline helpInlineComentariosSolicitudRecoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosSolicitudRecoPen1() {
        return helpInlineComentariosSolicitudRecoPen1;
    }

    public void setHelpInlineComentariosSolicitudRecoPen1(HelpInline hi) {
        this.helpInlineComentariosSolicitudRecoPen1 = hi;
    }

    private HelpInline helpInlineComentariosSolicitudRecoPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosSolicitudRecoPen1x1() {
        return helpInlineComentariosSolicitudRecoPen1x1;
    }

    public void setHelpInlineComentariosSolicitudRecoPen1x1(HelpInline hi) {
        this.helpInlineComentariosSolicitudRecoPen1x1 = hi;
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
  
    private Label labelFechaAprobacionRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaAprobacionRecoPen1() {
        return labelFechaAprobacionRecoPen1;
    }

    public void setLabelFechaAprobacionRecoPen1(Label l) {
        this.labelFechaAprobacionRecoPen1 = l;
    }

    private Label labelFechaAprobacionRecoPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaAprobacionRecoPen1x1() {
        return labelFechaAprobacionRecoPen1x1;
    }

    public void setLabelFechaAprobacionRecoPen1x1(Label l) {
        this.labelFechaAprobacionRecoPen1x1 = l;
    }

    private Calendar campoFechaAprobacionRecoPen1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaAprobacionRecoPen1() {
        return campoFechaAprobacionRecoPen1;
    }

    public void setCampoFechaAprobacionRecoPen1(Calendar component) {
        this.campoFechaAprobacionRecoPen1 = component;
    }

    private Calendar campoFechaAprobacionRecoPen1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaAprobacionRecoPen1x1() {
        return campoFechaAprobacionRecoPen1x1;
    }

    public void setCampoFechaAprobacionRecoPen1x1(Calendar component) {
        this.campoFechaAprobacionRecoPen1x1 = component;
    }

    private HelpInline helpInlineFechaAprobacionRecoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaAprobacionRecoPen1() {
        return helpInlineFechaAprobacionRecoPen1;
    }

    public void setHelpInlineFechaAprobacionRecoPen1(HelpInline hi) {
        this.helpInlineFechaAprobacionRecoPen1 = hi;
    }

    private HelpInline helpInlineFechaAprobacionRecoPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaAprobacionRecoPen1x1() {
        return helpInlineFechaAprobacionRecoPen1x1;
    }

    public void setHelpInlineFechaAprobacionRecoPen1x1(HelpInline hi) {
        this.helpInlineFechaAprobacionRecoPen1x1 = hi;
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
  
    private Label labelComentariosAprRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAprRecoPen1() {
        return labelComentariosAprRecoPen1;
    }

    public void setLabelComentariosAprRecoPen1(Label l) {
        this.labelComentariosAprRecoPen1 = l;
    }

    private Label labelComentariosAprRecoPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAprRecoPen1x1() {
        return labelComentariosAprRecoPen1x1;
    }

    public void setLabelComentariosAprRecoPen1x1(Label l) {
        this.labelComentariosAprRecoPen1x1 = l;
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

    private HelpInline helpInlineComentariosAprRecoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosAprRecoPen1() {
        return helpInlineComentariosAprRecoPen1;
    }

    public void setHelpInlineComentariosAprRecoPen1(HelpInline hi) {
        this.helpInlineComentariosAprRecoPen1 = hi;
    }

    private HelpInline helpInlineComentariosAprRecoPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosAprRecoPen1x1() {
        return helpInlineComentariosAprRecoPen1x1;
    }

    public void setHelpInlineComentariosAprRecoPen1x1(HelpInline hi) {
        this.helpInlineComentariosAprRecoPen1x1 = hi;
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
  
    private Label labelFechaDenegacionRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaDenegacionRecoPen1() {
        return labelFechaDenegacionRecoPen1;
    }

    public void setLabelFechaDenegacionRecoPen1(Label l) {
        this.labelFechaDenegacionRecoPen1 = l;
    }

    private Label labelFechaDenegacionRecoPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaDenegacionRecoPen1x1() {
        return labelFechaDenegacionRecoPen1x1;
    }

    public void setLabelFechaDenegacionRecoPen1x1(Label l) {
        this.labelFechaDenegacionRecoPen1x1 = l;
    }

    private Calendar campoFechaDenegacionRecoPen1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaDenegacionRecoPen1() {
        return campoFechaDenegacionRecoPen1;
    }

    public void setCampoFechaDenegacionRecoPen1(Calendar component) {
        this.campoFechaDenegacionRecoPen1 = component;
    }

    private Calendar campoFechaDenegacionRecoPen1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaDenegacionRecoPen1x1() {
        return campoFechaDenegacionRecoPen1x1;
    }

    public void setCampoFechaDenegacionRecoPen1x1(Calendar component) {
        this.campoFechaDenegacionRecoPen1x1 = component;
    }

    private HelpInline helpInlineFechaDenegacionRecoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaDenegacionRecoPen1() {
        return helpInlineFechaDenegacionRecoPen1;
    }

    public void setHelpInlineFechaDenegacionRecoPen1(HelpInline hi) {
        this.helpInlineFechaDenegacionRecoPen1 = hi;
    }

    private HelpInline helpInlineFechaDenegacionRecoPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaDenegacionRecoPen1x1() {
        return helpInlineFechaDenegacionRecoPen1x1;
    }

    public void setHelpInlineFechaDenegacionRecoPen1x1(HelpInline hi) {
        this.helpInlineFechaDenegacionRecoPen1x1 = hi;
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
  
    private Label labelNumeroCausaDenRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaDenRecoPen1() {
        return labelNumeroCausaDenRecoPen1;
    }

    public void setLabelNumeroCausaDenRecoPen1(Label l) {
        this.labelNumeroCausaDenRecoPen1 = l;
    }

    private Label labelNumeroCausaDenRecoPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaDenRecoPen1x1() {
        return labelNumeroCausaDenRecoPen1x1;
    }

    public void setLabelNumeroCausaDenRecoPen1x1(Label l) {
        this.labelNumeroCausaDenRecoPen1x1 = l;
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

    private HelpInline helpInlineNumeroCausaDenRecoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaDenRecoPen1() {
        return helpInlineNumeroCausaDenRecoPen1;
    }

    public void setHelpInlineNumeroCausaDenRecoPen1(HelpInline hi) {
        this.helpInlineNumeroCausaDenRecoPen1 = hi;
    }

    private HelpInline helpInlineNumeroCausaDenRecoPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaDenRecoPen1x1() {
        return helpInlineNumeroCausaDenRecoPen1x1;
    }

    public void setHelpInlineNumeroCausaDenRecoPen1x1(HelpInline hi) {
        this.helpInlineNumeroCausaDenRecoPen1x1 = hi;
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
  
    private Label labelOtraCausaDenRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaDenRecoPen1() {
        return labelOtraCausaDenRecoPen1;
    }

    public void setLabelOtraCausaDenRecoPen1(Label l) {
        this.labelOtraCausaDenRecoPen1 = l;
    }

    private Label labelOtraCausaDenRecoPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaDenRecoPen1x1() {
        return labelOtraCausaDenRecoPen1x1;
    }

    public void setLabelOtraCausaDenRecoPen1x1(Label l) {
        this.labelOtraCausaDenRecoPen1x1 = l;
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

    private HelpInline helpInlineOtraCausaDenRecoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaDenRecoPen1() {
        return helpInlineOtraCausaDenRecoPen1;
    }

    public void setHelpInlineOtraCausaDenRecoPen1(HelpInline hi) {
        this.helpInlineOtraCausaDenRecoPen1 = hi;
    }

    private HelpInline helpInlineOtraCausaDenRecoPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaDenRecoPen1x1() {
        return helpInlineOtraCausaDenRecoPen1x1;
    }

    public void setHelpInlineOtraCausaDenRecoPen1x1(HelpInline hi) {
        this.helpInlineOtraCausaDenRecoPen1x1 = hi;
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
  
    private Label labelComentariosDenRecoPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosDenRecoPen1() {
        return labelComentariosDenRecoPen1;
    }

    public void setLabelComentariosDenRecoPen1(Label l) {
        this.labelComentariosDenRecoPen1 = l;
    }

    private Label labelComentariosDenRecoPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosDenRecoPen1x1() {
        return labelComentariosDenRecoPen1x1;
    }

    public void setLabelComentariosDenRecoPen1x1(Label l) {
        this.labelComentariosDenRecoPen1x1 = l;
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

    private HelpInline helpInlineComentariosDenRecoPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosDenRecoPen1() {
        return helpInlineComentariosDenRecoPen1;
    }

    public void setHelpInlineComentariosDenRecoPen1(HelpInline hi) {
        this.helpInlineComentariosDenRecoPen1 = hi;
    }

    private HelpInline helpInlineComentariosDenRecoPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosDenRecoPen1x1() {
        return helpInlineComentariosDenRecoPen1x1;
    }

    public void setHelpInlineComentariosDenRecoPen1x1(HelpInline hi) {
        this.helpInlineComentariosDenRecoPen1x1 = hi;
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
  
    private Label labelNumeroCondicionDenuPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionDenuPen1() {
        return labelNumeroCondicionDenuPen1;
    }

    public void setLabelNumeroCondicionDenuPen1(Label l) {
        this.labelNumeroCondicionDenuPen1 = l;
    }

    private Label labelNumeroCondicionDenuPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionDenuPen1x1() {
        return labelNumeroCondicionDenuPen1x1;
    }

    public void setLabelNumeroCondicionDenuPen1x1(Label l) {
        this.labelNumeroCondicionDenuPen1x1 = l;
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

    private HelpInline helpInlineNumeroCondicionDenuPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCondicionDenuPen1() {
        return helpInlineNumeroCondicionDenuPen1;
    }

    public void setHelpInlineNumeroCondicionDenuPen1(HelpInline hi) {
        this.helpInlineNumeroCondicionDenuPen1 = hi;
    }

    private HelpInline helpInlineNumeroCondicionDenuPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCondicionDenuPen1x1() {
        return helpInlineNumeroCondicionDenuPen1x1;
    }

    public void setHelpInlineNumeroCondicionDenuPen1x1(HelpInline hi) {
        this.helpInlineNumeroCondicionDenuPen1x1 = hi;
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
  
    private Label labelFechaRegistroDenunciaPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaRegistroDenunciaPen1() {
        return labelFechaRegistroDenunciaPen1;
    }

    public void setLabelFechaRegistroDenunciaPen1(Label l) {
        this.labelFechaRegistroDenunciaPen1 = l;
    }

    private Label labelFechaRegistroDenunciaPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaRegistroDenunciaPen1x1() {
        return labelFechaRegistroDenunciaPen1x1;
    }

    public void setLabelFechaRegistroDenunciaPen1x1(Label l) {
        this.labelFechaRegistroDenunciaPen1x1 = l;
    }

    private Calendar campoFechaRegistroDenunciaPen1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaRegistroDenunciaPen1() {
        return campoFechaRegistroDenunciaPen1;
    }

    public void setCampoFechaRegistroDenunciaPen1(Calendar component) {
        this.campoFechaRegistroDenunciaPen1 = component;
    }

    private Calendar campoFechaRegistroDenunciaPen1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaRegistroDenunciaPen1x1() {
        return campoFechaRegistroDenunciaPen1x1;
    }

    public void setCampoFechaRegistroDenunciaPen1x1(Calendar component) {
        this.campoFechaRegistroDenunciaPen1x1 = component;
    }

    private HelpInline helpInlineFechaRegistroDenunciaPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaRegistroDenunciaPen1() {
        return helpInlineFechaRegistroDenunciaPen1;
    }

    public void setHelpInlineFechaRegistroDenunciaPen1(HelpInline hi) {
        this.helpInlineFechaRegistroDenunciaPen1 = hi;
    }

    private HelpInline helpInlineFechaRegistroDenunciaPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaRegistroDenunciaPen1x1() {
        return helpInlineFechaRegistroDenunciaPen1x1;
    }

    public void setHelpInlineFechaRegistroDenunciaPen1x1(HelpInline hi) {
        this.helpInlineFechaRegistroDenunciaPen1x1 = hi;
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
  
    private Label labelComentariosRegistroDenuPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosRegistroDenuPen1() {
        return labelComentariosRegistroDenuPen1;
    }

    public void setLabelComentariosRegistroDenuPen1(Label l) {
        this.labelComentariosRegistroDenuPen1 = l;
    }

    private Label labelComentariosRegistroDenuPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosRegistroDenuPen1x1() {
        return labelComentariosRegistroDenuPen1x1;
    }

    public void setLabelComentariosRegistroDenuPen1x1(Label l) {
        this.labelComentariosRegistroDenuPen1x1 = l;
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

    private HelpInline helpInlineComentariosRegistroDenuPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosRegistroDenuPen1() {
        return helpInlineComentariosRegistroDenuPen1;
    }

    public void setHelpInlineComentariosRegistroDenuPen1(HelpInline hi) {
        this.helpInlineComentariosRegistroDenuPen1 = hi;
    }

    private HelpInline helpInlineComentariosRegistroDenuPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosRegistroDenuPen1x1() {
        return helpInlineComentariosRegistroDenuPen1x1;
    }

    public void setHelpInlineComentariosRegistroDenuPen1x1(HelpInline hi) {
        this.helpInlineComentariosRegistroDenuPen1x1 = hi;
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
  
    private Label labelFechaConfirmacionDenuPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaConfirmacionDenuPen1() {
        return labelFechaConfirmacionDenuPen1;
    }

    public void setLabelFechaConfirmacionDenuPen1(Label l) {
        this.labelFechaConfirmacionDenuPen1 = l;
    }

    private Label labelFechaConfirmacionDenuPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaConfirmacionDenuPen1x1() {
        return labelFechaConfirmacionDenuPen1x1;
    }

    public void setLabelFechaConfirmacionDenuPen1x1(Label l) {
        this.labelFechaConfirmacionDenuPen1x1 = l;
    }

    private Calendar campoFechaConfirmacionDenuPen1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaConfirmacionDenuPen1() {
        return campoFechaConfirmacionDenuPen1;
    }

    public void setCampoFechaConfirmacionDenuPen1(Calendar component) {
        this.campoFechaConfirmacionDenuPen1 = component;
    }

    private Calendar campoFechaConfirmacionDenuPen1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaConfirmacionDenuPen1x1() {
        return campoFechaConfirmacionDenuPen1x1;
    }

    public void setCampoFechaConfirmacionDenuPen1x1(Calendar component) {
        this.campoFechaConfirmacionDenuPen1x1 = component;
    }

    private HelpInline helpInlineFechaConfirmacionDenuPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaConfirmacionDenuPen1() {
        return helpInlineFechaConfirmacionDenuPen1;
    }

    public void setHelpInlineFechaConfirmacionDenuPen1(HelpInline hi) {
        this.helpInlineFechaConfirmacionDenuPen1 = hi;
    }

    private HelpInline helpInlineFechaConfirmacionDenuPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaConfirmacionDenuPen1x1() {
        return helpInlineFechaConfirmacionDenuPen1x1;
    }

    public void setHelpInlineFechaConfirmacionDenuPen1x1(HelpInline hi) {
        this.helpInlineFechaConfirmacionDenuPen1x1 = hi;
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
  
    private Label labelComentariosConfDenuPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosConfDenuPen1() {
        return labelComentariosConfDenuPen1;
    }

    public void setLabelComentariosConfDenuPen1(Label l) {
        this.labelComentariosConfDenuPen1 = l;
    }

    private Label labelComentariosConfDenuPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosConfDenuPen1x1() {
        return labelComentariosConfDenuPen1x1;
    }

    public void setLabelComentariosConfDenuPen1x1(Label l) {
        this.labelComentariosConfDenuPen1x1 = l;
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

    private HelpInline helpInlineComentariosConfDenuPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosConfDenuPen1() {
        return helpInlineComentariosConfDenuPen1;
    }

    public void setHelpInlineComentariosConfDenuPen1(HelpInline hi) {
        this.helpInlineComentariosConfDenuPen1 = hi;
    }

    private HelpInline helpInlineComentariosConfDenuPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosConfDenuPen1x1() {
        return helpInlineComentariosConfDenuPen1x1;
    }

    public void setHelpInlineComentariosConfDenuPen1x1(HelpInline hi) {
        this.helpInlineComentariosConfDenuPen1x1 = hi;
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
  
    private Label labelFechaDesmentidoDenunciaPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaDesmentidoDenunciaPen1() {
        return labelFechaDesmentidoDenunciaPen1;
    }

    public void setLabelFechaDesmentidoDenunciaPen1(Label l) {
        this.labelFechaDesmentidoDenunciaPen1 = l;
    }

    private Label labelFechaDesmentidoDenunciaPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaDesmentidoDenunciaPen1x1() {
        return labelFechaDesmentidoDenunciaPen1x1;
    }

    public void setLabelFechaDesmentidoDenunciaPen1x1(Label l) {
        this.labelFechaDesmentidoDenunciaPen1x1 = l;
    }

    private Calendar campoFechaDesmentidoDenunciaPen1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaDesmentidoDenunciaPen1() {
        return campoFechaDesmentidoDenunciaPen1;
    }

    public void setCampoFechaDesmentidoDenunciaPen1(Calendar component) {
        this.campoFechaDesmentidoDenunciaPen1 = component;
    }

    private Calendar campoFechaDesmentidoDenunciaPen1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaDesmentidoDenunciaPen1x1() {
        return campoFechaDesmentidoDenunciaPen1x1;
    }

    public void setCampoFechaDesmentidoDenunciaPen1x1(Calendar component) {
        this.campoFechaDesmentidoDenunciaPen1x1 = component;
    }

    private HelpInline helpInlineFechaDesmentidoDenunciaPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaDesmentidoDenunciaPen1() {
        return helpInlineFechaDesmentidoDenunciaPen1;
    }

    public void setHelpInlineFechaDesmentidoDenunciaPen1(HelpInline hi) {
        this.helpInlineFechaDesmentidoDenunciaPen1 = hi;
    }

    private HelpInline helpInlineFechaDesmentidoDenunciaPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaDesmentidoDenunciaPen1x1() {
        return helpInlineFechaDesmentidoDenunciaPen1x1;
    }

    public void setHelpInlineFechaDesmentidoDenunciaPen1x1(HelpInline hi) {
        this.helpInlineFechaDesmentidoDenunciaPen1x1 = hi;
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
  
    private Label labelComentariosDesDenuPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosDesDenuPen1() {
        return labelComentariosDesDenuPen1;
    }

    public void setLabelComentariosDesDenuPen1(Label l) {
        this.labelComentariosDesDenuPen1 = l;
    }

    private Label labelComentariosDesDenuPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosDesDenuPen1x1() {
        return labelComentariosDesDenuPen1x1;
    }

    public void setLabelComentariosDesDenuPen1x1(Label l) {
        this.labelComentariosDesDenuPen1x1 = l;
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

    private HelpInline helpInlineComentariosDesDenuPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosDesDenuPen1() {
        return helpInlineComentariosDesDenuPen1;
    }

    public void setHelpInlineComentariosDesDenuPen1(HelpInline hi) {
        this.helpInlineComentariosDesDenuPen1 = hi;
    }

    private HelpInline helpInlineComentariosDesDenuPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosDesDenuPen1x1() {
        return helpInlineComentariosDesDenuPen1x1;
    }

    public void setHelpInlineComentariosDesDenuPen1x1(HelpInline hi) {
        this.helpInlineComentariosDesDenuPen1x1 = hi;
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
  
    private Label labelIdFichaPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaPersona1() {
        return labelIdFichaPersona1;
    }

    public void setLabelIdFichaPersona1(Label l) {
        this.labelIdFichaPersona1 = l;
    }

    private Label labelIdFichaPersona1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaPersona1x1() {
        return labelIdFichaPersona1x1;
    }

    public void setLabelIdFichaPersona1x1(Label l) {
        this.labelIdFichaPersona1x1 = l;
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

    private HelpInline helpInlineIdFichaPersona1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFichaPersona1() {
        return helpInlineIdFichaPersona1;
    }

    public void setHelpInlineIdFichaPersona1(HelpInline hi) {
        this.helpInlineIdFichaPersona1 = hi;
    }

    private HelpInline helpInlineIdFichaPersona1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFichaPersona1x1() {
        return helpInlineIdFichaPersona1x1;
    }

    public void setHelpInlineIdFichaPersona1x1(HelpInline hi) {
        this.helpInlineIdFichaPersona1x1 = hi;
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

    private Label labelIdFichaPersona2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaPersona2() {
        return labelIdFichaPersona2;
    }

    public void setLabelIdFichaPersona2(Label l) {
        this.labelIdFichaPersona2 = l;
    }

    private Label labelIdFichaPersona1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaPersona1x2() {
        return labelIdFichaPersona1x2;
    }

    public void setLabelIdFichaPersona1x2(Label l) {
        this.labelIdFichaPersona1x2 = l;
    }

    private StaticText campoIdFichaPersona1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFichaPersona1Texto2() {
        return campoIdFichaPersona1Texto2;
    }

    public void setCampoIdFichaPersona1Texto2(StaticText component) {
        this.campoIdFichaPersona1Texto2 = component;
    }

    private StaticText campoIdFichaPersona1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFichaPersona1x1Texto2() {
        return campoIdFichaPersona1x1Texto2;
    }

    public void setCampoIdFichaPersona1x1Texto2(StaticText component) {
        this.campoIdFichaPersona1x1Texto2 = component;
    }

    private Button campoIdFichaPersona1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFichaPersona1Boton2() {
        return campoIdFichaPersona1Boton2;
    }

    public void setCampoIdFichaPersona1Boton2(Button component) {
        this.campoIdFichaPersona1Boton2 = component;
    }

    private Button campoIdFichaPersona1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFichaPersona1x1Boton2() {
        return campoIdFichaPersona1x1Boton2;
    }

    public void setCampoIdFichaPersona1x1Boton2(Button component) {
        this.campoIdFichaPersona1x1Boton2 = component;
    }

    private Label labelFechaFichaPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaFichaPersona1() {
        return labelFechaFichaPersona1;
    }

    public void setLabelFechaFichaPersona1(Label l) {
        this.labelFechaFichaPersona1 = l;
    }

    private Label labelFechaFichaPersona1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaFichaPersona1x1() {
        return labelFechaFichaPersona1x1;
    }

    public void setLabelFechaFichaPersona1x1(Label l) {
        this.labelFechaFichaPersona1x1 = l;
    }

    private Calendar campoFechaFichaPersona1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaFichaPersona1() {
        return campoFechaFichaPersona1;
    }

    public void setCampoFechaFichaPersona1(Calendar component) {
        this.campoFechaFichaPersona1 = component;
    }

    private Calendar campoFechaFichaPersona1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaFichaPersona1x1() {
        return campoFechaFichaPersona1x1;
    }

    public void setCampoFechaFichaPersona1x1(Calendar component) {
        this.campoFechaFichaPersona1x1 = component;
    }

    private HelpInline helpInlineFechaFichaPersona1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaFichaPersona1() {
        return helpInlineFechaFichaPersona1;
    }

    public void setHelpInlineFechaFichaPersona1(HelpInline hi) {
        this.helpInlineFechaFichaPersona1 = hi;
    }

    private HelpInline helpInlineFechaFichaPersona1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaFichaPersona1x1() {
        return helpInlineFechaFichaPersona1x1;
    }

    public void setHelpInlineFechaFichaPersona1x1(HelpInline hi) {
        this.helpInlineFechaFichaPersona1x1 = hi;
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
  
    private Label labelIndiceCalidadVida1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIndiceCalidadVida1() {
        return labelIndiceCalidadVida1;
    }

    public void setLabelIndiceCalidadVida1(Label l) {
        this.labelIndiceCalidadVida1 = l;
    }

    private Label labelIndiceCalidadVida1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIndiceCalidadVida1x1() {
        return labelIndiceCalidadVida1x1;
    }

    public void setLabelIndiceCalidadVida1x1(Label l) {
        this.labelIndiceCalidadVida1x1 = l;
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

    private HelpInline helpInlineIndiceCalidadVida1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIndiceCalidadVida1() {
        return helpInlineIndiceCalidadVida1;
    }

    public void setHelpInlineIndiceCalidadVida1(HelpInline hi) {
        this.helpInlineIndiceCalidadVida1 = hi;
    }

    private HelpInline helpInlineIndiceCalidadVida1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIndiceCalidadVida1x1() {
        return helpInlineIndiceCalidadVida1x1;
    }

    public void setHelpInlineIndiceCalidadVida1x1(HelpInline hi) {
        this.helpInlineIndiceCalidadVida1x1 = hi;
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
  
    private Label labelFechaUltimoCobroPension1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaUltimoCobroPension1() {
        return labelFechaUltimoCobroPension1;
    }

    public void setLabelFechaUltimoCobroPension1(Label l) {
        this.labelFechaUltimoCobroPension1 = l;
    }

    private Label labelFechaUltimoCobroPension1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaUltimoCobroPension1x1() {
        return labelFechaUltimoCobroPension1x1;
    }

    public void setLabelFechaUltimoCobroPension1x1(Label l) {
        this.labelFechaUltimoCobroPension1x1 = l;
    }

    private Calendar campoFechaUltimoCobroPension1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaUltimoCobroPension1() {
        return campoFechaUltimoCobroPension1;
    }

    public void setCampoFechaUltimoCobroPension1(Calendar component) {
        this.campoFechaUltimoCobroPension1 = component;
    }

    private Calendar campoFechaUltimoCobroPension1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaUltimoCobroPension1x1() {
        return campoFechaUltimoCobroPension1x1;
    }

    public void setCampoFechaUltimoCobroPension1x1(Calendar component) {
        this.campoFechaUltimoCobroPension1x1 = component;
    }

    private HelpInline helpInlineFechaUltimoCobroPension1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaUltimoCobroPension1() {
        return helpInlineFechaUltimoCobroPension1;
    }

    public void setHelpInlineFechaUltimoCobroPension1(HelpInline hi) {
        this.helpInlineFechaUltimoCobroPension1 = hi;
    }

    private HelpInline helpInlineFechaUltimoCobroPension1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaUltimoCobroPension1x1() {
        return helpInlineFechaUltimoCobroPension1x1;
    }

    public void setHelpInlineFechaUltimoCobroPension1x1(HelpInline hi) {
        this.helpInlineFechaUltimoCobroPension1x1 = hi;
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
  
    private Label labelNotasAnulFecUltCobPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNotasAnulFecUltCobPen1() {
        return labelNotasAnulFecUltCobPen1;
    }

    public void setLabelNotasAnulFecUltCobPen1(Label l) {
        this.labelNotasAnulFecUltCobPen1 = l;
    }

    private Label labelNotasAnulFecUltCobPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNotasAnulFecUltCobPen1x1() {
        return labelNotasAnulFecUltCobPen1x1;
    }

    public void setLabelNotasAnulFecUltCobPen1x1(Label l) {
        this.labelNotasAnulFecUltCobPen1x1 = l;
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

    private HelpInline helpInlineNotasAnulFecUltCobPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNotasAnulFecUltCobPen1() {
        return helpInlineNotasAnulFecUltCobPen1;
    }

    public void setHelpInlineNotasAnulFecUltCobPen1(HelpInline hi) {
        this.helpInlineNotasAnulFecUltCobPen1 = hi;
    }

    private HelpInline helpInlineNotasAnulFecUltCobPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNotasAnulFecUltCobPen1x1() {
        return helpInlineNotasAnulFecUltCobPen1x1;
    }

    public void setHelpInlineNotasAnulFecUltCobPen1x1(HelpInline hi) {
        this.helpInlineNotasAnulFecUltCobPen1x1 = hi;
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
  
    private Label labelNumeroTipoActJupe1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoActJupe1() {
        return labelNumeroTipoActJupe1;
    }

    public void setLabelNumeroTipoActJupe1(Label l) {
        this.labelNumeroTipoActJupe1 = l;
    }

    private Label labelNumeroTipoActJupe1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoActJupe1x1() {
        return labelNumeroTipoActJupe1x1;
    }

    public void setLabelNumeroTipoActJupe1x1(Label l) {
        this.labelNumeroTipoActJupe1x1 = l;
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

    private HelpInline helpInlineNumeroTipoActJupe1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoActJupe1() {
        return helpInlineNumeroTipoActJupe1;
    }

    public void setHelpInlineNumeroTipoActJupe1(HelpInline hi) {
        this.helpInlineNumeroTipoActJupe1 = hi;
    }

    private HelpInline helpInlineNumeroTipoActJupe1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoActJupe1x1() {
        return helpInlineNumeroTipoActJupe1x1;
    }

    public void setHelpInlineNumeroTipoActJupe1x1(HelpInline hi) {
        this.helpInlineNumeroTipoActJupe1x1 = hi;
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
  
    private Label labelFechaHoraUltActJupe1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaHoraUltActJupe1() {
        return labelFechaHoraUltActJupe1;
    }

    public void setLabelFechaHoraUltActJupe1(Label l) {
        this.labelFechaHoraUltActJupe1 = l;
    }

    private Label labelFechaHoraUltActJupe1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaHoraUltActJupe1x1() {
        return labelFechaHoraUltActJupe1x1;
    }

    public void setLabelFechaHoraUltActJupe1x1(Label l) {
        this.labelFechaHoraUltActJupe1x1 = l;
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

    private HelpInline helpInlineFechaHoraUltActJupe1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaHoraUltActJupe1() {
        return helpInlineFechaHoraUltActJupe1;
    }

    public void setHelpInlineFechaHoraUltActJupe1(HelpInline hi) {
        this.helpInlineFechaHoraUltActJupe1 = hi;
    }

    private HelpInline helpInlineFechaHoraUltActJupe1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaHoraUltActJupe1x1() {
        return helpInlineFechaHoraUltActJupe1x1;
    }

    public void setHelpInlineFechaHoraUltActJupe1x1(HelpInline hi) {
        this.helpInlineFechaHoraUltActJupe1x1 = hi;
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
  
    private Label labelNumeroResolucionOtorPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroResolucionOtorPen1() {
        return labelNumeroResolucionOtorPen1;
    }

    public void setLabelNumeroResolucionOtorPen1(Label l) {
        this.labelNumeroResolucionOtorPen1 = l;
    }

    private Label labelNumeroResolucionOtorPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroResolucionOtorPen1x1() {
        return labelNumeroResolucionOtorPen1x1;
    }

    public void setLabelNumeroResolucionOtorPen1x1(Label l) {
        this.labelNumeroResolucionOtorPen1x1 = l;
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

    private HelpInline helpInlineNumeroResolucionOtorPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroResolucionOtorPen1() {
        return helpInlineNumeroResolucionOtorPen1;
    }

    public void setHelpInlineNumeroResolucionOtorPen1(HelpInline hi) {
        this.helpInlineNumeroResolucionOtorPen1 = hi;
    }

    private HelpInline helpInlineNumeroResolucionOtorPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroResolucionOtorPen1x1() {
        return helpInlineNumeroResolucionOtorPen1x1;
    }

    public void setHelpInlineNumeroResolucionOtorPen1x1(HelpInline hi) {
        this.helpInlineNumeroResolucionOtorPen1x1 = hi;
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
  
    private Label labelFechaResolucionOtorPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaResolucionOtorPen1() {
        return labelFechaResolucionOtorPen1;
    }

    public void setLabelFechaResolucionOtorPen1(Label l) {
        this.labelFechaResolucionOtorPen1 = l;
    }

    private Label labelFechaResolucionOtorPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaResolucionOtorPen1x1() {
        return labelFechaResolucionOtorPen1x1;
    }

    public void setLabelFechaResolucionOtorPen1x1(Label l) {
        this.labelFechaResolucionOtorPen1x1 = l;
    }

    private Calendar campoFechaResolucionOtorPen1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaResolucionOtorPen1() {
        return campoFechaResolucionOtorPen1;
    }

    public void setCampoFechaResolucionOtorPen1(Calendar component) {
        this.campoFechaResolucionOtorPen1 = component;
    }

    private Calendar campoFechaResolucionOtorPen1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaResolucionOtorPen1x1() {
        return campoFechaResolucionOtorPen1x1;
    }

    public void setCampoFechaResolucionOtorPen1x1(Calendar component) {
        this.campoFechaResolucionOtorPen1x1 = component;
    }

    private HelpInline helpInlineFechaResolucionOtorPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaResolucionOtorPen1() {
        return helpInlineFechaResolucionOtorPen1;
    }

    public void setHelpInlineFechaResolucionOtorPen1(HelpInline hi) {
        this.helpInlineFechaResolucionOtorPen1 = hi;
    }

    private HelpInline helpInlineFechaResolucionOtorPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaResolucionOtorPen1x1() {
        return helpInlineFechaResolucionOtorPen1x1;
    }

    public void setHelpInlineFechaResolucionOtorPen1x1(HelpInline hi) {
        this.helpInlineFechaResolucionOtorPen1x1 = hi;
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
  
    private Label labelNumeroResolucionDenPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroResolucionDenPen1() {
        return labelNumeroResolucionDenPen1;
    }

    public void setLabelNumeroResolucionDenPen1(Label l) {
        this.labelNumeroResolucionDenPen1 = l;
    }

    private Label labelNumeroResolucionDenPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroResolucionDenPen1x1() {
        return labelNumeroResolucionDenPen1x1;
    }

    public void setLabelNumeroResolucionDenPen1x1(Label l) {
        this.labelNumeroResolucionDenPen1x1 = l;
    }

    private TextField campoNumeroResolucionDenPen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroResolucionDenPen1() {
        return campoNumeroResolucionDenPen1;
    }

    public void setCampoNumeroResolucionDenPen1(TextField component) {
        this.campoNumeroResolucionDenPen1 = component;
    }

    private TextField campoNumeroResolucionDenPen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroResolucionDenPen1x1() {
        return campoNumeroResolucionDenPen1x1;
    }

    public void setCampoNumeroResolucionDenPen1x1(TextField component) {
        this.campoNumeroResolucionDenPen1x1 = component;
    }

    private HelpInline helpInlineNumeroResolucionDenPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroResolucionDenPen1() {
        return helpInlineNumeroResolucionDenPen1;
    }

    public void setHelpInlineNumeroResolucionDenPen1(HelpInline hi) {
        this.helpInlineNumeroResolucionDenPen1 = hi;
    }

    private HelpInline helpInlineNumeroResolucionDenPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroResolucionDenPen1x1() {
        return helpInlineNumeroResolucionDenPen1x1;
    }

    public void setHelpInlineNumeroResolucionDenPen1x1(HelpInline hi) {
        this.helpInlineNumeroResolucionDenPen1x1 = hi;
    }

    private StaticText campoNumeroResolucionDenPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroResolucionDenPen1Texto1() {
        return campoNumeroResolucionDenPen1Texto1;
    }

    public void setCampoNumeroResolucionDenPen1Texto1(StaticText component) {
        this.campoNumeroResolucionDenPen1Texto1 = component;
    }

    private StaticText campoNumeroResolucionDenPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroResolucionDenPen1x1Texto1() {
        return campoNumeroResolucionDenPen1x1Texto1;
    }

    public void setCampoNumeroResolucionDenPen1x1Texto1(StaticText component) {
        this.campoNumeroResolucionDenPen1x1Texto1 = component;
    }

    private LengthValidator validatorNumeroResolucionDenPen1 = new LengthValidator();
  
    public LengthValidator getValidatorNumeroResolucionDenPen1() {
        return validatorNumeroResolucionDenPen1;
    }
  
    public void setValidatorNumeroResolucionDenPen1(LengthValidator validator) {
        this.validatorNumeroResolucionDenPen1 = validator;
    }
  
    private Label labelFechaResolucionDenPen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaResolucionDenPen1() {
        return labelFechaResolucionDenPen1;
    }

    public void setLabelFechaResolucionDenPen1(Label l) {
        this.labelFechaResolucionDenPen1 = l;
    }

    private Label labelFechaResolucionDenPen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaResolucionDenPen1x1() {
        return labelFechaResolucionDenPen1x1;
    }

    public void setLabelFechaResolucionDenPen1x1(Label l) {
        this.labelFechaResolucionDenPen1x1 = l;
    }

    private Calendar campoFechaResolucionDenPen1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaResolucionDenPen1() {
        return campoFechaResolucionDenPen1;
    }

    public void setCampoFechaResolucionDenPen1(Calendar component) {
        this.campoFechaResolucionDenPen1 = component;
    }

    private Calendar campoFechaResolucionDenPen1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaResolucionDenPen1x1() {
        return campoFechaResolucionDenPen1x1;
    }

    public void setCampoFechaResolucionDenPen1x1(Calendar component) {
        this.campoFechaResolucionDenPen1x1 = component;
    }

    private HelpInline helpInlineFechaResolucionDenPen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaResolucionDenPen1() {
        return helpInlineFechaResolucionDenPen1;
    }

    public void setHelpInlineFechaResolucionDenPen1(HelpInline hi) {
        this.helpInlineFechaResolucionDenPen1 = hi;
    }

    private HelpInline helpInlineFechaResolucionDenPen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaResolucionDenPen1x1() {
        return helpInlineFechaResolucionDenPen1x1;
    }

    public void setHelpInlineFechaResolucionDenPen1x1(HelpInline hi) {
        this.helpInlineFechaResolucionDenPen1x1 = hi;
    }

    private StaticText campoFechaResolucionDenPen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaResolucionDenPen1Texto1() {
        return campoFechaResolucionDenPen1Texto1;
    }

    public void setCampoFechaResolucionDenPen1Texto1(StaticText component) {
        this.campoFechaResolucionDenPen1Texto1 = component;
    }

    private StaticText campoFechaResolucionDenPen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaResolucionDenPen1x1Texto1() {
        return campoFechaResolucionDenPen1x1Texto1;
    }

    public void setCampoFechaResolucionDenPen1x1Texto1(StaticText component) {
        this.campoFechaResolucionDenPen1x1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaResolucionDenPen1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaResolucionDenPen1() {
        return converterFechaResolucionDenPen1;
    }
  
    public void setConverterFechaResolucionDenPen1(SqlTimestampConverter converter) {
        this.converterFechaResolucionDenPen1 = converter;
    }
  
    private Button botonIrAlPrimero2 = new com.egt.core.jsf.component.Boton();

    public Button getBotonIrAlPrimero2() {
        return botonIrAlPrimero2;
    }

    public void setBotonIrAlPrimero2(Button component) {
        this.botonIrAlPrimero2 = component;
    }

    private Button botonIrAlAnterior2 = new com.egt.core.jsf.component.Boton();

    public Button getBotonIrAlAnterior2() {
        return botonIrAlAnterior2;
    }

    public void setBotonIrAlAnterior2(Button component) {
        this.botonIrAlAnterior2 = component;
    }

    private Button botonIrAlSiguiente2 = new com.egt.core.jsf.component.Boton();

    public Button getBotonIrAlSiguiente2() {
        return botonIrAlSiguiente2;
    }

    public void setBotonIrAlSiguiente2(Button component) {
        this.botonIrAlSiguiente2 = component;
    }

    private Button botonIrAlUltimo2 = new com.egt.core.jsf.component.Boton();

    public Button getBotonIrAlUltimo2() {
        return botonIrAlUltimo2;
    }

    public void setBotonIrAlUltimo2(Button component) {
        this.botonIrAlUltimo2 = component;
    }

    private Button botonProcesarFila2 = new com.egt.core.jsf.component.Boton();

    public Button getBotonProcesarFila2() {
        return botonProcesarFila2;
    }

    public void setBotonProcesarFila2(Button b) {
        this.botonProcesarFila2 = b;
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
    public Persona6() {
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

    @Override
    public TextField getTextFieldCampoFechaResolucionDenPen1() {
        return this.getCampoFechaResolucionDenPen1();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion">
    private GestorPaginaActualizacion gestor = new GestorPaginaActualizacion(this);

    @Override
    public GestorPaginaActualizacion getGestor() {
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
    private final static String ETIQUETA_MIGAS_PAN = BundleWebui.getString("detalle");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("Persona6_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("Persona6_ETIQUETA_CLASE_MAESTRO");

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
        if (this.getContextoPeticion().getIdentificacionRecurso() != null) {
            this.getGestor().posicionar(this.getContextoPeticion().getIdentificacionRecurso());
        } else {
            this.getGestor().reposicionar();
        }

        this.setConsultaPendiente(false);
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

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para manejar el cursor">
    public String botonIrAlPrimero1_action() {
        this.getGestor().irAlPrimero();
        return null;
    }

    public String botonIrAlAnterior1_action() {
        this.getGestor().irAlAnterior();
        return null;
    }

    public String botonIrAlSiguiente1_action() {
        this.getGestor().irAlSiguiente();
        return null;
    }

    public String botonIrAlUltimo1_action() {
        this.getGestor().irAlUltimo();
        return null;
    }

    public String botonProcesarFila1_action() {
        return null;
    }

    public String getScriptAbrirVentanaProcesarFila1() {
        String urx = URX2.COMANDO_PERSONA;
        return this.getGestor().getScriptAbrirVentana(urx);
    }

    public String botonIrAlPrimero2_action() {
        this.getGestor().irAlPrimero();
        return null;
    }

    public String botonIrAlAnterior2_action() {
        this.getGestor().irAlAnterior();
        return null;
    }

    public String botonIrAlSiguiente2_action() {
        this.getGestor().irAlSiguiente();
        return null;
    }

    public String botonIrAlUltimo2_action() {
        this.getGestor().irAlUltimo();
        return null;
    }

    public String botonProcesarFila2_action() {
        return null;
    }

    public String getScriptAbrirVentanaProcesarFila2() {
        String urx = URX2.COMANDO_PERSONA;
        return this.getGestor().getScriptAbrirVentana(urx);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para refrescar, agregar, editar, deshacer y eliminar de la plantilla #2">
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
