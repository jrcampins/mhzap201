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
import com.egt.base.persistence.facade.ClaseRecursoSecFacadeBase;
import com.egt.ejb.persistence.entity.ClaseRecursoSec;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ClaseRecursoSecFacadeLocal extends ClaseRecursoSecFacadeBase {

    @Override
    ClaseRecursoSec find(Object id);

    @Override
    ClaseRecursoSec find(Object id, boolean refresh);

    @Override
    List<ClaseRecursoSec> findAll();

    @Override
    List<ClaseRecursoSec> findAll(boolean refresh);

    @Override
    List<ClaseRecursoSec> findByQuery(String query);

    @Override
    List<ClaseRecursoSec> findByQuery(String query, boolean refresh);

    @Override
    List<ClaseRecursoSec> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<ClaseRecursoSec> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<ClaseRecursoSec> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<ClaseRecursoSec> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(ClaseRecursoSec claseRecursoSec);

    void persist(ClaseRecursoSec claseRecursoSec);

    void refresh(ClaseRecursoSec claseRecursoSec);

    void remove(ClaseRecursoSec claseRecursoSec);
}
