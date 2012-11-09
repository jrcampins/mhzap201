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
import com.egt.base.persistence.facade.ClaseRecursoFacadeBase;
import com.egt.ejb.persistence.entity.ClaseRecurso;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ClaseRecursoFacadeLocal extends ClaseRecursoFacadeBase {

    @Override
    ClaseRecurso find(Object id);

    @Override
    ClaseRecurso find(Object id, boolean refresh);

    @Override
    ClaseRecurso findByCodigo(String codigo);

    @Override
    ClaseRecurso findByCodigo(String codigo, boolean refresh);

    @Override
    List<ClaseRecurso> findAll();

    @Override
    List<ClaseRecurso> findAll(boolean refresh);

    @Override
    List<ClaseRecurso> findByQuery(String query);

    @Override
    List<ClaseRecurso> findByQuery(String query, boolean refresh);

    @Override
    List<ClaseRecurso> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<ClaseRecurso> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<ClaseRecurso> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<ClaseRecurso> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(ClaseRecurso claseRecurso);

    void persist(ClaseRecurso claseRecurso);

    void refresh(ClaseRecurso claseRecurso);

    void remove(ClaseRecurso claseRecurso);
}
