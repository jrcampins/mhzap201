/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los términos
 * de la licencia "GNU General Public License" publicada por la Fundación "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser útil, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas información.
 *
 */
package com.egt.web.proceso;

import com.egt.base.constants.CPP;
import com.egt.base.constants.URX2;
import com.egt.commons.util.Bit;
import com.egt.commons.util.BitUtils;
import com.egt.commons.util.ThrowableUtils;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.aplicacion.ExcepcionAplicacion;
import com.egt.core.aplicacion.FiltroBusqueda;
import com.egt.core.aplicacion.ListaParametros;
import com.egt.core.aplicacion.Mensaje;
import com.egt.core.aplicacion.TLC;
import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.FragmentoFiltroEstandar;
import com.egt.core.aplicacion.web.GestorPaginaBasica;
import com.egt.core.aplicacion.web.PaginaConsultaConFiltro;
import com.egt.core.constants.Global;
import com.egt.core.db.xdp.RecursoCachedRowSetDataProvider;
import com.egt.core.enums.EnumColumnaEtiqueta;
import com.egt.core.jsf.JSF;
import com.egt.data.general.xdp2.FiltroFuncionCachedRowSetDataProvider2;
import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.HiddenField;
import com.sun.webui.jsf.component.ImageComponent;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.TextField;
import java.util.Iterator;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.convert.LongConverter;
import javax.faces.event.ValueChangeEvent;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page
 * fragment.  This class contains component definitions (and initialization
 * code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class FragmentoFiltro_1 extends AbstractFragmentBean implements FragmentoFiltroEstandar {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        filtroDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.filtroRowSet}"));
    }

    private FiltroFuncionCachedRowSetDataProvider2 filtroDataProvider = new FiltroFuncionCachedRowSetDataProvider2();

    public FiltroFuncionCachedRowSetDataProvider2 getFiltroDataProvider() {
        return filtroDataProvider;
    }

    public void setFiltroDataProvider(FiltroFuncionCachedRowSetDataProvider2 crsdp) {
        this.filtroDataProvider = crsdp;
    }

    private HiddenField campoAplicarFiltro1 = new HiddenField();

    public HiddenField getCampoAplicarFiltro1() {
        return campoAplicarFiltro1;
    }

    public void setCampoAplicarFiltro1(HiddenField hf) {
        this.campoAplicarFiltro1 = hf;
    }

    private HtmlPanelGrid gridPanelCodigo1 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanelCodigo1() {
        return gridPanelCodigo1;
    }

    public void setGridPanelCodigo1(HtmlPanelGrid hpg) {
        this.gridPanelCodigo1 = hpg;
    }

    private ImageComponent imagenTextoFiltro1 = new ImageComponent();

    public ImageComponent getImagenTextoFiltro1() {
        return imagenTextoFiltro1;
    }

    public void setImagenTextoFiltro1(ImageComponent ic) {
        this.imagenTextoFiltro1 = ic;
    }

    private Label etiquetaTextoFiltro1 = new Label();

    public Label getEtiquetaTextoFiltro1() {
        return etiquetaTextoFiltro1;
    }

    public void setEtiquetaTextoFiltro1(Label l) {
        this.etiquetaTextoFiltro1 = l;
    }

    private HtmlPanelGrid gridPanelCodigo2 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanelCodigo2() {
        return gridPanelCodigo2;
    }

    public void setGridPanelCodigo2(HtmlPanelGrid hpg) {
        this.gridPanelCodigo2 = hpg;
    }

    private TextField textoFiltro1 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getTextoFiltro1() {
        return textoFiltro1;
    }

    public void setTextoFiltro1(TextField tf) {
        this.textoFiltro1 = tf;
    }

    private HtmlPanelGrid gridPanelCodigo3 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanelCodigo3() {
        return gridPanelCodigo3;
    }

    public void setGridPanelCodigo3(HtmlPanelGrid hpg) {
        this.gridPanelCodigo3 = hpg;
    }

    private Button botonBorrar1 = new Button();

    public Button getBotonBorrar1() {
        return botonBorrar1;
    }

    public void setBotonBorrar1(Button b) {
        this.botonBorrar1 = b;
    }

    private HtmlPanelGrid gridPanelNombre1 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanelNombre1() {
        return gridPanelNombre1;
    }

    public void setGridPanelNombre1(HtmlPanelGrid hpg) {
        this.gridPanelNombre1 = hpg;
    }

    private ImageComponent imagenTextoFiltro2 = new ImageComponent();

    public ImageComponent getImagenTextoFiltro2() {
        return imagenTextoFiltro2;
    }

    public void setImagenTextoFiltro2(ImageComponent ic) {
        this.imagenTextoFiltro2 = ic;
    }

    private Label etiquetaTextoFiltro2 = new Label();

    public Label getEtiquetaTextoFiltro2() {
        return etiquetaTextoFiltro2;
    }

    public void setEtiquetaTextoFiltro2(Label l) {
        this.etiquetaTextoFiltro2 = l;
    }

    private HtmlPanelGrid gridPanelNombre2 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanelNombre2() {
        return gridPanelNombre2;
    }

    public void setGridPanelNombre2(HtmlPanelGrid hpg) {
        this.gridPanelNombre2 = hpg;
    }

    private TextField textoFiltro2 = new com.egt.core.jsf.component.CampoTexto();

    public TextField getTextoFiltro2() {
        return textoFiltro2;
    }

    public void setTextoFiltro2(TextField tf) {
        this.textoFiltro2 = tf;
    }

    private HtmlPanelGrid gridPanelNombre3 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanelNombre3() {
        return gridPanelNombre3;
    }

    public void setGridPanelNombre3(HtmlPanelGrid hpg) {
        this.gridPanelNombre3 = hpg;
    }

    private Button botonBorrar2 = new Button();

    public Button getBotonBorrar2() {
        return botonBorrar2;
    }

    public void setBotonBorrar2(Button b) {
        this.botonBorrar2 = b;
    }

    private HtmlPanelGrid gridPanelFiltro1 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanelFiltro1() {
        return gridPanelFiltro1;
    }

    public void setGridPanelFiltro1(HtmlPanelGrid hpg) {
        this.gridPanelFiltro1 = hpg;
    }

    private ImageComponent imagenListaFiltro1 = new ImageComponent();

    public ImageComponent getImagenListaFiltro1() {
        return imagenListaFiltro1;
    }

    public void setImagenListaFiltro1(ImageComponent ic) {
        this.imagenListaFiltro1 = ic;
    }

    private Label etiquetaListaFiltro1 = new Label();

    public Label getEtiquetaListaFiltro1() {
        return etiquetaListaFiltro1;
    }

    public void setEtiquetaListaFiltro1(Label l) {
        this.etiquetaListaFiltro1 = l;
    }

    private HtmlPanelGrid gridPanelFiltro2 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanelFiltro2() {
        return gridPanelFiltro2;
    }

    public void setGridPanelFiltro2(HtmlPanelGrid hpg) {
        this.gridPanelFiltro2 = hpg;
    }

    private DropDown listaFiltro1 = new com.egt.core.jsf.component.ListaDesplegable();

    public DropDown getListaFiltro1() {
        return listaFiltro1;
    }

    public void setListaFiltro1(DropDown dd) {
        this.listaFiltro1 = dd;
    }

    private HtmlPanelGrid gridPanelFiltro3 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanelFiltro3() {
        return gridPanelFiltro3;
    }

    public void setGridPanelFiltro3(HtmlPanelGrid hpg) {
        this.gridPanelFiltro3 = hpg;
    }

    private Button botonBorrarFiltro1 = new Button();

    public Button getBotonBorrarFiltro1() {
        return botonBorrarFiltro1;
    }

    public void setBotonBorrarFiltro1(Button b) {
        this.botonBorrarFiltro1 = b;
    }

    private Button botonBuscarFiltro1 = new Button();

    public Button getBotonBuscarFiltro1() {
        return botonBuscarFiltro1;
    }

    public void setBotonBuscarFiltro1(Button b) {
        this.botonBuscarFiltro1 = b;
    }

    private Button botonBuscarFiltro2 = new Button();

    public Button getBotonBuscarFiltro2() {
        return botonBuscarFiltro2;
    }

    public void setBotonBuscarFiltro2(Button b) {
        this.botonBuscarFiltro2 = b;
    }

    private Button botonAplicarFiltro1 = new Button();

    public Button getBotonAplicarFiltro1() {
        return botonAplicarFiltro1;
    }

    public void setBotonAplicarFiltro1(Button b) {
        this.botonAplicarFiltro1 = b;
    }

    private Button botonQuitarFiltro1 = new Button();

    public Button getBotonQuitarFiltro1() {
        return botonQuitarFiltro1;
    }

    public void setBotonQuitarFiltro1(Button b) {
        this.botonQuitarFiltro1 = b;
    }

    private Button botonRestaurarFiltro1 = new Button();

    public Button getBotonRestaurarFiltro1() {
        return botonRestaurarFiltro1;
    }

    public void setBotonRestaurarFiltro1(Button b) {
        this.botonRestaurarFiltro1 = b;
    }

    private Button botonOcultarFiltro1 = new Button();

    public Button getBotonOcultarFiltro1() {
        return botonOcultarFiltro1;
    }

    public void setBotonOcultarFiltro1(Button b) {
        this.botonOcultarFiltro1 = b;
    }

    private Button botonMostrarFiltro1 = new Button();

    public Button getBotonMostrarFiltro1() {
        return botonMostrarFiltro1;
    }

    public void setBotonMostrarFiltro1(Button b) {
        this.botonMostrarFiltro1 = b;
    }

    private LongConverter longConverter1 = new LongConverter();

    public LongConverter getLongConverter1() {
        return longConverter1;
    }

    public void setLongConverter1(LongConverter lc) {
        this.longConverter1 = lc;
    }
    // </editor-fold>

    public FragmentoFiltro_1() {
    }

    /**
     * <p>Callback method that is called whenever a page containing
     * this page fragment is navigated to, either directly via a URL,
     * or indirectly via page navigation.  Override this method to acquire
     * resources that will be needed for event handlers and lifecycle methods.</p>
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    //@PostConstruct
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // -> add your own initialization code here
        this.preiniciar();
        // <editor-fold defaultstate="collapsed" desc="Visual-Web-managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // -> add your own initialization code here
        this.iniciar();
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called.  Override this
     * method to release resources acquired in the <code>init()</code>
     * resources that will be needed for event handlers and lifecycle methods.</p>
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    //@PreDestroy
    public void destroy() {
        filtroDataProvider.close();
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    // <editor-fold defaultstate="collapsed" desc="implementacion estandar de propiedades de la interfaz PaginaBasica">
    public ContextoPeticionEstandar getContextoPeticion() {
        return (ContextoPeticionEstandar) this.getRequestBean1().getContextoPeticion();
    }

    public ContextoSesionEstandar getContextoSesion() {
        return (ContextoSesionEstandar) this.getSessionBean1().getContextoSesion();
    }

    public ContextoAplicacionEstandar getContextoAplicacion() {
        return (ContextoAplicacionEstandar) this.getApplicationBean1().getContextoAplicacion();
    }
    // </editor-fold>

    private PaginaConsultaConFiltro getPaginaConsultaConFiltro() {
        return (PaginaConsultaConFiltro) this.getContextoPeticion().getPaginaActual();
    }

    public GestorPaginaBasica getGestor() {
        return this.getContextoPeticion().getGestorActual();
    }

    public RecursoCachedRowSetDataProvider getRecursoDataProvider() {
        return this.getPaginaConsultaConFiltro().getRecursoDataProvider();
    }

    private Bit bitFuncionHideFilterHabilitada = new Bit() {

        @Override
        public boolean isOn() {
            return getRecursoDataProvider().isFuncionHideFilterHabilitada();
        }
    };

    public Bit getBitFuncionHideFilterHabilitada() {
        return bitFuncionHideFilterHabilitada;
    }

    private Bit bitFuncionShowFilterHabilitada = new Bit() {

        @Override
        public boolean isOn() {
            return getRecursoDataProvider().isFuncionShowFilterHabilitada();
        }
    };

    public Bit getBitFuncionShowFilterHabilitada() {
        return bitFuncionShowFilterHabilitada;
    }

    private Bit bitFuncionViewFilterHabilitada = new Bit() {

        @Override
        public boolean isOn() {
            return getRecursoDataProvider().isFuncionViewFilterHabilitada();
        }
    };

    public Bit getBitFuncionViewFilterHabilitada() {
        return bitFuncionViewFilterHabilitada;
    }

    public boolean isFuncionSelectHabilitada() {
        return this.getRecursoDataProvider().isFuncionSelectHabilitada();
    }

    public boolean isFuncionSelectInhabilitada() {
        return !this.isFuncionSelectHabilitada();
    }

    public boolean isFuncionApplyFilterHabilitada() {
        return this.getRecursoDataProvider().isFuncionApplyFilterHabilitada();
    }

    public boolean isFuncionApplyFilterInhabilitada() {
        return !this.isFuncionApplyFilterHabilitada();
    }

    public boolean isFuncionRemoveFilterHabilitada() {
        return this.getRecursoDataProvider().isFuncionRemoveFilterHabilitada();
    }

    public boolean isFuncionRemoveFilterInhabilitada() {
        return !this.isFuncionRemoveFilterHabilitada();
    }

    public boolean isFuncionRestoreFilterHabilitada() {
        return this.getRecursoDataProvider().isFuncionRestoreFilterHabilitada();
    }

    public boolean isFuncionRestoreFilterInhabilitada() {
        return !this.isFuncionRestoreFilterHabilitada();
    }

    public boolean isFiltroPorCodigoHabilitado() {
        return this.getRecursoDataProvider().isRecursoCodificable() && this.isFuncionSelectHabilitada();
    }

    public boolean isFiltroPorCodigoInhabilitado() {
        return !this.isFiltroPorCodigoHabilitado();
    }

    public boolean isFiltroPorNombreHabilitado() {
        return this.getRecursoDataProvider().isRecursoNombrable() && this.isFuncionSelectHabilitada();
    }

    public boolean isFiltroPorNombreInhabilitado() {
        return !this.isFiltroPorNombreHabilitado();
    }

    public boolean isListaFiltroHabilitada() {
        String enabled = Bundle.getString("fragmento.filtro.lista.filtro.enabled");
        return BitUtils.valueOf(enabled) && this.isFuncionSelectHabilitada();
    }

    public boolean isListaFiltroInhabilitada() {
        return !this.isListaFiltroHabilitada();
    }

    public boolean isBotonFiltroHabilitado() {
        String enabled = Bundle.getString("fragmento.filtro.boton.filtro.enabled");
        return BitUtils.valueOf(enabled) && this.isFuncionSelectHabilitada();
    }

    public boolean isBotonFiltroInhabilitado() {
        return !this.isBotonFiltroHabilitado();
    }

    public String getEtiquetaCodigo() {
        return this.getRecursoDataProvider().isRecursoCodificable()
                ? this.getRecursoDataProvider().getRecursoCodificableDataProvider().getEtiquetaCodigoRecurso() : null;
    }

    public String getEtiquetaNombre() {
        return this.getRecursoDataProvider().isRecursoNombrable()
                ? this.getRecursoDataProvider().getRecursoNombrableDataProvider().getEtiquetaNombreRecurso() : null;
    }

    private static final String URL_IMAGEN_OK = "resources/ok_small.gif";

    private static final String URL_IMAGEN_OK_DIMMED = "resources/ok_dimmed.gif";

    private static final String URL_IMAGEN_WARNING = "resources/warning_small.gif";

    public String getValorTextoFiltro1() {
        return StringUtils.trimToNull(this.getRecursoDataProvider().getCodigoFuncionSelect());
    }

    public void setValorTextoFiltro1(String valor) {
        this.getRecursoDataProvider().setCodigoFuncionSelect(StringUtils.trimToNull(valor));
    }

    public String getUrlImagenTextoFiltro1() {
        String cx = this.getRecursoDataProvider().getCodigoFuncionSelect();
        cx = StringUtils.trimToNull(cx);
        return this.getRecursoDataProvider().isCodigoFuncionSelectModificado() ? URL_IMAGEN_WARNING : cx == null ? URL_IMAGEN_OK_DIMMED : URL_IMAGEN_OK;
    }

    public String getValorTextoFiltro2() {
        return StringUtils.trimToNull(this.getRecursoDataProvider().getNombreFuncionSelect());
    }

    public void setValorTextoFiltro2(String valor) {
        this.getRecursoDataProvider().setNombreFuncionSelect(StringUtils.trimToNull(valor));
    }

    public String getUrlImagenTextoFiltro2() {
        String nx = this.getRecursoDataProvider().getNombreFuncionSelect();
        nx = StringUtils.trimToNull(nx);
        return this.getRecursoDataProvider().isNombreFuncionSelectModificado() ? URL_IMAGEN_WARNING : nx == null ? URL_IMAGEN_OK_DIMMED : URL_IMAGEN_OK;
    }

    public Long getValorListaFiltro1() {
        return this.getRecursoDataProvider().getFiltroFuncionSelect();
    }

    public void setValorListaFiltro1(Long valor) {
        this.getRecursoDataProvider().setFiltroFuncionSelect(valor);
    }

    public String getUrlImagenListaFiltro1() {
        Long fx = this.getRecursoDataProvider().getFiltroFuncionSelect();
        return this.getRecursoDataProvider().isFiltroFuncionSelectModificado() ? URL_IMAGEN_WARNING : fx == null ? URL_IMAGEN_OK_DIMMED : URL_IMAGEN_OK;
    }

    protected void preiniciar() {
        this.track("preiniciar");
        this.getContextoPeticion().setFragmentoFiltroActual(this);
    }

    protected void iniciar() {
        this.track("iniciar");
        try {
            this.inicializarControles();
        } catch (Exception ex) {
            this.handle(ex);
        }
    }

    @Override
    public void reiniciar() {
        this.track("reiniciar");
        try {
            this.setValorListaFiltro1(null);
            this.setValorTextoFiltro1(null);
            this.setValorTextoFiltro2(null);
            this.consultar();
        } catch (Exception ex) {
            this.handle(ex);
        }
    }

    protected void inicializarControles() {
        this.getGridPanelCodigo1().setRendered(this.getRecursoDataProvider().isRecursoCodificable());
        this.getGridPanelCodigo2().setRendered(this.getRecursoDataProvider().isRecursoCodificable());
        this.getGridPanelCodigo3().setRendered(this.getRecursoDataProvider().isRecursoCodificable());
        this.getGridPanelNombre1().setRendered(this.getRecursoDataProvider().isRecursoNombrable());
        this.getGridPanelNombre2().setRendered(this.getRecursoDataProvider().isRecursoNombrable());
        this.getGridPanelNombre3().setRendered(this.getRecursoDataProvider().isRecursoNombrable());
    }

    public Object getItemsListaFiltro1() {
        this.track("getItemsListaFiltro1");
        Object items = null;
        Long valor = this.getRecursoDataProvider().getFuncionSelect();
        if (valor != null && valor > 0) {
            FiltroBusqueda filtro = new FiltroBusqueda();
            String clave = FiltroFuncionCachedRowSetDataProvider2.COLUMNA_ID_FUNCION;
            try {
                filtro.addCriterio(clave, valor);
                this.getFiltroDataProvider().consultarFiltroFuncion(filtro);
                items = this.getFiltroDataProvider().getListaOpciones(true, EnumColumnaEtiqueta.COLUMNA_NOMBRE);
            } catch (ExcepcionAplicacion ex) {
                items = null;
            }
        }
        return items;
    }

    protected void consultar() {
        /*
         * es necesario dejar que sea la pagina la que ejecute la consulta, dado que en preprsentar
         * la pagina tiene logica de validacion que debe ejecutarse antes de consultar.
         */
        this.setConsultaPendiente();
    }

    protected void consultar(Long filtro, String codigo, String nombre) {
        /*
         * es necesario dejar que sea la pagina la que ejecute la consulta, dado que en preprsentar
         * la pagina tiene logica de validacion que debe ejecutarse antes de consultar.
         */
        this.setConsultaPendiente(filtro, codigo, nombre);
    }

    protected void setConsultaPendiente() {
        this.setConsultaPendiente(
                this.getValorListaFiltro1(),
                this.getValorTextoFiltro1(),
                this.getValorTextoFiltro2());
    }

    protected void setConsultaPendiente(Long filtro, String codigo, String nombre) {
        this.getContextoPeticion().setFiltroFuncionSelect(filtro);
        this.getContextoPeticion().setCodigoFuncionSelect(StringUtils.trimToNull(codigo));
        this.getContextoPeticion().setNombreFuncionSelect(StringUtils.trimToNull(nombre));
        this.getPaginaConsultaConFiltro().setConsultaPendiente(true);
    }

    public String botonBorrar1_action() {
        this.setValorTextoFiltro1(null);
        return null;
    }

    public String botonBorrar2_action() {
        this.setValorTextoFiltro2(null);
        return null;
    }

    public String botonBorrarFiltro1_action() {
        this.setValorListaFiltro1(null);
        return null;
    }

    public String botonBuscarFiltro1_action() {
        this.track("botonBuscarFiltro1_action");
        return null;
    }

    public String getScriptBotonBuscarFiltro1() {
        this.track("getScriptBotonBuscarFiltro1");
        String car = this.getCampoAplicarFiltro1().getClientId(this.getFacesContext());
        String bar = this.getBotonAplicarFiltro1().getClientId(this.getFacesContext());
        long funcion = this.getRecursoDataProvider().getFuncionSelect();
        return this.getScriptAbrirVentanaFiltros(URX2.FILTRO_FUNCION, car, bar, funcion);
    }

    public String getScriptBotonBuscarFiltro2() {
        this.track("getScriptBotonBuscarFiltro2");
        String car = this.getCampoAplicarFiltro1().getClientId(this.getFacesContext());
        String bar = this.getBotonAplicarFiltro1().getClientId(this.getFacesContext());
        long funcion = this.getRecursoDataProvider().getFuncionSelect();
        Long filtro = this.getValorListaFiltro1();
        if (filtro == null) {
            return this.getScriptAbrirVentanaFiltros(URX2.FILTRO_FUNCION, car, bar, funcion);
        } else {
            return this.getScriptAbrirVentanaFiltros(URX2.FILTRO_FUNCION_PAR, car, bar, filtro);
        }
    }

    private String getScriptAbrirVentanaFiltros(String url, String car, String bar, long rm) {
        ListaParametros rpl = new ListaParametros();
        rpl.addParametro(CPP.ID_OPCION_CAMPO_RETORNO, FiltroFuncionCachedRowSetDataProvider2.COLUMNA_ID_FILTRO_FUNCION);
        rpl.addParametro(CPP.ID_CAMPO_ACCION_RETORNO, car);
        rpl.addParametro(CPP.ID_BOTON_ACCION_RETORNO, bar);
        rpl.addParametro(CPP.ID_RECURSO_MAESTRO, String.valueOf(rm));
        return JSF.getOpenWindowJavaScript(url, rpl.toString());
    }

    public String botonAplicarFiltro1_action() {
        try {
            if (this.getCampoAplicarFiltro1().getText() != null) {
                String filtro = (String) this.getCampoAplicarFiltro1().getText();
                this.getCampoAplicarFiltro1().setText(null);
                if (StringUtils.isNotBlank(filtro) && filtro.startsWith(Global.PREFIJO_STRING_ID_RECURSO)) {
                    Long valor = Long.valueOf(filtro.substring(1));
                    this.setValorListaFiltro1(valor);
                }
            }
            this.consultar();
        } catch (Exception ex) {
            this.handle(ex);
        } finally {
            return null;
        }
    }

    public String botonQuitarFiltro1_action() {
        this.consultar(null, null, null);
        return null;
    }

    public String botonRestaurarFiltro1_action() {
        this.setValorTextoFiltro1(this.getRecursoDataProvider().getCodigoFuncionSelectAnterior());
        this.setValorTextoFiltro2(this.getRecursoDataProvider().getNombreFuncionSelectAnterior());
        this.setValorListaFiltro1(this.getRecursoDataProvider().getFiltroFuncionSelectAnterior());
        this.consultar();
        return null;
    }

    public String botonOcultarFiltro1_action() {
        this.getRecursoDataProvider().setFiltroEscondido(true);
        return null;
    }

    public String botonMostrarFiltro1_action() {
        this.getRecursoDataProvider().setFiltroEscondido(false);
        return null;
    }

    public void listaFiltro1_processValueChange(ValueChangeEvent event) {
        /*
         * Dado que este drop-down tiene la opcion de enviar automaticamente al modificar
         * y la pagina puede tener una tabla actualizable, entonces no se debe consultar aqui;
         * hay que hacerlo en el prerender. Esto se logra con la propiedad consultaPendiente.
         *
         * OJO: con la funcion "erase" se podria haber solucionado este problema, pero ahora
         * es necesario dejar que sea la pagina la que ejecute la consulta, dado que en preprsentar
         * la pagina tiene logica de validacion que debe ejecutarse antes de consultar.
         */
        /*
         * Como ahora se aplican los 3 criterios (filtro, codigo y nombre) con un solo boton,
         * ya no se hace nada aqui; per aun se mantiene la opcion de enviar automaticamente
         * para actualizar el script cuando cambia de filtro.
         */
    }

    // <editor-fold defaultstate="collapsed" desc="metodos estandar para el manejo de errores (track, trace, handle, show, ...)">
    public void track(String metodo) {
        Bitacora.trace(this.getClass(), metodo);
    }

    public void trace(String mensaje) {
        Bitacora.trace(mensaje);
    }

    public void tell() {
        Iterator iterator = TLC.getBitacora().iterator();
        while (iterator.hasNext()) {
            Mensaje mensaje = (Mensaje) iterator.next();
            if (mensaje != null) {
                switch (mensaje.getSeveridad()) {
                    case INFORMATIVO:
                        this.info(mensaje.toString());
                        break;
                    case ADVERTENCIA:
                        this.warn(mensaje.toString());
                        break;
                    case ERROR:
                        this.error(mensaje.toString());
                        break;
                    case FATAL:
                        this.fatal(mensaje.toString());
                        break;
                    default:
                        this.info(mensaje.toString());
                        break;
                }
            }
        }
        TLC.getBitacora().clear();
    }

    public void handle(Exception ex) {
        String string = ThrowableUtils.getString(ex);
        if (TLC.getBitacora().contiene(string)) {
            this.tell();
        } else {
            this.tell();
            this.fatal(string);
            this.log(string, ex);
        }
    }
    // </editor-fold>
}
