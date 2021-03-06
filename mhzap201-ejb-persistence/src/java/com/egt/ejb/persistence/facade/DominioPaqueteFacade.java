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
import com.egt.ejb.persistence.entity.DominioPaquete;
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
public class DominioPaqueteFacade implements DominioPaqueteFacadeLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public DominioPaquete find(Object id) {
        return this.find(id, false);
    }

    @Override
    public DominioPaquete find(Object id, boolean refresh) {
        String query = "select o from DominioPaquete as o where o.idDominioPaquete = :id";
        DominioPaquete o = null;
        Query q;
        if (id != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("id", id);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (DominioPaquete) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public List<DominioPaquete> findAll() {
        return this.findAll(false);
    }

    @Override
    public List<DominioPaquete> findAll(boolean refresh) {
        String query = "select object(o) from DominioPaquete as o";
        return this.findByQuery(query, refresh);
    }

    @Override
    public List<DominioPaquete> findByQuery(String query) {
        return findByQuery(query, false);
    }

    @Override
    public List<DominioPaquete> findByQuery(String query, boolean refresh) {
        return findByQuery(query, EnumTipoQuery.JPQL, refresh);
    }

    @Override
    public List<DominioPaquete> findByQuery(String query, EnumTipoQuery tipo) {
        return findByQuery(query, tipo, false);
    }

    @Override
    public List<DominioPaquete> findByQuery(String query, EnumTipoQuery tipo, boolean refresh) {
        return findByQuery(query, tipo, 0, refresh);
    }

    @Override
    public List<DominioPaquete> findByQuery(String query, EnumTipoQuery tipo, int max) {
        return findByQuery(query, tipo, max, false);
    }

    @Override
    public List<DominioPaquete> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh) {
        Query q;
        switch (tipo) {
            case NAMED:
                q = em.createNamedQuery(query);
                break;
            case NATIVE:
                q = em.createNativeQuery(query, DominioPaquete.class);
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
    public void merge(DominioPaquete dominioPaquete) {
        em.merge(dominioPaquete);
    }

    @Override
    public void persist(DominioPaquete dominioPaquete) {
        em.persist(dominioPaquete);
    }

    @Override
    public void refresh(DominioPaquete dominioPaquete) {
        em.refresh(dominioPaquete);
    }

    @Override
    public void remove(DominioPaquete dominioPaquete) {
        em.remove(em.merge(dominioPaquete));
    }
}
