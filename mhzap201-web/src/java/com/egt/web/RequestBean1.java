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

import com.egt.core.aplicacion.web.ContextoAplicacion;
import com.egt.core.aplicacion.web.ContextoPeticion;
import com.egt.core.aplicacion.web.ContextoPeticionBasico;
import com.egt.core.aplicacion.web.ContextoSesion;
import com.sun.rave.web.ui.appbase.AbstractRequestBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;

/**
 * <p>Request scope data bean for your application. Create properties here to represent data that should be
 * made available across different pages in the same HTTP request, so that the page bean classes do not have
 * to be directly linked to each other.</p>
 *
 * <p>An instance of this class will be created for you automatically, the first time your application
 * evaluates a value binding expression or method binding expression that references a managed bean using this
 * class.</p>
 */
public class RequestBean1 extends AbstractRequestBean implements ContextoPeticionBasico {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong> This method is
     * automatically generated, so any user-specified code inserted here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    // </editor-fold>
/**/

    /**
     * <p>Construct a new request data bean instance.</p>
     */
    public RequestBean1() {
        com.egt.core.aplicacion.Bitacora.trace(getClass().getName() + ".new");
    }

    /**
     * <p>This method is called when this bean is initially added to request scope. Typically, this occurs as
     * a result of evaluating a value binding or method binding expression, which utilizes the managed bean
     * facility to instantiate this bean and store it into request scope.</p>
     *
     * <p>You may customize this method to allocate resources that are required for the lifetime of the
     * current request.</p>
     */
    @Override
    @PostConstruct
    public void init() {
        com.egt.core.aplicacion.Bitacora.trace(getClass().getName() + ".init");
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // -> add your own initialization code here

        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
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
     * <p>This method is called when this bean is removed from request scope. This occurs automatically when
     * the corresponding HTTP response has been completed and sent to the client.</p>
     *
     * <p>You may customize this method to clean up resources allocated during the execution of the
     * <code>init()</code> method, or at any later time during the lifetime of the request.</p>
     */
    @Override
    @PreDestroy
    public void destroy() {
        com.egt.core.aplicacion.Bitacora.trace(getClass().getName() + ".destroy");
        this.destruir();
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

    // <editor-fold defaultstate="collapsed" desc="implementación estándar de propiedades y métodos de la interfaz ContextoAbstracto">
    @Override
    public FacesContext getFacesContext() {
        return super.getFacesContext();
    }

    @Override
    public Object getBean(String name) {
        return super.getBean(name);
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

    // <editor-fold defaultstate="collapsed" desc="implementación estándar de propiedades y métodos de la interfaz ContextoPeticionBasico">
    /**
     * Conserva el valor de la propiedad contextoPeticion.
     */
    private ContextoPeticion contextoPeticion;

    /**
     * Getter para propiedad contextoPeticion.
     *
     * @return Valor de la propiedad contextoPeticion.
     */
    @Override
    public ContextoPeticion getContextoPeticion() {
        return this.contextoPeticion;
    }

    /**
     * Getter para propiedad contextoSesion.
     *
     * @return Valor de la propiedad contextoSesion.
     */
    @Override
    public ContextoSesion getContextoSesion() {
        return this.getSessionBean1().getContextoSesion();
    }

    /**
     * Getter para propiedad contextoAplicacion.
     *
     * @return Valor de la propiedad contextoAplicacion.
     */
    @Override
    public ContextoAplicacion getContextoAplicacion() {
        return this.getApplicationBean1().getContextoAplicacion();
    }

    // </editor-fold>
/**/
    private void iniciar() {
        this.contextoPeticion = new ContextoPeticion(this);
    }

    private void destruir() {
        this.contextoPeticion.destruir();
        this.contextoPeticion = null;
    }

}
