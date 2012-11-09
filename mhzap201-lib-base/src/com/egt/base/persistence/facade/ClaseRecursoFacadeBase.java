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

import com.egt.base.persistence.entity.ClaseRecursoBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface ClaseRecursoFacadeBase {

    ClaseRecursoBase find(Object id);

    ClaseRecursoBase find(Object id, boolean refresh);

    ClaseRecursoBase findByCodigo(String codigo);

    ClaseRecursoBase findByCodigo(String codigo, boolean refresh);

    List<? extends ClaseRecursoBase> findAll();

    List<? extends ClaseRecursoBase> findAll(boolean refresh);

    List<? extends ClaseRecursoBase> findByQuery(String query);

    List<? extends ClaseRecursoBase> findByQuery(String query, boolean refresh);

    List<? extends ClaseRecursoBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends ClaseRecursoBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends ClaseRecursoBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends ClaseRecursoBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(ClaseRecursoBase claseRecurso);
//
//  void persist(ClaseRecursoBase claseRecurso);
//
//  void refresh(ClaseRecursoBase claseRecurso);
//
//  void remove(ClaseRecursoBase claseRecurso);
}
