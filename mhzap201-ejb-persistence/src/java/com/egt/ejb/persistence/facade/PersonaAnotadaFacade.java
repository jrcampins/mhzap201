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
import com.egt.ejb.persistence.entity.PersonaAnotada;
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
public class PersonaAnotadaFacade implements PersonaAnotadaFacadeLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public PersonaAnotada find(Object id) {
        return this.find(id, false);
    }

    @Override
    public PersonaAnotada find(Object id, boolean refresh) {
        String query = "select o from PersonaAnotada as o where o.idPersonaAnotada = :id";
        PersonaAnotada o = null;
        Query q;
        if (id != null) {
            try {
                q = em.createQuery(query);
                q = q.setParameter("id", id);
                if (refresh) {
                    q = q.setHint(QueryHints.REFRESH, HintValues.TRUE);
                    q = q.setHint(QueryHints.REFRESH_CASCADE, CascadePolicy.CascadeAllParts);
                }
                o = (PersonaAnotada) q.getSingleResult();
            } catch (NoResultException nrex) {
                o = null;
            }
        }
        return o;
    }

    @Override
    public List<PersonaAnotada> findAll() {
        return this.findAll(false);
    }

    @Override
    public List<PersonaAnotada> findAll(boolean refresh) {
        String query = "select object(o) from PersonaAnotada as o";
        return this.findByQuery(query, refresh);
    }

    @Override
    public List<PersonaAnotada> findByQuery(String query) {
        return findByQuery(query, false);
    }

    @Override
    public List<PersonaAnotada> findByQuery(String query, boolean refresh) {
        return findByQuery(query, EnumTipoQuery.JPQL, refresh);
    }

    @Override
    public List<PersonaAnotada> findByQuery(String query, EnumTipoQuery tipo) {
        return findByQuery(query, tipo, false);
    }

    @Override
    public List<PersonaAnotada> findByQuery(String query, EnumTipoQuery tipo, boolean refresh) {
        return findByQuery(query, tipo, 0, refresh);
    }

    @Override
    public List<PersonaAnotada> findByQuery(String query, EnumTipoQuery tipo, int max) {
        return findByQuery(query, tipo, max, false);
    }

    @Override
    public List<PersonaAnotada> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh) {
        Query q;
        switch (tipo) {
            case NAMED:
                q = em.createNamedQuery(query);
                break;
            case NATIVE:
                q = em.createNativeQuery(query, PersonaAnotada.class);
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
    public void merge(PersonaAnotada personaAnotada) {
        em.merge(personaAnotada);
    }

    @Override
    public void persist(PersonaAnotada personaAnotada) {
        em.persist(personaAnotada);
    }

    @Override
    public void refresh(PersonaAnotada personaAnotada) {
        em.refresh(personaAnotada);
    }

    @Override
    public void remove(PersonaAnotada personaAnotada) {
        em.remove(em.merge(personaAnotada));
    }
}
