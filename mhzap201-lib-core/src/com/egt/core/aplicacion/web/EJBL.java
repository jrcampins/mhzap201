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
import com.egt.core.util.EA;
import java.text.MessageFormat;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EJBL {

    public static final String ClaseRecursoFacade = "ClaseRecursoFacade";

    /**
     * @see com.egt.data.general.xdp3.PropiedadObjetoCachedRowSetDataProvider3
     */
    public static ClaseRecursoFacadeBase getClaseRecursoFacade() {
        return (ClaseRecursoFacadeBase) lookup(ClaseRecursoFacade, ClaseRecursoFacadeBase.class);
    }

    public static final String ConjuntoSegmentoFacade = "ConjuntoSegmentoFacade";

    /**
     * @see com.egt.core.aplicacion.FiltroBusqueda
     */
    public static ConjuntoSegmentoFacadeBase getConjuntoSegmentoFacade() {
        return (ConjuntoSegmentoFacadeBase) lookup(ConjuntoSegmentoFacade, ConjuntoSegmentoFacadeBase.class);
    }

    public static final String DominioFacade = "DominioFacade";

    /**
     * @see com.egt.core.db.xdp.ListaRecursoCachedRowSetDataProvider
     */
    public static DominioFacadeBase getDominioFacade() {
        return (DominioFacadeBase) lookup(DominioFacade, DominioFacadeBase.class);
    }

    public static final String FiltroFuncionFacade = "FiltroFuncionFacade";

    /**
     * @see com.egt.core.aplicacion.FiltroBusqueda
     */
    public static FiltroFuncionFacadeBase getFiltroFuncionFacade() {
        return (FiltroFuncionFacadeBase) lookup(FiltroFuncionFacade, FiltroFuncionFacadeBase.class);
    }

    public static final String FuncionFacade = "FuncionFacade";

    /**
     * @see com.egt.core.control.UsuarioAutenticado
     * @see com.egt.core.db.xdp.ListaRecursoCachedRowSetDataProvider
     */
    public static FuncionFacadeBase getFuncionFacade() {
        return (FuncionFacadeBase) lookup(FuncionFacade, FuncionFacadeBase.class);
    }

    public static final String FuncionParametroFacade = "FuncionParametroFacade";

    /**
     * @see com.egt.data.general.xdp3.FiltroFuncionParCachedRowSetDataProvider3
     */
    public static FuncionParametroFacadeBase getFuncionParametroFacade() {
        return (FuncionParametroFacadeBase) lookup(FuncionParametroFacade, FuncionParametroFacadeBase.class);
    }

    public static final String RolFacade = "RolFacade";

    /**
     * @see com.egt.core.control.UsuarioAutenticado
     */
    public static RolFacadeBase getRolFacade() {
        return (RolFacadeBase) lookup(RolFacade, RolFacadeBase.class);
    }

    public static final String UsuarioFacade = "UsuarioFacade";

    /**
     * @see com.egt.core.control.UsuarioAutenticado
     */
    public static UsuarioFacadeBase getUsuarioFacade() {
        return (UsuarioFacadeBase) lookup(UsuarioFacade, UsuarioFacadeBase.class);
    }

    private static Object lookup(String name, Class<?> clazz) {
        Bitacora.trace(EJBL.class, "lookup", name, clazz);
        String key = EAC.JNDI_EJB_PERSISTENCE_PATTERN;
        String pattern = EA.getString(key);
        String jndi = MessageFormat.format(pattern, name);
        String base = clazz.getSimpleName();
        Bitacora.trace(key + "=" + pattern);
        Bitacora.trace(key + "=" + jndi);
        try {
            Object facade = InitialContext.doLookup(jndi);
            boolean assignable = facade != null && clazz.isAssignableFrom(facade.getClass());
            Bitacora.trace(name + "=" + facade);
            Bitacora.trace(base + "=" + assignable);
            return facade;
        } catch (NamingException ex) {
            throw new RuntimeException(ex);
        }
    }

}
