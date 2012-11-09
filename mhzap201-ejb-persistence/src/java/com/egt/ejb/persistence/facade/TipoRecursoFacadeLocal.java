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
import com.egt.base.persistence.facade.TipoRecursoFacadeBase;
import com.egt.ejb.persistence.entity.TipoRecurso;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TipoRecursoFacadeLocal extends TipoRecursoFacadeBase {

    @Override
    TipoRecurso find(Object id);

    @Override
    TipoRecurso find(Object id, boolean refresh);

    @Override
    TipoRecurso findByCodigo(String codigo);

    @Override
    TipoRecurso findByCodigo(String codigo, boolean refresh);

    @Override
    List<TipoRecurso> findAll();

    @Override
    List<TipoRecurso> findAll(boolean refresh);

    @Override
    List<TipoRecurso> findByQuery(String query);

    @Override
    List<TipoRecurso> findByQuery(String query, boolean refresh);

    @Override
    List<TipoRecurso> findByQuery(String query, EnumTipoQuery tipo);

    @Override
    List<TipoRecurso> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    @Override
    List<TipoRecurso> findByQuery(String query, EnumTipoQuery tipo, int max);

    @Override
    List<TipoRecurso> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);

    void flush();

    void merge(TipoRecurso tipoRecurso);

    void persist(TipoRecurso tipoRecurso);

    void refresh(TipoRecurso tipoRecurso);

    void remove(TipoRecurso tipoRecurso);
}
