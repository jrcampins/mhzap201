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

import com.egt.base.entity.constants.InformeAuditoriaConstants;
import com.egt.ejb.persistence.entity.InformeAuditoria;
import com.egt.ejb.persistence.facade.InformeAuditoriaFacadeLocal;
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
import com.egt.ejb.core.reporter.ReporterBrokerLocal;
import java.util.Date;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;

public class InformeAuditoria4 extends AbstractPageBean
        implements PaginaBasicaConAccionMultiple {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    private void _init() throws Exception {
        converterFechaTransaccionDesde1.setPattern("dd/MM/yyyy");
        converterFechaTransaccionDesde1.setType("date");
        converterFechaTransaccionHasta1.setPattern("dd/MM/yyyy");
        converterFechaTransaccionHasta1.setType("date");
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

    private Label labelFechaTransaccionDesde1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaTransaccionDesde1() {
        return labelFechaTransaccionDesde1;
    }

    public void setLabelFechaTransaccionDesde1(Label l) {
        this.labelFechaTransaccionDesde1 = l;
    }

    private Calendar campoFechaTransaccionDesde1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaTransaccionDesde1() {
        return campoFechaTransaccionDesde1;
    }

    public void setCampoFechaTransaccionDesde1(Calendar component) {
        this.campoFechaTransaccionDesde1 = component;
    }

    private HelpInline helpInlineFechaTransaccionDesde1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaTransaccionDesde1() {
        return helpInlineFechaTransaccionDesde1;
    }

    public void setHelpInlineFechaTransaccionDesde1(HelpInline hi) {
        this.helpInlineFechaTransaccionDesde1 = hi;
    }

    private StaticText campoFechaTransaccionDesde1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaTransaccionDesde1Texto1() {
        return campoFechaTransaccionDesde1Texto1;
    }

    public void setCampoFechaTransaccionDesde1Texto1(StaticText component) {
        this.campoFechaTransaccionDesde1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaTransaccionDesde1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaTransaccionDesde1() {
        return converterFechaTransaccionDesde1;
    }
  
    public void setConverterFechaTransaccionDesde1(SqlTimestampConverter converter) {
        this.converterFechaTransaccionDesde1 = converter;
    }
  
    private Label labelFechaTransaccionHasta1 = new com.egt.core.jsf.component.Etiqueta();

    public Label getLabelFechaTransaccionHasta1() {
        return labelFechaTransaccionHasta1;
    }

    public void setLabelFechaTransaccionHasta1(Label l) {
        this.labelFechaTransaccionHasta1 = l;
    }

    private Calendar campoFechaTransaccionHasta1 = new com.egt.core.jsf.component.Calendario();

    public Calendar getCampoFechaTransaccionHasta1() {
        return campoFechaTransaccionHasta1;
    }

    public void setCampoFechaTransaccionHasta1(Calendar component) {
        this.campoFechaTransaccionHasta1 = component;
    }

    private HelpInline helpInlineFechaTransaccionHasta1 = new com.egt.core.jsf.component.AyudaEnLinea();

    public HelpInline getHelpInlineFechaTransaccionHasta1() {
        return helpInlineFechaTransaccionHasta1;
    }

    public void setHelpInlineFechaTransaccionHasta1(HelpInline hi) {
        this.helpInlineFechaTransaccionHasta1 = hi;
    }

    private StaticText campoFechaTransaccionHasta1Texto1 = new com.egt.core.jsf.component.TextoEstaticoAlternativo();

    public StaticText getCampoFechaTransaccionHasta1Texto1() {
        return campoFechaTransaccionHasta1Texto1;
    }

    public void setCampoFechaTransaccionHasta1Texto1(StaticText component) {
        this.campoFechaTransaccionHasta1Texto1 = component;
    }

    private SqlTimestampConverter converterFechaTransaccionHasta1 = new SqlTimestampConverter();
  
    public SqlTimestampConverter getConverterFechaTransaccionHasta1() {
        return converterFechaTransaccionHasta1;
    }
  
    public void setConverterFechaTransaccionHasta1(SqlTimestampConverter converter) {
        this.converterFechaTransaccionHasta1 = converter;
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
    public InformeAuditoria4() {
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
    private final static String ETIQUETA_MIGAS_PAN = Bundle.getString("InformeAuditoria4_ETIQUETA_MIGAS_PAN");

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina basica">
    private GestorPaginaBasica gestor = new GestorPaginaBasica(this);

    public GestorPaginaBasica getGestor() {
        return this.gestor;
    }
    // </editor-fold>
/**/
    static long FUNCION_ACCION_1 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_DEUDORES;

    static long FUNCION_ACCION_2 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_EMPLEADOS;

    static long FUNCION_ACCION_3 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_FALLECIDOS;

    static long FUNCION_ACCION_4 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_FICHA_HOGAR;

    static long FUNCION_ACCION_5 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_FICHA_PERSONA;

    static long FUNCION_ACCION_6 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_IDENTIFICACIONES;

    static long FUNCION_ACCION_7 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_JUBILADOS;

    static long FUNCION_ACCION_8 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_PENSIONADOS;

    static long FUNCION_ACCION_9 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_POTENCIALES_BENEFICIARIOS;

    static long FUNCION_ACCION_10 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_SUBSIDIOS;

    static long FUNCION_ACCION_11 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_ARCHIVOS_EXTERNOS;

    static long FUNCION_ACCION_12 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_ACREDITAR_POTENCIALES_BENEFICIARIOS;

    static long FUNCION_ACCION_13 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_APROBAR_DENEGAR_PENSION;

    static long FUNCION_ACCION_14 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_REGISTRAR_RESOLUCION_APROBATORIA;

    static long FUNCION_ACCION_15 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_REGISTRAR_RESOLUCION_DENEGATORIA;

    static long FUNCION_ACCION_16 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_INCORPORAR_PENSIONADOS_AL_JUPE;

    static long FUNCION_ACCION_17 = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_VERIFICAR_ELEGIBILIDAD_PARA_PENSION;

    @Override
    public Option[] getOpcionesListaFuncionAccion() {
        Option[] opciones = new Option[]{
            new Option("", this.getGestor().getI18n().getEtiquetaSeleccioneUnaOpcionListaFuncionAccion()),
            new Option(FUNCION_ACCION_1, Bundle.getString("emitir importar deudores")),
            new Option(FUNCION_ACCION_2, Bundle.getString("emitir importar empleados")),
            new Option(FUNCION_ACCION_3, Bundle.getString("emitir importar fallecidos")),
            new Option(FUNCION_ACCION_4, Bundle.getString("emitir importar ficha hogar")),
            new Option(FUNCION_ACCION_5, Bundle.getString("emitir importar ficha persona")),
            new Option(FUNCION_ACCION_6, Bundle.getString("emitir importar identificaciones")),
            new Option(FUNCION_ACCION_7, Bundle.getString("emitir importar jubilados")),
            new Option(FUNCION_ACCION_8, Bundle.getString("emitir importar pensionados")),
            new Option(FUNCION_ACCION_9, Bundle.getString("emitir importar potenciales beneficiarios")),
            new Option(FUNCION_ACCION_10, Bundle.getString("emitir importar subsidios")),
            new Option(FUNCION_ACCION_11, Bundle.getString("emitir importar archivos externos")),
            new Option(FUNCION_ACCION_12, Bundle.getString("emitir acreditar potenciales beneficiarios")),
            new Option(FUNCION_ACCION_13, Bundle.getString("emitir aprobar denegar pension")),
            new Option(FUNCION_ACCION_14, Bundle.getString("emitir registrar resolucion aprobatoria")),
            new Option(FUNCION_ACCION_15, Bundle.getString("emitir registrar resolucion denegatoria")),
            new Option(FUNCION_ACCION_16, Bundle.getString("emitir incorporar pensionados al jupe")),
            new Option(FUNCION_ACCION_17, Bundle.getString("emitir verificar elegibilidad para pension"))
        };
        return this.getGestor().getOpcionesListaFuncionAccionAutorizadas(opciones);
    }

    // <editor-fold defaultstate="collapsed" desc="metodos para establecer la propiedad rendered">
    public boolean isFechaTransaccionDesdeRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_1 || f == FUNCION_ACCION_2 || f == FUNCION_ACCION_3 || f == FUNCION_ACCION_4 || f == FUNCION_ACCION_5 || f == FUNCION_ACCION_6 || f == FUNCION_ACCION_7 || f == FUNCION_ACCION_8 || f == FUNCION_ACCION_9 || f == FUNCION_ACCION_10 || f == FUNCION_ACCION_11 || f == FUNCION_ACCION_12 || f == FUNCION_ACCION_13 || f == FUNCION_ACCION_14 || f == FUNCION_ACCION_15 || f == FUNCION_ACCION_16 || f == FUNCION_ACCION_17;
    }

    private Bit bitFechaTransaccionDesdeRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaTransaccionDesdeRendered();
        }
    };

    public Bit getBitFechaTransaccionDesdeRendered() {
        return bitFechaTransaccionDesdeRendered;
    }

    public boolean isFechaTransaccionHastaRendered() {
        long f = LongUtils.valueOf(this.getGestor().getValorListaFuncionAccion1());
        return f == FUNCION_ACCION_1 || f == FUNCION_ACCION_2 || f == FUNCION_ACCION_3 || f == FUNCION_ACCION_4 || f == FUNCION_ACCION_5 || f == FUNCION_ACCION_6 || f == FUNCION_ACCION_7 || f == FUNCION_ACCION_8 || f == FUNCION_ACCION_9 || f == FUNCION_ACCION_10 || f == FUNCION_ACCION_11 || f == FUNCION_ACCION_12 || f == FUNCION_ACCION_13 || f == FUNCION_ACCION_14 || f == FUNCION_ACCION_15 || f == FUNCION_ACCION_16 || f == FUNCION_ACCION_17;
    }

    private Bit bitFechaTransaccionHastaRendered = new Bit() {
        // override metodo isOn
        @Override
        public boolean isOn() {
            return isFechaTransaccionHastaRendered();
        }
    };

    public Bit getBitFechaTransaccionHastaRendered() {
        return bitFechaTransaccionHastaRendered;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Facades">
    @EJB
    private InformeAuditoriaFacadeLocal informeAuditoriaFacade;

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
    private java.sql.Timestamp valorCampoFechaTransaccionDesde1;

    public java.sql.Timestamp getValorCampoFechaTransaccionDesde1() {
        return this.valorCampoFechaTransaccionDesde1;
    }

    public void setValorCampoFechaTransaccionDesde1(java.sql.Timestamp valor) {
        this.valorCampoFechaTransaccionDesde1 = valor;
    }

    private java.sql.Timestamp valorCampoFechaTransaccionHasta1;

    public java.sql.Timestamp getValorCampoFechaTransaccionHasta1() {
        return this.valorCampoFechaTransaccionHasta1;
    }

    public void setValorCampoFechaTransaccionHasta1(java.sql.Timestamp valor) {
        this.valorCampoFechaTransaccionHasta1 = valor;
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
                : f == FUNCION_ACCION_1 ? this.accion1(f) /* emitirInformeAuditoriaImportarDeudores */
                : f == FUNCION_ACCION_2 ? this.accion2(f) /* emitirInformeAuditoriaImportarEmpleados */
                : f == FUNCION_ACCION_3 ? this.accion3(f) /* emitirInformeAuditoriaImportarFallecidos */
                : f == FUNCION_ACCION_4 ? this.accion4(f) /* emitirInformeAuditoriaImportarFichaHogar */
                : f == FUNCION_ACCION_5 ? this.accion5(f) /* emitirInformeAuditoriaImportarFichaPersona */
                : f == FUNCION_ACCION_6 ? this.accion6(f) /* emitirInformeAuditoriaImportarIdentificaciones */
                : f == FUNCION_ACCION_7 ? this.accion7(f) /* emitirInformeAuditoriaImportarJubilados */
                : f == FUNCION_ACCION_8 ? this.accion8(f) /* emitirInformeAuditoriaImportarPensionados */
                : f == FUNCION_ACCION_9 ? this.accion9(f) /* emitirInformeAuditoriaImportarPotencialesBeneficiarios */
                : f == FUNCION_ACCION_10 ? this.accion10(f) /* emitirInformeAuditoriaImportarSubsidios */
                : f == FUNCION_ACCION_11 ? this.accion11(f) /* emitirInformeAuditoriaImportarArchivosExternos */
                : f == FUNCION_ACCION_12 ? this.accion12(f) /* emitirInformeAuditoriaAcreditarPotencialesBeneficiarios */
                : f == FUNCION_ACCION_13 ? this.accion13(f) /* emitirInformeAuditoriaAprobarDenegarPension */
                : f == FUNCION_ACCION_14 ? this.accion14(f) /* emitirInformeAuditoriaRegistrarResolucionAprobatoria */
                : f == FUNCION_ACCION_15 ? this.accion15(f) /* emitirInformeAuditoriaRegistrarResolucionDenegatoria */
                : f == FUNCION_ACCION_16 ? this.accion16(f) /* emitirInformeAuditoriaIncorporarPensionadosAlJupe */
                : f == FUNCION_ACCION_17 ? this.accion17(f) /* emitirInformeAuditoriaVerificarElegibilidadParaPension */
                : null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="metodos para ejecutar funciones">
    private String accion1(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaImportarDeudores();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria importar deudores"));
        }
        return null;
    }

    private String accion2(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaImportarEmpleados();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria importar empleados"));
        }
        return null;
    }

    private String accion3(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaImportarFallecidos();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria importar fallecidos"));
        }
        return null;
    }

    private String accion4(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaImportarFichaHogar();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria importar ficha hogar"));
        }
        return null;
    }

    private String accion5(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaImportarFichaPersona();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria importar ficha persona"));
        }
        return null;
    }

    private String accion6(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaImportarIdentificaciones();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria importar identificaciones"));
        }
        return null;
    }

    private String accion7(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaImportarJubilados();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria importar jubilados"));
        }
        return null;
    }

    private String accion8(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaImportarPensionados();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria importar pensionados"));
        }
        return null;
    }

    private String accion9(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaImportarPotencialesBeneficiarios();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria importar potenciales beneficiarios"));
        }
        return null;
    }

    private String accion10(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaImportarSubsidios();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria importar subsidios"));
        }
        return null;
    }

    private String accion11(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaImportarArchivosExternos();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria importar archivos externos"));
        }
        return null;
    }

    private String accion12(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaAcreditarPotencialesBeneficiarios();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria acreditar potenciales beneficiarios"));
        }
        return null;
    }

    private String accion13(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaAprobarDenegarPension();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria aprobar denegar pension"));
        }
        return null;
    }

    private String accion14(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaRegistrarResolucionAprobatoria();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria registrar resolucion aprobatoria"));
        }
        return null;
    }

    private String accion15(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaRegistrarResolucionDenegatoria();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria registrar resolucion denegatoria"));
        }
        return null;
    }

    private String accion16(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaIncorporarPensionadosAlJupe();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria incorporar pensionados al jupe"));
        }
        return null;
    }

    private String accion17(long f) {
        boolean esFuncionAutorizada = TLC.getControlador().esFuncionAutorizada(f);
        if (esFuncionAutorizada) {
            this.emitirInformeAuditoriaVerificarElegibilidadParaPension();
        } else {
            TLC.getBitacora().error(CBM2.FUNCION_NO_AUTORIZADA, Bundle.getString("emitir informe auditoria verificar elegibilidad para pension"));
        }
        return null;
    }

    // </editor-fold>

/**/
    boolean synchronously = false;

    @EJB
    private BusinessProcessMessengerLocal messenger;

    @EJB
    private ReporterBrokerLocal reporter;

    private void emitirInformeAuditoriaImportarDeudores() { /* emitir informe auditoria importar deudores */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_DEUDORES;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_DEUDORES;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirInformeAuditoriaImportarEmpleados() { /* emitir informe auditoria importar empleados */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_EMPLEADOS;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_EMPLEADOS;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirInformeAuditoriaImportarFallecidos() { /* emitir informe auditoria importar fallecidos */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_FALLECIDOS;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_FALLECIDOS;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirInformeAuditoriaImportarFichaHogar() { /* emitir informe auditoria importar ficha hogar */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_FICHA_HOGAR;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_FICHA_HOGAR;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirInformeAuditoriaImportarFichaPersona() { /* emitir informe auditoria importar ficha persona */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_FICHA_PERSONA;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_FICHA_PERSONA;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirInformeAuditoriaImportarIdentificaciones() { /* emitir informe auditoria importar identificaciones */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_IDENTIFICACIONES;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_IDENTIFICACIONES;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirInformeAuditoriaImportarJubilados() { /* emitir informe auditoria importar jubilados */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_JUBILADOS;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_JUBILADOS;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirInformeAuditoriaImportarPensionados() { /* emitir informe auditoria importar pensionados */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_PENSIONADOS;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_PENSIONADOS;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirInformeAuditoriaImportarPotencialesBeneficiarios() { /* emitir informe auditoria importar potenciales beneficiarios */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_POTENCIALES_BENEFICIARIOS;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_POTENCIALES_BENEFICIARIOS;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirInformeAuditoriaImportarSubsidios() { /* emitir informe auditoria importar subsidios */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_SUBSIDIOS;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_SUBSIDIOS;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirInformeAuditoriaImportarArchivosExternos() { /* emitir informe auditoria importar archivos externos */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_ARCHIVOS_EXTERNOS;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_IMPORTAR_ARCHIVOS_EXTERNOS;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirInformeAuditoriaAcreditarPotencialesBeneficiarios() { /* emitir informe auditoria acreditar potenciales beneficiarios */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_ACREDITAR_POTENCIALES_BENEFICIARIOS;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_ACREDITAR_POTENCIALES_BENEFICIARIOS;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirInformeAuditoriaAprobarDenegarPension() { /* emitir informe auditoria aprobar denegar pension */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_APROBAR_DENEGAR_PENSION;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_APROBAR_DENEGAR_PENSION;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirInformeAuditoriaRegistrarResolucionAprobatoria() { /* emitir informe auditoria registrar resolucion aprobatoria */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_REGISTRAR_RESOLUCION_APROBATORIA;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_REGISTRAR_RESOLUCION_APROBATORIA;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirInformeAuditoriaRegistrarResolucionDenegatoria() { /* emitir informe auditoria registrar resolucion denegatoria */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_REGISTRAR_RESOLUCION_DENEGATORIA;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_REGISTRAR_RESOLUCION_DENEGATORIA;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirInformeAuditoriaIncorporarPensionadosAlJupe() { /* emitir informe auditoria incorporar pensionados al jupe */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_INCORPORAR_PENSIONADOS_AL_JUPE;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_INCORPORAR_PENSIONADOS_AL_JUPE;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
        }
    }

    private void emitirInformeAuditoriaVerificarElegibilidadParaPension() { /* emitir informe auditoria verificar elegibilidad para pension */
        Date fechaTransaccionDesde = this.getValorCampoFechaTransaccionDesde1();
        Date fechaTransaccionHasta = this.getValorCampoFechaTransaccionHasta1();
        String report = InformeAuditoriaConstants.INFORME_FUNCION_EMITIR_INFORME_AUDITORIA_VERIFICAR_ELEGIBILIDAD_PARA_PENSION;
        long function = InformeAuditoriaConstants.FUNCION_EMITIR_INFORME_AUDITORIA_VERIFICAR_ELEGIBILIDAD_PARA_PENSION;
        Map parameters = new LinkedHashMap();
        parameters.put("fecha_transaccion_desde", fechaTransaccionDesde);
        parameters.put("fecha_transaccion_hasta", fechaTransaccionHasta);
//      ------------------------------------------------------------------------
//      this.reporter.executeReport(report, function, parameters);
//      ------------------------------------------------------------------------
        String select = "select * from informe_auditoria";
        String search = "";
        ArrayList args = new ArrayList();
        if (fechaTransaccionDesde != null) {
            args.add(fechaTransaccionDesde);
            search += " and fecha_transaccion>=?";
        }
        if (fechaTransaccionHasta != null) {
            args.add(fechaTransaccionHasta);
            search += " and fecha_transaccion<=?";
        }
        if (args.size() > 0) {
            select += " where (" + search.substring(5) + ")";
            this.reporter.executeReport(report, function, select, args.toArray(), parameters);
        } else {
            this.reporter.executeReport(report, function);
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
