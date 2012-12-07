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
package com.egt.web.usuario;

import com.egt.base.constants.CPP;
import com.egt.base.constants.URX2;
import com.egt.commons.list.ListOptions;
import com.egt.commons.util.Bit;
import com.egt.commons.util.BitUtils;
import com.egt.core.aplicacion.ListaParametros;
import com.egt.core.aplicacion.TLC;
import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.GestorPaginaActualizacion;
import com.egt.core.aplicacion.web.GestorPaginaActualizacionConArbol;
import com.egt.core.aplicacion.web.GestorPaginaActualizacionConTabla;
import com.egt.core.aplicacion.web.GestorPaginaBasica;
import com.egt.core.aplicacion.web.PaginaBasica;
import com.egt.core.aplicacion.web.PaginaConsulta;
import com.egt.core.aplicacion.web.PaginaConsultaConArbol;
import com.egt.core.aplicacion.web.PaginaConsultaConExportacion;
import com.egt.core.aplicacion.web.PaginaConsultaConInforme;
import com.egt.core.aplicacion.web.PaginaConsultaConMaestro;
import com.egt.core.aplicacion.web.PaginaConsultaConTabla;
import com.egt.core.db.util.Reporter;
import com.egt.core.jsf.JSF;
import com.egt.ejb.core.exporter.ExporterBrokerLocal;
import com.egt.ejb.core.reporter.ReporterBrokerLocal;
import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.StaticText;
import java.io.File;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.convert.IntegerConverter;
import org.apache.commons.lang.StringUtils;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page
 * fragment.  This class contains component definitions (and initialization
 * code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class FragmentoCabeza2 extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
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

    private StaticText staticText1 = new StaticText();

    public StaticText getStaticText1() {
        return staticText1;
    }

    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }

    private HtmlPanelGrid gridPanel3 = new HtmlPanelGrid();

    public HtmlPanelGrid getGridPanel3() {
        return gridPanel3;
    }

    public void setGridPanel3(HtmlPanelGrid hpg) {
        this.gridPanel3 = hpg;
    }

    private Button botonEjecutarInforme1 = new Button();

    public Button getBotonEjecutarInforme1() {
        return botonEjecutarInforme1;
    }

    public void setBotonEjecutarInforme1(Button b) {
        this.botonEjecutarInforme1 = b;
    }

    private Button botonExportarArchivo1 = new Button();

    public Button getBotonExportarArchivo1() {
        return botonExportarArchivo1;
    }

    public void setBotonExportarArchivo1(Button b) {
        this.botonExportarArchivo1 = b;
    }

    private Button botonBitacoraFunciones1 = new Button();

    public Button getBotonBitacoraFunciones1() {
        return botonBitacoraFunciones1;
    }

    public void setBotonBitacoraFunciones1(Button b) {
        this.botonBitacoraFunciones1 = b;
    }

    private Button botonBitacoraInformes1 = new Button();

    public Button getBotonBitacoraInformes1() {
        return botonBitacoraInformes1;
    }

    public void setBotonBitacoraInformes1(Button b) {
        this.botonBitacoraInformes1 = b;
    }

    private Button botonBitacoraProcesos1 = new Button();

    public Button getBotonBitacoraProcesos1() {
        return botonBitacoraProcesos1;
    }

    public void setBotonBitacoraProcesos1(Button b) {
        this.botonBitacoraProcesos1 = b;
    }

    private Button botonCambiarPassword1 = new Button();

    public Button getBotonCambiarPassword1() {
        return botonCambiarPassword1;
    }

    public void setBotonCambiarPassword1(Button b) {
        this.botonCambiarPassword1 = b;
    }

    private Button botonAyuda1 = new Button();

    public Button getBotonAyuda1() {
        return botonAyuda1;
    }

    public void setBotonAyuda1(Button b) {
        this.botonAyuda1 = b;
    }

    private Button botonCerrar1 = new Button();

    public Button getBotonCerrar1() {
        return botonCerrar1;
    }

    public void setBotonCerrar1(Button b) {
        this.botonCerrar1 = b;
    }

    private Button botonVerArbol1 = new Button();

    public Button getBotonVerArbol1() {
        return botonVerArbol1;
    }

    public void setBotonVerArbol1(Button b) {
        this.botonVerArbol1 = b;
    }

    private Button botonVerTabla1 = new Button();

    public Button getBotonVerTabla1() {
        return botonVerTabla1;
    }

    public void setBotonVerTabla1(Button b) {
        this.botonVerTabla1 = b;
    }

    private Button botonVerDetalle1 = new Button();

    public Button getBotonVerDetalle1() {
        return botonVerDetalle1;
    }

    public void setBotonVerDetalle1(Button b) {
        this.botonVerDetalle1 = b;
    }

    private StaticText staticText2 = new StaticText();

    public StaticText getStaticText2() {
        return staticText2;
    }

    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
    }

    private IntegerConverter listaComandoAbrir1Converter = new IntegerConverter();

    public IntegerConverter getListaComandoAbrir1Converter() {
        return listaComandoAbrir1Converter;
    }

    public void setListaComandoAbrir1Converter(IntegerConverter ic) {
        this.listaComandoAbrir1Converter = ic;
    }

    private IntegerConverter listaComandoGuardar1Converter = new IntegerConverter();

    public IntegerConverter getListaComandoGuardar1Converter() {
        return listaComandoGuardar1Converter;
    }

    public void setListaComandoGuardar1Converter(IntegerConverter ic) {
        this.listaComandoGuardar1Converter = ic;
    }

    private IntegerConverter listaComandoVer1Converter = new IntegerConverter();

    public IntegerConverter getListaComandoVer1Converter() {
        return listaComandoVer1Converter;
    }

    public void setListaComandoVer1Converter(IntegerConverter ic) {
        this.listaComandoVer1Converter = ic;
    }
    // </editor-fold>
/**/

    public FragmentoCabeza2() {
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
/**/
    private PaginaBasica getPaginaBasica() {
        return this.getContextoPeticion().getPaginaActual() instanceof PaginaBasica
                ? (PaginaBasica) this.getContextoPeticion().getPaginaActual()
                : null;
    }

    private PaginaConsulta getPaginaConsulta() {
        return this.getContextoPeticion().getPaginaActual() instanceof PaginaConsulta
                ? (PaginaConsulta) this.getContextoPeticion().getPaginaActual()
                : null;
    }

    private PaginaConsultaConArbol getPaginaConsultaConArbol() {
        return this.getContextoPeticion().getPaginaActual() instanceof PaginaConsultaConArbol
                ? (PaginaConsultaConArbol) this.getContextoPeticion().getPaginaActual()
                : null;
    }

    private PaginaConsultaConTabla getPaginaConsultaConTabla() {
        return this.getContextoPeticion().getPaginaActual() instanceof PaginaConsultaConTabla
                ? (PaginaConsultaConTabla) this.getContextoPeticion().getPaginaActual()
                : null;
    }

    private PaginaConsultaConMaestro getPaginaConsultaConMaestro() {
        return this.getContextoPeticion().getPaginaActual() instanceof PaginaConsultaConMaestro
                ? (PaginaConsultaConMaestro) this.getContextoPeticion().getPaginaActual()
                : null;
    }

    private PaginaConsultaConInforme getPaginaConsultaConInforme() {
        return this.getContextoPeticion().getPaginaActual() instanceof PaginaConsultaConInforme
                ? (PaginaConsultaConInforme) this.getContextoPeticion().getPaginaActual()
                : null;
    }

    private PaginaConsultaConExportacion getPaginaConsultaConExportacion() {
        return this.getContextoPeticion().getPaginaActual() instanceof PaginaConsultaConExportacion
                ? (PaginaConsultaConExportacion) this.getContextoPeticion().getPaginaActual()
                : null;
    }

    private GestorPaginaActualizacion getGestorPaginaActualizacion() {
        return this.getContextoPeticion().getGestorActual() instanceof GestorPaginaActualizacion
                ? (GestorPaginaActualizacion) this.getContextoPeticion().getGestorActual()
                : null;
    }

    private GestorPaginaActualizacionConArbol getGestorPaginaActualizacionConArbol() {
        return this.getContextoPeticion().getGestorActual() instanceof GestorPaginaActualizacionConArbol
                ? (GestorPaginaActualizacionConArbol) this.getContextoPeticion().getGestorActual()
                : null;
    }

    private GestorPaginaActualizacionConTabla getGestorPaginaActualizacionConTabla() {
        return this.getContextoPeticion().getGestorActual() instanceof GestorPaginaActualizacionConTabla
                ? (GestorPaginaActualizacionConTabla) this.getContextoPeticion().getGestorActual()
                : null;
    }

    public GestorPaginaBasica getGestor() {
        return this.getContextoPeticion().getGestorActual();
    }

    public boolean isPaginaBasica() {
        return this.getPaginaBasica() != null;
    }

    public boolean isPaginaConsulta() {
        return this.getPaginaConsulta() != null;
    }

    public boolean isPaginaConsultaConArbol() {
        return this.getPaginaConsultaConArbol() != null;
    }

    public boolean isPaginaConsultaConTabla() {
        return this.getPaginaConsultaConTabla() != null;
    }

    public boolean isPaginaConsultaConMaestro() {
        return this.getPaginaConsultaConMaestro() != null;
    }

    public boolean isPaginaConsultaConInforme() {
        return this.getPaginaConsultaConInforme() != null;
    }

    public boolean isPaginaConsultaConExportacion() {
        return this.getPaginaConsultaConExportacion() != null;
    }

    public boolean isGestorPaginaActualizacion() {
        return this.getGestorPaginaActualizacion() != null;
    }

    public boolean isGestorPaginaActualizacionConArbol() {
        return this.getGestorPaginaActualizacionConArbol() != null;
    }

    public boolean isGestorPaginaActualizacionConTabla() {
        return this.getGestorPaginaActualizacionConTabla() != null;
    }

    public boolean isArbolDisponible() {
        return ((this.isGestorPaginaActualizacionConTabla() &&
                this.getGestorPaginaActualizacionConTabla().isArbolDisponible()));
    }

    public boolean isTablaDisponible() {
        return ((this.isGestorPaginaActualizacionConArbol() &&
                this.getGestorPaginaActualizacionConArbol().isTablaDisponible()));
    }

    public boolean isDetalleDisponible() {
        return ((this.isGestorPaginaActualizacionConTabla() &&
                this.getGestorPaginaActualizacionConTabla().isDetalleDisponible()) ||
                (this.isGestorPaginaActualizacionConArbol() &&
                this.getGestorPaginaActualizacionConArbol().isDetalleDisponible()));
    }

    public boolean isFuncionReportDisponible() {
        return this.isPaginaConsultaConInforme() || this.reportFileExists();
    }

    public boolean isFuncionExportDisponible() {
        return this.isPaginaConsulta();
    }

    public boolean isFuncionSelectHabilitada() {
        return this.isPaginaConsulta() && this.getPaginaConsulta().getRecursoDataProvider().isFuncionSelectHabilitada();
    }

    public boolean isFuncionSelectInhabilitada() {
        return !this.isFuncionSelectHabilitada();
    }

    public boolean isFuncionDetalleHabilitada() {
        return this.isPaginaConsulta() && this.getPaginaConsulta().getRecursoDataProvider().isFilaEscogidaDisponible();
    }

    public boolean isFuncionDetalleInhabilitada() {
        return !isFuncionDetalleHabilitada();
    }

    public boolean isFuncionAbrirFavoritosHabilitada() {
        String enabled = Bundle.getString("fragmento.cabeza.boton.abrir.favoritos.enabled");
        return BitUtils.valueOf(enabled);
    }

    private Bit bitFuncionAbrirFavoritosDisponible = new Bit() {

        @Override
        public boolean isOn() {
            return isFuncionAbrirFavoritosHabilitada();
        }
    };

    public Bit getBitFuncionAbrirFavoritosDisponible() {
        return bitFuncionAbrirFavoritosDisponible;
    }

    public boolean isFuncionAgregarFavoritosHabilitada() {
        String enabled = Bundle.getString("fragmento.cabeza.boton.agregar.favoritos.enabled");
        return !BitUtils.valueOf(enabled) ? false
                : this.isPaginaConsultaConMaestro() ? false
                : this.isPaginaConsultaConTabla() || this.isPaginaConsultaConArbol() ? true
                : this.isPaginaConsulta() ? false
                : this.isPaginaBasica();
    }

    private Bit bitFuncionAgregarFavoritosDisponible = new Bit() {

        @Override
        public boolean isOn() {
            return isFuncionAgregarFavoritosHabilitada();
        }
    };

    public Bit getBitFuncionAgregarFavoritosDisponible() {
        return bitFuncionAgregarFavoritosDisponible;
    }

    public boolean isFuncionCambiarPasswordHabilitada() {
        String enabled = Bundle.getString("fragmento.cabeza.boton.cambiar.password.enabled");
        return BitUtils.valueOf(enabled);
    }

    private Bit bitFuncionCambiarPasswordDisponible = new Bit() {

        @Override
        public boolean isOn() {
            return isFuncionCambiarPasswordHabilitada();
        }
    };

    public Bit getBitFuncionCambiarPasswordDisponible() {
        return bitFuncionCambiarPasswordDisponible;
    }

    public String getNombreAplicacion() {
        return this.getApplicationBean1().getNombreAplicacion();
    }

    public String getNombrePagina() {
        if (this.isPaginaConsulta()) {
            return this.getPaginaConsulta().getEtiquetaClaseDetalle();
        } else if (this.isPaginaBasica()) {
            return this.getPaginaBasica().getEtiquetaMigasPan();
        } else {
            return null;
        }
    }

    public String getUrlImagenVerArbol() {
        return this.isFuncionSelectHabilitada()
                ? "resources/vtree.gif"
                : "resources/vtree_dimmed.gif";
    }

    public String getUrlImagenVerTabla() {
        return this.isFuncionSelectHabilitada()
                ? "resources/vtable.gif"
                : "resources/vtable_dimmed.gif";
    }

    public String getUrlImagenVerDetalle() {
        return this.isFuncionDetalleHabilitada()
                ? "resources/vform.gif"
                : "resources/vform_dimmed.gif";
    }

    public String getUrlImagenEjecutarInforme() {
        return this.isFuncionSelectHabilitada()
                ? "resources/run_report.gif"
                : "resources/run_report_dimmed.gif";
    }

    public String getUrlImagenExportarArchivo() {
        return this.isFuncionSelectHabilitada()
                ? "resources/run_export.gif"
                : "resources/run_export_dimmed.gif";
    }

    public String botonVerArbol1_action() {
        return this.accionVincularArbol();
    }

    public String botonVerTabla1_action() {
        return this.accionVincularTabla();
    }

    public String botonVerDetalle1_action() {
        return this.accionVincularDetalle();
    }

    public String botonEjecutarInforme1_action() {
        return this.accionEjecutarInforme();
    }

    public String botonExportarArchivo1_action() {
        return this.accionExportarArchivo();
    }

    public String botonFavoritos1_action() {
        return null;
    }

    public String botonFavoritos2_action() {
        try {
            String procedimiento = "pagina_usuario_insert";
            String aplicacion = this.getApplicationBean1().getCodigoAplicacion();
            String pagina = this.getRequestBean1().getContextoPeticion().getPaginaActual().getClass().getSimpleName();
            Long usuario = this.getContextoSesion().getUsuarioAutenticado().getIdUsuario();
            TLC.getAgenteSql().executeProcedure(procedimiento, new Object[]{aplicacion, pagina, usuario});
            TLC.getBitacora().info(com.egt.core.util.Bundle.getString("favorito_agregado_exitosamente"));
        } catch (Exception ex) {
            TLC.getBitacora().error(ex);
        }
        return null;
    }

    public String getScriptFunciones() {
        String urx = URX2.RASTRO_FUNCION;
        return JSF.getOpenWindowJavaScript(urx, null);
    }

    public String getScriptInformes() {
        String urx = URX2.RASTRO_INFORME;
        return JSF.getOpenWindowJavaScript(urx, null);
    }

    public String getScriptProcesos() {
        String urx = URX2.RASTRO_PROCESO;
        return JSF.getOpenWindowJavaScript(urx, null);
    }

    public String getScriptFavoritos() {
        String urx = URX2.FAVORITOS;
        return JSF.getOpenWindowJavaScript(urx, null);
    }

    public String getScriptCambiarPassword() {
        ListaParametros rpl = new ListaParametros();
        Long recurso = this.getContextoSesion().getUsuarioAutenticado().getIdUsuario();
        rpl.addParametro(CPP.ID_RECURSO, recurso);
        return JSF.getOpenWindowJavaScript(URX2.CAMBIO_PASSWORD, null);
    }

    public String getScriptAyuda() {
        return JSF.getOpenHelpWindowJavaScript(this.getRequestBean1().getContextoPeticion().getPaginaActual().getClass().getSimpleName());
    }

    public String getScriptCerrar() {
        return JSF.getCloseWindowJavaScript();
    }

    public String accionVincularArbol() {
        return this.isGestorPaginaActualizacionConTabla()
                ? this.getGestorPaginaActualizacionConTabla().accionVincularArbol()
                : null;
    }

    public String accionVincularTabla() {
        return this.isGestorPaginaActualizacionConArbol()
                ? this.getGestorPaginaActualizacionConArbol().accionVincularTabla()
                : null;
    }

    public String accionVincularDetalle() {
        if (this.isGestorPaginaActualizacionConTabla()) {
            return this.getGestorPaginaActualizacionConTabla().accionVincularDetalle();
        }
        if (this.isGestorPaginaActualizacionConArbol()) {
            return this.getGestorPaginaActualizacionConArbol().accionVincularDetalle();
        }
        return null;
    }

    @EJB
    private ReporterBrokerLocal reporter;

    private String accionEjecutarInforme() {
        if (this.isPaginaConsultaConInforme()) {
            this.getPaginaConsultaConInforme().informar();
        } else if (this.isPaginaConsulta()) {
            String informe = this.getJasperReportName();
            if (StringUtils.isNotBlank(informe)) {
                long funcion = this.getPaginaConsulta().getRecursoDataProvider().getFuncionSelect();
                String select = this.getPaginaConsulta().getRecursoDataProvider().getComandoSelectAnsi();
//              Reporter.executeReport(informe, funcion, select);
                reporter.executeReport(informe, funcion, select);
            }
        }
        return null;
    }

    @EJB
    private ExporterBrokerLocal exporter;

    private String accionExportarArchivo() {
        if (this.isPaginaConsultaConExportacion()) {
            this.getPaginaConsultaConExportacion().exportar();
        } else if (this.isPaginaConsulta()) {
            String informe = this.getJasperReportName();
            if (StringUtils.isBlank(informe)) {
                informe = this.getPaginaConsulta().getRecursoDataProvider().getCodigoDominioRecurso();
            }
            long funcion = this.getPaginaConsulta().getRecursoDataProvider().getFuncionSelect();
            String select = this.getPaginaConsulta().getRecursoDataProvider().getComandoSelectAnsi();
//          RX.executeExport(informe, funcion, select);
            exporter.executeExport(informe, funcion, select);
        }
        return null;
    }

    private boolean reportFileExists() {
        File file = this.getJasperReportFile();
        return file != null && file.exists();
    }

    private String getJasperReportName() {
        return this.getJasperReportName(this.getJasperReportFile());
    }

    private String getJasperReportName(File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        String filename = file.getName();
        int i = filename.lastIndexOf('.');
        int j = i < 0 ? filename.length() : i;
        return filename.substring(0, j);
    }

    private File getJasperReportFile() {
        File file = null;
        String reportName;
        String reportSourceFileName;
        if (this.isPaginaConsulta()) {
            reportName = this.getPaginaConsulta().getClass().getSimpleName();
            reportSourceFileName = Reporter.getReportSourceFileName(reportName);
            file = new File(reportSourceFileName);
            if (!file.exists()) {
                reportName = this.getPaginaConsulta().getRecursoDataProvider().getCodigoDominioRecurso();
                reportSourceFileName = Reporter.getReportSourceFileName(reportName);
                file = new File(reportSourceFileName);
            }
        }
        return file;
    }

    static final int ABRIR_BITACORA_FUNCIONES = 3;

    static final int ABRIR_BITACORA_INFORMES = 1;

    static final int ABRIR_BITACORA_PROCESOS = 2;

    static final int ABRIR_PASSWORD = 4;

    public ArrayList getOpcionesListaComandoAbrir() {
        ListOptions list = new ListOptions(false, false);
//      list.add("",
//              this.getGestor().getI18n().getEtiquetaSeleccioneUnaOpcionListaComandoAbrir(),
//              this.getGestor().getI18n().getToolTipListaComandoAbrir());
        list.add(Integer.valueOf(ABRIR_BITACORA_FUNCIONES),
                this.getGestor().getI18n().getTextoBotonAbrirBitacoraFunciones(),
                this.getGestor().getI18n().getToolTipBotonAbrirBitacoraFunciones());
//      if (this.isFuncionExportDisponible() || this.isFuncionReportDisponible()) {
        list.add(Integer.valueOf(ABRIR_BITACORA_INFORMES),
                this.getGestor().getI18n().getTextoBotonAbrirBitacoraInformes(),
                this.getGestor().getI18n().getToolTipBotonAbrirBitacoraInformes());
//      }
        list.add(Integer.valueOf(ABRIR_BITACORA_PROCESOS),
                this.getGestor().getI18n().getTextoBotonAbrirBitacoraProcesos(),
                this.getGestor().getI18n().getToolTipBotonAbrirBitacoraProcesos());
//      list.add(Integer.valueOf(ABRIR_PASSWORD),
//              this.getGestor().getI18n().getTextoBotonCambiarPassword(),
//              this.getGestor().getI18n().getToolTipBotonCambiarPassword());
        return JSF.getListaOpciones(list);
    }

    private Bit bitComandoAbrirDisponible = new Bit();

    public Bit getBitComandoAbrirDisponible() {
        return bitComandoAbrirDisponible;
    }

    private Integer comandoAbrir;

    public Integer getComandoAbrir() {
        return comandoAbrir;
    }

    public void setComandoAbrir(Integer comandoAbrir) {
        this.comandoAbrir = comandoAbrir;
    }

    public boolean isComandoAbrirHabilitado() {
        return comandoAbrir != null;
    }

    public boolean isComandoAbrirInhabilitado() {
        return !this.isComandoAbrirHabilitado();
    }

    public String botonComandoAbrir1_action() {
        return null;
    }

    public String getScriptComandoAbrir() {
        if (this.isComandoAbrirHabilitado()) {
            switch (comandoAbrir) {
                case ABRIR_BITACORA_FUNCIONES:
                    return this.getScriptFunciones();
                case ABRIR_BITACORA_INFORMES:
                    return this.getScriptInformes();
                case ABRIR_BITACORA_PROCESOS:
                    return this.getScriptProcesos();
//              case ABRIR_PASSWORD:
//                  return this.getScriptCambiarPassword();
                default:
                    return null;
            }
        }
//      return this.isFuncionExportDisponible() || this.isFuncionReportDisponible() ? this.getScriptInformes() : this.getScriptProcesos();
        return this.getScriptInformes();
    }

    static final int GUARDAR_ARCHIVO = 2;

    static final int GUARDAR_INFORME = 1;

    public ArrayList getOpcionesListaComandoGuardar() {
        ListOptions list = new ListOptions(false, false);
//      list.add("",
//              this.getGestor().getI18n().getEtiquetaSeleccioneUnaOpcionListaComandoGuardar(),
//              this.getGestor().getI18n().getToolTipListaComandoGuardar());
        if (this.isFuncionExportDisponible()) {
            list.add(Integer.valueOf(GUARDAR_ARCHIVO),
                    this.getGestor().getI18n().getTextoBotonExportarArchivo(),
                    this.getGestor().getI18n().getToolTipBotonExportarArchivo());
        }
        if (this.isFuncionReportDisponible()) {
            list.add(Integer.valueOf(GUARDAR_INFORME),
                    this.getGestor().getI18n().getTextoBotonEjecutarInforme(),
                    this.getGestor().getI18n().getToolTipBotonEjecutarInforme());
        }
        return JSF.getListaOpciones(list);
    }

    private Bit bitComandoGuardarDisponible = new Bit() {
        // override isOn

        @Override
        public boolean isOn() {
            return isFuncionExportDisponible() || isFuncionReportDisponible();
        }
    };

    public Bit getBitComandoGuardarDisponible() {
        return bitComandoGuardarDisponible;
    }

    private Integer comandoGuardar;

    public Integer getComandoGuardar() {
        return comandoGuardar;
    }

    public void setComandoGuardar(Integer comandoGuardar) {
        this.comandoGuardar = comandoGuardar;
    }

    public boolean isComandoGuardarHabilitado() {
        return comandoGuardar != null && this.isFuncionSelectHabilitada();
    }

    public boolean isComandoGuardarInhabilitado() {
        return !this.isComandoGuardarHabilitado();
    }

    public String botonComandoGuardar1_action() {
        return this.accionComandoGuardar();
    }

    public String getScriptComandoGuardar() {
        return null;
    }

    public String accionComandoGuardar() {
        if (this.isComandoGuardarHabilitado()) {
            switch (comandoGuardar) {
                case GUARDAR_ARCHIVO:
                    return this.accionExportarArchivo();
                case GUARDAR_INFORME:
                    return this.accionEjecutarInforme();
                default:
                    return null;
            }
        }
        return null;
    }

    static final int VER_ARBOL = 1;

    static final int VER_DETALLE = 3;

    static final int VER_TABLA = 2;

    public ArrayList getOpcionesListaComandoVer() {
        ListOptions list = new ListOptions(false, false);
//      list.add("",
//          this.getGestor().getI18n().getEtiquetaSeleccioneUnaOpcionListaComandoVer(),
//          this.getGestor().getI18n().getToolTipListaComandoVer());
        if (this.isArbolDisponible()) {
            list.add(Integer.valueOf(VER_ARBOL),
                    this.getGestor().getI18n().getTextoBotonVerArbol(),
                    this.getGestor().getI18n().getToolTipBotonVerArbol());
        }
        if (this.isDetalleDisponible()) {
            list.add(Integer.valueOf(VER_DETALLE),
                    this.getGestor().getI18n().getTextoBotonVerDetalle(),
                    this.getGestor().getI18n().getToolTipBotonVerDetalle());
        }
        if (this.isTablaDisponible()) {
            list.add(Integer.valueOf(VER_TABLA),
                    this.getGestor().getI18n().getTextoBotonVerTabla(),
                    this.getGestor().getI18n().getToolTipBotonVerTabla());
        }
        return JSF.getListaOpciones(list);
    }

    private Bit bitComandoVerDisponible = new Bit() {
        // override isOn

        @Override
        public boolean isOn() {
            return isArbolDisponible() || isTablaDisponible() || isDetalleDisponible();
        }
    };

    public Bit getBitComandoVerDisponible() {
        return bitComandoVerDisponible;
    }

    private Integer comandoVer;

    public Integer getComandoVer() {
        return comandoVer;
//      return comandoVer != null ? comandoVer
//              : this.isArbolDisponible() ? VER_ARBOL
//              : this.isTablaDisponible() ? VER_TABLA
//              : this.isDetalleDisponible() ? VER_DETALLE
//              : null;
    }

    public void setComandoVer(Integer comandoVer) {
        this.comandoVer = comandoVer;
    }

    public boolean isComandoVerHabilitado() {
        if (comandoVer != null) {
            switch (comandoVer) {
                case VER_ARBOL:
                    return this.isFuncionSelectHabilitada();
                case VER_DETALLE:
                    return this.isFuncionDetalleHabilitada();
                case VER_TABLA:
                    return this.isFuncionSelectHabilitada();
                default:
                    return false;
            }
        }
        return false;
    }

    public boolean isComandoVerInhabilitado() {
        return !this.isComandoVerHabilitado();
    }

    public String botonComandoVer1_action() {
        return this.accionComandoVer();
    }

    public String getScriptComandoVer() {
        return null;
    }

    public String accionComandoVer() {
        if (this.isComandoVerHabilitado()) {
            switch (comandoVer) {
                case VER_ARBOL:
                    return this.accionVincularArbol();
                case VER_DETALLE:
                    return this.accionVincularDetalle();
                case VER_TABLA:
                    return this.accionVincularTabla();
                default:
                    return null;
            }
        }
        return null;
    }
}
