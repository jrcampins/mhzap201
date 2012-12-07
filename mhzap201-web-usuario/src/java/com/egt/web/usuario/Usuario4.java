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

package com.egt.web.usuario;

import com.egt.base.entity.constants.UsuarioConstants;
import com.egt.ejb.persistence.entity.Usuario;
import com.egt.ejb.persistence.facade.UsuarioFacadeLocal;
import com.egt.base.constants.CBM2;
import com.egt.base.enums.EnumOperadorCom;
import com.egt.commons.util.Bit;
import com.egt.commons.util.LongUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.TLC;
import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.GestorPaginaBasica;
import com.egt.core.aplicacion.web.PaginaBasicaConAccionMultiple;
import com.egt.core.util.STP;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.sun.webui.jsf.component.Breadcrumbs;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.HelpInline;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.PasswordField;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.Option;
import javax.ejb.EJB;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.LongConverter;
import javax.faces.validator.LengthValidator;
import javax.faces.validator.ValidatorException;
import com.egt.base.jms.messages.AbstractMessage;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.util.Utils;
import com.egt.data.general.xdp3.UsuarioCachedRowSetDataProvider3;
import com.egt.ejb.business.jms.BusinessProcessMessengerLocal;
import com.egt.ejb.business.message.DesignarSuperUsuarioMessage;
import com.egt.ejb.business.message.AnularSuperUsuarioMessage;
import com.egt.ejb.business.message.DesactivarUsuarioMessage;
import com.egt.ejb.business.message.ReactivarUsuarioMessage;
import com.egt.ejb.business.message.SincronizarUsuarioMessage;
import com.egt.ejb.business.message.AsignarPasswordUsuarioMessage;
import com.egt.ejb.business.message.AsignarSupervisorUsuarioMessage;
import com.egt.ejb.business.process.UsuarioBusinessProcessLocal;
import javax.jms.ObjectMessage;

public class Usuario4 extends AbstractPageBean
        implements PaginaBasicaConAccionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorPasswordUsuario1.setMaximum(2000);
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

    private Label labelPasswordUsuario1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelPasswordUsuario1() {
        return labelPasswordUsuario1;
    }

    public void setLabelPasswordUsuario1(Label l) {
        this.labelPasswordUsuario1 = l;
    }

    private PasswordField campoPasswordUsuario1 = new PasswordField();

    public PasswordField getCampoPasswordUsuario1() {
        return campoPasswordUsuario1;
    }

    public void setCampoPasswordUsuario1(PasswordField component) {
        this.campoPasswordUsuario1 = component;
    }

    private HelpInline helpInlinePasswordUsuario1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlinePasswordUsuario1() {
        return helpInlinePasswordUsuario1;
    }

    public void setHelpInlinePasswordUsuario1(HelpInline hi) {
        this.helpInlinePasswordUsuario1 = hi;
    }

    private StaticText campoPasswordUsuario1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoPasswordUsuario1Texto1() {
        return campoPasswordUsuario1Texto1;
    }

    public void setCampoPasswordUsuario1Texto1(StaticText component) {
        this.campoPasswordUsuario1Texto1 = component;
    }

    private LengthValidator validatorPasswordUsuario1 = new LengthValidator();

    public LengthValidator getValidatorPasswordUsuario1() {
        return validatorPasswordUsuario1;
    }

    public void setValidatorPasswordUsuario1(LengthValidator validator) {
        this.validatorPasswordUsuario1 = validator;
    }

    private Label labelIdUsuarioSupervisor1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuarioSupervisor1() {
        return labelIdUsuarioSupervisor1;
    }

    public void setLabelIdUsuarioSupervisor1(Label l) {
        this.labelIdUsuarioSupervisor1 = l;
    }

    private TextField campoIdUsuarioSupervisor1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdUsuarioSupervisor1() {
        return campoIdUsuarioSupervisor1;
    }

    public void setCampoIdUsuarioSupervisor1(TextField component) {
        this.campoIdUsuarioSupervisor1 = component;
    }

    private HelpInline helpInlineIdUsuarioSupervisor1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdUsuarioSupervisor1() {
        return helpInlineIdUsuarioSupervisor1;
    }

    public void setHelpInlineIdUsuarioSupervisor1(HelpInline hi) {
        this.helpInlineIdUsuarioSupervisor1 = hi;
    }

    private StaticText campoIdUsuarioSupervisor1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdUsuarioSupervisor1Texto1() {
        return campoIdUsuarioSupervisor1Texto1;
    }

    public void setCampoIdUsuarioSupervisor1Texto1(StaticText component) {
        this.campoIdUsuarioSupervisor1Texto1 = component;
    }

    private Button campoIdUsuarioSupervisor1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdUsuarioSupervisor1Boton1() {
        return campoIdUsuarioSupervisor1Boton1;
    }

    public void setCampoIdUsuarioSupervisor1Boton1(Button component) {
        this.campoIdUsuarioSupervisor1Boton1 = component;
    }

    private Button campoIdUsuarioSupervisor1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUsuarioSupervisor1Boton3() {
        return campoIdUsuarioSupervisor1Boton3;
    }

    public void setCampoIdUsuarioSupervisor1Boton3(Button component) {
        this.campoIdUsuarioSupervisor1Boton3 = component;
    }

    private Label labelIdUsuarioSupervisor2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdUsuarioSupervisor2() {
        return labelIdUsuarioSupervisor2;
    }

    public void setLabelIdUsuarioSupervisor2(Label l) {
        this.labelIdUsuarioSupervisor2 = l;
    }

    private StaticText campoIdUsuarioSupervisor1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdUsuarioSupervisor1Texto2() {
        return campoIdUsuarioSupervisor1Texto2;
    }

    public void setCampoIdUsuarioSupervisor1Texto2(StaticText component) {
        this.campoIdUsuarioSupervisor1Texto2 = component;
    }

    private Button campoIdUsuarioSupervisor1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdUsuarioSupervisor1Boton2() {
        return campoIdUsuarioSupervisor1Boton2;
    }

    public void setCampoIdUsuarioSupervisor1Boton2(Button component) {
        this.campoIdUsuarioSupervisor1Boton2 = component;
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
    public Usuario4() {
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

    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("Usuario4_ETIQUETA_MIGAS_PAN");

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina basica">
    private GestorPaginaBasica gestor = new GestorPaginaBasica(this);

    public GestorPaginaBasica getGestor() {
        return this.gestor;
    }
    // </editor-fold>
/**/

    static long FUNCION_ACCION_1 = UsuarioConstants.FUNCION_DESIGNAR_SUPER_USUARIO;

    static long FUNCION_ACCION_2 = UsuarioConstants.FUNCION_ANULAR_SUPER_USUARIO;

    static long FUNCION_ACCION_3 = UsuarioConstants.FUNCION_DESACTIVAR_USUARIO;

    static long FUNCION_ACCION_4 = UsuarioConstants.FUNCION_REACTIVAR_USUARIO;

    static long FUNCION_ACCION_5 = UsuarioConstants.FUNCION_SINCRONIZAR_USUARIO;

    static long FUNCION_ACCION_6 = UsuarioConstants.FUNCION_ASIGNAR_PASSWORD_USUARIO;

    static long FUNCION_ACCION_7 = UsuarioConstants.FUNCION_ASIGNAR_SUPERVISOR_USUARIO;

    @Override
    public Option[] getOpcionesListaFuncionAccion() {
        Option[] opciones = new Option[]{
            new Option("", this.getGestor().getI18n().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion()),
            new Option(FUNCION_ACCION_1, Bundle.getString("designar super usuario")),
            new Option(FUNCION_ACCION_2, Bundle.getString("anular super usuario")),
            new Option(FUNCION_ACCION_3, Bundle.getString("desactivar usuario")),
            new Option(FUNCION_ACCION_4, Bundle.getString("reactivar usuario")),
            new Option(FUNCION_ACCION_5, Bundle.getString("sincronizar usuario")),
            new Option(FUNCION_ACCION_6, Bundle.getString("asignar password usuario")),
            new Option(FUNCION_ACCION_7, Bundle.getString("asignar supervisor usuario"))
        };
        return this.getGestor().getOpcionesListaFuncionAccionAutorizadas(opciones);
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isIdUsuarioRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == 0 || f == FUNCION_ACCION_1 || f == FUNCION_ACCION_2 || f == FUNCION_ACCION_3 || f == FUNCION_ACCION_4 || f == FUNCION_ACCION_5 || f
                == FUNCION_ACCION_6 || f == FUNCION_ACCION_7;
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

    public boolean isPasswordUsuarioRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_6;
    }

    private Bit bitPasswordUsuarioRendered = new Bit() {
        // override metodo isOn

        @Override
        public boolean isOn() {
            return isPasswordUsuarioRendered();
        }

    };

    public Bit getBitPasswordUsuarioRendered() {
        return bitPasswordUsuarioRendered;
    }

    public boolean isIdUsuarioSupervisorRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_7;
    }

    private Bit bitIdUsuarioSupervisorRendered = new Bit() {
        // override metodo isOn

        @Override
        public boolean isOn() {
            return isIdUsuarioSupervisorRendered();
        }

    };

    public Bit getBitIdUsuarioSupervisorRendered() {
        return bitIdUsuarioSupervisorRendered;
    }

    // </editor-fold>
/**/
    // <editor-fold defaultstate="collapsed" desc="Facades">
    @EJB
    private UsuarioFacadeLocal usuarioFacade;

    // </editor-fold>
/**/
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
        this.initUsuarioIdUsuario();
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
    private String textoCampoPasswordUsuario1;

    public String getTextoCampoPasswordUsuario1() {
        return this.textoCampoPasswordUsuario1;
    }

    public void setTextoCampoPasswordUsuario1(String valor) {
        this.textoCampoPasswordUsuario1 = valor;
    }

    // </editor-fold>
/**/
    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idUsuario">
    private Usuario usuarioIdUsuario;

    public Usuario getUsuarioIdUsuario() {
        return this.usuarioIdUsuario;
    }

    private void initUsuarioIdUsuario() {
        Long id = this.getContextoPeticion().getIdentificacionRecurso();
        this.usuarioIdUsuario = id == null ? null : this.usuarioFacade.find(id, true);
    }

    protected FiltroBusqueda getFiltroBusquedaIdUsuario() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
        columna = UsuarioCachedRowSetDataProvider3.COLUMNA_ES_USUARIO_ESPECIAL;
        comparacion = EnumOperadorCom.ES_IGUAL;
        valor = com.egt.base.enums.EnumOpcionBinaria.NO.getOptionValue();
        filtro.addCriterio(columna, comparacion, valor);
        /**/
        return filtro;
    }

    public void campoIdUsuario1_validate(FacesContext context, UIComponent component, Object value) {
        this.usuarioIdUsuario = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = UsuarioConstants.COLUMNA_IDENTIFICACION_RECURSO;
                boolean refresh = false;
                if (o instanceof Long) {
                    this.usuarioIdUsuario = this.usuarioFacade.find(o, refresh);
                } else if (o instanceof String) {
                    this.usuarioIdUsuario = this.usuarioFacade.findByCodigo(o.toString(), refresh);
                }
                if (this.usuarioIdUsuario == null) {
                    throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.RECURSO_NO_EXISTE, "<" + c + ">"));
                }
                if (BitUtils.valueOf(this.usuarioIdUsuario.getEsUsuarioEspecial())) {
                    throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.RECURSO_NO_AUTORIZADO, "<" + c + ">"));
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
//      return this.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton);
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdUsuario());
    }

    public String getScriptCampoIdUsuario1Boton2() {
//      String urx = URX2.DETALLE_USUARIO;
//      Long id = this.usuarioIdUsuario == null ? null : this.usuarioIdUsuario.getIdUsuario();
//      return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
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
/**/
    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idUsuarioSupervisor">
    private Usuario usuarioIdUsuarioSupervisor;

    public Usuario getUsuarioIdUsuarioSupervisor() {
        return this.usuarioIdUsuarioSupervisor;
    }

    protected FiltroBusqueda getFiltroBusquedaIdUsuarioSupervisor() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        /**/
        String columna;
        EnumOperadorCom comparacion;
        String string;
        Object valor;
        /**/
        columna = UsuarioCachedRowSetDataProvider3.COLUMNA_ES_USUARIO_ESPECIAL;
        comparacion = EnumOperadorCom.ES_IGUAL;
        valor = com.egt.base.enums.EnumOpcionBinaria.NO.getOptionValue();
        filtro.addCriterio(columna, comparacion, valor);
        /**/
        return filtro;
    }

    public void campoIdUsuarioSupervisor1_validate(FacesContext context, UIComponent component, Object value) {
        this.usuarioIdUsuarioSupervisor = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = UsuarioConstants.COLUMNA_IDENTIFICACION_RECURSO;
                boolean refresh = false;
                if (o instanceof Long) {
                    this.usuarioIdUsuarioSupervisor = this.usuarioFacade.find(o, refresh);
                } else if (o instanceof String) {
                    this.usuarioIdUsuarioSupervisor = this.usuarioFacade.findByCodigo(o.toString(), refresh);
                }
                if (this.usuarioIdUsuarioSupervisor == null) {
                    throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.RECURSO_NO_EXISTE, "<" + c + ">"));
                }
                if (BitUtils.valueOf(this.usuarioIdUsuarioSupervisor.getEsUsuarioEspecial())) {
                    throw new ExcepcionAplicacion(Bitacora.getTextoMensaje(CBM2.RECURSO_NO_AUTORIZADO, "<" + c + ">"));
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

    private String textoCampoIdUsuarioSupervisor1;

    public String getTextoCampoIdUsuarioSupervisor1() {
        return this.textoCampoIdUsuarioSupervisor1 != null ? this.textoCampoIdUsuarioSupervisor1
                : this.usuarioIdUsuarioSupervisor != null ? this.usuarioIdUsuarioSupervisor.getCodigoUsuario()
                : null;
    }

    public void setTextoCampoIdUsuarioSupervisor1(String valor) {
        this.textoCampoIdUsuarioSupervisor1 = valor;
    }

    public String getToolTipCampoIdUsuarioSupervisor1() {
        return this.usuarioIdUsuarioSupervisor == null ? null : STP.trimToStringRecursoSinNombre(this.usuarioIdUsuarioSupervisor.getNombreUsuario());
    }

    public String getScriptCampoIdUsuarioSupervisor1Boton1() {
        long funcion = UsuarioConstants.FUNCION_CONSULTAR_USUARIO;
        String campo = this.getCampoIdUsuarioSupervisor1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
//      return this.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton);
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(funcion, campo, boton, this.getFiltroBusquedaIdUsuarioSupervisor());
    }

    public String getScriptCampoIdUsuarioSupervisor1Boton2() {
//      String urx = URX2.DETALLE_USUARIO;
//      Long id = this.usuarioIdUsuarioSupervisor == null ? null : this.usuarioIdUsuarioSupervisor.getIdUsuario();
//      return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
        return null;
    }

    private boolean isCampoIdUsuarioSupervisor1Boton2Rendered() {
        return this.isIdUsuarioSupervisorRendered();
    }

    private Bit bitCampoIdUsuarioSupervisor1Boton2Rendered = new Bit() {
        // override metodo isOn

        @Override
        public boolean isOn() {
            return isCampoIdUsuarioSupervisor1Boton2Rendered();
        }

    };

    public Bit getBitCampoIdUsuarioSupervisor1Boton2Rendered() {
        return bitCampoIdUsuarioSupervisor1Boton2Rendered;
    }

    private boolean isCampoIdUsuarioSupervisor1Boton3Rendered() {
        return !this.isCampoIdUsuarioSupervisor1Boton2Rendered();
    }

    private Bit bitCampoIdUsuarioSupervisor1Boton3Rendered = new Bit() {
        // override metodo isOn

        @Override
        public boolean isOn() {
            return isCampoIdUsuarioSupervisor1Boton3Rendered();
        }

    };

    public Bit getBitCampoIdUsuarioSupervisor1Boton3Rendered() {
        return bitCampoIdUsuarioSupervisor1Boton3Rendered;
    }

    // </editor-fold>
/**/
    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>
/**/
    // <editor-fold defaultstate="collapsed" desc="botones de accion de la plantilla #4">
    public String botonAplicar1_action() {
        return null;
    }

    public String botonProcesar1_action() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == 0 ? null
                : f == FUNCION_ACCION_1 ? this.accion1(f) /* designarSuperUsuario */
                : f == FUNCION_ACCION_2 ? this.accion2(f) /* anularSuperUsuario */
                : f == FUNCION_ACCION_3 ? this.accion3(f) /* desactivarUsuario */
                : f == FUNCION_ACCION_4 ? this.accion4(f) /* reactivarUsuario */
                : f == FUNCION_ACCION_5 ? this.accion5(f) /* sincronizarUsuario */
                : f == FUNCION_ACCION_6 ? this.accion6(f) /* asignarPasswordUsuario */
                : f == FUNCION_ACCION_7 ? this.accion7(f) /* asignarSupervisorUsuario */
                : null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para ejecutar funciones">
    private String accion1(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.designarSuperUsuario();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("designar super usuario"));
        }
        return null;
    }

    private String accion2(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.anularSuperUsuario();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("anular super usuario"));
        }
        return null;
    }

    private String accion3(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.desactivarUsuario();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("desactivar usuario"));
        }
        return null;
    }

    private String accion4(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.reactivarUsuario();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("reactivar usuario"));
        }
        return null;
    }

    private String accion5(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.sincronizarUsuario();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("sincronizar usuario"));
        }
        return null;
    }

    private String accion6(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.asignarPasswordUsuario();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("asignar password usuario"));
        }
        return null;
    }

    private String accion7(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.asignarSupervisorUsuario();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("asignar supervisor usuario"));
        }
        return null;
    }

    // </editor-fold>

    /**/
    boolean synchronously = false;

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @EJB
    private UsuarioBusinessProcessLocal usuarioBusinessProcess;

    private void designarSuperUsuario() { /* designar super usuario */
        this.designarSuperUsuario(synchronously);
    }

    private void designarSuperUsuario(boolean synchronously) { /* designar super usuario */
        try {
            Long idUsuario = this.getUsuarioIdUsuario() == null ? null : this.getUsuarioIdUsuario().getIdUsuario();
            DesignarSuperUsuarioMessage message = new DesignarSuperUsuarioMessage(idUsuario);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.usuarioBusinessProcess.designarSuperUsuario(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void anularSuperUsuario() { /* anular super usuario */
        this.anularSuperUsuario(synchronously);
    }

    private void anularSuperUsuario(boolean synchronously) { /* anular super usuario */
        try {
            Long idUsuario = this.getUsuarioIdUsuario() == null ? null : this.getUsuarioIdUsuario().getIdUsuario();
            AnularSuperUsuarioMessage message = new AnularSuperUsuarioMessage(idUsuario);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.usuarioBusinessProcess.anularSuperUsuario(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void desactivarUsuario() { /* desactivar usuario */
        this.desactivarUsuario(synchronously);
    }

    private void desactivarUsuario(boolean synchronously) { /* desactivar usuario */
        try {
            Long idUsuario = this.getUsuarioIdUsuario() == null ? null : this.getUsuarioIdUsuario().getIdUsuario();
            DesactivarUsuarioMessage message = new DesactivarUsuarioMessage(idUsuario);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.usuarioBusinessProcess.desactivarUsuario(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void reactivarUsuario() { /* reactivar usuario */
        this.reactivarUsuario(synchronously);
    }

    private void reactivarUsuario(boolean synchronously) { /* reactivar usuario */
        try {
            Long idUsuario = this.getUsuarioIdUsuario() == null ? null : this.getUsuarioIdUsuario().getIdUsuario();
            ReactivarUsuarioMessage message = new ReactivarUsuarioMessage(idUsuario);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.usuarioBusinessProcess.reactivarUsuario(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void sincronizarUsuario() { /* sincronizar usuario */
        this.sincronizarUsuario(synchronously);
    }

    private void sincronizarUsuario(boolean synchronously) { /* sincronizar usuario */
        try {
            Long idUsuario = this.getUsuarioIdUsuario() == null ? null : this.getUsuarioIdUsuario().getIdUsuario();
            SincronizarUsuarioMessage message = new SincronizarUsuarioMessage(idUsuario);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.usuarioBusinessProcess.sincronizarUsuario(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void asignarPasswordUsuario() { /* asignar password usuario */
        this.asignarPasswordUsuario(synchronously);
    }

    private void asignarPasswordUsuario(boolean synchronously) { /* asignar password usuario */
        try {
            Long idUsuario = this.getUsuarioIdUsuario() == null ? null : this.getUsuarioIdUsuario().getIdUsuario();
            String passwordUsuario = Utils.Digest(this.getTextoCampoPasswordUsuario1());
            AsignarPasswordUsuarioMessage message = new AsignarPasswordUsuarioMessage(idUsuario, passwordUsuario);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.usuarioBusinessProcess.asignarPasswordUsuario(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void asignarSupervisorUsuario() { /* asignar supervisor usuario */
        this.asignarSupervisorUsuario(synchronously);
    }

    private void asignarSupervisorUsuario(boolean synchronously) { /* asignar supervisor usuario */
        try {
            Long idUsuario = this.getUsuarioIdUsuario() == null ? null : this.getUsuarioIdUsuario().getIdUsuario();
            Long idUsuarioSupervisor = this.getUsuarioIdUsuarioSupervisor() == null ? null : this.getUsuarioIdUsuarioSupervisor().getIdUsuario();
            AsignarSupervisorUsuarioMessage message = new AsignarSupervisorUsuarioMessage(idUsuario, idUsuarioSupervisor);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.usuarioBusinessProcess.asignarSupervisorUsuario(message);
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
