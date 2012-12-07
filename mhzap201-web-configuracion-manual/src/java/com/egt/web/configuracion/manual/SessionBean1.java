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
package com.egt.web.configuracion.manual;

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
        archivoDatosExtRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        archivoDatosExtRowSet.setCommand("SELECT * FROM consulta_archivo_datos_ext_1");
        archivoDatosExtRowSet.setTableName("archivo_datos_ext");
        etniaIndigenaRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        etniaIndigenaRowSet.setCommand("SELECT * FROM consulta_etnia_indigena_1");
        etniaIndigenaRowSet.setTableName("etnia_indigena");
        funcionarioRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        funcionarioRowSet.setCommand("SELECT * FROM consulta_funcionario_1");
        funcionarioRowSet.setTableName("funcionario");
        proveedorDatExtRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        proveedorDatExtRowSet.setCommand("SELECT * FROM consulta_proveedor_dat_ext_1");
        proveedorDatExtRowSet.setTableName("proveedor_dat_ext");
        ubicacionRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        ubicacionRowSet.setCommand("SELECT * FROM consulta_ubicacion_1");
        ubicacionRowSet.setTableName("ubicacion");
        proveedorDatExtReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        proveedorDatExtReferenceRowSet.setCommand("SELECT * FROM consulta_proveedor_dat_ext_1");
        proveedorDatExtReferenceRowSet.setTableName("proveedor_dat_ext");
        usuarioReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        usuarioReferenceRowSet.setCommand("SELECT * FROM consulta_usuario_1");
        usuarioReferenceRowSet.setTableName("usuario");
        ubicacionReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        ubicacionReferenceRowSet.setCommand("SELECT * FROM consulta_ubicacion_1");
        ubicacionReferenceRowSet.setTableName("ubicacion");
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

    private CachedRowSetXImpl archivoDatosExtRowSet;

    public CachedRowSetXImpl getArchivoDatosExtRowSet() {
        if (archivoDatosExtRowSet == null) {
            archivoDatosExtRowSet = new RecursoCachedRowSet();
            try {
                archivoDatosExtRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                archivoDatosExtRowSet.setCommand("SELECT * FROM consulta_archivo_datos_ext_1");
                archivoDatosExtRowSet.setTableName("archivo_datos_ext");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return archivoDatosExtRowSet;
    }

    public void setArchivoDatosExtRowSet(CachedRowSetXImpl crsxi) {
        this.archivoDatosExtRowSet = crsxi;
    }

    private CachedRowSetXImpl etniaIndigenaRowSet;

    public CachedRowSetXImpl getEtniaIndigenaRowSet() {
        if (etniaIndigenaRowSet == null) {
            etniaIndigenaRowSet = new RecursoCachedRowSet();
            try {
                etniaIndigenaRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                etniaIndigenaRowSet.setCommand("SELECT * FROM consulta_etnia_indigena_1");
                etniaIndigenaRowSet.setTableName("etnia_indigena");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return etniaIndigenaRowSet;
    }

    public void setEtniaIndigenaRowSet(CachedRowSetXImpl crsxi) {
        this.etniaIndigenaRowSet = crsxi;
    }

    private CachedRowSetXImpl funcionarioRowSet;

    public CachedRowSetXImpl getFuncionarioRowSet() {
        if (funcionarioRowSet == null) {
            funcionarioRowSet = new RecursoCachedRowSet();
            try {
                funcionarioRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                funcionarioRowSet.setCommand("SELECT * FROM consulta_funcionario_1");
                funcionarioRowSet.setTableName("funcionario");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return funcionarioRowSet;
    }

    public void setFuncionarioRowSet(CachedRowSetXImpl crsxi) {
        this.funcionarioRowSet = crsxi;
    }

    private CachedRowSetXImpl proveedorDatExtRowSet;

    public CachedRowSetXImpl getProveedorDatExtRowSet() {
        if (proveedorDatExtRowSet == null) {
            proveedorDatExtRowSet = new RecursoCachedRowSet();
            try {
                proveedorDatExtRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                proveedorDatExtRowSet.setCommand("SELECT * FROM consulta_proveedor_dat_ext_1");
                proveedorDatExtRowSet.setTableName("proveedor_dat_ext");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return proveedorDatExtRowSet;
    }

    public void setProveedorDatExtRowSet(CachedRowSetXImpl crsxi) {
        this.proveedorDatExtRowSet = crsxi;
    }

    private CachedRowSetXImpl ubicacionRowSet;

    public CachedRowSetXImpl getUbicacionRowSet() {
        if (ubicacionRowSet == null) {
            ubicacionRowSet = new RecursoCachedRowSet();
            try {
                ubicacionRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                ubicacionRowSet.setCommand("SELECT * FROM consulta_ubicacion_1");
                ubicacionRowSet.setTableName("ubicacion");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return ubicacionRowSet;
    }

    public void setUbicacionRowSet(CachedRowSetXImpl crsxi) {
        this.ubicacionRowSet = crsxi;
    }

    private CachedRowSetXImpl proveedorDatExtReferenceRowSet;

    public CachedRowSetXImpl getProveedorDatExtReferenceRowSet() {
        if (proveedorDatExtReferenceRowSet == null) {
            proveedorDatExtReferenceRowSet = new RecursoCachedRowSet();
            try {
                proveedorDatExtReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                proveedorDatExtReferenceRowSet.setCommand("SELECT * FROM consulta_proveedor_dat_ext_1");
                proveedorDatExtReferenceRowSet.setTableName("proveedor_dat_ext");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return proveedorDatExtReferenceRowSet;
    }

    public void setProveedorDatExtReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.proveedorDatExtReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl usuarioReferenceRowSet;

    public CachedRowSetXImpl getUsuarioReferenceRowSet() {
        if (usuarioReferenceRowSet == null) {
            usuarioReferenceRowSet = new RecursoCachedRowSet();
            try {
                usuarioReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                usuarioReferenceRowSet.setCommand("SELECT * FROM consulta_usuario_1");
                usuarioReferenceRowSet.setTableName("usuario");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return usuarioReferenceRowSet;
    }

    public void setUsuarioReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.usuarioReferenceRowSet = crsxi;
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
