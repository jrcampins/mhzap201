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
package com.egt.web;

import com.egt.core.aplicacion.web.ContextoAplicacionEstandar;
import com.egt.core.aplicacion.web.ContextoPeticionEstandar;
import com.egt.core.aplicacion.web.ContextoSesionEstandar;
import com.egt.core.aplicacion.web.PaginaBasica;
import com.egt.core.aplicacion.web.PaginaConsulta;
import com.egt.core.jsf.JSF;
import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.StaticText;
import javax.faces.FacesException;
import javax.faces.component.html.HtmlPanelGrid;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page fragment. This class contains component
 * definitions (and initialization code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior to respond to incoming events.</p>
 */
public class FragmentoCabeza2P extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong> This method is
     * automatically generated, so any user-specified code inserted here is subject to being replaced.</p>
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

    private StaticText staticText2 = new StaticText();

    public StaticText getStaticText2() {
        return staticText2;
    }

    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
    }
    // </editor-fold>

    public FragmentoCabeza2P() {
    }

    /**
     * <p>Callback method that is called whenever a page containing this page fragment is navigated to, either
     * directly via a URL, or indirectly via page navigation. Override this method to acquire resources that
     * will be needed for event handlers and lifecycle methods.</p>
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    @PostConstruct
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
     * <p>Callback method that is called after rendering is completed for this request, if
     * <code>init()</code> was called. Override this method to release resources acquired in the
     * <code>init()</code> resources that will be needed for event handlers and lifecycle methods.</p>
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    @PreDestroy
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

    public boolean isPaginaBasica() {
        return this.getPaginaBasica() != null;
    }

    public boolean isPaginaConsulta() {
        return this.getPaginaConsulta() != null;
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

    public String getScriptAyuda() {
        return JSF.getOpenHelpWindowJavaScript(this.getRequestBean1().getContextoPeticion().getPaginaActual().getClass().getSimpleName());
    }

    public String getScriptCerrar() {
        return JSF.getCloseWindowJavaScript();
    }

}
