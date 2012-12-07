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
package com.egt.web.configuracion.basica;

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
        aplicacionRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        aplicacionRowSet.setCommand("SELECT * FROM consulta_aplicacion_1");
        aplicacionRowSet.setTableName("aplicacion");
        grupoAplicacionRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        grupoAplicacionRowSet.setCommand("SELECT * FROM consulta_grupo_aplicacion_1");
        grupoAplicacionRowSet.setTableName("grupo_aplicacion");
        rolAplicacionRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        rolAplicacionRowSet.setCommand("SELECT * FROM consulta_rol_aplicacion_1");
        rolAplicacionRowSet.setTableName("rol_aplicacion");
        claseRecursoRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        claseRecursoRowSet.setCommand("SELECT * FROM consulta_clase_recurso_1");
        claseRecursoRowSet.setTableName("clase_recurso");
        dominioRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        dominioRowSet.setCommand("SELECT * FROM consulta_dominio_1");
        dominioRowSet.setTableName("dominio");
        filtroClaRecFunRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        filtroClaRecFunRowSet.setCommand("SELECT * FROM consulta_filtro_cla_rec_fun_1");
        filtroClaRecFunRowSet.setTableName("filtro_cla_rec_fun");
        funcionRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        funcionRowSet.setCommand("SELECT * FROM consulta_funcion_1");
        funcionRowSet.setTableName("funcion");
        filtroClaRecSecRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        filtroClaRecSecRowSet.setCommand("SELECT * FROM consulta_filtro_cla_rec_sec_1");
        filtroClaRecSecRowSet.setTableName("filtro_cla_rec_sec");
        claseRecursoSecRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        claseRecursoSecRowSet.setCommand("SELECT * FROM consulta_clase_recurso_sec_1");
        claseRecursoSecRowSet.setTableName("clase_recurso_sec");
        filtroClaRecVinRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        filtroClaRecVinRowSet.setCommand("SELECT * FROM consulta_filtro_cla_rec_vin_1");
        filtroClaRecVinRowSet.setTableName("filtro_cla_rec_vin");
        claseRecursoParRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        claseRecursoParRowSet.setCommand("SELECT * FROM consulta_clase_recurso_par_1");
        claseRecursoParRowSet.setTableName("clase_recurso_par");
        paginaFuncionRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        paginaFuncionRowSet.setCommand("SELECT * FROM consulta_pagina_funcion_1");
        paginaFuncionRowSet.setTableName("pagina_funcion");
        paginaRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        paginaRowSet.setCommand("SELECT * FROM consulta_pagina_1");
        paginaRowSet.setTableName("pagina");
        mensajeRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        mensajeRowSet.setCommand("SELECT * FROM consulta_mensaje_1");
        mensajeRowSet.setTableName("mensaje");
        opcionMenuRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        opcionMenuRowSet.setCommand("SELECT * FROM consulta_opcion_menu_1");
        opcionMenuRowSet.setTableName("opcion_menu");
        paqueteRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        paqueteRowSet.setCommand("SELECT * FROM consulta_paquete_1");
        paqueteRowSet.setTableName("paquete");
        dominioPaqueteRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        dominioPaqueteRowSet.setCommand("SELECT * FROM consulta_dominio_paquete_1");
        dominioPaqueteRowSet.setTableName("dominio_paquete");
        filtroClaRecParRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        filtroClaRecParRowSet.setCommand("SELECT * FROM consulta_filtro_cla_rec_par_1");
        filtroClaRecParRowSet.setTableName("filtro_cla_rec_par");
        parametroRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        parametroRowSet.setCommand("SELECT * FROM consulta_parametro_1");
        parametroRowSet.setTableName("parametro");
        dominioParametroRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        dominioParametroRowSet.setCommand("SELECT * FROM consulta_dominio_parametro_1");
        dominioParametroRowSet.setTableName("dominio_parametro");
        funcionParametroRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        funcionParametroRowSet.setCommand("SELECT * FROM consulta_funcion_parametro_1");
        funcionParametroRowSet.setTableName("funcion_parametro");
        grupoAplicacionReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        grupoAplicacionReferenceRowSet.setCommand("SELECT * FROM consulta_grupo_aplicacion_1");
        grupoAplicacionReferenceRowSet.setTableName("grupo_aplicacion");
        rolReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        rolReferenceRowSet.setCommand("SELECT * FROM consulta_rol_1");
        rolReferenceRowSet.setTableName("rol");
        funcionReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        funcionReferenceRowSet.setCommand("SELECT * FROM consulta_funcion_1");
        funcionReferenceRowSet.setTableName("funcion");
        paginaReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        paginaReferenceRowSet.setCommand("SELECT * FROM consulta_pagina_1");
        paginaReferenceRowSet.setTableName("pagina");
        claseRecursoReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        claseRecursoReferenceRowSet.setCommand("SELECT * FROM consulta_clase_recurso_1");
        claseRecursoReferenceRowSet.setTableName("clase_recurso");
        dominioReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        dominioReferenceRowSet.setCommand("SELECT * FROM consulta_dominio_1");
        dominioReferenceRowSet.setTableName("dominio");
        paqueteReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        paqueteReferenceRowSet.setCommand("SELECT * FROM consulta_paquete_1");
        paqueteReferenceRowSet.setTableName("paquete");
        claseRecursoParReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        claseRecursoParReferenceRowSet.setCommand("SELECT * FROM consulta_clase_recurso_par_1");
        claseRecursoParReferenceRowSet.setTableName("clase_recurso_par");
        grupoProcesoReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        grupoProcesoReferenceRowSet.setCommand("SELECT * FROM consulta_grupo_proceso_1");
        grupoProcesoReferenceRowSet.setTableName("grupo_proceso");
        aplicacionReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        aplicacionReferenceRowSet.setCommand("SELECT * FROM consulta_aplicacion_1");
        aplicacionReferenceRowSet.setTableName("aplicacion");
        opcionMenuReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        opcionMenuReferenceRowSet.setCommand("SELECT * FROM consulta_opcion_menu_1");
        opcionMenuReferenceRowSet.setTableName("opcion_menu");
        parametroReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        parametroReferenceRowSet.setCommand("SELECT * FROM consulta_parametro_1");
        parametroReferenceRowSet.setTableName("parametro");
        claseRecursoSecReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        claseRecursoSecReferenceRowSet.setCommand("SELECT * FROM consulta_clase_recurso_sec_1");
        claseRecursoSecReferenceRowSet.setTableName("clase_recurso_sec");
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

    private CachedRowSetXImpl aplicacionRowSet;

    public CachedRowSetXImpl getAplicacionRowSet() {
        if (aplicacionRowSet == null) {
            aplicacionRowSet = new RecursoCachedRowSet();
            try {
                aplicacionRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                aplicacionRowSet.setCommand("SELECT * FROM consulta_aplicacion_1");
                aplicacionRowSet.setTableName("aplicacion");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return aplicacionRowSet;
    }

    public void setAplicacionRowSet(CachedRowSetXImpl crsxi) {
        this.aplicacionRowSet = crsxi;
    }

    private CachedRowSetXImpl grupoAplicacionRowSet;

    public CachedRowSetXImpl getGrupoAplicacionRowSet() {
        if (grupoAplicacionRowSet == null) {
            grupoAplicacionRowSet = new RecursoCachedRowSet();
            try {
                grupoAplicacionRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                grupoAplicacionRowSet.setCommand("SELECT * FROM consulta_grupo_aplicacion_1");
                grupoAplicacionRowSet.setTableName("grupo_aplicacion");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return grupoAplicacionRowSet;
    }

    public void setGrupoAplicacionRowSet(CachedRowSetXImpl crsxi) {
        this.grupoAplicacionRowSet = crsxi;
    }

    private CachedRowSetXImpl rolAplicacionRowSet;

    public CachedRowSetXImpl getRolAplicacionRowSet() {
        if (rolAplicacionRowSet == null) {
            rolAplicacionRowSet = new RecursoCachedRowSet();
            try {
                rolAplicacionRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                rolAplicacionRowSet.setCommand("SELECT * FROM consulta_rol_aplicacion_1");
                rolAplicacionRowSet.setTableName("rol_aplicacion");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return rolAplicacionRowSet;
    }

    public void setRolAplicacionRowSet(CachedRowSetXImpl crsxi) {
        this.rolAplicacionRowSet = crsxi;
    }

    private CachedRowSetXImpl claseRecursoRowSet;

    public CachedRowSetXImpl getClaseRecursoRowSet() {
        if (claseRecursoRowSet == null) {
            claseRecursoRowSet = new RecursoCachedRowSet();
            try {
                claseRecursoRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                claseRecursoRowSet.setCommand("SELECT * FROM consulta_clase_recurso_1");
                claseRecursoRowSet.setTableName("clase_recurso");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return claseRecursoRowSet;
    }

    public void setClaseRecursoRowSet(CachedRowSetXImpl crsxi) {
        this.claseRecursoRowSet = crsxi;
    }

    private CachedRowSetXImpl dominioRowSet;

    public CachedRowSetXImpl getDominioRowSet() {
        if (dominioRowSet == null) {
            dominioRowSet = new RecursoCachedRowSet();
            try {
                dominioRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                dominioRowSet.setCommand("SELECT * FROM consulta_dominio_1");
                dominioRowSet.setTableName("dominio");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return dominioRowSet;
    }

    public void setDominioRowSet(CachedRowSetXImpl crsxi) {
        this.dominioRowSet = crsxi;
    }

    private CachedRowSetXImpl filtroClaRecFunRowSet;

    public CachedRowSetXImpl getFiltroClaRecFunRowSet() {
        if (filtroClaRecFunRowSet == null) {
            filtroClaRecFunRowSet = new RecursoCachedRowSet();
            try {
                filtroClaRecFunRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                filtroClaRecFunRowSet.setCommand("SELECT * FROM consulta_filtro_cla_rec_fun_1");
                filtroClaRecFunRowSet.setTableName("filtro_cla_rec_fun");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return filtroClaRecFunRowSet;
    }

    public void setFiltroClaRecFunRowSet(CachedRowSetXImpl crsxi) {
        this.filtroClaRecFunRowSet = crsxi;
    }

    private CachedRowSetXImpl funcionRowSet;

    public CachedRowSetXImpl getFuncionRowSet() {
        if (funcionRowSet == null) {
            funcionRowSet = new RecursoCachedRowSet();
            try {
                funcionRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                funcionRowSet.setCommand("SELECT * FROM consulta_funcion_1");
                funcionRowSet.setTableName("funcion");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return funcionRowSet;
    }

    public void setFuncionRowSet(CachedRowSetXImpl crsxi) {
        this.funcionRowSet = crsxi;
    }

    private CachedRowSetXImpl filtroClaRecSecRowSet;

    public CachedRowSetXImpl getFiltroClaRecSecRowSet() {
        if (filtroClaRecSecRowSet == null) {
            filtroClaRecSecRowSet = new RecursoCachedRowSet();
            try {
                filtroClaRecSecRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                filtroClaRecSecRowSet.setCommand("SELECT * FROM consulta_filtro_cla_rec_sec_1");
                filtroClaRecSecRowSet.setTableName("filtro_cla_rec_sec");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return filtroClaRecSecRowSet;
    }

    public void setFiltroClaRecSecRowSet(CachedRowSetXImpl crsxi) {
        this.filtroClaRecSecRowSet = crsxi;
    }

    private CachedRowSetXImpl claseRecursoSecRowSet;

    public CachedRowSetXImpl getClaseRecursoSecRowSet() {
        if (claseRecursoSecRowSet == null) {
            claseRecursoSecRowSet = new RecursoCachedRowSet();
            try {
                claseRecursoSecRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                claseRecursoSecRowSet.setCommand("SELECT * FROM consulta_clase_recurso_sec_1");
                claseRecursoSecRowSet.setTableName("clase_recurso_sec");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return claseRecursoSecRowSet;
    }

    public void setClaseRecursoSecRowSet(CachedRowSetXImpl crsxi) {
        this.claseRecursoSecRowSet = crsxi;
    }

    private CachedRowSetXImpl filtroClaRecVinRowSet;

    public CachedRowSetXImpl getFiltroClaRecVinRowSet() {
        if (filtroClaRecVinRowSet == null) {
            filtroClaRecVinRowSet = new RecursoCachedRowSet();
            try {
                filtroClaRecVinRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                filtroClaRecVinRowSet.setCommand("SELECT * FROM consulta_filtro_cla_rec_vin_1");
                filtroClaRecVinRowSet.setTableName("filtro_cla_rec_vin");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return filtroClaRecVinRowSet;
    }

    public void setFiltroClaRecVinRowSet(CachedRowSetXImpl crsxi) {
        this.filtroClaRecVinRowSet = crsxi;
    }

    private CachedRowSetXImpl claseRecursoParRowSet;

    public CachedRowSetXImpl getClaseRecursoParRowSet() {
        if (claseRecursoParRowSet == null) {
            claseRecursoParRowSet = new RecursoCachedRowSet();
            try {
                claseRecursoParRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                claseRecursoParRowSet.setCommand("SELECT * FROM consulta_clase_recurso_par_1");
                claseRecursoParRowSet.setTableName("clase_recurso_par");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return claseRecursoParRowSet;
    }

    public void setClaseRecursoParRowSet(CachedRowSetXImpl crsxi) {
        this.claseRecursoParRowSet = crsxi;
    }

    private CachedRowSetXImpl paginaFuncionRowSet;

    public CachedRowSetXImpl getPaginaFuncionRowSet() {
        if (paginaFuncionRowSet == null) {
            paginaFuncionRowSet = new RecursoCachedRowSet();
            try {
                paginaFuncionRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                paginaFuncionRowSet.setCommand("SELECT * FROM consulta_pagina_funcion_1");
                paginaFuncionRowSet.setTableName("pagina_funcion");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return paginaFuncionRowSet;
    }

    public void setPaginaFuncionRowSet(CachedRowSetXImpl crsxi) {
        this.paginaFuncionRowSet = crsxi;
    }

    private CachedRowSetXImpl paginaRowSet;

    public CachedRowSetXImpl getPaginaRowSet() {
        if (paginaRowSet == null) {
            paginaRowSet = new RecursoCachedRowSet();
            try {
                paginaRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                paginaRowSet.setCommand("SELECT * FROM consulta_pagina_1");
                paginaRowSet.setTableName("pagina");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return paginaRowSet;
    }

    public void setPaginaRowSet(CachedRowSetXImpl crsxi) {
        this.paginaRowSet = crsxi;
    }

    private CachedRowSetXImpl mensajeRowSet;

    public CachedRowSetXImpl getMensajeRowSet() {
        if (mensajeRowSet == null) {
            mensajeRowSet = new RecursoCachedRowSet();
            try {
                mensajeRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                mensajeRowSet.setCommand("SELECT * FROM consulta_mensaje_1");
                mensajeRowSet.setTableName("mensaje");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return mensajeRowSet;
    }

    public void setMensajeRowSet(CachedRowSetXImpl crsxi) {
        this.mensajeRowSet = crsxi;
    }

    private CachedRowSetXImpl opcionMenuRowSet;

    public CachedRowSetXImpl getOpcionMenuRowSet() {
        if (opcionMenuRowSet == null) {
            opcionMenuRowSet = new RecursoCachedRowSet();
            try {
                opcionMenuRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                opcionMenuRowSet.setCommand("SELECT * FROM consulta_opcion_menu_1");
                opcionMenuRowSet.setTableName("opcion_menu");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return opcionMenuRowSet;
    }

    public void setOpcionMenuRowSet(CachedRowSetXImpl crsxi) {
        this.opcionMenuRowSet = crsxi;
    }

    private CachedRowSetXImpl paqueteRowSet;

    public CachedRowSetXImpl getPaqueteRowSet() {
        if (paqueteRowSet == null) {
            paqueteRowSet = new RecursoCachedRowSet();
            try {
                paqueteRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                paqueteRowSet.setCommand("SELECT * FROM consulta_paquete_1");
                paqueteRowSet.setTableName("paquete");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return paqueteRowSet;
    }

    public void setPaqueteRowSet(CachedRowSetXImpl crsxi) {
        this.paqueteRowSet = crsxi;
    }

    private CachedRowSetXImpl dominioPaqueteRowSet;

    public CachedRowSetXImpl getDominioPaqueteRowSet() {
        if (dominioPaqueteRowSet == null) {
            dominioPaqueteRowSet = new RecursoCachedRowSet();
            try {
                dominioPaqueteRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                dominioPaqueteRowSet.setCommand("SELECT * FROM consulta_dominio_paquete_1");
                dominioPaqueteRowSet.setTableName("dominio_paquete");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return dominioPaqueteRowSet;
    }

    public void setDominioPaqueteRowSet(CachedRowSetXImpl crsxi) {
        this.dominioPaqueteRowSet = crsxi;
    }

    private CachedRowSetXImpl filtroClaRecParRowSet;

    public CachedRowSetXImpl getFiltroClaRecParRowSet() {
        if (filtroClaRecParRowSet == null) {
            filtroClaRecParRowSet = new RecursoCachedRowSet();
            try {
                filtroClaRecParRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                filtroClaRecParRowSet.setCommand("SELECT * FROM consulta_filtro_cla_rec_par_1");
                filtroClaRecParRowSet.setTableName("filtro_cla_rec_par");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return filtroClaRecParRowSet;
    }

    public void setFiltroClaRecParRowSet(CachedRowSetXImpl crsxi) {
        this.filtroClaRecParRowSet = crsxi;
    }

    private CachedRowSetXImpl parametroRowSet;

    public CachedRowSetXImpl getParametroRowSet() {
        if (parametroRowSet == null) {
            parametroRowSet = new RecursoCachedRowSet();
            try {
                parametroRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                parametroRowSet.setCommand("SELECT * FROM consulta_parametro_1");
                parametroRowSet.setTableName("parametro");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return parametroRowSet;
    }

    public void setParametroRowSet(CachedRowSetXImpl crsxi) {
        this.parametroRowSet = crsxi;
    }

    private CachedRowSetXImpl dominioParametroRowSet;

    public CachedRowSetXImpl getDominioParametroRowSet() {
        if (dominioParametroRowSet == null) {
            dominioParametroRowSet = new RecursoCachedRowSet();
            try {
                dominioParametroRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                dominioParametroRowSet.setCommand("SELECT * FROM consulta_dominio_parametro_1");
                dominioParametroRowSet.setTableName("dominio_parametro");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return dominioParametroRowSet;
    }

    public void setDominioParametroRowSet(CachedRowSetXImpl crsxi) {
        this.dominioParametroRowSet = crsxi;
    }

    private CachedRowSetXImpl funcionParametroRowSet;

    public CachedRowSetXImpl getFuncionParametroRowSet() {
        if (funcionParametroRowSet == null) {
            funcionParametroRowSet = new RecursoCachedRowSet();
            try {
                funcionParametroRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                funcionParametroRowSet.setCommand("SELECT * FROM consulta_funcion_parametro_1");
                funcionParametroRowSet.setTableName("funcion_parametro");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return funcionParametroRowSet;
    }

    public void setFuncionParametroRowSet(CachedRowSetXImpl crsxi) {
        this.funcionParametroRowSet = crsxi;
    }

    private CachedRowSetXImpl grupoAplicacionReferenceRowSet;

    public CachedRowSetXImpl getGrupoAplicacionReferenceRowSet() {
        if (grupoAplicacionReferenceRowSet == null) {
            grupoAplicacionReferenceRowSet = new RecursoCachedRowSet();
            try {
                grupoAplicacionReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                grupoAplicacionReferenceRowSet.setCommand("SELECT * FROM consulta_grupo_aplicacion_1");
                grupoAplicacionReferenceRowSet.setTableName("grupo_aplicacion");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return grupoAplicacionReferenceRowSet;
    }

    public void setGrupoAplicacionReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.grupoAplicacionReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl rolReferenceRowSet;

    public CachedRowSetXImpl getRolReferenceRowSet() {
        if (rolReferenceRowSet == null) {
            rolReferenceRowSet = new RecursoCachedRowSet();
            try {
                rolReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                rolReferenceRowSet.setCommand("SELECT * FROM consulta_rol_1");
                rolReferenceRowSet.setTableName("rol");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return rolReferenceRowSet;
    }

    public void setRolReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.rolReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl funcionReferenceRowSet;

    public CachedRowSetXImpl getFuncionReferenceRowSet() {
        if (funcionReferenceRowSet == null) {
            funcionReferenceRowSet = new RecursoCachedRowSet();
            try {
                funcionReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                funcionReferenceRowSet.setCommand("SELECT * FROM consulta_funcion_1");
                funcionReferenceRowSet.setTableName("funcion");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return funcionReferenceRowSet;
    }

    public void setFuncionReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.funcionReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl paginaReferenceRowSet;

    public CachedRowSetXImpl getPaginaReferenceRowSet() {
        if (paginaReferenceRowSet == null) {
            paginaReferenceRowSet = new RecursoCachedRowSet();
            try {
                paginaReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                paginaReferenceRowSet.setCommand("SELECT * FROM consulta_pagina_1");
                paginaReferenceRowSet.setTableName("pagina");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return paginaReferenceRowSet;
    }

    public void setPaginaReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.paginaReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl claseRecursoReferenceRowSet;

    public CachedRowSetXImpl getClaseRecursoReferenceRowSet() {
        if (claseRecursoReferenceRowSet == null) {
            claseRecursoReferenceRowSet = new RecursoCachedRowSet();
            try {
                claseRecursoReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                claseRecursoReferenceRowSet.setCommand("SELECT * FROM consulta_clase_recurso_1");
                claseRecursoReferenceRowSet.setTableName("clase_recurso");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return claseRecursoReferenceRowSet;
    }

    public void setClaseRecursoReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.claseRecursoReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl dominioReferenceRowSet;

    public CachedRowSetXImpl getDominioReferenceRowSet() {
        if (dominioReferenceRowSet == null) {
            dominioReferenceRowSet = new RecursoCachedRowSet();
            try {
                dominioReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                dominioReferenceRowSet.setCommand("SELECT * FROM consulta_dominio_1");
                dominioReferenceRowSet.setTableName("dominio");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return dominioReferenceRowSet;
    }

    public void setDominioReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.dominioReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl paqueteReferenceRowSet;

    public CachedRowSetXImpl getPaqueteReferenceRowSet() {
        if (paqueteReferenceRowSet == null) {
            paqueteReferenceRowSet = new RecursoCachedRowSet();
            try {
                paqueteReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                paqueteReferenceRowSet.setCommand("SELECT * FROM consulta_paquete_1");
                paqueteReferenceRowSet.setTableName("paquete");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return paqueteReferenceRowSet;
    }

    public void setPaqueteReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.paqueteReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl claseRecursoParReferenceRowSet;

    public CachedRowSetXImpl getClaseRecursoParReferenceRowSet() {
        if (claseRecursoParReferenceRowSet == null) {
            claseRecursoParReferenceRowSet = new RecursoCachedRowSet();
            try {
                claseRecursoParReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                claseRecursoParReferenceRowSet.setCommand("SELECT * FROM consulta_clase_recurso_par_1");
                claseRecursoParReferenceRowSet.setTableName("clase_recurso_par");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return claseRecursoParReferenceRowSet;
    }

    public void setClaseRecursoParReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.claseRecursoParReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl grupoProcesoReferenceRowSet;

    public CachedRowSetXImpl getGrupoProcesoReferenceRowSet() {
        if (grupoProcesoReferenceRowSet == null) {
            grupoProcesoReferenceRowSet = new RecursoCachedRowSet();
            try {
                grupoProcesoReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                grupoProcesoReferenceRowSet.setCommand("SELECT * FROM consulta_grupo_proceso_1");
                grupoProcesoReferenceRowSet.setTableName("grupo_proceso");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return grupoProcesoReferenceRowSet;
    }

    public void setGrupoProcesoReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.grupoProcesoReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl aplicacionReferenceRowSet;

    public CachedRowSetXImpl getAplicacionReferenceRowSet() {
        if (aplicacionReferenceRowSet == null) {
            aplicacionReferenceRowSet = new RecursoCachedRowSet();
            try {
                aplicacionReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                aplicacionReferenceRowSet.setCommand("SELECT * FROM consulta_aplicacion_1");
                aplicacionReferenceRowSet.setTableName("aplicacion");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return aplicacionReferenceRowSet;
    }

    public void setAplicacionReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.aplicacionReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl opcionMenuReferenceRowSet;

    public CachedRowSetXImpl getOpcionMenuReferenceRowSet() {
        if (opcionMenuReferenceRowSet == null) {
            opcionMenuReferenceRowSet = new RecursoCachedRowSet();
            try {
                opcionMenuReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                opcionMenuReferenceRowSet.setCommand("SELECT * FROM consulta_opcion_menu_1");
                opcionMenuReferenceRowSet.setTableName("opcion_menu");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return opcionMenuReferenceRowSet;
    }

    public void setOpcionMenuReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.opcionMenuReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl parametroReferenceRowSet;

    public CachedRowSetXImpl getParametroReferenceRowSet() {
        if (parametroReferenceRowSet == null) {
            parametroReferenceRowSet = new RecursoCachedRowSet();
            try {
                parametroReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                parametroReferenceRowSet.setCommand("SELECT * FROM consulta_parametro_1");
                parametroReferenceRowSet.setTableName("parametro");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return parametroReferenceRowSet;
    }

    public void setParametroReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.parametroReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl claseRecursoSecReferenceRowSet;

    public CachedRowSetXImpl getClaseRecursoSecReferenceRowSet() {
        if (claseRecursoSecReferenceRowSet == null) {
            claseRecursoSecReferenceRowSet = new RecursoCachedRowSet();
            try {
                claseRecursoSecReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                claseRecursoSecReferenceRowSet.setCommand("SELECT * FROM consulta_clase_recurso_sec_1");
                claseRecursoSecReferenceRowSet.setTableName("clase_recurso_sec");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return claseRecursoSecReferenceRowSet;
    }

    public void setClaseRecursoSecReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.claseRecursoSecReferenceRowSet = crsxi;
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
