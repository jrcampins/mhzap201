/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 */
package com.egt.web.recurso;

import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.GestorPaginaActualizacionConArbol;
import com.egt.core.aplicacion.web.PaginaActualizacion;
import com.egt.core.aplicacion.web.PaginaConsultaConArbol;
import com.egt.core.db.xdp.ListaRecursoCachedRowSetDataProvider;
import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.enums.EnumColumnaEtiqueta;
import com.egt.core.enums.EnumOpcionZumNodo;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.sun.webui.jsf.component.Anchor;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Breadcrumbs;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.ImageComponent;
import com.sun.webui.jsf.component.ImageHyperlink;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.Link;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.Script;
import com.sun.webui.jsf.component.Tree;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.convert.IntegerConverter;
import javax.faces.context.FacesContext;
import javax.faces.validator.LengthValidator;
import javax.faces.validator.LongRangeValidator;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class Recurso3 extends AbstractPageBean
        implements PaginaActualizacion, PaginaConsultaConArbol {

    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        integerRangeValidator1.setMaximum(2147483647L);
        integerRangeValidator1.setMinimum(1L);
        lengthValidator1.setMaximum(30);
        lengthValidator2.setMaximum(100);
        lengthValidator3.setMaximum(255);
        listaRecursoDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.listaRecursoRowSet}"));
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

    private HtmlPanelGrid gridPanel2 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel2() {
        return gridPanel2;
    }

    public void setGridPanel2(HtmlPanelGrid hpg) {
        this.gridPanel2 = hpg;
    }

    private Anchor anclaPie1 = new Anchor();

    public Anchor getAnclaPie1() {
        return anclaPie1;
    }

    public void setAnclaPie1(Anchor a) {
        this.anclaPie1 = a;
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

    private Button botonRefrescar1 = new Button();

    public Button getBotonRefrescar1() {
        return botonRefrescar1;
    }

    public void setBotonRefrescar1(Button b) {
        this.botonRefrescar1 = b;
    }

    private Button botonRetornar1 = new Button();

    public Button getBotonRetornar1() {
        return botonRetornar1;
    }

    public void setBotonRetornar1(Button b) {
        this.botonRetornar1 = b;
    }

    private Breadcrumbs breadcrumbs1 = new Breadcrumbs();

    @Override
    public Breadcrumbs getBreadcrumbs1() {
        return breadcrumbs1;
    }

    public void setBreadcrumbs1(Breadcrumbs b) {
        this.breadcrumbs1 = b;
    }

    private LongRangeValidator integerRangeValidator1 = new LongRangeValidator();

    public LongRangeValidator getIntegerRangeValidator1() {
        return integerRangeValidator1;
    }

    public void setIntegerRangeValidator1(LongRangeValidator lrv) {
        this.integerRangeValidator1 = lrv;
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

    private Tree tree1 = new Tree();

    @Override
    public Tree getTree1() {
        return tree1;
    }

    public void setTree1(Tree t) {
        this.tree1 = t;
    }

    private HtmlPanelGrid gridPanel7 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel7() {
        return gridPanel7;
    }

    public void setGridPanel7(HtmlPanelGrid hpg) {
        this.gridPanel7 = hpg;
    }

    private Button botonAplicarZum1 = new Button();

    public Button getBotonAplicarZum1() {
        return botonAplicarZum1;
    }

    public void setBotonAplicarZum1(Button b) {
        this.botonAplicarZum1 = b;
    }

    private Label etiquetaListaOpcionZum1 = new Label();

    public Label getEtiquetaListaOpcionZum1() {
        return etiquetaListaOpcionZum1;
    }

    public void setEtiquetaListaOpcionZum1(Label l) {
        this.etiquetaListaOpcionZum1 = l;
    }

    private Button botonQuitarZum1 = new Button();

    public Button getBotonQuitarZum1() {
        return botonQuitarZum1;
    }

    public void setBotonQuitarZum1(Button b) {
        this.botonQuitarZum1 = b;
    }

    private DropDown listaOpcionZum1 = new com.egt.core.jsf.component.ListaDesplegable();

    @Override
    public DropDown getListaOpcionZum1() {
        return listaOpcionZum1;
    }

    public void setListaOpcionZum1(DropDown dd) {
        this.listaOpcionZum1 = dd;
    }

    private IntegerConverter integerConverter1 = new IntegerConverter();

    public IntegerConverter getIntegerConverter1() {
        return integerConverter1;
    }

    public void setIntegerConverter1(IntegerConverter ic) {
        this.integerConverter1 = ic;
    }

    private Script script1 = new Script();

    public Script getScript1() {
        return script1;
    }

    public void setScript1(Script s) {
        this.script1 = s;
    }

    private ListaRecursoCachedRowSetDataProvider listaRecursoDataProvider = new ListaRecursoCachedRowSetDataProvider();

    public ListaRecursoCachedRowSetDataProvider getListaRecursoDataProvider() {
        return listaRecursoDataProvider;
    }

    public void setListaRecursoDataProvider(ListaRecursoCachedRowSetDataProvider crsdp) {
        this.listaRecursoDataProvider = crsdp;
    }

    private HtmlPanelGrid gridPanel5 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel5() {
        return gridPanel5;
    }

    public void setGridPanel5(HtmlPanelGrid hpg) {
        this.gridPanel5 = hpg;
    }

    private HtmlPanelGrid gridPanel6 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel6() {
        return gridPanel6;
    }

    public void setGridPanel6(HtmlPanelGrid hpg) {
        this.gridPanel6 = hpg;
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
    public Recurso3() {
    }

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para el manejo de eventos de la pagina: init, preprocess, prerender y destroy">
    /**
     * <p>Metodo de devolucion de llamada al que se llama cuando se navega hasta esta pagina,
     * ya sea directamente mediante un URL o de manera indirecta a traves de la navegacion de paginas.
     * Puede personalizar este metodo para adquirir recursos que se necesitaran
     * para los controladores de eventos y metodos del proceso, sin tener en cuenta si esta
     * pagina realiza procesamiento de devolucion de envios.</p>
     *
     * <p>Tenga en cuenta que si la peticion actual es una devolucion de envio, los valores
     * de propiedad de los componentes <strong>no</strong> representan ningun
     * valor enviado con esta peticion.  En su lugar, representan los
     * valores de propiedades que se guardaron para esta vista cuando se proceso.</p>
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
     * <p>Metodo de devolucion de llamada al que se llama cuando el arbol de componentes se ha
     * restaurado, pero antes de que se produzca el procesamiento de cualquier evento.  Este metodo
     * <strong>solo</strong> se llamara en una peticion de devolucion de envio que
     * este procesando el envio de un formulario.  Puede personalizar este metodo para asignar
     * recursos necesarios para los controladores de eventos.</p>
     */
    @Override
    public void preprocess() {
        this.preprocesar();
    }

    /**
     * <p>Metodo de devolucion de llamada al que se llama justo antes del procesamiento.
     * <strong>solo</strong> se llamara a este metodo en la pagina que
     * se procesa, no se llamara, por ejemplo, en una pagina que
     * ha procesado una devolucion de envio y a continuacion ha navegado hasta otra pagina.  Puede personalizar
     * este metodo para asignar recursos necesarios para procesar
     * esta pagina.</p>
     */
    @Override
    public void prerender() {
        this.prepresentar();
    }

    /**
     * <p>Metodo de devolucion de llamada al que se llama cuando se completa el procesamiento de
     * esta peticion, si se llamo al metodo <code>init()</code> (sin tener en cuenta
     * si se trata de la pagina que se ha procesado o no).  Puede personalizar este
     * metodo para liberar los recursos adquiridos en los metodos <code>init()</code>,
     * <code>preprocess()</code> o <code>prerender()</code> (o
     * durante la ejecucion de un controlador de eventos).</p>
     */
    @Override
    //@PreDestroy
    public void destroy() {
        listaRecursoDataProvider.close();
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
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades de la interfaz PaginaConsultaConMaestro">
    public String getEtiquetaClaseMaestro() {
        return ETIQUETA_CLASE_MAESTRO;
    }

    @Override
    public String getEtiquetaClaseDetalle() {
        return ETIQUETA_CLASE_DETALLE;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades de la interfaz PaginaConsultaConArbol">
    @Override
    public Integer getOpcionZumSeleccionada() {
        return this.getRecursoDataProvider().getOpcionZumNodo() == null
                ? null : this.getRecursoDataProvider().getOpcionZumNodo().intValue();
    }

    @Override
    public void setOpcionZumSeleccionada(Integer opcionZumSeleccionada) {
        EnumOpcionZumNodo opcion = opcionZumSeleccionada == null ? null : EnumOpcionZumNodo.valueOf(opcionZumSeleccionada);
        this.getRecursoDataProvider().setOpcionZumNodo(opcion);
    }

    @Override
    public Object getColumnaEtiqueta() {
        return EnumColumnaEtiqueta.AMBAS_COLUMNAS;
    }

    @Override
    public String accionEscogerNodo() {
        this.getGestor().escoger();
        return null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="propiedad gestor de pagina de actualizacion con arbol">
    private GestorPaginaActualizacionConArbol gestor = new GestorPaginaActualizacionConArbol(this);

    @Override
    public GestorPaginaActualizacionConArbol getGestor() {
        return this.gestor;
    }
    // </editor-fold>
/**/
    private final static String ETIQUETA_MIGAS_PAN = "Recursos";

    private final static String ETIQUETA_CLASE_DETALLE = "";

    private final static String ETIQUETA_CLASE_MAESTRO = ""; // "de la clase|del tipo|del segmento|en condicion|..."

    @Override
    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getListaRecursoDataProvider();
    }

    @Override
    public long getFuncionConsultarRecurso() {
        return this.getListaRecursoDataProvider().getFuncionSelect();
    }

    @Override
    public long getFuncionCrearRecurso() {
        return -1; // return ListaRecursoCachedRowSetDataProvider2.FUNCION_CREAR_RECURSO_EQUIS;
    }

    @Override
    public long getFuncionModificarRecurso() {
        return -1; // return ListaRecursoCachedRowSetDataProvider2.FUNCION_MODIFICAR_RECURSO_EQUIS;
    }

    @Override
    public long getFuncionEliminarRecurso() {
        return -1; // return ListaRecursoCachedRowSetDataProvider2.FUNCION_ELIMINAR_RECURSO_EQUIS;
    }

    public RecursoCachedRowSetDataProvider getRecursoMaestroDataProvider() {
        return null; // return this.getRecursoMaestroEquisDataProvider();
    }

    public String getColumnaIdentificacionRecursoMaestro() {
        return null; // return ListaRecursoCachedRowSetDataProvider2.COLUMNA_ID_RECURSO_MAESTRO_EQUIS;
    }

    @Override
    public String getVinculoPaginaConsultaConTabla() {
        return "tabla";
    }

    @Override
    public String getVinculoPaginaConsultaDetalle() {
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
        this.setPropiedadesDataProvider();
        this.getGestor().prepresentar();
    }

    @Override
    public void consultar() {
        FiltroBusqueda filtro = this.getGestor().getFiltroBusqueda(
                this.getContextoPeticion().getFiltroFuncionSelect(),
                this.getContextoPeticion().getCodigoFuncionSelect(),
                this.getContextoPeticion().getNombreFuncionSelect());

        this.consultar(filtro);
    }

    public void consultar(Long filtro) {
        try {
            this.getListaRecursoDataProvider().setLimiteFilasFuncionSelect(500);
            this.getListaRecursoDataProvider().consultarRecurso(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
    }

    public void consultar(FiltroBusqueda filtro) {
        try {
            this.getListaRecursoDataProvider().setLimiteFilasFuncionSelect(500);
            this.getListaRecursoDataProvider().consultarRecurso(filtro);
        } catch (Exception ex) {
            this.getGestor().handle(ex);
        } finally {
            this.setConsultaPendiente(false);
        }
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

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para refrescar, agregar, editar, deshacer y eliminar de la plantilla #3">
    public String botonAplicarZum1_action() {
        this.getGestor().escoger();
        this.getGestor().zumNodo();
        return null;
    }

    public String botonQuitarZum1_action() {
        this.getGestor().escoger();
        this.getGestor().zumTodo();
        return null;
    }

    public String botonRefrescar1_action() {
        this.getGestor().refrescar();
//      this.getGestor().rearborizar();
        this.getGestor().escoger();
        this.getGestor().zumTodo();
        return null;
    }

    public String botonAgregar1_action() {
        this.getGestor().agregar();
        return this.getGestor().accionVincularDetalle();
    }

    public String botonEditar1_action() {
        this.getGestor().editar();
        return this.getGestor().accionVincularDetalle();
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
    private void setPropiedadesDataProvider() {
        this.getGestor().track("setPropiedadesDataProvider");
        Long funcion = this.getContextoPeticion().getIdentificacionFuncionReferencia();
        if (funcion != null) {
            try {
                String criterios1 = this.getContextoPeticion().getCriteriosBusqueda();
                String criterios2 = this.getListaRecursoDataProvider().getCriteriosBusqueda();
                boolean todoIgual = false;
                if (funcion.equals(this.getListaRecursoDataProvider().getFuncionSelect())) {
                    if (criterios1 == null && criterios2 == null) {
                        todoIgual = true;
                    } else if (criterios1 == null || criterios2 == null) {
                        todoIgual = false;
                    } else {
                        todoIgual = criterios1.equals(criterios2);
                    }
                }
                if (!todoIgual) {
                    this.getListaRecursoDataProvider().setFilaEscogida(null);
                    this.getListaRecursoDataProvider().setSoloReferencia(true);
                    this.getListaRecursoDataProvider().setFuncionSelect(funcion);
                    this.getListaRecursoDataProvider().setCriteriosBusqueda(criterios1);
                }
                if (this.getContextoPeticion().getFragmentoFiltroActual() != null) {
                    this.getContextoPeticion().getFragmentoFiltroActual().reiniciar();
                }
            } catch (Exception ex) {
                this.getGestor().handle(ex);
            }
        }
    }
}
