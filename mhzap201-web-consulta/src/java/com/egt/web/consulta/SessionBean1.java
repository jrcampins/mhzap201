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
package com.egt.web.consulta;

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
        fichaHogarRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        fichaHogarRowSet.setCommand("SELECT * FROM consulta_ficha_hogar_1");
        fichaHogarRowSet.setTableName("ficha_hogar");
        fichaPersonaRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        fichaPersonaRowSet.setCommand("SELECT * FROM consulta_ficha_persona_1");
        fichaPersonaRowSet.setTableName("ficha_persona");
        funcionarioRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        funcionarioRowSet.setCommand("SELECT * FROM consulta_funcionario_1");
        funcionarioRowSet.setTableName("funcionario");
        objecionElePenRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        objecionElePenRowSet.setCommand("SELECT * FROM consulta_objecion_ele_pen_1");
        objecionElePenRowSet.setTableName("objecion_ele_pen");
        personaRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        personaRowSet.setCommand("SELECT * FROM consulta_persona_1");
        personaRowSet.setTableName("persona");
        personaAnotadaRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        personaAnotadaRowSet.setCommand("SELECT * FROM consulta_persona_anotada_1");
        personaAnotadaRowSet.setTableName("persona_anotada");
        potencialBenRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        potencialBenRowSet.setCommand("SELECT * FROM consulta_potencial_ben_1");
        potencialBenRowSet.setTableName("potencial_ben");
        proveedorDatExtRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        proveedorDatExtRowSet.setCommand("SELECT * FROM consulta_proveedor_dat_ext_1");
        proveedorDatExtRowSet.setTableName("proveedor_dat_ext");
        logProAcrPotBenRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logProAcrPotBenRowSet.setCommand("SELECT * FROM consulta_log_pro_acr_pot_ben_1");
        logProAcrPotBenRowSet.setTableName("log_pro_acr_pot_ben");
        logProActJupeRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logProActJupeRowSet.setCommand("SELECT * FROM consulta_log_pro_act_jupe_1");
        logProActJupeRowSet.setTableName("log_pro_act_jupe");
        logProPreProPagRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logProPreProPagRowSet.setCommand("SELECT * FROM consulta_log_pro_pre_pro_pag_1");
        logProPreProPagRowSet.setTableName("log_pro_pre_pro_pag");
        logProDenPenObjRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logProDenPenObjRowSet.setCommand("SELECT * FROM consulta_log_pro_den_pen_obj_1");
        logProDenPenObjRowSet.setTableName("log_pro_den_pen_obj");
        logProImpArcExtRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logProImpArcExtRowSet.setCommand("SELECT * FROM consulta_log_pro_imp_arc_ext_1");
        logProImpArcExtRowSet.setTableName("log_pro_imp_arc_ext");
        logImpCenRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logImpCenRowSet.setCommand("SELECT * FROM consulta_log_imp_cen_1");
        logImpCenRowSet.setTableName("log_imp_cen");
        logImpDeuRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logImpDeuRowSet.setCommand("SELECT * FROM consulta_log_imp_deu_1");
        logImpDeuRowSet.setTableName("log_imp_deu");
        logImpEmpRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logImpEmpRowSet.setCommand("SELECT * FROM consulta_log_imp_emp_1");
        logImpEmpRowSet.setTableName("log_imp_emp");
        logImpFalRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logImpFalRowSet.setCommand("SELECT * FROM consulta_log_imp_fal_1");
        logImpFalRowSet.setTableName("log_imp_fal");
        logImpHogEecRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logImpHogEecRowSet.setCommand("SELECT * FROM consulta_log_imp_hog_eec_1");
        logImpHogEecRowSet.setTableName("log_imp_hog_eec");
        logImpHogRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logImpHogRowSet.setCommand("SELECT * FROM consulta_log_imp_hog_1");
        logImpHogRowSet.setTableName("log_imp_hog");
        logImpPerEecRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logImpPerEecRowSet.setCommand("SELECT * FROM consulta_log_imp_per_eec_1");
        logImpPerEecRowSet.setTableName("log_imp_per_eec");
        logImpPerRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logImpPerRowSet.setCommand("SELECT * FROM consulta_log_imp_per_1");
        logImpPerRowSet.setTableName("log_imp_per");
        logImpIdsRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logImpIdsRowSet.setCommand("SELECT * FROM consulta_log_imp_ids_1");
        logImpIdsRowSet.setTableName("log_imp_ids");
        logImpJubRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logImpJubRowSet.setCommand("SELECT * FROM consulta_log_imp_jub_1");
        logImpJubRowSet.setTableName("log_imp_jub");
        logImpPenRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logImpPenRowSet.setCommand("SELECT * FROM consulta_log_imp_pen_1");
        logImpPenRowSet.setTableName("log_imp_pen");
        logImpPotRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logImpPotRowSet.setCommand("SELECT * FROM consulta_log_imp_pot_1");
        logImpPotRowSet.setTableName("log_imp_pot");
        logImpSubRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logImpSubRowSet.setCommand("SELECT * FROM consulta_log_imp_sub_1");
        logImpSubRowSet.setTableName("log_imp_sub");
        logProOtoPenAprRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logProOtoPenAprRowSet.setCommand("SELECT * FROM consulta_log_pro_oto_pen_apr_1");
        logProOtoPenAprRowSet.setTableName("log_pro_oto_pen_apr");
        logProVerElePenRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        logProVerElePenRowSet.setCommand("SELECT * FROM consulta_log_pro_ver_ele_pen_1");
        logProVerElePenRowSet.setTableName("log_pro_ver_ele_pen");
        ubicacionRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        ubicacionRowSet.setCommand("SELECT * FROM consulta_ubicacion_1");
        ubicacionRowSet.setTableName("ubicacion");
        visitaCensoRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        visitaCensoRowSet.setCommand("SELECT * FROM consulta_visita_censo_1");
        visitaCensoRowSet.setTableName("visita_censo");
        proveedorDatExtReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        proveedorDatExtReferenceRowSet.setCommand("SELECT * FROM consulta_proveedor_dat_ext_1");
        proveedorDatExtReferenceRowSet.setTableName("proveedor_dat_ext");
        usuarioReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        usuarioReferenceRowSet.setCommand("SELECT * FROM consulta_usuario_1");
        usuarioReferenceRowSet.setTableName("usuario");
        funcionarioReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        funcionarioReferenceRowSet.setCommand("SELECT * FROM consulta_funcionario_1");
        funcionarioReferenceRowSet.setTableName("funcionario");
        ubicacionReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        ubicacionReferenceRowSet.setCommand("SELECT * FROM consulta_ubicacion_1");
        ubicacionReferenceRowSet.setTableName("ubicacion");
        fichaHogarReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        fichaHogarReferenceRowSet.setCommand("SELECT * FROM consulta_ficha_hogar_1");
        fichaHogarReferenceRowSet.setTableName("ficha_hogar");
        potencialBenReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        potencialBenReferenceRowSet.setCommand("SELECT * FROM consulta_potencial_ben_1");
        potencialBenReferenceRowSet.setTableName("potencial_ben");
        personaReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        personaReferenceRowSet.setCommand("SELECT * FROM consulta_persona_1");
        personaReferenceRowSet.setTableName("persona");
        etniaIndigenaReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        etniaIndigenaReferenceRowSet.setCommand("SELECT * FROM consulta_etnia_indigena_1");
        etniaIndigenaReferenceRowSet.setTableName("etnia_indigena");
        fichaPersonaReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        fichaPersonaReferenceRowSet.setCommand("SELECT * FROM consulta_ficha_persona_1");
        fichaPersonaReferenceRowSet.setTableName("ficha_persona");
        archivoDatosExtReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
        archivoDatosExtReferenceRowSet.setCommand("SELECT * FROM consulta_archivo_datos_ext_1");
        archivoDatosExtReferenceRowSet.setTableName("archivo_datos_ext");
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

    private CachedRowSetXImpl fichaHogarRowSet;

    public CachedRowSetXImpl getFichaHogarRowSet() {
        if (fichaHogarRowSet == null) {
            fichaHogarRowSet = new RecursoCachedRowSet();
            try {
                fichaHogarRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                fichaHogarRowSet.setCommand("SELECT * FROM consulta_ficha_hogar_1");
                fichaHogarRowSet.setTableName("ficha_hogar");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return fichaHogarRowSet;
    }

    public void setFichaHogarRowSet(CachedRowSetXImpl crsxi) {
        this.fichaHogarRowSet = crsxi;
    }

    private CachedRowSetXImpl fichaPersonaRowSet;

    public CachedRowSetXImpl getFichaPersonaRowSet() {
        if (fichaPersonaRowSet == null) {
            fichaPersonaRowSet = new RecursoCachedRowSet();
            try {
                fichaPersonaRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                fichaPersonaRowSet.setCommand("SELECT * FROM consulta_ficha_persona_1");
                fichaPersonaRowSet.setTableName("ficha_persona");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return fichaPersonaRowSet;
    }

    public void setFichaPersonaRowSet(CachedRowSetXImpl crsxi) {
        this.fichaPersonaRowSet = crsxi;
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

    private CachedRowSetXImpl objecionElePenRowSet;

    public CachedRowSetXImpl getObjecionElePenRowSet() {
        if (objecionElePenRowSet == null) {
            objecionElePenRowSet = new RecursoCachedRowSet();
            try {
                objecionElePenRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                objecionElePenRowSet.setCommand("SELECT * FROM consulta_objecion_ele_pen_1");
                objecionElePenRowSet.setTableName("objecion_ele_pen");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return objecionElePenRowSet;
    }

    public void setObjecionElePenRowSet(CachedRowSetXImpl crsxi) {
        this.objecionElePenRowSet = crsxi;
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

    private CachedRowSetXImpl potencialBenRowSet;

    public CachedRowSetXImpl getPotencialBenRowSet() {
        if (potencialBenRowSet == null) {
            potencialBenRowSet = new RecursoCachedRowSet();
            try {
                potencialBenRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                potencialBenRowSet.setCommand("SELECT * FROM consulta_potencial_ben_1");
                potencialBenRowSet.setTableName("potencial_ben");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return potencialBenRowSet;
    }

    public void setPotencialBenRowSet(CachedRowSetXImpl crsxi) {
        this.potencialBenRowSet = crsxi;
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

    private CachedRowSetXImpl logProAcrPotBenRowSet;

    public CachedRowSetXImpl getLogProAcrPotBenRowSet() {
        if (logProAcrPotBenRowSet == null) {
            logProAcrPotBenRowSet = new RecursoCachedRowSet();
            try {
                logProAcrPotBenRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logProAcrPotBenRowSet.setCommand("SELECT * FROM consulta_log_pro_acr_pot_ben_1");
                logProAcrPotBenRowSet.setTableName("log_pro_acr_pot_ben");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logProAcrPotBenRowSet;
    }

    public void setLogProAcrPotBenRowSet(CachedRowSetXImpl crsxi) {
        this.logProAcrPotBenRowSet = crsxi;
    }

    private CachedRowSetXImpl logProActJupeRowSet;

    public CachedRowSetXImpl getLogProActJupeRowSet() {
        if (logProActJupeRowSet == null) {
            logProActJupeRowSet = new RecursoCachedRowSet();
            try {
                logProActJupeRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logProActJupeRowSet.setCommand("SELECT * FROM consulta_log_pro_act_jupe_1");
                logProActJupeRowSet.setTableName("log_pro_act_jupe");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logProActJupeRowSet;
    }

    public void setLogProActJupeRowSet(CachedRowSetXImpl crsxi) {
        this.logProActJupeRowSet = crsxi;
    }

    private CachedRowSetXImpl logProPreProPagRowSet;

    public CachedRowSetXImpl getLogProPreProPagRowSet() {
        if (logProPreProPagRowSet == null) {
            logProPreProPagRowSet = new RecursoCachedRowSet();
            try {
                logProPreProPagRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logProPreProPagRowSet.setCommand("SELECT * FROM consulta_log_pro_pre_pro_pag_1");
                logProPreProPagRowSet.setTableName("log_pro_pre_pro_pag");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logProPreProPagRowSet;
    }

    public void setLogProPreProPagRowSet(CachedRowSetXImpl crsxi) {
        this.logProPreProPagRowSet = crsxi;
    }

    private CachedRowSetXImpl logProDenPenObjRowSet;

    public CachedRowSetXImpl getLogProDenPenObjRowSet() {
        if (logProDenPenObjRowSet == null) {
            logProDenPenObjRowSet = new RecursoCachedRowSet();
            try {
                logProDenPenObjRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logProDenPenObjRowSet.setCommand("SELECT * FROM consulta_log_pro_den_pen_obj_1");
                logProDenPenObjRowSet.setTableName("log_pro_den_pen_obj");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logProDenPenObjRowSet;
    }

    public void setLogProDenPenObjRowSet(CachedRowSetXImpl crsxi) {
        this.logProDenPenObjRowSet = crsxi;
    }

    private CachedRowSetXImpl logProImpArcExtRowSet;

    public CachedRowSetXImpl getLogProImpArcExtRowSet() {
        if (logProImpArcExtRowSet == null) {
            logProImpArcExtRowSet = new RecursoCachedRowSet();
            try {
                logProImpArcExtRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logProImpArcExtRowSet.setCommand("SELECT * FROM consulta_log_pro_imp_arc_ext_1");
                logProImpArcExtRowSet.setTableName("log_pro_imp_arc_ext");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logProImpArcExtRowSet;
    }

    public void setLogProImpArcExtRowSet(CachedRowSetXImpl crsxi) {
        this.logProImpArcExtRowSet = crsxi;
    }

    private CachedRowSetXImpl logImpCenRowSet;

    public CachedRowSetXImpl getLogImpCenRowSet() {
        if (logImpCenRowSet == null) {
            logImpCenRowSet = new RecursoCachedRowSet();
            try {
                logImpCenRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logImpCenRowSet.setCommand("SELECT * FROM consulta_log_imp_cen_1");
                logImpCenRowSet.setTableName("log_imp_cen");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logImpCenRowSet;
    }

    public void setLogImpCenRowSet(CachedRowSetXImpl crsxi) {
        this.logImpCenRowSet = crsxi;
    }

    private CachedRowSetXImpl logImpDeuRowSet;

    public CachedRowSetXImpl getLogImpDeuRowSet() {
        if (logImpDeuRowSet == null) {
            logImpDeuRowSet = new RecursoCachedRowSet();
            try {
                logImpDeuRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logImpDeuRowSet.setCommand("SELECT * FROM consulta_log_imp_deu_1");
                logImpDeuRowSet.setTableName("log_imp_deu");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logImpDeuRowSet;
    }

    public void setLogImpDeuRowSet(CachedRowSetXImpl crsxi) {
        this.logImpDeuRowSet = crsxi;
    }

    private CachedRowSetXImpl logImpEmpRowSet;

    public CachedRowSetXImpl getLogImpEmpRowSet() {
        if (logImpEmpRowSet == null) {
            logImpEmpRowSet = new RecursoCachedRowSet();
            try {
                logImpEmpRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logImpEmpRowSet.setCommand("SELECT * FROM consulta_log_imp_emp_1");
                logImpEmpRowSet.setTableName("log_imp_emp");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logImpEmpRowSet;
    }

    public void setLogImpEmpRowSet(CachedRowSetXImpl crsxi) {
        this.logImpEmpRowSet = crsxi;
    }

    private CachedRowSetXImpl logImpFalRowSet;

    public CachedRowSetXImpl getLogImpFalRowSet() {
        if (logImpFalRowSet == null) {
            logImpFalRowSet = new RecursoCachedRowSet();
            try {
                logImpFalRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logImpFalRowSet.setCommand("SELECT * FROM consulta_log_imp_fal_1");
                logImpFalRowSet.setTableName("log_imp_fal");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logImpFalRowSet;
    }

    public void setLogImpFalRowSet(CachedRowSetXImpl crsxi) {
        this.logImpFalRowSet = crsxi;
    }

    private CachedRowSetXImpl logImpHogEecRowSet;

    public CachedRowSetXImpl getLogImpHogEecRowSet() {
        if (logImpHogEecRowSet == null) {
            logImpHogEecRowSet = new RecursoCachedRowSet();
            try {
                logImpHogEecRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logImpHogEecRowSet.setCommand("SELECT * FROM consulta_log_imp_hog_eec_1");
                logImpHogEecRowSet.setTableName("log_imp_hog_eec");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logImpHogEecRowSet;
    }

    public void setLogImpHogEecRowSet(CachedRowSetXImpl crsxi) {
        this.logImpHogEecRowSet = crsxi;
    }

    private CachedRowSetXImpl logImpHogRowSet;

    public CachedRowSetXImpl getLogImpHogRowSet() {
        if (logImpHogRowSet == null) {
            logImpHogRowSet = new RecursoCachedRowSet();
            try {
                logImpHogRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logImpHogRowSet.setCommand("SELECT * FROM consulta_log_imp_hog_1");
                logImpHogRowSet.setTableName("log_imp_hog");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logImpHogRowSet;
    }

    public void setLogImpHogRowSet(CachedRowSetXImpl crsxi) {
        this.logImpHogRowSet = crsxi;
    }

    private CachedRowSetXImpl logImpPerEecRowSet;

    public CachedRowSetXImpl getLogImpPerEecRowSet() {
        if (logImpPerEecRowSet == null) {
            logImpPerEecRowSet = new RecursoCachedRowSet();
            try {
                logImpPerEecRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logImpPerEecRowSet.setCommand("SELECT * FROM consulta_log_imp_per_eec_1");
                logImpPerEecRowSet.setTableName("log_imp_per_eec");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logImpPerEecRowSet;
    }

    public void setLogImpPerEecRowSet(CachedRowSetXImpl crsxi) {
        this.logImpPerEecRowSet = crsxi;
    }

    private CachedRowSetXImpl logImpPerRowSet;

    public CachedRowSetXImpl getLogImpPerRowSet() {
        if (logImpPerRowSet == null) {
            logImpPerRowSet = new RecursoCachedRowSet();
            try {
                logImpPerRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logImpPerRowSet.setCommand("SELECT * FROM consulta_log_imp_per_1");
                logImpPerRowSet.setTableName("log_imp_per");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logImpPerRowSet;
    }

    public void setLogImpPerRowSet(CachedRowSetXImpl crsxi) {
        this.logImpPerRowSet = crsxi;
    }

    private CachedRowSetXImpl logImpIdsRowSet;

    public CachedRowSetXImpl getLogImpIdsRowSet() {
        if (logImpIdsRowSet == null) {
            logImpIdsRowSet = new RecursoCachedRowSet();
            try {
                logImpIdsRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logImpIdsRowSet.setCommand("SELECT * FROM consulta_log_imp_ids_1");
                logImpIdsRowSet.setTableName("log_imp_ids");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logImpIdsRowSet;
    }

    public void setLogImpIdsRowSet(CachedRowSetXImpl crsxi) {
        this.logImpIdsRowSet = crsxi;
    }

    private CachedRowSetXImpl logImpJubRowSet;

    public CachedRowSetXImpl getLogImpJubRowSet() {
        if (logImpJubRowSet == null) {
            logImpJubRowSet = new RecursoCachedRowSet();
            try {
                logImpJubRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logImpJubRowSet.setCommand("SELECT * FROM consulta_log_imp_jub_1");
                logImpJubRowSet.setTableName("log_imp_jub");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logImpJubRowSet;
    }

    public void setLogImpJubRowSet(CachedRowSetXImpl crsxi) {
        this.logImpJubRowSet = crsxi;
    }

    private CachedRowSetXImpl logImpPenRowSet;

    public CachedRowSetXImpl getLogImpPenRowSet() {
        if (logImpPenRowSet == null) {
            logImpPenRowSet = new RecursoCachedRowSet();
            try {
                logImpPenRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logImpPenRowSet.setCommand("SELECT * FROM consulta_log_imp_pen_1");
                logImpPenRowSet.setTableName("log_imp_pen");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logImpPenRowSet;
    }

    public void setLogImpPenRowSet(CachedRowSetXImpl crsxi) {
        this.logImpPenRowSet = crsxi;
    }

    private CachedRowSetXImpl logImpPotRowSet;

    public CachedRowSetXImpl getLogImpPotRowSet() {
        if (logImpPotRowSet == null) {
            logImpPotRowSet = new RecursoCachedRowSet();
            try {
                logImpPotRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logImpPotRowSet.setCommand("SELECT * FROM consulta_log_imp_pot_1");
                logImpPotRowSet.setTableName("log_imp_pot");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logImpPotRowSet;
    }

    public void setLogImpPotRowSet(CachedRowSetXImpl crsxi) {
        this.logImpPotRowSet = crsxi;
    }

    private CachedRowSetXImpl logImpSubRowSet;

    public CachedRowSetXImpl getLogImpSubRowSet() {
        if (logImpSubRowSet == null) {
            logImpSubRowSet = new RecursoCachedRowSet();
            try {
                logImpSubRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logImpSubRowSet.setCommand("SELECT * FROM consulta_log_imp_sub_1");
                logImpSubRowSet.setTableName("log_imp_sub");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logImpSubRowSet;
    }

    public void setLogImpSubRowSet(CachedRowSetXImpl crsxi) {
        this.logImpSubRowSet = crsxi;
    }

    private CachedRowSetXImpl logProOtoPenAprRowSet;

    public CachedRowSetXImpl getLogProOtoPenAprRowSet() {
        if (logProOtoPenAprRowSet == null) {
            logProOtoPenAprRowSet = new RecursoCachedRowSet();
            try {
                logProOtoPenAprRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logProOtoPenAprRowSet.setCommand("SELECT * FROM consulta_log_pro_oto_pen_apr_1");
                logProOtoPenAprRowSet.setTableName("log_pro_oto_pen_apr");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logProOtoPenAprRowSet;
    }

    public void setLogProOtoPenAprRowSet(CachedRowSetXImpl crsxi) {
        this.logProOtoPenAprRowSet = crsxi;
    }

    private CachedRowSetXImpl logProVerElePenRowSet;

    public CachedRowSetXImpl getLogProVerElePenRowSet() {
        if (logProVerElePenRowSet == null) {
            logProVerElePenRowSet = new RecursoCachedRowSet();
            try {
                logProVerElePenRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                logProVerElePenRowSet.setCommand("SELECT * FROM consulta_log_pro_ver_ele_pen_1");
                logProVerElePenRowSet.setTableName("log_pro_ver_ele_pen");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return logProVerElePenRowSet;
    }

    public void setLogProVerElePenRowSet(CachedRowSetXImpl crsxi) {
        this.logProVerElePenRowSet = crsxi;
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

    private CachedRowSetXImpl visitaCensoRowSet;

    public CachedRowSetXImpl getVisitaCensoRowSet() {
        if (visitaCensoRowSet == null) {
            visitaCensoRowSet = new RecursoCachedRowSet();
            try {
                visitaCensoRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                visitaCensoRowSet.setCommand("SELECT * FROM consulta_visita_censo_1");
                visitaCensoRowSet.setTableName("visita_censo");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return visitaCensoRowSet;
    }

    public void setVisitaCensoRowSet(CachedRowSetXImpl crsxi) {
        this.visitaCensoRowSet = crsxi;
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

    private CachedRowSetXImpl funcionarioReferenceRowSet;

    public CachedRowSetXImpl getFuncionarioReferenceRowSet() {
        if (funcionarioReferenceRowSet == null) {
            funcionarioReferenceRowSet = new RecursoCachedRowSet();
            try {
                funcionarioReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                funcionarioReferenceRowSet.setCommand("SELECT * FROM consulta_funcionario_1");
                funcionarioReferenceRowSet.setTableName("funcionario");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return funcionarioReferenceRowSet;
    }

    public void setFuncionarioReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.funcionarioReferenceRowSet = crsxi;
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

    private CachedRowSetXImpl fichaHogarReferenceRowSet;

    public CachedRowSetXImpl getFichaHogarReferenceRowSet() {
        if (fichaHogarReferenceRowSet == null) {
            fichaHogarReferenceRowSet = new RecursoCachedRowSet();
            try {
                fichaHogarReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                fichaHogarReferenceRowSet.setCommand("SELECT * FROM consulta_ficha_hogar_1");
                fichaHogarReferenceRowSet.setTableName("ficha_hogar");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return fichaHogarReferenceRowSet;
    }

    public void setFichaHogarReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.fichaHogarReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl potencialBenReferenceRowSet;

    public CachedRowSetXImpl getPotencialBenReferenceRowSet() {
        if (potencialBenReferenceRowSet == null) {
            potencialBenReferenceRowSet = new RecursoCachedRowSet();
            try {
                potencialBenReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                potencialBenReferenceRowSet.setCommand("SELECT * FROM consulta_potencial_ben_1");
                potencialBenReferenceRowSet.setTableName("potencial_ben");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return potencialBenReferenceRowSet;
    }

    public void setPotencialBenReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.potencialBenReferenceRowSet = crsxi;
    }

    private CachedRowSetXImpl personaReferenceRowSet;

    public CachedRowSetXImpl getPersonaReferenceRowSet() {
        if (personaReferenceRowSet == null) {
            personaReferenceRowSet = new RecursoCachedRowSet();
            try {
                personaReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                personaReferenceRowSet.setCommand("SELECT * FROM consulta_persona_1");
                personaReferenceRowSet.setTableName("persona");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return personaReferenceRowSet;
    }

    public void setPersonaReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.personaReferenceRowSet = crsxi;
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

    private CachedRowSetXImpl archivoDatosExtReferenceRowSet;

    public CachedRowSetXImpl getArchivoDatosExtReferenceRowSet() {
        if (archivoDatosExtReferenceRowSet == null) {
            archivoDatosExtReferenceRowSet = new RecursoCachedRowSet();
            try {
                archivoDatosExtReferenceRowSet.setDataSourceName("java:comp/env/jdbc/mhzap201");
                archivoDatosExtReferenceRowSet.setCommand("SELECT * FROM consulta_archivo_datos_ext_1");
                archivoDatosExtReferenceRowSet.setTableName("archivo_datos_ext");
            } catch (Exception e) {
                log(com.egt.core.util.Bundle.getString("bean.initialization.error"), e);
                throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
            }
        }
        return archivoDatosExtReferenceRowSet;
    }

    public void setArchivoDatosExtReferenceRowSet(CachedRowSetXImpl crsxi) {
        this.archivoDatosExtReferenceRowSet = crsxi;
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
