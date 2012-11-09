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

import com.egt.base.persistence.entity.OperadorComBase;
import com.egt.base.persistence.enums.EnumTipoQuery;
import java.util.List;

public interface OperadorComFacadeBase {

    OperadorComBase find(Object id);

    OperadorComBase find(Object id, boolean refresh);

    OperadorComBase findByCodigo(String codigo);

    OperadorComBase findByCodigo(String codigo, boolean refresh);

    List<? extends OperadorComBase> findAll();

    List<? extends OperadorComBase> findAll(boolean refresh);

    List<? extends OperadorComBase> findByQuery(String query);

    List<? extends OperadorComBase> findByQuery(String query, boolean refresh);

    List<? extends OperadorComBase> findByQuery(String query, EnumTipoQuery tipo);

    List<? extends OperadorComBase> findByQuery(String query, EnumTipoQuery tipo, boolean refresh);

    List<? extends OperadorComBase> findByQuery(String query, EnumTipoQuery tipo, int max);

    List<? extends OperadorComBase> findByQuery(String query, EnumTipoQuery tipo, int max, boolean refresh);
//
//  void flush();
//
//  void merge(OperadorComBase operadorCom);
//
//  void persist(OperadorComBase operadorCom);
//
//  void refresh(OperadorComBase operadorCom);
//
//  void remove(OperadorComBase operadorCom);
}
