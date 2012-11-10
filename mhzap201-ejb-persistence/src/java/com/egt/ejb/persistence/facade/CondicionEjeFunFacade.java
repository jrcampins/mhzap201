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
package com.egt.ejb.persistence.facade;

import com.egt.base.persistence.enums.EnumTipoQuery;
import com.egt.ejb.persistence.entity.CondicionEjeFun;
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
public class CondicionEjeFunFacade implements CondicionEjeFunFacadeLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public CondicionEjeFun find(Object id) {
        return this.find(id, false);
    }

    @Override
    public CondicionEjeFun find(Object id, boolean refresh) {
        String query = "select o from CondicionEjeFun as o where o.numeroCondicionEjeFun = :id";
        CondicionEjeFun o = null;
        Query q;
        if (id != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("id", id);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (CondicionEjeFun) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public CondicionEjeFun findByCodigo(String codigo) {
        return this.findByCodigo(codigo, false);
    }

    @Override
    public CondicionEjeFun findByCodigo(String codigo, boolean refresh) {
        String query = "select o from CondicionEjeFun as o where o.codigoCondicionEjeFun = :codigo";
        CondicionEjeFun o = null;
        Query q;
        if (codigo != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("codigo", codigo);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (CondicionEjeFun) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public List<CondicionEjeFun> findAll() {
        return this.findAll(false);
    }

    @Override
    public List<CondicionEjeFun> findAll(boolean refresh) {
        String query = "select object(o) from CondicionEjeFun as o";
        return this.findByQuery(query, refresh);
    }

    @Override
    public List<CondicionEjeFun> findByQuery(String query) {
        return findByQuery(query, false);
    }

    @Override
    public List<CondicionEjeFun> findByQuery(String query, boolean refresh) {
        return findByQuery(query, EnumTipoQuery.JPQL, refresh);
    }

    @Override
    public List<CondicionEjeFun> findByQuery(String query, EnumTipoQuery tipo) {
        return findByQuery(query, tipo, false);
    }

    @Override
    public List<CondicionEjeFun> findByQuery(String query, EnumTipoQuery tipo, boolean refresh) {
        return findByQuery(query, tipo, 0, refresh);
    }

    @Override
    public List<CondicionEjeFun> findByQuery(String query, EnumTipoQuery tipo, int max) {
        return findByQuery(query, tipo, max, false);
    }

    @Override
    public List<CondicionEjeFun> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh) {
        Query q;
        switch (tipo) {
            case NAMED:
                q = em.createNamedQuery(query);
                break;
            case NATIVE:
                q = em.createNativeQuery(query, CondicionEjeFun.class);
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
    public void merge(CondicionEjeFun condicionEjeFun) {
        em.merge(condicionEjeFun);
    }

    @Override
    public void persist(CondicionEjeFun condicionEjeFun) {
        em.persist(condicionEjeFun);
    }

    @Override
    public void refresh(CondicionEjeFun condicionEjeFun) {
        em.refresh(condicionEjeFun);
    }

    @Override
    public void remove(CondicionEjeFun condicionEjeFun) {
        em.remove(em.merge(condicionEjeFun));
    }
}
