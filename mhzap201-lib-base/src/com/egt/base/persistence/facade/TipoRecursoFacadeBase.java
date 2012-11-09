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
package com.egt.base.persistence.facade;

import com.egt.base.persistence.entity.TipoRecursoBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface TipoRecursoFacadeBase {

    TipoRecursoBase find(Object id);

    TipoRecursoBase find(Object id, boolean refresh);

    TipoRecursoBase findByCodigo(String codigo);

    TipoRecursoBase findByCodigo(String codigo, boolean refresh);

    List<? extends TipoRecursoBase> findAll();

    List<? extends TipoRecursoBase> findAll(boolean refresh);

    List<? extends TipoRecursoBase> findByQuery(String query);

    List<? extends TipoRecursoBase> findByQuery(String query, boolean refresh);

    List<? extends TipoRecursoBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends TipoRecursoBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends TipoRecursoBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends TipoRecursoBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(TipoRecursoBase tipoRecurso);
//
//  void persist(TipoRecursoBase tipoRecurso);
//
//  void refresh(TipoRecursoBase tipoRecurso);
//
//  void remove(TipoRecursoBase tipoRecurso);
}
