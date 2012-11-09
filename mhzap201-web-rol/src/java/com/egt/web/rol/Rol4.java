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
package com.egt.web.rol;

import com.egt.base.enums.EnumOpcionBinaria;
import com.egt.base.entity.constants.RolConstants;
import com.egt.base.entity.constants.ConjuntoSegmentoConstants;
import com.egt.ejb.persistence.entity.Rol;
import com.egt.ejb.persistence.entity.ConjuntoSegmento;
import com.egt.ejb.persistence.facade.RolFacadeLocal;
import com.egt.ejb.persistence.facade.ConjuntoSegmentoFacadeLocal;
import com.egt.base.persistence.enums.EnumTipoQuery;
import com.egt.base.constants.CBM2;
import com.egt.base.constants.FGS;
import com.egt.base.constants.URX2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.base.util.BundleWebui;
import com.egt.commons.util.Bit;
import com.egt.commons.util.LongUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.TLC;
import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.GestorPaginaBasica;
import com.egt.core.aplicacion.web.PaginaBasicaConAccionMultiple;
import com.egt.core.db.xdp.RecursoCachedRowSet;
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
import java.util.List;
import javax.ejb.EJB;
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
import org.apache.commons.lang.StringUtils;
import com.egt.base.enums.EnumTipoDatoPar;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.core.control.Auditor;
import com.egt.ejb.business.jms.BusinessProcessMessengerLocal;
import com.egt.ejb.business.message.CopiarRolMessage;
import com.egt.ejb.business.message.ModificarConjuntoRolMessage;
import com.egt.ejb.business.message.PropagarFiltrosRolMessage;
import com.egt.ejb.business.message.PropagarFavoritosRolMessage;
import com.egt.ejb.business.process.RolBusinessProcessLocal;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;

public class Rol4 extends AbstractPageBean
        implements PaginaBasicaConAccionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorCodigoRol1.setMaximum(2000);
        validatorNombreRol1.setMaximum(2000);
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

    private Label etiquetaListaFuncionAccion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getEtiquetaListaFuncionAccion1() {
        return etiquetaListaFuncionAccion1;
    }

    public void setEtiquetaListaFuncionAccion1(Label l) {
        this.etiquetaListaFuncionAccion1 = l;
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
  
    private HelpInline helpInlineListaFuncionAccion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineListaFuncionAccion1() {
        return helpInlineListaFuncionAccion1;
    }

    public void setHelpInlineListaFuncionAccion1(HelpInline hi) {
        this.helpInlineListaFuncionAccion1 = hi;
    }

    private StaticText listaFuncionAccion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaFuncionAccion1Texto1() {
        return listaFuncionAccion1Texto1;
    }

    public void setListaFuncionAccion1Texto1(StaticText component) {
        this.listaFuncionAccion1Texto1 = component;
    }

    private Label labelIdRol1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdRol1() {
        return labelIdRol1;
    }

    public void setLabelIdRol1(Label l) {
        this.labelIdRol1 = l;
    }

    private TextField campoIdRol1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdRol1() {
        return campoIdRol1;
    }

    public void setCampoIdRol1(TextField component) {
        this.campoIdRol1 = component;
    }

    private HelpInline helpInlineIdRol1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdRol1() {
        return helpInlineIdRol1;
    }

    public void setHelpInlineIdRol1(HelpInline hi) {
        this.helpInlineIdRol1 = hi;
    }

    private StaticText campoIdRol1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdRol1Texto1() {
        return campoIdRol1Texto1;
    }

    public void setCampoIdRol1Texto1(StaticText component) {
        this.campoIdRol1Texto1 = component;
    }

    private Button campoIdRol1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdRol1Boton1() {
        return campoIdRol1Boton1;
    }

    public void setCampoIdRol1Boton1(Button component) {
        this.campoIdRol1Boton1 = component;
    }

    private Button campoIdRol1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdRol1Boton3() {
        return campoIdRol1Boton3;
    }

    public void setCampoIdRol1Boton3(Button component) {
        this.campoIdRol1Boton3 = component;
    }

    private Label labelIdRol2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdRol2() {
        return labelIdRol2;
    }

    public void setLabelIdRol2(Label l) {
        this.labelIdRol2 = l;
    }

    private StaticText campoIdRol1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdRol1Texto2() {
        return campoIdRol1Texto2;
    }

    public void setCampoIdRol1Texto2(StaticText component) {
        this.campoIdRol1Texto2 = component;
    }

    private Button campoIdRol1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdRol1Boton2() {
        return campoIdRol1Boton2;
    }

    public void setCampoIdRol1Boton2(Button component) {
        this.campoIdRol1Boton2 = component;
    }

    private Label labelCodigoRol1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelCodigoRol1() {
        return labelCodigoRol1;
    }

    public void setLabelCodigoRol1(Label l) {
        this.labelCodigoRol1 = l;
    }

    private TextField campoCodigoRol1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoCodigoRol1() {
        return campoCodigoRol1;
    }

    public void setCampoCodigoRol1(TextField component) {
        this.campoCodigoRol1 = component;
    }

    private HelpInline helpInlineCodigoRol1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineCodigoRol1() {
        return helpInlineCodigoRol1;
    }

    public void setHelpInlineCodigoRol1(HelpInline hi) {
        this.helpInlineCodigoRol1 = hi;
    }

    private StaticText campoCodigoRol1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoCodigoRol1Texto1() {
        return campoCodigoRol1Texto1;
    }

    public void setCampoCodigoRol1Texto1(StaticText component) {
        this.campoCodigoRol1Texto1 = component;
    }

    private LengthValidator validatorCodigoRol1 = new LengthValidator();
  
    public LengthValidator getValidatorCodigoRol1() {
        return validatorCodigoRol1;
    }
  
    public void setValidatorCodigoRol1(LengthValidator validator) {
        this.validatorCodigoRol1 = validator;
    }
  
    private Label labelNombreRol1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreRol1() {
        return labelNombreRol1;
    }

    public void setLabelNombreRol1(Label l) {
        this.labelNombreRol1 = l;
    }

    private TextField campoNombreRol1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoNombreRol1() {
        return campoNombreRol1;
    }

    public void setCampoNombreRol1(TextField component) {
        this.campoNombreRol1 = component;
    }

    private HelpInline helpInlineNombreRol1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreRol1() {
        return helpInlineNombreRol1;
    }

    public void setHelpInlineNombreRol1(HelpInline hi) {
        this.helpInlineNombreRol1 = hi;
    }

    private StaticText campoNombreRol1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreRol1Texto1() {
        return campoNombreRol1Texto1;
    }

    public void setCampoNombreRol1Texto1(StaticText component) {
        this.campoNombreRol1Texto1 = component;
    }

    private LengthValidator validatorNombreRol1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreRol1() {
        return validatorNombreRol1;
    }
  
    public void setValidatorNombreRol1(LengthValidator validator) {
        this.validatorNombreRol1 = validator;
    }
  
    private Label labelIdConjuntoSegmento1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdConjuntoSegmento1() {
        return labelIdConjuntoSegmento1;
    }

    public void setLabelIdConjuntoSegmento1(Label l) {
        this.labelIdConjuntoSegmento1 = l;
    }

    private TextField campoIdConjuntoSegmento1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdConjuntoSegmento1() {
        return campoIdConjuntoSegmento1;
    }

    public void setCampoIdConjuntoSegmento1(TextField component) {
        this.campoIdConjuntoSegmento1 = component;
    }

    private HelpInline helpInlineIdConjuntoSegmento1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdConjuntoSegmento1() {
        return helpInlineIdConjuntoSegmento1;
    }

    public void setHelpInlineIdConjuntoSegmento1(HelpInline hi) {
        this.helpInlineIdConjuntoSegmento1 = hi;
    }

    private StaticText campoIdConjuntoSegmento1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdConjuntoSegmento1Texto1() {
        return campoIdConjuntoSegmento1Texto1;
    }

    public void setCampoIdConjuntoSegmento1Texto1(StaticText component) {
        this.campoIdConjuntoSegmento1Texto1 = component;
    }

    private Button campoIdConjuntoSegmento1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdConjuntoSegmento1Boton1() {
        return campoIdConjuntoSegmento1Boton1;
    }

    public void setCampoIdConjuntoSegmento1Boton1(Button component) {
        this.campoIdConjuntoSegmento1Boton1 = component;
    }

    private Button campoIdConjuntoSegmento1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdConjuntoSegmento1Boton3() {
        return campoIdConjuntoSegmento1Boton3;
    }

    public void setCampoIdConjuntoSegmento1Boton3(Button component) {
        this.campoIdConjuntoSegmento1Boton3 = component;
    }

    private Label labelIdConjuntoSegmento2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdConjuntoSegmento2() {
        return labelIdConjuntoSegmento2;
    }

    public void setLabelIdConjuntoSegmento2(Label l) {
        this.labelIdConjuntoSegmento2 = l;
    }

    private StaticText campoIdConjuntoSegmento1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdConjuntoSegmento1Texto2() {
        return campoIdConjuntoSegmento1Texto2;
    }

    public void setCampoIdConjuntoSegmento1Texto2(StaticText component) {
        this.campoIdConjuntoSegmento1Texto2 = component;
    }

    private Button campoIdConjuntoSegmento1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdConjuntoSegmento1Boton2() {
        return campoIdConjuntoSegmento1Boton2;
    }

    public void setCampoIdConjuntoSegmento1Boton2(Button component) {
        this.campoIdConjuntoSegmento1Boton2 = component;
    }

    private Label labelEsSegmentada1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelEsSegmentada1() {
        return labelEsSegmentada1;
    }

    public void setLabelEsSegmentada1(Label l) {
        this.labelEsSegmentada1 = l;
    }

    private DropDown listaEsSegmentada1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaEsSegmentada1() {
        return listaEsSegmentada1;
    }

    public void setListaEsSegmentada1(DropDown component) {
        this.listaEsSegmentada1 = component;
    }

    private HelpInline helpInlineEsSegmentada1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineEsSegmentada1() {
        return helpInlineEsSegmentada1;
    }

    public void setHelpInlineEsSegmentada1(HelpInline hi) {
        this.helpInlineEsSegmentada1 = hi;
    }

    private StaticText listaEsSegmentada1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getListaEsSegmentada1Texto1() {
        return listaEsSegmentada1Texto1;
    }

    public void setListaEsSegmentada1Texto1(StaticText component) {
        this.listaEsSegmentada1Texto1 = component;
    }

    private IntegerConverter converterEsSegmentada1 = new IntegerConverter();
  
    public IntegerConverter getConverterEsSegmentada1() {
        return converterEsSegmentada1;
    }
  
    public void setConverterEsSegmentada1(IntegerConverter converter) {
        this.converterEsSegmentada1 = converter;
    }
  
    private Button botonAplicar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonAplicar1() {
        return botonAplicar1;
    }

    public void setBotonAplicar1(Button component) {
        this.botonAplicar1 = component;
    }

    private Button botonProcesar1 = new com.egt.core.jsf.component.Boton();

    public Button getBotonProcesar1() {
        return botonProcesar1;
    }

    public void setBotonProcesar1(Button component) {
        this.botonProcesar1 = component;
    }

    // </editor-fold>
/**/
    public Rol4() {
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
/**/
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("Rol4_ETIQUETA_MIGAS_PAN");

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina basica">
    private GestorPaginaBasica gestor = new GestorPaginaBasica(this);

    public GestorPaginaBasica getGestor() {
        return this.gestor;
    }
    // </editor-fold>
/**/
    static long FUNCION_ACCION_1 = RolConstants.FUNCION_COPIAR_ROL;

    static long FUNCION_ACCION_2 = RolConstants.FUNCION_MODIFICAR_CONJUNTO_ROL;

    static long FUNCION_ACCION_3 = RolConstants.FUNCION_PROPAGAR_FILTROS_ROL;

    static long FUNCION_ACCION_4 = RolConstants.FUNCION_PROPAGAR_FAVORITOS_ROL;

    @Override
    public Option[] getOpcionesListaFuncionAccion() {
        Option[] opciones = new Option[]{
            new Option("", this.getGestor().getI18n().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion()),
            new Option(FUNCION_ACCION_1, Bundle.getString("copiar")),
            new Option(FUNCION_ACCION_2, Bundle.getString("modificar conjunto")),
            new Option(FUNCION_ACCION_3, Bundle.getString("propagar filtros")),
            new Option(FUNCION_ACCION_4, Bundle.getString("propagar favoritos"))
        };
        return this.getGestor().getOpcionesListaFuncionAccionAutorizadas(opciones);
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isIdRolRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == 0 || f == FUNCION_ACCION_1 || f == FUNCION_ACCION_2 || f == FUNCION_ACCION_3 || f == FUNCION_ACCION_4;
    }

    private Bit bitIdRolRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdRolRendered();
        }
    };

    public Bit getBitIdRolRendered() {
        return bitIdRolRendered;
    }

    public boolean isCodigoRolRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_1;
    }

    private Bit bitCodigoRolRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCodigoRolRendered();
        }
    };

    public Bit getBitCodigoRolRendered() {
        return bitCodigoRolRendered;
    }

    public boolean isNombreRolRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_1;
    }

    private Bit bitNombreRolRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isNombreRolRendered();
        }
    };

    public Bit getBitNombreRolRendered() {
        return bitNombreRolRendered;
    }

    public boolean isIdConjuntoSegmentoRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_2;
    }

    private Bit bitIdConjuntoSegmentoRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdConjuntoSegmentoRendered();
        }
    };

    public Bit getBitIdConjuntoSegmentoRendered() {
        return bitIdConjuntoSegmentoRendered;
    }

    public boolean isEsSegmentadaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_2;
    }

    private Bit bitEsSegmentadaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isEsSegmentadaRendered();
        }
    };

    public Bit getBitEsSegmentadaRendered() {
        return bitEsSegmentadaRendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Facades">
    @EJB
    private RolFacadeLocal rolFacade;

    @EJB
    private ConjuntoSegmentoFacadeLocal conjuntoSegmentoFacade;

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos estandar: preiniciar, iniciar, preprocesar, prepresentar">
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
        this.initRolIdRol();
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
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer los valores de los campos">
    private String textoCampoCodigoRol1;

    public String getTextoCampoCodigoRol1() {
        return this.textoCampoCodigoRol1;
    }

    public void setTextoCampoCodigoRol1(String valor) {
        this.textoCampoCodigoRol1 = valor;
    }

    private String textoCampoNombreRol1;

    public String getTextoCampoNombreRol1() {
        return this.textoCampoNombreRol1;
    }

    public void setTextoCampoNombreRol1(String valor) {
        this.textoCampoNombreRol1 = valor;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idRol">
    private Rol rolIdRol;

    private FiltroBusqueda getFiltroBusquedaIdRol() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public Rol getRolIdRol() {
        return this.rolIdRol;
    }

    private void initRolIdRol() {
        Long id = this.getContextoPeticion().getIdentificacionRecurso();
        this.rolIdRol = id == null ? null : this.rolFacade.find(id, true);
    }

    public void campoIdRol1_validate(FacesContext context, UIComponent component, Object value) {
        this.rolIdRol = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = RolConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdRol();
                String query = "select * from rol ";
                List<Rol> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.rolIdRol = this.rolFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(RolConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.rolFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.rolIdRol = lista.get(0);
                        }
                    }
                } else if (o instanceof String) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.rolIdRol = this.rolFacade.findByCodigo(o.toString(), refresh);
                    } else {
                        filtro.addCriterio(RolConstants.COLUMNA_CODIGO_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.rolFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.rolIdRol = lista.get(0);
                        }
                    }
                }
                if (this.rolIdRol == null) {
                    throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.RECURSO_NO_REFERENCIABLE, "<" + c + ">", ""));
                }
            } catch (Exception ex) {
                if (ex instanceof ValidatorException) {
                    throw (ValidatorException) ex;
                } else {
                    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), null);
                    throw new ValidatorException(message);
                }
            }
        }
    }

    private String textoCampoIdRol1;

    public String getTextoCampoIdRol1() {
        return this.textoCampoIdRol1 != null ? this.textoCampoIdRol1
                : this.rolIdRol != null ? this.rolIdRol.getCodigoRol()
                : null;
    }

    public void setTextoCampoIdRol1(String valor) {
        this.textoCampoIdRol1 = valor;
    }

    public String getToolTipCampoIdRol1() {
        return this.rolIdRol == null ? null : STP.trimToStringRecursoSinNombre(this.rolIdRol.getNombreRol());
    }

    public String getScriptCampoIdRol1Boton1() {
        long funcion = RolConstants.FUNCION_CONSULTAR_ROL;
        String campo = this.getCampoIdRol1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, getFiltroBusquedaIdRol());
    }

    public String getScriptCampoIdRol1Boton2() {
//      String urx = URX2.DETALLE_ROL;
//      Long id = this.rolIdRol == null ? null : this.rolIdRol.getIdRol();
//      return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    private boolean isCampoIdRol1Boton2Rendered() {
        return this.isIdRolRendered();
    }

    private Bit bitCampoIdRol1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdRol1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdRol1Boton2Rendered() {
        return bitCampoIdRol1Boton2Rendered;
    }

    private boolean isCampoIdRol1Boton3Rendered() {
        return !this.isCampoIdRol1Boton2Rendered();
    }

    private Bit bitCampoIdRol1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdRol1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdRol1Boton3Rendered() {
        return bitCampoIdRol1Boton3Rendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idConjuntoSegmento">
    private ConjuntoSegmento conjuntoSegmentoIdConjuntoSegmento;

    private FiltroBusqueda getFiltroBusquedaIdConjuntoSegmento() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        return filtro;
    }

    public ConjuntoSegmento getConjuntoSegmentoIdConjuntoSegmento() {
        return this.conjuntoSegmentoIdConjuntoSegmento;
    }

    public void campoIdConjuntoSegmento1_validate(FacesContext context, UIComponent component, Object value) {
        this.conjuntoSegmentoIdConjuntoSegmento = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = ConjuntoSegmentoConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdConjuntoSegmento();
                String query = "select * from conjunto_segmento ";
                List<ConjuntoSegmento> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.conjuntoSegmentoIdConjuntoSegmento = this.conjuntoSegmentoFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(ConjuntoSegmentoConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.conjuntoSegmentoFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.conjuntoSegmentoIdConjuntoSegmento = lista.get(0);
                        }
                    }
                } else if (o instanceof String) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.conjuntoSegmentoIdConjuntoSegmento = this.conjuntoSegmentoFacade.findByCodigo(o.toString(), refresh);
                    } else {
                        filtro.addCriterio(ConjuntoSegmentoConstants.COLUMNA_CODIGO_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.conjuntoSegmentoFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.conjuntoSegmentoIdConjuntoSegmento = lista.get(0);
                        }
                    }
                }
                if (this.conjuntoSegmentoIdConjuntoSegmento == null) {
                    throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.RECURSO_NO_REFERENCIABLE, "<" + c + ">", ""));
                }
            } catch (Exception ex) {
                if (ex instanceof ValidatorException) {
                    throw (ValidatorException) ex;
                } else {
                    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), null);
                    throw new ValidatorException(message);
                }
            }
        }
    }

    private String textoCampoIdConjuntoSegmento1;

    public String getTextoCampoIdConjuntoSegmento1() {
        return this.textoCampoIdConjuntoSegmento1 != null ? this.textoCampoIdConjuntoSegmento1
                : this.conjuntoSegmentoIdConjuntoSegmento != null ? this.conjuntoSegmentoIdConjuntoSegmento.getCodigoConjuntoSegmento()
                : null;
    }

    public void setTextoCampoIdConjuntoSegmento1(String valor) {
        this.textoCampoIdConjuntoSegmento1 = valor;
    }

    public String getToolTipCampoIdConjuntoSegmento1() {
        return this.conjuntoSegmentoIdConjuntoSegmento == null ? null : STP.trimToStringRecursoSinNombre(this.conjuntoSegmentoIdConjuntoSegmento.getNombreConjuntoSegmento());
    }

    public String getScriptCampoIdConjuntoSegmento1Boton1() {
        long funcion = ConjuntoSegmentoConstants.FUNCION_CONSULTAR_CONJUNTO_SEGMENTO;
        String campo = this.getCampoIdConjuntoSegmento1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        String urx = URX2.TABLA_CONJUNTO_SEGMENTO;
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, getFiltroBusquedaIdConjuntoSegmento());
    }

    public String getScriptCampoIdConjuntoSegmento1Boton2() {
        String urx = URX2.DETALLE_CONJUNTO_SEGMENTO;
        Long id = this.conjuntoSegmentoIdConjuntoSegmento == null ? null : this.conjuntoSegmentoIdConjuntoSegmento.getIdConjuntoSegmento();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    private boolean isCampoIdConjuntoSegmento1Boton2Rendered() {
        return this.isIdConjuntoSegmentoRendered();
    }

    private Bit bitCampoIdConjuntoSegmento1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdConjuntoSegmento1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdConjuntoSegmento1Boton2Rendered() {
        return bitCampoIdConjuntoSegmento1Boton2Rendered;
    }

    private boolean isCampoIdConjuntoSegmento1Boton3Rendered() {
        return !this.isCampoIdConjuntoSegmento1Boton2Rendered();
    }

    private Bit bitCampoIdConjuntoSegmento1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdConjuntoSegmento1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdConjuntoSegmento1Boton3Rendered() {
        return bitCampoIdConjuntoSegmento1Boton3Rendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    public Object getOpcionesListaEsSegmentada1() {
        return JSF.getListaOpciones(EnumOpcionBinaria.values(), true, false);
    }

    private Integer valorListaEsSegmentada1;

    public Integer getValorListaEsSegmentada1() {
        return this.valorListaEsSegmentada1;
    }

    public void setValorListaEsSegmentada1(Integer valor) {
        this.valorListaEsSegmentada1 = valor;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="botones de accion de la plantilla #4">
    public String botonAplicar1_action() {
        return null;
    }

    public String botonProcesar1_action() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == 0 ? null
                : f == FUNCION_ACCION_1 ? this.accion1(f) /* copiarRol */
                : f == FUNCION_ACCION_2 ? this.accion2(f) /* modificarConjuntoRol */
                : f == FUNCION_ACCION_3 ? this.accion3(f) /* propagarFiltrosRol */
                : f == FUNCION_ACCION_4 ? this.accion4(f) /* propagarFavoritosRol */
                : null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para ejecutar funciones">
    private String accion1(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.copiarRol();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("copiar rol"));
        }
        return null;
    }

    private String accion2(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.modificarConjuntoRol();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("modificar conjunto rol"));
        }
        return null;
    }

    private String accion3(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.propagarFiltrosRol();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("propagar filtros rol"));
        }
        return null;
    }

    private String accion4(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.propagarFavoritosRol();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("propagar favoritos rol"));
        }
        return null;
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @EJB
    private RolBusinessProcessLocal rolBusinessProcess;

    private void copiarRol() { /* copiar rol */
        this.copiarRol(synchronously);
    }

    private void copiarRol(boolean synchronously) { /* copiar rol */
        try {
            Long idRol = this.getRolIdRol() == null ? null : this.getRolIdRol().getIdRol();
            String codigoRol = this.getTextoCampoCodigoRol1();
            String nombreRol = this.getTextoCampoNombreRol1();
            CopiarRolMessage message = new CopiarRolMessage(idRol, codigoRol, nombreRol);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.rolBusinessProcess.copiarRol(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void modificarConjuntoRol() { /* modificar conjunto rol */
        this.modificarConjuntoRol(synchronously);
    }

    private void modificarConjuntoRol(boolean synchronously) { /* modificar conjunto rol */
        try {
            Long idRol = this.getRolIdRol() == null ? null : this.getRolIdRol().getIdRol();
            Long idConjuntoSegmento = this.getConjuntoSegmentoIdConjuntoSegmento() == null ? null : this.getConjuntoSegmentoIdConjuntoSegmento().getIdConjuntoSegmento();
            Integer esSegmentada = this.getValorListaEsSegmentada1();
            ModificarConjuntoRolMessage message = new ModificarConjuntoRolMessage(idRol, idConjuntoSegmento, esSegmentada);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.rolBusinessProcess.modificarConjuntoRol(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void propagarFiltrosRol() { /* propagar filtros rol */
        this.propagarFiltrosRol(synchronously);
    }

    private void propagarFiltrosRol(boolean synchronously) { /* propagar filtros rol */
        try {
            Long idRol = this.getRolIdRol() == null ? null : this.getRolIdRol().getIdRol();
            PropagarFiltrosRolMessage message = new PropagarFiltrosRolMessage(idRol);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.rolBusinessProcess.propagarFiltrosRol(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void propagarFavoritosRol() { /* propagar favoritos rol */
        this.propagarFavoritosRol(synchronously);
    }

    private void propagarFavoritosRol(boolean synchronously) { /* propagar favoritos rol */
        try {
            Long idRol = this.getRolIdRol() == null ? null : this.getRolIdRol().getIdRol();
            PropagarFavoritosRolMessage message = new PropagarFavoritosRolMessage(idRol);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.rolBusinessProcess.propagarFavoritosRol(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private AbstractMessage requestReply(AbstractMessage message) throws Exception {
        ObjectMessage solicitud = this.messenger.postRequest(message);
        ObjectMessage respuesta = this.messenger.receiveReply(solicitud);
        AbstractMessage mensaje = respuesta == null
                ? (AbstractMessage) solicitud.getObject()
                : (AbstractMessage) respuesta.getObject();
        /**/
        TLC.getBitacora().add(mensaje);
        return mensaje;
    }

    String footnote = "a partir de aqui coloque el codigo especifico de la pagina";
}
