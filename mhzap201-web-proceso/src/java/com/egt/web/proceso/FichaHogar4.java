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

import com.egt.base.entity.constants.FichaHogarConstants;
import com.egt.ejb.persistence.entity.FichaHogar;
import com.egt.ejb.persistence.facade.FichaHogarFacadeLocal;
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
import com.egt.ejb.business.message.DesactivarFichaHogarMessage;
import com.egt.ejb.business.message.ReactivarFichaHogarMessage;
import com.egt.ejb.business.message.CalcularIcvFichaHogarMessage;
import com.egt.ejb.business.process.FichaHogarBusinessProcessLocal;
import java.math.BigDecimal;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;

public class FichaHogar4 extends AbstractPageBean
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

    private Label labelIdFichaHogar1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaHogar1() {
        return labelIdFichaHogar1;
    }

    public void setLabelIdFichaHogar1(Label l) {
        this.labelIdFichaHogar1 = l;
    }

    private TextField campoIdFichaHogar1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdFichaHogar1() {
        return campoIdFichaHogar1;
    }

    public void setCampoIdFichaHogar1(TextField component) {
        this.campoIdFichaHogar1 = component;
    }

    private HelpInline helpInlineIdFichaHogar1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdFichaHogar1() {
        return helpInlineIdFichaHogar1;
    }

    public void setHelpInlineIdFichaHogar1(HelpInline hi) {
        this.helpInlineIdFichaHogar1 = hi;
    }

    private StaticText campoIdFichaHogar1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdFichaHogar1Texto1() {
        return campoIdFichaHogar1Texto1;
    }

    public void setCampoIdFichaHogar1Texto1(StaticText component) {
        this.campoIdFichaHogar1Texto1 = component;
    }

    private Button campoIdFichaHogar1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdFichaHogar1Boton1() {
        return campoIdFichaHogar1Boton1;
    }

    public void setCampoIdFichaHogar1Boton1(Button component) {
        this.campoIdFichaHogar1Boton1 = component;
    }

    private Button campoIdFichaHogar1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFichaHogar1Boton3() {
        return campoIdFichaHogar1Boton3;
    }

    public void setCampoIdFichaHogar1Boton3(Button component) {
        this.campoIdFichaHogar1Boton3 = component;
    }

    private Label labelIdFichaHogar2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdFichaHogar2() {
        return labelIdFichaHogar2;
    }

    public void setLabelIdFichaHogar2(Label l) {
        this.labelIdFichaHogar2 = l;
    }

    private StaticText campoIdFichaHogar1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdFichaHogar1Texto2() {
        return campoIdFichaHogar1Texto2;
    }

    public void setCampoIdFichaHogar1Texto2(StaticText component) {
        this.campoIdFichaHogar1Texto2 = component;
    }

    private Button campoIdFichaHogar1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdFichaHogar1Boton2() {
        return campoIdFichaHogar1Boton2;
    }

    public void setCampoIdFichaHogar1Boton2(Button component) {
        this.campoIdFichaHogar1Boton2 = component;
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
    public FichaHogar4() {
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
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("FichaHogar4_ETIQUETA_MIGAS_PAN");

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina basica">
    private GestorPaginaBasica gestor = new GestorPaginaBasica(this);

    public GestorPaginaBasica getGestor() {
        return this.gestor;
    }
    // </editor-fold>
/**/
    static long FUNCION_ACCION_1 = FichaHogarConstants.FUNCION_DESACTIVAR_FICHA_HOGAR;

    static long FUNCION_ACCION_2 = FichaHogarConstants.FUNCION_REACTIVAR_FICHA_HOGAR;

    static long FUNCION_ACCION_3 = FichaHogarConstants.FUNCION_CALCULAR_ICV_FICHA_HOGAR;

    @Override
    public Option[] getOpcionesListaFuncionAccion() {
        Option[] opciones = new Option[]{
            new Option("", this.getGestor().getI18n().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion()),
            new Option(FUNCION_ACCION_1, Bundle.getString("desactivar")),
            new Option(FUNCION_ACCION_2, Bundle.getString("reactivar")),
            new Option(FUNCION_ACCION_3, Bundle.getString("calcular icv"))
        };
        return this.getGestor().getOpcionesListaFuncionAccionAutorizadas(opciones);
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isIdFichaHogarRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == 0 || f == FUNCION_ACCION_1 || f == FUNCION_ACCION_2 || f == FUNCION_ACCION_3;
    }

    private Bit bitIdFichaHogarRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdFichaHogarRendered();
        }
    };

    public Bit getBitIdFichaHogarRendered() {
        return bitIdFichaHogarRendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Facades">
    @EJB
    private FichaHogarFacadeLocal fichaHogarFacade;

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
        this.initFichaHogarIdFichaHogar();
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idFichaHogar">
    private FichaHogar fichaHogarIdFichaHogar;

    private FiltroBusqueda getFiltroBusquedaIdFichaHogar() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public FichaHogar getFichaHogarIdFichaHogar() {
        return this.fichaHogarIdFichaHogar;
    }

    private void initFichaHogarIdFichaHogar() {
        Long id = this.getContextoPeticion().getIdentificacionRecurso();
        this.fichaHogarIdFichaHogar = id == null ? null : this.fichaHogarFacade.find(id, true);
    }

    public void campoIdFichaHogar1_validate(FacesContext context, UIComponent component, Object value) {
        this.fichaHogarIdFichaHogar = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = FichaHogarConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdFichaHogar();
                String query = "select * from ficha_hogar ";
                List<FichaHogar> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.fichaHogarIdFichaHogar = this.fichaHogarFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(FichaHogarConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.fichaHogarFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.fichaHogarIdFichaHogar = lista.get(0);
                        }
                    }
                } else if (o instanceof String) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.fichaHogarIdFichaHogar = this.fichaHogarFacade.findByCodigo(o.toString(), refresh);
                    } else {
                        filtro.addCriterio(FichaHogarConstants.COLUMNA_CODIGO_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.fichaHogarFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.fichaHogarIdFichaHogar = lista.get(0);
                        }
                    }
                }
                if (this.fichaHogarIdFichaHogar == null) {
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

    private String textoCampoIdFichaHogar1;

    public String getTextoCampoIdFichaHogar1() {
        return this.textoCampoIdFichaHogar1 != null ? this.textoCampoIdFichaHogar1
                : this.fichaHogarIdFichaHogar != null ? this.fichaHogarIdFichaHogar.getCodigoFichaHogar()
                : null;
    }

    public void setTextoCampoIdFichaHogar1(String valor) {
        this.textoCampoIdFichaHogar1 = valor;
    }

    public String getToolTipCampoIdFichaHogar1() {
        return this.fichaHogarIdFichaHogar == null ? null : STP.trimToStringRecursoSinNombre(null); /* TODO: escoger el getter para obtener el nombre del recurso */
//      return this.fichaHogarIdFichaHogar == null ? null : STP.trimToStringRecursoSinNombre(this.fichaHogarIdFichaHogar.getNombreFichaHogar());
    }

    public String getScriptCampoIdFichaHogar1Boton1() {
        long funcion = FichaHogarConstants.FUNCION_CONSULTAR_FICHA_HOGAR;
        String campo = this.getCampoIdFichaHogar1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_FICHA_HOGAR;
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, getFiltroBusquedaIdFichaHogar());
    }

    public String getScriptCampoIdFichaHogar1Boton2() {
        String urx = URX2.CONSULTA_DETALLE_FICHA_HOGAR;
        Long id = this.fichaHogarIdFichaHogar == null ? null : this.fichaHogarIdFichaHogar.getIdFichaHogar();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    private boolean isCampoIdFichaHogar1Boton2Rendered() {
//      return this.isIdFichaHogarRendered();
        return false; /* TODO: retornar isIdFichaHogarRendered() al escoger el getter para obtener el nombre del recurso */
    }

    private Bit bitCampoIdFichaHogar1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdFichaHogar1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdFichaHogar1Boton2Rendered() {
        return bitCampoIdFichaHogar1Boton2Rendered;
    }

    private boolean isCampoIdFichaHogar1Boton3Rendered() {
        return !this.isCampoIdFichaHogar1Boton2Rendered();
    }

    private Bit bitCampoIdFichaHogar1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdFichaHogar1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdFichaHogar1Boton3Rendered() {
        return bitCampoIdFichaHogar1Boton3Rendered;
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
                : f == FUNCION_ACCION_1 ? this.accion1(f) /* desactivarFichaHogar */
                : f == FUNCION_ACCION_2 ? this.accion2(f) /* reactivarFichaHogar */
                : f == FUNCION_ACCION_3 ? this.accion3(f) /* calcularIcvFichaHogar */
                : null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para ejecutar funciones">
    private String accion1(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.desactivarFichaHogar();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("desactivar ficha hogar"));
        }
        return null;
    }

    private String accion2(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.reactivarFichaHogar();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("reactivar ficha hogar"));
        }
        return null;
    }

    private String accion3(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.calcularIcvFichaHogar();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("calcular icv ficha hogar"));
        }
        return null;
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @EJB
    private FichaHogarBusinessProcessLocal fichaHogarBusinessProcess;

    private void desactivarFichaHogar() { /* desactivar ficha hogar */
        this.desactivarFichaHogar(synchronously);
    }

    private void desactivarFichaHogar(boolean synchronously) { /* desactivar ficha hogar */
        try {
            Long idFichaHogar = this.getFichaHogarIdFichaHogar() == null ? null : this.getFichaHogarIdFichaHogar().getIdFichaHogar();
            DesactivarFichaHogarMessage message = new DesactivarFichaHogarMessage(idFichaHogar);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.fichaHogarBusinessProcess.desactivarFichaHogar(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void reactivarFichaHogar() { /* reactivar ficha hogar */
        this.reactivarFichaHogar(synchronously);
    }

    private void reactivarFichaHogar(boolean synchronously) { /* reactivar ficha hogar */
        try {
            Long idFichaHogar = this.getFichaHogarIdFichaHogar() == null ? null : this.getFichaHogarIdFichaHogar().getIdFichaHogar();
            ReactivarFichaHogarMessage message = new ReactivarFichaHogarMessage(idFichaHogar);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.fichaHogarBusinessProcess.reactivarFichaHogar(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void calcularIcvFichaHogar() { /* calcular icv ficha hogar */
        this.calcularIcvFichaHogar(synchronously);
    }

    private void calcularIcvFichaHogar(boolean synchronously) { /* calcular icv ficha hogar */
        try {
            Long idFichaHogar = this.getFichaHogarIdFichaHogar() == null ? null : this.getFichaHogarIdFichaHogar().getIdFichaHogar();
            CalcularIcvFichaHogarMessage message = new CalcularIcvFichaHogarMessage(idFichaHogar);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.fichaHogarBusinessProcess.calcularIcvFichaHogar(message);
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
