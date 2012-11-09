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
import com.egt.ejb.persistence.entity.FiltroClaRecPar;
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
public class FiltroClaRecParFacade implements FiltroClaRecParFacadeLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public FiltroClaRecPar find(Object id) {
        return this.find(id, false);
    }

    @Override
    public FiltroClaRecPar find(Object id, boolean refresh) {
        String query = "select o from FiltroClaRecPar as o where o.idFiltroClaRecPar = :id";
        FiltroClaRecPar o = null;
        Query q;
        if (id != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("id", id);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (FiltroClaRecPar) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public List<FiltroClaRecPar> findAll() {
        return this.findAll(false);
    }

    @Override
    public List<FiltroClaRecPar> findAll(boolean refresh) {
        String query = "select object(o) from FiltroClaRecPar as o";
        return this.findByQuery(query, refresh);
    }

    @Override
    public List<FiltroClaRecPar> findByQuery(String query) {
        return findByQuery(query, false);
    }

    @Override
    public List<FiltroClaRecPar> findByQuery(String query, boolean refresh) {
        return findByQuery(query, EnumTipoQuery.JPQL, refresh);
    }

    @Override
    public List<FiltroClaRecPar> findByQuery(String query, EnumTipoQuery tipo) {
        return findByQuery(query, tipo, false);
    }

    @Override
    public List<FiltroClaRecPar> findByQuery(String query, EnumTipoQuery tipo, boolean refresh) {
        return findByQuery(query, tipo, 0, refresh);
    }

    @Override
    public List<FiltroClaRecPar> findByQuery(String query, EnumTipoQuery tipo, int max) {
        return findByQuery(query, tipo, max, false);
    }

    @Override
    public List<FiltroClaRecPar> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh) {
        Query q;
        switch (tipo) {
            case NAMED:
                q = em.createNamedQuery(query);
                break;
            case NATIVE:
                q = em.createNativeQuery(query, FiltroClaRecPar.class);
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
    public void merge(FiltroClaRecPar filtroClaRecPar) {
        em.merge(filtroClaRecPar);
    }

    @Override
    public void persist(FiltroClaRecPar filtroClaRecPar) {
        em.persist(filtroClaRecPar);
    }

    @Override
    public void refresh(FiltroClaRecPar filtroClaRecPar) {
        em.refresh(filtroClaRecPar);
    }

    @Override
    public void remove(FiltroClaRecPar filtroClaRecPar) {
        em.remove(em.merge(filtroClaRecPar));
    }
}
