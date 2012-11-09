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

import com.egt.ejb.persistence.entity.catalog.SystemRoutine;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class SystemRoutineFacade implements SystemRoutineFacadeLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public SystemRoutine find(Object id) {
        return em.find(SystemRoutine.class, id);
    }

    @Override
    public List<SystemRoutine> findAll() {
        return em.createQuery("select object(o) from SystemRoutine as o").getResultList();
    }
}
