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
package com.egt.web.gestion.censo;

import com.egt.data.specific.xdp2.PotencialBenCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.PersonaCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.EtniaIndigenaCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FuncionarioCachedRowSetDataProvider2;
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
import com.egt.ejb.business.process.PotencialBenBusinessProcessLocal;
import com.egt.ejb.core.reporter.ReporterBrokerLocal;

public class PotencialBen2 extends AbstractPageBean
        implements PaginaActualizacionPotencialBen, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
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
        potencialBenDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.potencialBenRowSet}"));
        personaReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.personaReferenceRowSet}"));
        etniaIndigenaReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.etniaIndigenaReferenceRowSet}"));
        ubicacionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.ubicacionReferenceRowSet}"));
        funcionarioReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.funcionarioReferenceRowSet}"));
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

    private HelpInline helpInlineIdPotencialBen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdPotencialBen1() {
        return helpInlineIdPotencialBen1;
    }

    public void setHelpInlineIdPotencialBen1(HelpInline hi) {
        this.helpInlineIdPotencialBen1 = hi;
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

    private HelpInline helpInlineCodigoPotencialBen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCodigoPotencialBen1() {
        return helpInlineCodigoPotencialBen1;
    }

    public void setHelpInlineCodigoPotencialBen1(HelpInline hi) {
        this.helpInlineCodigoPotencialBen1 = hi;
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

    private HelpInline helpInlineNombrePotencialBen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombrePotencialBen1() {
        return helpInlineNombrePotencialBen1;
    }

    public void setHelpInlineNombrePotencialBen1(HelpInline hi) {
        this.helpInlineNombrePotencialBen1 = hi;
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
  
    private Label labelNumeroTipoRegPotBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoRegPotBen1() {
        return labelNumeroTipoRegPotBen1;
    }

    public void setLabelNumeroTipoRegPotBen1(Label l) {
        this.labelNumeroTipoRegPotBen1 = l;
    }

    private Label labelNumeroTipoRegPotBen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoRegPotBen1x1() {
        return labelNumeroTipoRegPotBen1x1;
    }

    public void setLabelNumeroTipoRegPotBen1x1(Label l) {
        this.labelNumeroTipoRegPotBen1x1 = l;
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

    private HelpInline helpInlineNumeroTipoRegPotBen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoRegPotBen1() {
        return helpInlineNumeroTipoRegPotBen1;
    }

    public void setHelpInlineNumeroTipoRegPotBen1(HelpInline hi) {
        this.helpInlineNumeroTipoRegPotBen1 = hi;
    }

    private HelpInline helpInlineNumeroTipoRegPotBen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoRegPotBen1x1() {
        return helpInlineNumeroTipoRegPotBen1x1;
    }

    public void setHelpInlineNumeroTipoRegPotBen1x1(HelpInline hi) {
        this.helpInlineNumeroTipoRegPotBen1x1 = hi;
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
  
    private Label labelIdPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPersona1() {
        return labelIdPersona1;
    }

    public void setLabelIdPersona1(Label l) {
        this.labelIdPersona1 = l;
    }

    private Label labelIdPersona1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPersona1x1() {
        return labelIdPersona1x1;
    }

    public void setLabelIdPersona1x1(Label l) {
        this.labelIdPersona1x1 = l;
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

    private HelpInline helpInlineIdPersona1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdPersona1() {
        return helpInlineIdPersona1;
    }

    public void setHelpInlineIdPersona1(HelpInline hi) {
        this.helpInlineIdPersona1 = hi;
    }

    private HelpInline helpInlineIdPersona1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdPersona1x1() {
        return helpInlineIdPersona1x1;
    }

    public void setHelpInlineIdPersona1x1(HelpInline hi) {
        this.helpInlineIdPersona1x1 = hi;
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

    private Label labelIdPersona2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPersona2() {
        return labelIdPersona2;
    }

    public void setLabelIdPersona2(Label l) {
        this.labelIdPersona2 = l;
    }

    private Label labelIdPersona1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPersona1x2() {
        return labelIdPersona1x2;
    }

    public void setLabelIdPersona1x2(Label l) {
        this.labelIdPersona1x2 = l;
    }

    private StaticText campoIdPersona1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdPersona1Texto2() {
        return campoIdPersona1Texto2;
    }

    public void setCampoIdPersona1Texto2(StaticText component) {
        this.campoIdPersona1Texto2 = component;
    }

    private StaticText campoIdPersona1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdPersona1x1Texto2() {
        return campoIdPersona1x1Texto2;
    }

    public void setCampoIdPersona1x1Texto2(StaticText component) {
        this.campoIdPersona1x1Texto2 = component;
    }

    private Button campoIdPersona1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPersona1Boton2() {
        return campoIdPersona1Boton2;
    }

    public void setCampoIdPersona1Boton2(Button component) {
        this.campoIdPersona1Boton2 = component;
    }

    private Button campoIdPersona1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPersona1x1Boton2() {
        return campoIdPersona1x1Boton2;
    }

    public void setCampoIdPersona1x1Boton2(Button component) {
        this.campoIdPersona1x1Boton2 = component;
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
  
    private Label labelEdad1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEdad1() {
        return labelEdad1;
    }

    public void setLabelEdad1(Label l) {
        this.labelEdad1 = l;
    }

    private Label labelEdad1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEdad1x1() {
        return labelEdad1x1;
    }

    public void setLabelEdad1x1(Label l) {
        this.labelEdad1x1 = l;
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

    private HelpInline helpInlineEdad1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEdad1() {
        return helpInlineEdad1;
    }

    public void setHelpInlineEdad1(HelpInline hi) {
        this.helpInlineEdad1 = hi;
    }

    private HelpInline helpInlineEdad1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEdad1x1() {
        return helpInlineEdad1x1;
    }

    public void setHelpInlineEdad1x1(HelpInline hi) {
        this.helpInlineEdad1x1 = hi;
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

    private Label labelManzana1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelManzana1() {
        return labelManzana1;
    }

    public void setLabelManzana1(Label l) {
        this.labelManzana1 = l;
    }

    private Label labelManzana1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelManzana1x1() {
        return labelManzana1x1;
    }

    public void setLabelManzana1x1(Label l) {
        this.labelManzana1x1 = l;
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

    private HelpInline helpInlineManzana1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineManzana1() {
        return helpInlineManzana1;
    }

    public void setHelpInlineManzana1(HelpInline hi) {
        this.helpInlineManzana1 = hi;
    }

    private HelpInline helpInlineManzana1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineManzana1x1() {
        return helpInlineManzana1x1;
    }

    public void setHelpInlineManzana1x1(HelpInline hi) {
        this.helpInlineManzana1x1 = hi;
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
  
    private Label labelCompania1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCompania1() {
        return labelCompania1;
    }

    public void setLabelCompania1(Label l) {
        this.labelCompania1 = l;
    }

    private Label labelCompania1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCompania1x1() {
        return labelCompania1x1;
    }

    public void setLabelCompania1x1(Label l) {
        this.labelCompania1x1 = l;
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

    private HelpInline helpInlineCompania1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCompania1() {
        return helpInlineCompania1;
    }

    public void setHelpInlineCompania1(HelpInline hi) {
        this.helpInlineCompania1 = hi;
    }

    private HelpInline helpInlineCompania1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCompania1x1() {
        return helpInlineCompania1x1;
    }

    public void setHelpInlineCompania1x1(HelpInline hi) {
        this.helpInlineCompania1x1 = hi;
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
  
    private Label labelNombreResponsableHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreResponsableHogar1() {
        return labelNombreResponsableHogar1;
    }

    public void setLabelNombreResponsableHogar1(Label l) {
        this.labelNombreResponsableHogar1 = l;
    }

    private Label labelNombreResponsableHogar1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreResponsableHogar1x1() {
        return labelNombreResponsableHogar1x1;
    }

    public void setLabelNombreResponsableHogar1x1(Label l) {
        this.labelNombreResponsableHogar1x1 = l;
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

    private HelpInline helpInlineNombreResponsableHogar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreResponsableHogar1() {
        return helpInlineNombreResponsableHogar1;
    }

    public void setHelpInlineNombreResponsableHogar1(HelpInline hi) {
        this.helpInlineNombreResponsableHogar1 = hi;
    }

    private HelpInline helpInlineNombreResponsableHogar1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreResponsableHogar1x1() {
        return helpInlineNombreResponsableHogar1x1;
    }

    public void setHelpInlineNombreResponsableHogar1x1(HelpInline hi) {
        this.helpInlineNombreResponsableHogar1x1 = hi;
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
  
    private Label labelNumeroTelefonoRespHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTelefonoRespHogar1() {
        return labelNumeroTelefonoRespHogar1;
    }

    public void setLabelNumeroTelefonoRespHogar1(Label l) {
        this.labelNumeroTelefonoRespHogar1 = l;
    }

    private Label labelNumeroTelefonoRespHogar1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTelefonoRespHogar1x1() {
        return labelNumeroTelefonoRespHogar1x1;
    }

    public void setLabelNumeroTelefonoRespHogar1x1(Label l) {
        this.labelNumeroTelefonoRespHogar1x1 = l;
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

    private HelpInline helpInlineNumeroTelefonoRespHogar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTelefonoRespHogar1() {
        return helpInlineNumeroTelefonoRespHogar1;
    }

    public void setHelpInlineNumeroTelefonoRespHogar1(HelpInline hi) {
        this.helpInlineNumeroTelefonoRespHogar1 = hi;
    }

    private HelpInline helpInlineNumeroTelefonoRespHogar1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTelefonoRespHogar1x1() {
        return helpInlineNumeroTelefonoRespHogar1x1;
    }

    public void setHelpInlineNumeroTelefonoRespHogar1x1(HelpInline hi) {
        this.helpInlineNumeroTelefonoRespHogar1x1 = hi;
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
  
    private Label labelNombreReferente1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreReferente1() {
        return labelNombreReferente1;
    }

    public void setLabelNombreReferente1(Label l) {
        this.labelNombreReferente1 = l;
    }

    private Label labelNombreReferente1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreReferente1x1() {
        return labelNombreReferente1x1;
    }

    public void setLabelNombreReferente1x1(Label l) {
        this.labelNombreReferente1x1 = l;
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

    private HelpInline helpInlineNombreReferente1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreReferente1() {
        return helpInlineNombreReferente1;
    }

    public void setHelpInlineNombreReferente1(HelpInline hi) {
        this.helpInlineNombreReferente1 = hi;
    }

    private HelpInline helpInlineNombreReferente1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreReferente1x1() {
        return helpInlineNombreReferente1x1;
    }

    public void setHelpInlineNombreReferente1x1(HelpInline hi) {
        this.helpInlineNombreReferente1x1 = hi;
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
  
    private Label labelNumeroTelefonoReferente1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTelefonoReferente1() {
        return labelNumeroTelefonoReferente1;
    }

    public void setLabelNumeroTelefonoReferente1(Label l) {
        this.labelNumeroTelefonoReferente1 = l;
    }

    private Label labelNumeroTelefonoReferente1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTelefonoReferente1x1() {
        return labelNumeroTelefonoReferente1x1;
    }

    public void setLabelNumeroTelefonoReferente1x1(Label l) {
        this.labelNumeroTelefonoReferente1x1 = l;
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

    private HelpInline helpInlineNumeroTelefonoReferente1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTelefonoReferente1() {
        return helpInlineNumeroTelefonoReferente1;
    }

    public void setHelpInlineNumeroTelefonoReferente1(HelpInline hi) {
        this.helpInlineNumeroTelefonoReferente1 = hi;
    }

    private HelpInline helpInlineNumeroTelefonoReferente1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTelefonoReferente1x1() {
        return helpInlineNumeroTelefonoReferente1x1;
    }

    public void setHelpInlineNumeroTelefonoReferente1x1(HelpInline hi) {
        this.helpInlineNumeroTelefonoReferente1x1 = hi;
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
  
    private Label labelNumeroCondicionCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionCenso1() {
        return labelNumeroCondicionCenso1;
    }

    public void setLabelNumeroCondicionCenso1(Label l) {
        this.labelNumeroCondicionCenso1 = l;
    }

    private Label labelNumeroCondicionCenso1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionCenso1x1() {
        return labelNumeroCondicionCenso1x1;
    }

    public void setLabelNumeroCondicionCenso1x1(Label l) {
        this.labelNumeroCondicionCenso1x1 = l;
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

    private HelpInline helpInlineNumeroCondicionCenso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCondicionCenso1() {
        return helpInlineNumeroCondicionCenso1;
    }

    public void setHelpInlineNumeroCondicionCenso1(HelpInline hi) {
        this.helpInlineNumeroCondicionCenso1 = hi;
    }

    private HelpInline helpInlineNumeroCondicionCenso1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCondicionCenso1x1() {
        return helpInlineNumeroCondicionCenso1x1;
    }

    public void setHelpInlineNumeroCondicionCenso1x1(HelpInline hi) {
        this.helpInlineNumeroCondicionCenso1x1 = hi;
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
  
    private Label labelFechaValidacionCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaValidacionCenso1() {
        return labelFechaValidacionCenso1;
    }

    public void setLabelFechaValidacionCenso1(Label l) {
        this.labelFechaValidacionCenso1 = l;
    }

    private Label labelFechaValidacionCenso1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaValidacionCenso1x1() {
        return labelFechaValidacionCenso1x1;
    }

    public void setLabelFechaValidacionCenso1x1(Label l) {
        this.labelFechaValidacionCenso1x1 = l;
    }

    private Calendar campoFechaValidacionCenso1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaValidacionCenso1() {
        return campoFechaValidacionCenso1;
    }

    public void setCampoFechaValidacionCenso1(Calendar component) {
        this.campoFechaValidacionCenso1 = component;
    }

    private Calendar campoFechaValidacionCenso1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaValidacionCenso1x1() {
        return campoFechaValidacionCenso1x1;
    }

    public void setCampoFechaValidacionCenso1x1(Calendar component) {
        this.campoFechaValidacionCenso1x1 = component;
    }

    private HelpInline helpInlineFechaValidacionCenso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaValidacionCenso1() {
        return helpInlineFechaValidacionCenso1;
    }

    public void setHelpInlineFechaValidacionCenso1(HelpInline hi) {
        this.helpInlineFechaValidacionCenso1 = hi;
    }

    private HelpInline helpInlineFechaValidacionCenso1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaValidacionCenso1x1() {
        return helpInlineFechaValidacionCenso1x1;
    }

    public void setHelpInlineFechaValidacionCenso1x1(HelpInline hi) {
        this.helpInlineFechaValidacionCenso1x1 = hi;
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
  
    private Label labelIdFuncionarioValidacionCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioValidacionCen1() {
        return labelIdFuncionarioValidacionCen1;
    }

    public void setLabelIdFuncionarioValidacionCen1(Label l) {
        this.labelIdFuncionarioValidacionCen1 = l;
    }

    private Label labelIdFuncionarioValidacionCen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioValidacionCen1x1() {
        return labelIdFuncionarioValidacionCen1x1;
    }

    public void setLabelIdFuncionarioValidacionCen1x1(Label l) {
        this.labelIdFuncionarioValidacionCen1x1 = l;
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

    private HelpInline helpInlineIdFuncionarioValidacionCen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionarioValidacionCen1() {
        return helpInlineIdFuncionarioValidacionCen1;
    }

    public void setHelpInlineIdFuncionarioValidacionCen1(HelpInline hi) {
        this.helpInlineIdFuncionarioValidacionCen1 = hi;
    }

    private HelpInline helpInlineIdFuncionarioValidacionCen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionarioValidacionCen1x1() {
        return helpInlineIdFuncionarioValidacionCen1x1;
    }

    public void setHelpInlineIdFuncionarioValidacionCen1x1(HelpInline hi) {
        this.helpInlineIdFuncionarioValidacionCen1x1 = hi;
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

    private Label labelIdFuncionarioValidacionCen2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioValidacionCen2() {
        return labelIdFuncionarioValidacionCen2;
    }

    public void setLabelIdFuncionarioValidacionCen2(Label l) {
        this.labelIdFuncionarioValidacionCen2 = l;
    }

    private Label labelIdFuncionarioValidacionCen1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioValidacionCen1x2() {
        return labelIdFuncionarioValidacionCen1x2;
    }

    public void setLabelIdFuncionarioValidacionCen1x2(Label l) {
        this.labelIdFuncionarioValidacionCen1x2 = l;
    }

    private StaticText campoIdFuncionarioValidacionCen1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionarioValidacionCen1Texto2() {
        return campoIdFuncionarioValidacionCen1Texto2;
    }

    public void setCampoIdFuncionarioValidacionCen1Texto2(StaticText component) {
        this.campoIdFuncionarioValidacionCen1Texto2 = component;
    }

    private StaticText campoIdFuncionarioValidacionCen1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionarioValidacionCen1x1Texto2() {
        return campoIdFuncionarioValidacionCen1x1Texto2;
    }

    public void setCampoIdFuncionarioValidacionCen1x1Texto2(StaticText component) {
        this.campoIdFuncionarioValidacionCen1x1Texto2 = component;
    }

    private Button campoIdFuncionarioValidacionCen1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioValidacionCen1Boton2() {
        return campoIdFuncionarioValidacionCen1Boton2;
    }

    public void setCampoIdFuncionarioValidacionCen1Boton2(Button component) {
        this.campoIdFuncionarioValidacionCen1Boton2 = component;
    }

    private Button campoIdFuncionarioValidacionCen1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioValidacionCen1x1Boton2() {
        return campoIdFuncionarioValidacionCen1x1Boton2;
    }

    public void setCampoIdFuncionarioValidacionCen1x1Boton2(Button component) {
        this.campoIdFuncionarioValidacionCen1x1Boton2 = component;
    }

    private Label labelNumeroCausaInvCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaInvCenso1() {
        return labelNumeroCausaInvCenso1;
    }

    public void setLabelNumeroCausaInvCenso1(Label l) {
        this.labelNumeroCausaInvCenso1 = l;
    }

    private Label labelNumeroCausaInvCenso1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaInvCenso1x1() {
        return labelNumeroCausaInvCenso1x1;
    }

    public void setLabelNumeroCausaInvCenso1x1(Label l) {
        this.labelNumeroCausaInvCenso1x1 = l;
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

    private HelpInline helpInlineNumeroCausaInvCenso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaInvCenso1() {
        return helpInlineNumeroCausaInvCenso1;
    }

    public void setHelpInlineNumeroCausaInvCenso1(HelpInline hi) {
        this.helpInlineNumeroCausaInvCenso1 = hi;
    }

    private HelpInline helpInlineNumeroCausaInvCenso1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaInvCenso1x1() {
        return helpInlineNumeroCausaInvCenso1x1;
    }

    public void setHelpInlineNumeroCausaInvCenso1x1(HelpInline hi) {
        this.helpInlineNumeroCausaInvCenso1x1 = hi;
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
  
    private Label labelOtraCausaInvCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaInvCenso1() {
        return labelOtraCausaInvCenso1;
    }

    public void setLabelOtraCausaInvCenso1(Label l) {
        this.labelOtraCausaInvCenso1 = l;
    }

    private Label labelOtraCausaInvCenso1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaInvCenso1x1() {
        return labelOtraCausaInvCenso1x1;
    }

    public void setLabelOtraCausaInvCenso1x1(Label l) {
        this.labelOtraCausaInvCenso1x1 = l;
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

    private HelpInline helpInlineOtraCausaInvCenso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaInvCenso1() {
        return helpInlineOtraCausaInvCenso1;
    }

    public void setHelpInlineOtraCausaInvCenso1(HelpInline hi) {
        this.helpInlineOtraCausaInvCenso1 = hi;
    }

    private HelpInline helpInlineOtraCausaInvCenso1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaInvCenso1x1() {
        return helpInlineOtraCausaInvCenso1x1;
    }

    public void setHelpInlineOtraCausaInvCenso1x1(HelpInline hi) {
        this.helpInlineOtraCausaInvCenso1x1 = hi;
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
  
    private Label labelComentariosValidacionCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosValidacionCenso1() {
        return labelComentariosValidacionCenso1;
    }

    public void setLabelComentariosValidacionCenso1(Label l) {
        this.labelComentariosValidacionCenso1 = l;
    }

    private Label labelComentariosValidacionCenso1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosValidacionCenso1x1() {
        return labelComentariosValidacionCenso1x1;
    }

    public void setLabelComentariosValidacionCenso1x1(Label l) {
        this.labelComentariosValidacionCenso1x1 = l;
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

    private HelpInline helpInlineComentariosValidacionCenso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosValidacionCenso1() {
        return helpInlineComentariosValidacionCenso1;
    }

    public void setHelpInlineComentariosValidacionCenso1(HelpInline hi) {
        this.helpInlineComentariosValidacionCenso1 = hi;
    }

    private HelpInline helpInlineComentariosValidacionCenso1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosValidacionCenso1x1() {
        return helpInlineComentariosValidacionCenso1x1;
    }

    public void setHelpInlineComentariosValidacionCenso1x1(HelpInline hi) {
        this.helpInlineComentariosValidacionCenso1x1 = hi;
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

    private Label labelNumeroCondicionReclCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionReclCen1() {
        return labelNumeroCondicionReclCen1;
    }

    public void setLabelNumeroCondicionReclCen1(Label l) {
        this.labelNumeroCondicionReclCen1 = l;
    }

    private Label labelNumeroCondicionReclCen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCondicionReclCen1x1() {
        return labelNumeroCondicionReclCen1x1;
    }

    public void setLabelNumeroCondicionReclCen1x1(Label l) {
        this.labelNumeroCondicionReclCen1x1 = l;
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

    private HelpInline helpInlineNumeroCondicionReclCen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCondicionReclCen1() {
        return helpInlineNumeroCondicionReclCen1;
    }

    public void setHelpInlineNumeroCondicionReclCen1(HelpInline hi) {
        this.helpInlineNumeroCondicionReclCen1 = hi;
    }

    private HelpInline helpInlineNumeroCondicionReclCen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCondicionReclCen1x1() {
        return helpInlineNumeroCondicionReclCen1x1;
    }

    public void setHelpInlineNumeroCondicionReclCen1x1(HelpInline hi) {
        this.helpInlineNumeroCondicionReclCen1x1 = hi;
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
  
    private Label labelFechaReclamoCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaReclamoCenso1() {
        return labelFechaReclamoCenso1;
    }

    public void setLabelFechaReclamoCenso1(Label l) {
        this.labelFechaReclamoCenso1 = l;
    }

    private Label labelFechaReclamoCenso1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaReclamoCenso1x1() {
        return labelFechaReclamoCenso1x1;
    }

    public void setLabelFechaReclamoCenso1x1(Label l) {
        this.labelFechaReclamoCenso1x1 = l;
    }

    private Calendar campoFechaReclamoCenso1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaReclamoCenso1() {
        return campoFechaReclamoCenso1;
    }

    public void setCampoFechaReclamoCenso1(Calendar component) {
        this.campoFechaReclamoCenso1 = component;
    }

    private Calendar campoFechaReclamoCenso1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaReclamoCenso1x1() {
        return campoFechaReclamoCenso1x1;
    }

    public void setCampoFechaReclamoCenso1x1(Calendar component) {
        this.campoFechaReclamoCenso1x1 = component;
    }

    private HelpInline helpInlineFechaReclamoCenso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaReclamoCenso1() {
        return helpInlineFechaReclamoCenso1;
    }

    public void setHelpInlineFechaReclamoCenso1(HelpInline hi) {
        this.helpInlineFechaReclamoCenso1 = hi;
    }

    private HelpInline helpInlineFechaReclamoCenso1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaReclamoCenso1x1() {
        return helpInlineFechaReclamoCenso1x1;
    }

    public void setHelpInlineFechaReclamoCenso1x1(HelpInline hi) {
        this.helpInlineFechaReclamoCenso1x1 = hi;
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
  
    private Label labelComentariosReclamoCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosReclamoCenso1() {
        return labelComentariosReclamoCenso1;
    }

    public void setLabelComentariosReclamoCenso1(Label l) {
        this.labelComentariosReclamoCenso1 = l;
    }

    private Label labelComentariosReclamoCenso1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosReclamoCenso1x1() {
        return labelComentariosReclamoCenso1x1;
    }

    public void setLabelComentariosReclamoCenso1x1(Label l) {
        this.labelComentariosReclamoCenso1x1 = l;
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

    private HelpInline helpInlineComentariosReclamoCenso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosReclamoCenso1() {
        return helpInlineComentariosReclamoCenso1;
    }

    public void setHelpInlineComentariosReclamoCenso1(HelpInline hi) {
        this.helpInlineComentariosReclamoCenso1 = hi;
    }

    private HelpInline helpInlineComentariosReclamoCenso1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosReclamoCenso1x1() {
        return helpInlineComentariosReclamoCenso1x1;
    }

    public void setHelpInlineComentariosReclamoCenso1x1(HelpInline hi) {
        this.helpInlineComentariosReclamoCenso1x1 = hi;
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
  
    private Label labelFechaAprobacionReclamoCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaAprobacionReclamoCenso1() {
        return labelFechaAprobacionReclamoCenso1;
    }

    public void setLabelFechaAprobacionReclamoCenso1(Label l) {
        this.labelFechaAprobacionReclamoCenso1 = l;
    }

    private Label labelFechaAprobacionReclamoCenso1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaAprobacionReclamoCenso1x1() {
        return labelFechaAprobacionReclamoCenso1x1;
    }

    public void setLabelFechaAprobacionReclamoCenso1x1(Label l) {
        this.labelFechaAprobacionReclamoCenso1x1 = l;
    }

    private Calendar campoFechaAprobacionReclamoCenso1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaAprobacionReclamoCenso1() {
        return campoFechaAprobacionReclamoCenso1;
    }

    public void setCampoFechaAprobacionReclamoCenso1(Calendar component) {
        this.campoFechaAprobacionReclamoCenso1 = component;
    }

    private Calendar campoFechaAprobacionReclamoCenso1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaAprobacionReclamoCenso1x1() {
        return campoFechaAprobacionReclamoCenso1x1;
    }

    public void setCampoFechaAprobacionReclamoCenso1x1(Calendar component) {
        this.campoFechaAprobacionReclamoCenso1x1 = component;
    }

    private HelpInline helpInlineFechaAprobacionReclamoCenso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaAprobacionReclamoCenso1() {
        return helpInlineFechaAprobacionReclamoCenso1;
    }

    public void setHelpInlineFechaAprobacionReclamoCenso1(HelpInline hi) {
        this.helpInlineFechaAprobacionReclamoCenso1 = hi;
    }

    private HelpInline helpInlineFechaAprobacionReclamoCenso1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaAprobacionReclamoCenso1x1() {
        return helpInlineFechaAprobacionReclamoCenso1x1;
    }

    public void setHelpInlineFechaAprobacionReclamoCenso1x1(HelpInline hi) {
        this.helpInlineFechaAprobacionReclamoCenso1x1 = hi;
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
  
    private Label labelComentariosAprReclCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAprReclCen1() {
        return labelComentariosAprReclCen1;
    }

    public void setLabelComentariosAprReclCen1(Label l) {
        this.labelComentariosAprReclCen1 = l;
    }

    private Label labelComentariosAprReclCen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosAprReclCen1x1() {
        return labelComentariosAprReclCen1x1;
    }

    public void setLabelComentariosAprReclCen1x1(Label l) {
        this.labelComentariosAprReclCen1x1 = l;
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

    private HelpInline helpInlineComentariosAprReclCen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosAprReclCen1() {
        return helpInlineComentariosAprReclCen1;
    }

    public void setHelpInlineComentariosAprReclCen1(HelpInline hi) {
        this.helpInlineComentariosAprReclCen1 = hi;
    }

    private HelpInline helpInlineComentariosAprReclCen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosAprReclCen1x1() {
        return helpInlineComentariosAprReclCen1x1;
    }

    public void setHelpInlineComentariosAprReclCen1x1(HelpInline hi) {
        this.helpInlineComentariosAprReclCen1x1 = hi;
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
  
    private Label labelFechaDenegacionReclamoCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaDenegacionReclamoCenso1() {
        return labelFechaDenegacionReclamoCenso1;
    }

    public void setLabelFechaDenegacionReclamoCenso1(Label l) {
        this.labelFechaDenegacionReclamoCenso1 = l;
    }

    private Label labelFechaDenegacionReclamoCenso1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaDenegacionReclamoCenso1x1() {
        return labelFechaDenegacionReclamoCenso1x1;
    }

    public void setLabelFechaDenegacionReclamoCenso1x1(Label l) {
        this.labelFechaDenegacionReclamoCenso1x1 = l;
    }

    private Calendar campoFechaDenegacionReclamoCenso1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaDenegacionReclamoCenso1() {
        return campoFechaDenegacionReclamoCenso1;
    }

    public void setCampoFechaDenegacionReclamoCenso1(Calendar component) {
        this.campoFechaDenegacionReclamoCenso1 = component;
    }

    private Calendar campoFechaDenegacionReclamoCenso1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaDenegacionReclamoCenso1x1() {
        return campoFechaDenegacionReclamoCenso1x1;
    }

    public void setCampoFechaDenegacionReclamoCenso1x1(Calendar component) {
        this.campoFechaDenegacionReclamoCenso1x1 = component;
    }

    private HelpInline helpInlineFechaDenegacionReclamoCenso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaDenegacionReclamoCenso1() {
        return helpInlineFechaDenegacionReclamoCenso1;
    }

    public void setHelpInlineFechaDenegacionReclamoCenso1(HelpInline hi) {
        this.helpInlineFechaDenegacionReclamoCenso1 = hi;
    }

    private HelpInline helpInlineFechaDenegacionReclamoCenso1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaDenegacionReclamoCenso1x1() {
        return helpInlineFechaDenegacionReclamoCenso1x1;
    }

    public void setHelpInlineFechaDenegacionReclamoCenso1x1(HelpInline hi) {
        this.helpInlineFechaDenegacionReclamoCenso1x1 = hi;
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
  
    private Label labelNumeroCausaDenReclCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaDenReclCen1() {
        return labelNumeroCausaDenReclCen1;
    }

    public void setLabelNumeroCausaDenReclCen1(Label l) {
        this.labelNumeroCausaDenReclCen1 = l;
    }

    private Label labelNumeroCausaDenReclCen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaDenReclCen1x1() {
        return labelNumeroCausaDenReclCen1x1;
    }

    public void setLabelNumeroCausaDenReclCen1x1(Label l) {
        this.labelNumeroCausaDenReclCen1x1 = l;
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

    private HelpInline helpInlineNumeroCausaDenReclCen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaDenReclCen1() {
        return helpInlineNumeroCausaDenReclCen1;
    }

    public void setHelpInlineNumeroCausaDenReclCen1(HelpInline hi) {
        this.helpInlineNumeroCausaDenReclCen1 = hi;
    }

    private HelpInline helpInlineNumeroCausaDenReclCen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaDenReclCen1x1() {
        return helpInlineNumeroCausaDenReclCen1x1;
    }

    public void setHelpInlineNumeroCausaDenReclCen1x1(HelpInline hi) {
        this.helpInlineNumeroCausaDenReclCen1x1 = hi;
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
  
    private Label labelOtraCausaDenReclCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaDenReclCen1() {
        return labelOtraCausaDenReclCen1;
    }

    public void setLabelOtraCausaDenReclCen1(Label l) {
        this.labelOtraCausaDenReclCen1 = l;
    }

    private Label labelOtraCausaDenReclCen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaDenReclCen1x1() {
        return labelOtraCausaDenReclCen1x1;
    }

    public void setLabelOtraCausaDenReclCen1x1(Label l) {
        this.labelOtraCausaDenReclCen1x1 = l;
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

    private HelpInline helpInlineOtraCausaDenReclCen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaDenReclCen1() {
        return helpInlineOtraCausaDenReclCen1;
    }

    public void setHelpInlineOtraCausaDenReclCen1(HelpInline hi) {
        this.helpInlineOtraCausaDenReclCen1 = hi;
    }

    private HelpInline helpInlineOtraCausaDenReclCen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaDenReclCen1x1() {
        return helpInlineOtraCausaDenReclCen1x1;
    }

    public void setHelpInlineOtraCausaDenReclCen1x1(HelpInline hi) {
        this.helpInlineOtraCausaDenReclCen1x1 = hi;
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
  
    private Label labelComentariosDenReclCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosDenReclCen1() {
        return labelComentariosDenReclCen1;
    }

    public void setLabelComentariosDenReclCen1(Label l) {
        this.labelComentariosDenReclCen1 = l;
    }

    private Label labelComentariosDenReclCen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelComentariosDenReclCen1x1() {
        return labelComentariosDenReclCen1x1;
    }

    public void setLabelComentariosDenReclCen1x1(Label l) {
        this.labelComentariosDenReclCen1x1 = l;
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

    private HelpInline helpInlineComentariosDenReclCen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosDenReclCen1() {
        return helpInlineComentariosDenReclCen1;
    }

    public void setHelpInlineComentariosDenReclCen1(HelpInline hi) {
        this.helpInlineComentariosDenReclCen1 = hi;
    }

    private HelpInline helpInlineComentariosDenReclCen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineComentariosDenReclCen1x1() {
        return helpInlineComentariosDenReclCen1x1;
    }

    public void setHelpInlineComentariosDenReclCen1x1(HelpInline hi) {
        this.helpInlineComentariosDenReclCen1x1 = hi;
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
  
    private Label labelFechaRegistroPotBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaRegistroPotBen1() {
        return labelFechaRegistroPotBen1;
    }

    public void setLabelFechaRegistroPotBen1(Label l) {
        this.labelFechaRegistroPotBen1 = l;
    }

    private Label labelFechaRegistroPotBen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaRegistroPotBen1x1() {
        return labelFechaRegistroPotBen1x1;
    }

    public void setLabelFechaRegistroPotBen1x1(Label l) {
        this.labelFechaRegistroPotBen1x1 = l;
    }

    private Calendar campoFechaRegistroPotBen1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaRegistroPotBen1() {
        return campoFechaRegistroPotBen1;
    }

    public void setCampoFechaRegistroPotBen1(Calendar component) {
        this.campoFechaRegistroPotBen1 = component;
    }

    private Calendar campoFechaRegistroPotBen1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaRegistroPotBen1x1() {
        return campoFechaRegistroPotBen1x1;
    }

    public void setCampoFechaRegistroPotBen1x1(Calendar component) {
        this.campoFechaRegistroPotBen1x1 = component;
    }

    private HelpInline helpInlineFechaRegistroPotBen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaRegistroPotBen1() {
        return helpInlineFechaRegistroPotBen1;
    }

    public void setHelpInlineFechaRegistroPotBen1(HelpInline hi) {
        this.helpInlineFechaRegistroPotBen1 = hi;
    }

    private HelpInline helpInlineFechaRegistroPotBen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaRegistroPotBen1x1() {
        return helpInlineFechaRegistroPotBen1x1;
    }

    public void setHelpInlineFechaRegistroPotBen1x1(HelpInline hi) {
        this.helpInlineFechaRegistroPotBen1x1 = hi;
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
  
    private Label labelIdFuncionarioRegPotBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioRegPotBen1() {
        return labelIdFuncionarioRegPotBen1;
    }

    public void setLabelIdFuncionarioRegPotBen1(Label l) {
        this.labelIdFuncionarioRegPotBen1 = l;
    }

    private Label labelIdFuncionarioRegPotBen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioRegPotBen1x1() {
        return labelIdFuncionarioRegPotBen1x1;
    }

    public void setLabelIdFuncionarioRegPotBen1x1(Label l) {
        this.labelIdFuncionarioRegPotBen1x1 = l;
    }

    private TextField campoIdFuncionarioRegPotBen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFuncionarioRegPotBen1() {
        return campoIdFuncionarioRegPotBen1;
    }

    public void setCampoIdFuncionarioRegPotBen1(TextField component) {
        this.campoIdFuncionarioRegPotBen1 = component;
    }

    private TextField campoIdFuncionarioRegPotBen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdFuncionarioRegPotBen1x1() {
        return campoIdFuncionarioRegPotBen1x1;
    }

    public void setCampoIdFuncionarioRegPotBen1x1(TextField component) {
        this.campoIdFuncionarioRegPotBen1x1 = component;
    }

    private HelpInline helpInlineIdFuncionarioRegPotBen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionarioRegPotBen1() {
        return helpInlineIdFuncionarioRegPotBen1;
    }

    public void setHelpInlineIdFuncionarioRegPotBen1(HelpInline hi) {
        this.helpInlineIdFuncionarioRegPotBen1 = hi;
    }

    private HelpInline helpInlineIdFuncionarioRegPotBen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionarioRegPotBen1x1() {
        return helpInlineIdFuncionarioRegPotBen1x1;
    }

    public void setHelpInlineIdFuncionarioRegPotBen1x1(HelpInline hi) {
        this.helpInlineIdFuncionarioRegPotBen1x1 = hi;
    }

    private StaticText campoIdFuncionarioRegPotBen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioRegPotBen1Texto1() {
        return campoIdFuncionarioRegPotBen1Texto1;
    }

    public void setCampoIdFuncionarioRegPotBen1Texto1(StaticText component) {
        this.campoIdFuncionarioRegPotBen1Texto1 = component;
    }

    private StaticText campoIdFuncionarioRegPotBen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFuncionarioRegPotBen1x1Texto1() {
        return campoIdFuncionarioRegPotBen1x1Texto1;
    }

    public void setCampoIdFuncionarioRegPotBen1x1Texto1(StaticText component) {
        this.campoIdFuncionarioRegPotBen1x1Texto1 = component;
    }

    private Button campoIdFuncionarioRegPotBen1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioRegPotBen1Boton1() {
        return campoIdFuncionarioRegPotBen1Boton1;
    }

    public void setCampoIdFuncionarioRegPotBen1Boton1(Button component) {
        this.campoIdFuncionarioRegPotBen1Boton1 = component;
    }

    private Button campoIdFuncionarioRegPotBen1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFuncionarioRegPotBen1x1Boton1() {
        return campoIdFuncionarioRegPotBen1x1Boton1;
    }

    public void setCampoIdFuncionarioRegPotBen1x1Boton1(Button component) {
        this.campoIdFuncionarioRegPotBen1x1Boton1 = component;
    }

    private Button campoIdFuncionarioRegPotBen1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioRegPotBen1Boton3() {
        return campoIdFuncionarioRegPotBen1Boton3;
    }

    public void setCampoIdFuncionarioRegPotBen1Boton3(Button component) {
        this.campoIdFuncionarioRegPotBen1Boton3 = component;
    }

    private Button campoIdFuncionarioRegPotBen1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioRegPotBen1x1Boton3() {
        return campoIdFuncionarioRegPotBen1x1Boton3;
    }

    public void setCampoIdFuncionarioRegPotBen1x1Boton3(Button component) {
        this.campoIdFuncionarioRegPotBen1x1Boton3 = component;
    }

    private Label labelIdFuncionarioRegPotBen2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioRegPotBen2() {
        return labelIdFuncionarioRegPotBen2;
    }

    public void setLabelIdFuncionarioRegPotBen2(Label l) {
        this.labelIdFuncionarioRegPotBen2 = l;
    }

    private Label labelIdFuncionarioRegPotBen1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioRegPotBen1x2() {
        return labelIdFuncionarioRegPotBen1x2;
    }

    public void setLabelIdFuncionarioRegPotBen1x2(Label l) {
        this.labelIdFuncionarioRegPotBen1x2 = l;
    }

    private StaticText campoIdFuncionarioRegPotBen1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionarioRegPotBen1Texto2() {
        return campoIdFuncionarioRegPotBen1Texto2;
    }

    public void setCampoIdFuncionarioRegPotBen1Texto2(StaticText component) {
        this.campoIdFuncionarioRegPotBen1Texto2 = component;
    }

    private StaticText campoIdFuncionarioRegPotBen1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionarioRegPotBen1x1Texto2() {
        return campoIdFuncionarioRegPotBen1x1Texto2;
    }

    public void setCampoIdFuncionarioRegPotBen1x1Texto2(StaticText component) {
        this.campoIdFuncionarioRegPotBen1x1Texto2 = component;
    }

    private Button campoIdFuncionarioRegPotBen1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioRegPotBen1Boton2() {
        return campoIdFuncionarioRegPotBen1Boton2;
    }

    public void setCampoIdFuncionarioRegPotBen1Boton2(Button component) {
        this.campoIdFuncionarioRegPotBen1Boton2 = component;
    }

    private Button campoIdFuncionarioRegPotBen1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioRegPotBen1x1Boton2() {
        return campoIdFuncionarioRegPotBen1x1Boton2;
    }

    public void setCampoIdFuncionarioRegPotBen1x1Boton2(Button component) {
        this.campoIdFuncionarioRegPotBen1x1Boton2 = component;
    }

    private Label labelEsPotencialBenInactivo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPotencialBenInactivo1() {
        return labelEsPotencialBenInactivo1;
    }

    public void setLabelEsPotencialBenInactivo1(Label l) {
        this.labelEsPotencialBenInactivo1 = l;
    }

    private Label labelEsPotencialBenInactivo1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsPotencialBenInactivo1x1() {
        return labelEsPotencialBenInactivo1x1;
    }

    public void setLabelEsPotencialBenInactivo1x1(Label l) {
        this.labelEsPotencialBenInactivo1x1 = l;
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

    private HelpInline helpInlineEsPotencialBenInactivo1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPotencialBenInactivo1() {
        return helpInlineEsPotencialBenInactivo1;
    }

    public void setHelpInlineEsPotencialBenInactivo1(HelpInline hi) {
        this.helpInlineEsPotencialBenInactivo1 = hi;
    }

    private HelpInline helpInlineEsPotencialBenInactivo1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsPotencialBenInactivo1x1() {
        return helpInlineEsPotencialBenInactivo1x1;
    }

    public void setHelpInlineEsPotencialBenInactivo1x1(HelpInline hi) {
        this.helpInlineEsPotencialBenInactivo1x1 = hi;
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
  
    private Label labelFechaUltimaVisitaCenso1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaUltimaVisitaCenso1() {
        return labelFechaUltimaVisitaCenso1;
    }

    public void setLabelFechaUltimaVisitaCenso1(Label l) {
        this.labelFechaUltimaVisitaCenso1 = l;
    }

    private Label labelFechaUltimaVisitaCenso1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaUltimaVisitaCenso1x1() {
        return labelFechaUltimaVisitaCenso1x1;
    }

    public void setLabelFechaUltimaVisitaCenso1x1(Label l) {
        this.labelFechaUltimaVisitaCenso1x1 = l;
    }

    private Calendar campoFechaUltimaVisitaCenso1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaUltimaVisitaCenso1() {
        return campoFechaUltimaVisitaCenso1;
    }

    public void setCampoFechaUltimaVisitaCenso1(Calendar component) {
        this.campoFechaUltimaVisitaCenso1 = component;
    }

    private Calendar campoFechaUltimaVisitaCenso1x1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaUltimaVisitaCenso1x1() {
        return campoFechaUltimaVisitaCenso1x1;
    }

    public void setCampoFechaUltimaVisitaCenso1x1(Calendar component) {
        this.campoFechaUltimaVisitaCenso1x1 = component;
    }

    private HelpInline helpInlineFechaUltimaVisitaCenso1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaUltimaVisitaCenso1() {
        return helpInlineFechaUltimaVisitaCenso1;
    }

    public void setHelpInlineFechaUltimaVisitaCenso1(HelpInline hi) {
        this.helpInlineFechaUltimaVisitaCenso1 = hi;
    }

    private HelpInline helpInlineFechaUltimaVisitaCenso1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaUltimaVisitaCenso1x1() {
        return helpInlineFechaUltimaVisitaCenso1x1;
    }

    public void setHelpInlineFechaUltimaVisitaCenso1x1(HelpInline hi) {
        this.helpInlineFechaUltimaVisitaCenso1x1 = hi;
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
  
    private Label labelObservacionesUltVisitaCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelObservacionesUltVisitaCen1() {
        return labelObservacionesUltVisitaCen1;
    }

    public void setLabelObservacionesUltVisitaCen1(Label l) {
        this.labelObservacionesUltVisitaCen1 = l;
    }

    private Label labelObservacionesUltVisitaCen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelObservacionesUltVisitaCen1x1() {
        return labelObservacionesUltVisitaCen1x1;
    }

    public void setLabelObservacionesUltVisitaCen1x1(Label l) {
        this.labelObservacionesUltVisitaCen1x1 = l;
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

    private HelpInline helpInlineObservacionesUltVisitaCen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineObservacionesUltVisitaCen1() {
        return helpInlineObservacionesUltVisitaCen1;
    }

    public void setHelpInlineObservacionesUltVisitaCen1(HelpInline hi) {
        this.helpInlineObservacionesUltVisitaCen1 = hi;
    }

    private HelpInline helpInlineObservacionesUltVisitaCen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineObservacionesUltVisitaCen1x1() {
        return helpInlineObservacionesUltVisitaCen1x1;
    }

    public void setHelpInlineObservacionesUltVisitaCen1x1(HelpInline hi) {
        this.helpInlineObservacionesUltVisitaCen1x1 = hi;
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
  
    private Label labelIdFuncionarioUltVisitaCen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioUltVisitaCen1() {
        return labelIdFuncionarioUltVisitaCen1;
    }

    public void setLabelIdFuncionarioUltVisitaCen1(Label l) {
        this.labelIdFuncionarioUltVisitaCen1 = l;
    }

    private Label labelIdFuncionarioUltVisitaCen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioUltVisitaCen1x1() {
        return labelIdFuncionarioUltVisitaCen1x1;
    }

    public void setLabelIdFuncionarioUltVisitaCen1x1(Label l) {
        this.labelIdFuncionarioUltVisitaCen1x1 = l;
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

    private HelpInline helpInlineIdFuncionarioUltVisitaCen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionarioUltVisitaCen1() {
        return helpInlineIdFuncionarioUltVisitaCen1;
    }

    public void setHelpInlineIdFuncionarioUltVisitaCen1(HelpInline hi) {
        this.helpInlineIdFuncionarioUltVisitaCen1 = hi;
    }

    private HelpInline helpInlineIdFuncionarioUltVisitaCen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFuncionarioUltVisitaCen1x1() {
        return helpInlineIdFuncionarioUltVisitaCen1x1;
    }

    public void setHelpInlineIdFuncionarioUltVisitaCen1x1(HelpInline hi) {
        this.helpInlineIdFuncionarioUltVisitaCen1x1 = hi;
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

    private Label labelIdFuncionarioUltVisitaCen2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioUltVisitaCen2() {
        return labelIdFuncionarioUltVisitaCen2;
    }

    public void setLabelIdFuncionarioUltVisitaCen2(Label l) {
        this.labelIdFuncionarioUltVisitaCen2 = l;
    }

    private Label labelIdFuncionarioUltVisitaCen1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFuncionarioUltVisitaCen1x2() {
        return labelIdFuncionarioUltVisitaCen1x2;
    }

    public void setLabelIdFuncionarioUltVisitaCen1x2(Label l) {
        this.labelIdFuncionarioUltVisitaCen1x2 = l;
    }

    private StaticText campoIdFuncionarioUltVisitaCen1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionarioUltVisitaCen1Texto2() {
        return campoIdFuncionarioUltVisitaCen1Texto2;
    }

    public void setCampoIdFuncionarioUltVisitaCen1Texto2(StaticText component) {
        this.campoIdFuncionarioUltVisitaCen1Texto2 = component;
    }

    private StaticText campoIdFuncionarioUltVisitaCen1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFuncionarioUltVisitaCen1x1Texto2() {
        return campoIdFuncionarioUltVisitaCen1x1Texto2;
    }

    public void setCampoIdFuncionarioUltVisitaCen1x1Texto2(StaticText component) {
        this.campoIdFuncionarioUltVisitaCen1x1Texto2 = component;
    }

    private Button campoIdFuncionarioUltVisitaCen1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioUltVisitaCen1Boton2() {
        return campoIdFuncionarioUltVisitaCen1Boton2;
    }

    public void setCampoIdFuncionarioUltVisitaCen1Boton2(Button component) {
        this.campoIdFuncionarioUltVisitaCen1Boton2 = component;
    }

    private Button campoIdFuncionarioUltVisitaCen1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFuncionarioUltVisitaCen1x1Boton2() {
        return campoIdFuncionarioUltVisitaCen1x1Boton2;
    }

    public void setCampoIdFuncionarioUltVisitaCen1x1Boton2(Button component) {
        this.campoIdFuncionarioUltVisitaCen1x1Boton2 = component;
    }

    private Label labelReferenciaDireccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelReferenciaDireccion1() {
        return labelReferenciaDireccion1;
    }

    public void setLabelReferenciaDireccion1(Label l) {
        this.labelReferenciaDireccion1 = l;
    }

    private Label labelReferenciaDireccion1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelReferenciaDireccion1x1() {
        return labelReferenciaDireccion1x1;
    }

    public void setLabelReferenciaDireccion1x1(Label l) {
        this.labelReferenciaDireccion1x1 = l;
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

    private HelpInline helpInlineReferenciaDireccion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineReferenciaDireccion1() {
        return helpInlineReferenciaDireccion1;
    }

    public void setHelpInlineReferenciaDireccion1(HelpInline hi) {
        this.helpInlineReferenciaDireccion1 = hi;
    }

    private HelpInline helpInlineReferenciaDireccion1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineReferenciaDireccion1x1() {
        return helpInlineReferenciaDireccion1x1;
    }

    public void setHelpInlineReferenciaDireccion1x1(HelpInline hi) {
        this.helpInlineReferenciaDireccion1x1 = hi;
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

    // </editor-fold>
/**/
    public PotencialBen2() {
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

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion">
    private GestorPaginaActualizacion gestor = new GestorPaginaActualizacion(this);

    @Override
    public GestorPaginaActualizacion getGestor() {
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
    private final static String ETIQUETA_MIGAS_PAN = BundleWebui.getString("detalle");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("PotencialBen2_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("PotencialBen2_ETIQUETA_CLASE_MAESTRO");

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
        return PotencialBenCachedRowSetDataProvider2.FUNCION_CREAR_POTENCIAL_BEN;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return PotencialBenCachedRowSetDataProvider2.FUNCION_MODIFICAR_POTENCIAL_BEN;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return PotencialBenCachedRowSetDataProvider2.FUNCION_ELIMINAR_POTENCIAL_BEN;
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
        String urx = URX2.COMANDO_POTENCIAL_BEN;
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
        String urx = URX2.COMANDO_POTENCIAL_BEN;
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

    public void campoIdFuncionarioRegPotBen1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFuncionarioRegPotBen1_validate(context, component, value);
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
