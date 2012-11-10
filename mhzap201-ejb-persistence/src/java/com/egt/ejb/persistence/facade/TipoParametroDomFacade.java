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
import com.egt.ejb.persistence.entity.TipoParametroDom;
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
public class TipoParametroDomFacade implements TipoParametroDomFacadeLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public TipoParametroDom find(Object id) {
        return this.find(id, false);
    }

    @Override
    public TipoParametroDom find(Object id, boolean refresh) {
        String query = "select o from TipoParametroDom as o where o.numeroTipoParametroDom = :id";
        TipoParametroDom o = null;
        Query q;
        if (id != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("id", id);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (TipoParametroDom) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public TipoParametroDom findByCodigo(String codigo) {
        return this.findByCodigo(codigo, false);
    }

    @Override
    public TipoParametroDom findByCodigo(String codigo, boolean refresh) {
        String query = "select o from TipoParametroDom as o where o.codigoTipoParametroDom = :codigo";
        TipoParametroDom o = null;
        Query q;
        if (codigo != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("codigo", codigo);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (TipoParametroDom) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public List<TipoParametroDom> findAll() {
        return this.findAll(false);
    }

    @Override
    public List<TipoParametroDom> findAll(boolean refresh) {
        String query = "select object(o) from TipoParametroDom as o";
        return this.findByQuery(query, refresh);
    }

    @Override
    public List<TipoParametroDom> findByQuery(String query) {
        return findByQuery(query, false);
    }

    @Override
    public List<TipoParametroDom> findByQuery(String query, boolean refresh) {
        return findByQuery(query, EnumTipoQuery.JPQL, refresh);
    }

    @Override
    public List<TipoParametroDom> findByQuery(String query, EnumTipoQuery tipo) {
        return findByQuery(query, tipo, false);
    }

    @Override
    public List<TipoParametroDom> findByQuery(String query, EnumTipoQuery tipo, boolean refresh) {
        return findByQuery(query, tipo, 0, refresh);
    }

    @Override
    public List<TipoParametroDom> findByQuery(String query, EnumTipoQuery tipo, int max) {
        return findByQuery(query, tipo, max, false);
    }

    @Override
    public List<TipoParametroDom> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh) {
        Query q;
        switch (tipo) {
            case NAMED:
                q = em.createNamedQuery(query);
                break;
            case NATIVE:
                q = em.createNativeQuery(query, TipoParametroDom.class);
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
    public void merge(TipoParametroDom tipoParametroDom) {
        em.merge(tipoParametroDom);
    }

    @Override
    public void persist(TipoParametroDom tipoParametroDom) {
        em.persist(tipoParametroDom);
    }

    @Override
    public void refresh(TipoParametroDom tipoParametroDom) {
        em.refresh(tipoParametroDom);
    }

    @Override
    public void remove(TipoParametroDom tipoParametroDom) {
        em.remove(em.merge(tipoParametroDom));
    }
}
