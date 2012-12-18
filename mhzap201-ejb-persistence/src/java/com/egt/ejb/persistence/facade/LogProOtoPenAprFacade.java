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
import com.egt.ejb.persistence.entity.LogProOtoPenApr;
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
public class LogProOtoPenAprFacade implements LogProOtoPenAprFacadeLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public LogProOtoPenApr find(Object id) {
        return this.find(id, false);
    }

    @Override
    public LogProOtoPenApr find(Object id, boolean refresh) {
        String query = "select o from LogProOtoPenApr as o where o.idLogProOtoPenApr = :id";
        LogProOtoPenApr o = null;
        Query q;
        if (id != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("id", id);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (LogProOtoPenApr) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public List<LogProOtoPenApr> findAll() {
        return this.findAll(false);
    }

    @Override
    public List<LogProOtoPenApr> findAll(boolean refresh) {
        String query = "select object(o) from LogProOtoPenApr as o";
        return this.findByQuery(query, refresh);
    }

    @Override
    public List<LogProOtoPenApr> findByQuery(String query) {
        return findByQuery(query, false);
    }

    @Override
    public List<LogProOtoPenApr> findByQuery(String query, boolean refresh) {
        return findByQuery(query, EnumTipoQuery.JPQL, refresh);
    }

    @Override
    public List<LogProOtoPenApr> findByQuery(String query, EnumTipoQuery tipo) {
        return findByQuery(query, tipo, false);
    }

    @Override
    public List<LogProOtoPenApr> findByQuery(String query, EnumTipoQuery tipo, boolean refresh) {
        return findByQuery(query, tipo, 0, refresh);
    }

    @Override
    public List<LogProOtoPenApr> findByQuery(String query, EnumTipoQuery tipo, int max) {
        return findByQuery(query, tipo, max, false);
    }

    @Override
    public List<LogProOtoPenApr> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh) {
        Query q;
        switch (tipo) {
            case NAMED:
                q = em.createNamedQuery(query);
                break;
            case NATIVE:
                q = em.createNativeQuery(query, LogProOtoPenApr.class);
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
    public void merge(LogProOtoPenApr logProOtoPenApr) {
        em.merge(logProOtoPenApr);
    }

    @Override
    public void persist(LogProOtoPenApr logProOtoPenApr) {
        em.persist(logProOtoPenApr);
    }

    @Override
    public void refresh(LogProOtoPenApr logProOtoPenApr) {
        em.refresh(logProOtoPenApr);
    }

    @Override
    public void remove(LogProOtoPenApr logProOtoPenApr) {
        em.remove(em.merge(logProOtoPenApr));
    }
}
