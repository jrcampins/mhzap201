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
package com.egt.web.proceso;

import com.egt.base.entity.constants.PersonaAnotadaConstants;
import com.egt.base.entity.constants.UsuarioConstants;
import com.egt.ejb.persistence.entity.PersonaAnotada;
import com.egt.ejb.persistence.entity.Usuario;
import com.egt.ejb.persistence.facade.PersonaAnotadaFacadeLocal;
import com.egt.ejb.persistence.facade.UsuarioFacadeLocal;
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
import com.egt.ejb.business.message.BorrarPersonaAnotadaMessage;
import com.egt.ejb.business.message.BorrarPersonaAnotadaOtroMessage;
import com.egt.ejb.business.process.PersonaAnotadaBusinessProcessLocal;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;

public class PersonaAnotada4 extends AbstractPageBean
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

    private Label labelIdUsuario1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuario1() {
        return labelIdUsuario1;
    }

    public void setLabelIdUsuario1(Label l) {
        this.labelIdUsuario1 = l;
    }

    private TextField campoIdUsuario1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdUsuario1() {
        return campoIdUsuario1;
    }

    public void setCampoIdUsuario1(TextField component) {
        this.campoIdUsuario1 = component;
    }

    private HelpInline helpInlineIdUsuario1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdUsuario1() {
        return helpInlineIdUsuario1;
    }

    public void setHelpInlineIdUsuario1(HelpInline hi) {
        this.helpInlineIdUsuario1 = hi;
    }

    private StaticText campoIdUsuario1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdUsuario1Texto1() {
        return campoIdUsuario1Texto1;
    }

    public void setCampoIdUsuario1Texto1(StaticText component) {
        this.campoIdUsuario1Texto1 = component;
    }

    private Button campoIdUsuario1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdUsuario1Boton1() {
        return campoIdUsuario1Boton1;
    }

    public void setCampoIdUsuario1Boton1(Button component) {
        this.campoIdUsuario1Boton1 = component;
    }

    private Button campoIdUsuario1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUsuario1Boton3() {
        return campoIdUsuario1Boton3;
    }

    public void setCampoIdUsuario1Boton3(Button component) {
        this.campoIdUsuario1Boton3 = component;
    }

    private Label labelIdUsuario2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuario2() {
        return labelIdUsuario2;
    }

    public void setLabelIdUsuario2(Label l) {
        this.labelIdUsuario2 = l;
    }

    private StaticText campoIdUsuario1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdUsuario1Texto2() {
        return campoIdUsuario1Texto2;
    }

    public void setCampoIdUsuario1Texto2(StaticText component) {
        this.campoIdUsuario1Texto2 = component;
    }

    private Button campoIdUsuario1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUsuario1Boton2() {
        return campoIdUsuario1Boton2;
    }

    public void setCampoIdUsuario1Boton2(Button component) {
        this.campoIdUsuario1Boton2 = component;
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
    public PersonaAnotada4() {
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
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("PersonaAnotada4_ETIQUETA_MIGAS_PAN");

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina basica">
    private GestorPaginaBasica gestor = new GestorPaginaBasica(this);

    public GestorPaginaBasica getGestor() {
        return this.gestor;
    }
    // </editor-fold>
/**/
    static long FUNCION_ACCION_1 = PersonaAnotadaConstants.FUNCION_BORRAR_PERSONA_ANOTADA;

    static long FUNCION_ACCION_2 = PersonaAnotadaConstants.FUNCION_BORRAR_PERSONA_ANOTADA_OTRO;

    @Override
    public Option[] getOpcionesListaFuncionAccion() {
        Option[] opciones = new Option[]{
            new Option("", this.getGestor().getI18n().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion()),
            new Option(FUNCION_ACCION_1, BundleWebui.getString("borrar_persona_anotada")),
            new Option(FUNCION_ACCION_2, BundleWebui.getString("borrar_persona_anotada_otro"))
        };
        return this.getGestor().getOpcionesListaFuncionAccionAutorizadas(opciones);
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isIdUsuarioRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_2;
    }

    private Bit bitIdUsuarioRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdUsuarioRendered();
        }
    };

    public Bit getBitIdUsuarioRendered() {
        return bitIdUsuarioRendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Facades">
    @EJB
    private PersonaAnotadaFacadeLocal personaAnotadaFacade;

    @EJB
    private UsuarioFacadeLocal usuarioFacade;

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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idUsuario">
    private Usuario usuarioIdUsuario;

    private FiltroBusqueda getFiltroBusquedaIdUsuario() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public Usuario getUsuarioIdUsuario() {
        return this.usuarioIdUsuario;
    }

    public void campoIdUsuario1_validate(FacesContext context, UIComponent component, Object value) {
        this.usuarioIdUsuario = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = UsuarioConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdUsuario();
                String query = "select * from usuario ";
                List<Usuario> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.usuarioIdUsuario = this.usuarioFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(UsuarioConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.usuarioFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.usuarioIdUsuario = lista.get(0);
                        }
                    }
                } else if (o instanceof String) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.usuarioIdUsuario = this.usuarioFacade.findByCodigo(o.toString(), refresh);
                    } else {
                        filtro.addCriterio(UsuarioConstants.COLUMNA_CODIGO_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.usuarioFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.usuarioIdUsuario = lista.get(0);
                        }
                    }
                }
                if (this.usuarioIdUsuario == null) {
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

    private String textoCampoIdUsuario1;

    public String getTextoCampoIdUsuario1() {
        return this.textoCampoIdUsuario1 != null ? this.textoCampoIdUsuario1
                : this.usuarioIdUsuario != null ? this.usuarioIdUsuario.getCodigoUsuario()
                : null;
    }

    public void setTextoCampoIdUsuario1(String valor) {
        this.textoCampoIdUsuario1 = valor;
    }

    public String getToolTipCampoIdUsuario1() {
        return this.usuarioIdUsuario == null ? null : STP.trimToStringRecursoSinNombre(this.usuarioIdUsuario.getNombreUsuario());
    }

    public String getScriptCampoIdUsuario1Boton1() {
        long funcion = UsuarioConstants.FUNCION_CONSULTAR_USUARIO;
        String campo = this.getCampoIdUsuario1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        String urx = URX2.TABLA_USUARIO;
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, getFiltroBusquedaIdUsuario());
    }

    public String getScriptCampoIdUsuario1Boton2() {
        String urx = URX2.DETALLE_USUARIO;
        Long id = this.usuarioIdUsuario == null ? null : this.usuarioIdUsuario.getIdUsuario();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    private boolean isCampoIdUsuario1Boton2Rendered() {
        return this.isIdUsuarioRendered();
    }

    private Bit bitCampoIdUsuario1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdUsuario1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdUsuario1Boton2Rendered() {
        return bitCampoIdUsuario1Boton2Rendered;
    }

    private boolean isCampoIdUsuario1Boton3Rendered() {
        return !this.isCampoIdUsuario1Boton2Rendered();
    }

    private Bit bitCampoIdUsuario1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdUsuario1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdUsuario1Boton3Rendered() {
        return bitCampoIdUsuario1Boton3Rendered;
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
                : f == FUNCION_ACCION_1 ? this.accion1(f) /* borrarPersonaAnotada */
                : f == FUNCION_ACCION_2 ? this.accion2(f) /* borrarPersonaAnotadaOtro */
                : null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para ejecutar funciones">
    private String accion1(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.borrarPersonaAnotada();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "borrar_persona_anotada");
        }
        return null;
    }

    private String accion2(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.borrarPersonaAnotadaOtro();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "borrar_persona_anotada_otro");
        }
        return null;
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @EJB
    private PersonaAnotadaBusinessProcessLocal personaAnotadaBusinessProcess;

    private void borrarPersonaAnotada() { /* borrar persona anotada */
        this.borrarPersonaAnotada(synchronously);
    }

    private void borrarPersonaAnotada(boolean synchronously) { /* borrar persona anotada */
        try {
            BorrarPersonaAnotadaMessage message = new BorrarPersonaAnotadaMessage();
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaAnotadaBusinessProcess.borrarPersonaAnotada(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void borrarPersonaAnotadaOtro() { /* borrar persona anotada otro */
        this.borrarPersonaAnotadaOtro(synchronously);
    }

    private void borrarPersonaAnotadaOtro(boolean synchronously) { /* borrar persona anotada otro */
        try {
            Long idUsuario = this.getUsuarioIdUsuario() == null ? null : this.getUsuarioIdUsuario().getIdUsuario();
            BorrarPersonaAnotadaOtroMessage message = new BorrarPersonaAnotadaOtroMessage(idUsuario);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.personaAnotadaBusinessProcess.borrarPersonaAnotadaOtro(message);
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
