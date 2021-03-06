/*
 * Copyright (C) 2009, EGT Consultores, C.A.
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
import com.egt.ejb.persistence.entity.Ubicacion;
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
public class UbicacionFacade implements UbicacionFacadeLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Ubicacion find(Object id) {
        return this.find(id, false);
    }

    @Override
    public Ubicacion find(Object id, boolean refresh) {
        String query = "select o from Ubicacion as o where o.idUbicacion = :id";
        Ubicacion o = null;
        Query q;
        if (id != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("id", id);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (Ubicacion) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public Ubicacion findByCodigo(String codigo) {
        return this.findByCodigo(codigo, false);
    }

    @Override
    public Ubicacion findByCodigo(String codigo, boolean refresh) {
        String query = "select o from Ubicacion as o where o.codigoUbicacion = :codigo";
        Ubicacion o = null;
        Query q;
        if (codigo != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("codigo", codigo);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (Ubicacion) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public List<Ubicacion> findAll() {
        return this.findAll(false);
    }

    @Override
    public List<Ubicacion> findAll(boolean refresh) {
        String query = "select object(o) from Ubicacion as o";
        return this.findByQuery(query, refresh);
    }

    @Override
    public List<Ubicacion> findByQuery(String query) {
        return findByQuery(query, false);
    }

    @Override
    public List<Ubicacion> findByQuery(String query, boolean refresh) {
        return findByQuery(query, EnumTipoQuery.JPQL, refresh);
    }

    @Override
    public List<Ubicacion> findByQuery(String query, EnumTipoQuery tipo) {
        return findByQuery(query, tipo, false);
    }

    @Override
    public List<Ubicacion> findByQuery(String query, EnumTipoQuery tipo, boolean refresh) {
        return findByQuery(query, tipo, 0, refresh);
    }

    @Override
    public List<Ubicacion> findByQuery(String query, EnumTipoQuery tipo, int max) {
        return findByQuery(query, tipo, max, false);
    }

    @Override
    public List<Ubicacion> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh) {
        Query q;
        switch (tipo) {
            case NAMED:
                q = em.createNamedQuery(query);
                break;
            case NATIVE:
                q = em.createNativeQuery(query, Ubicacion.class);
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
    public void merge(Ubicacion ubicacion) {
        em.merge(ubicacion);
    }

    @Override
    public void persist(Ubicacion ubicacion) {
        em.persist(ubicacion);
    }

    @Override
    public void refresh(Ubicacion ubicacion) {
        em.refresh(ubicacion);
    }

    @Override
    public void remove(Ubicacion ubicacion) {
        em.remove(em.merge(ubicacion));
    }
}
