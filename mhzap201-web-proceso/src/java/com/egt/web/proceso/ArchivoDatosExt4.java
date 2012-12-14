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

import com.egt.base.entity.constants.ArchivoDatosExtConstants;
import com.egt.ejb.persistence.entity.ArchivoDatosExt;
import com.egt.ejb.persistence.facade.ArchivoDatosExtFacadeLocal;
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
import com.egt.ejb.business.message.CargarArchivoDatosExtMessage;
import com.egt.ejb.business.message.ImportarArchivoDatosExtMessage;
import com.egt.ejb.business.process.ArchivoDatosExtBusinessProcessLocal;
import java.util.Date;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;

public class ArchivoDatosExt4 extends AbstractPageBean
        implements PaginaBasicaConAccionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        validatorNombreArchivoDatosExt1.setMaximum(2000);
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

    private Label labelIdArchivoDatosExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdArchivoDatosExt1() {
        return labelIdArchivoDatosExt1;
    }

    public void setLabelIdArchivoDatosExt1(Label l) {
        this.labelIdArchivoDatosExt1 = l;
    }

    private TextField campoIdArchivoDatosExt1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getCampoIdArchivoDatosExt1() {
        return campoIdArchivoDatosExt1;
    }

    public void setCampoIdArchivoDatosExt1(TextField component) {
        this.campoIdArchivoDatosExt1 = component;
    }

    private HelpInline helpInlineIdArchivoDatosExt1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineIdArchivoDatosExt1() {
        return helpInlineIdArchivoDatosExt1;
    }

    public void setHelpInlineIdArchivoDatosExt1(HelpInline hi) {
        this.helpInlineIdArchivoDatosExt1 = hi;
    }

    private StaticText campoIdArchivoDatosExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoIdArchivoDatosExt1Texto1() {
        return campoIdArchivoDatosExt1Texto1;
    }

    public void setCampoIdArchivoDatosExt1Texto1(StaticText component) {
        this.campoIdArchivoDatosExt1Texto1 = component;
    }

    private Button campoIdArchivoDatosExt1Boton1 = new com.egt.core.jsf.component.BotonBuscar();

    public Button getCampoIdArchivoDatosExt1Boton1() {
        return campoIdArchivoDatosExt1Boton1;
    }

    public void setCampoIdArchivoDatosExt1Boton1(Button component) {
        this.campoIdArchivoDatosExt1Boton1 = component;
    }

    private Button campoIdArchivoDatosExt1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdArchivoDatosExt1Boton3() {
        return campoIdArchivoDatosExt1Boton3;
    }

    public void setCampoIdArchivoDatosExt1Boton3(Button component) {
        this.campoIdArchivoDatosExt1Boton3 = component;
    }

    private Label labelIdArchivoDatosExt2 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelIdArchivoDatosExt2() {
        return labelIdArchivoDatosExt2;
    }

    public void setLabelIdArchivoDatosExt2(Label l) {
        this.labelIdArchivoDatosExt2 = l;
    }

    private StaticText campoIdArchivoDatosExt1Texto2 = new com.egt.core.jsf.component.TextoEstaticoComplementario();

    public StaticText getCampoIdArchivoDatosExt1Texto2() {
        return campoIdArchivoDatosExt1Texto2;
    }

    public void setCampoIdArchivoDatosExt1Texto2(StaticText component) {
        this.campoIdArchivoDatosExt1Texto2 = component;
    }

    private Button campoIdArchivoDatosExt1Boton2 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoIdArchivoDatosExt1Boton2() {
        return campoIdArchivoDatosExt1Boton2;
    }

    public void setCampoIdArchivoDatosExt1Boton2(Button component) {
        this.campoIdArchivoDatosExt1Boton2 = component;
    }

    private Label labelNombreArchivoDatosExt1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelNombreArchivoDatosExt1() {
        return labelNombreArchivoDatosExt1;
    }

    public void setLabelNombreArchivoDatosExt1(Label l) {
        this.labelNombreArchivoDatosExt1 = l;
    }

    private Upload campoNombreArchivoDatosExt1 = new com.egt.core.jsf.component.CampoArchivo();

    public Upload getCampoNombreArchivoDatosExt1() {
        return campoNombreArchivoDatosExt1;
    }

    public void setCampoNombreArchivoDatosExt1(Upload component) {
        this.campoNombreArchivoDatosExt1 = component;
    }

    private HelpInline helpInlineNombreArchivoDatosExt1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineNombreArchivoDatosExt1() {
        return helpInlineNombreArchivoDatosExt1;
    }

    public void setHelpInlineNombreArchivoDatosExt1(HelpInline hi) {
        this.helpInlineNombreArchivoDatosExt1 = hi;
    }

    private StaticText campoNombreArchivoDatosExt1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoNombreArchivoDatosExt1Texto1() {
        return campoNombreArchivoDatosExt1Texto1;
    }

    public void setCampoNombreArchivoDatosExt1Texto1(StaticText component) {
        this.campoNombreArchivoDatosExt1Texto1 = component;
    }

    private Button campoNombreArchivoDatosExt1Boton3 = new com.egt.core.jsf.component.BotonVerDetalle();

    public Button getCampoNombreArchivoDatosExt1Boton3() {
        return campoNombreArchivoDatosExt1Boton3;
    }

    public void setCampoNombreArchivoDatosExt1Boton3(Button component) {
        this.campoNombreArchivoDatosExt1Boton3 = component;
    }

    private LengthValidator validatorNombreArchivoDatosExt1 = new LengthValidator();
  
    public LengthValidator getValidatorNombreArchivoDatosExt1() {
        return validatorNombreArchivoDatosExt1;
    }
  
    public void setValidatorNombreArchivoDatosExt1(LengthValidator validator) {
        this.validatorNombreArchivoDatosExt1 = validator;
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
    public ArchivoDatosExt4() {
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
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("ArchivoDatosExt4_ETIQUETA_MIGAS_PAN");

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina basica">
    private GestorPaginaBasica gestor = new GestorPaginaBasica(this);

    public GestorPaginaBasica getGestor() {
        return this.gestor;
    }
    // </editor-fold>
/**/
    static long FUNCION_ACCION_1 = ArchivoDatosExtConstants.FUNCION_CARGAR_ARCHIVO_DATOS_EXT;

    static long FUNCION_ACCION_2 = ArchivoDatosExtConstants.FUNCION_IMPORTAR_ARCHIVO_DATOS_EXT;

    @Override
    public Option[] getOpcionesListaFuncionAccion() {
        Option[] opciones = new Option[]{
            new Option("", this.getGestor().getI18n().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion()),
            new Option(FUNCION_ACCION_1, BundleWebui.getString("cargar_archivo_datos_ext")),
            new Option(FUNCION_ACCION_2, BundleWebui.getString("importar_archivo_datos_ext"))
        };
        return this.getGestor().getOpcionesListaFuncionAccionAutorizadas(opciones);
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isIdArchivoDatosExtRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == 0 || f == FUNCION_ACCION_1 || f == FUNCION_ACCION_2;
    }

    private Bit bitIdArchivoDatosExtRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isIdArchivoDatosExtRendered();
        }
    };

    public Bit getBitIdArchivoDatosExtRendered() {
        return bitIdArchivoDatosExtRendered;
    }

    public boolean isNombreArchivoDatosExtRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_1;
    }

    private Bit bitNombreArchivoDatosExtRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isNombreArchivoDatosExtRendered();
        }
    };

    public Bit getBitNombreArchivoDatosExtRendered() {
        return bitNombreArchivoDatosExtRendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Facades">
    @EJB
    private ArchivoDatosExtFacadeLocal archivoDatosExtFacade;

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
        this.initArchivoDatosExtIdArchivoDatosExt();
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

    // <editor-fold defaultstate="collapsed" desc="metodos para buscar, validar y establecer idArchivoDatosExt">
    private ArchivoDatosExt archivoDatosExtIdArchivoDatosExt;

    private FiltroBusqueda getFiltroBusquedaIdArchivoDatosExt() {
        FiltroBusqueda filtro = new FiltroBusqueda();
        /*
        String columna;
        EnumOperadorCom comparacion;
        Object valor;
        filtro.addCriterio(columna, comparacion, valor);
        */
        return filtro;
    }

    public ArchivoDatosExt getArchivoDatosExtIdArchivoDatosExt() {
        return this.archivoDatosExtIdArchivoDatosExt;
    }

    private void initArchivoDatosExtIdArchivoDatosExt() {
        Long id = this.getContextoPeticion().getIdentificacionRecurso();
        this.archivoDatosExtIdArchivoDatosExt = id == null ? null : this.archivoDatosExtFacade.find(id, true);
    }

    public void campoIdArchivoDatosExt1_validate(FacesContext context, UIComponent component, Object value) {
        this.archivoDatosExtIdArchivoDatosExt = null;
        String string = STP.getString(value);
        if (string != null && !string.trim().equals("")) {
            try {
                Object o = STP.getObjetoCodigoRecurso(string);
                String c = ArchivoDatosExtConstants.COLUMNA_IDENTIFICACION_RECURSO;
                FiltroBusqueda filtro = getFiltroBusquedaIdArchivoDatosExt();
                String query = "select * from archivo_datos_ext ";
                List<ArchivoDatosExt> lista;
                boolean refresh = false;
                if (o instanceof Long) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.archivoDatosExtIdArchivoDatosExt = this.archivoDatosExtFacade.find(o, refresh);
                    } else {
                        filtro.addCriterio(ArchivoDatosExtConstants.COLUMNA_IDENTIFICACION_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.archivoDatosExtFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.archivoDatosExtIdArchivoDatosExt = lista.get(0);
                        }
                    }
                } else if (o instanceof String) {
                    if (filtro == null || StringUtils.isBlank(filtro.toString())) {
                        this.archivoDatosExtIdArchivoDatosExt = this.archivoDatosExtFacade.findByCodigo(o.toString(), refresh);
                    } else {
                        filtro.addCriterio(ArchivoDatosExtConstants.COLUMNA_CODIGO_RECURSO, EnumOperadorCom.ES_IGUAL, o);
                        query += "where " + filtro;
                        lista = this.archivoDatosExtFacade.findByQuery(query, EnumTipoQuery.NATIVE);
                        if (lista != null && !lista.isEmpty()) {
                            this.archivoDatosExtIdArchivoDatosExt = lista.get(0);
                        }
                    }
                }
                if (this.archivoDatosExtIdArchivoDatosExt == null) {
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

    private String textoCampoIdArchivoDatosExt1;

    public String getTextoCampoIdArchivoDatosExt1() {
        return this.textoCampoIdArchivoDatosExt1 != null ? this.textoCampoIdArchivoDatosExt1
                : this.archivoDatosExtIdArchivoDatosExt != null ? this.archivoDatosExtIdArchivoDatosExt.getCodigoArchivoDatosExt()
                : null;
    }

    public void setTextoCampoIdArchivoDatosExt1(String valor) {
        this.textoCampoIdArchivoDatosExt1 = valor;
    }

    public String getToolTipCampoIdArchivoDatosExt1() {
        return this.archivoDatosExtIdArchivoDatosExt == null ? null : STP.trimToStringRecursoSinNombre(this.archivoDatosExtIdArchivoDatosExt.getNombreArchivoDatosExt());
    }

    public String getScriptCampoIdArchivoDatosExt1Boton1() {
        long funcion = ArchivoDatosExtConstants.FUNCION_CONSULTAR_ARCHIVO_DATOS_EXT;
        String campo = this.getCampoIdArchivoDatosExt1().getClientId(this.getFacesContext());
        String boton = this.getBotonAplicar1().getClientId(this.getFacesContext());
        String urx = URX2.CONSULTA_TABLA_ARCHIVO_DATOS_EXT;
        return this.getGestor().getScriptAbrirVentanaBuscarCodigo(urx, funcion, campo, boton, getFiltroBusquedaIdArchivoDatosExt());
    }

    public String getScriptCampoIdArchivoDatosExt1Boton2() {
        String urx = URX2.CONSULTA_DETALLE_ARCHIVO_DATOS_EXT;
        Long id = this.archivoDatosExtIdArchivoDatosExt == null ? null : this.archivoDatosExtIdArchivoDatosExt.getIdArchivoDatosExt();
        return this.getGestor().getScriptAbrirVentanaVerDetalle(urx, id);
    }

    private boolean isCampoIdArchivoDatosExt1Boton2Rendered() {
        return this.isIdArchivoDatosExtRendered();
    }

    private Bit bitCampoIdArchivoDatosExt1Boton2Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdArchivoDatosExt1Boton2Rendered();
        }
    };

    public Bit getBitCampoIdArchivoDatosExt1Boton2Rendered() {
        return bitCampoIdArchivoDatosExt1Boton2Rendered;
    }

    private boolean isCampoIdArchivoDatosExt1Boton3Rendered() {
        return !this.isCampoIdArchivoDatosExt1Boton2Rendered();
    }

    private Bit bitCampoIdArchivoDatosExt1Boton3Rendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isCampoIdArchivoDatosExt1Boton3Rendered();
        }
    };

    public Bit getBitCampoIdArchivoDatosExt1Boton3Rendered() {
        return bitCampoIdArchivoDatosExt1Boton3Rendered;
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
                : f == FUNCION_ACCION_1 ? this.accion1(f) /* cargarArchivoDatosExt */
                : f == FUNCION_ACCION_2 ? this.accion2(f) /* importarArchivoDatosExt */
                : null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para ejecutar funciones">
    private String accion1(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            Long s = this.getArchivoDatosExtIdArchivoDatosExt() == null ? null : this.getArchivoDatosExtIdArchivoDatosExt().getProveedorDatExtIdProveedorDatExt() == null ? null : this.getArchivoDatosExtIdArchivoDatosExt().getProveedorDatExtIdProveedorDatExt().getIdProveedorDatExt();
            String csr = ArchivoDatosExtConstants.COLUMNA_SEGMENTO_RECURSO;
            boolean esSegmentoAutorizado = TLC.getControlador().esSegmentoAutorizado(s, f);
            if (esSegmentoAutorizado) {
                this.cargarArchivoDatosExt();
            } else {
                TLC.getBitacora().error(CBM2.SEGMENTO_NO_AUTORIZADO, "<" + csr + ">");
            }
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "cargar_archivo_datos_ext");
        }
        return null;
    }

    private String accion2(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            Long s = this.getArchivoDatosExtIdArchivoDatosExt() == null ? null : this.getArchivoDatosExtIdArchivoDatosExt().getProveedorDatExtIdProveedorDatExt() == null ? null : this.getArchivoDatosExtIdArchivoDatosExt().getProveedorDatExtIdProveedorDatExt().getIdProveedorDatExt();
            String csr = ArchivoDatosExtConstants.COLUMNA_SEGMENTO_RECURSO;
            boolean esSegmentoAutorizado = TLC.getControlador().esSegmentoAutorizado(s, f);
            if (esSegmentoAutorizado) {
                this.importarArchivoDatosExt();
            } else {
                TLC.getBitacora().error(CBM2.SEGMENTO_NO_AUTORIZADO, "<" + csr + ">");
            }
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, "importar_archivo_datos_ext");
        }
        return null;
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @EJB
    private ArchivoDatosExtBusinessProcessLocal archivoDatosExtBusinessProcess;

    private void cargarArchivoDatosExt() { /* cargar archivo datos ext */
        this.cargarArchivoDatosExt(synchronously);
    }

    private void cargarArchivoDatosExt(boolean synchronously) { /* cargar archivo datos ext */
        try {
            Long idArchivoDatosExt = this.getArchivoDatosExtIdArchivoDatosExt() == null ? null : this.getArchivoDatosExtIdArchivoDatosExt().getIdArchivoDatosExt();
            String nombreArchivoDatosExt = JSF.upload(this.campoNombreArchivoDatosExt1, ArchivoDatosExtConstants.CODIGO_DOMINIO_RECURSO);
            CargarArchivoDatosExtMessage message = new CargarArchivoDatosExtMessage(idArchivoDatosExt, nombreArchivoDatosExt);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.archivoDatosExtBusinessProcess.cargarArchivoDatosExt(message);
            } else {
                this.requestReply(message);
            }
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        }
    }

    private void importarArchivoDatosExt() { /* importar archivo datos ext */
        this.importarArchivoDatosExt(synchronously);
    }

    private void importarArchivoDatosExt(boolean synchronously) { /* importar archivo datos ext */
        try {
            Long idArchivoDatosExt = this.getArchivoDatosExtIdArchivoDatosExt() == null ? null : this.getArchivoDatosExtIdArchivoDatosExt().getIdArchivoDatosExt();
            ImportarArchivoDatosExtMessage message = new ImportarArchivoDatosExtMessage(idArchivoDatosExt);
            TLC.getControlador().ponerUsuarioEnMensaje(message);
            if (synchronously) {
                this.archivoDatosExtBusinessProcess.importarArchivoDatosExt(message);
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
