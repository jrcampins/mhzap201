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
package com.egt.web.proceso;

import com.egt.base.entity.constants.FichaPersonaConstants;
import com.egt.base.entity.constants.PotencialBenConstants;
import com.egt.ejb.persistence.entity.FichaPersona;
import com.egt.ejb.persistence.entity.PotencialBen;
import com.egt.ejb.persistence.facade.FichaPersonaFacadeLocal;
import com.egt.ejb.persistence.facade.PotencialBenFacadeLocal;
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
import com.egt.ejb.business.message.VincularFichaPersonaMessage;
import com.egt.ejb.business.message.DesvincularFichaPersonaMessage;
import com.egt.ejb.business.process.FichaPersonaBusinessProcessLocal;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;

public class FichaPersona4 extends AbstractPageBean
        implements PaginaBasicaConAccionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
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

    private Label labelIdFichaPersona1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaPersona1() {
        return labelIdFichaPersona1;
    }

    public void setLabelIdFichaPersona1(Label l) {
        this.labelIdFichaPersona1 = l;
    }

    private TextField campoIdFichaPersona1 = new com.egt.core.jsf.component.CampoTexto();

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

    private Button campoIdFichaPersona1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFichaPersona1Boton1() {
        return campoIdFichaPersona1Boton1;
    }

    public void setCampoIdFichaPersona1Boton1(Button component) {
        this.campoIdFichaPersona1Boton1 = component;
    }

    private Button campoIdFichaPersona1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFichaPersona1Boton3() {
        return campoIdFichaPersona1Boton3;
    }

    public void setCampoIdFichaPersona1Boton3(Button component) {
        this.campoIdFichaPersona1Boton3 = component;
    }

    private Label labelIdFichaPersona2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaPersona2() {
        return labelIdFichaPersona2;
    }

    public void setLabelIdFichaPersona2(Label l) {
        this.labelIdFichaPersona2 = l;
    }

    private StaticText campoIdFichaPersona1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFichaPersona1Texto2() {
        return campoIdFichaPersona1Texto2;
    }

    public void setCampoIdFichaPersona1Texto2(StaticText component) {
        this.campoIdFichaPersona1Texto2 = component;
    }

    private Button campoIdFichaPersona1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFichaPersona1Boton2() {
        return campoIdFichaPersona1Boton2;
    }

    public void setCampoIdFichaPersona1Boton2(Button component) {
        this.campoIdFichaPersona1Boton2 = component;
    }

    private Label labelIdPotencialBen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPotencialBen1() {
        return labelIdPotencialBen1;
    }

    public void setLabelIdPotencialBen1(Label l) {
        this.labelIdPotencialBen1 = l;
    }

    private TextField campoIdPotencialBen1 = new com.egt.core.jsf.component.CampoTexto();

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

    private Button campoIdPotencialBen1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdPotencialBen1Boton1() {
        return campoIdPotencialBen1Boton1;
    }

    public void setCampoIdPotencialBen1Boton1(Button component) {
        this.campoIdPotencialBen1Boton1 = component;
    }

    private Button campoIdPotencialBen1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPotencialBen1Boton3() {
        return campoIdPotencialBen1Boton3;
    }

    public void setCampoIdPotencialBen1Boton3(Button component) {
        this.campoIdPotencialBen1Boton3 = component;
    }

    private Label labelIdPotencialBen2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdPotencialBen2() {
        return labelIdPotencialBen2;
    }

    public void setLabelIdPotencialBen2(Label l) {
        this.labelIdPotencialBen2 = l;
    }

    private StaticText campoIdPotencialBen1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdPotencialBen1Texto2() {
        return campoIdPotencialBen1Texto2;
    }

    public void setCampoIdPotencialBen1Texto2(StaticText component) {
        this.campoIdPotencialBen1Texto2 = component;
    }

    private Button campoIdPotencialBen1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdPotencialBen1Boton2() {
        return campoIdPotencialBen1Boton2;
    }

    public void setCampoIdPotencialBen1Boton2(Button component) {
        this.campoIdPotencialBen1Boton2 = component;
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
    public FichaPersona4() {
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
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("FichaPersona4_ETIQUETA_MIGAS_PAN");

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina basica">
    private GestorPaginaBasica gestor = new GestorPaginaBasica(this);

    public GestorPaginaBasica getGestor() {
        return this.gestor;
    }
    // </editor-fold>
/**/
    static long FUNCION_ACCION_1 = FichaPersonaConstants.FUNCION_VINCULAR_FICHA_PERSONA;

    static long FUNCION_ACCION_2 = FichaPersonaConstants.FUNCION_DESVINCULAR_FICHA_PERSONA;

    @Override
    public Option[] getOpcionesListaFuncionAccion() {
        Option[] opciones = new Option[]{
            new Option("", this.getGestor().getI18n().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion()),
            new Option(FUNCION_ACCION_1, Bundle.getString("vincular")),
            new Option(FUNCION_ACCION_2, Bundle.getString("desvincular"))
        };
        return this.getGestor().getOpcionesListaFuncionAccionAutorizadas(opciones);
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isIdFichaPersonaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == 0 || f == FUNCION_ACCION_1 || f == FUNCION_ACCION_2;
    }

    private Bit bitIdFichaPersonaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdFichaPersonaRendered();
        }
    };

    public Bit getBitIdFichaPersonaRendered() {
        return bitIdFichaPersonaRendered;
    }

    public boolean isIdPotencialBenRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_1;
    }

    private Bit bitIdPotencialBenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdPotencialBenRendered();
        }
    };

    public Bit getBitIdPotencialBenRendered() {
        return bitIdPotencialBenRendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Facades">
    @EJB
    private FichaPersonaFacadeLocal fichaPersonaFacade;

    @EJB
    private PotencialBenFacadeLocal potencialBenFacade;

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
        this.initFichaPersonaIdFichaPersona();
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
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFichaPersona">
    private FichaPersona fichaPersonaIdFichaPersona;

    private FiltroBusqueda getFiltroBusquedaIdFichaPersona() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public FichaPersona getFichaPersonaIdFichaPersona() {
        return this.fichaPersonaIdFichaPersona;
    }

    private void initFichaPersonaIdFichaPersona() {
        Long id = this.getContextoPeticion().getIdentificacionRecurso();
        this.fichaPersonaIdFichaPersona = id == null ? null : this.fichaPersonaFacade.find(id, true);
    }

    public void campoIdFichaPersona1_validate(FacesContext context, UIComponent component, Object value) {
        this.fichaPersonaIdFichaPersona = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = FichaPersonaConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdFichaPersona();
                String query = "select * from ficha_persona ";
                List<FichaPersona> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.fichaPersonaIdFichaPersona = this.fichaPersonaFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(FichaPersonaConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.fichaPersonaFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.fichaPersonaIdFichaPersona = lista.get(0);
                        }
                    }
                } else if (o instanceof String) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.fichaPersonaIdFichaPersona = this.fichaPersonaFacade.findByCodigo(o.toString(), refresh);
                    } else {
                        filtro.addCriterio(FichaPersonaConstants.COLUMNA_CODIGO_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.fichaPersonaFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.fichaPersonaIdFichaPersona = lista.get(0);
                        }
                    }
                }
                if (this.fichaPersonaIdFichaPersona == null) {
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

    private String textoCampoIdFichaPersona1;

    public String getTextoCampoIdFichaPersona1() {
        return this.textoCampoIdFichaPersona1 != null ? this.textoCampoIdFichaPersona1
                : this.fichaPersonaIdFichaPersona != null ? this.fichaPersonaIdFichaPersona.getCodigoFichaPersona()
                : null;
    }

    public void setTextoCampoIdFichaPersona1(String valor) {
        this.textoCampoIdFichaPersona1 = valor;
    }

    public String getToolTipCampoIdFichaPersona1() {
        return this.fichaPersonaIdFichaPersona == null ? null : STP.trimToStringRecursoSinNombre(this.fichaPersonaIdFichaPersona.getNombreFichaPersona());
    }

    public String getScriptCampoIdFichaPersona1Boton1() {
        long funcion = FichaPersonaConstants.FUNCION_CONSULTAR_FICHA_PERSONA;
        String campo = this.getCampoIdFichaPersona1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_FICHA_PERSONA;
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, getFiltroBusquedaIdFichaPersona());
    }

    public String getScriptCampoIdFichaPersona1Boton2() {
        String urx = URX2.CONSULTA_DETALLE_FICHA_PERSONA;
        Long id = this.fichaPersonaIdFichaPersona == null ? null : this.fichaPersonaIdFichaPersona.getIdFichaPersona();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    private boolean isCampoIdFichaPersona1Boton2Rendered() {
        return this.isIdFichaPersonaRendered();
    }

    private Bit bitCampoIdFichaPersona1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdFichaPersona1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdFichaPersona1Boton2Rendered() {
        return bitCampoIdFichaPersona1Boton2Rendered;
    }

    private boolean isCampoIdFichaPersona1Boton3Rendered() {
        return !this.isCampoIdFichaPersona1Boton2Rendered();
    }

    private Bit bitCampoIdFichaPersona1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdFichaPersona1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdFichaPersona1Boton3Rendered() {
        return bitCampoIdFichaPersona1Boton3Rendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idPotencialBen">
    private PotencialBen potencialBenIdPotencialBen;

    private FiltroBusqueda getFiltroBusquedaIdPotencialBen() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public PotencialBen getPotencialBenIdPotencialBen() {
        return this.potencialBenIdPotencialBen;
    }

    public void campoIdPotencialBen1_validate(FacesContext context, UIComponent component, Object value) {
        this.potencialBenIdPotencialBen = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = PotencialBenConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdPotencialBen();
                String query = "select * from potencial_ben ";
                List<PotencialBen> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.potencialBenIdPotencialBen = this.potencialBenFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(PotencialBenConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.potencialBenFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.potencialBenIdPotencialBen = lista.get(0);
                        }
                    }
                } else if (o instanceof String) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.potencialBenIdPotencialBen = this.potencialBenFacade.findByCodigo(o.toString(), refresh);
                    } else {
                        filtro.addCriterio(PotencialBenConstants.COLUMNA_CODIGO_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.potencialBenFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.potencialBenIdPotencialBen = lista.get(0);
                        }
                    }
                }
                if (this.potencialBenIdPotencialBen == null) {
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

    private String textoCampoIdPotencialBen1;

    public String getTextoCampoIdPotencialBen1() {
        return this.textoCampoIdPotencialBen1 != null ? this.textoCampoIdPotencialBen1
                : this.potencialBenIdPotencialBen != null ? this.potencialBenIdPotencialBen.getCodigoPotencialBen()
                : null;
    }

    public void setTextoCampoIdPotencialBen1(String valor) {
        this.textoCampoIdPotencialBen1 = valor;
    }

    public String getToolTipCampoIdPotencialBen1() {
        return this.potencialBenIdPotencialBen == null ? null : STP.trimToStringRecursoSinNombre(this.potencialBenIdPotencialBen.getNombrePotencialBen());
    }

    public String getScriptCampoIdPotencialBen1Boton1() {
        long funcion = PotencialBenConstants.FUNCION_CONSULTAR_POTENCIAL_BEN;
        String campo = this.getCampoIdPotencialBen1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_POTENCIAL_BEN;
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, getFiltroBusquedaIdPotencialBen());
    }

    public String getScriptCampoIdPotencialBen1Boton2() {
        String urx = URX2.CONSULTA_DETALLE_POTENCIAL_BEN;
        Long id = this.potencialBenIdPotencialBen == null ? null : this.potencialBenIdPotencialBen.getIdPotencialBen();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    private boolean isCampoIdPotencialBen1Boton2Rendered() {
        return this.isIdPotencialBenRendered();
    }

    private Bit bitCampoIdPotencialBen1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdPotencialBen1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdPotencialBen1Boton2Rendered() {
        return bitCampoIdPotencialBen1Boton2Rendered;
    }

    private boolean isCampoIdPotencialBen1Boton3Rendered() {
        return !this.isCampoIdPotencialBen1Boton2Rendered();
    }

    private Bit bitCampoIdPotencialBen1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdPotencialBen1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdPotencialBen1Boton3Rendered() {
        return bitCampoIdPotencialBen1Boton3Rendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="botones de accion de la plantilla #4">
    public String botonAplicar1_action() {
        return null;
    }

    public String botonProcesar1_action() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == 0 ? null
                : f == FUNCION_ACCION_1 ? this.accion1(f) /* vincularFichaPersona */
                : f == FUNCION_ACCION_2 ? this.accion2(f) /* desvincularFichaPersona */
                : null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para ejecutar funciones">
    private String accion1(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.vincularFichaPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("vincular ficha persona"));
        }
        return null;
    }

    private String accion2(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.desvincularFichaPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("desvincular ficha persona"));
        }
        return null;
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @EJB
    private FichaPersonaBusinessProcessLocal fichaPersonaBusinessProcess;

    private void vincularFichaPersona() { /* vincular ficha persona */
        this.vincularFichaPersona(synchronously);
    }

    private void vincularFichaPersona(boolean synchronously) { /* vincular ficha persona */
        try {
            Long idFichaPersona = this.getFichaPersonaIdFichaPersona() == null ? null : this.getFichaPersonaIdFichaPersona().getIdFichaPersona();
            Long idPotencialBen = this.getPotencialBenIdPotencialBen() == null ? null : this.getPotencialBenIdPotencialBen().getIdPotencialBen();
            VincularFichaPersonaMessage message = new VincularFichaPersonaMessage(idFichaPersona, idPotencialBen);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.fichaPersonaBusinessProcess.vincularFichaPersona(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void desvincularFichaPersona() { /* desvincular ficha persona */
        this.desvincularFichaPersona(synchronously);
    }

    private void desvincularFichaPersona(boolean synchronously) { /* desvincular ficha persona */
        try {
            Long idFichaPersona = this.getFichaPersonaIdFichaPersona() == null ? null : this.getFichaPersonaIdFichaPersona().getIdFichaPersona();
            DesvincularFichaPersonaMessage message = new DesvincularFichaPersonaMessage(idFichaPersona);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.fichaPersonaBusinessProcess.desvincularFichaPersona(message);
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
