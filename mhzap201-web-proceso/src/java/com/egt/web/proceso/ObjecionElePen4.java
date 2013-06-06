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

import com.egt.base.entity.constants.ObjecionElePenConstants;
import com.egt.ejb.persistence.entity.ObjecionElePen;
import com.egt.ejb.persistence.facade.ObjecionElePenFacadeLocal;
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
import com.egt.ejb.business.message.AnularObjecionElePenMessage;
import com.egt.ejb.business.process.ObjecionElePenBusinessProcessLocal;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;

public class ObjecionElePen4 extends AbstractPageBean
        implements PaginaBasicaConAccionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorObservacionesAnulacion1.setMaximum(2000);
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

    private Label labelIdObjecionElePen1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdObjecionElePen1() {
        return labelIdObjecionElePen1;
    }

    public void setLabelIdObjecionElePen1(Label l) {
        this.labelIdObjecionElePen1 = l;
    }

    private TextField campoIdObjecionElePen1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdObjecionElePen1() {
        return campoIdObjecionElePen1;
    }

    public void setCampoIdObjecionElePen1(TextField component) {
        this.campoIdObjecionElePen1 = component;
    }

    private HelpInline helpInlineIdObjecionElePen1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdObjecionElePen1() {
        return helpInlineIdObjecionElePen1;
    }

    public void setHelpInlineIdObjecionElePen1(HelpInline hi) {
        this.helpInlineIdObjecionElePen1 = hi;
    }

    private StaticText campoIdObjecionElePen1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdObjecionElePen1Texto1() {
        return campoIdObjecionElePen1Texto1;
    }

    public void setCampoIdObjecionElePen1Texto1(StaticText component) {
        this.campoIdObjecionElePen1Texto1 = component;
    }

    private Button campoIdObjecionElePen1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdObjecionElePen1Boton1() {
        return campoIdObjecionElePen1Boton1;
    }

    public void setCampoIdObjecionElePen1Boton1(Button component) {
        this.campoIdObjecionElePen1Boton1 = component;
    }

    private Button campoIdObjecionElePen1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdObjecionElePen1Boton3() {
        return campoIdObjecionElePen1Boton3;
    }

    public void setCampoIdObjecionElePen1Boton3(Button component) {
        this.campoIdObjecionElePen1Boton3 = component;
    }

    private Label labelIdObjecionElePen2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdObjecionElePen2() {
        return labelIdObjecionElePen2;
    }

    public void setLabelIdObjecionElePen2(Label l) {
        this.labelIdObjecionElePen2 = l;
    }

    private StaticText campoIdObjecionElePen1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdObjecionElePen1Texto2() {
        return campoIdObjecionElePen1Texto2;
    }

    public void setCampoIdObjecionElePen1Texto2(StaticText component) {
        this.campoIdObjecionElePen1Texto2 = component;
    }

    private Button campoIdObjecionElePen1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdObjecionElePen1Boton2() {
        return campoIdObjecionElePen1Boton2;
    }

    public void setCampoIdObjecionElePen1Boton2(Button component) {
        this.campoIdObjecionElePen1Boton2 = component;
    }

    private Label labelObservacionesAnulacion1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelObservacionesAnulacion1() {
        return labelObservacionesAnulacion1;
    }

    public void setLabelObservacionesAnulacion1(Label l) {
        this.labelObservacionesAnulacion1 = l;
    }

    private TextField campoObservacionesAnulacion1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoObservacionesAnulacion1() {
        return campoObservacionesAnulacion1;
    }

    public void setCampoObservacionesAnulacion1(TextField component) {
        this.campoObservacionesAnulacion1 = component;
    }

    private HelpInline helpInlineObservacionesAnulacion1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineObservacionesAnulacion1() {
        return helpInlineObservacionesAnulacion1;
    }

    public void setHelpInlineObservacionesAnulacion1(HelpInline hi) {
        this.helpInlineObservacionesAnulacion1 = hi;
    }

    private StaticText campoObservacionesAnulacion1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoObservacionesAnulacion1Texto1() {
        return campoObservacionesAnulacion1Texto1;
    }

    public void setCampoObservacionesAnulacion1Texto1(StaticText component) {
        this.campoObservacionesAnulacion1Texto1 = component;
    }

    private LengthValidator validatorObservacionesAnulacion1 = new LengthValidator();
  
    public LengthValidator getValidatorObservacionesAnulacion1() {
        return validatorObservacionesAnulacion1;
    }
  
    public void setValidatorObservacionesAnulacion1(LengthValidator validator) {
        this.validatorObservacionesAnulacion1 = validator;
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
    public ObjecionElePen4() {
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
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("ObjecionElePen4_ETIQUETA_MIGAS_PAN");

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina basica">
    private GestorPaginaBasica gestor = new GestorPaginaBasica(this);

    public GestorPaginaBasica getGestor() {
        return this.gestor;
    }
    // </editor-fold>
/**/
    static long FUNCION_ACCION_1 = ObjecionElePenConstants.FUNCION_ANULAR_OBJECION_ELE_PEN;

    @Override
    public Option[] getOpcionesListaFuncionAccion() {
        Option[] opciones = new Option[]{
            new Option("", this.getGestor().getI18n().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion()),
            new Option(FUNCION_ACCION_1, BundleWebui.getString("anular_objecion_ele_pen"))
        };
        return this.getGestor().getOpcionesListaFuncionAccionAutorizadas(opciones);
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isIdObjecionElePenRendered() {
//      long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
//      return f == FUNCION_ACCION_1;
        return true;
    }

    private Bit bitIdObjecionElePenRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdObjecionElePenRendered();
        }
    };

    public Bit getBitIdObjecionElePenRendered() {
        return bitIdObjecionElePenRendered;
    }

    public boolean isObservacionesAnulacionRendered() {
//      long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
//      return f == FUNCION_ACCION_1;
        return true;
    }

    private Bit bitObservacionesAnulacionRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isObservacionesAnulacionRendered();
        }
    };

    public Bit getBitObservacionesAnulacionRendered() {
        return bitObservacionesAnulacionRendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Facades">
    @EJB
    private ObjecionElePenFacadeLocal objecionElePenFacade;

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
        this.initObjecionElePenIdObjecionElePen();
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
    private String textoCampoObservacionesAnulacion1;

    public String getTextoCampoObservacionesAnulacion1() {
        return this.textoCampoObservacionesAnulacion1;
    }

    public void setTextoCampoObservacionesAnulacion1(String valor) {
        this.textoCampoObservacionesAnulacion1 = valor;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idObjecionElePen">
    private ObjecionElePen objecionElePenIdObjecionElePen;

    private FiltroBusqueda getFiltroBusquedaIdObjecionElePen() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public ObjecionElePen getObjecionElePenIdObjecionElePen() {
        return this.objecionElePenIdObjecionElePen;
    }

    private void initObjecionElePenIdObjecionElePen() {
        Long id = this.getContextoPeticion().getIdentificacionRecurso();
        this.objecionElePenIdObjecionElePen = id == null ? null : this.objecionElePenFacade.find(id, true);
    }

    public void campoIdObjecionElePen1_validate(FacesContext context, UIComponent component, Object value) {
        this.objecionElePenIdObjecionElePen = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string, true); /* cast String as Long */
                String c = ObjecionElePenConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdObjecionElePen();
                String query = "select * from objecion_ele_pen ";
                List<ObjecionElePen> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.objecionElePenIdObjecionElePen = this.objecionElePenFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(ObjecionElePenConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.objecionElePenFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.objecionElePenIdObjecionElePen = lista.get(0);
                        }
                    }
//              } else if (o instanceof String) {
//                  this.objecionElePenIdObjecionElePen = this.objecionElePenFacade.findByCodigo(o.toString(), refresh);
                }
                if (this.objecionElePenIdObjecionElePen == null) {
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

    private String textoCampoIdObjecionElePen1;

    public String getTextoCampoIdObjecionElePen1() {
        return this.textoCampoIdObjecionElePen1 != null ? this.textoCampoIdObjecionElePen1
                : this.objecionElePenIdObjecionElePen != null ? STP.getStringCodigoRecurso(this.objecionElePenIdObjecionElePen.getIdObjecionElePen())
                : null;
    }

    public void setTextoCampoIdObjecionElePen1(String valor) {
        this.textoCampoIdObjecionElePen1 = valor;
    }

    public String getToolTipCampoIdObjecionElePen1() {
        return this.objecionElePenIdObjecionElePen == null ? null : STP.trimToStringRecursoSinNombre(null); /* TODO: escoger el getter para obtener el nombre del recurso */
//      return this.objecionElePenIdObjecionElePen == null ? null : STP.trimToStringRecursoSinNombre(this.objecionElePenIdObjecionElePen.getNombreObjecionElePen());
    }

    public String getScriptCampoIdObjecionElePen1Boton1() {
        long funcion = ObjecionElePenConstants.FUNCION_CONSULTAR_OBJECION_ELE_PEN;
        String campo = this.getCampoIdObjecionElePen1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_OBJECION_ELE_PEN;
        return this.getGestor().getScriptAbrirVentanaBuscarIdentificacion(urx, funcion, campo, boton, getFiltroBusquedaIdObjecionElePen());
    }

    public String getScriptCampoIdObjecionElePen1Boton2() {
        String urx = URX2.CONSULTA_DETALLE_OBJECION_ELE_PEN;
        Long id = this.objecionElePenIdObjecionElePen == null ? null : this.objecionElePenIdObjecionElePen.getIdObjecionElePen();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    private boolean isCampoIdObjecionElePen1Boton2Rendered() {
//      return this.isIdObjecionElePenRendered();
        return false; /* TODO: retornar isIdObjecionElePenRendered() al escoger el getter para obtener el nombre del recurso */
    }

    private Bit bitCampoIdObjecionElePen1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdObjecionElePen1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdObjecionElePen1Boton2Rendered() {
        return bitCampoIdObjecionElePen1Boton2Rendered;
    }

    private boolean isCampoIdObjecionElePen1Boton3Rendered() {
        return !this.isCampoIdObjecionElePen1Boton2Rendered();
    }

    private Bit bitCampoIdObjecionElePen1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdObjecionElePen1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdObjecionElePen1Boton3Rendered() {
        return bitCampoIdObjecionElePen1Boton3Rendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer las opciones de las listas desplegables">
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="botones de accion de la plantilla #4">
    public String botonAplicar1_action() {
        return null;
    }

    public String botonProcesar1_action() {
        return this.accion1(FUNCION_ACCION_1); /* anularObjecionElePen */
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para ejecutar funciones">
    private String accion1(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.anularObjecionElePen();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "anular_objecion_ele_pen");
        }
        return null;
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @EJB
    private ObjecionElePenBusinessProcessLocal objecionElePenBusinessProcess;

    private void anularObjecionElePen() { /* anular objecion ele pen */
        this.anularObjecionElePen(synchronously);
    }

    private void anularObjecionElePen(boolean synchronously) { /* anular objecion ele pen */
        try {
            Long idObjecionElePen = this.getObjecionElePenIdObjecionElePen() == null ? null : this.getObjecionElePenIdObjecionElePen().getIdObjecionElePen();
            String observacionesAnulacion = this.getTextoCampoObservacionesAnulacion1();
            AnularObjecionElePenMessage message = new AnularObjecionElePenMessage(idObjecionElePen, observacionesAnulacion);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.objecionElePenBusinessProcess.anularObjecionElePen(message);
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
