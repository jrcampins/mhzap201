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
import com.egt.ejb.persistence.entity.Aplicacion;
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
public class AplicacionFacade implements AplicacionFacadeLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Aplicacion find(Object id) {
        return this.find(id, false);
    }

    @Override
    public Aplicacion find(Object id, boolean refresh) {
        String query = "select o from Aplicacion as o where o.idAplicacion = :id";
        Aplicacion o = null;
        Query q;
        if (id != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("id", id);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (Aplicacion) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public Aplicacion findByCodigo(String codigo) {
        return this.findByCodigo(codigo, false);
    }

    @Override
    public Aplicacion findByCodigo(String codigo, boolean refresh) {
        String query = "select o from Aplicacion as o where o.codigoAplicacion = :codigo";
        Aplicacion o = null;
        Query q;
        if (codigo != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("codigo", codigo);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (Aplicacion) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public List<Aplicacion> findAll() {
        return this.findAll(false);
    }

    @Override
    public List<Aplicacion> findAll(boolean refresh) {
        String query = "select object(o) from Aplicacion as o";
        return this.findByQuery(query, refresh);
    }

    @Override
    public List<Aplicacion> findByQuery(String query) {
        return findByQuery(query, false);
    }

    @Override
    public List<Aplicacion> findByQuery(String query, boolean refresh) {
        return findByQuery(query, EnumTipoQuery.JPQL, refresh);
    }

    @Override
    public List<Aplicacion> findByQuery(String query, EnumTipoQuery tipo) {
        return findByQuery(query, tipo, false);
    }

    @Override
    public List<Aplicacion> findByQuery(String query, EnumTipoQuery tipo, boolean refresh) {
        return findByQuery(query, tipo, 0, refresh);
    }

    @Override
    public List<Aplicacion> findByQuery(String query, EnumTipoQuery tipo, int max) {
        return findByQuery(query, tipo, max, false);
    }

    @Override
    public List<Aplicacion> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh) {
        Query q;
        switch (tipo) {
            case NAMED:
                q = em.createNamedQuery(query);
                break;
            case NATIVE:
                q = em.createNativeQuery(query, Aplicacion.class);
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
    public void merge(Aplicacion aplicacion) {
        em.merge(aplicacion);
    }

    @Override
    public void persist(Aplicacion aplicacion) {
        em.persist(aplicacion);
    }

    @Override
    public void refresh(Aplicacion aplicacion) {
        em.refresh(aplicacion);
    }

    @Override
    public void remove(Aplicacion aplicacion) {
        em.remove(em.merge(aplicacion));
    }
}
