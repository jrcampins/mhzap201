/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.web;

import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.GestorPaginaActualizacion;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.util.STP;
import com.egt.data.general.xdp3.UsuarioCachedRowSetDataProvider3;
import com.sun.data.provider.RowKey;
import com.sun.rave.faces.converter.SqlTimestampConverter;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.sun.webui.jsf.component.Anchor;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Breadcrumbs;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.ImageComponent;
import com.sun.webui.jsf.component.ImageHyperlink;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.Link;
import com.sun.webui.jsf.component.Message;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.PasswordField;
import com.sun.webui.jsf.component.Script;
import com.sun.webui.jsf.model.Option;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;
import javax.faces.convert.IntegerConverter;
import javax.faces.convert.LongConverter;
import javax.faces.validator.LengthValidator;
import javax.faces.validator.LongRangeValidator;
import javax.faces.validator.ValidatorException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page. This class contains component definitions (and
 * initialization code) for all components that you have defined on this page, as well as lifecycle methods
 * and event handlers where you may add behavior to respond to incoming events.</p>
 */
public class Password extends AbstractPageBean
        implements PaginaActualizacion {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong> This method is
     * automatically generated, so any user-specified code inserted here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        integerRangeValidator1.setMaximum(2147483647L);
        integerRangeValidator1.setMinimum(1L);
        lengthValidator1.setMaximum(30);
        lengthValidator2.setMaximum(100);
        lengthValidator3.setMaximum(255);
        sqlTimestampConverter1.setPattern("dd/MM/yyyy");
        usuarioDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.usuarioRowSet}"));
    }

    private Page page1 = new Page();

    public Page getPage1() {
        return page1;
    }

    public void setPage1(Page p) {
        this.page1 = p;
    }

    private Html html1 = new Html();

    public Html getHtml1() {
        return html1;
    }

    public void setHtml1(Html h) {
        this.html1 = h;
    }

    private Head head1 = new Head();

    public Head getHead1() {
        return head1;
    }

    public void setHead1(Head h) {
        this.head1 = h;
    }

    private Link link1 = new Link();

    public Link getLink1() {
        return link1;
    }

    public void setLink1(Link l) {
        this.link1 = l;
    }

    private Body body1 = new Body();

    public Body getBody1() {
        return body1;
    }

    public void setBody1(Body b) {
        this.body1 = b;
    }

    private Form form1 = new Form();

    @Override
    public Form getForm1() {
        return form1;
    }

    public void setForm1(Form f) {
        this.form1 = f;
    }

    private HtmlPanelGrid gridPanel1 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel1() {
        return gridPanel1;
    }

    public void setGridPanel1(HtmlPanelGrid hpg) {
        this.gridPanel1 = hpg;
    }

    private Anchor anclaPie1 = new Anchor();

    public Anchor getAnclaPie1() {
        return anclaPie1;
    }

    public void setAnclaPie1(Anchor a) {
        this.anclaPie1 = a;
    }

    private IntegerConverter integerConverter1 = new IntegerConverter();

    public IntegerConverter getIntegerConverter1() {
        return integerConverter1;
    }

    public void setIntegerConverter1(IntegerConverter ic) {
        this.integerConverter1 = ic;
    }

    private LongRangeValidator integerRangeValidator1 = new LongRangeValidator();

    public LongRangeValidator getIntegerRangeValidator1() {
        return integerRangeValidator1;
    }

    public void setIntegerRangeValidator1(LongRangeValidator lrv) {
        this.integerRangeValidator1 = lrv;
    }

    private Breadcrumbs breadcrumbs1 = new Breadcrumbs();

    @Override
    public Breadcrumbs getBreadcrumbs1() {
        return breadcrumbs1;
    }

    public void setBreadcrumbs1(Breadcrumbs b) {
        this.breadcrumbs1 = b;
    }

    private HtmlPanelGrid gridPanel2 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel2() {
        return gridPanel2;
    }

    public void setGridPanel2(HtmlPanelGrid hpg) {
        this.gridPanel2 = hpg;
    }

    private HtmlPanelGrid gridPanel11 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel11() {
        return gridPanel11;
    }

    public void setGridPanel11(HtmlPanelGrid hpg) {
        this.gridPanel11 = hpg;
    }

    private Label label4 = new Label();

    public Label getLabel4() {
        return label4;
    }

    public void setLabel4(Label l) {
        this.label4 = l;
    }

    private HtmlPanelGrid gridPanel12 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel12() {
        return gridPanel12;
    }

    public void setGridPanel12(HtmlPanelGrid hpg) {
        this.gridPanel12 = hpg;
    }

    private Message message2 = new Message();

    public Message getMessage2() {
        return message2;
    }

    public void setMessage2(Message m) {
        this.message2 = m;
    }

    private HtmlPanelGrid gridPanel13 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel13() {
        return gridPanel13;
    }

    public void setGridPanel13(HtmlPanelGrid hpg) {
        this.gridPanel13 = hpg;
    }

    private Label label5 = new Label();

    public Label getLabel5() {
        return label5;
    }

    public void setLabel5(Label l) {
        this.label5 = l;
    }

    private HtmlPanelGrid gridPanel14 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel14() {
        return gridPanel14;
    }

    public void setGridPanel14(HtmlPanelGrid hpg) {
        this.gridPanel14 = hpg;
    }

    private Message message3 = new Message();

    public Message getMessage3() {
        return message3;
    }

    public void setMessage3(Message m) {
        this.message3 = m;
    }

    private HtmlPanelGrid gridPanel28 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel28() {
        return gridPanel28;
    }

    public void setGridPanel28(HtmlPanelGrid hpg) {
        this.gridPanel28 = hpg;
    }

    private HtmlPanelGrid gridPanel29 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel29() {
        return gridPanel29;
    }

    public void setGridPanel29(HtmlPanelGrid hpg) {
        this.gridPanel29 = hpg;
    }

    private Button botonEditar1 = new Button();

    public Button getBotonEditar1() {
        return botonEditar1;
    }

    public void setBotonEditar1(Button b) {
        this.botonEditar1 = b;
    }

    private Button botonConfirmar1 = new Button();

    public Button getBotonConfirmar1() {
        return botonConfirmar1;
    }

    public void setBotonConfirmar1(Button b) {
        this.botonConfirmar1 = b;
    }

    private Button botonDescartar1 = new Button();

    public Button getBotonDescartar1() {
        return botonDescartar1;
    }

    public void setBotonDescartar1(Button b) {
        this.botonDescartar1 = b;
    }

    private Button botonRetornar1 = new Button();

    public Button getBotonRetornar1() {
        return botonRetornar1;
    }

    public void setBotonRetornar1(Button b) {
        this.botonRetornar1 = b;
    }

    private LengthValidator lengthValidator1 = new LengthValidator();

    public LengthValidator getLengthValidator1() {
        return lengthValidator1;
    }

    public void setLengthValidator1(LengthValidator lv) {
        this.lengthValidator1 = lv;
    }

    private LengthValidator lengthValidator2 = new LengthValidator();

    public LengthValidator getLengthValidator2() {
        return lengthValidator2;
    }

    public void setLengthValidator2(LengthValidator lv) {
        this.lengthValidator2 = lv;
    }

    private LengthValidator lengthValidator3 = new LengthValidator();

    public LengthValidator getLengthValidator3() {
        return lengthValidator3;
    }

    public void setLengthValidator3(LengthValidator lv) {
        this.lengthValidator3 = lv;
    }

    private SqlTimestampConverter sqlTimestampConverter1 = new SqlTimestampConverter();

    public SqlTimestampConverter getSqlTimestampConverter1() {
        return sqlTimestampConverter1;
    }

    public void setSqlTimestampConverter1(SqlTimestampConverter stc) {
        this.sqlTimestampConverter1 = stc;
    }

    private Script script1 = new Script();

    public Script getScript1() {
        return script1;
    }

    public void setScript1(Script s) {
        this.script1 = s;
    }

    private LongConverter longConverter1 = new LongConverter();

    public LongConverter getLongConverter1() {
        return longConverter1;
    }

    public void setLongConverter1(LongConverter lc) {
        this.longConverter1 = lc;
    }

    private LongRangeValidator longRangeValidator1 = new LongRangeValidator();

    public LongRangeValidator getLongRangeValidator1() {
        return longRangeValidator1;
    }

    public void setLongRangeValidator1(LongRangeValidator lrv) {
        this.longRangeValidator1 = lrv;
    }

    private UsuarioCachedRowSetDataProvider3 usuarioDataProvider = new UsuarioCachedRowSetDataProvider3();

    public UsuarioCachedRowSetDataProvider3 getUsuarioDataProvider() {
        return usuarioDataProvider;
    }

    public void setUsuarioDataProvider(UsuarioCachedRowSetDataProvider3 crsdp) {
        this.usuarioDataProvider = crsdp;
    }

    private PasswordField passwordField1 = new PasswordField();

    public PasswordField getPasswordField1() {
        return passwordField1;
    }

    public void setPasswordField1(PasswordField pf) {
        this.passwordField1 = pf;
    }

    private PasswordField passwordField2 = new PasswordField();

    public PasswordField getPasswordField2() {
        return passwordField2;
    }

    public void setPasswordField2(PasswordField pf) {
        this.passwordField2 = pf;
    }

    private HtmlPanelGrid gridPanel3 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel3() {
        return gridPanel3;
    }

    public void setGridPanel3(HtmlPanelGrid hpg) {
        this.gridPanel3 = hpg;
    }

    private HtmlPanelGrid gridPanel4 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel4() {
        return gridPanel4;
    }

    public void setGridPanel4(HtmlPanelGrid hpg) {
        this.gridPanel4 = hpg;
    }

    private ImageComponent imagenMensaje1 = new ImageComponent();

    public ImageComponent getImagenMensaje1() {
        return imagenMensaje1;
    }

    public void setImagenMensaje1(ImageComponent ic) {
        this.imagenMensaje1 = ic;
    }

    private ImageHyperlink hipervinculoMensaje1 = new ImageHyperlink();

    public ImageHyperlink getHipervinculoMensaje1() {
        return hipervinculoMensaje1;
    }

    public void setHipervinculoMensaje1(ImageHyperlink ih) {
        this.hipervinculoMensaje1 = ih;
    }

    private HtmlPanelGrid gridPanel5 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel5() {
        return gridPanel5;
    }

    public void setGridPanel5(HtmlPanelGrid hpg) {
        this.gridPanel5 = hpg;
    }

    private Anchor anchor1 = new Anchor();

    public Anchor getAnchor1() {
        return anchor1;
    }

    public void setAnchor1(Anchor a) {
        this.anchor1 = a;
    }
    // </editor-fold>
/**/

    /**
     * <p>Construir una instancia de bean de pagina.</p>
     */
    public Password() {
    }

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para el manejo de eventos de la pagina: init, preprocess, prerender y destroy">
    /**
     * <p>Metodo de devolucion de llamada al que se llama cuando se navega hasta esta pagina, ya sea
     * directamente mediante un URL o de manera indirecta a traves de la navegacion de paginas. Puede
     * personalizar este metodo para adquirir recursos que se necesitaran para los controladores de eventos y
     * metodos del proceso, sin tener en cuenta si esta pagina realiza procesamiento de devolucion de
     * envios.</p>
     *
     * <p>Tenga en cuenta que si la peticion actual es una devolucion de envio, los valores de propiedad de
     * los componentes <strong>no</strong> representan ningun valor enviado con esta peticion. En su lugar,
     * representan los valores de propiedades que se guardaron para esta vista cuando se proceso.</p>
     */
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

    /**
     * <p>Metodo de devolucion de llamada al que se llama cuando el arbol de componentes se ha restaurado,
     * pero antes de que se produzca el procesamiento de cualquier evento. Este metodo <strong>solo</strong>
     * se llamara en una peticion de devolucion de envio que este procesando el envio de un formulario. Puede
     * personalizar este metodo para asignar recursos necesarios para los controladores de eventos.</p>
     */
    @Override
    public void preprocess() {
        this.preprocesar();
    }

    /**
     * <p>Metodo de devolucion de llamada al que se llama justo antes del procesamiento. <strong>solo</strong>
     * se llamara a este metodo en la pagina que se procesa, no se llamara, por ejemplo, en una pagina que ha
     * procesado una devolucion de envio y a continuacion ha navegado hasta otra pagina. Puede personalizar
     * este metodo para asignar recursos necesarios para procesar esta pagina.</p>
     */
    @Override
    public void prerender() {
        this.prepresentar();
    }

    /**
     * <p>Metodo de devolucion de llamada al que se llama cuando se completa el procesamiento de esta
     * peticion, si se llamo al metodo
     * <code>init()</code> (sin tener en cuenta si se trata de la pagina que se ha procesado o no). Puede
     * personalizar este metodo para liberar los recursos adquiridos en los metodos
     * <code>init()</code>,
     * <code>preprocess()</code> o
     * <code>prerender()</code> (o durante la ejecucion de un controlador de eventos).</p>
     */
    @Override
    //@PreDestroy
    public void destroy() {
        usuarioDataProvider.close();
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedades estandar para el manejo de los beans de contexto: request, session y application">
    /**
     * <p>Devolver una referencia al bean de datos con ambito.</p>
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Devolver una referencia al bean de datos con ambito.</p>
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Devolver una referencia al bean de datos con ambito.</p>
     */
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

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion">
    private GestorPaginaActualizacion gestor = new GestorPaginaActualizacion(this);

    @Override
    public GestorPaginaActualizacion getGestor() {
        return this.gestor;
    }
    // </editor-fold>
/**/

    private final static String ETIQUETA_MIGAS_PAN = "Cambio de contraseña";

    private final static String ETIQUETA_CLASE_DETALLE = "Cambio de contraseña";

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getUsuarioDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return UsuarioCachedRowSetDataProvider3.FUNCION_CONSULTAR_PASSWORD;
    }

    @Override
    public long getFuncionCrearRecurso() {
        return -1; // return UsuarioCachedRowSetDataProvider3.FUNCION_CREAR_USUARIO;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return UsuarioCachedRowSetDataProvider3.FUNCION_CAMBIAR_PASSWORD;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return -1; // return UsuarioCachedRowSetDataProvider3.FUNCION_ELIMINAR_USUARIO;
    }

    public Option[] getOpcionesListaFuncionEdicion() {
        return new Option[]{ // esta lista debe incluir al menos 2 opciones
                // new Option(UsuarioCachedRowSetDataProvider3.FUNCION_MODIFICAR_USUARIO, "Modificar recurso"),
                // new Option(UsuarioCachedRowSetDataProvider3.FUNCION_DESACTIVAR_USUARIO, "Desactivar recurso"),
                // new Option(UsuarioCachedRowSetDataProvider3.FUNCION_REACTIVAR_USUARIO, "Reactivar recurso")
                };
    }

    public RecursoCachedRowSetDataProvider getRecursoMaestroDataProvider() {
        return null; // return this.getRecursoMaestroEquisDataProvider();
    }

    public String getColumnaIdentificacionRecursoMaestro() {
        return null; // return UsuarioCachedRowSetDataProvider3.COLUMNA_ID_RECURSO_MAESTRO_EQUIS;
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
//      Long identificacionRecurso = this.getContextoPeticion().getIdentificacionRecurso();
        Long identificacionUsuario = this.getContextoSesion().getUsuarioAutenticado().getIdUsuario();
        this.getContextoPeticion().setIdentificacionRecurso(identificacionUsuario);
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
        this.passwordFields_reset();
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

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para cursor, refrescar, agregar, editar, deshacer y eliminar de la plantilla #2">
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

    public String botonRefrescar1_action() {
        this.getGestor().refrescar();
        return null;
    }

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

    public String botonRetornar1_action() {
        this.getGestor().retornar();
        return null;
    }
    // </editor-fold>
/**/

    public String imageHyperlink1_action() {
        // Reemplazar "case1" con el nombre del vinculo correspondiente
        if (!this.getGestor().vincular()) {
            return null;
        }
        return null;
    }

    public String imageHyperlink2_action() {
        // Reemplazar "case2" con el nombre del vinculo correspondiente
        if (!this.getGestor().vincular()) {
            return null;
        }
        return null;
    }

    public String imageHyperlink3_action() {
        // Reemplazar "case3" con el nombre del vinculo correspondiente
        if (!this.getGestor().vincular()) {
            return null;
        }
        return null;
    }

    public String imageHyperlink4_action() {
        // Reemplazar "case4" con el nombre del vinculo correspondiente
        if (!this.getGestor().vincular()) {
            return null;
        }
        return null;
    }

    public String imageHyperlink5_action() {
        // Reemplazar "case5" con el nombre del vinculo correspondiente
        if (!this.getGestor().vincular()) {
            return null;
        }
        return null;
    }

    public void passwordFields_reset() {
        this.getPasswordField1().setText(null);
        this.getPasswordField2().setText(null);
        RowKey rowKey = this.getGestor().getCurrentRowKey();
        if (rowKey != null) {
            String mensaje = "";
            if (this.getGestor().isFilaNoProcesada()) {
                mensaje += "Para cambiar su contraseña haga clic en el botón Editar";
            } else {
                mensaje += "Escriba su nueva contraseña en los cuadros \"contraseña\" y \"confirmación\", y ";
                mensaje += "haga clic en el botón Confirmar";
            }
            info(mensaje);
        }
    }

    public void passwordField2_validate(FacesContext context, UIComponent component, Object value) {
        String pwd1 = STP.getString(this.getPasswordField1().getText());
        String pwd2 = (String) value;
        if (pwd1 == null || !pwd1.equals(pwd2)) {
            String mensaje = "el valor no coincide con el de la nueva contraseña";
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensaje, null);
            throw new ValidatorException(message);
        }
    }

}
