/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 * 
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 * 
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.persistence.facade.catalog;

import com.egt.ejb.persistence.entity.catalog.SystemTable;
import com.egt.base.persistence.enums.EnumTipoQuery;
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
public class SystemTableFacade implements SystemTableFacadeLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public SystemTable find(Object id) {
        return em.find(com.egt.ejb.persistence.entity.catalog.SystemTable.class, id);
    }

    @Override
    public List<SystemTable> findAll() {
        return em.createQuery("select object(o) from SystemTable as o").getResultList();
    }

    @Override
    public SystemTable findByCodigo(String codigo) {
        String query = "select o from SystemTable as o where o.tabname = :tabname";
        SystemTable systemTable = null;
        try {
            systemTable = (SystemTable) em.createQuery(query).setParameter("tabname", codigo).getSingleResult();
        } catch (NoResultException nrex) {
            systemTable = null;
        }
        return systemTable;
    }

    @Override
    public List<SystemTable> findByQuery(String query) {
        return findByQuery(query, false);
    }

    @Override
    public List<SystemTable> findByQuery(String query, boolean refresh) {
        return findByQuery(query, EnumTipoQuery.JPQL, refresh);
    }

    @Override
    public List<SystemTable> findByQuery(String query, EnumTipoQuery tipo) {
        return findByQuery(query, tipo, false);
    }

    @Override
    public List<SystemTable> findByQuery(String query, EnumTipoQuery tipo, boolean refresh) {
        return findByQuery(query, tipo, 0, refresh);
    }

    @Override
    public List<SystemTable> findByQuery(String query, EnumTipoQuery tipo, int max) {
        return findByQuery(query, tipo, max, false);
    }

    @Override
    public List<SystemTable> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh) {
        Query q;
        switch (tipo) {
            case NAMED:
                q = em.createNamedQuery(query);
                break;
            case NATIVE:
                q = em.createNativeQuery(query, SystemTable.class);
                break;
            default:
                q = em.createQuery(query);
                break;
        }
        if (refresh) {
            q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
            q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
        }
        q = q.setMaxResults(max);
        return q.getResultList();
    }
}
