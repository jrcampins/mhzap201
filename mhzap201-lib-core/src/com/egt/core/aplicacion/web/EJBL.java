/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.core.aplicacion.web;

import com.egt.base.persistence.facade.ClaseRecursoFacadeBase;
import com.egt.base.persistence.facade.ConjuntoSegmentoFacadeBase;
import com.egt.base.persistence.facade.DominioFacadeBase;
import com.egt.base.persistence.facade.FiltroFuncionFacadeBase;
import com.egt.base.persistence.facade.FuncionFacadeBase;
import com.egt.base.persistence.facade.FuncionParametroFacadeBase;
import com.egt.base.persistence.facade.RolFacadeBase;
import com.egt.base.persistence.facade.UsuarioFacadeBase;
import com.egt.core.aplicacion.Bitacora;
import com.egt.core.constants.EAC;
import com.egt.core.constants.SEV;
import com.egt.core.util.EA;
import java.text.MessageFormat;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.apache.commons.lang.StringUtils;

public class EJBL {

    /**
     * @see com.egt.data.general.xdp3.PropiedadObjetoCachedRowSetDataProvider3
     */
    public static ClaseRecursoFacadeBase getClaseRecursoFacade() {
        return (ClaseRecursoFacadeBase) lookup(ClaseRecursoFacadeBase.class);
    }

    /**
     * @see com.egt.core.aplicacion.FiltroBusqueda
     */
    public static ConjuntoSegmentoFacadeBase getConjuntoSegmentoFacade() {
        return (ConjuntoSegmentoFacadeBase) lookup(ConjuntoSegmentoFacadeBase.class);
    }

    /**
     * @see com.egt.core.db.xdp.ListaRecursoCachedRowSetDataProvider
     */
    public static DominioFacadeBase getDominioFacade() {
        return (DominioFacadeBase) lookup(DominioFacadeBase.class);
    }

    /**
     * @see com.egt.core.aplicacion.FiltroBusqueda
     */
    public static FiltroFuncionFacadeBase getFiltroFuncionFacade() {
        return (FiltroFuncionFacadeBase) lookup(FiltroFuncionFacadeBase.class);
    }

    /**
     * @see com.egt.core.control.UsuarioAutenticado
     * @see com.egt.core.db.xdp.ListaRecursoCachedRowSetDataProvider
     */
    public static FuncionFacadeBase getFuncionFacade() {
        return (FuncionFacadeBase) lookup(FuncionFacadeBase.class);
    }

    /**
     * @see com.egt.data.general.xdp3.FiltroFuncionParCachedRowSetDataProvider3
     */
    public static FuncionParametroFacadeBase getFuncionParametroFacade() {
        return (FuncionParametroFacadeBase) lookup(FuncionParametroFacadeBase.class);
    }

    /**
     * @see com.egt.core.control.UsuarioAutenticado
     */
    public static RolFacadeBase getRolFacade() {
        return (RolFacadeBase) lookup(RolFacadeBase.class);
    }

    /**
     * @see com.egt.core.control.UsuarioAutenticado
     */
    public static UsuarioFacadeBase getUsuarioFacade() {
        return (UsuarioFacadeBase) lookup(UsuarioFacadeBase.class);
    }

    private static Object lookup(Class<?> clazz) {
        Bitacora.trace(EJBL.class, "lookup", clazz);
        String key = SEV.ENTERPRISE_JNDI_EJB_PERSISTENCE_PATTERN;
        String env = System.getenv(key);
        String jndi;
        if (StringUtils.isNotBlank(env)) {
            jndi = env.trim();
        } else {
            key = EAC.JNDI_EJB_PERSISTENCE_PATTERN;
            jndi = EA.getString(key);
        }
        String base = clazz.getSimpleName();
        String arg0 = StringUtils.removeEnd(base, "Base");
        String name = MessageFormat.format(jndi, arg0);
        Bitacora.trace(key + "=" + env);
        Bitacora.trace(key + "=" + jndi);
        Bitacora.trace(key + "=" + name);
        try {
            Object facade = InitialContext.doLookup(name);
            boolean assignable = facade != null && clazz.isAssignableFrom(facade.getClass());
            Bitacora.trace(name + "=" + facade);
            Bitacora.trace(base + "=" + assignable);
            return facade;
        } catch (NamingException ex) {
            throw new RuntimeException(ex);
        }
    }
//
    //  <editor-fold defaultstate="collapsed">
//  private static FacadeBeanLocatorLocal getFacadeBeanLocator() {
//      return lookupFacadeBeanLocator(EA.getString(EAC.JNDI_EJB_PERSISTENCE_PATTERN));
//  }
//
//  private static FacadeBeanLocatorLocal lookupFacadeBeanLocator(String name) {
//      Bitacora.trace(EJBL.class, "lookupFacadeBeanLocator", name);
//      Object facadeBeanLocator;
//      try {
//          facadeBeanLocator = InitialContext.doLookup(name);
//          Bitacora.trace(EJBL.class, "lookupFacadeBeanLocator", facadeBeanLocator);
//          Bitacora.trace(EJBL.class, "lookupFacadeBeanLocator", facadeBeanLocator.getClass().getName());
//          return (FacadeBeanLocatorLocal) facadeBeanLocator;
//      } catch (NamingException ex) {
//          throw new RuntimeException(ex);
//      }
//  }
    //  </editor-fold>

}
