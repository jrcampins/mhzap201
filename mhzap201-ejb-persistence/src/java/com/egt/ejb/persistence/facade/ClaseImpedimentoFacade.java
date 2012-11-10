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
import com.egt.ejb.persistence.entity.ClaseImpedimento;
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
public class ClaseImpedimentoFacade implements ClaseImpedimentoFacadeLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public ClaseImpedimento find(Object id) {
        return this.find(id, false);
    }

    @Override
    public ClaseImpedimento find(Object id, boolean refresh) {
        String query = "select o from ClaseImpedimento as o where o.numeroClaseImpedimento = :id";
        ClaseImpedimento o = null;
        Query q;
        if (id != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("id", id);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (ClaseImpedimento) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public ClaseImpedimento findByCodigo(String codigo) {
        return this.findByCodigo(codigo, false);
    }

    @Override
    public ClaseImpedimento findByCodigo(String codigo, boolean refresh) {
        String query = "select o from ClaseImpedimento as o where o.codigoClaseImpedimento = :codigo";
        ClaseImpedimento o = null;
        Query q;
        if (codigo != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("codigo", codigo);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (ClaseImpedimento) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public List<ClaseImpedimento> findAll() {
        return this.findAll(false);
    }

    @Override
    public List<ClaseImpedimento> findAll(boolean refresh) {
        String query = "select object(o) from ClaseImpedimento as o";
        return this.findByQuery(query, refresh);
    }

    @Override
    public List<ClaseImpedimento> findByQuery(String query) {
        return findByQuery(query, false);
    }

    @Override
    public List<ClaseImpedimento> findByQuery(String query, boolean refresh) {
        return findByQuery(query, EnumTipoQuery.JPQL, refresh);
    }

    @Override
    public List<ClaseImpedimento> findByQuery(String query, EnumTipoQuery tipo) {
        return findByQuery(query, tipo, false);
    }

    @Override
    public List<ClaseImpedimento> findByQuery(String query, EnumTipoQuery tipo, boolean refresh) {
        return findByQuery(query, tipo, 0, refresh);
    }

    @Override
    public List<ClaseImpedimento> findByQuery(String query, EnumTipoQuery tipo, int max) {
        return findByQuery(query, tipo, max, false);
    }

    @Override
    public List<ClaseImpedimento> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh) {
        Query q;
        switch (tipo) {
            case NAMED:
                q = em.createNamedQuery(query);
                break;
            case NATIVE:
                q = em.createNativeQuery(query, ClaseImpedimento.class);
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
    public void merge(ClaseImpedimento claseImpedimento) {
        em.merge(claseImpedimento);
    }

    @Override
    public void persist(ClaseImpedimento claseImpedimento) {
        em.persist(claseImpedimento);
    }

    @Override
    public void refresh(ClaseImpedimento claseImpedimento) {
        em.refresh(claseImpedimento);
    }

    @Override
    public void remove(ClaseImpedimento claseImpedimento) {
        em.remove(em.merge(claseImpedimento));
    }
}
