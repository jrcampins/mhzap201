/*
 * Copyright (C) 2010, EGT Consultores, C.A.
 *
 * Este archivo fue totalmente generado utilizando herramientas de software de EGT Consultores, C.A.
 * En consecuencia, partes del archivo podrian ser similares o hasta iguales a las de archivos de
 * programas de otros clientes, generados por las mismas herramientas; por lo tanto, esta similitud
 * no podra ser considerada como violacion del copyright.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 *
 */
package com.egt.ejb.persistence.facade;

import com.egt.base.persistence.enums.EnumTipoQuery;
import com.egt.ejb.persistence.entity.LogImpHogEec;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.eclipse.persistence.config.CascadePolicy;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;

@Stateless
public class LogImpHogEecFacade implements LogImpHogEecFacadeLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public LogImpHogEec find(Object id) {
        return this.find(id, false);
    }

    @Override
    public LogImpHogEec find(Object id, boolean refresh) {
        String query = "select o from LogImpHogEec as o where o.idLogImpHogEec = :id";
        LogImpHogEec o = null;
        Query q;
        if (id != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("id", id);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (LogImpHogEec) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public List<LogImpHogEec> findAll() {
        return this.findAll(false);
    }

    @Override
    public List<LogImpHogEec> findAll(boolean refresh) {
        String query = "select object(o) from LogImpHogEec as o";
        return this.findByQuery(query, refresh);
    }

    @Override
    public List<LogImpHogEec> findByQuery(String query) {
        return findByQuery(query, false);
    }

    @Override
    public List<LogImpHogEec> findByQuery(String query, boolean refresh) {
        return findByQuery(query, EnumTipoQuery.JPQL, refresh);
    }

    @Override
    public List<LogImpHogEec> findByQuery(String query, EnumTipoQuery tipo) {
        return findByQuery(query, tipo, false);
    }

    @Override
    public List<LogImpHogEec> findByQuery(String query, EnumTipoQuery tipo, boolean refresh) {
        return findByQuery(query, tipo, 0, refresh);
    }

    @Override
    public List<LogImpHogEec> findByQuery(String query, EnumTipoQuery tipo, int max) {
        return findByQuery(query, tipo, max, false);
    }

    @Override
    public List<LogImpHogEec> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh) {
        Query q;
        switch (tipo) {
            case NAMED:
                q = em.createNamedQuery(query);
                break;
            case NATIVE:
                q = em.createNativeQuery(query, LogImpHogEec.class);
                break;
            default:
                q = em.createQuery(query);
                break;
        }
        if (refresh) {
            q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
            q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
        }
        if (max > 0) {
            q = q.setMaxResults(max);
        }
        return q.getResultList();
    }

    @Override
    public void flush() {
        em.flush();
    }

    @Override
    public void merge(LogImpHogEec logImpHogEec) {
        em.merge(logImpHogEec);
    }

    @Override
    public void persist(LogImpHogEec logImpHogEec) {
        em.persist(logImpHogEec);
    }

    @Override
    public void refresh(LogImpHogEec logImpHogEec) {
        em.refresh(logImpHogEec);
    }

    @Override
    public void remove(LogImpHogEec logImpHogEec) {
        em.remove(em.merge(logImpHogEec));
    }
}
