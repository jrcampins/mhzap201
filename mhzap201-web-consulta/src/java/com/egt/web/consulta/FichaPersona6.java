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

import com.egt.data.specific.xdp2.FichaPersonaCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.FichaHogarCachedRowSetDataProvider2;
import com.egt.data.generic.xdp2.UbicacionCachedRowSetDataProvider2;
import com.egt.data.specific.xdp2.PotencialBenCachedRowSetDataProvider2;
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
import com.egt.ejb.business.process.FichaPersonaBusinessProcessLocal;

public class FichaPersona6 extends AbstractPageBean
        implements PaginaActualizacionFichaPersona, PaginaActualizacionConAccionMultiple, PaginaActualizacionConEdicionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorIdFichaPersona1.setMinimum(0L);
        validatorIdFichaPersona1.setMaximum(1000000000000000000L);
        validatorCodigoFichaPersona1.setMaximum(30);
        validatorNombreFichaPersona1.setMaximum(100);
        validatorNumeroOrdenIdentificacion1.setMinimum(0L);
        validatorNumeroOrdenIdentificacion1.setMaximum(1000000000L);
        validatorPrimerNombre1.setMaximum(30);
        validatorSegundoNombre1.setMaximum(30);
        validatorPrimerApellido1.setMaximum(30);
        validatorSegundoApellido1.setMaximum(30);
        validatorApellidoCasada1.setMaximum(30);
        validatorApodo1.setMaximum(30);
        validatorEdad1.setMinimum(0L);
        validatorEdad1.setMaximum(1000000000L);
        validatorNumeroOrdenIdenConyuge1.setMinimum(0L);
        validatorNumeroOrdenIdenConyuge1.setMaximum(1000000000L);
        validatorNumeroOrdenIdenPadre1.setMinimum(0L);
        validatorNumeroOrdenIdenPadre1.setMaximum(1000000000L);
        validatorNumeroOrdenIdenMadre1.setMinimum(0L);
        validatorNumeroOrdenIdenMadre1.setMaximum(1000000000L);
        validatorNumeroCedula1.setMinimum(1L);
        validatorNumeroCedula1.setMaximum(1000000000L);
        validatorLetraCedula1.setMaximum(1);
        converterFechaNacimiento1.setPattern("dd/MM/yyyy");
        converterFechaNacimiento1.setType("date");
        validatorOtroIdiomaHogar1.setMaximum(100);
        validatorOtroMotivoInaEsc1.setMaximum(100);
        validatorUltimoCursoAprobado1.setMinimum(0L);
        validatorUltimoCursoAprobado1.setMaximum(1000000000L);
        validatorOtraClaseEnfAcc1.setMaximum(100);
        validatorOtraClaseEnfCronica1.setMaximum(100);
        validatorOtroMotivoNoAtencion1.setMaximum(100);
        validatorOtraClaseImpedimento1.setMaximum(100);
        validatorOtraCausaImpedimento1.setMaximum(100);
        validatorOtroMotivoNoTrabajo1.setMaximum(100);
        validatorDescripcionOcupacionPrin1.setMaximum(100);
        validatorDescripcionDedicacionPrin1.setMaximum(100);
        converterMontoIngresoOcupacionPrin1.setMinIntegerDigits(1);
        converterMontoIngresoOcupacionPrin1.setMaxIntegerDigits(40);
        converterMontoIngresoOcupacionPrin1.setMaxFractionDigits(3);
        validatorMontoIngresoOcupacionPrin1.setMinimum(0.0);
        validatorMontoIngresoOcupacionPrin1.setMaximum(1.0E13);
        converterMontoIngresoOcupacionSecun1.setMinIntegerDigits(1);
        converterMontoIngresoOcupacionSecun1.setMaxIntegerDigits(40);
        converterMontoIngresoOcupacionSecun1.setMaxFractionDigits(3);
        validatorMontoIngresoOcupacionSecun1.setMinimum(0.0);
        validatorMontoIngresoOcupacionSecun1.setMaximum(1.0E13);
        converterMontoIngresoOtrasOcup1.setMinIntegerDigits(1);
        converterMontoIngresoOtrasOcup1.setMaxIntegerDigits(40);
        converterMontoIngresoOtrasOcup1.setMaxFractionDigits(3);
        validatorMontoIngresoOtrasOcup1.setMinimum(0.0);
        validatorMontoIngresoOtrasOcup1.setMaximum(1.0E13);
        converterMontoIngresoAlquileres1.setMinIntegerDigits(1);
        converterMontoIngresoAlquileres1.setMaxIntegerDigits(40);
        converterMontoIngresoAlquileres1.setMaxFractionDigits(3);
        validatorMontoIngresoAlquileres1.setMinimum(0.0);
        validatorMontoIngresoAlquileres1.setMaximum(1.0E13);
        converterMontoIngresoIntereses1.setMinIntegerDigits(1);
        converterMontoIngresoIntereses1.setMaxIntegerDigits(40);
        converterMontoIngresoIntereses1.setMaxFractionDigits(3);
        validatorMontoIngresoIntereses1.setMinimum(0.0);
        validatorMontoIngresoIntereses1.setMaximum(1.0E13);
        converterMontoIngresoAyudaFamPais1.setMinIntegerDigits(1);
        converterMontoIngresoAyudaFamPais1.setMaxIntegerDigits(40);
        converterMontoIngresoAyudaFamPais1.setMaxFractionDigits(3);
        validatorMontoIngresoAyudaFamPais1.setMinimum(0.0);
        validatorMontoIngresoAyudaFamPais1.setMaximum(1.0E13);
        converterMontoIngresoAyudaFamExter1.setMinIntegerDigits(1);
        converterMontoIngresoAyudaFamExter1.setMaxIntegerDigits(40);
        converterMontoIngresoAyudaFamExter1.setMaxFractionDigits(3);
        validatorMontoIngresoAyudaFamExter1.setMinimum(0.0);
        validatorMontoIngresoAyudaFamExter1.setMaximum(1.0E13);
        converterMontoIngresoJubilacion1.setMinIntegerDigits(1);
        converterMontoIngresoJubilacion1.setMaxIntegerDigits(40);
        converterMontoIngresoJubilacion1.setMaxFractionDigits(3);
        validatorMontoIngresoJubilacion1.setMinimum(0.0);
        validatorMontoIngresoJubilacion1.setMaximum(1.0E13);
        converterMontoIngresoPensiones1.setMinIntegerDigits(1);
        converterMontoIngresoPensiones1.setMaxIntegerDigits(40);
        converterMontoIngresoPensiones1.setMaxFractionDigits(3);
        validatorMontoIngresoPensiones1.setMinimum(0.0);
        validatorMontoIngresoPensiones1.setMaximum(1.0E13);
        converterMontoIngresoTekopora1.setMinIntegerDigits(1);
        converterMontoIngresoTekopora1.setMaxIntegerDigits(40);
        converterMontoIngresoTekopora1.setMaxFractionDigits(3);
        validatorMontoIngresoTekopora1.setMinimum(0.0);
        validatorMontoIngresoTekopora1.setMaximum(1.0E13);
        converterMontoIngresoProgramas1.setMinIntegerDigits(1);
        converterMontoIngresoProgramas1.setMaxIntegerDigits(40);
        converterMontoIngresoProgramas1.setMaxFractionDigits(3);
        validatorMontoIngresoProgramas1.setMinimum(0.0);
        validatorMontoIngresoProgramas1.setMaximum(1.0E13);
        converterMontoIngresoAdicional1.setMinIntegerDigits(1);
        converterMontoIngresoAdicional1.setMaxIntegerDigits(40);
        converterMontoIngresoAdicional1.setMaxFractionDigits(3);
        validatorMontoIngresoAdicional1.setMinimum(0.0);
        validatorMontoIngresoAdicional1.setMaximum(1.0E13);
        converterTotalIngresoMensual1.setMinIntegerDigits(1);
        converterTotalIngresoMensual1.setMaxIntegerDigits(40);
        converterTotalIngresoMensual1.setMaxFractionDigits(3);
        validatorTotalIngresoMensual1.setMinimum(0.0);
        validatorTotalIngresoMensual1.setMaximum(1.0E13);
        fichaPersonaDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fichaPersonaRowSet}"));
        fichaHogarReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.fichaHogarReferenceRowSet}"));
        ubicacionReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.ubicacionReferenceRowSet}"));
        potencialBenReferenceDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.potencialBenReferenceRowSet}"));
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

    private HelpInline helpInlineIdFichaPersona1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFichaPersona1() {
        return helpInlineIdFichaPersona1;
    }

    public void setHelpInlineIdFichaPersona1(HelpInline hi) {
        this.helpInlineIdFichaPersona1 = hi;
    }

    private StaticText campoIdFichaPersona1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFichaPersona1Texto1() {
        return campoIdFichaPersona1Texto1;
    }

    public void setCampoIdFichaPersona1Texto1(StaticText component) {
        this.campoIdFichaPersona1Texto1 = component;
    }

    private LongConverter converterIdFichaPersona1 = new LongConverter();
  
    public LongConverter getConverterIdFichaPersona1() {
        return converterIdFichaPersona1;
    }
  
    public void setConverterIdFichaPersona1(LongConverter converter) {
        this.converterIdFichaPersona1 = converter;
    }
  
    private LongRangeValidator validatorIdFichaPersona1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorIdFichaPersona1() {
        return validatorIdFichaPersona1;
    }
  
    public void setValidatorIdFichaPersona1(LongRangeValidator validator) {
        this.validatorIdFichaPersona1 = validator;
    }
  
    private Label labelCodigoFichaPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoFichaPersona1() {
        return labelCodigoFichaPersona1;
    }

    public void setLabelCodigoFichaPersona1(Label l) {
        this.labelCodigoFichaPersona1 = l;
    }

    private TextField campoCodigoFichaPersona1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoCodigoFichaPersona1() {
        return campoCodigoFichaPersona1;
    }

    public void setCampoCodigoFichaPersona1(TextField component) {
        this.campoCodigoFichaPersona1 = component;
    }

    private HelpInline helpInlineCodigoFichaPersona1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCodigoFichaPersona1() {
        return helpInlineCodigoFichaPersona1;
    }

    public void setHelpInlineCodigoFichaPersona1(HelpInline hi) {
        this.helpInlineCodigoFichaPersona1 = hi;
    }

    private StaticText campoCodigoFichaPersona1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoFichaPersona1Texto1() {
        return campoCodigoFichaPersona1Texto1;
    }

    public void setCampoCodigoFichaPersona1Texto1(StaticText component) {
        this.campoCodigoFichaPersona1Texto1 = component;
    }

    private LengthValidator validatorCodigoFichaPersona1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoFichaPersona1() {
        return validatorCodigoFichaPersona1;
    }
  
    public void setValidatorCodigoFichaPersona1(LengthValidator validator) {
        this.validatorCodigoFichaPersona1 = validator;
    }
  
    private Label labelNombreFichaPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreFichaPersona1() {
        return labelNombreFichaPersona1;
    }

    public void setLabelNombreFichaPersona1(Label l) {
        this.labelNombreFichaPersona1 = l;
    }

    private TextField campoNombreFichaPersona1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNombreFichaPersona1() {
        return campoNombreFichaPersona1;
    }

    public void setCampoNombreFichaPersona1(TextField component) {
        this.campoNombreFichaPersona1 = component;
    }

    private HelpInline helpInlineNombreFichaPersona1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreFichaPersona1() {
        return helpInlineNombreFichaPersona1;
    }

    public void setHelpInlineNombreFichaPersona1(HelpInline hi) {
        this.helpInlineNombreFichaPersona1 = hi;
    }

    private StaticText campoNombreFichaPersona1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreFichaPersona1Texto1() {
        return campoNombreFichaPersona1Texto1;
    }

    public void setCampoNombreFichaPersona1Texto1(StaticText component) {
        this.campoNombreFichaPersona1Texto1 = component;
    }

    private LengthValidator validatorNombreFichaPersona1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreFichaPersona1() {
        return validatorNombreFichaPersona1;
    }
  
    public void setValidatorNombreFichaPersona1(LengthValidator validator) {
        this.validatorNombreFichaPersona1 = validator;
    }
  
    private Label labelEsRespondente1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsRespondente1() {
        return labelEsRespondente1;
    }

    public void setLabelEsRespondente1(Label l) {
        this.labelEsRespondente1 = l;
    }

    private Label labelEsRespondente1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsRespondente1x1() {
        return labelEsRespondente1x1;
    }

    public void setLabelEsRespondente1x1(Label l) {
        this.labelEsRespondente1x1 = l;
    }

    private DropDown listaEsRespondente1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaEsRespondente1() {
        return listaEsRespondente1;
    }

    public void setListaEsRespondente1(DropDown component) {
        this.listaEsRespondente1 = component;
    }

    private DropDown listaEsRespondente1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsRespondente1x1() {
        return listaEsRespondente1x1;
    }

    public void setListaEsRespondente1x1(DropDown component) {
        this.listaEsRespondente1x1 = component;
    }

    private HelpInline helpInlineEsRespondente1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsRespondente1() {
        return helpInlineEsRespondente1;
    }

    public void setHelpInlineEsRespondente1(HelpInline hi) {
        this.helpInlineEsRespondente1 = hi;
    }

    private HelpInline helpInlineEsRespondente1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsRespondente1x1() {
        return helpInlineEsRespondente1x1;
    }

    public void setHelpInlineEsRespondente1x1(HelpInline hi) {
        this.helpInlineEsRespondente1x1 = hi;
    }

    private StaticText listaEsRespondente1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsRespondente1Texto1() {
        return listaEsRespondente1Texto1;
    }

    public void setListaEsRespondente1Texto1(StaticText component) {
        this.listaEsRespondente1Texto1 = component;
    }

    private StaticText listaEsRespondente1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsRespondente1x1Texto1() {
        return listaEsRespondente1x1Texto1;
    }

    public void setListaEsRespondente1x1Texto1(StaticText component) {
        this.listaEsRespondente1x1Texto1 = component;
    }

    private IntegerConverter converterEsRespondente1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsRespondente1() {
        return converterEsRespondente1;
    }
  
    public void setConverterEsRespondente1(IntegerConverter converter) {
        this.converterEsRespondente1 = converter;
    }
  
    private Label labelIdFichaHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaHogar1() {
        return labelIdFichaHogar1;
    }

    public void setLabelIdFichaHogar1(Label l) {
        this.labelIdFichaHogar1 = l;
    }

    private Label labelIdFichaHogar1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaHogar1x1() {
        return labelIdFichaHogar1x1;
    }

    public void setLabelIdFichaHogar1x1(Label l) {
        this.labelIdFichaHogar1x1 = l;
    }

    private TextField campoIdFichaHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdFichaHogar1() {
        return campoIdFichaHogar1;
    }

    public void setCampoIdFichaHogar1(TextField component) {
        this.campoIdFichaHogar1 = component;
    }

    private TextField campoIdFichaHogar1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdFichaHogar1x1() {
        return campoIdFichaHogar1x1;
    }

    public void setCampoIdFichaHogar1x1(TextField component) {
        this.campoIdFichaHogar1x1 = component;
    }

    private HelpInline helpInlineIdFichaHogar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFichaHogar1() {
        return helpInlineIdFichaHogar1;
    }

    public void setHelpInlineIdFichaHogar1(HelpInline hi) {
        this.helpInlineIdFichaHogar1 = hi;
    }

    private HelpInline helpInlineIdFichaHogar1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFichaHogar1x1() {
        return helpInlineIdFichaHogar1x1;
    }

    public void setHelpInlineIdFichaHogar1x1(HelpInline hi) {
        this.helpInlineIdFichaHogar1x1 = hi;
    }

    private StaticText campoIdFichaHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFichaHogar1Texto1() {
        return campoIdFichaHogar1Texto1;
    }

    public void setCampoIdFichaHogar1Texto1(StaticText component) {
        this.campoIdFichaHogar1Texto1 = component;
    }

    private StaticText campoIdFichaHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFichaHogar1x1Texto1() {
        return campoIdFichaHogar1x1Texto1;
    }

    public void setCampoIdFichaHogar1x1Texto1(StaticText component) {
        this.campoIdFichaHogar1x1Texto1 = component;
    }

    private Button campoIdFichaHogar1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFichaHogar1Boton1() {
        return campoIdFichaHogar1Boton1;
    }

    public void setCampoIdFichaHogar1Boton1(Button component) {
        this.campoIdFichaHogar1Boton1 = component;
    }

    private Button campoIdFichaHogar1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFichaHogar1x1Boton1() {
        return campoIdFichaHogar1x1Boton1;
    }

    public void setCampoIdFichaHogar1x1Boton1(Button component) {
        this.campoIdFichaHogar1x1Boton1 = component;
    }

    private Button campoIdFichaHogar1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFichaHogar1Boton3() {
        return campoIdFichaHogar1Boton3;
    }

    public void setCampoIdFichaHogar1Boton3(Button component) {
        this.campoIdFichaHogar1Boton3 = component;
    }

    private Button campoIdFichaHogar1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFichaHogar1x1Boton3() {
        return campoIdFichaHogar1x1Boton3;
    }

    public void setCampoIdFichaHogar1x1Boton3(Button component) {
        this.campoIdFichaHogar1x1Boton3 = component;
    }

    private Label labelIdFichaHogar2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaHogar2() {
        return labelIdFichaHogar2;
    }

    public void setLabelIdFichaHogar2(Label l) {
        this.labelIdFichaHogar2 = l;
    }

    private Label labelIdFichaHogar1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaHogar1x2() {
        return labelIdFichaHogar1x2;
    }

    public void setLabelIdFichaHogar1x2(Label l) {
        this.labelIdFichaHogar1x2 = l;
    }

    private StaticText campoIdFichaHogar1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFichaHogar1Texto2() {
        return campoIdFichaHogar1Texto2;
    }

    public void setCampoIdFichaHogar1Texto2(StaticText component) {
        this.campoIdFichaHogar1Texto2 = component;
    }

    private StaticText campoIdFichaHogar1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFichaHogar1x1Texto2() {
        return campoIdFichaHogar1x1Texto2;
    }

    public void setCampoIdFichaHogar1x1Texto2(StaticText component) {
        this.campoIdFichaHogar1x1Texto2 = component;
    }

    private Button campoIdFichaHogar1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFichaHogar1Boton2() {
        return campoIdFichaHogar1Boton2;
    }

    public void setCampoIdFichaHogar1Boton2(Button component) {
        this.campoIdFichaHogar1Boton2 = component;
    }

    private Button campoIdFichaHogar1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFichaHogar1x1Boton2() {
        return campoIdFichaHogar1x1Boton2;
    }

    public void setCampoIdFichaHogar1x1Boton2(Button component) {
        this.campoIdFichaHogar1x1Boton2 = component;
    }

    private Label labelNumeroOrdenIdentificacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroOrdenIdentificacion1() {
        return labelNumeroOrdenIdentificacion1;
    }

    public void setLabelNumeroOrdenIdentificacion1(Label l) {
        this.labelNumeroOrdenIdentificacion1 = l;
    }

    private Label labelNumeroOrdenIdentificacion1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroOrdenIdentificacion1x1() {
        return labelNumeroOrdenIdentificacion1x1;
    }

    public void setLabelNumeroOrdenIdentificacion1x1(Label l) {
        this.labelNumeroOrdenIdentificacion1x1 = l;
    }

    private TextField campoNumeroOrdenIdentificacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroOrdenIdentificacion1() {
        return campoNumeroOrdenIdentificacion1;
    }

    public void setCampoNumeroOrdenIdentificacion1(TextField component) {
        this.campoNumeroOrdenIdentificacion1 = component;
    }

    private TextField campoNumeroOrdenIdentificacion1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroOrdenIdentificacion1x1() {
        return campoNumeroOrdenIdentificacion1x1;
    }

    public void setCampoNumeroOrdenIdentificacion1x1(TextField component) {
        this.campoNumeroOrdenIdentificacion1x1 = component;
    }

    private HelpInline helpInlineNumeroOrdenIdentificacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroOrdenIdentificacion1() {
        return helpInlineNumeroOrdenIdentificacion1;
    }

    public void setHelpInlineNumeroOrdenIdentificacion1(HelpInline hi) {
        this.helpInlineNumeroOrdenIdentificacion1 = hi;
    }

    private HelpInline helpInlineNumeroOrdenIdentificacion1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroOrdenIdentificacion1x1() {
        return helpInlineNumeroOrdenIdentificacion1x1;
    }

    public void setHelpInlineNumeroOrdenIdentificacion1x1(HelpInline hi) {
        this.helpInlineNumeroOrdenIdentificacion1x1 = hi;
    }

    private StaticText campoNumeroOrdenIdentificacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroOrdenIdentificacion1Texto1() {
        return campoNumeroOrdenIdentificacion1Texto1;
    }

    public void setCampoNumeroOrdenIdentificacion1Texto1(StaticText component) {
        this.campoNumeroOrdenIdentificacion1Texto1 = component;
    }

    private StaticText campoNumeroOrdenIdentificacion1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroOrdenIdentificacion1x1Texto1() {
        return campoNumeroOrdenIdentificacion1x1Texto1;
    }

    public void setCampoNumeroOrdenIdentificacion1x1Texto1(StaticText component) {
        this.campoNumeroOrdenIdentificacion1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroOrdenIdentificacion1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroOrdenIdentificacion1() {
        return converterNumeroOrdenIdentificacion1;
    }
  
    public void setConverterNumeroOrdenIdentificacion1(IntegerConverter converter) {
        this.converterNumeroOrdenIdentificacion1 = converter;
    }
  
    private LongRangeValidator validatorNumeroOrdenIdentificacion1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroOrdenIdentificacion1() {
        return validatorNumeroOrdenIdentificacion1;
    }
  
    public void setValidatorNumeroOrdenIdentificacion1(LongRangeValidator validator) {
        this.validatorNumeroOrdenIdentificacion1 = validator;
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
  
    private Label labelNumeroTipoPersonaHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoPersonaHogar1() {
        return labelNumeroTipoPersonaHogar1;
    }

    public void setLabelNumeroTipoPersonaHogar1(Label l) {
        this.labelNumeroTipoPersonaHogar1 = l;
    }

    private Label labelNumeroTipoPersonaHogar1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoPersonaHogar1x1() {
        return labelNumeroTipoPersonaHogar1x1;
    }

    public void setLabelNumeroTipoPersonaHogar1x1(Label l) {
        this.labelNumeroTipoPersonaHogar1x1 = l;
    }

    private DropDown listaNumeroTipoPersonaHogar1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoPersonaHogar1() {
        return listaNumeroTipoPersonaHogar1;
    }

    public void setListaNumeroTipoPersonaHogar1(DropDown component) {
        this.listaNumeroTipoPersonaHogar1 = component;
    }

    private DropDown listaNumeroTipoPersonaHogar1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoPersonaHogar1x1() {
        return listaNumeroTipoPersonaHogar1x1;
    }

    public void setListaNumeroTipoPersonaHogar1x1(DropDown component) {
        this.listaNumeroTipoPersonaHogar1x1 = component;
    }

    private HelpInline helpInlineNumeroTipoPersonaHogar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoPersonaHogar1() {
        return helpInlineNumeroTipoPersonaHogar1;
    }

    public void setHelpInlineNumeroTipoPersonaHogar1(HelpInline hi) {
        this.helpInlineNumeroTipoPersonaHogar1 = hi;
    }

    private HelpInline helpInlineNumeroTipoPersonaHogar1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoPersonaHogar1x1() {
        return helpInlineNumeroTipoPersonaHogar1x1;
    }

    public void setHelpInlineNumeroTipoPersonaHogar1x1(HelpInline hi) {
        this.helpInlineNumeroTipoPersonaHogar1x1 = hi;
    }

    private StaticText listaNumeroTipoPersonaHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoPersonaHogar1Texto1() {
        return listaNumeroTipoPersonaHogar1Texto1;
    }

    public void setListaNumeroTipoPersonaHogar1Texto1(StaticText component) {
        this.listaNumeroTipoPersonaHogar1Texto1 = component;
    }

    private StaticText listaNumeroTipoPersonaHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoPersonaHogar1x1Texto1() {
        return listaNumeroTipoPersonaHogar1x1Texto1;
    }

    public void setListaNumeroTipoPersonaHogar1x1Texto1(StaticText component) {
        this.listaNumeroTipoPersonaHogar1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoPersonaHogar1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoPersonaHogar1() {
        return converterNumeroTipoPersonaHogar1;
    }
  
    public void setConverterNumeroTipoPersonaHogar1(IntegerConverter converter) {
        this.converterNumeroTipoPersonaHogar1 = converter;
    }
  
    private Label labelNumeroSionoMiembroHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoMiembroHogar1() {
        return labelNumeroSionoMiembroHogar1;
    }

    public void setLabelNumeroSionoMiembroHogar1(Label l) {
        this.labelNumeroSionoMiembroHogar1 = l;
    }

    private Label labelNumeroSionoMiembroHogar1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoMiembroHogar1x1() {
        return labelNumeroSionoMiembroHogar1x1;
    }

    public void setLabelNumeroSionoMiembroHogar1x1(Label l) {
        this.labelNumeroSionoMiembroHogar1x1 = l;
    }

    private DropDown listaNumeroSionoMiembroHogar1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoMiembroHogar1() {
        return listaNumeroSionoMiembroHogar1;
    }

    public void setListaNumeroSionoMiembroHogar1(DropDown component) {
        this.listaNumeroSionoMiembroHogar1 = component;
    }

    private DropDown listaNumeroSionoMiembroHogar1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoMiembroHogar1x1() {
        return listaNumeroSionoMiembroHogar1x1;
    }

    public void setListaNumeroSionoMiembroHogar1x1(DropDown component) {
        this.listaNumeroSionoMiembroHogar1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoMiembroHogar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoMiembroHogar1() {
        return helpInlineNumeroSionoMiembroHogar1;
    }

    public void setHelpInlineNumeroSionoMiembroHogar1(HelpInline hi) {
        this.helpInlineNumeroSionoMiembroHogar1 = hi;
    }

    private HelpInline helpInlineNumeroSionoMiembroHogar1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoMiembroHogar1x1() {
        return helpInlineNumeroSionoMiembroHogar1x1;
    }

    public void setHelpInlineNumeroSionoMiembroHogar1x1(HelpInline hi) {
        this.helpInlineNumeroSionoMiembroHogar1x1 = hi;
    }

    private StaticText listaNumeroSionoMiembroHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoMiembroHogar1Texto1() {
        return listaNumeroSionoMiembroHogar1Texto1;
    }

    public void setListaNumeroSionoMiembroHogar1Texto1(StaticText component) {
        this.listaNumeroSionoMiembroHogar1Texto1 = component;
    }

    private StaticText listaNumeroSionoMiembroHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoMiembroHogar1x1Texto1() {
        return listaNumeroSionoMiembroHogar1x1Texto1;
    }

    public void setListaNumeroSionoMiembroHogar1x1Texto1(StaticText component) {
        this.listaNumeroSionoMiembroHogar1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoMiembroHogar1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoMiembroHogar1() {
        return converterNumeroSionoMiembroHogar1;
    }
  
    public void setConverterNumeroSionoMiembroHogar1(IntegerConverter converter) {
        this.converterNumeroSionoMiembroHogar1 = converter;
    }
  
    private Label labelNumeroOrdenIdenConyuge1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroOrdenIdenConyuge1() {
        return labelNumeroOrdenIdenConyuge1;
    }

    public void setLabelNumeroOrdenIdenConyuge1(Label l) {
        this.labelNumeroOrdenIdenConyuge1 = l;
    }

    private Label labelNumeroOrdenIdenConyuge1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroOrdenIdenConyuge1x1() {
        return labelNumeroOrdenIdenConyuge1x1;
    }

    public void setLabelNumeroOrdenIdenConyuge1x1(Label l) {
        this.labelNumeroOrdenIdenConyuge1x1 = l;
    }

    private TextField campoNumeroOrdenIdenConyuge1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroOrdenIdenConyuge1() {
        return campoNumeroOrdenIdenConyuge1;
    }

    public void setCampoNumeroOrdenIdenConyuge1(TextField component) {
        this.campoNumeroOrdenIdenConyuge1 = component;
    }

    private TextField campoNumeroOrdenIdenConyuge1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroOrdenIdenConyuge1x1() {
        return campoNumeroOrdenIdenConyuge1x1;
    }

    public void setCampoNumeroOrdenIdenConyuge1x1(TextField component) {
        this.campoNumeroOrdenIdenConyuge1x1 = component;
    }

    private HelpInline helpInlineNumeroOrdenIdenConyuge1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroOrdenIdenConyuge1() {
        return helpInlineNumeroOrdenIdenConyuge1;
    }

    public void setHelpInlineNumeroOrdenIdenConyuge1(HelpInline hi) {
        this.helpInlineNumeroOrdenIdenConyuge1 = hi;
    }

    private HelpInline helpInlineNumeroOrdenIdenConyuge1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroOrdenIdenConyuge1x1() {
        return helpInlineNumeroOrdenIdenConyuge1x1;
    }

    public void setHelpInlineNumeroOrdenIdenConyuge1x1(HelpInline hi) {
        this.helpInlineNumeroOrdenIdenConyuge1x1 = hi;
    }

    private StaticText campoNumeroOrdenIdenConyuge1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroOrdenIdenConyuge1Texto1() {
        return campoNumeroOrdenIdenConyuge1Texto1;
    }

    public void setCampoNumeroOrdenIdenConyuge1Texto1(StaticText component) {
        this.campoNumeroOrdenIdenConyuge1Texto1 = component;
    }

    private StaticText campoNumeroOrdenIdenConyuge1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroOrdenIdenConyuge1x1Texto1() {
        return campoNumeroOrdenIdenConyuge1x1Texto1;
    }

    public void setCampoNumeroOrdenIdenConyuge1x1Texto1(StaticText component) {
        this.campoNumeroOrdenIdenConyuge1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroOrdenIdenConyuge1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroOrdenIdenConyuge1() {
        return converterNumeroOrdenIdenConyuge1;
    }
  
    public void setConverterNumeroOrdenIdenConyuge1(IntegerConverter converter) {
        this.converterNumeroOrdenIdenConyuge1 = converter;
    }
  
    private LongRangeValidator validatorNumeroOrdenIdenConyuge1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroOrdenIdenConyuge1() {
        return validatorNumeroOrdenIdenConyuge1;
    }
  
    public void setValidatorNumeroOrdenIdenConyuge1(LongRangeValidator validator) {
        this.validatorNumeroOrdenIdenConyuge1 = validator;
    }
  
    private Label labelNumeroOrdenIdenPadre1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroOrdenIdenPadre1() {
        return labelNumeroOrdenIdenPadre1;
    }

    public void setLabelNumeroOrdenIdenPadre1(Label l) {
        this.labelNumeroOrdenIdenPadre1 = l;
    }

    private Label labelNumeroOrdenIdenPadre1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroOrdenIdenPadre1x1() {
        return labelNumeroOrdenIdenPadre1x1;
    }

    public void setLabelNumeroOrdenIdenPadre1x1(Label l) {
        this.labelNumeroOrdenIdenPadre1x1 = l;
    }

    private TextField campoNumeroOrdenIdenPadre1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroOrdenIdenPadre1() {
        return campoNumeroOrdenIdenPadre1;
    }

    public void setCampoNumeroOrdenIdenPadre1(TextField component) {
        this.campoNumeroOrdenIdenPadre1 = component;
    }

    private TextField campoNumeroOrdenIdenPadre1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroOrdenIdenPadre1x1() {
        return campoNumeroOrdenIdenPadre1x1;
    }

    public void setCampoNumeroOrdenIdenPadre1x1(TextField component) {
        this.campoNumeroOrdenIdenPadre1x1 = component;
    }

    private HelpInline helpInlineNumeroOrdenIdenPadre1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroOrdenIdenPadre1() {
        return helpInlineNumeroOrdenIdenPadre1;
    }

    public void setHelpInlineNumeroOrdenIdenPadre1(HelpInline hi) {
        this.helpInlineNumeroOrdenIdenPadre1 = hi;
    }

    private HelpInline helpInlineNumeroOrdenIdenPadre1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroOrdenIdenPadre1x1() {
        return helpInlineNumeroOrdenIdenPadre1x1;
    }

    public void setHelpInlineNumeroOrdenIdenPadre1x1(HelpInline hi) {
        this.helpInlineNumeroOrdenIdenPadre1x1 = hi;
    }

    private StaticText campoNumeroOrdenIdenPadre1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroOrdenIdenPadre1Texto1() {
        return campoNumeroOrdenIdenPadre1Texto1;
    }

    public void setCampoNumeroOrdenIdenPadre1Texto1(StaticText component) {
        this.campoNumeroOrdenIdenPadre1Texto1 = component;
    }

    private StaticText campoNumeroOrdenIdenPadre1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroOrdenIdenPadre1x1Texto1() {
        return campoNumeroOrdenIdenPadre1x1Texto1;
    }

    public void setCampoNumeroOrdenIdenPadre1x1Texto1(StaticText component) {
        this.campoNumeroOrdenIdenPadre1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroOrdenIdenPadre1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroOrdenIdenPadre1() {
        return converterNumeroOrdenIdenPadre1;
    }
  
    public void setConverterNumeroOrdenIdenPadre1(IntegerConverter converter) {
        this.converterNumeroOrdenIdenPadre1 = converter;
    }
  
    private LongRangeValidator validatorNumeroOrdenIdenPadre1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroOrdenIdenPadre1() {
        return validatorNumeroOrdenIdenPadre1;
    }
  
    public void setValidatorNumeroOrdenIdenPadre1(LongRangeValidator validator) {
        this.validatorNumeroOrdenIdenPadre1 = validator;
    }
  
    private Label labelNumeroOrdenIdenMadre1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroOrdenIdenMadre1() {
        return labelNumeroOrdenIdenMadre1;
    }

    public void setLabelNumeroOrdenIdenMadre1(Label l) {
        this.labelNumeroOrdenIdenMadre1 = l;
    }

    private Label labelNumeroOrdenIdenMadre1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroOrdenIdenMadre1x1() {
        return labelNumeroOrdenIdenMadre1x1;
    }

    public void setLabelNumeroOrdenIdenMadre1x1(Label l) {
        this.labelNumeroOrdenIdenMadre1x1 = l;
    }

    private TextField campoNumeroOrdenIdenMadre1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoNumeroOrdenIdenMadre1() {
        return campoNumeroOrdenIdenMadre1;
    }

    public void setCampoNumeroOrdenIdenMadre1(TextField component) {
        this.campoNumeroOrdenIdenMadre1 = component;
    }

    private TextField campoNumeroOrdenIdenMadre1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNumeroOrdenIdenMadre1x1() {
        return campoNumeroOrdenIdenMadre1x1;
    }

    public void setCampoNumeroOrdenIdenMadre1x1(TextField component) {
        this.campoNumeroOrdenIdenMadre1x1 = component;
    }

    private HelpInline helpInlineNumeroOrdenIdenMadre1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroOrdenIdenMadre1() {
        return helpInlineNumeroOrdenIdenMadre1;
    }

    public void setHelpInlineNumeroOrdenIdenMadre1(HelpInline hi) {
        this.helpInlineNumeroOrdenIdenMadre1 = hi;
    }

    private HelpInline helpInlineNumeroOrdenIdenMadre1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroOrdenIdenMadre1x1() {
        return helpInlineNumeroOrdenIdenMadre1x1;
    }

    public void setHelpInlineNumeroOrdenIdenMadre1x1(HelpInline hi) {
        this.helpInlineNumeroOrdenIdenMadre1x1 = hi;
    }

    private StaticText campoNumeroOrdenIdenMadre1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroOrdenIdenMadre1Texto1() {
        return campoNumeroOrdenIdenMadre1Texto1;
    }

    public void setCampoNumeroOrdenIdenMadre1Texto1(StaticText component) {
        this.campoNumeroOrdenIdenMadre1Texto1 = component;
    }

    private StaticText campoNumeroOrdenIdenMadre1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNumeroOrdenIdenMadre1x1Texto1() {
        return campoNumeroOrdenIdenMadre1x1Texto1;
    }

    public void setCampoNumeroOrdenIdenMadre1x1Texto1(StaticText component) {
        this.campoNumeroOrdenIdenMadre1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroOrdenIdenMadre1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroOrdenIdenMadre1() {
        return converterNumeroOrdenIdenMadre1;
    }
  
    public void setConverterNumeroOrdenIdenMadre1(IntegerConverter converter) {
        this.converterNumeroOrdenIdenMadre1 = converter;
    }
  
    private LongRangeValidator validatorNumeroOrdenIdenMadre1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorNumeroOrdenIdenMadre1() {
        return validatorNumeroOrdenIdenMadre1;
    }
  
    public void setValidatorNumeroOrdenIdenMadre1(LongRangeValidator validator) {
        this.validatorNumeroOrdenIdenMadre1 = validator;
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
  
    private Label labelNumeroTipoExcepcionCed1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoExcepcionCed1() {
        return labelNumeroTipoExcepcionCed1;
    }

    public void setLabelNumeroTipoExcepcionCed1(Label l) {
        this.labelNumeroTipoExcepcionCed1 = l;
    }

    private Label labelNumeroTipoExcepcionCed1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoExcepcionCed1x1() {
        return labelNumeroTipoExcepcionCed1x1;
    }

    public void setLabelNumeroTipoExcepcionCed1x1(Label l) {
        this.labelNumeroTipoExcepcionCed1x1 = l;
    }

    private DropDown listaNumeroTipoExcepcionCed1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoExcepcionCed1() {
        return listaNumeroTipoExcepcionCed1;
    }

    public void setListaNumeroTipoExcepcionCed1(DropDown component) {
        this.listaNumeroTipoExcepcionCed1 = component;
    }

    private DropDown listaNumeroTipoExcepcionCed1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoExcepcionCed1x1() {
        return listaNumeroTipoExcepcionCed1x1;
    }

    public void setListaNumeroTipoExcepcionCed1x1(DropDown component) {
        this.listaNumeroTipoExcepcionCed1x1 = component;
    }

    private HelpInline helpInlineNumeroTipoExcepcionCed1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoExcepcionCed1() {
        return helpInlineNumeroTipoExcepcionCed1;
    }

    public void setHelpInlineNumeroTipoExcepcionCed1(HelpInline hi) {
        this.helpInlineNumeroTipoExcepcionCed1 = hi;
    }

    private HelpInline helpInlineNumeroTipoExcepcionCed1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoExcepcionCed1x1() {
        return helpInlineNumeroTipoExcepcionCed1x1;
    }

    public void setHelpInlineNumeroTipoExcepcionCed1x1(HelpInline hi) {
        this.helpInlineNumeroTipoExcepcionCed1x1 = hi;
    }

    private StaticText listaNumeroTipoExcepcionCed1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoExcepcionCed1Texto1() {
        return listaNumeroTipoExcepcionCed1Texto1;
    }

    public void setListaNumeroTipoExcepcionCed1Texto1(StaticText component) {
        this.listaNumeroTipoExcepcionCed1Texto1 = component;
    }

    private StaticText listaNumeroTipoExcepcionCed1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoExcepcionCed1x1Texto1() {
        return listaNumeroTipoExcepcionCed1x1Texto1;
    }

    public void setListaNumeroTipoExcepcionCed1x1Texto1(StaticText component) {
        this.listaNumeroTipoExcepcionCed1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoExcepcionCed1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoExcepcionCed1() {
        return converterNumeroTipoExcepcionCed1;
    }
  
    public void setConverterNumeroTipoExcepcionCed1(IntegerConverter converter) {
        this.converterNumeroTipoExcepcionCed1 = converter;
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
  
    private Label labelIdDepartamentoNacimiento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamentoNacimiento1() {
        return labelIdDepartamentoNacimiento1;
    }

    public void setLabelIdDepartamentoNacimiento1(Label l) {
        this.labelIdDepartamentoNacimiento1 = l;
    }

    private Label labelIdDepartamentoNacimiento1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamentoNacimiento1x1() {
        return labelIdDepartamentoNacimiento1x1;
    }

    public void setLabelIdDepartamentoNacimiento1x1(Label l) {
        this.labelIdDepartamentoNacimiento1x1 = l;
    }

    private TextField campoIdDepartamentoNacimiento1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdDepartamentoNacimiento1() {
        return campoIdDepartamentoNacimiento1;
    }

    public void setCampoIdDepartamentoNacimiento1(TextField component) {
        this.campoIdDepartamentoNacimiento1 = component;
    }

    private TextField campoIdDepartamentoNacimiento1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdDepartamentoNacimiento1x1() {
        return campoIdDepartamentoNacimiento1x1;
    }

    public void setCampoIdDepartamentoNacimiento1x1(TextField component) {
        this.campoIdDepartamentoNacimiento1x1 = component;
    }

    private HelpInline helpInlineIdDepartamentoNacimiento1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdDepartamentoNacimiento1() {
        return helpInlineIdDepartamentoNacimiento1;
    }

    public void setHelpInlineIdDepartamentoNacimiento1(HelpInline hi) {
        this.helpInlineIdDepartamentoNacimiento1 = hi;
    }

    private HelpInline helpInlineIdDepartamentoNacimiento1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdDepartamentoNacimiento1x1() {
        return helpInlineIdDepartamentoNacimiento1x1;
    }

    public void setHelpInlineIdDepartamentoNacimiento1x1(HelpInline hi) {
        this.helpInlineIdDepartamentoNacimiento1x1 = hi;
    }

    private StaticText campoIdDepartamentoNacimiento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDepartamentoNacimiento1Texto1() {
        return campoIdDepartamentoNacimiento1Texto1;
    }

    public void setCampoIdDepartamentoNacimiento1Texto1(StaticText component) {
        this.campoIdDepartamentoNacimiento1Texto1 = component;
    }

    private StaticText campoIdDepartamentoNacimiento1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDepartamentoNacimiento1x1Texto1() {
        return campoIdDepartamentoNacimiento1x1Texto1;
    }

    public void setCampoIdDepartamentoNacimiento1x1Texto1(StaticText component) {
        this.campoIdDepartamentoNacimiento1x1Texto1 = component;
    }

    private Button campoIdDepartamentoNacimiento1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDepartamentoNacimiento1Boton1() {
        return campoIdDepartamentoNacimiento1Boton1;
    }

    public void setCampoIdDepartamentoNacimiento1Boton1(Button component) {
        this.campoIdDepartamentoNacimiento1Boton1 = component;
    }

    private Button campoIdDepartamentoNacimiento1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDepartamentoNacimiento1x1Boton1() {
        return campoIdDepartamentoNacimiento1x1Boton1;
    }

    public void setCampoIdDepartamentoNacimiento1x1Boton1(Button component) {
        this.campoIdDepartamentoNacimiento1x1Boton1 = component;
    }

    private Button campoIdDepartamentoNacimiento1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDepartamentoNacimiento1Boton3() {
        return campoIdDepartamentoNacimiento1Boton3;
    }

    public void setCampoIdDepartamentoNacimiento1Boton3(Button component) {
        this.campoIdDepartamentoNacimiento1Boton3 = component;
    }

    private Button campoIdDepartamentoNacimiento1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDepartamentoNacimiento1x1Boton3() {
        return campoIdDepartamentoNacimiento1x1Boton3;
    }

    public void setCampoIdDepartamentoNacimiento1x1Boton3(Button component) {
        this.campoIdDepartamentoNacimiento1x1Boton3 = component;
    }

    private Label labelIdDepartamentoNacimiento2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamentoNacimiento2() {
        return labelIdDepartamentoNacimiento2;
    }

    public void setLabelIdDepartamentoNacimiento2(Label l) {
        this.labelIdDepartamentoNacimiento2 = l;
    }

    private Label labelIdDepartamentoNacimiento1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDepartamentoNacimiento1x2() {
        return labelIdDepartamentoNacimiento1x2;
    }

    public void setLabelIdDepartamentoNacimiento1x2(Label l) {
        this.labelIdDepartamentoNacimiento1x2 = l;
    }

    private StaticText campoIdDepartamentoNacimiento1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdDepartamentoNacimiento1Texto2() {
        return campoIdDepartamentoNacimiento1Texto2;
    }

    public void setCampoIdDepartamentoNacimiento1Texto2(StaticText component) {
        this.campoIdDepartamentoNacimiento1Texto2 = component;
    }

    private StaticText campoIdDepartamentoNacimiento1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdDepartamentoNacimiento1x1Texto2() {
        return campoIdDepartamentoNacimiento1x1Texto2;
    }

    public void setCampoIdDepartamentoNacimiento1x1Texto2(StaticText component) {
        this.campoIdDepartamentoNacimiento1x1Texto2 = component;
    }

    private Button campoIdDepartamentoNacimiento1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDepartamentoNacimiento1Boton2() {
        return campoIdDepartamentoNacimiento1Boton2;
    }

    public void setCampoIdDepartamentoNacimiento1Boton2(Button component) {
        this.campoIdDepartamentoNacimiento1Boton2 = component;
    }

    private Button campoIdDepartamentoNacimiento1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDepartamentoNacimiento1x1Boton2() {
        return campoIdDepartamentoNacimiento1x1Boton2;
    }

    public void setCampoIdDepartamentoNacimiento1x1Boton2(Button component) {
        this.campoIdDepartamentoNacimiento1x1Boton2 = component;
    }

    private Label labelIdDistritoNacimiento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDistritoNacimiento1() {
        return labelIdDistritoNacimiento1;
    }

    public void setLabelIdDistritoNacimiento1(Label l) {
        this.labelIdDistritoNacimiento1 = l;
    }

    private Label labelIdDistritoNacimiento1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDistritoNacimiento1x1() {
        return labelIdDistritoNacimiento1x1;
    }

    public void setLabelIdDistritoNacimiento1x1(Label l) {
        this.labelIdDistritoNacimiento1x1 = l;
    }

    private TextField campoIdDistritoNacimiento1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdDistritoNacimiento1() {
        return campoIdDistritoNacimiento1;
    }

    public void setCampoIdDistritoNacimiento1(TextField component) {
        this.campoIdDistritoNacimiento1 = component;
    }

    private TextField campoIdDistritoNacimiento1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdDistritoNacimiento1x1() {
        return campoIdDistritoNacimiento1x1;
    }

    public void setCampoIdDistritoNacimiento1x1(TextField component) {
        this.campoIdDistritoNacimiento1x1 = component;
    }

    private HelpInline helpInlineIdDistritoNacimiento1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdDistritoNacimiento1() {
        return helpInlineIdDistritoNacimiento1;
    }

    public void setHelpInlineIdDistritoNacimiento1(HelpInline hi) {
        this.helpInlineIdDistritoNacimiento1 = hi;
    }

    private HelpInline helpInlineIdDistritoNacimiento1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdDistritoNacimiento1x1() {
        return helpInlineIdDistritoNacimiento1x1;
    }

    public void setHelpInlineIdDistritoNacimiento1x1(HelpInline hi) {
        this.helpInlineIdDistritoNacimiento1x1 = hi;
    }

    private StaticText campoIdDistritoNacimiento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDistritoNacimiento1Texto1() {
        return campoIdDistritoNacimiento1Texto1;
    }

    public void setCampoIdDistritoNacimiento1Texto1(StaticText component) {
        this.campoIdDistritoNacimiento1Texto1 = component;
    }

    private StaticText campoIdDistritoNacimiento1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdDistritoNacimiento1x1Texto1() {
        return campoIdDistritoNacimiento1x1Texto1;
    }

    public void setCampoIdDistritoNacimiento1x1Texto1(StaticText component) {
        this.campoIdDistritoNacimiento1x1Texto1 = component;
    }

    private Button campoIdDistritoNacimiento1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDistritoNacimiento1Boton1() {
        return campoIdDistritoNacimiento1Boton1;
    }

    public void setCampoIdDistritoNacimiento1Boton1(Button component) {
        this.campoIdDistritoNacimiento1Boton1 = component;
    }

    private Button campoIdDistritoNacimiento1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdDistritoNacimiento1x1Boton1() {
        return campoIdDistritoNacimiento1x1Boton1;
    }

    public void setCampoIdDistritoNacimiento1x1Boton1(Button component) {
        this.campoIdDistritoNacimiento1x1Boton1 = component;
    }

    private Button campoIdDistritoNacimiento1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDistritoNacimiento1Boton3() {
        return campoIdDistritoNacimiento1Boton3;
    }

    public void setCampoIdDistritoNacimiento1Boton3(Button component) {
        this.campoIdDistritoNacimiento1Boton3 = component;
    }

    private Button campoIdDistritoNacimiento1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDistritoNacimiento1x1Boton3() {
        return campoIdDistritoNacimiento1x1Boton3;
    }

    public void setCampoIdDistritoNacimiento1x1Boton3(Button component) {
        this.campoIdDistritoNacimiento1x1Boton3 = component;
    }

    private Label labelIdDistritoNacimiento2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDistritoNacimiento2() {
        return labelIdDistritoNacimiento2;
    }

    public void setLabelIdDistritoNacimiento2(Label l) {
        this.labelIdDistritoNacimiento2 = l;
    }

    private Label labelIdDistritoNacimiento1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdDistritoNacimiento1x2() {
        return labelIdDistritoNacimiento1x2;
    }

    public void setLabelIdDistritoNacimiento1x2(Label l) {
        this.labelIdDistritoNacimiento1x2 = l;
    }

    private StaticText campoIdDistritoNacimiento1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdDistritoNacimiento1Texto2() {
        return campoIdDistritoNacimiento1Texto2;
    }

    public void setCampoIdDistritoNacimiento1Texto2(StaticText component) {
        this.campoIdDistritoNacimiento1Texto2 = component;
    }

    private StaticText campoIdDistritoNacimiento1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdDistritoNacimiento1x1Texto2() {
        return campoIdDistritoNacimiento1x1Texto2;
    }

    public void setCampoIdDistritoNacimiento1x1Texto2(StaticText component) {
        this.campoIdDistritoNacimiento1x1Texto2 = component;
    }

    private Button campoIdDistritoNacimiento1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDistritoNacimiento1Boton2() {
        return campoIdDistritoNacimiento1Boton2;
    }

    public void setCampoIdDistritoNacimiento1Boton2(Button component) {
        this.campoIdDistritoNacimiento1Boton2 = component;
    }

    private Button campoIdDistritoNacimiento1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdDistritoNacimiento1x1Boton2() {
        return campoIdDistritoNacimiento1x1Boton2;
    }

    public void setCampoIdDistritoNacimiento1x1Boton2(Button component) {
        this.campoIdDistritoNacimiento1x1Boton2 = component;
    }

    private Label labelNumeroTipoAreaLugarNac1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoAreaLugarNac1() {
        return labelNumeroTipoAreaLugarNac1;
    }

    public void setLabelNumeroTipoAreaLugarNac1(Label l) {
        this.labelNumeroTipoAreaLugarNac1 = l;
    }

    private Label labelNumeroTipoAreaLugarNac1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoAreaLugarNac1x1() {
        return labelNumeroTipoAreaLugarNac1x1;
    }

    public void setLabelNumeroTipoAreaLugarNac1x1(Label l) {
        this.labelNumeroTipoAreaLugarNac1x1 = l;
    }

    private DropDown listaNumeroTipoAreaLugarNac1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoAreaLugarNac1() {
        return listaNumeroTipoAreaLugarNac1;
    }

    public void setListaNumeroTipoAreaLugarNac1(DropDown component) {
        this.listaNumeroTipoAreaLugarNac1 = component;
    }

    private DropDown listaNumeroTipoAreaLugarNac1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoAreaLugarNac1x1() {
        return listaNumeroTipoAreaLugarNac1x1;
    }

    public void setListaNumeroTipoAreaLugarNac1x1(DropDown component) {
        this.listaNumeroTipoAreaLugarNac1x1 = component;
    }

    private HelpInline helpInlineNumeroTipoAreaLugarNac1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoAreaLugarNac1() {
        return helpInlineNumeroTipoAreaLugarNac1;
    }

    public void setHelpInlineNumeroTipoAreaLugarNac1(HelpInline hi) {
        this.helpInlineNumeroTipoAreaLugarNac1 = hi;
    }

    private HelpInline helpInlineNumeroTipoAreaLugarNac1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoAreaLugarNac1x1() {
        return helpInlineNumeroTipoAreaLugarNac1x1;
    }

    public void setHelpInlineNumeroTipoAreaLugarNac1x1(HelpInline hi) {
        this.helpInlineNumeroTipoAreaLugarNac1x1 = hi;
    }

    private StaticText listaNumeroTipoAreaLugarNac1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoAreaLugarNac1Texto1() {
        return listaNumeroTipoAreaLugarNac1Texto1;
    }

    public void setListaNumeroTipoAreaLugarNac1Texto1(StaticText component) {
        this.listaNumeroTipoAreaLugarNac1Texto1 = component;
    }

    private StaticText listaNumeroTipoAreaLugarNac1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoAreaLugarNac1x1Texto1() {
        return listaNumeroTipoAreaLugarNac1x1Texto1;
    }

    public void setListaNumeroTipoAreaLugarNac1x1Texto1(StaticText component) {
        this.listaNumeroTipoAreaLugarNac1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoAreaLugarNac1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoAreaLugarNac1() {
        return converterNumeroTipoAreaLugarNac1;
    }
  
    public void setConverterNumeroTipoAreaLugarNac1(IntegerConverter converter) {
        this.converterNumeroTipoAreaLugarNac1 = converter;
    }
  
    private Label labelNumeroIdiomaHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroIdiomaHogar1() {
        return labelNumeroIdiomaHogar1;
    }

    public void setLabelNumeroIdiomaHogar1(Label l) {
        this.labelNumeroIdiomaHogar1 = l;
    }

    private Label labelNumeroIdiomaHogar1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroIdiomaHogar1x1() {
        return labelNumeroIdiomaHogar1x1;
    }

    public void setLabelNumeroIdiomaHogar1x1(Label l) {
        this.labelNumeroIdiomaHogar1x1 = l;
    }

    private DropDown listaNumeroIdiomaHogar1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroIdiomaHogar1() {
        return listaNumeroIdiomaHogar1;
    }

    public void setListaNumeroIdiomaHogar1(DropDown component) {
        this.listaNumeroIdiomaHogar1 = component;
    }

    private DropDown listaNumeroIdiomaHogar1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroIdiomaHogar1x1() {
        return listaNumeroIdiomaHogar1x1;
    }

    public void setListaNumeroIdiomaHogar1x1(DropDown component) {
        this.listaNumeroIdiomaHogar1x1 = component;
    }

    private HelpInline helpInlineNumeroIdiomaHogar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroIdiomaHogar1() {
        return helpInlineNumeroIdiomaHogar1;
    }

    public void setHelpInlineNumeroIdiomaHogar1(HelpInline hi) {
        this.helpInlineNumeroIdiomaHogar1 = hi;
    }

    private HelpInline helpInlineNumeroIdiomaHogar1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroIdiomaHogar1x1() {
        return helpInlineNumeroIdiomaHogar1x1;
    }

    public void setHelpInlineNumeroIdiomaHogar1x1(HelpInline hi) {
        this.helpInlineNumeroIdiomaHogar1x1 = hi;
    }

    private StaticText listaNumeroIdiomaHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroIdiomaHogar1Texto1() {
        return listaNumeroIdiomaHogar1Texto1;
    }

    public void setListaNumeroIdiomaHogar1Texto1(StaticText component) {
        this.listaNumeroIdiomaHogar1Texto1 = component;
    }

    private StaticText listaNumeroIdiomaHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroIdiomaHogar1x1Texto1() {
        return listaNumeroIdiomaHogar1x1Texto1;
    }

    public void setListaNumeroIdiomaHogar1x1Texto1(StaticText component) {
        this.listaNumeroIdiomaHogar1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroIdiomaHogar1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroIdiomaHogar1() {
        return converterNumeroIdiomaHogar1;
    }
  
    public void setConverterNumeroIdiomaHogar1(IntegerConverter converter) {
        this.converterNumeroIdiomaHogar1 = converter;
    }
  
    private Label labelOtroIdiomaHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtroIdiomaHogar1() {
        return labelOtroIdiomaHogar1;
    }

    public void setLabelOtroIdiomaHogar1(Label l) {
        this.labelOtroIdiomaHogar1 = l;
    }

    private Label labelOtroIdiomaHogar1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtroIdiomaHogar1x1() {
        return labelOtroIdiomaHogar1x1;
    }

    public void setLabelOtroIdiomaHogar1x1(Label l) {
        this.labelOtroIdiomaHogar1x1 = l;
    }

    private TextField campoOtroIdiomaHogar1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOtroIdiomaHogar1() {
        return campoOtroIdiomaHogar1;
    }

    public void setCampoOtroIdiomaHogar1(TextField component) {
        this.campoOtroIdiomaHogar1 = component;
    }

    private TextField campoOtroIdiomaHogar1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtroIdiomaHogar1x1() {
        return campoOtroIdiomaHogar1x1;
    }

    public void setCampoOtroIdiomaHogar1x1(TextField component) {
        this.campoOtroIdiomaHogar1x1 = component;
    }

    private HelpInline helpInlineOtroIdiomaHogar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtroIdiomaHogar1() {
        return helpInlineOtroIdiomaHogar1;
    }

    public void setHelpInlineOtroIdiomaHogar1(HelpInline hi) {
        this.helpInlineOtroIdiomaHogar1 = hi;
    }

    private HelpInline helpInlineOtroIdiomaHogar1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtroIdiomaHogar1x1() {
        return helpInlineOtroIdiomaHogar1x1;
    }

    public void setHelpInlineOtroIdiomaHogar1x1(HelpInline hi) {
        this.helpInlineOtroIdiomaHogar1x1 = hi;
    }

    private StaticText campoOtroIdiomaHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtroIdiomaHogar1Texto1() {
        return campoOtroIdiomaHogar1Texto1;
    }

    public void setCampoOtroIdiomaHogar1Texto1(StaticText component) {
        this.campoOtroIdiomaHogar1Texto1 = component;
    }

    private StaticText campoOtroIdiomaHogar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtroIdiomaHogar1x1Texto1() {
        return campoOtroIdiomaHogar1x1Texto1;
    }

    public void setCampoOtroIdiomaHogar1x1Texto1(StaticText component) {
        this.campoOtroIdiomaHogar1x1Texto1 = component;
    }

    private LengthValidator validatorOtroIdiomaHogar1 = new LengthValidator();
  
    public LengthValidator getValidatorOtroIdiomaHogar1() {
        return validatorOtroIdiomaHogar1;
    }
  
    public void setValidatorOtroIdiomaHogar1(LengthValidator validator) {
        this.validatorOtroIdiomaHogar1 = validator;
    }
  
    private Label labelNumeroSionoAsistenciaEsc1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoAsistenciaEsc1() {
        return labelNumeroSionoAsistenciaEsc1;
    }

    public void setLabelNumeroSionoAsistenciaEsc1(Label l) {
        this.labelNumeroSionoAsistenciaEsc1 = l;
    }

    private Label labelNumeroSionoAsistenciaEsc1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoAsistenciaEsc1x1() {
        return labelNumeroSionoAsistenciaEsc1x1;
    }

    public void setLabelNumeroSionoAsistenciaEsc1x1(Label l) {
        this.labelNumeroSionoAsistenciaEsc1x1 = l;
    }

    private DropDown listaNumeroSionoAsistenciaEsc1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoAsistenciaEsc1() {
        return listaNumeroSionoAsistenciaEsc1;
    }

    public void setListaNumeroSionoAsistenciaEsc1(DropDown component) {
        this.listaNumeroSionoAsistenciaEsc1 = component;
    }

    private DropDown listaNumeroSionoAsistenciaEsc1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoAsistenciaEsc1x1() {
        return listaNumeroSionoAsistenciaEsc1x1;
    }

    public void setListaNumeroSionoAsistenciaEsc1x1(DropDown component) {
        this.listaNumeroSionoAsistenciaEsc1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoAsistenciaEsc1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoAsistenciaEsc1() {
        return helpInlineNumeroSionoAsistenciaEsc1;
    }

    public void setHelpInlineNumeroSionoAsistenciaEsc1(HelpInline hi) {
        this.helpInlineNumeroSionoAsistenciaEsc1 = hi;
    }

    private HelpInline helpInlineNumeroSionoAsistenciaEsc1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoAsistenciaEsc1x1() {
        return helpInlineNumeroSionoAsistenciaEsc1x1;
    }

    public void setHelpInlineNumeroSionoAsistenciaEsc1x1(HelpInline hi) {
        this.helpInlineNumeroSionoAsistenciaEsc1x1 = hi;
    }

    private StaticText listaNumeroSionoAsistenciaEsc1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoAsistenciaEsc1Texto1() {
        return listaNumeroSionoAsistenciaEsc1Texto1;
    }

    public void setListaNumeroSionoAsistenciaEsc1Texto1(StaticText component) {
        this.listaNumeroSionoAsistenciaEsc1Texto1 = component;
    }

    private StaticText listaNumeroSionoAsistenciaEsc1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoAsistenciaEsc1x1Texto1() {
        return listaNumeroSionoAsistenciaEsc1x1Texto1;
    }

    public void setListaNumeroSionoAsistenciaEsc1x1Texto1(StaticText component) {
        this.listaNumeroSionoAsistenciaEsc1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoAsistenciaEsc1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoAsistenciaEsc1() {
        return converterNumeroSionoAsistenciaEsc1;
    }
  
    public void setConverterNumeroSionoAsistenciaEsc1(IntegerConverter converter) {
        this.converterNumeroSionoAsistenciaEsc1 = converter;
    }
  
    private Label labelNumeroMotivoInaEsc1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroMotivoInaEsc1() {
        return labelNumeroMotivoInaEsc1;
    }

    public void setLabelNumeroMotivoInaEsc1(Label l) {
        this.labelNumeroMotivoInaEsc1 = l;
    }

    private Label labelNumeroMotivoInaEsc1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroMotivoInaEsc1x1() {
        return labelNumeroMotivoInaEsc1x1;
    }

    public void setLabelNumeroMotivoInaEsc1x1(Label l) {
        this.labelNumeroMotivoInaEsc1x1 = l;
    }

    private DropDown listaNumeroMotivoInaEsc1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroMotivoInaEsc1() {
        return listaNumeroMotivoInaEsc1;
    }

    public void setListaNumeroMotivoInaEsc1(DropDown component) {
        this.listaNumeroMotivoInaEsc1 = component;
    }

    private DropDown listaNumeroMotivoInaEsc1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroMotivoInaEsc1x1() {
        return listaNumeroMotivoInaEsc1x1;
    }

    public void setListaNumeroMotivoInaEsc1x1(DropDown component) {
        this.listaNumeroMotivoInaEsc1x1 = component;
    }

    private HelpInline helpInlineNumeroMotivoInaEsc1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroMotivoInaEsc1() {
        return helpInlineNumeroMotivoInaEsc1;
    }

    public void setHelpInlineNumeroMotivoInaEsc1(HelpInline hi) {
        this.helpInlineNumeroMotivoInaEsc1 = hi;
    }

    private HelpInline helpInlineNumeroMotivoInaEsc1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroMotivoInaEsc1x1() {
        return helpInlineNumeroMotivoInaEsc1x1;
    }

    public void setHelpInlineNumeroMotivoInaEsc1x1(HelpInline hi) {
        this.helpInlineNumeroMotivoInaEsc1x1 = hi;
    }

    private StaticText listaNumeroMotivoInaEsc1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroMotivoInaEsc1Texto1() {
        return listaNumeroMotivoInaEsc1Texto1;
    }

    public void setListaNumeroMotivoInaEsc1Texto1(StaticText component) {
        this.listaNumeroMotivoInaEsc1Texto1 = component;
    }

    private StaticText listaNumeroMotivoInaEsc1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroMotivoInaEsc1x1Texto1() {
        return listaNumeroMotivoInaEsc1x1Texto1;
    }

    public void setListaNumeroMotivoInaEsc1x1Texto1(StaticText component) {
        this.listaNumeroMotivoInaEsc1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroMotivoInaEsc1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroMotivoInaEsc1() {
        return converterNumeroMotivoInaEsc1;
    }
  
    public void setConverterNumeroMotivoInaEsc1(IntegerConverter converter) {
        this.converterNumeroMotivoInaEsc1 = converter;
    }
  
    private Label labelOtroMotivoInaEsc1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtroMotivoInaEsc1() {
        return labelOtroMotivoInaEsc1;
    }

    public void setLabelOtroMotivoInaEsc1(Label l) {
        this.labelOtroMotivoInaEsc1 = l;
    }

    private Label labelOtroMotivoInaEsc1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtroMotivoInaEsc1x1() {
        return labelOtroMotivoInaEsc1x1;
    }

    public void setLabelOtroMotivoInaEsc1x1(Label l) {
        this.labelOtroMotivoInaEsc1x1 = l;
    }

    private TextField campoOtroMotivoInaEsc1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOtroMotivoInaEsc1() {
        return campoOtroMotivoInaEsc1;
    }

    public void setCampoOtroMotivoInaEsc1(TextField component) {
        this.campoOtroMotivoInaEsc1 = component;
    }

    private TextField campoOtroMotivoInaEsc1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtroMotivoInaEsc1x1() {
        return campoOtroMotivoInaEsc1x1;
    }

    public void setCampoOtroMotivoInaEsc1x1(TextField component) {
        this.campoOtroMotivoInaEsc1x1 = component;
    }

    private HelpInline helpInlineOtroMotivoInaEsc1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtroMotivoInaEsc1() {
        return helpInlineOtroMotivoInaEsc1;
    }

    public void setHelpInlineOtroMotivoInaEsc1(HelpInline hi) {
        this.helpInlineOtroMotivoInaEsc1 = hi;
    }

    private HelpInline helpInlineOtroMotivoInaEsc1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtroMotivoInaEsc1x1() {
        return helpInlineOtroMotivoInaEsc1x1;
    }

    public void setHelpInlineOtroMotivoInaEsc1x1(HelpInline hi) {
        this.helpInlineOtroMotivoInaEsc1x1 = hi;
    }

    private StaticText campoOtroMotivoInaEsc1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtroMotivoInaEsc1Texto1() {
        return campoOtroMotivoInaEsc1Texto1;
    }

    public void setCampoOtroMotivoInaEsc1Texto1(StaticText component) {
        this.campoOtroMotivoInaEsc1Texto1 = component;
    }

    private StaticText campoOtroMotivoInaEsc1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtroMotivoInaEsc1x1Texto1() {
        return campoOtroMotivoInaEsc1x1Texto1;
    }

    public void setCampoOtroMotivoInaEsc1x1Texto1(StaticText component) {
        this.campoOtroMotivoInaEsc1x1Texto1 = component;
    }

    private LengthValidator validatorOtroMotivoInaEsc1 = new LengthValidator();
  
    public LengthValidator getValidatorOtroMotivoInaEsc1() {
        return validatorOtroMotivoInaEsc1;
    }
  
    public void setValidatorOtroMotivoInaEsc1(LengthValidator validator) {
        this.validatorOtroMotivoInaEsc1 = validator;
    }
  
    private Label labelNumeroSionoMatriculacionEsc1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoMatriculacionEsc1() {
        return labelNumeroSionoMatriculacionEsc1;
    }

    public void setLabelNumeroSionoMatriculacionEsc1(Label l) {
        this.labelNumeroSionoMatriculacionEsc1 = l;
    }

    private Label labelNumeroSionoMatriculacionEsc1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoMatriculacionEsc1x1() {
        return labelNumeroSionoMatriculacionEsc1x1;
    }

    public void setLabelNumeroSionoMatriculacionEsc1x1(Label l) {
        this.labelNumeroSionoMatriculacionEsc1x1 = l;
    }

    private DropDown listaNumeroSionoMatriculacionEsc1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoMatriculacionEsc1() {
        return listaNumeroSionoMatriculacionEsc1;
    }

    public void setListaNumeroSionoMatriculacionEsc1(DropDown component) {
        this.listaNumeroSionoMatriculacionEsc1 = component;
    }

    private DropDown listaNumeroSionoMatriculacionEsc1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoMatriculacionEsc1x1() {
        return listaNumeroSionoMatriculacionEsc1x1;
    }

    public void setListaNumeroSionoMatriculacionEsc1x1(DropDown component) {
        this.listaNumeroSionoMatriculacionEsc1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoMatriculacionEsc1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoMatriculacionEsc1() {
        return helpInlineNumeroSionoMatriculacionEsc1;
    }

    public void setHelpInlineNumeroSionoMatriculacionEsc1(HelpInline hi) {
        this.helpInlineNumeroSionoMatriculacionEsc1 = hi;
    }

    private HelpInline helpInlineNumeroSionoMatriculacionEsc1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoMatriculacionEsc1x1() {
        return helpInlineNumeroSionoMatriculacionEsc1x1;
    }

    public void setHelpInlineNumeroSionoMatriculacionEsc1x1(HelpInline hi) {
        this.helpInlineNumeroSionoMatriculacionEsc1x1 = hi;
    }

    private StaticText listaNumeroSionoMatriculacionEsc1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoMatriculacionEsc1Texto1() {
        return listaNumeroSionoMatriculacionEsc1Texto1;
    }

    public void setListaNumeroSionoMatriculacionEsc1Texto1(StaticText component) {
        this.listaNumeroSionoMatriculacionEsc1Texto1 = component;
    }

    private StaticText listaNumeroSionoMatriculacionEsc1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoMatriculacionEsc1x1Texto1() {
        return listaNumeroSionoMatriculacionEsc1x1Texto1;
    }

    public void setListaNumeroSionoMatriculacionEsc1x1Texto1(StaticText component) {
        this.listaNumeroSionoMatriculacionEsc1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoMatriculacionEsc1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoMatriculacionEsc1() {
        return converterNumeroSionoMatriculacionEsc1;
    }
  
    public void setConverterNumeroSionoMatriculacionEsc1(IntegerConverter converter) {
        this.converterNumeroSionoMatriculacionEsc1 = converter;
    }
  
    private Label labelUltimoCursoAprobado1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelUltimoCursoAprobado1() {
        return labelUltimoCursoAprobado1;
    }

    public void setLabelUltimoCursoAprobado1(Label l) {
        this.labelUltimoCursoAprobado1 = l;
    }

    private Label labelUltimoCursoAprobado1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelUltimoCursoAprobado1x1() {
        return labelUltimoCursoAprobado1x1;
    }

    public void setLabelUltimoCursoAprobado1x1(Label l) {
        this.labelUltimoCursoAprobado1x1 = l;
    }

    private TextField campoUltimoCursoAprobado1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoUltimoCursoAprobado1() {
        return campoUltimoCursoAprobado1;
    }

    public void setCampoUltimoCursoAprobado1(TextField component) {
        this.campoUltimoCursoAprobado1 = component;
    }

    private TextField campoUltimoCursoAprobado1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoUltimoCursoAprobado1x1() {
        return campoUltimoCursoAprobado1x1;
    }

    public void setCampoUltimoCursoAprobado1x1(TextField component) {
        this.campoUltimoCursoAprobado1x1 = component;
    }

    private HelpInline helpInlineUltimoCursoAprobado1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineUltimoCursoAprobado1() {
        return helpInlineUltimoCursoAprobado1;
    }

    public void setHelpInlineUltimoCursoAprobado1(HelpInline hi) {
        this.helpInlineUltimoCursoAprobado1 = hi;
    }

    private HelpInline helpInlineUltimoCursoAprobado1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineUltimoCursoAprobado1x1() {
        return helpInlineUltimoCursoAprobado1x1;
    }

    public void setHelpInlineUltimoCursoAprobado1x1(HelpInline hi) {
        this.helpInlineUltimoCursoAprobado1x1 = hi;
    }

    private StaticText campoUltimoCursoAprobado1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoUltimoCursoAprobado1Texto1() {
        return campoUltimoCursoAprobado1Texto1;
    }

    public void setCampoUltimoCursoAprobado1Texto1(StaticText component) {
        this.campoUltimoCursoAprobado1Texto1 = component;
    }

    private StaticText campoUltimoCursoAprobado1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoUltimoCursoAprobado1x1Texto1() {
        return campoUltimoCursoAprobado1x1Texto1;
    }

    public void setCampoUltimoCursoAprobado1x1Texto1(StaticText component) {
        this.campoUltimoCursoAprobado1x1Texto1 = component;
    }

    private IntegerConverter converterUltimoCursoAprobado1 = new IntegerConverter();
  
    public IntegerConverter getConverterUltimoCursoAprobado1() {
        return converterUltimoCursoAprobado1;
    }
  
    public void setConverterUltimoCursoAprobado1(IntegerConverter converter) {
        this.converterUltimoCursoAprobado1 = converter;
    }
  
    private LongRangeValidator validatorUltimoCursoAprobado1 = new LongRangeValidator();
  
    public LongRangeValidator getValidatorUltimoCursoAprobado1() {
        return validatorUltimoCursoAprobado1;
    }
  
    public void setValidatorUltimoCursoAprobado1(LongRangeValidator validator) {
        this.validatorUltimoCursoAprobado1 = validator;
    }
  
    private Label labelNumeroNivelEduUltCurAprob1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroNivelEduUltCurAprob1() {
        return labelNumeroNivelEduUltCurAprob1;
    }

    public void setLabelNumeroNivelEduUltCurAprob1(Label l) {
        this.labelNumeroNivelEduUltCurAprob1 = l;
    }

    private Label labelNumeroNivelEduUltCurAprob1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroNivelEduUltCurAprob1x1() {
        return labelNumeroNivelEduUltCurAprob1x1;
    }

    public void setLabelNumeroNivelEduUltCurAprob1x1(Label l) {
        this.labelNumeroNivelEduUltCurAprob1x1 = l;
    }

    private DropDown listaNumeroNivelEduUltCurAprob1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroNivelEduUltCurAprob1() {
        return listaNumeroNivelEduUltCurAprob1;
    }

    public void setListaNumeroNivelEduUltCurAprob1(DropDown component) {
        this.listaNumeroNivelEduUltCurAprob1 = component;
    }

    private DropDown listaNumeroNivelEduUltCurAprob1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroNivelEduUltCurAprob1x1() {
        return listaNumeroNivelEduUltCurAprob1x1;
    }

    public void setListaNumeroNivelEduUltCurAprob1x1(DropDown component) {
        this.listaNumeroNivelEduUltCurAprob1x1 = component;
    }

    private HelpInline helpInlineNumeroNivelEduUltCurAprob1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroNivelEduUltCurAprob1() {
        return helpInlineNumeroNivelEduUltCurAprob1;
    }

    public void setHelpInlineNumeroNivelEduUltCurAprob1(HelpInline hi) {
        this.helpInlineNumeroNivelEduUltCurAprob1 = hi;
    }

    private HelpInline helpInlineNumeroNivelEduUltCurAprob1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroNivelEduUltCurAprob1x1() {
        return helpInlineNumeroNivelEduUltCurAprob1x1;
    }

    public void setHelpInlineNumeroNivelEduUltCurAprob1x1(HelpInline hi) {
        this.helpInlineNumeroNivelEduUltCurAprob1x1 = hi;
    }

    private StaticText listaNumeroNivelEduUltCurAprob1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroNivelEduUltCurAprob1Texto1() {
        return listaNumeroNivelEduUltCurAprob1Texto1;
    }

    public void setListaNumeroNivelEduUltCurAprob1Texto1(StaticText component) {
        this.listaNumeroNivelEduUltCurAprob1Texto1 = component;
    }

    private StaticText listaNumeroNivelEduUltCurAprob1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroNivelEduUltCurAprob1x1Texto1() {
        return listaNumeroNivelEduUltCurAprob1x1Texto1;
    }

    public void setListaNumeroNivelEduUltCurAprob1x1Texto1(StaticText component) {
        this.listaNumeroNivelEduUltCurAprob1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroNivelEduUltCurAprob1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroNivelEduUltCurAprob1() {
        return converterNumeroNivelEduUltCurAprob1;
    }
  
    public void setConverterNumeroNivelEduUltCurAprob1(IntegerConverter converter) {
        this.converterNumeroNivelEduUltCurAprob1 = converter;
    }
  
    private Label labelNumeroSionoCursoNoFormal1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoCursoNoFormal1() {
        return labelNumeroSionoCursoNoFormal1;
    }

    public void setLabelNumeroSionoCursoNoFormal1(Label l) {
        this.labelNumeroSionoCursoNoFormal1 = l;
    }

    private Label labelNumeroSionoCursoNoFormal1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoCursoNoFormal1x1() {
        return labelNumeroSionoCursoNoFormal1x1;
    }

    public void setLabelNumeroSionoCursoNoFormal1x1(Label l) {
        this.labelNumeroSionoCursoNoFormal1x1 = l;
    }

    private DropDown listaNumeroSionoCursoNoFormal1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoCursoNoFormal1() {
        return listaNumeroSionoCursoNoFormal1;
    }

    public void setListaNumeroSionoCursoNoFormal1(DropDown component) {
        this.listaNumeroSionoCursoNoFormal1 = component;
    }

    private DropDown listaNumeroSionoCursoNoFormal1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoCursoNoFormal1x1() {
        return listaNumeroSionoCursoNoFormal1x1;
    }

    public void setListaNumeroSionoCursoNoFormal1x1(DropDown component) {
        this.listaNumeroSionoCursoNoFormal1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoCursoNoFormal1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoCursoNoFormal1() {
        return helpInlineNumeroSionoCursoNoFormal1;
    }

    public void setHelpInlineNumeroSionoCursoNoFormal1(HelpInline hi) {
        this.helpInlineNumeroSionoCursoNoFormal1 = hi;
    }

    private HelpInline helpInlineNumeroSionoCursoNoFormal1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoCursoNoFormal1x1() {
        return helpInlineNumeroSionoCursoNoFormal1x1;
    }

    public void setHelpInlineNumeroSionoCursoNoFormal1x1(HelpInline hi) {
        this.helpInlineNumeroSionoCursoNoFormal1x1 = hi;
    }

    private StaticText listaNumeroSionoCursoNoFormal1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoCursoNoFormal1Texto1() {
        return listaNumeroSionoCursoNoFormal1Texto1;
    }

    public void setListaNumeroSionoCursoNoFormal1Texto1(StaticText component) {
        this.listaNumeroSionoCursoNoFormal1Texto1 = component;
    }

    private StaticText listaNumeroSionoCursoNoFormal1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoCursoNoFormal1x1Texto1() {
        return listaNumeroSionoCursoNoFormal1x1Texto1;
    }

    public void setListaNumeroSionoCursoNoFormal1x1Texto1(StaticText component) {
        this.listaNumeroSionoCursoNoFormal1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoCursoNoFormal1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoCursoNoFormal1() {
        return converterNumeroSionoCursoNoFormal1;
    }
  
    public void setConverterNumeroSionoCursoNoFormal1(IntegerConverter converter) {
        this.converterNumeroSionoCursoNoFormal1 = converter;
    }
  
    private Label labelNumeroTipoSeguroMedico1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoSeguroMedico1() {
        return labelNumeroTipoSeguroMedico1;
    }

    public void setLabelNumeroTipoSeguroMedico1(Label l) {
        this.labelNumeroTipoSeguroMedico1 = l;
    }

    private Label labelNumeroTipoSeguroMedico1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoSeguroMedico1x1() {
        return labelNumeroTipoSeguroMedico1x1;
    }

    public void setLabelNumeroTipoSeguroMedico1x1(Label l) {
        this.labelNumeroTipoSeguroMedico1x1 = l;
    }

    private DropDown listaNumeroTipoSeguroMedico1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoSeguroMedico1() {
        return listaNumeroTipoSeguroMedico1;
    }

    public void setListaNumeroTipoSeguroMedico1(DropDown component) {
        this.listaNumeroTipoSeguroMedico1 = component;
    }

    private DropDown listaNumeroTipoSeguroMedico1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoSeguroMedico1x1() {
        return listaNumeroTipoSeguroMedico1x1;
    }

    public void setListaNumeroTipoSeguroMedico1x1(DropDown component) {
        this.listaNumeroTipoSeguroMedico1x1 = component;
    }

    private HelpInline helpInlineNumeroTipoSeguroMedico1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoSeguroMedico1() {
        return helpInlineNumeroTipoSeguroMedico1;
    }

    public void setHelpInlineNumeroTipoSeguroMedico1(HelpInline hi) {
        this.helpInlineNumeroTipoSeguroMedico1 = hi;
    }

    private HelpInline helpInlineNumeroTipoSeguroMedico1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoSeguroMedico1x1() {
        return helpInlineNumeroTipoSeguroMedico1x1;
    }

    public void setHelpInlineNumeroTipoSeguroMedico1x1(HelpInline hi) {
        this.helpInlineNumeroTipoSeguroMedico1x1 = hi;
    }

    private StaticText listaNumeroTipoSeguroMedico1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoSeguroMedico1Texto1() {
        return listaNumeroTipoSeguroMedico1Texto1;
    }

    public void setListaNumeroTipoSeguroMedico1Texto1(StaticText component) {
        this.listaNumeroTipoSeguroMedico1Texto1 = component;
    }

    private StaticText listaNumeroTipoSeguroMedico1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoSeguroMedico1x1Texto1() {
        return listaNumeroTipoSeguroMedico1x1Texto1;
    }

    public void setListaNumeroTipoSeguroMedico1x1Texto1(StaticText component) {
        this.listaNumeroTipoSeguroMedico1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoSeguroMedico1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoSeguroMedico1() {
        return converterNumeroTipoSeguroMedico1;
    }
  
    public void setConverterNumeroTipoSeguroMedico1(IntegerConverter converter) {
        this.converterNumeroTipoSeguroMedico1 = converter;
    }
  
    private Label labelNumeroEstadoSalud1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroEstadoSalud1() {
        return labelNumeroEstadoSalud1;
    }

    public void setLabelNumeroEstadoSalud1(Label l) {
        this.labelNumeroEstadoSalud1 = l;
    }

    private Label labelNumeroEstadoSalud1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroEstadoSalud1x1() {
        return labelNumeroEstadoSalud1x1;
    }

    public void setLabelNumeroEstadoSalud1x1(Label l) {
        this.labelNumeroEstadoSalud1x1 = l;
    }

    private DropDown listaNumeroEstadoSalud1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroEstadoSalud1() {
        return listaNumeroEstadoSalud1;
    }

    public void setListaNumeroEstadoSalud1(DropDown component) {
        this.listaNumeroEstadoSalud1 = component;
    }

    private DropDown listaNumeroEstadoSalud1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroEstadoSalud1x1() {
        return listaNumeroEstadoSalud1x1;
    }

    public void setListaNumeroEstadoSalud1x1(DropDown component) {
        this.listaNumeroEstadoSalud1x1 = component;
    }

    private HelpInline helpInlineNumeroEstadoSalud1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroEstadoSalud1() {
        return helpInlineNumeroEstadoSalud1;
    }

    public void setHelpInlineNumeroEstadoSalud1(HelpInline hi) {
        this.helpInlineNumeroEstadoSalud1 = hi;
    }

    private HelpInline helpInlineNumeroEstadoSalud1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroEstadoSalud1x1() {
        return helpInlineNumeroEstadoSalud1x1;
    }

    public void setHelpInlineNumeroEstadoSalud1x1(HelpInline hi) {
        this.helpInlineNumeroEstadoSalud1x1 = hi;
    }

    private StaticText listaNumeroEstadoSalud1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroEstadoSalud1Texto1() {
        return listaNumeroEstadoSalud1Texto1;
    }

    public void setListaNumeroEstadoSalud1Texto1(StaticText component) {
        this.listaNumeroEstadoSalud1Texto1 = component;
    }

    private StaticText listaNumeroEstadoSalud1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroEstadoSalud1x1Texto1() {
        return listaNumeroEstadoSalud1x1Texto1;
    }

    public void setListaNumeroEstadoSalud1x1Texto1(StaticText component) {
        this.listaNumeroEstadoSalud1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroEstadoSalud1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroEstadoSalud1() {
        return converterNumeroEstadoSalud1;
    }
  
    public void setConverterNumeroEstadoSalud1(IntegerConverter converter) {
        this.converterNumeroEstadoSalud1 = converter;
    }
  
    private Label labelNumeroClaseEnfAcc1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroClaseEnfAcc1() {
        return labelNumeroClaseEnfAcc1;
    }

    public void setLabelNumeroClaseEnfAcc1(Label l) {
        this.labelNumeroClaseEnfAcc1 = l;
    }

    private Label labelNumeroClaseEnfAcc1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroClaseEnfAcc1x1() {
        return labelNumeroClaseEnfAcc1x1;
    }

    public void setLabelNumeroClaseEnfAcc1x1(Label l) {
        this.labelNumeroClaseEnfAcc1x1 = l;
    }

    private DropDown listaNumeroClaseEnfAcc1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroClaseEnfAcc1() {
        return listaNumeroClaseEnfAcc1;
    }

    public void setListaNumeroClaseEnfAcc1(DropDown component) {
        this.listaNumeroClaseEnfAcc1 = component;
    }

    private DropDown listaNumeroClaseEnfAcc1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroClaseEnfAcc1x1() {
        return listaNumeroClaseEnfAcc1x1;
    }

    public void setListaNumeroClaseEnfAcc1x1(DropDown component) {
        this.listaNumeroClaseEnfAcc1x1 = component;
    }

    private HelpInline helpInlineNumeroClaseEnfAcc1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroClaseEnfAcc1() {
        return helpInlineNumeroClaseEnfAcc1;
    }

    public void setHelpInlineNumeroClaseEnfAcc1(HelpInline hi) {
        this.helpInlineNumeroClaseEnfAcc1 = hi;
    }

    private HelpInline helpInlineNumeroClaseEnfAcc1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroClaseEnfAcc1x1() {
        return helpInlineNumeroClaseEnfAcc1x1;
    }

    public void setHelpInlineNumeroClaseEnfAcc1x1(HelpInline hi) {
        this.helpInlineNumeroClaseEnfAcc1x1 = hi;
    }

    private StaticText listaNumeroClaseEnfAcc1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroClaseEnfAcc1Texto1() {
        return listaNumeroClaseEnfAcc1Texto1;
    }

    public void setListaNumeroClaseEnfAcc1Texto1(StaticText component) {
        this.listaNumeroClaseEnfAcc1Texto1 = component;
    }

    private StaticText listaNumeroClaseEnfAcc1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroClaseEnfAcc1x1Texto1() {
        return listaNumeroClaseEnfAcc1x1Texto1;
    }

    public void setListaNumeroClaseEnfAcc1x1Texto1(StaticText component) {
        this.listaNumeroClaseEnfAcc1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroClaseEnfAcc1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroClaseEnfAcc1() {
        return converterNumeroClaseEnfAcc1;
    }
  
    public void setConverterNumeroClaseEnfAcc1(IntegerConverter converter) {
        this.converterNumeroClaseEnfAcc1 = converter;
    }
  
    private Label labelOtraClaseEnfAcc1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraClaseEnfAcc1() {
        return labelOtraClaseEnfAcc1;
    }

    public void setLabelOtraClaseEnfAcc1(Label l) {
        this.labelOtraClaseEnfAcc1 = l;
    }

    private Label labelOtraClaseEnfAcc1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraClaseEnfAcc1x1() {
        return labelOtraClaseEnfAcc1x1;
    }

    public void setLabelOtraClaseEnfAcc1x1(Label l) {
        this.labelOtraClaseEnfAcc1x1 = l;
    }

    private TextField campoOtraClaseEnfAcc1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOtraClaseEnfAcc1() {
        return campoOtraClaseEnfAcc1;
    }

    public void setCampoOtraClaseEnfAcc1(TextField component) {
        this.campoOtraClaseEnfAcc1 = component;
    }

    private TextField campoOtraClaseEnfAcc1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtraClaseEnfAcc1x1() {
        return campoOtraClaseEnfAcc1x1;
    }

    public void setCampoOtraClaseEnfAcc1x1(TextField component) {
        this.campoOtraClaseEnfAcc1x1 = component;
    }

    private HelpInline helpInlineOtraClaseEnfAcc1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraClaseEnfAcc1() {
        return helpInlineOtraClaseEnfAcc1;
    }

    public void setHelpInlineOtraClaseEnfAcc1(HelpInline hi) {
        this.helpInlineOtraClaseEnfAcc1 = hi;
    }

    private HelpInline helpInlineOtraClaseEnfAcc1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraClaseEnfAcc1x1() {
        return helpInlineOtraClaseEnfAcc1x1;
    }

    public void setHelpInlineOtraClaseEnfAcc1x1(HelpInline hi) {
        this.helpInlineOtraClaseEnfAcc1x1 = hi;
    }

    private StaticText campoOtraClaseEnfAcc1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraClaseEnfAcc1Texto1() {
        return campoOtraClaseEnfAcc1Texto1;
    }

    public void setCampoOtraClaseEnfAcc1Texto1(StaticText component) {
        this.campoOtraClaseEnfAcc1Texto1 = component;
    }

    private StaticText campoOtraClaseEnfAcc1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraClaseEnfAcc1x1Texto1() {
        return campoOtraClaseEnfAcc1x1Texto1;
    }

    public void setCampoOtraClaseEnfAcc1x1Texto1(StaticText component) {
        this.campoOtraClaseEnfAcc1x1Texto1 = component;
    }

    private LengthValidator validatorOtraClaseEnfAcc1 = new LengthValidator();
  
    public LengthValidator getValidatorOtraClaseEnfAcc1() {
        return validatorOtraClaseEnfAcc1;
    }
  
    public void setValidatorOtraClaseEnfAcc1(LengthValidator validator) {
        this.validatorOtraClaseEnfAcc1 = validator;
    }
  
    private Label labelNumeroClaseEnfCronica1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroClaseEnfCronica1() {
        return labelNumeroClaseEnfCronica1;
    }

    public void setLabelNumeroClaseEnfCronica1(Label l) {
        this.labelNumeroClaseEnfCronica1 = l;
    }

    private Label labelNumeroClaseEnfCronica1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroClaseEnfCronica1x1() {
        return labelNumeroClaseEnfCronica1x1;
    }

    public void setLabelNumeroClaseEnfCronica1x1(Label l) {
        this.labelNumeroClaseEnfCronica1x1 = l;
    }

    private DropDown listaNumeroClaseEnfCronica1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroClaseEnfCronica1() {
        return listaNumeroClaseEnfCronica1;
    }

    public void setListaNumeroClaseEnfCronica1(DropDown component) {
        this.listaNumeroClaseEnfCronica1 = component;
    }

    private DropDown listaNumeroClaseEnfCronica1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroClaseEnfCronica1x1() {
        return listaNumeroClaseEnfCronica1x1;
    }

    public void setListaNumeroClaseEnfCronica1x1(DropDown component) {
        this.listaNumeroClaseEnfCronica1x1 = component;
    }

    private HelpInline helpInlineNumeroClaseEnfCronica1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroClaseEnfCronica1() {
        return helpInlineNumeroClaseEnfCronica1;
    }

    public void setHelpInlineNumeroClaseEnfCronica1(HelpInline hi) {
        this.helpInlineNumeroClaseEnfCronica1 = hi;
    }

    private HelpInline helpInlineNumeroClaseEnfCronica1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroClaseEnfCronica1x1() {
        return helpInlineNumeroClaseEnfCronica1x1;
    }

    public void setHelpInlineNumeroClaseEnfCronica1x1(HelpInline hi) {
        this.helpInlineNumeroClaseEnfCronica1x1 = hi;
    }

    private StaticText listaNumeroClaseEnfCronica1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroClaseEnfCronica1Texto1() {
        return listaNumeroClaseEnfCronica1Texto1;
    }

    public void setListaNumeroClaseEnfCronica1Texto1(StaticText component) {
        this.listaNumeroClaseEnfCronica1Texto1 = component;
    }

    private StaticText listaNumeroClaseEnfCronica1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroClaseEnfCronica1x1Texto1() {
        return listaNumeroClaseEnfCronica1x1Texto1;
    }

    public void setListaNumeroClaseEnfCronica1x1Texto1(StaticText component) {
        this.listaNumeroClaseEnfCronica1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroClaseEnfCronica1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroClaseEnfCronica1() {
        return converterNumeroClaseEnfCronica1;
    }
  
    public void setConverterNumeroClaseEnfCronica1(IntegerConverter converter) {
        this.converterNumeroClaseEnfCronica1 = converter;
    }
  
    private Label labelOtraClaseEnfCronica1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraClaseEnfCronica1() {
        return labelOtraClaseEnfCronica1;
    }

    public void setLabelOtraClaseEnfCronica1(Label l) {
        this.labelOtraClaseEnfCronica1 = l;
    }

    private Label labelOtraClaseEnfCronica1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraClaseEnfCronica1x1() {
        return labelOtraClaseEnfCronica1x1;
    }

    public void setLabelOtraClaseEnfCronica1x1(Label l) {
        this.labelOtraClaseEnfCronica1x1 = l;
    }

    private TextField campoOtraClaseEnfCronica1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOtraClaseEnfCronica1() {
        return campoOtraClaseEnfCronica1;
    }

    public void setCampoOtraClaseEnfCronica1(TextField component) {
        this.campoOtraClaseEnfCronica1 = component;
    }

    private TextField campoOtraClaseEnfCronica1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtraClaseEnfCronica1x1() {
        return campoOtraClaseEnfCronica1x1;
    }

    public void setCampoOtraClaseEnfCronica1x1(TextField component) {
        this.campoOtraClaseEnfCronica1x1 = component;
    }

    private HelpInline helpInlineOtraClaseEnfCronica1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraClaseEnfCronica1() {
        return helpInlineOtraClaseEnfCronica1;
    }

    public void setHelpInlineOtraClaseEnfCronica1(HelpInline hi) {
        this.helpInlineOtraClaseEnfCronica1 = hi;
    }

    private HelpInline helpInlineOtraClaseEnfCronica1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraClaseEnfCronica1x1() {
        return helpInlineOtraClaseEnfCronica1x1;
    }

    public void setHelpInlineOtraClaseEnfCronica1x1(HelpInline hi) {
        this.helpInlineOtraClaseEnfCronica1x1 = hi;
    }

    private StaticText campoOtraClaseEnfCronica1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraClaseEnfCronica1Texto1() {
        return campoOtraClaseEnfCronica1Texto1;
    }

    public void setCampoOtraClaseEnfCronica1Texto1(StaticText component) {
        this.campoOtraClaseEnfCronica1Texto1 = component;
    }

    private StaticText campoOtraClaseEnfCronica1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraClaseEnfCronica1x1Texto1() {
        return campoOtraClaseEnfCronica1x1Texto1;
    }

    public void setCampoOtraClaseEnfCronica1x1Texto1(StaticText component) {
        this.campoOtraClaseEnfCronica1x1Texto1 = component;
    }

    private LengthValidator validatorOtraClaseEnfCronica1 = new LengthValidator();
  
    public LengthValidator getValidatorOtraClaseEnfCronica1() {
        return validatorOtraClaseEnfCronica1;
    }
  
    public void setValidatorOtraClaseEnfCronica1(LengthValidator validator) {
        this.validatorOtraClaseEnfCronica1 = validator;
    }
  
    private Label labelNumeroSionoAtencionMedica1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoAtencionMedica1() {
        return labelNumeroSionoAtencionMedica1;
    }

    public void setLabelNumeroSionoAtencionMedica1(Label l) {
        this.labelNumeroSionoAtencionMedica1 = l;
    }

    private Label labelNumeroSionoAtencionMedica1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoAtencionMedica1x1() {
        return labelNumeroSionoAtencionMedica1x1;
    }

    public void setLabelNumeroSionoAtencionMedica1x1(Label l) {
        this.labelNumeroSionoAtencionMedica1x1 = l;
    }

    private DropDown listaNumeroSionoAtencionMedica1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoAtencionMedica1() {
        return listaNumeroSionoAtencionMedica1;
    }

    public void setListaNumeroSionoAtencionMedica1(DropDown component) {
        this.listaNumeroSionoAtencionMedica1 = component;
    }

    private DropDown listaNumeroSionoAtencionMedica1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoAtencionMedica1x1() {
        return listaNumeroSionoAtencionMedica1x1;
    }

    public void setListaNumeroSionoAtencionMedica1x1(DropDown component) {
        this.listaNumeroSionoAtencionMedica1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoAtencionMedica1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoAtencionMedica1() {
        return helpInlineNumeroSionoAtencionMedica1;
    }

    public void setHelpInlineNumeroSionoAtencionMedica1(HelpInline hi) {
        this.helpInlineNumeroSionoAtencionMedica1 = hi;
    }

    private HelpInline helpInlineNumeroSionoAtencionMedica1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoAtencionMedica1x1() {
        return helpInlineNumeroSionoAtencionMedica1x1;
    }

    public void setHelpInlineNumeroSionoAtencionMedica1x1(HelpInline hi) {
        this.helpInlineNumeroSionoAtencionMedica1x1 = hi;
    }

    private StaticText listaNumeroSionoAtencionMedica1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoAtencionMedica1Texto1() {
        return listaNumeroSionoAtencionMedica1Texto1;
    }

    public void setListaNumeroSionoAtencionMedica1Texto1(StaticText component) {
        this.listaNumeroSionoAtencionMedica1Texto1 = component;
    }

    private StaticText listaNumeroSionoAtencionMedica1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoAtencionMedica1x1Texto1() {
        return listaNumeroSionoAtencionMedica1x1Texto1;
    }

    public void setListaNumeroSionoAtencionMedica1x1Texto1(StaticText component) {
        this.listaNumeroSionoAtencionMedica1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoAtencionMedica1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoAtencionMedica1() {
        return converterNumeroSionoAtencionMedica1;
    }
  
    public void setConverterNumeroSionoAtencionMedica1(IntegerConverter converter) {
        this.converterNumeroSionoAtencionMedica1 = converter;
    }
  
    private Label labelNumeroMotivoNoAtencion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroMotivoNoAtencion1() {
        return labelNumeroMotivoNoAtencion1;
    }

    public void setLabelNumeroMotivoNoAtencion1(Label l) {
        this.labelNumeroMotivoNoAtencion1 = l;
    }

    private Label labelNumeroMotivoNoAtencion1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroMotivoNoAtencion1x1() {
        return labelNumeroMotivoNoAtencion1x1;
    }

    public void setLabelNumeroMotivoNoAtencion1x1(Label l) {
        this.labelNumeroMotivoNoAtencion1x1 = l;
    }

    private DropDown listaNumeroMotivoNoAtencion1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroMotivoNoAtencion1() {
        return listaNumeroMotivoNoAtencion1;
    }

    public void setListaNumeroMotivoNoAtencion1(DropDown component) {
        this.listaNumeroMotivoNoAtencion1 = component;
    }

    private DropDown listaNumeroMotivoNoAtencion1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroMotivoNoAtencion1x1() {
        return listaNumeroMotivoNoAtencion1x1;
    }

    public void setListaNumeroMotivoNoAtencion1x1(DropDown component) {
        this.listaNumeroMotivoNoAtencion1x1 = component;
    }

    private HelpInline helpInlineNumeroMotivoNoAtencion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroMotivoNoAtencion1() {
        return helpInlineNumeroMotivoNoAtencion1;
    }

    public void setHelpInlineNumeroMotivoNoAtencion1(HelpInline hi) {
        this.helpInlineNumeroMotivoNoAtencion1 = hi;
    }

    private HelpInline helpInlineNumeroMotivoNoAtencion1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroMotivoNoAtencion1x1() {
        return helpInlineNumeroMotivoNoAtencion1x1;
    }

    public void setHelpInlineNumeroMotivoNoAtencion1x1(HelpInline hi) {
        this.helpInlineNumeroMotivoNoAtencion1x1 = hi;
    }

    private StaticText listaNumeroMotivoNoAtencion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroMotivoNoAtencion1Texto1() {
        return listaNumeroMotivoNoAtencion1Texto1;
    }

    public void setListaNumeroMotivoNoAtencion1Texto1(StaticText component) {
        this.listaNumeroMotivoNoAtencion1Texto1 = component;
    }

    private StaticText listaNumeroMotivoNoAtencion1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroMotivoNoAtencion1x1Texto1() {
        return listaNumeroMotivoNoAtencion1x1Texto1;
    }

    public void setListaNumeroMotivoNoAtencion1x1Texto1(StaticText component) {
        this.listaNumeroMotivoNoAtencion1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroMotivoNoAtencion1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroMotivoNoAtencion1() {
        return converterNumeroMotivoNoAtencion1;
    }
  
    public void setConverterNumeroMotivoNoAtencion1(IntegerConverter converter) {
        this.converterNumeroMotivoNoAtencion1 = converter;
    }
  
    private Label labelOtroMotivoNoAtencion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtroMotivoNoAtencion1() {
        return labelOtroMotivoNoAtencion1;
    }

    public void setLabelOtroMotivoNoAtencion1(Label l) {
        this.labelOtroMotivoNoAtencion1 = l;
    }

    private Label labelOtroMotivoNoAtencion1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtroMotivoNoAtencion1x1() {
        return labelOtroMotivoNoAtencion1x1;
    }

    public void setLabelOtroMotivoNoAtencion1x1(Label l) {
        this.labelOtroMotivoNoAtencion1x1 = l;
    }

    private TextField campoOtroMotivoNoAtencion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOtroMotivoNoAtencion1() {
        return campoOtroMotivoNoAtencion1;
    }

    public void setCampoOtroMotivoNoAtencion1(TextField component) {
        this.campoOtroMotivoNoAtencion1 = component;
    }

    private TextField campoOtroMotivoNoAtencion1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtroMotivoNoAtencion1x1() {
        return campoOtroMotivoNoAtencion1x1;
    }

    public void setCampoOtroMotivoNoAtencion1x1(TextField component) {
        this.campoOtroMotivoNoAtencion1x1 = component;
    }

    private HelpInline helpInlineOtroMotivoNoAtencion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtroMotivoNoAtencion1() {
        return helpInlineOtroMotivoNoAtencion1;
    }

    public void setHelpInlineOtroMotivoNoAtencion1(HelpInline hi) {
        this.helpInlineOtroMotivoNoAtencion1 = hi;
    }

    private HelpInline helpInlineOtroMotivoNoAtencion1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtroMotivoNoAtencion1x1() {
        return helpInlineOtroMotivoNoAtencion1x1;
    }

    public void setHelpInlineOtroMotivoNoAtencion1x1(HelpInline hi) {
        this.helpInlineOtroMotivoNoAtencion1x1 = hi;
    }

    private StaticText campoOtroMotivoNoAtencion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtroMotivoNoAtencion1Texto1() {
        return campoOtroMotivoNoAtencion1Texto1;
    }

    public void setCampoOtroMotivoNoAtencion1Texto1(StaticText component) {
        this.campoOtroMotivoNoAtencion1Texto1 = component;
    }

    private StaticText campoOtroMotivoNoAtencion1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtroMotivoNoAtencion1x1Texto1() {
        return campoOtroMotivoNoAtencion1x1Texto1;
    }

    public void setCampoOtroMotivoNoAtencion1x1Texto1(StaticText component) {
        this.campoOtroMotivoNoAtencion1x1Texto1 = component;
    }

    private LengthValidator validatorOtroMotivoNoAtencion1 = new LengthValidator();
  
    public LengthValidator getValidatorOtroMotivoNoAtencion1() {
        return validatorOtroMotivoNoAtencion1;
    }
  
    public void setValidatorOtroMotivoNoAtencion1(LengthValidator validator) {
        this.validatorOtroMotivoNoAtencion1 = validator;
    }
  
    private Label labelNumeroSionoCarnetVacunacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoCarnetVacunacion1() {
        return labelNumeroSionoCarnetVacunacion1;
    }

    public void setLabelNumeroSionoCarnetVacunacion1(Label l) {
        this.labelNumeroSionoCarnetVacunacion1 = l;
    }

    private Label labelNumeroSionoCarnetVacunacion1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoCarnetVacunacion1x1() {
        return labelNumeroSionoCarnetVacunacion1x1;
    }

    public void setLabelNumeroSionoCarnetVacunacion1x1(Label l) {
        this.labelNumeroSionoCarnetVacunacion1x1 = l;
    }

    private DropDown listaNumeroSionoCarnetVacunacion1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoCarnetVacunacion1() {
        return listaNumeroSionoCarnetVacunacion1;
    }

    public void setListaNumeroSionoCarnetVacunacion1(DropDown component) {
        this.listaNumeroSionoCarnetVacunacion1 = component;
    }

    private DropDown listaNumeroSionoCarnetVacunacion1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoCarnetVacunacion1x1() {
        return listaNumeroSionoCarnetVacunacion1x1;
    }

    public void setListaNumeroSionoCarnetVacunacion1x1(DropDown component) {
        this.listaNumeroSionoCarnetVacunacion1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoCarnetVacunacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoCarnetVacunacion1() {
        return helpInlineNumeroSionoCarnetVacunacion1;
    }

    public void setHelpInlineNumeroSionoCarnetVacunacion1(HelpInline hi) {
        this.helpInlineNumeroSionoCarnetVacunacion1 = hi;
    }

    private HelpInline helpInlineNumeroSionoCarnetVacunacion1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoCarnetVacunacion1x1() {
        return helpInlineNumeroSionoCarnetVacunacion1x1;
    }

    public void setHelpInlineNumeroSionoCarnetVacunacion1x1(HelpInline hi) {
        this.helpInlineNumeroSionoCarnetVacunacion1x1 = hi;
    }

    private StaticText listaNumeroSionoCarnetVacunacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoCarnetVacunacion1Texto1() {
        return listaNumeroSionoCarnetVacunacion1Texto1;
    }

    public void setListaNumeroSionoCarnetVacunacion1Texto1(StaticText component) {
        this.listaNumeroSionoCarnetVacunacion1Texto1 = component;
    }

    private StaticText listaNumeroSionoCarnetVacunacion1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoCarnetVacunacion1x1Texto1() {
        return listaNumeroSionoCarnetVacunacion1x1Texto1;
    }

    public void setListaNumeroSionoCarnetVacunacion1x1Texto1(StaticText component) {
        this.listaNumeroSionoCarnetVacunacion1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoCarnetVacunacion1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoCarnetVacunacion1() {
        return converterNumeroSionoCarnetVacunacion1;
    }
  
    public void setConverterNumeroSionoCarnetVacunacion1(IntegerConverter converter) {
        this.converterNumeroSionoCarnetVacunacion1 = converter;
    }
  
    private Label labelNumeroClaseImpedimento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroClaseImpedimento1() {
        return labelNumeroClaseImpedimento1;
    }

    public void setLabelNumeroClaseImpedimento1(Label l) {
        this.labelNumeroClaseImpedimento1 = l;
    }

    private Label labelNumeroClaseImpedimento1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroClaseImpedimento1x1() {
        return labelNumeroClaseImpedimento1x1;
    }

    public void setLabelNumeroClaseImpedimento1x1(Label l) {
        this.labelNumeroClaseImpedimento1x1 = l;
    }

    private DropDown listaNumeroClaseImpedimento1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroClaseImpedimento1() {
        return listaNumeroClaseImpedimento1;
    }

    public void setListaNumeroClaseImpedimento1(DropDown component) {
        this.listaNumeroClaseImpedimento1 = component;
    }

    private DropDown listaNumeroClaseImpedimento1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroClaseImpedimento1x1() {
        return listaNumeroClaseImpedimento1x1;
    }

    public void setListaNumeroClaseImpedimento1x1(DropDown component) {
        this.listaNumeroClaseImpedimento1x1 = component;
    }

    private HelpInline helpInlineNumeroClaseImpedimento1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroClaseImpedimento1() {
        return helpInlineNumeroClaseImpedimento1;
    }

    public void setHelpInlineNumeroClaseImpedimento1(HelpInline hi) {
        this.helpInlineNumeroClaseImpedimento1 = hi;
    }

    private HelpInline helpInlineNumeroClaseImpedimento1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroClaseImpedimento1x1() {
        return helpInlineNumeroClaseImpedimento1x1;
    }

    public void setHelpInlineNumeroClaseImpedimento1x1(HelpInline hi) {
        this.helpInlineNumeroClaseImpedimento1x1 = hi;
    }

    private StaticText listaNumeroClaseImpedimento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroClaseImpedimento1Texto1() {
        return listaNumeroClaseImpedimento1Texto1;
    }

    public void setListaNumeroClaseImpedimento1Texto1(StaticText component) {
        this.listaNumeroClaseImpedimento1Texto1 = component;
    }

    private StaticText listaNumeroClaseImpedimento1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroClaseImpedimento1x1Texto1() {
        return listaNumeroClaseImpedimento1x1Texto1;
    }

    public void setListaNumeroClaseImpedimento1x1Texto1(StaticText component) {
        this.listaNumeroClaseImpedimento1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroClaseImpedimento1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroClaseImpedimento1() {
        return converterNumeroClaseImpedimento1;
    }
  
    public void setConverterNumeroClaseImpedimento1(IntegerConverter converter) {
        this.converterNumeroClaseImpedimento1 = converter;
    }
  
    private Label labelOtraClaseImpedimento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraClaseImpedimento1() {
        return labelOtraClaseImpedimento1;
    }

    public void setLabelOtraClaseImpedimento1(Label l) {
        this.labelOtraClaseImpedimento1 = l;
    }

    private Label labelOtraClaseImpedimento1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraClaseImpedimento1x1() {
        return labelOtraClaseImpedimento1x1;
    }

    public void setLabelOtraClaseImpedimento1x1(Label l) {
        this.labelOtraClaseImpedimento1x1 = l;
    }

    private TextField campoOtraClaseImpedimento1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOtraClaseImpedimento1() {
        return campoOtraClaseImpedimento1;
    }

    public void setCampoOtraClaseImpedimento1(TextField component) {
        this.campoOtraClaseImpedimento1 = component;
    }

    private TextField campoOtraClaseImpedimento1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtraClaseImpedimento1x1() {
        return campoOtraClaseImpedimento1x1;
    }

    public void setCampoOtraClaseImpedimento1x1(TextField component) {
        this.campoOtraClaseImpedimento1x1 = component;
    }

    private HelpInline helpInlineOtraClaseImpedimento1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraClaseImpedimento1() {
        return helpInlineOtraClaseImpedimento1;
    }

    public void setHelpInlineOtraClaseImpedimento1(HelpInline hi) {
        this.helpInlineOtraClaseImpedimento1 = hi;
    }

    private HelpInline helpInlineOtraClaseImpedimento1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraClaseImpedimento1x1() {
        return helpInlineOtraClaseImpedimento1x1;
    }

    public void setHelpInlineOtraClaseImpedimento1x1(HelpInline hi) {
        this.helpInlineOtraClaseImpedimento1x1 = hi;
    }

    private StaticText campoOtraClaseImpedimento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraClaseImpedimento1Texto1() {
        return campoOtraClaseImpedimento1Texto1;
    }

    public void setCampoOtraClaseImpedimento1Texto1(StaticText component) {
        this.campoOtraClaseImpedimento1Texto1 = component;
    }

    private StaticText campoOtraClaseImpedimento1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraClaseImpedimento1x1Texto1() {
        return campoOtraClaseImpedimento1x1Texto1;
    }

    public void setCampoOtraClaseImpedimento1x1Texto1(StaticText component) {
        this.campoOtraClaseImpedimento1x1Texto1 = component;
    }

    private LengthValidator validatorOtraClaseImpedimento1 = new LengthValidator();
  
    public LengthValidator getValidatorOtraClaseImpedimento1() {
        return validatorOtraClaseImpedimento1;
    }
  
    public void setValidatorOtraClaseImpedimento1(LengthValidator validator) {
        this.validatorOtraClaseImpedimento1 = validator;
    }
  
    private Label labelNumeroCausaImpedimento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaImpedimento1() {
        return labelNumeroCausaImpedimento1;
    }

    public void setLabelNumeroCausaImpedimento1(Label l) {
        this.labelNumeroCausaImpedimento1 = l;
    }

    private Label labelNumeroCausaImpedimento1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroCausaImpedimento1x1() {
        return labelNumeroCausaImpedimento1x1;
    }

    public void setLabelNumeroCausaImpedimento1x1(Label l) {
        this.labelNumeroCausaImpedimento1x1 = l;
    }

    private DropDown listaNumeroCausaImpedimento1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroCausaImpedimento1() {
        return listaNumeroCausaImpedimento1;
    }

    public void setListaNumeroCausaImpedimento1(DropDown component) {
        this.listaNumeroCausaImpedimento1 = component;
    }

    private DropDown listaNumeroCausaImpedimento1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroCausaImpedimento1x1() {
        return listaNumeroCausaImpedimento1x1;
    }

    public void setListaNumeroCausaImpedimento1x1(DropDown component) {
        this.listaNumeroCausaImpedimento1x1 = component;
    }

    private HelpInline helpInlineNumeroCausaImpedimento1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaImpedimento1() {
        return helpInlineNumeroCausaImpedimento1;
    }

    public void setHelpInlineNumeroCausaImpedimento1(HelpInline hi) {
        this.helpInlineNumeroCausaImpedimento1 = hi;
    }

    private HelpInline helpInlineNumeroCausaImpedimento1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroCausaImpedimento1x1() {
        return helpInlineNumeroCausaImpedimento1x1;
    }

    public void setHelpInlineNumeroCausaImpedimento1x1(HelpInline hi) {
        this.helpInlineNumeroCausaImpedimento1x1 = hi;
    }

    private StaticText listaNumeroCausaImpedimento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaImpedimento1Texto1() {
        return listaNumeroCausaImpedimento1Texto1;
    }

    public void setListaNumeroCausaImpedimento1Texto1(StaticText component) {
        this.listaNumeroCausaImpedimento1Texto1 = component;
    }

    private StaticText listaNumeroCausaImpedimento1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroCausaImpedimento1x1Texto1() {
        return listaNumeroCausaImpedimento1x1Texto1;
    }

    public void setListaNumeroCausaImpedimento1x1Texto1(StaticText component) {
        this.listaNumeroCausaImpedimento1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroCausaImpedimento1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroCausaImpedimento1() {
        return converterNumeroCausaImpedimento1;
    }
  
    public void setConverterNumeroCausaImpedimento1(IntegerConverter converter) {
        this.converterNumeroCausaImpedimento1 = converter;
    }
  
    private Label labelOtraCausaImpedimento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaImpedimento1() {
        return labelOtraCausaImpedimento1;
    }

    public void setLabelOtraCausaImpedimento1(Label l) {
        this.labelOtraCausaImpedimento1 = l;
    }

    private Label labelOtraCausaImpedimento1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtraCausaImpedimento1x1() {
        return labelOtraCausaImpedimento1x1;
    }

    public void setLabelOtraCausaImpedimento1x1(Label l) {
        this.labelOtraCausaImpedimento1x1 = l;
    }

    private TextField campoOtraCausaImpedimento1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOtraCausaImpedimento1() {
        return campoOtraCausaImpedimento1;
    }

    public void setCampoOtraCausaImpedimento1(TextField component) {
        this.campoOtraCausaImpedimento1 = component;
    }

    private TextField campoOtraCausaImpedimento1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtraCausaImpedimento1x1() {
        return campoOtraCausaImpedimento1x1;
    }

    public void setCampoOtraCausaImpedimento1x1(TextField component) {
        this.campoOtraCausaImpedimento1x1 = component;
    }

    private HelpInline helpInlineOtraCausaImpedimento1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaImpedimento1() {
        return helpInlineOtraCausaImpedimento1;
    }

    public void setHelpInlineOtraCausaImpedimento1(HelpInline hi) {
        this.helpInlineOtraCausaImpedimento1 = hi;
    }

    private HelpInline helpInlineOtraCausaImpedimento1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtraCausaImpedimento1x1() {
        return helpInlineOtraCausaImpedimento1x1;
    }

    public void setHelpInlineOtraCausaImpedimento1x1(HelpInline hi) {
        this.helpInlineOtraCausaImpedimento1x1 = hi;
    }

    private StaticText campoOtraCausaImpedimento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaImpedimento1Texto1() {
        return campoOtraCausaImpedimento1Texto1;
    }

    public void setCampoOtraCausaImpedimento1Texto1(StaticText component) {
        this.campoOtraCausaImpedimento1Texto1 = component;
    }

    private StaticText campoOtraCausaImpedimento1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtraCausaImpedimento1x1Texto1() {
        return campoOtraCausaImpedimento1x1Texto1;
    }

    public void setCampoOtraCausaImpedimento1x1Texto1(StaticText component) {
        this.campoOtraCausaImpedimento1x1Texto1 = component;
    }

    private LengthValidator validatorOtraCausaImpedimento1 = new LengthValidator();
  
    public LengthValidator getValidatorOtraCausaImpedimento1() {
        return validatorOtraCausaImpedimento1;
    }
  
    public void setValidatorOtraCausaImpedimento1(LengthValidator validator) {
        this.validatorOtraCausaImpedimento1 = validator;
    }
  
    private Label labelNumeroSionoDifParaCaminar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDifParaCaminar1() {
        return labelNumeroSionoDifParaCaminar1;
    }

    public void setLabelNumeroSionoDifParaCaminar1(Label l) {
        this.labelNumeroSionoDifParaCaminar1 = l;
    }

    private Label labelNumeroSionoDifParaCaminar1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDifParaCaminar1x1() {
        return labelNumeroSionoDifParaCaminar1x1;
    }

    public void setLabelNumeroSionoDifParaCaminar1x1(Label l) {
        this.labelNumeroSionoDifParaCaminar1x1 = l;
    }

    private DropDown listaNumeroSionoDifParaCaminar1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDifParaCaminar1() {
        return listaNumeroSionoDifParaCaminar1;
    }

    public void setListaNumeroSionoDifParaCaminar1(DropDown component) {
        this.listaNumeroSionoDifParaCaminar1 = component;
    }

    private DropDown listaNumeroSionoDifParaCaminar1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDifParaCaminar1x1() {
        return listaNumeroSionoDifParaCaminar1x1;
    }

    public void setListaNumeroSionoDifParaCaminar1x1(DropDown component) {
        this.listaNumeroSionoDifParaCaminar1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoDifParaCaminar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDifParaCaminar1() {
        return helpInlineNumeroSionoDifParaCaminar1;
    }

    public void setHelpInlineNumeroSionoDifParaCaminar1(HelpInline hi) {
        this.helpInlineNumeroSionoDifParaCaminar1 = hi;
    }

    private HelpInline helpInlineNumeroSionoDifParaCaminar1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDifParaCaminar1x1() {
        return helpInlineNumeroSionoDifParaCaminar1x1;
    }

    public void setHelpInlineNumeroSionoDifParaCaminar1x1(HelpInline hi) {
        this.helpInlineNumeroSionoDifParaCaminar1x1 = hi;
    }

    private StaticText listaNumeroSionoDifParaCaminar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDifParaCaminar1Texto1() {
        return listaNumeroSionoDifParaCaminar1Texto1;
    }

    public void setListaNumeroSionoDifParaCaminar1Texto1(StaticText component) {
        this.listaNumeroSionoDifParaCaminar1Texto1 = component;
    }

    private StaticText listaNumeroSionoDifParaCaminar1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDifParaCaminar1x1Texto1() {
        return listaNumeroSionoDifParaCaminar1x1Texto1;
    }

    public void setListaNumeroSionoDifParaCaminar1x1Texto1(StaticText component) {
        this.listaNumeroSionoDifParaCaminar1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDifParaCaminar1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDifParaCaminar1() {
        return converterNumeroSionoDifParaCaminar1;
    }
  
    public void setConverterNumeroSionoDifParaCaminar1(IntegerConverter converter) {
        this.converterNumeroSionoDifParaCaminar1 = converter;
    }
  
    private Label labelNumeroSionoDifParaVestirse1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDifParaVestirse1() {
        return labelNumeroSionoDifParaVestirse1;
    }

    public void setLabelNumeroSionoDifParaVestirse1(Label l) {
        this.labelNumeroSionoDifParaVestirse1 = l;
    }

    private Label labelNumeroSionoDifParaVestirse1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDifParaVestirse1x1() {
        return labelNumeroSionoDifParaVestirse1x1;
    }

    public void setLabelNumeroSionoDifParaVestirse1x1(Label l) {
        this.labelNumeroSionoDifParaVestirse1x1 = l;
    }

    private DropDown listaNumeroSionoDifParaVestirse1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDifParaVestirse1() {
        return listaNumeroSionoDifParaVestirse1;
    }

    public void setListaNumeroSionoDifParaVestirse1(DropDown component) {
        this.listaNumeroSionoDifParaVestirse1 = component;
    }

    private DropDown listaNumeroSionoDifParaVestirse1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDifParaVestirse1x1() {
        return listaNumeroSionoDifParaVestirse1x1;
    }

    public void setListaNumeroSionoDifParaVestirse1x1(DropDown component) {
        this.listaNumeroSionoDifParaVestirse1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoDifParaVestirse1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDifParaVestirse1() {
        return helpInlineNumeroSionoDifParaVestirse1;
    }

    public void setHelpInlineNumeroSionoDifParaVestirse1(HelpInline hi) {
        this.helpInlineNumeroSionoDifParaVestirse1 = hi;
    }

    private HelpInline helpInlineNumeroSionoDifParaVestirse1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDifParaVestirse1x1() {
        return helpInlineNumeroSionoDifParaVestirse1x1;
    }

    public void setHelpInlineNumeroSionoDifParaVestirse1x1(HelpInline hi) {
        this.helpInlineNumeroSionoDifParaVestirse1x1 = hi;
    }

    private StaticText listaNumeroSionoDifParaVestirse1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDifParaVestirse1Texto1() {
        return listaNumeroSionoDifParaVestirse1Texto1;
    }

    public void setListaNumeroSionoDifParaVestirse1Texto1(StaticText component) {
        this.listaNumeroSionoDifParaVestirse1Texto1 = component;
    }

    private StaticText listaNumeroSionoDifParaVestirse1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDifParaVestirse1x1Texto1() {
        return listaNumeroSionoDifParaVestirse1x1Texto1;
    }

    public void setListaNumeroSionoDifParaVestirse1x1Texto1(StaticText component) {
        this.listaNumeroSionoDifParaVestirse1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDifParaVestirse1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDifParaVestirse1() {
        return converterNumeroSionoDifParaVestirse1;
    }
  
    public void setConverterNumeroSionoDifParaVestirse1(IntegerConverter converter) {
        this.converterNumeroSionoDifParaVestirse1 = converter;
    }
  
    private Label labelNumeroSionoDifParaBanarse1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDifParaBanarse1() {
        return labelNumeroSionoDifParaBanarse1;
    }

    public void setLabelNumeroSionoDifParaBanarse1(Label l) {
        this.labelNumeroSionoDifParaBanarse1 = l;
    }

    private Label labelNumeroSionoDifParaBanarse1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDifParaBanarse1x1() {
        return labelNumeroSionoDifParaBanarse1x1;
    }

    public void setLabelNumeroSionoDifParaBanarse1x1(Label l) {
        this.labelNumeroSionoDifParaBanarse1x1 = l;
    }

    private DropDown listaNumeroSionoDifParaBanarse1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDifParaBanarse1() {
        return listaNumeroSionoDifParaBanarse1;
    }

    public void setListaNumeroSionoDifParaBanarse1(DropDown component) {
        this.listaNumeroSionoDifParaBanarse1 = component;
    }

    private DropDown listaNumeroSionoDifParaBanarse1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDifParaBanarse1x1() {
        return listaNumeroSionoDifParaBanarse1x1;
    }

    public void setListaNumeroSionoDifParaBanarse1x1(DropDown component) {
        this.listaNumeroSionoDifParaBanarse1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoDifParaBanarse1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDifParaBanarse1() {
        return helpInlineNumeroSionoDifParaBanarse1;
    }

    public void setHelpInlineNumeroSionoDifParaBanarse1(HelpInline hi) {
        this.helpInlineNumeroSionoDifParaBanarse1 = hi;
    }

    private HelpInline helpInlineNumeroSionoDifParaBanarse1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDifParaBanarse1x1() {
        return helpInlineNumeroSionoDifParaBanarse1x1;
    }

    public void setHelpInlineNumeroSionoDifParaBanarse1x1(HelpInline hi) {
        this.helpInlineNumeroSionoDifParaBanarse1x1 = hi;
    }

    private StaticText listaNumeroSionoDifParaBanarse1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDifParaBanarse1Texto1() {
        return listaNumeroSionoDifParaBanarse1Texto1;
    }

    public void setListaNumeroSionoDifParaBanarse1Texto1(StaticText component) {
        this.listaNumeroSionoDifParaBanarse1Texto1 = component;
    }

    private StaticText listaNumeroSionoDifParaBanarse1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDifParaBanarse1x1Texto1() {
        return listaNumeroSionoDifParaBanarse1x1Texto1;
    }

    public void setListaNumeroSionoDifParaBanarse1x1Texto1(StaticText component) {
        this.listaNumeroSionoDifParaBanarse1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDifParaBanarse1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDifParaBanarse1() {
        return converterNumeroSionoDifParaBanarse1;
    }
  
    public void setConverterNumeroSionoDifParaBanarse1(IntegerConverter converter) {
        this.converterNumeroSionoDifParaBanarse1 = converter;
    }
  
    private Label labelNumeroSionoDifParaComer1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDifParaComer1() {
        return labelNumeroSionoDifParaComer1;
    }

    public void setLabelNumeroSionoDifParaComer1(Label l) {
        this.labelNumeroSionoDifParaComer1 = l;
    }

    private Label labelNumeroSionoDifParaComer1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDifParaComer1x1() {
        return labelNumeroSionoDifParaComer1x1;
    }

    public void setLabelNumeroSionoDifParaComer1x1(Label l) {
        this.labelNumeroSionoDifParaComer1x1 = l;
    }

    private DropDown listaNumeroSionoDifParaComer1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDifParaComer1() {
        return listaNumeroSionoDifParaComer1;
    }

    public void setListaNumeroSionoDifParaComer1(DropDown component) {
        this.listaNumeroSionoDifParaComer1 = component;
    }

    private DropDown listaNumeroSionoDifParaComer1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDifParaComer1x1() {
        return listaNumeroSionoDifParaComer1x1;
    }

    public void setListaNumeroSionoDifParaComer1x1(DropDown component) {
        this.listaNumeroSionoDifParaComer1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoDifParaComer1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDifParaComer1() {
        return helpInlineNumeroSionoDifParaComer1;
    }

    public void setHelpInlineNumeroSionoDifParaComer1(HelpInline hi) {
        this.helpInlineNumeroSionoDifParaComer1 = hi;
    }

    private HelpInline helpInlineNumeroSionoDifParaComer1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDifParaComer1x1() {
        return helpInlineNumeroSionoDifParaComer1x1;
    }

    public void setHelpInlineNumeroSionoDifParaComer1x1(HelpInline hi) {
        this.helpInlineNumeroSionoDifParaComer1x1 = hi;
    }

    private StaticText listaNumeroSionoDifParaComer1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDifParaComer1Texto1() {
        return listaNumeroSionoDifParaComer1Texto1;
    }

    public void setListaNumeroSionoDifParaComer1Texto1(StaticText component) {
        this.listaNumeroSionoDifParaComer1Texto1 = component;
    }

    private StaticText listaNumeroSionoDifParaComer1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDifParaComer1x1Texto1() {
        return listaNumeroSionoDifParaComer1x1Texto1;
    }

    public void setListaNumeroSionoDifParaComer1x1Texto1(StaticText component) {
        this.listaNumeroSionoDifParaComer1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDifParaComer1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDifParaComer1() {
        return converterNumeroSionoDifParaComer1;
    }
  
    public void setConverterNumeroSionoDifParaComer1(IntegerConverter converter) {
        this.converterNumeroSionoDifParaComer1 = converter;
    }
  
    private Label labelNumeroSionoDifParaLaCama1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDifParaLaCama1() {
        return labelNumeroSionoDifParaLaCama1;
    }

    public void setLabelNumeroSionoDifParaLaCama1(Label l) {
        this.labelNumeroSionoDifParaLaCama1 = l;
    }

    private Label labelNumeroSionoDifParaLaCama1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDifParaLaCama1x1() {
        return labelNumeroSionoDifParaLaCama1x1;
    }

    public void setLabelNumeroSionoDifParaLaCama1x1(Label l) {
        this.labelNumeroSionoDifParaLaCama1x1 = l;
    }

    private DropDown listaNumeroSionoDifParaLaCama1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDifParaLaCama1() {
        return listaNumeroSionoDifParaLaCama1;
    }

    public void setListaNumeroSionoDifParaLaCama1(DropDown component) {
        this.listaNumeroSionoDifParaLaCama1 = component;
    }

    private DropDown listaNumeroSionoDifParaLaCama1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDifParaLaCama1x1() {
        return listaNumeroSionoDifParaLaCama1x1;
    }

    public void setListaNumeroSionoDifParaLaCama1x1(DropDown component) {
        this.listaNumeroSionoDifParaLaCama1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoDifParaLaCama1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDifParaLaCama1() {
        return helpInlineNumeroSionoDifParaLaCama1;
    }

    public void setHelpInlineNumeroSionoDifParaLaCama1(HelpInline hi) {
        this.helpInlineNumeroSionoDifParaLaCama1 = hi;
    }

    private HelpInline helpInlineNumeroSionoDifParaLaCama1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDifParaLaCama1x1() {
        return helpInlineNumeroSionoDifParaLaCama1x1;
    }

    public void setHelpInlineNumeroSionoDifParaLaCama1x1(HelpInline hi) {
        this.helpInlineNumeroSionoDifParaLaCama1x1 = hi;
    }

    private StaticText listaNumeroSionoDifParaLaCama1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDifParaLaCama1Texto1() {
        return listaNumeroSionoDifParaLaCama1Texto1;
    }

    public void setListaNumeroSionoDifParaLaCama1Texto1(StaticText component) {
        this.listaNumeroSionoDifParaLaCama1Texto1 = component;
    }

    private StaticText listaNumeroSionoDifParaLaCama1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDifParaLaCama1x1Texto1() {
        return listaNumeroSionoDifParaLaCama1x1Texto1;
    }

    public void setListaNumeroSionoDifParaLaCama1x1Texto1(StaticText component) {
        this.listaNumeroSionoDifParaLaCama1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDifParaLaCama1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDifParaLaCama1() {
        return converterNumeroSionoDifParaLaCama1;
    }
  
    public void setConverterNumeroSionoDifParaLaCama1(IntegerConverter converter) {
        this.converterNumeroSionoDifParaLaCama1 = converter;
    }
  
    private Label labelNumeroSionoDifParaElBano1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDifParaElBano1() {
        return labelNumeroSionoDifParaElBano1;
    }

    public void setLabelNumeroSionoDifParaElBano1(Label l) {
        this.labelNumeroSionoDifParaElBano1 = l;
    }

    private Label labelNumeroSionoDifParaElBano1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoDifParaElBano1x1() {
        return labelNumeroSionoDifParaElBano1x1;
    }

    public void setLabelNumeroSionoDifParaElBano1x1(Label l) {
        this.labelNumeroSionoDifParaElBano1x1 = l;
    }

    private DropDown listaNumeroSionoDifParaElBano1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoDifParaElBano1() {
        return listaNumeroSionoDifParaElBano1;
    }

    public void setListaNumeroSionoDifParaElBano1(DropDown component) {
        this.listaNumeroSionoDifParaElBano1 = component;
    }

    private DropDown listaNumeroSionoDifParaElBano1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoDifParaElBano1x1() {
        return listaNumeroSionoDifParaElBano1x1;
    }

    public void setListaNumeroSionoDifParaElBano1x1(DropDown component) {
        this.listaNumeroSionoDifParaElBano1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoDifParaElBano1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDifParaElBano1() {
        return helpInlineNumeroSionoDifParaElBano1;
    }

    public void setHelpInlineNumeroSionoDifParaElBano1(HelpInline hi) {
        this.helpInlineNumeroSionoDifParaElBano1 = hi;
    }

    private HelpInline helpInlineNumeroSionoDifParaElBano1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoDifParaElBano1x1() {
        return helpInlineNumeroSionoDifParaElBano1x1;
    }

    public void setHelpInlineNumeroSionoDifParaElBano1x1(HelpInline hi) {
        this.helpInlineNumeroSionoDifParaElBano1x1 = hi;
    }

    private StaticText listaNumeroSionoDifParaElBano1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDifParaElBano1Texto1() {
        return listaNumeroSionoDifParaElBano1Texto1;
    }

    public void setListaNumeroSionoDifParaElBano1Texto1(StaticText component) {
        this.listaNumeroSionoDifParaElBano1Texto1 = component;
    }

    private StaticText listaNumeroSionoDifParaElBano1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoDifParaElBano1x1Texto1() {
        return listaNumeroSionoDifParaElBano1x1Texto1;
    }

    public void setListaNumeroSionoDifParaElBano1x1Texto1(StaticText component) {
        this.listaNumeroSionoDifParaElBano1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoDifParaElBano1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoDifParaElBano1() {
        return converterNumeroSionoDifParaElBano1;
    }
  
    public void setConverterNumeroSionoDifParaElBano1(IntegerConverter converter) {
        this.converterNumeroSionoDifParaElBano1 = converter;
    }
  
    private Label labelNumeroSionoTrabajo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoTrabajo1() {
        return labelNumeroSionoTrabajo1;
    }

    public void setLabelNumeroSionoTrabajo1(Label l) {
        this.labelNumeroSionoTrabajo1 = l;
    }

    private Label labelNumeroSionoTrabajo1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroSionoTrabajo1x1() {
        return labelNumeroSionoTrabajo1x1;
    }

    public void setLabelNumeroSionoTrabajo1x1(Label l) {
        this.labelNumeroSionoTrabajo1x1 = l;
    }

    private DropDown listaNumeroSionoTrabajo1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroSionoTrabajo1() {
        return listaNumeroSionoTrabajo1;
    }

    public void setListaNumeroSionoTrabajo1(DropDown component) {
        this.listaNumeroSionoTrabajo1 = component;
    }

    private DropDown listaNumeroSionoTrabajo1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroSionoTrabajo1x1() {
        return listaNumeroSionoTrabajo1x1;
    }

    public void setListaNumeroSionoTrabajo1x1(DropDown component) {
        this.listaNumeroSionoTrabajo1x1 = component;
    }

    private HelpInline helpInlineNumeroSionoTrabajo1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoTrabajo1() {
        return helpInlineNumeroSionoTrabajo1;
    }

    public void setHelpInlineNumeroSionoTrabajo1(HelpInline hi) {
        this.helpInlineNumeroSionoTrabajo1 = hi;
    }

    private HelpInline helpInlineNumeroSionoTrabajo1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroSionoTrabajo1x1() {
        return helpInlineNumeroSionoTrabajo1x1;
    }

    public void setHelpInlineNumeroSionoTrabajo1x1(HelpInline hi) {
        this.helpInlineNumeroSionoTrabajo1x1 = hi;
    }

    private StaticText listaNumeroSionoTrabajo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoTrabajo1Texto1() {
        return listaNumeroSionoTrabajo1Texto1;
    }

    public void setListaNumeroSionoTrabajo1Texto1(StaticText component) {
        this.listaNumeroSionoTrabajo1Texto1 = component;
    }

    private StaticText listaNumeroSionoTrabajo1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroSionoTrabajo1x1Texto1() {
        return listaNumeroSionoTrabajo1x1Texto1;
    }

    public void setListaNumeroSionoTrabajo1x1Texto1(StaticText component) {
        this.listaNumeroSionoTrabajo1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroSionoTrabajo1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroSionoTrabajo1() {
        return converterNumeroSionoTrabajo1;
    }
  
    public void setConverterNumeroSionoTrabajo1(IntegerConverter converter) {
        this.converterNumeroSionoTrabajo1 = converter;
    }
  
    private Label labelNumeroMotivoNoTrabajo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroMotivoNoTrabajo1() {
        return labelNumeroMotivoNoTrabajo1;
    }

    public void setLabelNumeroMotivoNoTrabajo1(Label l) {
        this.labelNumeroMotivoNoTrabajo1 = l;
    }

    private Label labelNumeroMotivoNoTrabajo1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroMotivoNoTrabajo1x1() {
        return labelNumeroMotivoNoTrabajo1x1;
    }

    public void setLabelNumeroMotivoNoTrabajo1x1(Label l) {
        this.labelNumeroMotivoNoTrabajo1x1 = l;
    }

    private DropDown listaNumeroMotivoNoTrabajo1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroMotivoNoTrabajo1() {
        return listaNumeroMotivoNoTrabajo1;
    }

    public void setListaNumeroMotivoNoTrabajo1(DropDown component) {
        this.listaNumeroMotivoNoTrabajo1 = component;
    }

    private DropDown listaNumeroMotivoNoTrabajo1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroMotivoNoTrabajo1x1() {
        return listaNumeroMotivoNoTrabajo1x1;
    }

    public void setListaNumeroMotivoNoTrabajo1x1(DropDown component) {
        this.listaNumeroMotivoNoTrabajo1x1 = component;
    }

    private HelpInline helpInlineNumeroMotivoNoTrabajo1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroMotivoNoTrabajo1() {
        return helpInlineNumeroMotivoNoTrabajo1;
    }

    public void setHelpInlineNumeroMotivoNoTrabajo1(HelpInline hi) {
        this.helpInlineNumeroMotivoNoTrabajo1 = hi;
    }

    private HelpInline helpInlineNumeroMotivoNoTrabajo1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroMotivoNoTrabajo1x1() {
        return helpInlineNumeroMotivoNoTrabajo1x1;
    }

    public void setHelpInlineNumeroMotivoNoTrabajo1x1(HelpInline hi) {
        this.helpInlineNumeroMotivoNoTrabajo1x1 = hi;
    }

    private StaticText listaNumeroMotivoNoTrabajo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroMotivoNoTrabajo1Texto1() {
        return listaNumeroMotivoNoTrabajo1Texto1;
    }

    public void setListaNumeroMotivoNoTrabajo1Texto1(StaticText component) {
        this.listaNumeroMotivoNoTrabajo1Texto1 = component;
    }

    private StaticText listaNumeroMotivoNoTrabajo1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroMotivoNoTrabajo1x1Texto1() {
        return listaNumeroMotivoNoTrabajo1x1Texto1;
    }

    public void setListaNumeroMotivoNoTrabajo1x1Texto1(StaticText component) {
        this.listaNumeroMotivoNoTrabajo1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroMotivoNoTrabajo1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroMotivoNoTrabajo1() {
        return converterNumeroMotivoNoTrabajo1;
    }
  
    public void setConverterNumeroMotivoNoTrabajo1(IntegerConverter converter) {
        this.converterNumeroMotivoNoTrabajo1 = converter;
    }
  
    private Label labelOtroMotivoNoTrabajo1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtroMotivoNoTrabajo1() {
        return labelOtroMotivoNoTrabajo1;
    }

    public void setLabelOtroMotivoNoTrabajo1(Label l) {
        this.labelOtroMotivoNoTrabajo1 = l;
    }

    private Label labelOtroMotivoNoTrabajo1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelOtroMotivoNoTrabajo1x1() {
        return labelOtroMotivoNoTrabajo1x1;
    }

    public void setLabelOtroMotivoNoTrabajo1x1(Label l) {
        this.labelOtroMotivoNoTrabajo1x1 = l;
    }

    private TextField campoOtroMotivoNoTrabajo1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoOtroMotivoNoTrabajo1() {
        return campoOtroMotivoNoTrabajo1;
    }

    public void setCampoOtroMotivoNoTrabajo1(TextField component) {
        this.campoOtroMotivoNoTrabajo1 = component;
    }

    private TextField campoOtroMotivoNoTrabajo1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoOtroMotivoNoTrabajo1x1() {
        return campoOtroMotivoNoTrabajo1x1;
    }

    public void setCampoOtroMotivoNoTrabajo1x1(TextField component) {
        this.campoOtroMotivoNoTrabajo1x1 = component;
    }

    private HelpInline helpInlineOtroMotivoNoTrabajo1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtroMotivoNoTrabajo1() {
        return helpInlineOtroMotivoNoTrabajo1;
    }

    public void setHelpInlineOtroMotivoNoTrabajo1(HelpInline hi) {
        this.helpInlineOtroMotivoNoTrabajo1 = hi;
    }

    private HelpInline helpInlineOtroMotivoNoTrabajo1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineOtroMotivoNoTrabajo1x1() {
        return helpInlineOtroMotivoNoTrabajo1x1;
    }

    public void setHelpInlineOtroMotivoNoTrabajo1x1(HelpInline hi) {
        this.helpInlineOtroMotivoNoTrabajo1x1 = hi;
    }

    private StaticText campoOtroMotivoNoTrabajo1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtroMotivoNoTrabajo1Texto1() {
        return campoOtroMotivoNoTrabajo1Texto1;
    }

    public void setCampoOtroMotivoNoTrabajo1Texto1(StaticText component) {
        this.campoOtroMotivoNoTrabajo1Texto1 = component;
    }

    private StaticText campoOtroMotivoNoTrabajo1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoOtroMotivoNoTrabajo1x1Texto1() {
        return campoOtroMotivoNoTrabajo1x1Texto1;
    }

    public void setCampoOtroMotivoNoTrabajo1x1Texto1(StaticText component) {
        this.campoOtroMotivoNoTrabajo1x1Texto1 = component;
    }

    private LengthValidator validatorOtroMotivoNoTrabajo1 = new LengthValidator();
  
    public LengthValidator getValidatorOtroMotivoNoTrabajo1() {
        return validatorOtroMotivoNoTrabajo1;
    }
  
    public void setValidatorOtroMotivoNoTrabajo1(LengthValidator validator) {
        this.validatorOtroMotivoNoTrabajo1 = validator;
    }
  
    private Label labelDescripcionOcupacionPrin1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDescripcionOcupacionPrin1() {
        return labelDescripcionOcupacionPrin1;
    }

    public void setLabelDescripcionOcupacionPrin1(Label l) {
        this.labelDescripcionOcupacionPrin1 = l;
    }

    private Label labelDescripcionOcupacionPrin1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDescripcionOcupacionPrin1x1() {
        return labelDescripcionOcupacionPrin1x1;
    }

    public void setLabelDescripcionOcupacionPrin1x1(Label l) {
        this.labelDescripcionOcupacionPrin1x1 = l;
    }

    private TextField campoDescripcionOcupacionPrin1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoDescripcionOcupacionPrin1() {
        return campoDescripcionOcupacionPrin1;
    }

    public void setCampoDescripcionOcupacionPrin1(TextField component) {
        this.campoDescripcionOcupacionPrin1 = component;
    }

    private TextField campoDescripcionOcupacionPrin1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoDescripcionOcupacionPrin1x1() {
        return campoDescripcionOcupacionPrin1x1;
    }

    public void setCampoDescripcionOcupacionPrin1x1(TextField component) {
        this.campoDescripcionOcupacionPrin1x1 = component;
    }

    private HelpInline helpInlineDescripcionOcupacionPrin1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineDescripcionOcupacionPrin1() {
        return helpInlineDescripcionOcupacionPrin1;
    }

    public void setHelpInlineDescripcionOcupacionPrin1(HelpInline hi) {
        this.helpInlineDescripcionOcupacionPrin1 = hi;
    }

    private HelpInline helpInlineDescripcionOcupacionPrin1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineDescripcionOcupacionPrin1x1() {
        return helpInlineDescripcionOcupacionPrin1x1;
    }

    public void setHelpInlineDescripcionOcupacionPrin1x1(HelpInline hi) {
        this.helpInlineDescripcionOcupacionPrin1x1 = hi;
    }

    private StaticText campoDescripcionOcupacionPrin1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDescripcionOcupacionPrin1Texto1() {
        return campoDescripcionOcupacionPrin1Texto1;
    }

    public void setCampoDescripcionOcupacionPrin1Texto1(StaticText component) {
        this.campoDescripcionOcupacionPrin1Texto1 = component;
    }

    private StaticText campoDescripcionOcupacionPrin1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDescripcionOcupacionPrin1x1Texto1() {
        return campoDescripcionOcupacionPrin1x1Texto1;
    }

    public void setCampoDescripcionOcupacionPrin1x1Texto1(StaticText component) {
        this.campoDescripcionOcupacionPrin1x1Texto1 = component;
    }

    private LengthValidator validatorDescripcionOcupacionPrin1 = new LengthValidator();
  
    public LengthValidator getValidatorDescripcionOcupacionPrin1() {
        return validatorDescripcionOcupacionPrin1;
    }
  
    public void setValidatorDescripcionOcupacionPrin1(LengthValidator validator) {
        this.validatorDescripcionOcupacionPrin1 = validator;
    }
  
    private Label labelDescripcionDedicacionPrin1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDescripcionDedicacionPrin1() {
        return labelDescripcionDedicacionPrin1;
    }

    public void setLabelDescripcionDedicacionPrin1(Label l) {
        this.labelDescripcionDedicacionPrin1 = l;
    }

    private Label labelDescripcionDedicacionPrin1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelDescripcionDedicacionPrin1x1() {
        return labelDescripcionDedicacionPrin1x1;
    }

    public void setLabelDescripcionDedicacionPrin1x1(Label l) {
        this.labelDescripcionDedicacionPrin1x1 = l;
    }

    private TextField campoDescripcionDedicacionPrin1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoDescripcionDedicacionPrin1() {
        return campoDescripcionDedicacionPrin1;
    }

    public void setCampoDescripcionDedicacionPrin1(TextField component) {
        this.campoDescripcionDedicacionPrin1 = component;
    }

    private TextField campoDescripcionDedicacionPrin1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoDescripcionDedicacionPrin1x1() {
        return campoDescripcionDedicacionPrin1x1;
    }

    public void setCampoDescripcionDedicacionPrin1x1(TextField component) {
        this.campoDescripcionDedicacionPrin1x1 = component;
    }

    private HelpInline helpInlineDescripcionDedicacionPrin1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineDescripcionDedicacionPrin1() {
        return helpInlineDescripcionDedicacionPrin1;
    }

    public void setHelpInlineDescripcionDedicacionPrin1(HelpInline hi) {
        this.helpInlineDescripcionDedicacionPrin1 = hi;
    }

    private HelpInline helpInlineDescripcionDedicacionPrin1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineDescripcionDedicacionPrin1x1() {
        return helpInlineDescripcionDedicacionPrin1x1;
    }

    public void setHelpInlineDescripcionDedicacionPrin1x1(HelpInline hi) {
        this.helpInlineDescripcionDedicacionPrin1x1 = hi;
    }

    private StaticText campoDescripcionDedicacionPrin1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDescripcionDedicacionPrin1Texto1() {
        return campoDescripcionDedicacionPrin1Texto1;
    }

    public void setCampoDescripcionDedicacionPrin1Texto1(StaticText component) {
        this.campoDescripcionDedicacionPrin1Texto1 = component;
    }

    private StaticText campoDescripcionDedicacionPrin1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoDescripcionDedicacionPrin1x1Texto1() {
        return campoDescripcionDedicacionPrin1x1Texto1;
    }

    public void setCampoDescripcionDedicacionPrin1x1Texto1(StaticText component) {
        this.campoDescripcionDedicacionPrin1x1Texto1 = component;
    }

    private LengthValidator validatorDescripcionDedicacionPrin1 = new LengthValidator();
  
    public LengthValidator getValidatorDescripcionDedicacionPrin1() {
        return validatorDescripcionDedicacionPrin1;
    }
  
    public void setValidatorDescripcionDedicacionPrin1(LengthValidator validator) {
        this.validatorDescripcionDedicacionPrin1 = validator;
    }
  
    private Label labelNumeroTipoRelacionLab1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoRelacionLab1() {
        return labelNumeroTipoRelacionLab1;
    }

    public void setLabelNumeroTipoRelacionLab1(Label l) {
        this.labelNumeroTipoRelacionLab1 = l;
    }

    private Label labelNumeroTipoRelacionLab1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNumeroTipoRelacionLab1x1() {
        return labelNumeroTipoRelacionLab1x1;
    }

    public void setLabelNumeroTipoRelacionLab1x1(Label l) {
        this.labelNumeroTipoRelacionLab1x1 = l;
    }

    private DropDown listaNumeroTipoRelacionLab1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaNumeroTipoRelacionLab1() {
        return listaNumeroTipoRelacionLab1;
    }

    public void setListaNumeroTipoRelacionLab1(DropDown component) {
        this.listaNumeroTipoRelacionLab1 = component;
    }

    private DropDown listaNumeroTipoRelacionLab1x1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaNumeroTipoRelacionLab1x1() {
        return listaNumeroTipoRelacionLab1x1;
    }

    public void setListaNumeroTipoRelacionLab1x1(DropDown component) {
        this.listaNumeroTipoRelacionLab1x1 = component;
    }

    private HelpInline helpInlineNumeroTipoRelacionLab1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoRelacionLab1() {
        return helpInlineNumeroTipoRelacionLab1;
    }

    public void setHelpInlineNumeroTipoRelacionLab1(HelpInline hi) {
        this.helpInlineNumeroTipoRelacionLab1 = hi;
    }

    private HelpInline helpInlineNumeroTipoRelacionLab1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNumeroTipoRelacionLab1x1() {
        return helpInlineNumeroTipoRelacionLab1x1;
    }

    public void setHelpInlineNumeroTipoRelacionLab1x1(HelpInline hi) {
        this.helpInlineNumeroTipoRelacionLab1x1 = hi;
    }

    private StaticText listaNumeroTipoRelacionLab1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoRelacionLab1Texto1() {
        return listaNumeroTipoRelacionLab1Texto1;
    }

    public void setListaNumeroTipoRelacionLab1Texto1(StaticText component) {
        this.listaNumeroTipoRelacionLab1Texto1 = component;
    }

    private StaticText listaNumeroTipoRelacionLab1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaNumeroTipoRelacionLab1x1Texto1() {
        return listaNumeroTipoRelacionLab1x1Texto1;
    }

    public void setListaNumeroTipoRelacionLab1x1Texto1(StaticText component) {
        this.listaNumeroTipoRelacionLab1x1Texto1 = component;
    }

    private IntegerConverter converterNumeroTipoRelacionLab1 = new IntegerConverter();
  
    public IntegerConverter getConverterNumeroTipoRelacionLab1() {
        return converterNumeroTipoRelacionLab1;
    }
  
    public void setConverterNumeroTipoRelacionLab1(IntegerConverter converter) {
        this.converterNumeroTipoRelacionLab1 = converter;
    }
  
    private Label labelMontoIngresoOcupacionPrin1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoOcupacionPrin1() {
        return labelMontoIngresoOcupacionPrin1;
    }

    public void setLabelMontoIngresoOcupacionPrin1(Label l) {
        this.labelMontoIngresoOcupacionPrin1 = l;
    }

    private Label labelMontoIngresoOcupacionPrin1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoOcupacionPrin1x1() {
        return labelMontoIngresoOcupacionPrin1x1;
    }

    public void setLabelMontoIngresoOcupacionPrin1x1(Label l) {
        this.labelMontoIngresoOcupacionPrin1x1 = l;
    }

    private TextField campoMontoIngresoOcupacionPrin1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoMontoIngresoOcupacionPrin1() {
        return campoMontoIngresoOcupacionPrin1;
    }

    public void setCampoMontoIngresoOcupacionPrin1(TextField component) {
        this.campoMontoIngresoOcupacionPrin1 = component;
    }

    private TextField campoMontoIngresoOcupacionPrin1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoMontoIngresoOcupacionPrin1x1() {
        return campoMontoIngresoOcupacionPrin1x1;
    }

    public void setCampoMontoIngresoOcupacionPrin1x1(TextField component) {
        this.campoMontoIngresoOcupacionPrin1x1 = component;
    }

    private HelpInline helpInlineMontoIngresoOcupacionPrin1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoOcupacionPrin1() {
        return helpInlineMontoIngresoOcupacionPrin1;
    }

    public void setHelpInlineMontoIngresoOcupacionPrin1(HelpInline hi) {
        this.helpInlineMontoIngresoOcupacionPrin1 = hi;
    }

    private HelpInline helpInlineMontoIngresoOcupacionPrin1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoOcupacionPrin1x1() {
        return helpInlineMontoIngresoOcupacionPrin1x1;
    }

    public void setHelpInlineMontoIngresoOcupacionPrin1x1(HelpInline hi) {
        this.helpInlineMontoIngresoOcupacionPrin1x1 = hi;
    }

    private StaticText campoMontoIngresoOcupacionPrin1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoOcupacionPrin1Texto1() {
        return campoMontoIngresoOcupacionPrin1Texto1;
    }

    public void setCampoMontoIngresoOcupacionPrin1Texto1(StaticText component) {
        this.campoMontoIngresoOcupacionPrin1Texto1 = component;
    }

    private StaticText campoMontoIngresoOcupacionPrin1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoOcupacionPrin1x1Texto1() {
        return campoMontoIngresoOcupacionPrin1x1Texto1;
    }

    public void setCampoMontoIngresoOcupacionPrin1x1Texto1(StaticText component) {
        this.campoMontoIngresoOcupacionPrin1x1Texto1 = component;
    }

    private NumberConverter converterMontoIngresoOcupacionPrin1 = new NumberConverter();
  
    public NumberConverter getConverterMontoIngresoOcupacionPrin1() {
        return converterMontoIngresoOcupacionPrin1;
    }
  
    public void setConverterMontoIngresoOcupacionPrin1(NumberConverter converter) {
        this.converterMontoIngresoOcupacionPrin1 = converter;
    }
  
    private DoubleRangeValidator validatorMontoIngresoOcupacionPrin1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorMontoIngresoOcupacionPrin1() {
        return validatorMontoIngresoOcupacionPrin1;
    }
  
    public void setValidatorMontoIngresoOcupacionPrin1(DoubleRangeValidator validator) {
        this.validatorMontoIngresoOcupacionPrin1 = validator;
    }
  
    private Label labelMontoIngresoOcupacionSecun1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoOcupacionSecun1() {
        return labelMontoIngresoOcupacionSecun1;
    }

    public void setLabelMontoIngresoOcupacionSecun1(Label l) {
        this.labelMontoIngresoOcupacionSecun1 = l;
    }

    private Label labelMontoIngresoOcupacionSecun1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoOcupacionSecun1x1() {
        return labelMontoIngresoOcupacionSecun1x1;
    }

    public void setLabelMontoIngresoOcupacionSecun1x1(Label l) {
        this.labelMontoIngresoOcupacionSecun1x1 = l;
    }

    private TextField campoMontoIngresoOcupacionSecun1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoMontoIngresoOcupacionSecun1() {
        return campoMontoIngresoOcupacionSecun1;
    }

    public void setCampoMontoIngresoOcupacionSecun1(TextField component) {
        this.campoMontoIngresoOcupacionSecun1 = component;
    }

    private TextField campoMontoIngresoOcupacionSecun1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoMontoIngresoOcupacionSecun1x1() {
        return campoMontoIngresoOcupacionSecun1x1;
    }

    public void setCampoMontoIngresoOcupacionSecun1x1(TextField component) {
        this.campoMontoIngresoOcupacionSecun1x1 = component;
    }

    private HelpInline helpInlineMontoIngresoOcupacionSecun1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoOcupacionSecun1() {
        return helpInlineMontoIngresoOcupacionSecun1;
    }

    public void setHelpInlineMontoIngresoOcupacionSecun1(HelpInline hi) {
        this.helpInlineMontoIngresoOcupacionSecun1 = hi;
    }

    private HelpInline helpInlineMontoIngresoOcupacionSecun1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoOcupacionSecun1x1() {
        return helpInlineMontoIngresoOcupacionSecun1x1;
    }

    public void setHelpInlineMontoIngresoOcupacionSecun1x1(HelpInline hi) {
        this.helpInlineMontoIngresoOcupacionSecun1x1 = hi;
    }

    private StaticText campoMontoIngresoOcupacionSecun1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoOcupacionSecun1Texto1() {
        return campoMontoIngresoOcupacionSecun1Texto1;
    }

    public void setCampoMontoIngresoOcupacionSecun1Texto1(StaticText component) {
        this.campoMontoIngresoOcupacionSecun1Texto1 = component;
    }

    private StaticText campoMontoIngresoOcupacionSecun1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoOcupacionSecun1x1Texto1() {
        return campoMontoIngresoOcupacionSecun1x1Texto1;
    }

    public void setCampoMontoIngresoOcupacionSecun1x1Texto1(StaticText component) {
        this.campoMontoIngresoOcupacionSecun1x1Texto1 = component;
    }

    private NumberConverter converterMontoIngresoOcupacionSecun1 = new NumberConverter();
  
    public NumberConverter getConverterMontoIngresoOcupacionSecun1() {
        return converterMontoIngresoOcupacionSecun1;
    }
  
    public void setConverterMontoIngresoOcupacionSecun1(NumberConverter converter) {
        this.converterMontoIngresoOcupacionSecun1 = converter;
    }
  
    private DoubleRangeValidator validatorMontoIngresoOcupacionSecun1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorMontoIngresoOcupacionSecun1() {
        return validatorMontoIngresoOcupacionSecun1;
    }
  
    public void setValidatorMontoIngresoOcupacionSecun1(DoubleRangeValidator validator) {
        this.validatorMontoIngresoOcupacionSecun1 = validator;
    }
  
    private Label labelMontoIngresoOtrasOcup1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoOtrasOcup1() {
        return labelMontoIngresoOtrasOcup1;
    }

    public void setLabelMontoIngresoOtrasOcup1(Label l) {
        this.labelMontoIngresoOtrasOcup1 = l;
    }

    private Label labelMontoIngresoOtrasOcup1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoOtrasOcup1x1() {
        return labelMontoIngresoOtrasOcup1x1;
    }

    public void setLabelMontoIngresoOtrasOcup1x1(Label l) {
        this.labelMontoIngresoOtrasOcup1x1 = l;
    }

    private TextField campoMontoIngresoOtrasOcup1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoMontoIngresoOtrasOcup1() {
        return campoMontoIngresoOtrasOcup1;
    }

    public void setCampoMontoIngresoOtrasOcup1(TextField component) {
        this.campoMontoIngresoOtrasOcup1 = component;
    }

    private TextField campoMontoIngresoOtrasOcup1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoMontoIngresoOtrasOcup1x1() {
        return campoMontoIngresoOtrasOcup1x1;
    }

    public void setCampoMontoIngresoOtrasOcup1x1(TextField component) {
        this.campoMontoIngresoOtrasOcup1x1 = component;
    }

    private HelpInline helpInlineMontoIngresoOtrasOcup1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoOtrasOcup1() {
        return helpInlineMontoIngresoOtrasOcup1;
    }

    public void setHelpInlineMontoIngresoOtrasOcup1(HelpInline hi) {
        this.helpInlineMontoIngresoOtrasOcup1 = hi;
    }

    private HelpInline helpInlineMontoIngresoOtrasOcup1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoOtrasOcup1x1() {
        return helpInlineMontoIngresoOtrasOcup1x1;
    }

    public void setHelpInlineMontoIngresoOtrasOcup1x1(HelpInline hi) {
        this.helpInlineMontoIngresoOtrasOcup1x1 = hi;
    }

    private StaticText campoMontoIngresoOtrasOcup1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoOtrasOcup1Texto1() {
        return campoMontoIngresoOtrasOcup1Texto1;
    }

    public void setCampoMontoIngresoOtrasOcup1Texto1(StaticText component) {
        this.campoMontoIngresoOtrasOcup1Texto1 = component;
    }

    private StaticText campoMontoIngresoOtrasOcup1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoOtrasOcup1x1Texto1() {
        return campoMontoIngresoOtrasOcup1x1Texto1;
    }

    public void setCampoMontoIngresoOtrasOcup1x1Texto1(StaticText component) {
        this.campoMontoIngresoOtrasOcup1x1Texto1 = component;
    }

    private NumberConverter converterMontoIngresoOtrasOcup1 = new NumberConverter();
  
    public NumberConverter getConverterMontoIngresoOtrasOcup1() {
        return converterMontoIngresoOtrasOcup1;
    }
  
    public void setConverterMontoIngresoOtrasOcup1(NumberConverter converter) {
        this.converterMontoIngresoOtrasOcup1 = converter;
    }
  
    private DoubleRangeValidator validatorMontoIngresoOtrasOcup1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorMontoIngresoOtrasOcup1() {
        return validatorMontoIngresoOtrasOcup1;
    }
  
    public void setValidatorMontoIngresoOtrasOcup1(DoubleRangeValidator validator) {
        this.validatorMontoIngresoOtrasOcup1 = validator;
    }
  
    private Label labelMontoIngresoAlquileres1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoAlquileres1() {
        return labelMontoIngresoAlquileres1;
    }

    public void setLabelMontoIngresoAlquileres1(Label l) {
        this.labelMontoIngresoAlquileres1 = l;
    }

    private Label labelMontoIngresoAlquileres1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoAlquileres1x1() {
        return labelMontoIngresoAlquileres1x1;
    }

    public void setLabelMontoIngresoAlquileres1x1(Label l) {
        this.labelMontoIngresoAlquileres1x1 = l;
    }

    private TextField campoMontoIngresoAlquileres1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoMontoIngresoAlquileres1() {
        return campoMontoIngresoAlquileres1;
    }

    public void setCampoMontoIngresoAlquileres1(TextField component) {
        this.campoMontoIngresoAlquileres1 = component;
    }

    private TextField campoMontoIngresoAlquileres1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoMontoIngresoAlquileres1x1() {
        return campoMontoIngresoAlquileres1x1;
    }

    public void setCampoMontoIngresoAlquileres1x1(TextField component) {
        this.campoMontoIngresoAlquileres1x1 = component;
    }

    private HelpInline helpInlineMontoIngresoAlquileres1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoAlquileres1() {
        return helpInlineMontoIngresoAlquileres1;
    }

    public void setHelpInlineMontoIngresoAlquileres1(HelpInline hi) {
        this.helpInlineMontoIngresoAlquileres1 = hi;
    }

    private HelpInline helpInlineMontoIngresoAlquileres1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoAlquileres1x1() {
        return helpInlineMontoIngresoAlquileres1x1;
    }

    public void setHelpInlineMontoIngresoAlquileres1x1(HelpInline hi) {
        this.helpInlineMontoIngresoAlquileres1x1 = hi;
    }

    private StaticText campoMontoIngresoAlquileres1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoAlquileres1Texto1() {
        return campoMontoIngresoAlquileres1Texto1;
    }

    public void setCampoMontoIngresoAlquileres1Texto1(StaticText component) {
        this.campoMontoIngresoAlquileres1Texto1 = component;
    }

    private StaticText campoMontoIngresoAlquileres1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoAlquileres1x1Texto1() {
        return campoMontoIngresoAlquileres1x1Texto1;
    }

    public void setCampoMontoIngresoAlquileres1x1Texto1(StaticText component) {
        this.campoMontoIngresoAlquileres1x1Texto1 = component;
    }

    private NumberConverter converterMontoIngresoAlquileres1 = new NumberConverter();
  
    public NumberConverter getConverterMontoIngresoAlquileres1() {
        return converterMontoIngresoAlquileres1;
    }
  
    public void setConverterMontoIngresoAlquileres1(NumberConverter converter) {
        this.converterMontoIngresoAlquileres1 = converter;
    }
  
    private DoubleRangeValidator validatorMontoIngresoAlquileres1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorMontoIngresoAlquileres1() {
        return validatorMontoIngresoAlquileres1;
    }
  
    public void setValidatorMontoIngresoAlquileres1(DoubleRangeValidator validator) {
        this.validatorMontoIngresoAlquileres1 = validator;
    }
  
    private Label labelMontoIngresoIntereses1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoIntereses1() {
        return labelMontoIngresoIntereses1;
    }

    public void setLabelMontoIngresoIntereses1(Label l) {
        this.labelMontoIngresoIntereses1 = l;
    }

    private Label labelMontoIngresoIntereses1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoIntereses1x1() {
        return labelMontoIngresoIntereses1x1;
    }

    public void setLabelMontoIngresoIntereses1x1(Label l) {
        this.labelMontoIngresoIntereses1x1 = l;
    }

    private TextField campoMontoIngresoIntereses1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoMontoIngresoIntereses1() {
        return campoMontoIngresoIntereses1;
    }

    public void setCampoMontoIngresoIntereses1(TextField component) {
        this.campoMontoIngresoIntereses1 = component;
    }

    private TextField campoMontoIngresoIntereses1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoMontoIngresoIntereses1x1() {
        return campoMontoIngresoIntereses1x1;
    }

    public void setCampoMontoIngresoIntereses1x1(TextField component) {
        this.campoMontoIngresoIntereses1x1 = component;
    }

    private HelpInline helpInlineMontoIngresoIntereses1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoIntereses1() {
        return helpInlineMontoIngresoIntereses1;
    }

    public void setHelpInlineMontoIngresoIntereses1(HelpInline hi) {
        this.helpInlineMontoIngresoIntereses1 = hi;
    }

    private HelpInline helpInlineMontoIngresoIntereses1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoIntereses1x1() {
        return helpInlineMontoIngresoIntereses1x1;
    }

    public void setHelpInlineMontoIngresoIntereses1x1(HelpInline hi) {
        this.helpInlineMontoIngresoIntereses1x1 = hi;
    }

    private StaticText campoMontoIngresoIntereses1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoIntereses1Texto1() {
        return campoMontoIngresoIntereses1Texto1;
    }

    public void setCampoMontoIngresoIntereses1Texto1(StaticText component) {
        this.campoMontoIngresoIntereses1Texto1 = component;
    }

    private StaticText campoMontoIngresoIntereses1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoIntereses1x1Texto1() {
        return campoMontoIngresoIntereses1x1Texto1;
    }

    public void setCampoMontoIngresoIntereses1x1Texto1(StaticText component) {
        this.campoMontoIngresoIntereses1x1Texto1 = component;
    }

    private NumberConverter converterMontoIngresoIntereses1 = new NumberConverter();
  
    public NumberConverter getConverterMontoIngresoIntereses1() {
        return converterMontoIngresoIntereses1;
    }
  
    public void setConverterMontoIngresoIntereses1(NumberConverter converter) {
        this.converterMontoIngresoIntereses1 = converter;
    }
  
    private DoubleRangeValidator validatorMontoIngresoIntereses1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorMontoIngresoIntereses1() {
        return validatorMontoIngresoIntereses1;
    }
  
    public void setValidatorMontoIngresoIntereses1(DoubleRangeValidator validator) {
        this.validatorMontoIngresoIntereses1 = validator;
    }
  
    private Label labelMontoIngresoAyudaFamPais1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoAyudaFamPais1() {
        return labelMontoIngresoAyudaFamPais1;
    }

    public void setLabelMontoIngresoAyudaFamPais1(Label l) {
        this.labelMontoIngresoAyudaFamPais1 = l;
    }

    private Label labelMontoIngresoAyudaFamPais1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoAyudaFamPais1x1() {
        return labelMontoIngresoAyudaFamPais1x1;
    }

    public void setLabelMontoIngresoAyudaFamPais1x1(Label l) {
        this.labelMontoIngresoAyudaFamPais1x1 = l;
    }

    private TextField campoMontoIngresoAyudaFamPais1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoMontoIngresoAyudaFamPais1() {
        return campoMontoIngresoAyudaFamPais1;
    }

    public void setCampoMontoIngresoAyudaFamPais1(TextField component) {
        this.campoMontoIngresoAyudaFamPais1 = component;
    }

    private TextField campoMontoIngresoAyudaFamPais1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoMontoIngresoAyudaFamPais1x1() {
        return campoMontoIngresoAyudaFamPais1x1;
    }

    public void setCampoMontoIngresoAyudaFamPais1x1(TextField component) {
        this.campoMontoIngresoAyudaFamPais1x1 = component;
    }

    private HelpInline helpInlineMontoIngresoAyudaFamPais1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoAyudaFamPais1() {
        return helpInlineMontoIngresoAyudaFamPais1;
    }

    public void setHelpInlineMontoIngresoAyudaFamPais1(HelpInline hi) {
        this.helpInlineMontoIngresoAyudaFamPais1 = hi;
    }

    private HelpInline helpInlineMontoIngresoAyudaFamPais1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoAyudaFamPais1x1() {
        return helpInlineMontoIngresoAyudaFamPais1x1;
    }

    public void setHelpInlineMontoIngresoAyudaFamPais1x1(HelpInline hi) {
        this.helpInlineMontoIngresoAyudaFamPais1x1 = hi;
    }

    private StaticText campoMontoIngresoAyudaFamPais1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoAyudaFamPais1Texto1() {
        return campoMontoIngresoAyudaFamPais1Texto1;
    }

    public void setCampoMontoIngresoAyudaFamPais1Texto1(StaticText component) {
        this.campoMontoIngresoAyudaFamPais1Texto1 = component;
    }

    private StaticText campoMontoIngresoAyudaFamPais1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoAyudaFamPais1x1Texto1() {
        return campoMontoIngresoAyudaFamPais1x1Texto1;
    }

    public void setCampoMontoIngresoAyudaFamPais1x1Texto1(StaticText component) {
        this.campoMontoIngresoAyudaFamPais1x1Texto1 = component;
    }

    private NumberConverter converterMontoIngresoAyudaFamPais1 = new NumberConverter();
  
    public NumberConverter getConverterMontoIngresoAyudaFamPais1() {
        return converterMontoIngresoAyudaFamPais1;
    }
  
    public void setConverterMontoIngresoAyudaFamPais1(NumberConverter converter) {
        this.converterMontoIngresoAyudaFamPais1 = converter;
    }
  
    private DoubleRangeValidator validatorMontoIngresoAyudaFamPais1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorMontoIngresoAyudaFamPais1() {
        return validatorMontoIngresoAyudaFamPais1;
    }
  
    public void setValidatorMontoIngresoAyudaFamPais1(DoubleRangeValidator validator) {
        this.validatorMontoIngresoAyudaFamPais1 = validator;
    }
  
    private Label labelMontoIngresoAyudaFamExter1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoAyudaFamExter1() {
        return labelMontoIngresoAyudaFamExter1;
    }

    public void setLabelMontoIngresoAyudaFamExter1(Label l) {
        this.labelMontoIngresoAyudaFamExter1 = l;
    }

    private Label labelMontoIngresoAyudaFamExter1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoAyudaFamExter1x1() {
        return labelMontoIngresoAyudaFamExter1x1;
    }

    public void setLabelMontoIngresoAyudaFamExter1x1(Label l) {
        this.labelMontoIngresoAyudaFamExter1x1 = l;
    }

    private TextField campoMontoIngresoAyudaFamExter1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoMontoIngresoAyudaFamExter1() {
        return campoMontoIngresoAyudaFamExter1;
    }

    public void setCampoMontoIngresoAyudaFamExter1(TextField component) {
        this.campoMontoIngresoAyudaFamExter1 = component;
    }

    private TextField campoMontoIngresoAyudaFamExter1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoMontoIngresoAyudaFamExter1x1() {
        return campoMontoIngresoAyudaFamExter1x1;
    }

    public void setCampoMontoIngresoAyudaFamExter1x1(TextField component) {
        this.campoMontoIngresoAyudaFamExter1x1 = component;
    }

    private HelpInline helpInlineMontoIngresoAyudaFamExter1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoAyudaFamExter1() {
        return helpInlineMontoIngresoAyudaFamExter1;
    }

    public void setHelpInlineMontoIngresoAyudaFamExter1(HelpInline hi) {
        this.helpInlineMontoIngresoAyudaFamExter1 = hi;
    }

    private HelpInline helpInlineMontoIngresoAyudaFamExter1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoAyudaFamExter1x1() {
        return helpInlineMontoIngresoAyudaFamExter1x1;
    }

    public void setHelpInlineMontoIngresoAyudaFamExter1x1(HelpInline hi) {
        this.helpInlineMontoIngresoAyudaFamExter1x1 = hi;
    }

    private StaticText campoMontoIngresoAyudaFamExter1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoAyudaFamExter1Texto1() {
        return campoMontoIngresoAyudaFamExter1Texto1;
    }

    public void setCampoMontoIngresoAyudaFamExter1Texto1(StaticText component) {
        this.campoMontoIngresoAyudaFamExter1Texto1 = component;
    }

    private StaticText campoMontoIngresoAyudaFamExter1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoAyudaFamExter1x1Texto1() {
        return campoMontoIngresoAyudaFamExter1x1Texto1;
    }

    public void setCampoMontoIngresoAyudaFamExter1x1Texto1(StaticText component) {
        this.campoMontoIngresoAyudaFamExter1x1Texto1 = component;
    }

    private NumberConverter converterMontoIngresoAyudaFamExter1 = new NumberConverter();
  
    public NumberConverter getConverterMontoIngresoAyudaFamExter1() {
        return converterMontoIngresoAyudaFamExter1;
    }
  
    public void setConverterMontoIngresoAyudaFamExter1(NumberConverter converter) {
        this.converterMontoIngresoAyudaFamExter1 = converter;
    }
  
    private DoubleRangeValidator validatorMontoIngresoAyudaFamExter1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorMontoIngresoAyudaFamExter1() {
        return validatorMontoIngresoAyudaFamExter1;
    }
  
    public void setValidatorMontoIngresoAyudaFamExter1(DoubleRangeValidator validator) {
        this.validatorMontoIngresoAyudaFamExter1 = validator;
    }
  
    private Label labelMontoIngresoJubilacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoJubilacion1() {
        return labelMontoIngresoJubilacion1;
    }

    public void setLabelMontoIngresoJubilacion1(Label l) {
        this.labelMontoIngresoJubilacion1 = l;
    }

    private Label labelMontoIngresoJubilacion1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoJubilacion1x1() {
        return labelMontoIngresoJubilacion1x1;
    }

    public void setLabelMontoIngresoJubilacion1x1(Label l) {
        this.labelMontoIngresoJubilacion1x1 = l;
    }

    private TextField campoMontoIngresoJubilacion1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoMontoIngresoJubilacion1() {
        return campoMontoIngresoJubilacion1;
    }

    public void setCampoMontoIngresoJubilacion1(TextField component) {
        this.campoMontoIngresoJubilacion1 = component;
    }

    private TextField campoMontoIngresoJubilacion1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoMontoIngresoJubilacion1x1() {
        return campoMontoIngresoJubilacion1x1;
    }

    public void setCampoMontoIngresoJubilacion1x1(TextField component) {
        this.campoMontoIngresoJubilacion1x1 = component;
    }

    private HelpInline helpInlineMontoIngresoJubilacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoJubilacion1() {
        return helpInlineMontoIngresoJubilacion1;
    }

    public void setHelpInlineMontoIngresoJubilacion1(HelpInline hi) {
        this.helpInlineMontoIngresoJubilacion1 = hi;
    }

    private HelpInline helpInlineMontoIngresoJubilacion1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoJubilacion1x1() {
        return helpInlineMontoIngresoJubilacion1x1;
    }

    public void setHelpInlineMontoIngresoJubilacion1x1(HelpInline hi) {
        this.helpInlineMontoIngresoJubilacion1x1 = hi;
    }

    private StaticText campoMontoIngresoJubilacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoJubilacion1Texto1() {
        return campoMontoIngresoJubilacion1Texto1;
    }

    public void setCampoMontoIngresoJubilacion1Texto1(StaticText component) {
        this.campoMontoIngresoJubilacion1Texto1 = component;
    }

    private StaticText campoMontoIngresoJubilacion1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoJubilacion1x1Texto1() {
        return campoMontoIngresoJubilacion1x1Texto1;
    }

    public void setCampoMontoIngresoJubilacion1x1Texto1(StaticText component) {
        this.campoMontoIngresoJubilacion1x1Texto1 = component;
    }

    private NumberConverter converterMontoIngresoJubilacion1 = new NumberConverter();
  
    public NumberConverter getConverterMontoIngresoJubilacion1() {
        return converterMontoIngresoJubilacion1;
    }
  
    public void setConverterMontoIngresoJubilacion1(NumberConverter converter) {
        this.converterMontoIngresoJubilacion1 = converter;
    }
  
    private DoubleRangeValidator validatorMontoIngresoJubilacion1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorMontoIngresoJubilacion1() {
        return validatorMontoIngresoJubilacion1;
    }
  
    public void setValidatorMontoIngresoJubilacion1(DoubleRangeValidator validator) {
        this.validatorMontoIngresoJubilacion1 = validator;
    }
  
    private Label labelMontoIngresoPensiones1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoPensiones1() {
        return labelMontoIngresoPensiones1;
    }

    public void setLabelMontoIngresoPensiones1(Label l) {
        this.labelMontoIngresoPensiones1 = l;
    }

    private Label labelMontoIngresoPensiones1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoPensiones1x1() {
        return labelMontoIngresoPensiones1x1;
    }

    public void setLabelMontoIngresoPensiones1x1(Label l) {
        this.labelMontoIngresoPensiones1x1 = l;
    }

    private TextField campoMontoIngresoPensiones1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoMontoIngresoPensiones1() {
        return campoMontoIngresoPensiones1;
    }

    public void setCampoMontoIngresoPensiones1(TextField component) {
        this.campoMontoIngresoPensiones1 = component;
    }

    private TextField campoMontoIngresoPensiones1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoMontoIngresoPensiones1x1() {
        return campoMontoIngresoPensiones1x1;
    }

    public void setCampoMontoIngresoPensiones1x1(TextField component) {
        this.campoMontoIngresoPensiones1x1 = component;
    }

    private HelpInline helpInlineMontoIngresoPensiones1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoPensiones1() {
        return helpInlineMontoIngresoPensiones1;
    }

    public void setHelpInlineMontoIngresoPensiones1(HelpInline hi) {
        this.helpInlineMontoIngresoPensiones1 = hi;
    }

    private HelpInline helpInlineMontoIngresoPensiones1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoPensiones1x1() {
        return helpInlineMontoIngresoPensiones1x1;
    }

    public void setHelpInlineMontoIngresoPensiones1x1(HelpInline hi) {
        this.helpInlineMontoIngresoPensiones1x1 = hi;
    }

    private StaticText campoMontoIngresoPensiones1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoPensiones1Texto1() {
        return campoMontoIngresoPensiones1Texto1;
    }

    public void setCampoMontoIngresoPensiones1Texto1(StaticText component) {
        this.campoMontoIngresoPensiones1Texto1 = component;
    }

    private StaticText campoMontoIngresoPensiones1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoPensiones1x1Texto1() {
        return campoMontoIngresoPensiones1x1Texto1;
    }

    public void setCampoMontoIngresoPensiones1x1Texto1(StaticText component) {
        this.campoMontoIngresoPensiones1x1Texto1 = component;
    }

    private NumberConverter converterMontoIngresoPensiones1 = new NumberConverter();
  
    public NumberConverter getConverterMontoIngresoPensiones1() {
        return converterMontoIngresoPensiones1;
    }
  
    public void setConverterMontoIngresoPensiones1(NumberConverter converter) {
        this.converterMontoIngresoPensiones1 = converter;
    }
  
    private DoubleRangeValidator validatorMontoIngresoPensiones1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorMontoIngresoPensiones1() {
        return validatorMontoIngresoPensiones1;
    }
  
    public void setValidatorMontoIngresoPensiones1(DoubleRangeValidator validator) {
        this.validatorMontoIngresoPensiones1 = validator;
    }
  
    private Label labelMontoIngresoTekopora1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoTekopora1() {
        return labelMontoIngresoTekopora1;
    }

    public void setLabelMontoIngresoTekopora1(Label l) {
        this.labelMontoIngresoTekopora1 = l;
    }

    private Label labelMontoIngresoTekopora1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoTekopora1x1() {
        return labelMontoIngresoTekopora1x1;
    }

    public void setLabelMontoIngresoTekopora1x1(Label l) {
        this.labelMontoIngresoTekopora1x1 = l;
    }

    private TextField campoMontoIngresoTekopora1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoMontoIngresoTekopora1() {
        return campoMontoIngresoTekopora1;
    }

    public void setCampoMontoIngresoTekopora1(TextField component) {
        this.campoMontoIngresoTekopora1 = component;
    }

    private TextField campoMontoIngresoTekopora1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoMontoIngresoTekopora1x1() {
        return campoMontoIngresoTekopora1x1;
    }

    public void setCampoMontoIngresoTekopora1x1(TextField component) {
        this.campoMontoIngresoTekopora1x1 = component;
    }

    private HelpInline helpInlineMontoIngresoTekopora1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoTekopora1() {
        return helpInlineMontoIngresoTekopora1;
    }

    public void setHelpInlineMontoIngresoTekopora1(HelpInline hi) {
        this.helpInlineMontoIngresoTekopora1 = hi;
    }

    private HelpInline helpInlineMontoIngresoTekopora1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoTekopora1x1() {
        return helpInlineMontoIngresoTekopora1x1;
    }

    public void setHelpInlineMontoIngresoTekopora1x1(HelpInline hi) {
        this.helpInlineMontoIngresoTekopora1x1 = hi;
    }

    private StaticText campoMontoIngresoTekopora1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoTekopora1Texto1() {
        return campoMontoIngresoTekopora1Texto1;
    }

    public void setCampoMontoIngresoTekopora1Texto1(StaticText component) {
        this.campoMontoIngresoTekopora1Texto1 = component;
    }

    private StaticText campoMontoIngresoTekopora1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoTekopora1x1Texto1() {
        return campoMontoIngresoTekopora1x1Texto1;
    }

    public void setCampoMontoIngresoTekopora1x1Texto1(StaticText component) {
        this.campoMontoIngresoTekopora1x1Texto1 = component;
    }

    private NumberConverter converterMontoIngresoTekopora1 = new NumberConverter();
  
    public NumberConverter getConverterMontoIngresoTekopora1() {
        return converterMontoIngresoTekopora1;
    }
  
    public void setConverterMontoIngresoTekopora1(NumberConverter converter) {
        this.converterMontoIngresoTekopora1 = converter;
    }
  
    private DoubleRangeValidator validatorMontoIngresoTekopora1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorMontoIngresoTekopora1() {
        return validatorMontoIngresoTekopora1;
    }
  
    public void setValidatorMontoIngresoTekopora1(DoubleRangeValidator validator) {
        this.validatorMontoIngresoTekopora1 = validator;
    }
  
    private Label labelMontoIngresoProgramas1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoProgramas1() {
        return labelMontoIngresoProgramas1;
    }

    public void setLabelMontoIngresoProgramas1(Label l) {
        this.labelMontoIngresoProgramas1 = l;
    }

    private Label labelMontoIngresoProgramas1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoProgramas1x1() {
        return labelMontoIngresoProgramas1x1;
    }

    public void setLabelMontoIngresoProgramas1x1(Label l) {
        this.labelMontoIngresoProgramas1x1 = l;
    }

    private TextField campoMontoIngresoProgramas1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoMontoIngresoProgramas1() {
        return campoMontoIngresoProgramas1;
    }

    public void setCampoMontoIngresoProgramas1(TextField component) {
        this.campoMontoIngresoProgramas1 = component;
    }

    private TextField campoMontoIngresoProgramas1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoMontoIngresoProgramas1x1() {
        return campoMontoIngresoProgramas1x1;
    }

    public void setCampoMontoIngresoProgramas1x1(TextField component) {
        this.campoMontoIngresoProgramas1x1 = component;
    }

    private HelpInline helpInlineMontoIngresoProgramas1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoProgramas1() {
        return helpInlineMontoIngresoProgramas1;
    }

    public void setHelpInlineMontoIngresoProgramas1(HelpInline hi) {
        this.helpInlineMontoIngresoProgramas1 = hi;
    }

    private HelpInline helpInlineMontoIngresoProgramas1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoProgramas1x1() {
        return helpInlineMontoIngresoProgramas1x1;
    }

    public void setHelpInlineMontoIngresoProgramas1x1(HelpInline hi) {
        this.helpInlineMontoIngresoProgramas1x1 = hi;
    }

    private StaticText campoMontoIngresoProgramas1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoProgramas1Texto1() {
        return campoMontoIngresoProgramas1Texto1;
    }

    public void setCampoMontoIngresoProgramas1Texto1(StaticText component) {
        this.campoMontoIngresoProgramas1Texto1 = component;
    }

    private StaticText campoMontoIngresoProgramas1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoProgramas1x1Texto1() {
        return campoMontoIngresoProgramas1x1Texto1;
    }

    public void setCampoMontoIngresoProgramas1x1Texto1(StaticText component) {
        this.campoMontoIngresoProgramas1x1Texto1 = component;
    }

    private NumberConverter converterMontoIngresoProgramas1 = new NumberConverter();
  
    public NumberConverter getConverterMontoIngresoProgramas1() {
        return converterMontoIngresoProgramas1;
    }
  
    public void setConverterMontoIngresoProgramas1(NumberConverter converter) {
        this.converterMontoIngresoProgramas1 = converter;
    }
  
    private DoubleRangeValidator validatorMontoIngresoProgramas1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorMontoIngresoProgramas1() {
        return validatorMontoIngresoProgramas1;
    }
  
    public void setValidatorMontoIngresoProgramas1(DoubleRangeValidator validator) {
        this.validatorMontoIngresoProgramas1 = validator;
    }
  
    private Label labelMontoIngresoAdicional1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoAdicional1() {
        return labelMontoIngresoAdicional1;
    }

    public void setLabelMontoIngresoAdicional1(Label l) {
        this.labelMontoIngresoAdicional1 = l;
    }

    private Label labelMontoIngresoAdicional1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelMontoIngresoAdicional1x1() {
        return labelMontoIngresoAdicional1x1;
    }

    public void setLabelMontoIngresoAdicional1x1(Label l) {
        this.labelMontoIngresoAdicional1x1 = l;
    }

    private TextField campoMontoIngresoAdicional1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoMontoIngresoAdicional1() {
        return campoMontoIngresoAdicional1;
    }

    public void setCampoMontoIngresoAdicional1(TextField component) {
        this.campoMontoIngresoAdicional1 = component;
    }

    private TextField campoMontoIngresoAdicional1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoMontoIngresoAdicional1x1() {
        return campoMontoIngresoAdicional1x1;
    }

    public void setCampoMontoIngresoAdicional1x1(TextField component) {
        this.campoMontoIngresoAdicional1x1 = component;
    }

    private HelpInline helpInlineMontoIngresoAdicional1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoAdicional1() {
        return helpInlineMontoIngresoAdicional1;
    }

    public void setHelpInlineMontoIngresoAdicional1(HelpInline hi) {
        this.helpInlineMontoIngresoAdicional1 = hi;
    }

    private HelpInline helpInlineMontoIngresoAdicional1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineMontoIngresoAdicional1x1() {
        return helpInlineMontoIngresoAdicional1x1;
    }

    public void setHelpInlineMontoIngresoAdicional1x1(HelpInline hi) {
        this.helpInlineMontoIngresoAdicional1x1 = hi;
    }

    private StaticText campoMontoIngresoAdicional1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoAdicional1Texto1() {
        return campoMontoIngresoAdicional1Texto1;
    }

    public void setCampoMontoIngresoAdicional1Texto1(StaticText component) {
        this.campoMontoIngresoAdicional1Texto1 = component;
    }

    private StaticText campoMontoIngresoAdicional1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoMontoIngresoAdicional1x1Texto1() {
        return campoMontoIngresoAdicional1x1Texto1;
    }

    public void setCampoMontoIngresoAdicional1x1Texto1(StaticText component) {
        this.campoMontoIngresoAdicional1x1Texto1 = component;
    }

    private NumberConverter converterMontoIngresoAdicional1 = new NumberConverter();
  
    public NumberConverter getConverterMontoIngresoAdicional1() {
        return converterMontoIngresoAdicional1;
    }
  
    public void setConverterMontoIngresoAdicional1(NumberConverter converter) {
        this.converterMontoIngresoAdicional1 = converter;
    }
  
    private DoubleRangeValidator validatorMontoIngresoAdicional1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorMontoIngresoAdicional1() {
        return validatorMontoIngresoAdicional1;
    }
  
    public void setValidatorMontoIngresoAdicional1(DoubleRangeValidator validator) {
        this.validatorMontoIngresoAdicional1 = validator;
    }
  
    private Label labelTotalIngresoMensual1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelTotalIngresoMensual1() {
        return labelTotalIngresoMensual1;
    }

    public void setLabelTotalIngresoMensual1(Label l) {
        this.labelTotalIngresoMensual1 = l;
    }

    private Label labelTotalIngresoMensual1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelTotalIngresoMensual1x1() {
        return labelTotalIngresoMensual1x1;
    }

    public void setLabelTotalIngresoMensual1x1(Label l) {
        this.labelTotalIngresoMensual1x1 = l;
    }

    private TextField campoTotalIngresoMensual1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoTotalIngresoMensual1() {
        return campoTotalIngresoMensual1;
    }

    public void setCampoTotalIngresoMensual1(TextField component) {
        this.campoTotalIngresoMensual1 = component;
    }

    private TextField campoTotalIngresoMensual1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoTotalIngresoMensual1x1() {
        return campoTotalIngresoMensual1x1;
    }

    public void setCampoTotalIngresoMensual1x1(TextField component) {
        this.campoTotalIngresoMensual1x1 = component;
    }

    private HelpInline helpInlineTotalIngresoMensual1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineTotalIngresoMensual1() {
        return helpInlineTotalIngresoMensual1;
    }

    public void setHelpInlineTotalIngresoMensual1(HelpInline hi) {
        this.helpInlineTotalIngresoMensual1 = hi;
    }

    private HelpInline helpInlineTotalIngresoMensual1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineTotalIngresoMensual1x1() {
        return helpInlineTotalIngresoMensual1x1;
    }

    public void setHelpInlineTotalIngresoMensual1x1(HelpInline hi) {
        this.helpInlineTotalIngresoMensual1x1 = hi;
    }

    private StaticText campoTotalIngresoMensual1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoTotalIngresoMensual1Texto1() {
        return campoTotalIngresoMensual1Texto1;
    }

    public void setCampoTotalIngresoMensual1Texto1(StaticText component) {
        this.campoTotalIngresoMensual1Texto1 = component;
    }

    private StaticText campoTotalIngresoMensual1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoTotalIngresoMensual1x1Texto1() {
        return campoTotalIngresoMensual1x1Texto1;
    }

    public void setCampoTotalIngresoMensual1x1Texto1(StaticText component) {
        this.campoTotalIngresoMensual1x1Texto1 = component;
    }

    private NumberConverter converterTotalIngresoMensual1 = new NumberConverter();
  
    public NumberConverter getConverterTotalIngresoMensual1() {
        return converterTotalIngresoMensual1;
    }
  
    public void setConverterTotalIngresoMensual1(NumberConverter converter) {
        this.converterTotalIngresoMensual1 = converter;
    }
  
    private DoubleRangeValidator validatorTotalIngresoMensual1 = new DoubleRangeValidator();
  
    public DoubleRangeValidator getValidatorTotalIngresoMensual1() {
        return validatorTotalIngresoMensual1;
    }
  
    public void setValidatorTotalIngresoMensual1(DoubleRangeValidator validator) {
        this.validatorTotalIngresoMensual1 = validator;
    }
  
    private Label labelIdPotencialBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPotencialBen1() {
        return labelIdPotencialBen1;
    }

    public void setLabelIdPotencialBen1(Label l) {
        this.labelIdPotencialBen1 = l;
    }

    private Label labelIdPotencialBen1x1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPotencialBen1x1() {
        return labelIdPotencialBen1x1;
    }

    public void setLabelIdPotencialBen1x1(Label l) {
        this.labelIdPotencialBen1x1 = l;
    }

    private TextField campoIdPotencialBen1 = new com.egt.core.jsf.component.CampoTexto();

    @Override
    public TextField getCampoIdPotencialBen1() {
        return campoIdPotencialBen1;
    }

    public void setCampoIdPotencialBen1(TextField component) {
        this.campoIdPotencialBen1 = component;
    }

    private TextField campoIdPotencialBen1x1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdPotencialBen1x1() {
        return campoIdPotencialBen1x1;
    }

    public void setCampoIdPotencialBen1x1(TextField component) {
        this.campoIdPotencialBen1x1 = component;
    }

    private HelpInline helpInlineIdPotencialBen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdPotencialBen1() {
        return helpInlineIdPotencialBen1;
    }

    public void setHelpInlineIdPotencialBen1(HelpInline hi) {
        this.helpInlineIdPotencialBen1 = hi;
    }

    private HelpInline helpInlineIdPotencialBen1x1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdPotencialBen1x1() {
        return helpInlineIdPotencialBen1x1;
    }

    public void setHelpInlineIdPotencialBen1x1(HelpInline hi) {
        this.helpInlineIdPotencialBen1x1 = hi;
    }

    private StaticText campoIdPotencialBen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdPotencialBen1Texto1() {
        return campoIdPotencialBen1Texto1;
    }

    public void setCampoIdPotencialBen1Texto1(StaticText component) {
        this.campoIdPotencialBen1Texto1 = component;
    }

    private StaticText campoIdPotencialBen1x1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdPotencialBen1x1Texto1() {
        return campoIdPotencialBen1x1Texto1;
    }

    public void setCampoIdPotencialBen1x1Texto1(StaticText component) {
        this.campoIdPotencialBen1x1Texto1 = component;
    }

    private Button campoIdPotencialBen1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdPotencialBen1Boton1() {
        return campoIdPotencialBen1Boton1;
    }

    public void setCampoIdPotencialBen1Boton1(Button component) {
        this.campoIdPotencialBen1Boton1 = component;
    }

    private Button campoIdPotencialBen1x1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdPotencialBen1x1Boton1() {
        return campoIdPotencialBen1x1Boton1;
    }

    public void setCampoIdPotencialBen1x1Boton1(Button component) {
        this.campoIdPotencialBen1x1Boton1 = component;
    }

    private Button campoIdPotencialBen1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPotencialBen1Boton3() {
        return campoIdPotencialBen1Boton3;
    }

    public void setCampoIdPotencialBen1Boton3(Button component) {
        this.campoIdPotencialBen1Boton3 = component;
    }

    private Button campoIdPotencialBen1x1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPotencialBen1x1Boton3() {
        return campoIdPotencialBen1x1Boton3;
    }

    public void setCampoIdPotencialBen1x1Boton3(Button component) {
        this.campoIdPotencialBen1x1Boton3 = component;
    }

    private Label labelIdPotencialBen2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPotencialBen2() {
        return labelIdPotencialBen2;
    }

    public void setLabelIdPotencialBen2(Label l) {
        this.labelIdPotencialBen2 = l;
    }

    private Label labelIdPotencialBen1x2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPotencialBen1x2() {
        return labelIdPotencialBen1x2;
    }

    public void setLabelIdPotencialBen1x2(Label l) {
        this.labelIdPotencialBen1x2 = l;
    }

    private StaticText campoIdPotencialBen1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdPotencialBen1Texto2() {
        return campoIdPotencialBen1Texto2;
    }

    public void setCampoIdPotencialBen1Texto2(StaticText component) {
        this.campoIdPotencialBen1Texto2 = component;
    }

    private StaticText campoIdPotencialBen1x1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdPotencialBen1x1Texto2() {
        return campoIdPotencialBen1x1Texto2;
    }

    public void setCampoIdPotencialBen1x1Texto2(StaticText component) {
        this.campoIdPotencialBen1x1Texto2 = component;
    }

    private Button campoIdPotencialBen1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPotencialBen1Boton2() {
        return campoIdPotencialBen1Boton2;
    }

    public void setCampoIdPotencialBen1Boton2(Button component) {
        this.campoIdPotencialBen1Boton2 = component;
    }

    private Button campoIdPotencialBen1x1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPotencialBen1x1Boton2() {
        return campoIdPotencialBen1x1Boton2;
    }

    public void setCampoIdPotencialBen1x1Boton2(Button component) {
        this.campoIdPotencialBen1x1Boton2 = component;
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

    private FichaPersonaCachedRowSetDataProvider2 fichaPersonaDataProvider = new FichaPersonaCachedRowSetDataProvider2();

    @Override
    public FichaPersonaCachedRowSetDataProvider2 getFichaPersonaDataProvider() {
        return fichaPersonaDataProvider;
    }

    public void setFichaPersonaDataProvider(FichaPersonaCachedRowSetDataProvider2 crsdp) {
        this.fichaPersonaDataProvider = crsdp;
    }

    private FichaHogarCachedRowSetDataProvider2 fichaHogarReferenceDataProvider = new FichaHogarCachedRowSetDataProvider2();

    @Override
    public FichaHogarCachedRowSetDataProvider2 getFichaHogarReferenceDataProvider() {
        return fichaHogarReferenceDataProvider;
    }

    public void setFichaHogarReferenceDataProvider(FichaHogarCachedRowSetDataProvider2 crsdp) {
        this.fichaHogarReferenceDataProvider = crsdp;
    }

    private UbicacionCachedRowSetDataProvider2 ubicacionReferenceDataProvider = new UbicacionCachedRowSetDataProvider2();

    @Override
    public UbicacionCachedRowSetDataProvider2 getUbicacionReferenceDataProvider() {
        return ubicacionReferenceDataProvider;
    }

    public void setUbicacionReferenceDataProvider(UbicacionCachedRowSetDataProvider2 crsdp) {
        this.ubicacionReferenceDataProvider = crsdp;
    }

    private PotencialBenCachedRowSetDataProvider2 potencialBenReferenceDataProvider = new PotencialBenCachedRowSetDataProvider2();

    @Override
    public PotencialBenCachedRowSetDataProvider2 getPotencialBenReferenceDataProvider() {
        return potencialBenReferenceDataProvider;
    }

    public void setPotencialBenReferenceDataProvider(PotencialBenCachedRowSetDataProvider2 crsdp) {
        this.potencialBenReferenceDataProvider = crsdp;
    }

    // </editor-fold>
/**/
    public FichaPersona6() {
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
        fichaPersonaDataProvider.close();
        fichaHogarReferenceDataProvider.close();
        ubicacionReferenceDataProvider.close();
        potencialBenReferenceDataProvider.close();
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

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades tipo fecha de la interfaz PaginaActualizacionFichaPersona...">
    @Override
    public TextField getTextFieldCampoFechaNacimiento1() {
        return this.getCampoFechaNacimiento1();
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
    private AsistentePaginaActualizacionFichaPersona asistente = new AsistentePaginaActualizacionFichaPersona(this);

    public AsistentePaginaActualizacionFichaPersona getAsistente() {
        return this.asistente;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades y metodos estandar: preiniciar, iniciar, preprocesar, prepresentar, consultar, posconsultar, posrefrescar">
    private final static String ETIQUETA_MIGAS_PAN = BundleWebui.getString("detalle");

    private final static String ETIQUETA_CLASE_DETALLE = Bundle.getString("FichaPersona6_ETIQUETA_CLASE_DETALLE");

    private final static String ETIQUETA_CLASE_MAESTRO = Bundle.getString("FichaPersona6_ETIQUETA_CLASE_MAESTRO");

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getFichaPersonaDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return FichaPersonaCachedRowSetDataProvider2.FUNCION_CONSULTAR_FICHA_PERSONA;
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
        converterMontoIngresoOcupacionPrin1.setMinIntegerDigits(1);
        converterMontoIngresoOcupacionPrin1.setMaxIntegerDigits(14);
        converterMontoIngresoOcupacionPrin1.setMaxFractionDigits(2);
        converterMontoIngresoOcupacionSecun1.setMinIntegerDigits(1);
        converterMontoIngresoOcupacionSecun1.setMaxIntegerDigits(14);
        converterMontoIngresoOcupacionSecun1.setMaxFractionDigits(2);
        converterMontoIngresoOtrasOcup1.setMinIntegerDigits(1);
        converterMontoIngresoOtrasOcup1.setMaxIntegerDigits(14);
        converterMontoIngresoOtrasOcup1.setMaxFractionDigits(2);
        converterMontoIngresoAlquileres1.setMinIntegerDigits(1);
        converterMontoIngresoAlquileres1.setMaxIntegerDigits(14);
        converterMontoIngresoAlquileres1.setMaxFractionDigits(2);
        converterMontoIngresoIntereses1.setMinIntegerDigits(1);
        converterMontoIngresoIntereses1.setMaxIntegerDigits(14);
        converterMontoIngresoIntereses1.setMaxFractionDigits(2);
        converterMontoIngresoAyudaFamPais1.setMinIntegerDigits(1);
        converterMontoIngresoAyudaFamPais1.setMaxIntegerDigits(14);
        converterMontoIngresoAyudaFamPais1.setMaxFractionDigits(2);
        converterMontoIngresoAyudaFamExter1.setMinIntegerDigits(1);
        converterMontoIngresoAyudaFamExter1.setMaxIntegerDigits(14);
        converterMontoIngresoAyudaFamExter1.setMaxFractionDigits(2);
        converterMontoIngresoJubilacion1.setMinIntegerDigits(1);
        converterMontoIngresoJubilacion1.setMaxIntegerDigits(14);
        converterMontoIngresoJubilacion1.setMaxFractionDigits(2);
        converterMontoIngresoPensiones1.setMinIntegerDigits(1);
        converterMontoIngresoPensiones1.setMaxIntegerDigits(14);
        converterMontoIngresoPensiones1.setMaxFractionDigits(2);
        converterMontoIngresoTekopora1.setMinIntegerDigits(1);
        converterMontoIngresoTekopora1.setMaxIntegerDigits(14);
        converterMontoIngresoTekopora1.setMaxFractionDigits(2);
        converterMontoIngresoProgramas1.setMinIntegerDigits(1);
        converterMontoIngresoProgramas1.setMaxIntegerDigits(14);
        converterMontoIngresoProgramas1.setMaxFractionDigits(2);
        converterMontoIngresoAdicional1.setMinIntegerDigits(1);
        converterMontoIngresoAdicional1.setMaxIntegerDigits(14);
        converterMontoIngresoAdicional1.setMaxFractionDigits(2);
        converterTotalIngresoMensual1.setMinIntegerDigits(1);
        converterTotalIngresoMensual1.setMaxIntegerDigits(14);
        converterTotalIngresoMensual1.setMaxFractionDigits(2);
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
        String urx = URX2.COMANDO_FICHA_PERSONA;
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
        String urx = URX2.COMANDO_FICHA_PERSONA;
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
    public void campoIdFichaHogar1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdFichaHogar1_validate(context, component, value);
    }

    public void campoIdDepartamentoNacimiento1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdDepartamentoNacimiento1_validate(context, component, value);
    }

    public void campoIdDistritoNacimiento1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdDistritoNacimiento1_validate(context, component, value);
    }

    public void campoIdPotencialBen1_validate(FacesContext context, UIComponent component, Object value) {
        this.getAsistente().campoIdPotencialBen1_validate(context, component, value);
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
    FichaPersonaBusinessProcessLocal fichaPersonaBusinessProcess;

    @Override
    public Object getFichaPersonaBusinessProcess() {
        return fichaPersonaBusinessProcess;
    }

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @Override
    public Object getMessenger() {
        return messenger;
    }

    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
