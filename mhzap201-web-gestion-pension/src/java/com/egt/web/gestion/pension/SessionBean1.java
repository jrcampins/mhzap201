/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.web.gestion.pension;

import com.egt.core.aplicacion.web.ContextoAplicacion;
import com.egt.core.aplicacion.web.ContextoSesion;
import com.egt.core.aplicacion.web.ContextoSesionBasico;
import com.egt.core.db.xdp.RecursoCachedRowSet;
import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import com.sun.sql.rowset.CachedRowSetXImpl;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;

/**
 * <p>Session scope data bean for your application.  Create properties
 *  here to represent cached data that should be made available across
 *  multiple HTTP requests for an individual user.</p>
 *
 * <p>An instance of this class will be created for you automatically,
 * the first time your application evaluates a value binding expression
 * or method binding expression that references a managed bean using
 * this class.</p>
 */
public class SessionBean1 extends AbstractSessionBean implements ContextoSesionBasico {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        if (showTime) {
            return;
        }
        filtroRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        filtroRowSet.setCommand("SELECT * FROM consulta_filtro_funcion_1");
        filtroRowSet.setTableName("filtro_funcion");
        personaRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        personaRowSet.setCommand("SELECT * FROM consulta_persona_1");
        personaRowSet.setTableName("persona");
        personaAnotadaRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        personaAnotadaRowSet.setCommand("SELECT * FROM consulta_persona_anotada_1");
        personaAnotadaRowSet.setTableName("persona_anotada");
        etniaIndigenaReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        etniaIndigenaReferenceRowSet.setCommand("SELECT * FROM consulta_etnia_indigena_1");
        etniaIndigenaReferenceRowSet.setTableName("etnia_indigena");
        ubicacionReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        ubicacionReferenceRowSet.setCommand("SELECT * FROM consulta_ubicacion_1");
        ubicacionReferenceRowSet.setTableName("ubicacion");
        fichaPersonaReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        fichaPersonaReferenceRowSet.setCommand("SELECT * FROM consulta_ficha_persona_1");
        fichaPersonaReferenceRowSet.setTableName("ficha_persona");
    }

    private CachedRowSetXImpl filtroRowSet;

    public CachedRowSetXImpl getFiltroRowSet() {
        if (filtroRowSet == null) {
            filtroRowSet = new RecursoCachedRowSet();
            try {
                filtroRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                filtroRowSet.setCommand("SELECT * FROM consulta_filtro_funcion_1");
                filtroRowSet.setTableName("filtro_funcion");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return filtroRowSet;
    }

    public void setFiltroRowSet(CachedRowSetXImpl crsxi) {
        this.filtroRowSet = crsxi;
    }

    private CachedRowSetXImpl personaRowSet;

    public CachedRowSetXImpl getPersonaRowSet() {
        if (personaRowSet == null) {
            personaRowSet = new RecursoCachedRowSet();
            try {
                personaRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                personaRowSet.setCommand("SELECT * FROM consulta_persona_1");
                personaRowSet.setTableName("persona");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return personaRowSet;
    }

    public void setPersonaRowSet(CachedRowSetXImpl crsxi) {
        this.personaRowSet = crsxi;
    }

    private CachedRowSetXImpl personaAnotadaRowSet;

    public CachedRowSetXImpl getPersonaAnotadaRowSet() {
        if (personaAnotadaRowSet == null) {
            personaAnotadaRowSet = new RecursoCachedRowSet();
            try {
                personaAnotadaRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                personaAnotadaRowSet.setCommand("SELECT * FROM consulta_persona_anotada_1");
                personaAnotadaRowSet.setTableName("persona_anotada");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return personaAnotadaRowSet;
    }

    public void setPersonaAnotadaRowSet(CachedRowSetXImpl crsxi) {
        this.personaAnotadaRowSet = crsxi;
    }

    private CachedRowSetXImpl etniaIndigenaReferenceRowSet;

    public CachedRowSetXImpl getEtniaIndigenaReferenceRowSet() {
        if (etniaIndigenaReferenceRowSet == null) {
            etniaIndigenaReferenceRowSet = new RecursoCachedRowSet();
            try {
                etniaIndigenaReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                etniaIndigenaReferenceRowSet.setCommand("SELECT * FROM consulta_etnia_indigena_1");
                etniaIndigenaReferenceRowSet.setTableName("etnia_indigena");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return etniaIndigenaReferenceRowSet;
    }

    public void setEtniaIndigenaReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.etniaIndigenaReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl ubicacionReferenceRowSet;

    public CachedRowSetXImpl getUbicacionReferenceRowSet() {
        if (ubicacionReferenceRowSet == null) {
            ubicacionReferenceRowSet = new RecursoCachedRowSet();
            try {
                ubicacionReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                ubicacionReferenceRowSet.setCommand("SELECT * FROM consulta_ubicacion_1");
                ubicacionReferenceRowSet.setTableName("ubicacion");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return ubicacionReferenceRowSet;
    }

    public void setUbicacionReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.ubicacionReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl fichaPersonaReferenceRowSet;

    public CachedRowSetXImpl getFichaPersonaReferenceRowSet() {
        if (fichaPersonaReferenceRowSet == null) {
            fichaPersonaReferenceRowSet = new RecursoCachedRowSet();
            try {
                fichaPersonaReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                fichaPersonaReferenceRowSet.setCommand("SELECT * FROM consulta_ficha_persona_1");
                fichaPersonaReferenceRowSet.setTableName("ficha_persona");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return fichaPersonaReferenceRowSet;
    }

    public void setFichaPersonaReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.fichaPersonaReferenceRowSet = crsxi;
    }
    // </editor-fold>
/**/
    /**
     * <p>Construct a new session data bean instance.</p>
     */
    public SessionBean1() {
    }

    /**
     * <p>This method is called when this bean is initially added to
     * session scope.  Typically, this occurs as a result of evaluating
     * a value binding or method binding expression, which utilizes the
     * managed bean facility to instantiate this bean and store it into
     * session scope.</p>
     *
     * <p>You may customize this method to initialize and cache data values
     * or resources that are required for the lifetime of a particular
     * user session.</p>
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
     * <p>This method is called when the session containing it is about to be
     * passivated.  Typically, this occurs in a distributed servlet container
     * when the session is about to be transferred to a different
     * container instance, after which the <code>activate()</code> method
     * will be called to indicate that the transfer is complete.</p>
     *
     * <p>You may customize this method to release references to session data
     * or resources that can not be serialized with the session itself.</p>
     */
    @Override
    //@PrePassivate
    public void passivate() {
        this.desactivar();
    }

    /**
     * <p>This method is called when the session containing it was
     * reactivated.</p>
     *
     * <p>You may customize this method to reacquire references to session
     * data or resources that could not be serialized with the
     * session itself.</p>
     */
    @Override
    //@PostActivate
    public void activate() {
        this.activar();
    }

    /**
     * <p>This method is called when this bean is removed from
     * session scope.  Typically, this occurs as a result of
     * the session timing out or being terminated by the application.</p>
     *
     * <p>You may customize this method to clean up resources allocated
     * during the execution of the <code>init()</code> method, or
     * at any later time during the lifetime of the application.</p>
     */
    @Override
    //@PreDestroy
    public void destroy() {
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

    // <editor-fold defaultstate="collapsed" desc="implementación estándar de propiedades y métodos de la interfaz ContextoSesionBasico">
    /**
     * Conserva el valor de la propiedad contextoSesion.
     */
    private ContextoSesion contextoSesion;

    /**
     * Getter para propiedad contextoSesion.
     * @return Valor de la propiedad contextoSesion.
     */
    @Override
    public ContextoSesion getContextoSesion() {
        return this.contextoSesion;
    }

    /**
     * Getter para propiedad contextoAplicacion.
     * @return Valor de la propiedad contextoAplicacion.
     */
    @Override
    public ContextoAplicacion getContextoAplicacion() {
        return this.getApplicationBean1().getContextoAplicacion();
    }

    // </editor-fold>
/**/
    private boolean showTime = false;

    private void preiniciar() {
        this.showTime = true;
    }

    private void iniciar() {
        this.contextoSesion = new ContextoSesion(this);
    }

    private void desactivar() {
        this.contextoSesion.desactivar();
    }

    private void activar() {
        this.contextoSesion.activar();
    }

    private void destruir() {
        this.contextoSesion.destruir();
        this.contextoSesion = null;
    }
}
