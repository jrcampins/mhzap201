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

import com.egt.base.persistence.entity.ClaseRecursoParBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface ClaseRecursoParFacadeBase {

    ClaseRecursoParBase find(Object id);

    ClaseRecursoParBase find(Object id, boolean refresh);

    List<? extends ClaseRecursoParBase> findAll();

    List<? extends ClaseRecursoParBase> findAll(boolean refresh);

    List<? extends ClaseRecursoParBase> findByQuery(String query);

    List<? extends ClaseRecursoParBase> findByQuery(String query, boolean refresh);

    List<? extends ClaseRecursoParBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends ClaseRecursoParBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends ClaseRecursoParBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends ClaseRecursoParBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(ClaseRecursoParBase claseRecursoPar);
//
//  void persist(ClaseRecursoParBase claseRecursoPar);
//
//  void refresh(ClaseRecursoParBase claseRecursoPar);
//
//  void remove(ClaseRecursoParBase claseRecursoPar);
}
