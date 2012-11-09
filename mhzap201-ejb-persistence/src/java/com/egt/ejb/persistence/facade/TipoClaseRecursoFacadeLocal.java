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
import com.egt.base.persistence.facade.TipoClaseRecursoFacadeBase;
import com.egt.ejb.persistence.entity.TipoClaseRecurso;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoClaseRecursoFacadeLocal extends TipoClaseRecursoFacadeBase {

    @Override
    TipoClaseRecurso find(Object id);

    @Override
    TipoClaseRecurso find(Object id, boolean refresh);

    @Override
    TipoClaseRecurso findByCodigo(String codigo);

    @Override
    TipoClaseRecurso findByCodigo(String codigo, boolean refresh);

    @Override
    List<TipoClaseRecurso> findAll();

    @Override
    List<TipoClaseRecurso> findAll(boolean refresh);

    @Override
    List<TipoClaseRecurso> findByQuery(String query);

    @Override
    List<TipoClaseRecurso> findByQuery(String query, boolean refresh);

    @Override
    List<TipoClaseRecurso> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<TipoClaseRecurso> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<TipoClaseRecurso> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<TipoClaseRecurso> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(TipoClaseRecurso tipoClaseRecurso);

    void persist(TipoClaseRecurso tipoClaseRecurso);

    void refresh(TipoClaseRecurso tipoClaseRecurso);

    void remove(TipoClaseRecurso tipoClaseRecurso);
}
