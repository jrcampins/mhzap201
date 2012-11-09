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

import com.egt.base.persistence.entity.CondicionEjeFunBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface CondicionEjeFunFacadeBase {

    CondicionEjeFunBase find(Object id);

    CondicionEjeFunBase find(Object id, boolean refresh);

    CondicionEjeFunBase findByCodigo(String codigo);

    CondicionEjeFunBase findByCodigo(String codigo, boolean refresh);

    List<? extends CondicionEjeFunBase> findAll();

    List<? extends CondicionEjeFunBase> findAll(boolean refresh);

    List<? extends CondicionEjeFunBase> findByQuery(String query);

    List<? extends CondicionEjeFunBase> findByQuery(String query, boolean refresh);

    List<? extends CondicionEjeFunBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends CondicionEjeFunBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends CondicionEjeFunBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends CondicionEjeFunBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(CondicionEjeFunBase condicionEjeFun);
//
//  void persist(CondicionEjeFunBase condicionEjeFun);
//
//  void refresh(CondicionEjeFunBase condicionEjeFun);
//
//  void remove(CondicionEjeFunBase condicionEjeFun);
}
