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
import com.egt.ejb.persistence.entity.CausaImpedimento;
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
public class CausaImpedimentoFacade implements CausaImpedimentoFacadeLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public CausaImpedimento find(Object id) {
        return this.find(id, false);
    }

    @Override
    public CausaImpedimento find(Object id, boolean refresh) {
        String query = "select o from CausaImpedimento as o where o.numeroCausaImpedimento = :id";
        CausaImpedimento o = null;
        Query q;
        if (id != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("id", id);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (CausaImpedimento) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public CausaImpedimento findByCodigo(String codigo) {
        return this.findByCodigo(codigo, false);
    }

    @Override
    public CausaImpedimento findByCodigo(String codigo, boolean refresh) {
        String query = "select o from CausaImpedimento as o where o.codigoCausaImpedimento = :codigo";
        CausaImpedimento o = null;
        Query q;
        if (codigo != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("codigo", codigo);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (CausaImpedimento) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public List<CausaImpedimento> findAll() {
        return this.findAll(false);
    }

    @Override
    public List<CausaImpedimento> findAll(boolean refresh) {
        String query = "select object(o) from CausaImpedimento as o";
        return this.findByQuery(query, refresh);
    }

    @Override
    public List<CausaImpedimento> findByQuery(String query) {
        return findByQuery(query, false);
    }

    @Override
    public List<CausaImpedimento> findByQuery(String query, boolean refresh) {
        return findByQuery(query, EnumTipoQuery.JPQL, refresh);
    }

    @Override
    public List<CausaImpedimento> findByQuery(String query, EnumTipoQuery tipo) {
        return findByQuery(query, tipo, false);
    }

    @Override
    public List<CausaImpedimento> findByQuery(String query, EnumTipoQuery tipo, boolean refresh) {
        return findByQuery(query, tipo, 0, refresh);
    }

    @Override
    public List<CausaImpedimento> findByQuery(String query, EnumTipoQuery tipo, int max) {
        return findByQuery(query, tipo, max, false);
    }

    @Override
    public List<CausaImpedimento> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh) {
        Query q;
        switch (tipo) {
            case NAMED:
                q = em.createNamedQuery(query);
                break;
            case NATIVE:
                q = em.createNativeQuery(query, CausaImpedimento.class);
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
    public void merge(CausaImpedimento causaImpedimento) {
        em.merge(causaImpedimento);
    }

    @Override
    public void persist(CausaImpedimento causaImpedimento) {
        em.persist(causaImpedimento);
    }

    @Override
    public void refresh(CausaImpedimento causaImpedimento) {
        em.refresh(causaImpedimento);
    }

    @Override
    public void remove(CausaImpedimento causaImpedimento) {
        em.remove(em.merge(causaImpedimento));
    }
}
